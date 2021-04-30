//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kaga
// Model Creator: 
// Created on: 13.06.2016 - 21:18:53
// Last changed on: 13.06.2016 - 21:18:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKaga extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelKaga() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[322];
		leftFrontWheelModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftFrontWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 1
		bodyModel[14] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 3
		bodyModel[16] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 5
		bodyModel[17] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 6
		bodyModel[18] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 7
		bodyModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		bodyModel[20] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 9
		bodyModel[21] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 10
		bodyModel[22] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 11
		bodyModel[23] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Box 12
		bodyModel[24] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 13
		bodyModel[25] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Box 14
		bodyModel[26] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 15
		bodyModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[28] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		bodyModel[29] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 18
		bodyModel[30] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 19
		bodyModel[31] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 20
		bodyModel[32] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 21
		bodyModel[33] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 22
		bodyModel[34] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 23
		bodyModel[35] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 24
		bodyModel[36] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 25
		bodyModel[37] = new ModelRendererTurbo(this, 569, 113, textureX, textureY); // Box 26
		bodyModel[38] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 27
		bodyModel[39] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 28
		bodyModel[40] = new ModelRendererTurbo(this, 521, 161, textureX, textureY); // Box 29
		bodyModel[41] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 30
		bodyModel[42] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 31
		bodyModel[43] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 32
		bodyModel[44] = new ModelRendererTurbo(this, 737, 185, textureX, textureY); // Box 33
		bodyModel[45] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 34
		bodyModel[46] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 35
		bodyModel[47] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 36
		bodyModel[48] = new ModelRendererTurbo(this, 705, 241, textureX, textureY); // Box 37
		bodyModel[49] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 38
		bodyModel[50] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 39
		bodyModel[51] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 40
		bodyModel[52] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 41
		bodyModel[53] = new ModelRendererTurbo(this, 369, 273, textureX, textureY); // Box 42
		bodyModel[54] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 43
		bodyModel[55] = new ModelRendererTurbo(this, 809, 241, textureX, textureY); // Box 44
		bodyModel[56] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 45
		bodyModel[57] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Box 46
		bodyModel[58] = new ModelRendererTurbo(this, 577, 289, textureX, textureY); // Box 47
		bodyModel[59] = new ModelRendererTurbo(this, 793, 297, textureX, textureY); // Box 48
		bodyModel[60] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 49
		bodyModel[61] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Box 50
		bodyModel[62] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 51
		bodyModel[63] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 52
		bodyModel[64] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 53
		bodyModel[65] = new ModelRendererTurbo(this, 889, 185, textureX, textureY); // Box 54
		bodyModel[66] = new ModelRendererTurbo(this, 345, 329, textureX, textureY); // Box 55
		bodyModel[67] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 56
		bodyModel[68] = new ModelRendererTurbo(this, 489, 345, textureX, textureY); // Box 57
		bodyModel[69] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 71
		bodyModel[72] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 79
		bodyModel[78] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 80
		bodyModel[79] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 81
		bodyModel[80] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 82
		bodyModel[81] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 83
		bodyModel[82] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 84
		bodyModel[83] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 85
		bodyModel[84] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 86
		bodyModel[85] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 87
		bodyModel[86] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 88
		bodyModel[87] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Box 89
		bodyModel[88] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 90
		bodyModel[89] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 91
		bodyModel[90] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 92
		bodyModel[91] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 93
		bodyModel[92] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 94
		bodyModel[93] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 95
		bodyModel[94] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 96
		bodyModel[95] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 97
		bodyModel[96] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 98
		bodyModel[97] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Box 99
		bodyModel[98] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 100
		bodyModel[99] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 101
		bodyModel[100] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 102
		bodyModel[101] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 103
		bodyModel[102] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 104
		bodyModel[103] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 105
		bodyModel[104] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 106
		bodyModel[105] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 107
		bodyModel[106] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 108
		bodyModel[107] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 109
		bodyModel[108] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 110
		bodyModel[109] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Box 111
		bodyModel[110] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 112
		bodyModel[111] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 113
		bodyModel[112] = new ModelRendererTurbo(this, 641, 73, textureX, textureY); // Box 114
		bodyModel[113] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 115
		bodyModel[114] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 116
		bodyModel[115] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 117
		bodyModel[116] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Box 118
		bodyModel[117] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 119
		bodyModel[118] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 120
		bodyModel[119] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 121
		bodyModel[120] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 122
		bodyModel[121] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 123
		bodyModel[122] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Box 124
		bodyModel[123] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 125
		bodyModel[124] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 126
		bodyModel[125] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 127
		bodyModel[126] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 129
		bodyModel[128] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 130
		bodyModel[129] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 131
		bodyModel[130] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 132
		bodyModel[131] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 133
		bodyModel[132] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 134
		bodyModel[133] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 135
		bodyModel[134] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 136
		bodyModel[135] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 137
		bodyModel[136] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 138
		bodyModel[137] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 139
		bodyModel[138] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 140
		bodyModel[139] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 141
		bodyModel[140] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 142
		bodyModel[141] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 143
		bodyModel[142] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 144
		bodyModel[143] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 145
		bodyModel[144] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 146
		bodyModel[145] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 147
		bodyModel[146] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 148
		bodyModel[147] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 149
		bodyModel[148] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 150
		bodyModel[149] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Box 151
		bodyModel[150] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 152
		bodyModel[151] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 153
		bodyModel[152] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 154
		bodyModel[153] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Box 155
		bodyModel[154] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 156
		bodyModel[155] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 157
		bodyModel[156] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 158
		bodyModel[157] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 159
		bodyModel[158] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 160
		bodyModel[159] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 161
		bodyModel[160] = new ModelRendererTurbo(this, 977, 129, textureX, textureY); // Box 162
		bodyModel[161] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 163
		bodyModel[162] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 164
		bodyModel[163] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 165
		bodyModel[164] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 166
		bodyModel[165] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 167
		bodyModel[166] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 168
		bodyModel[167] = new ModelRendererTurbo(this, 705, 137, textureX, textureY); // Box 169
		bodyModel[168] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Box 170
		bodyModel[169] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 171
		bodyModel[170] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 172
		bodyModel[171] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 173
		bodyModel[172] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 174
		bodyModel[173] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Box 175
		bodyModel[174] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 176
		bodyModel[175] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Box 177
		bodyModel[176] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Box 178
		bodyModel[177] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 179
		bodyModel[178] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 180
		bodyModel[179] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 181
		bodyModel[180] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 182
		bodyModel[181] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 183
		bodyModel[182] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 184
		bodyModel[183] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 185
		bodyModel[184] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 186
		bodyModel[185] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 187
		bodyModel[186] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Box 188
		bodyModel[187] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Box 189
		bodyModel[188] = new ModelRendererTurbo(this, 705, 145, textureX, textureY); // Box 190
		bodyModel[189] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 191
		bodyModel[190] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 192
		bodyModel[191] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Box 193
		bodyModel[192] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 194
		bodyModel[193] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Box 195
		bodyModel[194] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 196
		bodyModel[195] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 197
		bodyModel[196] = new ModelRendererTurbo(this, 857, 137, textureX, textureY); // Box 198
		bodyModel[197] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Box 199
		bodyModel[198] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 200
		bodyModel[199] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 201
		bodyModel[200] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 202
		bodyModel[201] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 203
		bodyModel[202] = new ModelRendererTurbo(this, 825, 153, textureX, textureY); // Box 204
		bodyModel[203] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 205
		bodyModel[204] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 206
		bodyModel[205] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 207
		bodyModel[206] = new ModelRendererTurbo(this, 889, 217, textureX, textureY); // Box 208
		bodyModel[207] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 209
		bodyModel[208] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 210
		bodyModel[209] = new ModelRendererTurbo(this, 513, 169, textureX, textureY); // Box 211
		bodyModel[210] = new ModelRendererTurbo(this, 729, 177, textureX, textureY); // Box 212
		bodyModel[211] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 213
		bodyModel[212] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 214
		bodyModel[213] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 215
		bodyModel[214] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 216
		bodyModel[215] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 217
		bodyModel[216] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 218
		bodyModel[217] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 219
		bodyModel[218] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 220
		bodyModel[219] = new ModelRendererTurbo(this, 769, 177, textureX, textureY); // Box 221
		bodyModel[220] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 222
		bodyModel[221] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Box 223
		bodyModel[222] = new ModelRendererTurbo(this, 993, 185, textureX, textureY); // Box 224
		bodyModel[223] = new ModelRendererTurbo(this, 993, 193, textureX, textureY); // Box 225
		bodyModel[224] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 226
		bodyModel[225] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Box 227
		bodyModel[226] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 228
		bodyModel[227] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 229
		bodyModel[228] = new ModelRendererTurbo(this, 553, 185, textureX, textureY); // Box 230
		bodyModel[229] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 231
		bodyModel[230] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 232
		bodyModel[231] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 233
		bodyModel[232] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 234
		bodyModel[233] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Box 235
		bodyModel[234] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 236
		bodyModel[235] = new ModelRendererTurbo(this, 889, 185, textureX, textureY); // Box 237
		bodyModel[236] = new ModelRendererTurbo(this, 697, 217, textureX, textureY); // Box 238
		bodyModel[237] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 239
		bodyModel[238] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 240
		bodyModel[239] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Box 241
		bodyModel[240] = new ModelRendererTurbo(this, 993, 201, textureX, textureY); // Box 242
		bodyModel[241] = new ModelRendererTurbo(this, 657, 73, textureX, textureY); // Box 243
		bodyModel[242] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 244
		bodyModel[243] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 245
		bodyModel[244] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 246
		bodyModel[245] = new ModelRendererTurbo(this, 665, 345, textureX, textureY); // Box 247
		bodyModel[246] = new ModelRendererTurbo(this, 929, 233, textureX, textureY); // Box 678
		bodyModel[247] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Box 680
		bodyModel[248] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 685
		bodyModel[249] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 689
		bodyModel[250] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 690
		bodyModel[251] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 691
		bodyModel[252] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 254
		bodyModel[253] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 255
		bodyModel[254] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 256
		bodyModel[255] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 257
		bodyModel[256] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 258
		bodyModel[257] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 259
		bodyModel[258] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 260
		bodyModel[259] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 261
		bodyModel[260] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Box 262
		bodyModel[261] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 263
		bodyModel[262] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 264
		bodyModel[263] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 265
		bodyModel[264] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 266
		bodyModel[265] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Box 267
		bodyModel[266] = new ModelRendererTurbo(this, 577, 273, textureX, textureY); // Box 268
		bodyModel[267] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 270
		bodyModel[268] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 272
		bodyModel[269] = new ModelRendererTurbo(this, 753, 400, textureX, textureY); // Box 274
		bodyModel[270] = new ModelRendererTurbo(this, 753, 400, textureX, textureY); // Box 275
		bodyModel[271] = new ModelRendererTurbo(this, 753, 400, textureX, textureY); // Box 278
		bodyModel[272] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 279
		bodyModel[273] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 280
		bodyModel[274] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 281
		bodyModel[275] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 282
		bodyModel[276] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 283
		bodyModel[277] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 284
		bodyModel[278] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 285
		bodyModel[279] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 286
		bodyModel[280] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 287
		bodyModel[281] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 288
		bodyModel[282] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 289
		bodyModel[283] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 290
		bodyModel[284] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 291
		bodyModel[285] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 292
		bodyModel[286] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 293
		bodyModel[287] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 294
		bodyModel[288] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 295
		bodyModel[289] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 296
		bodyModel[290] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 297
		bodyModel[291] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 298
		bodyModel[292] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 299
		bodyModel[293] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 300
		bodyModel[294] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 301
		bodyModel[295] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 302
		bodyModel[296] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 303
		bodyModel[297] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 304
		bodyModel[298] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 305
		bodyModel[299] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 306
		bodyModel[300] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 307
		bodyModel[301] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 308
		bodyModel[302] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 309
		bodyModel[303] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 310
		bodyModel[304] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 311
		bodyModel[305] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 312
		bodyModel[306] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 313
		bodyModel[307] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 314
		bodyModel[308] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 315
		bodyModel[309] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 316
		bodyModel[310] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 317
		bodyModel[311] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 318
		bodyModel[312] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 319
		bodyModel[313] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 320
		bodyModel[314] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 321
		bodyModel[315] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 322
		bodyModel[316] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 323
		bodyModel[317] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 324
		bodyModel[318] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 325
		bodyModel[319] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 326
		bodyModel[320] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 327
		bodyModel[321] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 328

		bodyModel[0].addBox(0F, 0F, 0F, 231, 3, 48, 0F); // Box 1
		bodyModel[0].setRotationPoint(-190F, -15.2F, -24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 3, 48, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0.1F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(41F, -15.2F, -24F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 55, 3, 43, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0.1F); // Box 3
		bodyModel[2].setRotationPoint(47F, -15.2F, -19F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 40, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(47F, -15.2F, -31F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(87F, -15.2F, -31F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(94F, -15.2F, -30F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(99F, -15.2F, -28F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 3, 49, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 8
		bodyModel[7].setRotationPoint(102.5F, -15.2F, -23F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 3, 46, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(105.5F, -15.2F, -23F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 3, 44, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(120.5F, -15.2F, -22F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 3, 44, 0F,0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(135.5F, -15.2F, -22F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 16, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 12
		bodyModel[11].setRotationPoint(151.5F, -15.2F, -20.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 3, 39, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -0.5F); // Box 0
		bodyModel[12].setRotationPoint(167.5F, -15.2F, -19F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 3, 34, 0F,0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -6F, 0F, 0F, -0.5F); // Box 1
		bodyModel[13].setRotationPoint(183.5F, -15.2F, -16.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 3, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[14].setRotationPoint(-202F, -15.2F, -16F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[15].setRotationPoint(51F, -21.2F, -30F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[16].setRotationPoint(47F, -17.2F, -30F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[17].setRotationPoint(53F, -31.2F, -28.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[18].setRotationPoint(56F, -24.2F, -31F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[19].setRotationPoint(55F, -26.2F, -31.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[20].setRotationPoint(50F, -23.2F, -30F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 60, 6, 44, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 10
		bodyModel[21].setRotationPoint(0F, 3.8F, -22F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 55, 6, 40, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 11
		bodyModel[22].setRotationPoint(60F, 3.8F, -20F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 40, 6, 33, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 12
		bodyModel[23].setRotationPoint(115F, 3.8F, -16.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 36, 6, 23, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 13
		bodyModel[24].setRotationPoint(155F, 3.8F, -11.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 14
		bodyModel[25].setRotationPoint(191F, 3.8F, -5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 15
		bodyModel[26].setRotationPoint(195F, 3.8F, -3.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[27].setRotationPoint(196.3F, 5F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[28].setRotationPoint(196.3F, 4F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 18
		bodyModel[29].setRotationPoint(196.3F, 6F, -1.5F);

		bodyModel[30].addShapeBox(-1F, 0F, -1F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[30].setRotationPoint(188.5F, -13.2F, -8F);
		bodyModel[30].rotateAngleX = 0.17453293F;

		bodyModel[31].addShapeBox(-1F, 0F, -1F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[31].setRotationPoint(188.5F, -13.2F, 8F);
		bodyModel[31].rotateAngleX = -0.17453293F;

		bodyModel[32].addShapeBox(-1F, 0F, -1F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[32].setRotationPoint(168.5F, -13.2F, 10.5F);
		bodyModel[32].rotateAngleX = -0.17453293F;

		bodyModel[33].addShapeBox(-1F, 0F, -1F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[33].setRotationPoint(168.5F, -13.2F, -10.5F);
		bodyModel[33].rotateAngleX = 0.17453293F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 41, 1, 26, 0F,0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F); // Box 23
		bodyModel[34].setRotationPoint(127F, -2.2F, -13F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 80, 6, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[35].setRotationPoint(-80F, 3.8F, -22F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 60, 6, 44, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 25
		bodyModel[36].setRotationPoint(-140F, 3.8F, -22F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 45, 6, 40, 0F,0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F); // Box 26
		bodyModel[37].setRotationPoint(-185F, 3.8F, -20F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 15, 6, 29, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 27
		bodyModel[38].setRotationPoint(-200F, 3.8F, -14.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 50, 6, 46, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 28
		bodyModel[39].setRotationPoint(-146F, -2.2F, -23F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 80, 6, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[40].setRotationPoint(-96F, -2.2F, -23F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 60, 6, 46, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 30
		bodyModel[41].setRotationPoint(-16F, -2.2F, -23F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 55, 6, 42, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 31
		bodyModel[42].setRotationPoint(44F, -2.2F, -21F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 39, 6, 35, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 32
		bodyModel[43].setRotationPoint(99F, -2.2F, -17.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 50, 10, 44, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 33
		bodyModel[44].setRotationPoint(-146F, -12.2F, -22F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 80, 10, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[45].setRotationPoint(-96F, -12.2F, -22F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 60, 10, 44, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 35
		bodyModel[46].setRotationPoint(-16F, -12.2F, -22F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 55, 10, 40, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 36
		bodyModel[47].setRotationPoint(44F, -12.2F, -20F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 40, 10, 33, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 37
		bodyModel[48].setRotationPoint(99F, -12.2F, -16.5F);

		bodyModel[49].addShapeBox(-1F, 0F, -1F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[49].setRotationPoint(-184.5F, -13.2F, -15F);
		bodyModel[49].rotateAngleX = 0.17453293F;

		bodyModel[50].addShapeBox(-1F, 0F, -1F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[50].setRotationPoint(-184.5F, -13.2F, 15F);
		bodyModel[50].rotateAngleX = -0.17453293F;

		bodyModel[51].addShapeBox(-4F, 0F, -1F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[51].setRotationPoint(-164.5F, -13.2F, 16.5F);
		bodyModel[51].rotateAngleX = -0.12217305F;

		bodyModel[52].addShapeBox(-4F, 0F, -1F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[52].setRotationPoint(-164.5F, -13.2F, -16.5F);
		bodyModel[52].rotateAngleX = 0.12217305F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 80, 10, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 42
		bodyModel[53].setRotationPoint(-80F, 9.8F, -22F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 80, 7, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 43
		bodyModel[54].setRotationPoint(-80F, 19.8F, -17F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 60, 10, 44, 0F,18F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, -4F, 18F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, -5F, 18F, 0F, -8F); // Box 44
		bodyModel[55].setRotationPoint(-140F, 9.8F, -22F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 15, 4, 29, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, -1.5F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, -1.5F, -10F); // Box 45
		bodyModel[56].setRotationPoint(-200F, 9.8F, -14.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 27, 10, 40, 0F,0F, 0F, -5.5F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, -5.5F, 0F, -6F, -10.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, -10.5F); // Box 46
		bodyModel[57].setRotationPoint(-185F, 9.8F, -20F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 60, 10, 44, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -5F); // Box 47
		bodyModel[58].setRotationPoint(0F, 9.8F, -22F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 55, 10, 40, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, 0F, -5F); // Box 48
		bodyModel[59].setRotationPoint(60F, 9.8F, -20F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 40, 10, 33, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -5F); // Box 49
		bodyModel[60].setRotationPoint(115F, 9.8F, -16.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 36, 10, 23, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -5F); // Box 50
		bodyModel[61].setRotationPoint(155F, 9.8F, -11.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 10, 11, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, -3F); // Box 51
		bodyModel[62].setRotationPoint(191F, 9.8F, -5.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 4F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -1F, 4F, 0F, -1F); // Box 52
		bodyModel[63].setRotationPoint(195F, 9.8F, -3.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 36, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, -12F, 0F, -5F, -12F, 0F, -5F, 0F, 0F, -3F); // Box 53
		bodyModel[64].setRotationPoint(155F, 19.8F, -6.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 40, 7, 23, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -5F); // Box 54
		bodyModel[65].setRotationPoint(115F, 19.8F, -11.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 55, 7, 30, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, 0F, -7F); // Box 55
		bodyModel[66].setRotationPoint(60F, 19.8F, -15F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 60, 7, 34, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -8F); // Box 56
		bodyModel[67].setRotationPoint(0F, 19.8F, -17F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 70, 7, 34, 0F,8F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, -3F, -1F, -2F, -16F, 0F, 0F, -8F, 0F, 0F, -8F, -1F, -2F, -16F); // Box 57
		bodyModel[68].setRotationPoint(-150F, 19.8F, -17F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 64, 3, 9, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 4F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 69
		bodyModel[69].setRotationPoint(-146F, -12.2F, -29F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 22, 3, 7, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 70
		bodyModel[70].setRotationPoint(-82F, -12.2F, -27F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 43, 3, 7, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 71
		bodyModel[71].setRotationPoint(-60F, -12.2F, -29F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 43, 3, 2, 0F,-2F, -0.3F, 0F, -4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, -4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 72
		bodyModel[72].setRotationPoint(-60F, -12.2F, -31F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 74
		bodyModel[73].setRotationPoint(121F, -12.2F, -28F);

		bodyModel[74].addShapeBox(-7F, 0F, 0F, 7, 3, 7, 0F,0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 75
		bodyModel[74].setRotationPoint(121F, -12.2F, -28F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F); // Box 76
		bodyModel[75].setRotationPoint(105F, -12.2F, -30F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 77
		bodyModel[76].setRotationPoint(103F, -12.2F, -26F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 26, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -12F, 0F, -0.2F, -12F, 0F, -0.2F, 12F, 0F, -0.2F, 12F); // Box 79
		bodyModel[77].setRotationPoint(130F, -10.2F, -23F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F); // Box 80
		bodyModel[78].setRotationPoint(128F, -12.2F, -29F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 81
		bodyModel[79].setRotationPoint(126F, -12.2F, -25F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 82
		bodyModel[80].setRotationPoint(105F, -12.2F, -22F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 83
		bodyModel[81].setRotationPoint(128F, -12.2F, -21F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 26, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -12F, 0F, -0.2F, -12F, 0F, -0.2F, 12F, 0F, -0.2F, 12F); // Box 84
		bodyModel[82].setRotationPoint(107F, -10.2F, -25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 85
		bodyModel[83].setRotationPoint(106F, -14.2F, -28F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 86
		bodyModel[84].setRotationPoint(107.5F, -14F, -33F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 87
		bodyModel[85].setRotationPoint(109.5F, -14F, -33F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 88
		bodyModel[86].setRotationPoint(132.5F, -14F, -32F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 89
		bodyModel[87].setRotationPoint(130.5F, -14F, -32F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 90
		bodyModel[88].setRotationPoint(129F, -14.2F, -27F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F); // Box 91
		bodyModel[89].setRotationPoint(-39F, -12.2F, -37F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 92
		bodyModel[90].setRotationPoint(-36.5F, -14F, -40F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 93
		bodyModel[91].setRotationPoint(-34.5F, -14F, -40F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 94
		bodyModel[92].setRotationPoint(-38F, -14.2F, -35F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 95
		bodyModel[93].setRotationPoint(-41F, -12.2F, -33F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 96
		bodyModel[94].setRotationPoint(-39F, -12.2F, -29F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 23, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -12F, 0F, -0.2F, -12F, 0F, -0.2F, 12F, 0F, -0.2F, 12F); // Box 97
		bodyModel[95].setRotationPoint(-37F, -10.2F, -32F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F); // Box 98
		bodyModel[96].setRotationPoint(-67F, -12.2F, -37F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 99
		bodyModel[97].setRotationPoint(-64.5F, -14F, -40F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 100
		bodyModel[98].setRotationPoint(-62.5F, -14F, -40F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 101
		bodyModel[99].setRotationPoint(-66F, -14.2F, -35F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 102
		bodyModel[100].setRotationPoint(-69F, -12.2F, -33F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 103
		bodyModel[101].setRotationPoint(-67F, -12.2F, -29F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 23, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -12F, 0F, -0.2F, -12F, 0F, -0.2F, 12F, 0F, -0.2F, 12F); // Box 104
		bodyModel[102].setRotationPoint(-65F, -10.2F, -32F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 105
		bodyModel[103].setRotationPoint(-68F, -12.2F, 31F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 106
		bodyModel[104].setRotationPoint(-65.5F, -14F, 30F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 107
		bodyModel[105].setRotationPoint(-63.5F, -14F, 30F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 108
		bodyModel[106].setRotationPoint(-67F, -14.2F, 29F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 109
		bodyModel[107].setRotationPoint(-70F, -12.2F, 27F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F); // Box 110
		bodyModel[108].setRotationPoint(-68F, -12.2F, 23F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 26, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 12F, 0F, -0.2F, 12F, 0F, -0.2F, -12F, 0F, -0.2F, -12F); // Box 111
		bodyModel[109].setRotationPoint(-66F, -10.2F, 26F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 112
		bodyModel[110].setRotationPoint(-39F, -12.2F, 31F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 113
		bodyModel[111].setRotationPoint(-36.5F, -14F, 30F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 114
		bodyModel[112].setRotationPoint(-34.5F, -14F, 30F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 115
		bodyModel[113].setRotationPoint(-38F, -14.2F, 29F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 116
		bodyModel[114].setRotationPoint(-41F, -12.2F, 27F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F); // Box 117
		bodyModel[115].setRotationPoint(-39F, -12.2F, 23F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 26, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 12F, 0F, -0.2F, 12F, 0F, -0.2F, -12F, 0F, -0.2F, -12F); // Box 118
		bodyModel[116].setRotationPoint(-37F, -10.2F, 26F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 119
		bodyModel[117].setRotationPoint(-16F, -12.2F, 31F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 120
		bodyModel[118].setRotationPoint(-13.5F, -14F, 30F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 121
		bodyModel[119].setRotationPoint(-11.5F, -14F, 30F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 122
		bodyModel[120].setRotationPoint(-15F, -14.2F, 29F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 123
		bodyModel[121].setRotationPoint(-18F, -12.2F, 27F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F); // Box 124
		bodyModel[122].setRotationPoint(-16F, -12.2F, 23F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 26, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 12F, 0F, -0.2F, 12F, 0F, -0.2F, -12F, 0F, -0.2F, -12F); // Box 125
		bodyModel[123].setRotationPoint(-14F, -10.2F, 26F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 126
		bodyModel[124].setRotationPoint(105F, -12.2F, 26F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 127
		bodyModel[125].setRotationPoint(107.5F, -14F, 25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 128
		bodyModel[126].setRotationPoint(109.5F, -14F, 25F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 129
		bodyModel[127].setRotationPoint(106F, -14.2F, 24F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 130
		bodyModel[128].setRotationPoint(103F, -12.2F, 22F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F); // Box 131
		bodyModel[129].setRotationPoint(105F, -12.2F, 18F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 26, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 12F, 0F, -0.2F, 12F, 0F, -0.2F, -12F, 0F, -0.2F, -12F); // Box 132
		bodyModel[130].setRotationPoint(107F, -10.2F, 21F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 16, 8, 18, 0F,0F, -6.5F, 0F, -0.5F, -6.5F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 5.5F, 0F, -0.5F, 5.5F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 133
		bodyModel[131].setRotationPoint(4F, -12.2F, -38F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F); // Box 134
		bodyModel[132].setRotationPoint(-23F, -12.2F, 21F);

		bodyModel[133].addShapeBox(-8F, 0F, 0F, 8, 3, 9, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F); // Box 135
		bodyModel[133].setRotationPoint(-23F, -12.2F, 21F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 136
		bodyModel[134].setRotationPoint(-95.5F, -12.2F, -29F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 137
		bodyModel[135].setRotationPoint(-95.5F, -12.2F, -26F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 138
		bodyModel[136].setRotationPoint(-95.5F, -12.2F, -32F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 19, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -11F, 0F, -0.2F, -11F, 0F, -0.2F, 11F, 0F, -0.2F, 11F); // Box 139
		bodyModel[137].setRotationPoint(-92.5F, -10.2F, -29.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 140
		bodyModel[138].setRotationPoint(-93F, -14F, -30F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 141
		bodyModel[139].setRotationPoint(-92F, -13.8F, -31F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 142
		bodyModel[140].setRotationPoint(-91F, -13.8F, -31F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 143
		bodyModel[141].setRotationPoint(-102F, -13.8F, -31F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 144
		bodyModel[142].setRotationPoint(-103F, -13.8F, -31F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 145
		bodyModel[143].setRotationPoint(-104F, -14F, -30F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 146
		bodyModel[144].setRotationPoint(-106.5F, -12.2F, -29F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 147
		bodyModel[145].setRotationPoint(-106.5F, -12.2F, -26F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 148
		bodyModel[146].setRotationPoint(-106.5F, -12.2F, -32F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 19, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -11F, 0F, -0.2F, -11F, 0F, -0.2F, 11F, 0F, -0.2F, 11F); // Box 149
		bodyModel[147].setRotationPoint(-103.5F, -10.2F, -29.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 150
		bodyModel[148].setRotationPoint(-117F, -13.8F, -31F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 151
		bodyModel[149].setRotationPoint(-118F, -13.8F, -31F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 152
		bodyModel[150].setRotationPoint(-119F, -14F, -30F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 153
		bodyModel[151].setRotationPoint(-121.5F, -12.2F, -29F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 154
		bodyModel[152].setRotationPoint(-121.5F, -12.2F, -26F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 155
		bodyModel[153].setRotationPoint(-121.5F, -12.2F, -32F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 15, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -11F, 0F, -0.2F, -11F, 0F, -0.2F, 11F, 0F, -0.2F, 11F); // Box 156
		bodyModel[154].setRotationPoint(-118.5F, -10.2F, -29.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 157
		bodyModel[155].setRotationPoint(-131F, -13.8F, -31F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 158
		bodyModel[156].setRotationPoint(-132F, -13.8F, -31F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 159
		bodyModel[157].setRotationPoint(-133F, -14F, -30F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 160
		bodyModel[158].setRotationPoint(-135.5F, -12.2F, -29F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 161
		bodyModel[159].setRotationPoint(-135.5F, -12.2F, -26F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 162
		bodyModel[160].setRotationPoint(-135.5F, -12.2F, -32F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 15, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -11F, 0F, -0.2F, -11F, 0F, -0.2F, 11F, 0F, -0.2F, 11F); // Box 163
		bodyModel[161].setRotationPoint(-132.5F, -10.2F, -29.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 164
		bodyModel[162].setRotationPoint(-141F, -13.8F, -31F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 165
		bodyModel[163].setRotationPoint(-142F, -13.8F, -31F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 166
		bodyModel[164].setRotationPoint(-143F, -14F, -30F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 167
		bodyModel[165].setRotationPoint(-145.5F, -12.2F, -29F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 168
		bodyModel[166].setRotationPoint(-145.5F, -12.2F, -26F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 169
		bodyModel[167].setRotationPoint(-145.5F, -12.2F, -32F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 15, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -11F, 0F, -0.2F, -11F, 0F, -0.2F, 11F, 0F, -0.2F, 11F); // Box 170
		bodyModel[168].setRotationPoint(-142.5F, -10.2F, -29.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 171
		bodyModel[169].setRotationPoint(-142F, -13.8F, 28F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 172
		bodyModel[170].setRotationPoint(-143F, -13.8F, 28F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 173
		bodyModel[171].setRotationPoint(-144F, -14F, 27F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 174
		bodyModel[172].setRotationPoint(-146.5F, -12.2F, 26F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 175
		bodyModel[173].setRotationPoint(-146.5F, -12.2F, 23F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 176
		bodyModel[174].setRotationPoint(-146.5F, -12.2F, 29F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 15, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 11F, 0F, -0.2F, 11F, 0F, -0.2F, -11F, 0F, -0.2F, -11F); // Box 177
		bodyModel[175].setRotationPoint(-143.5F, -10.2F, 26.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 178
		bodyModel[176].setRotationPoint(-132F, -13.8F, 28F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 179
		bodyModel[177].setRotationPoint(-133F, -13.8F, 28F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 180
		bodyModel[178].setRotationPoint(-134F, -14F, 27F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 181
		bodyModel[179].setRotationPoint(-136.5F, -12.2F, 26F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 182
		bodyModel[180].setRotationPoint(-136.5F, -12.2F, 23F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 183
		bodyModel[181].setRotationPoint(-136.5F, -12.2F, 29F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 15, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 11F, 0F, -0.2F, 11F, 0F, -0.2F, -11F, 0F, -0.2F, -11F); // Box 184
		bodyModel[182].setRotationPoint(-133.5F, -10.2F, 26.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 185
		bodyModel[183].setRotationPoint(-120F, -13.8F, 28F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 186
		bodyModel[184].setRotationPoint(-121F, -13.8F, 28F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 187
		bodyModel[185].setRotationPoint(-122F, -14F, 27F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 188
		bodyModel[186].setRotationPoint(-124.5F, -12.2F, 26F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 189
		bodyModel[187].setRotationPoint(-124.5F, -12.2F, 23F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 190
		bodyModel[188].setRotationPoint(-124.5F, -12.2F, 29F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 15, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 11F, 0F, -0.2F, 11F, 0F, -0.2F, -11F, 0F, -0.2F, -11F); // Box 191
		bodyModel[189].setRotationPoint(-121.5F, -10.2F, 26.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 192
		bodyModel[190].setRotationPoint(-103F, -13.8F, 28F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 193
		bodyModel[191].setRotationPoint(-104F, -13.8F, 28F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 194
		bodyModel[192].setRotationPoint(-105F, -14F, 27F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 195
		bodyModel[193].setRotationPoint(-107.5F, -12.2F, 26F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 196
		bodyModel[194].setRotationPoint(-107.5F, -12.2F, 23F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 197
		bodyModel[195].setRotationPoint(-107.5F, -12.2F, 29F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 19, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 11F, 0F, -0.2F, 11F, 0F, -0.2F, -11F, 0F, -0.2F, -11F); // Box 198
		bodyModel[196].setRotationPoint(-104.5F, -10.2F, 26.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 199
		bodyModel[197].setRotationPoint(-92F, -13.8F, 26F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 200
		bodyModel[198].setRotationPoint(-93F, -13.8F, 26F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 201
		bodyModel[199].setRotationPoint(-94F, -14F, 25F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 202
		bodyModel[200].setRotationPoint(-96.5F, -12.2F, 24F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 203
		bodyModel[201].setRotationPoint(-96.5F, -12.2F, 21F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 204
		bodyModel[202].setRotationPoint(-96.5F, -12.2F, 27F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 19, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 11F, 0F, -0.2F, 11F, 0F, -0.2F, -11F, 0F, -0.2F, -11F); // Box 205
		bodyModel[203].setRotationPoint(-93.5F, -10.2F, 24.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 33, 3, 9, 0F,0F, -0.3F, 0F, 4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 206
		bodyModel[204].setRotationPoint(-146.5F, -12.2F, 19F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 31, 3, 7, 0F,0F, -0.3F, 0F, 4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 207
		bodyModel[205].setRotationPoint(-113.5F, -12.2F, 19F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 49, 3, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 3F, 0F, -0.2F, 0F); // Box 208
		bodyModel[206].setRotationPoint(-72.5F, -12.2F, 20F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 209
		bodyModel[207].setRotationPoint(-78.5F, -12.2F, 20F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 5, 3, 13, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 210
		bodyModel[208].setRotationPoint(-56F, -12.2F, 23F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 8, 3, 13, 0F,0F, -0.3F, 0F, 3F, -0.3F, 0F, -3F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 3F, -0.3F, 0F, -3F, -0.3F, -2F, 0F, -0.3F, 0F); // Box 211
		bodyModel[209].setRotationPoint(-51F, -12.2F, 23F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 9, 3, 15, 0F,0F, -0.3F, 0F, 3F, -0.3F, 0F, -3F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 3F, -0.3F, 0F, -3F, -0.3F, -2F, 0F, -0.3F, 0F); // Box 212
		bodyModel[210].setRotationPoint(2F, -12.2F, 21F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 5, 3, 15, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 213
		bodyModel[211].setRotationPoint(-3F, -12.2F, 21F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F); // Box 214
		bodyModel[212].setRotationPoint(-10F, -12.2F, 21F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, -0.2F, 0F, 8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 215
		bodyModel[213].setRotationPoint(11.5F, -12.2F, 20F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 216
		bodyModel[214].setRotationPoint(25F, -14F, 29F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 217
		bodyModel[215].setRotationPoint(26F, -13.8F, 30F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 218
		bodyModel[216].setRotationPoint(27F, -13.8F, 30F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 219
		bodyModel[217].setRotationPoint(22.5F, -12.2F, 31F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 220
		bodyModel[218].setRotationPoint(22.5F, -12.2F, 28F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 221
		bodyModel[219].setRotationPoint(22.5F, -12.2F, 25F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 11F, 0F, -0.2F, 11F, 0F, -0.2F, -11F, 0F, -0.2F, -11F); // Box 222
		bodyModel[220].setRotationPoint(25.5F, -10.2F, 28.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 44, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[221].setRotationPoint(29.5F, -12.2F, 20F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 224
		bodyModel[222].setRotationPoint(47.5F, -12.2F, 27F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 225
		bodyModel[223].setRotationPoint(47.5F, -12.2F, 24F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 226
		bodyModel[224].setRotationPoint(47.5F, -12.2F, 21F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 227
		bodyModel[225].setRotationPoint(51F, -13.8F, 26F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 228
		bodyModel[226].setRotationPoint(50F, -14F, 25F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 229
		bodyModel[227].setRotationPoint(52F, -13.8F, 26F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 11F, 0F, -0.2F, 11F, 0F, -0.2F, -11F, 0F, -0.2F, -11F); // Box 230
		bodyModel[228].setRotationPoint(50.5F, -10.2F, 24.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F); // Box 231
		bodyModel[229].setRotationPoint(66.5F, -12.2F, 27F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 232
		bodyModel[230].setRotationPoint(66.5F, -12.2F, 24F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 233
		bodyModel[231].setRotationPoint(66.5F, -12.2F, 21F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 234
		bodyModel[232].setRotationPoint(70F, -13.8F, 26F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 235
		bodyModel[233].setRotationPoint(69F, -14F, 25F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 236
		bodyModel[234].setRotationPoint(71F, -13.8F, 26F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 11F, 0F, -0.2F, 11F, 0F, -0.2F, -11F, 0F, -0.2F, -11F); // Box 237
		bodyModel[235].setRotationPoint(69.5F, -10.2F, 24.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 238
		bodyModel[236].setRotationPoint(74.5F, -12.2F, 20F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 12, 3, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 0F); // Box 239
		bodyModel[237].setRotationPoint(91.5F, -12.2F, 20F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 12, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[238].setRotationPoint(36.5F, -12.2F, -33F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 5, 3, 15, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[239].setRotationPoint(31.5F, -12.2F, -33F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 242
		bodyModel[240].setRotationPoint(24.5F, -12.2F, -37F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 243
		bodyModel[241].setRotationPoint(28F, -13.8F, -36F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 244
		bodyModel[242].setRotationPoint(27F, -14F, -35F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 245
		bodyModel[243].setRotationPoint(29F, -13.8F, -36F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 9, 3, 15, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 246
		bodyModel[244].setRotationPoint(24.5F, -12.2F, -34F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 52, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[245].setRotationPoint(-18.5F, -9.2F, -27.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 42, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 678
		bodyModel[246].setRotationPoint(-133F, 23.52F, -13F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		bodyModel[247].setRotationPoint(-140F, 24F, -12.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 685
		bodyModel[248].setRotationPoint(-165F, 18F, -9F);
		bodyModel[248].rotateAngleX = 1.32645023F;

		bodyModel[249].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[249].setRotationPoint(-139F, 24.5F, -12F);

		bodyModel[250].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		bodyModel[250].setRotationPoint(-139F, 24.5F, -12F);
		bodyModel[250].rotateAngleX = 2.0943951F;

		bodyModel[251].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[251].setRotationPoint(-139F, 24.5F, -12F);
		bodyModel[251].rotateAngleX = 4.1887902F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 42, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 4F, 0F, -4F, 0F, 0F, 0F); // Box 254
		bodyModel[252].setRotationPoint(-133F, 23.52F, 11F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[253].setRotationPoint(-140F, 24F, 11.5F);

		bodyModel[254].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[254].setRotationPoint(-139F, 24.5F, 12F);

		bodyModel[255].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[255].setRotationPoint(-139F, 24.5F, 12F);
		bodyModel[255].rotateAngleX = 2.0943951F;

		bodyModel[256].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[256].setRotationPoint(-139F, 24.5F, 12F);
		bodyModel[256].rotateAngleX = 4.1887902F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[257].setRotationPoint(-160F, 23F, -7.5F);

		bodyModel[258].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[258].setRotationPoint(-159F, 23.5F, -7F);

		bodyModel[259].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[259].setRotationPoint(-159F, 23.5F, -7F);
		bodyModel[259].rotateAngleX = 4.1887902F;

		bodyModel[260].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[260].setRotationPoint(-159F, 23.5F, -7F);
		bodyModel[260].rotateAngleX = 2.0943951F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 42, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 263
		bodyModel[261].setRotationPoint(-153F, 22.52F, -8F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[262].setRotationPoint(-160F, 23F, 6.5F);

		bodyModel[263].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[263].setRotationPoint(-159F, 23.5F, 7F);

		bodyModel[264].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[264].setRotationPoint(-159F, 23.5F, 7F);
		bodyModel[264].rotateAngleX = 4.1887902F;

		bodyModel[265].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[265].setRotationPoint(-159F, 23.5F, 7F);
		bodyModel[265].rotateAngleX = 2.0943951F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 42, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 4F, 0F, -4F, 0F, 0F, 0F); // Box 268
		bodyModel[266].setRotationPoint(-153F, 22.52F, 6F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 12, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 270
		bodyModel[267].setRotationPoint(-202F, -15.2F, 16F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 12, 3, 8, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[268].setRotationPoint(-202F, -15.2F, -24F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 11, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[269].setRotationPoint(135.5F, -15.4F, -16.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 11, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // Box 275
		bodyModel[270].setRotationPoint(146.5F, -15.4F, -16.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 11, 1, 33, 0F,0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F); // Box 278
		bodyModel[271].setRotationPoint(124.5F, -15.4F, -16.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 279
		bodyModel[272].setRotationPoint(-177F, -15.3F, 0F);

		bodyModel[273].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[273].setRotationPoint(-169F, -15.3F, 0F);

		bodyModel[274].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 281
		bodyModel[274].setRotationPoint(-161F, -15.3F, 0F);

		bodyModel[275].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 282
		bodyModel[275].setRotationPoint(-137F, -15.3F, 0F);

		bodyModel[276].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 283
		bodyModel[276].setRotationPoint(-145F, -15.3F, 0F);

		bodyModel[277].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 284
		bodyModel[277].setRotationPoint(-153F, -15.3F, 0F);

		bodyModel[278].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 285
		bodyModel[278].setRotationPoint(-89F, -15.3F, 0F);

		bodyModel[279].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 286
		bodyModel[279].setRotationPoint(-97F, -15.3F, 0F);

		bodyModel[280].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 287
		bodyModel[280].setRotationPoint(-105F, -15.3F, 0F);

		bodyModel[281].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 288
		bodyModel[281].setRotationPoint(-129F, -15.3F, 0F);

		bodyModel[282].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[282].setRotationPoint(-121F, -15.3F, 0F);

		bodyModel[283].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 290
		bodyModel[283].setRotationPoint(-113F, -15.3F, 0F);

		bodyModel[284].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 291
		bodyModel[284].setRotationPoint(-41F, -15.3F, 0F);

		bodyModel[285].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 292
		bodyModel[285].setRotationPoint(-49F, -15.3F, 0F);

		bodyModel[286].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 293
		bodyModel[286].setRotationPoint(-57F, -15.3F, 0F);

		bodyModel[287].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 294
		bodyModel[287].setRotationPoint(-81F, -15.3F, 0F);

		bodyModel[288].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 295
		bodyModel[288].setRotationPoint(-73F, -15.3F, 0F);

		bodyModel[289].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 296
		bodyModel[289].setRotationPoint(-65F, -15.3F, 0F);

		bodyModel[290].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 297
		bodyModel[290].setRotationPoint(7F, -15.3F, 0F);

		bodyModel[291].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 298
		bodyModel[291].setRotationPoint(-1F, -15.3F, 0F);

		bodyModel[292].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 299
		bodyModel[292].setRotationPoint(-9F, -15.3F, 0F);

		bodyModel[293].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 300
		bodyModel[293].setRotationPoint(-33F, -15.3F, 0F);

		bodyModel[294].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 301
		bodyModel[294].setRotationPoint(-25F, -15.3F, 0F);

		bodyModel[295].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 302
		bodyModel[295].setRotationPoint(-17F, -15.3F, 0F);

		bodyModel[296].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 303
		bodyModel[296].setRotationPoint(55F, -15.3F, 0F);

		bodyModel[297].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 304
		bodyModel[297].setRotationPoint(47F, -15.3F, 0F);

		bodyModel[298].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 305
		bodyModel[298].setRotationPoint(39F, -15.3F, 0F);

		bodyModel[299].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 306
		bodyModel[299].setRotationPoint(15F, -15.3F, 0F);

		bodyModel[300].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 307
		bodyModel[300].setRotationPoint(23F, -15.3F, 0F);

		bodyModel[301].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 308
		bodyModel[301].setRotationPoint(31F, -15.3F, 0F);

		bodyModel[302].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 309
		bodyModel[302].setRotationPoint(71F, -15.3F, 0F);

		bodyModel[303].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 310
		bodyModel[303].setRotationPoint(63F, -15.3F, 0F);

		bodyModel[304].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 311
		bodyModel[304].setRotationPoint(79F, -15.3F, 0F);

		bodyModel[305].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 312
		bodyModel[305].setRotationPoint(95F, -15.3F, 0F);

		bodyModel[306].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 313
		bodyModel[306].setRotationPoint(87F, -15.3F, 0F);

		bodyModel[307].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 314
		bodyModel[307].setRotationPoint(191F, -15.3F, 0F);

		bodyModel[308].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 315
		bodyModel[308].setRotationPoint(183F, -15.3F, 0F);

		bodyModel[309].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 316
		bodyModel[309].setRotationPoint(39F, -15.3F, 14F);

		bodyModel[310].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 317
		bodyModel[310].setRotationPoint(43F, -15.3F, 14F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 52F, 0F, 0F, 52F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 52F, 0F, 0F, 52F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[311].setRotationPoint(100F, -15.3F, 13.2F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 52F, 0F, 0F, 52F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 52F, 0F, 0F, 52F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[312].setRotationPoint(134F, -15.3F, 13.2F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 52F, 0F, 0F, 52F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 52F, 0F, 0F, 52F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[313].setRotationPoint(100F, -15.3F, -14.1F);
		bodyModel[313].rotateAngleY = 0.01047198F;

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 52F, 0F, 0F, 52F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 52F, 0F, 0F, 52F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[314].setRotationPoint(134F, -15.3F, -13.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[315].setRotationPoint(40F, -15.3F, -14F);

		bodyModel[316].addBox(-16F, 0F, -0.5F, 16, 1, 1, 0F); // Box 323
		bodyModel[316].setRotationPoint(175F, -15.3F, 1F);
		bodyModel[316].rotateAngleY = -0.48869219F;

		bodyModel[317].addBox(-16F, 0F, -0.5F, 16, 1, 1, 0F); // Box 324
		bodyModel[317].setRotationPoint(175F, -15.3F, 1F);
		bodyModel[317].rotateAngleY = 0.48869219F;

		bodyModel[318].addBox(-15F, 0F, -0.5F, 15, 1, 1, 0F); // Box 325
		bodyModel[318].setRotationPoint(175F, -15.3F, 1F);
		bodyModel[318].rotateAngleY = 0.34906585F;

		bodyModel[319].addBox(-15F, 0F, -0.5F, 15, 1, 1, 0F); // Box 326
		bodyModel[319].setRotationPoint(175F, -15.3F, 1F);
		bodyModel[319].rotateAngleY = -0.34906585F;

		bodyModel[320].addBox(-14F, 0F, -0.5F, 14, 1, 1, 0F); // Box 327
		bodyModel[320].setRotationPoint(175F, -15.3F, 1F);
		bodyModel[320].rotateAngleY = -0.17453293F;

		bodyModel[321].addBox(-14F, 0F, -0.5F, 14, 1, 1, 0F); // Box 328
		bodyModel[321].setRotationPoint(175F, -15.3F, 1F);
		bodyModel[321].rotateAngleY = 0.17453293F;
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 849, 161, textureX, textureY); // Box 702

		leftFrontWheelModel[0].addShapeBox(-7F, 0F, -0.5F, 9, 8, 1, 0F,0.5F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 1F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 702
		leftFrontWheelModel[0].setRotationPoint(-166F, 17F, 0F);
	}
}