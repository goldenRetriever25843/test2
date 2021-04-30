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

public class ModelSuperFunco extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelSuperFunco()	
	{


// Gun
		gunModel = new ModelRendererTurbo[39];
		gunModel[0] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // GN.Topofhandle
		gunModel[1] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // GN.Undertopofhandle
		gunModel[2] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.Handle
		gunModel[3] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // GN.Handlebottom
		gunModel[4] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // GN.Triggerguardback
		gunModel[5] = new ModelRendererTurbo(this,  20,  290, textureX, textureY); // GN.Triggerguardbottom
		gunModel[6] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // GN.Bodytohandle
		gunModel[7] = new ModelRendererTurbo(this,  0,  325, textureX, textureY); // GN.BodypostHandle
		gunModel[8] = new ModelRendererTurbo(this,  30,  300, textureX, textureY); // GN.Triggerend
		gunModel[9] = new ModelRendererTurbo(this,  55,  295, textureX, textureY); // GN.Triggertop
		gunModel[10] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // GN.Ammoholdertop
		gunModel[11] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // GN.AmmoHolderBottom
		gunModel[12] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // GN.BodyFullLengthBottom
		gunModel[13] = new ModelRendererTurbo(this,  0,  395, textureX, textureY); // GN.FattestBody
		gunModel[14] = new ModelRendererTurbo(this,  0,  415, textureX, textureY); // GN.Bodynotfatback
		gunModel[15] = new ModelRendererTurbo(this,  30,  415, textureX, textureY); // GN.Toparea
		gunModel[16] = new ModelRendererTurbo(this,  0,  440, textureX, textureY); // GN.Topangleright
		gunModel[17] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // GN.Topangleleft
		gunModel[18] = new ModelRendererTurbo(this,  0,  480, textureX, textureY); // GN.BoltArea
		gunModel[19] = new ModelRendererTurbo(this,  35,  480, textureX, textureY); // GN.Strangesightback
		gunModel[20] = new ModelRendererTurbo(this,  0,  495, textureX, textureY); // GN.Backsightright
		gunModel[21] = new ModelRendererTurbo(this,  0,  495, textureX, textureY); // GN.Backsightleft
		gunModel[22] = new ModelRendererTurbo(this,  15,  495, textureX, textureY); // GN.IronSightCircle
		gunModel[23] = new ModelRendererTurbo(this,  25,  495, textureX, textureY); // GN.IronSightCirclestand
		gunModel[24] = new ModelRendererTurbo(this,  175,  150, textureX, textureY); // GN.Barrelconvetpoint
		gunModel[25] = new ModelRendererTurbo(this,  175,  170, textureX, textureY); // GN.GettingRound
		gunModel[26] = new ModelRendererTurbo(this,  175,  190, textureX, textureY); // GN.Topofgettinground
		gunModel[27] = new ModelRendererTurbo(this,  175,  210, textureX, textureY); // GN.FattyGrip
		gunModel[28] = new ModelRendererTurbo(this,  175,  240, textureX, textureY); // GN.WannabeAKArea
		gunModel[29] = new ModelRendererTurbo(this,  175,  260, textureX, textureY); // GN.LowerwannabeAKArea
		gunModel[30] = new ModelRendererTurbo(this,  175,  280, textureX, textureY); // GN.Barrel
		gunModel[31] = new ModelRendererTurbo(this,  175,  295, textureX, textureY); // GN.Barrel/Muzzleconverter
		gunModel[32] = new ModelRendererTurbo(this,  175,  310, textureX, textureY); // GN.Muzzleback
		gunModel[33] = new ModelRendererTurbo(this,  175,  326, textureX, textureY); // GN.MuzzleEnd
		gunModel[34] = new ModelRendererTurbo(this,  175,  345, textureX, textureY); // GN.FrontSightBaseBack
		gunModel[35] = new ModelRendererTurbo(this,  175,  360, textureX, textureY); // GN.FrontSightBaseTop
		gunModel[36] = new ModelRendererTurbo(this,  175,  370, textureX, textureY); // GN.FrontIronSight
		gunModel[37] = new ModelRendererTurbo(this,  175,  380, textureX, textureY); // GN.FattyGripFrontLip
		gunModel[38] = new ModelRendererTurbo(this,  175,  400, textureX, textureY); // GN.StockBendyPart

		gunModel[0].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // GN.Topofhandle
		gunModel[0].setRotationPoint(-1F, -3F, -2F);

		gunModel[1].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // GN.Undertopofhandle
		gunModel[1].setRotationPoint(0F, -2F, -2F);

		gunModel[2].addBox(0F, -1.5F, 0F, 6, 11, 4, 0F); // GN.Handle
		gunModel[2].setRotationPoint(0.3F, 0F, -2F);
		gunModel[2].rotateAngleZ = -0.4537856F;

		gunModel[3].addBox(0F, 9F, 0F, 7, 2, 4, 0F); // GN.Handlebottom
		gunModel[3].setRotationPoint(0.3F, 0F, -2F);
		gunModel[3].rotateAngleZ = -0.4537856F;

		gunModel[4].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // GN.Triggerguardback
		gunModel[4].setRotationPoint(4.5F, -2.5F, -1.5F);
		gunModel[4].rotateAngleZ = 0.2617994F;

		gunModel[5].addBox(0F, 0F, 0F, 9, 1, 3, 0F); // GN.Triggerguardbottom
		gunModel[5].setRotationPoint(6F, 2.3F, -1.5F);

		gunModel[6].addBox(0F, 0F, 0F, 14, 2, 5, 0F); // GN.Bodytohandle
		gunModel[6].setRotationPoint(-8F, -5F, -2.5F);

		gunModel[7].addBox(0F, 0F, 0F, 22, 3, 5, 0F); // GN.BodypostHandle
		gunModel[7].setRotationPoint(6F, -5F, -2.5F);

		gunModel[8].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // GN.Triggerend
		gunModel[8].setRotationPoint(8.2F, -2.5F, -0.5F);
		gunModel[8].rotateAngleZ = 0.03490658F;

		gunModel[9].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // GN.Triggertop
		gunModel[9].setRotationPoint(8.2F, -1.2F, -0.5F);
		gunModel[9].rotateAngleZ = 0.6981317F;

		gunModel[10].addBox(0F, 0F, 0F, 14, 4, 5, 0F); // GN.Ammoholdertop
		gunModel[10].setRotationPoint(14F, -2.5F, -2.5F);

		gunModel[11].addBox(0F, 0F, 0F, 15, 2, 5, 0F); // GN.AmmoHolderBottom
		gunModel[11].setRotationPoint(12.9F, 1F, -2.5F);
		gunModel[11].rotateAngleZ = 0.08726646F;

		gunModel[12].addBox(0F, 0F, 0F, 40, 3, 5, 0F); // GN.BodyFullLengthBottom
		gunModel[12].setRotationPoint(-9F, -8F, -2.5F);

		gunModel[13].addBox(0F, 0F, 0F, 38, 4, 6, 0F); // GN.FattestBody
		gunModel[13].setRotationPoint(-5F, -12F, -3F);

		gunModel[14].addBox(0F, 0F, 0F, 4, 14, 5, 0F); // GN.Bodynotfatback
		gunModel[14].setRotationPoint(-9F, -17.5F, -2.5F);

		gunModel[15].addBox(0F, 0F, 0F, 38, 6, 3, 0F); // GN.Toparea
		gunModel[15].setRotationPoint(-5F, -18F, -1.5F);

		gunModel[16].addBox(0F, 0F, -3F, 38, 6, 3, 0F); // GN.Topangleright
		gunModel[16].setRotationPoint(-5F, -17.8F, 1.5F);
		gunModel[16].rotateAngleX = 0.2530727F;

		gunModel[17].addBox(0F, 0F, 0F, 38, 6, 3, 0F); // GN.Topangleleft
		gunModel[17].setRotationPoint(-5F, -17.8F, -1.5F);
		gunModel[17].rotateAngleX = -0.2530727F;

		gunModel[18].addBox(0F, 0.5F, 0F, 12, 4, 1, 0F); // GN.BoltArea
		gunModel[18].setRotationPoint(15F, -17F, -2F);
		gunModel[18].rotateAngleX = -0.2530727F;

		gunModel[19].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // GN.Strangesightback
		gunModel[19].setRotationPoint(-5.5F, -18.5F, -2F);

		gunModel[20].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // GN.Backsightright
		gunModel[20].setRotationPoint(-5F, -21F, 1.3F);

		gunModel[21].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // GN.Backsightleft
		gunModel[21].setRotationPoint(-5F, -21F, -2.3F);

		gunModel[22].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // GN.IronSightCircle
		gunModel[22].setRotationPoint(-4F, -20.8F, -1F);

		gunModel[23].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // GN.IronSightCirclestand
		gunModel[23].setRotationPoint(-4F, -18.8F, -0.5F);

		gunModel[24].addBox(0F, 0F, 0F, 3, 6, 5, 0F); // GN.Barrelconvetpoint
		gunModel[24].setRotationPoint(30F, -19F, -2.5F);

		gunModel[25].addBox(0F, 0F, 0F, 2, 5, 5, 0F); // GN.GettingRound
		gunModel[25].setRotationPoint(33F, -12.5F, -2.5F);

		gunModel[26].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // GN.Topofgettinground
		gunModel[26].setRotationPoint(33F, -19F, -1.5F);

		gunModel[27].addBox(0F, 0F, 0F, 30, 11, 7, 0F); // GN.FattyGrip
		gunModel[27].setRotationPoint(35F, -16.5F, -3.5F);

		gunModel[28].addBox(0F, 0F, 0F, 40, 8, 4, 0F); // GN.WannabeAKArea
		gunModel[28].setRotationPoint(40F, -18.3F, -2F);

		gunModel[29].addBox(0F, 0F, 0F, 19, 7, 5, 0F); // GN.LowerwannabeAKArea
		gunModel[29].setRotationPoint(65F, -14F, -2.5F);

		gunModel[30].addBox(0F, 0F, 0F, 20, 3, 3, 0F); // GN.Barrel
		gunModel[30].setRotationPoint(84F, -11.5F, -1.5F);

		gunModel[31].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // GN.Barrel/Muzzleconverter
		gunModel[31].setRotationPoint(104F, -12F, -2F);

		gunModel[32].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // GN.Muzzleback
		gunModel[32].setRotationPoint(106F, -11.5F, -1.5F);

		gunModel[33].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // GN.MuzzleEnd
		gunModel[33].setRotationPoint(108F, -12F, -2F);

		gunModel[34].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // GN.FrontSightBaseBack
		gunModel[34].setRotationPoint(80F, -17F, -1F);

		gunModel[35].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // GN.FrontSightBaseTop
		gunModel[35].setRotationPoint(82F, -19F, -1F);

		gunModel[36].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // GN.FrontIronSight
		gunModel[36].setRotationPoint(82.5F, -22F, -0.5F);

		gunModel[37].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // GN.FattyGripFrontLip
		gunModel[37].setRotationPoint(62F, -6F, -2.5F);

		gunModel[38].addBox(0F, 0F, 0F, 5, 10, 6, 0F); // GN.StockBendyPart
		gunModel[38].setRotationPoint(-14F, -14F, -3F);
		gunModel[38].rotateAngleZ = 0.03490658F;




// Default Barrel
		defaultStockModel = new ModelRendererTurbo[6];
		defaultStockModel[0] = new ModelRendererTurbo(this,  350,  150, textureX, textureY); // ST.StockTubeTop
		defaultStockModel[1] = new ModelRendererTurbo(this,  350,  170, textureX, textureY); // ST.StockBack
		defaultStockModel[2] = new ModelRendererTurbo(this,  350,  210, textureX, textureY); // ST.StockTubebottom
		defaultStockModel[3] = new ModelRendererTurbo(this,  350,  230, textureX, textureY); // ST.StockTubebackbottom
		defaultStockModel[4] = new ModelRendererTurbo(this,  350,  250, textureX, textureY); // ST.ConnectorFatfront
		defaultStockModel[5] = new ModelRendererTurbo(this,  350,  270, textureX, textureY); // ST.Connectorback

		defaultStockModel[0].addBox(-38F, 0.1F, 0F, 34, 4, 4, 0F); // ST.StockTubeTop
		defaultStockModel[0].setRotationPoint(-10F, -14F, -2F);
		defaultStockModel[0].rotateAngleZ = 0.03490658F;

		defaultStockModel[1].addBox(-41F, 0F, 0F, 3, 20, 6, 0F); // ST.StockBack
		defaultStockModel[1].setRotationPoint(-10F, -14F, -3F);
		defaultStockModel[1].rotateAngleZ = 0.03490658F;

		defaultStockModel[2].addBox(-22F, 0F, 0F, 19, 4, 4, 0F); // ST.StockTubebottom
		defaultStockModel[2].setRotationPoint(-10F, -8.1F, -2F);
		defaultStockModel[2].rotateAngleZ = 0.03490658F;

		defaultStockModel[3].addBox(0F, 0F, 0F, 21, 4, 4, 0F); // ST.StockTubebackbottom
		defaultStockModel[3].setRotationPoint(-50F, 3F, -2F);
		defaultStockModel[3].rotateAngleZ = 0.5235988F;

		defaultStockModel[4].addBox(0F, 0F, 0F, 4, 3, 2, 0F); // ST.ConnectorFatfront
		defaultStockModel[4].setRotationPoint(-32F, -10F, -1F);
		defaultStockModel[4].rotateAngleZ = 0.03490658F;

		defaultStockModel[5].addBox(0F, 0F, 0F, 8, 7, 1, 0F); // ST.Connectorback
		defaultStockModel[5].setRotationPoint(-39.5F, -10F, -0.5F);
		defaultStockModel[5].rotateAngleZ = 0.03490658F;




// Default Scope
		


// Ammo
		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this,  450,  180, textureX, textureY); // AM.AmmoTop
		ammoModel[1] = new ModelRendererTurbo(this,  450,  200, textureX, textureY); // AM.2
		ammoModel[2] = new ModelRendererTurbo(this,  450,  200, textureX, textureY); // AM.3
		ammoModel[3] = new ModelRendererTurbo(this,  450,  200, textureX, textureY); // AM.4

		ammoModel[0].addBox(0F, 0F, 0F, 11, 5, 4, 0F); // AM.AmmoTop
		ammoModel[0].setRotationPoint(16F, -0.5F, -2F);

		ammoModel[1].addBox(0F, 0F, 0F, 11, 6, 4, 0F); // AM.2
		ammoModel[1].setRotationPoint(16F, 4.5F, -2F);
		ammoModel[1].rotateAngleZ = 0.08726646F;

		ammoModel[2].addBox(0F, 0F, 0F, 11, 6, 4, 0F); // AM.3
		ammoModel[2].setRotationPoint(16.5F, 10.5F, -2F);
		ammoModel[2].rotateAngleZ = 0.1745329F;

		ammoModel[3].addBox(0F, 0F, 0F, 11, 6, 4, 0F); // AM.4
		ammoModel[3].setRotationPoint(17.5F, 16.4F, -2F);
		ammoModel[3].rotateAngleZ = 0.2443461F;

		
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this,  450,  400, textureX, textureY); // SL.boltthing

		slideModel[0].addBox(0F, 0F, -6.5F, 3, 3, 5, 0F); // SL.boltthing
		slideModel[0].setRotationPoint(23.5F, -15.5F, 0F);
		slideModel[0].rotateAngleX = -0.2530727F;

		
		scopeAttachPoint = new Vector3f(40F / 30F, 24F / 16F, 0F);
				
		barrelAttachPoint = new Vector3f(116F / 16F, 16F / 16F, 0F);
		
		gripAttachPoint = new Vector3f(160F / 50F, 14F / 16F, 0F);
		


		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(1, 6, 0);
	}
}