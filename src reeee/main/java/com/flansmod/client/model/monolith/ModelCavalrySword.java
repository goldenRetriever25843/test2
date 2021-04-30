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

public class ModelCavalrySword extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelCavalrySword()	
	{


// Gun
		gunModel = new ModelRendererTurbo[8];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // GN.Grip
		gunModel[1] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // GN.CoverTop
		gunModel[2] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // GN.CoverTop
		gunModel[3] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // GN.CoverFront
		gunModel[4] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // GN.TopHandle
		gunModel[5] = new ModelRendererTurbo(this,  50,  0, textureX, textureY); // GN.BladeBottom
		gunModel[6] = new ModelRendererTurbo(this,  100,  0, textureX, textureY); // GN.BladeMiddle
		gunModel[7] = new ModelRendererTurbo(this,  150,  0, textureX, textureY); // GN.BladeTop

		gunModel[0].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // GN.Grip
		gunModel[0].setRotationPoint(-1.5F, -4F, -1F);

		gunModel[1].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // GN.CoverTop
		gunModel[1].setRotationPoint(0.5F, -4F, -1F);
		gunModel[1].rotateAngleZ = -0.2443461F;

		gunModel[2].addBox(0F, -1F, 0F, 4, 1, 2, 0F); // GN.CoverTop
		gunModel[2].setRotationPoint(0.5F, 5F, -1F);
		gunModel[2].rotateAngleZ = 0.2617994F;

		gunModel[3].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // GN.CoverFront
		gunModel[3].setRotationPoint(3.5F, -3F, -1F);

		gunModel[4].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // GN.TopHandle
		gunModel[4].setRotationPoint(-2.5F, -5F, -2F);

		gunModel[5].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // GN.BladeBottom
		gunModel[5].setRotationPoint(-1.4F, -12F, -0.5F);
		gunModel[5].rotateAngleZ = -0.01745329F;

		gunModel[6].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // GN.BladeMiddle
		gunModel[6].setRotationPoint(-1.8F, -25.8F, -0.5F);
		gunModel[6].rotateAngleZ = 0.03490658F;

		gunModel[7].addBox(-2F, -12F, 0F, 2, 12, 1, 0F); // GN.BladeTop
		gunModel[7].setRotationPoint(0.2F, -25.8F, -0.5F);
		gunModel[7].rotateAngleZ = 0.1047198F;

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;

		flipAll();
	}
}