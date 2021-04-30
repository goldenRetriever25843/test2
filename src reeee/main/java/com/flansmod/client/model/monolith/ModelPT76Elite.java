//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.06.2016 - 00:37:21
// Last changed on: 29.06.2016 - 00:37:21

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPT76Elite extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPT76Elite() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[126];
		turretModel = new ModelRendererTurbo[58];
		barrelModel = new ModelRendererTurbo[41];
		leftTrackWheelModels = new ModelRendererTurbo[24];
		rightTrackWheelModels = new ModelRendererTurbo[24];
		leftTrackModel = new ModelRendererTurbo[23];
		rightTrackModel = new ModelRendererTurbo[23];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		bodyModel[22] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 51
		bodyModel[23] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 52
		bodyModel[24] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 53
		bodyModel[25] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 54
		bodyModel[26] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 55
		bodyModel[27] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 56
		bodyModel[28] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 57
		bodyModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 58
		bodyModel[30] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 59
		bodyModel[31] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 60
		bodyModel[32] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 61
		bodyModel[33] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 62
		bodyModel[34] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 64
		bodyModel[36] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 65
		bodyModel[37] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 66
		bodyModel[38] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 67
		bodyModel[39] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 68
		bodyModel[40] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 69
		bodyModel[41] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 71
		bodyModel[42] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 72
		bodyModel[43] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 73
		bodyModel[44] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 74
		bodyModel[45] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 75
		bodyModel[46] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 76
		bodyModel[47] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 77
		bodyModel[48] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 78
		bodyModel[49] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 79
		bodyModel[50] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 81
		bodyModel[51] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 82
		bodyModel[52] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 83
		bodyModel[53] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 84
		bodyModel[54] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 85
		bodyModel[55] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 89
		bodyModel[56] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 90
		bodyModel[57] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 91
		bodyModel[58] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 92
		bodyModel[59] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 93
		bodyModel[60] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 94
		bodyModel[61] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 95
		bodyModel[62] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 96
		bodyModel[63] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 97
		bodyModel[64] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 98
		bodyModel[65] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 99
		bodyModel[66] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 100
		bodyModel[67] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 101
		bodyModel[68] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 102
		bodyModel[69] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 103
		bodyModel[70] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 104
		bodyModel[71] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 105
		bodyModel[72] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 106
		bodyModel[73] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 107
		bodyModel[74] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 108
		bodyModel[75] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 109
		bodyModel[76] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 110
		bodyModel[77] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 111
		bodyModel[78] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 112
		bodyModel[79] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 113
		bodyModel[80] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 114
		bodyModel[81] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 115
		bodyModel[82] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 116
		bodyModel[83] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 117
		bodyModel[84] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 118
		bodyModel[85] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 119
		bodyModel[86] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 120
		bodyModel[87] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 121
		bodyModel[88] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 122
		bodyModel[89] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 123
		bodyModel[90] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 127
		bodyModel[91] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 129
		bodyModel[93] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 130
		bodyModel[94] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 131
		bodyModel[95] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 132
		bodyModel[96] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 133
		bodyModel[97] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 134
		bodyModel[98] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 135
		bodyModel[99] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 136
		bodyModel[100] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 139
		bodyModel[101] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Box 251
		bodyModel[102] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 252
		bodyModel[103] = new ModelRendererTurbo(this, 353, 289, textureX, textureY); // Box 254
		bodyModel[104] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 255
		bodyModel[105] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Box 256
		bodyModel[106] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Box 257
		bodyModel[107] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 258
		bodyModel[108] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 259
		bodyModel[109] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 260
		bodyModel[110] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 261
		bodyModel[111] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 263
		bodyModel[112] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 264
		bodyModel[113] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 265
		bodyModel[114] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 266
		bodyModel[115] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 267
		bodyModel[116] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 267
		bodyModel[117] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 269
		bodyModel[118] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 270
		bodyModel[119] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 271
		bodyModel[120] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 272
		bodyModel[121] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 273
		bodyModel[122] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 275
		bodyModel[123] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 316
		bodyModel[124] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 317
		bodyModel[125] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 318

		bodyModel[0].addShapeBox(0F, 0F, 0F, 31, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-57.5F, -22F, 10.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 23, 9, 59, 0F,0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F); // Box 1
		bodyModel[1].setRotationPoint(-80.5F, -22.7F, -28.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 9, 59, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-21.5F, -22.7F, -28.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 24, 9, 59, 0F,0F, -0.2F, 0F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, 0F, 0F, 1F, 0F, 0F, 1.5F, -2.5F, 0F, 1.5F, -2.5F, 0F, 1F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-2.5F, -22.7F, -28.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 5, 54, 0F,0F, 4F, 0F, 0F, 4F, -1.5F, 0F, 4F, -1.5F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F); // Box 5
		bodyModel[4].setRotationPoint(21.5F, -18.5F, -26F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 23, 5, 54, 0F,0F, 4F, -1.5F, 4F, -1.2F, -4.2F, 4F, -1.2F, -4.2F, 0F, 4F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, -1.5F); // Box 6
		bodyModel[5].setRotationPoint(32.5F, -18.5F, -26F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 19, 11, 54, 0F,0F, -1F, -3.5F, 4F, -1F, -4.1F, 4F, -1F, -4.1F, 0F, -1F, -3.5F, 0F, 0.5F, -3.5F, -5.5F, 0.5F, -4F, -5.5F, 0.5F, -4F, 0F, 0.5F, -3.5F); // Box 7
		bodyModel[6].setRotationPoint(32.5F, -14F, -26F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 90, 16, 54, 0F,0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0F, -3.5F); // Box 8
		bodyModel[7].setRotationPoint(-57.5F, -15F, -26F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 4, 54, 0F,0F, -0.5F, -3.5F, 3.5F, -0.5F, -4.1F, 3.5F, -0.5F, -4.1F, 0F, -0.5F, -3.5F, 0F, 0.5F, -3.5F, -5.5F, 0.5F, -4F, -5.5F, 0.5F, -4F, 0F, 0.5F, -3.5F); // Box 9
		bodyModel[8].setRotationPoint(32.5F, -3F, -26F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 15, 54, 0F,9F, -1F, -4F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 9F, -1F, -4F, 0F, -2.3F, -4F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, -2.3F, -4F); // Box 10
		bodyModel[9].setRotationPoint(-71.5F, -15F, -26F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 135, 1, 10, 0F,0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-79.5F, -14.45F, -32F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 135, 1, 10, 0F,0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-79.5F, -14.45F, 24F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1.4F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, -1.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-80.5F, -14.8F, -32F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F); // Box 14
		bodyModel[13].setRotationPoint(-80.5F, -14.2F, -31.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F); // Box 15
		bodyModel[14].setRotationPoint(-80.5F, -14.2F, 24.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1.4F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, -1.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-80.5F, -14.8F, 24F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F); // Box 17
		bodyModel[16].setRotationPoint(55.1F, -13.2F, -32F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 18
		bodyModel[17].setRotationPoint(55.1F, -13.2F, 25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 39, 0F,0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F); // Box 19
		bodyModel[18].setRotationPoint(52.4F, -19.2F, -18.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,-2F, -0.7F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, -2F, 0.2F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F); // Box 20
		bodyModel[19].setRotationPoint(52.4F, -19.2F, -21.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -2F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -2F, 0.2F, 0F); // Box 21
		bodyModel[20].setRotationPoint(52.4F, -19.2F, 20.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 50
		bodyModel[21].setRotationPoint(-23.2F, -22.5F, 30F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 51
		bodyModel[22].setRotationPoint(-29.8F, -22.5F, 30F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 52
		bodyModel[23].setRotationPoint(-29.5F, -22.5F, 31.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 53
		bodyModel[24].setRotationPoint(-50.7F, -22.5F, 30F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 54
		bodyModel[25].setRotationPoint(-57.3F, -22.5F, 30F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 55
		bodyModel[26].setRotationPoint(-57F, -22.5F, 31.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 56
		bodyModel[27].setRotationPoint(-66.5F, -22.5F, -28F);
		bodyModel[27].rotateAngleY = 0.08726646F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 57
		bodyModel[28].setRotationPoint(-73.2F, -22.5F, -26F);
		bodyModel[28].rotateAngleY = 0.03490659F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 58
		bodyModel[29].setRotationPoint(-73F, -22.5F, -26.5F);
		bodyModel[29].rotateAngleX = 0.01745329F;
		bodyModel[29].rotateAngleY = -0.25830873F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 59
		bodyModel[30].setRotationPoint(-29.5F, -22.5F, -30.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 60
		bodyModel[31].setRotationPoint(-29.8F, -22.5F, -30F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 61
		bodyModel[32].setRotationPoint(-23.2F, -22.5F, -30F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 62
		bodyModel[33].setRotationPoint(-57.3F, -22.5F, -30F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 63
		bodyModel[34].setRotationPoint(-57F, -22.5F, -30.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 64
		bodyModel[35].setRotationPoint(-50.7F, -22.5F, -30F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 65
		bodyModel[36].setRotationPoint(-73.35F, -22.5F, 26F);
		bodyModel[36].rotateAngleY = 0.03490659F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 66
		bodyModel[37].setRotationPoint(-66.9F, -22.5F, 27.6F);
		bodyModel[37].rotateAngleY = 0.08726646F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 67
		bodyModel[38].setRotationPoint(-73F, -22.5F, 27.5F);
		bodyModel[38].rotateAngleX = 0.01745329F;
		bodyModel[38].rotateAngleY = 0.25830873F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 30, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 68
		bodyModel[39].setRotationPoint(-56.5F, -23.5F, 11.3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -3.4F, 0.35F, 0F, -3.4F, 0.35F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -1.1F, 0F, 0F, -1.1F); // Box 69
		bodyModel[40].setRotationPoint(-81F, -20F, -15.8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.6F, -0.05F, 0F, 0.6F, -0.05F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 71
		bodyModel[41].setRotationPoint(-81F, -16F, -11.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.45F, 0.7F, 0F, 0.45F, 0.7F, 0F, -0.4F, 1.8F, 0F, -0.4F, 1.8F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 72
		bodyModel[42].setRotationPoint(-81F, -20F, -17.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.9F, 0.85F, 0F, 0.9F, 0.85F, 0F, -1.7F, 1.2F, 0F, -1.7F, 1.2F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F); // Box 73
		bodyModel[43].setRotationPoint(-81F, -20F, -19.35F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.85F, 0.7F, 0F, 0.85F, 0.7F, 0F, -1.7F, 0.1F, 0F, -1.7F, 0.1F, 0F, -0.05F, -0.55F, 0F, -0.05F, -0.55F); // Box 74
		bodyModel[44].setRotationPoint(-81F, -19.6F, -21F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, 0.6F, -0.05F, 0F, 0.6F, -0.05F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 75
		bodyModel[45].setRotationPoint(-81F, -16F, 12.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -3.4F, 0.35F, 0F, -3.4F, 0.35F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 1.7F, 0F, 0F, 1.7F); // Box 76
		bodyModel[46].setRotationPoint(-81F, -20F, 13.85F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.45F, 0.7F, 0F, 0.45F, 0.7F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, 1.8F, 0F, -0.4F, 1.8F); // Box 77
		bodyModel[47].setRotationPoint(-81F, -20F, 18.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.9F, 0.85F, 0F, 0.9F, 0.85F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -1.7F, 1.2F, 0F, -1.7F, 1.2F); // Box 78
		bodyModel[48].setRotationPoint(-81F, -20F, 20.35F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.05F, -0.55F, 0F, -0.05F, -0.55F, 0F, -1.7F, 0.1F, 0F, -1.7F, 0.1F); // Box 79
		bodyModel[49].setRotationPoint(-81F, -19.65F, 22F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 81
		bodyModel[50].setRotationPoint(-81.2F, -14.95F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 82
		bodyModel[51].setRotationPoint(-82F, -15.05F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 83
		bodyModel[52].setRotationPoint(-82F, -13.85F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F); // Box 84
		bodyModel[53].setRotationPoint(-83F, -15.05F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F); // Box 85
		bodyModel[54].setRotationPoint(-83F, -13.85F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 89
		bodyModel[55].setRotationPoint(44.1F, -23.8F, 14F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 90
		bodyModel[56].setRotationPoint(48.1F, -23.8F, 14F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 91
		bodyModel[57].setRotationPoint(48.1F, -23.8F, 15.3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 92
		bodyModel[58].setRotationPoint(44.1F, -23.8F, 15.3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 93
		bodyModel[59].setRotationPoint(48.1F, -23.8F, 16.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 94
		bodyModel[60].setRotationPoint(44.1F, -23.8F, 16.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 95
		bodyModel[61].setRotationPoint(48.1F, -23.8F, 18F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 96
		bodyModel[62].setRotationPoint(44.1F, -23.8F, 18F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 97
		bodyModel[63].setRotationPoint(48.1F, -23.8F, 19.4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 98
		bodyModel[64].setRotationPoint(44.1F, -23.8F, 19.4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F); // Box 99
		bodyModel[65].setRotationPoint(44.1F, -24.25F, 14.2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 100
		bodyModel[66].setRotationPoint(44.6F, -24.25F, 16.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 101
		bodyModel[67].setRotationPoint(44.6F, -24.25F, 18F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 102
		bodyModel[68].setRotationPoint(44.6F, -24.25F, 19.4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 103
		bodyModel[69].setRotationPoint(44.6F, -23F, 19.4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 104
		bodyModel[70].setRotationPoint(44.6F, -21.25F, 19.4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 105
		bodyModel[71].setRotationPoint(44.6F, -24.25F, 14F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 106
		bodyModel[72].setRotationPoint(44.6F, -21.25F, 14F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 107
		bodyModel[73].setRotationPoint(44.6F, -23F, 14F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 108
		bodyModel[74].setRotationPoint(44.6F, -24.25F, 15.3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 109
		bodyModel[75].setRotationPoint(44.6F, -24.25F, -18.9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 110
		bodyModel[76].setRotationPoint(44.6F, -24.25F, -20.2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 111
		bodyModel[77].setRotationPoint(44.6F, -23F, -20.2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 112
		bodyModel[78].setRotationPoint(44.6F, -21.25F, -20.2F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 113
		bodyModel[79].setRotationPoint(48.1F, -23.8F, -20.2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 114
		bodyModel[80].setRotationPoint(44.1F, -23.8F, -20.2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.6F, -0.45F, -0.45F, -0.6F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.6F, -0.45F, -0.45F, -0.6F); // Box 115
		bodyModel[81].setRotationPoint(44.1F, -24.25F, -20F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 116
		bodyModel[82].setRotationPoint(44.1F, -23.8F, -18.9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 117
		bodyModel[83].setRotationPoint(44.1F, -23.8F, -17.7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 118
		bodyModel[84].setRotationPoint(44.6F, -24.25F, -17.7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 119
		bodyModel[85].setRotationPoint(44.1F, -23.8F, -16.2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 120
		bodyModel[86].setRotationPoint(48.1F, -23.8F, -16.2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 121
		bodyModel[87].setRotationPoint(44.6F, -24.25F, -16.2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 122
		bodyModel[88].setRotationPoint(48.1F, -23.8F, -17.7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 123
		bodyModel[89].setRotationPoint(48.1F, -23.8F, -18.9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 127
		bodyModel[90].setRotationPoint(44.6F, -23F, -16.2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 128
		bodyModel[91].setRotationPoint(44.6F, -21.25F, -16.2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 129
		bodyModel[92].setRotationPoint(46.2F, -22F, 15.6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 130
		bodyModel[93].setRotationPoint(46.2F, -23F, 15.6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 131
		bodyModel[94].setRotationPoint(46.2F, -21F, 15.6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 132
		bodyModel[95].setRotationPoint(45.5F, -22F, 16F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 133
		bodyModel[96].setRotationPoint(46.2F, -21F, -18.8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 134
		bodyModel[97].setRotationPoint(46.2F, -22F, -18.8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 135
		bodyModel[98].setRotationPoint(46.2F, -23F, -18.8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 136
		bodyModel[99].setRotationPoint(45.5F, -22F, -18.4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 16, 1, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 139
		bodyModel[100].setRotationPoint(-76.5F, -23.5F, -14.7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 251
		bodyModel[101].setRotationPoint(-25.5F, -22.7F, 10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 9, 20, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 252
		bodyModel[102].setRotationPoint(-26.5F, -22.7F, 10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 36, 9, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[103].setRotationPoint(-57.5F, -22.7F, -28.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 24, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 255
		bodyModel[104].setRotationPoint(-53.5F, -23.5F, 23F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 36, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 256
		bodyModel[105].setRotationPoint(-59.5F, -24.5F, -4.7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 257
		bodyModel[106].setRotationPoint(-42.5F, -24F, -22.7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 258
		bodyModel[107].setRotationPoint(-54.5F, -24F, -21F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0.5F, 0F, 0.3F, 1F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 1F, 0F, 0.3F, 1.5F, 0F, 0.3F, 1F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Box 259
		bodyModel[108].setRotationPoint(26.3F, -23F, 0.3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 1F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 1F, 0F, 0.3F, 1.5F, 0F, 0.3F, 1F, 0F, 0.3F); // Box 260
		bodyModel[109].setRotationPoint(26.3F, -23F, -2.3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-1F, 0F, 0.3F, -0.5F, 0F, 0.3F, 1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, 0.3F, 0.2F, 0F, 0.3F, 1.5F, 0F, -0.1F, 1F, 0F, -0.1F); // Box 261
		bodyModel[110].setRotationPoint(26.8F, -23F, -4.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0.5F, 0F, -0.1F, 1F, 0F, -0.1F, -0.5F, 0F, 0.3F, -1F, 0F, 0.3F, 1F, 0F, -0.1F, 1.5F, 0F, -0.1F, 0.2F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 263
		bodyModel[111].setRotationPoint(26.8F, -23F, 2.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,-1F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.9F, 0F, -0.1F, 0.6F, 0F, -0.1F, 0F, 0F, 0.3F, 0.2F, 0F, 0.3F, 1.6F, 0F, -0.1F, 1.6F, 0F, -0.1F); // Box 264
		bodyModel[112].setRotationPoint(28.4F, -23F, -5.7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0.6F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.5F, 0F, 0.3F, -1F, 0F, 0.3F, 1.6F, 0F, -0.1F, 1.6F, 0F, -0.1F, 0.2F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
		bodyModel[113].setRotationPoint(28.4F, -23F, 4.7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0.6F, 0F, -0.1F, 0.9F, 0F, -0.1F, -1.5F, 0F, -0.2F, -2F, 0F, -0.2F, 1.6F, 0F, -0.1F, 1.6F, 0F, -0.1F, -0.8F, 0F, 0.3F, -1F, 0F, 0.3F); // Box 266
		bodyModel[114].setRotationPoint(30F, -23F, 5.9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,-2F, 0F, -0.2F, -1.5F, 0F, -0.2F, 0.9F, 0F, -0.1F, 0.6F, 0F, -0.1F, -1F, 0F, 0.3F, -0.8F, 0F, 0.3F, 1.6F, 0F, -0.1F, 1.6F, 0F, -0.1F); // Box 267
		bodyModel[115].setRotationPoint(30F, -23F, -6.9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F); // Box 267
		bodyModel[116].setRotationPoint(27.6F, -23.5F, -0.55F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0.6F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.5F, 0F, 0.3F, -1F, 0F, 0.3F, 0.7F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.5F, 0F, 0.3F, -0.7F, 0F, 0.3F); // Box 269
		bodyModel[117].setRotationPoint(29.5F, -23.5F, 2.8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.6F, 0F, -0.1F, 0.9F, 0F, -0.1F, -1F, 0F, -0.45F, -1.25F, 0F, -0.45F, 0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.8F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 270
		bodyModel[118].setRotationPoint(31.1F, -23.5F, 4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, -0.1F, 0.4F, 0F, -0.1F, -0.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F, -0.5F, 0F, 1F, -0.9F, 0F, 1F); // Box 271
		bodyModel[119].setRotationPoint(27.9F, -23.5F, 0.9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-1F, 0F, 1F, -0.5F, 0F, 1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, 1F, -0.5F, 0F, 1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 272
		bodyModel[120].setRotationPoint(27.9F, -23.5F, -2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-1F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.9F, 0F, -0.1F, 0.6F, 0F, -0.1F, -0.7F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.9F, 0F, -0.1F, 0.7F, 0F, -0.1F); // Box 273
		bodyModel[121].setRotationPoint(29.5F, -23.5F, -3.9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1.25F, 0F, -0.45F, -1F, 0F, -0.45F, 0.9F, 0F, -0.1F, 0.6F, 0F, -0.1F, -1F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F); // Box 275
		bodyModel[122].setRotationPoint(31.1F, -23.5F, -5.1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F); // Box 316
		bodyModel[123].setRotationPoint(36.6F, -24.5F, -0.55F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F); // Box 317
		bodyModel[124].setRotationPoint(35.3F, -24.5F, 2.45F);
		bodyModel[124].rotateAngleY = 1.01229097F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F); // Box 318
		bodyModel[125].setRotationPoint(34.5F, -24.5F, -3F);
		bodyModel[125].rotateAngleX = -0.01745329F;
		bodyModel[125].rotateAngleY = -1.01229097F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 225, 297, textureX, textureY); // Box 202
		turretModel[1] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 205
		turretModel[2] = new ModelRendererTurbo(this, 73, 313, textureX, textureY); // Box 206
		turretModel[3] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 207
		turretModel[4] = new ModelRendererTurbo(this, 193, 313, textureX, textureY); // Box 208
		turretModel[5] = new ModelRendererTurbo(this, 465, 289, textureX, textureY); // Box 209
		turretModel[6] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 210
		turretModel[7] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 211
		turretModel[8] = new ModelRendererTurbo(this, 249, 313, textureX, textureY); // Box 212
		turretModel[9] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 213
		turretModel[10] = new ModelRendererTurbo(this, 465, 305, textureX, textureY); // Box 214
		turretModel[11] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Box 215
		turretModel[12] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 216
		turretModel[13] = new ModelRendererTurbo(this, 313, 305, textureX, textureY); // Box 217
		turretModel[14] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Box 226
		turretModel[15] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 227
		turretModel[16] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 237
		turretModel[17] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 238
		turretModel[18] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 239
		turretModel[19] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 240
		turretModel[20] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 241
		turretModel[21] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 242
		turretModel[22] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 243
		turretModel[23] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 244
		turretModel[24] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 245
		turretModel[25] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 246
		turretModel[26] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 276
		turretModel[27] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 277
		turretModel[28] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 278
		turretModel[29] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 279
		turretModel[30] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 280
		turretModel[31] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 281
		turretModel[32] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 282
		turretModel[33] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 283
		turretModel[34] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 284
		turretModel[35] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 285
		turretModel[36] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 286
		turretModel[37] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 287
		turretModel[38] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 288
		turretModel[39] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 289
		turretModel[40] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 290
		turretModel[41] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 292
		turretModel[42] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 293
		turretModel[43] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 294
		turretModel[44] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 295
		turretModel[45] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 296
		turretModel[46] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Box 304
		turretModel[47] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 305
		turretModel[48] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 306
		turretModel[49] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 307
		turretModel[50] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 308
		turretModel[51] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 309
		turretModel[52] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 310
		turretModel[53] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 311
		turretModel[54] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 312
		turretModel[55] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 313
		turretModel[56] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 314
		turretModel[57] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 315

		turretModel[0].addShapeBox(-14.4F, 0F, 0.2F, 29, 11, 4, 0F,0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 7.5F, 0F, 0F, 8F, 0F, 0F, 7.5F, 0F, 0F, 7.1F, 0F, 0F); // Box 202
		turretModel[0].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[1].addShapeBox(-14.4F, 0F, -3.8F, 29, 11, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 7.1F, 0F, 0F, 7.5F, 0F, 0F, 8F, 0F, 0F, 7.5F, 0F, 0F); // Box 205
		turretModel[1].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[2].addShapeBox(-13.4F, 0F, 4.2F, 27, 11, 4, 0F,1F, 0.5F, 0F, 1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.65F, 0.5F, 0F, 8.1F, 0F, 0F, 8.5F, 0F, 0F, 8F, 0F, 0F, 6.9F, 0F, 0F); // Box 206
		turretModel[2].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[3].addShapeBox(-11.4F, 0F, 8.2F, 23, 11, 4, 0F,1.35F, 0.5F, 0F, 1.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2.65F, 0.5F, 0F, 8.9F, 0F, 0F, 10F, 0F, 0F, 7.3F, 0F, 0F, 6.9F, 0F, 0F); // Box 207
		turretModel[3].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[4].addShapeBox(-11.4F, 0F, 8.2F, 23, 11, 4, 0F,1.35F, -0.1F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2.65F, -0.1F, 0F, 8.9F, 0F, 0F, 10F, 0F, 0F, 7.3F, 0F, 0F, 6.9F, 0F, 0F); // Box 208
		turretModel[4].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[5].addShapeBox(-7.4F, 0F, 12.2F, 15, 11, 3, 0F,1.35F, 0.5F, 0F, 2F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 10.9F, 0F, 0F, 11.3F, 0F, 0F, 6.7F, 0F, 2F, 7.3F, 0F, 2F); // Box 209
		turretModel[5].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[6].addShapeBox(-3.9F, 0F, 15.2F, 6, 11, 2, 0F,1F, 0.5F, 0F, 2F, 0.5F, 0F, -2.5F, 0.5F, -1.3F, -2.5F, 0.5F, -1.3F, 11.5F, 0F, -2F, 11.7F, 0F, -2F, 7.6F, 0F, 3F, 7.3F, 0F, 3F); // Box 210
		turretModel[6].setRotationPoint(1F, -33.5F, 0F);

		turretModel[7].addShapeBox(-3.9F, 0F, 17.2F, 2, 11, 1, 0F,-2.5F, 0.5F, 1.3F, 1.5F, 0.5F, 1.3F, 1.5F, 0.5F, -2.3F, -2.5F, 0.5F, -2.3F, 7.3F, 0F, -3F, 11.6F, 0F, -3F, 6.6F, 0F, 4F, 2.3F, 0F, 4F); // Box 211
		turretModel[7].setRotationPoint(1F, -33.5F, 0F);

		turretModel[8].addShapeBox(-13.4F, 0F, -7.8F, 27, 11, 4, 0F,-0.65F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 6.9F, 0F, 0F, 8F, 0F, 0F, 8.5F, 0F, 0F, 8.1F, 0F, 0F); // Box 212
		turretModel[8].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[9].addShapeBox(-11.4F, 0F, -11.8F, 23, 11, 4, 0F,-2.65F, 0.5F, 0F, -2F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.35F, 0.5F, 0F, 6.9F, 0F, 0F, 7.3F, 0F, 0F, 10F, 0F, 0F, 8.9F, 0F, 0F); // Box 213
		turretModel[9].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[10].addShapeBox(-7.4F, 0F, -14.8F, 15, 11, 3, 0F,-3F, 0.5F, 0F, -3F, 0.5F, 0F, 2F, 0.5F, 0F, 1.35F, 0.5F, 0F, 7.3F, 0F, 2F, 6.7F, 0F, 2F, 11.3F, 0F, 0F, 10.9F, 0F, 0F); // Box 214
		turretModel[10].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[11].addShapeBox(-3.4F, 0F, -16.8F, 6, 11, 2, 0F,-2.5F, 0.5F, -1.3F, -2.5F, 0.5F, -1.3F, 2F, 0.5F, 0F, 1F, 0.5F, 0F, 7.3F, 0F, 3F, 7.6F, 0F, 3F, 11.7F, 0F, -2F, 11.5F, 0F, -2F); // Box 215
		turretModel[11].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[12].addShapeBox(-3.4F, 0F, -17.8F, 2, 11, 1, 0F,-2.5F, 0.5F, -2.3F, 1.5F, 0.5F, -2.3F, 1.5F, 0.5F, 1.3F, -2.5F, 0.5F, 1.3F, 2.3F, 0F, 4F, 6.6F, 0F, 4F, 11.6F, 0F, -3F, 7.3F, 0F, -3F); // Box 216
		turretModel[12].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[13].addShapeBox(19F, 0F, -6.5F, 3, 10, 15, 0F,6F, 0F, 0.5F, -3F, -1F, -0.5F, -3F, -1F, -0.5F, 6F, 0F, 0.5F, 0F, 2F, 0.5F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, -0.5F, 0F, 2F, 0.5F); // Box 217
		turretModel[13].setRotationPoint(0.5F, -33F, 0F);

		turretModel[14].addShapeBox(17F, 0.5F, -10F, 4, 5, 3, 0F,6F, 0F, -0.5F, -2.5F, -1F, -0.5F, -2.5F, -1F, -0.5F, 6F, 0F, -0.5F, 0F, -1F, -0.5F, -1.5F, -1.5F, -0.5F, -1.5F, -1.5F, -0.5F, 0F, -1F, -0.5F); // Box 226
		turretModel[14].setRotationPoint(0.5F, -31F, 0F);

		turretModel[15].addShapeBox(20.5F, 2.5F, 4.8F, 3, 5, 3, 0F,6F, 0F, -0.5F, -2.3F, -1F, -0.5F, -2.3F, -1F, -0.5F, 6F, 0F, -0.5F, 0F, 0F, -0.5F, -1.8F, -1.3F, -0.5F, -1.8F, -1.3F, -0.5F, 0F, 0F, -0.5F); // Box 227
		turretModel[15].setRotationPoint(0.5F, -34F, 0F);

		turretModel[16].addShapeBox(20.7F, 2.3F, 5.3F, 3, 2, 2, 0F,6F, 0F, -0.5F, -2.3F, 0F, -0.5F, -2.3F, 0F, -0.5F, 6F, 0F, -0.5F, 0F, 0F, -0.5F, -1.9F, 0F, -0.5F, -1.9F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 237
		turretModel[16].setRotationPoint(0.5F, -32.5F, 0F);

		turretModel[17].addShapeBox(-2.3F, 0F, -16.7F, 5, 1, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 238
		turretModel[17].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[18].addShapeBox(-4.3F, -2.7F, -9.7F, 9, 2, 3, 0F,5.5F, 0F, -0.5F, -2.8F, 0F, -0.5F, -2.3F, 0F, -0.5F, 6F, 0F, -0.5F, 6.3F, 0F, -0.5F, -2.3F, 0F, -0.5F, -1.6F, 0F, -0.5F, 6.6F, 0F, -0.5F); // Box 239
		turretModel[18].setRotationPoint(0.5F, -32.5F, 0F);

		turretModel[19].addShapeBox(-3.8F, -2.7F, -11.7F, 8, 2, 3, 0F,4.5F, 0F, -0.5F, -3.8F, 0F, -0.5F, -2.3F, 0F, -0.5F, 6F, 0F, -0.5F, 5.3F, -0.5F, -0.5F, -3.3F, -0.5F, -0.5F, -1.9F, -0.5F, -0.5F, 6.6F, -0.5F, -0.5F); // Box 240
		turretModel[19].setRotationPoint(0.5F, -32.5F, 0F);

		turretModel[20].addShapeBox(-2.3F, -2.7F, -12.7F, 5, 2, 2, 0F,4.5F, 0F, -0.5F, -3.8F, 0F, -0.5F, -2.3F, 0F, -0.5F, 6F, 0F, -0.5F, 5.3F, -0.5F, -0.5F, -3.3F, -0.5F, -0.5F, -1.8F, -0.5F, -0.5F, 6.8F, -0.5F, -0.5F); // Box 241
		turretModel[20].setRotationPoint(0.5F, -32.5F, 0F);

		turretModel[21].addShapeBox(-0.8F, -2.7F, -13.7F, 2, 2, 2, 0F,4.3F, 0F, -0.7F, -4F, 0F, -0.7F, -2.3F, 0F, -0.5F, 6F, 0F, -0.5F, 4.8F, -0.5F, -0.5F, -3.6F, -0.5F, -0.5F, -1.8F, -0.5F, -0.5F, 6.8F, -0.5F, -0.5F); // Box 242
		turretModel[21].setRotationPoint(0.5F, -32.5F, 0F);

		turretModel[22].addShapeBox(-0.8F, -2.7F, 11.3F, 2, 2, 2, 0F,6F, 0F, -0.5F, -2.3F, 0F, -0.5F, -4F, 0F, -0.7F, 4.3F, 0F, -0.7F, 6.8F, -0.5F, -0.5F, -1.8F, -0.5F, -0.5F, -3.6F, -0.5F, -0.5F, 4.8F, -0.5F, -0.5F); // Box 243
		turretModel[22].setRotationPoint(0.5F, -32.5F, 0F);

		turretModel[23].addShapeBox(-2.3F, -2.7F, 10.3F, 5, 2, 2, 0F,6F, 0F, -0.5F, -2.3F, 0F, -0.5F, -3.8F, 0F, -0.5F, 4.5F, 0F, -0.5F, 6.8F, -0.5F, -0.5F, -1.8F, -0.5F, -0.5F, -3.3F, -0.5F, -0.5F, 5.3F, -0.5F, -0.5F); // Box 244
		turretModel[23].setRotationPoint(0.5F, -32.5F, 0F);

		turretModel[24].addShapeBox(-3.8F, -2.7F, 8.3F, 8, 2, 3, 0F,6F, 0F, -0.5F, -2.3F, 0F, -0.5F, -3.8F, 0F, -0.5F, 4.5F, 0F, -0.5F, 6.6F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, -3.3F, -0.5F, -0.5F, 5.3F, -0.5F, -0.5F); // Box 245
		turretModel[24].setRotationPoint(0.5F, -32.5F, 0F);

		turretModel[25].addShapeBox(-4.3F, -2.7F, 6.3F, 9, 2, 3, 0F,6F, 0F, -0.5F, -2.3F, 0F, -0.5F, -2.8F, 0F, -0.5F, 5.5F, 0F, -0.5F, 6.6F, 0F, -0.5F, -1.6F, 0F, -0.5F, -2.3F, 0F, -0.5F, 6.3F, 0F, -0.5F); // Box 246
		turretModel[25].setRotationPoint(0.5F, -32.5F, 0F);

		turretModel[26].addShapeBox(-6.8F, 0F, 9.15F, 6, 2, 1, 0F,0.6F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.5F, 0F, 0.3F, -1F, 0F, 0.3F, 0.7F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.5F, 0F, 0.3F, -0.7F, 0F, 0.3F); // Box 276
		turretModel[26].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[27].addShapeBox(-5.2F, 0F, 10.35F, 3, 2, 1, 0F,0.6F, 0F, -0.1F, 0.9F, 0F, -0.1F, -1F, 0F, -0.45F, -1.25F, 0F, -0.45F, 0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.8F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 277
		turretModel[27].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[28].addShapeBox(-8.4F, 0F, 7.25F, 9, 2, 1, 0F,0F, 0F, -0.1F, 0.4F, 0F, -0.1F, -0.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F, -0.5F, 0F, 1F, -0.9F, 0F, 1F); // Box 278
		turretModel[28].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[29].addShapeBox(-8.7F, 0F, 5.8F, 10, 2, 1, 0F,-0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F); // Box 279
		turretModel[29].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[30].addShapeBox(-8.4F, 0F, 4.35F, 9, 2, 1, 0F,-1F, 0F, 1F, -0.5F, 0F, 1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, 1F, -0.5F, 0F, 1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 280
		turretModel[30].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[31].addShapeBox(-6.8F, 0F, 2.45F, 6, 2, 1, 0F,-1F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.9F, 0F, -0.1F, 0.6F, 0F, -0.1F, -0.7F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.9F, 0F, -0.1F, 0.7F, 0F, -0.1F); // Box 281
		turretModel[31].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[32].addShapeBox(-5.2F, 0F, 1.25F, 3, 2, 1, 0F,-1.25F, 0F, -0.45F, -1F, 0F, -0.45F, 0.9F, 0F, -0.1F, 0.6F, 0F, -0.1F, -1F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F); // Box 282
		turretModel[32].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[33].addShapeBox(-5.2F, 0F, -11.75F, 3, 2, 1, 0F,-1.25F, 0F, -0.45F, -1F, 0F, -0.45F, 0.9F, 0F, -0.1F, 0.6F, 0F, -0.1F, -1F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F); // Box 283
		turretModel[33].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[34].addShapeBox(-6.8F, 0F, -10.55F, 6, 2, 1, 0F,-1F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.9F, 0F, -0.1F, 0.6F, 0F, -0.1F, -0.7F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.9F, 0F, -0.1F, 0.7F, 0F, -0.1F); // Box 284
		turretModel[34].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[35].addShapeBox(-8.4F, 0F, -8.65F, 9, 2, 1, 0F,-1F, 0F, 1F, -0.5F, 0F, 1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, 1F, -0.5F, 0F, 1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 285
		turretModel[35].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[36].addShapeBox(-8.7F, 0F, -7.2F, 10, 2, 1, 0F,-0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F, -0.3F, 0F, 0.55F); // Box 286
		turretModel[36].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[37].addShapeBox(-8.4F, 0F, -5.75F, 9, 2, 1, 0F,0F, 0F, -0.1F, 0.4F, 0F, -0.1F, -0.5F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F, -0.5F, 0F, 1F, -0.9F, 0F, 1F); // Box 287
		turretModel[37].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[38].addShapeBox(-6.8F, 0F, -3.85F, 6, 2, 1, 0F,0.6F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.5F, 0F, 0.3F, -1F, 0F, 0.3F, 0.7F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.5F, 0F, 0.3F, -0.7F, 0F, 0.3F); // Box 288
		turretModel[38].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[39].addShapeBox(-5.2F, 0F, -2.65F, 3, 2, 1, 0F,0.6F, 0F, -0.1F, 0.9F, 0F, -0.1F, -1F, 0F, -0.45F, -1.25F, 0F, -0.45F, 0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.8F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 289
		turretModel[39].setRotationPoint(0.5F, -35.9F, 0F);

		turretModel[40].addShapeBox(-2F, 0F, 5F, 3, 2, 3, 0F,-1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 290
		turretModel[40].setRotationPoint(0.5F, -37.3F, 0F);

		turretModel[41].addShapeBox(4.3F, 0F, 6F, 3, 2, 3, 0F,-1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 292
		turretModel[41].setRotationPoint(0.5F, -37.3F, 0F);
		turretModel[41].rotateAngleY = 1.01229097F;

		turretModel[42].addShapeBox(2.5F, -2.7F, -7.5F, 1, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 293
		turretModel[42].setRotationPoint(0.5F, -32.2F, 0F);

		turretModel[43].addShapeBox(2.5F, -2.7F, 2.5F, 1, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 294
		turretModel[43].setRotationPoint(0.5F, -32.2F, 0F);

		turretModel[44].addShapeBox(-6.2F, 0F, -1.9F, 3, 2, 3, 0F,-1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 295
		turretModel[44].setRotationPoint(0.5F, -37.3F, 0F);
		turretModel[44].rotateAngleX = 0.01745329F;
		turretModel[44].rotateAngleY = -1.01229097F;

		turretModel[45].addShapeBox(6.5F, -2.2F, 1.5F, 2, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 296
		turretModel[45].setRotationPoint(0.5F, -32.2F, 0F);

		turretModel[46].addShapeBox(-4.3F, -2.7F, -7.7F, 9, 2, 15, 0F,6F, 0F, -0.5F, -2.3F, 0F, -0.5F, -2.3F, 0F, -0.5F, 6F, 0F, -0.5F, 6.6F, 0F, -0.5F, -1.6F, 0F, -0.5F, -1.6F, 0F, -0.5F, 6.6F, 0F, -0.5F); // Box 304
		turretModel[46].setRotationPoint(0.5F, -32.5F, 0F);

		turretModel[47].addShapeBox(-12.3F, 0F, -15.4F, 5, 1, 1, 0F,0.5F, -0.2F, -5.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 4.3F, 0.5F, -0.2F, -5.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 4.3F); // Box 305
		turretModel[47].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[48].addShapeBox(-7.3F, 0F, -16.7F, 5, 1, 1, 0F,0F, -0.2F, -1.6F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 1F, 0F, -0.2F, -1.6F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 1F); // Box 306
		turretModel[48].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[49].addShapeBox(-16.8F, 0F, -10.4F, 4, 1, 1, 0F,0F, -0.2F, -9.3F, 0F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0F, -0.2F, 8.8F, 0.1F, -0.2F, -9.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 8.8F); // Box 307
		turretModel[49].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[50].addShapeBox(-16.8F, 0F, 10F, 4, 1, 1, 0F,0F, -0.2F, 8.8F, 0.1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -9.3F, 0F, -0.2F, 8.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.1F, -0.2F, -9.3F); // Box 308
		turretModel[50].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[51].addShapeBox(-12.79F, 0F, 10F, 5, 1, 1, 0F,0F, -0.2F, -0.3F, 0.5F, -0.2F, -5.3F, 0F, -0.2F, 4.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.5F, -0.2F, -5.3F, 0F, -0.2F, 4.3F, 0F, -0.2F, -0.3F); // Box 309
		turretModel[51].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[52].addShapeBox(-7.8F, 0F, 14.6F, 5, 1, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -1.8F, 0F, -0.2F, 1.2F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -1.8F, 0F, -0.2F, 1.2F, 0F, -0.2F, -0.3F); // Box 310
		turretModel[52].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[53].addShapeBox(-2.8F, 0F, 16.1F, 5, 1, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 311
		turretModel[53].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[54].addShapeBox(-17.2F, 0F, -1.1F, 1, 1, 3, 0F,-0.35F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F); // Box 312
		turretModel[54].setRotationPoint(0.5F, -33.5F, 0F);

		turretModel[55].addShapeBox(1.4F, 0F, 16.1F, 1, 3, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Box 313
		turretModel[55].setRotationPoint(0.5F, -33F, 0F);

		turretModel[56].addShapeBox(1.9F, 0F, -16.7F, 1, 3, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F); // Box 314
		turretModel[56].setRotationPoint(0.5F, -33F, 0F);

		turretModel[57].addShapeBox(-17.2F, 0F, -0.1F, 1, 3, 1, 0F,-0.35F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F); // Box 315
		turretModel[57].setRotationPoint(0.5F, -33.5F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 229
		barrelModel[1] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 232
		barrelModel[2] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 233
		barrelModel[3] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 234
		barrelModel[4] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 235
		barrelModel[5] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 236
		barrelModel[6] = new ModelRendererTurbo(this, 369, 289, textureX, textureY); // Box 297
		barrelModel[7] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 298
		barrelModel[8] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 299
		barrelModel[9] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 300
		barrelModel[10] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 301
		barrelModel[11] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 302
		barrelModel[12] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 303
		barrelModel[13] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Box 304
		barrelModel[14] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 305
		barrelModel[15] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Box 307
		barrelModel[16] = new ModelRendererTurbo(this, 297, 305, textureX, textureY); // Box 308
		barrelModel[17] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 309
		barrelModel[18] = new ModelRendererTurbo(this, 465, 321, textureX, textureY); // Box 310
		barrelModel[19] = new ModelRendererTurbo(this, 57, 329, textureX, textureY); // Box 314
		barrelModel[20] = new ModelRendererTurbo(this, 97, 329, textureX, textureY); // Box 315
		barrelModel[21] = new ModelRendererTurbo(this, 137, 329, textureX, textureY); // Box 316
		barrelModel[22] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 286
		barrelModel[23] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 287
		barrelModel[24] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 288
		barrelModel[25] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 289
		barrelModel[26] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 291
		barrelModel[27] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Box 293
		barrelModel[28] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 295
		barrelModel[29] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 298
		barrelModel[30] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 299
		barrelModel[31] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 300
		barrelModel[32] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 301
		barrelModel[33] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 302
		barrelModel[34] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 303
		barrelModel[35] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 304
		barrelModel[36] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 305
		barrelModel[37] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 306
		barrelModel[38] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 307
		barrelModel[39] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 309
		barrelModel[40] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 310

		barrelModel[0].addShapeBox(1F, 0F, -0.5F, 5, 1, 1, 0F,0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F); // Box 229
		barrelModel[0].setRotationPoint(18.5F, -28.6F, -8.5F);

		barrelModel[1].addShapeBox(0F, -0.3F, -0.5F, 6, 1, 1, 0F,0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F); // Box 232
		barrelModel[1].setRotationPoint(18.5F, -28.6F, -8.5F);

		barrelModel[2].addShapeBox(0F, 0.3F, -0.5F, 6, 1, 1, 0F,0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F); // Box 233
		barrelModel[2].setRotationPoint(18.5F, -28.6F, -8.5F);

		barrelModel[3].addShapeBox(6F, -0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.45F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.35F, -0.15F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.15F); // Box 234
		barrelModel[3].setRotationPoint(18.5F, -28.6F, -8.5F);

		barrelModel[4].addShapeBox(6F, 0F, -0.5F, 2, 1, 1, 0F,0F, -0.35F, -0.15F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.15F); // Box 235
		barrelModel[4].setRotationPoint(18.5F, -28.6F, -8.5F);

		barrelModel[5].addShapeBox(6F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.35F, -0.15F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.15F, 0F, -0.45F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.45F, -0.4F); // Box 236
		barrelModel[5].setRotationPoint(18.5F, -28.6F, -8.5F);

		barrelModel[6].addShapeBox(-1F, -4.2F, -3.5F, 3, 8, 7, 0F,1F, -1F, 1.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, 1F, -1F, 1.5F, -1F, 0F, 1.5F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, -0.5F, -1F, 0F, 1.5F); // Box 297
		barrelModel[6].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[7].addShapeBox(5F, -1.2F, -2F, 10, 2, 4, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 298
		barrelModel[7].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[8].addShapeBox(5F, -2.1F, -2F, 10, 1, 4, 0F,0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		barrelModel[8].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[9].addShapeBox(5F, 0.7F, -2F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F); // Box 300
		barrelModel[9].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[10].addShapeBox(1F, -2.1F, -2F, 4, 1, 4, 0F,0F, 1.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 1.1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 301
		barrelModel[10].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[11].addShapeBox(1F, -1.2F, -2F, 4, 2, 4, 0F,0F, -0.1F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F); // Box 302
		barrelModel[11].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[12].addShapeBox(1F, 0.7F, -2F, 4, 1, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 1F, -2F); // Box 303
		barrelModel[12].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[13].addShapeBox(13F, -1.85F, -2F, 13, 1, 4, 0F,0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 304
		barrelModel[13].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[14].addShapeBox(13F, -1.2F, -2F, 13, 2, 4, 0F,0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F); // Box 305
		barrelModel[14].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[15].addShapeBox(13F, 0.45F, -2F, 13, 1, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F); // Box 307
		barrelModel[15].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[16].addShapeBox(25F, -2.05F, -2F, 11, 1, 4, 0F,0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 308
		barrelModel[16].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[17].addShapeBox(25F, -1.2F, -2F, 11, 2, 4, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 309
		barrelModel[17].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[18].addShapeBox(25F, 0.65F, -2F, 11, 1, 4, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		barrelModel[18].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[19].addShapeBox(33F, -1.85F, -2F, 13, 1, 4, 0F,0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 314
		barrelModel[19].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[20].addShapeBox(33F, -1.2F, -2F, 13, 2, 4, 0F,0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F); // Box 315
		barrelModel[20].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[21].addShapeBox(33F, 0.45F, -2F, 13, 1, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F); // Box 316
		barrelModel[21].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[22].addShapeBox(44F, -2.05F, -2F, 2, 1, 4, 0F,0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 286
		barrelModel[22].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[23].addShapeBox(44F, -1.2F, -2F, 2, 2, 4, 0F,0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F); // Box 287
		barrelModel[23].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[24].addShapeBox(44F, 0.65F, -2F, 2, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 288
		barrelModel[24].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[25].addShapeBox(46F, -2.1F, -2F, 2, 1, 4, 0F,0F, -0.15F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.15F, -1F, 0F, -0.3F, -0.3F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.25F, 0F, -0.3F, -0.3F); // Box 289
		barrelModel[25].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[26].addShapeBox(48F, -2.45F, -2F, 5, 1, 4, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F); // Box 291
		barrelModel[26].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[27].addShapeBox(48F, 1.1F, -2F, 5, 1, 4, 0F,0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 293
		barrelModel[27].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[28].addShapeBox(48.5F, -2F, 1F, 2, 3, 1, 0F,0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0.7F, 0F, -0.35F, 0.25F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.25F); // Box 295
		barrelModel[28].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[29].addShapeBox(53F, -2.1F, -1.7F, 1, 1, 1, 0F,0F, 0.2F, 0.3F, 0F, -0.35F, 0.25F, 0.5F, -0.35F, 0F, 0F, 0.2F, 0F, 0F, -0.55F, 0.55F, 0F, -0.55F, 0.25F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F); // Box 298
		barrelModel[29].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[30].addShapeBox(53F, 0.75F, -1.7F, 1, 1, 1, 0F,0F, -0.55F, 0.55F, 0F, -0.55F, 0.25F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0F, 0.2F, 0.3F, 0F, -0.35F, 0.25F, 0.5F, -0.35F, 0F, 0F, 0.2F, 0F); // Box 299
		barrelModel[30].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[31].addShapeBox(53F, -2.1F, 0.7F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0.25F, 0F, 0.2F, 0.3F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.55F); // Box 300
		barrelModel[31].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[32].addShapeBox(53F, 0.75F, 0.7F, 1, 1, 1, 0F,0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.55F, 0F, 0.2F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0.25F, 0F, 0.2F, 0.3F); // Box 301
		barrelModel[32].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[33].addShapeBox(53F, -1.65F, 0.7F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.55F, 0.5F, 0.95F, 0F, 0.5F, 0.95F, 0F, 0F, 0.95F, 0.25F, 0F, 0.95F, 0.55F); // Box 302
		barrelModel[33].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[34].addShapeBox(53F, -1.65F, -1.7F, 1, 2, 1, 0F,0F, 0F, 0.55F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.95F, 0.55F, 0F, 0.95F, 0.25F, 0.5F, 0.95F, 0F, 0.5F, 0.95F, 0F); // Box 303
		barrelModel[34].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[35].addShapeBox(53F, -2.1F, -0.3F, 1, 1, 1, 0F,0F, 0.2F, 0.4F, 0.5F, -0.35F, 0.4F, 0.5F, -0.35F, 0F, 0F, 0.2F, 0F, 0F, -0.55F, 0.4F, 0.5F, -0.55F, 0.4F, 0.5F, -0.55F, 0F, 0F, -0.55F, 0F); // Box 304
		barrelModel[35].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[36].addShapeBox(53F, 0.75F, -0.3F, 1, 1, 1, 0F,0F, -0.55F, 0.4F, 0.5F, -0.55F, 0.4F, 0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0.2F, 0.4F, 0.5F, -0.35F, 0.4F, 0.5F, -0.35F, 0F, 0F, 0.2F, 0F); // Box 305
		barrelModel[36].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[37].addShapeBox(53.9F, -1.75F, -0.3F, 1, 1, 1, 0F,-0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F); // Box 306
		barrelModel[37].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[38].addShapeBox(53.9F, 0.4F, -0.3F, 1, 1, 1, 0F,-0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F); // Box 307
		barrelModel[38].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[39].addShapeBox(46F, 0.75F, -2F, 2, 1, 4, 0F,0F, -0.3F, -0.3F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.25F, 0F, -0.3F, -0.3F, 0F, -0.15F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.15F, -1F); // Box 309
		barrelModel[39].setRotationPoint(21.5F, -27.5F, 0F);

		barrelModel[40].addShapeBox(48.5F, -2F, -2F, 2, 3, 1, 0F,0F, -0.35F, 0.25F, 0F, -0.35F, 0.7F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0.7F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F); // Box 310
		barrelModel[40].setRotationPoint(21.5F, -27.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 14
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 15
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 200
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 201
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 202
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 203
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 204
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 205
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 206
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 207
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 208
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 215
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 216
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 217
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 218
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 219
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 220
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 221
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Box 222
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 223
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 224
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 225
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 226

		leftTrackWheelModels[0].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[0].setRotationPoint(-21F, 2F, 29.2F);

		leftTrackWheelModels[1].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftTrackWheelModels[1].setRotationPoint(-21F, 2F, 29.2F);

		leftTrackWheelModels[2].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[2].setRotationPoint(-21F, 2F, 29.2F);

		leftTrackWheelModels[3].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		leftTrackWheelModels[3].setRotationPoint(-5F, 2F, 29.2F);

		leftTrackWheelModels[4].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftTrackWheelModels[4].setRotationPoint(-5F, 2F, 29.2F);

		leftTrackWheelModels[5].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 202
		leftTrackWheelModels[5].setRotationPoint(-5F, 2F, 29.2F);

		leftTrackWheelModels[6].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		leftTrackWheelModels[6].setRotationPoint(12F, 2F, 29.2F);

		leftTrackWheelModels[7].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftTrackWheelModels[7].setRotationPoint(12F, 2F, 29.2F);

		leftTrackWheelModels[8].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 205
		leftTrackWheelModels[8].setRotationPoint(12F, 2F, 29.2F);

		leftTrackWheelModels[9].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftTrackWheelModels[9].setRotationPoint(28F, 2F, 29.2F);

		leftTrackWheelModels[10].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftTrackWheelModels[10].setRotationPoint(28F, 2F, 29.2F);

		leftTrackWheelModels[11].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 208
		leftTrackWheelModels[11].setRotationPoint(28F, 2F, 29.2F);

		leftTrackWheelModels[12].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 215
		leftTrackWheelModels[12].setRotationPoint(-38F, 2F, 29.2F);

		leftTrackWheelModels[13].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		leftTrackWheelModels[13].setRotationPoint(-38F, 2F, 29.2F);

		leftTrackWheelModels[14].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		leftTrackWheelModels[14].setRotationPoint(-38F, 2F, 29.2F);

		leftTrackWheelModels[15].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		leftTrackWheelModels[15].setRotationPoint(-54F, 2F, 29.2F);

		leftTrackWheelModels[16].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 219
		leftTrackWheelModels[16].setRotationPoint(-54F, 2F, 29.2F);

		leftTrackWheelModels[17].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		leftTrackWheelModels[17].setRotationPoint(-54F, 2F, 29.2F);

		leftTrackWheelModels[18].addShapeBox(-6F, -1.5F, -3F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		leftTrackWheelModels[18].setRotationPoint(-69F, -2F, 29.2F);

		leftTrackWheelModels[19].addShapeBox(-6F, 1.5F, -3F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 222
		leftTrackWheelModels[19].setRotationPoint(-69F, -2F, 29.2F);

		leftTrackWheelModels[20].addShapeBox(-6F, -5.5F, -3F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		leftTrackWheelModels[20].setRotationPoint(-69F, -2F, 29.2F);

		leftTrackWheelModels[21].addShapeBox(-5F, -4.5F, -3F, 10, 3, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		leftTrackWheelModels[21].setRotationPoint(44F, -2.5F, 29.2F);

		leftTrackWheelModels[22].addShapeBox(-5F, -1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		leftTrackWheelModels[22].setRotationPoint(44F, -2.5F, 29.2F);

		leftTrackWheelModels[23].addShapeBox(-5F, 1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 226
		leftTrackWheelModels[23].setRotationPoint(44F, -2.5F, 29.2F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 227
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Box 228
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Box 229
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 230
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 231
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 232
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Box 233
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 234
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 235
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 236
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 237
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 238
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 239
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 377, 273, textureX, textureY); // Box 240
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Box 241
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 242
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 243
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 244
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 473, 273, textureX, textureY); // Box 245
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 145, 281, textureX, textureY); // Box 246
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 185, 281, textureX, textureY); // Box 247
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 248
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 249
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 313, 289, textureX, textureY); // Box 250

		rightTrackWheelModels[0].addShapeBox(-6F, -1.5F, -3F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightTrackWheelModels[0].setRotationPoint(-69F, -2F, -26.8F);

		rightTrackWheelModels[1].addShapeBox(-6F, -5.5F, -3F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightTrackWheelModels[1].setRotationPoint(-69F, -2F, -26.8F);

		rightTrackWheelModels[2].addShapeBox(-6F, 1.5F, -3F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 229
		rightTrackWheelModels[2].setRotationPoint(-69F, -2F, -26.8F);

		rightTrackWheelModels[3].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 230
		rightTrackWheelModels[3].setRotationPoint(-54F, 2F, -26.8F);

		rightTrackWheelModels[4].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		rightTrackWheelModels[4].setRotationPoint(-54F, 2F, -26.8F);

		rightTrackWheelModels[5].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		rightTrackWheelModels[5].setRotationPoint(-54F, 2F, -26.8F);

		rightTrackWheelModels[6].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 233
		rightTrackWheelModels[6].setRotationPoint(-38F, 2F, -26.8F);

		rightTrackWheelModels[7].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		rightTrackWheelModels[7].setRotationPoint(-38F, 2F, -26.8F);

		rightTrackWheelModels[8].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		rightTrackWheelModels[8].setRotationPoint(-38F, 2F, -26.8F);

		rightTrackWheelModels[9].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 236
		rightTrackWheelModels[9].setRotationPoint(-21F, 2F, -26.8F);

		rightTrackWheelModels[10].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		rightTrackWheelModels[10].setRotationPoint(-21F, 2F, -26.8F);

		rightTrackWheelModels[11].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		rightTrackWheelModels[11].setRotationPoint(-21F, 2F, -26.8F);

		rightTrackWheelModels[12].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 239
		rightTrackWheelModels[12].setRotationPoint(-5F, 2F, -26.8F);

		rightTrackWheelModels[13].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		rightTrackWheelModels[13].setRotationPoint(-5F, 2F, -26.8F);

		rightTrackWheelModels[14].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		rightTrackWheelModels[14].setRotationPoint(-5F, 2F, -26.8F);

		rightTrackWheelModels[15].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 242
		rightTrackWheelModels[15].setRotationPoint(12F, 2F, -26.8F);

		rightTrackWheelModels[16].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		rightTrackWheelModels[16].setRotationPoint(12F, 2F, -26.8F);

		rightTrackWheelModels[17].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		rightTrackWheelModels[17].setRotationPoint(12F, 2F, -26.8F);

		rightTrackWheelModels[18].addShapeBox(-5F, -4.5F, -3F, 10, 3, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		rightTrackWheelModels[18].setRotationPoint(44F, -2.5F, -26.8F);

		rightTrackWheelModels[19].addShapeBox(-5F, -1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		rightTrackWheelModels[19].setRotationPoint(44F, -2.5F, -26.8F);

		rightTrackWheelModels[20].addShapeBox(-5F, 1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 247
		rightTrackWheelModels[20].setRotationPoint(44F, -2.5F, -26.8F);

		rightTrackWheelModels[21].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightTrackWheelModels[21].setRotationPoint(28F, 2F, -26.8F);

		rightTrackWheelModels[22].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightTrackWheelModels[22].setRotationPoint(28F, 2F, -26.8F);

		rightTrackWheelModels[23].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 250
		rightTrackWheelModels[23].setRotationPoint(28F, 2F, -26.8F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 165
		leftTrackModel[1] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 166
		leftTrackModel[2] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 167
		leftTrackModel[3] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 168
		leftTrackModel[4] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 169
		leftTrackModel[5] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 170
		leftTrackModel[6] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 171
		leftTrackModel[7] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 172
		leftTrackModel[8] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 173
		leftTrackModel[9] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 174
		leftTrackModel[10] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 175
		leftTrackModel[11] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 176
		leftTrackModel[12] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 177
		leftTrackModel[13] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 178
		leftTrackModel[14] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 179
		leftTrackModel[15] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 180
		leftTrackModel[16] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 181
		leftTrackModel[17] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 182
		leftTrackModel[18] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 183
		leftTrackModel[19] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 184
		leftTrackModel[20] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 185
		leftTrackModel[21] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 186
		leftTrackModel[22] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 187

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0F, -1.05F, 0.8F, 0F, -1.05F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 165
		leftTrackModel[0].setRotationPoint(48.5F, -1.3F, 24.5F);
		leftTrackModel[0].rotateAngleZ = -0.54105207F;

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 166
		leftTrackModel[1].setRotationPoint(48.2F, -4F, 24.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0.6F, -2F, 0F, 0.6F, -2F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.2F, 0F, 0F); // Box 167
		leftTrackModel[2].setRotationPoint(47.5F, -7F, 24.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0F, -0.1F, 0F); // Box 168
		leftTrackModel[3].setRotationPoint(43.5F, -7.8F, 24.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.2F, 0F); // Box 169
		leftTrackModel[4].setRotationPoint(28.5F, -6.6F, 24.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, -0.8F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, -0.8F, 0F, 0F, 0.7F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0.7F, 0F); // Box 170
		leftTrackModel[5].setRotationPoint(28.5F, 8.45F, 24.5F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 171
		leftTrackModel[6].setRotationPoint(11.5F, 9.2F, 24.5F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 172
		leftTrackModel[7].setRotationPoint(-4.5F, 9.2F, 24.5F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 173
		leftTrackModel[8].setRotationPoint(-21.5F, 9.2F, 24.5F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 174
		leftTrackModel[9].setRotationPoint(-37.5F, 9.2F, 24.5F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 175
		leftTrackModel[10].setRotationPoint(-54.5F, 9.2F, 24.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, 6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -6F, 0F); // Box 176
		leftTrackModel[11].setRotationPoint(-72.5F, 8.45F, 24.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.95F, 0F, 0F); // Box 177
		leftTrackModel[12].setRotationPoint(-75F, 1F, 24.5F);
		leftTrackModel[12].rotateAngleZ = 0.54105207F;

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 178
		leftTrackModel[13].setRotationPoint(-75.5F, -2F, 24.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 179
		leftTrackModel[14].setRotationPoint(-75.5F, -5F, 24.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, 0F, 0.05F, 2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 2.8F, 0F); // Box 180
		leftTrackModel[15].setRotationPoint(-74.5F, -7.8F, 24.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 181
		leftTrackModel[16].setRotationPoint(-67.5F, -6.8F, 24.5F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 182
		leftTrackModel[17].setRotationPoint(-53.5F, -5.8F, 24.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		leftTrackModel[18].setRotationPoint(-71.5F, -7.8F, 24.5F);

		leftTrackModel[19].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 184
		leftTrackModel[19].setRotationPoint(-37.5F, -5.8F, 24.5F);

		leftTrackModel[20].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 185
		leftTrackModel[20].setRotationPoint(-21.5F, -5.8F, 24.5F);

		leftTrackModel[21].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 186
		leftTrackModel[21].setRotationPoint(-4.5F, -5.8F, 24.5F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 187
		leftTrackModel[22].setRotationPoint(12.5F, -5.8F, 24.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 140
		rightTrackModel[1] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 141
		rightTrackModel[2] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 142
		rightTrackModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 143
		rightTrackModel[4] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 144
		rightTrackModel[5] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 145
		rightTrackModel[6] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 146
		rightTrackModel[7] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 147
		rightTrackModel[8] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 148
		rightTrackModel[9] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 149
		rightTrackModel[10] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 150
		rightTrackModel[11] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 151
		rightTrackModel[12] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 152
		rightTrackModel[13] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 153
		rightTrackModel[14] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 154
		rightTrackModel[15] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 155
		rightTrackModel[16] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 157
		rightTrackModel[17] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 158
		rightTrackModel[18] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 159
		rightTrackModel[19] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 160
		rightTrackModel[20] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 161
		rightTrackModel[21] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 162
		rightTrackModel[22] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 163

		rightTrackModel[0].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 140
		rightTrackModel[0].setRotationPoint(-21.5F, -5.8F, -30.5F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 141
		rightTrackModel[1].setRotationPoint(-37.5F, -5.8F, -30.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 142
		rightTrackModel[2].setRotationPoint(-53.5F, -5.8F, -30.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 143
		rightTrackModel[3].setRotationPoint(-67.5F, -6.8F, -30.5F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 144
		rightTrackModel[4].setRotationPoint(-4.5F, -5.8F, -30.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.2F, 0F); // Box 145
		rightTrackModel[5].setRotationPoint(28.5F, -6.6F, -30.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 146
		rightTrackModel[6].setRotationPoint(12.5F, -5.8F, -30.5F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 147
		rightTrackModel[7].setRotationPoint(-37.5F, 9.2F, -30.5F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 148
		rightTrackModel[8].setRotationPoint(-21.5F, 9.2F, -30.5F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 149
		rightTrackModel[9].setRotationPoint(-4.5F, 9.2F, -30.5F);

		rightTrackModel[10].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 150
		rightTrackModel[10].setRotationPoint(-54.5F, 9.2F, -30.5F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 151
		rightTrackModel[11].setRotationPoint(11.5F, 9.2F, -30.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, 6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -6F, 0F); // Box 152
		rightTrackModel[12].setRotationPoint(-72.5F, 8.45F, -30.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, -0.8F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, -0.8F, 0F, 0F, 0.7F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0.7F, 0F); // Box 153
		rightTrackModel[13].setRotationPoint(28.5F, 8.45F, -30.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightTrackModel[14].setRotationPoint(-71.5F, -7.8F, -30.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, 0F, 0.05F, 2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 2.8F, 0F); // Box 155
		rightTrackModel[15].setRotationPoint(-74.5F, -7.8F, -30.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 157
		rightTrackModel[16].setRotationPoint(-75.5F, -5F, -30.5F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 158
		rightTrackModel[17].setRotationPoint(-75.5F, -2F, -30.5F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.95F, 0F, 0F); // Box 159
		rightTrackModel[18].setRotationPoint(-75F, 1F, -30.5F);
		rightTrackModel[18].rotateAngleZ = 0.54105207F;

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 160
		rightTrackModel[19].setRotationPoint(48.2F, -4F, -30.5F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0F, -1.05F, 0.8F, 0F, -1.05F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 161
		rightTrackModel[20].setRotationPoint(48.5F, -1.3F, -30.5F);
		rightTrackModel[20].rotateAngleZ = -0.54105207F;

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0.6F, -2F, 0F, 0.6F, -2F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.2F, 0F, 0F); // Box 162
		rightTrackModel[21].setRotationPoint(47.5F, -7F, -30.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0F, -0.1F, 0F); // Box 163
		rightTrackModel[22].setRotationPoint(43.5F, -7.8F, -30.5F);
	}
}