//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.07.2016 - 16:04:41
// Last changed on: 02.07.2016 - 16:04:41

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelShortSpear extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelShortSpear() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[4];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4

		gunModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		gunModel[0].setRotationPoint(-4.2F, -2.5F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F); // Box 2
		gunModel[1].setRotationPoint(9.5F, -2.5F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F); // Box 3
		gunModel[2].setRotationPoint(9.5F, -2.5F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.3F, 0F); // Box 4
		gunModel[3].setRotationPoint(10.5F, -2.5F, -1F);
	}
}