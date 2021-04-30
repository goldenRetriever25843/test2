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
public class ModelBananaSniper extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelBananaSniper()	
	{


// Gun
		gunModel = new ModelRendererTurbo[4];
		gunModel[0] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.Grip
		gunModel[1] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.Body
		gunModel[2] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // GN.Stock
		gunModel[3] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // GN.Barrel

		gunModel[0].addBox(0F, 0F, 0F, 1, 3, 1, 0); // GN.Grip
		gunModel[0].setRotationPoint(0F, -1F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 10, 2, 2, 0); // GN.Body
		gunModel[1].setRotationPoint(-6F, -3F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 4, 3, 2, 0); // GN.Stock
		gunModel[2].setRotationPoint(-10F, -3F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // GN.Barrel
		gunModel[3].setRotationPoint(4F, -2.5F, -0.5F);



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[3];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // SC.Front
		defaultScopeModel[1] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // SC.Bottom
		defaultScopeModel[2] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // SC.Sightthingy

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 2, 1, 0); // SC.Front
		defaultScopeModel[0].setRotationPoint(0.5F, -5F, -0.5F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 4, 1, 1, 0); // SC.Bottom
		defaultScopeModel[1].setRotationPoint(-3.5F, -4F, -0.5F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // SC.Sightthingy
		defaultScopeModel[2].setRotationPoint(-3F, -4.8F, 0F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // AM.Clip

		ammoModel[0].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // AM.Clip
		ammoModel[0].setRotationPoint(-4F, -1F, -0.5F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(2, 3, 0);
	}
}