//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTrackSuit extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelTrackSuit() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[16];
		leftArmModel = new ModelRendererTurbo[8];
		rightArmModel = new ModelRendererTurbo[8];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 53
		bodyModel[2] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 33
		bodyModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 39
		bodyModel[4] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 34
		bodyModel[8] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 65
		bodyModel[9] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 70
		bodyModel[10] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 73
		bodyModel[11] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 74
		bodyModel[12] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 75
		bodyModel[13] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 76
		bodyModel[14] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 77
		bodyModel[15] = new ModelRendererTurbo(this, 27, 84, textureX, textureY); // Box 90

		bodyModel[0].addShapeBox(-3.9F, 6.8F, -2.15F, 1, 3, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 52
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(2.9F, 6.8F, -2.15F, 1, 3, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 53
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 33
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.5F, 1.4F, -2.15F, 1, 10, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0.4F, 0F); // Box 39
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.3F, -0.5F, 0F, -1.3F, -0.5F, 0F, -1.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 11
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -1.3F, -0.5F, 0F); // Box 12
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 1.4F, -2.25F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 65
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0.9F, -0.12F, -1.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 70
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0.9F, -0.12F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 73
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0.9F, -0.12F, 0.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 74
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.9F, -0.12F, -1.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 75
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.9F, -0.12F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 76
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.9F, -0.12F, 0.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 77
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1.5F, 1.5F, -2.11F, 50, 34, 0, 0F,0F, 0F, 0F, -49F, 0F, 0F, -49F, 0F, 0F, 0F, 0F, 0F, 0F, -33.3F, 0F, -49F, -33.3F, 0F, -49F, -33.3F, 0F, 0F, -33.3F, 0F); // Box 90
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 3
		leftArmModel[2] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 66
		leftArmModel[3] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 67
		leftArmModel[4] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 68
		leftArmModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 69
		leftArmModel[6] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 71
		leftArmModel[7] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 72

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(2.12F, -2.12F, -1.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 66
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.12F, -2.12F, -0.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 67
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2.12F, -2.12F, 0.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 68
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1.1F, -2.12F, -1.5F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 69
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1.1F, -2.12F, -0.5F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 71
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1.1F, -2.12F, 0.5F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 72
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 78
		rightArmModel[3] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 79
		rightArmModel[4] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 80
		rightArmModel[5] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 81
		rightArmModel[6] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 82
		rightArmModel[7] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 83

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2.9F, -2.12F, -1.5F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 78
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-2.9F, -2.12F, -0.5F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 79
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-2.9F, -2.12F, 0.5F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 80
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3.12F, -2.12F, -1.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 81
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.12F, -2.12F, -0.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 82
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3.12F, -2.12F, 0.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 83
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 0
		leftLegModel[2] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 87
		leftLegModel[3] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 88
		leftLegModel[4] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 89

		leftLegModel[0].addShapeBox(-2F, 8.1F, -2.3F, 4, 4, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1.12F, -0.119999999999999F, -1.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 87
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(1.12F, -0.119999999999999F, -0.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 88
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(1.12F, -0.119999999999999F, 0.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 89
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 5
		rightLegModel[2] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 84
		rightLegModel[3] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 85
		rightLegModel[4] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 86

		rightLegModel[0].addShapeBox(-2F, 8.1F, -2.3F, 4, 4, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.12F, -0.119999999999999F, -1.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 84
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.12F, -0.119999999999999F, -0.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 85
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.12F, -0.119999999999999F, 0.5F, 1, 9, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 86
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}