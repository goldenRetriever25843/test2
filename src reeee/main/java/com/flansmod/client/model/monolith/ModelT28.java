//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: T28
// Model Creator: 
// Created on: 13.06.2016 - 03:43:23
// Last changed on: 13.06.2016 - 03:43:23

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelT28 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelT28() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[152];
		barrelModel = new ModelRendererTurbo[12];
		leftBackWheelModel = new ModelRendererTurbo[60];
		leftTrackWheelModels = new ModelRendererTurbo[30];
		rightTrackWheelModels = new ModelRendererTurbo[30];
		leftTrackModel = new ModelRendererTurbo[26];
		rightTrackModel = new ModelRendererTurbo[24];

		initbodyModel_1();
		initbarrelModel_1();
		initleftBackWheelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 42
		bodyModel[33] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 43
		bodyModel[34] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 44
		bodyModel[35] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 45
		bodyModel[36] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 46
		bodyModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 47
		bodyModel[38] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 48
		bodyModel[39] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 50
		bodyModel[40] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 51
		bodyModel[41] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 64
		bodyModel[42] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 65
		bodyModel[43] = new ModelRendererTurbo(this, 353, 265, textureX, textureY); // Box 78
		bodyModel[44] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Box 79
		bodyModel[45] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 80
		bodyModel[46] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 81
		bodyModel[47] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 82
		bodyModel[48] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 83
		bodyModel[49] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 84
		bodyModel[50] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 85
		bodyModel[51] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 86
		bodyModel[52] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 87
		bodyModel[53] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 88
		bodyModel[54] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 89
		bodyModel[55] = new ModelRendererTurbo(this, 321, 305, textureX, textureY); // Box 92
		bodyModel[56] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 93
		bodyModel[57] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 94
		bodyModel[58] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Box 95
		bodyModel[59] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 96
		bodyModel[60] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 97
		bodyModel[61] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 98
		bodyModel[62] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Box 102
		bodyModel[63] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Box 103
		bodyModel[64] = new ModelRendererTurbo(this, 425, 265, textureX, textureY); // Box 104
		bodyModel[65] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 107
		bodyModel[66] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 108
		bodyModel[67] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 109
		bodyModel[68] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 126
		bodyModel[69] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 127
		bodyModel[70] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 129
		bodyModel[72] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 130
		bodyModel[73] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 131
		bodyModel[74] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 132
		bodyModel[75] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 133
		bodyModel[76] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 134
		bodyModel[77] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 135
		bodyModel[78] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 136
		bodyModel[79] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 137
		bodyModel[80] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 138
		bodyModel[81] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 139
		bodyModel[82] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 140
		bodyModel[83] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 141
		bodyModel[84] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 142
		bodyModel[85] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 143
		bodyModel[86] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 144
		bodyModel[87] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 145
		bodyModel[88] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 146
		bodyModel[89] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 147
		bodyModel[90] = new ModelRendererTurbo(this, 329, 297, textureX, textureY); // Box 148
		bodyModel[91] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 149
		bodyModel[92] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 150
		bodyModel[93] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Box 151
		bodyModel[94] = new ModelRendererTurbo(this, 97, 313, textureX, textureY); // Box 152
		bodyModel[95] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 153
		bodyModel[96] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 154
		bodyModel[97] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 155
		bodyModel[98] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 156
		bodyModel[99] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 157
		bodyModel[100] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 158
		bodyModel[101] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 159
		bodyModel[102] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 160
		bodyModel[103] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 161
		bodyModel[104] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 162
		bodyModel[105] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 163
		bodyModel[106] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 170
		bodyModel[107] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 171
		bodyModel[108] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 175
		bodyModel[109] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 176
		bodyModel[110] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 177
		bodyModel[111] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 178
		bodyModel[112] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 207
		bodyModel[113] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 208
		bodyModel[114] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 183
		bodyModel[115] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 184
		bodyModel[116] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 186
		bodyModel[117] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 187
		bodyModel[118] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 282
		bodyModel[119] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 283
		bodyModel[120] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 284
		bodyModel[121] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 285
		bodyModel[122] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Box 286
		bodyModel[123] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 287
		bodyModel[124] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Box 288
		bodyModel[125] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 289
		bodyModel[126] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 290
		bodyModel[127] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 291
		bodyModel[128] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 292
		bodyModel[129] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 293
		bodyModel[130] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 294
		bodyModel[131] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 301
		bodyModel[132] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 311
		bodyModel[133] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 318
		bodyModel[134] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 325
		bodyModel[135] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 329
		bodyModel[136] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 330
		bodyModel[137] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 331
		bodyModel[138] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 332
		bodyModel[139] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Box 333
		bodyModel[140] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 334
		bodyModel[141] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Box 335
		bodyModel[142] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 336
		bodyModel[143] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 337
		bodyModel[144] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 338
		bodyModel[145] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 339
		bodyModel[146] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 340
		bodyModel[147] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 341
		bodyModel[148] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 348
		bodyModel[149] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 358
		bodyModel[150] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 365
		bodyModel[151] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 372

		bodyModel[0].addShapeBox(0F, 0F, 0F, 12, 6, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.51F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-14F, -5F, -19F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 100, 14, 38, 0F,0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -2F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-113.01F, -13F, -19F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 9, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-114.01F, -22.01F, -28.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 91, 9, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-112F, -22.01F, -28.49F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 9, 6, 0F,0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-21.01F, -22.01F, -28.49F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 9, 6, 0F,0F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-21.01F, -22.01F, -22.49F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 8, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-13F, -13F, -19F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 37, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-13.5F, -14.01F, -28.49F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 37, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-13.5F, -14.01F, -18.49F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 42, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -13F, 0.5F, 0F, -13F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-14.5F, -7.5F, -18.49F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, -4F, 1F, 0F); // Box 11
		bodyModel[10].setRotationPoint(22.5F, -14.01F, -28.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 40, 6, 10, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-114F, -28F, -28.49F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 1.5F, 2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-74.01F, -28F, -28.49F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 43, 6, 10, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 14
		bodyModel[13].setRotationPoint(-64F, -28F, -28.49F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 6, 10, 0F,0F, -6F, 0F, 0F, -6F, -12F, 0F, -6F, 2F, 0F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 15
		bodyModel[14].setRotationPoint(-21.01F, -28F, -28.49F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 91, 9, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(-112F, -22.01F, 18.49F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-21.01F, -22.01F, 22.49F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 37, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(-13.5F, -14.01F, 17.49F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 37, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 21
		bodyModel[18].setRotationPoint(-13.5F, -14.01F, 17.49F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 42, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -13F, 0.5F, 0F, -13F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-14.5F, -7.5F, 17.49F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, -4F, 1F, 0F); // Box 23
		bodyModel[20].setRotationPoint(22.5F, -14.01F, 18.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 40, 6, 10, 0F,0F, -6F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(-114F, -28F, 18.49F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F,0F, 0.5F, 0F, 0F, 1.5F, 2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(-74.01F, -28F, 18.49F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 43, 6, 10, 0F,0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(-64F, -28F, 18.49F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 14, 6, 10, 0F,0F, 1.5F, 2F, 0F, -6F, 2F, 0F, -6F, -12F, 0F, -6F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(-21.01F, -28F, 18.49F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 9, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-21.01F, -22.01F, 16.49F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 38, 17, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-64.01F, -29.5F, -16.51F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 6, 19, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.5F, 7F, -3F, 0F, 2F, -3F, 0F, 2F, 1.5F, 0.5F, 7F); // Box 35
		bodyModel[27].setRotationPoint(-5.51F, -28.5F, -9.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 8, 33, 0F,0F, 0F, 0F, 0.5F, 0.5F, -5F, 0.5F, 0.5F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F); // Box 36
		bodyModel[28].setRotationPoint(-7F, -22F, -16.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 38, 10, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[29].setRotationPoint(-64.01F, -22.5F, -18.51F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 4, 15, 0F,0F, 0F, 0F, -1F, -1F, -4.5F, -1F, -1F, -4.5F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 3F); // Box 39
		bodyModel[30].setRotationPoint(-6F, -28.5F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[31].setRotationPoint(-6.5F, -21.5F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 6, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[32].setRotationPoint(-6.5F, -27.5F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 43
		bodyModel[33].setRotationPoint(-6.5F, -15.5F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -6F); // Box 44
		bodyModel[34].setRotationPoint(0.5F, -15.5F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 45
		bodyModel[35].setRotationPoint(0.5F, -21.5F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 6, 18, 0F,0F, 0F, -6F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 46
		bodyModel[36].setRotationPoint(0.5F, -27.5F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 5, 16, 0F,0F, 0F, -5F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, 0F); // Box 47
		bodyModel[37].setRotationPoint(4.5F, -26.5F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 6, 16, 0F,0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, 0F); // Box 48
		bodyModel[38].setRotationPoint(4.5F, -21.5F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 5, 16, 0F,0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -5F); // Box 50
		bodyModel[39].setRotationPoint(4.5F, -15.5F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 10, 15, 0F,-1F, 0F, 3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 3F, -2F, 0F, 3F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 3F); // Box 51
		bodyModel[40].setRotationPoint(-6F, -24.51F, -7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 9, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 64
		bodyModel[41].setRotationPoint(-89.01F, -26.2F, -18.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 49, 14, 38, 0F,0F, 0F, 0F, -0.51F, 7.5F, 0F, -0.51F, 7.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, -2F, 0F, 0F); // Box 65
		bodyModel[42].setRotationPoint(-112.01F, -18F, -19F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 18, 5, 31, 0F,-1F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[43].setRotationPoint(-85.5F, -26.2F, -15.5F);
		bodyModel[43].rotateAngleZ = 0.13962634F;

		bodyModel[44].addShapeBox(-25F, 0F, 0F, 18, 5, 31, 0F,-1F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[44].setRotationPoint(-85.5F, -26.2F, -15.5F);
		bodyModel[44].rotateAngleZ = 0.13962634F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 80
		bodyModel[45].setRotationPoint(-85.5F, -26.2F, -12F);
		bodyModel[45].rotateAngleZ = 0.13962634F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 81
		bodyModel[46].setRotationPoint(-85.5F, -26.2F, 11F);
		bodyModel[46].rotateAngleZ = 0.13962634F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 82
		bodyModel[47].setRotationPoint(-85.5F, -26.2F, 5F);
		bodyModel[47].rotateAngleZ = 0.13962634F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 83
		bodyModel[48].setRotationPoint(-85.5F, -26.2F, -6F);
		bodyModel[48].rotateAngleZ = 0.13962634F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 84
		bodyModel[49].setRotationPoint(-85.5F, -26.2F, -0.5F);
		bodyModel[49].rotateAngleZ = 0.13962634F;

		bodyModel[50].addShapeBox(-25F, 0F, 0F, 18, 5, 1, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 85
		bodyModel[50].setRotationPoint(-85.5F, -26.2F, -12F);
		bodyModel[50].rotateAngleZ = 0.13962634F;

		bodyModel[51].addShapeBox(-25F, 0F, 0F, 18, 5, 1, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 86
		bodyModel[51].setRotationPoint(-85.5F, -26.2F, -6F);
		bodyModel[51].rotateAngleZ = 0.13962634F;

		bodyModel[52].addShapeBox(-25F, 0F, 0F, 18, 5, 1, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 87
		bodyModel[52].setRotationPoint(-85.5F, -26.2F, -0.5F);
		bodyModel[52].rotateAngleZ = 0.13962634F;

		bodyModel[53].addShapeBox(-25F, 0F, 0F, 18, 5, 1, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 88
		bodyModel[53].setRotationPoint(-85.5F, -26.2F, 5F);
		bodyModel[53].rotateAngleZ = 0.13962634F;

		bodyModel[54].addShapeBox(-25F, 0F, 0F, 18, 5, 1, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F); // Box 89
		bodyModel[54].setRotationPoint(-85.5F, -26.2F, 11F);
		bodyModel[54].rotateAngleZ = 0.13962634F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 8, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 92
		bodyModel[55].setRotationPoint(-26.01F, -29.5F, -16.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 2F, 0F, -2.5F); // Box 93
		bodyModel[56].setRotationPoint(-34.01F, -29.5F, 16.51F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 8, 8, 0F,0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -0.5F, 0F, -0.5F, 0F, -2.5F, 0F, 0F, 1.5F); // Box 94
		bodyModel[57].setRotationPoint(-18.01F, -29.5F, 16.51F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 8, 33, 0F,0F, 0F, 0F, 0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[58].setRotationPoint(-18F, -29.5F, -16.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 8, 33, 0F,-0.5F, 0F, 0F, -0.5F, -1F, -7F, -0.5F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[59].setRotationPoint(-10F, -29.5F, -16.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 8, 8, 0F,0F, 0F, -2F, 0.5F, 0F, -4.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, -2.5F, 5F, -0.5F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[60].setRotationPoint(-18.01F, -29.5F, -24.51F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 8, 8, 0F,0.5F, 0F, -4.5F, 0F, 0F, -2F, 0F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, -2.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 5F, -0.5F, 0F); // Box 98
		bodyModel[61].setRotationPoint(-23F, -29.5F, -24.51F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 102
		bodyModel[62].setRotationPoint(-24.5F, -32.5F, 5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 2F); // Box 103
		bodyModel[63].setRotationPoint(-20.51F, -32.5F, 5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, -2F); // Box 104
		bodyModel[64].setRotationPoint(-28.51F, -32.5F, 5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[65].setRotationPoint(-19F, -29.8F, -17F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 108
		bodyModel[66].setRotationPoint(-17F, -29.8F, -17F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 109
		bodyModel[67].setRotationPoint(-21F, -29.8F, -17F);

		bodyModel[68].addShapeBox(-0.5F, 0F, -0.5F, 2, 1, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 126
		bodyModel[68].setRotationPoint(-42.5F, -37.5F, -15.5F);

		bodyModel[69].addShapeBox(-0.5F, 0F, -0.5F, 2, 1, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 127
		bodyModel[69].setRotationPoint(-42.5F, -37.5F, -11.3F);
		bodyModel[69].rotateAngleY = 0.48869219F;

		bodyModel[70].addShapeBox(-0.5F, 0F, -0.5F, 2, 1, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 128
		bodyModel[70].setRotationPoint(-45.1F, -37.5F, -6.7F);
		bodyModel[70].rotateAngleY = 0.9250245F;

		bodyModel[71].addShapeBox(-2F, 0F, 0F, 2, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 129
		bodyModel[71].setRotationPoint(-48.5F, -37.5F, -2.2F);
		bodyModel[71].rotateAngleY = 1.43116999F;

		bodyModel[72].addShapeBox(-2F, 0F, 0F, 2, 1, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 130
		bodyModel[72].setRotationPoint(-52.5F, -37.5F, -1.6F);
		bodyModel[72].rotateAngleY = 1.78023584F;

		bodyModel[73].addShapeBox(-2F, 0F, 0F, 2, 1, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 131
		bodyModel[73].setRotationPoint(-58.4F, -37.5F, -2.9F);
		bodyModel[73].rotateAngleY = 2.3387412F;

		bodyModel[74].addShapeBox(-2F, 0F, -6F, 2, 1, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 132
		bodyModel[74].setRotationPoint(-41F, -37.5F, -16F);
		bodyModel[74].rotateAngleY = -0.4712389F;

		bodyModel[75].addShapeBox(-2F, 0F, -5F, 2, 1, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 133
		bodyModel[75].setRotationPoint(-43.7F, -37.5F, -21.3F);
		bodyModel[75].rotateAngleY = -0.9424778F;

		bodyModel[76].addShapeBox(-2F, 0F, -5F, 2, 1, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 134
		bodyModel[76].setRotationPoint(-47.7F, -37.5F, -24.2F);
		bodyModel[76].rotateAngleY = -1.36135682F;

		bodyModel[77].addShapeBox(-2F, 0F, -5F, 2, 1, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 135
		bodyModel[77].setRotationPoint(-52.6F, -37.5F, -25.25F);
		bodyModel[77].rotateAngleY = -1.79768913F;

		bodyModel[78].addShapeBox(-2F, 0F, -8F, 2, 1, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 136
		bodyModel[78].setRotationPoint(-57.4F, -37.5F, -24.15F);
		bodyModel[78].rotateAngleY = -2.25147474F;

		bodyModel[79].addShapeBox(-2F, 0F, -8F, 1, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 137
		bodyModel[79].setRotationPoint(-57.4F, -38.5F, -24.15F);
		bodyModel[79].rotateAngleY = -2.25147474F;

		bodyModel[80].addShapeBox(-2F, 0F, -5F, 1, 2, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 138
		bodyModel[80].setRotationPoint(-52.6F, -38.5F, -25.25F);
		bodyModel[80].rotateAngleY = -1.79768913F;

		bodyModel[81].addShapeBox(-2F, 0F, -5F, 1, 2, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 139
		bodyModel[81].setRotationPoint(-47.7F, -38.5F, -24.2F);
		bodyModel[81].rotateAngleY = -1.36135682F;

		bodyModel[82].addShapeBox(-2F, 0F, -5F, 1, 2, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 140
		bodyModel[82].setRotationPoint(-43.7F, -38.5F, -21.3F);
		bodyModel[82].rotateAngleY = -0.9424778F;

		bodyModel[83].addShapeBox(-2F, 0F, -6F, 1, 2, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 141
		bodyModel[83].setRotationPoint(-41F, -38.5F, -16F);
		bodyModel[83].rotateAngleY = -0.4712389F;

		bodyModel[84].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 142
		bodyModel[84].setRotationPoint(-42.5F, -38.5F, -15.5F);

		bodyModel[85].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 143
		bodyModel[85].setRotationPoint(-42.5F, -38.5F, -11.3F);
		bodyModel[85].rotateAngleY = 0.48869219F;

		bodyModel[86].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 144
		bodyModel[86].setRotationPoint(-45.1F, -38.5F, -6.7F);
		bodyModel[86].rotateAngleY = 0.9250245F;

		bodyModel[87].addShapeBox(-2F, 0F, 0F, 1, 2, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 145
		bodyModel[87].setRotationPoint(-48.5F, -38.5F, -2.2F);
		bodyModel[87].rotateAngleY = 1.43116999F;

		bodyModel[88].addShapeBox(-2F, 0F, 0F, 1, 2, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 146
		bodyModel[88].setRotationPoint(-52.5F, -38.5F, -1.6F);
		bodyModel[88].rotateAngleY = 1.78023584F;

		bodyModel[89].addShapeBox(-2F, 0F, 0F, 1, 2, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 147
		bodyModel[89].setRotationPoint(-58.4F, -38.5F, -2.9F);
		bodyModel[89].rotateAngleY = 2.3387412F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 2F); // Box 148
		bodyModel[90].setRotationPoint(-51F, -32.5F, -19.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 149
		bodyModel[91].setRotationPoint(-54.99F, -32.5F, -19.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, -2F); // Box 150
		bodyModel[92].setRotationPoint(-59F, -32.5F, -19.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 7, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 151
		bodyModel[93].setRotationPoint(-56.5F, -29.4F, -23.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 9, 7, 16, 0F,0F, 0F, 0F, -1F, 0F, -4F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 152
		bodyModel[94].setRotationPoint(-49.5F, -29.4F, -23.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 7, 7, 7, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 153
		bodyModel[95].setRotationPoint(-63.5F, -29.4F, -23.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[96].setRotationPoint(-42.5F, -37F, -8.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[97].setRotationPoint(-43F, -37F, -21F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[98].setRotationPoint(-63.5F, -37F, -19.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[99].setRotationPoint(-62F, -37F, -7.5F);

		bodyModel[100].addShapeBox(-0.5F, 0F, 0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 158
		bodyModel[100].setRotationPoint(-62F, -37.5F, -8.5F);

		bodyModel[101].addShapeBox(-0.5F, 0F, 0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 159
		bodyModel[101].setRotationPoint(-63.5F, -37.5F, -20.5F);

		bodyModel[102].addShapeBox(-0.5F, 0F, 0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 160
		bodyModel[102].setRotationPoint(-63F, -29.7F, -20.5F);

		bodyModel[103].addShapeBox(-0.5F, 0F, 0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 161
		bodyModel[103].setRotationPoint(-44F, -29.7F, -21.5F);

		bodyModel[104].addShapeBox(-0.5F, 0F, 0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 162
		bodyModel[104].setRotationPoint(-44F, -37.5F, -21.5F);

		bodyModel[105].addShapeBox(-0.5F, 0F, 0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 163
		bodyModel[105].setRotationPoint(-43.5F, -37.5F, -9.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 170
		bodyModel[106].setRotationPoint(-18.5F, -30.3F, -15F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 171
		bodyModel[107].setRotationPoint(-21.5F, -33.3F, 10F);

		bodyModel[108].addShapeBox(-0.5F, 0F, -0.5F, 1, 34, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 175
		bodyModel[108].setRotationPoint(-55F, -64.5F, 1.5F);

		bodyModel[109].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 176
		bodyModel[109].setRotationPoint(-55F, -30.5F, 1.5F);

		bodyModel[110].addShapeBox(-0.5F, 0F, -0.5F, 1, 34, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 177
		bodyModel[110].setRotationPoint(-49F, -64.5F, 14.5F);

		bodyModel[111].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 178
		bodyModel[111].setRotationPoint(-49F, -30.5F, 14.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 207
		bodyModel[112].setRotationPoint(20.7F, -15.5F, 26.1F);

		bodyModel[113].addShapeBox(0F, 0F, -1F, 1, 3, 3, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F); // Box 208
		bodyModel[113].setRotationPoint(20.7F, -18F, 26.1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 183
		bodyModel[114].setRotationPoint(20.7F, -15.5F, -27.1F);

		bodyModel[115].addShapeBox(0F, 0F, 1F, 1, 3, 3, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F); // Box 184
		bodyModel[115].setRotationPoint(20.7F, -18F, -29.1F);

		bodyModel[116].addShapeBox(0F, 2F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[116].setRotationPoint(-40F, -28F, -27.49F);
		bodyModel[116].rotateAngleX = 0.52359878F;

		bodyModel[117].addShapeBox(0F, 2F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[117].setRotationPoint(-32F, -28F, -27.49F);
		bodyModel[117].rotateAngleX = 0.52359878F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 127, 1, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[118].setRotationPoint(-109.5F, -12.01F, 21F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[119].setRotationPoint(-115F, -9.01F, 21F);
		bodyModel[119].rotateAngleZ = 0.50614548F;

		bodyModel[120].addShapeBox(0F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[120].setRotationPoint(-115F, -9.01F, 21F);
		bodyModel[120].rotateAngleZ = -1.78023584F;

		bodyModel[121].addShapeBox(4F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[121].setRotationPoint(-116.6F, -9.01F, 21F);
		bodyModel[121].rotateAngleZ = -1.36135682F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 16, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[122].setRotationPoint(-115F, -1.4F, 21F);
		bodyModel[122].rotateAngleZ = 0.85870199F;

		bodyModel[123].addShapeBox(0F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[123].setRotationPoint(-103F, 8.99F, 21F);
		bodyModel[123].rotateAngleZ = -0.27925268F;

		bodyModel[124].addShapeBox(0F, -1F, 0F, 104, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[124].setRotationPoint(-99.2F, 10.1F, 21F);

		bodyModel[125].addShapeBox(0F, -1F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[125].setRotationPoint(4.8F, 10.1F, 21F);
		bodyModel[125].rotateAngleZ = 0.26179939F;

		bodyModel[126].addShapeBox(0F, -1F, 0F, 14, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[126].setRotationPoint(7.6F, 9.4F, 21F);
		bodyModel[126].rotateAngleZ = 0.52359878F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[127].setRotationPoint(22.6F, -4.7F, 21F);
		bodyModel[127].rotateAngleZ = -0.25481807F;

		bodyModel[128].addShapeBox(-1F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[128].setRotationPoint(17.6F, -11F, 21F);
		bodyModel[128].rotateAngleZ = 1.0559242F;

		bodyModel[129].addShapeBox(-1F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, -0.1F, 0F, 0F); // Box 293
		bodyModel[129].setRotationPoint(21.1F, -9F, 21F);
		bodyModel[129].rotateAngleZ = 0.44505896F;

		bodyModel[130].addShapeBox(-1F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 294
		bodyModel[130].setRotationPoint(22.6F, -0.7F, 21F);
		bodyModel[130].rotateAngleZ = -0.76096355F;

		bodyModel[131].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 301
		bodyModel[131].setRotationPoint(-95.2F, -4F, 24.5F);

		bodyModel[132].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 311
		bodyModel[132].setRotationPoint(-65.2F, -4F, 24.5F);

		bodyModel[133].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 318
		bodyModel[133].setRotationPoint(-36.2F, -4F, 24.5F);

		bodyModel[134].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 325
		bodyModel[134].setRotationPoint(-8.2F, -4F, 24.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 127, 1, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[135].setRotationPoint(-109.5F, -12.01F, -29F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[136].setRotationPoint(-115F, -9.01F, -29F);
		bodyModel[136].rotateAngleZ = 0.50614548F;

		bodyModel[137].addShapeBox(0F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[137].setRotationPoint(-115F, -9.01F, -29F);
		bodyModel[137].rotateAngleZ = -1.78023584F;

		bodyModel[138].addShapeBox(4F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[138].setRotationPoint(-116.6F, -9.01F, -29F);
		bodyModel[138].rotateAngleZ = -1.36135682F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 16, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[139].setRotationPoint(-115F, -1.4F, -29F);
		bodyModel[139].rotateAngleZ = 0.85870199F;

		bodyModel[140].addShapeBox(0F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[140].setRotationPoint(-103F, 8.99F, -29F);
		bodyModel[140].rotateAngleZ = -0.27925268F;

		bodyModel[141].addShapeBox(0F, -1F, 0F, 104, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[141].setRotationPoint(-99.2F, 10.1F, -29F);

		bodyModel[142].addShapeBox(0F, -1F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[142].setRotationPoint(4.8F, 10.1F, -29F);
		bodyModel[142].rotateAngleZ = 0.26179939F;

		bodyModel[143].addShapeBox(0F, -1F, 0F, 14, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[143].setRotationPoint(7.6F, 9.4F, -29F);
		bodyModel[143].rotateAngleZ = 0.52359878F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[144].setRotationPoint(22.6F, -4.7F, -29F);
		bodyModel[144].rotateAngleZ = -0.25481807F;

		bodyModel[145].addShapeBox(-1F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[145].setRotationPoint(17.6F, -11F, -29F);
		bodyModel[145].rotateAngleZ = 1.0559242F;

		bodyModel[146].addShapeBox(-1F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, -0.1F, 0F, 0F); // Box 340
		bodyModel[146].setRotationPoint(21.1F, -9F, -29F);
		bodyModel[146].rotateAngleZ = 0.44505896F;

		bodyModel[147].addShapeBox(-1F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 341
		bodyModel[147].setRotationPoint(22.6F, -0.7F, -29F);
		bodyModel[147].rotateAngleZ = -0.76096355F;

		bodyModel[148].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 348
		bodyModel[148].setRotationPoint(-95.2F, -4F, -25.5F);

		bodyModel[149].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 358
		bodyModel[149].setRotationPoint(-65.2F, -4F, -25.5F);

		bodyModel[150].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 365
		bodyModel[150].setRotationPoint(-36.2F, -4F, -25.5F);

		bodyModel[151].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 372
		bodyModel[151].setRotationPoint(-8.2F, -4F, -25.5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 52
		barrelModel[1] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 53
		barrelModel[2] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 54
		barrelModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 55
		barrelModel[4] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 56
		barrelModel[5] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 57
		barrelModel[6] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 58
		barrelModel[7] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 59
		barrelModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 60
		barrelModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 61
		barrelModel[10] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 62
		barrelModel[11] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 63

		barrelModel[0].addShapeBox(2F, -6.5F, -6.5F, 2, 13, 13, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 52
		barrelModel[0].setRotationPoint(7F, -18.5F, 0F);

		barrelModel[1].addShapeBox(-2F, -6.5F, -6.5F, 4, 13, 13, 0F,0F, 3F, 3F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 3F, 3F); // Box 53
		barrelModel[1].setRotationPoint(7F, -18.5F, 0F);

		barrelModel[2].addShapeBox(-8F, -6.5F, -6.5F, 6, 13, 13, 0F,0F, 3.5F, 3.5F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3.5F, 3.5F, 0F, 3.5F, 3.5F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3.5F, 3.5F); // Box 54
		barrelModel[2].setRotationPoint(7F, -18.5F, 0F);

		barrelModel[3].addShapeBox(2.3F, -4.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		barrelModel[3].setRotationPoint(7F, -18.5F, 0F);

		barrelModel[4].addShapeBox(4F, 0F, 0F, 92, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -1.5F, -1.5F, 0F, -1F, -1F); // Box 56
		barrelModel[4].setRotationPoint(7F, -18.5F, 0F);

		barrelModel[5].addShapeBox(4F, -2.99F, 0F, 92, 3, 3, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F); // Box 57
		barrelModel[5].setRotationPoint(7F, -18.5F, 0F);

		barrelModel[6].addShapeBox(4F, 0F, -0.01F, 92, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.5F, -1.5F, 0F, -0.7F, 0F, 0F, 0F, 0F); // Box 58
		barrelModel[6].setRotationPoint(7F, -18.5F, -3F);

		barrelModel[7].addShapeBox(4F, -2.99F, -0.01F, 92, 3, 3, 0F,0F, -1F, -1F, 0F, -1.5F, -1.5F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		barrelModel[7].setRotationPoint(7F, -18.5F, -3F);

		barrelModel[8].addShapeBox(95.5F, -2.5F, -2.5F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		barrelModel[8].setRotationPoint(7F, -18.5F, 0F);

		barrelModel[9].addShapeBox(96.5F, -2.5F, -2.5F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 61
		barrelModel[9].setRotationPoint(7F, -18.5F, 0F);

		barrelModel[10].addShapeBox(98.5F, -2.5F, -3F, 8, 5, 6, 0F,0F, 0F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0F, 0F); // Box 62
		barrelModel[10].setRotationPoint(7F, -18.5F, 0F);

		barrelModel[11].addShapeBox(106.5F, -2.5F, -3F, 1, 5, 6, 0F,0F, 0.2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.8F); // Box 63
		barrelModel[11].setRotationPoint(7F, -18.5F, 0F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 295
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 296
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 297
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 298
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 299
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 300
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 302
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 303
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 304
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 305
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 306
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 307
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 308
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 309
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 310
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 312
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 313
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 314
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 315
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 316
		leftBackWheelModel[20] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 317
		leftBackWheelModel[21] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 319
		leftBackWheelModel[22] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 320
		leftBackWheelModel[23] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 321
		leftBackWheelModel[24] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 322
		leftBackWheelModel[25] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 323
		leftBackWheelModel[26] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 324
		leftBackWheelModel[27] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 326
		leftBackWheelModel[28] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 327
		leftBackWheelModel[29] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 328
		leftBackWheelModel[30] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 342
		leftBackWheelModel[31] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 343
		leftBackWheelModel[32] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 344
		leftBackWheelModel[33] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 345
		leftBackWheelModel[34] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 346
		leftBackWheelModel[35] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 347
		leftBackWheelModel[36] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 349
		leftBackWheelModel[37] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 350
		leftBackWheelModel[38] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 351
		leftBackWheelModel[39] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 352
		leftBackWheelModel[40] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 353
		leftBackWheelModel[41] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 354
		leftBackWheelModel[42] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 355
		leftBackWheelModel[43] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 356
		leftBackWheelModel[44] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 357
		leftBackWheelModel[45] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 359
		leftBackWheelModel[46] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 360
		leftBackWheelModel[47] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 361
		leftBackWheelModel[48] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 362
		leftBackWheelModel[49] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 363
		leftBackWheelModel[50] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 364
		leftBackWheelModel[51] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 366
		leftBackWheelModel[52] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 367
		leftBackWheelModel[53] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 368
		leftBackWheelModel[54] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 369
		leftBackWheelModel[55] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 370
		leftBackWheelModel[56] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 371
		leftBackWheelModel[57] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 373
		leftBackWheelModel[58] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 374
		leftBackWheelModel[59] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 375

		leftBackWheelModel[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		leftBackWheelModel[0].setRotationPoint(-99.2F, 4F, 21F);

		leftBackWheelModel[1].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 296
		leftBackWheelModel[1].setRotationPoint(-99.2F, 4F, 21F);

		leftBackWheelModel[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		leftBackWheelModel[2].setRotationPoint(-99.2F, 4F, 21F);

		leftBackWheelModel[3].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		leftBackWheelModel[3].setRotationPoint(-82.2F, 4F, 21F);

		leftBackWheelModel[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		leftBackWheelModel[4].setRotationPoint(-82.2F, 4F, 21F);

		leftBackWheelModel[5].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 300
		leftBackWheelModel[5].setRotationPoint(-82.2F, 4F, 21F);

		leftBackWheelModel[6].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		leftBackWheelModel[6].setRotationPoint(-108.5F, -5F, 21F);

		leftBackWheelModel[7].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 303
		leftBackWheelModel[7].setRotationPoint(-108.5F, -5F, 21F);

		leftBackWheelModel[8].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		leftBackWheelModel[8].setRotationPoint(-108.5F, -5F, 21F);

		leftBackWheelModel[9].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 305
		leftBackWheelModel[9].setRotationPoint(-52.2F, 4F, 21F);

		leftBackWheelModel[10].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		leftBackWheelModel[10].setRotationPoint(-52.2F, 4F, 21F);

		leftBackWheelModel[11].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		leftBackWheelModel[11].setRotationPoint(-52.2F, 4F, 21F);

		leftBackWheelModel[12].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 308
		leftBackWheelModel[12].setRotationPoint(-69.2F, 4F, 21F);

		leftBackWheelModel[13].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		leftBackWheelModel[13].setRotationPoint(-69.2F, 4F, 21F);

		leftBackWheelModel[14].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		leftBackWheelModel[14].setRotationPoint(-69.2F, 4F, 21F);

		leftBackWheelModel[15].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 312
		leftBackWheelModel[15].setRotationPoint(-23.2F, 4F, 21F);

		leftBackWheelModel[16].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		leftBackWheelModel[16].setRotationPoint(-23.2F, 4F, 21F);

		leftBackWheelModel[17].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		leftBackWheelModel[17].setRotationPoint(-23.2F, 4F, 21F);

		leftBackWheelModel[18].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 315
		leftBackWheelModel[18].setRotationPoint(-40.2F, 4F, 21F);

		leftBackWheelModel[19].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		leftBackWheelModel[19].setRotationPoint(-40.2F, 4F, 21F);

		leftBackWheelModel[20].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		leftBackWheelModel[20].setRotationPoint(-40.2F, 4F, 21F);

		leftBackWheelModel[21].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 319
		leftBackWheelModel[21].setRotationPoint(4.8F, 4F, 21F);

		leftBackWheelModel[22].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		leftBackWheelModel[22].setRotationPoint(4.8F, 4F, 21F);

		leftBackWheelModel[23].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		leftBackWheelModel[23].setRotationPoint(4.8F, 4F, 21F);

		leftBackWheelModel[24].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 322
		leftBackWheelModel[24].setRotationPoint(-12.2F, 4F, 21F);

		leftBackWheelModel[25].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		leftBackWheelModel[25].setRotationPoint(-12.2F, 4F, 21F);

		leftBackWheelModel[26].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		leftBackWheelModel[26].setRotationPoint(-12.2F, 4F, 21F);

		leftBackWheelModel[27].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		leftBackWheelModel[27].setRotationPoint(16.5F, -4F, 21F);

		leftBackWheelModel[28].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 327
		leftBackWheelModel[28].setRotationPoint(16.5F, -4F, 21F);

		leftBackWheelModel[29].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		leftBackWheelModel[29].setRotationPoint(16.5F, -4F, 21F);

		leftBackWheelModel[30].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		leftBackWheelModel[30].setRotationPoint(-99.2F, 4F, -29F);

		leftBackWheelModel[31].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 343
		leftBackWheelModel[31].setRotationPoint(-99.2F, 4F, -29F);

		leftBackWheelModel[32].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		leftBackWheelModel[32].setRotationPoint(-99.2F, 4F, -29F);

		leftBackWheelModel[33].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftBackWheelModel[33].setRotationPoint(-82.2F, 4F, -29F);

		leftBackWheelModel[34].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		leftBackWheelModel[34].setRotationPoint(-82.2F, 4F, -29F);

		leftBackWheelModel[35].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 347
		leftBackWheelModel[35].setRotationPoint(-82.2F, 4F, -29F);

		leftBackWheelModel[36].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		leftBackWheelModel[36].setRotationPoint(-108.5F, -5F, -29F);

		leftBackWheelModel[37].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 350
		leftBackWheelModel[37].setRotationPoint(-108.5F, -5F, -29F);

		leftBackWheelModel[38].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		leftBackWheelModel[38].setRotationPoint(-108.5F, -5F, -29F);

		leftBackWheelModel[39].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 352
		leftBackWheelModel[39].setRotationPoint(-52.2F, 4F, -29F);

		leftBackWheelModel[40].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		leftBackWheelModel[40].setRotationPoint(-52.2F, 4F, -29F);

		leftBackWheelModel[41].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		leftBackWheelModel[41].setRotationPoint(-52.2F, 4F, -29F);

		leftBackWheelModel[42].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 355
		leftBackWheelModel[42].setRotationPoint(-69.2F, 4F, -29F);

		leftBackWheelModel[43].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		leftBackWheelModel[43].setRotationPoint(-69.2F, 4F, -29F);

		leftBackWheelModel[44].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		leftBackWheelModel[44].setRotationPoint(-69.2F, 4F, -29F);

		leftBackWheelModel[45].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 359
		leftBackWheelModel[45].setRotationPoint(-23.2F, 4F, -29F);

		leftBackWheelModel[46].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		leftBackWheelModel[46].setRotationPoint(-23.2F, 4F, -29F);

		leftBackWheelModel[47].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		leftBackWheelModel[47].setRotationPoint(-23.2F, 4F, -29F);

		leftBackWheelModel[48].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 362
		leftBackWheelModel[48].setRotationPoint(-40.2F, 4F, -29F);

		leftBackWheelModel[49].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		leftBackWheelModel[49].setRotationPoint(-40.2F, 4F, -29F);

		leftBackWheelModel[50].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		leftBackWheelModel[50].setRotationPoint(-40.2F, 4F, -29F);

		leftBackWheelModel[51].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 366
		leftBackWheelModel[51].setRotationPoint(4.8F, 4F, -29F);

		leftBackWheelModel[52].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		leftBackWheelModel[52].setRotationPoint(4.8F, 4F, -29F);

		leftBackWheelModel[53].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		leftBackWheelModel[53].setRotationPoint(4.8F, 4F, -29F);

		leftBackWheelModel[54].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 369
		leftBackWheelModel[54].setRotationPoint(-12.2F, 4F, -29F);

		leftBackWheelModel[55].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		leftBackWheelModel[55].setRotationPoint(-12.2F, 4F, -29F);

		leftBackWheelModel[56].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		leftBackWheelModel[56].setRotationPoint(-12.2F, 4F, -29F);

		leftBackWheelModel[57].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		leftBackWheelModel[57].setRotationPoint(16.5F, -4F, -29F);

		leftBackWheelModel[58].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 374
		leftBackWheelModel[58].setRotationPoint(16.5F, -4F, -29F);

		leftBackWheelModel[59].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		leftBackWheelModel[59].setRotationPoint(16.5F, -4F, -29F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 248
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 249
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 250
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 251
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 252
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 253
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 255
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 256
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 257
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 258
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 259
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 260
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 261
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 262
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 263
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 265
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 266
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 267
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 268
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 269
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 270
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 272
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 273
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 274
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 275
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 276
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 277
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 279
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 280
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 281

		leftTrackWheelModels[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftTrackWheelModels[0].setRotationPoint(-99.2F, 4F, 31F);

		leftTrackWheelModels[1].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 249
		leftTrackWheelModels[1].setRotationPoint(-99.2F, 4F, 31F);

		leftTrackWheelModels[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftTrackWheelModels[2].setRotationPoint(-99.2F, 4F, 31F);

		leftTrackWheelModels[3].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		leftTrackWheelModels[3].setRotationPoint(-82.2F, 4F, 31F);

		leftTrackWheelModels[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		leftTrackWheelModels[4].setRotationPoint(-82.2F, 4F, 31F);

		leftTrackWheelModels[5].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 253
		leftTrackWheelModels[5].setRotationPoint(-82.2F, 4F, 31F);

		leftTrackWheelModels[6].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		leftTrackWheelModels[6].setRotationPoint(-108.5F, -5F, 31F);

		leftTrackWheelModels[7].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 256
		leftTrackWheelModels[7].setRotationPoint(-108.5F, -5F, 31F);

		leftTrackWheelModels[8].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		leftTrackWheelModels[8].setRotationPoint(-108.5F, -5F, 31F);

		leftTrackWheelModels[9].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 258
		leftTrackWheelModels[9].setRotationPoint(-52.2F, 4F, 31F);

		leftTrackWheelModels[10].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		leftTrackWheelModels[10].setRotationPoint(-52.2F, 4F, 31F);

		leftTrackWheelModels[11].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		leftTrackWheelModels[11].setRotationPoint(-52.2F, 4F, 31F);

		leftTrackWheelModels[12].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 261
		leftTrackWheelModels[12].setRotationPoint(-69.2F, 4F, 31F);

		leftTrackWheelModels[13].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		leftTrackWheelModels[13].setRotationPoint(-69.2F, 4F, 31F);

		leftTrackWheelModels[14].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		leftTrackWheelModels[14].setRotationPoint(-69.2F, 4F, 31F);

		leftTrackWheelModels[15].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 265
		leftTrackWheelModels[15].setRotationPoint(-23.2F, 4F, 31F);

		leftTrackWheelModels[16].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		leftTrackWheelModels[16].setRotationPoint(-23.2F, 4F, 31F);

		leftTrackWheelModels[17].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		leftTrackWheelModels[17].setRotationPoint(-23.2F, 4F, 31F);

		leftTrackWheelModels[18].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 268
		leftTrackWheelModels[18].setRotationPoint(-40.2F, 4F, 31F);

		leftTrackWheelModels[19].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftTrackWheelModels[19].setRotationPoint(-40.2F, 4F, 31F);

		leftTrackWheelModels[20].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		leftTrackWheelModels[20].setRotationPoint(-40.2F, 4F, 31F);

		leftTrackWheelModels[21].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 272
		leftTrackWheelModels[21].setRotationPoint(4.8F, 4F, 31F);

		leftTrackWheelModels[22].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		leftTrackWheelModels[22].setRotationPoint(4.8F, 4F, 31F);

		leftTrackWheelModels[23].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		leftTrackWheelModels[23].setRotationPoint(4.8F, 4F, 31F);

		leftTrackWheelModels[24].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 275
		leftTrackWheelModels[24].setRotationPoint(-12.2F, 4F, 31F);

		leftTrackWheelModels[25].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		leftTrackWheelModels[25].setRotationPoint(-12.2F, 4F, 31F);

		leftTrackWheelModels[26].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		leftTrackWheelModels[26].setRotationPoint(-12.2F, 4F, 31F);

		leftTrackWheelModels[27].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		leftTrackWheelModels[27].setRotationPoint(16.5F, -4F, 31F);

		leftTrackWheelModels[28].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 280
		leftTrackWheelModels[28].setRotationPoint(16.5F, -4F, 31F);

		leftTrackWheelModels[29].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		leftTrackWheelModels[29].setRotationPoint(16.5F, -4F, 31F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 201
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 202
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 203
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 204
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 205
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 206
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 208
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 209
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 210
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 211
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 212
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 213
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 214
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 215
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 216
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 218
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 219
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 220
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 221
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 222
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 223
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 225
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 226
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 227
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 228
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 229
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 230
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 232
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 233
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 234

		rightTrackWheelModels[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		rightTrackWheelModels[0].setRotationPoint(-99.2F, 4F, -39F);

		rightTrackWheelModels[1].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 202
		rightTrackWheelModels[1].setRotationPoint(-99.2F, 4F, -39F);

		rightTrackWheelModels[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		rightTrackWheelModels[2].setRotationPoint(-99.2F, 4F, -39F);

		rightTrackWheelModels[3].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		rightTrackWheelModels[3].setRotationPoint(-82.2F, 4F, -39F);

		rightTrackWheelModels[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		rightTrackWheelModels[4].setRotationPoint(-82.2F, 4F, -39F);

		rightTrackWheelModels[5].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 206
		rightTrackWheelModels[5].setRotationPoint(-82.2F, 4F, -39F);

		rightTrackWheelModels[6].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		rightTrackWheelModels[6].setRotationPoint(-108.5F, -5F, -39F);

		rightTrackWheelModels[7].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 209
		rightTrackWheelModels[7].setRotationPoint(-108.5F, -5F, -39F);

		rightTrackWheelModels[8].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightTrackWheelModels[8].setRotationPoint(-108.5F, -5F, -39F);

		rightTrackWheelModels[9].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 211
		rightTrackWheelModels[9].setRotationPoint(-52.2F, 4F, -39F);

		rightTrackWheelModels[10].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightTrackWheelModels[10].setRotationPoint(-52.2F, 4F, -39F);

		rightTrackWheelModels[11].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		rightTrackWheelModels[11].setRotationPoint(-52.2F, 4F, -39F);

		rightTrackWheelModels[12].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 214
		rightTrackWheelModels[12].setRotationPoint(-69.2F, 4F, -39F);

		rightTrackWheelModels[13].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		rightTrackWheelModels[13].setRotationPoint(-69.2F, 4F, -39F);

		rightTrackWheelModels[14].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		rightTrackWheelModels[14].setRotationPoint(-69.2F, 4F, -39F);

		rightTrackWheelModels[15].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 218
		rightTrackWheelModels[15].setRotationPoint(-23.2F, 4F, -39F);

		rightTrackWheelModels[16].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		rightTrackWheelModels[16].setRotationPoint(-23.2F, 4F, -39F);

		rightTrackWheelModels[17].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightTrackWheelModels[17].setRotationPoint(-23.2F, 4F, -39F);

		rightTrackWheelModels[18].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 221
		rightTrackWheelModels[18].setRotationPoint(-40.2F, 4F, -39F);

		rightTrackWheelModels[19].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		rightTrackWheelModels[19].setRotationPoint(-40.2F, 4F, -39F);

		rightTrackWheelModels[20].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		rightTrackWheelModels[20].setRotationPoint(-40.2F, 4F, -39F);

		rightTrackWheelModels[21].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 225
		rightTrackWheelModels[21].setRotationPoint(4.8F, 4F, -39F);

		rightTrackWheelModels[22].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		rightTrackWheelModels[22].setRotationPoint(4.8F, 4F, -39F);

		rightTrackWheelModels[23].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightTrackWheelModels[23].setRotationPoint(4.8F, 4F, -39F);

		rightTrackWheelModels[24].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 228
		rightTrackWheelModels[24].setRotationPoint(-12.2F, 4F, -39F);

		rightTrackWheelModels[25].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightTrackWheelModels[25].setRotationPoint(-12.2F, 4F, -39F);

		rightTrackWheelModels[26].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		rightTrackWheelModels[26].setRotationPoint(-12.2F, 4F, -39F);

		rightTrackWheelModels[27].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		rightTrackWheelModels[27].setRotationPoint(16.5F, -4F, -39F);

		rightTrackWheelModels[28].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 233
		rightTrackWheelModels[28].setRotationPoint(16.5F, -4F, -39F);

		rightTrackWheelModels[29].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		rightTrackWheelModels[29].setRotationPoint(16.5F, -4F, -39F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 169, 265, textureX, textureY); // Box 72
		leftTrackModel[1] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Box 73
		leftTrackModel[2] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 74
		leftTrackModel[3] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 75
		leftTrackModel[4] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 76
		leftTrackModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 77
		leftTrackModel[6] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 90
		leftTrackModel[7] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 181
		leftTrackModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 182
		leftTrackModel[9] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 235
		leftTrackModel[10] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 236
		leftTrackModel[11] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 237
		leftTrackModel[12] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 238
		leftTrackModel[13] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Box 239
		leftTrackModel[14] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 240
		leftTrackModel[15] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Box 241
		leftTrackModel[16] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 242
		leftTrackModel[17] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 243
		leftTrackModel[18] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 244
		leftTrackModel[19] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 245
		leftTrackModel[20] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 246
		leftTrackModel[21] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 247
		leftTrackModel[22] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 254
		leftTrackModel[23] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 264
		leftTrackModel[24] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 271
		leftTrackModel[25] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 278

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 94, 9, 13, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -6.5F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -6.5F, 0F, 0F, 0F, 0F, 0F); // Box 72
		leftTrackModel[0].setRotationPoint(-114.5F, -22.01F, 29F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 51, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftTrackModel[1].setRotationPoint(-27.5F, -14.01F, 28F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, -4F, 1F, 0F); // Box 74
		leftTrackModel[2].setRotationPoint(22.5F, -14.01F, 28.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 137, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 75
		leftTrackModel[3].setRotationPoint(-113.5F, -14.01F, 41.49F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 140, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -13F, 0.5F, 0F, -13F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 76
		leftTrackModel[4].setRotationPoint(-112.5F, -7.5F, 41.49F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		leftTrackModel[5].setRotationPoint(-113.49F, -7.5F, 41.49F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 6F, 0F, 7.5F); // Box 90
		leftTrackModel[6].setRotationPoint(-21.01F, -22.01F, 28.51F);

		leftTrackModel[7].addShapeBox(0F, 0F, -1F, 1, 3, 3, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F); // Box 181
		leftTrackModel[7].setRotationPoint(20.7F, -18F, 29.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 182
		leftTrackModel[8].setRotationPoint(20.7F, -15.5F, 29.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 127, 1, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 235
		leftTrackModel[9].setRotationPoint(-109.5F, -12.01F, 31F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		leftTrackModel[10].setRotationPoint(-115F, -9.01F, 31F);
		leftTrackModel[10].rotateAngleZ = 0.50614548F;

		leftTrackModel[11].addShapeBox(0F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		leftTrackModel[11].setRotationPoint(-115F, -9.01F, 31F);
		leftTrackModel[11].rotateAngleZ = -1.78023584F;

		leftTrackModel[12].addShapeBox(4F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		leftTrackModel[12].setRotationPoint(-116.6F, -9.01F, 31F);
		leftTrackModel[12].rotateAngleZ = -1.36135682F;

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 1, 16, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		leftTrackModel[13].setRotationPoint(-115F, -1.4F, 31F);
		leftTrackModel[13].rotateAngleZ = 0.85870199F;

		leftTrackModel[14].addShapeBox(0F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		leftTrackModel[14].setRotationPoint(-103F, 8.99F, 31F);
		leftTrackModel[14].rotateAngleZ = -0.27925268F;

		leftTrackModel[15].addShapeBox(0F, -1F, 0F, 104, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		leftTrackModel[15].setRotationPoint(-99.2F, 10.1F, 31F);

		leftTrackModel[16].addShapeBox(0F, -1F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		leftTrackModel[16].setRotationPoint(4.8F, 10.1F, 31F);
		leftTrackModel[16].rotateAngleZ = 0.26179939F;

		leftTrackModel[17].addShapeBox(0F, -1F, 0F, 14, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftTrackModel[17].setRotationPoint(7.6F, 9.4F, 31F);
		leftTrackModel[17].rotateAngleZ = 0.52359878F;

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		leftTrackModel[18].setRotationPoint(22.6F, -4.7F, 31F);
		leftTrackModel[18].rotateAngleZ = -0.25481807F;

		leftTrackModel[19].addShapeBox(-1F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		leftTrackModel[19].setRotationPoint(17.6F, -11F, 31F);
		leftTrackModel[19].rotateAngleZ = 1.0559242F;

		leftTrackModel[20].addShapeBox(-1F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, -0.1F, 0F, 0F); // Box 246
		leftTrackModel[20].setRotationPoint(21.1F, -9F, 31F);
		leftTrackModel[20].rotateAngleZ = 0.44505896F;

		leftTrackModel[21].addShapeBox(-1F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 247
		leftTrackModel[21].setRotationPoint(22.6F, -0.7F, 31F);
		leftTrackModel[21].rotateAngleZ = -0.76096355F;

		leftTrackModel[22].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 254
		leftTrackModel[22].setRotationPoint(-95.2F, -4F, 34.5F);

		leftTrackModel[23].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 264
		leftTrackModel[23].setRotationPoint(-65.2F, -4F, 34.5F);

		leftTrackModel[24].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 271
		leftTrackModel[24].setRotationPoint(-36.2F, -4F, 34.5F);

		leftTrackModel[25].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 278
		leftTrackModel[25].setRotationPoint(-8.2F, -4F, 34.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 66
		rightTrackModel[1] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 67
		rightTrackModel[2] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 68
		rightTrackModel[3] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 69
		rightTrackModel[4] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Box 70
		rightTrackModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 71
		rightTrackModel[6] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 91
		rightTrackModel[7] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 188
		rightTrackModel[8] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 189
		rightTrackModel[9] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 190
		rightTrackModel[10] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 191
		rightTrackModel[11] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Box 192
		rightTrackModel[12] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 193
		rightTrackModel[13] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Box 194
		rightTrackModel[14] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 195
		rightTrackModel[15] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 196
		rightTrackModel[16] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 197
		rightTrackModel[17] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 198
		rightTrackModel[18] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 199
		rightTrackModel[19] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 200
		rightTrackModel[20] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 207
		rightTrackModel[21] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 217
		rightTrackModel[22] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 224
		rightTrackModel[23] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 231

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 94, 9, 13, 0F,0F, -8F, 0F, -6.5F, -8F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -6.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 66
		rightTrackModel[0].setRotationPoint(-114.5F, -22.01F, -42F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 51, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		rightTrackModel[1].setRotationPoint(-27.5F, -14.01F, -42F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, -4F, 1F, 0F); // Box 68
		rightTrackModel[2].setRotationPoint(22.5F, -14.01F, -41.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 137, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 69
		rightTrackModel[3].setRotationPoint(-113.5F, -14.01F, -42.49F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 140, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -13F, 0.5F, 0F, -13F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 70
		rightTrackModel[4].setRotationPoint(-112.5F, -7.5F, -42.49F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 71
		rightTrackModel[5].setRotationPoint(-113.49F, -7.5F, -42.49F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,0F, 0F, -6F, 0F, -8F, -6F, 0F, -8F, 0F, 0F, 0F, 0F, 6F, 0F, 7.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		rightTrackModel[6].setRotationPoint(-21.01F, -22.01F, -34.51F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 127, 1, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 188
		rightTrackModel[7].setRotationPoint(-109.5F, -12.01F, -39F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		rightTrackModel[8].setRotationPoint(-115F, -9.01F, -39F);
		rightTrackModel[8].rotateAngleZ = 0.50614548F;

		rightTrackModel[9].addShapeBox(0F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		rightTrackModel[9].setRotationPoint(-115F, -9.01F, -39F);
		rightTrackModel[9].rotateAngleZ = -1.78023584F;

		rightTrackModel[10].addShapeBox(4F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		rightTrackModel[10].setRotationPoint(-116.6F, -9.01F, -39F);
		rightTrackModel[10].rotateAngleZ = -1.36135682F;

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 1, 16, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		rightTrackModel[11].setRotationPoint(-115F, -1.4F, -39F);
		rightTrackModel[11].rotateAngleZ = 0.85870199F;

		rightTrackModel[12].addShapeBox(0F, -1F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		rightTrackModel[12].setRotationPoint(-103F, 8.99F, -39F);
		rightTrackModel[12].rotateAngleZ = -0.27925268F;

		rightTrackModel[13].addShapeBox(0F, -1F, 0F, 104, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		rightTrackModel[13].setRotationPoint(-99.2F, 10.1F, -39F);

		rightTrackModel[14].addShapeBox(0F, -1F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		rightTrackModel[14].setRotationPoint(4.8F, 10.1F, -39F);
		rightTrackModel[14].rotateAngleZ = 0.26179939F;

		rightTrackModel[15].addShapeBox(0F, -1F, 0F, 14, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		rightTrackModel[15].setRotationPoint(7.6F, 9.4F, -39F);
		rightTrackModel[15].rotateAngleZ = 0.52359878F;

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		rightTrackModel[16].setRotationPoint(22.6F, -4.7F, -39F);
		rightTrackModel[16].rotateAngleZ = -0.25481807F;

		rightTrackModel[17].addShapeBox(-1F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		rightTrackModel[17].setRotationPoint(17.6F, -11F, -39F);
		rightTrackModel[17].rotateAngleZ = 1.0559242F;

		rightTrackModel[18].addShapeBox(-1F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, -0.1F, 0F, 0F); // Box 199
		rightTrackModel[18].setRotationPoint(21.1F, -9F, -39F);
		rightTrackModel[18].rotateAngleZ = 0.44505896F;

		rightTrackModel[19].addShapeBox(-1F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 200
		rightTrackModel[19].setRotationPoint(22.6F, -0.7F, -39F);
		rightTrackModel[19].rotateAngleZ = -0.76096355F;

		rightTrackModel[20].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 207
		rightTrackModel[20].setRotationPoint(-95.2F, -4F, -35.5F);

		rightTrackModel[21].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 217
		rightTrackModel[21].setRotationPoint(-65.2F, -4F, -35.5F);

		rightTrackModel[22].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 224
		rightTrackModel[22].setRotationPoint(-36.2F, -4F, -35.5F);

		rightTrackModel[23].addShapeBox(-4.5F, -1.5F, 0F, 18, 8, 1, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 231
		rightTrackModel[23].setRotationPoint(-8.2F, -4F, -35.5F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[7];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 164
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 165
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 166
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 167
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 168
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 169
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 172

		gun_1_Model[0][0].addShapeBox(10F, 0F, -0.5F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 164

		gun_1_Model[0][1].addShapeBox(6F, -1F, -1F, 6, 1, 2, 0F,0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 165

		gun_1_Model[0][2].addShapeBox(12F, -1F, -0.5F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F); // Box 166

		gun_1_Model[0][3].addShapeBox(15.5F, -1F, -0.5F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 167

		gun_1_Model[0][4].addShapeBox(10.5F, -0.5F, 0F, 1, 1, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 168

		gun_1_Model[0][5].addShapeBox(10.5F, -0.8F, -0.2F, 1, 1, 3, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -2.6F, -0.3F, 0F, -2.6F, -0.3F, -0.5F, -0.6F, -0.3F, -0.5F, -0.6F, -0.3F, -0.5F, -0.6F, -0.3F, -0.5F, -0.6F); // Box 169

		gun_1_Model[0][6].addShapeBox(10.4F, -0.4F, -0.5F, 2, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 172

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(-53F, -40F, -13.5F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);
	}
}