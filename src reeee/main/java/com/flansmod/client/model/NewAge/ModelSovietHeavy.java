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

public class ModelSovietHeavy extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelSovietHeavy() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];
		bodyModel = new ModelRendererTurbo[141];
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
		headModel[0] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 13
		headModel[1] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 14
		headModel[2] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box3
		headModel[3] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Import Box3
		headModel[4] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import Box3
		headModel[5] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Import Box3
		headModel[6] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Import Box3

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 51
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 52
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 53
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 32
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 35
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 37
		bodyModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 39
		bodyModel[9] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 33
		bodyModel[10] = new ModelRendererTurbo(this, 23, 16, textureX, textureY); // Box 108
		bodyModel[11] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 1
		bodyModel[12] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 11
		bodyModel[13] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 12
		bodyModel[14] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 34
		bodyModel[15] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 121
		bodyModel[16] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 122
		bodyModel[17] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 126
		bodyModel[18] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 127
		bodyModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 103
		bodyModel[20] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 104
		bodyModel[21] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 105
		bodyModel[22] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 104
		bodyModel[23] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 107
		bodyModel[24] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 23, 34, textureX, textureY); // Box 10
		bodyModel[26] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 17
		bodyModel[27] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 25
		bodyModel[28] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 92, 56, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 68, 57, textureX, textureY); // Box 9
		bodyModel[33] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 10
		bodyModel[34] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 20
		bodyModel[35] = new ModelRendererTurbo(this, 85, 49, textureX, textureY); // Box 21
		bodyModel[36] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 23
		bodyModel[38] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 24
		bodyModel[39] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 27
		bodyModel[40] = new ModelRendererTurbo(this, 41, 38, textureX, textureY); // Box 29
		bodyModel[41] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 30
		bodyModel[42] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 31
		bodyModel[43] = new ModelRendererTurbo(this, 23, 66, textureX, textureY); // Box 32
		bodyModel[44] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 26
		bodyModel[45] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 37
		bodyModel[46] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 64
		bodyModel[47] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 65
		bodyModel[48] = new ModelRendererTurbo(this, 80, 63, textureX, textureY); // Box 8
		bodyModel[49] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 85
		bodyModel[50] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 86
		bodyModel[51] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 87
		bodyModel[52] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 88
		bodyModel[53] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 89
		bodyModel[54] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 91
		bodyModel[55] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 92
		bodyModel[56] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 93
		bodyModel[57] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 64
		bodyModel[58] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 7
		bodyModel[59] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 94
		bodyModel[60] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 95
		bodyModel[61] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 117
		bodyModel[62] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 100
		bodyModel[63] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 102
		bodyModel[64] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 103
		bodyModel[65] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 90
		bodyModel[66] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 95
		bodyModel[67] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 278
		bodyModel[68] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 279
		bodyModel[69] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 280
		bodyModel[70] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 281
		bodyModel[71] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 282
		bodyModel[72] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 283
		bodyModel[73] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 292
		bodyModel[74] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 101
		bodyModel[75] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 102
		bodyModel[76] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 248
		bodyModel[77] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 249
		bodyModel[78] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 251
		bodyModel[79] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 252
		bodyModel[80] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 253
		bodyModel[81] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 254
		bodyModel[82] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 255
		bodyModel[83] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 256
		bodyModel[84] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 257
		bodyModel[85] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 258
		bodyModel[86] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 259
		bodyModel[87] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 260
		bodyModel[88] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 261
		bodyModel[89] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 262
		bodyModel[90] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 263
		bodyModel[91] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 264
		bodyModel[92] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 265
		bodyModel[93] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 266
		bodyModel[94] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 267
		bodyModel[95] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 155
		bodyModel[96] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 156
		bodyModel[97] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 157
		bodyModel[98] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 158
		bodyModel[99] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 159
		bodyModel[100] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 160
		bodyModel[101] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 161
		bodyModel[102] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 162
		bodyModel[103] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 163
		bodyModel[104] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 164
		bodyModel[105] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 165
		bodyModel[106] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 166
		bodyModel[107] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 167
		bodyModel[108] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 168
		bodyModel[109] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 169
		bodyModel[110] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 170
		bodyModel[111] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 171
		bodyModel[112] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 172
		bodyModel[113] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 173
		bodyModel[114] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 174
		bodyModel[115] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 175
		bodyModel[116] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 176
		bodyModel[117] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 177
		bodyModel[118] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 178
		bodyModel[119] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 179
		bodyModel[120] = new ModelRendererTurbo(this, 42, 42, textureX, textureY); // Box 7
		bodyModel[121] = new ModelRendererTurbo(this, 26, 83, textureX, textureY); // Box 9
		bodyModel[122] = new ModelRendererTurbo(this, 66, 37, textureX, textureY); // Box 10
		bodyModel[123] = new ModelRendererTurbo(this, 67, 43, textureX, textureY); // Box 11
		bodyModel[124] = new ModelRendererTurbo(this, 26, 53, textureX, textureY); // Box 184
		bodyModel[125] = new ModelRendererTurbo(this, 35, 54, textureX, textureY); // Box 185
		bodyModel[126] = new ModelRendererTurbo(this, 81, 67, textureX, textureY); // Box 55
		bodyModel[127] = new ModelRendererTurbo(this, 106, 28, textureX, textureY); // Box 57
		bodyModel[128] = new ModelRendererTurbo(this, 83, 25, textureX, textureY); // Box 58
		bodyModel[129] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 59
		bodyModel[130] = new ModelRendererTurbo(this, 2, 22, textureX, textureY); // Box 60
		bodyModel[131] = new ModelRendererTurbo(this, 12, 37, textureX, textureY); // Box 61
		bodyModel[132] = new ModelRendererTurbo(this, 18, 35, textureX, textureY); // Box 62
		bodyModel[133] = new ModelRendererTurbo(this, 26, 27, textureX, textureY); // Box 63
		bodyModel[134] = new ModelRendererTurbo(this, 34, 36, textureX, textureY); // Box 64
		bodyModel[135] = new ModelRendererTurbo(this, 43, 34, textureX, textureY); // Box 65
		bodyModel[136] = new ModelRendererTurbo(this, 55, 85, textureX, textureY); // Box 66
		bodyModel[137] = new ModelRendererTurbo(this, 50, 26, textureX, textureY); // Box 67
		bodyModel[138] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 68
		bodyModel[139] = new ModelRendererTurbo(this, 72, 60, textureX, textureY); // Box 69
		bodyModel[140] = new ModelRendererTurbo(this, 82, 29, textureX, textureY); // Box 70

		bodyModel[0].addBox(0.9F, 2.5F, -2.2F, 3, 1, 1, 0F); // Box 50
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.9F, 2.5F, -2.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-3.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 52
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(0.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 53
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.9F, 8.5F, -2.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addBox(-3.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 34
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(0.9F, 8.5F, -2.2F, 3, 1, 1, 0F); // Box 35
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(0.9F, 9.5F, -2.15F, 3, 2, 1, 0F); // Box 37
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 1.4F, -2.15F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 39
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addBox(-1.5F, 0.2F, -2.05F, 3, 2, 1, 0F); // Box 108
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -1.5F, 0.05F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0.05F, 0F, -1.5F, 0.05F, 0F, -1.5F, 0.05F, 0F, 0F, 0.05F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3F, 0F, -2.54F, 7, 10, 5, 0F,0F, 0.2F, -0.3F, -5.75F, 0.2F, -0.3F, -5.75F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -7F, 0F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -7F, 0F, -0.3F); // Box 121
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(3.8F, 9.5F, -2F, 2, 4, 4, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 122
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(3.65F, 9F, -2F, 2, 1, 4, 0F,-0.35F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, -0.35F, 0.5F, 0.3F, -0.35F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.35F, 0F, 0.3F); // Box 126
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(3.65F, 10F, -2F, 2, 1, 4, 0F,-0.35F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.35F, 0F, 0.3F, -0.35F, -0.9F, 0.3F, 0F, -0.6F, 0.3F, 0F, -0.6F, 0.3F, -0.35F, -0.9F, 0.3F); // Box 127
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(3.85F, 9.6F, -1.5F, 2, 4, 3, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 103
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(3.7F, 10F, -0.5F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 104
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(3.75F, 10.5F, -0.5F, 2, 1, 1, 0F,0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F, 0F, -0.25F, -0.23F); // Box 105
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-1F, 1.95F, -2.3F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.17F, -0.2F, 0F, -0.17F, -0.2F, 0F, 0F, -0.8F, 0F, -0.15F, 0F, 0F, -0.04F, -0.6F, 0F, -0.04F, -0.6F, 0F, -0.15F, 0F, 0F); // Box 104
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(1F, 4.88F, -2.3F, 1, 1, 1, 0F,0F, -0.8F, 0F, -0.225F, -0.2F, 0F, -0.225F, -0.2F, 0F, 0F, -0.8F, 0F, -0.15F, 0F, 0F, -0.09F, -0.6F, 0F, -0.09F, -0.6F, 0F, -0.15F, 0F, 0F); // Box 107
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4.29F, 6.3F, -3.3F, 2, 4, 1, 0F,-0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F); // Box 2
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4F, 6.1F, -3.4F, 2, 3, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 10
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-2.39F, 6.3F, -3.3F, 2, 4, 1, 0F,-0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F); // Box 17
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-2F, 6.1F, -3.4F, 2, 3, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 25
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(2.29F, 6.3F, -3.3F, 2, 4, 1, 0F,-0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F); // Box 30
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2.24F, 6.2F, -3.4F, 2, 3, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(0.389999999999999F, 6.3F, -3.3F, 2, 4, 1, 0F,-0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.22F, 0F, 0F); // Box 32
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0.44F, 6.2F, -3.4F, 2, 3, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-2.8F, 0.75F, -2.7F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 9
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1.8F, -0.25F, -2.7F, 1, 1, 6, 0F,-0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F); // Box 10
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-2.8F, -0.25F, -2.7F, 1, 1, 6, 0F,-0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F); // Box 20
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1.8F, 0.75F, -2.7F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 21
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(2.8F, 2.2F, -2.9F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 0
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3.8F, 2.2F, -2.9F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 23
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3.8F, 0F, -2.9F, 1, 2, 1, 0F,0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.35F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 24
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(2.8F, 0F, -2.9F, 1, 2, 1, 0F,-0.45F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 27
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(2F, 7.5F, 1.55F, 1, 1, 2, 0F,0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, -0.8F); // Box 29
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-3F, 1.8F, 1.5F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 30
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3F, 1.8F, 1.65F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F); // Box 31
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-3F, 5.8F, 1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.25F, -0.7F, 0F, -0.25F, -0.7F, 0F, -0.25F, -0.7F, -0.8F, -0.25F, -0.7F, -0.8F); // Box 32
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4F, 7.5F, -2.6F, 8, 1, 6, 0F,0.31F, 0.3F, 0F, 0.31F, 0.3F, 0F, 0.31F, 0.3F, -0.8F, 0.31F, 0.3F, -0.8F, 0.31F, 0.3F, 0F, 0.31F, 0.3F, 0F, 0.31F, 0.3F, -0.8F, 0.31F, 0.3F, -0.8F); // Box 26
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-1F, 7.5F, -2.7F, 2, 1, 2, 0F,-0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F); // Box 37
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-1.5F, 1.55F, -3.25F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-1.5F, 1.49F, -3.25F, 3, 1, 1, 0F,-0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.25F, 0.1F, -0.1F, 0.25F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F); // Box 65
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-4F, 10.1F, -2.8F, 8, 1, 1, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 8
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-4F, 5.1F, -2.8F, 8, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 85
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-4F, 6.1F, -2.8F, 8, 4, 1, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 86
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3F, 11.1F, -2.8F, 6, 1, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F); // Box 87
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-4F, 4.1F, 1.8F, 8, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 88
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-4F, 6.1F, 1.8F, 8, 4, 1, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F); // Box 89
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-4F, 1.1F, 1.8F, 8, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 91
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-1.5F, 0.1F, -2.5F, 1, 1, 1, 0F,0F, -0.5F, -0.08F, 0.5F, -0.8F, -0.08F, 0.5F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(0.5F, 0.1F, -2.5F, 1, 1, 1, 0F,0.5F, -0.8F, -0.08F, 0F, -0.5F, -0.08F, 0F, -0.5F, 0F, 0.5F, -0.8F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 93
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-4F, -0.2F, -2.5F, 4, 1, 5, 0F,0F, 0F, -0.2F, -1.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.3F, 0.1F, -1.25F, 0.3F, 0.1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 64
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(0F, -0.2F, -2.5F, 4, 1, 5, 0F,-1.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.25F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 7
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-4.25F, 1.1F, -2.5F, 3, 1, 1, 0F,-0.25F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 94
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(1.25F, 1.1F, -2.5F, 3, 1, 1, 0F,0F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 95
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-4F, 1.1F, -2.8F, 8, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 117
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-4F, 10.2F, 1.8F, 8, 1, 1, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -1F, 0.2F, -0.3F, -1F, 0.2F, -0.3F, -1F, 0.2F, -0.3F, -1F, 0.2F, -0.3F); // Box 100
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(1.8F, 0.75F, 1.65F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 102
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-2.8F, 0.75F, 1.65F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 103
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-4.1F, 6.9F, -3.4F, 1, 3, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 90
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-4.1F, 6.3F, -3.4F, 1, 1, 1, 0F,-0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 95
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-4.1F, 5.35F, -3.4F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 278
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-4.1F, 5.25F, -3.4F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 279
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-4.1F, 5.15F, -3.4F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 280
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-4.1F, 5.05F, -3.4F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 281
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-4.1F, 4.95F, -3.4F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 282
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-4.1F, 4.85F, -3.4F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 283
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-4.1F, 4.79F, -3.4F, 1, 1, 1, 0F,-0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F); // Box 292
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-4F, 6.05F, -3F, 2, 1, 6, 0F,0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F); // Box 101
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-4F, 9.05F, -3F, 2, 1, 6, 0F,0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F); // Box 102
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(2F, 6.05F, -3F, 2, 1, 6, 0F,0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F); // Box 248
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(2F, 9.05F, -3F, 2, 1, 6, 0F,0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, -0.6F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F, 0.35F, 0F, -0.45F); // Box 249
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-5.25F, 7.6F, -1.8F, 1, 4, 3, 0F,0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 251
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-5.3F, 7.55F, -0.8F, 1, 1, 1, 0F,0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F); // Box 252
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(-5.3F, 7.55F, -1.6F, 1, 1, 1, 0F,0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F); // Box 253
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-5.3F, 7.55F, -2.15F, 1, 1, 1, 0F,0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F); // Box 254
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-5.3F, 7.55F, 6.66133814775094E-16F, 1, 1, 1, 0F,0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 255
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-5.3F, 7.55F, 0.550000000000001F, 1, 1, 1, 0F,0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F); // Box 256
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-5.35F, 8.55F, -0.8F, 1, 1, 1, 0F,0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F); // Box 257
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-5.35F, 9.35F, -0.8F, 1, 1, 1, 0F,0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F); // Box 258
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-5.26F, 10.1F, -1.8F, 1, 1, 3, 0F,0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F, 0.2F, -0.48F, 0.11F); // Box 259
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(-5.26F, 10.4F, -1.6F, 1, 1, 1, 0F,0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F, 0.2F, -0.48F, 0.31F); // Box 260
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-5.26F, 8.41F, -0.8F, 1, 3, 1, 0F,0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F); // Box 261
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-5.26F, 7.9F, -1.1F, 1, 3, 1, 0F,0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F); // Box 262
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-5.26F, 7.9F, -1.5F, 1, 3, 1, 0F,0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F); // Box 263
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-5.26F, 7.9F, -1.9F, 1, 3, 1, 0F,0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F); // Box 264
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-5.26F, 7.9F, -2.3F, 1, 3, 1, 0F,0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F, 0.2F, 0F, -0.48F); // Box 265
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-5.2F, 8.28F, 1F, 1, 1, 1, 0F,0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F); // Box 266
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-5.2F, 7.78F, 1.02F, 1, 1, 1, 0F,0.22F, -0.1F, 0.1F, 0.22F, -0.1F, 0.1F, 0.22F, -0.2F, 0.1F, 0.22F, -0.2F, 0.1F, 0.22F, -0.5F, 0.1F, 0.22F, -0.5F, 0.1F, 0.22F, -0.3F, 0.1F, 0.22F, -0.3F, 0.1F); // Box 267
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(-4.23F, 1.75F, -2.45F, 3, 3, 1, 0F,-0.25F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.5F, -0.75F, 0.1F, -0.5F, -0.75F, 0.1F, -0.25F, 0F, 0.1F); // Box 155
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(1.23F, 1.75F, -2.45F, 3, 3, 1, 0F,-0.5F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, -0.75F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.5F, -0.75F, 0.1F); // Box 156
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(-2.8F, 1.75F, -2.75F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 157
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-2.8F, 0.75F, -2.75F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 158
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-2.8F, 1.25F, -2.75F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 159
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(1.8F, 1.75F, -2.75F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 160
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(1.8F, 1.25F, -2.75F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 161
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(1.8F, 0.75F, -2.75F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 162
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(-1.5F, 1.55F, -3.1F, 3, 4, 1, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F); // Box 163
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(-1.75F, 1.49F, -3.25F, 1, 1, 1, 0F,0F, 0.1F, -0.05F, -0.65F, 0.1F, 0.1F, -0.65F, 0.25F, 0.1F, 0.05F, 0.25F, 0.1F, 0F, -0.25F, -0.05F, -0.65F, 0F, 0.1F, -0.65F, 0F, 0.1F, 0.05F, -0.25F, 0.1F); // Box 164
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(0.75F, 1.49F, -3.25F, 1, 1, 1, 0F,-0.65F, 0.1F, 0.1F, 0F, 0.1F, -0.05F, 0.05F, 0.25F, 0.1F, -0.65F, 0.25F, 0.1F, -0.65F, 0F, 0.1F, 0F, -0.25F, -0.05F, 0.05F, -0.25F, 0.1F, -0.65F, 0F, 0.1F); // Box 165
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-2.4F, 6.9F, -3.4F, 1, 3, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 166
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-2.4F, 6.3F, -3.4F, 1, 1, 1, 0F,-0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F); // Box 167
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-2.4F, 5.35F, -3.4F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 168
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-2.4F, 5.25F, -3.4F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 169
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-2.4F, 5.15F, -3.4F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 170
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-2.4F, 5.05F, -3.4F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 171
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-2.4F, 4.95F, -3.4F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F); // Box 172
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(-2.4F, 4.85F, -3.4F, 1, 1, 1, 0F,-0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.125F, -0.45F, -0.125F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F); // Box 173
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-2.4F, 4.79F, -3.4F, 1, 1, 1, 0F,-0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F, -0.18F, -0.45F, -0.18F); // Box 174
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(-2F, 9.1F, -3.4F, 2, 1, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 175
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(-4F, 9.1F, -3.4F, 2, 1, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 176
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(2.25F, 9.2F, -3.4F, 2, 1, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 177
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(0.45F, 9.2F, -3.4F, 2, 1, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 178
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-3F, 7.5F, 1.55F, 1, 1, 2, 0F,0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, -0.8F, 0.3F, 0.4F, -0.8F); // Box 179
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(1.75F, 0.199999999999998F, -3.15F, 1, 2, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 7
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(1.75F, 2.2F, -3.3F, 1, 3, 1, 0F,0F, 0F, -0.27F, 0F, 0F, -0.27F, 0F, 0F, -0.27F, 0F, 0F, -0.27F, 0F, 0F, -0.27F, 0F, 0F, -0.27F, 0F, 0F, -0.27F, 0F, 0F, -0.27F); // Box 9
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(1.75F, 4.8F, -3.3F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.5F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 10
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(1.75F, 0.199999999999998F, -3.2F, 1, 2, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 11
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(1.5F, 2.2F, -3.3F, 1, 3, 1, 0F,-0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F); // Box 184
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(2F, 2.2F, -3.3F, 1, 3, 1, 0F,-0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F, -0.35F, -0.05F, -0.2F); // Box 185
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-3.2F, 7.2F, 1.5F, 3, 2, 2, 0F,-0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F); // Box 55
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-3.2F, 6.7F, 1.55F, 3, 1, 2, 0F,-0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F); // Box 57
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-2.2F, 7.4F, 2.6F, 1, 1, 1, 0F,-0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F); // Box 58
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-2.2F, 7.6F, 2.65F, 1, 1, 1, 0F,-0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F); // Box 59
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(-2.2F, 9.4F, 2.45F, 1, 1, 1, 0F,-0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F); // Box 60
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(-2.2F, 11.55F, 2.45F, 1, 1, 1, 0F,-0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F); // Box 61
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(-2.2F, 13.55F, 2.45F, 1, 1, 1, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F); // Box 62
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(-2.2F, 13.95F, 2.45F, 1, 1, 1, 0F,-0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F); // Box 63
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(1.8F, 7.65F, 2.45F, 2, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 64
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(1.8F, 6.75F, 2.45F, 2, 1, 1, 0F,-0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(1.8F, 6.5F, 2.45F, 2, 1, 1, 0F,-0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 66
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(1.8F, 8.1F, 2.45F, 2, 1, 1, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 67
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(1.8F, 8.8F, 2.45F, 2, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F); // Box 68
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(1.8F, 6.2F, 2.55F, 2, 1, 1, 0F,-0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F); // Box 69
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(1.8F, 5.95F, 2.55F, 2, 1, 1, 0F,-0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F); // Box 70
		bodyModel[140].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 59
		leftArmModel[1] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 60
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 1
		leftArmModel[3] = new ModelRendererTurbo(this, 107, 23, textureX, textureY); // Box 49
		leftArmModel[4] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 3

		leftArmModel[0].addShapeBox(2.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 59
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(2.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 60
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-0.95F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 49
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 61
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 62
		rightArmModel[2] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 2
		rightArmModel[3] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 48
		rightArmModel[4] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 61
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 62
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.05F, -2.3F, -1F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 48
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 63
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 64
		leftLegModel[2] = new ModelRendererTurbo(this, 31, 16, textureX, textureY); // Box 0
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(1.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 63
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(1.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 64
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 6.1F, -2.3F, 4, 6, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 67
		rightLegModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 68
		rightLegModel[2] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 5
		rightLegModel[3] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 67
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 68
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 6.1F, -2.3F, 4, 6, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}