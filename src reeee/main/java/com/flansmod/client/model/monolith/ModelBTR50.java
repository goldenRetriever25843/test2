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

public class ModelBTR50 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBTR50() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[152];
		turretModel = new ModelRendererTurbo[8];
		barrelModel = new ModelRendererTurbo[237];
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
		bodyModel[3] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 54
		bodyModel[43] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 55
		bodyModel[44] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 56
		bodyModel[45] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 57
		bodyModel[46] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 58
		bodyModel[47] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 59
		bodyModel[48] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 60
		bodyModel[49] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 61
		bodyModel[50] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 62
		bodyModel[51] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 63
		bodyModel[52] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 64
		bodyModel[53] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 65
		bodyModel[54] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 66
		bodyModel[55] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 67
		bodyModel[56] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 68
		bodyModel[57] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 69
		bodyModel[58] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 71
		bodyModel[59] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 72
		bodyModel[60] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 73
		bodyModel[61] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 74
		bodyModel[62] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 75
		bodyModel[63] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 76
		bodyModel[64] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 77
		bodyModel[65] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 78
		bodyModel[66] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 79
		bodyModel[67] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 81
		bodyModel[68] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 82
		bodyModel[69] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 83
		bodyModel[70] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 84
		bodyModel[71] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 85
		bodyModel[72] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 86
		bodyModel[73] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 87
		bodyModel[74] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 88
		bodyModel[75] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 89
		bodyModel[76] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 90
		bodyModel[77] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 91
		bodyModel[78] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 92
		bodyModel[79] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 93
		bodyModel[80] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 94
		bodyModel[81] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 95
		bodyModel[82] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 96
		bodyModel[83] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 97
		bodyModel[84] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 98
		bodyModel[85] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 99
		bodyModel[86] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 100
		bodyModel[87] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 101
		bodyModel[88] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 103
		bodyModel[90] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 104
		bodyModel[91] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 105
		bodyModel[92] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 106
		bodyModel[93] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 107
		bodyModel[94] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 108
		bodyModel[95] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 109
		bodyModel[96] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 110
		bodyModel[97] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 111
		bodyModel[98] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 112
		bodyModel[99] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 113
		bodyModel[100] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 114
		bodyModel[101] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 115
		bodyModel[102] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 116
		bodyModel[103] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 117
		bodyModel[104] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 118
		bodyModel[105] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 119
		bodyModel[106] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 120
		bodyModel[107] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 121
		bodyModel[108] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 122
		bodyModel[109] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 123
		bodyModel[110] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 127
		bodyModel[111] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 129
		bodyModel[113] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 130
		bodyModel[114] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 131
		bodyModel[115] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 132
		bodyModel[116] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 133
		bodyModel[117] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 134
		bodyModel[118] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 135
		bodyModel[119] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 136
		bodyModel[120] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 137
		bodyModel[121] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 138
		bodyModel[122] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 25, 313, textureX, textureY); // Box 251
		bodyModel[124] = new ModelRendererTurbo(this, 345, 289, textureX, textureY); // Box 252
		bodyModel[125] = new ModelRendererTurbo(this, 41, 313, textureX, textureY); // Box 254
		bodyModel[126] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 255
		bodyModel[127] = new ModelRendererTurbo(this, 153, 313, textureX, textureY); // Box 256
		bodyModel[128] = new ModelRendererTurbo(this, 257, 313, textureX, textureY); // Box 257
		bodyModel[129] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 258
		bodyModel[130] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 259
		bodyModel[131] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 260
		bodyModel[132] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 261
		bodyModel[133] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 263
		bodyModel[134] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 264
		bodyModel[135] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 265
		bodyModel[136] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 266
		bodyModel[137] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 267
		bodyModel[138] = new ModelRendererTurbo(this, 385, 313, textureX, textureY); // Box 268
		bodyModel[139] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 269
		bodyModel[140] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 270
		bodyModel[141] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 271
		bodyModel[142] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 272
		bodyModel[143] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 273
		bodyModel[144] = new ModelRendererTurbo(this, 489, 249, textureX, textureY); // Box 295
		bodyModel[145] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 296
		bodyModel[146] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 297
		bodyModel[147] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 298
		bodyModel[148] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 299
		bodyModel[149] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Box 300
		bodyModel[150] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 301
		bodyModel[151] = new ModelRendererTurbo(this, 177, 329, textureX, textureY); // Box 249

		bodyModel[0].addShapeBox(0F, 0F, 0F, 31, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-89F, -22F, -5.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 23, 9, 59, 0F,0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F); // Box 1
		bodyModel[1].setRotationPoint(-112F, -23F, -44.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 18, 59, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-53F, -32.5F, -44.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 24, 18, 59, 0F,0F, -0.2F, 0F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, 0F, 0F, 1F, 0F, 0F, 1.5F, -2.5F, 0F, 1.5F, -2.5F, 0F, 1F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-34F, -32.5F, -44.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 11, 55, 0F,0F, -0.2F, -0.5F, -11F, -0.2F, -0.5F, -11F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 3F, -0.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 3F, -0.5F); // Box 4
		bodyModel[4].setRotationPoint(-10F, -32.5F, -42.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 5, 54, 0F,0F, 0F, 0F, 0F, 2.5F, -1.5F, 0F, 2.5F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-10F, -18.5F, -42F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 23, 5, 54, 0F,0F, 2.5F, -1.5F, 4F, -1.2F, -4.2F, 4F, -1.2F, -4.2F, 0F, 2.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, -1.5F); // Box 6
		bodyModel[6].setRotationPoint(1F, -18.5F, -42F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 19, 11, 54, 0F,0F, -1F, -3.5F, 4F, -1F, -4.1F, 4F, -1F, -4.1F, 0F, -1F, -3.5F, 0F, 0.5F, -3.5F, -5.5F, 0.5F, -4F, -5.5F, 0.5F, -4F, 0F, 0.5F, -3.5F); // Box 7
		bodyModel[7].setRotationPoint(1F, -14F, -42F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 90, 16, 54, 0F,0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0F, -3.5F); // Box 8
		bodyModel[8].setRotationPoint(-89F, -15F, -42F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 4, 54, 0F,0F, -0.5F, -3.5F, 3.5F, -0.5F, -4.1F, 3.5F, -0.5F, -4.1F, 0F, -0.5F, -3.5F, 0F, 0.5F, -3.5F, -5.5F, 0.5F, -4F, -5.5F, 0.5F, -4F, 0F, 0.5F, -3.5F); // Box 9
		bodyModel[9].setRotationPoint(1F, -3F, -42F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 15, 54, 0F,9F, -1F, -4F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 9F, -1F, -4F, 0F, -2.3F, -4F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, -2.3F, -4F); // Box 10
		bodyModel[10].setRotationPoint(-103F, -15F, -42F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 135, 1, 10, 0F,0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-111F, -14.45F, -48F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 135, 1, 10, 0F,0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-111F, -14.45F, 8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1.4F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, -1.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-112F, -14.8F, -48F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F); // Box 14
		bodyModel[14].setRotationPoint(-112F, -14.2F, -47.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F); // Box 15
		bodyModel[15].setRotationPoint(-112F, -14.2F, 8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1.4F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, -1.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-112F, -14.8F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F); // Box 17
		bodyModel[17].setRotationPoint(23.6F, -13.2F, -48F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 18
		bodyModel[18].setRotationPoint(23.6F, -13.2F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 39, 0F,0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F); // Box 19
		bodyModel[19].setRotationPoint(20.9F, -19.2F, -34.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,-2F, -0.7F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, -2F, 0.2F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F); // Box 20
		bodyModel[20].setRotationPoint(20.9F, -19.2F, -37.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -2F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -2F, 0.2F, 0F); // Box 21
		bodyModel[21].setRotationPoint(20.9F, -19.2F, 4.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 26, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 23
		bodyModel[22].setRotationPoint(-51F, -33F, -14.7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 26, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 24
		bodyModel[23].setRotationPoint(-51F, -33F, -29.7F);

		bodyModel[24].addBox(0F, 0F, 0F, 12, 1, 26, 0F); // Box 25
		bodyModel[24].setRotationPoint(-22.5F, -33F, -35F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 4.25F, 0F, 0.25F, 4.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 26
		bodyModel[25].setRotationPoint(-10.8F, -32.3F, -1.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 3.75F, 0F, 0.25F, 4.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 27
		bodyModel[26].setRotationPoint(-10.8F, -32.3F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0.25F, -0.8F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 3.75F, 0F, 0.25F, 4.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 28
		bodyModel[27].setRotationPoint(-10.3F, -32.3F, -4.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0.25F, -1.3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 3.8F, 0F, 0.25F, 4.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 30
		bodyModel[28].setRotationPoint(-11.1F, -32.3F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0.25F, -2.4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 3.8F, 0F, 0.25F, 5.05F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 31
		bodyModel[29].setRotationPoint(-12.4F, -32.3F, -7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 4.25F, 0F, 0.25F, 4.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 42
		bodyModel[30].setRotationPoint(-10.8F, -32.3F, 3.33066907387547E-16F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 4.25F, 0F, 0.25F, 3.75F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 43
		bodyModel[31].setRotationPoint(-10.8F, -32.3F, 1.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.8F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 4.25F, 0F, 0.25F, 3.75F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 44
		bodyModel[32].setRotationPoint(-10.3F, -32.3F, 3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 4.5F, 0F, 0.25F, 3.8F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 45
		bodyModel[33].setRotationPoint(-11.1F, -32.3F, 4.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, -2.4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 5.05F, 0F, 0.25F, 3.8F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 46
		bodyModel[34].setRotationPoint(-12.4F, -32.3F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 47
		bodyModel[35].setRotationPoint(-25F, -25F, -45.5F);
		bodyModel[35].rotateAngleY = 0.08726646F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 48
		bodyModel[36].setRotationPoint(-25.3F, -25F, -45F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 49
		bodyModel[37].setRotationPoint(-18.7F, -25F, -44.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 50
		bodyModel[38].setRotationPoint(-54.7F, -22.5F, 14F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 51
		bodyModel[39].setRotationPoint(-61.3F, -22.5F, 14F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 52
		bodyModel[40].setRotationPoint(-61F, -22.5F, 15.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 53
		bodyModel[41].setRotationPoint(-82.2F, -22.5F, 14F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 54
		bodyModel[42].setRotationPoint(-88.8F, -22.5F, 14F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 55
		bodyModel[43].setRotationPoint(-88.5F, -22.5F, 15.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 56
		bodyModel[44].setRotationPoint(-98F, -22.5F, -44F);
		bodyModel[44].rotateAngleY = 0.08726646F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 57
		bodyModel[45].setRotationPoint(-104.7F, -22.5F, -42F);
		bodyModel[45].rotateAngleY = 0.03490659F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 58
		bodyModel[46].setRotationPoint(-104.5F, -22.5F, -42.5F);
		bodyModel[46].rotateAngleX = 0.01745329F;
		bodyModel[46].rotateAngleY = -0.25830873F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 59
		bodyModel[47].setRotationPoint(-61F, -22.5F, -46.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 60
		bodyModel[48].setRotationPoint(-61.3F, -22.5F, -46F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 61
		bodyModel[49].setRotationPoint(-54.7F, -22.5F, -46F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 62
		bodyModel[50].setRotationPoint(-88.8F, -22.5F, -46F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 63
		bodyModel[51].setRotationPoint(-88.5F, -22.5F, -46.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 64
		bodyModel[52].setRotationPoint(-82.2F, -22.5F, -46F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 65
		bodyModel[53].setRotationPoint(-104.85F, -22.5F, 10F);
		bodyModel[53].rotateAngleY = 0.03490659F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 66
		bodyModel[54].setRotationPoint(-98.4F, -22.5F, 11.6F);
		bodyModel[54].rotateAngleY = 0.08726646F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 67
		bodyModel[55].setRotationPoint(-104.5F, -22.5F, 11.5F);
		bodyModel[55].rotateAngleX = 0.01745329F;
		bodyModel[55].rotateAngleY = 0.25830873F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 30, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 68
		bodyModel[56].setRotationPoint(-88F, -23.5F, -4.7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -3.4F, 0.35F, 0F, -3.4F, 0.35F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -1.1F, 0F, 0F, -1.1F); // Box 69
		bodyModel[57].setRotationPoint(-112.5F, -20F, -31.8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.6F, -0.05F, 0F, 0.6F, -0.05F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 71
		bodyModel[58].setRotationPoint(-112.5F, -16F, -27.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.45F, 0.7F, 0F, 0.45F, 0.7F, 0F, -0.4F, 1.8F, 0F, -0.4F, 1.8F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 72
		bodyModel[59].setRotationPoint(-112.5F, -20F, -33.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.9F, 0.85F, 0F, 0.9F, 0.85F, 0F, -1.7F, 1.2F, 0F, -1.7F, 1.2F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F); // Box 73
		bodyModel[60].setRotationPoint(-112.5F, -20F, -35.35F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.85F, 0.7F, 0F, 0.85F, 0.7F, 0F, -1.7F, 0.1F, 0F, -1.7F, 0.1F, 0F, -0.05F, -0.55F, 0F, -0.05F, -0.55F); // Box 74
		bodyModel[61].setRotationPoint(-112.5F, -19.6F, -37F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, 0.6F, -0.05F, 0F, 0.6F, -0.05F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 75
		bodyModel[62].setRotationPoint(-112.5F, -16F, -3.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -3.4F, 0.35F, 0F, -3.4F, 0.35F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 1.7F, 0F, 0F, 1.7F); // Box 76
		bodyModel[63].setRotationPoint(-112.5F, -20F, -2.15F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.45F, 0.7F, 0F, 0.45F, 0.7F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.4F, 1.8F, 0F, -0.4F, 1.8F); // Box 77
		bodyModel[64].setRotationPoint(-112.5F, -20F, 2.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.9F, 0.85F, 0F, 0.9F, 0.85F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -1.7F, 1.2F, 0F, -1.7F, 1.2F); // Box 78
		bodyModel[65].setRotationPoint(-112.5F, -20F, 4.35F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.05F, -0.55F, 0F, -0.05F, -0.55F, 0F, -1.7F, 0.1F, 0F, -1.7F, 0.1F); // Box 79
		bodyModel[66].setRotationPoint(-112.5F, -19.65F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 81
		bodyModel[67].setRotationPoint(-112.7F, -14.95F, -16F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 82
		bodyModel[68].setRotationPoint(-113.5F, -15.05F, -16F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 83
		bodyModel[69].setRotationPoint(-113.5F, -13.85F, -16F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F); // Box 84
		bodyModel[70].setRotationPoint(-114.5F, -15.05F, -16F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F); // Box 85
		bodyModel[71].setRotationPoint(-114.5F, -13.85F, -16F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 86
		bodyModel[72].setRotationPoint(-18.7F, -25F, 12.8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 87
		bodyModel[73].setRotationPoint(-25F, -25F, 14.3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 88
		bodyModel[74].setRotationPoint(-25.3F, -25F, 12.8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 89
		bodyModel[75].setRotationPoint(2.6F, -24.8F, 3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 90
		bodyModel[76].setRotationPoint(6.6F, -24.8F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 91
		bodyModel[77].setRotationPoint(6.6F, -24.8F, 4.3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 92
		bodyModel[78].setRotationPoint(2.6F, -24.8F, 4.3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 93
		bodyModel[79].setRotationPoint(6.6F, -24.8F, 5.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 94
		bodyModel[80].setRotationPoint(2.6F, -24.8F, 5.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 95
		bodyModel[81].setRotationPoint(6.6F, -24.8F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 96
		bodyModel[82].setRotationPoint(2.6F, -24.8F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 97
		bodyModel[83].setRotationPoint(6.6F, -24.8F, 8.4F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 98
		bodyModel[84].setRotationPoint(2.6F, -24.8F, 8.4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F); // Box 99
		bodyModel[85].setRotationPoint(2.6F, -25.25F, 3.2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 100
		bodyModel[86].setRotationPoint(3.1F, -25.25F, 5.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 101
		bodyModel[87].setRotationPoint(3.1F, -25.25F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 102
		bodyModel[88].setRotationPoint(3.1F, -25.25F, 8.4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 103
		bodyModel[89].setRotationPoint(3.1F, -24F, 8.4F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 104
		bodyModel[90].setRotationPoint(3.1F, -22.25F, 8.4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 105
		bodyModel[91].setRotationPoint(3.1F, -25.25F, 3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 106
		bodyModel[92].setRotationPoint(3.1F, -22.25F, 3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 107
		bodyModel[93].setRotationPoint(3.1F, -24F, 3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 108
		bodyModel[94].setRotationPoint(3.1F, -25.25F, 4.3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 109
		bodyModel[95].setRotationPoint(3.1F, -25.25F, -36.9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 110
		bodyModel[96].setRotationPoint(3.1F, -25.25F, -38.2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 111
		bodyModel[97].setRotationPoint(3.1F, -24F, -38.2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 112
		bodyModel[98].setRotationPoint(3.1F, -22.25F, -38.2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 113
		bodyModel[99].setRotationPoint(6.6F, -24.8F, -38.2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 114
		bodyModel[100].setRotationPoint(2.6F, -24.8F, -38.2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.6F, -0.45F, -0.45F, -0.6F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.6F, -0.45F, -0.45F, -0.6F); // Box 115
		bodyModel[101].setRotationPoint(2.6F, -25.25F, -38F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 116
		bodyModel[102].setRotationPoint(2.6F, -24.8F, -36.9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 117
		bodyModel[103].setRotationPoint(2.6F, -24.8F, -35.7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 118
		bodyModel[104].setRotationPoint(3.1F, -25.25F, -35.7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 119
		bodyModel[105].setRotationPoint(2.6F, -24.8F, -34.2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 120
		bodyModel[106].setRotationPoint(6.6F, -24.8F, -34.2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 121
		bodyModel[107].setRotationPoint(3.1F, -25.25F, -34.2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 122
		bodyModel[108].setRotationPoint(6.6F, -24.8F, -35.7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 123
		bodyModel[109].setRotationPoint(6.6F, -24.8F, -36.9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 127
		bodyModel[110].setRotationPoint(3.1F, -24F, -34.2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 128
		bodyModel[111].setRotationPoint(3.1F, -22.25F, -34.2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 129
		bodyModel[112].setRotationPoint(4.7F, -23F, 4.6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 130
		bodyModel[113].setRotationPoint(4.7F, -24F, 4.6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 131
		bodyModel[114].setRotationPoint(4.7F, -22F, 4.6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 132
		bodyModel[115].setRotationPoint(4F, -23F, 5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 133
		bodyModel[116].setRotationPoint(4.7F, -22F, -36.8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 134
		bodyModel[117].setRotationPoint(4.7F, -23F, -36.8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 135
		bodyModel[118].setRotationPoint(4.7F, -24F, -36.8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 136
		bodyModel[119].setRotationPoint(4F, -23F, -36.4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 137
		bodyModel[120].setRotationPoint(-14F, -31.3F, -42.7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.4F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, -1F, 0F); // Box 138
		bodyModel[121].setRotationPoint(-15.4F, -31.3F, -42.7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 16, 1, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 139
		bodyModel[122].setRotationPoint(-108F, -23.5F, -30.7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 251
		bodyModel[123].setRotationPoint(-57F, -23F, -5.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 9, 20, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 252
		bodyModel[124].setRotationPoint(-58F, -23F, -5.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 36, 9, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[125].setRotationPoint(-89F, -23F, -44.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 24, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 255
		bodyModel[126].setRotationPoint(-85F, -23.5F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 36, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 256
		bodyModel[127].setRotationPoint(-91F, -24.5F, -20.7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 257
		bodyModel[128].setRotationPoint(-74F, -24F, -38.7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 258
		bodyModel[129].setRotationPoint(-86F, -24F, -37F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0.5F, 0F, 0.3F, 1F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 1F, 0F, 0.3F, 1.5F, 0F, 0.3F, 1F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Box 259
		bodyModel[130].setRotationPoint(-19.2F, -33F, 0.1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 1F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 1F, 0F, 0.3F, 1.5F, 0F, 0.3F, 1F, 0F, 0.3F); // Box 260
		bodyModel[131].setRotationPoint(-19.2F, -33F, -2.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,-1F, 0F, 0.3F, -0.5F, 0F, 0.3F, 1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, 0.3F, 0.2F, 0F, 0.3F, 1.5F, 0F, -0.1F, 1F, 0F, -0.1F); // Box 261
		bodyModel[132].setRotationPoint(-18.7F, -33F, -4.7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0.5F, 0F, -0.1F, 1F, 0F, -0.1F, -0.5F, 0F, 0.3F, -1F, 0F, 0.3F, 1F, 0F, -0.1F, 1.5F, 0F, -0.1F, 0.2F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 263
		bodyModel[133].setRotationPoint(-18.7F, -33F, 2.3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.9F, 0F, -0.1F, 0.6F, 0F, -0.1F, 0F, 0F, 0.3F, 0.2F, 0F, 0.3F, 1.6F, 0F, -0.1F, 1.6F, 0F, -0.1F); // Box 264
		bodyModel[134].setRotationPoint(-17.1F, -33F, -5.9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.6F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.5F, 0F, 0.3F, -1F, 0F, 0.3F, 1.6F, 0F, -0.1F, 1.6F, 0F, -0.1F, 0.2F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
		bodyModel[135].setRotationPoint(-17.1F, -33F, 4.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.6F, 0F, -0.1F, 0.9F, 0F, -0.1F, -1.5F, 0F, -0.2F, -2F, 0F, -0.2F, 1.6F, 0F, -0.1F, 1.6F, 0F, -0.1F, -0.8F, 0F, 0.3F, -1F, 0F, 0.3F); // Box 266
		bodyModel[136].setRotationPoint(-15.5F, -33F, 5.7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2F, 0F, -0.2F, -1.5F, 0F, -0.2F, 0.9F, 0F, -0.1F, 0.6F, 0F, -0.1F, -1F, 0F, 0.3F, -0.8F, 0F, 0.3F, 1.6F, 0F, -0.1F, 1.6F, 0F, -0.1F); // Box 267
		bodyModel[137].setRotationPoint(-15.5F, -33F, -7.1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 24, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 268
		bodyModel[138].setRotationPoint(-50F, -33.2F, -27.7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 24, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 269
		bodyModel[139].setRotationPoint(-50F, -33.2F, -12.7F);

		bodyModel[140].addBox(0F, 0F, 0F, 10, 1, 24, 0F); // Box 270
		bodyModel[140].setRotationPoint(-21.5F, -33.2F, -34F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 271
		bodyModel[141].setRotationPoint(-5F, -30F, -1.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 272
		bodyModel[142].setRotationPoint(-5.5F, -30F, 2.5F);
		bodyModel[142].rotateAngleY = 0.62831853F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 273
		bodyModel[143].setRotationPoint(-7F, -30F, -5F);
		bodyModel[143].rotateAngleY = -0.62831853F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[144].setRotationPoint(-8.8F, -30.8F, -19F);

		bodyModel[145].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 296
		bodyModel[145].setRotationPoint(-1.5F, -23F, -16.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 297
		bodyModel[146].setRotationPoint(-1.5F, -23F, -10.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 298
		bodyModel[147].setRotationPoint(-1.5F, -23F, -22.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 5, 4, 0F); // Box 299
		bodyModel[148].setRotationPoint(-5F, -30F, -17F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[149].setRotationPoint(-6F, -30F, -17F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F); // Box 301
		bodyModel[150].setRotationPoint(-4.9F, -29.45F, -16F);

		bodyModel[151].addShapeBox(6F, 7.8F, 14F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[151].setRotationPoint(-12F, -41F, -15F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 227
		turretModel[1] = new ModelRendererTurbo(this, 481, 321, textureX, textureY); // Box 228
		turretModel[2] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 231
		turretModel[3] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 247
		turretModel[4] = new ModelRendererTurbo(this, 393, 273, textureX, textureY); // Box 248
		turretModel[5] = new ModelRendererTurbo(this, 201, 329, textureX, textureY); // Box 250
		turretModel[6] = new ModelRendererTurbo(this, 209, 329, textureX, textureY); // Box 251
		turretModel[7] = new ModelRendererTurbo(this, 217, 329, textureX, textureY); // Box 252

		turretModel[0].addShapeBox(1F, -0.2F, -1.35F, 1, 2, 1, 0F,1.2F, -0.3F, -0.4F, -0.94F, 0F, -0.4F, -0.94F, 0F, -0.4F, 1.2F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 227
		turretModel[0].setRotationPoint(-2F, -35.5F, 0F);

		turretModel[1].addShapeBox(1F, -0.2F, 0.300000000000001F, 1, 2, 1, 0F,1.2F, -0.3F, -0.4F, -0.94F, 0F, -0.4F, -0.94F, 0F, -0.4F, 1.2F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 228
		turretModel[1].setRotationPoint(-2F, -35.5F, 0F);

		turretModel[2].addShapeBox(0.600000000000001F, -0.8F, -1.35F, 1, 1, 1, 0F,0.8F, -0.2F, -0.4F, -0.94F, -0.2F, -0.4F, -0.94F, -0.2F, -0.4F, 0.8F, -0.2F, -0.4F, 0.8F, -0.1F, -0.4F, -0.55F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, 0.8F, -0.1F, -0.4F); // Box 231
		turretModel[2].setRotationPoint(-2F, -35.5F, 0F);

		turretModel[3].addBox(11F, 7F, 14F, 2, 1, 2, 0F); // Box 247
		turretModel[3].setRotationPoint(-12F, -41F, -15F);

		turretModel[4].addBox(11F, 7.2F, 14F, 2, 1, 2, 0F); // Box 248
		turretModel[4].setRotationPoint(-12F, -41F, -15F);

		turretModel[5].addShapeBox(12.25F, 6.4F, 13.4F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F); // Box 250
		turretModel[5].setRotationPoint(-12F, -41F, -15F);

		turretModel[6].addShapeBox(12.25F, 6.4F, 15.55F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F); // Box 251
		turretModel[6].setRotationPoint(-12F, -41F, -15F);

		turretModel[7].addShapeBox(12.25F, 6.7F, 15.3F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F); // Box 252
		turretModel[7].setRotationPoint(-12F, -41F, -15F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 172
		barrelModel[1] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 173
		barrelModel[2] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 174
		barrelModel[3] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 175
		barrelModel[4] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 176
		barrelModel[5] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 177
		barrelModel[6] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 178
		barrelModel[7] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 179
		barrelModel[8] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 180
		barrelModel[9] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 181
		barrelModel[10] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 182
		barrelModel[11] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 183
		barrelModel[12] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 184
		barrelModel[13] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 187
		barrelModel[14] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 189
		barrelModel[15] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 190
		barrelModel[16] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 191
		barrelModel[17] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 192
		barrelModel[18] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 193
		barrelModel[19] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 194
		barrelModel[20] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 195
		barrelModel[21] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 196
		barrelModel[22] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 197
		barrelModel[23] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 198
		barrelModel[24] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 199
		barrelModel[25] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 25
		barrelModel[26] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 26
		barrelModel[27] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 28
		barrelModel[28] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 29
		barrelModel[29] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 30
		barrelModel[30] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 31
		barrelModel[31] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 32
		barrelModel[32] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 33
		barrelModel[33] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 34
		barrelModel[34] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 35
		barrelModel[35] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 36
		barrelModel[36] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 37
		barrelModel[37] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 38
		barrelModel[38] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 39
		barrelModel[39] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 40
		barrelModel[40] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 42
		barrelModel[41] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 43
		barrelModel[42] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 44
		barrelModel[43] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 45
		barrelModel[44] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 46
		barrelModel[45] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 47
		barrelModel[46] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 48
		barrelModel[47] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 49
		barrelModel[48] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 50
		barrelModel[49] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 51
		barrelModel[50] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 52
		barrelModel[51] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 53
		barrelModel[52] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 54
		barrelModel[53] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 55
		barrelModel[54] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 54
		barrelModel[55] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 55
		barrelModel[56] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 56
		barrelModel[57] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 57
		barrelModel[58] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 58
		barrelModel[59] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 59
		barrelModel[60] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 60
		barrelModel[61] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 64
		barrelModel[62] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 65
		barrelModel[63] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 66
		barrelModel[64] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 67
		barrelModel[65] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 68
		barrelModel[66] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 69
		barrelModel[67] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 70
		barrelModel[68] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 71
		barrelModel[69] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 72
		barrelModel[70] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 73
		barrelModel[71] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 74
		barrelModel[72] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 75
		barrelModel[73] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 76
		barrelModel[74] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 77
		barrelModel[75] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 78
		barrelModel[76] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 79
		barrelModel[77] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 80
		barrelModel[78] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 81
		barrelModel[79] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Box 82
		barrelModel[80] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 83
		barrelModel[81] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 84
		barrelModel[82] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 85
		barrelModel[83] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 86
		barrelModel[84] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 87
		barrelModel[85] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 88
		barrelModel[86] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 89
		barrelModel[87] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 90
		barrelModel[88] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 91
		barrelModel[89] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 92
		barrelModel[90] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 108
		barrelModel[91] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Box 92
		barrelModel[92] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 93
		barrelModel[93] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 94
		barrelModel[94] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 95
		barrelModel[95] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 96
		barrelModel[96] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 97
		barrelModel[97] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 98
		barrelModel[98] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 99
		barrelModel[99] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 100
		barrelModel[100] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Box 101
		barrelModel[101] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 102
		barrelModel[102] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 103
		barrelModel[103] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 105
		barrelModel[104] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 106
		barrelModel[105] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 107
		barrelModel[106] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Box 108
		barrelModel[107] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 109
		barrelModel[108] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 110
		barrelModel[109] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 111
		barrelModel[110] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 112
		barrelModel[111] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 113
		barrelModel[112] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 114
		barrelModel[113] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 115
		barrelModel[114] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 116
		barrelModel[115] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 117
		barrelModel[116] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 118
		barrelModel[117] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 119
		barrelModel[118] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 120
		barrelModel[119] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 121
		barrelModel[120] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 122
		barrelModel[121] = new ModelRendererTurbo(this, 505, 233, textureX, textureY); // Box 123
		barrelModel[122] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 124
		barrelModel[123] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 126
		barrelModel[124] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Box 127
		barrelModel[125] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Box 128
		barrelModel[126] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 129
		barrelModel[127] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 130
		barrelModel[128] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Box 131
		barrelModel[129] = new ModelRendererTurbo(this, 41, 265, textureX, textureY); // Box 132
		barrelModel[130] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Box 133
		barrelModel[131] = new ModelRendererTurbo(this, 505, 249, textureX, textureY); // Box 134
		barrelModel[132] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 135
		barrelModel[133] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Box 136
		barrelModel[134] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 137
		barrelModel[135] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 138
		barrelModel[136] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Box 139
		barrelModel[137] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Box 140
		barrelModel[138] = new ModelRendererTurbo(this, 457, 281, textureX, textureY); // Box 141
		barrelModel[139] = new ModelRendererTurbo(this, 137, 265, textureX, textureY); // Box 107
		barrelModel[140] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 16
		barrelModel[141] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Box 17
		barrelModel[142] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 18
		barrelModel[143] = new ModelRendererTurbo(this, 233, 265, textureX, textureY); // Box 19
		barrelModel[144] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 20
		barrelModel[145] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 21
		barrelModel[146] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 22
		barrelModel[147] = new ModelRendererTurbo(this, 313, 265, textureX, textureY); // Box 23
		barrelModel[148] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 24
		barrelModel[149] = new ModelRendererTurbo(this, 353, 265, textureX, textureY); // Box 25
		barrelModel[150] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 26
		barrelModel[151] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 27
		barrelModel[152] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 28
		barrelModel[153] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Box 29
		barrelModel[154] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Box 159
		barrelModel[155] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 160
		barrelModel[156] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 161
		barrelModel[157] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 162
		barrelModel[158] = new ModelRendererTurbo(this, 73, 281, textureX, textureY); // Box 163
		barrelModel[159] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 164
		barrelModel[160] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 165
		barrelModel[161] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 166
		barrelModel[162] = new ModelRendererTurbo(this, 169, 281, textureX, textureY); // Box 167
		barrelModel[163] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); // Box 168
		barrelModel[164] = new ModelRendererTurbo(this, 217, 281, textureX, textureY); // Box 169
		barrelModel[165] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 170
		barrelModel[166] = new ModelRendererTurbo(this, 265, 281, textureX, textureY); // Box 171
		barrelModel[167] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 172
		barrelModel[168] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Box 173
		barrelModel[169] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 174
		barrelModel[170] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Box 175
		barrelModel[171] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 176
		barrelModel[172] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 177
		barrelModel[173] = new ModelRendererTurbo(this, 417, 281, textureX, textureY); // Box 178
		barrelModel[174] = new ModelRendererTurbo(this, 497, 289, textureX, textureY); // Box 179
		barrelModel[175] = new ModelRendererTurbo(this, 505, 289, textureX, textureY); // Box 180
		barrelModel[176] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 181
		barrelModel[177] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Box 182
		barrelModel[178] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 183
		barrelModel[179] = new ModelRendererTurbo(this, 89, 297, textureX, textureY); // Box 184
		barrelModel[180] = new ModelRendererTurbo(this, 97, 297, textureX, textureY); // Box 185
		barrelModel[181] = new ModelRendererTurbo(this, 137, 297, textureX, textureY); // Box 186
		barrelModel[182] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 187
		barrelModel[183] = new ModelRendererTurbo(this, 185, 297, textureX, textureY); // Box 188
		barrelModel[184] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 189
		barrelModel[185] = new ModelRendererTurbo(this, 233, 297, textureX, textureY); // Box 190
		barrelModel[186] = new ModelRendererTurbo(this, 241, 297, textureX, textureY); // Box 191
		barrelModel[187] = new ModelRendererTurbo(this, 281, 297, textureX, textureY); // Box 192
		barrelModel[188] = new ModelRendererTurbo(this, 289, 297, textureX, textureY); // Box 193
		barrelModel[189] = new ModelRendererTurbo(this, 321, 297, textureX, textureY); // Box 194
		barrelModel[190] = new ModelRendererTurbo(this, 329, 297, textureX, textureY); // Box 195
		barrelModel[191] = new ModelRendererTurbo(this, 369, 297, textureX, textureY); // Box 196
		barrelModel[192] = new ModelRendererTurbo(this, 401, 297, textureX, textureY); // Box 197
		barrelModel[193] = new ModelRendererTurbo(this, 409, 297, textureX, textureY); // Box 198
		barrelModel[194] = new ModelRendererTurbo(this, 449, 297, textureX, textureY); // Box 199
		barrelModel[195] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Box 200
		barrelModel[196] = new ModelRendererTurbo(this, 489, 305, textureX, textureY); // Box 201
		barrelModel[197] = new ModelRendererTurbo(this, 497, 305, textureX, textureY); // Box 202
		barrelModel[198] = new ModelRendererTurbo(this, 505, 305, textureX, textureY); // Box 203
		barrelModel[199] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 204
		barrelModel[200] = new ModelRendererTurbo(this, 57, 313, textureX, textureY); // Box 205
		barrelModel[201] = new ModelRendererTurbo(this, 65, 313, textureX, textureY); // Box 206
		barrelModel[202] = new ModelRendererTurbo(this, 73, 313, textureX, textureY); // Box 207
		barrelModel[203] = new ModelRendererTurbo(this, 153, 313, textureX, textureY); // Box 208
		barrelModel[204] = new ModelRendererTurbo(this, 241, 313, textureX, textureY); // Box 209
		barrelModel[205] = new ModelRendererTurbo(this, 249, 313, textureX, textureY); // Box 210
		barrelModel[206] = new ModelRendererTurbo(this, 257, 313, textureX, textureY); // Box 211
		barrelModel[207] = new ModelRendererTurbo(this, 305, 313, textureX, textureY); // Box 212
		barrelModel[208] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Box 213
		barrelModel[209] = new ModelRendererTurbo(this, 321, 313, textureX, textureY); // Box 214
		barrelModel[210] = new ModelRendererTurbo(this, 329, 313, textureX, textureY); // Box 215
		barrelModel[211] = new ModelRendererTurbo(this, 337, 313, textureX, textureY); // Box 216
		barrelModel[212] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Box 217
		barrelModel[213] = new ModelRendererTurbo(this, 505, 313, textureX, textureY); // Box 218
		barrelModel[214] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 219
		barrelModel[215] = new ModelRendererTurbo(this, 57, 321, textureX, textureY); // Box 220
		barrelModel[216] = new ModelRendererTurbo(this, 65, 321, textureX, textureY); // Box 221
		barrelModel[217] = new ModelRendererTurbo(this, 73, 321, textureX, textureY); // Box 222
		barrelModel[218] = new ModelRendererTurbo(this, 153, 321, textureX, textureY); // Box 223
		barrelModel[219] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Box 224
		barrelModel[220] = new ModelRendererTurbo(this, 249, 321, textureX, textureY); // Box 225
		barrelModel[221] = new ModelRendererTurbo(this, 257, 321, textureX, textureY); // Box 226
		barrelModel[222] = new ModelRendererTurbo(this, 305, 321, textureX, textureY); // Box 229
		barrelModel[223] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Box 232
		barrelModel[224] = new ModelRendererTurbo(this, 497, 321, textureX, textureY); // Box 234
		barrelModel[225] = new ModelRendererTurbo(this, 505, 321, textureX, textureY); // Box 235
		barrelModel[226] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 236
		barrelModel[227] = new ModelRendererTurbo(this, 9, 329, textureX, textureY); // Box 237
		barrelModel[228] = new ModelRendererTurbo(this, 17, 329, textureX, textureY); // Box 238
		barrelModel[229] = new ModelRendererTurbo(this, 25, 329, textureX, textureY); // Box 239
		barrelModel[230] = new ModelRendererTurbo(this, 33, 329, textureX, textureY); // Box 240
		barrelModel[231] = new ModelRendererTurbo(this, 57, 329, textureX, textureY); // Box 241
		barrelModel[232] = new ModelRendererTurbo(this, 65, 329, textureX, textureY); // Box 242
		barrelModel[233] = new ModelRendererTurbo(this, 73, 329, textureX, textureY); // Box 243
		barrelModel[234] = new ModelRendererTurbo(this, 153, 329, textureX, textureY); // Box 244
		barrelModel[235] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Box 245
		barrelModel[236] = new ModelRendererTurbo(this, 169, 329, textureX, textureY); // Box 246

		barrelModel[0].addBox(-0.8F, -3.3F, -0.5F, 3, 1, 1, 0F); // Box 172
		barrelModel[0].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[1].addShapeBox(-0.8F, -2.3F, -0.5F, 3, 1, 1, 0F,0F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0F, -0.1F, -0.05F); // Box 173
		barrelModel[1].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[2].addShapeBox(-8.4F, -3.55F, -0.5F, 4, 2, 1, 0F,0F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.1F, 0F, 0.45F, -0.1F, 0F, 0.45F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 174
		barrelModel[2].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[3].addShapeBox(-3.95F, -2.55F, -0.5F, 3, 1, 1, 0F,0F, 0.3F, 0F, 0.15F, 0.3F, 0F, 0.15F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 175
		barrelModel[3].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[4].addShapeBox(-4.85F, -3.95F, -0.5F, 1, 1, 1, 0F,0F, 0.2F, -0.05F, -0.1F, 0.2F, -0.05F, -0.1F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, -0.2F, -0.05F, -0.1F, -0.2F, -0.05F, -0.1F, -0.2F, -0.05F, 0F, -0.2F, -0.05F); // Box 176
		barrelModel[4].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[5].addShapeBox(-3.95F, -4.45F, -0.5F, 2, 1, 1, 0F,0F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.1F, -0.05F, -0.3F, -0.1F, -0.05F, -0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F); // Box 177
		barrelModel[5].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[6].addShapeBox(-2.25F, -4.45F, -0.5F, 2, 1, 1, 0F,0F, -0.3F, -0.05F, -0.3F, -0.6F, -0.05F, -0.3F, -0.6F, -0.05F, 0F, -0.3F, -0.05F, 0F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 178
		barrelModel[6].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[7].addShapeBox(-1.2F, -3.88F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F); // Box 179
		barrelModel[7].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[8].addShapeBox(-3.88F, -4.45F, 0.15F, 2, 1, 1, 0F,-0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 180
		barrelModel[8].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[9].addShapeBox(-3.98F, -4.15F, 0.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 181
		barrelModel[9].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[10].addShapeBox(-2.79F, -4.15F, 0.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 182
		barrelModel[10].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[11].addShapeBox(-3.95F, -4.05F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 183
		barrelModel[11].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[12].addShapeBox(-4.28F, -4F, 0.15F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 184
		barrelModel[12].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[13].addShapeBox(-4.3F, -3.3F, -1.15F, 4, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 187
		barrelModel[13].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[14].addShapeBox(-1.1F, -3.6F, -1.2F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 189
		barrelModel[14].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[15].addShapeBox(-3.88F, -4.45F, -1.15F, 2, 1, 1, 0F,-0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 190
		barrelModel[15].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[16].addShapeBox(-3.98F, -4.15F, -1.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 191
		barrelModel[16].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[17].addShapeBox(-4.28F, -4F, -1.15F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 192
		barrelModel[17].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[18].addShapeBox(-4.43F, -3.75F, -1.15F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F); // Box 193
		barrelModel[18].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[19].addShapeBox(-2.79F, -4.15F, -1.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 194
		barrelModel[19].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[20].addShapeBox(-4.3F, -3.3F, 0.15F, 4, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 195
		barrelModel[20].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[21].addShapeBox(-1.1F, -3.6F, 0.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 196
		barrelModel[21].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[22].addShapeBox(-4.43F, -3.75F, 0.15F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F); // Box 197
		barrelModel[22].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[23].addShapeBox(-4.25F, -3.35F, -1.35F, 4, 1, 1, 0F,-0.3F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.5F, -0.45F, -0.35F, -0.8F, -0.45F, -0.35F, -0.8F, -0.45F, -0.61F, -0.5F, -0.45F, -0.61F); // Box 198
		barrelModel[23].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[24].addShapeBox(-3.8F, -3.2F, -1.48F, 3, 1, 1, 0F,-0.3F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.5F, -0.3F, -0.46F, -0.8F, -0.3F, -0.46F, -0.8F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F); // Box 199
		barrelModel[24].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[25].addShapeBox(2.2F, -3.25F, -0.5F, 12, 1, 1, 0F,0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F); // Box 25
		barrelModel[25].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[26].addShapeBox(14.65F, -3.55F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, 0.9F, -0.45F, -0.35F, 0.9F, -0.45F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F); // Box 26
		barrelModel[26].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[27].addShapeBox(2.2F, -2.95F, -0.5F, 12, 1, 1, 0F,0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 28
		barrelModel[27].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[28].addShapeBox(14.65F, -3.25F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F); // Box 29
		barrelModel[28].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[29].addShapeBox(2.2F, -3.55F, -0.5F, 12, 1, 1, 0F,0F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F); // Box 30
		barrelModel[29].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[30].addShapeBox(14.65F, -2.95F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.35F, 0.9F, -0.45F, -0.35F, 0.9F, -0.45F, -0.35F, 0F, -0.35F, -0.35F); // Box 31
		barrelModel[30].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[31].addShapeBox(17.1F, -3.55F, -0.5F, 1, 1, 1, 0F,0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 32
		barrelModel[31].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[32].addShapeBox(17.1F, -2.95F, -0.5F, 1, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F); // Box 33
		barrelModel[32].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[33].addShapeBox(17.1F, -3.25F, -0.5F, 1, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 34
		barrelModel[33].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[34].addShapeBox(18.7F, -3.55F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.4F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F); // Box 35
		barrelModel[34].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[35].addShapeBox(18.7F, -3.25F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F); // Box 36
		barrelModel[35].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[36].addShapeBox(18.7F, -2.95F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.5F, -0.4F); // Box 37
		barrelModel[36].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[37].addShapeBox(19.15F, -3.55F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F); // Box 38
		barrelModel[37].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[38].addShapeBox(19.15F, -2.95F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F); // Box 39
		barrelModel[38].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[39].addShapeBox(19.15F, -3.25F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F); // Box 40
		barrelModel[39].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[40].addShapeBox(19.8F, -3.55F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F); // Box 42
		barrelModel[40].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[41].addShapeBox(19.8F, -3.25F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F); // Box 43
		barrelModel[41].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[42].addShapeBox(19.8F, -2.95F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F); // Box 44
		barrelModel[42].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[43].addShapeBox(19.5F, -3.8F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F); // Box 45
		barrelModel[43].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[44].addShapeBox(19.5F, -2.7F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F); // Box 46
		barrelModel[44].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[45].addShapeBox(3.1F, -2.4F, -0.5F, 11, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 47
		barrelModel[45].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[46].addShapeBox(3.1F, -2.7F, -0.5F, 11, 1, 1, 0F,0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 48
		barrelModel[46].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[47].addShapeBox(3.1F, -2.1F, -0.5F, 11, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F); // Box 49
		barrelModel[47].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[48].addShapeBox(13.6F, -2.7F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 50
		barrelModel[48].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[49].addShapeBox(11.6F, -2.7F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F); // Box 51
		barrelModel[49].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[50].addShapeBox(19.9F, -3.25F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 52
		barrelModel[50].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[51].addShapeBox(19.9F, -2.95F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F); // Box 53
		barrelModel[51].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[52].addShapeBox(19.9F, -3.55F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 54
		barrelModel[52].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[53].addShapeBox(19.5F, -3.25F, 0.0999999999999996F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 55
		barrelModel[53].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[54].addShapeBox(19.5F, -3.25F, -1.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 54
		barrelModel[54].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[55].addShapeBox(-0.699999999999998F, -1.4F, -0.5F, 3, 1, 1, 0F,0F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 55
		barrelModel[55].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[56].addShapeBox(0.300000000000002F, -0.9F, -0.5F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0.85F, -0.25F, 0F, 0.85F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0.85F, -0.5F, -0.25F, 0.85F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 56
		barrelModel[56].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[57].addShapeBox(-0.199999999999998F, -1.9F, -1.1F, 1, 1, 1, 0F,-0.15F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, 0.15F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.15F, -0.25F, -0.4F); // Box 57
		barrelModel[57].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[58].addShapeBox(-0.199999999999998F, -1.9F, 0.0999999999999996F, 1, 1, 1, 0F,-0.15F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, 0.15F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.15F, -0.25F, -0.4F); // Box 58
		barrelModel[58].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[59].addShapeBox(-9.2F, -3.6F, 0F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.35F, -0.35F, -0.2F, -0.55F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.55F, -0.35F); // Box 59
		barrelModel[59].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[60].addShapeBox(-9.2F, -3.6F, -1F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.35F, -0.4F, -0.2F, -0.55F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.55F, -0.4F); // Box 60
		barrelModel[60].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[61].addShapeBox(-9.2F, -2.2F, -1F, 1, 1, 1, 0F,-0.2F, -0.55F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.55F, -0.4F, -0.2F, -0.35F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.35F, -0.4F); // Box 64
		barrelModel[61].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[62].addShapeBox(-9.2F, -2.2F, 0F, 1, 1, 1, 0F,-0.2F, -0.55F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.55F, -0.35F, -0.2F, -0.35F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.35F, -0.35F); // Box 65
		barrelModel[62].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[63].addShapeBox(-9.8F, -3.6F, 0.15F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.75F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.5F, -0.1F, -0.35F, 0.25F, -0.1F, -0.55F, -0.75F, -0.2F, -0.55F, -0.25F, -0.2F, -0.55F, -0.5F, -0.1F, -0.55F, 0.25F); // Box 66
		barrelModel[63].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[64].addShapeBox(-9.8F, -3.6F, -1.15F, 1, 1, 1, 0F,-0.1F, -0.35F, 0.25F, -0.2F, -0.35F, -0.5F, -0.2F, -0.35F, -0.25F, -0.1F, -0.35F, -0.75F, -0.1F, -0.55F, 0.25F, -0.2F, -0.55F, -0.5F, -0.2F, -0.55F, -0.25F, -0.1F, -0.55F, -0.75F); // Box 67
		barrelModel[64].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[65].addShapeBox(-9.8F, -2F, 0.15F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.75F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.5F, -0.1F, -0.35F, 0.25F, -0.1F, -0.55F, -0.75F, -0.2F, -0.55F, -0.25F, -0.2F, -0.55F, -0.5F, -0.1F, -0.55F, 0.25F); // Box 68
		barrelModel[65].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[66].addShapeBox(-9.8F, -2F, -1.15F, 1, 1, 1, 0F,-0.1F, -0.35F, 0.25F, -0.2F, -0.35F, -0.5F, -0.2F, -0.35F, -0.25F, -0.1F, -0.35F, -0.75F, -0.1F, -0.55F, 0.25F, -0.2F, -0.55F, -0.5F, -0.2F, -0.55F, -0.25F, -0.1F, -0.55F, -0.75F); // Box 69
		barrelModel[66].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[67].addShapeBox(-10.35F, -3.6F, 0.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.3F, -0.35F, -0.4F, -0.3F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.3F, -0.55F, -0.4F); // Box 70
		barrelModel[67].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[68].addShapeBox(-10.35F, -3.6F, -1.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.3F, -0.35F, -0.4F, -0.3F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.3F, -0.55F, -0.4F); // Box 71
		barrelModel[68].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[69].addShapeBox(-10.35F, -2F, -1.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.4F); // Box 72
		barrelModel[69].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[70].addShapeBox(-10.35F, -2F, 0.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.4F); // Box 73
		barrelModel[70].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[71].addShapeBox(-10.35F, -3.4F, 0.779999999999999F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F); // Box 74
		barrelModel[71].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[72].addShapeBox(-10.35F, -3.4F, 0.57F, 1, 2, 1, 0F,-0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Box 75
		barrelModel[72].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[73].addShapeBox(-10.35F, -3.4F, -1.76F, 1, 2, 1, 0F,-0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Box 76
		barrelModel[73].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[74].addShapeBox(-10.35F, -3.4F, -1.55F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F); // Box 77
		barrelModel[74].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[75].addShapeBox(-2.75F, -3.85F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F); // Box 78
		barrelModel[75].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[76].addShapeBox(-2.75F, -3.5F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F); // Box 79
		barrelModel[76].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[77].addShapeBox(-2.75F, -4.03F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F); // Box 80
		barrelModel[77].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[78].addShapeBox(-3.9F, -4.03F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F); // Box 81
		barrelModel[78].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[79].addShapeBox(-3.9F, -3.85F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F); // Box 82
		barrelModel[79].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[80].addShapeBox(-3.9F, -3.5F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F); // Box 83
		barrelModel[80].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[81].addShapeBox(-3.88F, -4.3F, 0F, 2, 1, 1, 0F,-0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 84
		barrelModel[81].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[82].addShapeBox(-0.0999999999999985F, -3.95F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.25F, -0.3F, -0.1F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 85
		barrelModel[82].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[83].addShapeBox(-3.35F, -3.46F, -1.25F, 1, 1, 1, 0F,-0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F); // Box 86
		barrelModel[83].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[84].addShapeBox(-3.35F, -3.46F, -1.5F, 1, 1, 1, 0F,-0.1F, -0.55F, -0.45F, -0.1F, -0.55F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F); // Box 87
		barrelModel[84].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[85].addShapeBox(-3.35F, -3.39F, -1.6F, 1, 1, 1, 0F,-0.1F, -0.8F, -0.4F, -0.1F, -0.8F, -0.4F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F); // Box 88
		barrelModel[85].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[86].addShapeBox(-8.4F, -2.15F, -0.5F, 7, 1, 1, 0F,0F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 89
		barrelModel[86].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[87].addShapeBox(-5.4F, -4.5F, -0.529999999999999F, 1, 1, 1, 0F,-0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F); // Box 90
		barrelModel[87].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[88].addShapeBox(-7.8F, -1.7F, -0.5F, 6, 1, 1, 0F,-0.3F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 91
		barrelModel[88].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[89].addShapeBox(-1.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F); // Box 92
		barrelModel[89].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[90].addShapeBox(-9.7F, -2.7F, -0.5F, 7, 1, 1, 0F,0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F); // Box 108
		barrelModel[90].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[91].addShapeBox(-0.0999999999999985F, -3F, 0.0999999999999996F, 1, 1, 1, 0F,-0.06F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.06F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F); // Box 92
		barrelModel[91].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[92].addShapeBox(-0.0999999999999985F, -3F, -1.1F, 1, 1, 1, 0F,-0.06F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.06F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F); // Box 93
		barrelModel[92].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[93].addShapeBox(-7.8F, -1.8F, -0.550000000000001F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F); // Box 94
		barrelModel[93].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[94].addShapeBox(-7.9F, -1.8F, -1.4F, 1, 1, 1, 0F,-0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F); // Box 95
		barrelModel[94].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[95].addShapeBox(-8.9F, -1.8F, -1.4F, 1, 1, 1, 0F,0.2F, -0.88F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.88F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, 0.2F, -0.4F); // Box 96
		barrelModel[95].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[96].addShapeBox(-9.75F, -1.25F, -1.4F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 97
		barrelModel[96].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[97].addShapeBox(-9.75F, -1.25F, 0.300000000000001F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 98
		barrelModel[97].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[98].addShapeBox(-8.9F, -1.8F, 0.300000000000001F, 1, 1, 1, 0F,0.2F, -0.88F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.88F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, 0.2F, -0.4F); // Box 99
		barrelModel[98].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[99].addShapeBox(-7.9F, -1.8F, 0.300000000000001F, 1, 1, 1, 0F,-0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F); // Box 100
		barrelModel[99].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[100].addShapeBox(-6.6F, -1.95F, -0.9F, 1, 1, 1, 0F,0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F); // Box 101
		barrelModel[100].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[101].addShapeBox(-7.1F, -2.1F, -0.9F, 1, 1, 1, 0F,0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F); // Box 102
		barrelModel[101].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[102].addShapeBox(-9.8F, -1.18F, -1.1F, 1, 1, 2, 0F,-0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F); // Box 103
		barrelModel[102].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[103].addShapeBox(-9.8F, -1.38F, -1.1F, 1, 1, 2, 0F,-0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F); // Box 105
		barrelModel[103].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[104].addShapeBox(-9.1F, -2.5F, -0.199999999999999F, 1, 1, 1, 0F,0F, 0F, -0.45F, -0.8F, 0F, -0.45F, -0.8F, 0F, -0.45F, 0F, 0F, -0.45F, -0.6F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.6F, -0.2F, -0.45F); // Box 106
		barrelModel[104].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[105].addShapeBox(-9.1F, -2.5F, -0.800000000000001F, 1, 1, 1, 0F,0F, 0F, -0.45F, -0.8F, 0F, -0.45F, -0.8F, 0F, -0.45F, 0F, 0F, -0.45F, -0.6F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.6F, -0.2F, -0.45F); // Box 107
		barrelModel[105].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[106].addShapeBox(-9.5F, -3.2F, -0.800000000000001F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F); // Box 108
		barrelModel[106].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[107].addShapeBox(-9.5F, -3.2F, -0.199999999999999F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F); // Box 109
		barrelModel[107].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[108].addShapeBox(-6.4F, -4F, -0.199999999999999F, 1, 2, 1, 0F,-0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F); // Box 110
		barrelModel[108].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[109].addShapeBox(-6.4F, -4F, -0.800000000000001F, 1, 2, 1, 0F,-0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F); // Box 111
		barrelModel[109].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[110].addShapeBox(-6.4F, -4.4F, -0.800000000000001F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F); // Box 112
		barrelModel[110].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[111].addShapeBox(-6.4F, -4.4F, -0.199999999999999F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F); // Box 113
		barrelModel[111].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[112].addShapeBox(-6.4F, -7F, -0.199999999999999F, 1, 4, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 114
		barrelModel[112].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[113].addShapeBox(-6.4F, -7F, -0.800000000000001F, 1, 4, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 115
		barrelModel[113].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[114].addShapeBox(-6.4F, -7F, -0.550000000000001F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F); // Box 116
		barrelModel[114].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[115].addShapeBox(-6.4F, -4.9F, -0.550000000000001F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F); // Box 117
		barrelModel[115].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[116].addShapeBox(-4.7F, -2.9F, -1.1F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, -0.5F, -0.2F, -0.45F, -0.64F, -0.2F, -0.45F, 0.02F, -0.4F, -0.45F, 0.02F, -0.4F, -0.45F, -0.64F, -0.2F, -0.45F); // Box 118
		barrelModel[116].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[117].addShapeBox(-4.8F, -3.9F, -1.1F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F); // Box 119
		barrelModel[117].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[118].addShapeBox(-4.45F, -1.85F, -1.1F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.45F, -0.32F, -0.3F, -0.45F, -0.32F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.76F, -0.25F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, -0.76F, -0.25F, -0.45F); // Box 120
		barrelModel[118].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[119].addShapeBox(-4.8F, -2.9F, -1.1F, 1, 1, 1, 0F,-0.3F, 0.35F, -0.45F, -0.32F, 0.35F, -0.45F, -0.32F, 0.35F, -0.45F, -0.3F, 0.35F, -0.45F, -0.64F, 0.35F, -0.45F, 0.02F, 0.35F, -0.45F, 0.02F, 0.35F, -0.45F, -0.64F, 0.35F, -0.45F); // Box 121
		barrelModel[119].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[120].addShapeBox(-4.2F, -2.9F, -1.1F, 1, 1, 1, 0F,-0.5F, -0.4F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, 0.02F, -0.2F, -0.45F, 0.02F, -0.2F, -0.45F, -0.5F, -0.4F, -0.45F); // Box 122
		barrelModel[120].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[121].addShapeBox(-3.7F, -2.7F, -1.1F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.45F, -0.1F, -0.7F, -0.45F, -0.1F, -0.7F, -0.45F, -0.5F, -0.25F, -0.45F, -0.5F, -0.4F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.5F, -0.4F, -0.45F); // Box 123
		barrelModel[121].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[122].addShapeBox(-6.9F, -4F, 0.25F, 1, 2, 1, 0F,0.8F, -0.25F, -0.45F, -0.6F, -0.25F, -0.45F, -0.6F, -0.25F, -0.45F, 0.8F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F, 0.8F, -0.25F, -0.45F, 0.8F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F); // Box 124
		barrelModel[122].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[123].addShapeBox(-7F, -2.25F, 0.25F, 5, 1, 1, 0F,0.8F, 0F, -0.45F, 1F, 0F, -0.45F, 1F, 0F, -0.45F, 0.8F, 0F, -0.45F, 0.8F, 0F, -0.45F, 1.8F, 0F, -0.45F, 1.8F, 0F, -0.45F, 0.8F, 0F, -0.45F); // Box 126
		barrelModel[123].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[124].addShapeBox(-7F, -1.45F, 0.25F, 5, 1, 1, 0F,0.8F, -0.2F, -0.45F, 1.8F, -0.2F, -0.45F, 1.8F, -0.2F, -0.45F, 0.8F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, 1.2F, -0.2F, -0.45F, 1.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F); // Box 127
		barrelModel[124].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[125].addShapeBox(-7.8F, -2.7F, 0.25F, 1, 1, 1, 0F,0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F); // Box 128
		barrelModel[125].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[126].addShapeBox(-7.8F, -4.3F, 0.25F, 1, 1, 1, 0F,0.2F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.2F, -0.42F, -0.35F, 0.2F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.2F, -0.42F, -0.35F); // Box 129
		barrelModel[126].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[127].addShapeBox(-7.5F, -1.7F, 0.4F, 1, 1, 1, 0F,0F, 0.05F, -0.45F, -0.1F, 0.05F, -0.45F, -0.1F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F); // Box 130
		barrelModel[127].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[128].addShapeBox(-7F, -1.5F, 0.4F, 6, 1, 1, 0F,0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F); // Box 131
		barrelModel[128].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[129].addShapeBox(-5.1F, -2.3F, 0.4F, 4, 1, 1, 0F,0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F); // Box 132
		barrelModel[129].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[130].addShapeBox(-5F, -1.85F, 0.6F, 1, 1, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F); // Box 133
		barrelModel[130].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[131].addShapeBox(-5.35F, -2.15F, 0.699999999999999F, 1, 1, 1, 0F,0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F); // Box 134
		barrelModel[131].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[132].addShapeBox(-5.8F, -1.85F, 0.75F, 1, 3, 1, 0F,-0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -1.45F, -0.25F, -0.35F, -1.45F, -0.25F, -0.35F, 0.55F, -0.25F, -0.35F, 0.55F); // Box 135
		barrelModel[132].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[133].addShapeBox(-6.8F, -1.6F, 0.699999999999999F, 1, 1, 1, 0F,-0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.7F, -0.35F, -0.35F, 0.7F, -0.35F, -0.35F, 0.7F, -0.35F, -0.35F, 0.7F, -0.35F); // Box 136
		barrelModel[133].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[134].addShapeBox(-6.8F, -0.3F, 0.699999999999999F, 1, 1, 1, 0F,-0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F); // Box 137
		barrelModel[134].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[135].addShapeBox(-6.8F, -1.6F, -0.199999999999999F, 1, 1, 2, 0F,-0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F); // Box 138
		barrelModel[135].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[136].addShapeBox(-3.9F, -2.55F, 1.75F, 3, 2, 4, 0F,0F, -1.2F, 0.3F, 0.2F, -1.2F, 0.3F, 0.2F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 1.1F, -0.2F, 0.2F, 1.1F, -0.2F, 0.2F, 0F, 0.35F, 0F, 0F, 0.35F); // Box 139
		barrelModel[136].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[137].addShapeBox(-3.9F, -3.55F, 1.3F, 3, 1, 4, 0F,0F, -1.3F, -0.7F, 0.2F, -1.3F, -0.7F, 0.2F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, 1.2F, -0.15F, 0.2F, 1.2F, -0.15F, 0.2F, -0.2F, 0.35F, 0F, -0.2F, 0.35F); // Box 140
		barrelModel[137].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[138].addShapeBox(-3.9F, -0.75F, 1.95F, 3, 1, 4, 0F,0F, -1.3F, 0F, 0.2F, -1.3F, 0F, 0.2F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, 0.6F, -0.4F, 0.2F, 0.6F, -0.4F, 0.2F, -0.4F, -0.1F, 0F, -0.4F, 0.1F); // Box 141
		barrelModel[138].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[139].addShapeBox(-3.85F, -3.05F, 1.7F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 107
		barrelModel[139].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[140].addShapeBox(-3.85F, -2.9F, 1.7F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 16
		barrelModel[140].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[141].addShapeBox(-3.85F, -2.75F, 1.7F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 17
		barrelModel[141].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[142].addShapeBox(-2.55F, -3.05F, 1.7F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 18
		barrelModel[142].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[143].addShapeBox(-2.55F, -2.75F, 1.7F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 19
		barrelModel[143].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[144].addShapeBox(-2.55F, -2.9F, 1.7F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 20
		barrelModel[144].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[145].addShapeBox(-2.05F, -3.05F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 21
		barrelModel[145].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[146].addShapeBox(-2.05F, -2.75F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 22
		barrelModel[146].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[147].addShapeBox(-2.05F, -2.85F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 23
		barrelModel[147].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[148].addShapeBox(-1.8F, -3.05F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 24
		barrelModel[148].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[149].addShapeBox(-1.8F, -2.76F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 25
		barrelModel[149].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[150].addShapeBox(-1.8F, -2.96F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 26
		barrelModel[150].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[151].addShapeBox(-1.4F, -3.05F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 27
		barrelModel[151].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[152].addShapeBox(-1.4F, -2.96F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 28
		barrelModel[152].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[153].addShapeBox(-1.4F, -2.76F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 29
		barrelModel[153].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[154].addShapeBox(-3.85F, -3.35F, 1.25F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 159
		barrelModel[154].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[155].addShapeBox(-3.85F, -3.2F, 1.25F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 160
		barrelModel[155].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[156].addShapeBox(-3.85F, -3.05F, 1.25F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 161
		barrelModel[156].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[157].addShapeBox(-2.55F, -3.35F, 1.25F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 162
		barrelModel[157].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[158].addShapeBox(-2.55F, -3.05F, 1.25F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 163
		barrelModel[158].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[159].addShapeBox(-2.55F, -3.2F, 1.25F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 164
		barrelModel[159].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[160].addShapeBox(-2.05F, -3.35F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 165
		barrelModel[160].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[161].addShapeBox(-2.05F, -3.05F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 166
		barrelModel[161].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[162].addShapeBox(-2.05F, -3.15F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 167
		barrelModel[162].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[163].addShapeBox(-1.8F, -3.35F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 168
		barrelModel[163].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[164].addShapeBox(-1.8F, -3.06F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 169
		barrelModel[164].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[165].addShapeBox(-1.8F, -3.26F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 170
		barrelModel[165].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[166].addShapeBox(-1.4F, -3.35F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 171
		barrelModel[166].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[167].addShapeBox(-1.4F, -3.26F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 172
		barrelModel[167].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[168].addShapeBox(-1.4F, -3.06F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 173
		barrelModel[168].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[169].addShapeBox(-3.85F, -3.8F, 0.949999999999999F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 174
		barrelModel[169].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[170].addShapeBox(-3.85F, -3.65F, 0.949999999999999F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 175
		barrelModel[170].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[171].addShapeBox(-3.85F, -3.5F, 0.949999999999999F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 176
		barrelModel[171].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[172].addShapeBox(-2.55F, -3.8F, 0.949999999999999F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 177
		barrelModel[172].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[173].addShapeBox(-2.55F, -3.5F, 0.949999999999999F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 178
		barrelModel[173].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[174].addShapeBox(-2.55F, -3.65F, 0.949999999999999F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 179
		barrelModel[174].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[175].addShapeBox(-2.05F, -3.8F, 0.949999999999999F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 180
		barrelModel[175].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[176].addShapeBox(-2.05F, -3.5F, 0.949999999999999F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 181
		barrelModel[176].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[177].addShapeBox(-2.05F, -3.6F, 0.949999999999999F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 182
		barrelModel[177].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[178].addShapeBox(-1.8F, -3.8F, 0.949999999999999F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 183
		barrelModel[178].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[179].addShapeBox(-1.8F, -3.51F, 0.949999999999999F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 184
		barrelModel[179].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[180].addShapeBox(-1.8F, -3.71F, 0.949999999999999F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 185
		barrelModel[180].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[181].addShapeBox(-1.4F, -3.8F, 0.949999999999999F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 186
		barrelModel[181].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[182].addShapeBox(-1.4F, -3.71F, 0.949999999999999F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 187
		barrelModel[182].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[183].addShapeBox(-1.4F, -3.51F, 0.949999999999999F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 188
		barrelModel[183].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[184].addShapeBox(-3.85F, -3.8F, 0.4F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 189
		barrelModel[184].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[185].addShapeBox(-3.85F, -3.65F, 0.4F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 190
		barrelModel[185].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[186].addShapeBox(-3.85F, -3.5F, 0.4F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 191
		barrelModel[186].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[187].addShapeBox(-2.55F, -3.8F, 0.4F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 192
		barrelModel[187].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[188].addShapeBox(-2.55F, -3.5F, 0.4F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 193
		barrelModel[188].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[189].addShapeBox(-2.55F, -3.65F, 0.4F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 194
		barrelModel[189].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[190].addShapeBox(-2.05F, -3.8F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 195
		barrelModel[190].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[191].addShapeBox(-2.05F, -3.5F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 196
		barrelModel[191].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[192].addShapeBox(-2.05F, -3.6F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 197
		barrelModel[192].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[193].addShapeBox(-1.8F, -3.8F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 198
		barrelModel[193].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[194].addShapeBox(-1.8F, -3.51F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 199
		barrelModel[194].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[195].addShapeBox(-1.8F, -3.71F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 200
		barrelModel[195].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[196].addShapeBox(-1.4F, -3.8F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 201
		barrelModel[196].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[197].addShapeBox(-1.4F, -3.71F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 202
		barrelModel[197].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[198].addShapeBox(-1.4F, -3.51F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 203
		barrelModel[198].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[199].addShapeBox(-3.85F, -3.8F, -0.0999999999999996F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 204
		barrelModel[199].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[200].addShapeBox(-3.85F, -3.65F, -0.0999999999999996F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 205
		barrelModel[200].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[201].addShapeBox(-3.85F, -3.5F, -0.0999999999999996F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 206
		barrelModel[201].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[202].addShapeBox(-2.55F, -3.8F, -0.0999999999999996F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 207
		barrelModel[202].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[203].addShapeBox(-2.55F, -3.5F, -0.0999999999999996F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 208
		barrelModel[203].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[204].addShapeBox(-2.55F, -3.65F, -0.0999999999999996F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 209
		barrelModel[204].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[205].addShapeBox(-2.05F, -3.8F, -0.0999999999999996F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 210
		barrelModel[205].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[206].addShapeBox(-2.05F, -3.5F, -0.0999999999999996F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 211
		barrelModel[206].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[207].addShapeBox(-2.05F, -3.6F, -0.0999999999999996F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 212
		barrelModel[207].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[208].addShapeBox(-1.8F, -3.8F, -0.0999999999999996F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 213
		barrelModel[208].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[209].addShapeBox(-1.8F, -3.51F, -0.0999999999999996F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 214
		barrelModel[209].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[210].addShapeBox(-1.8F, -3.71F, -0.0999999999999996F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 215
		barrelModel[210].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[211].addShapeBox(-1.4F, -3.8F, -0.0999999999999996F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 216
		barrelModel[211].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[212].addShapeBox(-1.4F, -3.71F, -0.0999999999999996F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 217
		barrelModel[212].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[213].addShapeBox(-1.4F, -3.51F, -0.0999999999999996F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 218
		barrelModel[213].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[214].addShapeBox(-3.35F, -1.5F, 0F, 1, 1, 2, 0F,0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F); // Box 219
		barrelModel[214].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[215].addShapeBox(15.4F, -3.9F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 220
		barrelModel[215].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[216].addShapeBox(15.4F, -4.9F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 221
		barrelModel[216].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[217].addShapeBox(15.4F, -5.25F, -0.25F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F); // Box 222
		barrelModel[217].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[218].addShapeBox(15.4F, -5.25F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F); // Box 223
		barrelModel[218].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[219].addShapeBox(15.4F, -5.5F, -0.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 224
		barrelModel[219].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[220].addShapeBox(15.4F, -5.5F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 225
		barrelModel[220].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[221].addShapeBox(15.4F, -5.3F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F); // Box 226
		barrelModel[221].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[222].addShapeBox(-0.499999999999999F, -0.9F, -0.5F, 1, 1, 1, 0F,-0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F); // Box 229
		barrelModel[222].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[223].addShapeBox(-0.499999999999999F, -0.45F, -0.5F, 1, 1, 1, 0F,-0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F); // Box 232
		barrelModel[223].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[224].addShapeBox(-1.1F, -0.6F, 0.5F, 2, 1, 1, 0F,0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F); // Box 234
		barrelModel[224].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[225].addShapeBox(-1.1F, -1.6F, 0.5F, 2, 1, 1, 0F,-0.8F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.8F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F); // Box 235
		barrelModel[225].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[226].addShapeBox(-1.1F, 0.4F, 0.5F, 2, 1, 1, 0F,0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.8F, 0F, -0.35F); // Box 236
		barrelModel[226].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[227].addShapeBox(1.2F, -0.6F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 237
		barrelModel[227].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[228].addShapeBox(-1.7F, -0.6F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 238
		barrelModel[228].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[229].addShapeBox(1.2F, -1.6F, 0.6F, 1, 1, 1, 0F,0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F, -1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 239
		barrelModel[229].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[230].addShapeBox(-1.7F, -1.6F, 0.6F, 1, 1, 1, 0F,-1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, 0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 240
		barrelModel[230].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[231].addShapeBox(1.2F, 0.4F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F, -1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F); // Box 241
		barrelModel[231].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[232].addShapeBox(-1.7F, 0.4F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, 0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F); // Box 242
		barrelModel[232].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[233].addShapeBox(-0.749999999999999F, 0.75F, 0.6F, 2, 1, 1, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F); // Box 243
		barrelModel[233].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[234].addShapeBox(-0.749999999999999F, -2F, 0.6F, 2, 1, 1, 0F,-0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 244
		barrelModel[234].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[235].addShapeBox(-0.279999999999998F, -0.42F, 0.800000000000001F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F); // Box 245
		barrelModel[235].setRotationPoint(-2F, -35.5F, 0F);

		barrelModel[236].addShapeBox(-0.279999999999998F, -0.73F, 0.800000000000001F, 1, 1, 1, 0F,-0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F); // Box 246
		barrelModel[236].setRotationPoint(-2F, -35.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 13
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 14
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 15
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 200
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 201
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 202
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 203
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 204
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 205
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Box 206
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 207
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 208
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Box 215
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 216
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Box 217
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 218
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 219
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 220
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 221
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 222
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 223
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 224
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 225
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 441, 265, textureX, textureY); // Box 226

		leftTrackWheelModels[0].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[0].setRotationPoint(-52.5F, 2F, 13.2F);

		leftTrackWheelModels[1].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftTrackWheelModels[1].setRotationPoint(-52.5F, 2F, 13.2F);

		leftTrackWheelModels[2].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[2].setRotationPoint(-52.5F, 2F, 13.2F);

		leftTrackWheelModels[3].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		leftTrackWheelModels[3].setRotationPoint(-36.5F, 2F, 13.2F);

		leftTrackWheelModels[4].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftTrackWheelModels[4].setRotationPoint(-36.5F, 2F, 13.2F);

		leftTrackWheelModels[5].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 202
		leftTrackWheelModels[5].setRotationPoint(-36.5F, 2F, 13.2F);

		leftTrackWheelModels[6].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		leftTrackWheelModels[6].setRotationPoint(-19.5F, 2F, 13.2F);

		leftTrackWheelModels[7].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftTrackWheelModels[7].setRotationPoint(-19.5F, 2F, 13.2F);

		leftTrackWheelModels[8].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 205
		leftTrackWheelModels[8].setRotationPoint(-19.5F, 2F, 13.2F);

		leftTrackWheelModels[9].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftTrackWheelModels[9].setRotationPoint(-3.5F, 2F, 13.2F);

		leftTrackWheelModels[10].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftTrackWheelModels[10].setRotationPoint(-3.5F, 2F, 13.2F);

		leftTrackWheelModels[11].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 208
		leftTrackWheelModels[11].setRotationPoint(-3.5F, 2F, 13.2F);

		leftTrackWheelModels[12].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 215
		leftTrackWheelModels[12].setRotationPoint(-69.5F, 2F, 13.2F);

		leftTrackWheelModels[13].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		leftTrackWheelModels[13].setRotationPoint(-69.5F, 2F, 13.2F);

		leftTrackWheelModels[14].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		leftTrackWheelModels[14].setRotationPoint(-69.5F, 2F, 13.2F);

		leftTrackWheelModels[15].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		leftTrackWheelModels[15].setRotationPoint(-85.5F, 2F, 13.2F);

		leftTrackWheelModels[16].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 219
		leftTrackWheelModels[16].setRotationPoint(-85.5F, 2F, 13.2F);

		leftTrackWheelModels[17].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		leftTrackWheelModels[17].setRotationPoint(-85.5F, 2F, 13.2F);

		leftTrackWheelModels[18].addShapeBox(-6F, -1.5F, -3F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		leftTrackWheelModels[18].setRotationPoint(-100.5F, -2F, 13.2F);

		leftTrackWheelModels[19].addShapeBox(-6F, 1.5F, -3F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 222
		leftTrackWheelModels[19].setRotationPoint(-100.5F, -2F, 13.2F);

		leftTrackWheelModels[20].addShapeBox(-6F, -5.5F, -3F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		leftTrackWheelModels[20].setRotationPoint(-100.5F, -2F, 13.2F);

		leftTrackWheelModels[21].addShapeBox(-5F, -4.5F, -3F, 10, 3, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		leftTrackWheelModels[21].setRotationPoint(12.5F, -2.5F, 13.2F);

		leftTrackWheelModels[22].addShapeBox(-5F, -1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		leftTrackWheelModels[22].setRotationPoint(12.5F, -2.5F, 13.2F);

		leftTrackWheelModels[23].addShapeBox(-5F, 1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 226
		leftTrackWheelModels[23].setRotationPoint(12.5F, -2.5F, 13.2F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 473, 273, textureX, textureY); // Box 227
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 228
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 229
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 230
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 231
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); // Box 232
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 233
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 234
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 235
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 236
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 417, 281, textureX, textureY); // Box 237
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 457, 289, textureX, textureY); // Box 238
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 239
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 240
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 97, 297, textureX, textureY); // Box 241
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 242
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 243
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 241, 297, textureX, textureY); // Box 244
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 289, 297, textureX, textureY); // Box 245
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 329, 297, textureX, textureY); // Box 246
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 369, 297, textureX, textureY); // Box 247
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 409, 297, textureX, textureY); // Box 248
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 449, 305, textureX, textureY); // Box 249
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 250

		rightTrackWheelModels[0].addShapeBox(-6F, -1.5F, -3F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightTrackWheelModels[0].setRotationPoint(-100.5F, -2F, -42.8F);

		rightTrackWheelModels[1].addShapeBox(-6F, -5.5F, -3F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightTrackWheelModels[1].setRotationPoint(-100.5F, -2F, -42.8F);

		rightTrackWheelModels[2].addShapeBox(-6F, 1.5F, -3F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 229
		rightTrackWheelModels[2].setRotationPoint(-100.5F, -2F, -42.8F);

		rightTrackWheelModels[3].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 230
		rightTrackWheelModels[3].setRotationPoint(-85.5F, 2F, -42.8F);

		rightTrackWheelModels[4].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		rightTrackWheelModels[4].setRotationPoint(-85.5F, 2F, -42.8F);

		rightTrackWheelModels[5].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		rightTrackWheelModels[5].setRotationPoint(-85.5F, 2F, -42.8F);

		rightTrackWheelModels[6].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 233
		rightTrackWheelModels[6].setRotationPoint(-69.5F, 2F, -42.8F);

		rightTrackWheelModels[7].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		rightTrackWheelModels[7].setRotationPoint(-69.5F, 2F, -42.8F);

		rightTrackWheelModels[8].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		rightTrackWheelModels[8].setRotationPoint(-69.5F, 2F, -42.8F);

		rightTrackWheelModels[9].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 236
		rightTrackWheelModels[9].setRotationPoint(-52.5F, 2F, -42.8F);

		rightTrackWheelModels[10].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		rightTrackWheelModels[10].setRotationPoint(-52.5F, 2F, -42.8F);

		rightTrackWheelModels[11].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		rightTrackWheelModels[11].setRotationPoint(-52.5F, 2F, -42.8F);

		rightTrackWheelModels[12].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 239
		rightTrackWheelModels[12].setRotationPoint(-36.5F, 2F, -42.8F);

		rightTrackWheelModels[13].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		rightTrackWheelModels[13].setRotationPoint(-36.5F, 2F, -42.8F);

		rightTrackWheelModels[14].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		rightTrackWheelModels[14].setRotationPoint(-36.5F, 2F, -42.8F);

		rightTrackWheelModels[15].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 242
		rightTrackWheelModels[15].setRotationPoint(-19.5F, 2F, -42.8F);

		rightTrackWheelModels[16].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		rightTrackWheelModels[16].setRotationPoint(-19.5F, 2F, -42.8F);

		rightTrackWheelModels[17].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		rightTrackWheelModels[17].setRotationPoint(-19.5F, 2F, -42.8F);

		rightTrackWheelModels[18].addShapeBox(-5F, -4.5F, -3F, 10, 3, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		rightTrackWheelModels[18].setRotationPoint(12.5F, -2.5F, -42.8F);

		rightTrackWheelModels[19].addShapeBox(-5F, -1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		rightTrackWheelModels[19].setRotationPoint(12.5F, -2.5F, -42.8F);

		rightTrackWheelModels[20].addShapeBox(-5F, 1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 247
		rightTrackWheelModels[20].setRotationPoint(12.5F, -2.5F, -42.8F);

		rightTrackWheelModels[21].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightTrackWheelModels[21].setRotationPoint(-3.5F, 2F, -42.8F);

		rightTrackWheelModels[22].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightTrackWheelModels[22].setRotationPoint(-3.5F, 2F, -42.8F);

		rightTrackWheelModels[23].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 250
		rightTrackWheelModels[23].setRotationPoint(-3.5F, 2F, -42.8F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 165
		leftTrackModel[1] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 166
		leftTrackModel[2] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 167
		leftTrackModel[3] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 168
		leftTrackModel[4] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 169
		leftTrackModel[5] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 170
		leftTrackModel[6] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 171
		leftTrackModel[7] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 172
		leftTrackModel[8] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 173
		leftTrackModel[9] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 174
		leftTrackModel[10] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 175
		leftTrackModel[11] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 176
		leftTrackModel[12] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 177
		leftTrackModel[13] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 178
		leftTrackModel[14] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 179
		leftTrackModel[15] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 180
		leftTrackModel[16] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 181
		leftTrackModel[17] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 182
		leftTrackModel[18] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 183
		leftTrackModel[19] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 184
		leftTrackModel[20] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 185
		leftTrackModel[21] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 186
		leftTrackModel[22] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 187

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0F, -1.05F, 0.8F, 0F, -1.05F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 165
		leftTrackModel[0].setRotationPoint(17F, -1.3F, 8.5F);
		leftTrackModel[0].rotateAngleZ = -0.54105207F;

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 166
		leftTrackModel[1].setRotationPoint(16.7F, -4F, 8.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0.6F, -2F, 0F, 0.6F, -2F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.2F, 0F, 0F); // Box 167
		leftTrackModel[2].setRotationPoint(16F, -7F, 8.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0F, -0.1F, 0F); // Box 168
		leftTrackModel[3].setRotationPoint(12F, -7.8F, 8.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.2F, 0F); // Box 169
		leftTrackModel[4].setRotationPoint(-3F, -6.6F, 8.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, -0.8F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, -0.8F, 0F, 0F, 0.7F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0.7F, 0F); // Box 170
		leftTrackModel[5].setRotationPoint(-3F, 8.45F, 8.5F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 171
		leftTrackModel[6].setRotationPoint(-20F, 9.2F, 8.5F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 172
		leftTrackModel[7].setRotationPoint(-36F, 9.2F, 8.5F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 173
		leftTrackModel[8].setRotationPoint(-53F, 9.2F, 8.5F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 174
		leftTrackModel[9].setRotationPoint(-69F, 9.2F, 8.5F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 175
		leftTrackModel[10].setRotationPoint(-86F, 9.2F, 8.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, 6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -6F, 0F); // Box 176
		leftTrackModel[11].setRotationPoint(-104F, 8.45F, 8.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.95F, 0F, 0F); // Box 177
		leftTrackModel[12].setRotationPoint(-106.5F, 1F, 8.5F);
		leftTrackModel[12].rotateAngleZ = 0.54105207F;

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 178
		leftTrackModel[13].setRotationPoint(-107F, -2F, 8.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 179
		leftTrackModel[14].setRotationPoint(-107F, -5F, 8.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, 0F, 0.05F, 2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 2.8F, 0F); // Box 180
		leftTrackModel[15].setRotationPoint(-106F, -7.8F, 8.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 181
		leftTrackModel[16].setRotationPoint(-99F, -6.8F, 8.5F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 182
		leftTrackModel[17].setRotationPoint(-85F, -5.8F, 8.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		leftTrackModel[18].setRotationPoint(-103F, -7.8F, 8.5F);

		leftTrackModel[19].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 184
		leftTrackModel[19].setRotationPoint(-69F, -5.8F, 8.5F);

		leftTrackModel[20].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 185
		leftTrackModel[20].setRotationPoint(-53F, -5.8F, 8.5F);

		leftTrackModel[21].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 186
		leftTrackModel[21].setRotationPoint(-36F, -5.8F, 8.5F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 187
		leftTrackModel[22].setRotationPoint(-19F, -5.8F, 8.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 140
		rightTrackModel[1] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 141
		rightTrackModel[2] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 142
		rightTrackModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 143
		rightTrackModel[4] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 144
		rightTrackModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 145
		rightTrackModel[6] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 146
		rightTrackModel[7] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 147
		rightTrackModel[8] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 148
		rightTrackModel[9] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 149
		rightTrackModel[10] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 150
		rightTrackModel[11] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 151
		rightTrackModel[12] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 152
		rightTrackModel[13] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 153
		rightTrackModel[14] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 154
		rightTrackModel[15] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 155
		rightTrackModel[16] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 157
		rightTrackModel[17] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 158
		rightTrackModel[18] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 159
		rightTrackModel[19] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 160
		rightTrackModel[20] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 161
		rightTrackModel[21] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 162
		rightTrackModel[22] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 163

		rightTrackModel[0].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 140
		rightTrackModel[0].setRotationPoint(-53F, -5.8F, -46.5F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 141
		rightTrackModel[1].setRotationPoint(-69F, -5.8F, -46.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 142
		rightTrackModel[2].setRotationPoint(-85F, -5.8F, -46.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 143
		rightTrackModel[3].setRotationPoint(-99F, -6.8F, -46.5F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 144
		rightTrackModel[4].setRotationPoint(-36F, -5.8F, -46.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.2F, 0F); // Box 145
		rightTrackModel[5].setRotationPoint(-3F, -6.6F, -46.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 146
		rightTrackModel[6].setRotationPoint(-19F, -5.8F, -46.5F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 147
		rightTrackModel[7].setRotationPoint(-69F, 9.2F, -46.5F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 148
		rightTrackModel[8].setRotationPoint(-53F, 9.2F, -46.5F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 149
		rightTrackModel[9].setRotationPoint(-36F, 9.2F, -46.5F);

		rightTrackModel[10].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 150
		rightTrackModel[10].setRotationPoint(-86F, 9.2F, -46.5F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 151
		rightTrackModel[11].setRotationPoint(-20F, 9.2F, -46.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, 6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -6F, 0F); // Box 152
		rightTrackModel[12].setRotationPoint(-104F, 8.45F, -46.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, -0.8F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, -0.8F, 0F, 0F, 0.7F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0.7F, 0F); // Box 153
		rightTrackModel[13].setRotationPoint(-3F, 8.45F, -46.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightTrackModel[14].setRotationPoint(-103F, -7.8F, -46.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, 0F, 0.05F, 2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 2.8F, 0F); // Box 155
		rightTrackModel[15].setRotationPoint(-106F, -7.8F, -46.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 157
		rightTrackModel[16].setRotationPoint(-107F, -5F, -46.5F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 158
		rightTrackModel[17].setRotationPoint(-107F, -2F, -46.5F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.95F, 0F, 0F); // Box 159
		rightTrackModel[18].setRotationPoint(-106.5F, 1F, -46.5F);
		rightTrackModel[18].rotateAngleZ = 0.54105207F;

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 160
		rightTrackModel[19].setRotationPoint(16.7F, -4F, -46.5F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0F, -1.05F, 0.8F, 0F, -1.05F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 161
		rightTrackModel[20].setRotationPoint(17F, -1.3F, -46.5F);
		rightTrackModel[20].rotateAngleZ = -0.54105207F;

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0.6F, -2F, 0F, 0.6F, -2F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.2F, 0F, 0F); // Box 162
		rightTrackModel[21].setRotationPoint(16F, -7F, -46.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0F, -0.1F, 0F); // Box 163
		rightTrackModel[22].setRotationPoint(12F, -7.8F, -46.5F);
	}
}