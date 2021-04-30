//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
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

public class ModelRAID extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRAID() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];
		bodyModel = new ModelRendererTurbo[51];
		leftArmModel = new ModelRendererTurbo[4];
		rightArmModel = new ModelRendererTurbo[4];
		leftLegModel = new ModelRendererTurbo[8];
		rightLegModel = new ModelRendererTurbo[8];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 13
		headModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14
		headModel[2] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 21
		headModel[3] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 22
		headModel[4] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 0
		headModel[5] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 3
		headModel[6] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 4
		headModel[7] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 5
		headModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 6
		headModel[9] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 6
		headModel[10] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 7
		headModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 8
		headModel[12] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 9
		headModel[13] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 10
		headModel[14] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 11

		headModel[0].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1F, -7F, -4.8F, 2, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 21
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1F, -8F, -4.8F, 2, 1, 1, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 22
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -7F, -5F, 10, 3, 10, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -9F, -5F, 10, 2, 10, 0F,-1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 3
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -4.5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.3F, -2F, -0.25F, -0.3F, -2F, -0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F); // Box 4
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5.5F, -4.5F, -2F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.3F, 0F, 0.25F, -1.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 5
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5F, -4.5F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 6
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4F, -4.5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.3F, -2F, 0.25F, -0.3F, -2F, 0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F); // Box 6
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(3.5F, -4.5F, -2F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -1.3F, 0F, 0.75F, -1.3F, 0F, 1F, 0.3F, 0F, -1F, 0.3F, 0F); // Box 7
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -4.5F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 8
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -4.5F, 4F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -3.5F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F); // Box 10
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0F, -3.5F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F); // Box 11
		headModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 64
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 7
		bodyModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 8
		bodyModel[13] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 9
		bodyModel[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 10
		bodyModel[15] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 12
		bodyModel[16] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 14
		bodyModel[17] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 3
		bodyModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 10
		bodyModel[29] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 17
		bodyModel[30] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 23
		bodyModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 24
		bodyModel[32] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 25
		bodyModel[33] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 30
		bodyModel[34] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 31
		bodyModel[35] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 32
		bodyModel[36] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 33
		bodyModel[37] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 81
		bodyModel[38] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 12
		bodyModel[39] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 13
		bodyModel[40] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 14
		bodyModel[41] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 15
		bodyModel[42] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 16
		bodyModel[43] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 17
		bodyModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 33
		bodyModel[45] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 1
		bodyModel[46] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 34
		bodyModel[47] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 4
		bodyModel[48] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 5
		bodyModel[49] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 6
		bodyModel[50] = new ModelRendererTurbo(this, 14, 90, textureX, textureY); // Box 89

		bodyModel[0].addShapeBox(-4F, 7F, -2F, 8, 4, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 62
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 2.8F, -2F, 8, 4, 4, 0F,-0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 64
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, -0.2F, -2F, 4, 3, 4, 0F,0F, 0F, 0.3F, 0F, -0.7F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 0
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, -0.2F, -2F, 4, 3, 4, 0F,0F, -0.7F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.5F, 4.6F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.5F, 3F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 13
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.5F, 6.2F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 15
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, 7.8F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 16
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, 9.4F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 11F, -2.3F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 0F, -2.4F, 4, 3, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, -2.4F, 4, 3, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 7
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.5F, 3F, -2.4F, 3, 8, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.25F, 3F, -2.4F, 3, 8, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.5F, 6F, -2.4F, 1, 5, 1, 0F,-0.2F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 10
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(3.5F, 6F, -2.4F, 1, 5, 1, 0F,0F, 0F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.75F, 1.4F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, -0.18F, 0F, 0F, -0.18F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F); // Box 14
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0.5F, 9.4F, -2.45F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 18
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.5F, 7.8F, -2.45F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 19
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-0.5F, 6.2F, -2.45F, 4, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 20
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.5F, 4.6F, -2.45F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 21
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-0.5F, 3F, -2.45F, 4, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 22
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.75F, 1.4F, -2.45F, 3, 1, 1, 0F,-0.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.18F, 0F, 0F, 0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F); // Box 23
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-0.5F, 8.8F, -2.45F, 1, 2, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 1
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, 0F, 1.4F, 4, 3, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 2
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 1.4F, 4, 3, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-3F, 3F, 1.4F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 4
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4F, 5F, -3.3F, 2, 4, 1, 0F,-0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F); // Box 2
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3.95F, 4.9F, -3.35F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 10
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2.1F, 5F, -3.3F, 2, 4, 1, 0F,-0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F); // Box 17
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3.3F, 1F, -2.7F, 2, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 23
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3.3F, 0.9F, -2.78F, 2, 1, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F); // Box 24
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-2.15F, 4.9F, -3.35F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 25
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(2F, 5F, -3.3F, 2, 4, 1, 0F,-0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F); // Box 30
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(1.95F, 4.9F, -3.35F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 31
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0.1F, 5F, -3.3F, 2, 4, 1, 0F,-0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F); // Box 32
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(0.15F, 4.9F, -3.35F, 2, 2, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 33
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3F, 1.6F, 1.5F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3.5F, 4.3F, 1.48F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-3.5F, 2.7F, 1.48F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 13
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-3.5F, 1.1F, 1.48F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 14
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-3.5F, 5.9F, 1.48F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 15
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3.5F, 7.5F, 1.48F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 16
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-3.5F, 9.1F, 1.48F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 1
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(1.6F, 2F, -3.3F, 2, 3, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 4
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(2.6F, -0.6F, -3.5F, 1, 2, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 5
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(2.6F, 1.4F, -3.5F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 6
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-2.5F, 2.1F, 1.51F, 120, 58, 1, 0F,0F, 0F, 0F, -115F, 0F, 0F, -115F, 0F, 0F, 0F, 0F, 0F, 0F, -56F, 0F, -115F, -56F, 0F, -115F, -56F, 0F, 0F, -56F, 0F); // Box 89
		bodyModel[50].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 1
		leftArmModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 59
		leftArmModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 60

		leftArmModel[0].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.1F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(2.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 59
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 60
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 61
		rightArmModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 62

		rightArmModel[0].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 61
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 62
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 0
		leftLegModel[2] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 63
		leftLegModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 64
		leftLegModel[4] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 119
		leftLegModel[5] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 120
		leftLegModel[6] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 121
		leftLegModel[7] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 123

		leftLegModel[0].addShapeBox(-2F, 7F, -2.3F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 63
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(1.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 64
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.5F, 4.5F, -2.3F, 3, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F); // Box 119
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.5F, 2.5F, -2.3F, 3, 2, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 120
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1.5F, 1.5F, -2.3F, 3, 1, 1, 0F,-0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 121
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 3F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 123
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 5
		rightLegModel[2] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 67
		rightLegModel[3] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 68
		rightLegModel[4] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 116
		rightLegModel[5] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 117
		rightLegModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 118
		rightLegModel[7] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 122

		rightLegModel[0].addShapeBox(-2F, 7F, -2.3F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 67
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 68
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-1.5F, 2.5F, -2.3F, 3, 2, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 116
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-1.5F, 1.5F, -2.3F, 3, 1, 1, 0F,-0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 117
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-1.5F, 4.5F, -2.3F, 3, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F); // Box 118
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 3F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 122
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);
	}
}