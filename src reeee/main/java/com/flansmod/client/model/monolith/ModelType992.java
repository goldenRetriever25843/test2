//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.5
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelType992 extends ModelMG
{
	int textureX = 512;
	int textureY = 512;

	public ModelType992()	
	{


// Bipod
		bipodModel = new ModelRendererTurbo[4];
		bipodModel[0] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // 
		bipodModel[1] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // BP.FootRight
		bipodModel[2] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // BP.LeftLeg
		bipodModel[3] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // BP.RightLeg

		bipodModel[0].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // BP.FootLeft
		bipodModel[0].setRotationPoint(-8F, -1F, -0.5F);

		bipodModel[1].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // BP.FootRight
		bipodModel[1].setRotationPoint(6F, -1F, -0.5F);

		bipodModel[2].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // BP.LeftLeg
		bipodModel[2].setRotationPoint(-1F, -11F, -0.5F);
		bipodModel[2].rotateAngleZ = -0.5235988F;

		bipodModel[3].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // BP.RightLeg
		bipodModel[3].setRotationPoint(0F, -10.5F, -0.5F);
		bipodModel[3].rotateAngleZ = 0.5235988F;		
		


// Gun
		gunModel = new ModelRendererTurbo[14];
		gunModel[0] = new ModelRendererTurbo(this,  50,  200, textureX, textureY); // 
		gunModel[1] = new ModelRendererTurbo(this,  50,  220, textureX, textureY); // Gn.BottomBarrel
		gunModel[2] = new ModelRendererTurbo(this,  50,  250, textureX, textureY); // GN.LowerCornerLandRight
		gunModel[3] = new ModelRendererTurbo(this,  50,  250, textureX, textureY); // GN.LowerCornerLandLeft
		gunModel[4] = new ModelRendererTurbo(this,  50,  280, textureX, textureY); // GN.UpperPart
		gunModel[5] = new ModelRendererTurbo(this,  50,  310, textureX, textureY); // GN.UpperBarrel
		gunModel[6] = new ModelRendererTurbo(this,  120,  320, textureX, textureY); // GN.ConnectorThingy
		gunModel[7] = new ModelRendererTurbo(this,  120,  300, textureX, textureY); // GN.BarrelEnd
		gunModel[8] = new ModelRendererTurbo(this,  50,  350, textureX, textureY); // GN.AmmoAcceptorRight
		gunModel[9] = new ModelRendererTurbo(this,  50,  350, textureX, textureY); // GN.AmmoAcceptorLeft
		gunModel[10] = new ModelRendererTurbo(this,  50,  370, textureX, textureY); // 
		gunModel[11] = new ModelRendererTurbo(this,  50,  390, textureX, textureY); // GN.StockTop
		gunModel[12] = new ModelRendererTurbo(this,  50,  420, textureX, textureY); // GN.StockBottom
		gunModel[13] = new ModelRendererTurbo(this,  50,  450, textureX, textureY); // GN.Grip

		gunModel[0].addBox(-1F, -12F, -0.5F, 2, 3, 1, 0F); // GN.ConnectorThingy
		gunModel[0].setRotationPoint(0F, -1F, 3F);

		gunModel[1].addBox(-0.5F, -11.5F, -13.5F, 1, 1, 15, 0F); // Gn.BottomBarrel
		gunModel[1].setRotationPoint(0F, -1F, 3F);

		gunModel[2].addBox(-0.2F, -12F, -21F, 1, 2, 8, 0F); // GN.LowerCornerLandRight
		gunModel[2].setRotationPoint(0F, -1F, 3F);

		gunModel[3].addBox(-0.8F, -12F, -21F, 1, 2, 8, 0F); // GN.LowerCornerLandLeft
		gunModel[3].setRotationPoint(0F, -1F, 3F);

		gunModel[4].addBox(-1F, -13.5F, -25.5F, 2, 2, 13, 0F); // GN.UpperPart
		gunModel[4].setRotationPoint(0F, -1F, 3F);

		gunModel[5].addBox(-0.5F, -13F, -13F, 1, 1, 22, 0F); // GN.UpperBarrel
		gunModel[5].setRotationPoint(0F, -1F, 3F);

		gunModel[6].addBox(-1.5F, -13.5F, -0.5F, 3, 2, 1, 0F); // GN.ConnectorThingy
		gunModel[6].setRotationPoint(0F, -1F, 3F);

		gunModel[7].addBox(-1F, -13.5F, 9F, 2, 2, 6, 0F); // GN.BarrelEnd
		gunModel[7].setRotationPoint(0F, -1F, 3F);

		gunModel[8].addBox(-0.3F, -14F, -20F, 1, 1, 3, 0F); // GN.AmmoAcceptorRight
		gunModel[8].setRotationPoint(0F, -1F, 3F);

		gunModel[9].addBox(-0.7F, -14F, -20F, 1, 1, 3, 0F); // GN.AmmoAcceptorLeft
		gunModel[9].setRotationPoint(0F, -1F, 3F);

		gunModel[10].addBox(-0.5F, -11.5F, -25F, 1, 2, 4, 0F); // GN.TriggerArea
		gunModel[10].setRotationPoint(0F, -1F, 3F);

		gunModel[11].addBox(-1F, -12F, -33F, 2, 2, 8, 0F); // GN.StockTop
		gunModel[11].setRotationPoint(0F, -1F, 3F);

		gunModel[12].addBox(-1F, -10F, -33F, 2, 2, 8, 0F); // GN.StockBottom
		gunModel[12].setRotationPoint(0F, -1F, 3F);
		gunModel[12].rotateAngleX = 0.2094395F;

		gunModel[13].addBox(-1F, -10F, -24.5F, 2, 4, 2, 0F); // GN.Grip
		gunModel[13].setRotationPoint(0F, -1F, 3F);
		gunModel[13].rotateAngleX = -0.1745329F;		
		


// Ammo
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this,  100,  350, textureX, textureY); // 
		ammoModel[1] = new ModelRendererTurbo(this,  100,  360, textureX, textureY); // AM.Middle
		ammoModel[2] = new ModelRendererTurbo(this,  100,  350, textureX, textureY); // AM.Top

		ammoModel[0].addBox(-0.5F, -15.5F, -19.5F, 1, 2, 2, 0F); // AM.Bottom
		ammoModel[0].setRotationPoint(0F, -1F, 3F);

		ammoModel[1].addBox(-0.5F, -17.4F, -19F, 1, 2, 2, 0F); // AM.Middle
		ammoModel[1].setRotationPoint(0F, -1F, 3F);
		ammoModel[1].rotateAngleX = -0.2617994F;

		ammoModel[2].addBox(-0.5F, -19F, -18F, 1, 2, 2, 0F); // AM.Top
		ammoModel[2].setRotationPoint(0F, -1F, 3F);
		ammoModel[2].rotateAngleX = -0.5235988F;		
		
		flipAll();
	}
}