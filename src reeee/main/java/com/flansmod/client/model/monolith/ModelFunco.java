//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
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

public class ModelFunco extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelFunco()	
	{


// Gun
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this,  100,  0, textureX, textureY); // GU.Handguardspine
		gunModel[1] = new ModelRendererTurbo(this,  0,  20, textureX, textureY); // GU.Triggergaurd
		gunModel[2] = new ModelRendererTurbo(this,  120,  0, textureX, textureY); // GU.Body
		gunModel[3] = new ModelRendererTurbo(this,  0,  50, textureX, textureY); // GU.Grip
		gunModel[4] = new ModelRendererTurbo(this,  160,  0, textureX, textureY); // GU.Body/HandGuardmechanism
		gunModel[5] = new ModelRendererTurbo(this,  170,  0, textureX, textureY); // GU.Frontofclipthing
		gunModel[6] = new ModelRendererTurbo(this,  75,  0, textureX, textureY); // GU.AircoolerTop
		gunModel[7] = new ModelRendererTurbo(this,  75,  0, textureX, textureY); // GU.AircoolerBottom
		gunModel[8] = new ModelRendererTurbo(this,  50,  0, textureX, textureY); // GU.IronSight
		gunModel[9] = new ModelRendererTurbo(this,  100,  50, textureX, textureY); // GU.Handguardspine

		gunModel[0].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // GU.Handguardspine
		gunModel[0].setRotationPoint(9F, -1.3F, -1F);

		gunModel[1].addBox(0F, 0F, 0F, 8, 1, 1, 0); // GU.Triggergaurd
		gunModel[1].setRotationPoint(0F, 3F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 9, 4, 2, 0); // GU.Body
		gunModel[2].setRotationPoint(-1F, -2F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 2, 4, 2, 0); // GU.Grip
		gunModel[3].setRotationPoint(0F, 1.2F, -1F);
		gunModel[3].rotateAngleZ = 0;

		gunModel[4].addBox(0F, 0F, 0F, 1, 3, 2, 0); // GU.Body/HandGuardmechanism
		gunModel[4].setRotationPoint(8F, -1.8F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 4, 2, 2, 0); // GU.Frontofclipthing
		gunModel[5].setRotationPoint(4F, 2F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 3, 1, 2, 0); // GU.AircoolerTop
		gunModel[6].setRotationPoint(15F, -1.6F, -1F);
		gunModel[6].rotateAngleZ = 44;

		gunModel[7].addBox(0F, 0F, 0F, 3, 1, 2, 0); // GU.AircoolerBottom
		gunModel[7].setRotationPoint(14.8F, -0.5F, -1F);
		gunModel[7].rotateAngleZ = -44;

		gunModel[8].addBox(0F, 0F, 0F, 1, 2, 1, 0); // GU.IronSight
		gunModel[8].setRotationPoint(17F, -2.5F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // GU.Handguardspine
		gunModel[9].setRotationPoint(10F, -1.6F, -0.5F);



// Default Barrel
		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this,  34,  0, textureX, textureY); // BA.Barrel

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 3, 1, 1, 0); // BA.Barrel
		defaultBarrelModel[0].setRotationPoint(17.8F, -1F, -0.5F);



// Default Stock
		defaultStockModel = new ModelRendererTurbo[4];
		defaultStockModel[0] = new ModelRendererTurbo(this,  0,  75, textureX, textureY); // ST.Stocktop
		defaultStockModel[1] = new ModelRendererTurbo(this,  0,  175, textureX, textureY); // ST.Stockback
		defaultStockModel[2] = new ModelRendererTurbo(this,  0,  120, textureX, textureY); // ST.StockBottomBack
		defaultStockModel[3] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // ST.Stockbottomfront

		defaultStockModel[0].addBox(0F, 0F, 0F, 8, 1, 2, 0); // ST.Stocktop
		defaultStockModel[0].setRotationPoint(-9F, -1.5F, -1F);
		defaultStockModel[0].rotateAngleZ = -0;

		defaultStockModel[1].addBox(0F, 0F, 0F, 1, 5, 2, 0); // ST.Stockback
		defaultStockModel[1].setRotationPoint(-10F, -1.5F, -1F);
		defaultStockModel[1].rotateAngleZ = 0;

		defaultStockModel[2].addBox(-3F, 2F, -1F, 4, 1, 2, 0F); // ST.StockBottomBack
		defaultStockModel[2].setRotationPoint(-9F, 2F, -1F);
		defaultStockModel[2].rotateAngleZ = -6;

		defaultStockModel[2].addBox(0F, 0F, 0F, 2, 2, 0, 0); // ST.DetailStockconnecterthing
		defaultStockModel[2].setRotationPoint(-6F, -1F, 0F);

		defaultStockModel[3].addBox(0F, 0F, 0F, 4, 1, 2, 0); // ST.Stockbottomfront
		defaultStockModel[3].setRotationPoint(-5F, 0.4F, -1F);
		defaultStockModel[3].rotateAngleZ = -0;

		
		scopeAttachPoint = new Vector3f(4F / 16F, 5F / 16F, 0F);
		
		stockAttachPoint = new Vector3f(-4F / 16F, 5F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 4F / 16F, 0F);
		
		gripAttachPoint = new Vector3f(12F / 16F, 2.5F / 16F, 0F);


// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // AM.Clip

		ammoModel[0].addBox(0F, 0F, 0F, 3, 5, 1, 0); // AM.Clip
		ammoModel[0].setRotationPoint(4.5F, 3F, -0.5F);
		ammoModel[0].rotateAngleZ = -6;
		
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this,  150,  0, textureX, textureY); // SL.Barrel
		

		slideModel[0].addBox(7F, -1F, -2F, 1, 1, 1, 0); // SL.Barrel
		slideModel[0].setRotationPoint(0F, 0F, 0F);

		



		gunSlideDistance = 0.2F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(0, 3, 0);
	}
}