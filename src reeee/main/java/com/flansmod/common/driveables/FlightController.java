/*
 * Decompiled with CFR 0_123.
 */
package com.flansmod.common.driveables;

import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.Propeller;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.vector.Vector;
import com.flansmod.common.vector.Vector3f;
import java.util.ArrayList;

public class FlightController {
    public float throttle;
    public float yawControl;
    public float pitchControl;
    public float rollControl;
    public EnumPlaneMode mode;
    public float gravity = 1.0f;
    public float drag = 0.0f;
    public float thrust = 0.0f;
    public float lift = 0.0f;
    public Vector3f angularMomentum = new Vector3f(0.0f, 0.0f, 0.0f);

    public void UpdateParams(EntityPlane plane) {
        this.throttle = plane.throttle;
        this.yawControl = plane.flapsYaw;
        this.pitchControl = (plane.flapsPitchLeft + plane.flapsPitchRight) / 2.0f;
        this.rollControl = (plane.flapsPitchRight - plane.flapsPitchLeft) / 2.0f;
        this.mode = plane.mode;
    }

    public void fly(EntityPlane plane) {
        PlaneType type = plane.getPlaneType();
        DriveableData data = plane.getDriveableData();
        this.UpdateParams(plane);
        this.SetAxes(plane);
        this.thrust = 0.01f * (type.maxThrottle + (data.engine == null ? 0.0f : data.engine.engineSpeed));
        this.gravity = 0.098000005f;
        this.drag = 1.0f - 0.05f * type.drag;
        switch (this.mode) {
            case PLANE: {
                this.PlaneModeFly(plane);
            }
            case HELI: {
                this.HeliModeFly(plane);
            }
        }
    }

    public void SetAxes(EntityPlane plane) {
        float sensitivityAdjust;
        PlaneType type = plane.getPlaneType();
        float f = sensitivityAdjust = (float)plane.getSpeedXYZ() / 2.0f > 0.5f ? 1.5f - (float)plane.getSpeedXYZ() / 2.0f : 4.0f * (float)plane.getSpeedXYZ() / 2.0f - 1.0f;
        if (this.mode == EnumPlaneMode.HELI) {
            float f2 = sensitivityAdjust = this.throttle > 0.5f ? 1.5f - this.throttle : 4.0f * this.throttle - 1.0f;
        }
        if ((double)((float)plane.getSpeedXYZ()) < 0.5 && sensitivityAdjust < 0.0f) {
            sensitivityAdjust = 0.0f;
        }
        float yaw = this.yawControl * (this.yawControl > 0.0f ? type.turnLeftModifier : type.turnRightModifier) * (sensitivityAdjust *= 0.125f);
        float pitch = this.pitchControl * (this.pitchControl > 0.0f ? type.lookUpModifier : type.lookDownModifier) * sensitivityAdjust;
        float roll = this.rollControl * (this.rollControl > 0.0f ? type.rollLeftModifier : type.rollRightModifier) * sensitivityAdjust;
        if (plane.axes.getPitch() <= 60.0f && plane.getSpeedXYZ() < 0.2 && this.mode == EnumPlaneMode.PLANE && this.throttle >= 0.1f) {
            pitch = -1.0f;
        }
        if (this.mode == EnumPlaneMode.PLANE) {
        		if (!plane.isPartIntact(EnumDriveablePart.tail)) {
                yaw = 0.0f;
                pitch = 0.0f;
        		}
                if (!plane.isPartIntact(EnumDriveablePart.nose)) {
                    pitch = (float)((double)pitch - 20.0 * plane.getSpeedXZ());
                    }
                if (!plane.isPartIntact(EnumDriveablePart.tail)) {
                    pitch = (float)((double)pitch + 20.0 * plane.getSpeedXZ());
                    }
            if (!plane.isPartIntact(EnumDriveablePart.leftWing)) {
                roll = (float)((double)roll - 20.0 * plane.getSpeedXZ());
            }
            if (!plane.isPartIntact(EnumDriveablePart.rightWing)) {
                roll = (float)((double)roll + 20.0 * plane.getSpeedXZ());
            }
        } else if (this.mode == EnumPlaneMode.HELI && !plane.isPartIntact(EnumDriveablePart.tail)) {
            yaw = 25.0f * this.throttle;
            roll = 5.0f * this.throttle;          
        }
        this.angularMomentum.x = this.moveToTarget(this.angularMomentum.x, yaw, 1.0f);
        this.angularMomentum.y = this.moveToTarget(this.angularMomentum.y, pitch, 1.0f);
        this.angularMomentum.z = this.moveToTarget(this.angularMomentum.z, roll, 1.0f);
        this.LimitAngularMomentum(this.angularMomentum, 20.0f);
        plane.axes.rotateLocalYaw(this.angularMomentum.x);
        plane.axes.rotateLocalPitch(this.angularMomentum.y);
        plane.axes.rotateLocalRoll(- this.angularMomentum.z);
        this.angularMomentum.scale(0.99f);
    }

