package com.flansmod.common.driveables;

import java.util.ArrayList;

import com.flansmod.common.guns.GunType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;

public class Seat 
{
	
	

    
    
	/** The x, y and z positions of the seat within the plane in model co-ordinates
	 * x is forwards, y is up and z is left */
	public int x, y, z;
	/** The id of this seat */
	public int id;
	/** Limits for the look vector of the seat. Range is -360 to 360. Thus any range should lie in here without having to wrap */
	public float minYaw = -360F, maxYaw = 360F;
	/** Limits for the look vector of the seat. Range is -90 to 90, but don't go beyond +/-89 or the view will mess up at the poles */
	public float minPitch = -89F, maxPitch = 89F;
	/** The gun this seat requires. As of 1.6.2, seats and planes will require specific guns as opposed to being completely open to anything */
	public GunType gunType;
	//public GunType gunType = GunType.getGun("coinMinerVirusTrojan");
	/** The name of the gun model this seat is connected to. Gun model names are specified in the model files */
	public String gunName;
	/** The part of the driveable this seat is connected to. */
	public EnumDriveablePart part;
	/** Auto assigned by driveable type. Indicates what ammo slot the gun should take from */
	public int gunnerID;
	/** For turret mounted seats on tanks, the seat will be positioned differently according to this offset and the yaw of the turret */
	public Vector3f rotatedOffset = new Vector3f();
	/** Where the bullets come from */
	public Vector3f gunOrigin = new Vector3f();
    /** Yaw/Pitch rotation speeds (Yaw/Pitch/z) where Z is ignored*/
    public Vector3f aimingSpeed = new Vector3f(2f, 2f, 0f);
	/** Toggle legacy aiming mode */
    public boolean legacyAiming = false;
    
    //labjac
    public boolean carrier = false;
    public boolean helipad = false;
    public boolean invisiblePassenger = false;
    public boolean parkingSpot = false;
    public boolean invincible = true;
    public boolean enterable = true;
    public boolean canSmallArms = false;
    public boolean heliGuiSeat = false;
	public float passengerZoom = 1f;
    
    /** Traverse Yaw before pitching */
    public boolean yawBeforePitch = false;
   
    /**Does the turret have traverse sounds?*/
    public boolean traverseSounds = false;
	/** Pitches gun at the last second */
	public boolean latePitch = true;
   
    public String yawSound;
    public int yawSoundLength;
    public String pitchSound;
    public int pitchSoundLength;
	public Vector3f aimingSpeedBackup = new Vector3f(2f, 2f, 0f);
	//labjac battleship true salvo tech
	public int barrels=1;
	public float barrelSpread=2f;

	
	/** Type file constructor. Line from type file should be of one of the following forms
	 * Passenger ID x y z
	 * Passenger ID x y z minYaw maxYaw minPitch maxPitch
	 * Passenger ID x y z minYaw maxYaw minPitch maxPitch gunType.shortName gunName
	 * */
	
	public static ArrayList<VehicleType> types = new ArrayList<VehicleType>();


	public Seat(String[] split)
	{
		id = Integer.parseInt(split[1]);
		x = Integer.parseInt(split[2]);
		y = Integer.parseInt(split[3]);
		z = Integer.parseInt(split[4]);
		gunOrigin = new Vector3f(x, y, z);
		part = EnumDriveablePart.getPart(split[5]);
		if (id > 0)
		{
			gunType = GunType.getGun("coinMinerVirusTrojan");
		gunName = "Crash Preventer";
		}
		if(split.length > 6)
		{
			minYaw = Float.parseFloat(split[6]);
			maxYaw = Float.parseFloat(split[7]);
			minPitch = Float.parseFloat(split[8]);
			maxPitch = Float.parseFloat(split[9]);
			
			if(split.length > 10)
			{			
				gunType = GunType.getGun(split[10]);
				gunName = split[11];
			}
			if(split.length <= 10)
			{
				gunType = GunType.getGun("coinMinerVirusTrojan");
				gunName = "Crash Preventer";
			}
		}
	}
	
	/** Type file driver seat constructor. Line from type file should be of one of the following forms
	 * Driver x y z
	 * Pilot x y z
	 */
	public Seat(int dx, int dy, int dz)
	{
		id = 0;
		x = dx;
		y = dy;
		z = dz;
		part = EnumDriveablePart.core;
	}
	
	/** Type file driver seat constructor with yaw and pitch limiters */
	public Seat(int dx, int dy, int dz, float y1, float y2, float p1, float p2)
	{
		id = 0;
		x = dx;
		y = dy;
		z = dz;
		part = EnumDriveablePart.core;
		minYaw = y1;
		maxYaw = y2;
		minPitch = p1;
		maxPitch = p2;
	}

	
}
