package com.hfr.clowder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.flansmod.common.network.PacketPlaySound;
import com.hfr.blocks.BlockDummyable;
import com.hfr.blocks.ModBlocks;
import com.hfr.command.CommandClowder;
import com.hfr.data.ClowderData;
import com.hfr.main.MainRegistry;
import com.hfr.tileentity.prop.TileEntityProp;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

//it's like a faction
//but with cats!
public class Clowder {

	public String uuid;
	public String name;
	public String motd;
	public ClowderFlag flag;
	public int color;
	
	public int homeX;
	public int homeY;
	public int homeZ;
	public HashMap<String, int[]> warps = new HashMap();
	
	//for war delcaration system labjac punjab
	public Clowder enemy = null;
	
	//for paying tribute
	public Clowder suzerain = null;
	public Set<String> dickSuckers = new HashSet();
	
	public String leader;
	public Set<String> officers = new HashSet();
	public HashMap<String, Long> members = new HashMap();
	public Set<String> applications = new HashSet();
	public int flags = 0;
	
	public static List<Clowder> clowders = new ArrayList();
	public static HashMap<String, Clowder> inverseMap = new HashMap();
	public static HashSet<String> retreating = new HashSet();
	public static HashMap<Long, ScheduledTeleport> teleports = new HashMap();

	//because we can't have ANYTHING nice
	private float prestige = 0;
	private float prestigeGen = 0;
	private float prestigeReq = 0;
	private float fabricateTime = 0;
	private float canDeclareTime = 0;
	private float warTime = 0;
	
	//for pussying out system
	public boolean targeted = false;

	public static final float tentRate = 0.1F;
	public static final float statueRate = 0.5F;
	public static final float flagRate = 0.1F;
	public static final float flagReq = 1.0F;
	
	public boolean addMember(World world, String name) {
		
		if(world.getPlayerEntityByName(name) == null)
			return false;
		
		if(inverseMap.containsKey(name) || members.get(name) != null)
			return false;
		
		members.put(name, time());
		inverseMap.put(name, this);
		
		ClowderData.getData(world).markDirty();
		
		return true;
	}
	
	public boolean removeMember(World world, String name) {

		if(!inverseMap.containsKey(name) && members.get(name) == null)
			return false;
		
		members.remove(name);
		officers.remove(name);
		inverseMap.remove(name);

		ClowderData.getData(world).markDirty();
		
		return true;
	}
	
	public boolean transferOwnership(World world, String key) {

		if(members.get(key) == null)
			return false;
		
		officers.remove(key);
		leader = key;
		ClowderData.getData(world).markDirty();
		
		return true;
	}
	
	public void promote(World world, String name) {
		
		if(!members.containsKey(name))
			return;
		
		officers.add(name);
		this.save(world);
	}
	
	public void demote(World world, String name) {
		
		if(!members.containsKey(name))
			return;
		
		officers.remove(name);
		this.save(world);
	}
	
	public int getPermLevel(String name) {
		
		if(this.leader.equals(name))
			return 3;
		
		if(this.officers.contains(name))
			return 2;
		
		if(this.members.get(name) != null)
			return 1;
		
		return 0;
		
	}
	
	public void setHome(double x, double y, double z, EntityPlayer player) {
		
		this.homeX = (int)x;
		this.homeY = (int)y;
		this.homeZ = (int)z;
		
		ClowderData.getData(player.worldObj).markDirty();
	}
	
	public void rename(String name, EntityPlayer player) {
		
		this.name = name;
		
		ClowderData.getData(player.worldObj).markDirty();
	}
	
	public void setMotd(String motd, EntityPlayer player) {
		
		this.motd = motd;
		
		ClowderData.getData(player.worldObj).markDirty();
	}
	
	public void setColor(int color, EntityPlayer player) {
		
		this.color = color;
		
		ClowderData.getData(player.worldObj).markDirty();
	}
	
