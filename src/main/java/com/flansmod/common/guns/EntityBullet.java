package com.flansmod.common.guns;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderHandEvent;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.raytracing.BlockHit;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.guns.raytracing.EntityHit;
import com.flansmod.common.guns.raytracing.EnumHitboxType;
import com.flansmod.common.guns.raytracing.PlayerBulletHit;
import com.flansmod.common.guns.raytracing.PlayerHitbox;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityBullet extends EntityShootable implements IEntityAdditionalSpawnData
{
	private static int bulletLife = 600; //Kill bullets after 30 seconds
	public Entity owner;
	private int ticksInAir;
	public BulletType type;
	/** What type of weapon did this come from? For death messages */
	public InfoType firedFrom;
	/** The amount of damage the gun imparted upon the bullet. Multiplied by the bullet damage to get total damage */
	public float damage;
	public boolean shotgun = false;
	/** If this is non-zero, then the player raytrace code will look back in time to when the player thinks their bullet should have hit */
	public int pingOfShooter = 0;
	/** Avoids the fact that using the entity random to calculate spread direction always results in the same direction */
	public static Random bulletRandom = new Random();
	/** Stop repeat detonations */
	public boolean detonated = false;
	/** For homing missiles */
	public Entity lockedOnTo;
	//public double distanceToEntity = 0;
	public double prevDistanceToEntity = 0;
	public int cnt;
	//public Vector3f firstVector = new Vector3f(motionX, motionY, motionZ);
	public boolean toggleLock = false;
	//public Vector3f prevPos;
	public double lockedOnToSpeed = 0;
	public double thisSpeed = 0;
	public int closeCount = 0;
	public int soundTime = 0;
	public float speedA;
    public float truePen;
	public int impactX;
	public int impactY;
	public int impactZ;
	public boolean isHEAT;
	public boolean isSword = false;
	public static int bulletDragCoeficient = 14539;
	

	
	public int bulletSmokeTime = 5;
	//for one time hitting water particle
	public boolean cringed = false;
	public boolean CIWSable = false;
	public boolean CIWSer = false;

	public boolean isFirstPositionSetting = false;
	public boolean isPositionUpper = true;

	public static boolean hitCrossHair;

	public float penetratingPower;
	

	public int submunitionDelay = 20;
	public boolean hasSetSubDelay = false;
	
	public boolean hasSetVLSDelay = false;
	public int VLSDelay = 0;
	
	public Vector3f lookVector;
	public Vector3f initialPos;
	public boolean hasSetLook = false;
	//labjac radar shoehorn declaration
	public boolean entityMissileRadarVisible = false;
	
	//for dynamic changeable fuse
	public int secretFuse = 0;
	
	//blocking system TM
	public boolean rightSwing = true;
	public boolean leftSwing = false;
	public boolean topSwing = false;
	public boolean bottomSwing = false;
	
	//stealing from grenades -t labjac
		public boolean stuck = false;
		public int stuckToX, stuckToY, stuckToZ;
		public RotatedAxes axes = new RotatedAxes();
		public float prevRotationRoll = 0F;
		public Vector3f angularVelocity = new Vector3f(0F, 0F, 0F);

	
	//for bullets near but miss player
	public String missNoise = "bulletFlyby";
	
	//for labcat bob radar
	public boolean radarVisible = false;
	
	

	
	

	public EntityBullet(World world)
	{
		super(world);
		ticksInAir = 0;
		setSize(0.5F, 0.5F);
	}

	/** Private partial constructor to avoid repeated code. All constructors go through this one */
	public EntityBullet(World world, EntityLivingBase shooter, float gunDamage, BulletType bulletType, InfoType shotFrom)
	{
		this(world);
		owner = shooter;
		if(shooter instanceof EntityPlayerMP)
		pingOfShooter = ((EntityPlayerMP)shooter).ping;
		type = bulletType;
		firedFrom = shotFrom;
		damage = gunDamage;
		penetratingPower = type.penetratingPower;
		setSize(bulletType.hitBoxSize, bulletType.hitBoxSize);

	}

	/* before i fucked with it by adding origin offset numbers
	public EntityBullet(World world, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, boolean shot, InfoType shotFrom)
	{
		this(world, Vec3.createVectorHelper(shooter.posX, shooter.posY + shooter.getEyeHeight(), shooter.posZ), shooter.rotationYaw, shooter.rotationPitch, shooter, spread, gunDamage, type1, speed, shotFrom);
		shotgun = shot;
	}
	*/
	
	/** Method called by ItemGun for creating bullets from a hand held weapon */
	public EntityBullet(World world, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, boolean shot, InfoType shotFrom, float Xoffset, float Yoffset, float Zoffset)
	{
		this(world, Vec3.createVectorHelper((shooter.posX - MathHelper.cos((shooter.rotationYaw / 180F) * 3.14159265F)*Zoffset - MathHelper.cos((shooter.rotationPitch / 180F) * 3.14159265F)*MathHelper.sin((shooter.rotationYaw / 180F) * 3.14159265F)*Xoffset), (shooter.posY + Yoffset + shooter.getEyeHeight() - MathHelper.sin((shooter.rotationPitch / 180F) * 3.14159265F)*Xoffset), (shooter.posZ + MathHelper.cos((shooter.rotationPitch / 180F) * 3.14159265F)*MathHelper.cos((shooter.rotationYaw / 180F) * 3.14159265F)*Xoffset - MathHelper.sin((shooter.rotationYaw / 180F) * 3.14159265F)*Zoffset)), shooter.rotationYaw, shooter.rotationPitch, shooter, spread, gunDamage, type1, speed, shotFrom);
		shotgun = shot;
	}

	/** Machinegun / AAGun bullet constructor */
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, InfoType shotFrom)
	{
		this(world, origin, yaw, pitch, shooter, spread, gunDamage, type1, 3.0F, shotFrom);
	}

	/** More generalised bullet constructor */
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom)
	{
		this(world, shooter, gunDamage, type1, shotFrom);
		setLocationAndAngles(origin.xCoord, origin.yCoord, origin.zCoord, yaw, pitch);
		setPosition(posX, posY, posZ);
		yOffset = 0.0F;
		motionX = -MathHelper.sin((rotationYaw / 180F) * 3.14159265F) * MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
		motionZ = MathHelper.cos((rotationYaw / 180F) * 3.14159265F) * MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
		motionY = -MathHelper.sin((rotationPitch / 180F) * 3.141593F);
		setArrowHeading(motionX, motionY, motionZ, spread / 2F, speed);
	}

	/**  */
	public EntityBullet(World world, Vector3f origin, Vector3f direction, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom)
	{
		this(world, shooter, gunDamage, type1, shotFrom);
		damage = gunDamage;
		setPosition(origin.x, origin.y, origin.z);
		motionX = direction.x;
		motionY = direction.y;
		motionZ = direction.z;
		setArrowHeading(motionX, motionY, motionZ, spread, speed);
	}

	/** Bomb constructor. Inherits the motion and rotation of the plane */
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, double motX, double motY, double motZ, EntityLivingBase shooter, float gunDamage, BulletType type1, InfoType shotFrom)
	{
		this(world, shooter, gunDamage, type1, shotFrom);
		setLocationAndAngles(origin.xCoord, origin.yCoord, origin.zCoord, yaw, pitch);
		setPosition(posX, posY, posZ);
		yOffset = 0.0F;
		motionX = motX;
		motionY = motY;
		motionZ = motZ;
	}

	@Override
	protected void entityInit()
	{
	}
	
	

	public void setArrowHeading(double d, double d1, double d2, float spread, float speed)
	{
		float f2 = MathHelper.sqrt_double(d * d + d1 * d1 + d2 * d2);
		d /= f2;
		d1 /= f2;
		d2 /= f2;
		d *= speed;
		d1 *= speed;
		d2 *= speed;
		d += rand.nextGaussian() * 0.005D * spread * speed;
		d1 += rand.nextGaussian() * 0.005D * spread * speed;
		d2 += rand.nextGaussian() * 0.005D * spread * speed;
		motionX = d;
		motionY = d1;
		motionZ = d2;
		float f3 = MathHelper.sqrt_double(d * d + d2 * d2);
		prevRotationYaw = rotationYaw = (float) ((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
		prevRotationPitch = rotationPitch = (float) ((Math.atan2(d1, f3) * 180D) / 3.1415927410125732D);

		getLockOnTarget();
	}

	
	//locking on to target code! -allah bookmark
	/** Find the entity nearest to the missile's trajectory, anglewise */
	private void getLockOnTarget()
	{
		if(type.lockOnToPlanes || type.lockOnToVehicles || type.lockOnToMechas || type.lockOnToLivings || type.lockOnToPlayers)
		{
			radarVisible = true;
			Vector3f motionVec = new Vector3f(motionX, motionY, motionZ);
			float storedPitch = motionVec.getY();
			Entity closestEntity = null;
			float closestAngle = type.maxLockOnAngle * 3.14159265F / 180F;
			for(Object obj : worldObj.loadedEntityList)
			{
				Entity entity = (Entity)obj;
				String etype = entity.getEntityData().getString("EntityType");
				if( (type.lockOnToMechas	&& entity instanceof EntityMecha)	||
					(type.lockOnToVehicles	&& entity instanceof EntityVehicle) ||
					(type.lockOnToVehicles	&& etype.equals("Vehicle"))			|| // for vehicle of other Mod
					(type.lockOnToPlanes	&& entity instanceof EntityPlane)	||
					(type.lockOnToPlanes	&& etype.equals("Plane"))			|| // for plane of other Mod
					(type.lockOnToPlayers	&& entity instanceof EntityPlayer)	||
					(type.lockOnToLivings	&& entity instanceof EntityLivingBase))
				{
					
					
					Vector3f relPosVec = new Vector3f(entity.posX - posX, entity.posY - posY, entity.posZ - posZ);
					//if sword energy dont rotate pitch to prevent lock on to feet
					float angle = Math.abs(Vector3f.angle(motionVec, relPosVec));
					
					if(angle < closestAngle && Math.abs(entity.posX - posX)<type.seekerRange && Math.abs(entity.posY - posY)<type.seekerRange && Math.abs(entity.posZ - posZ)<type.seekerRange)
					{
						closestEntity = entity;
						closestAngle = angle;
					}
				}
			}

			if(closestEntity != null && !type.modernTorpedo || closestEntity != null && type.modernTorpedo && isInWater())
				lockedOnTo = closestEntity;
		}
	}

	@Override
	public void setVelocity(double d, double d1, double d2)
	{
		motionX = d;
		motionY = d1;
		motionZ = d2;
		if (prevRotationPitch == 0.0F && prevRotationYaw == 0.0F)
		{
			float f = MathHelper.sqrt_double(d * d + d2 * d2);
			prevRotationYaw = rotationYaw = (float) ((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
			prevRotationPitch = rotationPitch = (float) ((Math.atan2(d1, f) * 180D) / 3.1415927410125732D);
			setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
		}
		
		
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();

		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
		if(type==null)
		{
			FlansMod.log("EntityBullet.onUpdate() Error: BulletType is null ("+this+")");
			setDead();
			return;
		}


		if(type.despawnTime > 0 && ticksExisted > type.despawnTime)
		{
			detonated = true;
			setDead();
			return;
		}
		
		truePen = type.armorPen;
		
		isHEAT = type.HEAT;
		
		isSword = type.swordEnergy;
		
		
		missNoise = type.missNoise;
		
		//for testing
		if(type.swordEnergy)
		{
		rightSwing = true;
		System.out.println("right swing");
		}
		
		
		//camera test failure
	//	Minecraft.getMinecraft().renderViewEntity = (EntityLivingBase)this;
		
		//if(this.ticksExisted == 1)
			//secretFuse = type.fuse;
		
		if(this.ticksExisted == 1)
			bulletSmokeTime = type.bulletSmokeTime;
		
		
		
		//if pen decays to half of normal value, then stop decaying
		if((truePen) > 2 && (truePen > 0.5*type.armorPen))
        truePen = truePen - ticksExisted*(type.penDecay);
		
        if(type.armorPen > 2 && truePen < 2)
        	truePen = 2;


		if(!hasSetSubDelay && type.hasSubmunitions)
		{
			setSubmunitionDelay();
		} else if(type.hasSubmunitions){
			submunitionDelay --;
		}
		
		if(!hasSetVLSDelay && type.VLS)
		{
			VLSDelay = type.VLSTime;
			hasSetVLSDelay = true;
		}
		
		if(VLSDelay > 0)
			VLSDelay--;
		
		if(!hasSetLook && owner != null)
		{
			lookVector = new Vector3f((float)owner.getLookVec().xCoord, (float)owner.getLookVec().yCoord,(float)owner.getLookVec().zCoord);
			initialPos = new Vector3f(owner.posX, owner.posY, owner.posZ);
			hasSetLook = true;
		}
		
		

		if(soundTime > 0)
			soundTime--;

		if(owner != null)
		{
			double rangeX = owner.posX - this.posX;
			double rangeY = owner.posY - this.posY;
			double rangeZ = owner.posZ - this.posZ;
			double range = Math.sqrt((rangeX * rangeX) + (rangeY * rangeY) + (rangeZ * rangeZ));

			if(type.maxRange != -1 && type.maxRange < range)
			{
				if(ticksExisted > type.fuse && type.fuse > 0)
				{
					if(type.flak > 0)
						FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
				
					detonate();
				}
				setDead();
			}
		}
		else
		{
			this.setDead();
		}


		//Check the fuse to see if the bullet should explode
		ticksInAir++;
		if (ticksInAir > type.fuse && type.fuse > 0 && !isDead)
		{
			if(type.flak > 0)
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
		
			setDead();
		}

		if(ticksExisted > bulletLife)
		{
			if(type.flak > 0)
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
		
			setDead();
		}

		if(isDead)
			return;

//Detonation conditions
		if(!worldObj.isRemote)
		{
			if(ticksExisted > type.fuse && type.fuse > 0)
			{
		
				if(type.flak > 0)
					FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
			
				detonate();
		}
			
			//If this grenade has a proximity trigger, check for living entities within it's range
			if(type.livingProximityTrigger > 0 || type.driveableProximityTrigger > 0)
			{
				float checkRadius = Math.max(type.livingProximityTrigger, type.driveableProximityTrigger);
				List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(checkRadius, checkRadius, checkRadius));
				for(Object obj : list)
				{
					if(obj == owner && ticksExisted < 10)
						continue;
					if(obj instanceof EntityLivingBase && getDistanceToEntity((Entity)obj) < type.livingProximityTrigger)
					{
						//If we are in a gametype and both thrower and triggerer are playing, check for friendly fire allah
						if(TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && obj instanceof EntityPlayerMP && owner instanceof EntityPlayer)
						{
							if(!TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)obj, new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)owner, type, false)))
								continue;
						}
						if(type.damageToTriggerer > 0)
							((EntityLivingBase)obj).attackEntityFrom(getBulletDamage(false), type.damageToTriggerer);
						FlansMod.proxy.spawnParticle("redstone", posX, posY, posZ, 0,0,0);

						detonate();
						break;
					}
					if(obj instanceof EntityDriveable && getDistanceToEntity((Entity)obj) < type.driveableProximityTrigger)
					{
						/**
						if(TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && ((EntityDriveable)obj).seats[0].riddenByEntity instanceof EntityPlayerMP && owner instanceof EntityPlayer)
						{
							EntityPlayerMP player = (EntityPlayerMP)((EntityDriveable)obj).seats[0].riddenByEntity;
							if(!TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)obj, new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)owner, type, false)))
								continue;
						}
						*/
						if(type.damageToTriggerer > 0)
							((EntityDriveable)obj).attackEntityFrom(getBulletDamage(false), type.damageToTriggerer);
						detonate();
						break;
					}
				}
			}
		}
		
		
		//Create a list for all bullet hits
		ArrayList<BulletHit> hits = new ArrayList<BulletHit>();

		Vector3f origin = new Vector3f(posX, posY, posZ);
		Vector3f motion = new Vector3f(motionX, motionY, motionZ);
		float hitBoxSize = type.hitBoxSize >= 0? type.hitBoxSize: 0;

		float speed = motion.length();

		speedA = speed;

		if(type.hasSubmunitions)
		{
			//hesh bullets ignore submunitiondelay since activated by hitting blocks
			if(this.ticksExisted > submunitionDelay  && !type.Hesh || submunitionDelay < 0  && !type.Hesh && type.angel)
			{
				DeploySubmunitions();
				submunitionDelay = 9001;
			}
		}

		//Iterate over all entities
		for(int i = 0; i < worldObj.loadedEntityList.size(); i++)
		{
			Object obj = worldObj.loadedEntityList.get(i);
			//Get driveables
			if(obj instanceof EntityDriveable)
			{
				EntityDriveable driveable = (EntityDriveable)obj;

				if(driveable.isDead() || driveable.isPartOfThis(owner))
					continue;

				//If this bullet is within the driveable's detection range
				if(getDistanceToEntity(driveable) <= driveable.getDriveableType().bulletDetectionRadius + speed)
					//if(Math.abs(getDistanceToEntity(driveable)) <= 2*speed)
				{
					//Raytrace the bullet
					if(driveable.getDriveableType().autisticHitDetection)
					{
					ArrayList<BulletHit> driveableHits = driveable.attackFromBullet(origin, motion);
					hits.addAll(driveableHits);
					}
					//shoehorn in classic hit detection jamiostyle
					if(!driveable.getDriveableType().autisticHitDetection)
					{
					ArrayList<BulletHit> driveableHiterinos = driveable.attackFromBulletClassic(origin, motion);
					hits.addAll(driveableHiterinos);
					}
					
				}

			}
			//Get players
			else if(obj instanceof EntityPlayer)
			{
				EntityPlayer player = (EntityPlayer)obj;
				PlayerData data = PlayerHandler.getPlayerData(player);
				boolean shouldDoNormalHitDetect = false;
				if(data != null)
				{
					if(player.isDead || data.team == Team.spectators)
					{
						continue;
					}
					if(player == owner && ticksInAir < 20)
						continue;
					int snapshotToTry = TeamsManager.bulletSnapshotMin;
					if(TeamsManager.bulletSnapshotDivisor > 0)
					{
						snapshotToTry += pingOfShooter / TeamsManager.bulletSnapshotDivisor;
					}
					if(snapshotToTry >= data.snapshots.length)
						snapshotToTry = data.snapshots.length - 1;
					
					//bobs fix
					if(snapshotToTry < 0) {
					    snapshotToTry = 0;
					}
					
					//the line that allegedly broke
					PlayerSnapshot snapshot;
					if(data.snapshots[snapshotToTry] != null){
						snapshot = data.snapshots[snapshotToTry];
					} else {
						snapshot = data.snapshots[0];
					}

					//DEBUG
					//snapshot = new PlayerSnapshot(player);

					//Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
					if(snapshot == null)
						shouldDoNormalHitDetect = true;
					else
					{
						//Raytrace
						ArrayList<BulletHit> playerHits = snapshot.raytrace(origin, motion);
						hits.addAll(playerHits);
					}
				}

				//If we couldn't get a snapshot, use normal entity hitbox calculations
				if(data == null || shouldDoNormalHitDetect)
				{
					MovingObjectPosition mop = player.boundingBox.expand(hitBoxSize, hitBoxSize, hitBoxSize).calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ));
					if(mop != null)
					{
						Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - posX, mop.hitVec.yCoord - posY, mop.hitVec.zCoord - posZ);
						float hitLambda = 1F;
						if(motion.x != 0F)
							hitLambda = hitPoint.x / motion.x;
						else if(motion.y != 0F)
							hitLambda = hitPoint.y / motion.y;
						else if(motion.z != 0F)
							hitLambda = hitPoint.z / motion.z;
						if(hitLambda < 0)
							hitLambda = -hitLambda;

						hits.add(new PlayerBulletHit(new PlayerHitbox(player, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
					}
				}
			}
			else
			{
				Entity entity = (Entity)obj;
				if(entity != this && entity != owner && !entity.isDead && !(entity instanceof EntityItem) && !(entity instanceof EntityXPOrb) && !(entity instanceof EntityArrow) &&
						(entity.getClass().toString().indexOf("flansmod.") < 0  || entity instanceof EntityAAGun || entity instanceof EntityGrenade) ||  entity instanceof EntityBullet && type.CIWSable==true && !((EntityBullet)entity).ciwsCheck() && !((EntityBullet)entity).ciwserCheck()) 
				{
					AxisAlignedBB bb = entity.boundingBox.addCoord(
							-(entity.posX-entity.prevPosX)*2,
							-(entity.posY-entity.prevPosY)*2,
							-(entity.posZ-entity.prevPosZ)*2);
					MovingObjectPosition mop = bb.expand(hitBoxSize, hitBoxSize, hitBoxSize).calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ));
					if(mop != null)
					{
						Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - posX, mop.hitVec.yCoord - posY, mop.hitVec.zCoord - posZ);
						float hitLambda = 1F;
						if(motion.x != 0F)
							hitLambda = hitPoint.x / motion.x;
						else if(motion.y != 0F)
							hitLambda = hitPoint.y / motion.y;
						else if(motion.z != 0F)
							hitLambda = hitPoint.z / motion.z;
						if(hitLambda < 0)
							hitLambda = -hitLambda;

						
				
						hits.add(new EntityHit(entity, hitLambda));
					}
				}
			}
		}

		//Ray trace the bullet by comparing its next position to its current position
		Vec3 posVec = Vec3.createVectorHelper(posX, posY, posZ);
		Vec3 nextPosVec = Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ);
		MovingObjectPosition hit = worldObj.func_147447_a(posVec, nextPosVec, false, true, true);

		posVec = Vec3.createVectorHelper(posX, posY, posZ);

		if(hit != null)
		{
			//Calculate the lambda value of the intercept
			Vec3 hitVec = posVec.subtract(hit.hitVec);
			float lambda = 1;
			//Try each co-ordinate one at a time.
			if(motionX != 0)
				lambda = (float)(hitVec.xCoord / motionX);
			else if(motionY != 0)
				lambda = (float)(hitVec.yCoord / motionY);
			else if(motionZ != 0)
				lambda = (float)(hitVec.zCoord / motionZ);

			if(lambda < 0)
				lambda = -lambda;
			hits.add(new BlockHit(hit, lambda));
		}
		
		//stolen grenade world
		if(type.grenadeBounce)
		{
			if(motionX>-0.1f && motionX<0.1f && motionZ>-0.1f && motionZ<0.1f)
				stuck = true;
			
			//If the block we were stuck to is gone, unstick
			if(stuck && worldObj.isAirBlock(stuckToX, stuckToY, stuckToZ))
				stuck = false;
			
			
			
			//Physics and motion (Don't move if stuck)
			if(!stuck)
			{
				prevRotationYaw = axes.getYaw();
				prevRotationPitch = axes.getPitch();
				prevRotationRoll = axes.getRoll();
				if(angularVelocity.lengthSquared() > 0.00000001F)
					axes.rotateLocal(angularVelocity.length(), angularVelocity.normalise(null));

				Vector3f posVec1 = new Vector3f(posX, posY, posZ);
				Vector3f motVec = new Vector3f(motionX, motionY, motionZ);
				Vector3f nextPosVec1 = Vector3f.add(posVec1, motVec, null);

			MovingObjectPosition hit1 = worldObj.rayTraceBlocks(posVec1.toVec3(), nextPosVec1.toVec3());
			
			

		//If we hit block
		if(hit1 != null && hit1.typeOfHit == MovingObjectType.BLOCK)
		{
			
			//Get the blockID and block material
			Block block1 = worldObj.getBlock(hit1.blockX, hit1.blockY, hit1.blockZ);
			Material mat1 = block1.getMaterial();

			//If this grenade detonates on impact, do so
			if(type.explodeOnImpact)
			{
				detonate();
			}
			

			


			//If we hit glass and can break it, do so
			else if(type.breaksGlass && mat1 == Material.glass && TeamsManager.canBreakGlass)
			{
				worldObj.setBlockToAir(hit1.blockX, hit1.blockY, hit1.blockZ);
				FlansMod.proxy.playBlockBreakSound(hit1.blockX, hit1.blockY, hit1.blockZ, block1);
			}

			//If this grenade does not penetrate blocks, hit the block instead
			//The grenade cannot bounce if it detonated on impact, so hence the "else" condition
			else 
			{
				Vector3f hitVec = new Vector3f(hit1.hitVec);
				//Motion of the grenade pre-hit
				Vector3f preHitMotVec = Vector3f.sub(hitVec, posVec1, null);
				//Motion of the grenade post-hit
				Vector3f postHitMotVec = Vector3f.sub(motVec, preHitMotVec, null);

				//Reflect postHitMotVec based on side hit
				int sideHit = hit1.sideHit;
				switch(sideHit)
				{
				case 0 : case 1 : postHitMotVec.setY(-postHitMotVec.getY()); break;
				case 4 : case 5 : postHitMotVec.setX(-postHitMotVec.getX()); break;
				case 2 : case 3 : postHitMotVec.setZ(-postHitMotVec.getZ()); break;
				}

				//Calculate the time interval spent post reflection
				float lambda = Math.abs(motVec.lengthSquared()) < 0.00000001F ? 1F : postHitMotVec.length() / motVec.length();
				//Scale the post hit motion by the bounciness of the grenade
				//postHitMotVec.scale(type.bounciness / 2);
				postHitMotVec.scale(0.9f / 2);

				//Move the grenade along the new path including reflection
				posX += preHitMotVec.x + postHitMotVec.x;
				posY += preHitMotVec.y + postHitMotVec.y  + 0.5f;
				posZ += preHitMotVec.z + postHitMotVec.z;

				//Set the motion
				motionX = postHitMotVec.x / lambda;
				motionZ = postHitMotVec.z / lambda;
				if(motionY < 0)
				motionY = 0.8f * postHitMotVec.y / lambda;
				else if(motionY > 0)
					motionY = 1.2f * postHitMotVec.y / lambda;
				

				//Reset the motion vector
				motVec = new Vector3f(motionX, motionY, motionZ);

				//Give it a random spin
				float randomSpinner = 90F;
				Vector3f.add(angularVelocity, new Vector3f(rand.nextGaussian() * randomSpinner, rand.nextGaussian() * randomSpinner, rand.nextGaussian() * randomSpinner), angularVelocity);
				//Slow the spin based on the motion
				angularVelocity.scale(motVec.lengthSquared());

				//Play the bounce sound
				if(motVec.lengthSquared() > 0.01D)
					playSound(type.hitSound, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));

				//If this grenade is sticky, stick it to the block
				if(type.sticky )
				{
					//Move the grenade to the point of contact
					posX = hitVec.x;
					posY = hitVec.y;
					posZ = hitVec.z;
					//Stop all motion of the grenade
					motionX = motionY = motionZ = 0;
					angularVelocity.set(0F, 0F, 0F);

					float yaw = axes.getYaw();

					switch(hit1.sideHit)
					{
					case 0 : axes.setAngles(yaw, 180F, 0F); break;
					case 1 : axes.setAngles(yaw, 0F, 0F); break;
					case 2 : axes.setAngles(270F, 90F, 0F); axes.rotateLocalYaw(yaw); break;
					case 3 : axes.setAngles(90F, 90F, 0F); axes.rotateLocalYaw(yaw); break;
					case 4 : axes.setAngles(180F, 90F, 0F); axes.rotateLocalYaw(yaw); break;
					case 5 : axes.setAngles(0F, 90F, 0F); axes.rotateLocalYaw(yaw); break;
					}

					//Set the stuck flag on
					stuck = true;
					stuckToX = hit1.blockX;
					stuckToY = hit1.blockY;
					stuckToZ = hit1.blockZ;
					if(stuck)
					setPosition(hit1.blockX, hit1.blockY, hit1.blockZ);
				}
			}
		}
		//We didn't hit a block, continue as normal
		else
		{
			posX += motionX;
			posY += motionY;
			posZ += motionZ;
		}

		//Update the grenade position
		setPosition(posX, posY, posZ);
				}
			}
		
			
			//end of stolen grenade world
		
		
		
		
		
		
		//stolen Smoke
		if(type.stolenSmoke && this.ticksExisted == type.smokeDelay && type.angelOfDeath)
		PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
		
				if(type.stolenSmoke && this.ticksExisted>type.smokeDelay)
				{
					
					motionX *= 0.8f;
					motionZ *= 0.8f;
					//motionY += 0.1f;
					//if(motionY<0)
					//	motionY *= (-1f);
					
					
					
					//Send flak packet to spawn particles
					FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.smokeParticleCount, type.smokeParticleType), posX, posY, posZ, 150, dimension);
					//
					List list = worldObj.getEntitiesWithinAABB(EntityLivingBase.class, boundingBox.expand(type.smokeRadius, type.smokeRadius, type.smokeRadius));
					for(Object obj : list)
					{
						EntityLivingBase entity = ((EntityLivingBase)obj);
						if(entity.getDistanceToEntity(this) < type.smokeRadius)
						{
							//Do some checks first
							boolean smokeThem = true;
							
							
							//if this "smoke" is actually a nuclear weapon, kill everyone within radius
							if(type.angelOfDeath)
							{
								entity.attackEntityFrom(DamageSource.cactus, 9000f);
								attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase) null), 10000000);	
							}
							else
							for(int i = 0; i < 5; i++)
							{
								//If any currently equipped item has smoke protection (gas masks), stop the effects
								ItemStack stack = entity.getEquipmentInSlot(i);
								if(stack != null && stack.getItem() instanceof ItemTeamArmour && type.gasmaskable)
								{
									if(((ItemTeamArmour)stack.getItem()).type.smokeProtection)
										smokeThem = false;
								}
							}

							if(smokeThem)
								for(PotionEffect effect : type.stolenSmokeEffects)
								{
									if(!worldObj.isRemote)
									entity.addPotionEffect(new PotionEffect(effect));
								}
						}
					}

					bulletSmokeTime--;
					if(bulletSmokeTime == 0)
						setDead();
				}
				//end of stolen smoke
		
		

		//We hit something allah bookmark
		//if(!hits.isEmpty() && !type.grenadeBounce)
		if(!hits.isEmpty() )
		{
			//Sort the hits according to the intercept position
			Collections.sort(hits);

			for(BulletHit bulletHit : hits)
			{
				if(bulletHit instanceof DriveableHit && !type.stolenSmoke)
				{
					if(type.entityHitSoundEnable)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					if(type.flak > 0 && !type.stolenSmoke)
						FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
					if(worldObj.isRemote){
						if(owner instanceof EntityPlayer){
							if(FlansMod.proxy.isThePlayer((EntityPlayer)owner)){
							    	hitCrossHair = true;
			
									if(type.flak > 0 && !type.angelOfDeath)
										FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
							}
						}
					}
					DriveableHit driveableHit = (DriveableHit)bulletHit;
					driveableHit.driveable.lastAtkEntity = owner;
					
					//for some reason this thing caused high bullet detection to crash game
				//	penetratingPower = driveableHit.driveable.bulletHit(this, driveableHit, penetratingPower);
					
					if(!type.stolenSmoke)
					penetratingPower = driveableHit.driveable.bulletHit(this, driveableHit, penetratingPower);


					if(type.canSpotEntityDriveable)
						driveableHit.driveable.setEntityMarker(200);
					//driveableHit.driveable.isShowedPosition = true;
					//driveableHit.driveable.tickCount = 200;
					if(FlansMod.DEBUG)
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * driveableHit.intersectTime, posY + motionY * driveableHit.intersectTime, posZ + motionZ * driveableHit.intersectTime), 1000, 0F, 0F, 1F));

				}
				else if(bulletHit instanceof PlayerBulletHit && !type.stolenSmoke)
				{
					//moved this code to player hitbox thingy so it wont play when bullet whizzes past you
					//if(type.entityHitSoundEnable)
					//	PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					if(worldObj.isRemote){
						if(owner instanceof EntityPlayer){

							if(FlansMod.proxy.isThePlayer((EntityPlayer)owner)){
							    	hitCrossHair = true;
							    	if(type.flak > 0 && !type.stolenSmoke)
										FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
							}
						}
					}
					PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
					if(!type.stolenSmoke)
					penetratingPower = playerHit.hitbox.hitByBullet(this, penetratingPower);
					if(FlansMod.DEBUG)
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * playerHit.intersectTime, posY + motionY * playerHit.intersectTime, posZ + motionZ * playerHit.intersectTime), 1000, 1F, 0F, 0F));
				}
				else if(bulletHit instanceof EntityHit && !type.stolenSmoke)
				{
					if(type.entityHitSoundEnable && !type.angelOfDeath)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					if(worldObj.isRemote){
						if(owner instanceof EntityPlayer){
	
							if(FlansMod.proxy.isThePlayer((EntityPlayer)owner)){
							    	hitCrossHair = true;
							    	if(type.flak > 0 && !type.stolenSmoke)
										FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
							}
						}
					}
					EntityHit entityHit = (EntityHit)bulletHit;
					float d = damage;
					if(entityHit.entity instanceof EntityLivingBase)
					{
						//dynamic damage
						if(this.ticksExisted>type.dynamicBulletDelay)
							d *= type.dynamicDamage;
						else
						d *= type.damageVsLiving;
						
						
						if(entityHit.entity != owner)
						//FlansMod.proxy.spawnParticle("flansmod.blood", entityHit.entity.posX, entityHit.entity.posY+1, entityHit.entity.posZ, 0,0.1f,0);
						FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.blood", entityHit.entity.posX, entityHit.entity.posY+1, entityHit.entity.posZ, (float)Math.random()*1, (float)Math.random()*1, -(float)Math.random()*1), entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 150, dimension);
						
					//	FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "blood"), posX, posY, posZ, 200, dimension);
						
						/*
						if(d>40)
						{
						FlansMod.proxy.spawnParticle("flansmod.overkill", entityHit.entity.posX, entityHit.entity.posY-4, entityHit.entity.posZ, 0,0.1f,0);
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, 15, dimension, "goreDeath", true);
						}
						*/
					}
					else
					{
						if(this.ticksExisted>type.dynamicBulletDelay)
							d *= type.dynamicDamage;
						else
						d *= type.damageVsEntity;

					}
					if(entityHit.entity.attackEntityFrom(getBulletDamage(false), d) && entityHit.entity instanceof EntityLivingBase && !(entityHit.entity instanceof EntityPlayer) && !(entityHit.entity instanceof EntityPlayerMP))
					{
						EntityLivingBase living = (EntityLivingBase)entityHit.entity;
						

						//for(PotionEffect effect : type.hitEffects)
						//{
						//	living.addPotionEffect(new PotionEffect(effect));
						//}
						
						//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
						living.arrowHitTimer++;
						living.hurtResistantTime = living.maxHurtResistantTime / 2;
					}
					if(type.setEntitiesOnFire)
						entityHit.entity.setFire(20);
					
					//labjac swords ignore vehicles unless animal sword energy
					if((entityHit.entity instanceof EntityDriveable))
					{
						if(type.swordEnergy && (((EntityDriveable) entityHit.entity).getDriveableType().canStab))
					penetratingPower -= 9000F;
					}
					
					if(type.swordEnergy==false)
						penetratingPower -= 1F;
					
					if(FlansMod.DEBUG)
					{
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * entityHit.intersectTime, posY + motionY * entityHit.intersectTime, posZ + motionZ * entityHit.intersectTime), 1000, 1F, 1F, 0F));
						FlansMod.log(entityHit.entity.toString() + ": d=" + d + ": damage=" + damage + ": type.damageVsEntity=" + type.damageVsEntity);
					}
				}
				//non grenade block hit behaviour
				else if(bulletHit instanceof BlockHit && !type.grenadeBounce)
				{
					BlockHit blockHit = (BlockHit)bulletHit;
					MovingObjectPosition raytraceResult = blockHit.raytraceResult;
					//If the hit wasn't an entity hit, then it must've been a block hit
					int xTile = raytraceResult.blockX;
					int yTile = raytraceResult.blockY;
					int zTile = raytraceResult.blockZ;
					if(FlansMod.DEBUG)
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(raytraceResult.hitVec.xCoord, raytraceResult.hitVec.yCoord, raytraceResult.hitVec.zCoord), 1000, 0F, 1F, 0F));

					
					
					//redundant thing
					if(type.explodeOnImpact && !type.papaDrill && !type.stolenSmoke)
					{
						setPosition(posX + motionX * bulletHit.intersectTime, posY + motionY * bulletHit.intersectTime, posZ + motionZ * bulletHit.intersectTime);
						setDead();
					}
					
					Block block = worldObj.getBlock(xTile, yTile, zTile);
					Material mat = block.getMaterial();
					//If the bullet breaks glass, and can do so according to FlansMod, do so.
					if(type.breaksGlass && mat == Material.glass)
					{
						if(TeamsManager.canBreakGlass)
						{
							worldObj.setBlockToAir(xTile, yTile, zTile);
							FlansMod.proxy.playBlockBreakSound(xTile, yTile, zTile, block);
						}
					}
					
					//grass trimmer for papag
					if(type.papaDrill && mat == Material.grass  && TeamsManager.canBreakGlass || type.papaDrill && mat == Material.leaves && TeamsManager.canBreakGlass && (!worldObj.isRemote))
					{
						
						Block block1 = worldObj.getBlock(xTile, yTile+1, zTile);
						Material mat1 = block1.getMaterial();
						Block block2 = worldObj.getBlock(xTile, yTile-1, zTile);
						Material mat2 = block2.getMaterial();
						Block block3 = worldObj.getBlock(xTile-1, yTile, zTile);
						Material mat3 = block3.getMaterial();
						Block block4 = worldObj.getBlock(xTile+1, yTile, zTile);
						Material mat4 = block4.getMaterial();
						Block block5 = worldObj.getBlock(xTile, yTile, zTile-1);
						Material mat5 = block5.getMaterial();
						Block block6 = worldObj.getBlock(xTile, yTile, zTile+1);
						Material mat6 = block6.getMaterial();
						Block block7 = worldObj.getBlock(xTile+1, yTile, zTile+1);
						Material mat7 = block6.getMaterial();
						Block block8 = worldObj.getBlock(xTile+1, yTile, zTile-1);
						Material mat8 = block6.getMaterial();
						Block block9 = worldObj.getBlock(xTile-1, yTile, zTile-1);
						Material mat9 = block6.getMaterial();
						Block block10 = worldObj.getBlock(xTile-1, yTile, zTile+1);
						Material mat10 = block6.getMaterial();
						
						
							worldObj.setBlockToAir(xTile, yTile, zTile);
							//FlansMod.proxy.playBlockBreakSound(xTile, yTile, zTile, block);
						if (mat1 == Material.grass || mat1 == Material.leaves)
							worldObj.setBlockToAir(xTile, yTile+1, zTile);
						if (mat2 == Material.grass || mat2 == Material.leaves)
							worldObj.setBlockToAir(xTile, yTile-1, zTile);
						if (mat3 == Material.grass || mat3 == Material.leaves)
							worldObj.setBlockToAir(xTile-1, yTile, zTile);
						if (mat4 == Material.grass || mat4 == Material.leaves)
							worldObj.setBlockToAir(xTile+1, yTile, zTile);
						if (mat5 == Material.grass || mat5 == Material.leaves)
							worldObj.setBlockToAir(xTile, yTile, zTile-1);
						if (mat6 == Material.grass || mat6 == Material.leaves)
							worldObj.setBlockToAir(xTile, yTile, zTile+1);
						if (mat7 == Material.grass || mat7 == Material.leaves)
							worldObj.setBlockToAir(xTile+1, yTile, zTile+1);
						if (mat8 == Material.grass || mat8 == Material.leaves)
							worldObj.setBlockToAir(xTile+1, yTile, zTile-1);
						if (mat9 == Material.grass || mat9 == Material.leaves)
							worldObj.setBlockToAir(xTile-1, yTile, zTile-1);
						if (mat10 == Material.grass || mat10 == Material.leaves)
							worldObj.setBlockToAir(xTile-1, yTile, zTile+1);
					}
					
					if(type.explodeOnImpact && type.papaDrill && mat != Material.grass && mat != Material.leaves)
					{
						setPosition(posX + motionX * bulletHit.intersectTime, posY + motionY * bulletHit.intersectTime, posZ + motionZ * bulletHit.intersectTime);
						setDead();
					}
					
					

					if(worldObj.isRemote && !type.grenadeBounce)
					{
						if (block.getMaterial() != Material.air && this.type.explosionRadius<=0)
						{
							int num = 2 + this.rand.nextInt(3);
							for(int i=0; i<num; i++)
							{
								FlansMod.proxy.spawnParticle(
									"blockcrack_" + Block.getIdFromBlock(block) + "_" + this.worldObj.getBlockMetadata(xTile, yTile, zTile),
									raytraceResult.hitVec.xCoord + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width,
									raytraceResult.hitVec.yCoord + 0.1D,
									raytraceResult.hitVec.zCoord + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width,
									-this.motionX * 4.0D,
									1.5D,
									-this.motionZ * 4.0D);
								FlansMod.proxy.spawnParticle("explode", raytraceResult.hitVec.xCoord, raytraceResult.hitVec.yCoord, raytraceResult.hitVec.zCoord,0,0,0);
							}
						}
					}
					


