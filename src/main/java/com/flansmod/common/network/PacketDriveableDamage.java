package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;

public class PacketDriveableDamage extends PacketBase
{
	public int entityId;
	public short[] health;
	public short[] crew;
	public boolean[] onFire;
	
	public PacketDriveableDamage() 
	{
    	health = new short[EnumDriveablePart.values().length];
    	crew = new short[EnumDriveablePart.values().length];
    	onFire = new boolean[EnumDriveablePart.values().length];
	}
	
	public PacketDriveableDamage(EntityDriveable driveable)
	{
    	entityId = driveable.getEntityId();
    	health = new short[EnumDriveablePart.values().length];
    	crew = new short[EnumDriveablePart.values().length];
    	onFire = new boolean[EnumDriveablePart.values().length];
    	for(int i = 0; i < EnumDriveablePart.values().length; i++)
    	{
    		EnumDriveablePart ep = EnumDriveablePart.values()[i];
    		DriveablePart part = driveable.getDriveableData().parts.get(ep);
    		health[i] = (short)part.health;
    		crew[i] = (short)part.crew;
    		onFire[i] = part.onFire;
    	}
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
    	data.writeInt(entityId);
    	for(int i = 0; i < EnumDriveablePart.values().length; i++)
    	{
    		data.writeShort(health[i]);
    		data.writeShort(crew[i]);
    		data.writeBoolean(onFire[i]);
    	}
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		entityId = data.readInt();
    	for(int i = 0; i < EnumDriveablePart.values().length; i++)
    	{
    		health[i] = data.readShort();
    		crew[i] = data.readShort();
    		onFire[i] = data.readBoolean();
    	}
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		FlansMod.log("Driveable damage packet received on server. Skipping.");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		EntityDriveable driveable = null;
		for(Object obj : clientPlayer.worldObj.loadedEntityList)
		{
			if(obj instanceof EntityDriveable && ((Entity)obj).getEntityId() == entityId)
			{
				driveable = (EntityDriveable)obj;
				break;
			}
		}
		if(driveable != null)
		{
        	for(int i = 0; i < EnumDriveablePart.values().length; i++)
        	{
        		EnumDriveablePart ep = EnumDriveablePart.values()[i];
        		DriveablePart part = driveable.getDriveableData().parts.get(ep);
        		part.health = health[i];
        		part.crew = crew[i];
        		part.onFire = onFire[i];
        	}
		}
	}
}
