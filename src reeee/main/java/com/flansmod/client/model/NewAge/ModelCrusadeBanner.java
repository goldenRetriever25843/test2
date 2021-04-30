//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCrusadeBanner extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCrusadeBanner() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[7];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 32
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		bodyModel[3] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 35
		bodyModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 36
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8

		bodyModel[0].addShapeBox(-4F, 8.5F, -2F, 8, 1, 4, 0F,0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 1.9F, -2F, 8, 5, 4, 0F,0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0.1F, 0.25F, 0.17F, 0.1F, 0.25F, 0.17F, 0.1F, 0.25F, 0.17F, 0.1F, 0.25F); // Box 32
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 7.51F, -2F, 8, 1, 4, 0F,0.17F, 0.5F, 0.25F, 0.17F, 0.5F, 0.25F, 0.17F, 0.5F, 0.25F, 0.17F, 0.5F, 0.25F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 33
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.15F, 0.15F, 0.2F, -2.83F, 0.15F, 0.2F, -2.83F, 0.15F, 0.2F, 0.15F, 0.15F, 0.2F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F); // Box 34
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-2.83F, 0.15F, 0.2F, 0.15F, 0.15F, 0.2F, 0.15F, 0.15F, 0.2F, -2.83F, 0.15F, 0.2F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F); // Box 35
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3F, 2.5F, -2.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -44F, 0F, -0.4F, -44F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -45F, -0.4F, -44F, -45F, -0.4F, -44F, -45F, -0.4F, 0F, -45F, -0.4F); // Box 36
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 8.9F, -2F, 8, 5, 4, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F); // Box 8
		bodyModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 31

		leftLegModel[0].addShapeBox(-2F, -2.3F, -2F, 4, 8, 4, 0F,0.5F, 0.12F, 0.3F, 0.3F, 0.12F, 0.3F, 0.3F, 0.12F, 0.3F, 0.5F, 0.12F, 0.3F, -0.7F, 0.8F, 0.5F, 1.2F, 0F, 0.3F, 1.2F, 0F, 0.3F, -0.7F, 0.8F, 0.5F); // Box 31
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 30

		rightLegModel[0].addShapeBox(-2F, -2.3F, -2F, 4, 8, 4, 0F,0.3F, 0.12F, 0.3F, 0.5F, 0.12F, 0.3F, 0.5F, 0.12F, 0.3F, 0.3F, 0.12F, 0.3F, 1.2F, 0F, 0.3F, -0.7F, 0.8F, 0.5F, -0.7F, 0.8F, 0.5F, 1.2F, 0F, 0.3F); // Box 30
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}
}