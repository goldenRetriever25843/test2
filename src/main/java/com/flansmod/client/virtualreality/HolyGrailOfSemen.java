package com.flansmod.client.virtualreality;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class HolyGrailOfSemen extends Entity {

	  public HolyGrailOfSemen(World worldIn) {
		    super(worldIn);
		    setSize(1f, 1.86f);
		    this.ignoreFrustumCheck = true;
		  }
		  
		  public void onUpdate() {
		    EntityPlayer p = Minecraft.getMinecraft().thePlayer;
		    this.posX = p.posX;
		    this.posY = p.posY;
		    this.posZ = p.posZ;
		    super.onUpdate();
		  }

		@Override
		protected void entityInit() {
			// TODO Auto-generated method stub
			
		}

		@Override
		protected void readEntityFromNBT(NBTTagCompound p_70037_1_) {
			// TODO Auto-generated method stub
			
		}

		@Override
		protected void writeEntityToNBT(NBTTagCompound p_70014_1_) {
			// TODO Auto-generated method stub
			
		}

}
