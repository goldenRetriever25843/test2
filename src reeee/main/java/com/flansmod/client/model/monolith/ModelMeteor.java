//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.06.2016 - 02:33:44
// Last changed on: 23.06.2016 - 02:33:44

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMeteor extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMeteor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[182];
		tailModel = new ModelRendererTurbo[25];
		leftWingModel = new ModelRendererTurbo[3];
		rightWingModel = new ModelRendererTurbo[3];
		yawFlapModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		bodyWheelModel = new ModelRendererTurbo[26];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initbodyWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 4
		bodyModel[48] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 5
		bodyModel[49] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 6
		bodyModel[50] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 7
		bodyModel[51] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 8
		bodyModel[52] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 9
		bodyModel[53] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[54] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 11
		bodyModel[55] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 12
		bodyModel[56] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 13
		bodyModel[57] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 14
		bodyModel[58] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 26
		bodyModel[59] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 27
		bodyModel[60] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 28
		bodyModel[61] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Box 29
		bodyModel[62] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 30
		bodyModel[63] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 1
		bodyModel[65] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 2
		bodyModel[66] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Box 4
		bodyModel[67] = new ModelRendererTurbo(this, 777, 121, textureX, textureY); // Box 11
		bodyModel[68] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 19
		bodyModel[69] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 20
		bodyModel[70] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 21
		bodyModel[71] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Box 23
		bodyModel[72] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 24
		bodyModel[73] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 25
		bodyModel[74] = new ModelRendererTurbo(this, 737, 121, textureX, textureY); // Box 26
		bodyModel[75] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 27
		bodyModel[76] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 28
		bodyModel[77] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 29
		bodyModel[78] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 30
		bodyModel[79] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 31
		bodyModel[80] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 32
		bodyModel[81] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 33
		bodyModel[82] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 34
		bodyModel[83] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 35
		bodyModel[84] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 41
		bodyModel[85] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 42
		bodyModel[86] = new ModelRendererTurbo(this, 921, 137, textureX, textureY); // Box 43
		bodyModel[87] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 44
		bodyModel[88] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 46
		bodyModel[89] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 48
		bodyModel[90] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 1
		bodyModel[91] = new ModelRendererTurbo(this, 617, 169, textureX, textureY); // Box 2
		bodyModel[92] = new ModelRendererTurbo(this, 705, 169, textureX, textureY); // Box 3
		bodyModel[93] = new ModelRendererTurbo(this, 785, 169, textureX, textureY); // Box 4
		bodyModel[94] = new ModelRendererTurbo(this, 873, 169, textureX, textureY); // Box 5
		bodyModel[95] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 6
		bodyModel[96] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Box 7
		bodyModel[97] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 8
		bodyModel[98] = new ModelRendererTurbo(this, 945, 177, textureX, textureY); // Box 9
		bodyModel[99] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 10
		bodyModel[100] = new ModelRendererTurbo(this, 689, 193, textureX, textureY); // Box 11
		bodyModel[101] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 12
		bodyModel[102] = new ModelRendererTurbo(this, 761, 201, textureX, textureY); // Box 25
		bodyModel[103] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 26
		bodyModel[104] = new ModelRendererTurbo(this, 857, 209, textureX, textureY); // Box 27
		bodyModel[105] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 28
		bodyModel[106] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 30
		bodyModel[107] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 31
		bodyModel[108] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 38
		bodyModel[109] = new ModelRendererTurbo(this, 537, 217, textureX, textureY); // Box 39
		bodyModel[110] = new ModelRendererTurbo(this, 609, 217, textureX, textureY); // Box 40
		bodyModel[111] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 41
		bodyModel[112] = new ModelRendererTurbo(this, 665, 225, textureX, textureY); // Box 42
		bodyModel[113] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 43
		bodyModel[114] = new ModelRendererTurbo(this, 969, 209, textureX, textureY); // Box 44
		bodyModel[115] = new ModelRendererTurbo(this, 721, 225, textureX, textureY); // Box 45
		bodyModel[116] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 46
		bodyModel[117] = new ModelRendererTurbo(this, 713, 65, textureX, textureY); // Box 47
		bodyModel[118] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 48
		bodyModel[119] = new ModelRendererTurbo(this, 921, 121, textureX, textureY); // Box 49
		bodyModel[120] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 50
		bodyModel[121] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 51
		bodyModel[122] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Box 52
		bodyModel[123] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 53
		bodyModel[124] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 92
		bodyModel[125] = new ModelRendererTurbo(this, 753, 241, textureX, textureY); // Box 93
		bodyModel[126] = new ModelRendererTurbo(this, 881, 241, textureX, textureY); // Box 94
		bodyModel[127] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Box 95
		bodyModel[128] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 96
		bodyModel[129] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Box 97
		bodyModel[130] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Box 98
		bodyModel[131] = new ModelRendererTurbo(this, 561, 249, textureX, textureY); // Box 99
		bodyModel[132] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 100
		bodyModel[133] = new ModelRendererTurbo(this, 609, 257, textureX, textureY); // Box 101
		bodyModel[134] = new ModelRendererTurbo(this, 689, 257, textureX, textureY); // Box 102
		bodyModel[135] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 103
		bodyModel[136] = new ModelRendererTurbo(this, 169, 273, textureX, textureY); // Box 104
		bodyModel[137] = new ModelRendererTurbo(this, 321, 273, textureX, textureY); // Box 105
		bodyModel[138] = new ModelRendererTurbo(this, 409, 273, textureX, textureY); // Box 106
		bodyModel[139] = new ModelRendererTurbo(this, 737, 273, textureX, textureY); // Box 107
		bodyModel[140] = new ModelRendererTurbo(this, 833, 273, textureX, textureY); // Box 108
		bodyModel[141] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 109
		bodyModel[142] = new ModelRendererTurbo(this, 921, 273, textureX, textureY); // Box 110
		bodyModel[143] = new ModelRendererTurbo(this, 57, 281, textureX, textureY); // Box 111
		bodyModel[144] = new ModelRendererTurbo(this, 537, 281, textureX, textureY); // Box 112
		bodyModel[145] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 113
		bodyModel[146] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 114
		bodyModel[147] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 115
		bodyModel[148] = new ModelRendererTurbo(this, 617, 289, textureX, textureY); // Box 116
		bodyModel[149] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Box 117
		bodyModel[150] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 118
		bodyModel[151] = new ModelRendererTurbo(this, 673, 289, textureX, textureY); // Box 119
		bodyModel[152] = new ModelRendererTurbo(this, 857, 169, textureX, textureY); // Box 120
		bodyModel[153] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 121
		bodyModel[154] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 122
		bodyModel[155] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 123
		bodyModel[156] = new ModelRendererTurbo(this, 673, 201, textureX, textureY); // Box 124
		bodyModel[157] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 125
		bodyModel[158] = new ModelRendererTurbo(this, 153, 297, textureX, textureY); // Box 126
		bodyModel[159] = new ModelRendererTurbo(this, 273, 305, textureX, textureY); // Box 127
		bodyModel[160] = new ModelRendererTurbo(this, 481, 297, textureX, textureY); // Box 128
		bodyModel[161] = new ModelRendererTurbo(this, 705, 305, textureX, textureY); // Box 129
		bodyModel[162] = new ModelRendererTurbo(this, 401, 305, textureX, textureY); // Box 130
		bodyModel[163] = new ModelRendererTurbo(this, 801, 305, textureX, textureY); // Box 131
		bodyModel[164] = new ModelRendererTurbo(this, 865, 241, textureX, textureY); // Box 228
		bodyModel[165] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 229
		bodyModel[166] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 231
		bodyModel[167] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 232
		bodyModel[168] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 233
		bodyModel[169] = new ModelRendererTurbo(this, 689, 97, textureX, textureY); // Box 234
		bodyModel[170] = new ModelRendererTurbo(this, 105, 337, textureX, textureY); // Box 235
		bodyModel[171] = new ModelRendererTurbo(this, 665, 257, textureX, textureY); // Box 236
		bodyModel[172] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 239
		bodyModel[173] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 240
		bodyModel[174] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 244
		bodyModel[175] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 245
		bodyModel[176] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 246
		bodyModel[177] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 247
		bodyModel[178] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 248
		bodyModel[179] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 249
		bodyModel[180] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 250
		bodyModel[181] = new ModelRendererTurbo(this, 809, 273, textureX, textureY); // Box 251

		bodyModel[0].addShapeBox(0F, 0F, 0F, 35, 3, 17, 0F,0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-52F, -38F, -8.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 35, 2, 21, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-52F, -35F, -10.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 4, 25, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[2].setRotationPoint(-52F, -33F, -12.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 35, 6, 25, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(-52F, -23F, -12.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 35, 6, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -7F); // Box 4
		bodyModel[4].setRotationPoint(-52F, -11F, -11.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 33, 6, 23, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2F, -7F); // Box 5
		bodyModel[5].setRotationPoint(-85F, -11F, -11.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 5, 19, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -2F, -1F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, -1F, -6F); // Box 6
		bodyModel[6].setRotationPoint(-96F, -12F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 5, 17, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -2F, -1F, -6F, 2F, 0F, -5F, 2F, 0F, -5F, -2F, -1F, -6F); // Box 7
		bodyModel[7].setRotationPoint(-107F, -13F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 9, 5, 15, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, -2F, -2F, -6F, 2F, 0F, -5F, 2F, 0F, -5F, -2F, -2F, -6F); // Box 8
		bodyModel[8].setRotationPoint(-116F, -14F, -7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, -2F, -3F, -4F, 2F, 0F, -4F, 2F, 0F, -4F, -2F, -3F, -4F); // Box 9
		bodyModel[9].setRotationPoint(-124F, -15F, -5.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 33, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-85F, -17F, -11.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 33, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-85F, -23F, -11.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 33, 6, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-85F, -29F, -11.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 13
		bodyModel[13].setRotationPoint(-85F, -33F, -11.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 5, 23, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, -1F, -3F); // Box 14
		bodyModel[14].setRotationPoint(-99F, -17F, -11.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 14, 6, 23, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 15
		bodyModel[15].setRotationPoint(-99F, -23F, -11.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 33, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 16
		bodyModel[16].setRotationPoint(-85F, -17F, 8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 33, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-85F, -23F, 8.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 33, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-85F, -29F, 8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 19
		bodyModel[19].setRotationPoint(-85F, -33F, 6.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 14, 6, 23, 0F,0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 20
		bodyModel[20].setRotationPoint(-99F, -29F, -11.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 14, 4, 19, 0F,0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 21
		bodyModel[21].setRotationPoint(-99F, -33F, -9.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 4, 15, 0F,0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 22
		bodyModel[22].setRotationPoint(-107F, -33F, -7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 9, 4, 15, 0F,0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -3F); // Box 23
		bodyModel[23].setRotationPoint(-116F, -31F, -7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 4, 13, 0F,0F, -2.5F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2.5F, -5F, 0F, 0F, -3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -3F); // Box 24
		bodyModel[24].setRotationPoint(-121F, -29F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 4, 13, 0F,0F, -2.5F, -5F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, -2.5F, -5F, 0F, 0F, -4F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -4F); // Box 25
		bodyModel[25].setRotationPoint(-124F, -26F, -6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 7, 19, 0F,0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 26
		bodyModel[26].setRotationPoint(-107F, -29F, -9.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 6, 17, 0F,0F, 0F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 27
		bodyModel[27].setRotationPoint(-116F, -27F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 13, 0F,0F, 0F, -3F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 28
		bodyModel[28].setRotationPoint(-121F, -25F, -6.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 4, 21, 0F,0F, 0F, -2F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 29
		bodyModel[29].setRotationPoint(-107F, -17F, -10.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 9, 4, 19, 0F,0F, 0F, -3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -4F); // Box 30
		bodyModel[30].setRotationPoint(-116F, -18F, -9.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 9, 5, 21, 0F,0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -4F); // Box 31
		bodyModel[31].setRotationPoint(-116F, -22F, -10.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 6, 19, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 32
		bodyModel[32].setRotationPoint(-107F, -23F, -9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0F, -3F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 33
		bodyModel[33].setRotationPoint(-124F, -25F, -4.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 4, 13, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2.5F); // Box 34
		bodyModel[34].setRotationPoint(-121F, -21F, -6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 3, 13, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -4F); // Box 35
		bodyModel[35].setRotationPoint(-124F, -18F, -6.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -2F); // Box 36
		bodyModel[36].setRotationPoint(-124F, -20F, -4.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 35, 6, 25, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 37
		bodyModel[37].setRotationPoint(-52F, -17F, -12.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 35, 6, 25, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-52F, -29F, -12.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 57, 5, 15, 0F,0F, 0F, -4F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F); // Box 39
		bodyModel[39].setRotationPoint(-17F, -37F, -7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 57, 6, 21, 0F,0F, 0F, -3F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F); // Box 40
		bodyModel[40].setRotationPoint(-17F, -35F, -10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 57, 7, 23, 0F,0F, 0F, -1F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -4F, 0F); // Box 41
		bodyModel[41].setRotationPoint(-17F, -32F, -11.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 57, 7, 23, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F); // Box 42
		bodyModel[42].setRotationPoint(-17F, -29F, -11.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 57, 7, 23, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, 0F); // Box 43
		bodyModel[43].setRotationPoint(-17F, -23F, -11.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 57, 7, 23, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, -1F, 0F); // Box 44
		bodyModel[44].setRotationPoint(-17F, -17F, -11.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 57, 8, 23, 0F,0F, -2F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2F, 0F, 0F, -1F, -8F, 0F, -6F, -10F, 0F, -6F, -10F, 0F, -1F, -8F); // Box 0
		bodyModel[45].setRotationPoint(-17F, -13F, -11.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 59, 10, 9, 0F,0F, -8F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, 0F, -3F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, -3F); // Box 2
		bodyModel[46].setRotationPoint(40F, -21F, -4.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 59, 6, 13, 0F,0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3F, 0F); // Box 4
		bodyModel[47].setRotationPoint(40F, -35F, -6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 59, 6, 15, 0F,0F, 0F, -1F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, 0F); // Box 5
		bodyModel[48].setRotationPoint(40F, -32F, -7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 59, 4, 15, 0F,0F, 0F, 0F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, 0F); // Box 6
		bodyModel[49].setRotationPoint(40F, -29F, -7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 59, 9, 15, 0F,0F, 0F, 0F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, -3F, 0F); // Box 7
		bodyModel[50].setRotationPoint(40F, -28F, -7.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 59, 8, 15, 0F,0F, 0F, 0F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -3F, -1F); // Box 8
		bodyModel[51].setRotationPoint(40F, -22F, -7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 59, 7, 13, 0F,0F, 0F, 0F, 0F, 5F, -6F, 0F, 5F, -6F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -11F, -6F, 0F, -11F, -6F, 0F, -3F, -2F); // Box 9
		bodyModel[52].setRotationPoint(40F, -17F, -6.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 6, 13, 1, 0F); // Box 10
		bodyModel[53].setRotationPoint(99F, -32F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 11
		bodyModel[54].setRotationPoint(84F, -19F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[55].setRotationPoint(88F, -19F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[56].setRotationPoint(91F, -21F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 11, 33, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[57].setRotationPoint(94F, -46F, -1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[58].setRotationPoint(100F, -63F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 5, 2, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[59].setRotationPoint(95F, -60F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 16, 9, 2, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[60].setRotationPoint(89F, -55F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 14, 17, 2, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[61].setRotationPoint(80F, -46F, -1F);

		bodyModel[62].addBox(0F, 0F, 0F, 46, 3, 3, 0F); // Box 30
		bodyModel[62].setRotationPoint(82F, -47F, -1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 16, 2, 38, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F); // Box 0
		bodyModel[63].setRotationPoint(92F, -46.5F, 1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 1
		bodyModel[64].setRotationPoint(98F, -46.5F, 39F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F); // Box 2
		bodyModel[65].setRotationPoint(99F, -46.5F, 43F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F); // Box 4
		bodyModel[66].setRotationPoint(101F, -46.5F, 45F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 16, 2, 38, 0F,-6F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[67].setRotationPoint(92F, -46.5F, -39F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,-3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[68].setRotationPoint(101F, -46.5F, -47F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 20
		bodyModel[69].setRotationPoint(99F, -46.5F, -45F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 21
		bodyModel[70].setRotationPoint(98F, -46.5F, -43F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 33, 2, 4, 0F,0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[71].setRotationPoint(-85F, -35F, -10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.2F); // Box 24
		bodyModel[72].setRotationPoint(-54F, -38F, -3.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 20, 3, 5, 0F,0F, -3F, -1.6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0.6F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -3F); // Box 25
		bodyModel[73].setRotationPoint(-72F, -38F, -8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 20, 3, 5, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -1.6F, 0F, 0.6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -1.2F); // Box 26
		bodyModel[74].setRotationPoint(-72F, -38F, 3.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 33, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 27
		bodyModel[75].setRotationPoint(-85F, -35F, 6.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, -0.5F, -5F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 28
		bodyModel[76].setRotationPoint(-97F, -34F, -7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4.5F); // Box 29
		bodyModel[77].setRotationPoint(-97F, -34F, 2.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[78].setRotationPoint(-98F, -34F, -3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[79].setRotationPoint(-86.5F, -42F, -4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 32
		bodyModel[80].setRotationPoint(-85.5F, -41F, 3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F); // Box 33
		bodyModel[81].setRotationPoint(-85.5F, -41F, -7F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 34
		bodyModel[82].setRotationPoint(-86.5F, -41.5F, -4F);
		bodyModel[82].rotateAngleZ = -0.9250245F;

		bodyModel[83].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 35
		bodyModel[83].setRotationPoint(-86.5F, -41.5F, 3F);
		bodyModel[83].rotateAngleZ = -0.9250245F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 22, 10, 24, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 41
		bodyModel[84].setRotationPoint(-52F, -21F, 11.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 37, 9, 26, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 42
		bodyModel[85].setRotationPoint(-30F, -20F, 9.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 22, 8, 22, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[86].setRotationPoint(-52F, -21F, 35.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 37, 7, 22, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[87].setRotationPoint(-30F, -20F, 35.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 7, 10, 24, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F); // Box 46
		bodyModel[88].setRotationPoint(-59F, -21F, 11.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 10, 22, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F); // Box 48
		bodyModel[89].setRotationPoint(-57F, -21F, 35.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 22, 4, 17, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[90].setRotationPoint(-52F, -28F, -54.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 22, 4, 21, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[91].setRotationPoint(-52F, -24F, -56.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 22, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 3
		bodyModel[92].setRotationPoint(-52F, -8F, -54.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 22, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 4
		bodyModel[93].setRotationPoint(-52F, -12F, -56.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 22, 4, 23, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[94].setRotationPoint(-52F, -20F, -57.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 22, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyModel[95].setRotationPoint(-52F, -16F, -57.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 14, 4, 17, 0F,0F, 0F, -4F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 7
		bodyModel[96].setRotationPoint(-30F, -28F, -54.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 14, 4, 21, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 8
		bodyModel[97].setRotationPoint(-30F, -24F, -56.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 14, 4, 23, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 9
		bodyModel[98].setRotationPoint(-30F, -20F, -57.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 14, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 10
		bodyModel[99].setRotationPoint(-30F, -16F, -57.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 14, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 11
		bodyModel[100].setRotationPoint(-30F, -12F, -56.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 14, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F); // Box 12
		bodyModel[101].setRotationPoint(-30F, -8F, -54.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 42, 4, 15, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -4F); // Box 25
		bodyModel[102].setRotationPoint(-16F, -8F, -53.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 42, 4, 19, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F); // Box 26
		bodyModel[103].setRotationPoint(-16F, -12F, -55.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 42, 4, 21, 0F,0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -1F); // Box 27
		bodyModel[104].setRotationPoint(-16F, -16F, -56.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 42, 4, 21, 0F,0F, 0F, -1F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F); // Box 28
		bodyModel[105].setRotationPoint(-16F, -20F, -56.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 42, 6, 15, 0F,0F, 0F, -4F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -4F, 0F); // Box 30
		bodyModel[106].setRotationPoint(-16F, -26F, -53.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 42, 4, 21, 0F,0F, 0F, -3F, 0F, -5F, -6F, 0F, -5F, -6F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 4F, -5F, 0F, 4F, -5F, 0F, 0F, -1F); // Box 31
		bodyModel[107].setRotationPoint(-16F, -24F, -56.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 14, 4, 17, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 38
		bodyModel[108].setRotationPoint(-66F, -28F, -54.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 14, 4, 21, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 39
		bodyModel[109].setRotationPoint(-66F, -24F, -56.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 14, 4, 23, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 40
		bodyModel[110].setRotationPoint(-66F, -20F, -57.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 14, 4, 23, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 41
		bodyModel[111].setRotationPoint(-66F, -16F, -57.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 14, 4, 21, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 42
		bodyModel[112].setRotationPoint(-66F, -12F, -56.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 14, 4, 17, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 43
		bodyModel[113].setRotationPoint(-66F, -8F, -54.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 4, 15, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -6F); // Box 44
		bodyModel[114].setRotationPoint(-75F, -10F, -53.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 9, 4, 15, 0F,0F, -2F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F); // Box 45
		bodyModel[115].setRotationPoint(-75F, -27F, -53.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 46
		bodyModel[116].setRotationPoint(-75F, -12F, -55.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[117].setRotationPoint(-75F, -16F, -56.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[118].setRotationPoint(-75F, -20F, -56.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		bodyModel[119].setRotationPoint(-75F, -24F, -55.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 50
		bodyModel[120].setRotationPoint(-75F, -24F, -43.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 51
		bodyModel[121].setRotationPoint(-75F, -20F, -42.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F); // Box 52
		bodyModel[122].setRotationPoint(-75F, -16F, -42.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -5F); // Box 53
		bodyModel[123].setRotationPoint(-75F, -12F, -43.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 42, 6, 15, 0F,0F, 0F, -4F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -4F, 0F); // Box 92
		bodyModel[124].setRotationPoint(-16F, -26F, 38.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 42, 4, 21, 0F,0F, 0F, -3F, 0F, -5F, -6F, 0F, -5F, -6F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 4F, -5F, 0F, 4F, -5F, 0F, 0F, -1F); // Box 93
		bodyModel[125].setRotationPoint(-16F, -24F, 35.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 42, 4, 21, 0F,0F, 0F, -1F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F); // Box 94
		bodyModel[126].setRotationPoint(-16F, -20F, 35.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 42, 4, 21, 0F,0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -1F); // Box 95
		bodyModel[127].setRotationPoint(-16F, -16F, 35.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 42, 4, 19, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F); // Box 96
		bodyModel[128].setRotationPoint(-16F, -12F, 36.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 42, 4, 15, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -4F); // Box 97
		bodyModel[129].setRotationPoint(-16F, -8F, 38.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 14, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F); // Box 98
		bodyModel[130].setRotationPoint(-30F, -8F, 37.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 14, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 99
		bodyModel[131].setRotationPoint(-30F, -12F, 35.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 14, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 100
		bodyModel[132].setRotationPoint(-30F, -16F, 34.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 14, 4, 23, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 101
		bodyModel[133].setRotationPoint(-30F, -20F, 34.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 14, 4, 21, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 102
		bodyModel[134].setRotationPoint(-30F, -24F, 35.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 14, 4, 17, 0F,0F, 0F, -4F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 103
		bodyModel[135].setRotationPoint(-30F, -28F, 37.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 22, 4, 17, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[136].setRotationPoint(-52F, -28F, 37.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 22, 4, 21, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[137].setRotationPoint(-52F, -24F, 35.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 22, 4, 23, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[138].setRotationPoint(-52F, -20F, 34.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 22, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 107
		bodyModel[139].setRotationPoint(-52F, -16F, 34.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 22, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 108
		bodyModel[140].setRotationPoint(-52F, -12F, 35.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 22, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 109
		bodyModel[141].setRotationPoint(-52F, -8F, 37.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 14, 4, 21, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 110
		bodyModel[142].setRotationPoint(-66F, -12F, 35.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 14, 4, 23, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 111
		bodyModel[143].setRotationPoint(-66F, -16F, 34.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 14, 4, 23, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 112
		bodyModel[144].setRotationPoint(-66F, -20F, 34.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 14, 4, 21, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 113
		bodyModel[145].setRotationPoint(-66F, -24F, 35.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 14, 4, 17, 0F,0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 114
		bodyModel[146].setRotationPoint(-66F, -28F, 37.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 14, 4, 17, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 115
		bodyModel[147].setRotationPoint(-66F, -8F, 37.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 9, 4, 15, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -6F); // Box 116
		bodyModel[148].setRotationPoint(-75F, -10F, 38.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 117
		bodyModel[149].setRotationPoint(-75F, -12F, 36.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 118
		bodyModel[150].setRotationPoint(-75F, -24F, 36.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 9, 4, 15, 0F,0F, -2F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F); // Box 119
		bodyModel[151].setRotationPoint(-75F, -27F, 38.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 120
		bodyModel[152].setRotationPoint(-75F, -24F, 48.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 121
		bodyModel[153].setRotationPoint(-75F, -20F, 49.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[154].setRotationPoint(-75F, -16F, 35.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[155].setRotationPoint(-75F, -20F, 35.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F); // Box 124
		bodyModel[156].setRotationPoint(-75F, -16F, 49.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -5F); // Box 125
		bodyModel[157].setRotationPoint(-75F, -12F, 48.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 22, 10, 24, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[158].setRotationPoint(-52F, -21F, -35.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 37, 9, 26, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.2F, 0F); // Box 127
		bodyModel[159].setRotationPoint(-30F, -20F, -35.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 7, 10, 24, 0F,-2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 128
		bodyModel[160].setRotationPoint(-59F, -21F, -35.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 22, 8, 22, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[161].setRotationPoint(-52F, -21F, -57.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 10, 22, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F); // Box 130
		bodyModel[162].setRotationPoint(-57F, -21F, -57.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 37, 7, 22, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[163].setRotationPoint(-30F, -20F, -57.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[164].setRotationPoint(-88F, -31F, -7F);
		bodyModel[164].rotateAngleZ = 0.20943951F;

		bodyModel[165].addShapeBox(0F, -2.5F, 0F, 4, 2, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 229
		bodyModel[165].setRotationPoint(-88F, -31F, -7F);
		bodyModel[165].rotateAngleZ = 0.17453293F;

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[166].setRotationPoint(-88F, -35F, -1.5F);
		bodyModel[166].rotateAngleZ = -0.08726646F;

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 232
		bodyModel[167].setRotationPoint(-86F, -36.8F, -1.5F);
		bodyModel[167].rotateAngleZ = -0.43633231F;

		bodyModel[168].addShapeBox(0F, -2.5F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 233
		bodyModel[168].setRotationPoint(-88F, -31F, 3F);
		bodyModel[168].rotateAngleZ = 0.17453293F;

		bodyModel[169].addShapeBox(0F, 1F, 0F, 4, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 234
		bodyModel[169].setRotationPoint(-86.8F, -25F, -3F);
		bodyModel[169].rotateAngleZ = 0.78539816F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 34, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[170].setRotationPoint(-85F, -17F, -10.5F);

		bodyModel[171].addShapeBox(0F, 1F, 0F, 8, 10, 8, 0F,0F, 0F, -0.5F, -1F, -3F, -1F, -1F, -3F, -1F, 0F, 0F, -0.5F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F); // Box 236
		bodyModel[171].setRotationPoint(-87.8F, -27F, -4F);

		bodyModel[172].addShapeBox(0F, -11F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F); // Box 239
		bodyModel[172].setRotationPoint(-78.8F, -9F, 4F);

		bodyModel[173].addShapeBox(0F, -11F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F); // Box 240
		bodyModel[173].setRotationPoint(-78.8F, -9F, -8F);

		bodyModel[174].addShapeBox(0F, 1F, 0F, 8, 4, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[174].setRotationPoint(-74.8F, -22F, -5F);

		bodyModel[175].addShapeBox(0F, 1F, 0F, 8, 6, 2, 0F,2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[175].setRotationPoint(-74.8F, -24F, -7F);

		bodyModel[176].addShapeBox(0F, 1F, 0F, 8, 6, 2, 0F,2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[176].setRotationPoint(-74.8F, -24F, 5F);

		bodyModel[177].addShapeBox(0F, 1F, 0F, 3, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[177].setRotationPoint(-65.8F, -31F, -5F);
		bodyModel[177].rotateAngleZ = -0.13962634F;

		bodyModel[178].addShapeBox(0F, 1F, 0F, 3, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[178].setRotationPoint(-65.5F, -37F, -5F);
		bodyModel[178].rotateAngleZ = -0.06981317F;

		bodyModel[179].addShapeBox(0F, 1F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[179].setRotationPoint(-65.5F, -41F, -4F);

		bodyModel[180].addShapeBox(0F, 1F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, -1.5F, 0F, 3F); // Box 250
		bodyModel[180].setRotationPoint(-62.5F, -40F, -3F);
		bodyModel[180].rotateAngleZ = -0.26179939F;

		bodyModel[181].addShapeBox(0F, 1F, 0F, 10, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[181].setRotationPoint(-62.5F, -36F, -6F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 15
		tailModel[1] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 16
		tailModel[2] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 17
		tailModel[3] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 18
		tailModel[4] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 19
		tailModel[5] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 20
		tailModel[6] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 21
		tailModel[7] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 22
		tailModel[8] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 23
		tailModel[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 24
		tailModel[10] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 25
		tailModel[11] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 3
		tailModel[12] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Box 5
		tailModel[13] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 6
		tailModel[14] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 7
		tailModel[15] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 8
		tailModel[16] = new ModelRendererTurbo(this, 937, 73, textureX, textureY); // Box 9
		tailModel[17] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 10
		tailModel[18] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 12
		tailModel[19] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 13
		tailModel[20] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 14
		tailModel[21] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 15
		tailModel[22] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 16
		tailModel[23] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 17
		tailModel[24] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 18

		tailModel[0].addShapeBox(0F, 0F, 0F, 14, 42, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 15
		tailModel[0].setRotationPoint(105F, -58F, -1F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 6, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 16
		tailModel[1].setRotationPoint(119F, -44F, -1F);

		tailModel[2].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 17
		tailModel[2].setRotationPoint(119F, -48F, -1F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		tailModel[3].setRotationPoint(119F, -52F, -1F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		tailModel[4].setRotationPoint(119F, -58F, -1F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		tailModel[5].setRotationPoint(105F, -59F, -1F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		tailModel[6].setRotationPoint(105F, -60F, -1F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		tailModel[7].setRotationPoint(105F, -62F, -1F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		tailModel[8].setRotationPoint(105F, -63F, -1F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[9].setRotationPoint(111F, -64F, -1F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		tailModel[10].setRotationPoint(105F, -64F, -1F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 3
		tailModel[11].setRotationPoint(108F, -45.5F, 43F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		tailModel[12].setRotationPoint(108F, -45.5F, 39F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 6
		tailModel[13].setRotationPoint(108F, -45.5F, 35F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 14, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 7
		tailModel[14].setRotationPoint(108F, -45.5F, 23F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 8
		tailModel[15].setRotationPoint(108F, -45.5F, 14F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 9
		tailModel[16].setRotationPoint(108F, -45.5F, 5F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		tailModel[17].setRotationPoint(108F, -45.5F, 1F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		tailModel[18].setRotationPoint(108F, -45.5F, -5F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		tailModel[19].setRotationPoint(108F, -45.5F, -14F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		tailModel[20].setRotationPoint(108F, -45.5F, -23F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 14, 1, 12, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		tailModel[21].setRotationPoint(108F, -45.5F, -35F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		tailModel[22].setRotationPoint(108F, -45.5F, -39F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		tailModel[23].setRotationPoint(108F, -45.5F, -43F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		tailModel[24].setRotationPoint(108F, -45.5F, -47F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 865, 305, textureX, textureY); // Box 199
		leftWingModel[1] = new ModelRendererTurbo(this, 17, 313, textureX, textureY); // Box 200
		leftWingModel[2] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Box 201

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 22, 12, 55, 0F,-9F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, -9F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		leftWingModel[0].setRotationPoint(-52F, -25F, -112.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 14, 14, 55, 0F,-12F, -2F, 0F, 0F, 0F, 0F, -9F, -4F, 0F, 0F, -6F, 0F, -12F, -11F, 0F, 0F, -10F, 0F, -9F, -2F, 0F, 0F, -4F, 0F); // Box 200
		leftWingModel[1].setRotationPoint(-57F, -25F, -112.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 37, 11, 55, 0F,0F, 0F, 0F, -20F, 0F, -2F, 0F, -10F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, -20F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftWingModel[2].setRotationPoint(-30F, -24F, -112.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 45
		rightWingModel[1] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 47
		rightWingModel[2] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 0

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 22, 12, 55, 0F,0F, -4F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -9F, -8F, 0F); // Box 45
		rightWingModel[0].setRotationPoint(-52F, -25F, 57.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 14, 14, 55, 0F,0F, -6F, 0F, -9F, -4F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, 0F, -4F, 0F, -9F, -2F, 0F, 0F, -10F, 0F, -12F, -11F, 0F); // Box 47
		rightWingModel[1].setRotationPoint(-57F, -25F, 57.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 37, 11, 55, 0F,0F, -4F, 0F, 0F, -10F, 0F, -20F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -10F, -2F, 0F, -8F, 0F); // Box 0
		rightWingModel[2].setRotationPoint(-30F, -24F, 57.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 241
		yawFlapModel[1] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Box 242
		yawFlapModel[2] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 243

		yawFlapModel[0].addShapeBox(0F, -11F, 5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		yawFlapModel[0].setRotationPoint(-83.8F, -9F, 0F);

		yawFlapModel[1].addShapeBox(0F, -11F, -8F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		yawFlapModel[1].setRotationPoint(-83.8F, -9F, 0F);

		yawFlapModel[2].addShapeBox(-1F, -11F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		yawFlapModel[2].setRotationPoint(-83.8F, -9F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 237
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 238

		pitchFlapLeftModel[0].addShapeBox(0F, -11F, 0F, 2, 10, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 237
		pitchFlapLeftModel[0].setRotationPoint(-78.8F, -16F, -1F);

		pitchFlapLeftModel[1].addShapeBox(0F, -14F, 0F, 2, 3, 2, 0F,-1.2F, 0.2F, -0.52F, 0F, 0F, -0.52F, 0F, 0F, -0.52F, -1.2F, 0.2F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.52F); // Box 238
		pitchFlapLeftModel[1].setRotationPoint(-78.8F, -16F, -1F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 202
		bodyWheelModel[1] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 203
		bodyWheelModel[2] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 204
		bodyWheelModel[3] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 205
		bodyWheelModel[4] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 206
		bodyWheelModel[5] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 207
		bodyWheelModel[6] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 208
		bodyWheelModel[7] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 209
		bodyWheelModel[8] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 210
		bodyWheelModel[9] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 211
		bodyWheelModel[10] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 212
		bodyWheelModel[11] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 213
		bodyWheelModel[12] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 214
		bodyWheelModel[13] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 215
		bodyWheelModel[14] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 216
		bodyWheelModel[15] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 217
		bodyWheelModel[16] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 218
		bodyWheelModel[17] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 219
		bodyWheelModel[18] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 220
		bodyWheelModel[19] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 221
		bodyWheelModel[20] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 222
		bodyWheelModel[21] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 223
		bodyWheelModel[22] = new ModelRendererTurbo(this, 761, 225, textureX, textureY); // Box 224
		bodyWheelModel[23] = new ModelRendererTurbo(this, 809, 225, textureX, textureY); // Box 225
		bodyWheelModel[24] = new ModelRendererTurbo(this, 521, 217, textureX, textureY); // Box 226
		bodyWheelModel[25] = new ModelRendererTurbo(this, 593, 217, textureX, textureY); // Box 227

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyWheelModel[0].setRotationPoint(-111F, 4F, -1F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 203
		bodyWheelModel[1].setRotationPoint(-111F, 7F, -1F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyWheelModel[2].setRotationPoint(-111F, 1F, -1F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyWheelModel[3].setRotationPoint(-109F, -10F, -3F);
		bodyWheelModel[3].rotateAngleZ = -0.45378561F;

		bodyWheelModel[4].addShapeBox(0F, -2F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyWheelModel[4].setRotationPoint(-106F, -9F, -1F);
		bodyWheelModel[4].rotateAngleZ = -0.45378561F;

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyWheelModel[5].setRotationPoint(-111F, 2F, -2F);
		bodyWheelModel[5].rotateAngleZ = 0.78539816F;

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyWheelModel[6].setRotationPoint(-111F, 2F, 1F);
		bodyWheelModel[6].rotateAngleZ = 0.78539816F;

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyWheelModel[7].setRotationPoint(-110.5F, 0.5F, -1.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyWheelModel[8].setRotationPoint(-47.5F, 0.5F, 31.5F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyWheelModel[9].setRotationPoint(-48F, 2F, 31F);
		bodyWheelModel[9].rotateAngleZ = 0.78539816F;

		bodyWheelModel[10].addShapeBox(0F, -6F, 0F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyWheelModel[10].setRotationPoint(-43F, -9F, 32F);
		bodyWheelModel[10].rotateAngleZ = -0.45378561F;

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyWheelModel[11].setRotationPoint(-48F, 1F, 32F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyWheelModel[12].setRotationPoint(-48F, 4F, 32F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 215
		bodyWheelModel[13].setRotationPoint(-48F, 7F, 32F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyWheelModel[14].setRotationPoint(-48F, 2F, 34F);
		bodyWheelModel[14].rotateAngleZ = 0.78539816F;

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyWheelModel[15].setRotationPoint(-47.5F, 0.5F, -34.5F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyWheelModel[16].setRotationPoint(-48F, 2F, -32F);
		bodyWheelModel[16].rotateAngleZ = 0.78539816F;

		bodyWheelModel[17].addShapeBox(0F, -6F, 0F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyWheelModel[17].setRotationPoint(-43F, -9F, -34F);
		bodyWheelModel[17].rotateAngleZ = -0.45378561F;

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyWheelModel[18].setRotationPoint(-48F, 1F, -34F);

		bodyWheelModel[19].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyWheelModel[19].setRotationPoint(-48F, 4F, -34F);

		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 222
		bodyWheelModel[20].setRotationPoint(-48F, 7F, -34F);

		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyWheelModel[21].setRotationPoint(-48F, 2F, -35F);
		bodyWheelModel[21].rotateAngleZ = 0.78539816F;

		bodyWheelModel[22].addShapeBox(0F, -6F, 0F, 22, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyWheelModel[22].setRotationPoint(-43F, -7F, -28F);

		bodyWheelModel[23].addShapeBox(0F, -6F, 0F, 22, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyWheelModel[23].setRotationPoint(-43F, -7F, 27F);

		bodyWheelModel[24].addShapeBox(0F, -6F, 0F, 16, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyWheelModel[24].setRotationPoint(-96F, -7F, 4F);

		bodyWheelModel[25].addShapeBox(0F, -6F, 0F, 16, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyWheelModel[25].setRotationPoint(-96F, -7F, -5F);
	}
}