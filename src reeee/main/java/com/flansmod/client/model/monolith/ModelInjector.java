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


public class ModelInjector extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelInjector()	
	{


// Gun
		gunModel = new ModelRendererTurbo[4];
		gunModel[0] = new ModelRendererTurbo(this,  100,  300, textureX, textureY); // GN.Grip
		gunModel[1] = new ModelRendererTurbo(this,  100,  300, textureX, textureY); // GN.BottomFrame
		gunModel[2] = new ModelRendererTurbo(this,  100,  300, textureX, textureY); // GN.NeedleConnector
		gunModel[3] = new ModelRendererTurbo(this,  100,  300, textureX, textureY); // GN.SyringeBackGuard

		gunModel[0].addBox(3F, -2F, -0.5F, 1, 5, 1, 0F); // GN.Grip
		gunModel[0].setRotationPoint(0F, -0.5F, 0F);

		gunModel[1].addBox(3F, -2F, -0.5F, 8, 1, 1, 0F); // GN.BottomFrame
		gunModel[1].setRotationPoint(-4F, -1F, 0F);

		gunModel[2].addBox(3F, -2F, -0.5F, 1, 1, 1, 0F); // GN.NeedleConnector
		gunModel[2].setRotationPoint(3F, -1.5F, 0F);

		gunModel[3].addBox(3F, -2F, -0.5F, 1, 2, 1, 0F); // GN.SyringeBackGuard
		gunModel[3].setRotationPoint(-4F, -2.5F, 0F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // AM.Syringe

		ammoModel[0].addBox(3F, -2F, -0.5F, 6, 2, 2, 0F); // AM.Syringe
		ammoModel[0].setRotationPoint(-3F, -3F, -0.5F);



// Slide
		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this,  200,  210, textureX, textureY); // SD.Needle

		slideModel[0].addBox(3F, -2F, 0F, 8, 1, 1, 0); // SD.Needle
		slideModel[0].setRotationPoint(0F, -2.5F, -0.5F);

		


		gunSlideDistance = -0.25F;
		animationType = EnumAnimationType.P90;

		flipAll();
	}
}