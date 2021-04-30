//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.07.2016 - 00:07:16
// Last changed on: 09.07.2016 - 00:07:16

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRocketJagdpanzer extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelRocketJagdpanzer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[245];
		leftTrackWheelModels = new ModelRendererTurbo[21];
		rightTrackWheelModels = new ModelRendererTurbo[21];

		initbodyModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 79
		bodyModel[31] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 80
		bodyModel[32] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 81
		bodyModel[33] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 82
		bodyModel[34] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 83
		bodyModel[35] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 84
		bodyModel[36] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 85
		bodyModel[37] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 86
		bodyModel[38] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 87
		bodyModel[39] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 88
		bodyModel[40] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 89
		bodyModel[41] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 90
		bodyModel[42] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 91
		bodyModel[43] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 92
		bodyModel[44] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 93
		bodyModel[45] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 94
		bodyModel[46] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 95
		bodyModel[47] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 96
		bodyModel[48] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 97
		bodyModel[49] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 98
		bodyModel[50] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 99
		bodyModel[51] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 100
		bodyModel[52] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 101
		bodyModel[53] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 103
		bodyModel[54] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 105
		bodyModel[55] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 113
		bodyModel[56] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 114
		bodyModel[57] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 115
		bodyModel[58] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 116
		bodyModel[59] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 117
		bodyModel[60] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 118
		bodyModel[61] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 119
		bodyModel[62] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 120
		bodyModel[63] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 121
		bodyModel[64] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 122
		bodyModel[65] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 123
		bodyModel[66] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 124
		bodyModel[67] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 125
		bodyModel[68] = new ModelRendererTurbo(this, 657, 41, textureX, textureY); // Box 126
		bodyModel[69] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 127
		bodyModel[70] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 128
		bodyModel[71] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 129
		bodyModel[72] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 130
		bodyModel[73] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Box 131
		bodyModel[74] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 132
		bodyModel[75] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 133
		bodyModel[76] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 134
		bodyModel[77] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 135
		bodyModel[78] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Box 136
		bodyModel[79] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 137
		bodyModel[80] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 138
		bodyModel[81] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 139
		bodyModel[82] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Box 140
		bodyModel[83] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Box 141
		bodyModel[84] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Box 142
		bodyModel[85] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 143
		bodyModel[86] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 144
		bodyModel[87] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 145
		bodyModel[88] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 146
		bodyModel[89] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 147
		bodyModel[90] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 148
		bodyModel[91] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 149
		bodyModel[92] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 150
		bodyModel[93] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 151
		bodyModel[94] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 152
		bodyModel[95] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 153
		bodyModel[96] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 154
		bodyModel[97] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 155
		bodyModel[98] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 156
		bodyModel[99] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 157
		bodyModel[100] = new ModelRendererTurbo(this, 889, 113, textureX, textureY); // Box 158
		bodyModel[101] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Box 159
		bodyModel[102] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 160
		bodyModel[103] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 161
		bodyModel[104] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 162
		bodyModel[105] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 163
		bodyModel[106] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 164
		bodyModel[107] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 165
		bodyModel[108] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 166
		bodyModel[109] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 167
		bodyModel[110] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 168
		bodyModel[111] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 169
		bodyModel[112] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 170
		bodyModel[113] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 171
		bodyModel[114] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 172
		bodyModel[115] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 173
		bodyModel[116] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 174
		bodyModel[117] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 175
		bodyModel[118] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 176
		bodyModel[119] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 177
		bodyModel[120] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 1
		bodyModel[121] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 2
		bodyModel[122] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 3
		bodyModel[123] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 4
		bodyModel[124] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 5
		bodyModel[125] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 1
		bodyModel[127] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 2
		bodyModel[128] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 3
		bodyModel[129] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 4
		bodyModel[130] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 5
		bodyModel[131] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 6
		bodyModel[132] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 7
		bodyModel[133] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 8
		bodyModel[134] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 9
		bodyModel[135] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 10
		bodyModel[136] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 11
		bodyModel[137] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 12
		bodyModel[138] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Box 13
		bodyModel[139] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 14
		bodyModel[140] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 15
		bodyModel[141] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 16
		bodyModel[142] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 17
		bodyModel[143] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 18
		bodyModel[144] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 19
		bodyModel[145] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 20
		bodyModel[146] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 21
		bodyModel[147] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 22
		bodyModel[148] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 23
		bodyModel[149] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 24
		bodyModel[150] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Box 25
		bodyModel[151] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 26
		bodyModel[152] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Box 27
		bodyModel[153] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 28
		bodyModel[154] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 29
		bodyModel[155] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 30
		bodyModel[156] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Box 31
		bodyModel[157] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 32
		bodyModel[158] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 33
		bodyModel[159] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 34
		bodyModel[160] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 35
		bodyModel[161] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 36
		bodyModel[162] = new ModelRendererTurbo(this, 761, 121, textureX, textureY); // Box 38
		bodyModel[163] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 39
		bodyModel[164] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 40
		bodyModel[165] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 41
		bodyModel[166] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 42
		bodyModel[167] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 43
		bodyModel[168] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 44
		bodyModel[169] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 45
		bodyModel[170] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 46
		bodyModel[171] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 47
		bodyModel[172] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 48
		bodyModel[173] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 49
		bodyModel[174] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 50
		bodyModel[175] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 51
		bodyModel[176] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 52
		bodyModel[177] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 53
		bodyModel[178] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 55
		bodyModel[179] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 60
		bodyModel[180] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 61
		bodyModel[181] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 62
		bodyModel[182] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 63
		bodyModel[183] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 64
		bodyModel[184] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 65
		bodyModel[185] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 66
		bodyModel[186] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 67
		bodyModel[187] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 68
		bodyModel[188] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 69
		bodyModel[189] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 70
		bodyModel[190] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 72
		bodyModel[191] = new ModelRendererTurbo(this, 873, 105, textureX, textureY); // Box 73
		bodyModel[192] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 74
		bodyModel[193] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 75
		bodyModel[194] = new ModelRendererTurbo(this, 857, 121, textureX, textureY); // Box 76
		bodyModel[195] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 77
		bodyModel[196] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 78
		bodyModel[197] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 79
		bodyModel[198] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 80
		bodyModel[199] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 81
		bodyModel[200] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 82
		bodyModel[201] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 83
		bodyModel[202] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 84
		bodyModel[203] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Box 85
		bodyModel[204] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 86
		bodyModel[205] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 87
		bodyModel[206] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Box 88
		bodyModel[207] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 89
		bodyModel[208] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 91
		bodyModel[209] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 92
		bodyModel[210] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 93
		bodyModel[211] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Box 94
		bodyModel[212] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 95
		bodyModel[213] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Box 96
		bodyModel[214] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 97
		bodyModel[215] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 98
		bodyModel[216] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 99
		bodyModel[217] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 100
		bodyModel[218] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 101
		bodyModel[219] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 102
		bodyModel[220] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 103
		bodyModel[221] = new ModelRendererTurbo(this, 521, 89, textureX, textureY); // Box 107
		bodyModel[222] = new ModelRendererTurbo(this, 569, 89, textureX, textureY); // Box 108
		bodyModel[223] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 109
		bodyModel[224] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 110
		bodyModel[225] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Box 111
		bodyModel[226] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 112
		bodyModel[227] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 113
		bodyModel[228] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 114
		bodyModel[229] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Box 115
		bodyModel[230] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 116
		bodyModel[231] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 117
		bodyModel[232] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 118
		bodyModel[233] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 119
		bodyModel[234] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 120
		bodyModel[235] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 121
		bodyModel[236] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 0
		bodyModel[237] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 1
		bodyModel[238] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 3
		bodyModel[239] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 4
		bodyModel[240] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 5
		bodyModel[241] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 6
		bodyModel[242] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 7
		bodyModel[243] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 8
		bodyModel[244] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 9

		bodyModel[0].addShapeBox(0F, 0F, 0F, 29, 13, 52, 0F,0F, 0F, -6F, -12F, -3F, -6F, -12F, -3F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(9F, -26F, -26F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 28, 13, 52, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-19F, -26F, -26F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 34, 9, 52, 0F,0F, 0F, -6F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-53F, -22F, -26F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 9, 52, 0F,-9F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -9F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-62F, -22F, -26F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 101, 1, 52, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-63F, -13F, -26F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 99, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-63F, -11F, -26F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(-68F, -11F, -26F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 10
		bodyModel[7].setRotationPoint(-68F, -6F, -26F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 20, 12, 9, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 11
		bodyModel[8].setRotationPoint(-68F, -2F, -26F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 72, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(-48F, 9F, -26F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 6, 9, 0F); // Box 13
		bodyModel[10].setRotationPoint(40F, -7F, -26F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 14
		bodyModel[11].setRotationPoint(36F, -11F, -26F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 12, 9, 0F,0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[12].setRotationPoint(24F, -2F, -26F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 5, 9, 0F); // Box 16
		bodyModel[13].setRotationPoint(-68F, -6F, 17F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(-68F, -11F, 17F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 20, 12, 9, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 18
		bodyModel[15].setRotationPoint(-68F, -2F, 17F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 99, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-63F, -11F, 17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 72, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(-48F, 9F, 17F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 17, 12, 9, 0F,0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[18].setRotationPoint(24F, -2F, 17F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 6, 9, 0F); // Box 22
		bodyModel[19].setRotationPoint(40F, -7F, 17F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 23
		bodyModel[20].setRotationPoint(36F, -11F, 17F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 25
		bodyModel[21].setRotationPoint(38F, -13F, 17F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 5, 34, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[22].setRotationPoint(38F, -13F, -17F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 109, 10, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -8F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-67F, -8F, -17F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 105, 4, 34, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[24].setRotationPoint(-67F, -12F, -17F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[25].setRotationPoint(-68F, -13F, -26F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[26].setRotationPoint(-68F, -13F, 17F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 31
		bodyModel[27].setRotationPoint(41F, -11F, 17F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 32
		bodyModel[28].setRotationPoint(41F, -11F, -26F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 33
		bodyModel[29].setRotationPoint(38F, -13F, -26F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[30].setRotationPoint(-7F, -9F, -25F);

		bodyModel[31].addShapeBox(0F, -1F, 0F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[31].setRotationPoint(-7F, -9F, -25F);

		bodyModel[32].addShapeBox(0F, 2F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 81
		bodyModel[32].setRotationPoint(-7F, -9F, -25F);

		bodyModel[33].addShapeBox(0F, -1F, 0F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[33].setRotationPoint(9F, -9F, -25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[34].setRotationPoint(9F, -9F, -25F);

		bodyModel[35].addShapeBox(0F, 2F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 84
		bodyModel[35].setRotationPoint(9F, -9F, -25F);

		bodyModel[36].addShapeBox(0F, -1F, 0F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[36].setRotationPoint(-40F, -9F, -25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[37].setRotationPoint(-40F, -9F, -25F);

		bodyModel[38].addShapeBox(0F, 2F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 87
		bodyModel[38].setRotationPoint(-40F, -9F, -25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[39].setRotationPoint(-40F, -9F, 22F);

		bodyModel[40].addShapeBox(0F, 2F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 89
		bodyModel[40].setRotationPoint(-40F, -9F, 22F);

		bodyModel[41].addShapeBox(0F, -1F, 0F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[41].setRotationPoint(-40F, -9F, 22F);

		bodyModel[42].addShapeBox(0F, -1F, 0F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[42].setRotationPoint(-7F, -9F, 22F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[43].setRotationPoint(-7F, -9F, 22F);

		bodyModel[44].addShapeBox(0F, 2F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 93
		bodyModel[44].setRotationPoint(-7F, -9F, 22F);

		bodyModel[45].addShapeBox(0F, -1F, 0F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[45].setRotationPoint(9F, -9F, 22F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[46].setRotationPoint(9F, -9F, 22F);

		bodyModel[47].addShapeBox(0F, 2F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 96
		bodyModel[47].setRotationPoint(9F, -9F, 22F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 97
		bodyModel[48].setRotationPoint(12F, -26F, 9F);
		bodyModel[48].rotateAngleZ = -0.17453293F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 98
		bodyModel[49].setRotationPoint(18.9F, -24.79F, 9F);
		bodyModel[49].rotateAngleZ = -0.19198622F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[50].setRotationPoint(12F, -26F, 6F);
		bodyModel[50].rotateAngleZ = -0.17453293F;

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 100
		bodyModel[51].setRotationPoint(14F, -26F, 5F);
		bodyModel[51].rotateAngleZ = -0.17453293F;

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 101
		bodyModel[52].setRotationPoint(17F, -25.5F, 5F);
		bodyModel[52].rotateAngleZ = -0.17453293F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[53].setRotationPoint(19F, -33.5F, -4F);

		bodyModel[54].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 105
		bodyModel[54].setRotationPoint(18F, -38.5F, 0.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 11, 1, 8, 0F); // Box 113
		bodyModel[55].setRotationPoint(-6F, -26.5F, -16F);

		bodyModel[56].addBox(0F, 0F, 0F, 11, 1, 8, 0F); // Box 114
		bodyModel[56].setRotationPoint(-6F, -26.5F, 8F);

		bodyModel[57].addBox(0F, 0F, 0F, 11, 1, 8, 0F); // Box 115
		bodyModel[57].setRotationPoint(14F, -13F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[58].setRotationPoint(-31F, -23.25F, -20F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[59].setRotationPoint(-31F, -23.25F, -15F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[60].setRotationPoint(-31F, -23.25F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[61].setRotationPoint(-47.5F, -22.25F, -20F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[62].setRotationPoint(-47.5F, -22.25F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[63].setRotationPoint(-47.5F, -22.25F, -15F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[64].setRotationPoint(-47.5F, -22.25F, -19F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[65].setRotationPoint(-31.5F, -22.25F, -20F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[66].setRotationPoint(-31F, -23.25F, -19F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[67].setRotationPoint(-20F, -23.25F, -20F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[68].setRotationPoint(-27F, -23.25F, -19F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[69].setRotationPoint(-24F, -23.25F, -19F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[70].setRotationPoint(-20.5F, -23.1F, -19F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[71].setRotationPoint(-21.5F, -23.1F, -19F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[72].setRotationPoint(-22.5F, -23.1F, -19F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[73].setRotationPoint(-24.5F, -23.1F, -19F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[74].setRotationPoint(-25.5F, -23.1F, -19F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[75].setRotationPoint(-26.5F, -23.1F, -19F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[76].setRotationPoint(-27.5F, -23.1F, -19F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[77].setRotationPoint(-28.5F, -23.1F, -19F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[78].setRotationPoint(-29.5F, -23.1F, -19F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[79].setRotationPoint(-30.5F, -23.1F, -19F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[80].setRotationPoint(-32F, -22.1F, -19F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[81].setRotationPoint(-33F, -22.1F, -19F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[82].setRotationPoint(-34F, -22.1F, -19F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[83].setRotationPoint(-35F, -22.1F, -19F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[84].setRotationPoint(-36F, -22.1F, -19F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[85].setRotationPoint(-37F, -22.1F, -19F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[86].setRotationPoint(-38F, -22.1F, -19F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[87].setRotationPoint(-39F, -22.1F, -19F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[88].setRotationPoint(-40F, -22.1F, -19F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[89].setRotationPoint(-41F, -22.1F, -19F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[90].setRotationPoint(-42F, -22.1F, -19F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[91].setRotationPoint(-43F, -22.1F, -19F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[92].setRotationPoint(-44F, -22.1F, -19F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[93].setRotationPoint(-45F, -22.1F, -19F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[94].setRotationPoint(-46F, -22.1F, -19F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[95].setRotationPoint(-47F, -22.1F, -19F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[96].setRotationPoint(-29F, -22.25F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[97].setRotationPoint(-28F, -22.25F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 156
		bodyModel[98].setRotationPoint(-28F, -22.25F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[99].setRotationPoint(-30F, -22.25F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[100].setRotationPoint(-30F, -22.25F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 159
		bodyModel[101].setRotationPoint(-33F, -22.25F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 160
		bodyModel[102].setRotationPoint(-27F, -22.25F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 161
		bodyModel[103].setRotationPoint(-51F, -22.5F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[104].setRotationPoint(-49F, -22.5F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 163
		bodyModel[105].setRotationPoint(-47F, -22.5F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[106].setRotationPoint(-43.5F, -22.1F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[107].setRotationPoint(-42.5F, -22.1F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[108].setRotationPoint(-44.5F, -22.25F, -6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[109].setRotationPoint(-44F, -22.25F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[110].setRotationPoint(-44F, -22.25F, 2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[111].setRotationPoint(-43F, -22.25F, 8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[112].setRotationPoint(-42.5F, -22.1F, 11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[113].setRotationPoint(-39.5F, -22.1F, -0.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[114].setRotationPoint(-42.5F, -22.1F, -1F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 173
		bodyModel[115].setRotationPoint(-40F, -23.5F, 8.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 174
		bodyModel[116].setRotationPoint(-40F, -23.5F, 6.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 175
		bodyModel[117].setRotationPoint(-40F, -23.5F, 4.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 176
		bodyModel[118].setRotationPoint(-40F, -23.5F, 2.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 177
		bodyModel[119].setRotationPoint(-40F, -23.5F, 0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 1
		bodyModel[120].setRotationPoint(20F, -36.5F, 0.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[121].setRotationPoint(19F, -31.5F, -4F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 3
		bodyModel[122].setRotationPoint(19F, -32.5F, -4F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 4
		bodyModel[123].setRotationPoint(20F, -31.5F, -3.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 5
		bodyModel[124].setRotationPoint(19F, -31.5F, -3.5F);

		bodyModel[125].addBox(-1F, 0F, 11.5F, 1, 2, 1, 0F); // Box 0
		bodyModel[125].setRotationPoint(0F, -28.5F, 0F);

		bodyModel[126].addBox(-1.5F, 0F, 11F, 2, 3, 2, 0F); // Box 1
		bodyModel[126].setRotationPoint(0F, -31.5F, 0F);

		bodyModel[127].addShapeBox(0.5F, 0F, 11F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[127].setRotationPoint(0F, -31.5F, 0F);

		bodyModel[128].addShapeBox(-6.5F, 0F, 11F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 3
		bodyModel[128].setRotationPoint(0F, -32.5F, 0F);

		bodyModel[129].addShapeBox(-7.5F, 0F, 11F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[129].setRotationPoint(0F, -33.5F, 0F);

		bodyModel[130].addShapeBox(-7.5F, 0F, 11F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[130].setRotationPoint(0F, -36.5F, 0F);

		bodyModel[131].addShapeBox(-7.5F, 0F, 11F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[131].setRotationPoint(0F, -37.5F, 0F);

		bodyModel[132].addShapeBox(-6.5F, 0F, 10.5F, 15, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[132].setRotationPoint(0F, -38F, 0F);

		bodyModel[133].addShapeBox(8.5F, 0F, 10.5F, 6, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 8
		bodyModel[133].setRotationPoint(0F, -38F, 0F);

		bodyModel[134].addShapeBox(-6.5F, 0F, 10.5F, 15, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[134].setRotationPoint(0F, -36F, 0F);

		bodyModel[135].addBox(-6.5F, 0F, 10.5F, 15, 1, 3, 0F); // Box 10
		bodyModel[135].setRotationPoint(0F, -37F, 0F);

		bodyModel[136].addShapeBox(8.5F, 0F, 10.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0F, -0.5F); // Box 11
		bodyModel[136].setRotationPoint(0F, -36F, 0F);

		bodyModel[137].addShapeBox(8.5F, 0F, 10.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 12
		bodyModel[137].setRotationPoint(0F, -37F, 0F);

		bodyModel[138].addShapeBox(-4.5F, 0F, 12.5F, 7, 2, 2, 0F,0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 13
		bodyModel[138].setRotationPoint(0F, -39.5F, 0F);

		bodyModel[139].addShapeBox(-4.5F, 0F, 9.5F, 7, 2, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[139].setRotationPoint(0F, -39.5F, 0F);

		bodyModel[140].addShapeBox(-4.5F, 0F, 12.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[140].setRotationPoint(0F, -35.5F, 0F);

		bodyModel[141].addShapeBox(-4.5F, 0F, 9.5F, 7, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 16
		bodyModel[141].setRotationPoint(0F, -35.5F, 0F);

		bodyModel[142].addShapeBox(-6.5F, 0F, 11F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F); // Box 17
		bodyModel[142].setRotationPoint(0F, -35F, 0F);

		bodyModel[143].addBox(-1F, 0F, -12.5F, 1, 2, 1, 0F); // Box 18
		bodyModel[143].setRotationPoint(0F, -28.5F, 0F);

		bodyModel[144].addBox(-1.5F, 0F, -13F, 2, 3, 2, 0F); // Box 19
		bodyModel[144].setRotationPoint(0F, -31.5F, 0F);

		bodyModel[145].addShapeBox(0.5F, 0F, -13F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[145].setRotationPoint(0F, -31.5F, 0F);

		bodyModel[146].addShapeBox(-6.5F, 0F, -13F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 21
		bodyModel[146].setRotationPoint(0F, -32.5F, 0F);

		bodyModel[147].addShapeBox(-4.5F, 0F, -11.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[147].setRotationPoint(0F, -35.5F, 0F);

		bodyModel[148].addBox(-6.5F, 0F, -13.5F, 15, 1, 3, 0F); // Box 23
		bodyModel[148].setRotationPoint(0F, -37F, 0F);

		bodyModel[149].addShapeBox(-6.5F, 0F, -13.5F, 15, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[149].setRotationPoint(0F, -38F, 0F);

		bodyModel[150].addShapeBox(-6.5F, 0F, -13.5F, 15, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25
		bodyModel[150].setRotationPoint(0F, -36F, 0F);

		bodyModel[151].addShapeBox(8.5F, 0F, -13.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0F, -0.5F); // Box 26
		bodyModel[151].setRotationPoint(0F, -36F, 0F);

		bodyModel[152].addShapeBox(8.5F, 0F, -13.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 27
		bodyModel[152].setRotationPoint(0F, -37F, 0F);

		bodyModel[153].addShapeBox(8.5F, 0F, -13.5F, 6, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 28
		bodyModel[153].setRotationPoint(0F, -38F, 0F);

		bodyModel[154].addShapeBox(-4.5F, 0F, -11.5F, 7, 2, 2, 0F,0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 29
		bodyModel[154].setRotationPoint(0F, -39.5F, 0F);

		bodyModel[155].addShapeBox(-6.5F, 0F, -13F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F); // Box 30
		bodyModel[155].setRotationPoint(0F, -35F, 0F);

		bodyModel[156].addShapeBox(-7.5F, 0F, -13F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[156].setRotationPoint(0F, -36.5F, 0F);

		bodyModel[157].addShapeBox(-7.5F, 0F, -13F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 32
		bodyModel[157].setRotationPoint(0F, -33.5F, 0F);

		bodyModel[158].addShapeBox(-7.5F, 0F, -13F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[158].setRotationPoint(0F, -37.5F, 0F);

		bodyModel[159].addShapeBox(-4.5F, 0F, -14.5F, 7, 2, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[159].setRotationPoint(0F, -39.5F, 0F);

		bodyModel[160].addShapeBox(-4.5F, 0F, -14.5F, 7, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 35
		bodyModel[160].setRotationPoint(0F, -35.5F, 0F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 13, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
		bodyModel[161].setRotationPoint(-31F, -23F, -20.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[162].setRotationPoint(-51F, -22.5F, 8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 39
		bodyModel[163].setRotationPoint(33F, -17F, -14F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 40
		bodyModel[164].setRotationPoint(35F, -15F, -14F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -1F); // Box 41
		bodyModel[165].setRotationPoint(35F, -13F, -14F);

		bodyModel[166].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 42
		bodyModel[166].setRotationPoint(38.5F, -14.5F, -11.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[167].setRotationPoint(39.5F, -10.5F, -17F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[168].setRotationPoint(40.5F, -11.5F, -16F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 45
		bodyModel[169].setRotationPoint(40.5F, -12.5F, -17F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[170].setRotationPoint(40.5F, -14.5F, -17F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 47
		bodyModel[171].setRotationPoint(40.5F, -13.5F, -17F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[172].setRotationPoint(39.5F, -10.5F, 14F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[173].setRotationPoint(40.5F, -11.5F, 15F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 50
		bodyModel[174].setRotationPoint(40.5F, -13.5F, 14F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 51
		bodyModel[175].setRotationPoint(40.5F, -12.5F, 14F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[176].setRotationPoint(40.5F, -14.5F, 14F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		bodyModel[177].setRotationPoint(36.5F, -14.5F, -24F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[178].setRotationPoint(36.5F, -17.5F, -22F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[179].setRotationPoint(36.5F, -17.5F, -24.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 61
		bodyModel[180].setRotationPoint(36.5F, -18F, -24F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 62
		bodyModel[181].setRotationPoint(36.25F, -15.5F, -23.25F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 63
		bodyModel[182].setRotationPoint(36.25F, -16F, -23.25F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 64
		bodyModel[183].setRotationPoint(36.5F, -14.5F, 21F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[184].setRotationPoint(36.5F, -17.5F, 20.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[185].setRotationPoint(36.5F, -18F, 21F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 67
		bodyModel[186].setRotationPoint(36.25F, -16F, 21.75F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 68
		bodyModel[187].setRotationPoint(36.25F, -15.5F, 21.75F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[188].setRotationPoint(36.5F, -17.5F, 23F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[189].setRotationPoint(22F, -25F, 14F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 72
		bodyModel[190].setRotationPoint(22F, -25F, 9F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 73
		bodyModel[191].setRotationPoint(19F, -25F, 4F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[192].setRotationPoint(22F, -25F, -13F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 75
		bodyModel[193].setRotationPoint(22F, -25F, -18F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[194].setRotationPoint(19F, -25F, -8F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 77
		bodyModel[195].setRotationPoint(19F, -36.5F, 0.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 78
		bodyModel[196].setRotationPoint(7F, -27F, -16F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 79
		bodyModel[197].setRotationPoint(7F, -27F, 6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 6, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 80
		bodyModel[198].setRotationPoint(-68F, -12F, -12F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[199].setRotationPoint(-68F, -16F, -12F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[200].setRotationPoint(-68F, -15.5F, -11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[201].setRotationPoint(-68F, -16F, 11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[202].setRotationPoint(-68F, -15.5F, 4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[203].setRotationPoint(-68F, -15.5F, -5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 86
		bodyModel[204].setRotationPoint(-68F, -16F, -12F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 87
		bodyModel[205].setRotationPoint(-68F, -16F, 11F);

		bodyModel[206].addBox(0F, 0F, 0F, 3, 10, 7, 0F); // Box 88
		bodyModel[206].setRotationPoint(-56F, -23F, -16F);
		bodyModel[206].rotateAngleZ = -0.75049158F;

		bodyModel[207].addBox(0F, 0F, 0F, 3, 9, 6, 0F); // Box 89
		bodyModel[207].setRotationPoint(-57F, -22F, -8.5F);
		bodyModel[207].rotateAngleZ = -0.75049158F;

		bodyModel[208].addBox(0F, 0F, 0F, 3, 9, 6, 0F); // Box 91
		bodyModel[208].setRotationPoint(-57F, -22F, -0.5F);
		bodyModel[208].rotateAngleZ = -0.75049158F;

		bodyModel[209].addBox(0F, 0F, 0F, 3, 9, 6, 0F); // Box 92
		bodyModel[209].setRotationPoint(-57F, -22F, 7.5F);
		bodyModel[209].rotateAngleZ = -0.75049158F;

		bodyModel[210].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 93
		bodyModel[210].setRotationPoint(-59F, -18F, -18.5F);
		bodyModel[210].rotateAngleZ = -0.75049158F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 94
		bodyModel[211].setRotationPoint(-61F, -16F, -22.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[212].setRotationPoint(-61F, -17F, -22.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[213].setRotationPoint(-61F, -19F, -22.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[214].setRotationPoint(-61F, -17F, 19.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 98
		bodyModel[215].setRotationPoint(-61F, -16F, 19.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[216].setRotationPoint(-61F, -19F, 19.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[217].setRotationPoint(-66F, -5.5F, 4F);
		bodyModel[217].rotateAngleZ = 0.66322512F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[218].setRotationPoint(-63F, -1.5F, 13F);
		bodyModel[218].rotateAngleZ = 0.62831853F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[219].setRotationPoint(-63F, -1.5F, -16F);
		bodyModel[219].rotateAngleZ = 0.62831853F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[220].setRotationPoint(-66F, -5.5F, -11F);
		bodyModel[220].rotateAngleZ = 0.66322512F;

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[221].setRotationPoint(-19.25F, -25.25F, -8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 108
		bodyModel[222].setRotationPoint(-19.25F, -23.25F, -8F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 109
		bodyModel[223].setRotationPoint(-19.25F, -24.25F, -8F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 110
		bodyModel[224].setRotationPoint(-19.25F, -25.5F, 1F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 111
		bodyModel[225].setRotationPoint(-19.25F, -24.5F, 19F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 112
		bodyModel[226].setRotationPoint(-20F, -24.5F, 19F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[227].setRotationPoint(-26F, -22.5F, 17F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[228].setRotationPoint(-51.5F, -22.25F, 17F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[229].setRotationPoint(-51.5F, -22.25F, -19F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 116
		bodyModel[230].setRotationPoint(-19.5F, -22.5F, 1F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 117
		bodyModel[231].setRotationPoint(-19.25F, -25.5F, -9F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 118
		bodyModel[232].setRotationPoint(-18F, -26.5F, 18.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 119
		bodyModel[233].setRotationPoint(-18.25F, -49.5F, 18.25F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 120
		bodyModel[234].setRotationPoint(-18F, -26.5F, -19.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 121
		bodyModel[235].setRotationPoint(-18.25F, -49.5F, -19.75F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[236].setRotationPoint(-47.5F, -21F, 21.5F);
		bodyModel[236].rotateAngleX = -1.01229097F;
		bodyModel[236].rotateAngleY = 0.05235988F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[237].setRotationPoint(-28.5F, -21.5F, 22.5F);
		bodyModel[237].rotateAngleX = -1.02974426F;
		bodyModel[237].rotateAngleY = 0.05235988F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[238].setRotationPoint(-50.5F, -21.5F, 21.2F);
		bodyModel[238].rotateAngleX = -0.95993109F;
		bodyModel[238].rotateAngleY = 0.05235988F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[239].setRotationPoint(-53.5F, -16.5F, 24.2F);
		bodyModel[239].rotateAngleX = -0.97738438F;
		bodyModel[239].rotateAngleY = 0.05235988F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[240].setRotationPoint(-50.5F, -16F, 24.5F);
		bodyModel[240].rotateAngleX = -1.02974426F;
		bodyModel[240].rotateAngleY = 0.05235988F;

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[241].setRotationPoint(-31.5F, -16.5F, 25.5F);
		bodyModel[241].rotateAngleX = -1.04719755F;
		bodyModel[241].rotateAngleY = 0.05235988F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, 0F); // Box 7
		bodyModel[242].setRotationPoint(-49.5F, -19F, 23F);
		bodyModel[242].rotateAngleX = -0.97738438F;
		bodyModel[242].rotateAngleY = 0.05235988F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[243].setRotationPoint(-48.5F, -18.5F, 23.3F);
		bodyModel[243].rotateAngleX = -1.02974426F;
		bodyModel[243].rotateAngleY = 0.05235988F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[244].setRotationPoint(-34.5F, -19F, 23.9F);
		bodyModel[244].rotateAngleX = -1.04719755F;
		bodyModel[244].rotateAngleY = 0.05235988F;
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Box 58
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 59
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Box 60
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 73
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 74
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 75
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 287
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 288
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 289
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 290
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 291
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 292
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 293
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 294
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 295
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 296
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 297
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 298
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 302
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 303
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 304

		leftTrackWheelModels[0].addShapeBox(-5F, -2F, 0F, 10, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftTrackWheelModels[0].setRotationPoint(-61F, -4F, 17F);

		leftTrackWheelModels[1].addShapeBox(-5F, -5F, 0F, 10, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftTrackWheelModels[1].setRotationPoint(-61F, -4F, 17F);

		leftTrackWheelModels[2].addShapeBox(-5F, 2F, 0F, 10, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 60
		leftTrackWheelModels[2].setRotationPoint(-61F, -4F, 17F);

		leftTrackWheelModels[3].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftTrackWheelModels[3].setRotationPoint(21F, 2F, 17F);

		leftTrackWheelModels[4].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		leftTrackWheelModels[4].setRotationPoint(21F, 2F, 17F);

		leftTrackWheelModels[5].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 75
		leftTrackWheelModels[5].setRotationPoint(21F, 2F, 17F);

		leftTrackWheelModels[6].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 287
		leftTrackWheelModels[6].setRotationPoint(5F, 2F, 17F);

		leftTrackWheelModels[7].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		leftTrackWheelModels[7].setRotationPoint(5F, 2F, 17F);

		leftTrackWheelModels[8].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		leftTrackWheelModels[8].setRotationPoint(5F, 2F, 17F);

		leftTrackWheelModels[9].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 290
		leftTrackWheelModels[9].setRotationPoint(-12F, 2F, 17F);

		leftTrackWheelModels[10].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		leftTrackWheelModels[10].setRotationPoint(-12F, 2F, 17F);

		leftTrackWheelModels[11].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		leftTrackWheelModels[11].setRotationPoint(-12F, 2F, 17F);

		leftTrackWheelModels[12].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 293
		leftTrackWheelModels[12].setRotationPoint(-28F, 2F, 17F);

		leftTrackWheelModels[13].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		leftTrackWheelModels[13].setRotationPoint(-28F, 2F, 17F);

		leftTrackWheelModels[14].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		leftTrackWheelModels[14].setRotationPoint(-28F, 2F, 17F);

		leftTrackWheelModels[15].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 296
		leftTrackWheelModels[15].setRotationPoint(-45F, 2F, 17F);

		leftTrackWheelModels[16].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		leftTrackWheelModels[16].setRotationPoint(-45F, 2F, 17F);

		leftTrackWheelModels[17].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		leftTrackWheelModels[17].setRotationPoint(-45F, 2F, 17F);

		leftTrackWheelModels[18].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F); // Box 302
		leftTrackWheelModels[18].setRotationPoint(34F, -5F, 17F);

		leftTrackWheelModels[19].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 303
		leftTrackWheelModels[19].setRotationPoint(34F, -5F, 17F);

		leftTrackWheelModels[20].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 304
		leftTrackWheelModels[20].setRotationPoint(34F, -5F, 17F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Box 305
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 306
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Box 307
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 308
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 309
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 310
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 311
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 312
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 313
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 314
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 315
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 316
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 317
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 318
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 319
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 320
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 321
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 322
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 323
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 324
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 325

		rightTrackWheelModels[0].addShapeBox(-5F, -2F, 0F, 10, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightTrackWheelModels[0].setRotationPoint(-61F, -4F, -25F);

		rightTrackWheelModels[1].addShapeBox(-5F, -5F, 0F, 10, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		rightTrackWheelModels[1].setRotationPoint(-61F, -4F, -25F);

		rightTrackWheelModels[2].addShapeBox(-5F, 2F, 0F, 10, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 307
		rightTrackWheelModels[2].setRotationPoint(-61F, -4F, -25F);

		rightTrackWheelModels[3].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightTrackWheelModels[3].setRotationPoint(21F, 2F, -25F);

		rightTrackWheelModels[4].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		rightTrackWheelModels[4].setRotationPoint(21F, 2F, -25F);

		rightTrackWheelModels[5].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 310
		rightTrackWheelModels[5].setRotationPoint(21F, 2F, -25F);

		rightTrackWheelModels[6].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 311
		rightTrackWheelModels[6].setRotationPoint(5F, 2F, -25F);

		rightTrackWheelModels[7].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		rightTrackWheelModels[7].setRotationPoint(5F, 2F, -25F);

		rightTrackWheelModels[8].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		rightTrackWheelModels[8].setRotationPoint(5F, 2F, -25F);

		rightTrackWheelModels[9].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 314
		rightTrackWheelModels[9].setRotationPoint(-12F, 2F, -25F);

		rightTrackWheelModels[10].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		rightTrackWheelModels[10].setRotationPoint(-12F, 2F, -25F);

		rightTrackWheelModels[11].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		rightTrackWheelModels[11].setRotationPoint(-12F, 2F, -25F);

		rightTrackWheelModels[12].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 317
		rightTrackWheelModels[12].setRotationPoint(-28F, 2F, -25F);

		rightTrackWheelModels[13].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		rightTrackWheelModels[13].setRotationPoint(-28F, 2F, -25F);

		rightTrackWheelModels[14].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		rightTrackWheelModels[14].setRotationPoint(-28F, 2F, -25F);

		rightTrackWheelModels[15].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 320
		rightTrackWheelModels[15].setRotationPoint(-45F, 2F, -25F);

		rightTrackWheelModels[16].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		rightTrackWheelModels[16].setRotationPoint(-45F, 2F, -25F);

		rightTrackWheelModels[17].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		rightTrackWheelModels[17].setRotationPoint(-45F, 2F, -25F);

		rightTrackWheelModels[18].addShapeBox(-6F, 3F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F); // Box 323
		rightTrackWheelModels[18].setRotationPoint(34F, -5F, -25F);

		rightTrackWheelModels[19].addShapeBox(-6F, -1F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 324
		rightTrackWheelModels[19].setRotationPoint(34F, -5F, -25F);

		rightTrackWheelModels[20].addShapeBox(-6F, -5F, 0F, 12, 4, 8, 0F,-3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 325
		rightTrackWheelModels[20].setRotationPoint(34F, -5F, -25F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[20];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 8, 140, textureX, textureY); // Ammo 1
		gun_1_Model[1][1] = new ModelRendererTurbo(this, -1, 144, textureX, textureY); // Ammo 2
		gun_1_Model[1][2] = new ModelRendererTurbo(this, -1, 149, textureX, textureY); // Barrel 1
		gun_1_Model[1][3] = new ModelRendererTurbo(this, -1, 152, textureX, textureY); // Barrel 2
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 4, 149, textureX, textureY); // Barrel 3
		gun_1_Model[1][5] = new ModelRendererTurbo(this, -1, 155, textureX, textureY); // Barrel 4
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 4, 152, textureX, textureY); // Barrel 5
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 4, 155, textureX, textureY); // Barrel 6
		gun_1_Model[1][8] = new ModelRendererTurbo(this, -1, 158, textureX, textureY); // Barrel 7
		gun_1_Model[1][9] = new ModelRendererTurbo(this, -1, 161, textureX, textureY); // Body 1
		gun_1_Model[1][10] = new ModelRendererTurbo(this, -1, 164, textureX, textureY); // Body 2
		gun_1_Model[1][11] = new ModelRendererTurbo(this, -1, 167, textureX, textureY); // Body 3
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 11, 152, textureX, textureY); // Griff 1
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 18, 152, textureX, textureY); // Griff 2
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 18, 152, textureX, textureY); // Griff 3
		gun_1_Model[1][15] = new ModelRendererTurbo(this, -1, 140, textureX, textureY); // Mun 1
		gun_1_Model[1][16] = new ModelRendererTurbo(this, 4, 140, textureX, textureY); // Mun 2
		gun_1_Model[1][17] = new ModelRendererTurbo(this, 21, 140, textureX, textureY); // Schulter 1
		gun_1_Model[1][18] = new ModelRendererTurbo(this, 21, 143, textureX, textureY); // Schulter 2
		gun_1_Model[1][19] = new ModelRendererTurbo(this, 21, 146, textureX, textureY); // Schulter 3

		gun_1_Model[1][0].addBox(-3.4F, -0.2F, 0F, 2, 3, 4, 0F); // Ammo 1

		gun_1_Model[1][1].addBox(-2.9F, -0.8F, 0F, 1, 0, 3, 0F); // Ammo 2

		gun_1_Model[1][2].addShapeBox(11F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F); // Barrel 1

		gun_1_Model[1][3].addShapeBox(10F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.05F, -0.05F); // Barrel 2

		gun_1_Model[1][4].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Barrel 3

		gun_1_Model[1][5].addShapeBox(8F, -1.9F, -0.5F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Barrel 4

		gun_1_Model[1][6].addShapeBox(0F, -2F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Barrel 5

		gun_1_Model[1][7].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Barrel 6

		gun_1_Model[1][8].addShapeBox(-1F, -1F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Barrel 7

		gun_1_Model[1][9].addBox(-9F, -1F, -0.5F, 8, 1, 1, 0F); // Body 1

		gun_1_Model[1][10].addShapeBox(-9F, -2F, -0.5F, 8, 1, 1, 0F,-5F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body 2

		gun_1_Model[1][11].addShapeBox(-3.4F, -1.2F, -0.3F, 2, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Body 3

		gun_1_Model[1][12].addShapeBox(-5.5F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Griff 1

		gun_1_Model[1][13].addShapeBox(-5.5F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Griff 2

		gun_1_Model[1][14].addShapeBox(-5.5F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, -0.8F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, 01F, -0.8F, -0.2F); // Griff 3

		gun_1_Model[1][15].addShapeBox(-4.2F, -1F, -1.2F, 1, 1, 1, 0F,-0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Mun 1

		gun_1_Model[1][16].addShapeBox(-4F, -1.5F, -1.3F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Mun 2

		gun_1_Model[1][17].addShapeBox(-12F, -2F, -0.5F, 2, 1, 1, 0F,0.5F, -0.5F, -0.25F, -2F, -0.5F, -0.2F, -2F, -0.5F, -0.2F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.08F, 0F, 0F, -0.08F, 0F, 0F, -0.25F); // Schulter 1

		gun_1_Model[1][18].addShapeBox(-12F, -1F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Schulter 2

		gun_1_Model[1][19].addShapeBox(-12F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, 0F, 0F, -0.25F); // Schulter 3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(28F, -26F, -15F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);
	}
}