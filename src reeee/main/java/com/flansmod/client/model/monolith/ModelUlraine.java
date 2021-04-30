//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.10.2015 - 12:39:48
// Last changed on: 17.10.2015 - 12:39:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelUlraine extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelUlraine() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];
		bodyModel = new ModelRendererTurbo[52];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 13
		headModel[1] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 14
		headModel[2] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import Box3
		headModel[3] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import Box3
		headModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box3
		headModel[5] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import Box3
		headModel[6] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import Box3

		headModel[0].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -10F, -4F, 8, 2, 8, 0F,-0.9F, -0.6F, -1.5F, -0.9F, -0.6F, -1.5F, -0.9F, -0.7F, -1.25F, -0.9F, -0.7F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box3
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -8F, -5F, 8, 3, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 1.5F, 1F, 0.1F, 1.5F, 1F, 0.1F); // Import Box3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -8F, 0.2F, 8, 3, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1.5F, 1F, 0.1F, 1.5F, 1F, 0.1F, 0.1F, 1.6F, 0.6F, 0.1F, 1.6F, 0.6F); // Import Box3
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -4F, 0.4F, 8, 1, 4, 0F,1.5F, 0F, 0.3F, 1.5F, 0F, 0.3F, 0.1F, -0.6F, 0.4F, 0.1F, -0.6F, 0.4F, 1.9F, -0.2F, 0.3F, 1.9F, -0.2F, 0.3F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F); // Import Box3
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -4F, -4.2F, 8, 1, 4, 0F,0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 1.5F, 0F, 0.3F, 1.5F, 0F, 0.3F, 0.2F, -1.3F, 1.2F, 0.2F, -1.3F, 1.2F, 1.9F, -0.2F, 0.3F, 1.9F, -0.2F, 0.3F); // Import Box3
		headModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 12
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 133
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 55
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 57
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 58
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 59
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 60
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 61
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 62
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 63
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 64
		bodyModel[12] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 65
		bodyModel[13] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 66
		bodyModel[14] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 67
		bodyModel[15] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 68
		bodyModel[16] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 69
		bodyModel[17] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 70
		bodyModel[18] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 39
		bodyModel[19] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 1
		bodyModel[20] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 62
		bodyModel[23] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 64
		bodyModel[24] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 7
		bodyModel[25] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 8
		bodyModel[26] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 10
		bodyModel[28] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 17
		bodyModel[29] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 25
		bodyModel[30] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 17
		bodyModel[35] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 9
		bodyModel[36] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 10
		bodyModel[37] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 20
		bodyModel[38] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 21
		bodyModel[39] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 23
		bodyModel[41] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 24
		bodyModel[42] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 27
		bodyModel[43] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 28
		bodyModel[44] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 29
		bodyModel[45] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 30
		bodyModel[46] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 31
		bodyModel[47] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 32
		bodyModel[48] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 26
		bodyModel[49] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 37
		bodyModel[50] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 64
		bodyModel[51] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 65

		bodyModel[0].addShapeBox(0F, 0F, -2.2F, 2, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-2F, 0F, -2.2F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F); // Box 12
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-0.5F, 8F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 133
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.8F, 7.2F, 1.35F, 3, 2, 2, 0F,-0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F); // Box 55
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.8F, 6.7F, 1.4F, 3, 1, 2, 0F,-0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F); // Box 57
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2.8F, 7.4F, 2.45F, 1, 1, 1, 0F,-0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F); // Box 58
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-2.8F, 7.6F, 2.5F, 1, 1, 1, 0F,-0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F); // Box 59
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-2.8F, 9.4F, 2.3F, 1, 1, 1, 0F,-0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F); // Box 60
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2.8F, 11.55F, 2.3F, 1, 1, 1, 0F,-0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F); // Box 61
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2.8F, 13.55F, 2.3F, 1, 1, 1, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F); // Box 62
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.8F, 13.95F, 2.3F, 1, 1, 1, 0F,-0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F); // Box 63
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1.9F, 7.85F, 2.2F, 2, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 64
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(1.9F, 6.95F, 2.2F, 2, 1, 1, 0F,-0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(1.9F, 6.7F, 2.2F, 2, 1, 1, 0F,-0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 66
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1.9F, 8.3F, 2.2F, 2, 1, 1, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 67
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1.9F, 9F, 2.2F, 2, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 68
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(1.9F, 6.4F, 2.4F, 2, 1, 1, 0F,-0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F); // Box 69
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1.9F, 6.15F, 2.4F, 2, 1, 1, 0F,-0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F); // Box 70
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-0.5F, 1F, -2.15F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 39
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, -0.1F, -2F, 4, 1, 4, 0F,0F, 0F, 0.1F, -1.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 1
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 0.9F, -2F, 8, 11, 4, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0F, -0.1F, -2F, 4, 1, 4, 0F,-1.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 34
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4F, 2.1F, -2F, 8, 8, 4, 0F,0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F); // Box 62
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4F, -0.2F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 64
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0F, -0.2F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 7
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4F, 10.4F, -2F, 8, 2, 1, 0F,0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, -1.1F, -0.25F, 0.5F, -1.1F, -0.25F, 0.5F, -1.1F, -0.25F, 0.5F, -1.1F, -0.25F, 0.5F); // Box 8
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4.35F, 6.5F, -3.1F, 2, 4, 1, 0F,-0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F); // Box 2
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4.3F, 6.4F, -3.2F, 2, 4, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 10
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-2.45F, 6.5F, -3.1F, 2, 4, 1, 0F,-0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F); // Box 17
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2.5F, 6.4F, -3.2F, 2, 4, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 25
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(2.35F, 6.5F, -3.1F, 2, 4, 1, 0F,-0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(2.3F, 6.4F, -3.2F, 2, 4, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 31
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(0.449999999999999F, 6.5F, -3.1F, 2, 4, 1, 0F,-0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F); // Box 32
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0.5F, 6.4F, -3.2F, 2, 4, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 33
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4F, 10.4F, 1F, 8, 2, 1, 0F,0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 17
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3F, 2F, -2.7F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 9
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(2F, 0F, -2.7F, 1, 2, 6, 0F,-0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F); // Box 10
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3F, 0F, -2.7F, 1, 2, 6, 0F,-0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F); // Box 20
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(2F, 2F, -2.7F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 21
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(3F, 2F, -2.6F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 0
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4F, 2F, -2.6F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 23
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-5F, -0.3F, -2.9F, 2, 2, 1, 0F,-0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 24
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(3F, -0.3F, -2.9F, 2, 2, 1, 0F,-0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-3F, 7.5F, 1.55F, 1, 1, 2, 0F,0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, -0.8F); // Box 28
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(2F, 7.5F, 1.55F, 1, 1, 2, 0F,0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, -0.8F); // Box 29
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-3F, 1.8F, 1.55F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 30
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3F, 1.8F, 1.7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F); // Box 31
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3F, 5.8F, 1.55F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.25F, -0.7F, 0F, -0.25F, -0.7F, 0F, -0.25F, -0.7F, -0.8F, -0.25F, -0.7F, -0.8F); // Box 32
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-4F, 7.5F, -2.6F, 8, 1, 6, 0F,0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -0.8F, 0.2F, 0.3F, -0.8F); // Box 26
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-1F, 7.5F, -2.7F, 2, 1, 2, 0F,-0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F); // Box 37
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-1.5F, 1.8F, -3F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-1.5F, 1.8F, -3F, 3, 1, 1, 0F,0.05F, 0.1F, 0.1F, 0.05F, 0.1F, 0.1F, 0.05F, 0.1F, 0.1F, 0.05F, 0.1F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F); // Box 65
		bodyModel[51].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 49
		leftArmModel[2] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 3
		leftArmModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 59
		leftArmModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 60

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.95F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 49
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 59
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 60
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 48
		rightArmModel[2] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 2
		rightArmModel[3] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 61
		rightArmModel[4] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 62

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.05F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 48
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 61
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 62
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		leftLegModel[2] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 63
		leftLegModel[3] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 64

		leftLegModel[0].addShapeBox(-2F, 7.1F, -2.3F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 63
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(1.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 64
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 5
		rightLegModel[2] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 67
		rightLegModel[3] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 68

		rightLegModel[0].addShapeBox(-2F, 7.1F, -2.3F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 67
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 68
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}