	public void save(World world) {
		
		if(world == null)
			return;
		ClowderData.getData(world).markDirty();
	}
	
	public String getDecoratedName() {
		
		String n = this.name.replace("_", " ").trim();

		if(getPrestige() < 25)
			n += " - Unorganized Mob";
		else if(getPrestige() < 50)
			n += " - Clan";
		else if(getPrestige() < 75)
			n += " - Tribe";
		else if(getPrestige() < 100)
			n += " - Chiefdom";
		else if(getPrestige() < 125)
			n += " - City-State";
		else if(getPrestige() < 150)
			n += " - Shiekhdom";
		else if(getPrestige() < 250)
			n += " - Emirate";
		else if(getPrestige() < 500)
			n += " - Sultanate";
		else if(getPrestige() < 750)
			n += " - Empire";
		/*
		else if(getPrestige() < 1000)
			n += " - Caliphate";
		else if(getPrestige() < 10000)
			n += " - Caliphate";
		*/
		else
			n += " - Caliphate";
		
		return n;
	}
	
	//0 - created
	//1 - not home
	//2 - no tent
	public int tryAddWarp(EntityPlayer player, int x, int y, int z, String name) {
		
		World world = player.worldObj;
		
		if(!ClowderTerritory.isPlayerHome(player))
			return 1;
		
		Clowder clowder = Clowder.getClowderFromPlayer(player);
		
		for(int i = 2; i <= 5; i++) {
			
			ForgeDirection dir = ForgeDirection.getOrientation(i);
			
			Block block = world.getBlock(x + dir.offsetX * 2, y, z + dir.offsetZ * 2);
			
			if(block == ModBlocks.tp_tent) {
				
				int[] pos = ((BlockDummyable)ModBlocks.tp_tent).findCore(world, x + dir.offsetX * 2, y, z + dir.offsetZ * 2);
				
				if(pos != null) {
					
					TileEntityProp tent = (TileEntityProp)world.getTileEntity(pos[0], pos[1], pos[2]);
					
					if(tent.warp.isEmpty() && tent.operational()) {

						tent.warp = name;
						tent.markDirty();
						
						clowder.warps.put(name, new int[] {x, y + 1, z});
						
						ClowderData.getData(world).markDirty();
						return 0;
					}
				}
			}
		}
		
		return 2;
	}
	
	public boolean isOwner(EntityPlayer player) {
		
		String key = player.getDisplayName();
		
		return this.leader.equals(key);
	}
	
	public boolean disbandClowder(EntityPlayer player) {
		
		if(!isOwner(player))
			return false;
		
		clowders.remove(this);
		recalculateIMap();
		this.leader = "";
		
		ClowderData.getData(player.worldObj).markDirty();
		
		return true;
		
	}
	
	public boolean disbandClowder(World world) {
		
		clowders.remove(this);
		recalculateIMap();
		this.leader = "";
		this.members.clear();
		
		ClowderData.getData(world).markDirty();
		
		return true;
		
	}
	
	public boolean valid() {
		return this.leader != "" && clowders.contains(this);
	}
	
	public boolean isRaidable() {
		
		if(MainRegistry.freeRaid)
			return true;
		
		int online = 0;
		int members = this.members.size();
		
		for(String s : this.members.keySet()) {
			
			Long l = this.members.get(s);
			
			if(l > System.currentTimeMillis())
				online++;
		}

		if(members >= 6)
			return online >= 3;
			
		if(members >= 3)
			return online >= 2;
			
		return online >= 1;
	}
	
	public int getPlayersOnline() {
		
		int online = 0;
		int members = this.members.size();
		
		for(String s : this.members.keySet()) {
			
			Long l = this.members.get(s);
			
			if(l > System.currentTimeMillis())
				online++;
		}

		return online;
	}
	
	//cohesion my fucking balls
	//if i want a math utility in my clowder class i'll fucking have one
	public static String round(float f) {
		
		return "" + Math.floor(f * 10D) / 10D;
	}
	
