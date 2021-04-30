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

public class ModelOilFlameThrower extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelOilFlameThrower()	
	{


// Gun
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // GN.Core
		gunModel[1] = new ModelRendererTurbo(this,  33,  1, textureX, textureY); // GN.Anglething
		gunModel[2] = new ModelRendererTurbo(this,  49,  1, textureX, textureY); // GN.Barrel
		gunModel[3] = new ModelRendererTurbo(this,  73,  1, textureX, textureY); // Shape1
		gunModel[4] = new ModelRendererTurbo(this,  89,  1, textureX, textureY); // GN.LighterTube1
		gunModel[5] = new ModelRendererTurbo(this,  105,  1, textureX, textureY); // GN.LighterTube2
		gunModel[6] = new ModelRendererTurbo(this,  137,  1, textureX, textureY); // GN.Lighter
		gunModel[7] = new ModelRendererTurbo(this,  153,  1, textureX, textureY); // GN.Stock/guntransition
		gunModel[8] = new ModelRendererTurbo(this,  177,  1, textureX, textureY); // GN.StockTop
		gunModel[9] = new ModelRendererTurbo(this,  201,  1, textureX, textureY); // GN.StockBottom

		gunModel[0].addBox(0F, 0F, 0F, 10, 3, 4, 0F); // GN.Core
		gunModel[0].setRotationPoint(0F, -5F, -2F);

		gunModel[1].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // GN.Anglething
		gunModel[1].setRotationPoint(10F, -5F, -2F);
		gunModel[1].rotateAngleZ = -0.3665192F;

		gunModel[2].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // GN.Barrel
		gunModel[2].setRotationPoint(10F, -4.5F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Shape1
		gunModel[3].setRotationPoint(18F, -5F, -1.5F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // GN.LighterTube1
		gunModel[4].setRotationPoint(9F, -2F, -0.5F);
		gunModel[4].rotateAngleZ = 0.5235988F;

		gunModel[5].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // GN.LighterTube2
		gunModel[5].setRotationPoint(10.3F, -0.5F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // GN.Lighter
		gunModel[6].setRotationPoint(23F, -2F, -1F);

		gunModel[7].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // GN.Stock/guntransition
		gunModel[7].setRotationPoint(-4F, -2F, -1.5F);
		gunModel[7].rotateAngleZ = 0.4886922F;

		gunModel[8].addBox(0F, 0F, 0F, 8, 3, 3, 0F); // GN.StockTop
		gunModel[8].setRotationPoint(-10F, -2F, -1.5F);

		gunModel[9].addBox(0F, 0F, 0F, 8, 3, 3, 0F); // GN.StockBottom
		gunModel[9].setRotationPoint(-10F, 1F, -1.5F);
		gunModel[9].rotateAngleZ = 0.3839724F;



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[2];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  1,  1, textureX, textureY); // SC.Sight?front
		defaultScopeModel[1] = new ModelRendererTurbo(this,  41,  1, textureX, textureY); // SC.sight?Back

		defaultScopeModel[0].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // SC.Sight?front
		defaultScopeModel[0].setRotationPoint(10F, -7F, -0.5F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // SC.sight?Back
		defaultScopeModel[1].setRotationPoint(4F, -6F, -1F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  89,  1, textureX, textureY); // AM.Ammo

		ammoModel[0].addBox(0F, 0F, 0F, 3, 10, 6, 0F); // AM.Ammo
		ammoModel[0].setRotationPoint(5F, -2.5F, -3F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
	}
}