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

public class ModelEru extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelEru()	
	{


// Gun
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // GN.Barrel
		gunModel[1] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // GN.Stock
		gunModel[2] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // GN.Body
		gunModel[3] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // GN.HandGuardLeft
		gunModel[4] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // GN.HandGuardRight
		gunModel[5] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // GN.HandGuardFrontLeft
		gunModel[6] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // GN.HandGuardFrontRight
		gunModel[7] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // GN.BodyMagConnector
		gunModel[8] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // GN.GripLeft
		gunModel[9] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // GN.GripRight

		gunModel[0].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // GN.Barrel
		gunModel[0].setRotationPoint(13F, 0.5F, 0F);

		gunModel[1].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // GN.Stock
		gunModel[1].setRotationPoint(-5F, -0.8F, 0F);
		gunModel[1].rotateAngleZ = -0;

		gunModel[2].addBox(0F, 0F, 0F, 6, 3, 2, 0); // GN.Body
		gunModel[2].setRotationPoint(0F, -1F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // GN.HandGuardLeft
		gunModel[3].setRotationPoint(6F, -0.8F, -0.2F);

		gunModel[4].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // GN.HandGuardRight
		gunModel[4].setRotationPoint(6F, -0.8F, 0.2F);

		gunModel[5].addBox(0F, 0F, 0F, 7, 2, 1, 0); // GN.HandGuardFrontLeft
		gunModel[5].setRotationPoint(6F, 0F, -0.2F);

		gunModel[6].addBox(0F, 0F, 0F, 7, 2, 1, 0); // GN.HandGuardFrontRight
		gunModel[6].setRotationPoint(6F, 0F, 0.2F);

		gunModel[7].addBox(0F, 0F, 0F, 2, 1, 2, 0); // GN.BodyMagConnector
		gunModel[7].setRotationPoint(0.1F, 2F, -0.5F);

		gunModel[8].addBox(0F, 0F, 0F, 1, 3, 1, 0); // GN.GripLeft
		gunModel[8].setRotationPoint(4.5F, 2F, -0.2F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 3, 1, 0); // GN.GripRight
		gunModel[9].setRotationPoint(4.5F, 2F, 0.2F);



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[5];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // SC.ScopeBottom
		defaultScopeModel[1] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // SC.ScopeBL
		defaultScopeModel[2] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // SC.ScopeBR
		defaultScopeModel[3] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // SC.ScopeTL
		defaultScopeModel[4] = new ModelRendererTurbo(this,  0,  350, textureX, textureY); // SC.ScopeTR

		defaultScopeModel[0].addBox(0F, 0F, 0F, 3, 1, 1, 0); // SC.ScopeBottom
		defaultScopeModel[0].setRotationPoint(1.5F, -1.5F, 0F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 3, 1, 1, 0); // SC.ScopeBL
		defaultScopeModel[1].setRotationPoint(1.5F, -2.5F, -0.2F);

		defaultScopeModel[2].addBox(0F, 0F, 0F, 3, 1, 1, 0); // SC.ScopeBR
		defaultScopeModel[2].setRotationPoint(1.5F, -2.5F, 0.2F);

		defaultScopeModel[3].addBox(0F, 0F, 0F, 3, 1, 1, 0); // SC.ScopeTL
		defaultScopeModel[3].setRotationPoint(1.5F, -2.7F, -0.2F);

		defaultScopeModel[4].addBox(0F, 0F, 0F, 3, 1, 1, 0); // SC.ScopeTR
		defaultScopeModel[4].setRotationPoint(1.5F, -2.7F, 0.2F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // AM.Clip

		ammoModel[0].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // AM.Clip
		ammoModel[0].setRotationPoint(0.1F, 3F, 0F);
		ammoModel[0].rotateAngleZ = -0;

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BULLPUP;

		flipAll();
		translateAll(-5, 5, 0);
	}
}