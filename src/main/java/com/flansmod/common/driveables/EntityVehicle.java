package com.flansmod.common.driveables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.lwjgl.input.Keyboard;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;



import com.flansmod.api.IExplodeable;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.AnimTankTrack;
import com.flansmod.client.model.AnimTrackLink;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.DriveableType.ParticleEmitter;
import com.flansmod.common.driveables.VehicleType.SmokePoint;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.InventoryHelper;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketDriveableKeyHeld;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketVehicleControl;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.vector.Vector3i;


import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class EntityVehicle extends EntityDriveable implements IExplodeable
{
	/** Weapon delays */
	public int shellDelay, gunDelay;
	/** Position of looping sounds */
	public int soundPosition;
	public int idlePosition;
	/** Front wheel yaw, used to control the vehicle steering */
	public float wheelsYaw;
	/** Despawn time */
	private int ticksSinceUsed = 0;
    /** Aesthetic door switch */
    public boolean varDoor;
    //labjac radar range key
    public boolean combatRadar = false;
    /** Wheel rotation angle. Only applies to vehicles that set a rotating wheels flag */
    public float wheelsAngle;
    /** Delayer for door button */
    public int toggleTimer = 0;
    

    
    public int totalCrewInfo;
    
    
    public int exitTimer = 40;
    

    public float yaw = 0;
    public float pitch = 0;
    public float roll = 0;
    
    public float yawSpeed = 0;
    
    //Handling stuff
    public boolean leftTurnHeld = false;
    //labjac submarine kill
    public boolean rightTurnHeld = false;
    public boolean allWheelsOnGround;
    public boolean tooDeep = false;
    

    //Some nonsense

    boolean lockTurretForward = false;
    //Animation vectors
    public Vector3f doorPos = new Vector3f(0,0,0);
	public Vector3f doorRot = new Vector3f(0,0,0);
	public Vector3f door2Pos = new Vector3f(0,0,0);
	public Vector3f door2Rot = new Vector3f(0,0,0);
	
	public Vector3f prevDoorPos = new Vector3f(0,0,0);
	public Vector3f prevDoorRot = new Vector3f(0,0,0);
	public Vector3f prevDoor2Pos = new Vector3f(0,0,0);
	public Vector3f prevDoor2Rot = new Vector3f(0,0,0);
	
	//Main turret sounds for server (bullshit basically)
	public int yawDelay = 0;
	public int pitchDelay = 0;
	public boolean turretYawing;
	public boolean turretPitching;
	
	public boolean deployedSmoke = false;
	
	//for epic ship TM
	public boolean repairing = false;
	
	public AnimTankTrack rightTrack;
	public AnimTankTrack leftTrack;
	
	public AnimTrackLink trackLinksLeft[] = new AnimTrackLink[0];
	public AnimTrackLink trackLinksRight[] = new AnimTrackLink[0];
	//labjac type trasnfer attempt
	public boolean radarVisible;
	public boolean hasRadar;
	public boolean digitalRadar=false;
	public float radarRange;
	public int radarPositionOffset;
	public int radarRefreshDelay;
	
	public int slbmFlightType;
	public int slbmDelay;
	public int slbmRange;
	public int slbmStrength;
	public int slbmWarheadType;
	
	
	//cow tech
	//stabilizer values
    double jolt = 0;
    int delay = 0;
    double timer = 0;
    
    
    //cringe timer labjac general use
    int cringe = 0;
	private int deathTimer=0;
	private float radarDetectionRangeMultiplier = 1f;
	private float terrainFactor = 1f;
	
	//for turret to not be invis in 1st person
	public boolean alwaysShowTurret = false;

	

    public EntityVehicle(World world)
    {
        super(world);
        //stepHeight = type.wheelStepHeight;
        stepHeight = 1.0F;
    }

    //This one deals with spawning from a vehicle spawner
	public EntityVehicle(World world, double x, double y, double z, VehicleType type, DriveableData data)
	{
		super(world, type, data);
		stepHeight = type.wheelStepHeight;
	//	stepHeight = 1.0F;
		setPosition(x, y, z);
		initType(type, false);
	}

	//This one allows you to deal with spawning from items
	public EntityVehicle(World world, double x, double y, double z, EntityPlayer placer, VehicleType type, DriveableData data)
	{
		super(world, type, data);
		stepHeight = type.wheelStepHeight;
		//stepHeight = 1.0F;
		setPosition(x, y, z);
		rotateYaw(placer.rotationYaw + 90F);
		initType(type, false);
		setupTracks(type);
	}
	
	public void setupTracks(DriveableType type)
	{
		rightTrack = new AnimTankTrack(type.rightTrackPoints, type.trackLinkLength);
		leftTrack = new AnimTankTrack(type.leftTrackPoints, type.trackLinkLength);
		int numLinks = Math.round(rightTrack.getTrackLength()/ type.trackLinkLength);
		trackLinksLeft = new AnimTrackLink[numLinks];
		trackLinksRight = new AnimTrackLink[numLinks];
        for(int i = 0; i < numLinks; i++)
        {
        	float progress = 0.01F + (type.trackLinkLength * i);
    		int trackPart = leftTrack.getTrackPart(progress);
        	trackLinksLeft[i] = new AnimTrackLink(progress);
        	trackLinksRight[i] = new AnimTrackLink(progress);
        	trackLinksLeft[i].position = leftTrack.getPositionOnTrack(progress);
        	trackLinksRight[i].position = rightTrack.getPositionOnTrack(progress);
        	trackLinksLeft[i].rot = new RotatedAxes(0,0,rotateTowards(leftTrack.points.get((trackPart == 0)? leftTrack.points.size()-1:trackPart-1), trackLinksLeft[i].position));
        	trackLinksRight[i].rot = new RotatedAxes(0,0,rotateTowards(rightTrack.points.get((trackPart == 0)? rightTrack.points.size()-1:trackPart-1), trackLinksRight[i].position));
        	trackLinksLeft[i].zRot = rotateTowards(leftTrack.points.get((trackPart == 0)? leftTrack.points.size()-1:trackPart-1), trackLinksLeft[i].position);
        	trackLinksRight[i].zRot = rotateTowards(rightTrack.points.get((trackPart == 0)? rightTrack.points.size()-1:trackPart-1), trackLinksRight[i].position);
        }
	}
	
	

	@Override
	protected void initType(DriveableType type, boolean clientSide)
	{
		radarVisible=type.radarVisible;
		hasRadar=type.hasRadar;
		radarRange=type.radarRange;
		radarPositionOffset=type.radarPositionOffset;
		radarRefreshDelay=type.radarRefreshDelay;
		//labjac radar fix attempt
		slbmFlightType=type.slbmFlightType;
		slbmDelay=type.slbmDelay;
		slbmRange=type.slbmRange;
		slbmStrength=type.slbmStrength;
		slbmWarheadType=type.slbmWarheadType;
		digitalRadar=type.digitalRadar;
		radarDetectionRangeMultiplier=type.radarDetectionRangeMultiplier;
		//slbm shoehorn
		super.initType(type, clientSide);
		setupTracks(type);
		stepHeight = type.wheelStepHeight;
		//turret not invis 1st person
		alwaysShowTurret = type.alwaysShowTurret;
	}

	@Override
	public void readSpawnData(ByteBuf data)
	{
		super.readSpawnData(data);
	}

	@Override
    protected void writeEntityToNBT(NBTTagCompound tag)
    {
        super.writeEntityToNBT(tag);
        tag.setBoolean("VarDoor", varDoor);
    }

	@Override
    protected void readEntityFromNBT(NBTTagCompound tag)
    {
        super.readEntityFromNBT(tag);
        varDoor = tag.getBoolean("VarDoor");
    }
	
	@Override
    public boolean isInRangeToRenderDist(double d)
    {
        double d1 = 900D;
        return d < d1 * d1;
    }
	
	
	//thermal glow attempt
	public int getBrightnessForRender(float par1)
	{
		if(Minecraft.getMinecraft().entityRenderer.isShaderActive())
		{
			return 15728880;
		}
		else
		{
			int i = MathHelper.floor_double(this.posX);
			int j = MathHelper.floor_double(this.posZ);

			if (this.worldObj.blockExists(i, 0, j))
			{
				double d0 = (this.boundingBox.maxY - this.boundingBox.minY) * 0.66D;
				int k = MathHelper.floor_double(this.posY - (double)this.yOffset + d0);
				return this.worldObj.getLightBrightnessForSkyBlocks(i, k, j, 0);
			}
			else
			{
				return 0;
			}
		}
	}

	/**
	 * Called with the movement of the mouse. Used in controlling vehicles if need be.
	 * @param deltaY
	 * @param deltaX
	 */
	@Override
	public void onMouseMoved(int deltaX, int deltaY)
	{
	}

	@Override
	public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll, double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt, float steeringYaw)
	{
		super.setPositionRotationAndMotion(x, y, z, yaw, pitch, roll, motX, motY, motZ, velYaw, velPitch, velRoll, throt, steeringYaw);
		wheelsYaw = steeringYaw;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer)
    {
		if(isDead)
			return false;
		if(worldObj.isRemote)
			return false;

		//If they are using a repair tool, don't put them in
		ItemStack currentItem = entityplayer.getCurrentEquippedItem();
		if(currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.healDriveables)
			return true;
		//if using a "sword" dont let them in
		if(currentItem != null && currentItem.getItem() instanceof ItemGun && ((ItemGun)currentItem.getItem()).type.shootMelee)
			return true;
		


		VehicleType type = getVehicleType();
		//Check each seat in order to see if the player can sit in it
		
		
		//prevents hijacking if driver is in seat 2 (gun or bomb sight "seat")
		if(type.numPassengers > 0 && seats[1].riddenByEntity != null && seats[0].riddenByEntity == null)
			return true;
		
		
		for(int i = 0; i <= type.numPassengers; i++)
		{
			if(seats[i].interactFirst(entityplayer))
			{
				if(i == 0)
				{
					shellDelay = type.vehicleShellDelay;
					FlansMod.proxy.doTutorialStuff(entityplayer, this);
				}
				return true;
			}
		}
        return false;
    }
	
	
	


    @Override
	public boolean pressKey(int key, EntityPlayer player)
	{
    	VehicleType type = getVehicleType();
    	
    	//labjac engine system
		float engineHealth = ((float)getDriveableData().parts.get(EnumDriveablePart.engine).health / (float)getDriveableData().parts.get(EnumDriveablePart.engine).maxHealth * 1);
		if (getDriveableData().parts.get(EnumDriveablePart.engine).maxHealth==0)
			engineHealth = 1f;
		//for bismarck steering system
		float steeringHealth = ((float)getDriveableData().parts.get(EnumDriveablePart.steering).health / (float)getDriveableData().parts.get(EnumDriveablePart.steering).maxHealth * 1);
		if (getDriveableData().parts.get(EnumDriveablePart.steering).maxHealth==0)
			steeringHealth = 1f;
		//for bismarck steering system
		float buoyancy = ((float)getDriveableData().parts.get(EnumDriveablePart.buoyancy).health / (float)getDriveableData().parts.get(EnumDriveablePart.buoyancy).maxHealth * 1);
		if (getDriveableData().parts.get(EnumDriveablePart.steering).maxHealth==0)
			buoyancy = 1f;
		
		
    	//Send keys which require server side updates to the server
    	if(worldObj.isRemote && (key == 6 || key == 9))
    	{
    		FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
    		return true;
    	}
		switch(key)
		{
			case 0 : //Accelerate : Increase the throttle, up to 1.
			{
				if(type.floatOnWater==false && worldObj.isAnyLiquid(this.boundingBox) && throttle <= 0.1)
				throttle += (type.accelModifier*0.01F);
				else if(type.floatOnWater==false && !worldObj.isAnyLiquid(this.boundingBox))
				throttle += (type.accelModifier*0.01F);
				else if(type.floatOnWater==true)
				throttle += (type.accelModifier*0.01F);
				if(throttle > 1F*engineHealth)
					throttle = 1F*engineHealth;
				if(throttle > 1F*steeringHealth)
					throttle = 1F*steeringHealth;
				if(throttle > 1F*buoyancy)
					throttle = 1F*buoyancy;
				return true;
			}
			case 1 : //Decelerate : Decrease the throttle, down to -1, or 0 if the vehicle cannot reverse
			{
				if(type.floatOnWater==false && !worldObj.isAnyLiquid(this.boundingBox))
				throttle -= (type.decelModifier*0.01F);
				else if(type.floatOnWater==true)
					throttle -= (type.decelModifier*0.01F);
				if(throttle < -1F*engineHealth)
					throttle = -1F*engineHealth;
				if(throttle < -1F*steeringHealth)
					throttle = -1F*steeringHealth;
				if(throttle < -1F*buoyancy)
					throttle = -1F*buoyancy;
				if(throttle < 0F && type.maxNegativeThrottle == 0F)
					throttle = 0F;
				return true;
			}
			case 2 : //Left : Yaw the wheels left
			{
				wheelsYaw -= 1F*steeringHealth;
				leftTurnHeld = true;
				return true;
			}
			case 3 : //Right : Yaw the wheels right
			{
				wheelsYaw += 1F*steeringHealth;
				leftTurnHeld = true;
				return true;
			}
			case 4 : //Up : Brake
			{
				if((getVehicleType().canDive==true && oxygenMeter>0.1f) || getVehicleType().airship==true )
				divingFactor *= (0.7F*type.brakeModifier);
				if(getVehicleType().canDive==true && oxygenMeter<0.1f)
				{
					divingFactor += 0.01F;
					if(divingFactor > 1F)
						divingFactor = 1F;
				}

				
				throttle *= (0.8F*type.brakeModifier);
				//shitty universal break bonus for ships
				if(type.epicShip)
					throttle *= (0.5F*type.brakeModifier);
				
				if(throttle > type.boostLimit)
					throttle = 0f;
				return true;
			}
			case 5 : //Down : Do nothing
			{
				if(driveableData.scopeTimer <= 0 && type.hasScope)
				{
					aiming = !aiming;
					driveableData.scopeTimer = 10;
					PacketPlaySound.sendSoundPacket(posX, posY, posZ, 10f, dimension, "tankSight", false);
				}
				return true;
			}
			case 6 : //Exit : Get out
			{
				//no exiting while scoping
				if(!this.aiming)
				{
				exitTimer--;
				exitTimer--;
				
          		return true;
				}
			}
			case 7 : //Inventory
			{
				if(worldObj.isRemote)
                {
					FlansMod.proxy.openDriveableMenu((EntityPlayer)seats[0].riddenByEntity, worldObj, this);
                }
				return true;
			}
			case 8 : //v or right click do nothing    no sweetie its dismounting time
			{
				this.mountEntity(null);
				//return super.pressKey(key, player);
				return true;
			}
			
			
			case 19 : //seat switch
			{

				if(PlayerHandler.getPlayerData(player) != null && this.nintendoSwitchLite <= 0)
				{
				if(type.numPassengers > 0 && seats[1].riddenByEntity == null)
				{
					this.nintendoSwitchLite = 10;
					
				player.mountEntity(seats[1]);
				}
				}
				return true;
			}
			
			
			case 21 : //seat hotkey
			{

				if(PlayerHandler.getPlayerData(player) != null)
				{
				if(type.numPassengers > 1 && seats[1].riddenByEntity == null && seats[2].riddenByEntity == null)
				{
					//PlayerHandler.getPlayerData(player).s1 = 10;
				player.mountEntity(seats[1]);
				}
				}
				return true;
			}
			
			case 22 : //seat hotkey
			{

				if(PlayerHandler.getPlayerData(player) != null)
				{
				if(type.numPassengers > 2 && seats[1].riddenByEntity == null && seats[3].riddenByEntity == null)
				{
					//PlayerHandler.getPlayerData(player).s2 = 10;
				player.mountEntity(seats[1]);
				}
				}
				return true;
			}
			
			case 23 : //seat hotkey
			{

				if(PlayerHandler.getPlayerData(player) != null)
				{
				if(type.numPassengers > 3 && seats[1].riddenByEntity == null && seats[4].riddenByEntity == null)
				{
					//PlayerHandler.getPlayerData(player).s2 = 10;
					player.mountEntity(seats[1]);
				}
				}
				return true;
			}
			
			case 24 : //seat hotkey
			{

				if(PlayerHandler.getPlayerData(player) != null)
				{
				if(type.numPassengers > 4 && seats[1].riddenByEntity == null && seats[5].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
				}
				return true;
			}
			
			case 25 : //seat hotkey
			{

				if(PlayerHandler.getPlayerData(player) != null)
				{
				if(type.numPassengers > 5 && seats[1].riddenByEntity == null && seats[6].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
				}
				return true;
			}
			
			case 26 : //seat hotkey
			{

				if(PlayerHandler.getPlayerData(player) != null)
				{
				if(type.numPassengers > 6 && seats[1].riddenByEntity == null && seats[7].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
				}
				return true;
			}
			
			case 27 : //seat hotkey
			{

				if(PlayerHandler.getPlayerData(player) != null)
				{
				if(type.numPassengers > 7 && seats[1].riddenByEntity == null && seats[8].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
				}
				return true;
			}
			
			case 28 : //seat hotkey
			{

				if(PlayerHandler.getPlayerData(player) != null)
				{
				if(type.numPassengers > 8 && seats[1].riddenByEntity == null && seats[9].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
				}
				return true;
			}
			
			case 29 : //seat hotkey
			{

				if(PlayerHandler.getPlayerData(player) != null)
				{
				if(type.numPassengers > 9 && seats[1].riddenByEntity == null && seats[10].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
				}
				return true;
			}
			
			case 30 : //passenger kickout ejection seat
			{
			
				//gtfo = true;

				//if(!worldObj.isRemote)
				/*
				for(int i = 0; i<seats.length; i++)
				{
					System.out.println("iterator worked worked");
					if(seats[i].riddenByEntity != null)
					{
//						((EntityPlayer)seats[i].riddenByEntity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
						Entity entity = seats[i].riddenByEntity;
		System.out.println("ejection seat button worked");
						if(i>0)
						{
						//seats[i].riddenByEntity.mountEntity(null);
						entity.mountEntity(null);
						}
					}
				}
				*/
					return true;
					
			}
			
			
			case 32 : //thermal sight
			{
				if(driveableData.thermalTimer <= 0 && type.thermalSight)
				{
					thermalScoping = !thermalScoping;
					driveableData.thermalTimer = 10;		
				}
				return true;
			}
			
			case 33 : //magic artillery vision ammo view
			{
				if(driveableData.thermalTimer <= 0 && type.hasMagicArtilleryMode)
				{
					artilleryMode = !artilleryMode;
					driveableData.thermalTimer = 10;		
				}
				return true;
			}
			
			case 9 : //Shoot bullet    no sweetie its docking time

			
	
			
			double checkCarrierRange = 20;
			List carrier = worldObj.getEntitiesWithinAABB(EntitySeat.class, AxisAlignedBB.getBoundingBox(posX - checkCarrierRange, posY - checkCarrierRange, posZ - checkCarrierRange, posX + checkCarrierRange, posY + checkCarrierRange, posZ + checkCarrierRange));
			if(type.canDabOnEntity==true)
			{
				if(riddenByEntity != null && riddenByEntity instanceof EntityVehicle && !(riddenByEntity instanceof EntityPlayer))
				{
					riddenByEntity.mountEntity(null);
				//	System.out.println("carrier suction land did this");
					return true;
				}
				for(Object obj : carrier)
				{
					EntitySeat carrierSpot = (EntitySeat)obj;
					if(carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.parkingSpot == true)
					{
						this.mountEntity(carrierSpot);

					}

					}
			}
			
				return true;
			case 10 : //Change control mode : surface for subs
			{
				if (getVehicleType().canDive==true || getVehicleType().airship==true)
				divingFactor += 0.02F;
				if(divingFactor > 1F)
					divingFactor = 1F;
				return true;
			}
			case 11 : //Roll left : Do nothing i mean lock turret
			{

				seats[0].seatInfo.aimingSpeed = new Vector3f(0f, 0f, 0f);
				return true;
			}
			case 12 : //Roll right : Do nothing i mean unlock turret
			{
				
				seats[0].seatInfo.aimingSpeed = seats[0].seatInfo.aimingSpeedBackup;
				return true;
				
			}
			case 13 : // Gear : Do nothing
			{

				return true;
			}
			case 14 : // Door
			{
				if(toggleTimer <= 0)
				{
					varDoor = !varDoor;
					if(type.hasDoor)
						player.addChatMessage(new ChatComponentText("Doors " + (varDoor ? "open" : "closed")));
					toggleTimer = 10;
					FlansMod.getPacketHandler().sendToServer(new PacketVehicleControl(this));
				}
				if(toggleTimer <= 0)
				{
					combatRadar = !combatRadar;
					if(type.hasRadar)
						player.addChatMessage(new ChatComponentText("Radar set to " + (combatRadar ? "combat range" : "long range")));
					toggleTimer = 10;
				}
				return true;
			}
			case 15 : // dive
			{

				if ((getVehicleType().canDive==true && oxygenMeter>0.1f) || getVehicleType().airship==true )
				divingFactor -= 0.02F;
				if(divingFactor < -1F)
					divingFactor = -1F;
				
				
			//	if((getVehicleType().canDive==false || getVehicleType().airship==false) && type.numPassengers > 0 && seats[1].riddenByEntity == null)
			//		{
			//		player.mountEntity(seats[1]);
			//		}
				
				
				
				if((getVehicleType().canDive==true && oxygenMeter<0.1f))
				{
					divingFactor += 0.02F;
					if(divingFactor > 1F)
						divingFactor = 1F;
				}
				return true;
			}
            case 16 : // Trim Button its surface button now sweetheart
            {
            	break;
            
            }


            
            case 17 : //right click
            {
                break;
            }
            
            case 18 : //Flare    damage control for epic ship TM
            {
				if(type.hasFlare && this.ticksFlareUsing <= 0 && this.flareDelay <= 0 && (type.autoSmoke == false))
				{
					this.ticksFlareUsing = type.timeFlareUsing * 20;
					this.flareDelay = type.flareDelay;
					
					if(!type.epicShip)
					dischargeSmoke();
					if(worldObj.isRemote)
					{
						FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
					}
					else
					{
						dischargeSmoke();
						if(!type.flareSound.isEmpty())
						{
							PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.flareSound, false);   
						}
					}
					return true;
				}
				break;
            }
		}
		return false;
	
		


	}

    
    



	
    
    
    
    
    @Override
	public Vector3f getLookVector(ShootPoint dp)
    {
		return rotate(seats[0].looking.getXAxis());
    }
    

    @Override
	public void onUpdate()
    {
    	
    	
    	//labjac allah revenge

    	
    	
        
    	double bkPrevPosY = this.prevPosY;

        super.onUpdate();
		this.renderDistanceWeight = 4000.0D;
		//xdd this was the missing line for anime tracks
		animateFancyTracks();
		if(worldObj.isRemote){
        for(Entity e : findEntitiesWithinbounds())
        {
        	if(e != this){
        		moveRiders(e);
        	}
        }
		}
        
        


        
		//wheelsYaw -= 1F;
        

		//Get vehicle type
        VehicleType type = this.getVehicleType();
        DriveableData data = getDriveableData();
        if(type == null)
        {
        	FlansMod.log("Vehicle type null. Not ticking vehicle");
        	return;
        }
        //labjac ramming code using flare delay as timer xdddd - nope i made a new timer may 31 2020
		 if (throttle>0.7&&getDriveableType().needsThrottle==true&&leftMouseHeld&&this.ramDelay<= 0)
			 this.ramDelay = 20;
		 
		 

		//seat timer depletion 
	    	//if(type.numPassengers > 0 && seats[1].riddenByEntity == null && seats[0].riddenByEntity != null)
	    	//{
			if(this.nintendoSwitchLite > 0)
			{
			this.nintendoSwitchLite--;
			this.nintendoSwitchLite--;
			}
	    //	}

			
		 


        //Work out if this is the client side and the player is driving
        boolean thePlayerIsDrivingThis = worldObj.isRemote && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)seats[0].riddenByEntity);

        
        

		
		
        //Despawning
		ticksSinceUsed++;
		if(!worldObj.isRemote && seats[0].riddenByEntity != null)
			ticksSinceUsed = 0;
		if(!worldObj.isRemote && TeamsManager.vehicleLife > 0 && ticksSinceUsed > TeamsManager.vehicleLife * 20)
		{
			setDead();
		}
		
		if(this.worldObj.isRemote && (this.varFlare || this.ticksFlareUsing > (type.timeFlareUsing * 20)-5))
		{
			if(this.ticksExisted % 5 ==0)
			{
				if(!type.epicShip)
				deployedSmoke = true;
				if(type.epicShip)
				repairing = true;
			}
		}
		
		if(type.setPlayerInvisible && !this.worldObj.isRemote && seats[0].riddenByEntity != null)
			seats[0].riddenByEntity.setInvisible(true);

		if(this.ticksFlareUsing<= 0) 
		{
			deployedSmoke = false;
			repairing = false;
		}
		
		//cringe timer per tick
		if(this.cringe<5)
		cringe++;
		
		if(this.cringe==5)
		this.cringe=0;
		
		
		//rough terrain modifier
		Material mat = worldObj.getBlock((int)posX, (int)posY-(int)1, (int)posZ).getMaterial();
		if(!type.epicShip)
		{
		if(mat == Material.ground || mat == Material.grass || mat == Material.sand || mat == Material.snow || mat == Material.craftedSnow || mat == Material.leaves || mat == Material.air)
			terrainFactor = type.terrainPenalty;
		else
			terrainFactor = 1;
		}

		
		
        //exit timer
        if (this.exitTimer<type.exitTimer)
        	this.exitTimer++;
        
        //so initial exit is not 40 for fast leavers
        if (this.exitTimer>type.exitTimer)
        	this.exitTimer=type.exitTimer;
        
        
        if (this.exitTimer<0)
        {
        	//seats[0].riddenByEntity.setInvisible(false);
        	seats[0].riddenByEntity.mountEntity(null);
        	exitTimer = type.exitTimer;
        }
		
		//for non cruise control
		if(type.raceCar)
			throttle=(float) (throttle*0.9);
		
		float floatiness = ((float)getDriveableData().parts.get(EnumDriveablePart.buoyancy).health / (float)getDriveableData().parts.get(EnumDriveablePart.buoyancy).maxHealth * 1);
		
		
		//sinking animations/death
		//for keeling over and capsizing
        DriveablePart bow = (getDriveableData().parts.get(EnumDriveablePart.bow));
        DriveablePart stern = (getDriveableData().parts.get(EnumDriveablePart.stern));
        DriveablePart leftShip = (getDriveableData().parts.get(EnumDriveablePart.left));
        DriveablePart right = (getDriveableData().parts.get(EnumDriveablePart.right));
        DriveablePart midsection = (getDriveableData().parts.get(EnumDriveablePart.midsection));
		
		if(floatiness<0.1 && TeamsManager.seaLevel-this.posY>1)
		{
			
			//first loses speed from too much water drag
			throttle = 0;
		}
		
	//then starts exploding as it gets too depp
		if(floatiness<0.1 && TeamsManager.seaLevel-this.posY>14 || TeamsManager.seaLevel-this.posY>14 && bow.health<= 0 && bow.maxHealth>0 || TeamsManager.seaLevel-this.posY>14 && stern.health<= 0 && stern.maxHealth>0 ||TeamsManager.seaLevel-this.posY>14 && leftShip.health<= 0 && leftShip.maxHealth>0 || TeamsManager.seaLevel-this.posY>14 && right.health<= 0 && right.maxHealth>0 || TeamsManager.seaLevel-this.posY>14 && midsection.health <= 0 && midsection.maxHealth > 0)
		{this.worldObj.createExplosion(this, this.posX, this.posY+2, this.posZ, 1, false);
	}
		
		//finally drops dead
		if(floatiness<0.1 && TeamsManager.seaLevel-this.posY>15 || TeamsManager.seaLevel-this.posY>15 && bow.health<= 0 && bow.maxHealth>0 || TeamsManager.seaLevel-this.posY>15 && stern.health<= 0 && stern.maxHealth>0 ||TeamsManager.seaLevel-this.posY>15 && leftShip.health<= 0 && leftShip.maxHealth>0 || TeamsManager.seaLevel-this.posY>15 && right.health<= 0 && right.maxHealth>0 || TeamsManager.seaLevel-this.posY>15 && midsection.health <= 0 && midsection.maxHealth > 0)
		{
			//FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "flansmod.shipDeath"), posX, posY, posZ, 200, dimension);
			FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "shippuDeath"), posX, posY, posZ, 200, dimension);
			
			if(type.nuclearDeath==true)
			{
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "nuclear"), posX, posY, posZ, 400, dimension);
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "YamatoGun", false);}
		if(type.bigDeath==true)
			{FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "shippuDeath"), posX, posY, posZ, 200, dimension);
		PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "BattleshipGun", false);}
		if(type.Death==true)
			{FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "tankkuDeath"), posX, posY, posZ, 200, dimension);
		PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);}
			
	setDead();
	}
		
		//in case people try beaching ships so they cant sink deep enough to trigger death		
		
		if(bow.health<= 0 && bow.maxHealth>0 ||stern.health<= 0 && stern.maxHealth>0 || leftShip.health<= 0 && leftShip.maxHealth>0 || right.health<= 0 && right.maxHealth>0 || midsection.health <= 0 && midsection.maxHealth > 0)
			deathTimer++;
		else if(deathTimer>0)
			deathTimer--;
			
			
		if(deathTimer>1200 && bow.health<= 0 && bow.maxHealth>0 || deathTimer>600 && stern.health<= 0 && stern.maxHealth>0 ||deathTimer>600 && leftShip.health<= 0 && leftShip.maxHealth>0 || deathTimer>600 && right.health<= 0 && right.maxHealth>0 || deathTimer>600 && midsection.health <= 0 && midsection.maxHealth > 0)
		{
			if(type.nuclearDeath==true)
			{
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "nuclear"), posX, posY, posZ, 400, dimension);
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "YamatoGun", false);}
		if(type.bigDeath==true)
			{FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "shippuDeath"), posX, posY, posZ, 200, dimension);
		PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "BattleshipGun", false);}
		if(type.Death==true)
			{FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "tankkuDeath"), posX, posY, posZ, 200, dimension);
		PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);}
	setDead();
	}
		
		//for item description
		totalCrewInfo = getDriveableData().totalCrew;
		
		//labjac turret cook weakspot destroyed
		if ((getDriveableData().parts.get(EnumDriveablePart.turretWeak).maxHealth)>0 && (getDriveableData().parts.get(EnumDriveablePart.turretWeak).health)<=0 && (getDriveableData().parts.get(EnumDriveablePart.turret).health)>0 || (getDriveableData().parts.get(EnumDriveablePart.turretWeak2).maxHealth)>0 && (getDriveableData().parts.get(EnumDriveablePart.turretWeak2).health)<=0 && (getDriveableData().parts.get(EnumDriveablePart.turret).health)>0)
		{
			
			if(this.cringe==4)
			{
			//attackPart(EnumDriveablePart.turret, DamageSource.cactus, 1+(float)(getDriveableData().parts.get(EnumDriveablePart.turret).maxHealth)/(float)(4*type.WeakspotCookTime));
				(getDriveableData().parts.get(EnumDriveablePart.turret).health)=(getDriveableData().parts.get(EnumDriveablePart.turret).health)-(int)(getDriveableData().parts.get(EnumDriveablePart.turret).maxHealth)/(int)(4*type.WeakspotCookTime);
				
			worldObj.createExplosion(this, posX, posY+3, posZ, 0.1f, false);
			for(int smoke = 0; smoke < 10; smoke++)
			{
				float smokeRand = (float)Math.random();

				if(smokeRand < 0.25)
				{
				FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare",posX, posY+4, posZ, (float)Math.random()*smokeRand, (float)Math.random()*smokeRand, (float)Math.random()*smokeRand), posX, posY+4, posZ, 150, worldObj.provider.dimensionId);
				//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
				} else if (smokeRand > 0.25 && smokeRand < 0.5){
				FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", posX, posY+4, posZ, (float)Math.random()*smokeRand, (float)Math.random()*smokeRand, -(float)Math.random()*smokeRand), posX, posY+4, posZ, 150, worldObj.provider.dimensionId);
				//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
				} else if (smokeRand > 0.5 && smokeRand < 0.75){
				FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", posX, posY+4, posZ, -(float)Math.random()*smokeRand, (float)Math.random()*smokeRand, -(float)Math.random()*smokeRand), posX, posY+4, posZ, 150, worldObj.provider.dimensionId);
				//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
				} else if (smokeRand > 0.75){
				FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", posX, posY+4, posZ, -(float)Math.random()*smokeRand, (float)Math.random()*smokeRand, (float)Math.random()*smokeRand), posX, posY+4, posZ, 150, worldObj.provider.dimensionId);
				//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
				}
				
				

			}

			}
			
		}
		
		//labjac hull cook weakspot destroyed, also dead turret causes hull cook
		if ((getDriveableData().parts.get(EnumDriveablePart.weakSpot).maxHealth)>0 && (getDriveableData().parts.get(EnumDriveablePart.weakSpot).health)<=0 || (getDriveableData().parts.get(EnumDriveablePart.weakSpot2).maxHealth)>0 && (getDriveableData().parts.get(EnumDriveablePart.weakSpot2).health)<=0 || (getDriveableData().parts.get(EnumDriveablePart.weakSpot3).maxHealth)>0 && (getDriveableData().parts.get(EnumDriveablePart.weakSpot3).health)<=0 || (getDriveableData().parts.get(EnumDriveablePart.turret).maxHealth)>0 && (getDriveableData().parts.get(EnumDriveablePart.turret).health)<=0 && !type.epicShip && type.needsTurret )
		{
			
			if(this.cringe==4)
			{
			//attackPart(EnumDriveablePart.core, DamageSource.cactus, 1+(getDriveableData().parts.get(EnumDriveablePart.core).maxHealth)/(4*type.WeakspotCookTime));
				(getDriveableData().parts.get(EnumDriveablePart.core).health)=(getDriveableData().parts.get(EnumDriveablePart.core).health)-(int)(getDriveableData().parts.get(EnumDriveablePart.core).maxHealth)/(int)(4*type.WeakspotCookTime);
			worldObj.createExplosion(this, posX, posY+2, posZ, 0.1f, false);
			for(int smoke = 0; smoke < 10; smoke++)
			{
				float smokeRand = (float)Math.random();

				if(smokeRand < 0.25)
				{
				FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare",posX, posY+1, posZ, (float)Math.random()*smokeRand, (float)Math.random()*smokeRand, (float)Math.random()*smokeRand), posX, posY+4, posZ, 150, worldObj.provider.dimensionId);
				//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
				} else if (smokeRand > 0.25 && smokeRand < 0.5){
				FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", posX, posY+1, posZ, (float)Math.random()*smokeRand, (float)Math.random()*smokeRand, -(float)Math.random()*smokeRand), posX, posY+4, posZ, 150, worldObj.provider.dimensionId);
				//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, (float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
				} else if (smokeRand > 0.5 && smokeRand < 0.75){
				FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", posX, posY+1, posZ, -(float)Math.random()*smokeRand, (float)Math.random()*smokeRand, -(float)Math.random()*smokeRand), posX, posY+4, posZ, 150, worldObj.provider.dimensionId);
				//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, -(float)Math.random()*mod);
				} else if (smokeRand > 0.75){
				FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", posX, posY+1, posZ, -(float)Math.random()*smokeRand, (float)Math.random()*smokeRand, (float)Math.random()*smokeRand), posX, posY+4, posZ, 150, worldObj.provider.dimensionId);
				//FlansMod.proxy.spawnParticle("flansmod.flare", explosionX, explosionY, explosionZ, -(float)Math.random()*mod, (float)Math.random()*mod, (float)Math.random()*mod);
				}
				
				

			}

			}
			
		}
		
		
		//labjac ram part two xddd fixed it to use new timer
		if(this.ticksFlareUsing > 0)
			{this.ticksFlareUsing--;
			// if (getDriveableType().needsThrottle==true)
			//	 throttle = ((ticksFlareUsing*ticksFlareUsing*ticksFlareUsing*0.000125f)-0.1f);
			}
		if(this.flareDelay > 0)
			this.flareDelay--;
		
		if(this.ramDelay > 0)
		{
			 if (getDriveableType().needsThrottle==true || type.bigRecoil)
				 throttle = (((float)ramDelay*(float)ramDelay*(float)ramDelay*(-0.000125f))-0.1f);
			 this.ramDelay--;
		}
		