	public float getPrestige() {
		return prestige;
	}
	
	public float getPrestigeGen() {
		return prestigeGen;
	}
	
	public float getPrestigeReq() {
		return prestigeReq;
	}
	
	public void addPrestige(float f, World world) {
		prestige += f;
		
		if(prestige < 1)
			prestige = 1F;
		
		this.save(world);
	}
	
	public void addPrestigeGen(float f, World world) {
		prestigeGen += f;
		
		if(prestigeGen < 0)
			prestigeGen = 0F;
		
		this.save(world);
	}
	
	public void addPrestigeReq(float f, World world) {
		prestigeReq += f;
		
		if(prestigeReq < 0)
			prestigeReq = 0F;
		
		this.save(world);
	}
	
	public void multPrestige(float f, World world) {
		prestige *= f;
		prestige = (float)(Math.floor(prestige * 10D) / 10D);
		
		if(prestige < 1)
			prestige = 1F;
		
		this.save(world);
	}
	
	
	//war declare system
	public float getFabricatetime() {
		return fabricateTime;
	}
	
	
	public float getWartime() {
		return warTime;
	}
	
	public float getCanDeclareTime() {
		return canDeclareTime;
	}
	
	public void addWarTime(float f, World world) {
		warTime += f;
		
		if(warTime < 0)
			warTime = 0F;
		
		this.save(world);
	}
	
	public void addFabricateTime(float f, World world) {
		fabricateTime += f;
		
		if(fabricateTime < 0)
			fabricateTime = 0F;
		
		this.save(world);
	}
	
	//for cancelling wars/fabrications
	public void pussy(World world) {
		fabricateTime = 0;
		canDeclareTime = 0;
		enemy = null;
		warTime = 0;
		
		this.save(world);
	}
	
	public void addCanDeclareTime(float f, World world) {
		canDeclareTime += f;
		
		if(canDeclareTime < 0)
			canDeclareTime = 0F;
		
		this.save(world);
	}
	
	//fabrication time ends, you get 10 minutes to declare war
	public void endFabricateTime(World world) {
		fabricateTime = 0;
		canDeclareTime = 181;
		
		this.save(world);
	}
	
	//declaration time ends, you missed the 10 minutes pussy
	public void endDeclareTime(World world) {
		fabricateTime = 0;
		canDeclareTime = 0;
		
		this.save(world);
	}
	
	//war time ends
	public void endWarTime(World world) {
		warTime = 0;
		
		this.save(world);
	}
	
	public void saveClowder(int i, NBTTagCompound nbt) {
		nbt.setString(i + "_uuid", this.uuid);
		nbt.setString(i + "_name", this.name);
		nbt.setString(i + "_motd", this.motd);
		nbt.setInteger(i + "_flag", this.flag.ordinal());
		nbt.setInteger(i + "_color", this.color);
		nbt.setInteger(i + "_homeX", this.homeX);
		nbt.setInteger(i + "_homeY", this.homeY);
		nbt.setInteger(i + "_homeZ", this.homeZ);
		nbt.setFloat(i + "_prestige", this.prestige);
		nbt.setFloat(i + "_prestigeGen", this.prestigeGen);
		nbt.setFloat(i + "_prestigeReq", this.prestigeReq);
		nbt.setInteger(i + "_flags", this.flags);
		nbt.setFloat(i + "_fabricateTime", this.fabricateTime);
		nbt.setFloat(i + "_warTime", this.warTime);
		nbt.setFloat(i + "_canDeclareTime", this.canDeclareTime);

		nbt.setString(i + "_leader", this.leader);
		nbt.setInteger(i + "_members", this.members.size());
		nbt.setInteger(i + "_officers", this.officers.size());
		nbt.setInteger(i + "_warps", this.warps.size());
		
		/// SAVE MEMBERS ///
		for(int j = 0; j < this.members.keySet().size(); j++)
			nbt.setString(i + "_" + j, (String) this.members.keySet().toArray()[j]);
		
		/// SAVE OFFICERS ///
		for(int j = 0; j < this.officers.size(); j++)
			nbt.setString(i + "_" + j + "_off", (String) this.officers.toArray()[j]);
		
		/// SAVE WARPS ///
		for(int j = 0; j < this.warps.keySet().size(); j++) {

			String name = (String) this.warps.keySet().toArray()[j];
			int[] coords = this.warps.get(name);

			nbt.setString(i + "_" + j + "_name", name);
			nbt.setInteger(i + "_" + j + "_x", coords[0]);
			nbt.setInteger(i + "_" + j + "_y", coords[1]);
			nbt.setInteger(i + "_" + j + "_z", coords[2]);
		}
	}
	
