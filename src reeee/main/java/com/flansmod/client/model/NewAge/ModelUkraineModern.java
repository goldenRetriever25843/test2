//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
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

public class ModelUkraineModern extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelUkraineModern() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];
		bodyModel = new ModelRendererTurbo[44];
		leftArmModel = new ModelRendererTurbo[7];
		rightArmModel = new ModelRendererTurbo[7];
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
		headModel[0] = new ModelRendererTurbo(this, 52, 109, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 62, 94, textureX, textureY); // Box 3
		headModel[2] = new ModelRendererTurbo(this, 68, 32, textureX, textureY); // Box 4
		headModel[3] = new ModelRendererTurbo(this, 69, 30, textureX, textureY); // Box 5
		headModel[4] = new ModelRendererTurbo(this, 66, 29, textureX, textureY); // Box 6
		headModel[5] = new ModelRendererTurbo(this, 82, 15, textureX, textureY); // Box 6
		headModel[6] = new ModelRendererTurbo(this, 83, 13, textureX, textureY); // Box 7
		headModel[7] = new ModelRendererTurbo(this, 90, 29, textureX, textureY); // Box 8
		headModel[8] = new ModelRendererTurbo(this, 76, 18, textureX, textureY); // Box 9
		headModel[9] = new ModelRendererTurbo(this, 92, 32, textureX, textureY); // Box 10
		headModel[10] = new ModelRendererTurbo(this, 67, 34, textureX, textureY); // Box 11
		headModel[11] = new ModelRendererTurbo(this, 86, 116, textureX, textureY); // Box 12
		headModel[12] = new ModelRendererTurbo(this, 100, 106, textureX, textureY); // Box 13
		headModel[13] = new ModelRendererTurbo(this, 107, 102, textureX, textureY); // Box 14
		headModel[14] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 15

		headModel[0].addShapeBox(-5F, -7F, -5F, 10, 3, 10, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-5F, -9F, -5F, 10, 2, 10, 0F,-1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -4.5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.3F, -2F, -0.25F, -0.3F, -2F, -0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F); // Box 4
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5.5F, -4.5F, -2F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.3F, 0F, 0.25F, -1.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 5
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -4.5F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 6
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(4F, -4.5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.3F, -2F, 0.25F, -0.3F, -2F, 0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F); // Box 6
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(3.5F, -4.5F, -2F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.3F, 0F, 0.75F, -1.3F, 0F, 1F, 0.3F, 0F, -1F, 0.3F, 0F); // Box 7
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4F, -4.5F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 8
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -4.5F, 4F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -3.5F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F); // Box 10
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(0F, -3.5F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F); // Box 11
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5F, -6F, -5F, 10, 1, 10, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F); // Box 12
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5F, -5.5F, -5.6F, 10, 1, 1, 0F,-0.1F, -0.5F, -1.02F, -0.1F, -0.5F, -1.02F, -0.1F, -0.5F, 0.02F, -0.1F, -0.5F, 0.02F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		headModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, -166, 121, textureX, textureY); // Box 39
		bodyModel[1] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 33
		bodyModel[2] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 108
		bodyModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 11
		bodyModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 34
		bodyModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 62
		bodyModel[8] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 64
		bodyModel[9] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 1
		bodyModel[13] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 3
		bodyModel[14] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 5
		bodyModel[15] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 7
		bodyModel[16] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 9
		bodyModel[17] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 10
		bodyModel[18] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 11
		bodyModel[19] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 41
		bodyModel[20] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 1
		bodyModel[21] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 11
		bodyModel[24] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 12
		bodyModel[25] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 13
		bodyModel[26] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 14
		bodyModel[27] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 15
		bodyModel[28] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 16
		bodyModel[29] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 17
		bodyModel[30] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 10
		bodyModel[31] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 11
		bodyModel[32] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 12
		bodyModel[33] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		bodyModel[34] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 16
		bodyModel[35] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		bodyModel[36] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 18
		bodyModel[37] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 19
		bodyModel[38] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
		bodyModel[39] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 21
		bodyModel[40] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 22
		bodyModel[41] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 1
		bodyModel[42] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
		bodyModel[43] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 215

		bodyModel[0].addShapeBox(-0.5F, 1.4F, -2.15F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 39
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1.5F, -0.1F, -2.05F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 7F, -2F, 8, 4, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 62
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 2.8F, -2F, 8, 4, 4, 0F,-0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 64
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, -0.2F, -2F, 4, 3, 4, 0F,0F, 0F, 0.3F, -1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 0
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, -0.2F, -2F, 4, 3, 4, 0F,-1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.5F, 1.75F, -2.6F, 7, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 0
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.5F, 1.85F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 1
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.5F, 3.45F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 3
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.5F, 5.05F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 5
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 6.65F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 7
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.5F, 8.25F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 9.85F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 10
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-2.5F, 11.2F, -2.3F, 5, 1, 1, 0F,0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F); // Box 11
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(1.2F, 6.75F, -3.4F, 2, 4, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 41
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1F, 6.75F, -3.4F, 2, 4, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3.2F, 6.75F, -3.4F, 2, 4, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.8F, 2.75F, -2.8F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 0
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-3.5F, 1F, 1.5F, 7, 9, 1, 0F,0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.5F, 4.3F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-3.5F, 2.7F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 13
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-3.5F, 1.1F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 14
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-3.5F, 5.9F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 15
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3.5F, 7.5F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 16
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-3.5F, 9.1F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3.2F, 6.65F, -3.6F, 2, 2, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Box 10
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-1F, 6.65F, -3.6F, 2, 2, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Box 11
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1.2F, 6.65F, -3.6F, 2, 2, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Box 12
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0.8F, 2.65F, -2.9F, 1, 1, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F); // Box 15
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-2F, 1F, 2.3F, 4, 9, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 16
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-1.5F, 7.5F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-1.5F, 5.9F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 18
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-1.5F, 4.3F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 19
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-1.5F, 2.7F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 20
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-1.5F, 1.25F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 21
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-1.5F, 8.95F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 22
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-2F, 2.7F, -2.5F, 4, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-1.6F, 4.25F, -3F, 2, 1, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 1
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-1.6F, 3.75F, -3.02F, 2, 2, 1, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 215
		bodyModel[43].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 59
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 60
		leftArmModel[2] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 1
		leftArmModel[3] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 3
		leftArmModel[4] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 115
		leftArmModel[5] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 116
		leftArmModel[6] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 213

		leftArmModel[0].addShapeBox(2.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F); // Box 59
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(2.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 60
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2.17F, 1F, -1.5F, 1, 2, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 115
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.22F, 0F, -1.5F, 1, 1, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 116
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2.11F, -1.85F, -1.5F, 1, 2, 3, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 213
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 61
		rightArmModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 62
		rightArmModel[2] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 2
		rightArmModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 2
		rightArmModel[4] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 113
		rightArmModel[5] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 114
		rightArmModel[6] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 214

		rightArmModel[0].addShapeBox(-3.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 61
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F); // Box 62
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.22F, 0F, -1.5F, 1, 1, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 113
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3.17F, 1F, -1.5F, 1, 2, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 114
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.11F, -1.85F, -1.5F, 1, 2, 3, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 214
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 63
		leftLegModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 64
		leftLegModel[2] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 0
		leftLegModel[3] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(1.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 63
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(1.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 64
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 67
		rightLegModel[1] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 68
		rightLegModel[2] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 5
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 67
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 68
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}