if(!type.Bouncerino && !type.Ghost && !type.papaDrill || !type.Bouncerino && !type.Ghost && type.papaDrill && mat != Material.grass || !type.Bouncerino && !type.Ghost && type.papaDrill && mat != Material.leaves )
{
					penetratingPower -= block.getBlockHardness(worldObj, zTile, zTile, zTile);
}

					setPosition(hit.hitVec.xCoord, hit.hitVec.yCoord, hit.hitVec.zCoord);
					//play sound when bullet hits block
					if(type.hitSoundEnable)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					
					if(type.flak > 0 && !type.stolenSmoke)
						FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
					
					if(type.Bouncerino)
					{
					
						
						float height = (float) posY;
						
							//shit to prevent it going through vertical walls
							//check the block surrounding hit horizontally and above
							//if it is not air then we probably hit a wall so stop bouncing
							Block neighbor1 = worldObj.getBlock(xTile+1, yTile+1, zTile);
							Material neighbor1mat = neighbor1.getMaterial();
							Block neighbor2 = worldObj.getBlock(xTile+1, yTile+1, zTile+1);
							Material neighbor2mat = neighbor2.getMaterial();
							Block neighbor3 = worldObj.getBlock(xTile+1, yTile+1, zTile-1);
							Material neighbor3mat = neighbor3.getMaterial();
							Block neighbor4 = worldObj.getBlock(xTile, yTile+1, zTile+1);
							Material neighbor4mat = neighbor4.getMaterial();
							Block neighbor5 = worldObj.getBlock(xTile, yTile+1, zTile-1);
							Material neighbor5mat = neighbor5.getMaterial();
							Block neighbor6 = worldObj.getBlock(xTile-1, yTile+1, zTile);
							Material neighbor6mat = neighbor6.getMaterial();
							Block neighbor7 = worldObj.getBlock(xTile-1, yTile+1, zTile-1);
							Material neighbor7mat = neighbor7.getMaterial();
							Block neighbor8 = worldObj.getBlock(xTile-1, yTile+1, zTile+1);
							Material neighbor8mat = neighbor8.getMaterial();
							Block neighbor9 = worldObj.getBlock(xTile, yTile+1, zTile);
							Material neighbor9mat = neighbor9.getMaterial();
									
							if(type.stolenSmoke)	
							{
								
								this.motionY *= 0;
								this.motionX *= 0;
								this.motionZ *= 0;
								this.posY = height + 1;
								type.fallSpeed = 0;
								
							}
						
							
							//if confirmed not a wall then bounce
							if(neighbor1mat == Material.air && neighbor2mat == Material.air && neighbor3mat == Material.air && neighbor4mat == Material.air && neighbor5mat == Material.air && neighbor6mat == Material.air && neighbor7mat == Material.air && neighbor8mat == Material.air && neighbor9mat == Material.air && !type.stolenSmoke)
							{
							this.motionY *= -0.9;
							this.motionX *= 0.95;
							this.motionZ *= 0.95;
							

							
							}
							else if (!type.stolenSmoke)
								setDead();	
					}
					//end of bouncerino
					
					if(type.Parachute)
					{
						this.motionX *= 0.95;
						this.motionZ *= 0.95;
							
						
						if(this.motionY>-0.1)
							this.motionY -= -0.01;
						
						if(this.motionY<-0.2)
							this.motionY += -0.01;
				
					}
					
					
					
					
	
					
					
					if(type.Hesh)
					{
						//just activate submunition code but only by hitting a block
						{
							DeploySubmunitions();
							

							if(type.destroyOnDeploySubmunition || type.angel)
							{
								detonate();
							}
						}
							
						
					}
					

					
					//here for bouncy cannonball final solution also ghost bullets no die if hit block
					if(type.Bouncerino==false && type.Ghost==false && !type.breaksGlass && !type.papaDrill && !type.stolenSmoke)
					setDead();
					
					
					
					
				
					
					/*
					
					boolean soft = false;
					boolean softish = false;
					if (mat == Material.glass || mat == Material.leaves || mat == Material.wood || mat == Material.ground || mat == Material.sand || mat == Material.grass || mat==Material.cloth || mat==Material.craftedSnow)
						soft = true;
					else
						soft = false;
					if (mat == Material.wood || mat == Material.ground || mat == Material.sand || mat == Material.grass || mat==Material.cloth || mat==Material.craftedSnow)
					softish = true;
					else
						softish = false;
					
					if(type.breaksGlass && !soft && !type.Ghost)
						setDead();
					
					//break through weak shit like dirt and leaves and planks
					//if(type.breaksGlass && soft  && !type.Ghost)
					//FlansMod.proxy.playBlockBreakSound(xTile, yTile, zTile, block);
					
					//if not too weak stuff like dirt and wood, break through but lose fuse
					if(type.breaksGlass && softish && secretFuse>type.aftermathFuse  && !type.Ghost)
						secretFuse = type.aftermathFuse;
					
					*/
					break;
					
				}
				
			
			//crigne attempt to stop artillery detonating from hitting bullet whizz hitbox
				//if(penetratingPower <= 0F || (type.explodeOnImpact && ticksInAir > 1))
				if(penetratingPower <= 0F )
				{
					setPosition(posX + motionX * bulletHit.intersectTime, posY + motionY * bulletHit.intersectTime, posZ + motionZ * bulletHit.intersectTime);
					setDead();
					break;
				}

			}

		}
		//Otherwise, do a standard check for uninteresting entities
		/*
		else
		{
			//Iterate over entities close to the bullet to see if any of them have been hit and hit them
			List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.addCoord(motionX, motionY, motionZ).expand(type.hitBoxSize, type.hitBoxSize, type.hitBoxSize));
			for (int l = 0; l < list.size(); l++)
			{
				Entity checkEntity = (Entity) list.get(l);
				//Driveable collisions are handled earlier
				if(checkEntity instanceof EntityDriveable)
					continue;

				if(checkEntity instanceof EntityPlayer)
					continue;

				//Stop the bullet hitting stuff that can't be collided with or the person shooting immediately after firing it
				if((!checkEntity.canBeCollidedWith() || isPartOfOwner(checkEntity)) && ticksInAir < 20)
				{
					continue;
				}


				//Calculate the hit damage
				float hitDamage = damage * type.damageVsLiving;
				//Create a damage source object
				DamageSource damagesource = owner == null ? DamageSource.generic : getBulletDamage(false);

				//When the damage is 0 (such as with Nerf guns) the entityHurt Forge hook is not called, so this hacky thing is here
				if(hitDamage == 0 && checkEntity instanceof EntityPlayerMP && TeamsManager.getInstance().currentRound != null)
					TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)checkEntity, damagesource);

				//Attack the entity!
				if(checkEntity.attackEntityFrom(damagesource, hitDamage))
				{
					//If the attack was allowed and the entity is alive, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
					if (checkEntity instanceof EntityLivingBase)
					{
						((EntityLivingBase) checkEntity).arrowHitTimer++;
						((EntityLivingBase) checkEntity).hurtResistantTime = ((EntityLivingBase) checkEntity).maxHurtResistantTime / 2;
					}
					//Yuck.
					//PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.hitSound, true));
				}
				//Unless the bullet penetrates, kill it
				if(type.penetratingPower > 0)
				{
					setPosition(checkEntity.posX, checkEntity.posY, checkEntity.posZ);
					setDead();
					break;
				}
			}
		}
		*/

		//Movement dampening variables
		float drag = type.dragInAir;
		float gravity = 0.02F;
		//If the bullet is in water, spawn particles and increase the drag
		
	
		if (isInWater())
		{
		
			if(cringed==false && type.bigWater)
			{
			FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "waterSmoke"), posX, posY, posZ, 200, dimension);
			cringed=true;
			}
			
			
			if(cringed==false && type.smallWater)
			{
			FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "waterSmokeMini"), posX, posY, posZ, 200, dimension);
			cringed=true;
			}
			
			//bad things that happen to non-aquatic bullets when in water, like fuse dries up faster
			if(!type.torpedo && !type.navalMine && !type.depthCharge && !type.modernTorpedo)
			{
				if(motionX<0.05f && motionZ<0.05f && motionX>-0.05f && motionZ>-0.05f)
			detonate();
			}
			
			
			for(int i = 0; i < 4; i++)
			{
				float bubbleMotion = 0.25F;
				worldObj.spawnParticle("bubble", posX - motionX * bubbleMotion, posY - motionY * bubbleMotion, posZ - motionZ * bubbleMotion, motionX, motionY + 0.1F, motionZ);
			}
			drag = type.dragInWater;
		}
		if(!isInWater() || !type.torpedo || !type.navalMine || !type.depthCharge || type.modernTorpedo && isInWater() && !type.grenadeBounce )
		{
		motionX *= drag;
		motionZ *= drag;
		motionY -= gravity * type.fallSpeed;
		//if( (motionY>0 && !type.jamiogravity) || type.jamiogravity)
		//motionY *= 0.98f;
		if(type.jamiogravity)
		motionY *= 0.98f;
		}
		
	

		
		//code that activates AFTER locked on!
		// Apply homing action
		if(lockedOnTo != null)
		{
			if(lockedOnTo instanceof EntityDriveable)
			{
				EntityDriveable entDriveable = (EntityDriveable) lockedOnTo;
				// entPlane.isLockedOn = true;
				
				
				//labjac auto smoke system
				if (entDriveable.getDriveableType().autoSmoke && entDriveable.flareDelay <= 0 && !this.worldObj.isRemote)
				{
					entDriveable.ticksFlareUsing = entDriveable.getDriveableType().timeFlareUsing * 20;
					entDriveable.flareDelay = entDriveable.getDriveableType().flareDelay;
					PacketPlaySound.sendSoundPacket(lockedOnTo.posX, lockedOnTo.posY, lockedOnTo.posZ, FlansMod.soundRange, dimension, entDriveable.getDriveableType().flareSound, false); 
					if(lockedOnTo instanceof EntityVehicle)
					
					((EntityVehicle) entDriveable).dischargeSmoke();	
				}
				
				
				if(entDriveable.getDriveableType().lockedOnSound != null && soundTime <= 0 && !this.worldObj.isRemote)
				{
					PacketPlaySound.sendSoundPacket(lockedOnTo.posX, lockedOnTo.posY, lockedOnTo.posZ,
							entDriveable.getDriveableType().lockedOnSoundRange, dimension, entDriveable.getDriveableType().lockedOnSound, false);
					soundTime = entDriveable.getDriveableType().soundTime;

				}
			}
			else
			{
				lockedOnTo.getEntityData().setBoolean("Tracking", true);
			}

			if(this.ticksExisted > type.tickStartHoming)
			{
				double dX = lockedOnTo.posX - posX;
				double dY;
				if(type.isDoTopAttack && Math.abs(lockedOnTo.posX - this.posX) > 2 && Math.abs(lockedOnTo.posZ - this.posZ) > 2)
					dY = lockedOnTo.posY + 30 - posY;
				//to prevent sowrds from locking onto your feet, making chest and face stabs unlikely
				else if(isSword)
				{
					dY = 0;
				}
				else dY = lockedOnTo.posY - posY;
				
				double dZ = lockedOnTo.posZ - posZ;
				double dXYZ;
				if(!type.isDoTopAttack)
					dXYZ = getDistanceToEntity(lockedOnTo);
				else dXYZ = Math.sqrt(dX * dX + dY * dY + dZ * dZ);

				if(owner != null && type.enableSACLOS)
				{
					double dXp = lockedOnTo.posX - owner.posX;
					double dYp = lockedOnTo.posY - owner.posY;
					double dZp = lockedOnTo.posZ - owner.posZ;
					Vec3 playerVec = owner.getLookVec();
					Vector3f playerVec3f = new Vector3f(playerVec.xCoord, playerVec.yCoord, playerVec.zCoord);
					double angles = Math.abs(Vector3f.angle(playerVec3f, new Vector3f(dXp, dYp, dZp)));
					if(angles > Math.toRadians(type.maxDegreeOfSACLOS))
					{
						lockedOnTo = null;
					}
				}

				if(this.toggleLock)
				{
					//prevDistanceToEntity = dXYZ;
					if(dXYZ > type.maxRangeOfMissile)
						lockedOnTo = null;
					toggleLock = false;
				}

				// Vector3f lockedOnToVector = new Vector3f(dX,dY,dZ);

				double dmotion = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);

				Vector3f motionVector = new Vector3f(dX * dmotion / dXYZ, dY * dmotion / dXYZ, dZ * dmotion / dXYZ);
				//more sword ignorance of pitch
				if(isSword)
					motionVector = new Vector3f(dX * dmotion / dXYZ, motionY, dZ * dmotion / dXYZ);

				double angle = Math.abs(Vector3f.angle(motion, motionVector));

				if(angle > Math.toRadians(type.maxDegreeOfMissile))
				{
					lockedOnTo = null;
				}
				else
				{
					motionX = motionVector.x;
					motionY = motionVector.y;
					motionZ = motionVector.z;
				}

				if(this.ticksExisted > 4 && dXYZ > prevDistanceToEntity)
				{
					closeCount++;
					if(closeCount > 15)
					{
						lockedOnTo = null;
					}
				}
				else
				{
					if(closeCount > 0)
						closeCount--;
				}
				prevDistanceToEntity = dXYZ;
			}

			if(lockedOnTo instanceof EntityDriveable)
			{
				EntityDriveable plane = (EntityDriveable) lockedOnTo;

				if(plane.varFlare || plane.ticksFlareUsing > 0)// && !type.enableSACLOS)
				{
					lockedOnTo = null;
				}
			}
			//xddd i threw in ignorance of flares for radar guided missiles -t labjac
			else if(lockedOnTo != null && lockedOnTo.getEntityData().getBoolean("FlareUsing")  && !type.radarGuided)
			{
				lockedOnTo = null;
			}
			//aaaa no dont use stealth no my radar missiles :(
			else if(lockedOnTo != null && !lockedOnTo.getEntityData().getBoolean("radarVisible")  && type.radarGuided)
			{
				lockedOnTo = null;
			}
		}
		
		//end of is locked onto something code ^

		//System.out.println((int)posX+","+(int)posY+","+(int)posZ);

		if(owner != null && type.shootForSettingPos && !this.isFirstPositionSetting)
		{
			if(this.owner instanceof EntityPlayer)
			{
				EntityPlayer entP = (EntityPlayer)this.owner;
				if(entP.getCurrentEquippedItem() != null)
				if(entP.getCurrentEquippedItem().getItem() instanceof ItemGun){
					ItemGun itemGun = (ItemGun) entP.getCurrentEquippedItem().getItem();
					this.impactX = itemGun.impactX;
					this.impactY = itemGun.impactY;
					this.impactZ = itemGun.impactZ;
					//allah gun stuff?
				}

			}
			this.isFirstPositionSetting = true;
		}

		if(type.shootForSettingPos && this.isFirstPositionSetting && this.isPositionUpper){
			double motionXa = this.motionX;
			double motionYa = this.motionY;
			double motionZa = this.motionZ;
			double motiona = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
			this.motionX = 0;
			this.motionY = motiona;
			this.motionZ = 0;

			if(this.posY - type.shootForSettingPosHeight > owner.posY){
				this.isPositionUpper = false;
			}
		}
		if(type.shootForSettingPos && this.isFirstPositionSetting && !this.isPositionUpper){
			double rootx = this.impactX - this.posX;
			double rootz = this.impactZ - this.posZ;
			double roota = Math.sqrt((rootx * rootx) + (rootz * rootz));
			double motionXa = this.motionX;
			double motionYa = this.motionY;
			double motionZa = this.motionZ;
			double motiona = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
			this.motionX = rootx * motiona / roota;
			this.motionZ = rootz * motiona / roota;
			if(Math.abs(this.impactX - this.posX) < 1 && Math.abs(this.impactZ - this.posZ) < 1){
				double motionXab = this.motionX;
				double motionYab = this.motionY;
				double motionZab = this.motionZ;
				double motionab = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
				this.motionX = 0;
				this.motionY = -motionab;
				this.motionZ = 0;
			}
		}
		this.renderDistanceWeight = 256D;
		if(owner != null && type.manualGuidance && VLSDelay <= 0 && lockedOnTo == null)
		{

			this.renderDistanceWeight = 256D;
			/**
			boolean beamRider = true;
			if(!beamRider)
			{
				this.rotationYaw = owner.rotationYaw;
				this.rotationPitch = owner.rotationPitch;
				double dist = MathHelper.sqrt_double( motionX*motionX + motionY*motionY + motionZ*motionZ );
				final float PI = (float) Math.PI;
				motionX = dist * -MathHelper.sin((rotationYaw   / 180F) * PI) * MathHelper.cos((rotationPitch / 180F) * PI)*1.02;
				motionZ = dist *  MathHelper.cos((rotationYaw   / 180F) * PI) * MathHelper.cos((rotationPitch / 180F) * PI)*1.02;
				motionY = dist * -MathHelper.sin((rotationPitch / 180F) * PI)*1.02;
			} else 
			*/

				Vector3f lookVec;
				Vector3f origin2;
				lookVec = new Vector3f((float)owner.getLookVec().xCoord, (float)owner.getLookVec().yCoord,(float)owner.getLookVec().zCoord);
				origin2 = new Vector3f(owner.posX, owner.posY, owner.posZ);
//for fixed direction bullets
				if(type.fixedDirection)
				{
					lookVec = lookVector;
					origin2 = initialPos;	
				}
				float x = (float)(posX - origin2.x);
				float y = (float)(posY - origin2.y);
				float z = (float)(posZ - origin2.z);
				
				float d = (float)Math.sqrt((x*x) + (y*y) + (z*z));
				d = d+type.turnRadius;
				
				lookVec.normalise();
				
				Vector3f targetPoint = new Vector3f(origin2.x + (lookVec.x*d), origin2.y + (lookVec.y*d), origin2.z + (lookVec.z*d));
				//FlansMod.proxy.spawnParticle("explode", targetPoint.x,targetPoint.y,targetPoint.z, 0,0,0);
				//double dX = owner.posX - this.posX;
				//double dY = owner.posY - this.posY;
				//double dZ = owner.posZ - this.posZ;
				//targetPoint = new Vector3f(owner.posX, owner.posY, owner.posZ);
				
				Vector3f diff = Vector3f.sub(targetPoint, new Vector3f(posX, posY, posZ), null);

				float speed2 = type.trackPhaseSpeed;
				float turnSpeed = type.trackPhaseTurn;
				diff.normalise();
				turnSpeed = 0.1F;
				Vector3f targetSpeed = new Vector3f(diff.x * speed2, diff.y * speed2, diff.z * speed2);
				
				if(!type.torpedo && !isInWater() || !type.modernTorpedo && !isInWater() || type.torpedo || type.modernTorpedo)
				this.motionX += (targetSpeed.x - motionX) * turnSpeed;
				this.motionZ += (targetSpeed.z - motionZ) * turnSpeed;
				if(type.modernTorpedo && isInWater() || !type.modernTorpedo && !isInWater())
				this.motionY += (targetSpeed.y - motionY) * turnSpeed;
				
				//this.rotationYaw = owner.rotationYaw;
				//this.rotationPitch = owner.rotationPitch;
		}
		
		
		if(type.torpedo)
		{
			//prevent positive motion above water
			if(!isInWater() && motionY>0)
				motionY=0;
			if(isInWater()){
				Vector3f motion2 = new Vector3f(motionX, motionY, motionZ);
				float length = motion.length();
				motion.normalise();
				motionY *= 0.3F;
				motionY += gravity;
				motionX = motion.x * 1;
				motionZ = motion.z * 1;
			}
		}
		
		if(type.navalMine)
		{
			if(!isInWater() && motionY>0)
				motionY=0;
			//if(((float)type.seaLevel-this.posY)<=type.activationDepth && isInWater())
			if((TeamsManager.seaLevel-this.posY)<=type.activationDepth && isInWater())
			{
				motionY = -type.fallSpeed;
				motionX = 0;
				motionZ = 0;
			}
				
			//if(((float)type.seaLevel-this.posY)>type.activationDepth && isInWater())
			if((TeamsManager.seaLevel-this.posY)>type.activationDepth && isInWater())
			{
				Vector3f motion2 = new Vector3f(motionX, motionY, motionZ);
				float length = motion.length();
				motion.normalise();
				motionY = 0;
				motionX = 0;
				motionZ = 0;
			}
		}
		
		if(type.depthCharge)
		{
			if(!isInWater() && motionY>0)
				motionY=0;
			if((TeamsManager.seaLevel-this.posY)<=type.activationDepth && isInWater())
			{
				motionY = -type.fallSpeed;
				motionX = 0;
				motionZ = 0;
			}
			
			if((TeamsManager.seaLevel-this.posY)>type.activationDepth && isInWater())
			{
				detonate();
			}
		}


		//Apply motion
		//posX += motionX;
		//posY += motionY;
		//posZ += motionZ;
		setPosition(posX + motionX, posY + motionY, posZ + motionZ);

		//Recalculate the angles from the new motion
		float motionXZ = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
		rotationYaw = (float) ((Math.atan2(motionX, motionZ) * 180D) / 3.1415927410125732D);
		rotationPitch = (float) ((Math.atan2(motionY, motionXZ) * 180D) / 3.1415927410125732D);
		//Reset the range of the angles
		for (; rotationPitch - prevRotationPitch < -180F; prevRotationPitch -= 360F){}
		for (; rotationPitch - prevRotationPitch >= 180F; prevRotationPitch += 360F){}
		for (; rotationYaw - prevRotationYaw < -180F; prevRotationYaw -= 360F){}
		for (; rotationYaw - prevRotationYaw >= 180F; prevRotationYaw += 360F){}
		rotationPitch = prevRotationPitch + (rotationPitch - prevRotationPitch) * 0.2F;
		rotationYaw = prevRotationYaw + (rotationYaw - prevRotationYaw) * 0.2F;

		//Particles
		if (type.trailParticles && !type.stolenSmoke && worldObj.isRemote && ticksInAir > 1 || ticksExisted < type.smokeDelay && type.stolenSmoke)
		{
			//allah fix attempt, server hates clientside spawnparticle void
			//spawnParticles();
			
			{
				double dX = (posX - prevPosX) / 10;
				double dY = (posY - prevPosY) / 10;
				double dZ = (posZ - prevPosZ) / 10;

				float spread = 0.1F;
				if(VLSDelay > 0 && type.boostPhaseParticle != null){
					for (int i = 0; i < 10; i++)
					{			
						FlansMod.proxy.spawnParticle(type.boostPhaseParticle,
								prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
								0,0,0);
					}
				} else if (!type.VLS ||(VLSDelay <= 0)){
					for (int i = 0; i < 10; i++)
					{
						//EntityFX particle = FlansModClient.getParticle("flansmod.rocketexhaust", worldObj, prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread);
						//if(particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
							//particle.renderDistanceWeight = 100D;
						//worldObj.spawnEntityInWorld(particle);
						FlansMod.proxy.spawnParticle(type.trailParticleType,
								prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
								0,0,0);
					}
					
				}
				//FlansMod.proxy.spawnParticle("explode", prevPosX + dX, prevPosY + dY, prevPosZ + dZ, motionX + (float)Math.random()*1 - 0.5, motionY + (float)Math.random()*1 - 0.5, motionZ +(float)Math.random()*1 - 0.5);

			}
		}

		//Temporary fire glitch fix
		if(worldObj.isRemote)
			extinguish();
	}

	
	/*
	@SideOnly(Side.CLIENT)
	private void spawnParticles()
	{
		double dX = (posX - prevPosX) / 10;
		double dY = (posY - prevPosY) / 10;
		double dZ = (posZ - prevPosZ) / 10;

		float spread = 0.1F;
		if(VLSDelay > 0 && type.boostPhaseParticle != null){
			for (int i = 0; i < 10; i++)
			{			
				FlansMod.proxy.spawnParticle(type.boostPhaseParticle,
						prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
						0,0,0);
			}
		} else if (!type.VLS ||(VLSDelay <= 0)){
			for (int i = 0; i < 10; i++)
			{
				//EntityFX particle = FlansModClient.getParticle("flansmod.rocketexhaust", worldObj, prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread);
				//if(particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
					//particle.renderDistanceWeight = 100D;
				//worldObj.spawnEntityInWorld(particle);
				FlansMod.proxy.spawnParticle(type.trailParticleType,
						prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
						0,0,0);
			}
			
		}
		//FlansMod.proxy.spawnParticle("explode", prevPosX + dX, prevPosY + dY, prevPosZ + dZ, motionX + (float)Math.random()*1 - 0.5, motionY + (float)Math.random()*1 - 0.5, motionZ +(float)Math.random()*1 - 0.5);

	}
	
	*/
	
	


	@SideOnly(Side.CLIENT)
	private void spawnHitParticles(double x, double y, double z)
	{
		FlansMod.proxy.spawnParticle("explode", x,y,z, 0,0,0);

	}

	public DamageSource getBulletDamage(boolean headshot)
	{
		//allah shoot
		if(owner instanceof EntityPlayer)
			return (new EntityDamageSourceGun(type.shortName, this, (EntityPlayer)owner, firedFrom, headshot)).setProjectile();
		else return (new EntityDamageSourceIndirect(type.shortName, this, owner)).setProjectile();
	}

	private boolean isPartOfOwner(Entity entity) {
		if (owner == null)
			return false;
		if (entity == owner || entity == owner.riddenByEntity || entity == owner.ridingEntity)
			return true;
		if (owner instanceof EntityPlayer) {
			if (PlayerHandler.getPlayerData((EntityPlayer) owner, worldObj.isRemote ? Side.CLIENT : Side.SERVER) == null)
				return false;
			EntityMG mg = PlayerHandler.getPlayerData((EntityPlayer) owner, worldObj.isRemote ? Side.CLIENT : Side.SERVER).mountingGun;
			if (mg != null && mg == entity) {
				return true;
			}
		}
		return owner.ridingEntity instanceof EntitySeat && (((EntitySeat) owner.ridingEntity).driveable == null || ((EntitySeat) owner.ridingEntity).driveable.isPartOfThis(entity));
	}

	@Override
	public void setDead()
	{
		
		if(type.explosionRadius > 0)
		{
	        if(owner instanceof EntityPlayer)
			{
	        	if(!worldObj.isRemote)
		        new FlansModExplosion(worldObj, this, (EntityPlayer)owner, type, posX, posY, posZ,
			        type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks,
			        type.explosionDamageVsLiving, type.explosionDamageVsPlayer, type.explosionDamageVsPlane, type.explosionDamageVsVehicle, type.smokeParticleCount, type.debrisParticleCount);
			}
	        else
			{
	        	if(!worldObj.isRemote)
				worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions);
			}
		}
		
		//angel trigger
		if(type.angel)
			DeploySubmunitions();
		
		
		
		
		
		//labjac classic explosions   
		if(type.classicExplosionRadius > 0.1F)
        {
			if(!worldObj.isRemote)
        	worldObj.createExplosion(this, posX, posY, posZ, type.classicExplosionRadius, (type.explosionBreaksBlocks&&TeamsManager.raiding));
        }
		
		try
		{
			if (isDead)
				return;

			
			super.setDead();

			if(worldObj.isRemote)
				return;

//			FlansMod.log("EntityBullet.setDead() "+type.shortName + " : "+this);

			
			
			
			
			
			
			
			if(type.fireRadius > 0)
			{
				for(float i = -type.fireRadius; i < type.fireRadius; i++)
				{
					for(float k = -type.fireRadius; k < type.fireRadius; k++)
					{
						for(int j = -1; j < 1; j++)
						{
							if (worldObj.getBlock((int)(posX + i), (int)(posY + j), (int)(posZ + k)).getMaterial() == Material.air)
							{
								worldObj.setBlock((int)(posX + i), (int)(posY + j), (int)(posZ + k), Blocks.fire);
							}
						}
					}
				}
			}
			//Send flak packet
		//	if(type.flak > 0)
		//		FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
			// Drop item on hitting if bullet requires it
			if (type.dropItemOnHit != null)
			{
				String itemName = type.dropItemOnHit;
				int damage = 0;
				if (itemName.contains("."))
				{
					damage = Integer.parseInt(itemName.split("\\.")[1]);
					itemName = itemName.split("\\.")[0];
				}
				ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
				entityDropItem(dropStack, 1.0F);
			}
		}
		catch(Exception e)
		{
//			FlansMod.log("EntityBullet.setDead() Error ("+this+")");
			if(FlansMod.printStackTrace)
			{
				e.printStackTrace();
			}
		}
	}
	
	public float moveToTarget(float current, float target, float speed)
	{	

		float pitchToMove = (float)((Math.sqrt(target*target)) - Math.sqrt((current*current)));
		for(; pitchToMove > 180F; pitchToMove -= 360F) {}
		for(; pitchToMove <= -180F; pitchToMove += 360F) {}
		
		float signDeltaY = 0;
		if(pitchToMove > speed){
			signDeltaY = 1;
		} else if(pitchToMove < -speed){
			signDeltaY = -1;
		} else {
			signDeltaY = 0;
			return target;
		}
		
		
		if(current > target)
		{
			current = current - speed;
		}
		
		else if(current < target)
		{
			current = current + speed;
		}
		
		
		
		return current;
	}



	public void detonate()
	{
		//Do not detonate before grenade is primed
		if(ticksExisted < type.primeDelay)
			return;

		/*if(lockedOnTo != null)
		if(lockedOnTo instanceof EntityDriveable){
			EntityDriveable entPlane = (EntityDriveable)lockedOnTo;
			entPlane.isLockedOn = false;
		}*/

		//Stop repeat detonations
		if(detonated)
			return;
		detonated = true;
		
		//angel trigger
		if(type.angel)
			DeploySubmunitions();

		//Play detonate sound
		PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.detonateSound, true);

		//Explode
		if(!worldObj.isRemote && type.explosionRadius > 0.1F)
		{
	        if((owner instanceof EntityPlayer))
	        {
	        	if(!worldObj.isRemote)
	        	new FlansModExplosion(worldObj, this, (EntityPlayer)owner, type, posX, posY, posZ,
		        		type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks,
		        		type.explosionDamageVsLiving, type.explosionDamageVsPlayer, type.explosionDamageVsPlane, type.explosionDamageVsVehicle, type.smokeParticleCount, type.debrisParticleCount);
	        	isDead = true;
	        }
	        else
	        {
	        	if(!worldObj.isRemote)
	        	worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks);
	        	isDead = true;
	        }
		}
		

		
		
	//labjac revives classic explosions	
		if(!worldObj.isRemote && type.classicExplosionRadius > 0.1F)
	        {
	        	worldObj.createExplosion(this, posX, posY, posZ, type.classicExplosionRadius, type.explosionBreaksBlocks);
	        	isDead = true;
	        }
		
		

		//Make fire
		if(!worldObj.isRemote && type.fireRadius > 0.1F)
		{
			for(float i = -type.fireRadius; i < type.fireRadius; i++)
			{
				for(float j = -type.fireRadius; j < type.fireRadius; j++)
				{
					for(float k = -type.fireRadius; k < type.fireRadius; k++)
					{
						int x = MathHelper.floor_double(i + posX);
						int y = MathHelper.floor_double(j + posY);
						int z = MathHelper.floor_double(k + posZ);
						if(i * i + j * j + k * k <= type.fireRadius * type.fireRadius && worldObj.getBlock(x, y, z) == Blocks.air && rand.nextBoolean())
						{
							worldObj.setBlock(x, y, z, Blocks.fire, 0, 3);
						}
					}
				}
			}
		}

		//Make explosion particles
		for(int i = 0; i < type.explodeParticles; i++)
		{
			worldObj.spawnParticle(type.explodeParticleType, posX, posY, posZ, rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian());
		}

		//Drop item upon detonation, after explosions and whatnot
		if(!worldObj.isRemote && type.dropItemOnDetonate != null)
		{
			String itemName = type.dropItemOnDetonate;
			int damage = 0;
			if (itemName.contains("."))
			{
				damage = Integer.parseInt(itemName.split("\\.")[1]);
				itemName = itemName.split("\\.")[0];
			}
			ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
			entityDropItem(dropStack, 1.0F);
		}
	}
	public boolean ciwsCheck() {
		// TODO Auto-generated method stub
		if (type.CIWSable)
			return true;
		return CIWSable;
	}
	
	public boolean ciwserCheck() {
		// so only actual ciwsguns can ciws
		if (type.CIWSer)
			return true;
		return CIWSer;
	}


	//allah ciws
	@Override
	public boolean attackEntityFrom(DamageSource source, float f)
	{
		//if(type.CIWSable)
		return type.CIWSable;
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound tag)
	{
		if(type == null)
		{
			FlansMod.log("EntityBullet.writeEntityToNBT() Error: BulletType is null ("+this+")");
			setDead();
			return;
		}
		tag.setString("type", type.shortName);
		if (owner == null)
			tag.setString("owner", "null");
		else
			tag.setString("owner", owner.getCommandSenderName());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound tag)
	{
		String typeString = tag.getString("type");
		String ownerName = tag.getString("owner");

		if (typeString != null)
			type = BulletType.getBullet(typeString);

		if(type == null)
		{
//			FlansMod.log("EntityBullet.readEntityFromNBT() Error: BulletType is null ("+this+")");
			this.isDead = true;
			return;
		}

		if(type.despawnTime <= 0)
		{
			this.isDead = true;
		}

		if (ownerName != null && !ownerName.equals("null"))
			owner = FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().func_152612_a(ownerName);
	}

	@Override
	public float getShadowSize()
	{
		return type.hitBoxSize;
	}

	public void setSubmunitionDelay()
	{
		submunitionDelay = type.subMunitionTimer;
		hasSetSubDelay = true;
	}
	
	//labjac radar shoehorn
	
	public void setRadar()
	{
		entityMissileRadarVisible = type.missileRadarVisible;
	}

	public void DeploySubmunitions()
	{
		ItemShootable itemShootable = (ItemShootable)GameRegistry.findItem(FlansMod.MODID, type.submunition);
		ShootableType shootType = itemShootable.type;
		World world = worldObj;
		EntityLivingBase entityplayer = (EntityLivingBase)owner;
		
		
		//angel submunition
		if(!type.angel)
		{
		for(int sm = 0; sm < type.numSubmunitions; sm++)
		{
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(motionX, motionY, motionZ),
					entityplayer,
					type.submunitionSpread,
					damage,
					speedA,
					0,
					firedFrom));
		}
		}
		
		if(type.angel)
		{
			/*
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(0, 8, 0),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
					*/
			
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(8, 0, 0),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(0, 0, 8),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			/*
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(0, -8, 0),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
					*/
			
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(-8, 0, 0),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(0, 0, -8),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(-8, 8, 0),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(-8, 0, 8),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(-8, 8, 8),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			/*
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(8, -8, 0),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			*/
			
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(8, 0, 8),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			/*
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(8, -8, 8),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			*/
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(8, 8, 0),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(8, 0, -8),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(8, 8, -8),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(8, 8, 8),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			/*
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(-8, -8, -8),
					entityplayer,
					type.submunitionSpread,
					damage,
					type.angelSpeed,
					0,
					firedFrom));
			*/
		}
		//end of angel submunition

		if(type.destroyOnDeploySubmunition)
		{
			detonate();
		}
	}

	public int getBrightnessForRender(float par1)
	{
		if(type.hasLight)
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

	@Override
	public void writeSpawnData(ByteBuf data)
	{
		data.writeDouble(motionX);
		data.writeDouble(motionY);
		data.writeDouble(motionZ);
		data.writeInt(impactX);
		data.writeInt(impactY);
		data.writeInt(impactZ);
		data.writeInt(lockedOnTo == null ? -1 : lockedOnTo.getEntityId());
		ByteBufUtils.writeUTF8String(data, type.shortName);
		if (owner == null)
			ByteBufUtils.writeUTF8String(data, "null");
		else
			ByteBufUtils.writeUTF8String(data, owner.getCommandSenderName());
	}

	@Override
	public void readSpawnData(ByteBuf data)
	{
		try
		{
			motionX = data.readDouble();
			motionY = data.readDouble();
			motionZ = data.readDouble();
			impactX = data.readInt();
			impactY = data.readInt();
			impactZ = data.readInt();
			int lockedOnToID = data.readInt();
			if(lockedOnToID != -1)
				lockedOnTo = worldObj.getEntityByID(lockedOnToID);
			type = BulletType.getBullet(ByteBufUtils.readUTF8String(data));
			penetratingPower = type.penetratingPower;
			

			
			String name = ByteBufUtils.readUTF8String(data);
			for(Object obj : worldObj.loadedEntityList)
			{
				if(((Entity)obj).getCommandSenderName().equals(name))
					owner = (EntityPlayer)obj;
			}
		}
		catch(Exception e)
		{
			FlansMod.log("Failed to read bullet owner from server.");
			super.setDead();
			e.printStackTrace();
		}
	}

	@Override
    public boolean isBurning()
    {
    	return false;
    }
}