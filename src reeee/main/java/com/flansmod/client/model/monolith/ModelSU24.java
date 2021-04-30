//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.05.2016 - 15:55:37
// Last changed on: 24.05.2016 - 15:55:37

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSU24 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSU24() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[275];
		noseModel = new ModelRendererTurbo[40];
		tailModel = new ModelRendererTurbo[37];
		leftWingModel = new ModelRendererTurbo[1];
		rightWingModel = new ModelRendererTurbo[1];
		yawFlapModel = new ModelRendererTurbo[8];
		bodyWheelModel = new ModelRendererTurbo[22];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initbodyWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 537, 161, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); // Box 54
		bodyModel[53] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 235
		bodyModel[55] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 2
		bodyModel[56] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Box 3
		bodyModel[57] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 27
		bodyModel[58] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 5
		bodyModel[59] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 6
		bodyModel[60] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 7
		bodyModel[61] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 8
		bodyModel[62] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 9
		bodyModel[63] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 10
		bodyModel[64] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 11
		bodyModel[65] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 12
		bodyModel[66] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 13
		bodyModel[67] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 14
		bodyModel[68] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 15
		bodyModel[69] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 16
		bodyModel[70] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 17
		bodyModel[71] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 18
		bodyModel[72] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
		bodyModel[73] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 20
		bodyModel[74] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 22
		bodyModel[75] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 23
		bodyModel[76] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 24
		bodyModel[77] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 25
		bodyModel[78] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 27
		bodyModel[79] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 28
		bodyModel[80] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 29
		bodyModel[81] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 30
		bodyModel[82] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 31
		bodyModel[83] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 32
		bodyModel[84] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 33
		bodyModel[85] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 35
		bodyModel[86] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 36
		bodyModel[87] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 37
		bodyModel[88] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 38
		bodyModel[89] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 39
		bodyModel[90] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 40
		bodyModel[91] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 41
		bodyModel[92] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 42
		bodyModel[93] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 43
		bodyModel[94] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 44
		bodyModel[95] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 45
		bodyModel[96] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 46
		bodyModel[97] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 47
		bodyModel[98] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 48
		bodyModel[99] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 49
		bodyModel[100] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 50
		bodyModel[101] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 51
		bodyModel[102] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 52
		bodyModel[103] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 53
		bodyModel[104] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 54
		bodyModel[105] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 55
		bodyModel[106] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 56
		bodyModel[107] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 57
		bodyModel[108] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 97
		bodyModel[109] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 98
		bodyModel[110] = new ModelRendererTurbo(this, 633, 225, textureX, textureY); // Box 99
		bodyModel[111] = new ModelRendererTurbo(this, 1001, 209, textureX, textureY); // Box 100
		bodyModel[112] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 101
		bodyModel[113] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 102
		bodyModel[114] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 103
		bodyModel[115] = new ModelRendererTurbo(this, 633, 161, textureX, textureY); // Box 104
		bodyModel[116] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 105
		bodyModel[117] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 106
		bodyModel[118] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 107
		bodyModel[119] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 108
		bodyModel[120] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 109
		bodyModel[121] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 110
		bodyModel[122] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 111
		bodyModel[123] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 112
		bodyModel[124] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 113
		bodyModel[125] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 114
		bodyModel[126] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 115
		bodyModel[127] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Box 116
		bodyModel[128] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 117
		bodyModel[129] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 118
		bodyModel[130] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 119
		bodyModel[131] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 120
		bodyModel[132] = new ModelRendererTurbo(this, 769, 73, textureX, textureY); // Box 121
		bodyModel[133] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 122
		bodyModel[134] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Box 123
		bodyModel[135] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Box 124
		bodyModel[136] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 125
		bodyModel[137] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 126
		bodyModel[138] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 127
		bodyModel[139] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 128
		bodyModel[140] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 129
		bodyModel[141] = new ModelRendererTurbo(this, 777, 177, textureX, textureY); // Box 130
		bodyModel[142] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 131
		bodyModel[143] = new ModelRendererTurbo(this, 673, 225, textureX, textureY); // Box 132
		bodyModel[144] = new ModelRendererTurbo(this, 697, 225, textureX, textureY); // Box 133
		bodyModel[145] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Box 134
		bodyModel[146] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 135
		bodyModel[147] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 136
		bodyModel[148] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 137
		bodyModel[149] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 138
		bodyModel[150] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 139
		bodyModel[151] = new ModelRendererTurbo(this, 737, 225, textureX, textureY); // Box 140
		bodyModel[152] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 141
		bodyModel[153] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 142
		bodyModel[154] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 143
		bodyModel[155] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 144
		bodyModel[156] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Box 145
		bodyModel[157] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 146
		bodyModel[158] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 147
		bodyModel[159] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Box 148
		bodyModel[160] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 149
		bodyModel[161] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 150
		bodyModel[162] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 151
		bodyModel[163] = new ModelRendererTurbo(this, 585, 241, textureX, textureY); // Box 152
		bodyModel[164] = new ModelRendererTurbo(this, 953, 225, textureX, textureY); // Box 153
		bodyModel[165] = new ModelRendererTurbo(this, 737, 233, textureX, textureY); // Box 154
		bodyModel[166] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 155
		bodyModel[167] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Box 156
		bodyModel[168] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 157
		bodyModel[169] = new ModelRendererTurbo(this, 681, 241, textureX, textureY); // Box 0
		bodyModel[170] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Box 1
		bodyModel[171] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 2
		bodyModel[172] = new ModelRendererTurbo(this, 977, 241, textureX, textureY); // Box 3
		bodyModel[173] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 4
		bodyModel[174] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 5
		bodyModel[175] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 6
		bodyModel[176] = new ModelRendererTurbo(this, 633, 233, textureX, textureY); // Box 7
		bodyModel[177] = new ModelRendererTurbo(this, 537, 249, textureX, textureY); // Box 8
		bodyModel[178] = new ModelRendererTurbo(this, 777, 249, textureX, textureY); // Box 9
		bodyModel[179] = new ModelRendererTurbo(this, 713, 241, textureX, textureY); // Box 10
		bodyModel[180] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 11
		bodyModel[181] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 12
		bodyModel[182] = new ModelRendererTurbo(this, 817, 249, textureX, textureY); // Box 13
		bodyModel[183] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 14
		bodyModel[184] = new ModelRendererTurbo(this, 489, 249, textureX, textureY); // Box 15
		bodyModel[185] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 16
		bodyModel[186] = new ModelRendererTurbo(this, 945, 145, textureX, textureY); // Box 17
		bodyModel[187] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Box 18
		bodyModel[188] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Box 19
		bodyModel[189] = new ModelRendererTurbo(this, 185, 257, textureX, textureY); // Box 20
		bodyModel[190] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Box 21
		bodyModel[191] = new ModelRendererTurbo(this, 849, 257, textureX, textureY); // Box 22
		bodyModel[192] = new ModelRendererTurbo(this, 561, 265, textureX, textureY); // Box 23
		bodyModel[193] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 0
		bodyModel[194] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 1
		bodyModel[195] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 2
		bodyModel[196] = new ModelRendererTurbo(this, 705, 265, textureX, textureY); // Box 4
		bodyModel[197] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 5
		bodyModel[198] = new ModelRendererTurbo(this, 705, 289, textureX, textureY); // Box 6
		bodyModel[199] = new ModelRendererTurbo(this, 777, 265, textureX, textureY); // Box 7
		bodyModel[200] = new ModelRendererTurbo(this, 953, 265, textureX, textureY); // Box 8
		bodyModel[201] = new ModelRendererTurbo(this, 281, 297, textureX, textureY); // Box 9
		bodyModel[202] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Box 10
		bodyModel[203] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 11
		bodyModel[204] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 12
		bodyModel[205] = new ModelRendererTurbo(this, 145, 273, textureX, textureY); // Box 13
		bodyModel[206] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 15
		bodyModel[207] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Box 16
		bodyModel[208] = new ModelRendererTurbo(this, 809, 281, textureX, textureY); // Box 17
		bodyModel[209] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 18
		bodyModel[210] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Box 19
		bodyModel[211] = new ModelRendererTurbo(this, 809, 305, textureX, textureY); // Box 20
		bodyModel[212] = new ModelRendererTurbo(this, 385, 313, textureX, textureY); // Box 21
		bodyModel[213] = new ModelRendererTurbo(this, 937, 297, textureX, textureY); // Box 22
		bodyModel[214] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 23
		bodyModel[215] = new ModelRendererTurbo(this, 697, 257, textureX, textureY); // Box 24
		bodyModel[216] = new ModelRendererTurbo(this, 553, 265, textureX, textureY); // Box 25
		bodyModel[217] = new ModelRendererTurbo(this, 569, 313, textureX, textureY); // Box 26
		bodyModel[218] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 27
		bodyModel[219] = new ModelRendererTurbo(this, 897, 305, textureX, textureY); // Box 28
		bodyModel[220] = new ModelRendererTurbo(this, 569, 249, textureX, textureY); // Box 29
		bodyModel[221] = new ModelRendererTurbo(this, 761, 265, textureX, textureY); // Box 30
		bodyModel[222] = new ModelRendererTurbo(this, 1001, 265, textureX, textureY); // Box 31
		bodyModel[223] = new ModelRendererTurbo(this, 681, 313, textureX, textureY); // Box 32
		bodyModel[224] = new ModelRendererTurbo(this, 729, 313, textureX, textureY); // Box 33
		bodyModel[225] = new ModelRendererTurbo(this, 329, 321, textureX, textureY); // Box 34
		bodyModel[226] = new ModelRendererTurbo(this, 953, 321, textureX, textureY); // Box 36
		bodyModel[227] = new ModelRendererTurbo(this, 185, 329, textureX, textureY); // Box 37
		bodyModel[228] = new ModelRendererTurbo(this, 225, 361, textureX, textureY); // Box 47
		bodyModel[229] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 48
		bodyModel[230] = new ModelRendererTurbo(this, 161, 369, textureX, textureY); // Box 51
		bodyModel[231] = new ModelRendererTurbo(this, 337, 377, textureX, textureY); // Box 52
		bodyModel[232] = new ModelRendererTurbo(this, 1, 409, textureX, textureY); // Box 69
		bodyModel[233] = new ModelRendererTurbo(this, 649, 465, textureX, textureY); // Box 103
		bodyModel[234] = new ModelRendererTurbo(this, 785, 473, textureX, textureY); // Box 104
		bodyModel[235] = new ModelRendererTurbo(this, 257, 481, textureX, textureY); // Box 0
		bodyModel[236] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Box 1
		bodyModel[237] = new ModelRendererTurbo(this, 745, 489, textureX, textureY); // Box 128
		bodyModel[238] = new ModelRendererTurbo(this, 849, 489, textureX, textureY); // Box 129
		bodyModel[239] = new ModelRendererTurbo(this, 105, 441, textureX, textureY); // Box 130
		bodyModel[240] = new ModelRendererTurbo(this, 89, 489, textureX, textureY); // Box 131
		bodyModel[241] = new ModelRendererTurbo(this, 953, 489, textureX, textureY); // Box 132
		bodyModel[242] = new ModelRendererTurbo(this, 257, 497, textureX, textureY); // Box 133
		bodyModel[243] = new ModelRendererTurbo(this, 321, 497, textureX, textureY); // Box 134
		bodyModel[244] = new ModelRendererTurbo(this, 385, 497, textureX, textureY); // Box 135
		bodyModel[245] = new ModelRendererTurbo(this, 489, 497, textureX, textureY); // Box 136
		bodyModel[246] = new ModelRendererTurbo(this, 665, 393, textureX, textureY); // Box 120
		bodyModel[247] = new ModelRendererTurbo(this, 745, 393, textureX, textureY); // Box 121
		bodyModel[248] = new ModelRendererTurbo(this, 817, 393, textureX, textureY); // Box 122
		bodyModel[249] = new ModelRendererTurbo(this, 1, 513, textureX, textureY); // Box 123
		bodyModel[250] = new ModelRendererTurbo(this, 745, 513, textureX, textureY); // Box 124
		bodyModel[251] = new ModelRendererTurbo(this, 849, 513, textureX, textureY); // Box 125
		bodyModel[252] = new ModelRendererTurbo(this, 793, 433, textureX, textureY); // Box 126
		bodyModel[253] = new ModelRendererTurbo(this, 345, 441, textureX, textureY); // Box 127
		bodyModel[254] = new ModelRendererTurbo(this, 553, 497, textureX, textureY); // Box 128
		bodyModel[255] = new ModelRendererTurbo(this, 257, 521, textureX, textureY); // Box 129
		bodyModel[256] = new ModelRendererTurbo(this, 345, 521, textureX, textureY); // Box 130
		bodyModel[257] = new ModelRendererTurbo(this, 433, 521, textureX, textureY); // Box 131
		bodyModel[258] = new ModelRendererTurbo(this, 521, 521, textureX, textureY); // Box 132
		bodyModel[259] = new ModelRendererTurbo(this, 585, 497, textureX, textureY); // Box 133
		bodyModel[260] = new ModelRendererTurbo(this, 105, 513, textureX, textureY); // Box 134
		bodyModel[261] = new ModelRendererTurbo(this, 609, 513, textureX, textureY); // Box 135
		bodyModel[262] = new ModelRendererTurbo(this, 1, 537, textureX, textureY); // Box 136
		bodyModel[263] = new ModelRendererTurbo(this, 257, 537, textureX, textureY); // Box 137
		bodyModel[264] = new ModelRendererTurbo(this, 361, 537, textureX, textureY); // Box 138
		bodyModel[265] = new ModelRendererTurbo(this, 953, 513, textureX, textureY); // Box 139
		bodyModel[266] = new ModelRendererTurbo(this, 985, 513, textureX, textureY); // Box 140
		bodyModel[267] = new ModelRendererTurbo(this, 105, 537, textureX, textureY); // Box 141
		bodyModel[268] = new ModelRendererTurbo(this, 537, 249, textureX, textureY); // Box 377
		bodyModel[269] = new ModelRendererTurbo(this, 777, 249, textureX, textureY); // Box 378
		bodyModel[270] = new ModelRendererTurbo(this, 713, 241, textureX, textureY); // Box 379
		bodyModel[271] = new ModelRendererTurbo(this, 19, 669, textureX, textureY); // Box 380
		bodyModel[272] = new ModelRendererTurbo(this, 19, 669, textureX, textureY); // Box 381
		bodyModel[273] = new ModelRendererTurbo(this, 19, 669, textureX, textureY); // Box 382
		bodyModel[274] = new ModelRendererTurbo(this, 19, 669, textureX, textureY); // Box 383

		bodyModel[0].addShapeBox(0F, 0F, 0F, 13, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(-96F, -48F, -17F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 14, 23, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(-110F, -48F, -17F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 5, 0F,0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 4
		bodyModel[2].setRotationPoint(-110F, -49F, -17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 19, 8, 5, 0F,0F, -3F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-129F, -49F, -17F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 19, 24, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, -11F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-129F, -49F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 23, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(-129F, -48F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 19, 20, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-129F, -45F, -17F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 46, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-129F, -25F, -17F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 42, 23, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-83F, -48F, -17F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 42, 5, 17, 0F,-2F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(-83F, -53F, -17F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 41, 5, 15, 0F,-3F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-82F, -58F, -15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 38, 5, 10, 0F,0F, 0F, -8F, 0F, -3F, -10F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-79F, -61F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 42, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 14
		bodyModel[12].setRotationPoint(-83F, -25F, -17F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-96F, -48F, 15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 23, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(-110F, -48F, 15F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 14, 4, 5, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-110F, -49F, 12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 19, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(-129F, -49F, 12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 19, 24, 6, 0F,0F, -2F, 0F, -11F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(-129F, -49F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 23, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-129F, -48F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 19, 20, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-129F, -45F, 12F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 46, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F); // Box 22
		bodyModel[20].setRotationPoint(-129F, -25F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 42, 23, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[21].setRotationPoint(-83F, -48F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 42, 5, 17, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[22].setRotationPoint(-83F, -53F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 41, 5, 15, 0F,-3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, -3F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(-82F, -58F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 38, 5, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -10F, 0F, 0F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 26
		bodyModel[24].setRotationPoint(-79F, -61F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 42, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F); // Box 27
		bodyModel[25].setRotationPoint(-83F, -25F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 18, 40, 10, 0F,0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(-41F, -58F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 18, 38, 6, 0F,0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 29
		bodyModel[27].setRotationPoint(-41F, -56F, -14F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 18, 35, 4, 0F,0F, -5F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 30
		bodyModel[28].setRotationPoint(-41F, -53F, -17F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 58, 40, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 31
		bodyModel[29].setRotationPoint(-23F, -56F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 58, 40, 5, 0F,0F, -3F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 32
		bodyModel[30].setRotationPoint(-23F, -56F, -13F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 58, 37, 2, 0F,0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 33
		bodyModel[31].setRotationPoint(-23F, -53F, -15F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 18, 40, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(-41F, -58F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 18, 38, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 35
		bodyModel[33].setRotationPoint(-41F, -56F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 18, 35, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -7F, 0F); // Box 36
		bodyModel[34].setRotationPoint(-41F, -53F, 13F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 58, 40, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 37
		bodyModel[35].setRotationPoint(-23F, -56F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 58, 40, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 38
		bodyModel[36].setRotationPoint(-23F, -56F, 8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 58, 37, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 39
		bodyModel[37].setRotationPoint(-23F, -53F, 13F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 36, 36, 2, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 40
		bodyModel[38].setRotationPoint(35F, -51F, -15F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 36, 38, 5, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 41
		bodyModel[39].setRotationPoint(35F, -53F, -13F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 36, 38, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 42
		bodyModel[40].setRotationPoint(35F, -53F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 64, 37, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 43
		bodyModel[41].setRotationPoint(71F, -51F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 64, 37, 5, 0F,0F, -2F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 44
		bodyModel[42].setRotationPoint(71F, -51F, -13F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 64, 35, 2, 0F,0F, -2F, 0F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 45
		bodyModel[43].setRotationPoint(71F, -49F, -15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 64, 28, 13, 0F,0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 46
		bodyModel[44].setRotationPoint(71F, -47F, -28F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 64, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 47
		bodyModel[45].setRotationPoint(71F, -19F, -28F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 36, 36, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		bodyModel[46].setRotationPoint(35F, -51F, 13F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 36, 38, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[47].setRotationPoint(35F, -53F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 36, 38, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 50
		bodyModel[48].setRotationPoint(35F, -53F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 64, 37, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 51
		bodyModel[49].setRotationPoint(71F, -51F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 64, 37, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 52
		bodyModel[50].setRotationPoint(71F, -51F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 64, 28, 13, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[51].setRotationPoint(71F, -47F, 15F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 64, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -2F); // Box 54
		bodyModel[52].setRotationPoint(71F, -19F, 13F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 64, 35, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F); // Box 55
		bodyModel[53].setRotationPoint(71F, -49F, 13F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[54].setRotationPoint(-103F, -34F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[55].setRotationPoint(-104F, -36F, -12F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[56].setRotationPoint(-104F, -36F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 21, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[57].setRotationPoint(-86F, -52F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[58].setRotationPoint(-90F, -52F, -12F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[59].setRotationPoint(-90F, -52F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 7
		bodyModel[60].setRotationPoint(-87F, -50F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[61].setRotationPoint(-87F, -38F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[62].setRotationPoint(-87F, -50F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[63].setRotationPoint(-87F, -41F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[64].setRotationPoint(-87F, -41F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[65].setRotationPoint(-87F, -50F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[66].setRotationPoint(-87.5F, -45F, -9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[67].setRotationPoint(-87.5F, -45F, -5.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[68].setRotationPoint(-87.5F, -46F, -5.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[69].setRotationPoint(-87.5F, -46F, -9.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[70].setRotationPoint(-87.5F, -51F, -9.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[71].setRotationPoint(-87.5F, -51F, -5.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[72].setRotationPoint(-86.5F, -52F, -8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[73].setRotationPoint(-86.5F, -52F, -6.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -7F, 0.5F, 0F, -7F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 22
		bodyModel[74].setRotationPoint(-87.5F, -42F, -11.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -7F, 0.5F, 0F, -7F, 0.5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[75].setRotationPoint(-87.5F, -42F, -5.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[76].setRotationPoint(-86.5F, -52F, -10.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[77].setRotationPoint(-86.5F, -52F, -4.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[78].setRotationPoint(-87F, -53F, -12F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[79].setRotationPoint(-87F, -54F, -12F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29
		bodyModel[80].setRotationPoint(-87F, -53F, -4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[81].setRotationPoint(-87F, -54F, -4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[82].setRotationPoint(-84F, -58F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[83].setRotationPoint(-84F, -58F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[84].setRotationPoint(-84F, -57F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[85].setRotationPoint(-84F, -58F, -6.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[86].setRotationPoint(-84F, -58F, -8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[87].setRotationPoint(-87F, -58F, -10.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[88].setRotationPoint(-87F, -56F, -10.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 39
		bodyModel[89].setRotationPoint(-87F, -54F, -10.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[90].setRotationPoint(-101F, -35F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[91].setRotationPoint(-103F, -35F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[92].setRotationPoint(-103F, -35F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[93].setRotationPoint(-103F, -36F, -8.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[94].setRotationPoint(-102F, -38F, -10.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 45
		bodyModel[95].setRotationPoint(-102F, -38F, -6.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[96].setRotationPoint(-104F, -36F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[97].setRotationPoint(-104F, -36F, -13F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[98].setRotationPoint(-103F, -38F, -3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[99].setRotationPoint(-103F, -38F, -12F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[100].setRotationPoint(-98F, -38F, -13F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[101].setRotationPoint(-96F, -39F, -13F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[102].setRotationPoint(-95F, -38F, -13F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[103].setRotationPoint(-96F, -39F, -2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[104].setRotationPoint(-104F, -34F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[105].setRotationPoint(-104F, -34F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[106].setRotationPoint(-104F, -34F, -6.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[107].setRotationPoint(-104F, -34F, -4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[108].setRotationPoint(-103F, -34F, 3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[109].setRotationPoint(-104F, -36F, 11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[110].setRotationPoint(-104F, -36F, 2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 21, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[111].setRotationPoint(-86F, -52F, 3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[112].setRotationPoint(-90F, -52F, 11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[113].setRotationPoint(-90F, -52F, 2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[114].setRotationPoint(-87F, -50F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[115].setRotationPoint(-87F, -38F, 3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 105
		bodyModel[116].setRotationPoint(-87F, -50F, 3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[117].setRotationPoint(-87F, -41F, 9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[118].setRotationPoint(-87F, -41F, 3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[119].setRotationPoint(-87F, -50F, 5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[120].setRotationPoint(-87.5F, -45F, 8.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[121].setRotationPoint(-87.5F, -45F, 4.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[122].setRotationPoint(-87.5F, -46F, 4.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[123].setRotationPoint(-87.5F, -46F, 8.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[124].setRotationPoint(-87.5F, -51F, 8.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[125].setRotationPoint(-87.5F, -51F, 4.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[126].setRotationPoint(-86.5F, -52F, 7.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[127].setRotationPoint(-86.5F, -52F, 5.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -7F, 0.5F, 0F, -7F, 0.5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[128].setRotationPoint(-87.5F, -42F, 8.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -7F, 0.5F, 0F, -7F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 118
		bodyModel[129].setRotationPoint(-87.5F, -42F, 2.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[130].setRotationPoint(-86.5F, -52F, 9.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[131].setRotationPoint(-86.5F, -52F, 3.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
		bodyModel[132].setRotationPoint(-87F, -53F, 10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[133].setRotationPoint(-87F, -54F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 123
		bodyModel[134].setRotationPoint(-87F, -53F, 2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[135].setRotationPoint(-87F, -54F, 2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[136].setRotationPoint(-84F, -58F, 9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[137].setRotationPoint(-84F, -58F, 4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[138].setRotationPoint(-84F, -57F, 5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[139].setRotationPoint(-84F, -58F, 5.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[140].setRotationPoint(-84F, -58F, 7.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[141].setRotationPoint(-87F, -58F, 3.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[142].setRotationPoint(-87F, -56F, 3.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 132
		bodyModel[143].setRotationPoint(-87F, -54F, 3.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[144].setRotationPoint(-101F, -35F, 3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[145].setRotationPoint(-103F, -35F, 9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[146].setRotationPoint(-103F, -35F, 3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[147].setRotationPoint(-103F, -36F, 5.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 137
		bodyModel[148].setRotationPoint(-102F, -38F, 7.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[149].setRotationPoint(-102F, -38F, 3.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[150].setRotationPoint(-104F, -36F, 1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[151].setRotationPoint(-104F, -36F, 12F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[152].setRotationPoint(-103F, -38F, 2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[153].setRotationPoint(-103F, -38F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[154].setRotationPoint(-98F, -38F, 12F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[155].setRotationPoint(-96F, -39F, 12F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[156].setRotationPoint(-95F, -38F, 12F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[157].setRotationPoint(-96F, -39F, 1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[158].setRotationPoint(-104F, -34F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[159].setRotationPoint(-104F, -34F, 7.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[160].setRotationPoint(-104F, -34F, 5.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[161].setRotationPoint(-104F, -34F, 3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 38, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[162].setRotationPoint(-121F, -32F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 38, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[163].setRotationPoint(-121F, -32F, -15F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 11, 19, 6, 0F,0F, -3F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[164].setRotationPoint(-121F, -51F, -12F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 11, 19, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[165].setRotationPoint(-121F, -51F, -6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[166].setRotationPoint(-110F, -51F, -12F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 7, 19, 3, 0F,0F, -2F, -3F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[167].setRotationPoint(-110F, -51F, -15F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, -3F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[168].setRotationPoint(-121F, -51F, -12F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[169].setRotationPoint(-110F, -51F, -12F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 11, 19, 6, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 1
		bodyModel[170].setRotationPoint(-121F, -51F, 6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 11, 19, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[171].setRotationPoint(-121F, -51F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[172].setRotationPoint(-110F, -51F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 7, 19, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 4
		bodyModel[173].setRotationPoint(-110F, -51F, 12F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F); // Box 5
		bodyModel[174].setRotationPoint(-121F, -51F, 6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[175].setRotationPoint(-110F, -51F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[176].setRotationPoint(-90F, -61F, -2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 8
		bodyModel[177].setRotationPoint(-90F, -61F, 2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 5, 6, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 9
		bodyModel[178].setRotationPoint(-89F, -58F, 9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[179].setRotationPoint(-87F, -53F, 14F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[180].setRotationPoint(-97F, -61F, -2F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[181].setRotationPoint(-102F, -60F, -2F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 19, 12, 2, 0F,0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[182].setRotationPoint(-121F, -59F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-1F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F); // Box 14
		bodyModel[183].setRotationPoint(-102F, -59F, -7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,-2F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F); // Box 15
		bodyModel[184].setRotationPoint(-101F, -57F, -12F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,-3F, -6F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, 0F, -6F, 0F); // Box 16
		bodyModel[185].setRotationPoint(-99F, -54F, -16F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 17
		bodyModel[186].setRotationPoint(-102F, -59F, 2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 18
		bodyModel[187].setRotationPoint(-101F, -57F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 19
		bodyModel[188].setRotationPoint(-99F, -54F, 12F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 36, 29, 13, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 20
		bodyModel[189].setRotationPoint(35F, -48F, -28F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 58, 30, 13, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 21
		bodyModel[190].setRotationPoint(-23F, -50F, -28F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 36, 29, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 22
		bodyModel[191].setRotationPoint(35F, -48F, 15F);
		bodyModel[191].flip = true;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 58, 30, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 23
		bodyModel[192].setRotationPoint(-23F, -50F, 15F);
		bodyModel[192].flip = true;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 21, 2, 13, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 0
		bodyModel[193].setRotationPoint(-44F, -50F, -28F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 21, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[194].setRotationPoint(-44F, -48F, -28F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 21, 27, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 2
		bodyModel[195].setRotationPoint(-44F, -48F, -19F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 21, 6, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -4F); // Box 4
		bodyModel[196].setRotationPoint(-44F, -24F, -28F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 58, 5, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 5
		bodyModel[197].setRotationPoint(-23F, -21F, -28F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 36, 5, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[198].setRotationPoint(35F, -20F, -28F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 21, 2, 13, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[199].setRotationPoint(-44F, -50F, 15F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 21, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 8
		bodyModel[200].setRotationPoint(-44F, -48F, 26F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 21, 27, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 9
		bodyModel[201].setRotationPoint(-44F, -48F, 15F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 21, 6, 13, 0F,0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -2F); // Box 10
		bodyModel[202].setRotationPoint(-44F, -24F, 15F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 58, 5, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 11
		bodyModel[203].setRotationPoint(-23F, -21F, 15F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 36, 5, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 12
		bodyModel[204].setRotationPoint(35F, -20F, 15F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 12, 28, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 13
		bodyModel[205].setRotationPoint(-56F, -50F, -19F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 27, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 15
		bodyModel[206].setRotationPoint(-58F, -50F, -19F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[207].setRotationPoint(-52F, -49F, -25F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 12, 28, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[208].setRotationPoint(-56F, -50F, 18F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 27, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 18
		bodyModel[209].setRotationPoint(-58F, -50F, 18F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 19
		bodyModel[210].setRotationPoint(-52F, -49F, 19F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 27, 8, 27, 0F,0F, -3F, 0F, 0F, -3F, -13F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[211].setRotationPoint(40F, -47F, -55F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 63, 8, 27, 0F,0F, 0F, -25F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 21
		bodyModel[212].setRotationPoint(-23F, -47F, -55F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 10, 7, 14, 0F,0F, -2F, 0F, 0F, -2F, -10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[213].setRotationPoint(67F, -46F, -42F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[214].setRotationPoint(-31F, -47F, -30F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[215].setRotationPoint(-37F, -47F, -32F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[216].setRotationPoint(-42F, -47F, -32F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 27, 8, 27, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -13F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 26
		bodyModel[217].setRotationPoint(40F, -47F, 28F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 63, 8, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -25F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -25F); // Box 27
		bodyModel[218].setRotationPoint(-23F, -47F, 28F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 10, 7, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 28
		bodyModel[219].setRotationPoint(67F, -46F, 28F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[220].setRotationPoint(-31F, -47F, 28F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 30
		bodyModel[221].setRotationPoint(-37F, -47F, 28F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 31
		bodyModel[222].setRotationPoint(-42F, -47F, 28F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 15, 33, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[223].setRotationPoint(135F, -47F, -8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 16, 31, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[224].setRotationPoint(150F, -45F, -8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 16, 27, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[225].setRotationPoint(166F, -43F, -8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 15, 33, 5, 0F,0F, -3F, 0F, 0F, -3F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[226].setRotationPoint(135F, -47F, -13F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 16, 31, 4, 0F,0F, -1F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[227].setRotationPoint(150F, -45F, -12F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 15, 33, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[228].setRotationPoint(135F, -47F, 0F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 16, 31, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[229].setRotationPoint(150F, -45F, 0F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 15, 33, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 51
		bodyModel[230].setRotationPoint(135F, -47F, 8F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 16, 31, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 52
		bodyModel[231].setRotationPoint(150F, -45F, 8F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 30, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[232].setRotationPoint(171F, -53F, -2F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 63, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -9F, 0F, 0F); // Box 103
		bodyModel[233].setRotationPoint(90F, -15F, -25F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 63, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -9F, 0F, 0F); // Box 104
		bodyModel[234].setRotationPoint(90F, -15F, 23F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 41, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[235].setRotationPoint(11F, -41F, -45F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 41, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 1
		bodyModel[236].setRotationPoint(11F, -41F, -44F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[237].setRotationPoint(7F, -15F, -6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 129
		bodyModel[238].setRotationPoint(7F, -15F, 2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 25, 12, 4, 0F,0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 130
		bodyModel[239].setRotationPoint(54F, -15F, -6F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 25, 12, 4, 0F,0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 131
		bodyModel[240].setRotationPoint(54F, -15F, -2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 25, 12, 4, 0F,0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F); // Box 132
		bodyModel[241].setRotationPoint(54F, -15F, 2F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 24, 12, 4, 0F,0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 133
		bodyModel[242].setRotationPoint(-17F, -15F, -2F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 24, 12, 4, 0F,0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F); // Box 134
		bodyModel[243].setRotationPoint(-17F, -15F, 2F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[244].setRotationPoint(7F, -15F, -2F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 24, 12, 4, 0F,0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F); // Box 136
		bodyModel[245].setRotationPoint(-17F, -15F, -6F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 9, 12, 4, 0F,0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F); // Box 120
		bodyModel[246].setRotationPoint(54F, -34F, -42F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 9, 12, 4, 0F,0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 121
		bodyModel[247].setRotationPoint(54F, -34F, -50F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 9, 12, 4, 0F,0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 122
		bodyModel[248].setRotationPoint(54F, -34F, -46F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[249].setRotationPoint(7F, -34F, -50F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[250].setRotationPoint(7F, -34F, -46F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 125
		bodyModel[251].setRotationPoint(7F, -34F, -42F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F); // Box 126
		bodyModel[252].setRotationPoint(-4F, -34F, -42F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 127
		bodyModel[253].setRotationPoint(-4F, -34F, -46F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F); // Box 128
		bodyModel[254].setRotationPoint(-4F, -34F, -50F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 41, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[255].setRotationPoint(11F, -20F, -1F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 41, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 130
		bodyModel[256].setRotationPoint(11F, -20F, 0F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 41, 7, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 131
		bodyModel[257].setRotationPoint(11F, -41F, 44F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 41, 7, 1, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[258].setRotationPoint(11F, -41F, 43F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 9, 12, 4, 0F,0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 133
		bodyModel[259].setRotationPoint(54F, -34F, 38F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 9, 12, 4, 0F,0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F); // Box 134
		bodyModel[260].setRotationPoint(54F, -34F, 46F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 9, 12, 4, 0F,0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 135
		bodyModel[261].setRotationPoint(54F, -34F, 42F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 136
		bodyModel[262].setRotationPoint(7F, -34F, 46F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[263].setRotationPoint(7F, -34F, 42F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 47, 12, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[264].setRotationPoint(7F, -34F, 38F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F); // Box 139
		bodyModel[265].setRotationPoint(-4F, -34F, 38F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 140
		bodyModel[266].setRotationPoint(-4F, -34F, 42F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 11, 12, 4, 0F,0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F); // Box 141
		bodyModel[267].setRotationPoint(-4F, -34F, 46F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,-1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 377
		bodyModel[268].setRotationPoint(-90F, -61F, -10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 10, 5, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -1F, 0F, -1F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F); // Box 378
		bodyModel[269].setRotationPoint(-89F, -58F, -15F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 379
		bodyModel[270].setRotationPoint(-87F, -53F, -17F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 98, 94, 1, 0F,-40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F); // Box 380
		bodyModel[271].setRotationPoint(131F, -125F, -2.05F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 98, 94, 1, 0F,-40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F); // Box 381
		bodyModel[272].setRotationPoint(131F, -125F, 1.05F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 98, 94, 1, 0F,-40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F); // Box 382
		bodyModel[273].setRotationPoint(12F, -37.7F, -117F);
		bodyModel[273].rotateAngleX = -1.46607657F;
		bodyModel[273].rotateAngleY = 0.34906585F;
		bodyModel[273].rotateAngleZ = 0.00872665F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 98, 94, 1, 0F,-40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F, -40F, -38F, 0F); // Box 383
		bodyModel[274].setRotationPoint(12F, -36.8F, 116F);
		bodyModel[274].rotateAngleX = 1.46607657F;
		bodyModel[274].rotateAngleY = -0.34906585F;
		bodyModel[274].rotateAngleZ = 0.01745329F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Box 56
		noseModel[1] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 57
		noseModel[2] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 58
		noseModel[3] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 59
		noseModel[4] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 60
		noseModel[5] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 61
		noseModel[6] = new ModelRendererTurbo(this, 953, 185, textureX, textureY); // Box 62
		noseModel[7] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 63
		noseModel[8] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 64
		noseModel[9] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 65
		noseModel[10] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 66
		noseModel[11] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 67
		noseModel[12] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 68
		noseModel[13] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 69
		noseModel[14] = new ModelRendererTurbo(this, 513, 209, textureX, textureY); // Box 70
		noseModel[15] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Box 71
		noseModel[16] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Box 72
		noseModel[17] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 73
		noseModel[18] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Box 74
		noseModel[19] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 75
		noseModel[20] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 76
		noseModel[21] = new ModelRendererTurbo(this, 601, 209, textureX, textureY); // Box 77
		noseModel[22] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 78
		noseModel[23] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 79
		noseModel[24] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 80
		noseModel[25] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 81
		noseModel[26] = new ModelRendererTurbo(this, 785, 217, textureX, textureY); // Box 82
		noseModel[27] = new ModelRendererTurbo(this, 825, 217, textureX, textureY); // Box 83
		noseModel[28] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 84
		noseModel[29] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 85
		noseModel[30] = new ModelRendererTurbo(this, 865, 217, textureX, textureY); // Box 86
		noseModel[31] = new ModelRendererTurbo(this, 913, 217, textureX, textureY); // Box 87
		noseModel[32] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 88
		noseModel[33] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 89
		noseModel[34] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 90
		noseModel[35] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 92
		noseModel[36] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 93
		noseModel[37] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 94
		noseModel[38] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 95
		noseModel[39] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 96

		noseModel[0].addShapeBox(0F, 0F, 0F, 14, 28, 6, 0F,0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		noseModel[0].setRotationPoint(-143F, -47F, -6F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 12, 25, 5, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		noseModel[1].setRotationPoint(-155F, -44F, -5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 12, 23, 4, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 58
		noseModel[2].setRotationPoint(-167F, -42F, -4F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 10, 19, 3, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 59
		noseModel[3].setRotationPoint(-177F, -40F, -3F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F,0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 60
		noseModel[4].setRotationPoint(-187F, -38F, -2F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 61
		noseModel[5].setRotationPoint(-194F, -35F, -1F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 14, 28, 7, 0F,0F, -3F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 62
		noseModel[6].setRotationPoint(-143F, -47F, -12F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 12, 25, 6, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 63
		noseModel[7].setRotationPoint(-155F, -44F, -10F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 12, 23, 6, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F); // Box 64
		noseModel[8].setRotationPoint(-167F, -42F, -9F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 10, 19, 5, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F); // Box 65
		noseModel[9].setRotationPoint(-177F, -40F, -7F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 10, 14, 4, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F); // Box 66
		noseModel[10].setRotationPoint(-187F, -38F, -5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F); // Box 67
		noseModel[11].setRotationPoint(-194F, -35F, -2F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 14, 28, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 68
		noseModel[12].setRotationPoint(-143F, -47F, 0F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 12, 25, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 69
		noseModel[13].setRotationPoint(-155F, -44F, 0F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 12, 23, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 70
		noseModel[14].setRotationPoint(-167F, -42F, 0F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 10, 19, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 71
		noseModel[15].setRotationPoint(-177F, -40F, 0F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 72
		noseModel[16].setRotationPoint(-187F, -38F, 0F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 73
		noseModel[17].setRotationPoint(-194F, -35F, 0F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 14, 28, 7, 0F,0F, -3F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 74
		noseModel[18].setRotationPoint(-143F, -47F, 5F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 12, 25, 6, 0F,0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 75
		noseModel[19].setRotationPoint(-155F, -44F, 4F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 12, 23, 6, 0F,0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 76
		noseModel[20].setRotationPoint(-167F, -42F, 3F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 10, 19, 5, 0F,0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 77
		noseModel[21].setRotationPoint(-177F, -40F, 2F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 10, 14, 4, 0F,0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, -3F); // Box 78
		noseModel[22].setRotationPoint(-187F, -38F, 1F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F,0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 79
		noseModel[23].setRotationPoint(-194F, -35F, 0F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 14, 27, 7, 0F,0F, -7F, -1F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 80
		noseModel[24].setRotationPoint(-143F, -46F, -17F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 12, 25, 7, 0F,0F, -7F, -2F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 81
		noseModel[25].setRotationPoint(-155F, -44F, -16F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 12, 23, 7, 0F,0F, -7F, -3F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -7F, -3F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -2F, 0F); // Box 82
		noseModel[26].setRotationPoint(-167F, -42F, -14F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 10, 19, 6, 0F,0F, -6F, -3F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -7F, -3F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 83
		noseModel[27].setRotationPoint(-177F, -40F, -11F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 10, 14, 6, 0F,0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -6F, -4F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -4F, 0F); // Box 84
		noseModel[28].setRotationPoint(-187F, -38F, -8F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,0F, -2.5F, -3F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -3.5F, -3F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 85
		noseModel[29].setRotationPoint(-194F, -35F, -4F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 14, 27, 7, 0F,0F, -2F, 0F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -6F, -1F); // Box 86
		noseModel[30].setRotationPoint(-143F, -46F, 10F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 12, 25, 7, 0F,0F, -2F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -6F, -2F); // Box 87
		noseModel[31].setRotationPoint(-155F, -44F, 9F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 12, 23, 7, 0F,0F, -2F, 0F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -7F, -3F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, -7F, -3F); // Box 88
		noseModel[32].setRotationPoint(-167F, -42F, 7F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 10, 19, 6, 0F,0F, -2F, 0F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -6F, -3F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -7F, -3F); // Box 89
		noseModel[33].setRotationPoint(-177F, -40F, 5F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 10, 14, 6, 0F,0F, -3F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, -6F, -4F); // Box 90
		noseModel[34].setRotationPoint(-187F, -38F, 2F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		noseModel[35].setRotationPoint(-212F, -33F, -1F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 93
		noseModel[36].setRotationPoint(-225F, -33F, -1F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,0F, -2F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2.5F, -3F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -3.5F, -3F); // Box 94
		noseModel[37].setRotationPoint(-194F, -35F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		noseModel[38].setRotationPoint(-212F, -33F, 0F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F); // Box 96
		noseModel[39].setRotationPoint(-225F, -33F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Box 35
		tailModel[1] = new ModelRendererTurbo(this, 273, 345, textureX, textureY); // Box 38
		tailModel[2] = new ModelRendererTurbo(this, 761, 345, textureX, textureY); // Box 39
		tailModel[3] = new ModelRendererTurbo(this, 841, 345, textureX, textureY); // Box 40
		tailModel[4] = new ModelRendererTurbo(this, 369, 353, textureX, textureY); // Box 41
		tailModel[5] = new ModelRendererTurbo(this, 433, 353, textureX, textureY); // Box 42
		tailModel[6] = new ModelRendererTurbo(this, 513, 353, textureX, textureY); // Box 43
		tailModel[7] = new ModelRendererTurbo(this, 593, 353, textureX, textureY); // Box 44
		tailModel[8] = new ModelRendererTurbo(this, 665, 361, textureX, textureY); // Box 45
		tailModel[9] = new ModelRendererTurbo(this, 921, 361, textureX, textureY); // Box 46
		tailModel[10] = new ModelRendererTurbo(this, 57, 369, textureX, textureY); // Box 49
		tailModel[11] = new ModelRendererTurbo(this, 113, 369, textureX, textureY); // Box 50
		tailModel[12] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Box 53
		tailModel[13] = new ModelRendererTurbo(this, 449, 385, textureX, textureY); // Box 54
		tailModel[14] = new ModelRendererTurbo(this, 529, 385, textureX, textureY); // Box 55
		tailModel[15] = new ModelRendererTurbo(this, 257, 393, textureX, textureY); // Box 56
		tailModel[16] = new ModelRendererTurbo(this, 609, 393, textureX, textureY); // Box 57
		tailModel[17] = new ModelRendererTurbo(this, 689, 393, textureX, textureY); // Box 58
		tailModel[18] = new ModelRendererTurbo(this, 769, 393, textureX, textureY); // Box 59
		tailModel[19] = new ModelRendererTurbo(this, 841, 393, textureX, textureY); // Box 60
		tailModel[20] = new ModelRendererTurbo(this, 89, 401, textureX, textureY); // Box 61
		tailModel[21] = new ModelRendererTurbo(this, 113, 417, textureX, textureY); // Box 62
		tailModel[22] = new ModelRendererTurbo(this, 345, 433, textureX, textureY); // Box 63
		tailModel[23] = new ModelRendererTurbo(this, 577, 433, textureX, textureY); // Box 64
		tailModel[24] = new ModelRendererTurbo(this, 841, 425, textureX, textureY); // Box 65
		tailModel[25] = new ModelRendererTurbo(this, 913, 401, textureX, textureY); // Box 66
		tailModel[26] = new ModelRendererTurbo(this, 545, 313, textureX, textureY); // Box 67
		tailModel[27] = new ModelRendererTurbo(this, 1, 441, textureX, textureY); // Box 68
		tailModel[28] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 70
		tailModel[29] = new ModelRendererTurbo(this, 897, 345, textureX, textureY); // Box 71
		tailModel[30] = new ModelRendererTurbo(this, 393, 281, textureX, textureY); // Box 72
		tailModel[31] = new ModelRendererTurbo(this, 1001, 281, textureX, textureY); // Box 73
		tailModel[32] = new ModelRendererTurbo(this, 577, 465, textureX, textureY); // Box 74
		tailModel[33] = new ModelRendererTurbo(this, 345, 425, textureX, textureY); // Box 75
		tailModel[34] = new ModelRendererTurbo(this, 977, 297, textureX, textureY); // Box 76
		tailModel[35] = new ModelRendererTurbo(this, 921, 473, textureX, textureY); // Box 105
		tailModel[36] = new ModelRendererTurbo(this, 145, 409, textureX, textureY); // Box 106

		tailModel[0].addShapeBox(0F, 0F, 0F, 12, 23, 8, 0F,0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 35
		tailModel[0].setRotationPoint(182F, -41F, -8F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 15, 25, 16, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 38
		tailModel[1].setRotationPoint(135F, -44F, -28F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 16, 24, 20, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F); // Box 39
		tailModel[2].setRotationPoint(150F, -44F, -28F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 16, 21, 20, 0F,0F, -1F, 0F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 40
		tailModel[3].setRotationPoint(166F, -43F, -28F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 15, 6, 16, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 41
		tailModel[4].setRotationPoint(135F, -20F, -28F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 16, 8, 20, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, -4F); // Box 42
		tailModel[5].setRotationPoint(150F, -22F, -28F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 16, 8, 20, 0F,0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 43
		tailModel[6].setRotationPoint(166F, -24F, -28F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 13, 17, 21, 0F,0F, -1F, 0F, 0F, -6F, -3F, 0F, -6F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 3F, 0F, 0F, -3F); // Box 44
		tailModel[7].setRotationPoint(182F, -41F, -26F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 13, 9, 21, 0F,0F, -1F, 0F, 0F, -1F, -8F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, -3F, -3F, 0F, -3F, 3F, 0F, -9F, -3F); // Box 45
		tailModel[8].setRotationPoint(182F, -41F, -26F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 13, 9, 24, 0F,0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, -3F, -8F, 0F, -3F, -5F, 0F, 0F, -6F); // Box 46
		tailModel[9].setRotationPoint(182F, -27F, -26F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 16, 27, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
		tailModel[10].setRotationPoint(166F, -43F, 0F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 12, 23, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 50
		tailModel[11].setRotationPoint(182F, -41F, 0F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 15, 25, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 53
		tailModel[12].setRotationPoint(135F, -44F, 12F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 16, 24, 20, 0F,0F, 0F, -4F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 54
		tailModel[13].setRotationPoint(150F, -44F, 8F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 16, 21, 20, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 55
		tailModel[14].setRotationPoint(166F, -43F, 8F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 15, 6, 16, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 56
		tailModel[15].setRotationPoint(135F, -20F, 12F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 16, 8, 20, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -3F); // Box 57
		tailModel[16].setRotationPoint(150F, -22F, 8F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 16, 8, 20, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, 0F, -4F); // Box 58
		tailModel[17].setRotationPoint(166F, -24F, 8F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 13, 17, 21, 0F,0F, 0F, -3F, 0F, -6F, 3F, 0F, -6F, -3F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 59
		tailModel[18].setRotationPoint(182F, -41F, 5F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 13, 9, 21, 0F,0F, 0F, -3F, 0F, -1F, -2F, 0F, -1F, -8F, 0F, -1F, 0F, 0F, -9F, -3F, 0F, -3F, 3F, 0F, -3F, -3F, 0F, -8F, 0F); // Box 60
		tailModel[19].setRotationPoint(182F, -41F, 5F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 13, 9, 24, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, -3F, -5F, 0F, -3F, -8F, 0F, 0F, -5F); // Box 61
		tailModel[20].setRotationPoint(182F, -27F, 2F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 87, 5, 56, 0F,-70F, -3F, 0F, 0F, -3F, -9F, -13F, -1F, 0F, 0F, 0F, 0F, -70F, 0F, 0F, 0F, 0F, -9F, -13F, 0F, 0F, 0F, 0F, 0F); // Box 62
		tailModel[21].setRotationPoint(114F, -42F, -84F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 87, 5, 56, 0F,0F, 0F, 0F, -13F, -1F, 0F, 0F, -3F, -9F, -70F, -3F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -9F, -70F, 0F, 0F); // Box 63
		tailModel[22].setRotationPoint(114F, -42F, 28F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 102, 20, 4, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, -12F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -12F, 0F); // Box 64
		tailModel[23].setRotationPoint(96F, -57F, -2F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 87, 37, 4, 0F,-65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -65F, 0F, 0F, 0F, 0F, 0F, -31F, 0F, 0F, -31F, 0F, 0F, 0F, 0F, 0F); // Box 65
		tailModel[24].setRotationPoint(117F, -94F, -2F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 44, 13, 4, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 66
		tailModel[25].setRotationPoint(182F, -107F, -2F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 21, 2, 4, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		tailModel[26].setRotationPoint(205F, -109F, -2F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 46, 37, 4, 0F,-31F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -31F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F); // Box 68
		tailModel[27].setRotationPoint(173F, -94F, -2F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 30, 10, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		tailModel[28].setRotationPoint(171F, -53F, -5F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 24, 10, 3, 0F,0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 71
		tailModel[29].setRotationPoint(147F, -53F, -5F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F,0F, -2F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 72
		tailModel[30].setRotationPoint(201F, -53F, -5F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 6, 10, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 73
		tailModel[31].setRotationPoint(201F, -53F, -2F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 30, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 74
		tailModel[32].setRotationPoint(171F, -53F, 2F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 24, 10, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, -3F); // Box 75
		tailModel[33].setRotationPoint(147F, -53F, 2F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -2F, 0F); // Box 76
		tailModel[34].setRotationPoint(201F, -53F, 2F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 31, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 105
		tailModel[35].setRotationPoint(163F, -23F, -2F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 29, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -15F, 0F, 0F); // Box 106
		tailModel[36].setRotationPoint(163F, -16F, -2F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 107

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 50, 15, 148, 0F,-31F, -13F, 0F, 0F, -13F, 0F, -4F, 0F, 0F, 5F, 3F, 0F, -31F, 0F, 0F, 0F, 0F, 0F, -4F, -12F, 0F, 5F, -15F, 0F); // Box 107
		leftWingModel[0].setRotationPoint(40F, -43F, -177F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 489, 481, textureX, textureY); // Box 108

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 50, 15, 148, 0F,5F, 3F, 0F, -4F, 0F, 0F, 0F, -13F, 0F, -31F, -13F, 0F, 5F, -15F, 0F, -4F, -12F, 0F, 0F, 0F, 0F, -31F, 0F, 0F); // Box 108
		rightWingModel[0].setRotationPoint(40F, -43F, 29F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 16
		yawFlapModel[1] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 17
		yawFlapModel[2] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 18
		yawFlapModel[3] = new ModelRendererTurbo(this, 841, 89, textureX, textureY); // Box 19
		yawFlapModel[4] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 146
		yawFlapModel[5] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 147
		yawFlapModel[6] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 148
		yawFlapModel[7] = new ModelRendererTurbo(this, 793, 281, textureX, textureY); // Box 149

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 3, 13, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 16
		yawFlapModel[0].setRotationPoint(-104F, -44F, -7.5F);

		yawFlapModel[1].addShapeBox(2F, 0F, -2F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		yawFlapModel[1].setRotationPoint(-104F, -44F, -7.5F);

		yawFlapModel[2].addShapeBox(2F, -3F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		yawFlapModel[2].setRotationPoint(-104F, -44F, -7.5F);

		yawFlapModel[3].addShapeBox(2F, -3F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		yawFlapModel[3].setRotationPoint(-104F, -44F, -7.5F);

		yawFlapModel[4].addShapeBox(2F, -3F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		yawFlapModel[4].setRotationPoint(-104F, -44F, 6.5F);

		yawFlapModel[5].addShapeBox(2F, 0F, -2F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		yawFlapModel[5].setRotationPoint(-104F, -44F, 6.5F);

		yawFlapModel[6].addShapeBox(2F, -3F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		yawFlapModel[6].setRotationPoint(-104F, -44F, 6.5F);

		yawFlapModel[7].addShapeBox(0F, 0F, 0F, 3, 13, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 149
		yawFlapModel[7].setRotationPoint(-104F, -44F, 6.5F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1001, 297, textureX, textureY); // Import ImportImportLeftWingWheel
		bodyWheelModel[1] = new ModelRendererTurbo(this, 393, 297, textureX, textureY); // Import ImportImportLeftWingWheel
		bodyWheelModel[2] = new ModelRendererTurbo(this, 785, 313, textureX, textureY); // Import ImportImportLeftWingWheel
		bodyWheelModel[3] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Import ImportBox13
		bodyWheelModel[4] = new ModelRendererTurbo(this, 545, 321, textureX, textureY); // Import ImportBox21
		bodyWheelModel[5] = new ModelRendererTurbo(this, 657, 313, textureX, textureY); // Import Box1
		bodyWheelModel[6] = new ModelRendererTurbo(this, 1001, 321, textureX, textureY); // Box 83
		bodyWheelModel[7] = new ModelRendererTurbo(this, 385, 321, textureX, textureY); // Box 84
		bodyWheelModel[8] = new ModelRendererTurbo(this, 817, 345, textureX, textureY); // Box 85
		bodyWheelModel[9] = new ModelRendererTurbo(this, 489, 353, textureX, textureY); // Box 86
		bodyWheelModel[10] = new ModelRendererTurbo(this, 569, 353, textureX, textureY); // Box 87
		bodyWheelModel[11] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 88
		bodyWheelModel[12] = new ModelRendererTurbo(this, 681, 113, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[13] = new ModelRendererTurbo(this, 289, 329, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[14] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[15] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[16] = new ModelRendererTurbo(this, 1001, 345, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[17] = new ModelRendererTurbo(this, 417, 353, textureX, textureY); // Import ImportBox1
		bodyWheelModel[18] = new ModelRendererTurbo(this, 641, 353, textureX, textureY); // Box 99
		bodyWheelModel[19] = new ModelRendererTurbo(this, 729, 353, textureX, textureY); // Box 100
		bodyWheelModel[20] = new ModelRendererTurbo(this, 713, 369, textureX, textureY); // Box 101
		bodyWheelModel[21] = new ModelRendererTurbo(this, 505, 385, textureX, textureY); // Box 102

		bodyWheelModel[0].addBox(0F, -2F, 0F, 5, 15, 5, 0F); // Import ImportImportLeftWingWheel
		bodyWheelModel[0].setRotationPoint(37F, -22.5F, 20F);
		bodyWheelModel[0].rotateAngleX = 0.45378561F;

		bodyWheelModel[1].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Import ImportImportLeftWingWheel
		bodyWheelModel[1].setRotationPoint(36F, -1F, 32F);

		bodyWheelModel[2].addBox(0F, 0F, 0F, 16, 8, 5, 0F); // Import ImportImportLeftWingWheel
		bodyWheelModel[2].setRotationPoint(31F, -2F, 36F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 16, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox13
		bodyWheelModel[3].setRotationPoint(31F, -6F, 36F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox21
		bodyWheelModel[4].setRotationPoint(31F, 6F, 36F);

		bodyWheelModel[5].addBox(0.5F, 11F, 0.5F, 4, 15, 4, 0F); // Import Box1
		bodyWheelModel[5].setRotationPoint(37F, -22.5F, 20F);
		bodyWheelModel[5].rotateAngleX = 0.45378561F;

		bodyWheelModel[6].addBox(0F, -2F, 0F, 5, 15, 5, 0F); // Box 83
		bodyWheelModel[6].setRotationPoint(37F, -22.5F, -25F);
		bodyWheelModel[6].rotateAngleX = -0.45378561F;

		bodyWheelModel[7].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 84
		bodyWheelModel[7].setRotationPoint(36F, -1F, -36F);

		bodyWheelModel[8].addBox(0F, 0F, 0F, 16, 8, 5, 0F); // Box 85
		bodyWheelModel[8].setRotationPoint(31F, -2F, -41F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 16, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyWheelModel[9].setRotationPoint(31F, -6F, -41F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 87
		bodyWheelModel[10].setRotationPoint(31F, 6F, -41F);

		bodyWheelModel[11].addBox(0.5F, 11F, 0.5F, 4, 15, 4, 0F); // Box 88
		bodyWheelModel[11].setRotationPoint(37F, -22.5F, -25F);
		bodyWheelModel[11].rotateAngleX = -0.45378561F;

		bodyWheelModel[12].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Import ImportImportCoreWheel
		bodyWheelModel[12].setRotationPoint(-92F, -3F, -0.5F);
		bodyWheelModel[12].rotateAngleZ = -1.02974426F;

		bodyWheelModel[13].addBox(0F, 0F, 0F, 12, 6, 5, 0F); // Import ImportImportCoreWheel
		bodyWheelModel[13].setRotationPoint(-108F, 1F, -6F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Import ImportImportCoreWheel
		bodyWheelModel[14].setRotationPoint(-93F, -21F, -1F);
		bodyWheelModel[14].rotateAngleZ = -0.78539816F;

		bodyWheelModel[15].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Import ImportImportCoreWheel
		bodyWheelModel[15].setRotationPoint(-103F, -8F, -0.5F);
		bodyWheelModel[15].rotateAngleZ = 1.06465084F;

		bodyWheelModel[16].addBox(0F, 0F, 0F, 4, 25, 2, 0F); // Import ImportImportCoreWheel
		bodyWheelModel[16].setRotationPoint(-104F, -20F, -1F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 12, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		bodyWheelModel[17].setRotationPoint(-108F, -2F, -6F);

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 12, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 99
		bodyWheelModel[18].setRotationPoint(-108F, 7F, -6F);

		bodyWheelModel[19].addShapeBox(0F, 0F, 0F, 12, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyWheelModel[19].setRotationPoint(-108F, -2F, 1F);

		bodyWheelModel[20].addBox(0F, 0F, 0F, 12, 6, 5, 0F); // Box 101
		bodyWheelModel[20].setRotationPoint(-108F, 1F, 1F);

		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 12, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 102
		bodyWheelModel[21].setRotationPoint(-108F, 7F, 1F);
	}
}