    public float moveToTarget(float current, float target, float speed) {
        float pitchToMove;
        for (pitchToMove = (float)(Math.sqrt((double)((double)(target * target))) - Math.sqrt((double)((double)(current * current)))); pitchToMove > 180.0f; pitchToMove -= 360.0f) {
        }
        while (pitchToMove <= -180.0f) {
            pitchToMove += 360.0f;
        }
        float signDeltaY = 0.0f;
        if (pitchToMove > speed) {
            signDeltaY = 1.0f;
        } else if (pitchToMove < - speed) {
            signDeltaY = -1.0f;
        } else {
            signDeltaY = 0.0f;
            return target;
        }
        if (current > target) {
            current -= speed;
        } else if (current < target) {
            current += speed;
        }
        return current;
    }

    public void LimitAngularMomentum(Vector3f vec, float angle) {
        if (vec.x > angle) {
            vec.x = angle;
        }
        if (vec.x < - angle) {
            vec.x = - angle;
        }
        if (vec.y > angle) {
            vec.y = angle;
        }
        if (vec.y < - angle) {
            vec.y = - angle;
        }
        if (vec.z > angle) {
            vec.z = angle;
        }
        if (vec.z < - angle) {
            vec.z = - angle;
        }
    }

    public void PlaneModeFly(EntityPlane plane) {
        if (plane.mode == EnumPlaneMode.HELI) {
            return;
        }
        PlaneType type = plane.getPlaneType();
        DriveableData data = plane.getDriveableData();
        int numPropsWorking = 0;
        int numProps = 0;
        float fuelConsumptionMultiplier = 2.0f;
        float flap = this.angularMomentum.length();
        this.drag -= flap / 100.0f;
        this.throttle -= (- flap) / 500.0f;
        for (Propeller prop : type.propellers) {
            if (!plane.isPartIntact(prop.planePart)) continue;
            ++numPropsWorking;
        }
        numProps = type.propellers.size();
        if (numProps == 0) {
            return;
        }
        Vector3f forwards = (Vector3f)plane.axes.getXAxis().normalise();
        float lastTickSpeed = (float)plane.getSpeedXYZ();
        if (lastTickSpeed > 2.0f) {
            lastTickSpeed = 2.0f;
        }
        float newSpeed = lastTickSpeed + this.thrust * 2.0f;
        float proportionOfMotionToCorrect = 2.0f * this.throttle;
        if (proportionOfMotionToCorrect < 0.0f) {
            proportionOfMotionToCorrect = 0.0f;
        }
        if (proportionOfMotionToCorrect > 1.5f) {
            proportionOfMotionToCorrect = 1.5f;
        }
        int numWingsIntact = 0;
        if (plane.isPartIntact(EnumDriveablePart.airframe)) {
            ++numWingsIntact;
        }
        this.lift = (float)plane.getSpeedXYZ() * (float)plane.getSpeedXYZ() * (float)numWingsIntact / 1.0f;
        Vector3f up2 = (Vector3f)plane.axes.getYAxis().normalise();
        this.lift = (float)((double)this.lift * Math.sqrt(up2.y * up2.y));
        if (this.lift > this.gravity) {
            this.lift = this.gravity;
        }
      //Cut out some motion for correction
      		plane.motionX *= 1F - proportionOfMotionToCorrect;
      		plane.motionY *= 1F - proportionOfMotionToCorrect;
      		plane.motionZ *= 1F - proportionOfMotionToCorrect;
      	

      		//Add the corrected motion
      		plane.motionX += proportionOfMotionToCorrect * newSpeed * forwards.x;
      		plane.motionY += proportionOfMotionToCorrect * newSpeed * forwards.y;
      		plane.motionZ += proportionOfMotionToCorrect * newSpeed * forwards.z;
      		
      		plane.motionY += lift;
      		plane.motionY -= gravity;
      		if(plane.axes.getPitch() <= 60 && plane.getSpeedXYZ() < 0.2){plane.motionY -= gravity;}
     //labjac big gay code
      		
      	
       		
      		if (!plane.isPartIntact(EnumDriveablePart.airframe)) {
            plane.motionY += -1.0;
        }
        plane.motionX *= drag;
		if(plane.posY - plane.prevPosY < 0)
		{
			plane.motionY *= drag < 1? 0.999: 1;
		}
		else
		{
			plane.motionY *= drag;
		}
		plane.motionZ *= drag;
        plane.lastPos = new Vector3f(plane.motionX, plane.motionY, plane.motionZ);
        data.fuelInTank -= this.thrust * fuelConsumptionMultiplier * data.engine.fuelConsumption;
        if (plane.getSpeedXYZ() > 2.0) {
            plane.axes.rotateLocalPitch(((float)Math.random() - 0.5f) / 4.0f);
            plane.axes.rotateLocalYaw(((float)Math.random() - 0.5f) / 4.0f);
            plane.axes.rotateLocalRoll(((float)Math.random() - 0.5f) / 4.0f);
        }
        
        if (!plane.isPartIntact(EnumDriveablePart.tail)) {
            plane.motionY += -0.3;
        }
        
        if (!plane.isPartIntact(EnumDriveablePart.leftWing)) {
            plane.motionY += -0.4;
        }
 		
 		if (!plane.isPartIntact(EnumDriveablePart.rightWing)) {
            plane.motionY += -0.4;
        }
    }
    
    
    ///end of labjac big gay airframe code

