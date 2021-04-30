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

public class ModelSig extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelSig()	
	{


// Gun
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this,  100,  200, textureX, textureY); // GN.Core
		gunModel[1] = new ModelRendererTurbo(this,  100,  210, textureX, textureY); // GN.HandGuardLeft
		gunModel[2] = new ModelRendererTurbo(this,  100,  220, textureX, textureY); // GN.HandGuardRight
		gunModel[3] = new ModelRendererTurbo(this,  100,  230, textureX, textureY); // GN.Barrel
		gunModel[4] = new ModelRendererTurbo(this,  100,  240, textureX, textureY); // GN.CoreFront
		gunModel[5] = new ModelRendererTurbo(this,  100,  250, textureX, textureY); // GN.Corebottom
		gunModel[6] = new ModelRendererTurbo(this,  100,  300, textureX, textureY); // GN.GripLeft
		gunModel[7] = new ModelRendererTurbo(this,  100,  300, textureX, textureY); // GN.GripRight
		gunModel[8] = new ModelRendererTurbo(this,  100,  310, textureX, textureY); // GN.IronSight
		gunModel[9] = new ModelRendererTurbo(this,  100,  320, textureX, textureY); // GN.IronSightDetailLeft
		gunModel[10] = new ModelRendererTurbo(this,  100,  320, textureX, textureY); // GN.IronSightDetailright
		gunModel[11] = new ModelRendererTurbo(this,  100,  330, textureX, textureY); // GN.FrontIronSight

		gunModel[0].addBox(0F, 0F, 0F, 5, 3, 2, 0); // GN.Core
		gunModel[0].setRotationPoint(-1F, -3F, -1F);

		gunModel[1].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // GN.HandGuardLeft
		gunModel[1].setRotationPoint(6F, -3.1F, -0.8F);

		gunModel[2].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // GN.HandGuardRight
		gunModel[2].setRotationPoint(6F, -3.1F, -0.2F);

		gunModel[3].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // GN.Barrel
		gunModel[3].setRotationPoint(18F, -2.2F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 2, 2, 2, 0); // GN.CoreFront
		gunModel[4].setRotationPoint(4F, -3F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // GN.Corebottom
		gunModel[5].setRotationPoint(3.2F, -1.9F, -1F);
		gunModel[5].rotateAngleZ = -6;

		gunModel[6].addBox(0F, 0F, 0F, 1, 3, 1, 0); // GN.GripLeft
		gunModel[6].setRotationPoint(0F, -1F, -0.7F);
		gunModel[6].rotateAngleZ = 6;

		gunModel[7].addBox(0F, 0F, 0F, 1, 3, 1, 0); // GN.GripRight
		gunModel[7].setRotationPoint(0F, -1F, -0.3F);
		gunModel[7].rotateAngleZ = 6;

		gunModel[8].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // GN.IronSight
		gunModel[8].setRotationPoint(0F, -3.5F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 1, 0, 0); // GN.IronSightDetailLeft
		gunModel[9].setRotationPoint(0F, -3.8F, -0.4F);

		gunModel[10].addBox(0F, 0F, 0F, 1, 1, 0, 0); // GN.IronSightDetailright
		gunModel[10].setRotationPoint(0F, -3.8F, 0.4F);

		gunModel[11].addBox(0F, 0F, 0F, 1, 1, 1, 0); // GN.FrontIronSight
		gunModel[11].setRotationPoint(17F, -3.8F, -0.5F);
		
		scopeAttachPoint = new Vector3f(4F / 16F, 4F / 16F, 0F);
		
		stockAttachPoint = new Vector3f(-4F / 16F, 3F / 16F, 0F);
		
		//Barrel		
		barrelAttachPoint = new Vector3f(18F / 16F, 3F / 16F, 0F);
		
		gripAttachPoint = new Vector3f(10F / 16F, 3F / 16F, 0F);



// Default Stock
		defaultStockModel = new ModelRendererTurbo[5];
		defaultStockModel[0] = new ModelRendererTurbo(this,  150,  200, textureX, textureY); // ST.StockCore
		defaultStockModel[1] = new ModelRendererTurbo(this,  150,  210, textureX, textureY); // ST.Back
		defaultStockModel[2] = new ModelRendererTurbo(this,  150,  220, textureX, textureY); // ST.Corner
		defaultStockModel[3] = new ModelRendererTurbo(this,  150,  230, textureX, textureY); // ST.Bottom
		defaultStockModel[4] = new ModelRendererTurbo(this,  150,  240, textureX, textureY); // ST.TopAngle

		defaultStockModel[0].addBox(0F, 0F, 0F, 6, 1, 1, 0); // ST.StockCore
		defaultStockModel[0].setRotationPoint(-7F, -2.2F, -0.5F);

		defaultStockModel[1].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // ST.Back
		defaultStockModel[1].setRotationPoint(-8F, -2.2F, -0.5F);

		defaultStockModel[2].addBox(0F, 0F, 0F, 5, 1, 1, 0); // ST.Corner
		defaultStockModel[2].setRotationPoint(-7.5F, 0.8F, -0.5F);
		defaultStockModel[2].rotateAngleZ = -6;

		defaultStockModel[3].addBox(0F, 0F, 0F, 3, 2, 1, 0); // ST.Bottom
		defaultStockModel[3].setRotationPoint(-4F, -2.2F, -0.5F);

		defaultStockModel[4].addBox(0F, 0F, 0F, 2, 1, 1, 0); // ST.TopAngle
		defaultStockModel[4].setRotationPoint(-2.7F, -2F, -0.5F);
		defaultStockModel[4].rotateAngleZ = -6;



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // AM.Clip

		ammoModel[0].addBox(0F, 0F, 0F, 2, 3, 1, 0); // AM.Clip
		ammoModel[0].setRotationPoint(2F, 0F, -0.5F);
		ammoModel[0].rotateAngleZ = -6;

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(0, 1, 0);
	}
}