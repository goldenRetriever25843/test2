//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.11.2016 - 22:11:55
// Last changed on: 09.11.2016 - 22:11:55

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPhalanxCIWS extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPhalanxCIWS() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[11];
		turretModel = new ModelRendererTurbo[67];
		barrelModel = new ModelRendererTurbo[54];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 7
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 20
		bodyModel[3] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 21
		bodyModel[4] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 22
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 23
		bodyModel[6] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 85
		bodyModel[7] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 86
		bodyModel[8] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 87
		bodyModel[9] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 89
		bodyModel[10] = new ModelRendererTurbo(this, -232, -170, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 1F, 0F, 24, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[0].setRotationPoint(-12F, -6F, -12F);

		bodyModel[1].addShapeBox(0F, 1F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[1].setRotationPoint(-12F, -5F, -12F);

		bodyModel[2].addShapeBox(0F, 1F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[2].setRotationPoint(-12F, -5F, 10F);

		bodyModel[3].addShapeBox(0F, 1F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[3].setRotationPoint(10F, -5F, 10F);

		bodyModel[4].addShapeBox(0F, 1F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[4].setRotationPoint(10F, -5F, -12F);

		bodyModel[5].addShapeBox(0F, 1F, 0F, 24, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[5].setRotationPoint(-12F, -4F, -12F);

		bodyModel[6].addShapeBox(0F, 1F, 0F, 1, 6, 22, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 85
		bodyModel[6].setRotationPoint(-13F, -3F, -11F);

		bodyModel[7].addShapeBox(0F, 1F, 0F, 1, 6, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[7].setRotationPoint(12F, -3F, -11F);

		bodyModel[8].addShapeBox(0F, 1F, 0F, 22, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[8].setRotationPoint(-11F, -3F, -13F);

		bodyModel[9].addShapeBox(0F, 1F, 0F, 22, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
		bodyModel[9].setRotationPoint(-11F, -3F, 12F);

		bodyModel[10].addShapeBox(0F, -208F, 0F, 1, 212, 240, 0F,0F, -210F, 0F, 0F, -210F, 0F, 0F, -210F, -237.75F, 0F, -210F, -237.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -237.75F, 0F, 0F, -237.75F); // Box 0
		bodyModel[10].setRotationPoint(11.51F, -1F, -1.15F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		turretModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 85
		turretModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 85
		turretModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		turretModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 85
		turretModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 85
		turretModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 85
		turretModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 85
		turretModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 85
		turretModel[9] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 87
		turretModel[10] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 88
		turretModel[11] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 90
		turretModel[12] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 91
		turretModel[13] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 30
		turretModel[14] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 31
		turretModel[15] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 32
		turretModel[16] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 33
		turretModel[17] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 34
		turretModel[18] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 35
		turretModel[19] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 36
		turretModel[20] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 37
		turretModel[21] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 38
		turretModel[22] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 39
		turretModel[23] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 40
		turretModel[24] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 41
		turretModel[25] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 42
		turretModel[26] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 43
		turretModel[27] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 44
		turretModel[28] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 45
		turretModel[29] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 46
		turretModel[30] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 47
		turretModel[31] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 48
		turretModel[32] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 49
		turretModel[33] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 50
		turretModel[34] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 51
		turretModel[35] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 52
		turretModel[36] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 53
		turretModel[37] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 54
		turretModel[38] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 55
		turretModel[39] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 56
		turretModel[40] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 57
		turretModel[41] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 58
		turretModel[42] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 59
		turretModel[43] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 60
		turretModel[44] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 61
		turretModel[45] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 62
		turretModel[46] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 63
		turretModel[47] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 64
		turretModel[48] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 65
		turretModel[49] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 66
		turretModel[50] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 67
		turretModel[51] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 68
		turretModel[52] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 69
		turretModel[53] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 70
		turretModel[54] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 71
		turretModel[55] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 72
		turretModel[56] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 73
		turretModel[57] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 74
		turretModel[58] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 75
		turretModel[59] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 76
		turretModel[60] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 77
		turretModel[61] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 90
		turretModel[62] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 91
		turretModel[63] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 92
		turretModel[64] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 93
		turretModel[65] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 94
		turretModel[66] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 95

		turretModel[0].addShapeBox(-3F, 10F, -9F, 6, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		turretModel[0].setRotationPoint(0F, -16F, 0F);

		turretModel[1].addShapeBox(-4F, -2F, -8F, 8, 8, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		turretModel[1].setRotationPoint(0F, -16F, 0F);

		turretModel[2].addShapeBox(-4F, 6F, -8F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 85
		turretModel[2].setRotationPoint(0F, -16F, 0F);

		turretModel[3].addShapeBox(2F, 6F, -8F, 3, 4, 3, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		turretModel[3].setRotationPoint(0F, -16F, 0F);

		turretModel[4].addShapeBox(-5F, 6F, -8F, 3, 4, 3, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		turretModel[4].setRotationPoint(0F, -16F, 0F);

		turretModel[5].addShapeBox(-4F, -2F, 5F, 8, 8, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		turretModel[5].setRotationPoint(0F, -16F, 0F);

		turretModel[6].addShapeBox(2F, 6F, 5F, 3, 4, 3, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 85
		turretModel[6].setRotationPoint(0F, -16F, 0F);

		turretModel[7].addShapeBox(-4F, 6F, 5F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 85
		turretModel[7].setRotationPoint(0F, -16F, 0F);

		turretModel[8].addShapeBox(-5F, 6F, 5F, 3, 4, 3, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 85
		turretModel[8].setRotationPoint(0F, -16F, 0F);

		turretModel[9].addShapeBox(3F, 10F, -9F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 87
		turretModel[9].setRotationPoint(0F, -16F, 0F);

		turretModel[10].addShapeBox(6F, 10F, -7F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 88
		turretModel[10].setRotationPoint(0F, -16F, 0F);

		turretModel[11].addShapeBox(-9F, 10F, -7F, 3, 1, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 90
		turretModel[11].setRotationPoint(0F, -16F, 0F);

		turretModel[12].addShapeBox(-6F, 10F, -9F, 3, 1, 18, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 91
		turretModel[12].setRotationPoint(0F, -16F, 0F);

		turretModel[13].addShapeBox(4.25F, 6.5F, -7.5F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Box 30
		turretModel[13].setRotationPoint(0F, -16F, 0F);

		turretModel[14].addShapeBox(2.75F, 6.5F, -7.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 31
		turretModel[14].setRotationPoint(0F, -16F, 0F);

		turretModel[15].addShapeBox(2.75F, 6.5F, -6F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 32
		turretModel[15].setRotationPoint(0F, -16F, 0F);

		turretModel[16].addShapeBox(2.25F, 4F, -7.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 33
		turretModel[16].setRotationPoint(0F, -16F, 0F);

		turretModel[17].addShapeBox(3.75F, 4F, -7.5F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Box 34
		turretModel[17].setRotationPoint(0F, -16F, 0F);

		turretModel[18].addShapeBox(2.25F, 4F, -6F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 35
		turretModel[18].setRotationPoint(0F, -16F, 0F);

		turretModel[19].addShapeBox(1.75F, 1.5F, -7.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 36
		turretModel[19].setRotationPoint(0F, -16F, 0F);

		turretModel[20].addShapeBox(3.25F, 1.5F, -7.5F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Box 37
		turretModel[20].setRotationPoint(0F, -16F, 0F);

		turretModel[21].addShapeBox(1.75F, 1.5F, -6F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 38
		turretModel[21].setRotationPoint(0F, -16F, 0F);

		turretModel[22].addShapeBox(1.25F, -1F, -7.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 39
		turretModel[22].setRotationPoint(0F, -16F, 0F);

		turretModel[23].addShapeBox(2.75F, -1F, -7.5F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Box 40
		turretModel[23].setRotationPoint(0F, -16F, 0F);

		turretModel[24].addShapeBox(1.25F, -1F, -6F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 41
		turretModel[24].setRotationPoint(0F, -16F, 0F);

		turretModel[25].addShapeBox(1.25F, -1F, 5.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 42
		turretModel[25].setRotationPoint(0F, -16F, 0F);

		turretModel[26].addShapeBox(2.75F, -1F, 5.5F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Box 43
		turretModel[26].setRotationPoint(0F, -16F, 0F);

		turretModel[27].addShapeBox(1.25F, -1F, 7F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 44
		turretModel[27].setRotationPoint(0F, -16F, 0F);

		turretModel[28].addShapeBox(1.75F, 1.5F, 5.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 45
		turretModel[28].setRotationPoint(0F, -16F, 0F);

		turretModel[29].addShapeBox(1.75F, 1.5F, 7F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 46
		turretModel[29].setRotationPoint(0F, -16F, 0F);

		turretModel[30].addShapeBox(3.25F, 1.5F, 5.5F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Box 47
		turretModel[30].setRotationPoint(0F, -16F, 0F);

		turretModel[31].addShapeBox(2.25F, 4F, 5.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 48
		turretModel[31].setRotationPoint(0F, -16F, 0F);

		turretModel[32].addShapeBox(3.75F, 4F, 5.5F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Box 49
		turretModel[32].setRotationPoint(0F, -16F, 0F);

		turretModel[33].addShapeBox(2.25F, 4F, 7F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 50
		turretModel[33].setRotationPoint(0F, -16F, 0F);

		turretModel[34].addShapeBox(2.75F, 6.5F, 5.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 51
		turretModel[34].setRotationPoint(0F, -16F, 0F);

		turretModel[35].addShapeBox(4.25F, 6.5F, 5.5F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Box 52
		turretModel[35].setRotationPoint(0F, -16F, 0F);

		turretModel[36].addShapeBox(2.75F, 6.5F, 7F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 53
		turretModel[36].setRotationPoint(0F, -16F, 0F);

		turretModel[37].addShapeBox(-3F, -1F, -6.5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 54
		turretModel[37].setRotationPoint(0F, -16F, 0F);

		turretModel[38].addShapeBox(-3.5F, -1F, -7.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 55
		turretModel[38].setRotationPoint(0F, -16F, 0F);

		turretModel[39].addShapeBox(-3F, -1F, -8F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 56
		turretModel[39].setRotationPoint(0F, -16F, 0F);

		turretModel[40].addShapeBox(-3.5F, 1.5F, -6.5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		turretModel[40].setRotationPoint(0F, -16F, 0F);

		turretModel[41].addShapeBox(-3.5F, 1.5F, -8F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		turretModel[41].setRotationPoint(0F, -16F, 0F);

		turretModel[42].addShapeBox(-4F, 1.5F, -7.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 59
		turretModel[42].setRotationPoint(0F, -16F, 0F);

		turretModel[43].addShapeBox(-4F, 4F, -6.5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 60
		turretModel[43].setRotationPoint(0F, -16F, 0F);

		turretModel[44].addShapeBox(-4.5F, 4F, -7.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 61
		turretModel[44].setRotationPoint(0F, -16F, 0F);

		turretModel[45].addShapeBox(-4F, 4F, -8F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 62
		turretModel[45].setRotationPoint(0F, -16F, 0F);

		turretModel[46].addShapeBox(-4.5F, 6.5F, -6.5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 63
		turretModel[46].setRotationPoint(0F, -16F, 0F);

		turretModel[47].addShapeBox(-5F, 6.5F, -7.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 64
		turretModel[47].setRotationPoint(0F, -16F, 0F);

		turretModel[48].addShapeBox(-4.5F, 6.5F, -8F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		turretModel[48].setRotationPoint(0F, -16F, 0F);

		turretModel[49].addShapeBox(-3F, -1F, 6.5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		turretModel[49].setRotationPoint(0F, -16F, 0F);

		turretModel[50].addShapeBox(-3.5F, -1F, 5.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 67
		turretModel[50].setRotationPoint(0F, -16F, 0F);

		turretModel[51].addShapeBox(-3F, -1F, 5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		turretModel[51].setRotationPoint(0F, -16F, 0F);

		turretModel[52].addShapeBox(-3.5F, 1.5F, 6.5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 69
		turretModel[52].setRotationPoint(0F, -16F, 0F);

		turretModel[53].addShapeBox(-3.5F, 1.5F, 5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 70
		turretModel[53].setRotationPoint(0F, -16F, 0F);

		turretModel[54].addShapeBox(-4F, 1.5F, 5.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 71
		turretModel[54].setRotationPoint(0F, -16F, 0F);

		turretModel[55].addShapeBox(-4F, 4F, 6.5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		turretModel[55].setRotationPoint(0F, -16F, 0F);

		turretModel[56].addShapeBox(-4.5F, 4F, 5.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 73
		turretModel[56].setRotationPoint(0F, -16F, 0F);

		turretModel[57].addShapeBox(-4F, 4F, 5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74
		turretModel[57].setRotationPoint(0F, -16F, 0F);

		turretModel[58].addShapeBox(-4.5F, 6.5F, 6.5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 75
		turretModel[58].setRotationPoint(0F, -16F, 0F);

		turretModel[59].addShapeBox(-5F, 6.5F, 5.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 76
		turretModel[59].setRotationPoint(0F, -16F, 0F);

		turretModel[60].addShapeBox(-4.5F, 6.5F, 5F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		turretModel[60].setRotationPoint(0F, -16F, 0F);

		turretModel[61].addShapeBox(-1.5F, -1F, -8.25F, 3, 2, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 90
		turretModel[61].setRotationPoint(0F, -16F, 0F);

		turretModel[62].addShapeBox(-1.5F, 2F, -8.25F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		turretModel[62].setRotationPoint(0F, -16F, 0F);

		turretModel[63].addShapeBox(-1.5F, 6F, -8.25F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		turretModel[63].setRotationPoint(0F, -16F, 0F);

		turretModel[64].addShapeBox(-1.5F, 6F, 7.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		turretModel[64].setRotationPoint(0F, -16F, 0F);

		turretModel[65].addShapeBox(-1.5F, 2F, 7.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		turretModel[65].setRotationPoint(0F, -16F, 0F);

		turretModel[66].addShapeBox(-1.5F, -1F, 7.5F, 3, 2, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 95
		turretModel[66].setRotationPoint(0F, -16F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 85
		barrelModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 85
		barrelModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 85
		barrelModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 85
		barrelModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 85
		barrelModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 85
		barrelModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 85
		barrelModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 85
		barrelModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 85
		barrelModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 85
		barrelModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 85
		barrelModel[11] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 85
		barrelModel[12] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 85
		barrelModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 85
		barrelModel[14] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 85
		barrelModel[15] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 85
		barrelModel[16] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 85
		barrelModel[17] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 85
		barrelModel[18] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 85
		barrelModel[19] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 85
		barrelModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 85
		barrelModel[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 85
		barrelModel[22] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 85
		barrelModel[23] = new ModelRendererTurbo(this, 173, 27, textureX, textureY); // Box 85
		barrelModel[24] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 9
		barrelModel[25] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 10
		barrelModel[26] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 11
		barrelModel[27] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		barrelModel[28] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 14
		barrelModel[29] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 15
		barrelModel[30] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 16
		barrelModel[31] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 17
		barrelModel[32] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 18
		barrelModel[33] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 81
		barrelModel[34] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 82
		barrelModel[35] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 83
		barrelModel[36] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 84
		barrelModel[37] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 96
		barrelModel[38] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 97
		barrelModel[39] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 98
		barrelModel[40] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 85
		barrelModel[41] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 85
		barrelModel[42] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 85
		barrelModel[43] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 85
		barrelModel[44] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 85
		barrelModel[45] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 85
		barrelModel[46] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 85
		barrelModel[47] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 85
		barrelModel[48] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 85
		barrelModel[49] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 85
		barrelModel[50] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 85
		barrelModel[51] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 85
		barrelModel[52] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 85
		barrelModel[53] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 86

		barrelModel[0].addShapeBox(-4.5F, -3F, -5F, 9, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		barrelModel[0].setRotationPoint(0F, -16F, 0F);

		barrelModel[1].addShapeBox(-1.5F, -15F, -4.5F, 3, 12, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		barrelModel[1].setRotationPoint(0F, -16F, 0F);

		barrelModel[2].addShapeBox(1.5F, -15F, -4.5F, 3, 12, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 85
		barrelModel[2].setRotationPoint(0F, -16F, 0F);

		barrelModel[3].addShapeBox(1.5F, -17F, -4.5F, 3, 2, 9, 0F,0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 85
		barrelModel[3].setRotationPoint(0F, -16F, 0F);

		barrelModel[4].addShapeBox(-1.5F, -17F, -4.5F, 3, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		barrelModel[4].setRotationPoint(0F, -16F, 0F);

		barrelModel[5].addShapeBox(-4.5F, -17F, -4.5F, 3, 2, 9, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 85
		barrelModel[5].setRotationPoint(0F, -16F, 0F);

		barrelModel[6].addShapeBox(-4.5F, -15F, -4.5F, 3, 12, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 85
		barrelModel[6].setRotationPoint(0F, -16F, 0F);

		barrelModel[7].addShapeBox(4.5F, -3F, -5F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 2.5F, 0F, 0F, -0.5F); // Box 85
		barrelModel[7].setRotationPoint(0F, -16F, 0F);

		barrelModel[8].addShapeBox(4.5F, -3F, 4F, 6, 0, 1, 0F,0F, 0F, -0.5F, 0F, -1F, 2.5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 2.5F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 85
		barrelModel[8].setRotationPoint(0F, -16F, 0F);

		barrelModel[9].addShapeBox(4.5F, -3F, 4F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, -1F, 6F, 0F, -1F, -6.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 6F, 0F, 1F, -6.5F, 0F, 0F, -0.5F); // Box 85
		barrelModel[9].setRotationPoint(0F, -16F, 0F);

		barrelModel[10].addShapeBox(4.5F, -3F, -5F, 6, 0, 1, 0F,0F, 0F, -0.5F, 0F, -1F, -6.5F, 0F, -1F, 6F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -6.5F, 0F, 1F, 6F, 0F, 0F, 0F); // Box 85
		barrelModel[10].setRotationPoint(0F, -16F, 0F);

		barrelModel[11].addShapeBox(4.5F, 2F, -5F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, 3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, -3F, 0F, -4.5F, 3F, 0F, -0.5F, 0F); // Box 85
		barrelModel[11].setRotationPoint(0F, -16F, 0F);

		barrelModel[12].addShapeBox(4.5F, -3F, -5F, 6, 1, 0, 0F,0F, -0.5F, 0F, 0F, -4.5F, -3F, 0F, -4.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, 3F, 0F, 0F, 0F); // Box 85
		barrelModel[12].setRotationPoint(0F, -16F, 0F);

		barrelModel[13].addShapeBox(4.5F, -3F, -5F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 3F, 0F, -0.5F, 0F); // Box 85
		barrelModel[13].setRotationPoint(0F, -16F, 0F);

		barrelModel[14].addShapeBox(4.5F, -3F, 5F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 3F, 0F, 0.5F, -3F, 0F, -0.5F, 0F); // Box 85
		barrelModel[14].setRotationPoint(0F, -16F, 0F);

		barrelModel[15].addShapeBox(4.5F, 3F, -5F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 2.5F, 0F, 0F, -0.5F); // Box 85
		barrelModel[15].setRotationPoint(0F, -16F, 0F);

		barrelModel[16].addShapeBox(4.5F, 3F, -5F, 6, 0, 1, 0F,0F, 0F, -0.5F, 0F, 1F, -6.5F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -6.5F, 0F, -1F, 6F, 0F, 0F, 0F); // Box 85
		barrelModel[16].setRotationPoint(0F, -16F, 0F);

		barrelModel[17].addShapeBox(4.5F, 3F, 4F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, 1F, 6F, 0F, 1F, -6.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 6F, 0F, -1F, -6.5F, 0F, 0F, -0.5F); // Box 85
		barrelModel[17].setRotationPoint(0F, -16F, 0F);

		barrelModel[18].addShapeBox(4.5F, 3F, 4F, 6, 0, 1, 0F,0F, 0F, -0.5F, 0F, 1F, 2.5F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 2.5F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 85
		barrelModel[18].setRotationPoint(0F, -16F, 0F);

		barrelModel[19].addShapeBox(4.5F, 2F, 5F, 6, 1, 0, 0F,0F, -0.5F, 0F, 0F, 0.5F, 3F, 0F, 0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 85
		barrelModel[19].setRotationPoint(0F, -16F, 0F);

		barrelModel[20].addShapeBox(4.5F, 2F, -5F, 6, 1, 0, 0F,0F, -0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F); // Box 85
		barrelModel[20].setRotationPoint(0F, -16F, 0F);

		barrelModel[21].addShapeBox(4.5F, -3F, 5F, 6, 1, 0, 0F,0F, -0.5F, 0F, 0F, -4.5F, 3F, 0F, -4.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 4F, 3F, 0F, 4F, -3F, 0F, 0F, 0F); // Box 85
		barrelModel[21].setRotationPoint(0F, -16F, 0F);

		barrelModel[22].addShapeBox(4.5F, 2F, 5F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 3F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 3F, 0F, -4.5F, -3F, 0F, -0.5F, 0F); // Box 85
		barrelModel[22].setRotationPoint(0F, -16F, 0F);

		barrelModel[23].addShapeBox(10.5F, -2F, -2F, 0, 4, 4, 0F,0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 85
		barrelModel[23].setRotationPoint(0F, -16F, 0F);

		barrelModel[24].addShapeBox(-3.5F, -12F, 5.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 9
		barrelModel[24].setRotationPoint(0F, -16F, 0F);

		barrelModel[25].addShapeBox(-3.5F, -11F, 4.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		barrelModel[25].setRotationPoint(0F, -16F, 0F);

		barrelModel[26].addShapeBox(-3.5F, -10F, 5.5F, 6, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		barrelModel[26].setRotationPoint(0F, -16F, 0F);

		barrelModel[27].addShapeBox(-1F, -10F, 5.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[27].setRotationPoint(0F, -16F, 0F);

		barrelModel[28].addShapeBox(-4F, -7F, 5.5F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[28].setRotationPoint(0F, -16F, 0F);

		barrelModel[29].addShapeBox(2F, -7F, 2.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		barrelModel[29].setRotationPoint(0F, -16F, 0F);

		barrelModel[30].addShapeBox(-3F, -7F, 2.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		barrelModel[30].setRotationPoint(0F, -16F, 0F);

		barrelModel[31].addShapeBox(-3F, -11F, 2.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		barrelModel[31].setRotationPoint(0F, -16F, 0F);

		barrelModel[32].addShapeBox(1F, -11F, 2.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		barrelModel[32].setRotationPoint(0F, -16F, 0F);

		barrelModel[33].addShapeBox(-5.5F, -3F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		barrelModel[33].setRotationPoint(0F, -16F, 0F);

		barrelModel[34].addShapeBox(-5.5F, 2F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		barrelModel[34].setRotationPoint(0F, -16F, 0F);

		barrelModel[35].addShapeBox(-5.5F, -2F, -5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		barrelModel[35].setRotationPoint(0F, -16F, 0F);

		barrelModel[36].addShapeBox(-5.5F, -2F, 4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		barrelModel[36].setRotationPoint(0F, -16F, 0F);

		barrelModel[37].addShapeBox(-4.5F, 2.5F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 96
		barrelModel[37].setRotationPoint(0F, -16F, 0F);

		barrelModel[38].addShapeBox(-4.5F, 4.5F, -3F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		barrelModel[38].setRotationPoint(0F, -16F, 0F);

		barrelModel[39].addShapeBox(-4.5F, 6.5F, -1F, 8, 2, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		barrelModel[39].setRotationPoint(0F, -16F, 0F);

		barrelModel[40].addShapeBox(11F, 0.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 85
		barrelModel[40].setRotationPoint(0F, -16F, 0F);

		barrelModel[41].addShapeBox(4F, 0F, -0.5F, 15, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 85
		barrelModel[41].setRotationPoint(0F, -16F, 0F);
		barrelModel[41].rotateAngleX = 4.71238898F;

		barrelModel[42].addShapeBox(11F, -1.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		barrelModel[42].setRotationPoint(0F, -16F, 0F);

		barrelModel[43].addShapeBox(11F, -0.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		barrelModel[43].setRotationPoint(0F, -16F, 0F);

		barrelModel[44].addShapeBox(4F, 0F, -0.5F, 15, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 85
		barrelModel[44].setRotationPoint(0F, -16F, 0F);
		barrelModel[44].rotateAngleX = 5.49778714F;

		barrelModel[45].addShapeBox(4F, 0F, -0.5F, 15, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 85
		barrelModel[45].setRotationPoint(0F, -16F, 0F);
		barrelModel[45].rotateAngleX = 3.92699082F;

		barrelModel[46].addShapeBox(18F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 85
		barrelModel[46].setRotationPoint(0F, -16F, 0F);

		barrelModel[47].addShapeBox(4F, 0F, -0.5F, 15, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 85
		barrelModel[47].setRotationPoint(0F, -16F, 0F);
		barrelModel[47].rotateAngleX = 3.14159265F;

		barrelModel[48].addShapeBox(4F, 0F, -0.5F, 15, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 85
		barrelModel[48].setRotationPoint(0F, -16F, 0F);
		barrelModel[48].rotateAngleX = 2.35619449F;

		barrelModel[49].addShapeBox(4F, 0F, -0.5F, 15, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 85
		barrelModel[49].setRotationPoint(0F, -16F, 0F);
		barrelModel[49].rotateAngleX = 1.57079633F;

		barrelModel[50].addShapeBox(4F, 0F, -0.5F, 15, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 85
		barrelModel[50].setRotationPoint(0F, -16F, 0F);
		barrelModel[50].rotateAngleX = 0.78539816F;

		barrelModel[51].addShapeBox(4F, 0F, -0.5F, 15, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 85
		barrelModel[51].setRotationPoint(0F, -16F, 0F);

		barrelModel[52].addShapeBox(18F, -1F, -1.5F, 1, 1, 3, 0F,-0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 85
		barrelModel[52].setRotationPoint(0F, -16F, 0F);

		barrelModel[53].addShapeBox(18F, 0F, -1.5F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F); // Box 86
		barrelModel[53].setRotationPoint(0F, -16F, 0F);
	}
}