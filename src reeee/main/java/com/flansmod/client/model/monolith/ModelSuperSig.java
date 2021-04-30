//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
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
public class ModelSuperSig extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelSuperSig()	
	{


// Gun
		gunModel = new ModelRendererTurbo[39];
		gunModel[0] = new ModelRendererTurbo(this,  321,  1, textureX, textureY); // GN.TopFrontGrip
		gunModel[1] = new ModelRendererTurbo(this,  345,  1, textureX, textureY); // GN.TopRightOfGrip
		gunModel[2] = new ModelRendererTurbo(this,  369,  1, textureX, textureY); // GN.GripMain
		gunModel[3] = new ModelRendererTurbo(this,  393,  1, textureX, textureY); // GN.BottomofGrip
		gunModel[4] = new ModelRendererTurbo(this,  33,  1, textureX, textureY); // GN.TriggerFrameBack
		gunModel[5] = new ModelRendererTurbo(this,  417,  1, textureX, textureY); // GN.TriggerFrameBottom
		gunModel[6] = new ModelRendererTurbo(this,  65,  1, textureX, textureY); // GN.TriggerFrameFrontCorner
		gunModel[7] = new ModelRendererTurbo(this,  89,  1, textureX, textureY); // GN.TriggerBackTopThing
		gunModel[8] = new ModelRendererTurbo(this,  433,  1, textureX, textureY); // GN.TriggerSpikeBase
		gunModel[9] = new ModelRendererTurbo(this,  449,  1, textureX, textureY); // GN.TriggerSpikeMain
		gunModel[10] = new ModelRendererTurbo(this,  449,  1, textureX, textureY); // GN.LowerMainBodypostangle
		gunModel[11] = new ModelRendererTurbo(this,  393,  9, textureX, textureY); // GN.LowerBottomMainBodypostangle
		gunModel[12] = new ModelRendererTurbo(this,  489,  1, textureX, textureY); // GN.BackMainBodyPreAngle
		gunModel[13] = new ModelRendererTurbo(this,  433,  9, textureX, textureY); // GN.LowerMainBodyFrontTip
		gunModel[14] = new ModelRendererTurbo(this,  161,  17, textureX, textureY); // GN.MainLowerBodyTipAngle
		gunModel[15] = new ModelRendererTurbo(this,  185,  17, textureX, textureY); // GN.MainBodyCenterStrip
		gunModel[16] = new ModelRendererTurbo(this,  273,  17, textureX, textureY); // GN.GunBodyTop
		gunModel[17] = new ModelRendererTurbo(this,  113,  1, textureX, textureY); // GN.TopRightAngle
		gunModel[18] = new ModelRendererTurbo(this,  449,  17, textureX, textureY); // GN.MainBodyFiller
		gunModel[19] = new ModelRendererTurbo(this,  1,  25, textureX, textureY); // GN.BodyTopAngleLeft
		gunModel[20] = new ModelRendererTurbo(this,  65,  25, textureX, textureY); // GN.BodyTopAngleRight
		gunModel[21] = new ModelRendererTurbo(this,  361,  17, textureX, textureY); // GN.BodyTopAngleRightFront
		gunModel[22] = new ModelRendererTurbo(this,  153,  25, textureX, textureY); // GN.BodyTopAngleRightFront
		gunModel[23] = new ModelRendererTurbo(this,  201,  9, textureX, textureY); // GN.Trigger
		gunModel[24] = new ModelRendererTurbo(this,  377,  17, textureX, textureY); // GN.BaseofSight
		gunModel[25] = new ModelRendererTurbo(this,  497,  17, textureX, textureY); // GN.FoldedScopeThing
		gunModel[26] = new ModelRendererTurbo(this,  137,  1, textureX, textureY); // GN.ScopeKnob
		gunModel[27] = new ModelRendererTurbo(this,  273,  25, textureX, textureY); // GN.NecessaryDetailTopofbody
		gunModel[28] = new ModelRendererTurbo(this,  281,  25, textureX, textureY); // GN.BarrelCore
		gunModel[29] = new ModelRendererTurbo(this,  1,  33, textureX, textureY); // GN.BarrelSpinalChord
		gunModel[30] = new ModelRendererTurbo(this,  97,  33, textureX, textureY); // GN.BarrelCornerBottomLeft
		gunModel[31] = new ModelRendererTurbo(this,  385,  33, textureX, textureY); // GN.BarrelCornerBottomRight
		gunModel[32] = new ModelRendererTurbo(this,  97,  41, textureX, textureY); // GN.BarrelCornerTopRight
		gunModel[33] = new ModelRendererTurbo(this,  193,  41, textureX, textureY); // GN.BarrelCornerTopLeft
		gunModel[34] = new ModelRendererTurbo(this,  481,  33, textureX, textureY); // GN.Barrel/Handguardconverter
		gunModel[35] = new ModelRendererTurbo(this,  377,  25, textureX, textureY); // GN.Barrel
		gunModel[36] = new ModelRendererTurbo(this,  497,  25, textureX, textureY); // GN.randombarrelbump
		gunModel[37] = new ModelRendererTurbo(this,  33,  17, textureX, textureY); // GN.IronSightBase
		gunModel[38] = new ModelRendererTurbo(this,  425,  25, textureX, textureY); // GN.IronSight

		gunModel[0].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // GN.TopFrontGrip
		gunModel[0].setRotationPoint(1F, -3F, -2F);

		gunModel[1].addBox(0F, 1F, 0F, 4, 6, 4, 0F); // GN.TopRightOfGrip
		gunModel[1].setRotationPoint(-1.5F, -5F, -2F);
		gunModel[1].rotateAngleZ = 0.6457718F;

		gunModel[2].addBox(-6F, 0F, 0F, 6, 10, 4, 0F); // GN.GripMain
		gunModel[2].setRotationPoint(7F, 1F, -2F);
		gunModel[2].rotateAngleZ = -0.6632251F;

		gunModel[3].addBox(-6F, 9.5F, 0F, 7, 2, 4, 0F); // GN.BottomofGrip
		gunModel[3].setRotationPoint(7F, 1F, -2F);
		gunModel[3].rotateAngleZ = -0.6632251F;

		gunModel[4].addBox(0F, 0F, 0F, 1, 0, 2, 0F); // GN.TriggerFrameBack
		gunModel[4].setRotationPoint(7F, 1F, -1F);
		gunModel[4].rotateAngleZ = -1.134464F;

		gunModel[5].addBox(0F, 0F, 0F, 6, 0, 2, 0F); // GN.TriggerFrameBottom
		gunModel[5].setRotationPoint(7.4F, 1.8F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // GN.TriggerFrameFrontCorner
		gunModel[6].setRotationPoint(13.3F, 1.8F, -1F);
		gunModel[6].rotateAngleZ = 0.8726646F;

		gunModel[7].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // GN.TriggerBackTopThing
		gunModel[7].setRotationPoint(6.5F, -3.6F, -1F);

		gunModel[8].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // GN.TriggerSpikeBase
		gunModel[8].setRotationPoint(14.6F, -3F, -1.5F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // GN.TriggerSpikeMain
		gunModel[9].setRotationPoint(14.6F, -1F, -0.5F);

		gunModel[10].addBox(0F, 0F, 0F, 12, 5, 5, 0F); // GN.LowerMainBodypostangle
		gunModel[10].setRotationPoint(4F, -8F, -2.5F);

		gunModel[11].addBox(0F, 0F, 0F, 14, 4, 5, 0F); // GN.LowerBottomMainBodypostangle
		gunModel[11].setRotationPoint(16F, -7F, -2.5F);

		gunModel[12].addBox(0F, 0F, 0F, 6, 4, 5, 0F); // GN.BackMainBodyPreAngle
		gunModel[12].setRotationPoint(-2F, -8F, -2.5F);

		gunModel[13].addBox(0F, 0F, 0F, 4, 3, 5, 0F); // GN.LowerMainBodyFrontTip
		gunModel[13].setRotationPoint(30F, -7F, -2.5F);

		gunModel[14].addBox(0F, -1F, 0F, 4, 1, 5, 0F); // GN.MainLowerBodyTipAngle
		gunModel[14].setRotationPoint(30F, -3F, -2.5F);
		gunModel[14].rotateAngleZ = 0.2268928F;

		gunModel[15].addBox(0F, 0F, 0F, 37, 2, 6, 0F); // GN.MainBodyCenterStrip
		gunModel[15].setRotationPoint(-2F, -10F, -3F);

		gunModel[16].addBox(0F, 0F, 0F, 37, 4, 3, 0F); // GN.GunBodyTop
		gunModel[16].setRotationPoint(-2F, -14F, -1.5F);

		gunModel[17].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // GN.TopRightAngle
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addBox(0F, 0F, 0F, 19, 5, 4, 0F); // GN.MainBodyFiller
		gunModel[18].setRotationPoint(16F, -9F, -2F);

		gunModel[19].addBox(0F, 0F, 0F, 25, 2, 4, 0F); // GN.BodyTopAngleLeft
		gunModel[19].setRotationPoint(-2F, -10F, -3F);
		gunModel[19].rotateAngleX = 1.186824F;

		gunModel[20].addBox(0F, 0F, 0F, 37, 2, 4, 0F); // GN.BodyTopAngleRight
		gunModel[20].setRotationPoint(-2F, -13.6F, 1.5F);
		gunModel[20].rotateAngleX = -1.186824F;

		gunModel[21].addBox(0F, 0F, 0F, 3, 2, 4, 0F); // GN.BodyTopAngleRightFront
		gunModel[21].setRotationPoint(32F, -10F, -3F);
		gunModel[21].rotateAngleX = 1.186824F;

		gunModel[22].addBox(0F, 0.5F, 0F, 9, 2, 2, 0F); // GN.BodyTopAngleRightFront
		gunModel[22].setRotationPoint(23F, -10F, -3F);
		gunModel[22].rotateAngleX = 1.186824F;

		gunModel[23].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // GN.Trigger
		gunModel[23].setRotationPoint(8.5F, -3F, -1F);

		gunModel[24].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // GN.BaseofSight
		gunModel[24].setRotationPoint(1.5F, -16F, -1F);

		gunModel[25].addBox(0F, -2F, 0F, 3, 2, 3, 0F); // GN.FoldedScopeThing
		gunModel[25].setRotationPoint(2F, -16F, -1.5F);
		gunModel[25].rotateAngleZ = -0.2617994F;

		gunModel[26].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // GN.ScopeKnob
		gunModel[26].setRotationPoint(5.2F, -16.5F, -1.8F);

		gunModel[27].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // GN.NecessaryDetailTopofbody
		gunModel[27].setRotationPoint(32.5F, -14.4F, -2F);

		gunModel[28].addBox(0F, 0F, 0F, 43, 4, 8, 0F); // GN.BarrelCore
		gunModel[28].setRotationPoint(35F, -10F, -3.98F);

		gunModel[29].addBox(0F, 0F, 0F, 43, 11, 4, 0F); // GN.BarrelSpinalChord
		gunModel[29].setRotationPoint(35F, -14.7F, -2F);

		gunModel[30].addBox(0F, 0F, 0F, 43, 3, 2, 0F); // GN.BarrelCornerBottomLeft
		gunModel[30].setRotationPoint(35F, -6F, -4F);
		gunModel[30].rotateAngleX = 0.6981317F;

		gunModel[31].addBox(0F, 0F, -2F, 43, 3, 2, 0F); // GN.BarrelCornerBottomRight
		gunModel[31].setRotationPoint(35F, -6F, 4F);
		gunModel[31].rotateAngleX = -0.6981317F;

		gunModel[32].addBox(0F, 0F, 0F, 43, 5, 2, 0F); // GN.BarrelCornerTopRight
		gunModel[32].setRotationPoint(35F, -10F, 4F);
		gunModel[32].rotateAngleX = -2.792527F;

		gunModel[33].addBox(0F, -0.7F, -0.2F, 43, 5, 2, 0F); // GN.BarrelCornerTopLeft
		gunModel[33].setRotationPoint(35F, -10F, -2F);
		gunModel[33].rotateAngleX = 2.792527F;

		gunModel[34].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // GN.Barrel/Handguardconverter
		gunModel[34].setRotationPoint(78F, -15F, -2F);

		gunModel[35].addBox(0F, 0F, 0F, 20, 3, 3, 0F); // GN.Barrel
		gunModel[35].setRotationPoint(82F, -9F, -1.5F);

		gunModel[36].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // GN.randombarrelbump
		gunModel[36].setRotationPoint(96F, -9.5F, -2F);

		gunModel[37].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // GN.IronSightBase
		gunModel[37].setRotationPoint(78.5F, -18F, -0.5F);

		gunModel[38].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // GN.IronSight
		gunModel[38].setRotationPoint(78.5F, -19.5F, -1.5F);



// Default Barrel
		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this,  289,  1, textureX, textureY); // BL.MuzzleGuard

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // BL.MuzzleGuard
		defaultBarrelModel[0].setRotationPoint(102F, -9.5F, -2F);



// Default Stock
		defaultStockModel = new ModelRendererTurbo[5];
		defaultStockModel[0] = new ModelRendererTurbo(this,  289,  41, textureX, textureY); // ST.StockMain
		defaultStockModel[1] = new ModelRendererTurbo(this,  193,  33, textureX, textureY); // ST.StockBackTop
		defaultStockModel[2] = new ModelRendererTurbo(this,  337,  41, textureX, textureY); // ST.StockBack
		defaultStockModel[3] = new ModelRendererTurbo(this,  361,  41, textureX, textureY); // ST.StockBottom
		defaultStockModel[4] = new ModelRendererTurbo(this,  433,  41, textureX, textureY); // ST.StockForwardSupport

		defaultStockModel[0].addBox(0F, 0F, 0F, 18, 6, 4, 0F); // ST.StockMain
		defaultStockModel[0].setRotationPoint(-20F, -10F, -2F);

		defaultStockModel[1].addBox(0F, 0F, 0F, 18, 3, 4, 0F); // ST.StockBackTop
		defaultStockModel[1].setRotationPoint(-38F, -10F, -2F);

		defaultStockModel[2].addBox(0F, 0F, 0F, 4, 20, 4, 0F); // ST.StockBack
		defaultStockModel[2].setRotationPoint(-42F, -10F, -2F);

		defaultStockModel[3].addBox(0F, -3F, 0F, 29, 3, 4, 0F); // ST.StockBottom
		defaultStockModel[3].setRotationPoint(-38F, 10F, -2F);
		defaultStockModel[3].rotateAngleZ = 0.5235988F;

		defaultStockModel[4].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // ST.StockForwardSupport
		defaultStockModel[4].setRotationPoint(-12F, -9.5F, -2F);
		defaultStockModel[4].rotateAngleZ = 0.3839724F;



// Ammo
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this,  169,  1, textureX, textureY); // AM.Top
		ammoModel[1] = new ModelRendererTurbo(this,  209,  1, textureX, textureY); // AM.2nd
		ammoModel[2] = new ModelRendererTurbo(this,  249,  1, textureX, textureY); // AM.Third

		ammoModel[0].addBox(0F, 0F, 0F, 12, 5, 4, 0F); // AM.Top
		ammoModel[0].setRotationPoint(17F, -3.4F, -2F);
		ammoModel[0].rotateAngleZ = 0.05235988F;

		ammoModel[1].addBox(0F, 0F, 0F, 12, 5, 4, 0F); // AM.2nd
		ammoModel[1].setRotationPoint(17.3F, 1.6F, -2F);
		ammoModel[1].rotateAngleZ = 0.1396263F;

		ammoModel[2].addBox(0F, 0F, 0F, 12, 7, 4, 0F); // AM.Third
		ammoModel[2].setRotationPoint(18F, 6.4F, -2F);
		ammoModel[2].rotateAngleZ = 0.2094395F;



// Slide
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // SL.Slide?

		slideModel[0].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // SL.Slide?
		slideModel[0].setRotationPoint(30F, -14.5F, -2.4F);

		scopeAttachPoint = new Vector3f(40F / 30F, 16F / 16F, 0F);
		
		barrelAttachPoint = new Vector3f(100F / 16F, 9F / 16F, 0F);
		
		gripAttachPoint = new Vector3f(180F / 50F, 8F / 16F, 0F);


		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(1, 2, 0);
	}
}