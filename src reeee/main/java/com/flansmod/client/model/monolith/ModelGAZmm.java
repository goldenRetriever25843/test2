//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.09.2017 - 15:32:37
// Last changed on: 08.09.2017 - 15:32:37

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGAZmm extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGAZmm() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[159];
		leftFrontWheelModel = new ModelRendererTurbo[10];
		rightFrontWheelModel = new ModelRendererTurbo[10];
		leftBackWheelModel = new ModelRendererTurbo[38];
		rightBackWheelModel = new ModelRendererTurbo[38];

		initbodyModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 27
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 27
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 27
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 27
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 27
		bodyModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 27
		bodyModel[9] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 27
		bodyModel[10] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 27
		bodyModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 27
		bodyModel[29] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 27
		bodyModel[30] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 27
		bodyModel[31] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[32] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 27
		bodyModel[33] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 27
		bodyModel[34] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 27
		bodyModel[35] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 27
		bodyModel[36] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 27
		bodyModel[37] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[38] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 27
		bodyModel[39] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 27
		bodyModel[40] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 27
		bodyModel[41] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 27
		bodyModel[42] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 27
		bodyModel[43] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 27
		bodyModel[44] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 27
		bodyModel[45] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 27
		bodyModel[46] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 27
		bodyModel[47] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 27
		bodyModel[48] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 27
		bodyModel[49] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 27
		bodyModel[50] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 27
		bodyModel[51] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 27
		bodyModel[52] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 27
		bodyModel[53] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 27
		bodyModel[54] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 27
		bodyModel[55] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 27
		bodyModel[56] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 27
		bodyModel[57] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 27
		bodyModel[58] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 27
		bodyModel[59] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 27
		bodyModel[60] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 27
		bodyModel[61] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 27
		bodyModel[62] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 27
		bodyModel[63] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 27
		bodyModel[64] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 27
		bodyModel[65] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 27
		bodyModel[66] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 27
		bodyModel[67] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 27
		bodyModel[68] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 27
		bodyModel[69] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 27
		bodyModel[70] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 27
		bodyModel[71] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 27
		bodyModel[72] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 27
		bodyModel[73] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 27
		bodyModel[74] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 27
		bodyModel[75] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 27
		bodyModel[76] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 27
		bodyModel[77] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 27
		bodyModel[78] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 27
		bodyModel[79] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 27
		bodyModel[80] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 27
		bodyModel[81] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 27
		bodyModel[82] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 27
		bodyModel[83] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 27
		bodyModel[84] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 27
		bodyModel[85] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 27
		bodyModel[86] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 27
		bodyModel[87] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 27
		bodyModel[88] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 27
		bodyModel[89] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 27
		bodyModel[90] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 27
		bodyModel[91] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 27
		bodyModel[92] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 27
		bodyModel[93] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 27
		bodyModel[94] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 27
		bodyModel[95] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 27
		bodyModel[96] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 27
		bodyModel[97] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 27
		bodyModel[98] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 27
		bodyModel[99] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 27
		bodyModel[100] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 27
		bodyModel[101] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 27
		bodyModel[102] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 27
		bodyModel[103] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 27
		bodyModel[104] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 27
		bodyModel[105] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 27
		bodyModel[106] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 27
		bodyModel[107] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 27
		bodyModel[108] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 27
		bodyModel[109] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 27
		bodyModel[110] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 27
		bodyModel[111] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 27
		bodyModel[112] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 27
		bodyModel[113] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 27
		bodyModel[114] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 27
		bodyModel[115] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 27
		bodyModel[116] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 27
		bodyModel[117] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 27
		bodyModel[118] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 27
		bodyModel[119] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 27
		bodyModel[120] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 27
		bodyModel[121] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 27
		bodyModel[122] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 27
		bodyModel[123] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 27
		bodyModel[124] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 27
		bodyModel[125] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 27
		bodyModel[126] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 27
		bodyModel[127] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 27
		bodyModel[128] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 27
		bodyModel[129] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 27
		bodyModel[130] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 27
		bodyModel[131] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 27
		bodyModel[132] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 27
		bodyModel[133] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 27
		bodyModel[134] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 27
		bodyModel[135] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 27
		bodyModel[136] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 27
		bodyModel[137] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 27
		bodyModel[138] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 27
		bodyModel[139] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 27
		bodyModel[140] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 27
		bodyModel[141] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 27
		bodyModel[142] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 27
		bodyModel[143] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 27
		bodyModel[144] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 27
		bodyModel[145] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 27
		bodyModel[146] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 27
		bodyModel[147] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 27
		bodyModel[148] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 27
		bodyModel[149] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 27
		bodyModel[150] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 27
		bodyModel[151] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 27
		bodyModel[152] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 27
		bodyModel[153] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 27
		bodyModel[154] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 27
		bodyModel[155] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 27
		bodyModel[156] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 27
		bodyModel[157] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 27
		bodyModel[158] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 27

		bodyModel[0].addBox(0F, 0F, 0F, 8, 28, 1, 0F); // Box 27
		bodyModel[0].setRotationPoint(30.4F, -34F, -14.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 8, 28, 1, 0F); // Box 27
		bodyModel[1].setRotationPoint(30.4F, -34F, 13.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 28, 9, 0F); // Box 27
		bodyModel[2].setRotationPoint(30.4F, -34F, -13.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 28, 9, 0F); // Box 27
		bodyModel[3].setRotationPoint(30.4F, -34F, 4.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 9, 0F); // Box 27
		bodyModel[4].setRotationPoint(30.4F, -34F, -4.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 22, 9, 0F); // Box 27
		bodyModel[5].setRotationPoint(30.4F, -28F, -4.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 15, 18, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 27
		bodyModel[6].setRotationPoint(38.4F, -24F, 11.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 27
		bodyModel[7].setRotationPoint(38.4F, -34F, 11.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 17, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[8].setRotationPoint(53.4F, -23F, -12.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 27
		bodyModel[9].setRotationPoint(38.4F, -24F, -14.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 27
		bodyModel[10].setRotationPoint(38.4F, -34F, -14.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[11].setRotationPoint(53.4F, -34F, -12.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[12].setRotationPoint(53.4F, -34F, 10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[13].setRotationPoint(53.4F, -32F, -5.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(53.4F, -34F, -10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 29, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[15].setRotationPoint(30.4F, -36F, -14.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 29, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[16].setRotationPoint(32.4F, -36F, -14.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 29, 0F,0F, 0F, -1F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F); // Box 27
		bodyModel[17].setRotationPoint(38.4F, -36F, -14.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 13, 2, 29, 0F,0F, 0F, -1.4F, -1F, -1.5F, -3.05F, -1F, -1.5F, -3.05F, 0F, 0F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -2.05F, 0F, 0F, -2.05F, 0F, 0F, -0.4F); // Box 27
		bodyModel[18].setRotationPoint(41.4F, -36F, -14.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 27, 12, 25, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 27
		bodyModel[19].setRotationPoint(54.4F, -18F, -12.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 27, 1, 25, 0F,0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 27
		bodyModel[20].setRotationPoint(54.4F, -19F, -12.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 27, 1, 23, 0F,0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 27
		bodyModel[21].setRotationPoint(54.4F, -20F, -11.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 27, 1, 19, 0F,0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(54.4F, -21F, -9.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 4, 21, 0F); // Box 27
		bodyModel[23].setRotationPoint(-26.6F, -7F, -10.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 56, 4, 1, 0F); // Box 27
		bodyModel[24].setRotationPoint(-25.6F, -7F, -10.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 56, 4, 1, 0F); // Box 27
		bodyModel[25].setRotationPoint(-25.6F, -7F, 9.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 55, 4, 21, 0F); // Box 27
		bodyModel[26].setRotationPoint(-24.6F, -11F, -10.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 27
		bodyModel[27].setRotationPoint(-27.6F, -12F, -22.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 4, 19, 0F); // Box 27
		bodyModel[28].setRotationPoint(-25.6F, -7F, -9.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 7, 1, 27, 0F); // Box 27
		bodyModel[29].setRotationPoint(31.4F, -7F, -13.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 15, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 27
		bodyModel[30].setRotationPoint(38.4F, -7F, -13.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[31].setRotationPoint(81.4F, -19F, -6.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[32].setRotationPoint(81.4F, -19F, 5.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bodyModel[33].setRotationPoint(80.4F, -4F, -6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bodyModel[34].setRotationPoint(81.4F, -20F, -6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bodyModel[35].setRotationPoint(81.4F, -21F, -4.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 2, 13, 0F); // Box 27
		bodyModel[36].setRotationPoint(80.4F, -6F, -6.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 27
		bodyModel[37].setRotationPoint(81.4F, -22F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 27
		bodyModel[38].setRotationPoint(79.9F, -22F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[39].setRotationPoint(80.9F, -22F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[40].setRotationPoint(53.9F, -22F, -0.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 27
		bodyModel[41].setRotationPoint(30.4F, -2F, 13.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 27
		bodyModel[42].setRotationPoint(30.4F, -6F, 13.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 13, 7, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[43].setRotationPoint(62.4F, -14F, 13.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 12, 1, 7, 0F); // Box 27
		bodyModel[44].setRotationPoint(72.4F, -14F, 13.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[45].setRotationPoint(84.4F, -14F, 13.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 12, 8, 7, 0F,0F, -7F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 27
		bodyModel[46].setRotationPoint(72.4F, -14F, 6.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 27
		bodyModel[47].setRotationPoint(38.4F, -6F, 12.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 26, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, 0F); // Box 27
		bodyModel[48].setRotationPoint(54.4F, -6F, 5.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 27
		bodyModel[49].setRotationPoint(53.4F, -6F, 11.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 15, 1, 8, 0F); // Box 27
		bodyModel[50].setRotationPoint(38.4F, -2F, 12.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 27
		bodyModel[51].setRotationPoint(53.4F, -2F, 12.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 8, 1, 10, 0F); // Box 27
		bodyModel[52].setRotationPoint(54.4F, -2F, 10.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 10, 18, 5, 0F,0F, -12F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -5F, -2F, 0F, -12F, 0F, 0F, -17F, 0F, 0F, -5F, 0F); // Box 27
		bodyModel[53].setRotationPoint(62.4F, -14F, 8.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 27
		bodyModel[54].setRotationPoint(30.4F, -6F, -14.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[55].setRotationPoint(38.4F, -6F, -14.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 27
		bodyModel[56].setRotationPoint(53.4F, -6F, -12.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 26, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[57].setRotationPoint(54.4F, -6F, -12.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 27
		bodyModel[58].setRotationPoint(30.4F, -2F, -20.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 15, 1, 8, 0F); // Box 27
		bodyModel[59].setRotationPoint(38.4F, -2F, -20.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 27
		bodyModel[60].setRotationPoint(53.4F, -2F, -20.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 8, 1, 10, 0F); // Box 27
		bodyModel[61].setRotationPoint(54.4F, -2F, -20.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 13, 7, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[62].setRotationPoint(62.4F, -14F, -20.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 12, 1, 7, 0F); // Box 27
		bodyModel[63].setRotationPoint(72.4F, -14F, -20.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[64].setRotationPoint(84.4F, -14F, -20.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 12, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[65].setRotationPoint(72.4F, -14F, -13.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 18, 5, 0F,0F, -12F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -12F, 0F, 0F, -5F, 0F, 0F, -17F, 0F, 0F, -12F, 0F, 0F, -5F, 0F); // Box 27
		bodyModel[66].setRotationPoint(62.4F, -14F, -13.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[67].setRotationPoint(72.4F, -6.5F, -8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[68].setRotationPoint(72.4F, -6.5F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[69].setRotationPoint(85.4F, -6.5F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 27
		bodyModel[70].setRotationPoint(88.4F, -5.5F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[71].setRotationPoint(85.4F, -6.5F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 27
		bodyModel[72].setRotationPoint(87.9F, -4.5F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 27
		bodyModel[73].setRotationPoint(88.4F, -5.5F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 27
		bodyModel[74].setRotationPoint(82.4F, -1.5F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[75].setRotationPoint(86.4F, -2F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[76].setRotationPoint(86.4F, -2F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[77].setRotationPoint(73.4F, -1F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[78].setRotationPoint(67.4F, -2F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 27
		bodyModel[79].setRotationPoint(82.4F, -1.5F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[80].setRotationPoint(73.4F, -1F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[81].setRotationPoint(67.4F, -2F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 27
		bodyModel[82].setRotationPoint(83.4F, -12F, -7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 27
		bodyModel[83].setRotationPoint(81.9F, -12F, -9.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 27
		bodyModel[84].setRotationPoint(81.4F, -12F, -11.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 27
		bodyModel[85].setRotationPoint(81.4F, -12F, 7.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 27
		bodyModel[86].setRotationPoint(81.4F, -12F, 9.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[87].setRotationPoint(81.4F, -17F, -12.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 27
		bodyModel[88].setRotationPoint(81.4F, -14F, -12.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 27
		bodyModel[89].setRotationPoint(81.4F, -15F, -12.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -2F); // Box 27
		bodyModel[90].setRotationPoint(80.4F, -14F, -12.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 27
		bodyModel[91].setRotationPoint(80.4F, -15F, -12.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 27
		bodyModel[92].setRotationPoint(80.4F, -17F, -12.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 27
		bodyModel[93].setRotationPoint(81.4F, -14F, 7.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 27
		bodyModel[94].setRotationPoint(81.4F, -15F, 7.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[95].setRotationPoint(81.4F, -17F, 7.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -2F); // Box 27
		bodyModel[96].setRotationPoint(80.4F, -14F, 7.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 27
		bodyModel[97].setRotationPoint(80.4F, -15F, 7.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -0.5F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 27
		bodyModel[98].setRotationPoint(80.4F, -17F, 7.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 2, 22, 0F); // Box 27
		bodyModel[99].setRotationPoint(77.4F, 1F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[100].setRotationPoint(77.4F, -1F, -13F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[101].setRotationPoint(77.4F, -1F, -16F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 27
		bodyModel[102].setRotationPoint(77.4F, -1F, 11F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 27
		bodyModel[103].setRotationPoint(77.4F, -1F, 13F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 27
		bodyModel[104].setRotationPoint(77.4F, -0.5F, -8F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 27
		bodyModel[105].setRotationPoint(77.4F, -0.5F, 7F);

		bodyModel[106].addBox(-10F, 0F, 0F, 5, 1, 45, 0F); // Box 27
		bodyModel[106].setRotationPoint(-28.1F, -12F, -22.5F);
		bodyModel[106].rotateAngleZ = -1.57079633F;

		bodyModel[107].addBox(0F, 0F, 0F, 10, 12, 37, 0F); // Box 27
		bodyModel[107].setRotationPoint(19.4F, -24F, -18.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 9, 4, 36, 0F); // Box 27
		bodyModel[108].setRotationPoint(19.9F, -28F, -18F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 27
		bodyModel[109].setRotationPoint(19.4F, -28.5F, -17.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 27
		bodyModel[110].setRotationPoint(19.4F, -28.5F, -1.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 27
		bodyModel[111].setRotationPoint(19.4F, -28.5F, 16.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 27
		bodyModel[112].setRotationPoint(21.4F, -29.5F, -18.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 27
		bodyModel[113].setRotationPoint(26.4F, -29.5F, -18.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 27
		bodyModel[114].setRotationPoint(21.4F, -29.75F, -18.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 27
		bodyModel[115].setRotationPoint(21.4F, -29.75F, 18F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 27
		bodyModel[116].setRotationPoint(21.4F, -29.5F, 18F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 27
		bodyModel[117].setRotationPoint(26.4F, -29.5F, 18F);

		bodyModel[118].addBox(0F, 0F, -10F, 57, 1, 5, 0F); // Box 27
		bodyModel[118].setRotationPoint(-27.6F, -12F, -23F);
		bodyModel[118].rotateAngleX = -1.57079633F;

		bodyModel[119].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 27
		bodyModel[119].setRotationPoint(-27.6F, -12F, 23F);
		bodyModel[119].rotateAngleX = 1.57079633F;

		bodyModel[120].addBox(0F, 0F, 5F, 57, 1, 5, 0F); // Box 27
		bodyModel[120].setRotationPoint(-27.6F, -12F, 23F);
		bodyModel[120].rotateAngleX = 1.57079633F;

		bodyModel[121].addBox(0F, 0F, -5F, 57, 1, 5, 0F); // Box 27
		bodyModel[121].setRotationPoint(-27.6F, -12F, -23F);
		bodyModel[121].rotateAngleX = -1.57079633F;

		bodyModel[122].addBox(-5F, 0F, 0F, 5, 1, 45, 0F); // Box 27
		bodyModel[122].setRotationPoint(-28.1F, -12F, -22.5F);
		bodyModel[122].rotateAngleZ = -1.57079633F;

		bodyModel[123].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 27
		bodyModel[123].setRotationPoint(1.4F, -12F, 22F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 27
		bodyModel[124].setRotationPoint(28.4F, -12F, 22F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 27
		bodyModel[125].setRotationPoint(1.4F, -12F, -23F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 27
		bodyModel[126].setRotationPoint(28.4F, -12F, -23F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 27
		bodyModel[127].setRotationPoint(-27.6F, -12F, -23F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 27
		bodyModel[128].setRotationPoint(-27.6F, -12F, 22F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 27
		bodyModel[129].setRotationPoint(-28.6F, -12F, 21.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 27
		bodyModel[130].setRotationPoint(-28.6F, -12F, -22.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 27
		bodyModel[131].setRotationPoint(-28.6F, -12F, -0.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 8, 23, 0F,0F, 0F, -0.4F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.4F); // Box 27
		bodyModel[132].setRotationPoint(61.4F, -16F, -11.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,0F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.4F); // Box 27
		bodyModel[133].setRotationPoint(63.4F, -16F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 8, 21, 0F,0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F); // Box 27
		bodyModel[134].setRotationPoint(65.4F, -16F, -10.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 8, 20, 0F,0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F); // Box 27
		bodyModel[135].setRotationPoint(67.4F, -16F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 8, 19, 0F,0F, 0F, -0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.1F); // Box 27
		bodyModel[136].setRotationPoint(69.4F, -16F, -9.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 27
		bodyModel[137].setRotationPoint(-27.6F, -12F, -17.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 27
		bodyModel[138].setRotationPoint(-27.6F, -12F, -7.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 27
		bodyModel[139].setRotationPoint(-27.6F, -12F, -12.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 27
		bodyModel[140].setRotationPoint(-27.6F, -12F, 12.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 27
		bodyModel[141].setRotationPoint(-27.6F, -12F, 7.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 27
		bodyModel[142].setRotationPoint(-27.6F, -12F, 2.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 27
		bodyModel[143].setRotationPoint(-27.6F, -12F, -2.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 57, 1, 5, 0F); // Box 27
		bodyModel[144].setRotationPoint(-27.6F, -12F, 17.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 13, 1, 25, 0F); // Box 27
		bodyModel[145].setRotationPoint(31.4F, -14F, -12.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 13, 1, 25, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[146].setRotationPoint(31.4F, -15F, -12.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 10, 25, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[147].setRotationPoint(31.4F, -25F, -12.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 27
		bodyModel[148].setRotationPoint(47.4F, -24F, 5.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[149].setRotationPoint(46.4F, -26F, 5.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[150].setRotationPoint(46.4F, -24F, 3.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[151].setRotationPoint(46.4F, -27F, 3.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 27
		bodyModel[152].setRotationPoint(46.4F, -21F, 3.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[153].setRotationPoint(46.4F, -26F, 8.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[154].setRotationPoint(46.4F, -26F, 2.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 27
		bodyModel[155].setRotationPoint(38.9F, -21.5F, 13F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 27
		bodyModel[156].setRotationPoint(38.9F, -21.5F, -15F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 4, 30, 0F); // Box 27
		bodyModel[157].setRotationPoint(-17.6F, -3F, -15F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 4, 30, 0F); // Box 27
		bodyModel[158].setRotationPoint(3.4F, -3F, -15F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 201, 282, textureX, textureY); // Box 27
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 457, 314, textureX, textureY); // Box 27
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 329, 290, textureX, textureY); // Box 27
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 481, 314, textureX, textureY); // Box 27
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 153, 322, textureX, textureY); // Box 27
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 177, 322, textureX, textureY); // Box 27
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 1, 266, textureX, textureY); // Box 27
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 17, 266, textureX, textureY); // Box 27
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 41, 266, textureX, textureY); // Box 27
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 0, 243, textureX, textureY); // Box 27

		leftFrontWheelModel[0].addShapeBox(-4F, -4F, 7F, 8, 1, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F); // Box 27
		leftFrontWheelModel[0].setRotationPoint(78.5F, 1F, 14F);

		leftFrontWheelModel[1].addShapeBox(-4F, -1.5F, 7F, 8, 3, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		leftFrontWheelModel[1].setRotationPoint(78.5F, 1F, 14F);

		leftFrontWheelModel[2].addShapeBox(-4F, 3F, 7F, 8, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F); // Box 27
		leftFrontWheelModel[2].setRotationPoint(78.5F, 1F, 14F);

		leftFrontWheelModel[3].addShapeBox(-5F, 3F, 6F, 10, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F); // Box 27
		leftFrontWheelModel[3].setRotationPoint(78.5F, 1F, 14F);

		leftFrontWheelModel[4].addShapeBox(-5F, -5F, 6F, 10, 2, 1, 0F,-2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 27
		leftFrontWheelModel[4].setRotationPoint(78.5F, 1F, 14F);

		leftFrontWheelModel[5].addShapeBox(-5F, -2.5F, 6F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		leftFrontWheelModel[5].setRotationPoint(78.5F, 1F, 14F);

		leftFrontWheelModel[6].addShapeBox(-1.5F, -1.5F, 8F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftFrontWheelModel[6].setRotationPoint(78.5F, 1F, 14F);

		leftFrontWheelModel[7].addShapeBox(-1.5F, -0.5F, 8F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftFrontWheelModel[7].setRotationPoint(78.5F, 1F, 14F);

		leftFrontWheelModel[8].addShapeBox(-1.5F, 0.5F, 8F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		leftFrontWheelModel[8].setRotationPoint(78.5F, 1F, 14F);

		leftFrontWheelModel[9].addShape3D(9F, -9F, -6F, new Shape2D(new Coord2D[] { new Coord2D(9, 0, 9, 0), new Coord2D(13, 1, 13, 1), new Coord2D(17, 5, 17, 5), new Coord2D(18, 9, 18, 9), new Coord2D(17, 13, 17, 13), new Coord2D(13, 17, 13, 17), new Coord2D(9, 18, 9, 18), new Coord2D(5, 17, 5, 17), new Coord2D(1, 13, 1, 13), new Coord2D(0, 9, 0, 9), new Coord2D(1, 5, 1, 5), new Coord2D(5, 1, 5, 1), new Coord2D(9, 0, 9, 0) }), 4, 18, 18, 64, 4, ModelRendererTurbo.MR_FRONT, new float[] {0 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5}); // Box 27
		leftFrontWheelModel[9].setRotationPoint(78.5F, 1F, 14F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 243, textureX, textureY); // Box 27
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 153, 322, textureX, textureY); // Box 27
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 177, 322, textureX, textureY); // Box 27
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 481, 314, textureX, textureY); // Box 27
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 329, 290, textureX, textureY); // Box 27
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 457, 314, textureX, textureY); // Box 27
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 201, 282, textureX, textureY); // Box 27
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 1, 266, textureX, textureY); // Box 27
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 17, 266, textureX, textureY); // Box 27
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 41, 266, textureX, textureY); // Box 27

		rightFrontWheelModel[0].addShape3D(9F, -9F, 2F, new Shape2D(new Coord2D[] { new Coord2D(9, 0, 9, 0), new Coord2D(13, 1, 13, 1), new Coord2D(17, 5, 17, 5), new Coord2D(18, 9, 18, 9), new Coord2D(17, 13, 17, 13), new Coord2D(13, 17, 13, 17), new Coord2D(9, 18, 9, 18), new Coord2D(5, 17, 5, 17), new Coord2D(1, 13, 1, 13), new Coord2D(0, 9, 0, 9), new Coord2D(1, 5, 1, 5), new Coord2D(5, 1, 5, 1), new Coord2D(9, 0, 9, 0) }), 4, 18, 18, 64, 4, ModelRendererTurbo.MR_FRONT, new float[] {0 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5}); // Box 27
		rightFrontWheelModel[0].setRotationPoint(78.5F, 1F, -14F);

		rightFrontWheelModel[1].addShapeBox(-5F, -5F, -7F, 10, 2, 1, 0F,-2.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 27
		rightFrontWheelModel[1].setRotationPoint(78.5F, 1F, -14F);

		rightFrontWheelModel[2].addShapeBox(-5F, -2.5F, -7F, 10, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightFrontWheelModel[2].setRotationPoint(78.5F, 1F, -14F);

		rightFrontWheelModel[3].addShapeBox(-5F, 3F, -7F, 10, 2, 1, 0F,-1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 27
		rightFrontWheelModel[3].setRotationPoint(78.5F, 1F, -14F);

		rightFrontWheelModel[4].addShapeBox(-4F, 3F, -8F, 8, 1, 1, 0F,-1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 27
		rightFrontWheelModel[4].setRotationPoint(78.5F, 1F, -14F);

		rightFrontWheelModel[5].addShapeBox(-4F, -1.5F, -8F, 8, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 27
		rightFrontWheelModel[5].setRotationPoint(78.5F, 1F, -14F);

		rightFrontWheelModel[6].addShapeBox(-4F, -4F, -8F, 8, 1, 1, 0F,-2.5F, -1F, 0F, -2.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 27
		rightFrontWheelModel[6].setRotationPoint(78.5F, 1F, -14F);

		rightFrontWheelModel[7].addShapeBox(-1.5F, -1.5F, -9F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightFrontWheelModel[7].setRotationPoint(78.5F, 1F, -14F);

		rightFrontWheelModel[8].addShapeBox(-1.5F, -0.5F, -9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightFrontWheelModel[8].setRotationPoint(78.5F, 1F, -14F);

		rightFrontWheelModel[9].addShapeBox(-1.5F, 0.5F, -9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		rightFrontWheelModel[9].setRotationPoint(78.5F, 1F, -14F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 121, 270, textureX, textureY); // Box 27
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 385, 270, textureX, textureY); // Box 27
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 337, 270, textureX, textureY); // Box 27
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 361, 270, textureX, textureY); // Box 27
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 313, 270, textureX, textureY); // Box 27
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 289, 270, textureX, textureY); // Box 27
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 265, 270, textureX, textureY); // Box 27
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 217, 270, textureX, textureY); // Box 27
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 241, 270, textureX, textureY); // Box 27
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 193, 270, textureX, textureY); // Box 27
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 169, 270, textureX, textureY); // Box 27
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 145, 270, textureX, textureY); // Box 27
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 49, 270, textureX, textureY); // Box 27
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 25, 270, textureX, textureY); // Box 27
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 1, 270, textureX, textureY); // Box 27
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 73, 270, textureX, textureY); // Box 27
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 105, 270, textureX, textureY); // Box 27
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 89, 270, textureX, textureY); // Box 27
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 0, 243, textureX, textureY); // Box 27
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 121, 270, textureX, textureY); // Box 27
		leftBackWheelModel[20] = new ModelRendererTurbo(this, 385, 270, textureX, textureY); // Box 27
		leftBackWheelModel[21] = new ModelRendererTurbo(this, 337, 270, textureX, textureY); // Box 27
		leftBackWheelModel[22] = new ModelRendererTurbo(this, 361, 270, textureX, textureY); // Box 27
		leftBackWheelModel[23] = new ModelRendererTurbo(this, 313, 270, textureX, textureY); // Box 27
		leftBackWheelModel[24] = new ModelRendererTurbo(this, 289, 270, textureX, textureY); // Box 27
		leftBackWheelModel[25] = new ModelRendererTurbo(this, 265, 270, textureX, textureY); // Box 27
		leftBackWheelModel[26] = new ModelRendererTurbo(this, 217, 270, textureX, textureY); // Box 27
		leftBackWheelModel[27] = new ModelRendererTurbo(this, 241, 270, textureX, textureY); // Box 27
		leftBackWheelModel[28] = new ModelRendererTurbo(this, 193, 270, textureX, textureY); // Box 27
		leftBackWheelModel[29] = new ModelRendererTurbo(this, 169, 270, textureX, textureY); // Box 27
		leftBackWheelModel[30] = new ModelRendererTurbo(this, 145, 270, textureX, textureY); // Box 27
		leftBackWheelModel[31] = new ModelRendererTurbo(this, 49, 270, textureX, textureY); // Box 27
		leftBackWheelModel[32] = new ModelRendererTurbo(this, 25, 270, textureX, textureY); // Box 27
		leftBackWheelModel[33] = new ModelRendererTurbo(this, 1, 270, textureX, textureY); // Box 27
		leftBackWheelModel[34] = new ModelRendererTurbo(this, 73, 270, textureX, textureY); // Box 27
		leftBackWheelModel[35] = new ModelRendererTurbo(this, 105, 270, textureX, textureY); // Box 27
		leftBackWheelModel[36] = new ModelRendererTurbo(this, 89, 270, textureX, textureY); // Box 27
		leftBackWheelModel[37] = new ModelRendererTurbo(this, 0, 243, textureX, textureY); // Box 27

		leftBackWheelModel[0].addShapeBox(-4F, -9F, -9F, 4, 4, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F); // Box 27
		leftBackWheelModel[0].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[1].addShapeBox(0F, -9F, -9F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[1].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[2].addShapeBox(5F, -4F, -9F, 4, 4, 4, 0F,0.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[2].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[3].addShapeBox(3F, -8F, -9F, 4, 4, 4, 0F,0.5F, -3.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F); // Box 27
		leftBackWheelModel[3].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[4].addShapeBox(5F, 0F, -9F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F); // Box 27
		leftBackWheelModel[4].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[5].addShapeBox(3F, 4F, -9F, 4, 4, 4, 0F,-1.5F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F); // Box 27
		leftBackWheelModel[5].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[6].addShapeBox(0F, 5F, -9F, 4, 4, 4, 0F,0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[6].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[7].addShapeBox(-7F, 4F, -9F, 4, 4, 4, 0F,1F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F); // Box 27
		leftBackWheelModel[7].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[8].addShapeBox(-4F, 5F, -9F, 4, 4, 4, 0F,-1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		leftBackWheelModel[8].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[9].addShapeBox(-9F, 0F, -9F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F); // Box 27
		leftBackWheelModel[9].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[10].addShapeBox(-9F, -4F, -9F, 4, 4, 4, 0F,-1F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[10].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[11].addShapeBox(-7F, -8F, -9F, 4, 4, 4, 0F,-3F, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F); // Box 27
		leftBackWheelModel[11].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[12].addShapeBox(-5F, -5F, -5F, 10, 2, 1, 0F,-2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 27
		leftBackWheelModel[12].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[13].addShapeBox(-5F, -2.5F, -5F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[13].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[14].addShapeBox(-5F, 3F, -5F, 10, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 27
		leftBackWheelModel[14].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[15].addShapeBox(-1.5F, -0.5F, -7.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[15].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[16].addShapeBox(-1.5F, 0.5F, -7.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		leftBackWheelModel[16].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[17].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[17].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[18].addShape3D(9F, -9F, 0F, new Shape2D(new Coord2D[] { new Coord2D(9, 0, 9, 0), new Coord2D(13, 1, 13, 1), new Coord2D(17, 5, 17, 5), new Coord2D(18, 9, 18, 9), new Coord2D(17, 13, 17, 13), new Coord2D(13, 17, 13, 17), new Coord2D(9, 18, 9, 18), new Coord2D(5, 17, 5, 17), new Coord2D(1, 13, 1, 13), new Coord2D(0, 9, 0, 9), new Coord2D(1, 5, 1, 5), new Coord2D(5, 1, 5, 1), new Coord2D(9, 0, 9, 0) }), 4, 18, 18, 64, 4, ModelRendererTurbo.MR_FRONT, new float[] {0 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5}); // Box 27
		leftBackWheelModel[18].setRotationPoint(-15.5F, 1F, -13F);

		leftBackWheelModel[19].addShapeBox(-4F, -9F, -9F, 4, 4, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F); // Box 27
		leftBackWheelModel[19].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[20].addShapeBox(0F, -9F, -9F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[20].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[21].addShapeBox(5F, -4F, -9F, 4, 4, 4, 0F,0.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[21].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[22].addShapeBox(3F, -8F, -9F, 4, 4, 4, 0F,0.5F, -3.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F); // Box 27
		leftBackWheelModel[22].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[23].addShapeBox(5F, 0F, -9F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F); // Box 27
		leftBackWheelModel[23].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[24].addShapeBox(3F, 4F, -9F, 4, 4, 4, 0F,-1.5F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F); // Box 27
		leftBackWheelModel[24].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[25].addShapeBox(0F, 5F, -9F, 4, 4, 4, 0F,0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[25].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[26].addShapeBox(-7F, 4F, -9F, 4, 4, 4, 0F,1F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F); // Box 27
		leftBackWheelModel[26].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[27].addShapeBox(-4F, 5F, -9F, 4, 4, 4, 0F,-1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		leftBackWheelModel[27].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[28].addShapeBox(-9F, 0F, -9F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F); // Box 27
		leftBackWheelModel[28].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[29].addShapeBox(-9F, -4F, -9F, 4, 4, 4, 0F,-1F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[29].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[30].addShapeBox(-7F, -8F, -9F, 4, 4, 4, 0F,-3F, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F); // Box 27
		leftBackWheelModel[30].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[31].addShapeBox(-5F, -5F, -5F, 10, 2, 1, 0F,-2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 27
		leftBackWheelModel[31].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[32].addShapeBox(-5F, -2.5F, -5F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[32].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[33].addShapeBox(-5F, 3F, -5F, 10, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 27
		leftBackWheelModel[33].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[34].addShapeBox(-1.5F, -0.5F, -7.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[34].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[35].addShapeBox(-1.5F, 0.5F, -7.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		leftBackWheelModel[35].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[36].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftBackWheelModel[36].setRotationPoint(5.5F, 1F, -13F);

		leftBackWheelModel[37].addShape3D(9F, -9F, 0F, new Shape2D(new Coord2D[] { new Coord2D(9, 0, 9, 0), new Coord2D(13, 1, 13, 1), new Coord2D(17, 5, 17, 5), new Coord2D(18, 9, 18, 9), new Coord2D(17, 13, 17, 13), new Coord2D(13, 17, 13, 17), new Coord2D(9, 18, 9, 18), new Coord2D(5, 17, 5, 17), new Coord2D(1, 13, 1, 13), new Coord2D(0, 9, 0, 9), new Coord2D(1, 5, 1, 5), new Coord2D(5, 1, 5, 1), new Coord2D(9, 0, 9, 0) }), 4, 18, 18, 64, 4, ModelRendererTurbo.MR_FRONT, new float[] {0 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5}); // Box 27
		leftBackWheelModel[37].setRotationPoint(5.5F, 1F, -13F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 1, 270, textureX, textureY); // Box 27
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 25, 270, textureX, textureY); // Box 27
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 49, 270, textureX, textureY); // Box 27
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 73, 270, textureX, textureY); // Box 27
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 89, 270, textureX, textureY); // Box 27
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 105, 270, textureX, textureY); // Box 27
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 121, 270, textureX, textureY); // Box 27
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 145, 270, textureX, textureY); // Box 27
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 169, 270, textureX, textureY); // Box 27
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 193, 270, textureX, textureY); // Box 27
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 217, 270, textureX, textureY); // Box 27
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 241, 270, textureX, textureY); // Box 27
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 265, 270, textureX, textureY); // Box 27
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 289, 270, textureX, textureY); // Box 27
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 313, 270, textureX, textureY); // Box 27
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 337, 270, textureX, textureY); // Box 27
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 361, 270, textureX, textureY); // Box 27
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 385, 270, textureX, textureY); // Box 27
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 1, 270, textureX, textureY); // Box 27
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 25, 270, textureX, textureY); // Box 27
		rightBackWheelModel[20] = new ModelRendererTurbo(this, 49, 270, textureX, textureY); // Box 27
		rightBackWheelModel[21] = new ModelRendererTurbo(this, 89, 270, textureX, textureY); // Box 27
		rightBackWheelModel[22] = new ModelRendererTurbo(this, 105, 270, textureX, textureY); // Box 27
		rightBackWheelModel[23] = new ModelRendererTurbo(this, 121, 270, textureX, textureY); // Box 27
		rightBackWheelModel[24] = new ModelRendererTurbo(this, 145, 270, textureX, textureY); // Box 27
		rightBackWheelModel[25] = new ModelRendererTurbo(this, 169, 270, textureX, textureY); // Box 27
		rightBackWheelModel[26] = new ModelRendererTurbo(this, 193, 270, textureX, textureY); // Box 27
		rightBackWheelModel[27] = new ModelRendererTurbo(this, 217, 270, textureX, textureY); // Box 27
		rightBackWheelModel[28] = new ModelRendererTurbo(this, 241, 270, textureX, textureY); // Box 27
		rightBackWheelModel[29] = new ModelRendererTurbo(this, 265, 270, textureX, textureY); // Box 27
		rightBackWheelModel[30] = new ModelRendererTurbo(this, 289, 270, textureX, textureY); // Box 27
		rightBackWheelModel[31] = new ModelRendererTurbo(this, 313, 270, textureX, textureY); // Box 27
		rightBackWheelModel[32] = new ModelRendererTurbo(this, 337, 270, textureX, textureY); // Box 27
		rightBackWheelModel[33] = new ModelRendererTurbo(this, 361, 270, textureX, textureY); // Box 27
		rightBackWheelModel[34] = new ModelRendererTurbo(this, 385, 270, textureX, textureY); // Box 27
		rightBackWheelModel[35] = new ModelRendererTurbo(this, 73, 270, textureX, textureY); // Box 27
		rightBackWheelModel[36] = new ModelRendererTurbo(this, 0, 243, textureX, textureY); // Box 27
		rightBackWheelModel[37] = new ModelRendererTurbo(this, 0, 243, textureX, textureY); // Box 27

		rightBackWheelModel[0].addShapeBox(-5F, 3F, 5F, 10, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 27
		rightBackWheelModel[0].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[1].addShapeBox(-5F, -2.5F, 5F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[1].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[2].addShapeBox(-5F, -5F, 5F, 10, 2, 1, 0F,-2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 27
		rightBackWheelModel[2].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[3].addShapeBox(-1.5F, -0.5F, 5.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[3].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[4].addShapeBox(-1.5F, -1.5F, 5.5F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[4].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[5].addShapeBox(-1.5F, 0.5F, 5.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		rightBackWheelModel[5].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[6].addShapeBox(-4F, -9F, 6F, 4, 4, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F); // Box 27
		rightBackWheelModel[6].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[7].addShapeBox(-7F, -8F, 6F, 4, 4, 4, 0F,-3F, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F); // Box 27
		rightBackWheelModel[7].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[8].addShapeBox(-9F, -4F, 6F, 4, 4, 4, 0F,-1F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[8].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[9].addShapeBox(-9F, 0F, 6F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F); // Box 27
		rightBackWheelModel[9].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[10].addShapeBox(-7F, 4F, 6F, 4, 4, 4, 0F,1F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F); // Box 27
		rightBackWheelModel[10].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[11].addShapeBox(-4F, 5F, 6F, 4, 4, 4, 0F,-1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		rightBackWheelModel[11].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[12].addShapeBox(0F, 5F, 6F, 4, 4, 4, 0F,0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[12].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[13].addShapeBox(3F, 4F, 6F, 4, 4, 4, 0F,-1.5F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F); // Box 27
		rightBackWheelModel[13].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[14].addShapeBox(5F, 0F, 6F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F); // Box 27
		rightBackWheelModel[14].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[15].addShapeBox(5F, -4F, 6F, 4, 4, 4, 0F,0.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[15].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[16].addShapeBox(3F, -8F, 6F, 4, 4, 4, 0F,0.5F, -3.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F); // Box 27
		rightBackWheelModel[16].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[17].addShapeBox(0F, -9F, 6F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[17].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[18].addShapeBox(-5F, 3F, 5F, 10, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 27
		rightBackWheelModel[18].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[19].addShapeBox(-5F, -2.5F, 5F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[19].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[20].addShapeBox(-5F, -5F, 5F, 10, 2, 1, 0F,-2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 27
		rightBackWheelModel[20].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[21].addShapeBox(-1.5F, -1.5F, 5.5F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[21].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[22].addShapeBox(-1.5F, 0.5F, 5.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		rightBackWheelModel[22].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[23].addShapeBox(-4F, -9F, 6F, 4, 4, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F); // Box 27
		rightBackWheelModel[23].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[24].addShapeBox(-7F, -8F, 6F, 4, 4, 4, 0F,-3F, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F); // Box 27
		rightBackWheelModel[24].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[25].addShapeBox(-9F, -4F, 6F, 4, 4, 4, 0F,-1F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[25].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[26].addShapeBox(-9F, 0F, 6F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F); // Box 27
		rightBackWheelModel[26].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[27].addShapeBox(-7F, 4F, 6F, 4, 4, 4, 0F,1F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F); // Box 27
		rightBackWheelModel[27].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[28].addShapeBox(-4F, 5F, 6F, 4, 4, 4, 0F,-1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		rightBackWheelModel[28].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[29].addShapeBox(0F, 5F, 6F, 4, 4, 4, 0F,0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[29].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[30].addShapeBox(3F, 4F, 6F, 4, 4, 4, 0F,-1.5F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F, 0.5F, -3.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F); // Box 27
		rightBackWheelModel[30].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[31].addShapeBox(5F, 0F, 6F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F); // Box 27
		rightBackWheelModel[31].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[32].addShapeBox(5F, -4F, 6F, 4, 4, 4, 0F,0.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[32].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[33].addShapeBox(3F, -8F, 6F, 4, 4, 4, 0F,0.5F, -3.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, -3.5F, 0F, -1.5F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 1.5F, 0F); // Box 27
		rightBackWheelModel[33].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[34].addShapeBox(0F, -9F, 6F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[34].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[35].addShapeBox(-1.5F, -0.5F, 5.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightBackWheelModel[35].setRotationPoint(-15.5F, 1F, 13F);

		rightBackWheelModel[36].addShape3D(9F, -9F, -5F, new Shape2D(new Coord2D[] { new Coord2D(9, 0, 9, 0), new Coord2D(13, 1, 13, 1), new Coord2D(17, 5, 17, 5), new Coord2D(18, 9, 18, 9), new Coord2D(17, 13, 17, 13), new Coord2D(13, 17, 13, 17), new Coord2D(9, 18, 9, 18), new Coord2D(5, 17, 5, 17), new Coord2D(1, 13, 1, 13), new Coord2D(0, 9, 0, 9), new Coord2D(1, 5, 1, 5), new Coord2D(5, 1, 5, 1), new Coord2D(9, 0, 9, 0) }), 4, 18, 18, 64, 4, ModelRendererTurbo.MR_FRONT, new float[] {0 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5}); // Box 27
		rightBackWheelModel[36].setRotationPoint(5.5F, 1F, 13F);

		rightBackWheelModel[37].addShape3D(9F, -9F, -5F, new Shape2D(new Coord2D[] { new Coord2D(9, 0, 9, 0), new Coord2D(13, 1, 13, 1), new Coord2D(17, 5, 17, 5), new Coord2D(18, 9, 18, 9), new Coord2D(17, 13, 17, 13), new Coord2D(13, 17, 13, 17), new Coord2D(9, 18, 9, 18), new Coord2D(5, 17, 5, 17), new Coord2D(1, 13, 1, 13), new Coord2D(0, 9, 0, 9), new Coord2D(1, 5, 1, 5), new Coord2D(5, 1, 5, 1), new Coord2D(9, 0, 9, 0) }), 4, 18, 18, 64, 4, ModelRendererTurbo.MR_FRONT, new float[] {0 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5 ,5 ,6 ,5}); // Box 27
		rightBackWheelModel[37].setRotationPoint(-15.5F, 1F, 13F);
	}
}