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
public class ModelLeeTwo extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelLeeTwo()	
	{


// Gun
		gunModel = new ModelRendererTurbo[5];
		gunModel[0] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.Core
		gunModel[1] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.Stock
		gunModel[2] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // GN.BottomTriggerGuard
		gunModel[3] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // GN.StockAngle
		gunModel[4] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // GN.HandGuard

		gunModel[0].addBox(0F, 0F, 0F, 16, 4, 3, 0F); // GN.Core
		gunModel[0].setRotationPoint(0F, -4F, -1.5F);

		gunModel[1].addBox(0F, 0F, 0F, 8, 4, 2, 0F); // GN.Stock
		gunModel[1].setRotationPoint(-8F, -2F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 6, 1, 1, 0); // GN.BottomTriggerGuard
		gunModel[2].setRotationPoint(0F, 1F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // GN.StockAngle
		gunModel[3].setRotationPoint(-3.5F, -2F, -1F);
		gunModel[3].rotateAngleZ = -0;

		gunModel[4].addBox(0F, 0F, 0F, 16, 3, 2, 0F); // GN.HandGuard
		gunModel[4].setRotationPoint(10F, -4.5F, -1F);



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[5];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // SC.Scope
		defaultScopeModel[1] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // SC.ScopeConnectorBack
		defaultScopeModel[2] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // SC.ScopeConnectorFront
		defaultScopeModel[3] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // SC.ScopeBarrelConnectorTop
		defaultScopeModel[4] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // SC.ScopeBarelConnectorFront

		defaultScopeModel[0].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // SC.Scope
		defaultScopeModel[0].setRotationPoint(0F, -8F, -1F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // SC.ScopeConnectorBack
		defaultScopeModel[1].setRotationPoint(0.5F, -6F, -0.5F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // SC.ScopeConnectorFront
		defaultScopeModel[2].setRotationPoint(6F, -6F, -0.5F);

		defaultScopeModel[3].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // SC.ScopeBarrelConnectorTop
		defaultScopeModel[3].setRotationPoint(1F, -6F, -0.5F);

		defaultScopeModel[4].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // SC.ScopeBarelConnectorFront
		defaultScopeModel[4].setRotationPoint(11F, -6F, -0.5F);
		defaultScopeModel[4].rotateAngleZ = 6;



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // AM.Clip

		ammoModel[0].addBox(0F, 0F, 0F, 4, 6, 2, 0F); // AM.Clip
		ammoModel[0].setRotationPoint(5.5F, 0F, -1F);



// Slide
		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // SL.Barrel
		slideModel[1] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // SL.BarrelIronSight

		slideModel[0].addBox(0F, 0F, 0F, 10, 1, 1, 0); // SL.Barrel
		slideModel[0].setRotationPoint(26F, -3F, -0.5F);

		slideModel[1].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // SL.BarrelIronSight
		slideModel[1].setRotationPoint(32F, -5F, -0.5F);

		


		gunSlideDistance = 0.2F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
	}
}