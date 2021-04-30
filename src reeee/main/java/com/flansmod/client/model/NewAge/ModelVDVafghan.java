//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.10.2015 - 12:39:48
// Last changed on: 17.10.2015 - 12:39:48

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelVDVafghan extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelVDVafghan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[165];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[2];
		rightLegModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 12
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 130
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 131
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 132
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 133
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 39
		bodyModel[9] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 33
		bodyModel[11] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 121
		bodyModel[13] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 122
		bodyModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 126
		bodyModel[15] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 127
		bodyModel[16] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 103
		bodyModel[21] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 104
		bodyModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 105
		bodyModel[23] = new ModelRendererTurbo(this, 171, 73, textureX, textureY); // Box 108
		bodyModel[24] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 104
		bodyModel[25] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 107
		bodyModel[26] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 87
		bodyModel[27] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 88
		bodyModel[28] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 89
		bodyModel[29] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 90
		bodyModel[30] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 105
		bodyModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 109
		bodyModel[32] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 60
		bodyModel[33] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 61
		bodyModel[34] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 78
		bodyModel[35] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 79
		bodyModel[36] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 80
		bodyModel[37] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 81
		bodyModel[38] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 82
		bodyModel[39] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 83
		bodyModel[40] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 84
		bodyModel[41] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 85
		bodyModel[42] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 86
		bodyModel[43] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 87
		bodyModel[44] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 88
		bodyModel[45] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 89
		bodyModel[46] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 90
		bodyModel[47] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 91
		bodyModel[48] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 92
		bodyModel[49] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 93
		bodyModel[50] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 94
		bodyModel[51] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 95
		bodyModel[52] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 96
		bodyModel[53] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 98
		bodyModel[54] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 99
		bodyModel[55] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 106
		bodyModel[56] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 64
		bodyModel[57] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 7
		bodyModel[58] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 8
		bodyModel[59] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 85
		bodyModel[60] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 86
		bodyModel[61] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 87
		bodyModel[62] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 88
		bodyModel[63] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 89
		bodyModel[64] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 92
		bodyModel[65] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 93
		bodyModel[66] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 94
		bodyModel[67] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 95
		bodyModel[68] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 96
		bodyModel[69] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 97
		bodyModel[70] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 98
		bodyModel[71] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 100
		bodyModel[72] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 101
		bodyModel[73] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 102
		bodyModel[74] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 122
		bodyModel[75] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 129
		bodyModel[76] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 130
		bodyModel[77] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 24
		bodyModel[78] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 24
		bodyModel[79] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 25
		bodyModel[80] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 26
		bodyModel[81] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 29
		bodyModel[82] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 30
		bodyModel[83] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 31
		bodyModel[84] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 24
		bodyModel[85] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 24
		bodyModel[86] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 24
		bodyModel[87] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 27
		bodyModel[88] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 28
		bodyModel[89] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 67
		bodyModel[90] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 69
		bodyModel[91] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 70
		bodyModel[92] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 71
		bodyModel[93] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 72
		bodyModel[94] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 121
		bodyModel[95] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 122
		bodyModel[96] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 123
		bodyModel[97] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 124
		bodyModel[98] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 126
		bodyModel[99] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 127
		bodyModel[100] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 129
		bodyModel[101] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 130
		bodyModel[102] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 131
		bodyModel[103] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 132
		bodyModel[104] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 133
		bodyModel[105] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 134
		bodyModel[106] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 137
		bodyModel[107] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 138
		bodyModel[108] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 247
		bodyModel[109] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 248
		bodyModel[110] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 249
		bodyModel[111] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 251
		bodyModel[112] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 252
		bodyModel[113] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 253
		bodyModel[114] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 254
		bodyModel[115] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 255
		bodyModel[116] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 256
		bodyModel[117] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 257
		bodyModel[118] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 258
		bodyModel[119] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 259
		bodyModel[120] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 260
		bodyModel[121] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 261
		bodyModel[122] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 262
		bodyModel[123] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 263
		bodyModel[124] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 264
		bodyModel[125] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 265
		bodyModel[126] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 266
		bodyModel[127] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 267
		bodyModel[128] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 268
		bodyModel[129] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 269
		bodyModel[130] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 272
		bodyModel[131] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 273
		bodyModel[132] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 274
		bodyModel[133] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 275
		bodyModel[134] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 278
		bodyModel[135] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 279
		bodyModel[136] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 280
		bodyModel[137] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 281
		bodyModel[138] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 282
		bodyModel[139] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 283
		bodyModel[140] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 285
		bodyModel[141] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 286
		bodyModel[142] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 287
		bodyModel[143] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 288
		bodyModel[144] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 289
		bodyModel[145] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 290
		bodyModel[146] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 291
		bodyModel[147] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 292
		bodyModel[148] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 293
		bodyModel[149] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 10
		bodyModel[150] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 11
		bodyModel[151] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 12
		bodyModel[152] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 297
		bodyModel[153] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 298
		bodyModel[154] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 299
		bodyModel[155] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 300
		bodyModel[156] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 301
		bodyModel[157] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 302
		bodyModel[158] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 303
		bodyModel[159] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 304
		bodyModel[160] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 305
		bodyModel[161] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 306
		bodyModel[162] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 307
		bodyModel[163] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 308
		bodyModel[164] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 309

		bodyModel[0].addShapeBox(-4.3F, 8.05F, -2.55F, 9, 1, 5, 0F,-0.1F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F); // Box 12
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0.5F, 0.05F, -2.3F, 2, 2, 1, 0F,-0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.5F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2.5F, 0.05F, -2.3F, 2, 2, 1, 0F,0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0.5F, 0F); // Box 12
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.5F, 2.5F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 130
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.5F, 4.25F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 131
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.5F, 6F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 132
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-0.5F, 8F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 133
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.95F, 8.05F, -2.6F, 2, 1, 3, 0F,-0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F); // Box 13
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 2F, -2.15F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 39
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 1
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1.5F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 34
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3F, 0F, -2.54F, 7, 10, 5, 0F,0F, 0.2F, -0.3F, -5.75F, 0.2F, -0.3F, -5.75F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -7F, 0F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -7F, 0F, -0.3F); // Box 121
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(3.8F, 9.5F, -2F, 2, 4, 4, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 122
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(3.65F, 9F, -2F, 2, 1, 4, 0F,-0.35F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, -0.35F, 0.5F, 0.3F, -0.35F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.35F, 0F, 0.3F); // Box 126
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(3.65F, 10F, -2F, 2, 1, 4, 0F,-0.35F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, -1F, 0.3F, 0F, -0.6F, 0.3F, 0F, -0.6F, 0.3F, -0.35F, -1F, 0.3F); // Box 127
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.9F, 7.5F, -2.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addBox(-3.9F, 8.5F, -2.15F, 3, 2, 1, 0F); // Box 34
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addBox(0.9F, 7.5F, -2.2F, 3, 1, 1, 0F); // Box 35
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addBox(0.9F, 8.5F, -2.15F, 3, 2, 1, 0F); // Box 37
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(3.85F, 9.6F, -1.5F, 2, 4, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 103
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(3.7F, 10F, -0.500000000000001F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 104
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(3.75F, 10.5F, -0.500000000000001F, 2, 1, 1, 0F,0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F); // Box 105
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-1.5F, -0.1F, -2.05F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 108
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-1F, 1.95F, -2.3F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.17F, -0.2F, 0F, -0.17F, -0.2F, 0F, 0F, -0.8F, 0F, -0.15F, 0F, 0F, -0.04F, -0.6F, 0F, -0.04F, -0.6F, 0F, -0.15F, 0F, 0F); // Box 104
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(1F, 4.88F, -2.3F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.225F, -0.2F, 0F, -0.225F, -0.2F, 0F, 0F, -0.8F, 0F, -0.15F, 0F, 0F, -0.09F, -0.6F, 0F, -0.09F, -0.6F, 0F, -0.15F, 0F, 0F); // Box 107
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4F, 4.4F, -2.85F, 8, 5, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4.6F, 4.4F, -2.75F, 1, 5, 5, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -3.2F, -0.35F, -0.4F, -3.2F, -0.35F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, -0.35F, -0.4F, -1F, -0.35F); // Box 88
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(3.6F, 4.4F, -2.75F, 1, 5, 5, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -3.2F, -0.4F, -0.4F, -3.2F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, -0.4F, -0.4F, -1F, -0.4F); // Box 89
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2.75F, 5.3F, -3.9F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 90
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-2.75F, 4.9F, -3.9F, 2, 1, 1, 0F,-0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F); // Box 105
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-2.2F, 5.5F, -4.45F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Box 109
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3.05F, 1.8F, -2.9F, 1, 3, 1, 0F,-0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.4F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 60
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(2.05F, 1.8F, -2.9F, 1, 3, 1, 0F,-0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, 0F, 0F, -0.05F, -0.4F, 0F, -0.05F, -0.4F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 61
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-2.75F, 6.3F, -3.9F, 2, 2, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 78
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-2.55F, 8.3F, -3.9F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.4F, 0F, 0F); // Box 79
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-1F, 4.9F, -3.9F, 2, 1, 1, 0F,-0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F); // Box 80
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-1F, 5.3F, -3.9F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 81
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-1F, 6.3F, -3.9F, 2, 2, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 82
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-0.8F, 8.3F, -3.9F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.4F, 0F, 0F); // Box 83
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-0.45F, 5.5F, -4.45F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Box 84
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(0.75F, 4.9F, -3.9F, 2, 1, 1, 0F,-0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F); // Box 85
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(0.75F, 5.3F, -3.9F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 86
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(0.75F, 6.3F, -3.9F, 2, 2, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 87
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(0.95F, 8.3F, -3.9F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.4F, 0F, 0F); // Box 88
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(1.3F, 5.5F, -4.45F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Box 89
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3.55F, 5.9F, -3.75F, 1, 3, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 90
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(2.55F, 5.9F, -3.75F, 1, 3, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 91
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-3.55F, 8.3F, -3.75F, 1, 1, 1, 0F,-0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 92
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(2.55F, 8.3F, -3.75F, 1, 1, 1, 0F,-0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 93
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-3.55F, 5.3F, -3.75F, 1, 1, 1, 0F,-0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F); // Box 94
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3.55F, 5.3F, -3.75F, 1, 1, 1, 0F,-0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 95
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(2.55F, 5.3F, -3.75F, 1, 1, 1, 0F,-0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F); // Box 96
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-3.05F, -0.4F, -2.05F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 98
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(2.05F, -0.4F, -2F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 99
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(0.0499999999999998F, -0.4F, 1.75F, 3, 3, 1, 0F,-2.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.25F, -2.2F, 0F, -0.25F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-4F, -0.249999999999999F, -2.5F, 4, 2, 5, 0F,0F, 0F, -0.2F, -1.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.05F, 0.1F, -1.5F, -0.05F, 0.1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 64
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(0F, -0.249999999999999F, -2.5F, 4, 2, 5, 0F,-1.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.5F, -0.05F, 0.1F, 0F, -0.05F, 0.1F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 7
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-4F, 8.05F, -2.8F, 8, 2, 1, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 8
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-4F, 1.05F, -2.8F, 8, 5, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 85
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-4F, 6.05F, -2.8F, 8, 2, 1, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 86
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-3F, 10.05F, -2.8F, 6, 2, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F); // Box 87
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-4F, 1.05F, 1.8F, 8, 5, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 88
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-4F, 6.05F, 1.8F, 8, 2, 1, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F); // Box 89
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-1.5F, 0.25F, -2.5F, 1, 1, 1, 0F,0F, -0.5F, -0.08F, 0.5F, -0.8F, -0.08F, 0.5F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(0.5F, 0.25F, -2.5F, 1, 1, 1, 0F,0.5F, -0.8F, -0.08F, 0F, -0.5F, -0.08F, 0F, -0.5F, 0F, 0.5F, -0.8F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 93
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-4.25F, 1.7F, -2.5F, 3, 1, 1, 0F,-0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 94
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(1.25F, 1.7F, -2.5F, 3, 1, 1, 0F,-0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 95
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-4.25F, 2.7F, -2.5F, 3, 1, 1, 0F,-0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.75F, -0.5F, 0.1F, -0.75F, -0.5F, 0.1F, -0.75F, -0.5F, 0.1F, -0.75F, -0.5F, 0.1F); // Box 96
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(1.25F, 2.7F, -2.5F, 3, 1, 1, 0F,-0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.75F, -0.5F, 0.1F, -0.75F, -0.5F, 0.1F, -0.75F, -0.5F, 0.1F, -0.75F, -0.5F, 0.1F); // Box 97
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-3.25F, 2.05F, -2.57F, 1, 5, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F); // Box 98
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(2.25F, 2.05F, -2.57F, 1, 5, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F); // Box 100
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-4F, 6.05F, -3F, 2, 1, 6, 0F,0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F); // Box 101
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-4F, 7.05F, -3F, 2, 1, 6, 0F,0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F); // Box 102
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-3.05F, -0.4F, 1.75F, 3, 3, 1, 0F,-0.2F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F); // Box 122
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(2.05F, -0.2F, -2.9F, 1, 2, 1, 0F,-0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F); // Box 129
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-3.05F, -0.2F, -2.9F, 1, 2, 1, 0F,-0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F); // Box 130
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-3.4F, -0.3F, 1.2F, 4, 4, 1, 0F,0F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0.15F, 0F, 0F, 0.15F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, -2.8F, 0F, 0.7F); // Box 24
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-0.6F, -0.3F, 1.2F, 4, 4, 1, 0F,-2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, -2.8F, 0F, 0.15F, 0F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 24
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-3.3F, -0.349999999999997F, -2.72F, 1, 2, 4, 0F,-0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 25
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(2.3F, -0.349999999999997F, -2.72F, 1, 2, 4, 0F,-0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 26
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-2F, 1F, 2.15F, 4, 1, 3, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F); // Box 29
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-2F, 2.5F, 2F, 4, 5, 3, 0F,0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F); // Box 30
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-4F, 1.4F, 1.6F, 8, 6, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-3.3F, -0.3F, -2.67F, 1, 2, 4, 0F,0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 24
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(2.3F, -0.3F, -2.67000000000001F, 1, 2, 4, 0F,0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 24
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-1.5F, 2.45F, -2.52F, 3, 1, 1, 0F,-0.25F, 0.05F, 0.2F, -0.25F, 0.05F, 0.2F, -0.25F, 0.05F, -0.7F, -0.25F, 0.05F, -0.7F, -0.25F, 0.05F, 0.2F, -0.25F, 0.05F, 0.2F, -0.25F, 0.05F, -0.7F, -0.25F, 0.05F, -0.7F); // Box 24
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(-3.1F, 2.45F, -2.57F, 2, 1, 1, 0F,0.1F, -0.15F, 0.2F, 0.3F, -0.15F, 0.2F, 0.3F, -0.15F, -0.7F, 0.1F, -0.15F, -0.7F, 0.1F, -0.15F, 0.2F, 0.3F, -0.15F, 0.2F, 0.3F, -0.15F, -0.7F, 0.1F, -0.15F, -0.7F); // Box 27
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-1F, 2.45F, -2.57F, 2, 1, 1, 0F,-0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.7F); // Box 28
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(1.1F, 2.45F, -2.57F, 2, 1, 1, 0F,0.3F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, -0.7F, 0.3F, -0.15F, -0.7F, 0.3F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, -0.7F, 0.3F, -0.15F, -0.7F); // Box 67
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-4F, 1.3F, 2.6F, 8, 2, 2, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 69
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-2F, 2.5F, 2.15F, 4, 1, 3, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 70
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(1F, 2.75F, 4.1F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 71
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-2F, 2.75F, 4.1F, 1, 1, 1, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 72
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-2F, 2.45F, -2.52F, 1, 1, 1, 0F,-0.25F, -0.1F, 0.2F, -0.25F, 0.05F, 0.2F, -0.25F, 0.05F, -0.7F, -0.25F, -0.1F, -0.7F, -0.25F, -0.1F, 0.2F, -0.25F, 0.05F, 0.2F, -0.25F, 0.05F, -0.7F, -0.25F, -0.1F, -0.7F); // Box 121
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(1F, 2.45F, -2.52F, 1, 1, 1, 0F,-0.25F, 0.05F, 0.2F, -0.25F, -0.1F, 0.2F, -0.25F, -0.1F, -0.7F, -0.25F, 0.05F, -0.7F, -0.25F, 0.05F, 0.2F, -0.25F, -0.1F, 0.2F, -0.25F, -0.1F, -0.7F, -0.25F, 0.05F, -0.7F); // Box 122
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(-0.5F, 2.45F, -2.62F, 1, 1, 1, 0F,0F, -0.27F, 0.2F, 0F, -0.27F, 0.2F, 0F, -0.27F, -0.7F, 0F, -0.27F, -0.7F, 0F, -0.27F, 0.2F, 0F, -0.27F, 0.2F, 0F, -0.27F, -0.7F, 0F, -0.27F, -0.7F); // Box 123
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(-1.75F, 2.45F, -2.82F, 1, 1, 1, 0F,-0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F); // Box 124
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-3.3F, 3.7F, -2.67F, 1, 1, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 126
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(2.3F, 3.7F, -2.63000000000001F, 1, 1, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 127
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-4.25F, 2.7F, -2.67F, 1, 1, 1, 0F,-0.17F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.17F, 0F, 0F, -0.8F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.8F, 0F, 0F); // Box 129
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-4.25F, 1.7F, -2.67F, 1, 1, 1, 0F,-0.17F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.17F, 0F, 0F, -0.17F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.17F, 0F, 0F); // Box 130
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(-4.25F, -0.3F, -2.67F, 1, 2, 1, 0F,-0.8F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, 0F, -0.8F, 0F, 0F, -0.17F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.17F, 0F, 0F); // Box 131
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(3.25F, 2.7F, -2.67F, 1, 1, 1, 0F,-0.15F, 0F, 0F, -0.17F, 0F, 0F, -0.17F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.15F, 0F, 0F); // Box 132
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(3.25F, 1.7F, -2.67F, 1, 1, 1, 0F,-0.15F, 0F, 0F, -0.17F, 0F, 0F, -0.17F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.17F, 0F, 0F, -0.17F, 0F, 0F, -0.15F, 0F, 0F); // Box 133
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(3.25F, -0.3F, -2.67F, 1, 2, 1, 0F,-0.15F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.17F, 0F, 0F, -0.17F, 0F, 0F, -0.15F, 0F, 0F); // Box 134
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-3.15F, -0.349999999999997F, 1.25F, 4, 4, 1, 0F,0F, 0F, 0F, -3.3F, 0F, 0F, -3.3F, 0F, 0.15F, 0F, 0F, 0.15F, -2.8F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.7F, -2.8F, 0F, 0.7F); // Box 137
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-0.85F, -0.349999999999997F, 1.25F, 4, 4, 1, 0F,-3.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, -3.3F, 0F, 0.15F, -0.5F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0.7F, -0.5F, 0F, 0.7F); // Box 138
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-4F, 8.15F, 1.8F, 8, 2, 1, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 247
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(2F, 6.05F, -3F, 2, 1, 6, 0F,0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F); // Box 248
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(2F, 7.05F, -3F, 2, 1, 6, 0F,0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F); // Box 249
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-5.25F, 7.6F, -1.8F, 1, 4, 3, 0F,0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 251
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-5.3F, 7.55F, -0.8F, 1, 1, 1, 0F,0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F); // Box 252
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(-5.3F, 7.55F, -1.6F, 1, 1, 1, 0F,0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F); // Box 253
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-5.3F, 7.55F, -2.15F, 1, 1, 1, 0F,0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F); // Box 254
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(-5.3F, 7.55F, 6.66133814775094E-16F, 1, 1, 1, 0F,0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 255
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(-5.3F, 7.55F, 0.550000000000001F, 1, 1, 1, 0F,0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F); // Box 256
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(-5.35F, 8.55F, -0.8F, 1, 1, 1, 0F,0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F); // Box 257
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(-5.35F, 9.35F, -0.8F, 1, 1, 1, 0F,0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F); // Box 258
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-5.26F, 10.1F, -1.8F, 1, 1, 3, 0F,0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F); // Box 259
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-5.26F, 10.4F, -1.6F, 1, 1, 1, 0F,0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F); // Box 260
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-5.26F, 8.41F, -0.8F, 1, 3, 1, 0F,0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F); // Box 261
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-5.26F, 7.9F, -1.1F, 1, 3, 1, 0F,0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F); // Box 262
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-5.26F, 7.9F, -1.5F, 1, 3, 1, 0F,0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F); // Box 263
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-5.26F, 7.9F, -1.9F, 1, 3, 1, 0F,0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F); // Box 264
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-5.26F, 7.9F, -2.3F, 1, 3, 1, 0F,0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F); // Box 265
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-5.2F, 8.28F, 1F, 1, 1, 1, 0F,0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F); // Box 266
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-5.2F, 7.78F, 1.02F, 1, 1, 1, 0F,0.22F, -0.1F, 0.1F, 0.22F, -0.1F, 0.1F, 0.22F, -0.2F, 0.1F, 0.22F, -0.2F, 0.1F, 0.22F, -0.5F, 0.1F, 0.22F, -0.5F, 0.1F, 0.22F, -0.3F, 0.1F, 0.22F, -0.3F, 0.1F); // Box 267
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-3.25F, 2.05F, -2.55F, 1, 3, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F); // Box 268
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(2.25F, 2.05F, -2.55F, 1, 3, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F); // Box 269
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(-3.3F, 1.7F, -2.67F, 1, 2, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 272
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(2.3F, 1.7F, -2.67000000000001F, 1, 2, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 273
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(-3.3F, 1.65F, -2.72F, 1, 4, 4, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 274
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(2.3F, 1.65F, -2.72F, 1, 4, 4, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 275
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(-3.55F, 4.35F, -3.75F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 278
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(-3.55F, 4.25F, -3.75F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 279
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(-3.55F, 4.15F, -3.75F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 280
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(-3.55F, 4.05F, -3.75F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 281
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(-3.55F, 3.95F, -3.75F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 282
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(-3.55F, 3.85F, -3.75F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 283
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(2.55F, 5.3F, -3.75F, 1, 1, 1, 0F,-0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 285
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(2.55F, 4.35F, -3.75F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 286
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addShapeBox(2.55F, 4.25F, -3.75F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 287
		bodyModel[142].setRotationPoint(0F, 0F, 0F);

		bodyModel[143].addShapeBox(2.55F, 4.15F, -3.75F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 288
		bodyModel[143].setRotationPoint(0F, 0F, 0F);

		bodyModel[144].addShapeBox(2.55F, 4.05F, -3.75F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 289
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addShapeBox(2.55F, 3.95F, -3.75F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 290
		bodyModel[145].setRotationPoint(0F, 0F, 0F);

		bodyModel[146].addShapeBox(2.55F, 3.85F, -3.75F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 291
		bodyModel[146].setRotationPoint(0F, 0F, 0F);

		bodyModel[147].addShapeBox(-3.55F, 3.79F, -3.75F, 1, 1, 1, 0F,-0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F); // Box 292
		bodyModel[147].setRotationPoint(0F, 0F, 0F);

		bodyModel[148].addShapeBox(2.55F, 3.79F, -3.75F, 1, 1, 1, 0F,-0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F); // Box 293
		bodyModel[148].setRotationPoint(0F, 0F, 0F);

		bodyModel[149].addShapeBox(-3.5F, 9.1F, 2.6F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F); // Box 10
		bodyModel[149].setRotationPoint(0F, 0F, 0F);

		bodyModel[150].addShapeBox(-3.5F, 7.45F, 2.6F, 7, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 11
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addShapeBox(-3.5F, 8.1F, 2.6F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[151].setRotationPoint(0F, 0F, 0F);

		bodyModel[152].addShapeBox(-2.5F, 9.1F, 2.6F, 1, 1, 2, 0F,-0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F); // Box 297
		bodyModel[152].setRotationPoint(0F, 0F, 0F);

		bodyModel[153].addShapeBox(-2.5F, 8.1F, 2.6F, 1, 1, 2, 0F,-0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F); // Box 298
		bodyModel[153].setRotationPoint(0F, 0F, 0F);

		bodyModel[154].addShapeBox(-2.5F, 7.45F, 2.6F, 1, 1, 2, 0F,-0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F); // Box 299
		bodyModel[154].setRotationPoint(0F, 0F, 0F);

		bodyModel[155].addShapeBox(1.5F, 9.1F, 2.6F, 1, 1, 2, 0F,-0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F); // Box 300
		bodyModel[155].setRotationPoint(0F, 0F, 0F);

		bodyModel[156].addShapeBox(1.5F, 8.1F, 2.6F, 1, 1, 2, 0F,-0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F, -0.35F, 0F, 0.05F); // Box 301
		bodyModel[156].setRotationPoint(0F, 0F, 0F);

		bodyModel[157].addShapeBox(1.5F, 7.45F, 2.6F, 1, 1, 2, 0F,-0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F); // Box 302
		bodyModel[157].setRotationPoint(0F, 0F, 0F);

		bodyModel[158].addShapeBox(3.8F, 4.65F, 2.5F, 1, 1, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 303
		bodyModel[158].setRotationPoint(0F, 0F, 0F);

		bodyModel[159].addShapeBox(3.8F, 3.75F, 2.5F, 1, 1, 2, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[159].setRotationPoint(0F, 0F, 0F);

		bodyModel[160].addShapeBox(3.8F, 5.1F, 2.5F, 1, 1, 2, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 305
		bodyModel[160].setRotationPoint(0F, 0F, 0F);

		bodyModel[161].addShapeBox(3.8F, 3.5F, 2.5F, 1, 1, 2, 0F,0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 306
		bodyModel[161].setRotationPoint(0F, 0F, 0F);

		bodyModel[162].addShapeBox(3.8F, 5.8F, 2.5F, 1, 1, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F); // Box 307
		bodyModel[162].setRotationPoint(0F, 0F, 0F);

		bodyModel[163].addShapeBox(3.9F, 2.95F, 2.5F, 1, 1, 2, 0F,-0.25F, -0.3F, -0.7F, -0.25F, -0.3F, -0.7F, -0.25F, -0.3F, -0.7F, -0.25F, -0.3F, -0.7F, -0.25F, -0.3F, -0.7F, -0.25F, -0.3F, -0.7F, -0.25F, -0.3F, -0.7F, -0.25F, -0.3F, -0.7F); // Box 308
		bodyModel[163].setRotationPoint(0F, 0F, 0F);

		bodyModel[164].addShapeBox(3.9F, 3.2F, 2.5F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.75F, -0.3F, -0.3F, -0.75F, -0.3F, -0.3F, -0.75F, -0.3F, -0.3F, -0.75F, -0.3F, -0.3F, -0.75F, -0.3F, -0.3F, -0.75F, -0.3F, -0.3F, -0.75F, -0.3F, -0.3F, -0.75F); // Box 309
		bodyModel[164].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 49
		leftArmModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 3

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.95F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 49
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 48
		rightArmModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.05F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 48
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 0

		leftLegModel[0].addShapeBox(-2F, 6.1F, -2.3F, 4, 6, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5

		rightLegModel[0].addShapeBox(-2F, 6.1F, -2.3F, 4, 6, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}
}