if(this.nintendoSwitchLite < 10)
	this.nintendoSwitchLite++;


		
		//labjac aps
		if(this.APSdelay > 0)
			this.APSdelay--;
		
		if(this.APSdelay == (type.APSdelayMax - 5))
			dischargeAPS();
		
		
		//anti cruise control for submarines
		if ((getVehicleType().canDive==true && oxygenMeter>0.1f  && divingFactor >= -1F && divingFactor < 0F) || getVehicleType().airship==true && divingFactor > -1F && divingFactor < 0F)
		divingFactor += 0.01F;
		
		if ((getVehicleType().canDive==true && oxygenMeter>0.1f  && divingFactor <= 1F && divingFactor > 0F) || getVehicleType().airship==true && divingFactor < 1F && divingFactor > 0F)
		divingFactor -= 0.01F;

		
		

		//Shooting, inventories, etc.
		//Decrement shell and gun timers
		if(shellDelay > 0)
			shellDelay--;
		if(gunDelay > 0)
			gunDelay--;
		if(toggleTimer > 0)
			toggleTimer--;
		if(driveableData.thermalTimer > 0)
			driveableData.thermalTimer--;
		if(driveableData.scopeTimer > 0)
			driveableData.scopeTimer--;
		if(soundPosition > 0)
			soundPosition--;	
		if(idlePosition > 0)
			idlePosition--;	
		
		//punjab attemptt o fix scope sound not working in multiplayer
		if(driveableData.thermalTimer ==9)
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 10f, dimension, "AnalogComputerSound", false);
			if(driveableData.scopeTimer ==9)	
				PacketPlaySound.sendSoundPacket(posX, posY, posZ, 10f, dimension, "tankSight", false);
		//if in water and not a ship reload delay increases xddd
		//if(type.floatOnWater==false && worldObj.isAnyLiquid(this.boundingBox) && throttle <= 0.11)
	//	{
	//		shellDelay++;
	//		shellDelay++;
	//	gunDelay++;
	//	gunDelay++;
	//	}
				
		if(type.tank && !hasBothTracks()) throttle = 0;
		if(disabled) wheelsYaw = 0;
		
		
		//Rotate the wheels
		if(hasEnoughFuel())
		{
			wheelsAngle += throttle / 7F;
		}
		
		if(!varDoor){
			doorPos = transformPart(doorPos, type.doorPos1, type.doorRate);
			doorRot = transformPart(doorRot, type.doorRot1, type.doorRotRate);
		} else {
			doorPos = transformPart(doorPos, type.doorPos2, type.doorRate);
			doorRot = transformPart(doorRot, type.doorRot2, type.doorRotRate);
		}

		//Return the wheels to their resting position
		wheelsYaw *= 0.9F;

		//Limit wheel angles
		if(wheelsYaw > 20)
			wheelsYaw = 20;
		if(wheelsYaw < -20)
			wheelsYaw = -20;

		//Player is not driving this. Update its position from server update packets
		if(worldObj.isRemote && !thePlayerIsDrivingThis)
		{
			//The driveable is currently moving towards its server position. Continue doing so.
            if (serverPositionTransitionTicker > 0)
            {
                double x = posX + (serverPosX - posX) / serverPositionTransitionTicker;
                double y = posY + (serverPosY - posY) / serverPositionTransitionTicker;
                double z = posZ + (serverPosZ - posZ) / serverPositionTransitionTicker;
                double dYaw = MathHelper.wrapAngleTo180_double(serverYaw - axes.getYaw());
                double dPitch = MathHelper.wrapAngleTo180_double(serverPitch - axes.getPitch());
                double dRoll = MathHelper.wrapAngleTo180_double(serverRoll - axes.getRoll());
                rotationYaw = (float)(axes.getYaw() + dYaw / serverPositionTransitionTicker);
                rotationPitch = (float)(axes.getPitch() + dPitch / serverPositionTransitionTicker);
                float rotationRoll = (float)(axes.getRoll() + dRoll / serverPositionTransitionTicker);
                --serverPositionTransitionTicker;
                setPosition(x, y, z);
                setRotation(rotationYaw, rotationPitch, rotationRoll);
                //return;
            }
            //If the driveable is at its server position and does not have the next update, it should just simulate itself as a server side driveable would, so continue
		}

		//Movement

		correctWheelPos();

		Vector3f amountToMoveCar = new Vector3f();

		for(EntityWheel wheel : wheels)
		{
			if(wheel == null)
				continue;
			
			double prevPosYWheel = wheel.posY;

			//Hacky way of forcing the car to step up blocks
			onGround = true;
			wheel.onGround = true;
			
			List<Entity> shipsCheck = worldObj.getEntitiesWithinAABB(Entity.class, wheel.boundingBox);

			boolean onShip = false;
			for(Entity ship : shipsCheck){
				if(this.getClass().toString().indexOf("cuchaz.ships.EntityShip") > 0){
					wheel.onGround = true;
					onShip = true;
				}
			}
			
			//Update angles
			wheel.rotationYaw = axes.getYaw();
			//Front wheels
			if(!type.tank && (wheel.ID == 2 || wheel.ID == 3))
			{
				wheel.rotationYaw += wheelsYaw;
			}

			wheel.motionX *= 0.9F;
			wheel.motionY *= this.posY - bkPrevPosY < 0? 0.999F: 0.9F;
			wheel.motionZ *= 0.9F;
			

			//Apply velocity
			//If the player driving this is in creative, then we can thrust, no matter what
			boolean canThrustCreatively = !TeamsManager.vehiclesNeedFuel || (seats != null && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode);
			//Otherwise, check the fuel tanks!
			if(canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption * throttle)
			{
				if(getVehicleType().tank)
				{
					boolean left = wheel.ID == 0 || wheel.ID == 3;

					float turningDrag = 0.02F;
					wheel.motionX *= 1F - (Math.abs(wheelsYaw) * turningDrag);
					wheel.motionZ *= 1F - (Math.abs(wheelsYaw) * turningDrag);
					float velocityScale = 0.04F * (throttle > 0 ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed;
					


					
					float steeringScale = 0.1F * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier);
					
					
					//if one track is broken, you can still turn slowly
					if((isPartIntact(EnumDriveablePart.leftTrack) && !isPartIntact(EnumDriveablePart.leftTrack)) || (!isPartIntact(EnumDriveablePart.leftTrack) && isPartIntact(EnumDriveablePart.leftTrack)))
						steeringScale = 0.05F * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier);

					//no more trackless or engineless tanks spinning
					else if( !isPartIntact(EnumDriveablePart.engine) || (!isPartIntact(EnumDriveablePart.leftTrack) && !isPartIntact(EnumDriveablePart.rightTrack)))
						steeringScale = 0;
					
					float effectiveWheelSpeed = (throttle * terrainFactor + (wheelsYaw * (left ? 1 : -1) * steeringScale)) * velocityScale;
					wheel.motionX += effectiveWheelSpeed * Math.cos(wheel.rotationYaw * 3.14159265F / 180F);
					wheel.motionZ += effectiveWheelSpeed * Math.sin(wheel.rotationYaw * 3.14159265F / 180F);
					yawSpeed += effectiveWheelSpeed * Math.sin(wheel.rotationYaw * 3.14159265F / 180F);



				}
				else
				{
					//if(getVehicleType().fourWheelDrive || wheel.ID == 0 || wheel.ID == 1)
					{
						float velocityScale = 0.1F * throttle * terrainFactor * (throttle > 0 ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed;
						wheel.motionX += Math.cos(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale;
						wheel.motionZ += Math.sin(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale;
					}

					//Apply steering
					if(wheel.ID == 2 || wheel.ID == 3)
					{
						float velocityScale = 0.01F * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier) * (throttle > 0 ? 1 : -1);

						wheel.motionX -= wheel.getSpeedXZ() * Math.sin(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale * wheelsYaw;
						wheel.motionZ += wheel.getSpeedXZ() * Math.cos(wheel.rotationYaw * 3.14159265F / 180F) * velocityScale * wheelsYaw;
					}
					else
					{
						wheel.motionX *= 0.9F;
						wheel.motionZ *= 0.9F;
					}
				}
			}
			
			wheel.moveEntity(wheel.motionX, wheel.motionY, wheel.motionZ);

			//Pull wheels towards car
			Vector3f targetWheelPos = axes.findLocalVectorGlobally(getVehicleType().wheelPositions[wheel.ID].position);

			Vector3f currentWheelPos = new Vector3f(wheel.posX - posX, wheel.posY - posY, wheel.posZ - posZ);

			Vector3f dPos = ((Vector3f)Vector3f.sub(targetWheelPos, currentWheelPos, null).scale(type.wheelSpringStrength));
			
			if(dPos.length() > 0.001F)
			{
				wheel.moveEntity(dPos.x, dPos.y, dPos.z);
				dPos.scale(0.5F);
				Vector3f.sub(amountToMoveCar, dPos, amountToMoveCar);
			}
			
			float avgWheelHeight = 0F;
			
			//Secondary check whether all wheels are on ground...
			if(wheels[0] != null && wheels[1] != null && wheels[2] != null && wheels[3] != null)
			{
			avgWheelHeight = (float)(wheels[0].posX + wheels[1].posX + wheels[2].posX + wheels[3].posX)/4;
	    	if(!wheels[0].onGround && !wheels[1].onGround && !wheels[2].onGround && !wheels[3].onGround){
	    		allWheelsOnGround = false;
	    	} else {
	    		allWheelsOnGround = true;
	    	}
			}
			//for fancy ship
			
			//for zeppelin
			float gas = ((float)getDriveableData().parts.get(EnumDriveablePart.gasbag).health / (float)getDriveableData().parts.get(EnumDriveablePart.gasbag).maxHealth * 1);
			if (getDriveableData().parts.get(EnumDriveablePart.gasbag).maxHealth==0)
				gas = 1f;
			

			

			
			
			

			
			if (data.depth > 0.01 && (float)getDriveableData().parts.get(EnumDriveablePart.core).health>0)
				data.depth = 0;
			
			if ((TeamsManager.seaLevel-this.posY)>2f)
			{
				if (type.unlimitedOxygen == false)
					oxygenMeter -= 1f;
				if (oxygenMeter < 0f)
					oxygenMeter = 0f;
			}
			
			if ((TeamsManager.seaLevel-this.posY)<2f && (float)getDriveableData().parts.get(EnumDriveablePart.core).health>0)
			{
				oxygenMeter += 15f;
				if (oxygenMeter > type.maxOxygen)
					oxygenMeter = type.maxOxygen;
			}
			
			
			if((TeamsManager.seaLevel-this.posY)>(float)type.maxDepth&&type.canDive==true)
			{
				//attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);    for unknown reasons attackpart doesnt work anymore
				(getDriveableData().parts.get(EnumDriveablePart.core).health)=(getDriveableData().parts.get(EnumDriveablePart.core).health)-10;
			}

		
			


			//	FlansMod.log("fall%s : tick=%d damage=%.1f", no_damage? " no damage":"", this.ticksExisted, damage);
				

			if(type.floatOnWater==false && worldObj.isAnyLiquid(this.boundingBox) && throttle>0.1)
			{
				throttle -= 0.001;
			}
			
			if(type.floatOnWater==false && worldObj.isAnyLiquid(this.boundingBox) && throttle<-0.1)
			{
				throttle += 0.001;
			}

			
			//Stabilizer Stuff cow tech

	        Random rand = new Random();

	        if(!type.Stabilizer) 
	        {

	            if(throttle > 0.05)
	            {

	                delay--;
	                timer += 0.05D;
	                timer = timer % 15;

	                jolt += 1D;

	                if(jolt > 0.8) jolt = 0.8;

	                else
	                    jolt = 0;

	                if(delay <= 0) {

	                    delay = 1 + 2*rand.nextInt(2);


	                }

	                float change = (float)((Math.PI * Math.cos((Math.PI * timer)) / 180 * timer) * jolt);
	                seats[0].playerLooking.rotateLocalPitch(change * throttle*2); }

	                else { jolt = 0; }
	    }



			
	        DriveablePart buoyancy = (getDriveableData().parts.get(EnumDriveablePart.buoyancy));
	        
	        //keel over left or right  works well until you try repairing, then she does flips
	      //  if(leftShip.maxHealth>0 && right.maxHealth>0)
	        //	roll=0.9F*( (((float)right.health-(float)leftShip.health))/(float)leftShip.maxHealth );

	       if(type.epicShip && leftShip.health>0 && right.health>0 && bow.health>0 && stern.health>0)
	       {
	    	   roll=0;
	    	   pitch=0;
	       }
				
			//Now we apply gravity    &&(type.canDive=false)&&Keyboard.isKeyDown(30)
			if(allWheelsOnGround && !(type.floatOnWater && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0))) && !wheel.onDeck&& type.canDive==false&& type.airship==false){
				//if(!type.epicShip)
				//wheel.moveEntity(0F, (!onDeck)?-0.98F/5:0, 0F);
				//wheel.moveEntity(0F, (!onDeck)?-3.58F/1:0, 0F); //muh jupiter gravity according to adhdill
				wheel.moveEntity(0F, (!onDeck)?-2F/1:0, 0F); //i increased gravity speed -t labjac
		if(type.epicShip && (float)floatiness<0.1F || bow.maxHealth>0 && bow.health<=0 || stern.maxHealth>0 && stern.health<=0  ||leftShip.maxHealth>0 && leftShip.health<=0 || right.maxHealth>0 && right.health<=0  || midsection.health <= 0 && midsection.maxHealth > 0)
wheel.moveEntity(0F, -0.98F/5, 0F);
				
			} 
			//normal floatiness
			else if((((type.floatOnWater && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0)))) && type.canDive==false && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, 1 - type.floatOffset, 0)) && !wheel.onDeck) )
			{
				if(!type.epicShip)
				wheel.moveEntity(0F, 0.5f, 0F);	
				data.depth=0;
				
				//epic ship
				if(type.epicShip && (float)leftShip.maxHealth<=0 && (float)right.maxHealth<=0 && (float)bow.maxHealth<=0 && (float)stern.maxHealth<=0 && (float)midsection.maxHealth<=0)
				{
				wheel.moveEntity(0F, 0.3F*(1.1*floatiness-0.1), 0F);	
				data.depth=0;
				}
				//can keel over for left/right bow/stern case and midsection bow stern case
				else if(type.epicShip&& (float)leftShip.health>1 && leftShip.maxHealth>0 && (float)right.health>1 && right.maxHealth>1  && midsection.maxHealth<=0 && bow.health>1 && bow.maxHealth>0 && stern.health>0 && stern.maxHealth>0|| midsection.maxHealth > 0 && midsection.health>1 && type.epicShip || type.epicShip &&  leftShip.maxHealth<=0 && (float)right.health>1 && right.maxHealth<=0  && midsection.maxHealth>1 && midsection.health>1 && bow.health>1 && bow.maxHealth>0 && stern.health>0 && stern.maxHealth>0)
				{
				wheel.moveEntity(0F, 0.3F*(1.1*floatiness-0.1), 0F);	
				data.depth=0;
				}
				
				//keel over sinking
				else
				{
				wheel.moveEntity(0F, 0.3F*(-0.1F), 0F);	
				data.depth=0;
				if(leftShip.health<=0 && right.health>0 && roll<1.5F)
					roll=roll+0.002F;
				if(right.health<=0 && leftShip.health>0 && roll>-1.5F)
					roll=roll-0.002F;
				if(bow.health<=0 && stern.health>0 && pitch<0.6F)
					pitch=pitch+0.001F;
				if(stern.health<=0 && bow.health>0 && pitch>-0.6F)
					pitch=pitch-0.001F;
				}

				
			}
			

			
