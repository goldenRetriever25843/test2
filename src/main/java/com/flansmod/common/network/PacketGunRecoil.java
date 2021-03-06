package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;


//Packets must be registered in .network.PacketHandler!
public class PacketGunRecoil extends PacketBase 
{
	
	public float recoilPitch;
	public float recoilYaw;
	public float decreaseRecoilPitch;
	public float decreaseRecoilYaw;
	public float sustainedRecoilPitch;
	public float sustainedRecoilYaw;

	
	public PacketGunRecoil()
	{

	}
	
	public PacketGunRecoil(float recoilPitch, float recoilYaw, float decreaseRecoilPitch, float decreaseRecoilYaw, float sustainedRecoilPitch, float sustainedRecoilYaw)
	{
		this.recoilPitch = recoilPitch;
		this.recoilYaw = recoilYaw;
		this.decreaseRecoilPitch = decreaseRecoilPitch;
		this.decreaseRecoilYaw = decreaseRecoilYaw;
		this.sustainedRecoilPitch = sustainedRecoilPitch;
		this.sustainedRecoilYaw = sustainedRecoilYaw;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeFloat(recoilPitch);
		data.writeFloat(recoilYaw);
		data.writeFloat(decreaseRecoilPitch);
		data.writeFloat(decreaseRecoilYaw);
		data.writeFloat(sustainedRecoilPitch);
		data.writeFloat(sustainedRecoilYaw);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		recoilPitch = data.readFloat();
		recoilYaw = data.readFloat();
		decreaseRecoilPitch = data.readFloat();
		decreaseRecoilYaw = data.readFloat();
		sustainedRecoilPitch = data.readFloat();
		sustainedRecoilYaw = data.readFloat();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		if(!clientPlayer.isSneaking())
		{
			FlansModClient.playerRecoilPitch += recoilPitch;
			FlansModClient.playerRecoilYaw += recoilYaw;

			FlansModClient.sustainedRecoilPitch = sustainedRecoilPitch;
			FlansModClient.sustainedRecoilYaw = sustainedRecoilYaw;
			
			//for sustained recoil conversion
			if (FlansModClient.peepee<100)
			FlansModClient.peepee += 15;
			
			//for dill and wally to stfu about going up
			if (FlansModClient.poopoo<4)
			FlansModClient.poopoo += 2;
		}
		else
		{
			FlansModClient.playerRecoilPitch += recoilPitch / decreaseRecoilPitch;
			FlansModClient.playerRecoilYaw += recoilYaw / decreaseRecoilYaw;
			FlansModClient.sustainedRecoilPitch = sustainedRecoilPitch / decreaseRecoilPitch;
			FlansModClient.sustainedRecoilYaw = sustainedRecoilYaw / decreaseRecoilYaw;
			if (FlansModClient.peepee<100)
				FlansModClient.peepee += 9;
			if (FlansModClient.poopoo<4)
				FlansModClient.poopoo += 1;
		}
		//FlansMod.log("Recoil packet received");
	}
}