	public static Clowder loadClowder(int i, NBTTagCompound nbt) {
		
		Clowder c = new Clowder();
		
		c.uuid = nbt.getString(i + "_uuid");
		
		if(c.uuid.isEmpty())
			c.uuid = UUID.randomUUID().toString();
		
		c.name = nbt.getString(i + "_name");
		c.motd = nbt.getString(i + "_motd");
		c.flag = ClowderFlag.values()[nbt.getInteger(i + "_flag")];
		c.color = nbt.getInteger(i + "_color");
		c.homeX = nbt.getInteger(i + "_homeX");
		c.homeY = nbt.getInteger(i + "_homeY");
		c.homeZ = nbt.getInteger(i + "_homeZ");
		c.prestige = Math.max(nbt.getFloat(i + "_prestige"), 1F);
		c.canDeclareTime = Math.max(nbt.getFloat(i + "_canDeclareTime"), 1F);
		c.fabricateTime = Math.max(nbt.getFloat(i + "_fabricateTime"), 1F);
		c.warTime = Math.max(nbt.getFloat(i + "_warTime"), 1F);
		c.prestigeGen = Math.max(nbt.getFloat(i + "_prestigeGen"), 0F);
		c.prestigeReq = Math.max(nbt.getFloat(i + "_prestigeReq"), 0F);
		c.flags = nbt.getInteger(i + "_flags");

		c.leader = nbt.getString(i + "_leader");
		int count = nbt.getInteger(i + "_members");
		int co = nbt.getInteger(i + "_officers");
		int cwarp = nbt.getInteger(i + "_warps");
		
		for(int j = 0; j < count; j++)
			c.members.put(nbt.getString(i + "_" + j), time());
		
		for(int j = 0; j < co; j++)
			c.officers.add(nbt.getString(i + "_" + j + "_off"));
		
		for(int j = 0; j < cwarp; j++) {
			
			String name = nbt.getString(i + "_" + j + "_name");
			int[] coord = new int[] {
					nbt.getInteger(i + "_" + j + "_x"),
					nbt.getInteger(i + "_" + j + "_y"),
					nbt.getInteger(i + "_" + j + "_z")
			};
			
			c.warps.put(name, coord);
		}
		
		return c;
	}
	
	public void notifyLeader(World world, ChatComponentText message) {

		notifyPlayer(world, this.leader, message);
	}
	
	public void notifyAll(World world, ChatComponentText message) {

		for(String player : this.members.keySet()) {
			notifyPlayer(world, player, message);
		}
	}
	
	
	/* failure    for pinging everyone with sounds
	public void soundAll(World world, String sound) {

		for(String player : this.members.keySet()) {
			EntityPlayer notif = world.getPlayerEntityByName(player);
			
			//world.playSoundEffect(notif.posX, notif.posY, notif.posZ, "hfr:item.hoiFabrication", 2.0F, 1.0F);
			//xddd fuck it ill use flansmod sound packet
			PacketPlaySound.sendSoundPacket(notif.posX, notif.posY, notif.posZ, 10f, notif.dimension, "hfr:item.hoiFabrication", false);
		}
	}
	*/
	
	
	
