//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.5
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
public class ModelQBZ extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelQBZ()	
	{


// Gun
		gunModel = new ModelRendererTurbo[18];
		gunModel[0] = new ModelRendererTurbo(this,  100,  150, textureX, textureY); // GN.Grip
		gunModel[1] = new ModelRendererTurbo(this,  100,  170, textureX, textureY); // GN.BodyRight
		gunModel[2] = new ModelRendererTurbo(this,  100,  170, textureX, textureY); // GN.BodyLeft
		gunModel[3] = new ModelRendererTurbo(this,  120,  150, textureX, textureY); // GN.UnderTrigger
		gunModel[4] = new ModelRendererTurbo(this,  150,  150, textureX, textureY); // GN.GripGuardLand
		gunModel[5] = new ModelRendererTurbo(this,  140,  150, textureX, textureY); // GN.Trigger
		gunModel[6] = new ModelRendererTurbo(this,  100,  185, textureX, textureY); // GN.TopBody
		gunModel[7] = new ModelRendererTurbo(this,  100,  200, textureX, textureY); // GN.GripSightBack
		gunModel[8] = new ModelRendererTurbo(this,  120,  200, textureX, textureY); // GN.GripSightTop
		gunModel[9] = new ModelRendererTurbo(this,  160,  200, textureX, textureY); // GN.GripSightFront
		gunModel[10] = new ModelRendererTurbo(this,  100,  220, textureX, textureY); // GN.Barrel
		gunModel[11] = new ModelRendererTurbo(this,  100,  270, textureX, textureY); // GN.StockTop
		gunModel[12] = new ModelRendererTurbo(this,  100,  250, textureX, textureY); // GN.Frontthingy
		gunModel[13] = new ModelRendererTurbo(this,  100,  290, textureX, textureY); // GNStockBackLeft
		gunModel[14] = new ModelRendererTurbo(this,  100,  290, textureX, textureY); // GNStockBackRight
		gunModel[15] = new ModelRendererTurbo(this,  100,  310, textureX, textureY); // GN.UnderStock
		gunModel[16] = new ModelRendererTurbo(this,  100,  330, textureX, textureY); // GN.UnderStockangle
		gunModel[17] = new ModelRendererTurbo(this,  150,  220, textureX, textureY); // GN.GripSightBackangle

		gunModel[0].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // GN.Grip
		gunModel[0].setRotationPoint(1F, -4F, -0.5F);
		gunModel[0].rotateAngleZ = 0.122173F;

		gunModel[1].addBox(0F, 0F, 0F, 25, 2, 1, 0F); // GN.BodyRight
		gunModel[1].setRotationPoint(-12F, -5F, -0.2F);

		gunModel[2].addBox(0F, 0F, 0F, 25, 2, 1, 0F); // GN.BodyLeft
		gunModel[2].setRotationPoint(-12F, -5F, -0.8F);

		gunModel[3].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // GN.UnderTrigger
		gunModel[3].setRotationPoint(2F, -2.5F, 0F);
		gunModel[3].rotateAngleZ = 0.2268928F;

		gunModel[4].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // GN.GripGuardLand
		gunModel[4].setRotationPoint(6.5F, -3.5F, -0.5F);
		gunModel[4].rotateAngleZ = 0.3839724F;

		gunModel[5].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // GN.Trigger
		gunModel[5].setRotationPoint(3.8F, -3.3F, 0F);
		gunModel[5].rotateAngleZ = 0.1047198F;

		gunModel[6].addBox(0F, 0F, 0F, 25, 1, 1, 0F); // GN.TopBody
		gunModel[6].setRotationPoint(-12F, -6F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // GN.GripSightBack
		gunModel[7].setRotationPoint(-1F, -8.5F, -0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 7, 0, 1, 0F); // GN.GripSightTop
		gunModel[8].setRotationPoint(-1.1F, -8.3F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // GN.GripSightFront
		gunModel[9].setRotationPoint(5F, -8F, -0.5F);
		gunModel[9].rotateAngleZ = 0.418879F;

		gunModel[10].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // GN.Barrel
		gunModel[10].setRotationPoint(13F, -4.5F, -0.5F);

		gunModel[11].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // GN.StockTop
		gunModel[11].setRotationPoint(-12F, -6.5F, -0.5F);

		gunModel[12].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // GN.Frontthingy
		gunModel[12].setRotationPoint(11.5F, -8.5F, 0F);

		gunModel[13].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // GNStockBackLeft
		gunModel[13].setRotationPoint(-13F, -6.5F, -0.8F);

		gunModel[14].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // GNStockBackRight
		gunModel[14].setRotationPoint(-13F, -6.5F, -0.2F);

		gunModel[15].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // GN.UnderStock
		gunModel[15].setRotationPoint(-12F, -3.5F, -0.5F);

		gunModel[16].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // GN.UnderStockangle
		gunModel[16].setRotationPoint(-11F, -3.3F, -0.5F);
		gunModel[16].rotateAngleZ = 0.4089647F;

		gunModel[17].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // GN.GripSightBackangle
		gunModel[17].setRotationPoint(-1F, -8.5F, -0.5F);
		gunModel[17].rotateAngleZ = 0.1858931F;



// Default Barrel
		defaultBarrelModel = new ModelRendererTurbo[4];
		defaultBarrelModel[0] = new ModelRendererTurbo(this,  100,  240, textureX, textureY); // BL.BottomLeft
		defaultBarrelModel[1] = new ModelRendererTurbo(this,  100,  240, textureX, textureY); // BL.TopRight
		defaultBarrelModel[2] = new ModelRendererTurbo(this,  100,  240, textureX, textureY); // BL.TopLeft
		defaultBarrelModel[3] = new ModelRendererTurbo(this,  100,  240, textureX, textureY); // BL.BottomRight

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // BL.BottomLeft
		defaultBarrelModel[0].setRotationPoint(18F, -4.3F, -0.7F);

		defaultBarrelModel[1].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // BL.TopRight
		defaultBarrelModel[1].setRotationPoint(18F, -4.8F, -0.3F);

		defaultBarrelModel[2].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // BL.TopLeft
		defaultBarrelModel[2].setRotationPoint(18F, -4.8F, -0.7F);

		defaultBarrelModel[3].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // BL.BottomRight
		defaultBarrelModel[3].setRotationPoint(18F, -4.3F, -0.3F);



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[1];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  120,  220, textureX, textureY); // SC.Default"scope"

		defaultScopeModel[0].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // SC.Default"scope"
		defaultScopeModel[0].setRotationPoint(-1F, -8.5F, -0.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this,  100,  350, textureX, textureY); // AM.Top
		ammoModel[1] = new ModelRendererTurbo(this,  100,  350, textureX, textureY); // AM.Middle
		ammoModel[2] = new ModelRendererTurbo(this,  100,  370, textureX, textureY); // AM.Lower

		ammoModel[0].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // AM.Top
		ammoModel[0].setRotationPoint(-5.5F, -3F, -0.5F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // AM.Middle
		ammoModel[1].setRotationPoint(-5.3F, -1F, -0.5F);
		ammoModel[1].rotateAngleZ = 0.2094395F;

		ammoModel[2].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // AM.Lower
		ammoModel[2].setRotationPoint(-4.8F, 1F, -0.5F);
		ammoModel[2].rotateAngleZ = 0.4886922F;

		scopeAttachPoint = new Vector3f(3F / 16F, 9F / 16F, 0F);
		
		stockAttachPoint = new Vector3f(-4F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 4F / 16F, 0F);
		
		gripAttachPoint = new Vector3f(12F / 16F, 2.5F / 16F, 0F);


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BULLPUP;

		flipAll();
	}
}