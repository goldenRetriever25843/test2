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


public class ModelBananaBR extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelBananaBR()	
	{


// Gun
		gunModel = new ModelRendererTurbo[1];
		gunModel[0] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.Main

		gunModel[0].addBox(0F, 0F, 0F, 12, 3, 2, 0); // GN.Main
		gunModel[0].setRotationPoint(0F, -2F, -1F);



// Default Barrel
		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // BL.Barrel

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 5, 1, 1, 0); // BL.Barrel
		defaultBarrelModel[0].setRotationPoint(12F, -0.5F, -0.5F);



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[2];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // SC.Scope
		defaultScopeModel[1] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // SC.ScopeBack

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0); // SC.Scope
		defaultScopeModel[0].setRotationPoint(10F, -3F, -0.5F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 3, 1, 1, 0); // SC.ScopeBack
		defaultScopeModel[1].setRotationPoint(2F, -3F, -0.5F);



// Default Stock
		defaultStockModel = new ModelRendererTurbo[1];
		defaultStockModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // ST.Stock

		defaultStockModel[0].addBox(0F, 0F, 0F, 7, 3, 2, 0); // ST.Stock
		defaultStockModel[0].setRotationPoint(-6F, -1F, -1F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // AM.Clip

		ammoModel[0].addBox(0F, 0F, 0F, 2, 3, 1, 0); // AM.Clip
		ammoModel[0].setRotationPoint(5F, 1F, -0.5F);



// Slide
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // SL.Slide

		slideModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0); // SL.Slide
		slideModel[0].setRotationPoint(6F, -1F, -2F);

		


		gunSlideDistance = 0.2F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(1, 3, 0);
	}
}