	public void notifyPlayer(World world, String player, ChatComponentText message) {

		EntityPlayer notif = world.getPlayerEntityByName(player);
		
		if(notif != null) {
			notif.addChatMessage(message);
		}
	}
	
	public void notifyCapture(World world, int x, int z, String type) {

		notifyAll(world, new ChatComponentText(EnumChatFormatting.RED + "One of your " + type + " at X:" + x + " / Z:" + z + " is under attack!"));
		
		if(!warps.isEmpty()) {
			
			double dist = Double.POSITIVE_INFINITY;
			String closest = "";
			
			for(String key : warps.keySet()) {
				
				int[] pos = warps.get(key);
				
				if(pos != null) {
					
					double d = Math.sqrt(Math.pow(x - pos[0], 2) + Math.pow(z - pos[2], 2));
					
					if(d < dist) {
						dist = d;
						closest = key;
					}
				}
			}

			notifyAll(world, new ChatComponentText(EnumChatFormatting.RED + "Your closest warp is " + closest + " (" + ((int)dist) + "m)"));
		}
	}
	
	/// GLOBAL METHODS ///
	public static void recalculateIMap() {
		
		inverseMap.clear();
		
		for(Clowder clowder : clowders) {
			for(String member : clowder.members.keySet()) {
				inverseMap.put(member, clowder);
			}
		}
	}
	
	public static void readFromNBT(NBTTagCompound nbt) {
		
		clowders.clear();
		
		int count = nbt.getInteger("clowderCount");
		
		for(int i = 0; i < count; i++)
			clowders.add(loadClowder(i, nbt));
		
		recalculateIMap();
	}
	
	public static void writeToNBT(NBTTagCompound nbt) {
		
		nbt.setInteger("clowderCount", clowders.size());

		for(int i = 0; i < clowders.size(); i++)
			clowders.get(i).saveClowder(i, nbt);
	}
	
	public static boolean areFriends(EntityPlayer player1, EntityPlayer player2) {

		if(player1 == null)
			return false;
		if(player2 == null)
			return false;

		Clowder c1 = getClowderFromPlayer(player1);
		Clowder c2 = getClowderFromPlayer(player2);
		
		if(c1 == null)
			return false;
		
		return c1 == c2;
	}
	
	public static Clowder getClowderFromPlayer(EntityPlayer player) {
		
		return getClowderFromPlayerName(player.getDisplayName());
	}
	
	public static Clowder getClowderFromPlayerName(String key) {
		
		return inverseMap.get(key);
	}
	
	public static Clowder getClowderFromName(String name) {

		name = name.toLowerCase();
		
		for(Clowder clowder : clowders) {
			if(clowder.name.toLowerCase().equals(name))
				return clowder;
		}
		
		return null;
	}
	
	public static Clowder getClowderFromUUID(String uuid) {

		uuid = uuid.toLowerCase();
		
		for(Clowder clowder : clowders) {
			if(clowder.uuid.toLowerCase().equals(uuid))
				return clowder;
		}
		
		return null;
	}
	
	public static void createClowder(EntityPlayer player, String name) {

		String leader = player.getDisplayName();
		
		Clowder c = new Clowder();
		
		c.uuid = UUID.randomUUID().toString();
		c.name = name;
		c.leader = leader;
		c.members.put(leader, time());
		c.color = player.getRNG().nextInt(0x1000000);
		c.setHome(player.posX, player.posY, player.posZ, player);
		
		c.motd = "Message of the day!";
		c.flag = ClowderFlag.TRICOLOR;
		
		c.prestige = 1;
		
		clowders.add(c);
		inverseMap.put(leader, c);
		
		ClowderData.getData(player.worldObj).markDirty();
	}
	
