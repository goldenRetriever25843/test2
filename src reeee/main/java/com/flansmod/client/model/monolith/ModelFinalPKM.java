//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.10.2016 - 15:49:41
// Last changed on: 14.10.2016 - 15:49:41

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFinalPKM extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFinalPKM() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[138];
		ammoModel = new ModelRendererTurbo[148];
		slideModel = new ModelRendererTurbo[1];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 38
		gunModel[21] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 39
		gunModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 47
		gunModel[23] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 166
		gunModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 167
		gunModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 168
		gunModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 36
		gunModel[27] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 37
		gunModel[28] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 38
		gunModel[29] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 39
		gunModel[30] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 40
		gunModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 41
		gunModel[32] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 42
		gunModel[33] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 43
		gunModel[34] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 44
		gunModel[35] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 45
		gunModel[36] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 46
		gunModel[37] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 47
		gunModel[38] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 48
		gunModel[39] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 49
		gunModel[40] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 53
		gunModel[41] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 54
		gunModel[42] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 55
		gunModel[43] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 56
		gunModel[44] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 57
		gunModel[45] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 58
		gunModel[46] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 60
		gunModel[47] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 61
		gunModel[48] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 62
		gunModel[49] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 63
		gunModel[50] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 64
		gunModel[51] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 65
		gunModel[52] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 66
		gunModel[53] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 67
		gunModel[54] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 68
		gunModel[55] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 69
		gunModel[56] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 70
		gunModel[57] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 71
		gunModel[58] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 72
		gunModel[59] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 73
		gunModel[60] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 74
		gunModel[61] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 75
		gunModel[62] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 76
		gunModel[63] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 77
		gunModel[64] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 78
		gunModel[65] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 79
		gunModel[66] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 73
		gunModel[67] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 74
		gunModel[68] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 75
		gunModel[69] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 185
		gunModel[70] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 77
		gunModel[71] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 78
		gunModel[72] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 79
		gunModel[73] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 80
		gunModel[74] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 87
		gunModel[75] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 88
		gunModel[76] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 89
		gunModel[77] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 91
		gunModel[78] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 92
		gunModel[79] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 93
		gunModel[80] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 94
		gunModel[81] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 95
		gunModel[82] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 96
		gunModel[83] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 97
		gunModel[84] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 98
		gunModel[85] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 99
		gunModel[86] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 100
		gunModel[87] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 101
		gunModel[88] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 102
		gunModel[89] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 103
		gunModel[90] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 105
		gunModel[91] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 107
		gunModel[92] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 108
		gunModel[93] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 109
		gunModel[94] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 110
		gunModel[95] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 111
		gunModel[96] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 112
		gunModel[97] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 114
		gunModel[98] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 115
		gunModel[99] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 116
		gunModel[100] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 117
		gunModel[101] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 118
		gunModel[102] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 59
		gunModel[103] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 60
		gunModel[104] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 61
		gunModel[105] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 66
		gunModel[106] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 127
		gunModel[107] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 128
		gunModel[108] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 129
		gunModel[109] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 50
		gunModel[110] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 80
		gunModel[111] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 81
		gunModel[112] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 83
		gunModel[113] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 84
		gunModel[114] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 287
		gunModel[115] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 288
		gunModel[116] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 290
		gunModel[117] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 291
		gunModel[118] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 292
		gunModel[119] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 293
		gunModel[120] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 294
		gunModel[121] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 295
		gunModel[122] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 296
		gunModel[123] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 297
		gunModel[124] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 298
		gunModel[125] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 299
		gunModel[126] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 300
		gunModel[127] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 301
		gunModel[128] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 302
		gunModel[129] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 303
		gunModel[130] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 304
		gunModel[131] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 305
		gunModel[132] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 306
		gunModel[133] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 307
		gunModel[134] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 308
		gunModel[135] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 309
		gunModel[136] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 310
		gunModel[137] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 311

		gunModel[0].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0.5F, 0.05F, -0.4F, 0.5F, 0.05F, -0.4F, 0.5F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 0
		gunModel[0].setRotationPoint(-0.2F, -3F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.3F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, 0.3F, 0F, 0.15F, 0.3F, -0.2F, 0.15F, -0.4F, -0.2F, 0.15F, -0.4F, -0.2F, 0.15F, 0.3F, -0.2F, 0.15F); // Box 2
		gunModel[1].setRotationPoint(0.4F, -4.2F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.4F, 0F, 0.15F, 0.5F, 0F, 0.15F, 0.3F, -0.2F, 0.15F, 0.4F, -0.7F, 0.15F, 0.4F, -0.7F, 0.15F, 0.3F, -0.2F, 0.15F); // Box 3
		gunModel[2].setRotationPoint(4.3F, -4.2F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, 0.15F, -0.3F, 0F, 0.15F, -0.3F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.7F, 0.15F, -0.3F, -0.82F, 0.15F, -0.3F, -0.82F, 0.15F, -0.35F, -0.7F, 0.15F); // Box 4
		gunModel[3].setRotationPoint(5.35F, -4.2F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.65F, 0.15F, 0.5F, -0.65F, 0.15F, 0.5F, -0.65F, 0.15F, 0.2F, -0.65F, 0.15F, 0.5F, 0F, 0.15F, 0.5F, 0F, 0.15F, 0.5F, 0F, 0.15F, 0.5F, 0F, 0.15F); // Box 6
		gunModel[4].setRotationPoint(4.3F, -5.2F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.65F, 0.15F, -0.35F, -0.4F, 0.15F, -0.35F, -0.4F, 0.15F, -0.4F, -0.65F, 0.15F, -0.4F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.4F, 0F, 0.15F); // Box 7
		gunModel[5].setRotationPoint(5.4F, -5.2F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.1F, 0.3F, -0.3F, -0.1F, 0.3F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.4F, -0.1F, 1.2F, -0.4F, -0.1F, 1.2F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 8
		gunModel[6].setRotationPoint(6.05F, -5.2F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.5F, 0.05F, -0.4F, -0.5F, 0.05F, -0.4F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Box 9
		gunModel[7].setRotationPoint(4.3F, -4F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.05F, -0.6F, 0.2F, 0.05F, -0.6F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, -0.5F, 0.05F, -0.6F, -0.5F, 0.05F, -0.6F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Box 10
		gunModel[8].setRotationPoint(8.9F, -4F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.35F, 0.05F, -0.75F, -0.35F, 0.05F, -0.75F, -0.35F, 0.05F, -0.15F, -0.35F, 0.05F, 0F, -0.5F, 0.05F, -0.6F, -0.5F, 0.05F, -0.6F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Box 11
		gunModel[9].setRotationPoint(8.9F, -4.7F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, 0.2F, 0.05F, -0.3F, 0.2F, 0.05F, -0.3F, 0.2F, 0.05F, 0.05F, 0.2F, 0.05F, 0.05F, -1F, 0.05F, -0.3F, -1F, 0.05F, -0.3F, -1F, 0.05F, 0.05F, -1F, 0.05F); // Box 12
		gunModel[10].setRotationPoint(8.2F, -4F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.35F, 0.3F, -0.4F, -0.35F, 0.3F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.35F, 0.8F, -0.4F, -0.35F, 0.6F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 13
		gunModel[11].setRotationPoint(6.05F, -5.2F, 0.05F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, 0F, 0.55F, -0.45F, 0F, 0.55F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.35F, 0.25F, 0.55F, -0.35F, 0.25F, 0.55F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 14
		gunModel[12].setRotationPoint(6.7F, -5.2F, -1.05F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.85F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0.85F, -0.3F, -0.1F, 1.3F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 1.3F, -0.3F, -0.1F); // Box 15
		gunModel[13].setRotationPoint(5.05F, -5.2F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 1F, -0.35F, -0.1F, 1.3F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 1.3F, -0.35F, -0.1F); // Box 16
		gunModel[14].setRotationPoint(1.4F, -4.85F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, 0F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.2F, 0.15F, -0.35F, -0.2F, 0.15F, -0.35F, -0.2F, 0.15F, -0.35F, -0.2F, 0.15F); // Box 17
		gunModel[15].setRotationPoint(-0.55F, -4.2F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 18
		gunModel[16].setRotationPoint(8.9F, -4.9F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.3F, 0.05F, -0.6F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, 0.3F, -0.3F, 0.05F, 0.3F, -0.3F, 0.05F, -0.6F, -0.3F, -0.05F, -0.6F, -0.3F, -0.05F, 0.3F, -0.3F, 0.05F); // Box 19
		gunModel[17].setRotationPoint(8.5F, -4.9F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, 0.05F, -0.45F, -0.1F, 0.05F, -0.45F, -0.1F, 0.05F, -0.45F, -0.1F, 0.05F, -0.45F); // Box 20
		gunModel[18].setRotationPoint(6.2F, -5F, 0.2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.35F, 0.4F, -0.2F, -0.35F, 0.4F, -0.2F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F, -0.35F, 0F, -0.4F, -0.35F); // Box 22
		gunModel[19].setRotationPoint(6.1F, -4.9F, -1.05F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,-0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F); // Box 38
		gunModel[20].setRotationPoint(8.7F, -3.8F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,-0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F); // Box 39
		gunModel[21].setRotationPoint(8.7F, -4F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,-0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F); // Box 47
		gunModel[22].setRotationPoint(8.7F, -4.2F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.3F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F); // Box 166
		gunModel[23].setRotationPoint(8.95F, -4.18F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.3F, -0.37F, -0.1F, -0.2F, -0.37F, -0.1F, -0.2F, -0.37F, -0.1F, -0.3F, -0.37F, -0.1F, -0.3F, -0.37F, -0.1F, -0.2F, -0.37F, -0.1F, -0.2F, -0.37F, -0.1F, -0.3F, -0.37F, -0.1F); // Box 167
		gunModel[24].setRotationPoint(8.95F, -4F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.3F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F); // Box 168
		gunModel[25].setRotationPoint(8.95F, -3.82F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F); // Box 36
		gunModel[26].setRotationPoint(12.7F, -3.15F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F); // Box 37
		gunModel[27].setRotationPoint(12.7F, -3.35F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.2F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F, -0.12F, -0.4F, -0.4F); // Box 38
		gunModel[28].setRotationPoint(12.7F, -2.95F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.45F, -0.15F, 0.1F, -0.45F, -0.15F, 0.1F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F); // Box 39
		gunModel[29].setRotationPoint(16.7F, -3.33F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.37F, -0.15F, 0.1F, -0.37F, -0.15F, 0.1F, -0.37F, -0.15F, -0.3F, -0.37F, -0.15F, -0.3F, -0.37F, -0.15F, 0F, -0.37F, -0.15F, 0F, -0.37F, -0.15F, -0.3F, -0.37F, -0.15F); // Box 40
		gunModel[30].setRotationPoint(16.7F, -3.15F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.45F, -0.15F, 0F, -0.45F, -0.15F, 0F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.35F, -0.4F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F); // Box 41
		gunModel[31].setRotationPoint(16.7F, -2.97F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.45F, -0.1F, -0.25F, -0.45F, -0.1F, -0.25F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F); // Box 42
		gunModel[32].setRotationPoint(18.6F, -2.97F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.37F, -0.1F, -0.25F, -0.37F, -0.1F, -0.25F, -0.37F, -0.1F, -0.35F, -0.37F, -0.1F, -0.35F, -0.37F, -0.1F, -0.25F, -0.37F, -0.1F, -0.25F, -0.37F, -0.1F, -0.35F, -0.37F, -0.1F); // Box 43
		gunModel[33].setRotationPoint(18.6F, -3.15F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.45F, -0.1F, -0.25F, -0.45F, -0.1F, -0.25F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F); // Box 44
		gunModel[34].setRotationPoint(18.6F, -3.33F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 45
		gunModel[35].setRotationPoint(18.6F, -3.5F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.35F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.35F, 0F, 0F); // Box 46
		gunModel[36].setRotationPoint(9.6F, -3.2F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.35F, -0.4F, -0.7F, -0.35F, -0.4F, -0.7F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.5F, -0.45F, -0.15F, -0.7F, -0.45F, -0.15F, -0.7F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F); // Box 47
		gunModel[37].setRotationPoint(23F, -4.18F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.37F, -0.15F, -0.7F, -0.37F, -0.15F, -0.7F, -0.37F, -0.15F, -0.5F, -0.37F, -0.15F, -0.5F, -0.37F, -0.15F, -0.7F, -0.37F, -0.15F, -0.7F, -0.37F, -0.15F, -0.5F, -0.37F, -0.15F); // Box 48
		gunModel[38].setRotationPoint(23F, -4F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.45F, -0.15F, -0.7F, -0.45F, -0.15F, -0.7F, -0.45F, -0.15F, -0.5F, -0.45F, -0.15F, -0.5F, -0.35F, -0.4F, -0.7F, -0.35F, -0.4F, -0.7F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F); // Box 49
		gunModel[39].setRotationPoint(23F, -3.82F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, 0.4F, -0.45F, -0.35F, 0.4F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.3F, 0.4F, -0.45F, -0.3F, 0.4F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F); // Box 53
		gunModel[40].setRotationPoint(5.6F, -4.6F, -1.05F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, 0.4F, -0.45F, -0.35F, 0.4F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.3F, 0.4F, -0.45F, -0.3F, 0.4F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F); // Box 54
		gunModel[41].setRotationPoint(8.4F, -4.6F, -1.05F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.7F, 0.7F, -0.2F, 0.7F, 0.7F, -0.2F, 0.7F, 0.05F, 0F, 0.7F, 0.05F, 0F, 0F, 0.05F, -0.2F, 0F, 0.05F, -0.2F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 55
		gunModel[42].setRotationPoint(7F, -3.2F, -0.9F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0.4F, -0.05F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.15F, 0.4F, -0.05F, -0.15F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, -0.05F); // Box 56
		gunModel[43].setRotationPoint(-1.2F, -3F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, -0.3F, 0.4F, -0.05F, -0.3F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.3F, 0F, -0.05F); // Box 57
		gunModel[44].setRotationPoint(-2.05F, -3F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.75F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, -0.4F, 0.75F, -0.05F, -0.4F, 0.1F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.4F, 0.1F, -0.05F); // Box 58
		gunModel[45].setRotationPoint(-2.75F, -3F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, 0.05F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, 0.05F, -0.7F, -0.2F, 0.05F, -0.7F); // Box 60
		gunModel[46].setRotationPoint(6F, -4.8F, -2F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F); // Box 61
		gunModel[47].setRotationPoint(6.1F, -5.1F, -2F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F); // Box 62
		gunModel[48].setRotationPoint(8.1F, -4.95F, -1.45F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F); // Box 63
		gunModel[49].setRotationPoint(5.9F, -4.95F, -1.45F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, 0.2F, -0.45F, -0.1F, 0.2F, -0.45F, -0.1F, 0.2F, -0.45F, -0.1F, 0.2F, -0.45F); // Box 64
		gunModel[50].setRotationPoint(3.8F, -3.6F, 0.2F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, 0.5F, -0.45F, -0.45F, 0.5F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, 0.5F, -0.45F, -0.45F); // Box 65
		gunModel[51].setRotationPoint(4.05F, -3.75F, 0.15F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.85F, -0.05F, 0F, 0.75F, -0.05F, 0F, 0.75F, -0.05F, -0.25F, 0.85F, -0.05F, -0.25F, -0.6F, -0.05F, 0F, 0.1F, -0.05F, 0F, 0.1F, -0.05F, -0.25F, -0.6F, -0.05F); // Box 66
		gunModel[52].setRotationPoint(-3.35F, -3F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.75F, -0.05F, -0.3F, 0.75F, -0.05F, -0.3F, 0.75F, -0.05F, -0.3F, 0.75F, -0.05F, -0.3F, -1.1F, -0.05F, -0.3F, -0.8F, -0.05F, -0.3F, -0.8F, -0.05F, -0.3F, -1.1F, -0.05F); // Box 67
		gunModel[53].setRotationPoint(-3.8F, -3.1F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, 0.78F, -0.05F, -0.3F, 0.75F, -0.05F, -0.3F, 0.75F, -0.05F, -0.3F, 0.78F, -0.05F, -0.3F, -1.1F, -0.05F, -0.3F, -1.1F, -0.05F, -0.3F, -1.1F, -0.05F, -0.3F, -1.1F, -0.05F); // Box 68
		gunModel[54].setRotationPoint(-6.2F, -3.1F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.78F, -0.05F, -0.3F, 0.78F, -0.05F, -0.3F, 0.78F, -0.05F, -0.3F, 0.78F, -0.05F, -0.3F, -0.8F, -0.05F, -0.3F, -1.1F, -0.05F, -0.3F, -1.1F, -0.05F, -0.3F, -0.8F, -0.05F); // Box 69
		gunModel[55].setRotationPoint(-6.6F, -3.1F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.8F, -0.05F, -0.3F, 0.78F, -0.05F, -0.3F, 0.78F, -0.05F, -0.4F, 0.8F, -0.05F, -0.4F, -0.3F, -0.05F, -0.3F, -0.8F, -0.05F, -0.3F, -0.8F, -0.05F, -0.4F, -0.3F, -0.05F); // Box 70
		gunModel[56].setRotationPoint(-7F, -3.1F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, 0.85F, -0.05F, -0.3F, 0.8F, -0.05F, -0.3F, 0.8F, -0.05F, -0.3F, 0.85F, -0.05F, -0.4F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F); // Box 71
		gunModel[57].setRotationPoint(-8.3F, -3.1F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.3F, -0.05F, -0.8F, -0.3F, -0.05F, -0.8F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F, -0.3F, 0.75F, -0.05F, -0.8F, 0.75F, -0.05F, -0.8F, 0.75F, -0.05F, -0.3F, 0.75F, -0.05F); // Box 72
		gunModel[58].setRotationPoint(-8.3F, -2F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F, -0.4F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.4F, 0F, -0.05F); // Box 73
		gunModel[59].setRotationPoint(-8.3F, -2.7F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, -0.3F, -0.05F, -1F, -0.3F, -0.05F, -1F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F, -0.4F, 0.75F, -0.05F, -0.9F, 0.2F, -0.05F, -0.9F, 0.2F, -0.05F, -0.4F, 0.75F, -0.05F); // Box 74
		gunModel[60].setRotationPoint(-7.5F, -2F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, 0.75F, -0.05F, 0.5F, 0.75F, -0.05F, 0.5F, 0.75F, -0.05F, -0.1F, 0.75F, -0.05F, -0.3F, -0.8F, -0.05F, -0.1F, -0.8F, -0.05F, -0.1F, -0.8F, -0.05F, -0.3F, -0.8F, -0.05F); // Box 75
		gunModel[61].setRotationPoint(-6.4F, -1.1F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 1F, -0.05F, -0.5F, 0.75F, -0.05F, -0.5F, 0.75F, -0.05F, -0.25F, 1F, -0.05F, -0.4F, -0.7F, -0.05F, -0.3F, -0.8F, -0.05F, -0.3F, -0.8F, -0.05F, -0.4F, -0.7F, -0.05F); // Box 76
		gunModel[62].setRotationPoint(-6.8F, -1.1F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.3F, 0.75F, -0.05F, 0.6F, 0.85F, -0.05F, 0.6F, 0.85F, -0.05F, -1.3F, 0.75F, -0.05F, -0.7F, -0.8F, -0.05F, -0.2F, -0.7F, -0.05F, -0.2F, -0.7F, -0.05F, -0.7F, -0.8F, -0.05F); // Box 77
		gunModel[63].setRotationPoint(-5.2F, -1.1F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, 0.85F, -0.05F, -0.3F, 0.8F, -0.05F, -0.3F, 0.8F, -0.05F, -0.4F, 0.85F, -0.05F, 0.4F, -0.7F, -0.05F, -1.2F, -0.3F, -0.05F, -1.2F, -0.3F, -0.05F, 0.4F, -0.7F, -0.05F); // Box 78
		gunModel[64].setRotationPoint(-4F, -1.1F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, 0F, 0.1F, -0.05F, 0.5F, -0.45F, -0.05F, -0.25F, -0.4F, -0.05F, -0.25F, -0.4F, -0.05F, 0.5F, -0.45F, -0.05F); // Box 79
		gunModel[65].setRotationPoint(-3.1F, -2.5F, -0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 73
		gunModel[66].setRotationPoint(5.9F, -2.8F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F); // Box 74
		gunModel[67].setRotationPoint(5.9F, -3.1F, -0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F, -0.5F, -0.4F, 0.05F); // Box 75
		gunModel[68].setRotationPoint(5.9F, -2.15F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 185
		gunModel[69].setRotationPoint(-0.1F, -2.9F, -0.1F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 77
		gunModel[70].setRotationPoint(-0.1F, -3.6F, -0.1F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 78
		gunModel[71].setRotationPoint(-0.5F, -3.6F, -0.1F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.3F, -0.45F, 0.2F, -0.3F); // Box 79
		gunModel[72].setRotationPoint(0.25F, -3.6F, -0.05F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.4F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, 0F, -0.05F, -0.3F, 0.4F, -0.05F, -0.3F, -1.4F, -0.05F, 0.2F, -0.8F, -0.05F, 0.2F, -0.8F, -0.05F, -0.3F, -1.4F, -0.05F); // Box 80
		gunModel[73].setRotationPoint(-4.7F, -0.4F, -0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 87
		gunModel[74].setRotationPoint(1.4F, -2.55F, -0.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.45F, 0F, -0.2F); // Box 88
		gunModel[75].setRotationPoint(3.4F, -2.05F, -0.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F, -0.65F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.65F, 0.2F, -0.2F); // Box 89
		gunModel[76].setRotationPoint(1.6F, -2.05F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.05F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.05F, -0.4F, -0.2F); // Box 91
		gunModel[77].setRotationPoint(3.4F, -1.4F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.6F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.65F, -0.45F, -0.2F); // Box 92
		gunModel[78].setRotationPoint(1.85F, -1.2F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.45F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0.1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, -0.05F, -0.6F, -0.2F, -0.05F, -0.6F, -0.2F, 0F, -0.45F, -0.2F); // Box 93
		gunModel[79].setRotationPoint(2.65F, -1.2F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.25F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.65F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.65F, 0.2F, -0.35F); // Box 94
		gunModel[80].setRotationPoint(1.85F, -2.3F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.65F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.65F, -0.4F, -0.35F); // Box 95
		gunModel[81].setRotationPoint(2.1F, -1.45F, -0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.05F, -0.4F, 0F, -0.05F, -0.4F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, -0.4F, 0.1F, -0.05F, -0.4F, 0.1F, -0.05F, 0F, -0.2F, -0.05F); // Box 96
		gunModel[82].setRotationPoint(0.4F, -2.55F, -0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.4F, 0.1F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, -0.4F, 0.1F, -0.05F, -0.5F, -0.8F, -0.05F, -0.1F, -0.6F, -0.05F, -0.1F, -0.6F, -0.05F, -0.5F, -0.8F, -0.05F); // Box 97
		gunModel[83].setRotationPoint(0F, -1.65F, -0.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.6F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, -0.6F, 0F, -0.05F, -0.55F, -0.8F, -0.05F, -0.3F, -0.6F, -0.05F, -0.3F, -0.6F, -0.05F, -0.55F, -0.8F, -0.05F); // Box 98
		gunModel[84].setRotationPoint(-0.1F, -1.45F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.6F, 0.05F, -0.05F, -0.25F, -0.15F, -0.05F, -0.25F, -0.15F, -0.05F, -0.6F, 0.05F, -0.05F, -0.1F, -1F, -0.05F, -0.7F, -1.2F, -0.05F, -0.7F, -1.2F, -0.05F, -0.1F, -1F, -0.05F); // Box 99
		gunModel[85].setRotationPoint(-0.15F, -1.2F, -0.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.7F, -1.2F, -0.05F, -0.1F, -1F, -0.05F, -0.1F, -1F, -0.05F, -0.7F, -1.2F, -0.05F, -0.8F, -0.65F, -0.05F, -0.6F, -0.5F, -0.05F, -0.6F, -0.5F, -0.05F, -0.8F, -0.65F, -0.05F); // Box 100
		gunModel[86].setRotationPoint(-0.75F, -0.4F, -0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.6F, -0.5F, -0.05F, -1.3F, -0.85F, -0.05F, -1.3F, -0.85F, -0.05F, -0.6F, -0.5F, -0.05F, -0.1F, -1F, -0.05F, -1.45F, -1F, -0.05F, -1.45F, -1F, -0.05F, -0.1F, -1F, -0.05F); // Box 101
		gunModel[87].setRotationPoint(0.55F, 0.1F, -0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, 0.55F, -0.3F, -0.3F, 0.55F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, 0.55F, -0.3F, -0.3F, 0.55F); // Box 102
		gunModel[88].setRotationPoint(11.05F, -3.05F, -0.9F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, 0F, -0.3F, 0.05F); // Box 103
		gunModel[89].setRotationPoint(0.8F, -3.2F, -0.6F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.3F, -0.4F, -0.25F, 0.2F, -0.5F, -0.25F, 0.2F, -0.5F, -0.25F, 1.3F, -0.4F, -0.25F, 1.3F, -0.3F, -0.25F, 0.2F, -0.3F, -0.25F, 0.2F, -0.3F, -0.25F, 1.3F, -0.3F, -0.25F); // Box 105
		gunModel[90].setRotationPoint(3.05F, -5.2F, -0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.8F, -0.45F, -0.35F, 0.35F, -0.2F, -0.35F, 0.35F, -0.2F, -0.35F, 0.8F, -0.45F, -0.35F, 0.8F, -0.45F, -0.35F, 0.35F, -0.65F, -0.35F, 0.35F, -0.65F, -0.35F, 0.8F, -0.45F, -0.35F); // Box 107
		gunModel[91].setRotationPoint(2.8F, -5.3F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -1.25F, -0.3F, -0.3F, -1.25F, -0.3F, -0.3F, 0.55F, -0.3F, -0.3F, 0.55F, -0.3F, -0.3F, -1.25F, -0.3F, -0.3F, -1.25F, -0.3F, -0.3F, 0.55F, -0.3F, -0.3F, 0.55F); // Box 108
		gunModel[92].setRotationPoint(1.85F, -2.28F, -1.15F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F); // Box 109
		gunModel[93].setRotationPoint(2.95F, -5.5F, -0.2F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F); // Box 110
		gunModel[94].setRotationPoint(2.95F, -5.5F, -0.8F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F); // Box 111
		gunModel[95].setRotationPoint(3.85F, -5.6F, -1.15F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F); // Box 112
		gunModel[96].setRotationPoint(3.78F, -5.72F, -0.3F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F); // Box 114
		gunModel[97].setRotationPoint(3.78F, -5.72F, -0.7F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F); // Box 115
		gunModel[98].setRotationPoint(3.95F, -5.75F, -1.2F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F); // Box 116
		gunModel[99].setRotationPoint(3.95F, -5.75F, -0.05F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F); // Box 117
		gunModel[100].setRotationPoint(3.8F, -5.75F, 0.05F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F); // Box 118
		gunModel[101].setRotationPoint(3.8F, -5.75F, -1.25F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.4F, -0.3F, -0.15F, -0.4F, -0.3F, -0.15F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, -0.1F, -0.3F); // Box 59
		gunModel[102].setRotationPoint(22.6F, -5.45F, -0.52F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 60
		gunModel[103].setRotationPoint(22.9F, -4.7F, -0.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.15F, -0.3F, -0.45F, -0.12F, -0.3F, -0.45F, -0.12F, -0.3F, -0.45F, -0.15F, -0.3F, -0.4F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 61
		gunModel[104].setRotationPoint(22.35F, -4.8F, -0.5F);
		gunModel[104].rotateAngleZ = -0.26179939F;

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.47F, -0.45F, -0.5F, -0.47F, -0.45F, -0.5F, -0.47F, -0.45F, -0.5F, -0.47F, -0.45F, -0.1F, -0.47F, -0.45F, -0.1F, -0.47F, -0.45F, -0.1F, -0.47F, -0.45F, -0.1F, -0.47F); // Box 66
		gunModel[105].setRotationPoint(22.7F, -5.9F, -0.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.47F, -0.25F, -0.5F, -0.47F, -0.25F, -0.5F, -0.47F, -0.25F, -0.5F, -0.47F, -0.25F, -0.1F, -0.47F, -0.25F, -0.1F, -0.47F, -0.25F, -0.1F, -0.47F, -0.25F, -0.1F, -0.47F); // Box 127
		gunModel[106].setRotationPoint(22.7F, -5.95F, -0.75F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.47F, -0.25F, -0.5F, -0.47F, -0.25F, -0.5F, -0.47F, -0.25F, -0.5F, -0.47F, -0.25F, -0.1F, -0.47F, -0.25F, -0.1F, -0.47F, -0.25F, -0.1F, -0.47F, -0.25F, -0.1F, -0.47F); // Box 128
		gunModel[107].setRotationPoint(22.7F, -5.95F, -0.3F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.05F, -0.4F, -0.3F, -0.15F, -0.4F, -0.3F, -0.15F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.2F, -0.1F, -0.3F, -0.15F, -0.1F, -0.3F, -0.15F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F); // Box 129
		gunModel[108].setRotationPoint(22.6F, -4.4F, -0.52F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 50
		gunModel[109].setRotationPoint(17.15F, -3.2F, -0.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -1.25F, -0.3F, 0F, 0.75F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, 0.75F, -0.3F); // Box 80
		gunModel[110].setRotationPoint(9F, -2.6F, 0F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F); // Box 81
		gunModel[111].setRotationPoint(8.5F, -1.6F, 0.1F);
		gunModel[111].rotateAngleZ = 0.12217305F;

		gunModel[112].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -1.25F, -0.3F, 0F, 0.75F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, 0.75F, -0.3F); // Box 83
		gunModel[112].setRotationPoint(9F, -2.6F, -1F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F); // Box 84
		gunModel[113].setRotationPoint(8.5F, -1.6F, -1.1F);
		gunModel[113].rotateAngleZ = 0.12217305F;

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.4F, -0.2F); // Box 287
		gunModel[114].setRotationPoint(24.3F, -4.2F, -0.5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.4F, -0.2F); // Box 288
		gunModel[115].setRotationPoint(24.3F, -4F, -0.5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.4F, -0.4F); // Box 290
		gunModel[116].setRotationPoint(24.3F, -3.8F, -0.5F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 291
		gunModel[117].setRotationPoint(10.2F, -4.2F, 0.1F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.5F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F); // Box 292
		gunModel[118].setRotationPoint(10F, -4.6F, 0.7F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F); // Box 293
		gunModel[119].setRotationPoint(8.2F, -4.74F, 0.6F);
		gunModel[119].rotateAngleX = 0.57595865F;

		gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F); // Box 294
		gunModel[120].setRotationPoint(9.4F, -4.6F, 0.7F);
		gunModel[120].rotateAngleX = 0.57595865F;

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F); // Box 295
		gunModel[121].setRotationPoint(8F, -4.6F, 0.7F);
		gunModel[121].rotateAngleX = 0.57595865F;

		gunModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F); // Box 296
		gunModel[122].setRotationPoint(8.2F, -4.6F, 0.7F);
		gunModel[122].rotateAngleX = 0.57595865F;

		gunModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F); // Box 297
		gunModel[123].setRotationPoint(8.2F, -4.45F, 0.8F);
		gunModel[123].rotateAngleX = 0.57595865F;

		gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.1F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F); // Box 298
		gunModel[124].setRotationPoint(-0.55F, -4.2F, -0.5F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, -0.45F, 0.15F, -0.6F, -0.45F, 0.15F, -0.6F, -0.45F, 0.15F, 0.3F, -0.45F, 0.15F, 0.3F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, 0.3F, -0.45F, 0.15F); // Box 299
		gunModel[125].setRotationPoint(1.4F, -4.3F, -0.6F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, 0.15F, 1F, 0F, 0.15F, 1F, 0F, 0.15F, -0.4F, -0.45F, 0.15F, -0.6F, -0.45F, 0.15F, 1F, -0.85F, 0.15F, 1F, -0.85F, 0.15F, -0.6F, -0.45F, 0.15F); // Box 300
		gunModel[126].setRotationPoint(3.4F, -4.3F, -0.6F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 301
		gunModel[127].setRotationPoint(9.6F, -3.6F, -0.1F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 302
		gunModel[128].setRotationPoint(9.6F, -2.9F, -0.1F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 303
		gunModel[129].setRotationPoint(9.6F, -3.6F, -0.9F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 304
		gunModel[130].setRotationPoint(9.6F, -2.9F, -0.9F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 305
		gunModel[131].setRotationPoint(-0.1F, -3.6F, -0.9F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 306
		gunModel[132].setRotationPoint(-0.5F, -3.6F, -0.9F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 307
		gunModel[133].setRotationPoint(-0.1F, -2.9F, -0.9F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 308
		gunModel[134].setRotationPoint(9F, -2.9F, -0.1F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F); // Box 309
		gunModel[135].setRotationPoint(9F, -3.6F, -0.1F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, 0.15F, 1F, 0F, 0.15F, 1F, 0F, 0.15F, -0.4F, -0.45F, 0.15F, -0.6F, -0.45F, 0.15F, 1F, -0.85F, 0.15F, 1F, -0.85F, 0.15F, -0.6F, -0.45F, 0.15F); // Box 310
		gunModel[136].setRotationPoint(3.4F, -4.3F, -0.4F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, -0.45F, 0.15F, -0.6F, -0.45F, 0.15F, -0.6F, -0.45F, 0.15F, 0.3F, -0.45F, 0.15F, 0.3F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, -0.4F, -0.45F, 0.15F, 0.3F, -0.45F, 0.15F); // Box 311
		gunModel[137].setRotationPoint(1.4F, -4.3F, -0.4F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 59
		ammoModel[1] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 70
		ammoModel[2] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 72
		ammoModel[3] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 81
		ammoModel[4] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 82
		ammoModel[5] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 83
		ammoModel[6] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 85
		ammoModel[7] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 86
		ammoModel[8] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 107
		ammoModel[9] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 107
		ammoModel[10] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 107
		ammoModel[11] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 107
		ammoModel[12] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 107
		ammoModel[13] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 107
		ammoModel[14] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 107
		ammoModel[15] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 107
		ammoModel[16] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 107
		ammoModel[17] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 107
		ammoModel[18] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 107
		ammoModel[19] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 107
		ammoModel[20] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 107
		ammoModel[21] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 107
		ammoModel[22] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 107
		ammoModel[23] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 145
		ammoModel[24] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 146
		ammoModel[25] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 147
		ammoModel[26] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 148
		ammoModel[27] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 149
		ammoModel[28] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 150
		ammoModel[29] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 151
		ammoModel[30] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 152
		ammoModel[31] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 153
		ammoModel[32] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 154
		ammoModel[33] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 155
		ammoModel[34] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 156
		ammoModel[35] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 157
		ammoModel[36] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 158
		ammoModel[37] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 159
		ammoModel[38] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 160
		ammoModel[39] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 161
		ammoModel[40] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 162
		ammoModel[41] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 163
		ammoModel[42] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 164
		ammoModel[43] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 165
		ammoModel[44] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 166
		ammoModel[45] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 167
		ammoModel[46] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 168
		ammoModel[47] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 169
		ammoModel[48] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 170
		ammoModel[49] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 171
		ammoModel[50] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 172
		ammoModel[51] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 173
		ammoModel[52] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 174
		ammoModel[53] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 175
		ammoModel[54] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 176
		ammoModel[55] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 177
		ammoModel[56] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 178
		ammoModel[57] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 179
		ammoModel[58] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 180
		ammoModel[59] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 181
		ammoModel[60] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 182
		ammoModel[61] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 183
		ammoModel[62] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 184
		ammoModel[63] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 185
		ammoModel[64] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 186
		ammoModel[65] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 187
		ammoModel[66] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 188
		ammoModel[67] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 189
		ammoModel[68] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 190
		ammoModel[69] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 191
		ammoModel[70] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 192
		ammoModel[71] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 193
		ammoModel[72] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 194
		ammoModel[73] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 195
		ammoModel[74] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 196
		ammoModel[75] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 197
		ammoModel[76] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 198
		ammoModel[77] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 199
		ammoModel[78] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 200
		ammoModel[79] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 201
		ammoModel[80] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 202
		ammoModel[81] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 203
		ammoModel[82] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 204
		ammoModel[83] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 205
		ammoModel[84] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 206
		ammoModel[85] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 207
		ammoModel[86] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 208
		ammoModel[87] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 209
		ammoModel[88] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 210
		ammoModel[89] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 211
		ammoModel[90] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 212
		ammoModel[91] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 213
		ammoModel[92] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 214
		ammoModel[93] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 215
		ammoModel[94] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 216
		ammoModel[95] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 217
		ammoModel[96] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 218
		ammoModel[97] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 219
		ammoModel[98] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 220
		ammoModel[99] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 221
		ammoModel[100] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 222
		ammoModel[101] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 223
		ammoModel[102] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 224
		ammoModel[103] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 225
		ammoModel[104] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 226
		ammoModel[105] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 227
		ammoModel[106] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 228
		ammoModel[107] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 229
		ammoModel[108] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 230
		ammoModel[109] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 231
		ammoModel[110] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 232
		ammoModel[111] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 233
		ammoModel[112] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 234
		ammoModel[113] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 235
		ammoModel[114] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 236
		ammoModel[115] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 237
		ammoModel[116] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 238
		ammoModel[117] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 239
		ammoModel[118] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 240
		ammoModel[119] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 241
		ammoModel[120] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 242
		ammoModel[121] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 243
		ammoModel[122] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 244
		ammoModel[123] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 245
		ammoModel[124] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 246
		ammoModel[125] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 247
		ammoModel[126] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 248
		ammoModel[127] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 249
		ammoModel[128] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 265
		ammoModel[129] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 266
		ammoModel[130] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 267
		ammoModel[131] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 268
		ammoModel[132] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 269
		ammoModel[133] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 270
		ammoModel[134] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 271
		ammoModel[135] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 312
		ammoModel[136] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 313
		ammoModel[137] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 314
		ammoModel[138] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 315
		ammoModel[139] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 316
		ammoModel[140] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 317
		ammoModel[141] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 318
		ammoModel[142] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 319
		ammoModel[143] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 320
		ammoModel[144] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 321
		ammoModel[145] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 322
		ammoModel[146] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 323
		ammoModel[147] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 286

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0.5F, 0.05F, -0.4F, 0.5F, 0.05F, -0.4F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0.45F, 0F, -0.1F, 0.45F); // Box 59
		ammoModel[0].setRotationPoint(6.05F, -1.1F, -2.4F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1.1F, -0.15F, -0.4F, 1.1F, -0.15F, -0.4F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.3F, -0.15F, -0.4F, 0.3F, -0.15F, -0.4F, -0.2F, -0.15F, 0F, -0.2F, -0.15F); // Box 70
		ammoModel[1].setRotationPoint(6.05F, -0.5F, 2.9F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.5F, -0.15F, -0.4F, 0.5F, -0.15F, -0.4F, 1.1F, -0.15F, 0F, 1.1F, -0.15F, 0F, -0.2F, -0.15F, -0.4F, -0.2F, -0.15F, -0.4F, 0.3F, -0.15F, 0F, 0.3F, -0.15F); // Box 72
		ammoModel[2].setRotationPoint(6.05F, -0.5F, -3.3F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F); // Box 81
		ammoModel[3].setRotationPoint(6.9F, -0.5F, 3F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.4F, -0.15F, 0.2F, -0.4F, -0.15F, 0.2F, -0.4F, -0.15F, 0.2F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F, -0.1F, -0.4F, -0.15F); // Box 82
		ammoModel[4].setRotationPoint(6.9F, -0.7F, 3F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.1F, -0.15F, 0.2F, -0.1F, -0.15F, 0.2F, -0.1F, -0.15F, 0.2F, -0.1F, -0.15F, 0.2F, -0.4F, -0.15F, 0.2F, -0.4F, -0.15F, 0.2F, -0.4F, -0.15F, 0.2F, -0.4F, -0.15F); // Box 83
		ammoModel[5].setRotationPoint(6.9F, -0.9F, 3F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.8F, -0.4F, -0.15F, 0.6F, -0.4F, -0.15F, 0.6F, -0.4F, -0.15F, 0.8F, -0.4F, -0.15F, 0.8F, -0.4F, -0.15F, 0.6F, -0.4F, -0.15F, 0.6F, -0.4F, -0.15F, 0.8F, -0.4F, -0.15F); // Box 85
		ammoModel[6].setRotationPoint(6.95F, -1.25F, 3.05F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.8F, -0.4F, -0.15F, 0.6F, -0.4F, -0.15F, 0.6F, -0.4F, -0.15F, 0.8F, -0.4F, -0.15F, 0.8F, -0.4F, -0.15F, 0.6F, -0.4F, -0.15F, 0.6F, -0.4F, -0.15F, 0.8F, -0.4F, -0.15F); // Box 86
		ammoModel[7].setRotationPoint(6.95F, -1.25F, -3.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[8].setRotationPoint(6.6F, -2.2F, -2.6F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[9].setRotationPoint(6.6F, -2.3F, -2.6F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[10].setRotationPoint(7.2F, -2.3F, -2.6F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[11].setRotationPoint(7.2F, -2.2F, -2.6F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[12].setRotationPoint(7.33F, -2.3F, -2.6F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 107
		ammoModel[13].setRotationPoint(7.33F, -2.1F, -2.6F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[14].setRotationPoint(7.33F, -2.2F, -2.6F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 107
		ammoModel[15].setRotationPoint(7.53F, -2.25F, -2.6F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 107
		ammoModel[16].setRotationPoint(7.53F, -2.15F, -2.6F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 107
		ammoModel[17].setRotationPoint(7.78F, -2.25F, -2.6F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 107
		ammoModel[18].setRotationPoint(7.78F, -2.15F, -2.6F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 107
		ammoModel[19].setRotationPoint(6.6F, -2.1F, -2.6F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 107
		ammoModel[20].setRotationPoint(7.2F, -2.1F, -2.6F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 107
		ammoModel[21].setRotationPoint(7.53F, -2.2F, -2.6F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 107
		ammoModel[22].setRotationPoint(7.78F, -2.2F, -2.6F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 145
		ammoModel[23].setRotationPoint(6.6F, -2.6F, -2.4F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 146
		ammoModel[24].setRotationPoint(6.6F, -2.5F, -2.4F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 147
		ammoModel[25].setRotationPoint(6.6F, -2.7F, -2.4F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 148
		ammoModel[26].setRotationPoint(7.2F, -2.7F, -2.4F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 149
		ammoModel[27].setRotationPoint(7.2F, -2.6F, -2.4F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 150
		ammoModel[28].setRotationPoint(7.2F, -2.5F, -2.4F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 151
		ammoModel[29].setRotationPoint(7.33F, -2.5F, -2.4F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 152
		ammoModel[30].setRotationPoint(7.33F, -2.6F, -2.4F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 153
		ammoModel[31].setRotationPoint(7.33F, -2.7F, -2.4F);

		ammoModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 154
		ammoModel[32].setRotationPoint(7.53F, -2.55F, -2.4F);

		ammoModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 155
		ammoModel[33].setRotationPoint(7.53F, -2.6F, -2.4F);

		ammoModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 156
		ammoModel[34].setRotationPoint(7.53F, -2.65F, -2.4F);

		ammoModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 157
		ammoModel[35].setRotationPoint(7.78F, -2.55F, -2.4F);

		ammoModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 158
		ammoModel[36].setRotationPoint(7.78F, -2.6F, -2.4F);

		ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 159
		ammoModel[37].setRotationPoint(7.78F, -2.65F, -2.4F);

		ammoModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 160
		ammoModel[38].setRotationPoint(6.6F, -2.9F, -2.2F);

		ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 161
		ammoModel[39].setRotationPoint(6.6F, -2.8F, -2.2F);

		ammoModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 162
		ammoModel[40].setRotationPoint(6.6F, -3F, -2.2F);

		ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 163
		ammoModel[41].setRotationPoint(7.2F, -3F, -2.2F);

		ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 164
		ammoModel[42].setRotationPoint(7.2F, -2.9F, -2.2F);

		ammoModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 165
		ammoModel[43].setRotationPoint(7.2F, -2.8F, -2.2F);

		ammoModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 166
		ammoModel[44].setRotationPoint(7.33F, -2.8F, -2.2F);

		ammoModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 167
		ammoModel[45].setRotationPoint(7.33F, -2.9F, -2.2F);

		ammoModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 168
		ammoModel[46].setRotationPoint(7.33F, -3F, -2.2F);

		ammoModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 169
		ammoModel[47].setRotationPoint(7.53F, -2.85F, -2.2F);

		ammoModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 170
		ammoModel[48].setRotationPoint(7.53F, -2.9F, -2.2F);

		ammoModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 171
		ammoModel[49].setRotationPoint(7.53F, -2.95F, -2.2F);

		ammoModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 172
		ammoModel[50].setRotationPoint(7.78F, -2.85F, -2.2F);

		ammoModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 173
		ammoModel[51].setRotationPoint(7.78F, -2.9F, -2.2F);

		ammoModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 174
		ammoModel[52].setRotationPoint(7.78F, -2.95F, -2.2F);

		ammoModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 175
		ammoModel[53].setRotationPoint(6.6F, -3.25F, -2.2F);

		ammoModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 176
		ammoModel[54].setRotationPoint(6.6F, -3.15F, -2.2F);

		ammoModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 177
		ammoModel[55].setRotationPoint(6.6F, -3.35F, -2.2F);

		ammoModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 178
		ammoModel[56].setRotationPoint(7.2F, -3.35F, -2.2F);

		ammoModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 179
		ammoModel[57].setRotationPoint(7.2F, -3.25F, -2.2F);

		ammoModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 180
		ammoModel[58].setRotationPoint(7.2F, -3.15F, -2.2F);

		ammoModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 181
		ammoModel[59].setRotationPoint(7.33F, -3.15F, -2.2F);

		ammoModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 182
		ammoModel[60].setRotationPoint(7.33F, -3.25F, -2.2F);

		ammoModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 183
		ammoModel[61].setRotationPoint(7.33F, -3.35F, -2.2F);

		ammoModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 184
		ammoModel[62].setRotationPoint(7.53F, -3.2F, -2.2F);

		ammoModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 185
		ammoModel[63].setRotationPoint(7.53F, -3.25F, -2.2F);

		ammoModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 186
		ammoModel[64].setRotationPoint(7.53F, -3.3F, -2.2F);

		ammoModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 187
		ammoModel[65].setRotationPoint(7.78F, -3.2F, -2.2F);

		ammoModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 188
		ammoModel[66].setRotationPoint(7.78F, -3.25F, -2.2F);

		ammoModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 189
		ammoModel[67].setRotationPoint(7.78F, -3.3F, -2.2F);

		ammoModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 190
		ammoModel[68].setRotationPoint(6.6F, -3.6F, -2.1F);

		ammoModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 191
		ammoModel[69].setRotationPoint(6.6F, -3.5F, -2.1F);

		ammoModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 192
		ammoModel[70].setRotationPoint(6.6F, -3.7F, -2.1F);

		ammoModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 193
		ammoModel[71].setRotationPoint(7.2F, -3.7F, -2.1F);

		ammoModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 194
		ammoModel[72].setRotationPoint(7.2F, -3.6F, -2.1F);

		ammoModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 195
		ammoModel[73].setRotationPoint(7.2F, -3.5F, -2.1F);

		ammoModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 196
		ammoModel[74].setRotationPoint(7.33F, -3.5F, -2.1F);

		ammoModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 197
		ammoModel[75].setRotationPoint(7.33F, -3.6F, -2.1F);

		ammoModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 198
		ammoModel[76].setRotationPoint(7.33F, -3.7F, -2.1F);

		ammoModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 199
		ammoModel[77].setRotationPoint(7.53F, -3.55F, -2.1F);

		ammoModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 200
		ammoModel[78].setRotationPoint(7.53F, -3.6F, -2.1F);

		ammoModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 201
		ammoModel[79].setRotationPoint(7.53F, -3.65F, -2.1F);

		ammoModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 202
		ammoModel[80].setRotationPoint(7.78F, -3.55F, -2.1F);

		ammoModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 203
		ammoModel[81].setRotationPoint(7.78F, -3.6F, -2.1F);

		ammoModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 204
		ammoModel[82].setRotationPoint(7.78F, -3.65F, -2.1F);

		ammoModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 205
		ammoModel[83].setRotationPoint(6.6F, -3.95F, -2.1F);

		ammoModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 206
		ammoModel[84].setRotationPoint(6.6F, -3.85F, -2.1F);

		ammoModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 207
		ammoModel[85].setRotationPoint(6.6F, -4.05F, -2.1F);

		ammoModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 208
		ammoModel[86].setRotationPoint(7.2F, -4.05F, -2.1F);

		ammoModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 209
		ammoModel[87].setRotationPoint(7.2F, -3.95F, -2.1F);

		ammoModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 210
		ammoModel[88].setRotationPoint(7.2F, -3.85F, -2.1F);

		ammoModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 211
		ammoModel[89].setRotationPoint(7.33F, -3.85F, -2.1F);

		ammoModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 212
		ammoModel[90].setRotationPoint(7.33F, -3.95F, -2.1F);

		ammoModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 213
		ammoModel[91].setRotationPoint(7.33F, -4.05F, -2.1F);

		ammoModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 214
		ammoModel[92].setRotationPoint(7.53F, -3.9F, -2.1F);

		ammoModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 215
		ammoModel[93].setRotationPoint(7.53F, -3.95F, -2.1F);

		ammoModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 216
		ammoModel[94].setRotationPoint(7.53F, -4F, -2.1F);

		ammoModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 217
		ammoModel[95].setRotationPoint(7.78F, -3.9F, -2.1F);

		ammoModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 218
		ammoModel[96].setRotationPoint(7.78F, -3.95F, -2.1F);

		ammoModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 219
		ammoModel[97].setRotationPoint(7.78F, -4F, -2.1F);

		ammoModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 220
		ammoModel[98].setRotationPoint(6.6F, -4.25F, -2F);

		ammoModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 221
		ammoModel[99].setRotationPoint(6.6F, -4.15F, -2F);

		ammoModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 222
		ammoModel[100].setRotationPoint(6.6F, -4.35F, -2F);

		ammoModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 223
		ammoModel[101].setRotationPoint(7.2F, -4.35F, -2F);

		ammoModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 224
		ammoModel[102].setRotationPoint(7.2F, -4.25F, -2F);

		ammoModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 225
		ammoModel[103].setRotationPoint(7.2F, -4.15F, -2F);

		ammoModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 226
		ammoModel[104].setRotationPoint(7.33F, -4.15F, -2F);

		ammoModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 227
		ammoModel[105].setRotationPoint(7.33F, -4.25F, -2F);

		ammoModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 228
		ammoModel[106].setRotationPoint(7.33F, -4.35F, -2F);

		ammoModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 229
		ammoModel[107].setRotationPoint(7.53F, -4.2F, -2F);

		ammoModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 230
		ammoModel[108].setRotationPoint(7.53F, -4.25F, -2F);

		ammoModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 231
		ammoModel[109].setRotationPoint(7.53F, -4.3F, -2F);

		ammoModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 232
		ammoModel[110].setRotationPoint(7.78F, -4.2F, -2F);

		ammoModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 233
		ammoModel[111].setRotationPoint(7.78F, -4.25F, -2F);

		ammoModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 234
		ammoModel[112].setRotationPoint(7.78F, -4.3F, -2F);

		ammoModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 235
		ammoModel[113].setRotationPoint(6.6F, -4.5F, -1.8F);

		ammoModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 236
		ammoModel[114].setRotationPoint(6.6F, -4.4F, -1.8F);

		ammoModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 237
		ammoModel[115].setRotationPoint(6.6F, -4.6F, -1.8F);

		ammoModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 238
		ammoModel[116].setRotationPoint(7.2F, -4.6F, -1.8F);

		ammoModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 239
		ammoModel[117].setRotationPoint(7.2F, -4.5F, -1.8F);

		ammoModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 240
		ammoModel[118].setRotationPoint(7.2F, -4.4F, -1.8F);

		ammoModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 241
		ammoModel[119].setRotationPoint(7.33F, -4.4F, -1.8F);

		ammoModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 242
		ammoModel[120].setRotationPoint(7.33F, -4.5F, -1.8F);

		ammoModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 243
		ammoModel[121].setRotationPoint(7.33F, -4.6F, -1.8F);

		ammoModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 244
		ammoModel[122].setRotationPoint(7.53F, -4.45F, -1.8F);

		ammoModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 245
		ammoModel[123].setRotationPoint(7.53F, -4.5F, -1.8F);

		ammoModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 246
		ammoModel[124].setRotationPoint(7.53F, -4.55F, -1.8F);

		ammoModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 247
		ammoModel[125].setRotationPoint(7.78F, -4.45F, -1.8F);

		ammoModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 248
		ammoModel[126].setRotationPoint(7.78F, -4.5F, -1.8F);

		ammoModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 249
		ammoModel[127].setRotationPoint(7.78F, -4.55F, -1.8F);

		ammoModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F); // Box 265
		ammoModel[128].setRotationPoint(6.7F, -2.4F, -2.4F);

		ammoModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F); // Box 266
		ammoModel[129].setRotationPoint(6.7F, -2.8F, -2.2F);

		ammoModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F); // Box 267
		ammoModel[130].setRotationPoint(6.7F, -3.4F, -2.1F);

		ammoModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F); // Box 268
		ammoModel[131].setRotationPoint(6.7F, -3.05F, -2.05F);

		ammoModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.6F, -0.1F, -0.3F, -0.6F); // Box 269
		ammoModel[132].setRotationPoint(6.7F, -3.75F, -1.95F);

		ammoModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.6F, -0.1F, -0.35F, -0.6F); // Box 270
		ammoModel[133].setRotationPoint(6.7F, -4.1F, -2F);

		ammoModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.6F, -0.1F, -0.35F, -0.6F); // Box 271
		ammoModel[134].setRotationPoint(6.7F, -4.4F, -1.8F);

		ammoModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F, 0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F); // Box 312
		ammoModel[135].setRotationPoint(6.05F, -1.6F, -2.4F);

		ammoModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F, 0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F); // Box 313
		ammoModel[136].setRotationPoint(6.05F, -1F, -2.4F);

		ammoModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F, 0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F); // Box 314
		ammoModel[137].setRotationPoint(6.05F, 0.3F, -2.4F);

		ammoModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F, 0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F); // Box 315
		ammoModel[138].setRotationPoint(6.05F, -0.3F, -2.4F);

		ammoModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F, 0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F); // Box 316
		ammoModel[139].setRotationPoint(6.05F, 1.8F, -2.4F);

		ammoModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F, 0.05F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0.4F, 0.05F, -0.45F, 0.4F); // Box 317
		ammoModel[140].setRotationPoint(6.05F, 1.2F, -2.4F);

		ammoModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.05F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.15F, -0.45F, 0.05F, -0.15F, -0.45F, 0.05F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.15F, -0.45F, 0.05F, -0.15F, -0.45F); // Box 318
		ammoModel[141].setRotationPoint(6.05F, -1.3F, -2.95F);

		ammoModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.05F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.15F, -0.45F, 0.05F, -0.15F, -0.45F, 0.05F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.15F, -0.45F, 0.05F, -0.15F, -0.45F); // Box 319
		ammoModel[142].setRotationPoint(6.05F, 0F, -2.95F);

		ammoModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.05F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.15F, -0.45F, 0.05F, -0.15F, -0.45F, 0.05F, -0.25F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F, -0.15F, -0.45F, 0.05F, -0.15F, -0.45F); // Box 320
		ammoModel[143].setRotationPoint(6.05F, 1.5F, -2.95F);

		ammoModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.05F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F); // Box 321
		ammoModel[144].setRotationPoint(6.05F, 1.5F, 2.55F);

		ammoModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.05F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F); // Box 322
		ammoModel[145].setRotationPoint(6.05F, 0F, 2.55F);

		ammoModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.05F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F, 0.05F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.25F, -0.45F, 0.05F, -0.25F, -0.45F); // Box 323
		ammoModel[146].setRotationPoint(6.05F, -1.3F, 2.55F);

		ammoModel[147].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.2F, 0.5F, -0.15F, -0.6F, 0.5F, -0.15F, -0.6F, 1.4F, -0.15F, -0.2F, 1.4F, -0.15F, -0.2F, -3.4F, -0.15F, -0.6F, -3.4F, -0.15F, -0.6F, -4.3F, -0.15F, -0.2F, -4.3F, -0.15F); // Box 286
		ammoModel[147].setRotationPoint(6.05F, -1F, -2.8F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 104

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.5F, -0.35F, 0.05F, -0.2F, -0.35F, 0.05F, -0.3F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.5F, -0.35F, 0.05F, -0.2F, -0.35F, 0.05F); // Box 104
		slideModel[0].setRotationPoint(4.8F, -3.2F, -1.6F);
		
		
	animationType = EnumAnimationType.BULLPUP;
		
		gunSlideDistance = 0.1F;
		translateAll(0F, -1F, 0F);
		
	}
}