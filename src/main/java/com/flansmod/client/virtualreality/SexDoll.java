package com.flansmod.client.virtualreality;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.ModelCustomArmour;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class SexDoll extends Render {

	ModelBiped biped = new ModelBiped();
	
	@Override
	public void doRender(Entity p_76986_1_, double d, double d1, double d2, float f,
			float f1) {
		if(Minecraft.getMinecraft().gameSettings.thirdPersonView!=0) return;
		GL11.glPushMatrix();
    	EntityClientPlayerMP p = Minecraft.getMinecraft().thePlayer;
    	GL11.glScaled(1, 1, 1);
    	GL11.glRotated(180, 1, 0, 0);
    	GL11.glRotated(Minecraft.getMinecraft().thePlayer.rotationYaw, 0, 1, 0);
    	GL11.glRotated(0, 1, 0, 0);
    	GL11.glTranslated(0, 0.2, 0.4);
    	if(p.isSneaking()) {
    		GL11.glTranslated(0, -0.1, 0);
    	}
    	Minecraft.getMinecraft().renderEngine.bindTexture(p.getLocationSkin());
//    	biped.isChild = false;
    	double motx = p.motionX;
    	double motz = p.motionZ;
    	double xz = Math.sqrt(Math.pow(motx, 2)+Math.pow(motz, 2));
    	if(xz>0.18) xz = 0.18;   
    	
    	
    	//B�PED B�PED B�PED B�PED B�PED B�PED
    	//TODO B�PED
    	biped.bipedLeftArm.rotateAngleX = (float) -(xz*Math.cos(Minecraft.getSystemTime()/100.0)*10);
    	biped.bipedRightArm.rotateAngleX = (float) (xz*Math.cos(Minecraft.getSystemTime()/100.0)*10);
    	biped.bipedLeftArm.rotateAngleZ = (float) Math.cos(Minecraft.getSystemTime()/1000.0+Math.PI)/10-0.2f;
    	biped.bipedRightArm.rotateAngleZ = (float) Math.cos(Minecraft.getSystemTime()/1000.0)/10+0.2f;

    	if(p.isRiding()) {
    		biped.bipedLeftLeg.rotateAngleX = -1.5f;
    		biped.bipedRightLeg.rotateAngleX = -1.5f;
    		biped.bipedLeftLeg.rotateAngleY = -0.3f;
    		biped.bipedRightLeg.rotateAngleY = 0.3f;
    	} else {
    		biped.bipedLeftLeg.rotateAngleY = 0;
    		biped.bipedRightLeg.rotateAngleY = 0;
        	biped.bipedLeftLeg.rotateAngleX = (float) (xz*Math.cos(Minecraft.getSystemTime()/100.0)*10);
        	biped.bipedRightLeg.rotateAngleX = (float) -(xz*Math.cos(Minecraft.getSystemTime()/100.0)*10);
    	}
    	if(p.isSneaking()) {
    		biped.bipedBody.rotateAngleX = 0.3f;
    		GL11.glPushMatrix();
    		GL11.glTranslated(0, 0, 0.25);
         	if(!p.isPotionActive(Potion.invisibility)) {
            	biped.bipedLeftLeg.render(0.0625f);
            	biped.bipedRightLeg.render(0.0625f);
         	}
        	GL11.glPopMatrix();
    	} else {
    		biped.bipedBody.rotateAngleX = 0.0f;
         	if(!p.isPotionActive(Potion.invisibility)) {
            	biped.bipedLeftLeg.render(0.0625f);
            	biped.bipedRightLeg.render(0.0625f);
         	}
    	}
     	if(!p.isPotionActive(Potion.invisibility)) {
        	biped.bipedBody.render(0.0625f);
     	}
 		double swing = p.getSwingProgress(f1);
 		double aa = Math.sin(swing*Math.PI);
 		double bb = Math.sin(swing*Math.PI*2);
// 		if(aa>0) System.out.println(aa);
// 		System.out.println(p.rotationPitch);
 		biped.bipedRightArm.rotateAngleZ+=bb/2;
 		biped.bipedRightArm.rotateAngleX-=aa*1.5;
    	if(p.getHeldItem()!=null) {
        	biped.bipedRightArm.rotateAngleX-=0.4f;
    	}
     	if(LibidoListener.yenielgoster) {
         	if(!p.isPotionActive(Potion.invisibility)) {
            	biped.bipedLeftArm.render(0.0625f);
            	biped.bipedRightArm.render(0.0625f);
         	}
        	if(p.getHeldItem()!=null) {
//            	biped.bipedRightArm.rotateAngleX-=0.4f;
            	GL11.glPushMatrix();
            	EntityItem e = new EntityItem(p.worldObj, 0, 0, 0, p.getHeldItem());
            	e.hoverStart = 0;
            	double a = Math.cos(Minecraft.getSystemTime()/1000.0)/22+0.15f;
            	GL11.glRotated(180, 1, 0, 0);
            	GL11.glTranslated(-0.365, 0, 0);
            	GL11.glRotated(biped.bipedRightArm.rotateAngleZ*-50, 0, 0, 1);
            	GL11.glRotated(biped.bipedRightArm.rotateAngleX*50, 1, 0, 0);
            	GL11.glTranslated(0, -0.8, 0);
            	GL11.glRotated(90, 1, 0, 0);
            	GL11.glTranslated(0, 0.1, -0.15);
//            	GL11.glTranslated(-0.3-a, 0.5, -0.3);
//            	GL11.glRotated(55, 1, 0, 0);
//            	GL11.glRotated(180, 0, 0, 1);
//            	GL11.glRotated(180-a*75+7, 0, 1, 0);
//            	GL11.glTranslated(0, -0.02, 0);
            	Item it = p.getHeldItem().getItem();
//            	System.out.println(a*50);
//            	GL11.glRotated(-25, 1, 0, 0);
            	if(!(it instanceof ItemTool||it instanceof ItemSword||it instanceof ItemBow||it instanceof ItemFishingRod||it instanceof ItemShears)) {
//                	GL11.glTranslated(0, Math.cos(Minecraft.getSystemTime()/200.0)/20.0+0.05, 0);
//                	GL11.glRotated(Minecraft.getSystemTime()/10.0, 0, 1, 0);
            	}
            	GL11.glScaled(0.75, 0.75, 0.75);
            	RenderManager.instance.renderEntityWithPosYaw(e, 0, 0, 0, 0, 0);
            	GL11.glPopMatrix();
            	Minecraft.getMinecraft().renderEngine.bindTexture(p.getLocationSkin());
            	GL11.glColor3d(1, 1, 1);
            }
     	}
    	//zirh
     	//TODO Z�RH
     	
    	LibidoListener.sekiller.forEach(t -> {
    		ModelCustomArmour m = (ModelCustomArmour) t.GetModel();
    		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("flansmod:armor/" + t.armourTextureName + "_" + (t.type == 2 ? "2" : "1") + ".png"));
    		if(LibidoListener.yenielgoster) {
             	for(int i = 0; i<m.rightArmModel.length; i++) {
             		m.rightArmModel[i].rotateAngleX = biped.bipedRightArm.rotateAngleX;
             		m.rightArmModel[i].rotateAngleY = biped.bipedRightArm.rotateAngleY;
             		m.rightArmModel[i].rotateAngleZ = biped.bipedRightArm.rotateAngleZ;
             		m.rightArmModel[i].rotationPointX = biped.bipedRightArm.rotationPointX;
             		m.rightArmModel[i].rotationPointY = biped.bipedRightArm.rotationPointY;
             		m.rightArmModel[i].rotationPointZ = biped.bipedRightArm.rotationPointZ;
             		m.rightArmModel[i].render(0.0625f);
             	}
             	for(int i = 0; i<m.leftArmModel.length; i++) {
             		m.leftArmModel[i].rotateAngleX = biped.bipedLeftArm.rotateAngleX;
             		m.leftArmModel[i].rotateAngleY = biped.bipedLeftArm.rotateAngleY;
             		m.leftArmModel[i].rotateAngleZ = biped.bipedLeftArm.rotateAngleZ;
             		m.leftArmModel[i].rotationPointX = biped.bipedLeftArm.rotationPointX;
             		m.leftArmModel[i].rotationPointY = biped.bipedLeftArm.rotationPointY;
             		m.leftArmModel[i].rotationPointZ = biped.bipedLeftArm.rotationPointZ;
             		m.leftArmModel[i].render(0.0625f);
             	}
    		}
         	GL11.glPushMatrix();
         	GL11.glTranslated(0, -0.001, 0);
         	for(int i = 0; i<m.bodyModel.length; i++) {
         		m.bodyModel[i].rotateAngleX = biped.bipedBody.rotateAngleX;
         		m.bodyModel[i].rotateAngleY = biped.bipedBody.rotateAngleY;
         		m.bodyModel[i].rotateAngleZ = biped.bipedBody.rotateAngleZ;
         		m.bodyModel[i].rotationPointX = biped.bipedBody.rotationPointX;
         		m.bodyModel[i].rotationPointY = biped.bipedBody.rotationPointY;
         		m.bodyModel[i].rotationPointZ = biped.bipedBody.rotationPointZ;
         		m.bodyModel[i].render(0.0625f);
         	}
         	GL11.glPopMatrix();
         	GL11.glPushMatrix();
        	if(p.isSneaking()) {
        		GL11.glTranslated(0, 0, 0.25);
        	}
         	for(int i = 0; i<m.leftLegModel.length; i++) {
         		m.leftLegModel[i].rotateAngleX = biped.bipedLeftLeg.rotateAngleX;
         		m.leftLegModel[i].rotateAngleY = biped.bipedLeftLeg.rotateAngleY;
         		m.leftLegModel[i].rotateAngleZ = biped.bipedLeftLeg.rotateAngleZ;
         		m.leftLegModel[i].rotationPointX = biped.bipedLeftLeg.rotationPointX;
         		m.leftLegModel[i].rotationPointY = biped.bipedLeftLeg.rotationPointY;
         		m.leftLegModel[i].rotationPointZ = biped.bipedLeftLeg.rotationPointZ;
         		m.leftLegModel[i].render(0.0625f);
         	}
         	for(int i = 0; i<m.rightLegModel.length; i++) {
         		m.rightLegModel[i].rotateAngleX = biped.bipedRightLeg.rotateAngleX;
         		m.rightLegModel[i].rotateAngleY = biped.bipedRightLeg.rotateAngleY;
         		m.rightLegModel[i].rotateAngleZ = biped.bipedRightLeg.rotateAngleZ;
         		m.rightLegModel[i].rotationPointX = biped.bipedRightLeg.rotationPointX;
         		m.rightLegModel[i].rotationPointY = biped.bipedRightLeg.rotationPointY;
         		m.rightLegModel[i].rotationPointZ = biped.bipedRightLeg.rotationPointZ;
         		m.rightLegModel[i].render(0.0625f);
         	}
         	GL11.glPopMatrix();
    	});
    	biped.isChild = false;
    	GL11.glTranslated(1, 0, 0);
    	float asdas = Minecraft.getSystemTime();
    	GL11.glPopMatrix();
	}	

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return new ResourceLocation("flansmod:textures/asd.png");
	}

}