//submarine
			else if((((type.floatOnWater && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0)))) && type.canDive==true && type.airship==false && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, 1 - type.floatOffset, 0)) && (divingFactor>0) && seats[0].riddenByEntity instanceof EntityPlayer) && oxygenMeter > 0.1f)
			{
				wheel.moveEntity(0F, (type.surfaceSpeed*0.5)*divingFactor, 0F);	
				data.depth += (type.surfaceSpeed*0.5)*divingFactor*.16666;
			}
			
			else if((((type.floatOnWater && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0)))) && type.canDive==true && type.airship==false && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, 1 - type.floatOffset, 0)) && (divingFactor>0) && seats[0].riddenByEntity instanceof EntityPlayer) &&  oxygenMeter < 0.1f)
			{
				wheel.moveEntity(0F, (type.surfaceSpeed*0.5)*1f, 0F);	
				data.depth += (type.surfaceSpeed*0.5)*1*.16666;
			}
			else if((((type.floatOnWater && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0)))) && type.canDive==true && type.airship==false && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, 1 - type.floatOffset, 0)) && (divingFactor<0) && seats[0].riddenByEntity instanceof EntityPlayer) &&  oxygenMeter > 0.1f)
			{
				wheel.moveEntity(0F, (type.diveSpeed*0.5)*divingFactor, 0F);	
				data.depth += (type.diveSpeed*0.5)*divingFactor*.16666;
			}
			
			else if((((type.floatOnWater && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0)))) && type.canDive==true && type.airship==false && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, 1 - type.floatOffset, 0)) && (divingFactor<0) && seats[0].riddenByEntity instanceof EntityPlayer) &&  oxygenMeter < 0.1f)
			{
				wheel.moveEntity(0F, (type.diveSpeed*0.5)*1, 0F);	
				data.depth += (type.diveSpeed*0.5)*1*.16666;
			}
			
			//zeppelin
			else if((((!worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0)))) && type.canDive==false && type.airship==true && !worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, 1 - type.floatOffset, 0)) && (divingFactor>0.1) && (this.posY < type.maxAltitude) && seats[0].riddenByEntity instanceof EntityPlayer))
			{
				wheel.moveEntity(0F, divingFactor*(type.surfaceSpeed*0.5)*(2*gas-1), 0F);	
			}
			else if((((!worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0)))) && type.canDive==false && type.airship==true && !worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, 1 - type.floatOffset, 0)) && (divingFactor<-0.1) && seats[0].riddenByEntity instanceof EntityPlayer))
			{
				wheel.moveEntity(0F, divingFactor*(type.diveSpeed*0.5)*(2-gas*1), 0F);	
			}
			
			else if((((!worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0)))) && type.canDive==false && type.airship==true && !worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, 1 - type.floatOffset, 0))&& (divingFactor>-0.1) && (divingFactor<0.1)))
			{
				wheel.moveEntity(0F, 0.5*(gas-1), 0F);	
			}
			
			
		//	healthPercent(EnumDriveablePart.gasbag)
				
				//submarine static
			else if((((type.floatOnWater && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0)))) && type.canDive==true && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, 1 - type.floatOffset, 0)) && oxygenMeter>0.1f))
			{
				wheel.moveEntity(0F, 0F, 0F);	
			}
			
			else if((((type.floatOnWater && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0)))) && type.canDive==true && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, 1 - type.floatOffset, 0)) && oxygenMeter<0.1f))
			{
				wheel.moveEntity(0F, (type.surfaceSpeed*0.6)*1f, 0F);	
			}
			
			//on deck behaviour
			else if(((type.floatOnWater && worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, -type.floatOffset, 0))) && !worldObj.isAnyLiquid(wheel.boundingBox.copy().offset(0, 1 - type.floatOffset, 0))&& type.canDive==false) || (wheel.onDeck)&&type.canDive==false)
			{
				if(!type.epicShip)
				{
					wheel.moveEntity(0F, 0F, 0F);
				this.roll = 0;
				this.pitch = 0;
				}
				if(type.epicShip && (float)floatiness>=0.1)
					wheel.moveEntity(0F, 0F, 0F);
				//sinking or capsizing
				if(type.epicShip && (float)floatiness<0.1 || type.epicShip && bow.maxHealth>0 && bow.health<=0 || type.epicShip && stern.maxHealth>0 && stern.health<=0 || type.epicShip && leftShip.maxHealth>0 && leftShip.health<=0 || type.epicShip && right.maxHealth>0 && right.health<=0 || midsection.health <= 0 && midsection.maxHealth > 0)
					wheel.moveEntity(0F, -0.3F, 0F);
				}
				
			//sub again
				else if((wheel.onDeck)&& type.canDive==true && (divingFactor<0) ){
					divingFactor=(float)-0.3;
					data.depth = 0;

			this.roll = 0;
			this.pitch = 0;
			} 
				else {
				wheel.moveEntity(0F, (!onDeck)?-0.98F:0, 0F);	
			}
			
			if((throttle >= 1.1 || throttle <= -1.1) && wheel.getSpeedXYZ() <= getAvgWheelSpeedXYZ()/1) throttle = 1f;
		}
		
		if(wheels[0] != null && wheels[1] != null && wheels[2] != null && wheels[3] != null)
		{
			lastPos.x = (float)(wheels[0].motionX + wheels[1].motionX + wheels[2].motionX + wheels[3].motionX)/4;
			lastPos.y = (float)(wheels[0].motionY + wheels[1].motionY + wheels[2].motionY + wheels[3].motionY)/4;
			lastPos.z = (float)(wheels[0].motionZ + wheels[1].motionZ + wheels[2].motionZ + wheels[3].motionZ)/4;
		}

		
		double bmy = this.motionY;
		this.motionY = amountToMoveCar.y;
		moveEntity(amountToMoveCar.x, amountToMoveCar.y, amountToMoveCar.z);
		this.motionY = bmy;

		if(wheels[0] != null && wheels[1] != null && wheels[2] != null && wheels[3] != null)
		{
			Vector3f frontAxleCentre = new Vector3f((wheels[2].posX + wheels[3].posX) / 2F, (wheels[2].posY + wheels[3].posY) / 2F, (wheels[2].posZ + wheels[3].posZ) / 2F);
			Vector3f backAxleCentre = new Vector3f((wheels[0].posX + wheels[1].posX) / 2F, (wheels[0].posY + wheels[1].posY) / 2F, (wheels[0].posZ + wheels[1].posZ) / 2F);
			Vector3f leftSideCentre = new Vector3f((wheels[0].posX + wheels[3].posX) / 2F, (wheels[0].posY + wheels[3].posY) / 2F, (wheels[0].posZ + wheels[3].posZ) / 2F);
			Vector3f rightSideCentre = new Vector3f((wheels[1].posX + wheels[2].posX) / 2F, (wheels[1].posY + wheels[2].posY) / 2F, (wheels[1].posZ + wheels[2].posZ) / 2F);

			float dx = frontAxleCentre.x - backAxleCentre.x;
			float dy = frontAxleCentre.y - backAxleCentre.y;
			float dz = frontAxleCentre.z - backAxleCentre.z;
			float drx = leftSideCentre.x - rightSideCentre.x;
			float dry = leftSideCentre.y - rightSideCentre.y;
			float drz = leftSideCentre.z - rightSideCentre.z;


			float dxz = (float)Math.sqrt(dx * dx + dz * dz);
			float drxz = (float)Math.sqrt(drx * drx + drz * drz);

			float tyaw = (float)Math.atan2(dz, dx);
			float tpitch = -(float)Math.atan2(dy, dxz);
			float troll = 0F;
			if(type.canRoll){
				troll = -(float)Math.atan2(dry, drxz);
			}

			yaw = tyaw;
			pitch = Lerp(pitch, tpitch, 0.2F);
			roll = Lerp(roll, troll, 0.2F);
			
			
			//lose engine, lose steering
			float engineHealthTwo = ((float)getDriveableData().parts.get(EnumDriveablePart.engine).health / (float)getDriveableData().parts.get(EnumDriveablePart.engine).maxHealth * 1);
			if (getDriveableData().parts.get(EnumDriveablePart.engine).maxHealth==0)
				engineHealthTwo = 1f;
			
			
			if(type.tank)
			{
				
				//to do make losing engine or tracks lose steering
				
				
				float velocityScale = 0.04F * (throttle > 0 ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed;
				float steeringScale = 0.1F * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier) * engineHealthTwo;
				//shitty universal ship turn nerf
				if(type.epicShip)
					steeringScale=0.4f* 0.1F * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier);
				
				float effectiveWheelSpeed = ((wheelsYaw * steeringScale)) * velocityScale;
				yaw = axes.getYaw()/180F*3.14159F + (effectiveWheelSpeed);
			} else {
				float velocityScale = 0.1F * throttle * (throttle > 0 ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed;
				float steeringScale = 0.1F * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier);
				//shitty universal ship turn nerf
				if(type.epicShip)
					steeringScale=0.4f* 0.1F * (wheelsYaw > 0 ? type.turnLeftModifier : type.turnRightModifier);
				
				float effectiveWheelSpeed = ((wheelsYaw * steeringScale)) * velocityScale;
				yaw = axes.getYaw()/180F*3.14159F + (effectiveWheelSpeed);
			}

			axes.setAngles(yaw * 180F / 3.14159F, pitch * 180F / 3.14159F, roll * 180F / 3.14159F);
		}

    	if(this.ridingEntity != null)
    	{
    		if(this.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0)
    		{
    			axes.setAngles(this.ridingEntity.rotationYaw+90, 0, 0);
    		}
    	}

		checkForCollisions();

		//Sounds
		//Starting sound
		if (Math.abs(throttle) > 0.01F && Math.abs(throttle) < 0.2F && soundPosition == 0 && hasEnoughFuel())
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.startSoundRange, dimension, type.startSound, false);
			soundPosition = type.startSoundLength;
		}
		//Flying sound
		if (throttle >= 0.2F && soundPosition == 0 && hasEnoughFuel())
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.engineSoundRange, dimension, type.engineSound, false);
			soundPosition = type.engineSoundLength;
		}
		if(seats[0] != null){
		if(throttle <= 0.01F && throttle >= -0.2F && seats[0].riddenByEntity != null && idlePosition == 0)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.engineSoundRange, dimension, type.idleSound, false);	
			idlePosition = type.idleSoundLength;
		}
		}
		//Back sound
		if (throttle <= -0.2F && soundPosition == 0 && hasEnoughFuel())
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.backSoundRange, dimension, type.backSound, false);
			soundPosition = type.backSoundLength;
		}

		for(EntitySeat seat : seats)
		{
			if(seat != null)
			{
				seat.updatePosition();
	        }	
		}

		//Calculate movement on the client and then send position, rotation etc to the server
		if(thePlayerIsDrivingThis)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketVehicleControl(this));
			serverPosX = posX;
			serverPosY = posY;
			serverPosZ = posZ;
			serverYaw = axes.getYaw();
			//if(type.IT1)
			//FlansMod.getPacketHandler().sendToServer(new PacketIT1Reload(this));
		}

		//If this is the server, send position updates to everyone, having received them from the driver
		if(!worldObj.isRemote && ticksExisted % 5 == 0)
		{
			FlansMod.getPacketHandler().sendToAllAround(new PacketVehicleControl(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
			//if(type.IT1)
			//FlansMod.getPacketHandler().sendToAllAround(new PacketIT1Reload(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);

		}

		int animSpeed = 4;

		if((throttle > 0.05 && throttle <= 0.33) || (throttle < -0.05 && throttle >= -0.33)){
			animSpeed = 3;
		} else if((throttle > 0.33 && throttle <= 0.66) || (throttle < -0.33 && throttle >= -0.66)){
			animSpeed = 2;
		} else if((throttle > 0.66 && throttle <= 0.9) || (throttle < -0.66 && throttle >= -0.9)){
			animSpeed = 1;
		} else if((throttle > 0.9 && throttle <= 1) || (throttle < -0.9 && throttle >= -1)){
			animSpeed = 0;
		}
		
		boolean turningLeft = false;
		boolean turningRight = false;

		if(throttle > 0.05){
			animCountLeft --;
			animCountRight --;
		} else if (throttle < -0.05){
			animCountLeft ++;
			animCountRight ++;
		} else if (wheelsYaw < -1){
			turningLeft = true;
			animCountLeft ++;
			animCountRight --;
			animSpeed = 1;
			if (soundPosition == 0 && hasEnoughFuel() && type.tank)
			{
				PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.engineSoundRange, dimension, type.engineSound, false);
				soundPosition = type.engineSoundLength;
			}
		} else if(wheelsYaw > 1){
			turningRight = true;
			animCountLeft --;
			animCountRight ++;
			animSpeed = 1;
			if (soundPosition == 0 && hasEnoughFuel() && type.tank)
			{
				PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.engineSoundRange, dimension, type.engineSound, false);
				soundPosition = type.engineSoundLength;
			}
		}else {
			turningLeft = false;
			turningRight = false;
		}

		if(animCountLeft <= 0){
			animCountLeft = animSpeed;
			animFrameLeft ++;
		}
		
		if(animCountRight <= 0){
			animCountRight = animSpeed;
			animFrameRight ++;
		}

		if(throttle < 0 || turningLeft){
			if(animCountLeft >= animSpeed){
				animCountLeft = 0;
	        	animFrameLeft --;
			}
		}
		
		if(throttle < 0 || turningRight){
			if(animCountRight >= animSpeed){
				animCountRight = 0;
	        	animFrameRight --;
			}
		}

		if(animFrameLeft > type.animFrames){
			animFrameLeft = 0;
		} if(animFrameLeft < 0){
			animFrameLeft = type.animFrames;
		}
		
		if(animFrameRight > type.animFrames){
			animFrameRight = 0;
		} if(animFrameRight < 0){
			animFrameRight = type.animFrames;
		}
		
        //rotateYaw(10);
    }
    
    
    
    
    private void interrupt(float f) {
		// TODO Auto-generated method stub
		
	}

	public void animateFancyTracks()
    {
    	float funkypart = getVehicleType().trackLinkFix;
    	boolean funk = true;
    	float funk2 = 0;
        for(int i = 0; i < trackLinksLeft.length; i++)
        {
        	trackLinksLeft[i].prevPosition = trackLinksLeft[i].position;
        	trackLinksLeft[i].prevZRot = trackLinksLeft[i].zRot;
        	float speed = throttle*1.5F - (wheelsYaw/12);
        	trackLinksLeft[i].progress += speed;
    		if(trackLinksLeft[i].progress > leftTrack.getTrackLength()) trackLinksLeft[i].progress -= leftTrack.getTrackLength();
    		if(trackLinksLeft[i].progress < 0) trackLinksLeft[i].progress += leftTrack.getTrackLength();
        	trackLinksLeft[i].position = leftTrack.getPositionOnTrack(trackLinksLeft[i].progress);
			for(; trackLinksLeft[i].zRot > 180F; trackLinksLeft[i].zRot -= 360F) {}
			for(; trackLinksLeft[i].zRot <= -180F; trackLinksLeft[i].zRot += 360F) {}
			float newAngle = rotateTowards(leftTrack.points.get(leftTrack.getTrackPart(trackLinksLeft[i].progress)), trackLinksLeft[i].position);			
			int part = leftTrack.getTrackPart(trackLinksLeft[i].progress);
			if(funk) funk2 = (speed < 0)?0:1;
			else funk2 = (speed < 0)?-1:0;
        	trackLinksLeft[i].zRot = Lerp(trackLinksLeft[i].zRot, newAngle, (part != (funkypart + funk2))?0.5F:1);

        }
        
        for(int i = 0; i < trackLinksRight.length; i++)
        {
        	trackLinksRight[i].prevPosition = trackLinksRight[i].position;
        	trackLinksRight[i].prevZRot = trackLinksRight[i].zRot;
        	float speed = throttle*1.5F + (wheelsYaw/12);
        	trackLinksRight[i].progress += speed;
    		if(trackLinksRight[i].progress > rightTrack.getTrackLength()) trackLinksRight[i].progress -= leftTrack.getTrackLength();
    		if(trackLinksRight[i].progress < 0) trackLinksRight[i].progress += rightTrack.getTrackLength();    		
        	trackLinksRight[i].position = rightTrack.getPositionOnTrack(trackLinksRight[i].progress);
			float newAngle = rotateTowards(rightTrack.points.get(rightTrack.getTrackPart(trackLinksRight[i].progress)), trackLinksRight[i].position);
			int part = rightTrack.getTrackPart(trackLinksRight[i].progress);
			if(funk) funk2 = (speed < 0)?0:1;
			else funk2 = (speed < 0)?-1:0;
        	trackLinksRight[i].zRot = Lerp(trackLinksRight[i].zRot, newAngle, (part != (funkypart + funk2))?0.5F:1);
        }
    }
    
    public float rotateTowards(Vector3f point, Vector3f original)
    {
    	
    	float angle = (float)Math.atan2(point.y - original.y, point.x - original.x);
    	return angle;
    }
    
    
    
    
    public void dischargeSmoke()
    {
    	VehicleType type = this.getVehicleType();
        for(int i = 0; i < type.smokers.size(); i++)
        {
        	SmokePoint smoker = type.smokers.get(i);
        	Vector3f dir = smoker.direction;
        	Vector3f pos = smoker.position;
        	int time = smoker.detTime;
        	
    		dir = axes.findLocalVectorGlobally(dir);
    		pos = axes.findLocalVectorGlobally(pos);
        	
        	if(EnumDriveablePart.getPart(smoker.part) == EnumDriveablePart.turret)
        	{
        		dir = rotate(seats[0].looking.findLocalVectorGlobally(smoker.direction));
            	pos = getPositionOnTurret(smoker.position, false);
        	}
        	
			//FlansMod.getPacketHandler().sendToAllAround(new PacketSmokeGrenade(posX + pos.x/16, posY + pos.y/16, posZ + pos.z/16, dir.x, dir.y, dir.z, time), posX, posY, posZ, 150, dimension);
    	
        	//FlansMod.proxy.spawnSmokeGrenade("flansmod.smoker", posX + pos.x/16, posY + pos.y/16, posZ + pos.z/16, dir.x, dir.y, dir.z, time);
        	
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.smoker",posX + pos.x/16, posY + pos.y/16, posZ + pos.z/16, dir.x, dir.y, dir.z), posX, posY, posZ, 150, dimension);
        }
    }
    
    
    public void dischargeAPS()
    {
    	VehicleType type = this.getVehicleType();
        for(int i = 0; i < type.smokers.size(); i++)
        {
        	SmokePoint smoker = type.smokers.get(i);
        	Vector3f dir = smoker.direction;
        	Vector3f pos = smoker.position;
        	int time = smoker.detTime;
        	
    		dir = axes.findLocalVectorGlobally(dir);
    		pos = axes.findLocalVectorGlobally(pos);
        	
        	if(EnumDriveablePart.getPart(smoker.part) == EnumDriveablePart.turret)
        	{
        		dir = rotate(seats[0].looking.findLocalVectorGlobally(smoker.direction));
            	pos = getPositionOnTurret(smoker.position, false);
        	}
        	
			//FlansMod.getPacketHandler().sendToAllAround(new PacketSmokeGrenade(posX + pos.x/16, posY + pos.y/16, posZ + pos.z/16, dir.x, dir.y, dir.z, time), posX, posY, posZ, 150, dimension);
    	
        	//FlansMod.proxy.spawnSmokeGrenade("flansmod.smoker", posX + pos.x/16, posY + pos.y/16, posZ + pos.z/16, dir.x, dir.y, dir.z, time);
        	
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.smokeburst",posX + pos.x/10, posY + pos.y/10, posZ + pos.z/10, dir.x, dir.y, dir.z), posX, posY, posZ, 150, dimension);
        }
    }


    public float Lerp(float start, float end, float percent)
    {
         float result = (start + percent*(end - start));
         
         return result;
    }
    
    public static float Clamp(float val, float min, float max) {
        return Math.max(min, Math.min(max, val));
    }
    
	public List<Entity> findEntitiesWithinbounds(){
    	VehicleType type = this.getVehicleType();
    	AxisAlignedBB initialBox = this.boundingBox.copy();
    	List<Entity> riddenEntities = worldObj.getEntitiesWithinAABB(Entity.class, initialBox);
    	
		Vector3f size = new Vector3f(type.harvestBoxSize.x/8F, type.harvestBoxSize.y/8F, type.harvestBoxSize.z/8F);
		Vector3f pos = new Vector3f(type.harvestBoxPos.x/8F, type.harvestBoxPos.y/8F, type.harvestBoxPos.z/8F);
		for(float x = pos.x; x <= pos.x + size.x; x++)
		{
			for(float y = pos.y; y <= pos.y + size.y; y++)
			{
				for(float z = pos.z; z <= pos.z + size.z; z++)
				{
					Vector3f v = axes.findLocalVectorGlobally(new Vector3f(x, y, z));

					double entX = (posX + v.x);
					double entY = (posY + v.y);
					double entZ = (posZ + v.z);
					AxisAlignedBB checkBox = this.boundingBox.copy().offset(v.x, v.y, v.z);
					
					List<Entity> entityhere = worldObj.getEntitiesWithinAABB(Entity.class, checkBox);
					
					for(int i = 0; i < entityhere.size(); i++)
					{
						if(entityhere.get(i) instanceof EntityLivingBase) riddenEntities.add(entityhere.get(i));
					}
					//Iterator<Entity> iter = entityhere.iterator();
					/**
					while( iter.hasNext() )
					{
						Entity entity = iter.next();
						if(isPartOfThis(entity)) iter.remove();
						if(entity instanceof EntityBullet) iter.remove();
					} */

				}
			}
		}
    	return riddenEntities;
    }
    
	public Vector3f transformPart(Vector3f current, Vector3f target, Vector3f rate){
		Vector3f newPos = current;
		
		if(Math.sqrt((current.x - target.x)*(current.x - target.x)) > rate.x/2){
			if(current.x > target.x){
				current.x = current.x - rate.x;
			} else if (current.x < target.x){
				current.x = current.x + rate.x;
			}
		} else {
			current.x = target.x;
		}
		
		if(Math.sqrt((current.y - target.y)*(current.y - target.y)) > rate.y/2){
			if(current.y > target.y){
				current.y = current.y - rate.y;
			} else if (current.y < target.y){
				current.y = current.y + rate.y;
			}
		} else {
			current.y = target.y;
		}
		
		if(Math.sqrt((current.z - target.z)*(current.z - target.z)) > rate.z/2){
			if(current.z > target.z){
				current.z = current.z - rate.z;
			} else if (current.z < target.z){
				current.z = current.z + rate.z;
			}
		} else {
			current.z = target.z;
		}

		return newPos;
	}


	
	
	
	@Override
	protected void fall(float k)
	{
		if (k <= 20) return;
		float damage = MathHelper.ceiling_float_int(k) * 2;

		boolean no_damage = true;
		if (damage > 0 && invulnerableUnmountCount == 0 && this.ticksExisted > 20)
		{
			DriveableType type = getDriveableType();
			damage = (int)(damage * type.fallDamageFactor)*0.25f;  //further nerf to 0.25
			//attackPart(EnumDriveablePart.core, DamageSource.fall, damage);
			(getDriveableData().parts.get(EnumDriveablePart.core).health)=(getDriveableData().parts.get(EnumDriveablePart.core).health)-((int)damage+1);
			if (type.wheelPositions.length > 0)
			{
				attackPart(type.wheelPositions[0].part, DamageSource.fall, damage / 5);
			}

			no_damage = false;
		}
	//	FlansMod.log("fall%s : tick=%d damage=%.1f", no_damage? " no damage":"", this.ticksExisted, damage);
	}

    private float averageAngles(float a, float b)
    {
    	FlansMod.log("Pre  " + a + " " + b);

    	float pi = (float)Math.PI;
    	for(; a > b + pi; a -= 2 * pi) ;
    	for(; a < b - pi; a += 2 * pi) ;

    	float avg = (a + b) / 2F;

    	for(; avg > pi; avg -= 2 * pi) ;
    	for(; avg < -pi; avg += 2 * pi) ;

    	FlansMod.log("Post " + a + " " + b + " " + avg);

    	return avg;
    }

	private Vec3 subtract(Vec3 a, Vec3 b)
	{
		return Vec3.createVectorHelper(a.xCoord - b.xCoord, a.yCoord - b.yCoord, a.zCoord - b.zCoord);
	}

	private Vec3 crossProduct(Vec3 a, Vec3 b)
	{
        return Vec3.createVectorHelper(a.yCoord * b.zCoord - a.zCoord * b.yCoord, a.zCoord * b.xCoord - a.xCoord * b.zCoord, a.xCoord * b.yCoord - a.yCoord * b.xCoord);
	}

    @Override
    public boolean landVehicle()
    {
    	return true;
    }

    @Override
    public boolean attackEntityFrom(DamageSource damagesource, float i)
    {
        VehicleType type = getVehicleType();
	   //	   accidental explosion immunity if the !explosion not in    if(worldObj.isRemote || isDead || !(seats[0] == null || seats[0].riddenByEntity == null))
	     if(worldObj.isRemote || isDead || damagesource.damageType.equals("onFire") || damagesource.damageType.equals("inFire") || damagesource.damageType.equals("lava") || damagesource.damageType.equals("arrow")||damagesource.damageType.equals("arrow")|| !type.vanillaDamage && damagesource.damageType.equals("player") && !(seats[0] == null || seats[0].riddenByEntity == null))
            return true;
//if(!type.vanillaDamage && (damagesource.damageType.equals("arrow") || damagesource.damageType.equals("thrown") || damagesource.damageType.equals("indirectMagic")|| damagesource.damageType.equals("player")|| damagesource.damageType.equals("fireball")|| damagesource.damageType.equals("mob")|| damagesource.damageType.equals("indirectMagic")) )


		if(damagesource.damageType.equals("player") && damagesource.getEntity().onGround && (seats[0] == null || seats[0].riddenByEntity == null) && !locked && !type.unpunchable)
		{
			ItemStack vehicleStack = new ItemStack(type.item, 1, 0);
			vehicleStack.stackTagCompound = new NBTTagCompound();
			driveableData.writeToNBT(vehicleStack.stackTagCompound);
			entityDropItem(vehicleStack, 0.5F);
	 		setDead();
		}
		
		float poopoo = 1f;
		
		if (damagesource.damageType.equals("explosion"))
		poopoo = type.explosionResistance;
		//for mrap explosion resistance

        return super.attackEntityFrom(damagesource, i * poopoo);
    }

	public VehicleType getVehicleType()
	{
		return VehicleType.getVehicle(driveableType);
	}

	@Override
	public float getPlayerRoll()
	{
		return axes.getRoll();
	}
	
	public float getAvgWheelSpeedXYZ()
	{
		float speed = (float)(wheels[0].getSpeedXYZ() + wheels[1].getSpeedXYZ() + wheels[2].getSpeedXYZ() + wheels[3].getSpeedXYZ())/4;
		
		return speed;
	}
	
	public void Recoil()
	{
		
	}

	@Override
	protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part)
	{
	}

	@Override
	public String getBombInventoryName()
	{
		return "Mines";
	}

	@Override
	public String getMissileInventoryName()
	{
		return "Shells";
	}

	@Override
	public boolean hasMouseControlMode()
	{
		return false;
	}

	
	/*
	@Override
	@SideOnly(Side.CLIENT)
	public EntityLivingBase getCamera()
	{
		return null;
	}
	*/
	
	public boolean hasBothTracks()
	{
		boolean tracks = true;
		if(!isPartIntact(EnumDriveablePart.leftTrack))
		{
			tracks = false;
		}
		
		if(!isPartIntact(EnumDriveablePart.rightTrack))
		{
			tracks = false;
		}

		return tracks;
	}

	@Override
	public void setDead()
	{
		super.setDead();
		for(EntityWheel wheel : wheels)
			if(wheel != null)
				wheel.setDead();
	}
}