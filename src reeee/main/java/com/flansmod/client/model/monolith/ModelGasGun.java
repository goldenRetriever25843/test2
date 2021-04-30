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

public class ModelGasGun extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelGasGun()	
	{


// Gun
		gunModel = new ModelRendererTurbo[9];
		gunModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // GN.Core
		gunModel[1] = new ModelRendererTurbo(this,  25,  1, textureX, textureY); // GN.Handle
		gunModel[2] = new ModelRendererTurbo(this,  33,  1, textureX, textureY); // GN.GripCoverFront
		gunModel[3] = new ModelRendererTurbo(this,  41,  1, textureX, textureY); // GN.Gripbottomcover
		gunModel[4] = new ModelRendererTurbo(this,  49,  1, textureX, textureY); // GN.Shaft
		gunModel[5] = new ModelRendererTurbo(this,  97,  1, textureX, textureY); // GN.AmmoAccepor
		gunModel[6] = new ModelRendererTurbo(this,  113,  1, textureX, textureY); // GN.Barrel
		gunModel[7] = new ModelRendererTurbo(this,  121,  1, textureX, textureY); // GN.StockConnector
		gunModel[8] = new ModelRendererTurbo(this,  137,  1, textureX, textureY); // GN.Stock

		gunModel[0].addBox(0F, 0F, 0F, 7, 3, 3, 0F); // GN.Core
		gunModel[0].setRotationPoint(-1F, -4F, -1.5F);

		gunModel[1].addBox(0F, -0.8F, 0F, 1, 4, 1, 0F); // GN.Handle
		gunModel[1].setRotationPoint(0.4F, -1F, -0.5F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // GN.GripCoverFront
		gunModel[2].setRotationPoint(3.5F, -1F, -0.5F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addBox(-2.8F, 0F, 0F, 3, 0, 1, 0F); // GN.Gripbottomcover
		gunModel[3].setRotationPoint(3F, 2F, -0.5F);
		gunModel[3].rotateAngleZ = -0.08726646F;

		gunModel[4].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // GN.Shaft
		gunModel[4].setRotationPoint(6F, -3.8F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // GN.AmmoAccepor
		gunModel[5].setRotationPoint(6.2F, -2.5F, -2F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // GN.Barrel
		gunModel[6].setRotationPoint(16F, -3.5F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // GN.StockConnector
		gunModel[7].setRotationPoint(-5F, -3.5F, -1F);

		gunModel[8].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // GN.Stock
		gunModel[8].setRotationPoint(-7F, -3.8F, -1.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  81,  1, textureX, textureY); // AM.Ammo

		ammoModel[0].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // AM.Ammo
		ammoModel[0].setRotationPoint(7F, -1.5F, -2F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
	}
}