	//the thing that adds prestige to prestige bank - allah note
	public static void updatePrestige(World world) {

		for(Clowder clowder : clowders) {
			
			if(clowder.valid()) {
				
				float prestige = clowder.getPrestigeGen();
							
				
				//multiplication prestige decay thing allah bookmark
				prestige *= (float)Math.pow(0.99, clowder.getPrestige());
				
				//if you are not a tributary, use normal prestige adding
				if(clowder.suzerain == null)
				clowder.addPrestige(prestige, world);
				
				else
				{
					//lose half of your prestige gen if you are a tributary. your master gets 1/4, and the other 1/4 is lost due to corruption or whatever
					clowder.addPrestige((float)(prestige/2f), world);
					clowder.suzerain.addPrestige((float)(prestige/4f), world);
					clowder.suzerain.notifyAll(world, new ChatComponentText(CommandClowder.TITLE + "We have received " + (float)prestige/4f + " extra prestige as tribute from " + clowder.name));
					clowder.notifyAll(world, new ChatComponentText(CommandClowder.TITLE + "We have lost " + (float)prestige/2f + " prestige because we are a tributary to " + clowder.suzerain.name));
				}
			}
		}
	}
	
	
	//minute timer for war declarations and war timer
	public static void updateWars(World world) {

		for(Clowder clowder : clowders) {
			
			//actually nvm send the message every 3 minutes
			boolean isDivisibleBy5fab = clowder.getFabricatetime() % 5 == 0;
			
			
			
			if(clowder.getFabricatetime() > -1 && (clowder.enemy)!=null && clowder.getWartime() <= 0 && clowder.getCanDeclareTime() <= 0)
			{
			//float fabricateTime = clowder.getFabricatetime();
			
			//fabricateTime *= (float)Math.pow(0.99, clowder.getFabricatetime());

				//spam message per minute during last 5 min
				if(clowder.getFabricatetime()<5 && clowder.getFabricatetime()>2)
				{
				clowder.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "War declaration will be ready in " + (int)(clowder.getFabricatetime()-2) + " minutes!"));
				clowder.enemy.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + clowder.name + " will be able to attack us in " + (int)(clowder.getFabricatetime()-2) + " minute(s)!"));
				}
			clowder.addFabricateTime(-1, world);
			}
			
			
			if (isDivisibleBy5fab)
			{
			//fabricate timer countdown per minute
			if(clowder.valid()) 
			{
				if(clowder.getFabricatetime() > -1 && (clowder.enemy)!=null)
				{
				//float fabricateTime = clowder.getFabricatetime();
				
				//fabricateTime *= (float)Math.pow(0.99, clowder.getFabricatetime());
				

				clowder.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "War declaration will be ready in " + (int)(clowder.getFabricatetime()-1) + " minutes!"));
				clowder.enemy.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + clowder.name + " will be able to attack us in " + (int)(clowder.getFabricatetime()-1) + " minute(s)!"));
				//if there is enough time to retreat, also suggest retreat to victim
				if(clowder.getFabricatetime() > 10)
				clowder.enemy.notifyAll(world, new ChatComponentText(CommandClowder.TITLE + "Officers can use /c retreat to try to cancel this attack!"));
			}
			}
			}
			
			if(clowder.enemy == null)
			{
clowder.pussy(world);
			}
			
			
			
			//if fabricate time is 1 minute left be ready for war      added extra enemy null check to prevent random declarations ready generating for free
			if(clowder.valid() && clowder.getFabricatetime() > -1 && clowder.getFabricatetime() <= 1.5 && clowder.enemy != null)
			{
				//10 minutes you can instantly start war and fabricate timer is set to 0, nvm changed to 3 hours per hungary suggestion
				clowder.endFabricateTime(world);
				clowder.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "War declaration is ready! Officers can /c declare for the next 3 hours!"));
			}
			
			//when war timer ends
			if(clowder.valid() && clowder.getWartime() > -1 && clowder.getWartime() <= 1.5 && (clowder.enemy)!=null && clowder.getCanDeclareTime() == 0 && clowder.getFabricatetime() == 0)
			{
				//war ended
				clowder.endWarTime(world);
				clowder.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "The war period has ended! Pack it up boys!"));
				clowder.enemy.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + clowder.name + "'s war against us has ended!"));
				//unmarks victim as being targeted
				clowder.enemy.targeted = false;
				//unmarks victim as being the attacker's target
				clowder.enemy = null;
				
			}
			
			//didnt declare war within the 10 minutes
			if(clowder.valid() && clowder.getCanDeclareTime() > 0 && clowder.getCanDeclareTime() <= 1.5 && (clowder.enemy)!=null)
			{
				//you missed the 10 minutes
				clowder.endDeclareTime(world);
				clowder.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "Too late! War fabrication has expired!"));
				clowder.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "We also get most of our prestige back!"));
				clowder.enemy.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + clowder.name + "'s war fabrication against us has expired!"));
				clowder.addPrestige(MainRegistry.fabricateCost*0.9f, world);
				
				//target is no longer enemy
				clowder.enemy = null;
			}
			
			
			
			//war time ticker
			if(clowder.valid() && clowder.getWartime() > 0 && (clowder.enemy)!=null) {
				
				//float fabricateTime = clowder.getWartime();
				
				//fabricateTime *= (float)Math.pow(0.99, clowder.getFabricatetime());
				
				clowder.addWarTime(-1, world);
				
				
				//if its alst 5 minutes of war ping everyone every minute
				if (clowder.getWartime() > 0 && clowder.getWartime() < 5 )
				{
					clowder.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "War will last for about " + clowder.getWartime() + " more minutes!"));
					clowder.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "War can be extended by using (WIP) but if we take casualties, it will end faster!"));
					clowder.enemy.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + clowder.name + "'s war against us will last for about " + clowder.getWartime() + " more minutes!"));
					clowder.enemy.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "War may be extended if " + clowder.name + " uses (WIP), but we can speed up the war by killing their members!"));
				}
				
				
				//ping everyone about war status every 5 minutes
				boolean isDivisibleBy5 = clowder.getWartime() % 5 == 0;
				
				if (isDivisibleBy5)
		        {
					clowder.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "War will last for about " + clowder.getWartime() + " more minutes!"));
					clowder.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "War can be extended by using (WIP) but if we take casualties, it will end faster!"));
					clowder.enemy.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + clowder.name + "'s war against us will last for about " + clowder.getWartime() + " more minutes!"));
					clowder.enemy.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "War may be extended if " + clowder.name + " uses (WIP), but we can speed up the war by killing their members!"));
		        }
			}
			
			//can declare war time ticks down per minute
			if(clowder.valid() && clowder.getCanDeclareTime() > 0 && clowder.enemy != null) {
				
				//float canDeclareTime = clowder.getWartime();
				
				//fabricateTime *= (float)Math.pow(0.99, clowder.getFabricatetime());
				clowder.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + "Our officers have " + (int)(clowder.getCanDeclareTime()-1) + " minutes to officially declare war with /c declare!"));
				clowder.enemy.notifyAll(world, new ChatComponentText(CommandClowder.CRITICAL + (clowder.name) + " can declare war against us for the next " + (int)(clowder.getCanDeclareTime()-1) + " minutes!"));
				clowder.addCanDeclareTime(-1, world);
			}
			

			
			
		}
	}
	
	public static long time() {
		return System.currentTimeMillis();
	}
	
	public static class ScheduledTeleport {
		
		int posX;
		int posY;
		int posZ;
		String player;
		String warp;
		boolean home;
		
		public ScheduledTeleport(int posX, int posY, int posZ, String player, String warp) {
			this.posX = posX;
			this.posY = posY;
			this.posZ = posZ;
			this.player = player;
			this.warp = warp;
		}
		
		public ScheduledTeleport(int posX, int posY, int posZ, String player, boolean home) {
			this.posX = posX;
			this.posY = posY;
			this.posZ = posZ;
			this.player = player;
			this.home = home;
		}
	}
}
