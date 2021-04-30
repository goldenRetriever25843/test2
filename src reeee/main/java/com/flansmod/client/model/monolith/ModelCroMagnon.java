//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Advanced Cloth
// Model Creator: 
// Created on: 02.07.2016 - 15:23:36
// Last changed on: 02.07.2016 - 15:23:36

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCroMagnon extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCroMagnon() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[2];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];
		skirtFrontModel = new ModelRendererTurbo[1];
		skirtRearModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 8

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 9, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 2.2F, 0.2F, 0.2F, 2.2F, 0.2F, 0.2F, 2.2F, 0.2F, 0.2F, 2.2F, 0.2F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8F, -2F, 8, 1, 4, 0F,0.35F, 0.2F, 0.35F, 0.35F, 0.2F, 0.35F, 0.35F, 0.2F, 0.35F, 0.35F, 0.2F, 0.35F, 0.35F, 0.2F, 0.35F, 0.35F, 0.2F, 0.35F, 0.35F, 0.2F, 0.35F, 0.35F, 0.2F, 0.35F); // Box 8
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 6
		leftArmModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 7

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 9, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 6
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 7
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		rightArmModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 5

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 9, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 4
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 5
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 10

		leftLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F); // Box 10
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 9

		rightLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F); // Box 9
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1

		skirtFrontModel[0].addShapeBox(-4F, -3F, -2F, 8, 6, 4, 0F,0.2F, 0.2F, 0.3F, -1.8F, 0.2F, 0.3F, -1.8F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.5F, 0.2F, 0.5F, -3.8F, 0.2F, 0.5F, -3.8F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F); // Box 1
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2

		skirtRearModel[0].addShapeBox(-4F, -3F, -2F, 8, 6, 4, 0F,-4.8F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, -4.8F, 0.2F, 0.25F, -6.8F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, -6.8F, 0.2F, 0.5F); // Box 2
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}