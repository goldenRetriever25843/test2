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

public class ModelBananaAssault extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelBananaAssault()	
	{


// Gun
		gunModel = new ModelRendererTurbo[5];
		gunModel[0] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.Stock
		gunModel[1] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.WoodBody
		gunModel[2] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // GN.BarrelLeft
		gunModel[3] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // GN.BarrelLeft
		gunModel[4] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // GN.RealBarrel

		gunModel[0].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // GN.Stock
		gunModel[0].setRotationPoint(-6F, -0.5F, -1F);

		gunModel[1].addBox(0F, 0F, 0F, 5, 2, 2, 0); // GN.WoodBody
		gunModel[1].setRotationPoint(-2F, -1F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // GN.BarrelLeft
		gunModel[2].setRotationPoint(-1F, -2F, -0.7F);

		gunModel[3].addBox(0F, 0F, 0F, 10, 2, 1, 0F); // GN.BarrelLeft
		gunModel[3].setRotationPoint(-1F, -2F, -0.2F);

		gunModel[4].addBox(0F, 0F, 0F, 5, 1, 1, 0); // GN.RealBarrel
		gunModel[4].setRotationPoint(9F, -1.5F, -0.5F);



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[5];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // SC.BackBottom
		defaultScopeModel[1] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // SC.FrontBottom
		defaultScopeModel[2] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // SC.Middle
		defaultScopeModel[3] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // SC.Scope
		defaultScopeModel[4] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // SC.IronSightThingy

		defaultScopeModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0); // SC.BackBottom
		defaultScopeModel[0].setRotationPoint(0F, -3F, -0.5F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 1, 1, 1, 0); // SC.FrontBottom
		defaultScopeModel[1].setRotationPoint(5F, -3F, -0.5F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 5, 1, 1, 0); // SC.Middle
		defaultScopeModel[2].setRotationPoint(0.5F, -3.5F, -0.5F);

		defaultScopeModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0); // SC.Scope
		defaultScopeModel[3].setRotationPoint(4F, -4.5F, -0.5F);

		defaultScopeModel[4].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // SC.IronSightThingy
		defaultScopeModel[4].setRotationPoint(1.5F, -4.3F, 0F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // AM.Clip

		ammoModel[0].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // AM.Clip
		ammoModel[0].setRotationPoint(3F, 0F, -0.5F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
		translateAll(0, 3, 0);
	}
}