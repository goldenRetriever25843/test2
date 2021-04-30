//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Tirpitz
// Model Creator: 
// Created on: 31.05.2016 - 20:11:36
// Last changed on: 31.05.2016 - 20:11:36

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTirpitz extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelTirpitz() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[492];
		leftFrontWheelModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initleftFrontWheelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 649, 145, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 625, 209, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 809, 225, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 921, 225, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 529, 233, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 881, 225, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 585, 233, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Box 71
		bodyModel[72] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 633, 249, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 74
		bodyModel[75] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 75
		bodyModel[76] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 78
		bodyModel[79] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 79
		bodyModel[80] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 80
		bodyModel[81] = new ModelRendererTurbo(this, 697, 249, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 89
		bodyModel[89] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 92
		bodyModel[92] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 94
		bodyModel[93] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 95
		bodyModel[94] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 96
		bodyModel[95] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 97
		bodyModel[96] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 98
		bodyModel[97] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 99
		bodyModel[98] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 100
		bodyModel[99] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Box 101
		bodyModel[100] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 102
		bodyModel[101] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 103
		bodyModel[102] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 104
		bodyModel[103] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 105
		bodyModel[104] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 106
		bodyModel[105] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 107
		bodyModel[106] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Box 108
		bodyModel[107] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 109
		bodyModel[108] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 113
		bodyModel[109] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 114
		bodyModel[110] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 115
		bodyModel[111] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 116
		bodyModel[112] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 117
		bodyModel[113] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 118
		bodyModel[114] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 119
		bodyModel[115] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 120
		bodyModel[116] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 121
		bodyModel[117] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 122
		bodyModel[118] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 123
		bodyModel[119] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 124
		bodyModel[120] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 125
		bodyModel[121] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 126
		bodyModel[122] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 127
		bodyModel[123] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 128
		bodyModel[124] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Box 129
		bodyModel[125] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 130
		bodyModel[126] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 131
		bodyModel[127] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 132
		bodyModel[128] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 133
		bodyModel[129] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 134
		bodyModel[130] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 135
		bodyModel[131] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 136
		bodyModel[132] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 137
		bodyModel[133] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 138
		bodyModel[134] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 139
		bodyModel[135] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 141
		bodyModel[136] = new ModelRendererTurbo(this, 753, 249, textureX, textureY); // Box 142
		bodyModel[137] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 143
		bodyModel[138] = new ModelRendererTurbo(this, 209, 273, textureX, textureY); // Box 145
		bodyModel[139] = new ModelRendererTurbo(this, 745, 209, textureX, textureY); // Box 146
		bodyModel[140] = new ModelRendererTurbo(this, 433, 273, textureX, textureY); // Box 147
		bodyModel[141] = new ModelRendererTurbo(this, 833, 273, textureX, textureY); // Box 148
		bodyModel[142] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 149
		bodyModel[143] = new ModelRendererTurbo(this, 937, 281, textureX, textureY); // Box 150
		bodyModel[144] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 151
		bodyModel[145] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 152
		bodyModel[146] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 153
		bodyModel[147] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Box 154
		bodyModel[148] = new ModelRendererTurbo(this, 897, 161, textureX, textureY); // Box 155
		bodyModel[149] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 156
		bodyModel[150] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 157
		bodyModel[151] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 158
		bodyModel[152] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 159
		bodyModel[153] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Box 160
		bodyModel[154] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 161
		bodyModel[155] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 162
		bodyModel[156] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Box 163
		bodyModel[157] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 164
		bodyModel[158] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 165
		bodyModel[159] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 166
		bodyModel[160] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 167
		bodyModel[161] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 168
		bodyModel[162] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 169
		bodyModel[163] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 170
		bodyModel[164] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 171
		bodyModel[165] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 172
		bodyModel[166] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 167
		bodyModel[167] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 168
		bodyModel[168] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 169
		bodyModel[169] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 170
		bodyModel[170] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 171
		bodyModel[171] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 172
		bodyModel[172] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 173
		bodyModel[173] = new ModelRendererTurbo(this, 977, 185, textureX, textureY); // Box 174
		bodyModel[174] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 175
		bodyModel[175] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Box 176
		bodyModel[176] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 178
		bodyModel[177] = new ModelRendererTurbo(this, 817, 209, textureX, textureY); // Box 179
		bodyModel[178] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 180
		bodyModel[179] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 181
		bodyModel[180] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 182
		bodyModel[181] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Box 183
		bodyModel[182] = new ModelRendererTurbo(this, 937, 161, textureX, textureY); // Box 184
		bodyModel[183] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 185
		bodyModel[184] = new ModelRendererTurbo(this, 625, 193, textureX, textureY); // Box 186
		bodyModel[185] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 187
		bodyModel[186] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 188
		bodyModel[187] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 189
		bodyModel[188] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 190
		bodyModel[189] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 191
		bodyModel[190] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Box 192
		bodyModel[191] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 193
		bodyModel[192] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 194
		bodyModel[193] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 195
		bodyModel[194] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 196
		bodyModel[195] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 197
		bodyModel[196] = new ModelRendererTurbo(this, 513, 137, textureX, textureY); // Box 198
		bodyModel[197] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Box 199
		bodyModel[198] = new ModelRendererTurbo(this, 849, 137, textureX, textureY); // Box 200
		bodyModel[199] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 201
		bodyModel[200] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Box 202
		bodyModel[201] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 203
		bodyModel[202] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Box 204
		bodyModel[203] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 205
		bodyModel[204] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 206
		bodyModel[205] = new ModelRendererTurbo(this, 65, 289, textureX, textureY); // Box 207
		bodyModel[206] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 208
		bodyModel[207] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 209
		bodyModel[208] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 210
		bodyModel[209] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 211
		bodyModel[210] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 212
		bodyModel[211] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 213
		bodyModel[212] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 214
		bodyModel[213] = new ModelRendererTurbo(this, 697, 137, textureX, textureY); // Box 215
		bodyModel[214] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Box 216
		bodyModel[215] = new ModelRendererTurbo(this, 505, 305, textureX, textureY); // Box 217
		bodyModel[216] = new ModelRendererTurbo(this, 833, 305, textureX, textureY); // Box 218
		bodyModel[217] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 219
		bodyModel[218] = new ModelRendererTurbo(this, 105, 313, textureX, textureY); // Box 220
		bodyModel[219] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 221
		bodyModel[220] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 222
		bodyModel[221] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Box 223
		bodyModel[222] = new ModelRendererTurbo(this, 529, 289, textureX, textureY); // Box 224
		bodyModel[223] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 225
		bodyModel[224] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 226
		bodyModel[225] = new ModelRendererTurbo(this, 273, 297, textureX, textureY); // Box 227
		bodyModel[226] = new ModelRendererTurbo(this, 201, 313, textureX, textureY); // Box 228
		bodyModel[227] = new ModelRendererTurbo(this, 321, 313, textureX, textureY); // Box 229
		bodyModel[228] = new ModelRendererTurbo(this, 385, 313, textureX, textureY); // Box 230
		bodyModel[229] = new ModelRendererTurbo(this, 793, 137, textureX, textureY); // Box 231
		bodyModel[230] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 232
		bodyModel[231] = new ModelRendererTurbo(this, 929, 161, textureX, textureY); // Box 234
		bodyModel[232] = new ModelRendererTurbo(this, 649, 169, textureX, textureY); // Box 235
		bodyModel[233] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 236
		bodyModel[234] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 237
		bodyModel[235] = new ModelRendererTurbo(this, 969, 161, textureX, textureY); // Box 238
		bodyModel[236] = new ModelRendererTurbo(this, 673, 169, textureX, textureY); // Box 239
		bodyModel[237] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 240
		bodyModel[238] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 241
		bodyModel[239] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 242
		bodyModel[240] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 243
		bodyModel[241] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 244
		bodyModel[242] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 245
		bodyModel[243] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 246
		bodyModel[244] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 247
		bodyModel[245] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 248
		bodyModel[246] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 249
		bodyModel[247] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 250
		bodyModel[248] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 251
		bodyModel[249] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 252
		bodyModel[250] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 253
		bodyModel[251] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 254
		bodyModel[252] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 255
		bodyModel[253] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Box 256
		bodyModel[254] = new ModelRendererTurbo(this, 625, 209, textureX, textureY); // Box 257
		bodyModel[255] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 258
		bodyModel[256] = new ModelRendererTurbo(this, 745, 209, textureX, textureY); // Box 259
		bodyModel[257] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 260
		bodyModel[258] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 261
		bodyModel[259] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 262
		bodyModel[260] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 263
		bodyModel[261] = new ModelRendererTurbo(this, 625, 217, textureX, textureY); // Box 264
		bodyModel[262] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Box 265
		bodyModel[263] = new ModelRendererTurbo(this, 745, 217, textureX, textureY); // Box 266
		bodyModel[264] = new ModelRendererTurbo(this, 777, 217, textureX, textureY); // Box 267
		bodyModel[265] = new ModelRendererTurbo(this, 745, 225, textureX, textureY); // Box 268
		bodyModel[266] = new ModelRendererTurbo(this, 777, 225, textureX, textureY); // Box 269
		bodyModel[267] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Box 270
		bodyModel[268] = new ModelRendererTurbo(this, 817, 225, textureX, textureY); // Box 271
		bodyModel[269] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Box 272
		bodyModel[270] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 273
		bodyModel[271] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 274
		bodyModel[272] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 275
		bodyModel[273] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 276
		bodyModel[274] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 277
		bodyModel[275] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 278
		bodyModel[276] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 279
		bodyModel[277] = new ModelRendererTurbo(this, 1009, 153, textureX, textureY); // Box 280
		bodyModel[278] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 281
		bodyModel[279] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 282
		bodyModel[280] = new ModelRendererTurbo(this, 1001, 217, textureX, textureY); // Box 283
		bodyModel[281] = new ModelRendererTurbo(this, 881, 225, textureX, textureY); // Box 284
		bodyModel[282] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 285
		bodyModel[283] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 286
		bodyModel[284] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 287
		bodyModel[285] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 288
		bodyModel[286] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 289
		bodyModel[287] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 290
		bodyModel[288] = new ModelRendererTurbo(this, 929, 225, textureX, textureY); // Box 291
		bodyModel[289] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 292
		bodyModel[290] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 293
		bodyModel[291] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 294
		bodyModel[292] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 295
		bodyModel[293] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 296
		bodyModel[294] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Box 297
		bodyModel[295] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 298
		bodyModel[296] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 299
		bodyModel[297] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 300
		bodyModel[298] = new ModelRendererTurbo(this, 985, 225, textureX, textureY); // Box 301
		bodyModel[299] = new ModelRendererTurbo(this, 537, 233, textureX, textureY); // Box 302
		bodyModel[300] = new ModelRendererTurbo(this, 585, 233, textureX, textureY); // Box 303
		bodyModel[301] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 304
		bodyModel[302] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 305
		bodyModel[303] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 306
		bodyModel[304] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 307
		bodyModel[305] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 308
		bodyModel[306] = new ModelRendererTurbo(this, 625, 233, textureX, textureY); // Box 309
		bodyModel[307] = new ModelRendererTurbo(this, 929, 233, textureX, textureY); // Box 310
		bodyModel[308] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 311
		bodyModel[309] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 312
		bodyModel[310] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Box 313
		bodyModel[311] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 314
		bodyModel[312] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 315
		bodyModel[313] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 316
		bodyModel[314] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 317
		bodyModel[315] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Box 318
		bodyModel[316] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 319
		bodyModel[317] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 320
		bodyModel[318] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 321
		bodyModel[319] = new ModelRendererTurbo(this, 553, 233, textureX, textureY); // Box 322
		bodyModel[320] = new ModelRendererTurbo(this, 113, 305, textureX, textureY); // Box 323
		bodyModel[321] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 324
		bodyModel[322] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 325
		bodyModel[323] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 326
		bodyModel[324] = new ModelRendererTurbo(this, 433, 313, textureX, textureY); // Box 327
		bodyModel[325] = new ModelRendererTurbo(this, 537, 169, textureX, textureY); // Box 328
		bodyModel[326] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Box 329
		bodyModel[327] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 330
		bodyModel[328] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 331
		bodyModel[329] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 332
		bodyModel[330] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 333
		bodyModel[331] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 334
		bodyModel[332] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 335
		bodyModel[333] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 336
		bodyModel[334] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Box 337
		bodyModel[335] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 338
		bodyModel[336] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 339
		bodyModel[337] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 340
		bodyModel[338] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 341
		bodyModel[339] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 342
		bodyModel[340] = new ModelRendererTurbo(this, 417, 241, textureX, textureY); // Box 352
		bodyModel[341] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 355
		bodyModel[342] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 356
		bodyModel[343] = new ModelRendererTurbo(this, 881, 241, textureX, textureY); // Box 357
		bodyModel[344] = new ModelRendererTurbo(this, 929, 241, textureX, textureY); // Box 358
		bodyModel[345] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 359
		bodyModel[346] = new ModelRendererTurbo(this, 145, 249, textureX, textureY); // Box 361
		bodyModel[347] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Box 362
		bodyModel[348] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 363
		bodyModel[349] = new ModelRendererTurbo(this, 537, 249, textureX, textureY); // Box 372
		bodyModel[350] = new ModelRendererTurbo(this, 585, 249, textureX, textureY); // Box 373
		bodyModel[351] = new ModelRendererTurbo(this, 625, 249, textureX, textureY); // Box 374
		bodyModel[352] = new ModelRendererTurbo(this, 809, 249, textureX, textureY); // Box 375
		bodyModel[353] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 376
		bodyModel[354] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Box 377
		bodyModel[355] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 378
		bodyModel[356] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Box 379
		bodyModel[357] = new ModelRendererTurbo(this, 553, 249, textureX, textureY); // Box 380
		bodyModel[358] = new ModelRendererTurbo(this, 825, 249, textureX, textureY); // Box 381
		bodyModel[359] = new ModelRendererTurbo(this, 49, 257, textureX, textureY); // Box 382
		bodyModel[360] = new ModelRendererTurbo(this, 881, 249, textureX, textureY); // Box 383
		bodyModel[361] = new ModelRendererTurbo(this, 929, 249, textureX, textureY); // Box 384
		bodyModel[362] = new ModelRendererTurbo(this, 985, 257, textureX, textureY); // Box 385
		bodyModel[363] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Box 386
		bodyModel[364] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 387
		bodyModel[365] = new ModelRendererTurbo(this, 625, 257, textureX, textureY); // Box 388
		bodyModel[366] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 389
		bodyModel[367] = new ModelRendererTurbo(this, 105, 273, textureX, textureY); // Box 390
		bodyModel[368] = new ModelRendererTurbo(this, 145, 273, textureX, textureY); // Box 391
		bodyModel[369] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Box 392
		bodyModel[370] = new ModelRendererTurbo(this, 217, 273, textureX, textureY); // Box 393
		bodyModel[371] = new ModelRendererTurbo(this, 433, 273, textureX, textureY); // Box 394
		bodyModel[372] = new ModelRendererTurbo(this, 913, 281, textureX, textureY); // Box 395
		bodyModel[373] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 396
		bodyModel[374] = new ModelRendererTurbo(this, 513, 273, textureX, textureY); // Box 397
		bodyModel[375] = new ModelRendererTurbo(this, 833, 273, textureX, textureY); // Box 398
		bodyModel[376] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Box 399
		bodyModel[377] = new ModelRendererTurbo(this, 985, 281, textureX, textureY); // Box 400
		bodyModel[378] = new ModelRendererTurbo(this, 721, 273, textureX, textureY); // Box 401
		bodyModel[379] = new ModelRendererTurbo(this, 41, 289, textureX, textureY); // Box 402
		bodyModel[380] = new ModelRendererTurbo(this, 249, 313, textureX, textureY); // Box 403
		bodyModel[381] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 404
		bodyModel[382] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Box 405
		bodyModel[383] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 406
		bodyModel[384] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 407
		bodyModel[385] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Box 408
		bodyModel[386] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 409
		bodyModel[387] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Box 410
		bodyModel[388] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box 411
		bodyModel[389] = new ModelRendererTurbo(this, 513, 313, textureX, textureY); // Box 412
		bodyModel[390] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Box 413
		bodyModel[391] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Box 414
		bodyModel[392] = new ModelRendererTurbo(this, 481, 281, textureX, textureY); // Box 415
		bodyModel[393] = new ModelRendererTurbo(this, 1001, 281, textureX, textureY); // Box 416
		bodyModel[394] = new ModelRendererTurbo(this, 185, 297, textureX, textureY); // Box 417
		bodyModel[395] = new ModelRendererTurbo(this, 833, 225, textureX, textureY); // Box 418
		bodyModel[396] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Box 419
		bodyModel[397] = new ModelRendererTurbo(this, 809, 257, textureX, textureY); // Box 420
		bodyModel[398] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 421
		bodyModel[399] = new ModelRendererTurbo(this, 601, 305, textureX, textureY); // Box 422
		bodyModel[400] = new ModelRendererTurbo(this, 833, 289, textureX, textureY); // Box 423
		bodyModel[401] = new ModelRendererTurbo(this, 937, 289, textureX, textureY); // Box 424
		bodyModel[402] = new ModelRendererTurbo(this, 1001, 305, textureX, textureY); // Box 425
		bodyModel[403] = new ModelRendererTurbo(this, 369, 313, textureX, textureY); // Box 426
		bodyModel[404] = new ModelRendererTurbo(this, 545, 313, textureX, textureY); // Box 427
		bodyModel[405] = new ModelRendererTurbo(this, 569, 313, textureX, textureY); // Box 428
		bodyModel[406] = new ModelRendererTurbo(this, 833, 313, textureX, textureY); // Box 429
		bodyModel[407] = new ModelRendererTurbo(this, 857, 313, textureX, textureY); // Box 430
		bodyModel[408] = new ModelRendererTurbo(this, 881, 313, textureX, textureY); // Box 431
		bodyModel[409] = new ModelRendererTurbo(this, 905, 313, textureX, textureY); // Box 432
		bodyModel[410] = new ModelRendererTurbo(this, 929, 313, textureX, textureY); // Box 433
		bodyModel[411] = new ModelRendererTurbo(this, 953, 313, textureX, textureY); // Box 434
		bodyModel[412] = new ModelRendererTurbo(this, 977, 313, textureX, textureY); // Box 435
		bodyModel[413] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 436
		bodyModel[414] = new ModelRendererTurbo(this, 25, 321, textureX, textureY); // Box 437
		bodyModel[415] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 438
		bodyModel[416] = new ModelRendererTurbo(this, 73, 321, textureX, textureY); // Box 439
		bodyModel[417] = new ModelRendererTurbo(this, 97, 321, textureX, textureY); // Box 440
		bodyModel[418] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 441
		bodyModel[419] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 442
		bodyModel[420] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 443
		bodyModel[421] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 444
		bodyModel[422] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 445
		bodyModel[423] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 446
		bodyModel[424] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 447
		bodyModel[425] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 448
		bodyModel[426] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 449
		bodyModel[427] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 450
		bodyModel[428] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 451
		bodyModel[429] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 452
		bodyModel[430] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 453
		bodyModel[431] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 454
		bodyModel[432] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 455
		bodyModel[433] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 456
		bodyModel[434] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 457
		bodyModel[435] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 458
		bodyModel[436] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 459
		bodyModel[437] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Box 460
		bodyModel[438] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Box 461
		bodyModel[439] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 462
		bodyModel[440] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 463
		bodyModel[441] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 464
		bodyModel[442] = new ModelRendererTurbo(this, 809, 137, textureX, textureY); // Box 465
		bodyModel[443] = new ModelRendererTurbo(this, 841, 137, textureX, textureY); // Box 466
		bodyModel[444] = new ModelRendererTurbo(this, 1017, 137, textureX, textureY); // Box 467
		bodyModel[445] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 468
		bodyModel[446] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 469
		bodyModel[447] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 470
		bodyModel[448] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 471
		bodyModel[449] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Box 472
		bodyModel[450] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 473
		bodyModel[451] = new ModelRendererTurbo(this, 513, 137, textureX, textureY); // Box 474
		bodyModel[452] = new ModelRendererTurbo(this, 537, 137, textureX, textureY); // Box 475
		bodyModel[453] = new ModelRendererTurbo(this, 897, 161, textureX, textureY); // Box 476
		bodyModel[454] = new ModelRendererTurbo(this, 1017, 161, textureX, textureY); // Box 477
		bodyModel[455] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 478
		bodyModel[456] = new ModelRendererTurbo(this, 937, 169, textureX, textureY); // Box 479
		bodyModel[457] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 480
		bodyModel[458] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Box 481
		bodyModel[459] = new ModelRendererTurbo(this, 1009, 153, textureX, textureY); // Box 482
		bodyModel[460] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Box 678
		bodyModel[461] = new ModelRendererTurbo(this, 649, 193, textureX, textureY); // Box 680
		bodyModel[462] = new ModelRendererTurbo(this, 1001, 233, textureX, textureY); // Box 685
		bodyModel[463] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 689
		bodyModel[464] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Box 690
		bodyModel[465] = new ModelRendererTurbo(this, 537, 161, textureX, textureY); // Box 691
		bodyModel[466] = new ModelRendererTurbo(this, 865, 313, textureX, textureY); // Box 504
		bodyModel[467] = new ModelRendererTurbo(this, 505, 329, textureX, textureY); // Box 505
		bodyModel[468] = new ModelRendererTurbo(this, 921, 265, textureX, textureY); // Box 506
		bodyModel[469] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Box 507
		bodyModel[470] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 508
		bodyModel[471] = new ModelRendererTurbo(this, 945, 169, textureX, textureY); // Box 509
		bodyModel[472] = new ModelRendererTurbo(this, 969, 169, textureX, textureY); // Box 510
		bodyModel[473] = new ModelRendererTurbo(this, 913, 313, textureX, textureY); // Box 511
		bodyModel[474] = new ModelRendererTurbo(this, 833, 329, textureX, textureY); // Box 512
		bodyModel[475] = new ModelRendererTurbo(this, 985, 297, textureX, textureY); // Box 513
		bodyModel[476] = new ModelRendererTurbo(this, 161, 321, textureX, textureY); // Box 514
		bodyModel[477] = new ModelRendererTurbo(this, 529, 273, textureX, textureY); // Box 515
		bodyModel[478] = new ModelRendererTurbo(this, 529, 177, textureX, textureY); // Box 516
		bodyModel[479] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 517
		bodyModel[480] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 518
		bodyModel[481] = new ModelRendererTurbo(this, 985, 321, textureX, textureY); // Box 519
		bodyModel[482] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 656
		bodyModel[483] = new ModelRendererTurbo(this, 177, 337, textureX, textureY); // Box 657
		bodyModel[484] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 488
		bodyModel[485] = new ModelRendererTurbo(this, 417, 241, textureX, textureY); // Box 489
		bodyModel[486] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 490
		bodyModel[487] = new ModelRendererTurbo(this, 881, 241, textureX, textureY); // Box 491
		bodyModel[488] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 495
		bodyModel[489] = new ModelRendererTurbo(this, 417, 241, textureX, textureY); // Box 496
		bodyModel[490] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 497
		bodyModel[491] = new ModelRendererTurbo(this, 881, 241, textureX, textureY); // Box 498

		bodyModel[0].addShapeBox(0F, 0F, 0F, 74, 10, 56, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-24F, 0F, -28F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 74, 10, 50, 0F,0F, 0F, 0F, 0F, 0.5F, -9F, 0F, 0.5F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(50.01F, 0F, -25F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 46, 10, 32, 0F,0F, 0.5F, 0F, 0F, 3F, -9F, 0F, 3F, -9F, 0F, 0.5F, 0F, 0F, 0F, -6F, 0F, -7F, -12.5F, 0F, -7F, -12.5F, 0F, 0F, -6F); // Box 3
		bodyModel[2].setRotationPoint(123.99F, 0.01F, -16F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 22, 3, 14, 0F,0F, 3F, 0F, -0.5F, 4.5F, -6F, -0.5F, 4.5F, -6F, 0F, 3F, 0F, 0F, 0F, -3.5F, -8F, 1F, -6.5F, -8F, 1F, -6.5F, 0F, 0F, -3.5F); // Box 4
		bodyModel[3].setRotationPoint(170F, 0.01F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 46, 10, 20, 0F,0F, -10F, 0F, 0F, -3.02F, -6.5F, 0F, -3.02F, -6.5F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(123.99F, -0.01F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 14, 7, 7, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -3.2F, -1.5F, 0F, -3.2F, 0F, 0F, -2F); // Box 6
		bodyModel[5].setRotationPoint(170F, 3F, -3.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 61, 10, 56, 0F,0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 7
		bodyModel[6].setRotationPoint(-85.01F, 0F, -28F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 53, 10, 49, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.8F); // Box 8
		bodyModel[7].setRotationPoint(-138F, 0F, -24.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 38, 10, 39, 0F,0F, 0.5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -7F, 0F, -1.5F, -9F, 0F, 0F, -1.81F, 0F, 0F, -1.81F, 0F, -1.5F, -9F); // Box 9
		bodyModel[8].setRotationPoint(-176.01F, 0F, -19.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 30, 10, 39, 0F,0F, 1.5F, -15F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 1.5F, -15F, 0F, -3F, -17F, 0F, -1.5F, -9F, 0F, -1.5F, -9F, 0F, -3F, -17F); // Box 10
		bodyModel[9].setRotationPoint(-205.99F, 0F, -19.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 53, 5, 49, 0F,0F, 0F, -6.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.8F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -9F); // Box 10
		bodyModel[10].setRotationPoint(-138F, 10.01F, -24.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 61, 5, 56, 0F,0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -5.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5.5F); // Box 11
		bodyModel[11].setRotationPoint(-85.01F, 10.01F, -28F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 74, 5, 56, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F); // Box 12
		bodyModel[12].setRotationPoint(-24F, 10.01F, -28F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 38, 5, 36, 0F,0F, 1.5F, -7.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1.5F, -7.5F, 0F, 0F, -15F, 0F, 0F, -2.51F, 0F, 0F, -2.51F, 0F, 0F, -15F); // Box 13
		bodyModel[13].setRotationPoint(-176.01F, 10.01F, -18F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 30, 5, 36, 0F,0F, 1.5F, -15.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 1.5F, -15.5F, -7F, -2.5F, -15.51F, 0F, 1.5F, -15.01F, 0F, 1.5F, -15.01F, -7F, -2.5F, -15.51F); // Box 14
		bodyModel[14].setRotationPoint(-205.99F, 8.51F, -18F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 74, 5, 50, 0F,0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -1F); // Box 15
		bodyModel[15].setRotationPoint(50.01F, 10.01F, -25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 46, 5, 32, 0F,0F, -1.01F, -6F, 0F, -1F, -14.51F, 0F, -1F, -14.51F, 0F, -1.01F, -6F, 0F, 1F, -7.01F, 0F, 1F, -13.5F, 0F, 1F, -13.5F, 0F, 1F, -7.01F); // Box 16
		bodyModel[16].setRotationPoint(123.99F, 9.02F, -16F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, 0F, -2F, -1.5F, 0F, -3.2F, -1.5F, 0F, -3.2F, 0F, 0F, -2F, 0F, 0F, -1.01F, -2.5F, 0F, -3F, -2.5F, 0F, -3F, 0F, 0F, -1.01F); // Box 17
		bodyModel[17].setRotationPoint(170F, 10F, -3.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 53, 9, 45, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -3F, -17F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -3F, -17F); // Box 18
		bodyModel[18].setRotationPoint(-138F, 15F, -22.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 61, 8, 52, 0F,0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -15.5F, 0F, 1F, -13F, 0F, 1F, -13F, 0F, 0F, -15.5F); // Box 19
		bodyModel[19].setRotationPoint(-85.01F, 15F, -26F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 74, 9, 54, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -14F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -14F); // Box 20
		bodyModel[20].setRotationPoint(-24F, 15F, -27F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 74, 9, 48, 0F,0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -12F); // Box 21
		bodyModel[21].setRotationPoint(50.01F, 15F, -24F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 46, 9, 32, 0F,0F, -1.01F, -7.01F, 0F, -1F, -13.5F, 0F, -1F, -13.5F, 0F, -1.01F, -7.01F, 0F, 1F, -10.01F, 0F, 1F, -13.5F, 0F, 1F, -13.5F, 0F, 1F, -10.01F); // Box 22
		bodyModel[22].setRotationPoint(123.99F, 14.01F, -16F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, 0F, -1.01F, -2.5F, 0F, -3F, -2.5F, 0F, -3F, 0F, 0F, -1.01F, 0F, 0F, -1F, -3.2F, 0F, -2.5F, -3.2F, 0F, -2.5F, 0F, 0F, -1F); // Box 23
		bodyModel[23].setRotationPoint(170F, 15.01F, -3.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 14, 4, 7, 0F,0F, 0F, -1F, -3.2F, 0F, -2.5F, -3.2F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1.01F, -4F, -0.5F, -3F, -4F, -0.5F, -3F, 0F, 0F, -1.01F); // Box 24
		bodyModel[24].setRotationPoint(170F, 20F, -3.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 38, 5, 31, 0F,0F, 1.5F, -12.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -12.5F, 0F, -6.5F, -12.5F, 0F, -0.5F, -10.02F, 0F, -0.5F, -10.02F, 0F, -6.5F, -12.5F); // Box 25
		bodyModel[25].setRotationPoint(-176.01F, 16.5F, -15.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 44, 5, 31, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(-99F, -4.5F, -15.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 5, 31, 0F,0F, 0F, -2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2.5F); // Box 27
		bodyModel[27].setRotationPoint(-104.51F, -4.5F, -15.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 5, 26, 0F,0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F); // Box 28
		bodyModel[28].setRotationPoint(-108.49F, -4.5F, -13F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 5, 37, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-55.01F, -4.5F, -18.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 5, 29, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-51F, -4.5F, -14.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 5, 29, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 31
		bodyModel[31].setRotationPoint(-46.01F, -4.5F, -14.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 5, 41, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 32
		bodyModel[32].setRotationPoint(-41F, -4.5F, -20.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 12, 5, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-38.01F, -4.5F, -20.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 5, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[34].setRotationPoint(-11.01F, -4.5F, -21.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 5, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-22F, -4.5F, -16.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F); // Box 36
		bodyModel[36].setRotationPoint(-101.49F, -8.7F, 0.01F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F); // Box 37
		bodyModel[37].setRotationPoint(-110.51F, -8.7F, 0.01F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F,0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-101.49F, -8.7F, -9.01F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F,-3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(-110.51F, -8.7F, -9.01F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[40].setRotationPoint(-130F, -1.4F, -9.01F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,-3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 41
		bodyModel[41].setRotationPoint(-139.02F, -1.4F, -9.01F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F); // Box 42
		bodyModel[42].setRotationPoint(-139.02F, -1.4F, 0.01F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F); // Box 43
		bodyModel[43].setRotationPoint(-130F, -1.4F, 0.01F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[44].setRotationPoint(103.5F, -2F, -9.01F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,-3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 45
		bodyModel[45].setRotationPoint(94.48F, -2F, -9.01F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F); // Box 46
		bodyModel[46].setRotationPoint(94.48F, -2F, 0.01F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F); // Box 47
		bodyModel[47].setRotationPoint(103.5F, -2F, 0.01F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F); // Box 48
		bodyModel[48].setRotationPoint(67F, -8.5F, 0.01F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F,-3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(67F, -8.5F, -9.01F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F,0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[50].setRotationPoint(76.02F, -8.5F, -9.01F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -0.2F); // Box 51
		bodyModel[51].setRotationPoint(76.02F, -8.5F, 0.01F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[52].setRotationPoint(-25.5F, -3F, -27.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		bodyModel[53].setRotationPoint(-25.5F, -3F, 3.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 54
		bodyModel[54].setRotationPoint(-16.02F, -4.5F, -21.51F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -5F, -0.8F, 0F); // Box 55
		bodyModel[55].setRotationPoint(-16.02F, -4.5F, 16.51F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 5, 43, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 56
		bodyModel[56].setRotationPoint(-3F, -4.5F, -21.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 5, 31, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 57
		bodyModel[57].setRotationPoint(-0.01F, -4.5F, -15.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 5, 31, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 58
		bodyModel[58].setRotationPoint(6F, -4.5F, -15.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 5, 31, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 59
		bodyModel[59].setRotationPoint(11F, -4.5F, -15.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 5, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(14.01F, -4.5F, -19.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 5, 39, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 61
		bodyModel[61].setRotationPoint(24F, -4.5F, -19.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 5, 35, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 62
		bodyModel[62].setRotationPoint(28F, -4.5F, -17.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 8, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 63
		bodyModel[63].setRotationPoint(33.01F, -7F, -9.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 8, 19, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 64
		bodyModel[64].setRotationPoint(38F, -7F, -9.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 8, 19, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 65
		bodyModel[65].setRotationPoint(43F, -7F, -9.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 66
		bodyModel[66].setRotationPoint(31.02F, -7F, -12.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 5, 26, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 67
		bodyModel[67].setRotationPoint(-84.5F, -9F, -13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[68].setRotationPoint(-81.51F, -9F, -13F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 69
		bodyModel[69].setRotationPoint(-65.5F, -9F, -13F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 11, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[70].setRotationPoint(-59.51F, -9F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 14, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[71].setRotationPoint(-48.5F, -9F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 72
		bodyModel[72].setRotationPoint(-34.51F, -9F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 17, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.8F, 0F, 0F, -4.8F, 0F, 0F, -4.8F, 0F, 0F, -4.8F, 0F); // Box 73
		bodyModel[73].setRotationPoint(-65.52F, -9.01F, -13F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 45, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[74].setRotationPoint(-41.5F, -52F, -0.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[75].setRotationPoint(-43F, -43.5F, -1.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 76
		bodyModel[76].setRotationPoint(-41.5F, -68F, -0.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 77
		bodyModel[77].setRotationPoint(-41.5F, -72F, -0.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 78
		bodyModel[78].setRotationPoint(-41.5F, -69.8F, -2.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F); // Box 79
		bodyModel[79].setRotationPoint(-41.5F, -65.3F, -4.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F); // Box 80
		bodyModel[80].setRotationPoint(-41.5F, -55.3F, -4.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 25, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[81].setRotationPoint(-78F, -14F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 14, 0F,0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F); // Box 83
		bodyModel[82].setRotationPoint(-79.01F, -14F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[83].setRotationPoint(-53.5F, -16F, -8.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 14, 2, 17, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[84].setRotationPoint(-48.5F, -11F, -8.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[85].setRotationPoint(-73.5F, -17.5F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 87
		bodyModel[86].setRotationPoint(-69.51F, -17.5F, -3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 88
		bodyModel[87].setRotationPoint(-66.5F, -17.5F, -3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[88].setRotationPoint(-70.51F, -21.5F, -3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[89].setRotationPoint(-69.6F, -19.5F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 91
		bodyModel[90].setRotationPoint(-67.7F, -21F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,-0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F); // Box 92
		bodyModel[91].setRotationPoint(-67.7F, -21F, -7.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F); // Box 94
		bodyModel[92].setRotationPoint(-67.7F, -21F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F); // Box 95
		bodyModel[93].setRotationPoint(-67.7F, -21F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[94].setRotationPoint(-71.51F, -21F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 97
		bodyModel[95].setRotationPoint(-72.1F, -21.5F, -3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[96].setRotationPoint(-67.51F, -24F, -0.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 99
		bodyModel[97].setRotationPoint(-67.51F, -33F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 100
		bodyModel[98].setRotationPoint(-67.51F, -31.7F, -3.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,-0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F); // Box 101
		bodyModel[99].setRotationPoint(-47.5F, -54.3F, -7.5F);

		bodyModel[100].addShapeBox(-0.5F, 0F, 0F, 1, 7, 1, 0F,-0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 102
		bodyModel[100].setRotationPoint(-47F, -53.8F, -0.5F);
		bodyModel[100].rotateAngleZ = 0.9424778F;

		bodyModel[101].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 31, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 103
		bodyModel[101].setRotationPoint(-47F, -53.8F, -6F);
		bodyModel[101].rotateAngleX = 0.10821041F;
		bodyModel[101].rotateAngleZ = -0.72431164F;

		bodyModel[102].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 31, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 104
		bodyModel[102].setRotationPoint(-47F, -53.8F, 6F);
		bodyModel[102].rotateAngleX = -0.10821041F;
		bodyModel[102].rotateAngleZ = -0.72431164F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.5F); // Box 105
		bodyModel[103].setRotationPoint(-51F, -21.2F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[104].setRotationPoint(-51F, -21.2F, -3.01F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,-1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 107
		bodyModel[105].setRotationPoint(-54.01F, -21.2F, -3.01F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1F); // Box 108
		bodyModel[106].setRotationPoint(-54.01F, -21.2F, 0.00999999999999979F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[107].setRotationPoint(-50.99F, -23.2F, -3.01F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F); // Box 113
		bodyModel[108].setRotationPoint(-50.99F, -23.2F, 0.00999999999999979F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F); // Box 114
		bodyModel[109].setRotationPoint(-53.99F, -23.2F, 0.00999999999999979F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[110].setRotationPoint(-53.99F, -23.2F, -3.01F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[111].setRotationPoint(-85.99F, -15.2F, -3.01F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[112].setRotationPoint(-82.99F, -15.2F, -3.01F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F); // Box 118
		bodyModel[113].setRotationPoint(-82.99F, -15.2F, 0.00999999999999979F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.8F); // Box 119
		bodyModel[114].setRotationPoint(-85.99F, -15.2F, 0.00999999999999979F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,-1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 120
		bodyModel[115].setRotationPoint(-86.01F, -13.2F, -3.01F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[116].setRotationPoint(-83F, -13.2F, -3.01F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.5F); // Box 122
		bodyModel[117].setRotationPoint(-83F, -13.2F, 0F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1F); // Box 123
		bodyModel[118].setRotationPoint(-86.01F, -13.2F, 0.00999999999999979F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[119].setRotationPoint(29F, -26F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 125
		bodyModel[120].setRotationPoint(29.81F, -25.5F, -3F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,-0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F); // Box 126
		bodyModel[121].setRotationPoint(29.81F, -25.5F, -7.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F); // Box 127
		bodyModel[122].setRotationPoint(29.81F, -25.5F, -8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F); // Box 128
		bodyModel[123].setRotationPoint(29.81F, -25.5F, 7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[124].setRotationPoint(30F, -25.5F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 130
		bodyModel[125].setRotationPoint(35F, -26F, -3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[126].setRotationPoint(29.91F, -24F, -2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 14, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, -2F, 13F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[127].setRotationPoint(-17.5F, -16.5F, -4.01F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 14, 5, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[128].setRotationPoint(-17.5F, -21.5F, -4.01F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 13, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[129].setRotationPoint(-17.5F, -29.5F, -4.01F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 25, 8, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 135
		bodyModel[130].setRotationPoint(-19.51F, -29.5F, -4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 14, 12, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 12F, 0F, -2F, 0F, 0F, 0F); // Box 136
		bodyModel[131].setRotationPoint(-17.5F, -16.5F, 0.00999999999999979F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 14, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[132].setRotationPoint(-17.5F, -21.5F, 0.00999999999999979F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 13, 8, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[133].setRotationPoint(-17.5F, -29.5F, 0.00999999999999979F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, -1.8F, -0.25F, 0F, 0F, -0.25F, 1F, 0.2F, -0.25F, 1F, -2.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F); // Box 139
		bodyModel[134].setRotationPoint(-17.5F, -32.5F, -2.76F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,1F, -2.2F, -0.25F, 1F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, -1.8F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 141
		bodyModel[135].setRotationPoint(-17.5F, -32.5F, -0.24F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 13, 6, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[136].setRotationPoint(31.01F, -12.5F, -12.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 23, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[137].setRotationPoint(8F, -12.5F, -12.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 6, 13, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[138].setRotationPoint(44F, -12.5F, -12.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 2, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[139].setRotationPoint(47F, -14.5F, -12.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 8, 10, 25, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 147
		bodyModel[140].setRotationPoint(50.01F, -14.5F, -12.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 24, 5, 25, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 148
		bodyModel[141].setRotationPoint(50.01F, -4.51F, -12.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 149
		bodyModel[142].setRotationPoint(74F, -4.51F, -11.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 13, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 150
		bodyModel[143].setRotationPoint(28.01F, -16.3F, -10.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 9, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[144].setRotationPoint(19F, -16.3F, -10.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 10, 6, 15, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 152
		bodyModel[145].setRotationPoint(9F, -16.3F, -7.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[146].setRotationPoint(41F, -16.3F, -9.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 6, 19, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 154
		bodyModel[147].setRotationPoint(44.01F, -16.3F, -9.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 8, 6, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 155
		bodyModel[148].setRotationPoint(29.01F, -21.3F, -4.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 6, 9, 0F,0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 156
		bodyModel[149].setRotationPoint(37F, -21.3F, -4.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 6, 9, 0F,0.5F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, -0.5F); // Box 157
		bodyModel[150].setRotationPoint(40F, -21.3F, -4.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 16, 4, 13, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 158
		bodyModel[151].setRotationPoint(9F, -20.3F, -6.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 159
		bodyModel[152].setRotationPoint(25.01F, -20.3F, -6.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[153].setRotationPoint(11F, -35.3F, -4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 161
		bodyModel[154].setRotationPoint(16.01F, -35.3F, -4F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 15, 8, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 162
		bodyModel[155].setRotationPoint(9.01F, -35.3F, -4F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 8, 5, 10, 0F,0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, 0F); // Box 163
		bodyModel[156].setRotationPoint(11F, -40.3F, -5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 164
		bodyModel[157].setRotationPoint(10F, -40.3F, -5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 165
		bodyModel[158].setRotationPoint(11.2F, -44.2F, -3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,-0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F, -0.7F, -0.7F, 0.8F); // Box 166
		bodyModel[159].setRotationPoint(11.2F, -44.2F, -7.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F); // Box 167
		bodyModel[160].setRotationPoint(11.2F, -44.2F, 7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, 0.8F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F, -0.6F); // Box 168
		bodyModel[161].setRotationPoint(11.2F, -44.2F, -8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[162].setRotationPoint(10.39F, -44.7F, -3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 170
		bodyModel[163].setRotationPoint(16.39F, -44.7F, -3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[164].setRotationPoint(11.3F, -42.7F, -2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[165].setRotationPoint(11.39F, -44.2F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 167
		bodyModel[166].setRotationPoint(45.5F, -12.5F, 12.51F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, -1.2F, 0F, -0.1F, -1.2F, 0F); // Box 168
		bodyModel[167].setRotationPoint(45.5F, -12.5F, 12.51F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 169
		bodyModel[168].setRotationPoint(45.5F, -12.5F, -21.51F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, 0F, -0.1F, -1.2F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F); // Box 170
		bodyModel[169].setRotationPoint(45.5F, -12.5F, -14.51F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[170].setRotationPoint(15.01F, -28.5F, -5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[171].setRotationPoint(8.01F, -30.7F, -3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[172].setRotationPoint(8.01F, -38.5F, -1.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 6, 1, 16, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[173].setRotationPoint(8F, -36.3F, -8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, -0.8F, -3F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 175
		bodyModel[174].setRotationPoint(5.01F, -36.3F, -8F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,0F, -0.8F, 0F, 0F, -0.8F, -5F, 0F, -0.8F, -5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 176
		bodyModel[175].setRotationPoint(14.01F, -36.3F, -8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.8F, 0F, 0F, -0.8F, -2F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 178
		bodyModel[176].setRotationPoint(19F, -36.3F, -3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 8, 1, 14, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 179
		bodyModel[177].setRotationPoint(15.01F, -31.5F, -7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 180
		bodyModel[178].setRotationPoint(15.01F, -31.5F, -10.01F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 181
		bodyModel[179].setRotationPoint(15.01F, -31.5F, 7.01F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 182
		bodyModel[180].setRotationPoint(23F, -31.5F, -3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, 0F); // Box 183
		bodyModel[181].setRotationPoint(25.01F, -31.5F, -3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[182].setRotationPoint(7F, -25.7F, -6.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, -0.8F, 0F, 0F, -0.8F, -2F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 185
		bodyModel[183].setRotationPoint(13.01F, -25.7F, -6.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 186
		bodyModel[184].setRotationPoint(5.01F, -25.7F, -6.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[185].setRotationPoint(3F, -25.7F, -1.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.8F, -0.7F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F); // Box 188
		bodyModel[186].setRotationPoint(2.01F, -25.7F, -1.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 189
		bodyModel[187].setRotationPoint(-2.99F, -25.7F, -1.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.8F, -0.7F, 0F, -0.8F, -2F, 0F, -0.8F, -2F, 0F, -0.8F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.7F); // Box 190
		bodyModel[188].setRotationPoint(-5F, -25.7F, -3.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[189].setRotationPoint(13F, -25.5F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, -0.8F, 0F, -0.5F, -0.8F, -6F, -0.5F, -0.8F, -6F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, 0F, 0F, 0F); // Box 192
		bodyModel[190].setRotationPoint(17.01F, -25.5F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F); // Box 193
		bodyModel[191].setRotationPoint(15F, -17F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F); // Box 194
		bodyModel[192].setRotationPoint(13.01F, -17F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[193].setRotationPoint(13.01F, -17F, -13.01F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[194].setRotationPoint(15F, -17F, -13.01F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Box 197
		bodyModel[195].setRotationPoint(12F, -19.01F, -14.01F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1.6F, 0F, -1.6F, -1.6F, 0F, -1.6F, -1.6F, 0F, -1.6F, -1.6F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[196].setRotationPoint(12F, -21.02F, -14.01F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[197].setRotationPoint(15F, -17F, 9F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[198].setRotationPoint(13.01F, -17F, 9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F); // Box 201
		bodyModel[199].setRotationPoint(13.01F, -17F, 11.01F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, 0F); // Box 202
		bodyModel[200].setRotationPoint(15F, -17F, 11.01F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Box 203
		bodyModel[201].setRotationPoint(12F, -19.01F, 8.01F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1.6F, 0F, -1.6F, -1.6F, 0F, -1.6F, -1.6F, 0F, -1.6F, -1.6F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[202].setRotationPoint(12F, -21.02F, 8.01F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 205
		bodyModel[203].setRotationPoint(-15F, -20.5F, -9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, -0.4F, 1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F); // Box 206
		bodyModel[204].setRotationPoint(-17.01F, -20.5F, -9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,0F, -0.4F, -1F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, -1F); // Box 207
		bodyModel[205].setRotationPoint(-22F, -20.5F, -9F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 0F); // Box 208
		bodyModel[206].setRotationPoint(-23.01F, -20.5F, -7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 0F); // Box 209
		bodyModel[207].setRotationPoint(-23.01F, -20.5F, 5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 210
		bodyModel[208].setRotationPoint(13.3F, -48.7F, -0.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 211
		bodyModel[209].setRotationPoint(2.25F, -47.3F, -0.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 212
		bodyModel[210].setRotationPoint(2.25F, -52.1F, -2.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 213
		bodyModel[211].setRotationPoint(2.25F, -55.3F, -0.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 214
		bodyModel[212].setRotationPoint(2.25F, -48.1F, -4.5F);

		bodyModel[213].addShapeBox(-0.5F, -0.5F, -0.5F, 48, 1, 1, 0F,-0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Box 215
		bodyModel[213].setRotationPoint(-41.1F, -64.8F, -3.6F);
		bodyModel[213].rotateAngleZ = -0.37524579F;

		bodyModel[214].addShapeBox(-0.5F, -0.5F, -0.5F, 48, 1, 1, 0F,-0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Box 216
		bodyModel[214].setRotationPoint(-41.1F, -64.8F, -1.9F);
		bodyModel[214].rotateAngleZ = -0.37524579F;

		bodyModel[215].addShapeBox(-0.5F, -0.5F, -0.5F, 48, 1, 1, 0F,-0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Box 217
		bodyModel[215].setRotationPoint(-41.1F, -64.8F, 2.6F);
		bodyModel[215].rotateAngleZ = -0.37524579F;

		bodyModel[216].addShapeBox(-0.5F, -0.5F, -0.5F, 48, 1, 1, 0F,-0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Box 218
		bodyModel[216].setRotationPoint(-41.1F, -64.8F, 0.9F);
		bodyModel[216].rotateAngleZ = -0.37524579F;

		bodyModel[217].addShapeBox(-0.5F, -0.5F, -0.5F, 50, 1, 1, 0F,-0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Box 219
		bodyModel[217].setRotationPoint(-41.1F, -49.8F, -2.9F);
		bodyModel[217].rotateAngleY = -0.03490659F;
		bodyModel[217].rotateAngleZ = -0.29880037F;

		bodyModel[218].addShapeBox(-0.5F, -0.5F, -0.5F, 50, 1, 1, 0F,-0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F); // Box 220
		bodyModel[218].setRotationPoint(-41.1F, -49.8F, 2.9F);
		bodyModel[218].rotateAngleY = 0.03490659F;
		bodyModel[218].rotateAngleZ = -0.29880037F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 221
		bodyModel[219].setRotationPoint(-41.5F, -50F, -3.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F); // Box 222
		bodyModel[220].setRotationPoint(-41.5F, -50F, 0.5F);

		bodyModel[221].addShapeBox(1F, 0F, 0F, 40, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 223
		bodyModel[221].setRotationPoint(-41.5F, -53F, -0.5F);
		bodyModel[221].rotateAngleY = 0.06981317F;
		bodyModel[221].rotateAngleZ = -0.83775804F;

		bodyModel[222].addShapeBox(1F, 0F, 0F, 40, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 224
		bodyModel[222].setRotationPoint(-41.5F, -53F, -0.5F);
		bodyModel[222].rotateAngleY = -0.06981317F;
		bodyModel[222].rotateAngleZ = -0.83775804F;

		bodyModel[223].addShapeBox(-0.5F, -0.5F, 1F, 1, 8, 1, 0F,-0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F); // Box 225
		bodyModel[223].setRotationPoint(-47F, -53.8F, 2.5F);
		bodyModel[223].rotateAngleY = -0.12217305F;
		bodyModel[223].rotateAngleZ = 0.9424778F;

		bodyModel[224].addShapeBox(-0.5F, -0.5F, -1F, 1, 8, 1, 0F,-0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F, -0.45F); // Box 226
		bodyModel[224].setRotationPoint(-47F, -53.8F, -3.5F);
		bodyModel[224].rotateAngleY = 0.12217305F;
		bodyModel[224].rotateAngleZ = 0.9424778F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 17, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[225].setRotationPoint(-9.01F, -9.5F, -13F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F,0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[226].setRotationPoint(-9.01F, -12.5F, -13F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 17, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[227].setRotationPoint(-9.01F, -9.5F, 1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F,0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[228].setRotationPoint(-9.01F, -12.5F, 1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.2F); // Box 231
		bodyModel[229].setRotationPoint(-3.01F, -14F, -13.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.5F, -1F, 0F, -1.8F, -1F, 0F, -1.8F, 0F, 0.5F, -0.5F); // Box 232
		bodyModel[230].setRotationPoint(2F, -14F, -13.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.5F); // Box 234
		bodyModel[231].setRotationPoint(-8F, -14F, -13.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -1.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, -1F); // Box 235
		bodyModel[232].setRotationPoint(-14.01F, -14F, -13.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 236
		bodyModel[233].setRotationPoint(-3.01F, -16F, -12.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 237
		bodyModel[234].setRotationPoint(-3.01F, -16F, -7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.2F); // Box 238
		bodyModel[235].setRotationPoint(-3.01F, -14F, -8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.5F, -1F, 0F, -1.8F, -1F, 0F, -1.8F, 0F, 0.5F, -0.5F); // Box 239
		bodyModel[236].setRotationPoint(2F, -14F, -8F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.5F); // Box 240
		bodyModel[237].setRotationPoint(-8F, -14F, -8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -1.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, -1F); // Box 241
		bodyModel[238].setRotationPoint(-14.01F, -14F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.2F); // Box 242
		bodyModel[239].setRotationPoint(-3.01F, -14F, 9.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.5F, -1F, 0F, -1.8F, -1F, 0F, -1.8F, 0F, 0.5F, -0.5F); // Box 243
		bodyModel[240].setRotationPoint(2F, -14F, 9.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.5F); // Box 244
		bodyModel[241].setRotationPoint(-8F, -14F, 9.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -1.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, -1F); // Box 245
		bodyModel[242].setRotationPoint(-14.01F, -14F, 9.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 246
		bodyModel[243].setRotationPoint(-3.01F, -16F, 10.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 247
		bodyModel[244].setRotationPoint(-3.01F, -16F, 5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.2F); // Box 248
		bodyModel[245].setRotationPoint(-3.01F, -14F, 4F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.5F, -1F, 0F, -1.8F, -1F, 0F, -1.8F, 0F, 0.5F, -0.5F); // Box 249
		bodyModel[246].setRotationPoint(2F, -14F, 4F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.5F); // Box 250
		bodyModel[247].setRotationPoint(-8F, -14F, 4F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -1.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, -1F); // Box 251
		bodyModel[248].setRotationPoint(-14.01F, -14F, 4F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -1.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, -1F); // Box 252
		bodyModel[249].setRotationPoint(-53.01F, -11.5F, -13.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.5F); // Box 253
		bodyModel[250].setRotationPoint(-47F, -11.5F, -13.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.2F); // Box 254
		bodyModel[251].setRotationPoint(-42.01F, -11.5F, -13.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 255
		bodyModel[252].setRotationPoint(-42.01F, -13.5F, -12.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.5F, -1F, 0F, -1.8F, -1F, 0F, -1.8F, 0F, 0.5F, -0.5F); // Box 256
		bodyModel[253].setRotationPoint(-37F, -11.5F, -13.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -1.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, -1F); // Box 257
		bodyModel[254].setRotationPoint(-47.5F, -13.5F, -8.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.5F); // Box 258
		bodyModel[255].setRotationPoint(-41.49F, -13.5F, -8.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.2F); // Box 259
		bodyModel[256].setRotationPoint(-36.5F, -13.5F, -8.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 260
		bodyModel[257].setRotationPoint(-36.5F, -15.5F, -7.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.5F, -1F, 0F, -1.8F, -1F, 0F, -1.8F, 0F, 0.5F, -0.5F); // Box 261
		bodyModel[258].setRotationPoint(-31.49F, -13.5F, -8.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -1.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, -1F); // Box 262
		bodyModel[259].setRotationPoint(-53.01F, -11.5F, 9.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.5F); // Box 263
		bodyModel[260].setRotationPoint(-47F, -11.5F, 9.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.2F); // Box 264
		bodyModel[261].setRotationPoint(-42.01F, -11.5F, 9.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 265
		bodyModel[262].setRotationPoint(-42.01F, -13.5F, 10.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.5F, -1F, 0F, -1.8F, -1F, 0F, -1.8F, 0F, 0.5F, -0.5F); // Box 266
		bodyModel[263].setRotationPoint(-37F, -11.5F, 9.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -1.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, -1F); // Box 267
		bodyModel[264].setRotationPoint(-47.5F, -13.5F, 4.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.5F); // Box 268
		bodyModel[265].setRotationPoint(-41.49F, -13.5F, 4.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.2F); // Box 269
		bodyModel[266].setRotationPoint(-36.5F, -13.5F, 4.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 270
		bodyModel[267].setRotationPoint(-36.5F, -15.5F, 5.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.5F, -1F, 0F, -1.8F, -1F, 0F, -1.8F, 0F, 0.5F, -0.5F); // Box 271
		bodyModel[268].setRotationPoint(-31.49F, -13.5F, 4.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 272
		bodyModel[269].setRotationPoint(-42.01F, -9F, -13.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 273
		bodyModel[270].setRotationPoint(-39.01F, -9F, -13.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 274
		bodyModel[271].setRotationPoint(-45.01F, -9F, -13.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 275
		bodyModel[272].setRotationPoint(-42.01F, -9F, 8.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 276
		bodyModel[273].setRotationPoint(-39.01F, -9F, 8.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 277
		bodyModel[274].setRotationPoint(-45.01F, -9F, 8.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 278
		bodyModel[275].setRotationPoint(-2.01F, -11.5F, 8.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 279
		bodyModel[276].setRotationPoint(0.99F, -11.5F, 8.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 280
		bodyModel[277].setRotationPoint(-2.01F, -11.5F, -13.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 281
		bodyModel[278].setRotationPoint(0.99F, -11.5F, -13.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[279].setRotationPoint(-26.5F, -6F, -19.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[280].setRotationPoint(-22.5F, -6F, -19.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 284
		bodyModel[281].setRotationPoint(-24.5F, -9.4F, -16.5F);
		bodyModel[281].rotateAngleX = -0.06981317F;

		bodyModel[282].addShapeBox(0F, 0F, -1.5F, 1, 1, 2, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 285
		bodyModel[282].setRotationPoint(-24.5F, -9.4F, -16.5F);
		bodyModel[282].rotateAngleX = -0.06981317F;

		bodyModel[283].addShapeBox(0F, 0F, -2F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 286
		bodyModel[283].setRotationPoint(-24.5F, -9.4F, -16.5F);
		bodyModel[283].rotateAngleX = -0.06981317F;

		bodyModel[284].addShapeBox(-0.5F, -0.5F, -2F, 1, 3, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 287
		bodyModel[284].setRotationPoint(-24F, -8.9F, -16.5F);
		bodyModel[284].rotateAngleX = -0.06981317F;

		bodyModel[285].addShapeBox(-0.5F, -0.5F, -2F, 1, 3, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 288
		bodyModel[285].setRotationPoint(-24F, -8.9F, -16.5F);
		bodyModel[285].rotateAngleX = -0.06981317F;
		bodyModel[285].rotateAngleZ = 2.0943951F;

		bodyModel[286].addShapeBox(-0.5F, -0.5F, -2F, 1, 3, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 289
		bodyModel[286].setRotationPoint(-24F, -8.9F, -16.5F);
		bodyModel[286].rotateAngleX = -0.06981317F;
		bodyModel[286].rotateAngleZ = 4.1887902F;

		bodyModel[287].addShapeBox(0F, 0.5F, 1F, 10, 1, 4, 0F,0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1.5F, 0F, -0.2F, 0F); // Box 290
		bodyModel[287].setRotationPoint(-24.5F, -9.4F, -16.5F);
		bodyModel[287].rotateAngleX = -0.06981317F;

		bodyModel[288].addShapeBox(-9F, 0.5F, 1F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, -1.5F); // Box 291
		bodyModel[288].setRotationPoint(-24.5F, -9.4F, -16.5F);
		bodyModel[288].rotateAngleX = -0.06981317F;

		bodyModel[289].addShapeBox(0F, 0F, 1.8F, 1, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, -0.3F, 0.3F, 0.2F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F); // Box 292
		bodyModel[289].setRotationPoint(-24.5F, -10.2F, -16.5F);
		bodyModel[289].rotateAngleX = -0.06981317F;

		bodyModel[290].addShapeBox(0F, 0F, 1.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 293
		bodyModel[290].setRotationPoint(-24.5F, -11.2F, -8.5F);
		bodyModel[290].rotateAngleX = -0.06981317F;

		bodyModel[291].addShapeBox(0F, 0F, 1.8F, 6, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 294
		bodyModel[291].setRotationPoint(-27F, -9F, -8F);
		bodyModel[291].rotateAngleX = -0.06981317F;

		bodyModel[292].addShapeBox(0F, 0F, 0.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 295
		bodyModel[292].setRotationPoint(-24.5F, -8.6F, -16.5F);
		bodyModel[292].rotateAngleX = -0.06981317F;
		bodyModel[292].rotateAngleZ = -0.62831853F;

		bodyModel[293].addShapeBox(0F, 0F, 3.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 296
		bodyModel[293].setRotationPoint(-24.5F, -8.6F, -16.5F);
		bodyModel[293].rotateAngleX = -0.06981317F;
		bodyModel[293].rotateAngleZ = -0.62831853F;

		bodyModel[294].addShapeBox(0F, 0.8F, 0.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 297
		bodyModel[294].setRotationPoint(-24.5F, -8.6F, -16.5F);
		bodyModel[294].rotateAngleX = -0.06981317F;
		bodyModel[294].rotateAngleZ = 0.62831853F;

		bodyModel[295].addShapeBox(0F, 0.8F, 3.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 298
		bodyModel[295].setRotationPoint(-24.5F, -8.6F, -16.5F);
		bodyModel[295].rotateAngleX = -0.06981317F;
		bodyModel[295].rotateAngleZ = 0.62831853F;

		bodyModel[296].addShapeBox(0F, 0F, 0.5F, 3, 1, 1, 0F,0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F); // Box 299
		bodyModel[296].setRotationPoint(-25.5F, -6.4F, -17F);
		bodyModel[296].rotateAngleX = -0.06981317F;

		bodyModel[297].addShapeBox(0F, 0F, 0.5F, 3, 1, 1, 0F,0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F); // Box 300
		bodyModel[297].setRotationPoint(-25.5F, -6.4F, -14F);
		bodyModel[297].rotateAngleX = -0.06981317F;

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[298].setRotationPoint(-26.5F, -6F, 10.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[299].setRotationPoint(-22.5F, -6F, 10.5F);

		bodyModel[300].addShapeBox(0F, 0F, -12F, 1, 1, 12, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 303
		bodyModel[300].setRotationPoint(-24.5F, -9.4F, 17.5F);
		bodyModel[300].rotateAngleX = 0.06981317F;

		bodyModel[301].addShapeBox(0F, 0F, 2.5F, 1, 1, 2, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 304
		bodyModel[301].setRotationPoint(-24.5F, -9.2F, 14.5F);
		bodyModel[301].rotateAngleX = 0.06981317F;

		bodyModel[302].addShapeBox(0F, 0F, -2F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 305
		bodyModel[302].setRotationPoint(-24.5F, -9.4F, 14.5F);
		bodyModel[302].rotateAngleX = 0.06981317F;

		bodyModel[303].addShapeBox(-0.5F, -0.5F, 3F, 1, 3, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 306
		bodyModel[303].setRotationPoint(-24F, -8.9F, 15.5F);
		bodyModel[303].rotateAngleX = 0.06981317F;

		bodyModel[304].addShapeBox(-0.5F, -0.5F, 3F, 1, 3, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 307
		bodyModel[304].setRotationPoint(-24F, -8.9F, 15.5F);
		bodyModel[304].rotateAngleX = 0.06981317F;
		bodyModel[304].rotateAngleZ = 2.0943951F;

		bodyModel[305].addShapeBox(-0.5F, -0.5F, 3F, 1, 3, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F); // Box 308
		bodyModel[305].setRotationPoint(-24F, -8.9F, 15.5F);
		bodyModel[305].rotateAngleX = 0.06981317F;
		bodyModel[305].rotateAngleZ = 4.1887902F;

		bodyModel[306].addShapeBox(0F, 0.5F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, -1.5F, 0F, -0.8F, 0F, 0F, -0.2F, 0F); // Box 309
		bodyModel[306].setRotationPoint(-24.5F, -9.4F, 12.5F);
		bodyModel[306].rotateAngleX = 0.06981317F;

		bodyModel[307].addShapeBox(-9F, 0.5F, 0F, 10, 1, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F); // Box 310
		bodyModel[307].setRotationPoint(-24.5F, -9.4F, 12.5F);
		bodyModel[307].rotateAngleX = 0.06981317F;

		bodyModel[308].addShapeBox(0F, 0F, -0.2F, 1, 1, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0.2F, -0.3F, 0.3F, 0.2F, -0.3F, 0.3F); // Box 311
		bodyModel[308].setRotationPoint(-24.5F, -10F, 13.5F);
		bodyModel[308].rotateAngleX = 0.06981317F;

		bodyModel[309].addShapeBox(0F, 0F, -0.8F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F); // Box 312
		bodyModel[309].setRotationPoint(-24.5F, -11.2F, 6.5F);
		bodyModel[309].rotateAngleX = 0.06981317F;

		bodyModel[310].addShapeBox(0F, 0F, -0.8F, 6, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 313
		bodyModel[310].setRotationPoint(-27F, -8.8F, 6F);
		bodyModel[310].rotateAngleX = 0.06981317F;

		bodyModel[311].addShapeBox(0F, 0F, -1.8F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 314
		bodyModel[311].setRotationPoint(-24.5F, -8.6F, 15.5F);
		bodyModel[311].rotateAngleX = 0.06981317F;
		bodyModel[311].rotateAngleZ = -0.62831853F;

		bodyModel[312].addShapeBox(0F, 0F, 1.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 315
		bodyModel[312].setRotationPoint(-24.5F, -8.6F, 15.5F);
		bodyModel[312].rotateAngleX = 0.06981317F;
		bodyModel[312].rotateAngleZ = -0.62831853F;

		bodyModel[313].addShapeBox(0F, 0.8F, -1.8F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 316
		bodyModel[313].setRotationPoint(-24.5F, -8.6F, 15.5F);
		bodyModel[313].rotateAngleX = 0.06981317F;
		bodyModel[313].rotateAngleZ = 0.62831853F;

		bodyModel[314].addShapeBox(0F, 0.8F, 1.2F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 317
		bodyModel[314].setRotationPoint(-24.5F, -8.6F, 15.5F);
		bodyModel[314].rotateAngleX = 0.06981317F;
		bodyModel[314].rotateAngleZ = 0.62831853F;

		bodyModel[315].addShapeBox(0F, 0F, 0.5F, 3, 1, 1, 0F,0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F); // Box 318
		bodyModel[315].setRotationPoint(-25.5F, -6.4F, 16F);
		bodyModel[315].rotateAngleX = -0.06981317F;

		bodyModel[316].addShapeBox(0F, 0F, 0.5F, 3, 1, 1, 0F,0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.2F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F, 0.3F, -0.4F, -0.45F); // Box 319
		bodyModel[316].setRotationPoint(-25.5F, -6.4F, 13F);
		bodyModel[316].rotateAngleX = -0.06981317F;

		bodyModel[317].addShapeBox(0F, 0F, 3F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 320
		bodyModel[317].setRotationPoint(-24.5F, -9.2F, 14.5F);
		bodyModel[317].rotateAngleX = 0.06981317F;

		bodyModel[318].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[318].setRotationPoint(-20F, -4F, -25F);
		bodyModel[318].rotateAngleY = 0.61086524F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[319].setRotationPoint(-20F, -8F, -25F);
		bodyModel[319].rotateAngleY = 0.61086524F;

		bodyModel[320].addShapeBox(0F, 0F, 0F, 34, 3, 3, 0F,0F, 0F, -1F, -3.5F, 19F, -1F, -3.5F, 19F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, -22F, -1F, -3F, -22F, -1F, 0F, 0F, -1F); // Box 323
		bodyModel[320].setRotationPoint(-20F, -8F, -24.5F);
		bodyModel[320].rotateAngleY = 0.61086524F;

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 324
		bodyModel[321].setRotationPoint(4F, -27F, -6.5F);
		bodyModel[321].rotateAngleY = 0.61086524F;

		bodyModel[322].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[322].setRotationPoint(-21F, -4F, 21F);
		bodyModel[322].rotateAngleY = -0.61086524F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[323].setRotationPoint(-21F, -8F, 21F);
		bodyModel[323].rotateAngleY = -0.61086524F;

		bodyModel[324].addShapeBox(0F, 0F, 0F, 34, 3, 3, 0F,0F, 0F, -1F, -3.5F, 19F, -1F, -3.5F, 19F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, -22F, -1F, -3F, -22F, -1F, 0F, 0F, -1F); // Box 327
		bodyModel[324].setRotationPoint(-21F, -8F, 21.5F);
		bodyModel[324].rotateAngleY = -0.61086524F;

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 328
		bodyModel[325].setRotationPoint(4F, -27F, 5F);
		bodyModel[325].rotateAngleY = -0.61086524F;

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[326].setRotationPoint(-52F, -19F, -7F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 330
		bodyModel[327].setRotationPoint(-52F, -18F, -7F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[328].setRotationPoint(-52F, -19F, 6F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 332
		bodyModel[329].setRotationPoint(-52F, -18F, 6F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[330].setRotationPoint(-20F, -23F, -7F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 334
		bodyModel[331].setRotationPoint(-20F, -22F, -7F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[332].setRotationPoint(-20F, -23F, 6F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 336
		bodyModel[333].setRotationPoint(-20F, -22F, 6F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[334].setRotationPoint(24F, -34F, 1F);
		bodyModel[334].rotateAngleY = -1.57079633F;

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 338
		bodyModel[335].setRotationPoint(24F, -33F, 1F);
		bodyModel[335].rotateAngleY = -1.57079633F;

		bodyModel[336].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[336].setRotationPoint(-9.5F, -26.5F, 4.02F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[337].setRotationPoint(-9.5F, -28.51F, 4.02F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[338].setRotationPoint(-9.5F, -26.5F, -8.02F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[339].setRotationPoint(-9.5F, -28.51F, -8.02F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 352
		bodyModel[340].setRotationPoint(-50.99F, -2F, 22F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F); // Box 355
		bodyModel[341].setRotationPoint(-47F, -2F, 22F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 356
		bodyModel[342].setRotationPoint(-50.99F, -2F, 18.01F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[343].setRotationPoint(-47F, -2F, 18.01F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,-0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 358
		bodyModel[344].setRotationPoint(-50.99F, -3.5F, 22F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 359
		bodyModel[345].setRotationPoint(-50.99F, -5.5F, 16.01F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.49F, 0F, 0F, 0.49F, 0F, 0F, 0.49F, -0.5F, 0F, 0.49F, -0.5F); // Box 361
		bodyModel[346].setRotationPoint(-50.99F, -5.5F, 22F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 362
		bodyModel[347].setRotationPoint(-48.99F, -4F, 23F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 363
		bodyModel[348].setRotationPoint(-45.99F, -4F, 23F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 372
		bodyModel[349].setRotationPoint(3.01F, -4F, 23F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 373
		bodyModel[350].setRotationPoint(6.01F, -4F, 23F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,-0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 374
		bodyModel[351].setRotationPoint(1.01F, -3.5F, 22F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.49F, 0F, 0F, 0.49F, 0F, 0F, 0.49F, -0.5F, 0F, 0.49F, -0.5F); // Box 375
		bodyModel[352].setRotationPoint(1.01F, -5.5F, 22F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 376
		bodyModel[353].setRotationPoint(1.01F, -5.5F, 16.01F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 377
		bodyModel[354].setRotationPoint(1.01F, -2F, 18.01F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 378
		bodyModel[355].setRotationPoint(1.01F, -2F, 22F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[356].setRotationPoint(5F, -2F, 18.01F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F); // Box 380
		bodyModel[357].setRotationPoint(5F, -2F, 22F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 381
		bodyModel[358].setRotationPoint(35.5F, -4F, 17F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 382
		bodyModel[359].setRotationPoint(38.5F, -4F, 17F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,-0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 383
		bodyModel[360].setRotationPoint(33.5F, -3.5F, 16F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.49F, 0F, 0F, 0.49F, 0F, 0F, 0.49F, -0.5F, 0F, 0.49F, -0.5F); // Box 384
		bodyModel[361].setRotationPoint(33.5F, -5.5F, 16F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 385
		bodyModel[362].setRotationPoint(33.5F, -5.5F, 10.01F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 386
		bodyModel[363].setRotationPoint(33.5F, -2F, 12.01F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 387
		bodyModel[364].setRotationPoint(33.5F, -2F, 16F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[365].setRotationPoint(37.49F, -2F, 12.01F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F); // Box 389
		bodyModel[366].setRotationPoint(37.49F, -2F, 16F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 390
		bodyModel[367].setRotationPoint(-50.99F, -2F, -26F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[368].setRotationPoint(-47F, -2F, -26F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 392
		bodyModel[369].setRotationPoint(-50.99F, -2F, -22.01F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F); // Box 393
		bodyModel[370].setRotationPoint(-47F, -2F, -22.01F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,-0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 394
		bodyModel[371].setRotationPoint(-50.99F, -3.5F, -26F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 395
		bodyModel[372].setRotationPoint(-50.99F, -5.5F, -22.01F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.49F, -0.5F, 0F, 0.49F, -0.5F, 0F, 0.49F, 0F, 0F, 0.49F, 0F); // Box 396
		bodyModel[373].setRotationPoint(-50.99F, -5.5F, -26F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 397
		bodyModel[374].setRotationPoint(-48.99F, -4F, -34F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 398
		bodyModel[375].setRotationPoint(-45.99F, -4F, -34F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 399
		bodyModel[376].setRotationPoint(3.01F, -4F, -34F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 400
		bodyModel[377].setRotationPoint(6.01F, -4F, -34F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,-0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 401
		bodyModel[378].setRotationPoint(1.01F, -3.5F, -26F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.49F, -0.5F, 0F, 0.49F, -0.5F, 0F, 0.49F, 0F, 0F, 0.49F, 0F); // Box 402
		bodyModel[379].setRotationPoint(1.01F, -5.5F, -26F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 403
		bodyModel[380].setRotationPoint(1.01F, -5.5F, -22.01F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 404
		bodyModel[381].setRotationPoint(1.01F, -2F, -22.01F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 405
		bodyModel[382].setRotationPoint(1.01F, -2F, -26F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F); // Box 406
		bodyModel[383].setRotationPoint(5F, -2F, -22.01F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[384].setRotationPoint(5F, -2F, -26F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 408
		bodyModel[385].setRotationPoint(35.5F, -4F, -28F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 409
		bodyModel[386].setRotationPoint(38.5F, -4F, -28F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,-0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 410
		bodyModel[387].setRotationPoint(33.5F, -3.5F, -20F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.49F, -0.5F, 0F, 0.49F, -0.5F, 0F, 0.49F, 0F, 0F, 0.49F, 0F); // Box 411
		bodyModel[388].setRotationPoint(33.5F, -5.5F, -20F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 412
		bodyModel[389].setRotationPoint(33.5F, -5.5F, -16.01F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 413
		bodyModel[390].setRotationPoint(33.5F, -2F, -16.01F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 414
		bodyModel[391].setRotationPoint(33.5F, -2F, -20F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F); // Box 415
		bodyModel[392].setRotationPoint(37.49F, -2F, -16.01F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[393].setRotationPoint(37.49F, -2F, -20F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[394].setRotationPoint(-8.99F, -7.5F, 15.01F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 418
		bodyModel[395].setRotationPoint(-6.99F, -7.5F, 20F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 419
		bodyModel[396].setRotationPoint(-7.99F, -7.5F, 20F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 420
		bodyModel[397].setRotationPoint(22.01F, -7.5F, 19F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 421
		bodyModel[398].setRotationPoint(23.01F, -7.5F, 19F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[399].setRotationPoint(21.01F, -7.5F, 14.01F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 423
		bodyModel[400].setRotationPoint(-33.99F, -7.5F, 19F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 424
		bodyModel[401].setRotationPoint(-32.99F, -7.5F, 19F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[402].setRotationPoint(-34.99F, -7.5F, 14.01F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 426
		bodyModel[403].setRotationPoint(-60.99F, -7.5F, 17F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 427
		bodyModel[404].setRotationPoint(-59.99F, -7.5F, 17F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[405].setRotationPoint(-61.99F, -7.5F, 12.01F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 429
		bodyModel[406].setRotationPoint(-8.99F, -7.5F, -22.01F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 430
		bodyModel[407].setRotationPoint(-6.99F, -7.5F, -27F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 431
		bodyModel[408].setRotationPoint(-7.99F, -7.5F, -27F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 432
		bodyModel[409].setRotationPoint(22.01F, -7.5F, -26F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 433
		bodyModel[410].setRotationPoint(23.01F, -7.5F, -26F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 434
		bodyModel[411].setRotationPoint(21.01F, -7.5F, -21.01F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 435
		bodyModel[412].setRotationPoint(-33.99F, -7.5F, -26F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 436
		bodyModel[413].setRotationPoint(-32.99F, -7.5F, -26F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 437
		bodyModel[414].setRotationPoint(-34.99F, -7.5F, -21.01F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 438
		bodyModel[415].setRotationPoint(-60.99F, -7.5F, -24F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 439
		bodyModel[416].setRotationPoint(-59.99F, -7.5F, -24F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 440
		bodyModel[417].setRotationPoint(-61.99F, -7.5F, -19.01F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[418].setRotationPoint(-88F, -6.5F, -12.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F); // Box 442
		bodyModel[419].setRotationPoint(-88.8F, -7F, -13F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.4F); // Box 443
		bodyModel[420].setRotationPoint(-87.2F, -7F, -13F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 444
		bodyModel[421].setRotationPoint(-88.2F, -6.8F, -13.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 445
		bodyModel[422].setRotationPoint(-87.8F, -6.8F, -13.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 446
		bodyModel[423].setRotationPoint(-87.8F, -6.4F, -13.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 447
		bodyModel[424].setRotationPoint(-88.2F, -6.4F, -13.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 448
		bodyModel[425].setRotationPoint(18.2F, -33.4F, -8.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 449
		bodyModel[426].setRotationPoint(17.8F, -33.4F, -8.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 450
		bodyModel[427].setRotationPoint(17.8F, -33.8F, -8.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 451
		bodyModel[428].setRotationPoint(18.2F, -33.8F, -8.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 452
		bodyModel[429].setRotationPoint(18F, -33.5F, -7.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F); // Box 453
		bodyModel[430].setRotationPoint(17.2F, -34F, -8F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.4F); // Box 454
		bodyModel[431].setRotationPoint(18.8F, -34F, -8F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 455
		bodyModel[432].setRotationPoint(60.2F, -6.4F, -10.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 456
		bodyModel[433].setRotationPoint(59.8F, -6.4F, -10.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 457
		bodyModel[434].setRotationPoint(59.8F, -6.8F, -10.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 458
		bodyModel[435].setRotationPoint(60.2F, -6.8F, -10.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[436].setRotationPoint(60F, -6.5F, -9.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F); // Box 460
		bodyModel[437].setRotationPoint(59.2F, -7F, -10F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.4F); // Box 461
		bodyModel[438].setRotationPoint(60.8F, -7F, -10F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[439].setRotationPoint(-88F, -6.5F, 11.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F); // Box 463
		bodyModel[440].setRotationPoint(-88.8F, -7F, 12F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F); // Box 464
		bodyModel[441].setRotationPoint(-87.2F, -7F, 12F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 465
		bodyModel[442].setRotationPoint(-88.2F, -6.8F, 11.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 466
		bodyModel[443].setRotationPoint(-87.8F, -6.8F, 11.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 467
		bodyModel[444].setRotationPoint(-87.8F, -6.4F, 11.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 468
		bodyModel[445].setRotationPoint(-88.2F, -6.4F, 11.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 469
		bodyModel[446].setRotationPoint(18.2F, -33.4F, 6.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 470
		bodyModel[447].setRotationPoint(17.8F, -33.4F, 6.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 471
		bodyModel[448].setRotationPoint(17.8F, -33.8F, 6.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 472
		bodyModel[449].setRotationPoint(18.2F, -33.8F, 6.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 473
		bodyModel[450].setRotationPoint(18F, -33.5F, 6.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F); // Box 474
		bodyModel[451].setRotationPoint(17.2F, -34F, 7F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F); // Box 475
		bodyModel[452].setRotationPoint(18.8F, -34F, 7F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 476
		bodyModel[453].setRotationPoint(60.2F, -6.4F, 8.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 477
		bodyModel[454].setRotationPoint(59.8F, -6.4F, 8.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 478
		bodyModel[455].setRotationPoint(59.8F, -6.8F, 8.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 479
		bodyModel[456].setRotationPoint(60.2F, -6.8F, 8.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[457].setRotationPoint(60F, -6.5F, 8.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.8F); // Box 481
		bodyModel[458].setRotationPoint(59.2F, -7F, 9F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F); // Box 482
		bodyModel[459].setRotationPoint(60.8F, -7F, 9F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		bodyModel[460].setRotationPoint(-155F, 17.52F, -9.7F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		bodyModel[461].setRotationPoint(-169F, 18F, -9.2F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 685
		bodyModel[462].setRotationPoint(-165F, 18F, -9F);
		bodyModel[462].rotateAngleX = 1.32645023F;

		bodyModel[463].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[463].setRotationPoint(-168F, 18.5F, -8.7F);

		bodyModel[464].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		bodyModel[464].setRotationPoint(-168F, 18.5F, -8.7F);
		bodyModel[464].rotateAngleX = 2.0943951F;

		bodyModel[465].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[465].setRotationPoint(-168F, 18.5F, -8.7F);
		bodyModel[465].rotateAngleX = 4.1887902F;

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 504
		bodyModel[466].setRotationPoint(-165F, 18F, -9F);
		bodyModel[466].rotateAngleX = 0.17453293F;

		bodyModel[467].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[467].setRotationPoint(-155F, 17.52F, 7.7F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[468].setRotationPoint(-169F, 18F, 8.2F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 507
		bodyModel[469].setRotationPoint(-165F, 12.5F, 7.5F);
		bodyModel[469].rotateAngleX = -1.32645023F;

		bodyModel[470].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[470].setRotationPoint(-168F, 18.5F, 8.7F);

		bodyModel[471].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		bodyModel[471].setRotationPoint(-168F, 18.5F, 8.7F);
		bodyModel[471].rotateAngleX = 2.0943951F;

		bodyModel[472].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[472].setRotationPoint(-168F, 18.5F, 8.7F);
		bodyModel[472].rotateAngleX = 4.1887902F;

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 511
		bodyModel[473].setRotationPoint(-165F, 16F, -1F);
		bodyModel[473].rotateAngleX = -0.17453293F;

		bodyModel[474].addShapeBox(0F, 0F, 0F, 70, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 512
		bodyModel[474].setRotationPoint(-168F, 15.52F, -2F);
		bodyModel[474].rotateAngleZ = 0.03490659F;

		bodyModel[475].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 513
		bodyModel[475].setRotationPoint(-177F, 19.52F, -1F);
		bodyModel[475].rotateAngleZ = 0.03490659F;

		bodyModel[476].addShapeBox(0F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[476].setRotationPoint(-177F, 14.52F, -1F);
		bodyModel[476].rotateAngleZ = 0.03490659F;

		bodyModel[477].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[477].setRotationPoint(-180F, 19.5F, -0.5F);

		bodyModel[478].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[478].setRotationPoint(-179F, 20F, 0F);

		bodyModel[479].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[479].setRotationPoint(-179F, 20F, 0F);
		bodyModel[479].rotateAngleX = 4.1887902F;

		bodyModel[480].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[480].setRotationPoint(-179F, 20F, 0F);
		bodyModel[480].rotateAngleX = 2.0943951F;

		bodyModel[481].addShapeBox(0F, 0F, 0F, 4, 8, 9, 0F,0F, 0.1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -2.5F, -2F, -2F, -3.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, -2F, -2F, -3.5F); // Box 519
		bodyModel[481].setRotationPoint(-210F, -1.5F, -4.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[482].setRotationPoint(134F, -1.5F, -3F);
		bodyModel[482].rotateAngleY = -0.05235988F;
		bodyModel[482].rotateAngleZ = 0.05235988F;

		bodyModel[483].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		bodyModel[483].setRotationPoint(134F, -1.5F, 2F);
		bodyModel[483].rotateAngleY = 0.05235988F;
		bodyModel[483].rotateAngleZ = 0.05235988F;

		bodyModel[484].addShapeBox(0F, 0F, -0.7F, 4, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F); // Box 488
		bodyModel[484].setRotationPoint(-33F, -2F, 25F);

		bodyModel[485].addShapeBox(0F, 0F, -0.7F, 4, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 489
		bodyModel[485].setRotationPoint(-36.99F, -2F, 25F);

		bodyModel[486].addShapeBox(0F, 0F, -0.7F, 4, 2, 4, 0F,-2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 490
		bodyModel[486].setRotationPoint(-36.99F, -2F, 21.01F);

		bodyModel[487].addShapeBox(0F, 0F, -0.7F, 4, 2, 4, 0F,0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[487].setRotationPoint(-33F, -2F, 21.01F);

		bodyModel[488].addShapeBox(0F, 0F, -0.7F, 4, 2, 4, 0F,0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[488].setRotationPoint(-33F, -2F, -27.8F);

		bodyModel[489].addShapeBox(0F, 0F, -0.7F, 4, 2, 4, 0F,-2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 496
		bodyModel[489].setRotationPoint(-36.99F, -2F, -27.8F);

		bodyModel[490].addShapeBox(0F, 0F, -0.7F, 4, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 497
		bodyModel[490].setRotationPoint(-36.99F, -2F, -23.81F);

		bodyModel[491].addShapeBox(0F, 0F, -0.7F, 4, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F); // Box 498
		bodyModel[491].setRotationPoint(-33F, -2F, -23.81F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 625, 281, textureX, textureY); // Flag
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 465, 321, textureX, textureY); // Box 702
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 601, 321, textureX, textureY); // Box 501

		leftFrontWheelModel[0].addShapeBox(-20F, 0F, -0.5F, 100, 90, 1, 0F,-1.3F, -3F, -0.47F, -80F, 0F, -0.47F, -80F, 0F, -0.47F, -1.3F, -3F, -0.47F, -0.3F, -76F, -0.47F, -80F, -80F, -0.47F, -80F, -80F, -0.47F, -0.3F, -76F, -0.47F); // Flag
		leftFrontWheelModel[0].setRotationPoint(-41F, -67F, 0F);

		leftFrontWheelModel[1].addShapeBox(-7F, 0F, -0.5F, 9, 6, 1, 0F,0.5F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 1F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 702
		leftFrontWheelModel[1].setRotationPoint(-184F, 13F, -4.2F);

		leftFrontWheelModel[2].addShapeBox(-7F, 0F, -0.5F, 9, 6, 1, 0F,0.5F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 1F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 501
		leftFrontWheelModel[2].setRotationPoint(-184F, 13F, 3.2F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[5];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Box 483
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Box 484
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 485
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Box 486
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 577, 313, textureX, textureY); // Box 487

		gun_1_Model[0][0].addShapeBox(-13F, -1F, -7F, 15, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 483

		gun_1_Model[0][1].addShapeBox(-13F, -4F, -7F, 15, 3, 14, 0F,0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484

		gun_1_Model[0][2].addShapeBox(2.01F, -1F, -7F, 5, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 485

		gun_1_Model[0][3].addShapeBox(2F, -4F, -7F, 5, 3, 14, 0F,0F, -0.2F, -2.5F, -0.3F, -2.2F, -2.5F, -0.3F, -2.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 486

		gun_1_Model[0][4].addShapeBox(-10F, -3.5F, -8F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(104F, -3.5F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[10];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 488
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 489
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 490
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 649, 177, textureX, textureY); // Box 491
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 492
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 493
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 494
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 495
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 496
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 497

		gun_1_Model[1][0].addShapeBox(6.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488

		gun_1_Model[1][1].addShapeBox(8.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, -0.7F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 489

		gun_1_Model[1][2].addShapeBox(10.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, -1F, -0.2F, 0F, -1.2F, -0.4F, 0F, -1.2F, -0.4F, 0F, -1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 490

		gun_1_Model[1][3].addShapeBox(12.01F, -1.1F, -3.5F, 6, 2, 2, 0F,0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F); // Box 491

		gun_1_Model[1][4].addShapeBox(18.01F, -1.1F, -3.5F, 11, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 492

		gun_1_Model[1][5].addShapeBox(18.01F, -1.1F, 1.5F, 11, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 493

		gun_1_Model[1][6].addShapeBox(12.01F, -1.1F, 1.5F, 6, 2, 2, 0F,0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F); // Box 494

		gun_1_Model[1][7].addShapeBox(10.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, -1F, -0.2F, 0F, -1.2F, -0.4F, 0F, -1.2F, -0.4F, 0F, -1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 495

		gun_1_Model[1][8].addShapeBox(8.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, -0.7F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 496

		gun_1_Model[1][9].addShapeBox(6.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(104F, -3.5F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[5];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Box 483
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Box 484
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 485
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Box 486
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 577, 313, textureX, textureY); // Box 487

		gun_2_Model[0][0].addShapeBox(-13F, -1F, -7F, 15, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 483

		gun_2_Model[0][1].addShapeBox(-13F, -4F, -7F, 15, 3, 14, 0F,0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484

		gun_2_Model[0][2].addShapeBox(2.01F, -1F, -7F, 5, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 485

		gun_2_Model[0][3].addShapeBox(2F, -4F, -7F, 5, 3, 14, 0F,0F, -0.2F, -2.5F, -0.3F, -2.2F, -2.5F, -0.3F, -2.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 486

		gun_2_Model[0][4].addShapeBox(-10F, -3.5F, -8F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-102F, -10F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[10];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 488
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 489
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 490
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 649, 177, textureX, textureY); // Box 491
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 492
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 493
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 494
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 495
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 496
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 497

		gun_2_Model[1][0].addShapeBox(6.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488

		gun_2_Model[1][1].addShapeBox(8.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, -0.7F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 489

		gun_2_Model[1][2].addShapeBox(10.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, -1F, -0.2F, 0F, -1.2F, -0.4F, 0F, -1.2F, -0.4F, 0F, -1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 490

		gun_2_Model[1][3].addShapeBox(12.01F, -1.1F, -3.5F, 6, 2, 2, 0F,0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F); // Box 491

		gun_2_Model[1][4].addShapeBox(18.01F, -1.1F, -3.5F, 11, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 492

		gun_2_Model[1][5].addShapeBox(18.01F, -1.1F, 1.5F, 11, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 493

		gun_2_Model[1][6].addShapeBox(12.01F, -1.1F, 1.5F, 6, 2, 2, 0F,0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F); // Box 494

		gun_2_Model[1][7].addShapeBox(10.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, -1F, -0.2F, 0F, -1.2F, -0.4F, 0F, -1.2F, -0.4F, 0F, -1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 495

		gun_2_Model[1][8].addShapeBox(8.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, -0.7F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 496

		gun_2_Model[1][9].addShapeBox(6.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-102F, -10F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[5];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Box 483
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Box 484
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 485
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Box 486
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 577, 313, textureX, textureY); // Box 487

		gun_3_Model[0][0].addShapeBox(-13F, -1F, -7F, 15, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 483

		gun_3_Model[0][1].addShapeBox(-13F, -4F, -7F, 15, 3, 14, 0F,0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484

		gun_3_Model[0][2].addShapeBox(2.01F, -1F, -7F, 5, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 485

		gun_3_Model[0][3].addShapeBox(2F, -4F, -7F, 5, 3, 14, 0F,0F, -0.2F, -2.5F, -0.3F, -2.2F, -2.5F, -0.3F, -2.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 486

		gun_3_Model[0][4].addShapeBox(-10F, -3.5F, -8F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-130F, -3F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[10];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 488
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 489
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 490
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 649, 177, textureX, textureY); // Box 491
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 492
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 493
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 494
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 495
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 496
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 497

		gun_3_Model[1][0].addShapeBox(6.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488

		gun_3_Model[1][1].addShapeBox(8.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, -0.7F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 489

		gun_3_Model[1][2].addShapeBox(10.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, -1F, -0.2F, 0F, -1.2F, -0.4F, 0F, -1.2F, -0.4F, 0F, -1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 490

		gun_3_Model[1][3].addShapeBox(12.01F, -1.1F, -3.5F, 6, 2, 2, 0F,0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F); // Box 491

		gun_3_Model[1][4].addShapeBox(18.01F, -1.1F, -3.5F, 11, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 492

		gun_3_Model[1][5].addShapeBox(18.01F, -1.1F, 1.5F, 11, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 493

		gun_3_Model[1][6].addShapeBox(12.01F, -1.1F, 1.5F, 6, 2, 2, 0F,0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F); // Box 494

		gun_3_Model[1][7].addShapeBox(10.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, -1F, -0.2F, 0F, -1.2F, -0.4F, 0F, -1.2F, -0.4F, 0F, -1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 495

		gun_3_Model[1][8].addShapeBox(8.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, -0.7F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 496

		gun_3_Model[1][9].addShapeBox(6.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-130F, -3F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[5];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Box 483
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Box 484
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 485
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Box 486
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 577, 313, textureX, textureY); // Box 487

		gun_4_Model[0][0].addShapeBox(-13F, -1F, -7F, 15, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 483

		gun_4_Model[0][1].addShapeBox(-13F, -4F, -7F, 15, 3, 14, 0F,0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484

		gun_4_Model[0][2].addShapeBox(2.01F, -1F, -7F, 5, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 485

		gun_4_Model[0][3].addShapeBox(2F, -4F, -7F, 5, 3, 14, 0F,0F, -0.2F, -2.5F, -0.3F, -2.2F, -2.5F, -0.3F, -2.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 486

		gun_4_Model[0][4].addShapeBox(-10F, -3.5F, -8F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(76F, -10F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[10];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 488
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 489
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 490
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 649, 177, textureX, textureY); // Box 491
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 492
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 493
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 494
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 495
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 496
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 497

		gun_4_Model[1][0].addShapeBox(6.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488

		gun_4_Model[1][1].addShapeBox(8.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, -0.7F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 489

		gun_4_Model[1][2].addShapeBox(10.01F, -2F, -3.5F, 2, 3, 2, 0F,0F, -1F, -0.2F, 0F, -1.2F, -0.4F, 0F, -1.2F, -0.4F, 0F, -1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 490

		gun_4_Model[1][3].addShapeBox(12.01F, -1.1F, -3.5F, 6, 2, 2, 0F,0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F); // Box 491

		gun_4_Model[1][4].addShapeBox(18.01F, -1.1F, -3.5F, 11, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 492

		gun_4_Model[1][5].addShapeBox(18.01F, -1.1F, 1.5F, 11, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 493

		gun_4_Model[1][6].addShapeBox(12.01F, -1.1F, 1.5F, 6, 2, 2, 0F,0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.52F, -0.52F, 0F, -0.52F, -0.52F, 0F, -0.42F, -0.42F); // Box 494

		gun_4_Model[1][7].addShapeBox(10.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, -1F, -0.2F, 0F, -1.2F, -0.4F, 0F, -1.2F, -0.4F, 0F, -1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 495

		gun_4_Model[1][8].addShapeBox(8.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, -0.7F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 496

		gun_4_Model[1][9].addShapeBox(6.01F, -2F, 1.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(76F, -10F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[4];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 487
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 492
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 493
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 494

		gun_5_Model[0][0].addShapeBox(-2F, -2F, -2.2F, 6, 4, 6, 0F,2F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F); // Box 487

		gun_5_Model[0][1].addShapeBox(-2F, -2F, -3.8F, 6, 4, 6, 0F,2F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F); // Box 492

		gun_5_Model[0][2].addShapeBox(-2F, -2F, -0.8F, 6, 4, 6, 0F,2F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F); // Box 493

		gun_5_Model[0][3].addShapeBox(-2F, -2F, -5.2F, 6, 4, 6, 0F,2F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F); // Box 494

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-33F, -2.5F, -24.5F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[0];

		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[4];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 487
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 492
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 493
		gun_6_Model[0][3] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 494

		gun_6_Model[0][0].addShapeBox(-2F, -2F, -2.2F, 6, 4, 6, 0F,2F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F); // Box 487

		gun_6_Model[0][1].addShapeBox(-2F, -2F, -3.8F, 6, 4, 6, 0F,2F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F); // Box 492

		gun_6_Model[0][2].addShapeBox(-2F, -2F, -0.8F, 6, 4, 6, 0F,2F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F); // Box 493

		gun_6_Model[0][3].addShapeBox(-2F, -2F, -5.2F, 6, 4, 6, 0F,2F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 3F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F, 2F, -1.5F, -2.5F); // Box 494

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(-33F, -2.5F, 24.5F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[0];

		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);
	}
}