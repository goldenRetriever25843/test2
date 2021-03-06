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
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;

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
	private Object mounted;

	public float doomsday = 0;
	
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
       // this.thrust = 0.01f * (type.maxThrottle + (data.engine == null ? 0.0f : data.engine.engineSpeed) + 5*type.planeDiveFactor*(plane.energy/plane.maxEnergy));
        this.thrust = 0.01f * (type.maxThrottle + (data.engine == null ? 0.0f : data.engine.engineSpeed));
        //hyperspeed this.thrust = 10f * (type.maxThrottle + (data.engine == null ? 0.0f : data.engine.engineSpeed) + 5*type.planeDiveFactor*(plane.energy/plane.maxEnergy));
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
        //threw in abs to prevent control switch
        float f = sensitivityAdjust = Math.abs((float)plane.getSpeedXYZ() / 2.0f > 0.5f ? 1.5f - (float)plane.getSpeedXYZ() / 2.0f : 4.0f * (float)plane.getSpeedXYZ() / 2.0f - 1.0f);
       
        //afterburn off manuevrability bonus
        if (type.hasAfterBurner && !plane.afterBurning && throttle<0.65f)
            sensitivityAdjust = type.afterburnOffBonus*Math.abs((float)plane.getSpeedXYZ() / 2.0f > 0.5f ? 1.5f - (float)plane.getSpeedXYZ() / 2.0f : 4.0f * (float)plane.getSpeedXYZ() / 2.0f - 1.0f);
  
        if (this.mode == EnumPlaneMode.HELI) {
            float f2 = sensitivityAdjust = this.throttle > 0.5f ? 1.5f - this.throttle : 4.0f * this.throttle - 1.0f;
        }
        if ((double)((float)plane.getSpeedXYZ()) < 0.5 && sensitivityAdjust < -0.1f) {
            sensitivityAdjust = 0.1f;
        }
        
        //labjac maneuvrability bonuses based on energy
        float yawBonus = 1f;	
        float pitchBonus = 1f;
        float rollBonus = 1f;
        if(plane.energy>15 && plane.energy <= 55)
        {
        	yawBonus = 0.5f*(float)type.yawBonus;
        	pitchBonus = 0.5f*(float)type.pitchBonus;
        	rollBonus = 0.5f*(float)type.rollBonus;
        	//System.out.println("rollbonus is " + rollBonus);
        }
        else if(plane.energy>55)
        {
        	yawBonus = (float)type.yawBonus;
        	pitchBonus = (float)type.pitchBonus;
        	rollBonus = (float)type.rollBonus;
        }
        else if(plane.energy<-15 && plane.energy>=55)
        {
        	yawBonus = 1.1f*(float)type.yawStall;
        	pitchBonus = 1.1f*(float)type.pitchStall;
        	rollBonus = 1.1f*(float)type.rollStall;
        }
        else if(plane.energy<-55)
        {
        	yawBonus = 0.7f*(float)type.yawStall;
        	pitchBonus = 0.7f*(float)type.pitchStall;
        	rollBonus = 0.7f*(float)type.rollStall;
        }
        else
        {
        	yawBonus = 1f;
        	pitchBonus = 1f;
        	rollBonus = 1f;
        }
        
        float yaw = this.yawControl * (this.yawControl > 0.0f ? ((float)type.turnLeftModifier*((float)yawBonus)) : (type.turnRightModifier*((float)yawBonus))) * (sensitivityAdjust *= 0.125f);
        float roll = this.rollControl * (this.rollControl > 0.0f ? ((float)type.rollLeftModifier*((float)rollBonus)) : (type.rollRightModifier*((float)rollBonus))) * sensitivityAdjust;
        float pitch = this.pitchControl * (this.pitchControl > 0.0f ? ((float)type.lookUpModifier*((float)pitchBonus)) : (type.lookDownModifier*((float)pitchBonus))) * sensitivityAdjust;
        
        //system to help planes push nose down if low energy stalling
        if(plane.energy < -25f && (float)plane.axes.getPitch() < -type.noStallAngle)
        {
        	plane.axes.rotateLocalPitch(plane.energy/60f);
        }
        
        if((float)plane.axes.getPitch() < 0 && (plane.posY > (type.ceiling-10f)))
        {
        	plane.axes.rotateLocalPitch(-1f);
        }
        

             
             //  if (plane.axes.getPitch() <= 60.0f && plane.getSpeedXYZ() < 0.2 && this.mode == EnumPlaneMode.PLANE && this.throttle >= 0.1f) {
      //      pitch = -1.0f;
   //     }
        
        if (this.mode == EnumPlaneMode.PLANE) {
        		if (!plane.isPartIntact(EnumDriveablePart.tail)) {
                yaw = 0.0f;
                pitch = 0.0f;
        		}
                if (!plane.isPartIntact(EnumDriveablePart.nose)) {
                    pitch = (float)((double)pitch - 20.0 * plane.getSpeedXZ());

                    plane.motionY += -gravity;
                    lift=0;
        			//if lost airworthiness and plane drowned, then die
        			if (plane.isInWater())
        				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
        			
                    }
                if (!plane.isPartIntact(EnumDriveablePart.tail)) {
                    pitch = (float)((double)pitch + 20.0 * plane.getSpeedXZ());
                    plane.motionY += -gravity;
                    lift=0;
        			//if lost airworthiness and plane drowned, then die
        			if (plane.isInWater())
        				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
                    }
            if (!plane.isPartIntact(EnumDriveablePart.leftWing)) {
                roll = (float)((double)roll - 20.0 * plane.getSpeedXZ());
                plane.motionY += -gravity;
                lift=0;
    			//if lost airworthiness and plane drowned, then die
    			if (plane.isInWater())
    				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            }
            if (!plane.isPartIntact(EnumDriveablePart.rightWing)) {
                roll = (float)((double)roll + 20.0 * plane.getSpeedXZ());
                plane.motionY += -gravity;
                lift=0;
    			//if lost airworthiness and plane drowned, then die
    			if (plane.isInWater())
    				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            }
        } else if (this.mode == EnumPlaneMode.HELI && !plane.isPartIntact(EnumDriveablePart.tail)) {
            yaw = 25.0f * this.throttle;
            roll = 5.0f * this.throttle;         
            plane.motionY += -gravity;
          //if lost airworthiness and plane drowned, then die
			if (plane.isInWater())
				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
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
   //     float fuelConsumptionMultiplier = 2.0f;
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
        //proto speed limit allah bookmark
        Vector3f forwards = (Vector3f)plane.axes.getXAxis().normalise();
        float lastTickSpeed = (float)plane.getSpeedXYZ();
        
        //for sea level v high altitude speed limit  let 70 be sea level world also muh afterburner  this.ticksFlareUsing <= 0
        float currentSpeedLimit = 1f;
        
        //ok i retconned high vs low altitude top speed since too wonky
        /*
        if (plane.posY<70 && plane.afterBurning)
        	currentSpeedLimit = type.speedLimit;
        else   if (plane.posY >= 70 && plane.afterBurning)
        	currentSpeedLimit = (float)type.speedLimit*(1f + ((float)type.speedLimitHigh-(float)type.speedLimit)*(((float)plane.posY-70f)/((float)type.ceiling-70f)));
        //no afterburner
        else if (plane.posY<70 && !plane.afterBurning)
      	currentSpeedLimit = type.speedLimitDry;
      else if (plane.posY >= 70 && !plane.afterBurning)
        	currentSpeedLimit = (float)type.speedLimitDry*(1f + ((float)type.speedLimitHighDry-(float)type.speedLimitDry)*(((float)plane.posY-70f)/((float)type.ceiling-70f)));
        	*/
        
        //high v low altitude stuff removed
        if (plane.afterBurning )
        	currentSpeedLimit = type.speedLimitHigh;
       
        //no afterburner
        else if (!plane.afterBurning)
      	currentSpeedLimit = ((float)type.speedLimitHighDry + (float)(((float)throttle-0.5f)/0.5f)*((float)type.speedLimitHigh - (float)type.speedLimitHighDry));

        
        //for energy ratio convenience
        float energyRatio = (float)(plane.energy/100f);
        
        //1.3 buff thrown in afterwards
        if (lastTickSpeed > currentSpeedLimit*1.3f && (float)plane.energy<5 && (float)plane.energy>-5) 
           lastTickSpeed = currentSpeedLimit*1.3F;
        
        //positive diving energy
        else if ((float)plane.energy>=5 && lastTickSpeed > (currentSpeedLimit + energyRatio * (type.deathDiveSpeedLimit - currentSpeedLimit)) ) 
                lastTickSpeed =  1.3f*(currentSpeedLimit + energyRatio * (type.deathDiveSpeedLimit - currentSpeedLimit));
        //for no energy
                else if ((float)plane.energy<=-5 && lastTickSpeed > (currentSpeedLimit + energyRatio * (type.stallSpeedLimit - currentSpeedLimit)) ) 
                    lastTickSpeed =  1.3f*(currentSpeedLimit - energyRatio * (type.stallSpeedLimit - currentSpeedLimit));
        
        
        //attempt to stop backwards planes
        if (lastTickSpeed < 0)
        	lastTickSpeed = 0;
       
        /*
        System.out.println("---- border ----");
        System.out.println("speed limit " + currentSpeedLimit);
        System.out.println("last tick speed " + lastTickSpeed);
        System.out.println("energy " + plane.energy);
        */
        
        /*
        //positive diving energy dry
        else if (lastTickSpeed > (float)(type.speedLimitDry + ((float)plane.energy/100f)*(type.deathDiveSpeedLimit-type.speedLimitDry)) && plane.energy>=5 && !plane.afterBurning) 
                lastTickSpeed = (float)(type.speedLimitDry + ((float)plane.energy/100f)*(type.deathDiveSpeedLimit-type.speedLimitDry));
        //for no energy dry
                else if (lastTickSpeed > (float)(type.speedLimitDry + ((float)plane.energy/100f)*(type.speedLimitDry-type.stallSpeedLimit)) && plane.energy<=-5 && !plane.afterBurning) 
                    lastTickSpeed = (float)(type.speedLimitDry + ((float)plane.energy/100f)*(type.speedLimitDry-type.stallSpeedLimit));
            */    
        
        //for overload effects
        
        
        if (plane.rightMouseHeld && type.gunRecoil || plane.leftMouseHeld  && type.gunRecoil) 
        {
            plane.axes.rotateLocalPitch(((float)Math.random() - 0.5f) / 3.0f);
            plane.axes.rotateLocalYaw(((float)Math.random() - 0.5f) / 3.0f);
            plane.axes.rotateLocalRoll(((float)Math.random() - 0.5f) / 3.0f);
        }
        
        
        //gentle auto roll normalize      
            if(plane.axes.getRoll() > 0.1f)
            	 plane.axes.rotateLocalRoll(-0.3f);
            
            if(plane.axes.getRoll() < -0.1f)
           	 plane.axes.rotateLocalRoll(0.3f);
            
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
      		
      		
      		
      		
      		
      		//labjac energy fighting code TM
      		
      		//gain energy from dive
      		float trueRoll = Math.abs(plane.axes.getRoll());		
      		if(plane.axes.getPitch() > 0 && plane.energy < (plane.axes.getPitch()/90f)*100f && plane.throttle > 0.1f)
      		{
      			if(trueRoll<=90)
      			plane.energy += 0.9f*type.energyRate*(plane.axes.getPitch()/90f)*(1-trueRoll/90);
      			else if(trueRoll>90 && trueRoll<180)
      				plane.energy += 0.9f*type.energyRate*(plane.axes.getPitch()/90f)*((trueRoll-90)/90);
 //     			plane.motionY *= 1f+0.25*type.planeDiveFactor*(plane.axes.getPitch()/90f);
      			}
      		
      		
      		//lose energy from pitch
      		if(plane.axes.getPitch() < 0 && plane.energy > (plane.axes.getPitch()/90f)*100f && plane.throttle > 0.1f)
      		{
      			if(trueRoll<=90)
      			plane.energy += 0.9f*type.energyRate*(plane.axes.getPitch()/90f)*(1-trueRoll/100);
      			else if(trueRoll>90 && trueRoll<180)
     			plane.energy += 0.9f*type.energyRate*(plane.axes.getPitch()/90f)*((trueRoll-90)/100);
      			//divided by 100 instead of 90 so if you try 90 degree roll diving you cant generate free energy
 //     			plane.motionY *= 1f+0.25*type.planeDiveFactor*(plane.axes.getPitch()/90f);
      			}
      		
      		//lose energy from drag
      		if(plane.throttle > 0.1 && plane.energy > 0)
      		{
      			plane.energy -= (0.15f*type.energyLossRate);
      		}
      		//energy recover just from engine
      		if(plane.throttle > 0.1 && plane.energy < 0)
      		{
      			plane.energy += 0.1f*type.energyRate;
      		}
      		
      		
      		//losing lift   but max speed can go up sinceless drag and lower speed of sound
    		if (plane.posY > 0.55*type.ceiling && plane.motionY>0)
    		{
    			plane.motionY *= type.ceiling/(type.ceiling+plane.posY-0.54*type.ceiling);
    			plane.energy -= 0.1f*type.energyRate;
    		}
    		if (plane.posY > type.ceiling)
    		{
    			plane.motionY = -0.1;
    		}

    		
    		
    		
    		
    		
    		
    		//labjac carrier pitch fix TM

	//if (plane.isRiding());
//	plane.rotationPitch = 0f;
    		
     //labjac big gay code
      		//altitude flight ceiling

    		 
       		
      		if (!plane.isPartIntact(EnumDriveablePart.airframe)) {
                plane.motionY += -gravity;
                lift=0;
                
                if(plane.axes.getRoll() > 0.1f)
               	 plane.axes.rotateLocalRoll(-5f);
               
               if(plane.axes.getRoll() < -0.1f)
              	 plane.axes.rotateLocalRoll(5f);
               
              // System.out.println("doomsday: " + doomsday);
               doomsday ++;
                
                if(plane.axes.getPitch() < 25f)
                	plane.axes.rotateLocalPitch(-0.05f*doomsday);
                	
               
                	
          //if lost airworthiness and plane drowned, then die
			if (plane.isInWater())
				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            
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
       // data.fuelInTank -= this.thrust * fuelConsumptionMultiplier * data.engine.fuelConsumption;
        //allah randomizer effect
        /*
        if (plane.getSpeedXYZ() > 2.0) {
            plane.axes.rotateLocalPitch(((float)Math.random() - 0.5f) / 3.0f);
            plane.axes.rotateLocalYaw(((float)Math.random() - 0.5f) / 3.0f);
            plane.axes.rotateLocalRoll(((float)Math.random() - 0.5f) / 3.0f);
        }
        */
        if (!plane.isPartIntact(EnumDriveablePart.tail)) {
            plane.motionY += -gravity;
            lift=0;
            
            //spin like crazy
            if(doomsday < 750)
            doomsday ++;
            
            //die once you spin too fast
            if(doomsday >= 750)
            	plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            
            plane.motionY = -0.01 * doomsday;
            
            plane.axes.rotateLocalPitch(0.05f*doomsday);
            
          //if lost airworthiness and plane drowned, then die
			if (plane.isInWater())
				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
        }
        
        if (!plane.isPartIntact(EnumDriveablePart.leftWing)) {
            plane.motionY += -gravity;
            lift=0;
            
            //spin like crazy
            if(doomsday < 750)
            doomsday ++;
            
            //die once you spin too fast
            if(doomsday >= 750)
            	plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            
            
            plane.axes.rotateLocalRoll(0.05f*doomsday);
            
            plane.motionY = -0.01 * doomsday;
            
          //if lost airworthiness and plane drowned, then die
			if (plane.isInWater())
				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
        }
 		
 		if (!plane.isPartIntact(EnumDriveablePart.rightWing)) {
            plane.motionY += -gravity;
            lift=0;
            
            //spin like crazy, also -1.5 so rightwing will win if both wings die
            if(doomsday > -750)
            doomsday = doomsday -1.5f;
            
            //die once you spin too fast
            if(doomsday >= 750)
            	plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            
            plane.motionY = -0.01 * doomsday;
            
            plane.axes.rotateLocalRoll(0.05f*doomsday);
            
          //if lost airworthiness and plane drowned, then die
			if (plane.isInWater())
				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
        }
    }
    
    
    ///end of labjac big gay airframe code

    public void HeliModeFly(EntityPlane plane) {
        PlaneType type = plane.getPlaneType();
        DriveableData data = plane.getDriveableData();
        int numPropsWorking = 0;
        int numProps = 0;
 //       float fuelConsumptionMultiplier = 2.0f;
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
        if(plane.motionX<1)
		plane.motionX += upwardsForce * up.x * 0.5F;
        if(plane.motionY<1)
		plane.motionY += (upwardsForce * up.y) - gravity;
        if(plane.motionZ<1)
		plane.motionZ += upwardsForce * up.z * 0.5F;
		
        if(plane.motionY>=1)
        	upwardsForce = 0.04f;
        if(plane.motionX>=1)
        	upwardsForce = 0.04f;
        if(plane.motionZ>=1)
        	upwardsForce = 0.04f;
        
		//heli ceiling
		if (plane.posY > type.ceiling)
		{
			plane.motionY = -0.1;
		}
			

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

