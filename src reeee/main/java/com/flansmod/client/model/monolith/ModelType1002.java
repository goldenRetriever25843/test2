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

public class ModelType1002 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelType1002()	
	{


// Gun
		gunModel = new ModelRendererTurbo[20];
		gunModel[0] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // GN.MiddleStockArea
		gunModel[1] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.StockBackTop
		gunModel[2] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.StockBackBottom
		gunModel[3] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // GN.Core
		gunModel[4] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // GN.TriggerDetail
		gunModel[5] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // GN.BarrelCenterLeft
		gunModel[6] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // GN.BarrelFront
		gunModel[7] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // GN.GripArea
		gunModel[8] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // GN.BarrelTopLeft
		gunModel[9] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // GN.BarrelTopRight
		gunModel[10] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // GN.BarrelBottomRight
		gunModel[11] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // GN.BarrelBottomLeft
		gunModel[12] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // GN.BarrelCenterRight
		gunModel[13] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // GN.AttachementSquareFront
		gunModel[14] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // GN.AttachementSquare2nd
		gunModel[15] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // GN.AttachementSquare3rd
		gunModel[16] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // GN.AttachementSquare4th
		gunModel[17] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // GN.IronSightLeft
		gunModel[18] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // GN.IronSightRight
		gunModel[19] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // GN.AmmoFeeder

		gunModel[0].addBox(0F, -1F, 0F, 5, 2, 2, 0F); // GN.MiddleStockArea
		gunModel[0].setRotationPoint(-2F, 1F, -1F);
		gunModel[0].rotateAngleZ = 0.418879F;

		gunModel[1].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // GN.StockBackTop
		gunModel[1].setRotationPoint(-8.5F, -1F, -1F);
		gunModel[1].rotateAngleZ = 0.03490658F;

		gunModel[2].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // GN.StockBackBottom
		gunModel[2].setRotationPoint(-8.5F, 1F, -1F);
		gunModel[2].rotateAngleZ = 0.1745329F;

		gunModel[3].addBox(0F, 0F, 0F, 10, 2, 3, 0F); // GN.Core
		gunModel[3].setRotationPoint(2F, -2F, -1.5F);

		gunModel[4].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // GN.TriggerDetail
		gunModel[4].setRotationPoint(0F, -0.8F, -0.5F);

		gunModel[5].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // GN.BarrelCenterLeft
		gunModel[5].setRotationPoint(2.8F, -2.8F, -1.2F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // GN.BarrelFront
		gunModel[6].setRotationPoint(19F, -3F, -1F);

		gunModel[7].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // GN.GripArea
		gunModel[7].setRotationPoint(12F, -1.2F, -0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // GN.BarrelTopLeft
		gunModel[8].setRotationPoint(11F, -2.7F, -0.7F);

		gunModel[9].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // GN.BarrelTopRight
		gunModel[9].setRotationPoint(11F, -2.7F, -0.3F);

		gunModel[10].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // GN.BarrelBottomRight
		gunModel[10].setRotationPoint(11F, -2.3F, -0.3F);

		gunModel[11].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // GN.BarrelBottomLeft
		gunModel[11].setRotationPoint(11F, -2.3F, -0.7F);

		gunModel[12].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // GN.BarrelCenterRight
		gunModel[12].setRotationPoint(2.8F, -2.8F, -0.8F);

		gunModel[13].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // GN.AttachementSquareFront
		gunModel[13].setRotationPoint(10F, -3F, -1F);

		gunModel[14].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // GN.AttachementSquare2nd
		gunModel[14].setRotationPoint(8F, -3F, -1F);

		gunModel[15].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // GN.AttachementSquare3rd
		gunModel[15].setRotationPoint(6F, -3F, -1F);

		gunModel[16].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // GN.AttachementSquare4th
		gunModel[16].setRotationPoint(4F, -3F, -1F);

		gunModel[17].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // GN.IronSightLeft
		gunModel[17].setRotationPoint(19F, -3.8F, -0.5F);

		gunModel[18].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // GN.IronSightRight
		gunModel[18].setRotationPoint(19F, -3.8F, 0.5F);

		gunModel[19].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // GN.AmmoFeeder
		gunModel[19].setRotationPoint(8F, -2.5F, 0.8F);


// Default Scope
		defaultScopeModel = new ModelRendererTurbo[1];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // SC.IronSightBack

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // SC.IronSightBack
		defaultScopeModel[0].setRotationPoint(3F, -3.5F, -0.5F);


// Ammo
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // AM.ClipTop
		ammoModel[1] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // AM.ClipMiddle
		ammoModel[2] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // AM.ClipBottom

		ammoModel[0].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // AM.ClipTop
		ammoModel[0].setRotationPoint(8.5F, -2F, 1F);

		ammoModel[1].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // AM.ClipMiddle
		ammoModel[1].setRotationPoint(8.5F, -2F, 4F);
		ammoModel[1].rotateAngleY = -0.2617994F;

		ammoModel[2].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // AM.ClipBottom
		ammoModel[2].setRotationPoint(9.2F, -2F, 6.7F);
		ammoModel[2].rotateAngleY = -0.6108652F;



// Slide
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this,  0,  390, textureX, textureY); // SL.BarrelEnd

		slideModel[0].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // SL.BarrelEnd
		slideModel[0].setRotationPoint(19F, -2.5F, -0.5F);

		
		scopeAttachPoint = new Vector3f(8F / 16F, 3F / 16F, 0F);
		
		stockAttachPoint = new Vector3f(-4F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(20F / 16F, 2F / 16F, 0F);
		
		gripAttachPoint = new Vector3f(16F / 16F, 1F / 16F, 0F);
		


		gunSlideDistance = 0.25F;
		animationType = EnumAnimationType.SIDE_CLIP;

		flipAll();
	}
}