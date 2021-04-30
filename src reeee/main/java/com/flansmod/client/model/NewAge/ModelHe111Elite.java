//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.03.2017 - 17:52:14
// Last changed on: 14.03.2017 - 17:52:14

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHe111Elite extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelHe111Elite() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[505];
		tailModel = new ModelRendererTurbo[39];
		leftWingModel = new ModelRendererTurbo[74];
		rightWingModel = new ModelRendererTurbo[68];
		tailWheelModel = new ModelRendererTurbo[10];
		leftWingWheelModel = new ModelRendererTurbo[16];
		rightWingWheelModel = new ModelRendererTurbo[16];

		initbodyModel_1();
		initbodyModel_2();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 10
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 1185, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 1369, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 1449, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 1529, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 1609, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 1793, 1, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 1817, 1, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 9, 274, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 1025, 9, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 585, 9, textureX, textureY); // Box 53
		bodyModel[48] = new ModelRendererTurbo(this, 1193, 9, textureX, textureY); // Box 54
		bodyModel[49] = new ModelRendererTurbo(this, 1281, 9, textureX, textureY); // Box 55
		bodyModel[50] = new ModelRendererTurbo(this, 1361, 9, textureX, textureY); // Box 56
		bodyModel[51] = new ModelRendererTurbo(this, 1689, 9, textureX, textureY); // Box 57
		bodyModel[52] = new ModelRendererTurbo(this, 1905, 9, textureX, textureY); // Box 58
		bodyModel[53] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 1049, 9, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 1537, 9, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 1985, 9, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 1585, 9, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 2017, 9, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 69
		bodyModel[66] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 70
		bodyModel[67] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 71
		bodyModel[68] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 72
		bodyModel[69] = new ModelRendererTurbo(this, 1049, 17, textureX, textureY); // Box 73
		bodyModel[70] = new ModelRendererTurbo(this, 1161, 17, textureX, textureY); // Box 74
		bodyModel[71] = new ModelRendererTurbo(this, 1265, 17, textureX, textureY); // Box 76
		bodyModel[72] = new ModelRendererTurbo(this, 1313, 17, textureX, textureY); // Box 77
		bodyModel[73] = new ModelRendererTurbo(this, 1449, 17, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 1489, 17, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 1529, 17, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 1561, 17, textureX, textureY); // Box 83
		bodyModel[77] = new ModelRendererTurbo(this, 1593, 17, textureX, textureY); // Box 84
		bodyModel[78] = new ModelRendererTurbo(this, 1617, 17, textureX, textureY); // Box 85
		bodyModel[79] = new ModelRendererTurbo(this, 1641, 17, textureX, textureY); // Box 90
		bodyModel[80] = new ModelRendererTurbo(this, 1721, 17, textureX, textureY); // Box 91
		bodyModel[81] = new ModelRendererTurbo(this, 1801, 17, textureX, textureY); // Box 92
		bodyModel[82] = new ModelRendererTurbo(this, 1873, 17, textureX, textureY); // Box 91
		bodyModel[83] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 92
		bodyModel[84] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 93
		bodyModel[85] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 98
		bodyModel[86] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 99
		bodyModel[87] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 100
		bodyModel[88] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Box 101
		bodyModel[89] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 103
		bodyModel[91] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 104
		bodyModel[92] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 105
		bodyModel[93] = new ModelRendererTurbo(this, 1153, 25, textureX, textureY); // Box 106
		bodyModel[94] = new ModelRendererTurbo(this, 1241, 25, textureX, textureY); // Box 107
		bodyModel[95] = new ModelRendererTurbo(this, 1321, 25, textureX, textureY); // Box 108
		bodyModel[96] = new ModelRendererTurbo(this, 1393, 25, textureX, textureY); // Box 109
		bodyModel[97] = new ModelRendererTurbo(this, 1521, 25, textureX, textureY); // Box 110
		bodyModel[98] = new ModelRendererTurbo(this, 1889, 25, textureX, textureY); // Box 101
		bodyModel[99] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 102
		bodyModel[100] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 103
		bodyModel[101] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 104
		bodyModel[102] = new ModelRendererTurbo(this, 1985, 17, textureX, textureY); // Box 105
		bodyModel[103] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 106
		bodyModel[104] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 107
		bodyModel[105] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 108
		bodyModel[106] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 109
		bodyModel[107] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Box 110
		bodyModel[108] = new ModelRendererTurbo(this, 1801, 25, textureX, textureY); // Box 111
		bodyModel[109] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 112
		bodyModel[110] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 113
		bodyModel[111] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 114
		bodyModel[112] = new ModelRendererTurbo(this, 1089, 33, textureX, textureY); // Box 115
		bodyModel[113] = new ModelRendererTurbo(this, 1129, 33, textureX, textureY); // Box 116
		bodyModel[114] = new ModelRendererTurbo(this, 1169, 33, textureX, textureY); // Box 117
		bodyModel[115] = new ModelRendererTurbo(this, 1313, 33, textureX, textureY); // Box 118
		bodyModel[116] = new ModelRendererTurbo(this, 1841, 25, textureX, textureY); // Box 123
		bodyModel[117] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 124
		bodyModel[118] = new ModelRendererTurbo(this, 1217, 33, textureX, textureY); // Box 125
		bodyModel[119] = new ModelRendererTurbo(this, 1361, 33, textureX, textureY); // Box 126
		bodyModel[120] = new ModelRendererTurbo(this, 1393, 33, textureX, textureY); // Box 127
		bodyModel[121] = new ModelRendererTurbo(this, 1417, 33, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 1441, 33, textureX, textureY); // Box 129
		bodyModel[123] = new ModelRendererTurbo(this, 1465, 33, textureX, textureY); // Box 130
		bodyModel[124] = new ModelRendererTurbo(this, 1497, 33, textureX, textureY); // Box 131
		bodyModel[125] = new ModelRendererTurbo(this, 1609, 33, textureX, textureY); // Box 132
		bodyModel[126] = new ModelRendererTurbo(this, 1721, 33, textureX, textureY); // Box 133
		bodyModel[127] = new ModelRendererTurbo(this, 1865, 33, textureX, textureY); // Box 134
		bodyModel[128] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 135
		bodyModel[129] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 136
		bodyModel[130] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 137
		bodyModel[131] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 138
		bodyModel[132] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 134
		bodyModel[133] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 135
		bodyModel[134] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 136
		bodyModel[135] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 137
		bodyModel[136] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 138
		bodyModel[137] = new ModelRendererTurbo(this, 1129, 41, textureX, textureY); // Box 139
		bodyModel[138] = new ModelRendererTurbo(this, 1241, 41, textureX, textureY); // Box 140
		bodyModel[139] = new ModelRendererTurbo(this, 1417, 41, textureX, textureY); // Box 141
		bodyModel[140] = new ModelRendererTurbo(this, 1529, 41, textureX, textureY); // Box 142
		bodyModel[141] = new ModelRendererTurbo(this, 1641, 41, textureX, textureY); // Box 143
		bodyModel[142] = new ModelRendererTurbo(this, 1745, 41, textureX, textureY); // Box 144
		bodyModel[143] = new ModelRendererTurbo(this, 1873, 41, textureX, textureY); // Box 145
		bodyModel[144] = new ModelRendererTurbo(this, 1977, 33, textureX, textureY); // Box 146
		bodyModel[145] = new ModelRendererTurbo(this, 2001, 33, textureX, textureY); // Box 147
		bodyModel[146] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 149
		bodyModel[147] = new ModelRendererTurbo(this, 1353, 41, textureX, textureY); // Box 150
		bodyModel[148] = new ModelRendererTurbo(this, 1953, 41, textureX, textureY); // Box 151
		bodyModel[149] = new ModelRendererTurbo(this, 1985, 41, textureX, textureY); // Box 152
		bodyModel[150] = new ModelRendererTurbo(this, 2017, 41, textureX, textureY); // Box 153
		bodyModel[151] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 154
		bodyModel[152] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 155
		bodyModel[153] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 156
		bodyModel[154] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 157
		bodyModel[155] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 158
		bodyModel[156] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 159
		bodyModel[157] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 160
		bodyModel[158] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 161
		bodyModel[159] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 162
		bodyModel[160] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 163
		bodyModel[161] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 164
		bodyModel[162] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 165
		bodyModel[163] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 166
		bodyModel[164] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 167
		bodyModel[165] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 168
		bodyModel[166] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 169
		bodyModel[167] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 170
		bodyModel[168] = new ModelRendererTurbo(this, 577, 49, textureX, textureY); // Box 171
		bodyModel[169] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 172
		bodyModel[170] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 173
		bodyModel[171] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 174
		bodyModel[172] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 175
		bodyModel[173] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Box 176
		bodyModel[174] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 177
		bodyModel[175] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 178
		bodyModel[176] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 181
		bodyModel[177] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 182
		bodyModel[178] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 183
		bodyModel[179] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 184
		bodyModel[180] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 185
		bodyModel[181] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 186
		bodyModel[182] = new ModelRendererTurbo(this, 1361, 1, textureX, textureY); // Box 187
		bodyModel[183] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 188
		bodyModel[184] = new ModelRendererTurbo(this, 1889, 17, textureX, textureY); // Box 189
		bodyModel[185] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 190
		bodyModel[186] = new ModelRendererTurbo(this, 2041, 17, textureX, textureY); // Box 191
		bodyModel[187] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 192
		bodyModel[188] = new ModelRendererTurbo(this, 1273, 1, textureX, textureY); // Box 193
		bodyModel[189] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 194
		bodyModel[190] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 194
		bodyModel[191] = new ModelRendererTurbo(this, 1369, 1, textureX, textureY); // Box 197
		bodyModel[192] = new ModelRendererTurbo(this, 1449, 1, textureX, textureY); // Box 198
		bodyModel[193] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 199
		bodyModel[194] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 200
		bodyModel[195] = new ModelRendererTurbo(this, 1441, 9, textureX, textureY); // Box 201
		bodyModel[196] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 202
		bodyModel[197] = new ModelRendererTurbo(this, 1041, 9, textureX, textureY); // Box 203
		bodyModel[198] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 204
		bodyModel[199] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 205
		bodyModel[200] = new ModelRendererTurbo(this, 1985, 1, textureX, textureY); // Box 206
		bodyModel[201] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 207
		bodyModel[202] = new ModelRendererTurbo(this, 1473, 25, textureX, textureY); // Box 208
		bodyModel[203] = new ModelRendererTurbo(this, 1481, 49, textureX, textureY); // Box 229
		bodyModel[204] = new ModelRendererTurbo(this, 1025, 57, textureX, textureY); // Box 230
		bodyModel[205] = new ModelRendererTurbo(this, 1281, 57, textureX, textureY); // Box 231
		bodyModel[206] = new ModelRendererTurbo(this, 1481, 57, textureX, textureY); // Box 232
		bodyModel[207] = new ModelRendererTurbo(this, 1681, 57, textureX, textureY); // Box 233
		bodyModel[208] = new ModelRendererTurbo(this, 1905, 57, textureX, textureY); // Box 234
		bodyModel[209] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 235
		bodyModel[210] = new ModelRendererTurbo(this, 1025, 65, textureX, textureY); // Box 236
		bodyModel[211] = new ModelRendererTurbo(this, 1481, 65, textureX, textureY); // Box 238
		bodyModel[212] = new ModelRendererTurbo(this, 1681, 65, textureX, textureY); // Box 239
		bodyModel[213] = new ModelRendererTurbo(this, 1905, 65, textureX, textureY); // Box 240
		bodyModel[214] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Box 241
		bodyModel[215] = new ModelRendererTurbo(this, 1025, 73, textureX, textureY); // Box 242
		bodyModel[216] = new ModelRendererTurbo(this, 1281, 73, textureX, textureY); // Box 243
		bodyModel[217] = new ModelRendererTurbo(this, 1481, 73, textureX, textureY); // Box 244
		bodyModel[218] = new ModelRendererTurbo(this, 1145, 49, textureX, textureY); // Box 245
		bodyModel[219] = new ModelRendererTurbo(this, 1169, 49, textureX, textureY); // Box 246
		bodyModel[220] = new ModelRendererTurbo(this, 1825, 33, textureX, textureY); // Box 247
		bodyModel[221] = new ModelRendererTurbo(this, 1601, 25, textureX, textureY); // Box 248
		bodyModel[222] = new ModelRendererTurbo(this, 1401, 49, textureX, textureY); // Box 249
		bodyModel[223] = new ModelRendererTurbo(this, 1377, 41, textureX, textureY); // Box 250
		bodyModel[224] = new ModelRendererTurbo(this, 1425, 49, textureX, textureY); // Box 251
		bodyModel[225] = new ModelRendererTurbo(this, 1601, 49, textureX, textureY); // Box 252
		bodyModel[226] = new ModelRendererTurbo(this, 1625, 49, textureX, textureY); // Box 253
		bodyModel[227] = new ModelRendererTurbo(this, 1681, 49, textureX, textureY); // Box 254
		bodyModel[228] = new ModelRendererTurbo(this, 1705, 49, textureX, textureY); // Box 255
		bodyModel[229] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 256
		bodyModel[230] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 257
		bodyModel[231] = new ModelRendererTurbo(this, 1273, 9, textureX, textureY); // Box 258
		bodyModel[232] = new ModelRendererTurbo(this, 1577, 9, textureX, textureY); // Box 261
		bodyModel[233] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 285
		bodyModel[234] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 287
		bodyModel[235] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 290
		bodyModel[236] = new ModelRendererTurbo(this, 1721, 73, textureX, textureY); // Box 293
		bodyModel[237] = new ModelRendererTurbo(this, 1945, 73, textureX, textureY); // Box 297
		bodyModel[238] = new ModelRendererTurbo(this, 1985, 73, textureX, textureY); // Box 298
		bodyModel[239] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 299
		bodyModel[240] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 300
		bodyModel[241] = new ModelRendererTurbo(this, 1593, 73, textureX, textureY); // Box 301
		bodyModel[242] = new ModelRendererTurbo(this, 1481, 153, textureX, textureY); // Box 302
		bodyModel[243] = new ModelRendererTurbo(this, 1793, 73, textureX, textureY); // Box 304
		bodyModel[244] = new ModelRendererTurbo(this, 1841, 161, textureX, textureY); // Box 305
		bodyModel[245] = new ModelRendererTurbo(this, 1785, 9, textureX, textureY); // Box 327
		bodyModel[246] = new ModelRendererTurbo(this, 1865, 41, textureX, textureY); // Box 328
		bodyModel[247] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 326
		bodyModel[248] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 327
		bodyModel[249] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 328
		bodyModel[250] = new ModelRendererTurbo(this, 1105, 81, textureX, textureY); // Box 329
		bodyModel[251] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 330
		bodyModel[252] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 331
		bodyModel[253] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 332
		bodyModel[254] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 333
		bodyModel[255] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 334
		bodyModel[256] = new ModelRendererTurbo(this, 1641, 49, textureX, textureY); // Box 335
		bodyModel[257] = new ModelRendererTurbo(this, 1729, 49, textureX, textureY); // Box 336
		bodyModel[258] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 337
		bodyModel[259] = new ModelRendererTurbo(this, 1193, 65, textureX, textureY); // Box 338
		bodyModel[260] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 339
		bodyModel[261] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 340
		bodyModel[262] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 341
		bodyModel[263] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 342
		bodyModel[264] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 343
		bodyModel[265] = new ModelRendererTurbo(this, 1345, 81, textureX, textureY); // Box 344
		bodyModel[266] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 345
		bodyModel[267] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 346
		bodyModel[268] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 347
		bodyModel[269] = new ModelRendererTurbo(this, 1481, 89, textureX, textureY); // Box 348
		bodyModel[270] = new ModelRendererTurbo(this, 1057, 89, textureX, textureY); // Box 349
		bodyModel[271] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 350
		bodyModel[272] = new ModelRendererTurbo(this, 1761, 81, textureX, textureY); // Box 351
		bodyModel[273] = new ModelRendererTurbo(this, 1601, 89, textureX, textureY); // Box 352
		bodyModel[274] = new ModelRendererTurbo(this, 1089, 89, textureX, textureY); // Box 353
		bodyModel[275] = new ModelRendererTurbo(this, 1681, 89, textureX, textureY); // Box 354
		bodyModel[276] = new ModelRendererTurbo(this, 1809, 9, textureX, textureY); // Box 355
		bodyModel[277] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 356
		bodyModel[278] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 357
		bodyModel[279] = new ModelRendererTurbo(this, 1713, 25, textureX, textureY); // Box 358
		bodyModel[280] = new ModelRendererTurbo(this, 1721, 89, textureX, textureY); // Box 359
		bodyModel[281] = new ModelRendererTurbo(this, 1793, 89, textureX, textureY); // Box 360
		bodyModel[282] = new ModelRendererTurbo(this, 1905, 89, textureX, textureY); // Box 361
		bodyModel[283] = new ModelRendererTurbo(this, 1945, 89, textureX, textureY); // Box 362
		bodyModel[284] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 363
		bodyModel[285] = new ModelRendererTurbo(this, 2001, 49, textureX, textureY); // Box 364
		bodyModel[286] = new ModelRendererTurbo(this, 1985, 89, textureX, textureY); // Box 365
		bodyModel[287] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 367
		bodyModel[288] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 368
		bodyModel[289] = new ModelRendererTurbo(this, 1361, 9, textureX, textureY); // Box 369
		bodyModel[290] = new ModelRendererTurbo(this, 1353, 17, textureX, textureY); // Box 370
		bodyModel[291] = new ModelRendererTurbo(this, 2041, 9, textureX, textureY); // Box 371
		bodyModel[292] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 372
		bodyModel[293] = new ModelRendererTurbo(this, 1193, 9, textureX, textureY); // Box 373
		bodyModel[294] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 374
		bodyModel[295] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 375
		bodyModel[296] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 376
		bodyModel[297] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 377
		bodyModel[298] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 378
		bodyModel[299] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 379
		bodyModel[300] = new ModelRendererTurbo(this, 1553, 17, textureX, textureY); // Box 380
		bodyModel[301] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 381
		bodyModel[302] = new ModelRendererTurbo(this, 1865, 25, textureX, textureY); // Box 382
		bodyModel[303] = new ModelRendererTurbo(this, 1233, 25, textureX, textureY); // Box 383
		bodyModel[304] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 384
		bodyModel[305] = new ModelRendererTurbo(this, 1441, 9, textureX, textureY); // Box 385
		bodyModel[306] = new ModelRendererTurbo(this, 1697, 49, textureX, textureY); // Box 386
		bodyModel[307] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 387
		bodyModel[308] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 388
		bodyModel[309] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 389
		bodyModel[310] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Box 390
		bodyModel[311] = new ModelRendererTurbo(this, 1193, 73, textureX, textureY); // Box 391
		bodyModel[312] = new ModelRendererTurbo(this, 1433, 73, textureX, textureY); // Box 392
		bodyModel[313] = new ModelRendererTurbo(this, 2017, 73, textureX, textureY); // Box 393
		bodyModel[314] = new ModelRendererTurbo(this, 1577, 81, textureX, textureY); // Box 394
		bodyModel[315] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 395
		bodyModel[316] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 396
		bodyModel[317] = new ModelRendererTurbo(this, 1193, 81, textureX, textureY); // Box 397
		bodyModel[318] = new ModelRendererTurbo(this, 1129, 81, textureX, textureY); // Box 398
		bodyModel[319] = new ModelRendererTurbo(this, 1529, 17, textureX, textureY); // Box 399
		bodyModel[320] = new ModelRendererTurbo(this, 1889, 17, textureX, textureY); // Box 400
		bodyModel[321] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 401
		bodyModel[322] = new ModelRendererTurbo(this, 1585, 17, textureX, textureY); // Box 402
		bodyModel[323] = new ModelRendererTurbo(this, 1977, 41, textureX, textureY); // Box 403
		bodyModel[324] = new ModelRendererTurbo(this, 1449, 49, textureX, textureY); // Box 404
		bodyModel[325] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 405
		bodyModel[326] = new ModelRendererTurbo(this, 1153, 25, textureX, textureY); // Box 406
		bodyModel[327] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 407
		bodyModel[328] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 408
		bodyModel[329] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 409
		bodyModel[330] = new ModelRendererTurbo(this, 1649, 57, textureX, textureY); // Box 410
		bodyModel[331] = new ModelRendererTurbo(this, 1849, 57, textureX, textureY); // Box 411
		bodyModel[332] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 412
		bodyModel[333] = new ModelRendererTurbo(this, 1025, 9, textureX, textureY); // Box 413
		bodyModel[334] = new ModelRendererTurbo(this, 1049, 9, textureX, textureY); // Box 414
		bodyModel[335] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 415
		bodyModel[336] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 416
		bodyModel[337] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 417
		bodyModel[338] = new ModelRendererTurbo(this, 1353, 33, textureX, textureY); // Box 418
		bodyModel[339] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 419
		bodyModel[340] = new ModelRendererTurbo(this, 1281, 9, textureX, textureY); // Box 420
		bodyModel[341] = new ModelRendererTurbo(this, 1633, 81, textureX, textureY); // Box 421
		bodyModel[342] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 422
		bodyModel[343] = new ModelRendererTurbo(this, 1481, 89, textureX, textureY); // Box 424
		bodyModel[344] = new ModelRendererTurbo(this, 1833, 81, textureX, textureY); // Box 426
		bodyModel[345] = new ModelRendererTurbo(this, 1097, 89, textureX, textureY); // Box 427
		bodyModel[346] = new ModelRendererTurbo(this, 1601, 89, textureX, textureY); // Box 428
		bodyModel[347] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 429
		bodyModel[348] = new ModelRendererTurbo(this, 1633, 89, textureX, textureY); // Box 430
		bodyModel[349] = new ModelRendererTurbo(this, 1681, 89, textureX, textureY); // Box 431
		bodyModel[350] = new ModelRendererTurbo(this, 1761, 89, textureX, textureY); // Box 432
		bodyModel[351] = new ModelRendererTurbo(this, 2017, 89, textureX, textureY); // Box 433
		bodyModel[352] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 434
		bodyModel[353] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 435
		bodyModel[354] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 436
		bodyModel[355] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 441
		bodyModel[356] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 442
		bodyModel[357] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 443
		bodyModel[358] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 444
		bodyModel[359] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 445
		bodyModel[360] = new ModelRendererTurbo(this, 1745, 89, textureX, textureY); // Box 446
		bodyModel[361] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 447
		bodyModel[362] = new ModelRendererTurbo(this, 1817, 89, textureX, textureY); // Box 448
		bodyModel[363] = new ModelRendererTurbo(this, 1929, 89, textureX, textureY); // Box 449
		bodyModel[364] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 450
		bodyModel[365] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 451
		bodyModel[366] = new ModelRendererTurbo(this, 1969, 89, textureX, textureY); // Box 452
		bodyModel[367] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 453
		bodyModel[368] = new ModelRendererTurbo(this, 1209, 33, textureX, textureY); // Box 454
		bodyModel[369] = new ModelRendererTurbo(this, 1385, 33, textureX, textureY); // Box 455
		bodyModel[370] = new ModelRendererTurbo(this, 1489, 33, textureX, textureY); // Box 456
		bodyModel[371] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 457
		bodyModel[372] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 458
		bodyModel[373] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Box 459
		bodyModel[374] = new ModelRendererTurbo(this, 785, 97, textureX, textureY); // Box 460
		bodyModel[375] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 461
		bodyModel[376] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 462
		bodyModel[377] = new ModelRendererTurbo(this, 1025, 97, textureX, textureY); // Box 463
		bodyModel[378] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 470
		bodyModel[379] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 471
		bodyModel[380] = new ModelRendererTurbo(this, 1049, 97, textureX, textureY); // Box 472
		bodyModel[381] = new ModelRendererTurbo(this, 1281, 97, textureX, textureY); // Box 473
		bodyModel[382] = new ModelRendererTurbo(this, 1313, 97, textureX, textureY); // Box 474
		bodyModel[383] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 475
		bodyModel[384] = new ModelRendererTurbo(this, 1337, 97, textureX, textureY); // Box 476
		bodyModel[385] = new ModelRendererTurbo(this, 1441, 81, textureX, textureY); // Box 477
		bodyModel[386] = new ModelRendererTurbo(this, 2033, 73, textureX, textureY); // Box 478
		bodyModel[387] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 480
		bodyModel[388] = new ModelRendererTurbo(this, 2033, 81, textureX, textureY); // Box 482
		bodyModel[389] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 483
		bodyModel[390] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Box 484
		bodyModel[391] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box 485
		bodyModel[392] = new ModelRendererTurbo(this, 1353, 97, textureX, textureY); // Box 486
		bodyModel[393] = new ModelRendererTurbo(this, 1825, 57, textureX, textureY); // Box 487
		bodyModel[394] = new ModelRendererTurbo(this, 1193, 89, textureX, textureY); // Box 488
		bodyModel[395] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 489
		bodyModel[396] = new ModelRendererTurbo(this, 1385, 97, textureX, textureY); // Box 490
		bodyModel[397] = new ModelRendererTurbo(this, 1129, 97, textureX, textureY); // Box 491
		bodyModel[398] = new ModelRendererTurbo(this, 1409, 97, textureX, textureY); // Box 492
		bodyModel[399] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Box 493
		bodyModel[400] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 494
		bodyModel[401] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 495
		bodyModel[402] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 496
		bodyModel[403] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 497
		bodyModel[404] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 498
		bodyModel[405] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 499
		bodyModel[406] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 500
		bodyModel[407] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 501
		bodyModel[408] = new ModelRendererTurbo(this, 1145, 57, textureX, textureY); // Box 502
		bodyModel[409] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 503
		bodyModel[410] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 504
		bodyModel[411] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 505
		bodyModel[412] = new ModelRendererTurbo(this, 1449, 65, textureX, textureY); // Box 506
		bodyModel[413] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 507
		bodyModel[414] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 508
		bodyModel[415] = new ModelRendererTurbo(this, 1681, 9, textureX, textureY); // Box 509
		bodyModel[416] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 511
		bodyModel[417] = new ModelRendererTurbo(this, 769, 73, textureX, textureY); // Box 512
		bodyModel[418] = new ModelRendererTurbo(this, 1393, 73, textureX, textureY); // Box 513
		bodyModel[419] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 514
		bodyModel[420] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 515
		bodyModel[421] = new ModelRendererTurbo(this, 1185, 57, textureX, textureY); // Box 516
		bodyModel[422] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Box 517
		bodyModel[423] = new ModelRendererTurbo(this, 1401, 57, textureX, textureY); // Box 518
		bodyModel[424] = new ModelRendererTurbo(this, 1441, 89, textureX, textureY); // Box 519
		bodyModel[425] = new ModelRendererTurbo(this, 1625, 73, textureX, textureY); // Box 520
		bodyModel[426] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 521
		bodyModel[427] = new ModelRendererTurbo(this, 1825, 73, textureX, textureY); // Box 522
		bodyModel[428] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Box 523
		bodyModel[429] = new ModelRendererTurbo(this, 1721, 97, textureX, textureY); // Box 524
		bodyModel[430] = new ModelRendererTurbo(this, 1041, 97, textureX, textureY); // Box 525
		bodyModel[431] = new ModelRendererTurbo(this, 1065, 97, textureX, textureY); // Box 526
		bodyModel[432] = new ModelRendererTurbo(this, 1425, 97, textureX, textureY); // Box 527
		bodyModel[433] = new ModelRendererTurbo(this, 1289, 97, textureX, textureY); // Box 528
		bodyModel[434] = new ModelRendererTurbo(this, 1937, 97, textureX, textureY); // Box 529
		bodyModel[435] = new ModelRendererTurbo(this, 1993, 97, textureX, textureY); // Box 530
		bodyModel[436] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 531
		bodyModel[437] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 532
		bodyModel[438] = new ModelRendererTurbo(this, 1385, 97, textureX, textureY); // Box 533
		bodyModel[439] = new ModelRendererTurbo(this, 1785, 161, textureX, textureY); // Box 638
		bodyModel[440] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 639
		bodyModel[441] = new ModelRendererTurbo(this, 1185, 153, textureX, textureY); // Box 640
		bodyModel[442] = new ModelRendererTurbo(this, 1289, 153, textureX, textureY); // Box 641
		bodyModel[443] = new ModelRendererTurbo(this, 1409, 153, textureX, textureY); // Box 642
		bodyModel[444] = new ModelRendererTurbo(this, 1329, 97, textureX, textureY); // Box 643
		bodyModel[445] = new ModelRendererTurbo(this, 1193, 73, textureX, textureY); // Box 644
		bodyModel[446] = new ModelRendererTurbo(this, 1193, 105, textureX, textureY); // Box 645
		bodyModel[447] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 646
		bodyModel[448] = new ModelRendererTurbo(this, 1089, 129, textureX, textureY); // Box 647
		bodyModel[449] = new ModelRendererTurbo(this, 1649, 153, textureX, textureY); // Box 648
		bodyModel[450] = new ModelRendererTurbo(this, 1849, 97, textureX, textureY); // Box 649
		bodyModel[451] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 650
		bodyModel[452] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 651
		bodyModel[453] = new ModelRendererTurbo(this, 1969, 113, textureX, textureY); // Box 652
		bodyModel[454] = new ModelRendererTurbo(this, 1425, 121, textureX, textureY); // Box 653
		bodyModel[455] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 654
		bodyModel[456] = new ModelRendererTurbo(this, 1025, 81, textureX, textureY); // Box 655
		bodyModel[457] = new ModelRendererTurbo(this, 2041, 57, textureX, textureY); // Box 656
		bodyModel[458] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 657
		bodyModel[459] = new ModelRendererTurbo(this, 1281, 81, textureX, textureY); // Box 658
		bodyModel[460] = new ModelRendererTurbo(this, 1633, 57, textureX, textureY); // Box 659
		bodyModel[461] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 660
		bodyModel[462] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 662
		bodyModel[463] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 663
		bodyModel[464] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 664
		bodyModel[465] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 665
		bodyModel[466] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 666
		bodyModel[467] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 667
		bodyModel[468] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 668
		bodyModel[469] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 669
		bodyModel[470] = new ModelRendererTurbo(this, 1073, 89, textureX, textureY); // Box 670
		bodyModel[471] = new ModelRendererTurbo(this, 1281, 89, textureX, textureY); // Box 671
		bodyModel[472] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 672
		bodyModel[473] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 673
		bodyModel[474] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 674
		bodyModel[475] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 675
		bodyModel[476] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 676
		bodyModel[477] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Box 677
		bodyModel[478] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 678
		bodyModel[479] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Box 679
		bodyModel[480] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 680
		bodyModel[481] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 681
		bodyModel[482] = new ModelRendererTurbo(this, 1025, 97, textureX, textureY); // Box 682
		bodyModel[483] = new ModelRendererTurbo(this, 1041, 97, textureX, textureY); // Box 683
		bodyModel[484] = new ModelRendererTurbo(this, 1065, 97, textureX, textureY); // Box 684
		bodyModel[485] = new ModelRendererTurbo(this, 1281, 97, textureX, textureY); // Box 685
		bodyModel[486] = new ModelRendererTurbo(this, 1297, 97, textureX, textureY); // Box 686
		bodyModel[487] = new ModelRendererTurbo(this, 1313, 97, textureX, textureY); // Box 687
		bodyModel[488] = new ModelRendererTurbo(this, 1449, 97, textureX, textureY); // Box 688
		bodyModel[489] = new ModelRendererTurbo(this, 1649, 97, textureX, textureY); // Box 689
		bodyModel[490] = new ModelRendererTurbo(this, 1697, 97, textureX, textureY); // Box 690
		bodyModel[491] = new ModelRendererTurbo(this, 1745, 97, textureX, textureY); // Box 691
		bodyModel[492] = new ModelRendererTurbo(this, 1809, 97, textureX, textureY); // Box 692
		bodyModel[493] = new ModelRendererTurbo(this, 1513, 153, textureX, textureY); // Box 693
		bodyModel[494] = new ModelRendererTurbo(this, 1921, 97, textureX, textureY); // Box 695
		bodyModel[495] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 696
		bodyModel[496] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 697
		bodyModel[497] = new ModelRendererTurbo(this, 1289, 81, textureX, textureY); // Box 698
		bodyModel[498] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 699
		bodyModel[499] = new ModelRendererTurbo(this, 1481, 105, textureX, textureY); // Box 700

		bodyModel[0].addShapeBox(0F, 0F, 0F, 40, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -67F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 36, 1, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 10
		bodyModel[1].setRotationPoint(-34F, -67F, 4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -2F); // Box 11
		bodyModel[2].setRotationPoint(-34F, -65F, 10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 3
		bodyModel[3].setRotationPoint(-34F, -60F, 13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0.55F, 0F, 0F, 0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.55F, 0F, 0F, -1.5F, 0F, 0F, -1.65F, 0F, 0F, 1.7F, 0F, 0F, 1.5F); // Box 4
		bodyModel[4].setRotationPoint(-17F, -57F, 15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.2F, 0F, 0F, 2.2F, 0F, 0F, 2F); // Box 5
		bodyModel[5].setRotationPoint(-34F, -57F, 14F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -1.95F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1.95F); // Box 6
		bodyModel[6].setRotationPoint(0F, -57F, 15F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 7
		bodyModel[7].setRotationPoint(-34F, -50F, 16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 8
		bodyModel[8].setRotationPoint(-34F, -50F, 16F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 9
		bodyModel[9].setRotationPoint(-34F, -60F, 13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -2F); // Box 10
		bodyModel[10].setRotationPoint(-34F, -65F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 36, 1, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 11
		bodyModel[11].setRotationPoint(-34F, -67F, 4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-34F, -67F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 13
		bodyModel[13].setRotationPoint(-34F, -50F, -17F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 14
		bodyModel[14].setRotationPoint(-34F, -60F, -14F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, -5F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-34F, -65F, -15F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 40, 1, 7, 0F,0F, -2F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-38F, -67F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 40, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-38F, -67F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -1F); // Box 18
		bodyModel[18].setRotationPoint(-34F, -26F, 11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 19
		bodyModel[19].setRotationPoint(-34F, -24F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 36, 1, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-34F, -24F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-34F, -33F, 14F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 36, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 22
		bodyModel[22].setRotationPoint(-34F, -41F, 16F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 25
		bodyModel[23].setRotationPoint(2F, -60F, -15F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, -0.55F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.55F, 0F, 0F, 1.5F, 0F, 0F, 1.7F, 0F, 0F, -1.65F, 0F, 0F, -1.5F); // Box 26
		bodyModel[24].setRotationPoint(-17F, -57F, -16F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2.2F, 0F, 0F, -2.2F, 0F, 0F, -2F); // Box 27
		bodyModel[25].setRotationPoint(-34F, -57F, -15F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 1.95F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1.95F); // Box 28
		bodyModel[26].setRotationPoint(0F, -57F, -16F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 36, 7, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, -2F); // Box 29
		bodyModel[27].setRotationPoint(2F, -57F, -16F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, -5F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[28].setRotationPoint(2F, -65F, -15F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F,0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, -1F); // Box 31
		bodyModel[29].setRotationPoint(2F, -50F, -18F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[30].setRotationPoint(2F, -68F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(2F, -68F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 16, 1, 7, 0F,0F, -3F, -1F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(2F, -68F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 16, 1, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, -1F, 0F, 3F, -1F); // Box 36
		bodyModel[33].setRotationPoint(2F, -68F, 4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F); // Box 37
		bodyModel[34].setRotationPoint(18F, -65F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 38
		bodyModel[35].setRotationPoint(24F, -65F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F); // Box 39
		bodyModel[36].setRotationPoint(29F, -65F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -2F, -1F); // Box 40
		bodyModel[37].setRotationPoint(33F, -65F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[38].setRotationPoint(38F, -68F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[39].setRotationPoint(38F, -68F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 43
		bodyModel[40].setRotationPoint(35F, -65F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[41].setRotationPoint(35F, -68F, -4F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -1F); // Box 47
		bodyModel[42].setRotationPoint(2F, -65F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[43].setRotationPoint(18F, -65F, 4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[44].setRotationPoint(24F, -65F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[45].setRotationPoint(29F, -65F, 4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[46].setRotationPoint(35F, -65F, 4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[47].setRotationPoint(35F, -68F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 4F, -2F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[48].setRotationPoint(-34F, -26F, -16F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 2F, -1F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[49].setRotationPoint(-34F, -24F, -12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 36, 1, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[50].setRotationPoint(-34F, -24F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 57
		bodyModel[51].setRotationPoint(-34F, -33F, -15F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 36, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 58
		bodyModel[52].setRotationPoint(-34F, -41F, -17F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 51, 1, 4, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 59
		bodyModel[53].setRotationPoint(64F, -68F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 51, 1, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 60
		bodyModel[54].setRotationPoint(64F, -68F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 59
		bodyModel[55].setRotationPoint(38F, -65F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, -5F, 0F, 0F, -3F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 2F, -2F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 60
		bodyModel[56].setRotationPoint(38F, -65F, -14F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 61
		bodyModel[57].setRotationPoint(38F, -60F, -14F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 17, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 62
		bodyModel[58].setRotationPoint(38F, -52F, -17F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 51, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 63
		bodyModel[59].setRotationPoint(64F, -66F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[60].setRotationPoint(55F, -69F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[61].setRotationPoint(55F, -69F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 66
		bodyModel[62].setRotationPoint(55F, -66F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0.55F, -0.55F, 0F, 0.9F, -0.85F, 0F, 0.9F, 0.9F, 0F, 0.55F, 0.55F, 0F, 0F, 1.45F, 0F, 0F, 1.15F, 0F, 0F, -1.15F, 0F, 0F, -1.45F); // Box 67
		bodyModel[63].setRotationPoint(47F, -58F, -15F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -1F, -1F, 0F, -1F, -2F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 68
		bodyModel[64].setRotationPoint(55F, -62F, -13F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 69
		bodyModel[65].setRotationPoint(55F, -62F, -13F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 70
		bodyModel[66].setRotationPoint(55F, -52F, -16F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 51, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, -1F); // Box 71
		bodyModel[67].setRotationPoint(64F, -62F, -12F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 51, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 72
		bodyModel[68].setRotationPoint(64F, -52F, -15F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 51, 7, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 73
		bodyModel[69].setRotationPoint(64F, -59F, -13F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 3F, 2F, 0F, 4F, 0F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, -3F, 2F, 0F, -4F, 0F); // Box 74
		bodyModel[70].setRotationPoint(64F, -62F, -12F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F,0F, 3F, 0F, 0F, 4F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 76
		bodyModel[71].setRotationPoint(38F, -65F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 2F, -2F, 0F, 4F, -1F); // Box 77
		bodyModel[72].setRotationPoint(38F, -65F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F); // Box 78
		bodyModel[73].setRotationPoint(38F, -60F, 13F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 17, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 79
		bodyModel[74].setRotationPoint(38F, -52F, 16F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[75].setRotationPoint(55F, -66F, 4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, -2F, 0F, -1F, -1F); // Box 83
		bodyModel[76].setRotationPoint(55F, -62F, 9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 84
		bodyModel[77].setRotationPoint(55F, -62F, 12F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 85
		bodyModel[78].setRotationPoint(55F, -52F, 15F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 36, 7, 1, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 2F); // Box 90
		bodyModel[79].setRotationPoint(2F, -57F, 15F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 36, 9, 1, 0F,0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 1F); // Box 91
		bodyModel[80].setRotationPoint(2F, -50F, 17F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F); // Box 92
		bodyModel[81].setRotationPoint(2F, -60F, 14F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 2F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[82].setRotationPoint(33F, -65F, 3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 92
		bodyModel[83].setRotationPoint(33F, -68F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 93
		bodyModel[84].setRotationPoint(33F, -68F, -4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 51, 1, 5, 0F,0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 98
		bodyModel[85].setRotationPoint(64F, -66F, 4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 51, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, 1F); // Box 99
		bodyModel[86].setRotationPoint(64F, -62F, 11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 51, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 100
		bodyModel[87].setRotationPoint(64F, -52F, 14F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 51, 7, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 101
		bodyModel[88].setRotationPoint(64F, -59F, 12F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 51, 1, 3, 0F,0F, 4F, 0F, 0F, 3F, 2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 2F, 0F, 0F, -2F, 0F, -1F, -1F); // Box 102
		bodyModel[89].setRotationPoint(64F, -62F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 36, 8, 1, 0F,0F, 0F, 1F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 1F); // Box 103
		bodyModel[90].setRotationPoint(2F, -41F, -18F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, 0F); // Box 104
		bodyModel[91].setRotationPoint(2F, -33F, -16F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 4F, -1F, 0F, 5F, -3F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, -2F, 0F, -3F, 1F, 0F, 0F, 0F); // Box 105
		bodyModel[92].setRotationPoint(2F, -26F, -16F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 2F, -1F, 0F, 5F, -2F, 0F, 4F, 1F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -5F, -2F, 0F, -4F, 1F, 0F, 1F, 0F); // Box 106
		bodyModel[93].setRotationPoint(2F, -24F, -12F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 36, 8, 1, 0F,0F, 0F, -1F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, -1F); // Box 107
		bodyModel[94].setRotationPoint(2F, -41F, 17F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 108
		bodyModel[95].setRotationPoint(2F, -33F, 15F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, 3F, 1F, 0F, 5F, -3F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -6F, -2F, 0F, -5F, 0F); // Box 109
		bodyModel[96].setRotationPoint(2F, -26F, 11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, -1F, 0F, 0F, 4F, 1F, 0F, 5F, -2F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, -4F, 1F, 0F, -5F, -2F, 0F, -2F, -1F); // Box 110
		bodyModel[97].setRotationPoint(2F, -24F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 53, 1, 3, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, 2F, 0F, -2F, 0F); // Box 101
		bodyModel[98].setRotationPoint(115F, -65F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 53, 1, 4, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, 2F, 1F, 0F, 4F, 0F, 0F, -1F, -1F, 0F, 1F, -3F, 0F, -2F, 1F, 0F, -4F, 0F); // Box 102
		bodyModel[99].setRotationPoint(115F, -61F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 53, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, -2F); // Box 103
		bodyModel[100].setRotationPoint(115F, -61F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 53, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, -1F); // Box 104
		bodyModel[101].setRotationPoint(115F, -57F, -13F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0.55F, 0.55F, 0F, 0.9F, 0.9F, 0F, 0.9F, -0.85F, 0F, 0.55F, -0.55F, 0F, 0F, -1.45F, 0F, 0F, -1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.45F); // Box 105
		bodyModel[102].setRotationPoint(47F, -58F, 14F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 53, 1, 3, 0F,0F, 2F, 0F, 0F, 0F, 2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 106
		bodyModel[103].setRotationPoint(115F, -65F, 4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 53, 1, 4, 0F,0F, 4F, 0F, 0F, 2F, 1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 1F, 0F, 1F, -3F, 0F, -1F, -1F); // Box 107
		bodyModel[104].setRotationPoint(115F, -61F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 53, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 2F); // Box 108
		bodyModel[105].setRotationPoint(115F, -61F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 53, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 1F); // Box 109
		bodyModel[106].setRotationPoint(115F, -57F, 12F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 1F, 0F, 0F, 0F); // Box 110
		bodyModel[107].setRotationPoint(38F, -43F, -16F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F,0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 1F); // Box 111
		bodyModel[108].setRotationPoint(38F, -35F, -15F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 28, 1, 14, 0F,0F, 0F, 0F, 0F, 3.9F, -0.75F, 0F, 3.9F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, -0.75F, 0F, -3.9F, -0.75F, 0F, 0F, 0F); // Box 112
		bodyModel[109].setRotationPoint(2F, -23F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 113
		bodyModel[110].setRotationPoint(38F, -31F, -13F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 114
		bodyModel[111].setRotationPoint(38F, -29F, -10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 115
		bodyModel[112].setRotationPoint(38F, -43F, 15F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F,0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, -1F); // Box 116
		bodyModel[113].setRotationPoint(38F, -35F, 14F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 1F); // Box 117
		bodyModel[114].setRotationPoint(38F, -31F, 10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[115].setRotationPoint(38F, -29F, 6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 123
		bodyModel[116].setRotationPoint(55F, -45F, -15F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 1F); // Box 124
		bodyModel[117].setRotationPoint(55F, -38F, -14F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 125
		bodyModel[118].setRotationPoint(55F, -33F, -12F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 126
		bodyModel[119].setRotationPoint(55F, -31F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 127
		bodyModel[120].setRotationPoint(55F, -45F, 14F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, -1F); // Box 128
		bodyModel[121].setRotationPoint(55F, -38F, 13F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 1F); // Box 129
		bodyModel[122].setRotationPoint(55F, -33F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[123].setRotationPoint(55F, -31F, 6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 51, 6, 1, 0F,0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -2F, 0F, -4F, 2F, 0F, 0F, 1F); // Box 131
		bodyModel[124].setRotationPoint(64F, -46F, -15F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 51, 5, 1, 0F,0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, -5F, 3F, 0F, 0F, 2F); // Box 132
		bodyModel[125].setRotationPoint(64F, -40F, -14F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, 1F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -3F, -4F, 0F, -4F, 3F, 0F, 0F, 1F); // Box 133
		bodyModel[126].setRotationPoint(64F, -35F, -12F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 51, 1, 4, 0F,0F, 0F, 0F, 0F, 4F, -2F, 0F, 2F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -2F, 1F, 0F, 3F, 0F); // Box 134
		bodyModel[127].setRotationPoint(64F, -33F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 51, 6, 1, 0F,0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 2F, 0F, -4F, -2F, 0F, 0F, -1F); // Box 135
		bodyModel[128].setRotationPoint(64F, -46F, 14F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 51, 5, 1, 0F,0F, 0F, 0F, 0F, 4F, 1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -5F, 3F, 0F, -5F, -3F, 0F, 0F, -2F); // Box 136
		bodyModel[129].setRotationPoint(64F, -40F, 13F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,0F, 0F, 0F, 0F, 5F, 1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 3F, 0F, -3F, -4F, 0F, 1F, -2F); // Box 137
		bodyModel[130].setRotationPoint(64F, -35F, 11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 51, 1, 4, 0F,0F, -3F, 0F, 0F, 2F, 1F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 1F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 138
		bodyModel[131].setRotationPoint(64F, -33F, 6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 53, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 134
		bodyModel[132].setRotationPoint(115F, -52F, -14F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 53, 4, 1, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, 0F, 1F); // Box 135
		bodyModel[133].setRotationPoint(115F, -48F, -14F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 53, 4, 1, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -6F, 0F, -3F, 6F, 0F, 0F, 2F); // Box 136
		bodyModel[134].setRotationPoint(115F, -44F, -13F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 53, 3, 1, 0F,0F, 0F, 0F, 0F, 3F, -4F, 0F, 3F, 4F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -4F, -6F, 0F, -5F, 5F, 0F, 0F, 2F); // Box 137
		bodyModel[135].setRotationPoint(115F, -40F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 53, 1, 3, 0F,0F, 0F, 0F, 0F, 5F, -3F, 0F, 4F, 3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -4F, 3F, 0F, 2F, 0F); // Box 138
		bodyModel[136].setRotationPoint(115F, -37F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 53, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 139
		bodyModel[137].setRotationPoint(115F, -52F, 13F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 53, 4, 1, 0F,0F, 0F, 0F, 0F, 2F, 4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, 0F, -1F); // Box 140
		bodyModel[138].setRotationPoint(115F, -48F, 13F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 53, 4, 1, 0F,0F, 0F, 0F, 0F, 2F, 4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 6F, 0F, -3F, -6F, 0F, 0F, -2F); // Box 141
		bodyModel[139].setRotationPoint(115F, -44F, 12F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 53, 3, 1, 0F,0F, 0F, 0F, 0F, 3F, 4F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -5F, 5F, 0F, -4F, -6F, 0F, 1F, -3F); // Box 142
		bodyModel[140].setRotationPoint(115F, -40F, 10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 53, 1, 3, 0F,0F, -2F, 0F, 0F, 4F, 3F, 0F, 5F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 3F, 0F, -5F, -3F, 0F, 0F, 0F); // Box 143
		bodyModel[141].setRotationPoint(115F, -37F, 5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 53, 1, 10, 0F,0F, 0F, 0F, 0F, 6F, -3F, 0F, 6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F); // Box 144
		bodyModel[142].setRotationPoint(115F, -35F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 34, 1, 10, 0F,0F, -0.35F, 0.65F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.35F, 0.65F, 0F, 0.35F, 0.65F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.35F, 0.65F); // Box 145
		bodyModel[143].setRotationPoint(81F, -32F, -5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[144].setRotationPoint(-45F, -66F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[145].setRotationPoint(-57F, -64F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 149
		bodyModel[146].setRotationPoint(-45F, -59F, 13F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 150
		bodyModel[147].setRotationPoint(-57F, -58F, 14F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 151
		bodyModel[148].setRotationPoint(-57F, -64F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 152
		bodyModel[149].setRotationPoint(-45F, -65F, 9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 153
		bodyModel[150].setRotationPoint(-45F, -50F, -16F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 13, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 154
		bodyModel[151].setRotationPoint(-58F, -50F, -16F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 155
		bodyModel[152].setRotationPoint(-45F, -41F, -17F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 3F); // Box 156
		bodyModel[153].setRotationPoint(-58F, -41F, -17F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[154].setRotationPoint(-45F, -33F, -15F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[155].setRotationPoint(-45F, -33F, -15F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 159
		bodyModel[156].setRotationPoint(-58F, -33F, -13F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 160
		bodyModel[157].setRotationPoint(-45F, -26F, -16F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 4F, -5F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -5F, -4F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, -1F, 3F); // Box 161
		bodyModel[158].setRotationPoint(-58F, -26F, -16F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 2F, -2F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 162
		bodyModel[159].setRotationPoint(-45F, -24F, -12F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F,0F, 2F, -4F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, -4F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 163
		bodyModel[160].setRotationPoint(-58F, -25F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[161].setRotationPoint(-45F, -25F, -7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[162].setRotationPoint(-58F, -26F, -6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 166
		bodyModel[163].setRotationPoint(-45F, -41F, 16F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 167
		bodyModel[164].setRotationPoint(-58F, -41F, 16F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[165].setRotationPoint(-45F, -33F, 14F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 169
		bodyModel[166].setRotationPoint(-58F, -33F, 12F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F); // Box 170
		bodyModel[167].setRotationPoint(-45F, -26F, 11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 1F, 3F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -5F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -4F); // Box 171
		bodyModel[168].setRotationPoint(-58F, -26F, 10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -2F); // Box 172
		bodyModel[169].setRotationPoint(-45F, -24F, 7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 2F, -4F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -4F); // Box 173
		bodyModel[170].setRotationPoint(-58F, -25F, 6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 174
		bodyModel[171].setRotationPoint(-45F, -25F, 0F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 175
		bodyModel[172].setRotationPoint(-58F, -26F, 0F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 176
		bodyModel[173].setRotationPoint(-45F, -50F, 15F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 13, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 177
		bodyModel[174].setRotationPoint(-58F, -50F, 15F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 11, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 178
		bodyModel[175].setRotationPoint(-45F, -50F, -16F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -2.9F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -0.8F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.65F, 0F); // Box 181
		bodyModel[176].setRotationPoint(-57F, -62F, -12F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -1F, 0F, 0F, -0.9F, 0F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.9F, 0F, 0F, -2F, -1F, 0F, -1F, 0F); // Box 182
		bodyModel[177].setRotationPoint(-45F, -63F, -12F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[178].setRotationPoint(-58F, -64F, 0F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 184
		bodyModel[179].setRotationPoint(-58F, -64F, 4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[180].setRotationPoint(-58F, -62F, 9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[181].setRotationPoint(-58F, -57F, 13F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 187
		bodyModel[182].setRotationPoint(-58F, -62F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 188
		bodyModel[183].setRotationPoint(-58F, -56F, 13F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -2F, 1F, 0F, -1.1F, 1.3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.3F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 189
		bodyModel[184].setRotationPoint(-58F, -63F, -8F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -3F, 1F, 0F, -3F, 1F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[185].setRotationPoint(-58F, -61F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 191
		bodyModel[186].setRotationPoint(-58F, -57F, -12F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[187].setRotationPoint(-58F, -62F, 9F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, -2F, -0.3F, 0F, -1F, 0F); // Box 193
		bodyModel[188].setRotationPoint(-58F, -61F, -9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[189].setRotationPoint(-58F, -58F, -12F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -1F, 2F, 0F); // Box 194
		bodyModel[190].setRotationPoint(26F, -75F, 1F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 197
		bodyModel[191].setRotationPoint(26F, -75F, -1F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 198
		bodyModel[192].setRotationPoint(26F, -75F, 0F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -1F, 2F, 0F); // Box 199
		bodyModel[193].setRotationPoint(27F, -73F, 6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, -10F, 1F, -4F, -10F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 8F, 0F, -4F, 8F, 0F); // Box 200
		bodyModel[194].setRotationPoint(28F, -71F, 9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[195].setRotationPoint(26F, -75F, -6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[196].setRotationPoint(27F, -73F, -9F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-4F, -10F, 1F, 4F, -10F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 8F, 0F, 4F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[197].setRotationPoint(28F, -71F, -12F);

		bodyModel[198].addBox(0F, 0F, 0F, 12, 1, 2, 0F); // Box 204
		bodyModel[198].setRotationPoint(14F, -75F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[199].setRotationPoint(7F, -73F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[200].setRotationPoint(4F, -71F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[201].setRotationPoint(2F, -68F, -1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[202].setRotationPoint(-72F, -59F, 2F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 55, 1, 3, 0F,0F, 0F, 0F, 0F, -2F, -5F, 0F, -1F, 3F, 0F, 4F, 0F, 0F, -1F, -1F, 0F, 1F, -6F, 0F, 1F, 3F, 0F, -4F, 0F); // Box 229
		bodyModel[203].setRotationPoint(168F, -59F, -9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 55, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, -1F); // Box 230
		bodyModel[204].setRotationPoint(168F, -59F, -9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 55, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, 5F, 0F, 0F, 0F); // Box 231
		bodyModel[205].setRotationPoint(168F, -56F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 55, 4, 1, 0F,0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -6F, 0F, -5F, 6F, 0F, 0F, 1F); // Box 232
		bodyModel[206].setRotationPoint(168F, -50F, -10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 55, 3, 1, 0F,0F, 0F, 0F, 0F, 5F, -5F, 0F, 5F, 5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -6F, 0F, -7F, 6F, 0F, 0F, 2F); // Box 233
		bodyModel[207].setRotationPoint(168F, -46F, -9F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 55, 2, 1, 0F,0F, 0F, 0F, 0F, 7F, -4F, 0F, 7F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -8F, -5F, 0F, -9F, 4F, 0F, -1F, 1F); // Box 234
		bodyModel[208].setRotationPoint(168F, -43F, -7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 55, 1, 3, 0F,0F, 0F, 0F, 0F, 8F, -3F, 0F, 7.5F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, -7.5F, 2F, 0F, 1F, 0F); // Box 235
		bodyModel[209].setRotationPoint(168F, -42F, -5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 55, 1, 4, 0F,0F, 0F, 0F, 0F, 8.5F, -2F, 0F, 8.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, -2F, 0F, -8.5F, -2F, 0F, 0F, 0F); // Box 236
		bodyModel[210].setRotationPoint(168F, -41F, -2F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 55, 1, 3, 0F,0F, 4F, 0F, 0F, -1F, 3F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 3F, 0F, 1F, -6F, 0F, -1F, -1F); // Box 238
		bodyModel[211].setRotationPoint(168F, -59F, 6F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 55, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 4F, 0F, 1F, -4F, 0F, 0F, 1F); // Box 239
		bodyModel[212].setRotationPoint(168F, -59F, 8F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 55, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 5F, 0F, -3F, -5F, 0F, 0F, 0F); // Box 240
		bodyModel[213].setRotationPoint(168F, -56F, 9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 55, 4, 1, 0F,0F, 0F, 0F, 0F, 3F, 5F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -5F, 6F, 0F, -5F, -6F, 0F, 0F, -1F); // Box 241
		bodyModel[214].setRotationPoint(168F, -50F, 9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 55, 3, 1, 0F,0F, 0F, 0F, 0F, 5F, 5F, 0F, 5F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -7F, 6F, 0F, -7F, -6F, 0F, 0F, -2F); // Box 242
		bodyModel[215].setRotationPoint(168F, -46F, 8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 55, 2, 1, 0F,0F, 0F, 0F, 0F, 7F, 4F, 0F, 7F, -4F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -9F, 4F, 0F, -8F, -5F, 0F, 0F, -2F); // Box 243
		bodyModel[216].setRotationPoint(168F, -43F, 6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 55, 1, 3, 0F,0F, -1F, 0F, 0F, 7.5F, 2F, 0F, 8F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -7.5F, 2F, 0F, -8F, -3F, 0F, 0F, 0F); // Box 244
		bodyModel[217].setRotationPoint(168F, -42F, 2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[218].setRotationPoint(-67F, -61F, 2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 246
		bodyModel[219].setRotationPoint(-67F, -61F, 5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 247
		bodyModel[220].setRotationPoint(-72F, -59F, 5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 1F, 0F); // Box 248
		bodyModel[221].setRotationPoint(-72F, -58F, 9F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 249
		bodyModel[222].setRotationPoint(-67F, -60F, 9F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[223].setRotationPoint(-72F, -59F, -1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[224].setRotationPoint(-67F, -61F, -1F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[225].setRotationPoint(-67F, -61F, -5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[226].setRotationPoint(-72F, -59F, -5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -4F, 0F, 0F, -2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[227].setRotationPoint(-72F, -58F, -9F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, -4F, 0F, 0F, -2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[228].setRotationPoint(-67F, -60F, -10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 256
		bodyModel[229].setRotationPoint(-62F, -61F, -5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[230].setRotationPoint(-62F, -58F, -9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 258
		bodyModel[231].setRotationPoint(-62F, -57F, 0F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[232].setRotationPoint(-60F, -63F, 0F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4.5F, 0F, -1F, 4F, 0F, 0F, 0F); // Box 285
		bodyModel[233].setRotationPoint(223F, -55F, -5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, -4.5F, 0F, 0F, 0F); // Box 287
		bodyModel[234].setRotationPoint(223F, -55F, 4F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 2.5F, 0F, -2F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 1F); // Box 290
		bodyModel[235].setRotationPoint(223F, -57F, 3F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, -3.5F, 0F, -2F, 2.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, 2.5F, 0F, 0F, -1F); // Box 293
		bodyModel[236].setRotationPoint(223F, -57F, -4F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -4.5F, 0F, 1F, 3.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -4.5F, 0F, -3F, 3.5F, 0F, 0F, 1F); // Box 297
		bodyModel[237].setRotationPoint(223F, -53F, -5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 3F, -3.5F, 0F, 3F, 2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3.5F, 0F, -5F, 2.5F, 0F, -1F, 1F); // Box 298
		bodyModel[238].setRotationPoint(223F, -51F, -4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, 3.5F, 0F, 1F, -4.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 3.5F, 0F, -3F, -4.5F, 0F, 0F, -1F); // Box 299
		bodyModel[239].setRotationPoint(223F, -53F, 4F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 3F, 2.5F, 0F, 3F, -3.5F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -5F, 2.5F, 0F, -5F, -3.5F, 0F, 0F, -2F); // Box 300
		bodyModel[240].setRotationPoint(223F, -51F, 3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 6F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 6F, -2F, 0F, 0F, 1F, 0F); // Box 301
		bodyModel[241].setRotationPoint(211F, -55F, -74F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 15, 5, 60, 0F,0F, 0F, 0F, 0F, -2F, 0F, 10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 10F, -3F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[242].setRotationPoint(211F, -56F, -64F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 1F, 0F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 6F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[243].setRotationPoint(211F, -55F, 64F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 15, 5, 60, 0F,0F, 0F, 0F, 10F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[244].setRotationPoint(211F, -56F, 4F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[245].setRotationPoint(-58F, -64F, -3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[246].setRotationPoint(-57F, -64F, -3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 326
		bodyModel[247].setRotationPoint(-71F, -49F, 14F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F); // Box 327
		bodyModel[248].setRotationPoint(-85F, -48F, 11F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 328
		bodyModel[249].setRotationPoint(-84F, -39F, 12F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 329
		bodyModel[250].setRotationPoint(-71F, -39F, 14F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[251].setRotationPoint(-72F, -49F, 14F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[252].setRotationPoint(-72F, -39F, 14F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.9F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.9F, 0F, 0F, 0.65F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 332
		bodyModel[253].setRotationPoint(-38F, -63F, -12F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[254].setRotationPoint(-80F, -55F, 1.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[255].setRotationPoint(-86F, -51F, 1.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 2.5F, 0F, 3F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2.5F, 0F, -3F, -2.5F, 0F, 0F, 0F); // Box 335
		bodyModel[256].setRotationPoint(-79F, -52F, -6.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 336
		bodyModel[257].setRotationPoint(-85F, -49F, -3.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, 0F, 0F); // Box 337
		bodyModel[258].setRotationPoint(-86F, -51F, 6.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 3.5F, -1.5F, 0F, 3F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -1.5F, 0F, -3F, 1.5F, 0F, 0F, 0F); // Box 338
		bodyModel[259].setRotationPoint(-79F, -54F, 8.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 339
		bodyModel[260].setRotationPoint(-72F, -53F, 13F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0.2F, -0.2F, 0F, 1.2F, -0.8F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 340
		bodyModel[261].setRotationPoint(-72F, -56F, 11F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[262].setRotationPoint(-72F, -48F, 14F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 11, 10, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[263].setRotationPoint(-77F, -38F, 2F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 15, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[264].setRotationPoint(-66F, -36F, 2F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 11, 10, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[265].setRotationPoint(-77F, -38F, 5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 8, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[266].setRotationPoint(-66F, -36F, 5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[267].setRotationPoint(-77F, -38F, 11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[268].setRotationPoint(-66F, -36F, 11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 40, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[269].setRotationPoint(-34F, -32F, -16F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[270].setRotationPoint(-34F, -31F, -15F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 350
		bodyModel[271].setRotationPoint(-34F, -30F, -14F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 351
		bodyModel[272].setRotationPoint(-34F, -26F, -11F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 352
		bodyModel[273].setRotationPoint(5F, -26F, -12F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[274].setRotationPoint(5F, -31F, -16F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 4, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 354
		bodyModel[275].setRotationPoint(5F, -30F, -15F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 355
		bodyModel[276].setRotationPoint(48F, -33F, -12F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 356
		bodyModel[277].setRotationPoint(48F, -31F, -10F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[278].setRotationPoint(48F, -33F, 10F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[279].setRotationPoint(48F, -31F, 6F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[280].setRotationPoint(39F, -27F, 6F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[281].setRotationPoint(55F, -28F, 6F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[282].setRotationPoint(39F, -27F, -7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[283].setRotationPoint(55F, -28F, -7F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 363
		bodyModel[284].setRotationPoint(39F, -24F, -7F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[285].setRotationPoint(39F, -27F, 6F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 365
		bodyModel[286].setRotationPoint(39F, -21F, -5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 367
		bodyModel[287].setRotationPoint(48F, -24F, -7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 368
		bodyModel[288].setRotationPoint(57F, -21.1F, -5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 369
		bodyModel[289].setRotationPoint(57F, -24.1F, -7F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0.8F, 0F, 0F, 1F, 0F); // Box 370
		bodyModel[290].setRotationPoint(64F, -21.6F, -5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 371
		bodyModel[291].setRotationPoint(64F, -24.6F, -7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 372
		bodyModel[292].setRotationPoint(70F, -22F, -5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 373
		bodyModel[293].setRotationPoint(70F, -25F, -7F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1.1F, 1F, 0F, 0.9F, 0F, 0F, 1F, 0F); // Box 374
		bodyModel[294].setRotationPoint(53F, -21F, -5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 375
		bodyModel[295].setRotationPoint(59F, -21.1F, -5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -1F, 1F, 0F, -1.4F, 1F, 0F, 0.6F, 0F, 0F, 0.8F, 0F); // Box 376
		bodyModel[296].setRotationPoint(66F, -21.6F, -5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 377
		bodyModel[297].setRotationPoint(39F, -24F, 6F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 378
		bodyModel[298].setRotationPoint(39F, -21F, 3F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 379
		bodyModel[299].setRotationPoint(48F, -24F, 6F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 380
		bodyModel[300].setRotationPoint(57F, -21.1F, 3F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 381
		bodyModel[301].setRotationPoint(57F, -24.1F, 6F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.8F, 0F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 382
		bodyModel[302].setRotationPoint(64F, -21.6F, 3F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 383
		bodyModel[303].setRotationPoint(64F, -24.6F, 6F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 384
		bodyModel[304].setRotationPoint(70F, -22F, 3F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 385
		bodyModel[305].setRotationPoint(70F, -25F, 6F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.9F, 0F, 0F, -1.1F, 1F, 0F, -1F, 1F); // Box 386
		bodyModel[306].setRotationPoint(53F, -21F, 3F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F); // Box 387
		bodyModel[307].setRotationPoint(59F, -21.1F, 3F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.8F, 0F, 0F, -0.6F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, -1.3F, 1F, 0F, -1F, 1F); // Box 388
		bodyModel[308].setRotationPoint(66F, -21.6F, 3F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[309].setRotationPoint(39F, -20F, -3F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[310].setRotationPoint(53F, -20F, -3F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[311].setRotationPoint(57F, -20.1F, -3F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[312].setRotationPoint(59F, -20.1F, -3F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[313].setRotationPoint(64F, -20.6F, -3F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[314].setRotationPoint(66F, -20.8F, -3F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[315].setRotationPoint(70F, -21F, -3F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.1F, 0F, 0F, 0.45F, -0.1F, -4F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.45F, -0.1F, -4F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 396
		bodyModel[316].setRotationPoint(30F, -27F, -6.2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.1F, 0F, -4F, -0.1F, 0F, 0F, 0.45F, -0.1F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, -4F, 0.1F, 0F, 0F, -0.45F, -0.1F, 0F, 0.1F, 0F); // Box 397
		bodyModel[317].setRotationPoint(30F, -27F, 2.2F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 398
		bodyModel[318].setRotationPoint(33F, -23F, -3F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 399
		bodyModel[319].setRotationPoint(29F, -26F, -3F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 400
		bodyModel[320].setRotationPoint(29F, -26F, 2F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 401
		bodyModel[321].setRotationPoint(35F, -21F, 2F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 402
		bodyModel[322].setRotationPoint(35F, -21F, -3F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[323].setRotationPoint(80F, -30F, -2F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -2F, 0F); // Box 404
		bodyModel[324].setRotationPoint(78F, -28F, -5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[325].setRotationPoint(73F, -21F, -5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 406
		bodyModel[326].setRotationPoint(77F, -26F, -6F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 407
		bodyModel[327].setRotationPoint(78F, -27F, -6F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[328].setRotationPoint(75F, -24F, -6F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[329].setRotationPoint(73F, -21F, -2F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[330].setRotationPoint(78F, -28F, 2F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -2F, 0F); // Box 411
		bodyModel[331].setRotationPoint(73F, -21F, 2F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 412
		bodyModel[332].setRotationPoint(77F, -26F, 5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, -1F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[333].setRotationPoint(77F, -27F, 5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 414
		bodyModel[334].setRotationPoint(75F, -24F, 5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 6F, 0F, 1F, 6F, 0F, -1F, -6F, 0F, -1F); // Box 415
		bodyModel[335].setRotationPoint(70F, -30F, 6F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 6F, 0F, -1F, 6F, 0F, 1F, -6F, 0F, 1F); // Box 416
		bodyModel[336].setRotationPoint(70F, -30F, -7F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[337].setRotationPoint(71F, -21F, -0.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.3F, 0.5F, 0F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[338].setRotationPoint(71F, -23F, -6F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.3F, 0.1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 419
		bodyModel[339].setRotationPoint(71F, -23F, 5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[340].setRotationPoint(80F, -31F, -0.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[341].setRotationPoint(-66F, -26F, 2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[342].setRotationPoint(-77F, -28F, 2F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 11, 9, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 424
		bodyModel[343].setRotationPoint(-77F, -38F, 7F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 8, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[344].setRotationPoint(-66F, -36F, 7F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[345].setRotationPoint(-58F, -36F, 7F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 7, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[346].setRotationPoint(-58F, -36F, 5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[347].setRotationPoint(-52F, -33F, 5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[348].setRotationPoint(-51F, -33F, 2F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[349].setRotationPoint(-52F, -33F, 7F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 432
		bodyModel[350].setRotationPoint(-51F, -33F, 11F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 433
		bodyModel[351].setRotationPoint(-44F, -33F, 11F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[352].setRotationPoint(-44F, -33F, 7F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[353].setRotationPoint(-44F, -33F, 2F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[354].setRotationPoint(-44F, -33F, 5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 30, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[355].setRotationPoint(-33F, -34F, -15F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[356].setRotationPoint(-33F, -41F, -17F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 9, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[357].setRotationPoint(-33F, -50F, -17F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[358].setRotationPoint(-33F, -57F, -16F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[359].setRotationPoint(-33F, -60F, -14F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[360].setRotationPoint(-33F, -64F, -13F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[361].setRotationPoint(-33F, -66F, -10F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 448
		bodyModel[362].setRotationPoint(-33F, -41F, 6F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[363].setRotationPoint(-33F, -50F, 6F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[364].setRotationPoint(-33F, -57F, 6F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[365].setRotationPoint(-33F, -60F, 6F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[366].setRotationPoint(-33F, -64F, 0F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[367].setRotationPoint(-33F, -66F, 0F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[368].setRotationPoint(-33F, -60F, 5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 455
		bodyModel[369].setRotationPoint(-33F, -60F, -6F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 456
		bodyModel[370].setRotationPoint(5F, -60F, -6F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 30, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[371].setRotationPoint(5F, -34F, -15F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[372].setRotationPoint(5F, -41F, -18F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[373].setRotationPoint(5F, -50F, -18F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[374].setRotationPoint(5F, -57F, -17F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[375].setRotationPoint(5F, -60F, -15F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[376].setRotationPoint(5F, -64F, -14F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[377].setRotationPoint(5F, -67F, -10F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[378].setRotationPoint(5F, -60F, 5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 471
		bodyModel[379].setRotationPoint(5F, -41F, 6F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[380].setRotationPoint(5F, -50F, 6F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[381].setRotationPoint(5F, -57F, 6F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[382].setRotationPoint(5F, -60F, 6F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		bodyModel[383].setRotationPoint(5F, -64F, 0F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[384].setRotationPoint(5F, -67F, 0F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 477
		bodyModel[385].setRotationPoint(-71F, -44F, -13F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F); // Box 478
		bodyModel[386].setRotationPoint(-64F, -44F, -15F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 480
		bodyModel[387].setRotationPoint(-78F, -44F, -10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 482
		bodyModel[388].setRotationPoint(-84F, -44F, -6F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.4F, 0F, 1F, -1.4F, 0F, 0F, 0F); // Box 483
		bodyModel[389].setRotationPoint(-66F, -34F, -12F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 484
		bodyModel[390].setRotationPoint(-74F, -35F, -10F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 4F, 0F, 3F, -4F, 0F, 0F, 0F); // Box 485
		bodyModel[391].setRotationPoint(-83F, -38F, -6F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1.5F, -2F, 0F, 0F, 0F); // Box 486
		bodyModel[392].setRotationPoint(-72F, -28F, -5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 487
		bodyModel[393].setRotationPoint(-77F, -30F, -4F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 5, 11, 3, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 488
		bodyModel[394].setRotationPoint(-82F, -38F, 2F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F); // Box 489
		bodyModel[395].setRotationPoint(-82F, -38F, 5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 5, 10, 4, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F); // Box 490
		bodyModel[396].setRotationPoint(-82F, -38F, 7F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -9F, 0F); // Box 491
		bodyModel[397].setRotationPoint(-82F, -38F, 11F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 11, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 492
		bodyModel[398].setRotationPoint(-77F, -28F, 3F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 493
		bodyModel[399].setRotationPoint(-82F, -32F, -1F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[400].setRotationPoint(-87F, -51F, 1.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[401].setRotationPoint(-87F, -51F, 6.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[402].setRotationPoint(-86F, -48F, 11F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[403].setRotationPoint(-85F, -39F, 12F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 1F, 0F, 2F, 1F, 1F, -3F, -1F, 1F, -3F); // Box 498
		bodyModel[404].setRotationPoint(-85F, -38F, 12F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[405].setRotationPoint(-83F, -32F, -1F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[406].setRotationPoint(-84F, -38F, -6F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[407].setRotationPoint(-85F, -44F, -6F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[408].setRotationPoint(-86F, -49F, -3.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 1F, 0F, -1F, 1F, -1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 1F, -1F, 0F); // Box 503
		bodyModel[409].setRotationPoint(-86F, -50F, -2.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, -2.5F, -1F, 0F, -2.5F); // Box 504
		bodyModel[410].setRotationPoint(-86F, -48F, -3.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 505
		bodyModel[411].setRotationPoint(-85F, -43F, -6F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -5F, 1F, 1F, -5F, 1F, 0F, 4F, -1F, 0F, 4F); // Box 506
		bodyModel[412].setRotationPoint(-84F, -37F, -6F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[413].setRotationPoint(-83F, -31F, 2F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 508
		bodyModel[414].setRotationPoint(-83F, -32F, -1F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		bodyModel[415].setRotationPoint(-84F, -34F, 5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 511
		bodyModel[416].setRotationPoint(-86F, -47F, 11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 512
		bodyModel[417].setRotationPoint(-86F, -43F, 12F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[418].setRotationPoint(-87F, -51F, 2.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 1.5F, -1F, -3F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0.5F, -1F, 2F, 0.5F); // Box 514
		bodyModel[419].setRotationPoint(-87F, -51F, 7.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 515
		bodyModel[420].setRotationPoint(-95F, -40F, 2.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 3F, -1F, -2F, 3F, -1F, 2F, -4F, 0F, 2F); // Box 516
		bodyModel[421].setRotationPoint(-94F, -37F, 4.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 1F, 2F, 0F, 0F, 0F); // Box 517
		bodyModel[422].setRotationPoint(-90F, -35F, 6.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, 3F, -1F, 2F, 3F, -1F, -2F, -4F, 0F, -2F); // Box 518
		bodyModel[423].setRotationPoint(-94F, -37F, 2.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 1.5F, 0F, -3F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1.5F, 0F, 3F, -1.5F, 0F, 0F, 0F); // Box 519
		bodyModel[424].setRotationPoint(-90F, -35F, 0.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-3F, 0F, 3F, 2F, -1F, 3F, 2F, -1F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[425].setRotationPoint(-95F, -45F, 2.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 3F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, -4F, -3F, 0F, 0F, 0F); // Box 521
		bodyModel[426].setRotationPoint(-92F, -45F, -0.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-3F, 0F, -3F, 2F, -1F, -3F, 2F, -1F, 3F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[427].setRotationPoint(-95F, -45F, 4.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, -3F, 0F, 3.25F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, -3F, 0F, -4F, 3F, 0F, 0F, 0F); // Box 523
		bodyModel[428].setRotationPoint(-92F, -45F, 7.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 524
		bodyModel[429].setRotationPoint(115F, -37F, -8F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[430].setRotationPoint(115F, -67F, -4F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 526
		bodyModel[431].setRotationPoint(115F, -66F, -4F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 527
		bodyModel[432].setRotationPoint(115F, -64F, -7F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 528
		bodyModel[433].setRotationPoint(115F, -61F, -10F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 529
		bodyModel[434].setRotationPoint(115F, -57F, -12F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[435].setRotationPoint(115F, -52F, -13F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 531
		bodyModel[436].setRotationPoint(115F, -48F, -13F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 532
		bodyModel[437].setRotationPoint(115F, -44F, -12F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 533
		bodyModel[438].setRotationPoint(115F, -40F, -10F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 14, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 638
		bodyModel[439].setRotationPoint(-35F, -52F, -12F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 639
		bodyModel[440].setRotationPoint(-38F, -38F, -12F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 640
		bodyModel[441].setRotationPoint(-41F, -35F, -12F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[442].setRotationPoint(-47F, -34F, -12F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[443].setRotationPoint(-50F, -36F, -12F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 643
		bodyModel[444].setRotationPoint(-45F, -38F, -12F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 644
		bodyModel[445].setRotationPoint(-50F, -38F, -12F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 645
		bodyModel[446].setRotationPoint(-45F, -38F, -1F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F); // Box 646
		bodyModel[447].setRotationPoint(-50F, -38F, -1F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		bodyModel[448].setRotationPoint(-51F, -33F, -8F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		bodyModel[449].setRotationPoint(-54F, -33F, -12F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 649
		bodyModel[450].setRotationPoint(-54F, -47F, -0.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		bodyModel[451].setRotationPoint(-52F, -47F, -6.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		bodyModel[452].setRotationPoint(-58F, -48F, -15F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, -1F, 0F, 0F, 0F); // Box 652
		bodyModel[453].setRotationPoint(-54F, -48F, -15F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, -1F, 0F, 0F, 0F); // Box 653
		bodyModel[454].setRotationPoint(-45F, -45F, -16F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		bodyModel[455].setRotationPoint(-36F, -51F, -16F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 655
		bodyModel[456].setRotationPoint(-38F, -51F, -16F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[457].setRotationPoint(-51F, -47F, -6.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		bodyModel[458].setRotationPoint(-50.5F, -47F, -5.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		bodyModel[459].setRotationPoint(-50.5F, -47F, -8.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 659
		bodyModel[460].setRotationPoint(-50.5F, -48F, -10.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		bodyModel[461].setRotationPoint(-50.5F, -49F, -10.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 662
		bodyModel[462].setRotationPoint(-50.5F, -52F, -9.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 663
		bodyModel[463].setRotationPoint(-50.5F, -52F, -3.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 664
		bodyModel[464].setRotationPoint(-50.5F, -48F, -2.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		bodyModel[465].setRotationPoint(-50.5F, -49F, -2.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 666
		bodyModel[466].setRotationPoint(-61.9F, -59.5F, -5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 667
		bodyModel[467].setRotationPoint(-61.9F, -59F, -5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 668
		bodyModel[468].setRotationPoint(-61.9F, -59F, -5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 669
		bodyModel[469].setRotationPoint(-61.9F, -59.5F, -3F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 670
		bodyModel[470].setRotationPoint(-61.9F, -59F, -3F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 671
		bodyModel[471].setRotationPoint(-61.9F, -59F, -3F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 672
		bodyModel[472].setRotationPoint(-61.9F, -61.25F, -3F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 673
		bodyModel[473].setRotationPoint(-61.9F, -60.75F, -3F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 674
		bodyModel[474].setRotationPoint(-61.9F, -60.75F, -3F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 675
		bodyModel[475].setRotationPoint(-61.9F, -61.25F, -1.25F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 676
		bodyModel[476].setRotationPoint(-61.9F, -60.75F, -1.25F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 677
		bodyModel[477].setRotationPoint(-61.9F, -60.75F, -1.25F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 678
		bodyModel[478].setRotationPoint(-61.9F, -59F, -1.25F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 679
		bodyModel[479].setRotationPoint(-61.9F, -59.5F, -1.25F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 680
		bodyModel[480].setRotationPoint(-61.9F, -59F, -1.25F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 681
		bodyModel[481].setRotationPoint(-61.9F, -61.25F, 4.75F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 682
		bodyModel[482].setRotationPoint(-61.9F, -60.75F, 4.75F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 683
		bodyModel[483].setRotationPoint(-61.9F, -60.75F, 4.75F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 684
		bodyModel[484].setRotationPoint(-61.9F, -59F, 4.75F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 685
		bodyModel[485].setRotationPoint(-61.9F, -59.5F, 4.75F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 686
		bodyModel[486].setRotationPoint(-61.9F, -59F, 4.75F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 687
		bodyModel[487].setRotationPoint(-61.9F, -60.75F, 3F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 688
		bodyModel[488].setRotationPoint(-61.9F, -60.75F, 3F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 689
		bodyModel[489].setRotationPoint(-61.9F, -61.25F, 3F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 690
		bodyModel[490].setRotationPoint(-61.9F, -59F, 3F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 691
		bodyModel[491].setRotationPoint(-61.9F, -59F, 3F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 692
		bodyModel[492].setRotationPoint(-61.9F, -59.5F, 3F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		bodyModel[493].setRotationPoint(-62F, -62F, -4F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[494].setRotationPoint(-62F, -31F, -3.5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		bodyModel[495].setRotationPoint(-62F, -36F, -3.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 697
		bodyModel[496].setRotationPoint(-64F, -40F, -4F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		bodyModel[497].setRotationPoint(-62F, -36F, -9.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		bodyModel[498].setRotationPoint(-62F, -31F, -9.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 700
		bodyModel[499].setRotationPoint(-64F, -40F, -10F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 701
		bodyModel[501] = new ModelRendererTurbo(this, 1081, 89, textureX, textureY); // Box 702
		bodyModel[502] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 703
		bodyModel[503] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Box 704
		bodyModel[504] = new ModelRendererTurbo(this, 1361, 105, textureX, textureY); // Box 705

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 1F, -1F, 0F, 1.4F, -0.8F, 0F, 0.4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 701
		bodyModel[500].setRotationPoint(-72F, -53F, -10F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.55F); // Box 702
		bodyModel[501].setRotationPoint(-72F, -50F, -12F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0.55F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.55F, 0F, -0.75F, -1.5F, 0F, -0.6F, -1.25F, 0F, -0.6F, 1.25F, 0F, -0.75F, 1.5F); // Box 703
		bodyModel[502].setRotationPoint(-72F, -43F, -12F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.35F, 0.75F, 0F, -0.35F, -0.75F, 0F, -0.25F, -0.5F, 0F, 1F, -5F, 0F, 1F, -4.85F, 0F, 0.15F, 3.9F, 0F, 0F, 4F); // Box 704
		bodyModel[503].setRotationPoint(-72F, -34F, -10F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, -0.1F, 0.15F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.15F, 0F, 1.1F, 0F, 0F, 0.9F, 0F); // Box 705
		bodyModel[504].setRotationPoint(-72F, -28F, -4F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 61
		tailModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 94
		tailModel[2] = new ModelRendererTurbo(this, 1025, 49, textureX, textureY); // Box 227
		tailModel[3] = new ModelRendererTurbo(this, 1281, 49, textureX, textureY); // Box 228
		tailModel[4] = new ModelRendererTurbo(this, 1281, 65, textureX, textureY); // Box 237
		tailModel[5] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 259
		tailModel[6] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 260
		tailModel[7] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 262
		tailModel[8] = new ModelRendererTurbo(this, 1193, 49, textureX, textureY); // Box 263
		tailModel[9] = new ModelRendererTurbo(this, 1969, 49, textureX, textureY); // Box 264
		tailModel[10] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 265
		tailModel[11] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 266
		tailModel[12] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 267
		tailModel[13] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 268
		tailModel[14] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 269
		tailModel[15] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 270
		tailModel[16] = new ModelRendererTurbo(this, 1145, 57, textureX, textureY); // Box 271
		tailModel[17] = new ModelRendererTurbo(this, 1401, 57, textureX, textureY); // Box 272
		tailModel[18] = new ModelRendererTurbo(this, 1601, 57, textureX, textureY); // Box 273
		tailModel[19] = new ModelRendererTurbo(this, 1801, 57, textureX, textureY); // Box 274
		tailModel[20] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 275
		tailModel[21] = new ModelRendererTurbo(this, 1633, 57, textureX, textureY); // Box 276
		tailModel[22] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 277
		tailModel[23] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 278
		tailModel[24] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 279
		tailModel[25] = new ModelRendererTurbo(this, 1833, 57, textureX, textureY); // Box 280
		tailModel[26] = new ModelRendererTurbo(this, 2025, 57, textureX, textureY); // Box 281
		tailModel[27] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 282
		tailModel[28] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 283
		tailModel[29] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 284
		tailModel[30] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 286
		tailModel[31] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 288
		tailModel[32] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 289
		tailModel[33] = new ModelRendererTurbo(this, 1401, 73, textureX, textureY); // Box 291
		tailModel[34] = new ModelRendererTurbo(this, 1681, 73, textureX, textureY); // Box 292
		tailModel[35] = new ModelRendererTurbo(this, 1761, 73, textureX, textureY); // Box 294
		tailModel[36] = new ModelRendererTurbo(this, 1905, 73, textureX, textureY); // Box 295
		tailModel[37] = new ModelRendererTurbo(this, 1601, 65, textureX, textureY); // Box 303
		tailModel[38] = new ModelRendererTurbo(this, 1801, 65, textureX, textureY); // Box 307

		tailModel[0].addShapeBox(0F, 0F, 0F, 53, 1, 4, 0F,0F, 1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 61
		tailModel[0].setRotationPoint(115F, -66F, -4F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 53, 1, 4, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -1F, 0F); // Box 94
		tailModel[1].setRotationPoint(115F, -66F, 0F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 55, 1, 4, 0F,0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 0F, 0F); // Box 227
		tailModel[2].setRotationPoint(168F, -65F, -2F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 55, 1, 4, 0F,0F, 0F, 0F, 0F, -5F, -3F, 0F, -4F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 5F, -3F, 0F, 4F, 1F, 0F, -2F, 0F); // Box 228
		tailModel[3].setRotationPoint(168F, -63F, -6F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 55, 1, 4, 0F,0F, 2F, 0F, 0F, -4F, 1F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 1F, 0F, 5F, -3F, 0F, 0F, 0F); // Box 237
		tailModel[4].setRotationPoint(168F, -63F, 2F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 17, 35, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 259
		tailModel[5].setRotationPoint(195F, -96F, -2F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 17, 10, 4, 0F,-6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		tailModel[6].setRotationPoint(195F, -106F, -2F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 5, 35, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 9F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 9F, 0F, -1F); // Box 262
		tailModel[7].setRotationPoint(190F, -96F, -2F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 6F, 0F, 0F, -6F, 0F, 1F, -6F, 0F, 1F, 6F, 0F, 0F); // Box 263
		tailModel[8].setRotationPoint(196F, -106F, -1F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,-6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		tailModel[9].setRotationPoint(201F, -110F, -1F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,-4F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -2F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F); // Box 265
		tailModel[10].setRotationPoint(197F, -110F, -1F);

		tailModel[11].addShapeBox(0F, 0F, -2F, 20, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -2F, -14F, 0F, -2F, 0F, 0F, 0F); // Box 266
		tailModel[11].setRotationPoint(212F, -66F, 0F);

		tailModel[12].addShapeBox(0F, 0F, -2F, 20, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 267
		tailModel[12].setRotationPoint(212F, -69F, 0F);

		tailModel[13].addShapeBox(0F, 0F, -2F, 20, 27, 4, 0F,0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 268
		tailModel[13].setRotationPoint(212F, -96F, 0F);

		tailModel[14].addShapeBox(0F, 0F, -1F, 14, 10, 2, 0F,0F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 269
		tailModel[14].setRotationPoint(212F, -106F, 0F);

		tailModel[15].addShapeBox(0F, 0F, -1F, 7, 4, 2, 0F,0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 270
		tailModel[15].setRotationPoint(212F, -110F, 0F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 17, 58, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 271
		tailModel[16].setRotationPoint(194F, -56F, 64F);
		tailModel[16].rotateAngleX = -1.57079633F;

		tailModel[17].addShapeBox(0F, 0F, 0F, 17, 10, 5, 0F,-6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		tailModel[17].setRotationPoint(194F, -56F, 74F);
		tailModel[17].rotateAngleX = -1.57079633F;

		tailModel[18].addShapeBox(0F, 0F, 0F, 11, 4, 3, 0F,-6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		tailModel[18].setRotationPoint(200F, -55F, 78F);
		tailModel[18].rotateAngleX = -1.57079633F;

		tailModel[19].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,-4F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -2F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F); // Box 274
		tailModel[19].setRotationPoint(196F, -55F, 78F);
		tailModel[19].rotateAngleX = -1.57079633F;

		tailModel[20].addShapeBox(0F, 0F, 0F, 5, 10, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 6F, 0F, 0F, -6F, 0F, 1F, -6F, 0F, 1F, 6F, 0F, 0F); // Box 275
		tailModel[20].setRotationPoint(195F, -55F, 74F);
		tailModel[20].rotateAngleX = -1.57079633F;

		tailModel[21].addShapeBox(0F, 0F, 0F, 5, 15, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 8F, 2F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 8F, 2F, -1F); // Box 276
		tailModel[21].setRotationPoint(189F, -56F, 64F);
		tailModel[21].rotateAngleX = -1.57079633F;

		tailModel[22].addShapeBox(0F, 0F, 0F, 13, 38, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, -1F); // Box 277
		tailModel[22].setRotationPoint(181F, -56F, 47F);
		tailModel[22].rotateAngleX = -1.57079633F;

		tailModel[23].addShapeBox(0F, 0F, 0F, 13, 38, 5, 0F,2F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 278
		tailModel[23].setRotationPoint(181F, -56F, -9F);
		tailModel[23].rotateAngleX = -1.57079633F;

		tailModel[24].addShapeBox(0F, 0F, 0F, 17, 58, 5, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		tailModel[24].setRotationPoint(194F, -56F, -6F);
		tailModel[24].rotateAngleX = -1.57079633F;

		tailModel[25].addShapeBox(0F, 0F, 0F, 5, 15, 5, 0F,8F, 2F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 8F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 280
		tailModel[25].setRotationPoint(189F, -56F, -49F);
		tailModel[25].rotateAngleX = -1.57079633F;

		tailModel[26].addShapeBox(0F, 0F, 0F, 5, 10, 3, 0F,6F, 0F, 0F, -6F, 0F, 1F, -6F, 0F, 1F, 6F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 281
		tailModel[26].setRotationPoint(195F, -55F, -64F);
		tailModel[26].rotateAngleX = -1.57079633F;

		tailModel[27].addShapeBox(0F, 0F, 0F, 17, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F); // Box 282
		tailModel[27].setRotationPoint(194F, -56F, -64F);
		tailModel[27].rotateAngleX = -1.57079633F;

		tailModel[28].addShapeBox(0F, 0F, 0F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F); // Box 283
		tailModel[28].setRotationPoint(200F, -55F, -74F);
		tailModel[28].rotateAngleX = -1.57079633F;

		tailModel[29].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, -4F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -2F, -1F); // Box 284
		tailModel[29].setRotationPoint(196F, -55F, -74F);
		tailModel[29].rotateAngleX = -1.57079633F;

		tailModel[30].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, 0F); // Box 286
		tailModel[30].setRotationPoint(223F, -59F, -1F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, -4F, 0.5F, 0F, -4F, -2.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0.5F, 0F, 3F, -2.5F, 0F, 1F, 0F); // Box 288
		tailModel[31].setRotationPoint(223F, -59F, 1F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 2.5F, 0F, -3F, -3.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 2.5F, 0F, 2F, -3.5F, 0F, 0F, 0F); // Box 289
		tailModel[32].setRotationPoint(223F, -58F, 3F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, -1F, 0F, 0F, -4F, -2.5F, 0F, -4F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, -2.5F, 0F, 3F, 0.5F, 0F, 0F, 0F); // Box 291
		tailModel[33].setRotationPoint(223F, -59F, -3F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -1F, 0F, 0F, -3F, -3.5F, 0F, -3F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3.5F, 0F, 2F, 2.5F, 0F, 0F, 0F); // Box 292
		tailModel[34].setRotationPoint(223F, -58F, -4F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, 4F, -1.5F, 0F, 4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5F, -1.5F, 0F, -5F, 0F, 0F, 0.5F, 0F); // Box 294
		tailModel[35].setRotationPoint(223F, -50F, -2F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, -0.5F, 0F, 0F, 4F, 0F, 0F, 4F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, -1.5F, 0F, 0F, 0F); // Box 295
		tailModel[36].setRotationPoint(223F, -50F, 0F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -2F, 0F, 0F, -1F); // Box 303
		tailModel[37].setRotationPoint(211F, -55F, -74F);
		tailModel[37].rotateAngleX = -1.57079633F;

		tailModel[38].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,0F, 0F, -1F, -6F, 0F, -2F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 307
		tailModel[38].setRotationPoint(211F, -55F, 78F);
		tailModel[38].rotateAngleX = -1.57079633F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Box 209
		leftWingModel[1] = new ModelRendererTurbo(this, 1121, 49, textureX, textureY); // Box 210
		leftWingModel[2] = new ModelRendererTurbo(this, 1369, 49, textureX, textureY); // Box 211
		leftWingModel[3] = new ModelRendererTurbo(this, 1569, 49, textureX, textureY); // Box 210
		leftWingModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 214
		leftWingModel[5] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 215
		leftWingModel[6] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 216
		leftWingModel[7] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 217
		leftWingModel[8] = new ModelRendererTurbo(this, 1713, 161, textureX, textureY); // Box 229
		leftWingModel[9] = new ModelRendererTurbo(this, 1241, 153, textureX, textureY); // Box 230
		leftWingModel[10] = new ModelRendererTurbo(this, 1025, 81, textureX, textureY); // Box 313
		leftWingModel[11] = new ModelRendererTurbo(this, 1281, 81, textureX, textureY); // Box 314
		leftWingModel[12] = new ModelRendererTurbo(this, 1361, 81, textureX, textureY); // Box 315
		leftWingModel[13] = new ModelRendererTurbo(this, 1441, 49, textureX, textureY); // Box 314
		leftWingModel[14] = new ModelRendererTurbo(this, 1537, 81, textureX, textureY); // Box 320
		leftWingModel[15] = new ModelRendererTurbo(this, 1753, 81, textureX, textureY); // Box 321
		leftWingModel[16] = new ModelRendererTurbo(this, 1905, 81, textureX, textureY); // Box 322
		leftWingModel[17] = new ModelRendererTurbo(this, 1961, 81, textureX, textureY); // Box 323
		leftWingModel[18] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Box 324
		leftWingModel[19] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 325
		leftWingModel[20] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 534
		leftWingModel[21] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 535
		leftWingModel[22] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 536
		leftWingModel[23] = new ModelRendererTurbo(this, 1577, 153, textureX, textureY); // Box 537
		leftWingModel[24] = new ModelRendererTurbo(this, 1313, 113, textureX, textureY); // Box 538
		leftWingModel[25] = new ModelRendererTurbo(this, 1769, 113, textureX, textureY); // Box 540
		leftWingModel[26] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 541
		leftWingModel[27] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 542
		leftWingModel[28] = new ModelRendererTurbo(this, 1905, 113, textureX, textureY); // Box 543
		leftWingModel[29] = new ModelRendererTurbo(this, 1977, 145, textureX, textureY); // Box 544
		leftWingModel[30] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 545
		leftWingModel[31] = new ModelRendererTurbo(this, 1137, 153, textureX, textureY); // Box 546
		leftWingModel[32] = new ModelRendererTurbo(this, 1241, 153, textureX, textureY); // Box 547
		leftWingModel[33] = new ModelRendererTurbo(this, 1361, 153, textureX, textureY); // Box 548
		leftWingModel[34] = new ModelRendererTurbo(this, 1713, 153, textureX, textureY); // Box 549
		leftWingModel[35] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 550
		leftWingModel[36] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 551
		leftWingModel[37] = new ModelRendererTurbo(this, 825, 169, textureX, textureY); // Box 552
		leftWingModel[38] = new ModelRendererTurbo(this, 569, 177, textureX, textureY); // Box 553
		leftWingModel[39] = new ModelRendererTurbo(this, 633, 185, textureX, textureY); // Box 554
		leftWingModel[40] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 555
		leftWingModel[41] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 556
		leftWingModel[42] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 557
		leftWingModel[43] = new ModelRendererTurbo(this, 1633, 97, textureX, textureY); // Box 558
		leftWingModel[44] = new ModelRendererTurbo(this, 1721, 97, textureX, textureY); // Box 560
		leftWingModel[45] = new ModelRendererTurbo(this, 1793, 97, textureX, textureY); // Box 561
		leftWingModel[46] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 562
		leftWingModel[47] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 563
		leftWingModel[48] = new ModelRendererTurbo(this, 1937, 177, textureX, textureY); // Box 564
		leftWingModel[49] = new ModelRendererTurbo(this, 1017, 185, textureX, textureY); // Box 565
		leftWingModel[50] = new ModelRendererTurbo(this, 633, 137, textureX, textureY); // Box 566
		leftWingModel[51] = new ModelRendererTurbo(this, 1025, 121, textureX, textureY); // Box 567
		leftWingModel[52] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Box 568
		leftWingModel[53] = new ModelRendererTurbo(this, 1905, 97, textureX, textureY); // Box 590
		leftWingModel[54] = new ModelRendererTurbo(this, 1713, 225, textureX, textureY); // Box 599
		leftWingModel[55] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 600
		leftWingModel[56] = new ModelRendererTurbo(this, 1745, 113, textureX, textureY); // Box 601
		leftWingModel[57] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 602
		leftWingModel[58] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 603
		leftWingModel[59] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 605
		leftWingModel[60] = new ModelRendererTurbo(this, 1817, 113, textureX, textureY); // Box 607
		leftWingModel[61] = new ModelRendererTurbo(this, 1481, 105, textureX, textureY); // Box 608
		leftWingModel[62] = new ModelRendererTurbo(this, 1617, 121, textureX, textureY); // Box 616
		leftWingModel[63] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 617
		leftWingModel[64] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 618
		leftWingModel[65] = new ModelRendererTurbo(this, 1761, 97, textureX, textureY); // Box 619
		leftWingModel[66] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 620
		leftWingModel[67] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 621
		leftWingModel[68] = new ModelRendererTurbo(this, 2025, 97, textureX, textureY); // Box 622
		leftWingModel[69] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 623
		leftWingModel[70] = new ModelRendererTurbo(this, 1097, 105, textureX, textureY); // Box 624
		leftWingModel[71] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 625
		leftWingModel[72] = new ModelRendererTurbo(this, 633, 105, textureX, textureY); // Box 626
		leftWingModel[73] = new ModelRendererTurbo(this, 1313, 113, textureX, textureY); // Box 749

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 23, 13, 89, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 9F, 0F, 0F, 12F, 0F); // Box 209
		leftWingModel[0].setRotationPoint(-19F, -51F, -109F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 32, 12, 89, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -12F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 10F, 0F); // Box 210
		leftWingModel[1].setRotationPoint(4F, -51F, -109F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 10, 14, 89, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 4F, -8F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 11F, 0F, 4F, 11F, 0F); // Box 211
		leftWingModel[2].setRotationPoint(-29F, -51F, -109F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 10, 11, 89, 0F,-5F, -3F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, 9F, -11F, 0F, -5F, -5F, 0F, 0F, -2F, 0F, -4F, 12F, 0F, 9F, 6F, 0F); // Box 210
		leftWingModel[3].setRotationPoint(-39F, -49F, -109F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 10, 9, 102, 0F,-5F, -3F, 0F, 0F, -2F, 0F, -29F, -12F, 0F, 24F, -15F, 0F, -5F, -5F, 0F, 0F, -3F, 0F, -29F, 12F, 0F, 24F, 9F, 0F); // Box 214
		leftWingModel[4].setRotationPoint(-10F, -61F, -211F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 8, 8, 102, 0F,0F, -2F, 0F, 0F, -1F, 0F, -27F, -10F, 0F, 29F, -12F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -27F, 15F, 0F, 29F, 13F, 0F); // Box 215
		leftWingModel[5].setRotationPoint(0F, -61F, -211F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 14, 6, 102, 0F,0F, 0F, 0F, 0F, 0F, 0F, -18F, -9F, 0F, 27F, -9F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -18F, 15F, 0F, 27F, 16F, 0F); // Box 216
		leftWingModel[6].setRotationPoint(8F, -60F, -211F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 11, 5, 102, 0F,0F, 0F, 0F, 1F, -1F, 0F, 3F, -13F, 0F, 18F, -9F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 3F, 13F, 0F, 18F, 16F, 0F); // Box 217
		leftWingModel[7].setRotationPoint(22F, -60F, -211F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 12, 5, 102, 0F,2F, 12F, 0F, -9F, 11F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, -14F, 0F, -9F, -16F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 229
		leftWingModel[8].setRotationPoint(36F, -47F, -211F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 89, 0F,0F, 8F, 0F, 0F, 5F, 0F, 2F, -1F, -30F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -9F, 0F, 2F, -3F, -27F, 0F, 0F, 0F); // Box 230
		leftWingModel[9].setRotationPoint(36F, -39F, -109F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 14, 1, 13, 0F,0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		leftWingModel[10].setRotationPoint(-33F, -24F, -20F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 23, 2, 13, 0F,0F, 3F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		leftWingModel[11].setRotationPoint(-19F, -25F, -20F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 32, 1, 13, 0F,0F, 3F, 0F, 0F, 9F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 3F, 0F); // Box 315
		leftWingModel[12].setRotationPoint(4F, -27F, -20F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		leftWingModel[13].setRotationPoint(-49F, -38F, -20F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,-1F, 0F, 0F, 0F, 5F, 0F, 0F, 7F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, -1F, 0F, 0F, 0F); // Box 320
		leftWingModel[14].setRotationPoint(-49F, -38F, -20F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 321
		leftWingModel[15].setRotationPoint(-33F, -43F, -20F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 23, 1, 3, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 2F, -1F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -4F, 0F); // Box 322
		leftWingModel[16].setRotationPoint(-19F, -43F, -20F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 2F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 1F, 2F, 0F, -3F, 0F); // Box 323
		leftWingModel[17].setRotationPoint(4F, -42F, -20F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 12, 6, 4, 0F,0F, -2F, 0F, -5F, -3F, -2F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, -2F, 0F, -2F, 1F, 0F, 3.65F, 2F); // Box 324
		leftWingModel[18].setRotationPoint(36F, -41F, -20F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -9F, 8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 9F, 8F, 1F, 0F, 0F); // Box 325
		leftWingModel[19].setRotationPoint(-48F, -33F, -20F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 66, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		leftWingModel[20].setRotationPoint(-59F, -39F, -63F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 66, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 535
		leftWingModel[21].setRotationPoint(-59F, -31F, -63F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 23, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, 0F, 0F); // Box 536
		leftWingModel[22].setRotationPoint(7F, -39F, -63F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 23, 5, 24, 0F,0F, 0F, 0F, 0F, 4F, -7F, 0F, 4F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, 0F, -1F); // Box 537
		leftWingModel[23].setRotationPoint(7F, -31F, -63F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 14, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 538
		leftWingModel[24].setRotationPoint(-59F, -26F, -62F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 10, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		leftWingModel[25].setRotationPoint(-45F, -26F, -62F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 15, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 541
		leftWingModel[26].setRotationPoint(-50F, -19F, -62F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 542
		leftWingModel[27].setRotationPoint(-35F, -19F, -62F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 2, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 543
		leftWingModel[28].setRotationPoint(-35F, -26F, -62F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 9, 2, 22, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 544
		leftWingModel[29].setRotationPoint(-33F, -19F, -62F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 9, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 545
		leftWingModel[30].setRotationPoint(-33F, -26F, -62F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 10, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		leftWingModel[31].setRotationPoint(-24F, -26F, -62F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 10, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 547
		leftWingModel[32].setRotationPoint(-24F, -19F, -62F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 10, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 548
		leftWingModel[33].setRotationPoint(-3F, -26F, -62F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 11, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 549
		leftWingModel[34].setRotationPoint(-14F, -26F, -62F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 11, 2, 22, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 550
		leftWingModel[35].setRotationPoint(-14F, -19F, -62F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 10, 2, 22, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -2F); // Box 551
		leftWingModel[36].setRotationPoint(-3F, -21F, -62F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 23, 2, 22, 0F,0F, 0F, 0F, 0F, 8F, -8F, 0F, 8F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9F, -10F, 0F, -9F, -10F, 0F, 0F, -1F); // Box 552
		leftWingModel[37].setRotationPoint(7F, -26F, -62F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 23, 2, 20, 0F,0F, 0F, 0F, 0F, 9F, -9F, 0F, 9F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -11F, -9F, 0F, -11F, -9F, 0F, 0F, -2F); // Box 553
		leftWingModel[38].setRotationPoint(7F, -24F, -61F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 66, 5, 24, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		leftWingModel[39].setRotationPoint(-59F, -44F, -63F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 52, 2, 18, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		leftWingModel[40].setRotationPoint(-59F, -46F, -60F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 52, 1, 12, 0F,0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		leftWingModel[41].setRotationPoint(-59F, -47F, -57F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 14, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 557
		leftWingModel[42].setRotationPoint(-59F, -24F, -60F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		leftWingModel[43].setRotationPoint(-50F, -26F, -62F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		leftWingModel[44].setRotationPoint(-50F, -26F, -62F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		leftWingModel[45].setRotationPoint(-50F, -26F, -42F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 18, 2, 14, 0F,0F, 0F, -3F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 562
		leftWingModel[46].setRotationPoint(-77F, -44F, -58F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 18, 4, 18, 0F,0F, 0F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F); // Box 563
		leftWingModel[47].setRotationPoint(-77F, -42F, -60F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 18, 8, 24, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 564
		leftWingModel[48].setRotationPoint(-77F, -39F, -63F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 18, 4, 18, 0F,0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 0F, -1F); // Box 565
		leftWingModel[49].setRotationPoint(-77F, -34F, -60F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 18, 3, 16, 0F,0F, 0F, 0F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, -2F); // Box 566
		leftWingModel[50].setRotationPoint(-77F, -30F, -59F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 18, 1, 12, 0F,0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, -5F); // Box 567
		leftWingModel[51].setRotationPoint(-77F, -27F, -57F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, 0F, -3F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 568
		leftWingModel[52].setRotationPoint(-77F, -45F, -55F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftWingModel[53].setRotationPoint(-50F, -26F, 60F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 23, 2, 22, 0F,0F, 0F, 0F, 0F, 8F, -8F, 0F, 8F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9F, -10F, 0F, -9F, -10F, 0F, 0F, -1F); // Box 599
		leftWingModel[54].setRotationPoint(7F, -26F, 40F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 4, 4, 18, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 600
		leftWingModel[55].setRotationPoint(-81F, -38F, -60F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, -6F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 601
		leftWingModel[56].setRotationPoint(-81F, -41F, -60F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, -5F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F); // Box 602
		leftWingModel[57].setRotationPoint(-81F, -42F, -57F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F); // Box 603
		leftWingModel[58].setRotationPoint(-81F, -45F, -55F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -4F); // Box 605
		leftWingModel[59].setRotationPoint(-81F, -34F, -60F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 4, 3, 16, 0F,0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -1F, -6F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, -6F); // Box 607
		leftWingModel[60].setRotationPoint(-81F, -31F, -59F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 1F, -3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -3F, 0F, -1.5F, -4.5F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -1.5F, -4.5F); // Box 608
		leftWingModel[61].setRotationPoint(-81F, -28F, -56F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 616
		leftWingModel[62].setRotationPoint(-89F, -38F, -57F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -3F); // Box 617
		leftWingModel[63].setRotationPoint(-89F, -34F, -57F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, -4F); // Box 618
		leftWingModel[64].setRotationPoint(-89F, -32F, -56F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1F, -1F); // Box 619
		leftWingModel[65].setRotationPoint(-89F, -31F, -52F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 620
		leftWingModel[66].setRotationPoint(-89F, -39F, -57F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.5F, -1.5F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 621
		leftWingModel[67].setRotationPoint(-89F, -40F, -53F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F); // Box 622
		leftWingModel[68].setRotationPoint(-92F, -37F, -55F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, -3.5F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -3.5F, 0F, 0F, -2.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2.5F); // Box 623
		leftWingModel[69].setRotationPoint(-92F, -37F, -55F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, -0.5F, -3.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.5F, -3.5F); // Box 624
		leftWingModel[70].setRotationPoint(-92F, -34F, -55F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 1.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2.5F, 0F, -2.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2.5F, -3F); // Box 625
		leftWingModel[71].setRotationPoint(-92F, -32F, -54F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -3F, -3F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -3F, -3F, 0F, 2F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -2.5F); // Box 626
		leftWingModel[72].setRotationPoint(-92F, -40F, -54F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 14, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 749
		leftWingModel[73].setRotationPoint(-59F, -26F, 40F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1769, 57, textureX, textureY); // Box 218
		rightWingModel[1] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 219
		rightWingModel[2] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 220
		rightWingModel[3] = new ModelRendererTurbo(this, 889, 153, textureX, textureY); // Box 222
		rightWingModel[4] = new ModelRendererTurbo(this, 1121, 153, textureX, textureY); // Box 223
		rightWingModel[5] = new ModelRendererTurbo(this, 1345, 153, textureX, textureY); // Box 224
		rightWingModel[6] = new ModelRendererTurbo(this, 1585, 153, textureX, textureY); // Box 225
		rightWingModel[7] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 226
		rightWingModel[8] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 227
		rightWingModel[9] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 228
		rightWingModel[10] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 310
		rightWingModel[11] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 311
		rightWingModel[12] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 312
		rightWingModel[13] = new ModelRendererTurbo(this, 2033, 25, textureX, textureY); // Box 313
		rightWingModel[14] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 315
		rightWingModel[15] = new ModelRendererTurbo(this, 1073, 81, textureX, textureY); // Box 316
		rightWingModel[16] = new ModelRendererTurbo(this, 1481, 81, textureX, textureY); // Box 317
		rightWingModel[17] = new ModelRendererTurbo(this, 1681, 81, textureX, textureY); // Box 318
		rightWingModel[18] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 319
		rightWingModel[19] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 326
		rightWingModel[20] = new ModelRendererTurbo(this, 1681, 97, textureX, textureY); // Box 559
		rightWingModel[21] = new ModelRendererTurbo(this, 793, 201, textureX, textureY); // Box 569
		rightWingModel[22] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 570
		rightWingModel[23] = new ModelRendererTurbo(this, 1713, 185, textureX, textureY); // Box 571
		rightWingModel[24] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 572
		rightWingModel[25] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 573
		rightWingModel[26] = new ModelRendererTurbo(this, 1137, 185, textureX, textureY); // Box 574
		rightWingModel[27] = new ModelRendererTurbo(this, 1481, 153, textureX, textureY); // Box 575
		rightWingModel[28] = new ModelRendererTurbo(this, 1841, 161, textureX, textureY); // Box 576
		rightWingModel[29] = new ModelRendererTurbo(this, 1241, 185, textureX, textureY); // Box 577
		rightWingModel[30] = new ModelRendererTurbo(this, 1361, 185, textureX, textureY); // Box 578
		rightWingModel[31] = new ModelRendererTurbo(this, 1617, 201, textureX, textureY); // Box 579
		rightWingModel[32] = new ModelRendererTurbo(this, 585, 209, textureX, textureY); // Box 580
		rightWingModel[33] = new ModelRendererTurbo(this, 1017, 209, textureX, textureY); // Box 581
		rightWingModel[34] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 582
		rightWingModel[35] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 583
		rightWingModel[36] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 584
		rightWingModel[37] = new ModelRendererTurbo(this, 633, 217, textureX, textureY); // Box 585
		rightWingModel[38] = new ModelRendererTurbo(this, 1841, 233, textureX, textureY); // Box 586
		rightWingModel[39] = new ModelRendererTurbo(this, 1481, 225, textureX, textureY); // Box 587
		rightWingModel[40] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 588
		rightWingModel[41] = new ModelRendererTurbo(this, 705, 217, textureX, textureY); // Box 589
		rightWingModel[42] = new ModelRendererTurbo(this, 2001, 97, textureX, textureY); // Box 591
		rightWingModel[43] = new ModelRendererTurbo(this, 1145, 121, textureX, textureY); // Box 592
		rightWingModel[44] = new ModelRendererTurbo(this, 1137, 217, textureX, textureY); // Box 593
		rightWingModel[45] = new ModelRendererTurbo(this, 505, 233, textureX, textureY); // Box 594
		rightWingModel[46] = new ModelRendererTurbo(this, 1241, 217, textureX, textureY); // Box 595
		rightWingModel[47] = new ModelRendererTurbo(this, 1361, 217, textureX, textureY); // Box 596
		rightWingModel[48] = new ModelRendererTurbo(this, 1369, 121, textureX, textureY); // Box 597
		rightWingModel[49] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 598
		rightWingModel[50] = new ModelRendererTurbo(this, 2001, 177, textureX, textureY); // Box 609
		rightWingModel[51] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 610
		rightWingModel[52] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Box 611
		rightWingModel[53] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 612
		rightWingModel[54] = new ModelRendererTurbo(this, 1481, 185, textureX, textureY); // Box 613
		rightWingModel[55] = new ModelRendererTurbo(this, 1065, 153, textureX, textureY); // Box 614
		rightWingModel[56] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 615
		rightWingModel[57] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 627
		rightWingModel[58] = new ModelRendererTurbo(this, 1961, 129, textureX, textureY); // Box 628
		rightWingModel[59] = new ModelRendererTurbo(this, 1993, 129, textureX, textureY); // Box 629
		rightWingModel[60] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 630
		rightWingModel[61] = new ModelRendererTurbo(this, 689, 137, textureX, textureY); // Box 631
		rightWingModel[62] = new ModelRendererTurbo(this, 1681, 113, textureX, textureY); // Box 632
		rightWingModel[63] = new ModelRendererTurbo(this, 1369, 105, textureX, textureY); // Box 633
		rightWingModel[64] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 634
		rightWingModel[65] = new ModelRendererTurbo(this, 1993, 113, textureX, textureY); // Box 635
		rightWingModel[66] = new ModelRendererTurbo(this, 1601, 105, textureX, textureY); // Box 636
		rightWingModel[67] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 637

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 23, 13, 89, 0F,0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 218
		rightWingModel[0].setRotationPoint(-19F, -51F, 20F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 32, 12, 89, 0F,0F, -7F, 0F, 0F, -12F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 219
		rightWingModel[1].setRotationPoint(4F, -51F, 20F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 10, 14, 89, 0F,4F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 4F, 11F, 0F, 0F, 11F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 220
		rightWingModel[2].setRotationPoint(-29F, -51F, 20F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 10, 9, 102, 0F,24F, -15F, 0F, -29F, -12F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, 24F, 9F, 0F, -29F, 12F, 0F, 0F, -3F, 0F, -5F, -5F, 0F); // Box 222
		rightWingModel[3].setRotationPoint(-10F, -61F, 109F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 8, 8, 102, 0F,29F, -12F, 0F, -27F, -10F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 29F, 13F, 0F, -27F, 15F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 223
		rightWingModel[4].setRotationPoint(0F, -61F, 109F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 14, 6, 102, 0F,27F, -9F, 0F, -18F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 16F, 0F, -18F, 15F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 224
		rightWingModel[5].setRotationPoint(8F, -60F, 109F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 11, 5, 102, 0F,18F, -9F, 0F, 3F, -13F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 18F, 16F, 0F, 3F, 13F, 0F, 1F, -2F, 0F, 0F, 0F, 0F); // Box 225
		rightWingModel[6].setRotationPoint(22F, -60F, 109F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 10, 11, 89, 0F,9F, -11F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 9F, 6F, 0F, -4F, 12F, 0F, 0F, -2F, 0F, -5F, -5F, 0F); // Box 226
		rightWingModel[7].setRotationPoint(-39F, -49F, 20F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 13, 5, 102, 0F,0F, 0F, 0F, -1F, -3F, 0F, -9F, 11F, 0F, 2F, 12F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -9F, -16F, 0F, 2F, -15F, 0F); // Box 227
		rightWingModel[8].setRotationPoint(36F, -47F, 109F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 89, 0F,0F, 0F, 0F, 2F, -1F, -30F, 0F, 5F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 2F, -3F, -27F, 0F, -9F, 0F, 0F, -7F, 0F); // Box 228
		rightWingModel[9].setRotationPoint(36F, -39F, 20F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 14, 1, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 310
		rightWingModel[10].setRotationPoint(-33F, -24F, 7F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 23, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F); // Box 311
		rightWingModel[11].setRotationPoint(-19F, -25F, 7F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 32, 1, 13, 0F,0F, -3F, 0F, 0F, 1F, 0F, 0F, 9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -9F, 0F, 0F, -3F, 0F); // Box 312
		rightWingModel[12].setRotationPoint(4F, -27F, 7F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 313
		rightWingModel[13].setRotationPoint(-49F, -38F, 15F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 7F, -1F, 0F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, -5F, 0F, -1F, 0F, 0F); // Box 315
		rightWingModel[14].setRotationPoint(-49F, -38F, 16F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 316
		rightWingModel[15].setRotationPoint(-33F, -43F, 17F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 23, 1, 3, 0F,0F, 4F, 0F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 317
		rightWingModel[16].setRotationPoint(-19F, -43F, 17F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 32, 1, 2, 0F,0F, 3F, 0F, 0F, -1F, 2F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 1F, 2F, 0F, 3F, 0F, 0F, -2F, 0F); // Box 318
		rightWingModel[17].setRotationPoint(4F, -42F, 18F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 12, 6, 4, 0F,0F, 0F, 0F, 0F, -3F, 1F, -5F, -3F, -2F, 0F, -2F, 0F, 0F, 3.65F, 2F, 0F, -2F, 1F, -5F, -2F, -2F, 0F, 0F, 0F); // Box 319
		rightWingModel[18].setRotationPoint(36F, -41F, 16F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,1F, 0F, 0F, 0F, -9F, 8F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 9F, 8F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 326
		rightWingModel[19].setRotationPoint(-48F, -33F, 15F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		rightWingModel[20].setRotationPoint(-50F, -26F, 60F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 66, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		rightWingModel[21].setRotationPoint(-59F, -39F, 39F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 66, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 570
		rightWingModel[22].setRotationPoint(-59F, -31F, 39F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 23, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, 0F, 0F); // Box 571
		rightWingModel[23].setRotationPoint(7F, -39F, 39F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 23, 5, 24, 0F,0F, 0F, 0F, 0F, 4F, -7F, 0F, 4F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, 0F, -1F); // Box 572
		rightWingModel[24].setRotationPoint(7F, -31F, 39F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 10, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		rightWingModel[25].setRotationPoint(-45F, -26F, 40F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 15, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 574
		rightWingModel[26].setRotationPoint(-50F, -19F, 40F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 575
		rightWingModel[27].setRotationPoint(-35F, -19F, 40F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 2, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 576
		rightWingModel[28].setRotationPoint(-35F, -26F, 40F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 9, 2, 22, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 577
		rightWingModel[29].setRotationPoint(-33F, -19F, 40F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 9, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 578
		rightWingModel[30].setRotationPoint(-33F, -26F, 40F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 10, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		rightWingModel[31].setRotationPoint(-24F, -26F, 40F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 10, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 580
		rightWingModel[32].setRotationPoint(-24F, -19F, 40F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 10, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 581
		rightWingModel[33].setRotationPoint(-3F, -26F, 40F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 11, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 582
		rightWingModel[34].setRotationPoint(-14F, -26F, 40F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 11, 2, 22, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 583
		rightWingModel[35].setRotationPoint(-14F, -19F, 40F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 10, 2, 22, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -2F); // Box 584
		rightWingModel[36].setRotationPoint(-3F, -21F, 40F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 23, 2, 20, 0F,0F, 0F, 0F, 0F, 9F, -9F, 0F, 9F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -11F, -9F, 0F, -11F, -9F, 0F, 0F, -2F); // Box 585
		rightWingModel[37].setRotationPoint(7F, -24F, 41F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 66, 5, 24, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		rightWingModel[38].setRotationPoint(-59F, -44F, 39F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 52, 2, 18, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		rightWingModel[39].setRotationPoint(-59F, -46F, 42F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 52, 1, 12, 0F,0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		rightWingModel[40].setRotationPoint(-59F, -47F, 45F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 14, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 589
		rightWingModel[41].setRotationPoint(-59F, -24F, 42F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		rightWingModel[42].setRotationPoint(-50F, -26F, 40F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 18, 2, 14, 0F,0F, 0F, -3F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 592
		rightWingModel[43].setRotationPoint(-77F, -44F, 44F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 18, 4, 18, 0F,0F, 0F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F); // Box 593
		rightWingModel[44].setRotationPoint(-77F, -42F, 42F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 18, 8, 24, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 594
		rightWingModel[45].setRotationPoint(-77F, -39F, 39F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 18, 4, 18, 0F,0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 0F, -1F); // Box 595
		rightWingModel[46].setRotationPoint(-77F, -34F, 42F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 18, 3, 16, 0F,0F, 0F, 0F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, -2F); // Box 596
		rightWingModel[47].setRotationPoint(-77F, -30F, 43F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 18, 1, 12, 0F,0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, -5F); // Box 597
		rightWingModel[48].setRotationPoint(-77F, -27F, 45F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, 0F, -3F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 598
		rightWingModel[49].setRotationPoint(-77F, -45F, 47F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 4, 4, 18, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 609
		rightWingModel[50].setRotationPoint(-81F, -38F, 42F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, -6F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 610
		rightWingModel[51].setRotationPoint(-81F, -41F, 42F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, -5F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -3F); // Box 611
		rightWingModel[52].setRotationPoint(-81F, -42F, 45F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F); // Box 612
		rightWingModel[53].setRotationPoint(-81F, -45F, 47F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -4F); // Box 613
		rightWingModel[54].setRotationPoint(-81F, -34F, 42F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 4, 3, 16, 0F,0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -1F, -6F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, -6F); // Box 614
		rightWingModel[55].setRotationPoint(-81F, -31F, 43F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 1F, -3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -3F, 0F, -1.5F, -4.5F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -1.5F, -4.5F); // Box 615
		rightWingModel[56].setRotationPoint(-81F, -28F, 46F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 627
		rightWingModel[57].setRotationPoint(-89F, -38F, 45F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -3F); // Box 628
		rightWingModel[58].setRotationPoint(-89F, -34F, 45F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, -4F); // Box 629
		rightWingModel[59].setRotationPoint(-89F, -32F, 46F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1F, -1F); // Box 630
		rightWingModel[60].setRotationPoint(-89F, -31F, 50F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 631
		rightWingModel[61].setRotationPoint(-89F, -39F, 45F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.5F, -1.5F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 632
		rightWingModel[62].setRotationPoint(-89F, -40F, 49F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F); // Box 633
		rightWingModel[63].setRotationPoint(-92F, -37F, 47F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, -3.5F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -3.5F, 0F, 0F, -2.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2.5F); // Box 634
		rightWingModel[64].setRotationPoint(-92F, -37F, 47F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, -0.5F, -3.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.5F, -3.5F); // Box 635
		rightWingModel[65].setRotationPoint(-92F, -34F, 47F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 1.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2.5F, 0F, -2.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2.5F, -3F); // Box 636
		rightWingModel[66].setRotationPoint(-92F, -32F, 48F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -3F, -3F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -3F, -3F, 0F, 2F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -2.5F); // Box 637
		rightWingModel[67].setRotationPoint(-92F, -40F, 48F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 2025, 97, textureX, textureY); // Box 738
		tailWheelModel[1] = new ModelRendererTurbo(this, 1969, 97, textureX, textureY); // Box 740
		tailWheelModel[2] = new ModelRendererTurbo(this, 1985, 97, textureX, textureY); // Box 741
		tailWheelModel[3] = new ModelRendererTurbo(this, 785, 97, textureX, textureY); // Box 742
		tailWheelModel[4] = new ModelRendererTurbo(this, 2041, 97, textureX, textureY); // Box 743
		tailWheelModel[5] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 744
		tailWheelModel[6] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 745
		tailWheelModel[7] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 746
		tailWheelModel[8] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 747
		tailWheelModel[9] = new ModelRendererTurbo(this, 1025, 113, textureX, textureY); // Box 748

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 738
		tailWheelModel[0].setRotationPoint(219F, -49F, -2.5F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 740
		tailWheelModel[1].setRotationPoint(219F, -45F, -2.5F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 741
		tailWheelModel[2].setRotationPoint(221F, -45F, -2.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 742
		tailWheelModel[3].setRotationPoint(224F, -43F, -1.5F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 743
		tailWheelModel[4].setRotationPoint(219F, -49F, 1.5F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
		tailWheelModel[5].setRotationPoint(219F, -45F, 1.5F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 745
		tailWheelModel[6].setRotationPoint(221F, -45F, 1.5F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		tailWheelModel[7].setRotationPoint(221F, -44F, -0.5F);

		tailWheelModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 747
		tailWheelModel[8].setRotationPoint(221F, -46F, -0.5F);

		tailWheelModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 748
		tailWheelModel[9].setRotationPoint(221F, -41F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 706
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1705, 97, textureX, textureY); // Box 707
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 1873, 161, textureX, textureY); // Box 708
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 709
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Box 710
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1481, 129, textureX, textureY); // Box 711
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1521, 129, textureX, textureY); // Box 712
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 1561, 129, textureX, textureY); // Box 713
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 1281, 129, textureX, textureY); // Box 714
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 1681, 129, textureX, textureY); // Box 715
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 716
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 1761, 161, textureX, textureY); // Box 717
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 1937, 161, textureX, textureY); // Box 718
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 719
		leftWingWheelModel[14] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 720
		leftWingWheelModel[15] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Box 721

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 706
		leftWingWheelModel[0].setRotationPoint(-25F, -18F, -57F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 707
		leftWingWheelModel[1].setRotationPoint(-25F, -18F, -46F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 708
		leftWingWheelModel[2].setRotationPoint(-22F, -5F, -57F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F); // Box 709
		leftWingWheelModel[3].setRotationPoint(-13F, -18F, -57F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F); // Box 710
		leftWingWheelModel[4].setRotationPoint(-13F, -18F, -46F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 711
		leftWingWheelModel[5].setRotationPoint(-28.5F, -6F, -53F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 14, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 712
		leftWingWheelModel[6].setRotationPoint(-28.5F, -3F, -53F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 14, 3, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 713
		leftWingWheelModel[7].setRotationPoint(-28.5F, -9F, -53F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 714
		leftWingWheelModel[8].setRotationPoint(-26.5F, -11F, -53F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 715
		leftWingWheelModel[9].setRotationPoint(-26.5F, 0F, -53F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 10, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		leftWingWheelModel[10].setRotationPoint(-24F, -19F, -62F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 11, 7, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 717
		leftWingWheelModel[11].setRotationPoint(-14F, -19F, -62F);

		leftWingWheelModel[12].addShapeBox(0F, 0F, 0F, 11, 7, 3, 0F,0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 718
		leftWingWheelModel[12].setRotationPoint(-14F, -19F, -43F);

		leftWingWheelModel[13].addShapeBox(0F, 0F, 0F, 10, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 719
		leftWingWheelModel[13].setRotationPoint(-24F, -19F, -43F);

		leftWingWheelModel[14].addShapeBox(0F, 0F, 0F, 9, 7, 3, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F); // Box 720
		leftWingWheelModel[14].setRotationPoint(-33F, -20F, -43F);

		leftWingWheelModel[15].addShapeBox(0F, 0F, 0F, 9, 7, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 721
		leftWingWheelModel[15].setRotationPoint(-33F, -20F, -62F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1921, 105, textureX, textureY); // Box 722
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 723
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 1961, 161, textureX, textureY); // Box 724
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 725
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 726
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 727
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 728
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 729
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 1713, 129, textureX, textureY); // Box 730
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 731
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Box 732
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 793, 185, textureX, textureY); // Box 733
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 1073, 185, textureX, textureY); // Box 734
		rightWingWheelModel[13] = new ModelRendererTurbo(this, 1193, 185, textureX, textureY); // Box 735
		rightWingWheelModel[14] = new ModelRendererTurbo(this, 1305, 177, textureX, textureY); // Box 736
		rightWingWheelModel[15] = new ModelRendererTurbo(this, 1409, 185, textureX, textureY); // Box 737

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 722
		rightWingWheelModel[0].setRotationPoint(-25F, -18F, 56F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 723
		rightWingWheelModel[1].setRotationPoint(-25F, -18F, 45F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		rightWingWheelModel[2].setRotationPoint(-22F, -5F, 45F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F); // Box 725
		rightWingWheelModel[3].setRotationPoint(-13F, -18F, 56F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F); // Box 726
		rightWingWheelModel[4].setRotationPoint(-13F, -18F, 45F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		rightWingWheelModel[5].setRotationPoint(-28.5F, -6F, 49F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 14, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 728
		rightWingWheelModel[6].setRotationPoint(-28.5F, -3F, 49F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 14, 3, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		rightWingWheelModel[7].setRotationPoint(-28.5F, -9F, 49F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		rightWingWheelModel[8].setRotationPoint(-26.5F, -11F, 49F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 731
		rightWingWheelModel[9].setRotationPoint(-26.5F, 0F, 49F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 10, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 732
		rightWingWheelModel[10].setRotationPoint(-24F, -19F, 59F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 11, 7, 3, 0F,0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 733
		rightWingWheelModel[11].setRotationPoint(-14F, -19F, 59F);

		rightWingWheelModel[12].addShapeBox(0F, 0F, 0F, 11, 7, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 734
		rightWingWheelModel[12].setRotationPoint(-14F, -19F, 40F);

		rightWingWheelModel[13].addShapeBox(0F, 0F, 0F, 10, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		rightWingWheelModel[13].setRotationPoint(-24F, -19F, 40F);

		rightWingWheelModel[14].addShapeBox(0F, 0F, 0F, 9, 7, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 736
		rightWingWheelModel[14].setRotationPoint(-33F, -20F, 40F);

		rightWingWheelModel[15].addShapeBox(0F, 0F, 0F, 9, 7, 3, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F); // Box 737
		rightWingWheelModel[15].setRotationPoint(-33F, -20F, 59F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-83F, -35F, 51F);
		propellerModels[1] = makeProp2(-83F, -35F, -51F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 62, 320, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 62, 320, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 62, 320, textureX, textureY);
		prop[0].addBox(-0.5F, -34F, -1.5F, 1, 34, 3, 0.0F);
		prop[1].addBox(-0.5F, -34F, -1.5F, 1, 34, 3, 0.0F);
		prop[2].addBox(-0.5F, -34F, -1.5F, 1, 34, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 100, 320, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 100, 320, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 100, 320, textureX, textureY);
		prop[0].addBox(-0.5F, -34F, -1.5F, 1, 34, 3, 0.0F);
		prop[1].addBox(-0.5F, -34F, -1.5F, 1, 34, 3, 0.0F);
		prop[2].addBox(-0.5F, -34F, -1.5F, 1, 34, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[15];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 0
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 1
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 2
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 6
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 7
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 8
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 9
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 10
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 11
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 12
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 13
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 14
		gun_1_Model[2][12] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 15
		gun_1_Model[2][13] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 16
		gun_1_Model[2][14] = new ModelRendererTurbo(this, 65, 308, textureX, textureY); // Box 17

		gun_1_Model[2][0].addShapeBox(-6F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0

		gun_1_Model[2][1].addShapeBox(-6F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1

		gun_1_Model[2][2].addShapeBox(-6F, -1.5F, -0.5F, 7, 1, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_1_Model[2][3].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_1_Model[2][4].addShapeBox(-2.25F, -2F, -1F, 1, 1, 2, 0F,-0.75F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 7

		gun_1_Model[2][5].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 8

		gun_1_Model[2][6].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9

		gun_1_Model[2][7].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10

		gun_1_Model[2][8].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 11

		gun_1_Model[2][9].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_1_Model[2][10].addShapeBox(-5.5F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 13

		gun_1_Model[2][11].addShapeBox(-5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 14

		gun_1_Model[2][12].addShapeBox(0F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 15

		gun_1_Model[2][13].addShapeBox(7F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 16

		gun_1_Model[2][14].addShapeBox(0.5F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 17

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(-94.5F, -39F, 4F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[0];

		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[15];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 0
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 1
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 2
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 6
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 7
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 8
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 9
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 10
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 11
		gun_2_Model[2][9] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 12
		gun_2_Model[2][10] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 13
		gun_2_Model[2][11] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 14
		gun_2_Model[2][12] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 15
		gun_2_Model[2][13] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 16
		gun_2_Model[2][14] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 17

		gun_2_Model[2][0].addShapeBox(-6F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0

		gun_2_Model[2][1].addShapeBox(-6F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1

		gun_2_Model[2][2].addShapeBox(-6F, -1.5F, -0.5F, 7, 1, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_2_Model[2][3].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_2_Model[2][4].addShapeBox(-2.25F, -2F, -1F, 1, 1, 2, 0F,-0.75F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 7

		gun_2_Model[2][5].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 8

		gun_2_Model[2][6].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9

		gun_2_Model[2][7].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10

		gun_2_Model[2][8].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 11

		gun_2_Model[2][9].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_2_Model[2][10].addShapeBox(-5.5F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 13

		gun_2_Model[2][11].addShapeBox(-5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 14

		gun_2_Model[2][12].addShapeBox(0F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 15

		gun_2_Model[2][13].addShapeBox(7F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 16

		gun_2_Model[2][14].addShapeBox(0.5F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 17

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(36F, -69F, 0F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[0];

		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[15];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 0
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 1
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 2
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 6
		gun_3_Model[2][4] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 7
		gun_3_Model[2][5] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 8
		gun_3_Model[2][6] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 9
		gun_3_Model[2][7] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 10
		gun_3_Model[2][8] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 11
		gun_3_Model[2][9] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 12
		gun_3_Model[2][10] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 13
		gun_3_Model[2][11] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 14
		gun_3_Model[2][12] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 15
		gun_3_Model[2][13] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 16
		gun_3_Model[2][14] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 17

		gun_3_Model[2][0].addShapeBox(-6F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0

		gun_3_Model[2][1].addShapeBox(-6F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1

		gun_3_Model[2][2].addShapeBox(-6F, -1.5F, -0.5F, 7, 1, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_3_Model[2][3].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_3_Model[2][4].addShapeBox(-2.25F, -2F, -1F, 1, 1, 2, 0F,-0.75F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 7

		gun_3_Model[2][5].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 8

		gun_3_Model[2][6].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9

		gun_3_Model[2][7].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10

		gun_3_Model[2][8].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 11

		gun_3_Model[2][9].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_3_Model[2][10].addShapeBox(-5.5F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 13

		gun_3_Model[2][11].addShapeBox(-5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 14

		gun_3_Model[2][12].addShapeBox(0F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 15

		gun_3_Model[2][13].addShapeBox(7F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 16

		gun_3_Model[2][14].addShapeBox(0.5F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 17

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(58F, -52F, -15F);
		}


		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[0];

		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[15];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 0
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 1
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 2
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 6
		gun_4_Model[2][4] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 7
		gun_4_Model[2][5] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 8
		gun_4_Model[2][6] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 9
		gun_4_Model[2][7] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 10
		gun_4_Model[2][8] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 11
		gun_4_Model[2][9] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 12
		gun_4_Model[2][10] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 13
		gun_4_Model[2][11] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 14
		gun_4_Model[2][12] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 15
		gun_4_Model[2][13] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 16
		gun_4_Model[2][14] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 17

		gun_4_Model[2][0].addShapeBox(-6F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0

		gun_4_Model[2][1].addShapeBox(-6F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1

		gun_4_Model[2][2].addShapeBox(-6F, -1.5F, -0.5F, 7, 1, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_4_Model[2][3].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_4_Model[2][4].addShapeBox(-2.25F, -2F, -1F, 1, 1, 2, 0F,-0.75F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 7

		gun_4_Model[2][5].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 8

		gun_4_Model[2][6].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9

		gun_4_Model[2][7].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10

		gun_4_Model[2][8].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 11

		gun_4_Model[2][9].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_4_Model[2][10].addShapeBox(-5.5F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 13

		gun_4_Model[2][11].addShapeBox(-5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 14

		gun_4_Model[2][12].addShapeBox(0F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 15

		gun_4_Model[2][13].addShapeBox(7F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 16

		gun_4_Model[2][14].addShapeBox(0.5F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 17

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(58F, -52F, 15F);
		}


		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[0];

		gun_5_Model[1] = new ModelRendererTurbo[0];

		gun_5_Model[2] = new ModelRendererTurbo[15];
		gun_5_Model[2][0] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 0
		gun_5_Model[2][1] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 1
		gun_5_Model[2][2] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 2
		gun_5_Model[2][3] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 6
		gun_5_Model[2][4] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 7
		gun_5_Model[2][5] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 8
		gun_5_Model[2][6] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 9
		gun_5_Model[2][7] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 10
		gun_5_Model[2][8] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 11
		gun_5_Model[2][9] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 12
		gun_5_Model[2][10] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 13
		gun_5_Model[2][11] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 14
		gun_5_Model[2][12] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 15
		gun_5_Model[2][13] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 16
		gun_5_Model[2][14] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 17

		gun_5_Model[2][0].addShapeBox(-6F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0

		gun_5_Model[2][1].addShapeBox(-6F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1

		gun_5_Model[2][2].addShapeBox(-6F, -1.5F, -0.5F, 7, 1, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_5_Model[2][3].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_5_Model[2][4].addShapeBox(-2.25F, -2F, -1F, 1, 1, 2, 0F,-0.75F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 7

		gun_5_Model[2][5].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 8

		gun_5_Model[2][6].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9

		gun_5_Model[2][7].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10

		gun_5_Model[2][8].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 11

		gun_5_Model[2][9].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_5_Model[2][10].addShapeBox(-5.5F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 13

		gun_5_Model[2][11].addShapeBox(-5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 14

		gun_5_Model[2][12].addShapeBox(0F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 15

		gun_5_Model[2][13].addShapeBox(7F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 16

		gun_5_Model[2][14].addShapeBox(0.5F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 17

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[2])
		{
			gunPart.setRotationPoint(34F, -22F, 0F);
		}


		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[0];

		gun_6_Model[1] = new ModelRendererTurbo[0];

		gun_6_Model[2] = new ModelRendererTurbo[15];
		gun_6_Model[2][0] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 0
		gun_6_Model[2][1] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 1
		gun_6_Model[2][2] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 2
		gun_6_Model[2][3] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 6
		gun_6_Model[2][4] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 7
		gun_6_Model[2][5] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 8
		gun_6_Model[2][6] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 9
		gun_6_Model[2][7] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 10
		gun_6_Model[2][8] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 11
		gun_6_Model[2][9] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 12
		gun_6_Model[2][10] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 13
		gun_6_Model[2][11] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 14
		gun_6_Model[2][12] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 15
		gun_6_Model[2][13] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 16
		gun_6_Model[2][14] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 17

		gun_6_Model[2][0].addShapeBox(-6F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0

		gun_6_Model[2][1].addShapeBox(-6F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 1

		gun_6_Model[2][2].addShapeBox(-6F, -1.5F, -0.5F, 7, 1, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_6_Model[2][3].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_6_Model[2][4].addShapeBox(-2.25F, -2F, -1F, 1, 1, 2, 0F,-0.75F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 7

		gun_6_Model[2][5].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 8

		gun_6_Model[2][6].addShapeBox(-2F, -0.75F, -1.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9

		gun_6_Model[2][7].addShapeBox(-2F, -1.75F, -1.5F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10

		gun_6_Model[2][8].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 11

		gun_6_Model[2][9].addShapeBox(-2F, -0.75F, 0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_6_Model[2][10].addShapeBox(-5.5F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 13

		gun_6_Model[2][11].addShapeBox(-5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 14

		gun_6_Model[2][12].addShapeBox(0F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 15

		gun_6_Model[2][13].addShapeBox(7F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 16

		gun_6_Model[2][14].addShapeBox(0.5F, -2F, -0.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, -0.75F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.75F, -0.5F, -0.45F); // Box 17

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[2])
		{
			gunPart.setRotationPoint(80F, -25F, 0F);
		}


		registerGunModel("PassengerGun6", gun_6_Model);
	}
}