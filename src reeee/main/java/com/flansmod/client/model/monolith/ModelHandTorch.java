//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HandTorch
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHandTorch extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHandTorch() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[1];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0

		gunModel[0].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 0
		gunModel[0].setRotationPoint(1F, -5F, -1F);
		gunModel[0].rotateAngleZ = -0.20943951F;
	}
}