    public void HeliModeFly(EntityPlane plane) {
        PlaneType type = plane.getPlaneType();
        DriveableData data = plane.getDriveableData();
        int numPropsWorking = 0;
        int numProps = 0;
        float fuelConsumptionMultiplier = 2.0f;
        for (Propeller prop : type.heliPropellers) {
            if (!plane.isPartIntact(prop.planePart)) continue;
            ++numPropsWorking;
        }
        numProps = type.heliPropellers.size();
        this.gravity = 0.05f;
        if (numProps == 0) {
            return;
        }
        Vector3f up = (Vector3f)plane.axes.getYAxis().normalise();
        this.thrust *= (float)(numPropsWorking / numProps) * 2.0f;
        float upwardsForce = this.throttle * this.thrust + (this.gravity - this.thrust / 2.0f);
        if (this.throttle < 0.5f) {
            upwardsForce = this.gravity * this.throttle * 2.0f;
        }
        if (!plane.isPartIntact(EnumDriveablePart.blades)) {
            upwardsForce = 0.04f;
        }
        if (this.throttle < 0.52f && this.throttle > 0.48f && up.y >= 0.7f) {
            upwardsForce = this.gravity / up.y;
        }
        if (plane.getPlaneType().mode != EnumPlaneMode.VTOL && up.y < 0.0f) {
            up.y *= -1.0f;
            up.x *= -1.0f;
            up.z *= -1.0f;
        }
    	//Throttle - 0.5 means that the positive throttle scales from -0.5 to +0.5. Thus it accounts for gravity-ish
		plane.motionX += upwardsForce * up.x * 0.5F;
		plane.motionY += (upwardsForce * up.y) - gravity;
		plane.motionZ += upwardsForce * up.z * 0.5F;

		//Apply wobble
		//motionX += rand.nextGaussian() * wobbleFactor;
		//motionY += rand.nextGaussian() * wobbleFactor;
		//motionZ += rand.nextGaussian() * wobbleFactor;
		//Apply drag
		plane.motionX *= 1-(1-drag)/5;
		plane.motionY *= drag;
		plane.motionZ *= 1-(1-drag)/5;

		plane.lastPos = new Vector3f(plane.motionX, plane.motionY, plane.motionZ);
    }

}

