//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.07.2017 - 15:18:47
// Last changed on: 17.07.2017 - 15:18:47

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJu52 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelJu52() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[336];
		rightWingModel = new ModelRendererTurbo[62];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[2];
		bodyDoorOpenModel = new ModelRendererTurbo[4];
		bodyDoorCloseModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1025, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1025, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1041, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1233, 1, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 1329, 1, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 35
		bodyModel[18] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Box 38
		bodyModel[19] = new ModelRendererTurbo(this, 1841, 1, textureX, textureY); // Box 39
		bodyModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[21] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 66
		bodyModel[22] = new ModelRendererTurbo(this, 1129, 17, textureX, textureY); // Box 107
		bodyModel[23] = new ModelRendererTurbo(this, 1769, 17, textureX, textureY); // Box 108
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 109
		bodyModel[25] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 110
		bodyModel[26] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 111
		bodyModel[27] = new ModelRendererTurbo(this, 1225, 9, textureX, textureY); // Box 112
		bodyModel[28] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 113
		bodyModel[29] = new ModelRendererTurbo(this, 1929, 17, textureX, textureY); // Box 114
		bodyModel[30] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 115
		bodyModel[31] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 116
		bodyModel[32] = new ModelRendererTurbo(this, 1769, 25, textureX, textureY); // Box 117
		bodyModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 118
		bodyModel[34] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 119
		bodyModel[35] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 120
		bodyModel[36] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 121
		bodyModel[37] = new ModelRendererTurbo(this, 1465, 49, textureX, textureY); // Box 122
		bodyModel[38] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 123
		bodyModel[39] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 124
		bodyModel[40] = new ModelRendererTurbo(this, 1769, 33, textureX, textureY); // Box 125
		bodyModel[41] = new ModelRendererTurbo(this, 1425, 1, textureX, textureY); // Box 128
		bodyModel[42] = new ModelRendererTurbo(this, 1449, 1, textureX, textureY); // Box 129
		bodyModel[43] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 130
		bodyModel[44] = new ModelRendererTurbo(this, 2009, 1, textureX, textureY); // Box 131
		bodyModel[45] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 132
		bodyModel[46] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Box 133
		bodyModel[47] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 134
		bodyModel[48] = new ModelRendererTurbo(this, 1425, 17, textureX, textureY); // Box 135
		bodyModel[49] = new ModelRendererTurbo(this, 2033, 9, textureX, textureY); // Box 136
		bodyModel[50] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 137
		bodyModel[51] = new ModelRendererTurbo(this, 1169, 33, textureX, textureY); // Box 138
		bodyModel[52] = new ModelRendererTurbo(this, 2025, 25, textureX, textureY); // Box 139
		bodyModel[53] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 141
		bodyModel[54] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 142
		bodyModel[55] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 143
		bodyModel[56] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Box 144
		bodyModel[57] = new ModelRendererTurbo(this, 1217, 57, textureX, textureY); // Box 145
		bodyModel[58] = new ModelRendererTurbo(this, 1217, 33, textureX, textureY); // Box 146
		bodyModel[59] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 147
		bodyModel[60] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 148
		bodyModel[61] = new ModelRendererTurbo(this, 1089, 57, textureX, textureY); // Box 149
		bodyModel[62] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 150
		bodyModel[63] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 151
		bodyModel[64] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 152
		bodyModel[65] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 153
		bodyModel[66] = new ModelRendererTurbo(this, 1361, 65, textureX, textureY); // Box 154
		bodyModel[67] = new ModelRendererTurbo(this, 1673, 65, textureX, textureY); // Box 155
		bodyModel[68] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 156
		bodyModel[69] = new ModelRendererTurbo(this, 1665, 73, textureX, textureY); // Box 157
		bodyModel[70] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 162
		bodyModel[71] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 163
		bodyModel[72] = new ModelRendererTurbo(this, 1945, 65, textureX, textureY); // Box 164
		bodyModel[73] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 165
		bodyModel[74] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 166
		bodyModel[75] = new ModelRendererTurbo(this, 1273, 17, textureX, textureY); // Box 167
		bodyModel[76] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 78
		bodyModel[77] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Box 79
		bodyModel[78] = new ModelRendererTurbo(this, 2009, 65, textureX, textureY); // Box 82
		bodyModel[79] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 83
		bodyModel[80] = new ModelRendererTurbo(this, 1993, 17, textureX, textureY); // Box 84
		bodyModel[81] = new ModelRendererTurbo(this, 1889, 25, textureX, textureY); // Box 85
		bodyModel[82] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 86
		bodyModel[83] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 87
		bodyModel[84] = new ModelRendererTurbo(this, 1025, 33, textureX, textureY); // Box 88
		bodyModel[85] = new ModelRendererTurbo(this, 1129, 33, textureX, textureY); // Box 89
		bodyModel[86] = new ModelRendererTurbo(this, 1265, 41, textureX, textureY); // Box 110
		bodyModel[87] = new ModelRendererTurbo(this, 1761, 89, textureX, textureY); // Box 111
		bodyModel[88] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 112
		bodyModel[89] = new ModelRendererTurbo(this, 1185, 65, textureX, textureY); // Box 113
		bodyModel[90] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 114
		bodyModel[91] = new ModelRendererTurbo(this, 1881, 89, textureX, textureY); // Box 115
		bodyModel[92] = new ModelRendererTurbo(this, 1841, 89, textureX, textureY); // Box 116
		bodyModel[93] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 117
		bodyModel[94] = new ModelRendererTurbo(this, 1297, 73, textureX, textureY); // Box 118
		bodyModel[95] = new ModelRendererTurbo(this, 1889, 89, textureX, textureY); // Box 119
		bodyModel[96] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 120
		bodyModel[97] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 121
		bodyModel[98] = new ModelRendererTurbo(this, 1993, 25, textureX, textureY); // Box 122
		bodyModel[99] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 124
		bodyModel[100] = new ModelRendererTurbo(this, 1945, 89, textureX, textureY); // Box 125
		bodyModel[101] = new ModelRendererTurbo(this, 1313, 33, textureX, textureY); // Box 126
		bodyModel[102] = new ModelRendererTurbo(this, 2009, 89, textureX, textureY); // Box 127
		bodyModel[103] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 128
		bodyModel[104] = new ModelRendererTurbo(this, 1369, 57, textureX, textureY); // Box 129
		bodyModel[105] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 130
		bodyModel[106] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 131
		bodyModel[107] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 135
		bodyModel[108] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 136
		bodyModel[109] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 137
		bodyModel[110] = new ModelRendererTurbo(this, 1241, 105, textureX, textureY); // Box 138
		bodyModel[111] = new ModelRendererTurbo(this, 1481, 113, textureX, textureY); // Box 139
		bodyModel[112] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 140
		bodyModel[113] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 141
		bodyModel[114] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 142
		bodyModel[115] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 147
		bodyModel[116] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 148
		bodyModel[117] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 149
		bodyModel[118] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 150
		bodyModel[119] = new ModelRendererTurbo(this, 1633, 81, textureX, textureY); // Box 153
		bodyModel[120] = new ModelRendererTurbo(this, 1953, 113, textureX, textureY); // Box 154
		bodyModel[121] = new ModelRendererTurbo(this, 1633, 121, textureX, textureY); // Box 155
		bodyModel[122] = new ModelRendererTurbo(this, 1481, 113, textureX, textureY); // Box 156
		bodyModel[123] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 157
		bodyModel[124] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 158
		bodyModel[125] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 159
		bodyModel[126] = new ModelRendererTurbo(this, 1105, 121, textureX, textureY); // Box 160
		bodyModel[127] = new ModelRendererTurbo(this, 1697, 121, textureX, textureY); // Box 161
		bodyModel[128] = new ModelRendererTurbo(this, 1401, 113, textureX, textureY); // Box 162
		bodyModel[129] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Box 163
		bodyModel[130] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 164
		bodyModel[131] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 165
		bodyModel[132] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 166
		bodyModel[133] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 167
		bodyModel[134] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 168
		bodyModel[135] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 169
		bodyModel[136] = new ModelRendererTurbo(this, 1025, 9, textureX, textureY); // Box 170
		bodyModel[137] = new ModelRendererTurbo(this, 1033, 9, textureX, textureY); // Box 171
		bodyModel[138] = new ModelRendererTurbo(this, 1177, 9, textureX, textureY); // Box 172
		bodyModel[139] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 173
		bodyModel[140] = new ModelRendererTurbo(this, 1289, 9, textureX, textureY); // Box 174
		bodyModel[141] = new ModelRendererTurbo(this, 1281, 9, textureX, textureY); // Box 175
		bodyModel[142] = new ModelRendererTurbo(this, 1049, 17, textureX, textureY); // Box 176
		bodyModel[143] = new ModelRendererTurbo(this, 1449, 17, textureX, textureY); // Box 177
		bodyModel[144] = new ModelRendererTurbo(this, 1041, 25, textureX, textureY); // Box 178
		bodyModel[145] = new ModelRendererTurbo(this, 1921, 17, textureX, textureY); // Box 179
		bodyModel[146] = new ModelRendererTurbo(this, 1057, 17, textureX, textureY); // Box 180
		bodyModel[147] = new ModelRendererTurbo(this, 1281, 17, textureX, textureY); // Box 181
		bodyModel[148] = new ModelRendererTurbo(this, 1057, 25, textureX, textureY); // Box 182
		bodyModel[149] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 183
		bodyModel[150] = new ModelRendererTurbo(this, 1449, 25, textureX, textureY); // Box 184
		bodyModel[151] = new ModelRendererTurbo(this, 1345, 33, textureX, textureY); // Box 185
		bodyModel[152] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 186
		bodyModel[153] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 187
		bodyModel[154] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 188
		bodyModel[155] = new ModelRendererTurbo(this, 1361, 33, textureX, textureY); // Box 189
		bodyModel[156] = new ModelRendererTurbo(this, 1313, 41, textureX, textureY); // Box 190
		bodyModel[157] = new ModelRendererTurbo(this, 1425, 33, textureX, textureY); // Box 191
		bodyModel[158] = new ModelRendererTurbo(this, 1433, 33, textureX, textureY); // Box 192
		bodyModel[159] = new ModelRendererTurbo(this, 1441, 33, textureX, textureY); // Box 193
		bodyModel[160] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 194
		bodyModel[161] = new ModelRendererTurbo(this, 1449, 33, textureX, textureY); // Box 195
		bodyModel[162] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 196
		bodyModel[163] = new ModelRendererTurbo(this, 1321, 41, textureX, textureY); // Box 197
		bodyModel[164] = new ModelRendererTurbo(this, 1761, 41, textureX, textureY); // Box 198
		bodyModel[165] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 199
		bodyModel[166] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 200
		bodyModel[167] = new ModelRendererTurbo(this, 1217, 49, textureX, textureY); // Box 201
		bodyModel[168] = new ModelRendererTurbo(this, 1225, 49, textureX, textureY); // Box 202
		bodyModel[169] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 203
		bodyModel[170] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 204
		bodyModel[171] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 205
		bodyModel[172] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 206
		bodyModel[173] = new ModelRendererTurbo(this, 721, 129, textureX, textureY); // Box 207
		bodyModel[174] = new ModelRendererTurbo(this, 785, 137, textureX, textureY); // Box 208
		bodyModel[175] = new ModelRendererTurbo(this, 1225, 137, textureX, textureY); // Box 209
		bodyModel[176] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 210
		bodyModel[177] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 211
		bodyModel[178] = new ModelRendererTurbo(this, 1233, 49, textureX, textureY); // Box 212
		bodyModel[179] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 213
		bodyModel[180] = new ModelRendererTurbo(this, 1713, 145, textureX, textureY); // Box 215
		bodyModel[181] = new ModelRendererTurbo(this, 1865, 137, textureX, textureY); // Box 216
		bodyModel[182] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 217
		bodyModel[183] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Box 218
		bodyModel[184] = new ModelRendererTurbo(this, 1481, 145, textureX, textureY); // Box 219
		bodyModel[185] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Box 220
		bodyModel[186] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 221
		bodyModel[187] = new ModelRendererTurbo(this, 1809, 161, textureX, textureY); // Box 222
		bodyModel[188] = new ModelRendererTurbo(this, 1897, 161, textureX, textureY); // Box 223
		bodyModel[189] = new ModelRendererTurbo(this, 1105, 153, textureX, textureY); // Box 224
		bodyModel[190] = new ModelRendererTurbo(this, 1385, 153, textureX, textureY); // Box 225
		bodyModel[191] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Box 226
		bodyModel[192] = new ModelRendererTurbo(this, 1329, 73, textureX, textureY); // Box 312
		bodyModel[193] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 263
		bodyModel[194] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 264
		bodyModel[195] = new ModelRendererTurbo(this, 1745, 89, textureX, textureY); // Box 265
		bodyModel[196] = new ModelRendererTurbo(this, 1233, 105, textureX, textureY); // Box 266
		bodyModel[197] = new ModelRendererTurbo(this, 1745, 97, textureX, textureY); // Box 267
		bodyModel[198] = new ModelRendererTurbo(this, 1041, 17, textureX, textureY); // Box 268
		bodyModel[199] = new ModelRendererTurbo(this, 1129, 17, textureX, textureY); // Box 269
		bodyModel[200] = new ModelRendererTurbo(this, 1769, 17, textureX, textureY); // Box 270
		bodyModel[201] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 271
		bodyModel[202] = new ModelRendererTurbo(this, 1449, 81, textureX, textureY); // Box 272
		bodyModel[203] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 273
		bodyModel[204] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 274
		bodyModel[205] = new ModelRendererTurbo(this, 1785, 89, textureX, textureY); // Box 275
		bodyModel[206] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 276
		bodyModel[207] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 277
		bodyModel[208] = new ModelRendererTurbo(this, 1881, 25, textureX, textureY); // Box 278
		bodyModel[209] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 279
		bodyModel[210] = new ModelRendererTurbo(this, 1313, 113, textureX, textureY); // Box 280
		bodyModel[211] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 281
		bodyModel[212] = new ModelRendererTurbo(this, 1449, 113, textureX, textureY); // Box 282
		bodyModel[213] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 283
		bodyModel[214] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 286
		bodyModel[215] = new ModelRendererTurbo(this, 1481, 113, textureX, textureY); // Box 287
		bodyModel[216] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 288
		bodyModel[217] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 289
		bodyModel[218] = new ModelRendererTurbo(this, 1409, 81, textureX, textureY); // Box 290
		bodyModel[219] = new ModelRendererTurbo(this, 1425, 57, textureX, textureY); // Box 291
		bodyModel[220] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 292
		bodyModel[221] = new ModelRendererTurbo(this, 569, 113, textureX, textureY); // Box 293
		bodyModel[222] = new ModelRendererTurbo(this, 1241, 73, textureX, textureY); // Box 294
		bodyModel[223] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 295
		bodyModel[224] = new ModelRendererTurbo(this, 857, 113, textureX, textureY); // Box 296
		bodyModel[225] = new ModelRendererTurbo(this, 1481, 81, textureX, textureY); // Box 297
		bodyModel[226] = new ModelRendererTurbo(this, 1433, 81, textureX, textureY); // Box 298
		bodyModel[227] = new ModelRendererTurbo(this, 1489, 81, textureX, textureY); // Box 299
		bodyModel[228] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 300
		bodyModel[229] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 301
		bodyModel[230] = new ModelRendererTurbo(this, 1633, 113, textureX, textureY); // Box 302
		bodyModel[231] = new ModelRendererTurbo(this, 1545, 113, textureX, textureY); // Box 303
		bodyModel[232] = new ModelRendererTurbo(this, 1953, 73, textureX, textureY); // Box 304
		bodyModel[233] = new ModelRendererTurbo(this, 1289, 137, textureX, textureY); // Box 305
		bodyModel[234] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 306
		bodyModel[235] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 307
		bodyModel[236] = new ModelRendererTurbo(this, 2017, 113, textureX, textureY); // Box 308
		bodyModel[237] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 309
		bodyModel[238] = new ModelRendererTurbo(this, 1993, 153, textureX, textureY); // Box 310
		bodyModel[239] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Box 311
		bodyModel[240] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Box 312
		bodyModel[241] = new ModelRendererTurbo(this, 1945, 113, textureX, textureY); // Box 313
		bodyModel[242] = new ModelRendererTurbo(this, 1305, 161, textureX, textureY); // Box 314
		bodyModel[243] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Box 315
		bodyModel[244] = new ModelRendererTurbo(this, 1497, 113, textureX, textureY); // Box 317
		bodyModel[245] = new ModelRendererTurbo(this, 1225, 129, textureX, textureY); // Box 320
		bodyModel[246] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 321
		bodyModel[247] = new ModelRendererTurbo(this, 1105, 121, textureX, textureY); // Box 322
		bodyModel[248] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 323
		bodyModel[249] = new ModelRendererTurbo(this, 857, 185, textureX, textureY); // Box 324
		bodyModel[250] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 325
		bodyModel[251] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 326
		bodyModel[252] = new ModelRendererTurbo(this, 1761, 57, textureX, textureY); // Box 327
		bodyModel[253] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 328
		bodyModel[254] = new ModelRendererTurbo(this, 1057, 65, textureX, textureY); // Box 329
		bodyModel[255] = new ModelRendererTurbo(this, 1673, 65, textureX, textureY); // Box 330
		bodyModel[256] = new ModelRendererTurbo(this, 1225, 73, textureX, textureY); // Box 331
		bodyModel[257] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 332
		bodyModel[258] = new ModelRendererTurbo(this, 1449, 81, textureX, textureY); // Box 334
		bodyModel[259] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 335
		bodyModel[260] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 336
		bodyModel[261] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 337
		bodyModel[262] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 338
		bodyModel[263] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 339
		bodyModel[264] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 340
		bodyModel[265] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 341
		bodyModel[266] = new ModelRendererTurbo(this, 1313, 89, textureX, textureY); // Box 342
		bodyModel[267] = new ModelRendererTurbo(this, 1321, 89, textureX, textureY); // Box 343
		bodyModel[268] = new ModelRendererTurbo(this, 1785, 89, textureX, textureY); // Box 344
		bodyModel[269] = new ModelRendererTurbo(this, 1945, 89, textureX, textureY); // Box 345
		bodyModel[270] = new ModelRendererTurbo(this, 1969, 89, textureX, textureY); // Box 346
		bodyModel[271] = new ModelRendererTurbo(this, 2009, 89, textureX, textureY); // Box 347
		bodyModel[272] = new ModelRendererTurbo(this, 2041, 89, textureX, textureY); // Box 348
		bodyModel[273] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 349
		bodyModel[274] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 350
		bodyModel[275] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 351
		bodyModel[276] = new ModelRendererTurbo(this, 1649, 97, textureX, textureY); // Box 352
		bodyModel[277] = new ModelRendererTurbo(this, 1657, 97, textureX, textureY); // Box 353
		bodyModel[278] = new ModelRendererTurbo(this, 1785, 97, textureX, textureY); // Box 354
		bodyModel[279] = new ModelRendererTurbo(this, 1793, 97, textureX, textureY); // Box 355
		bodyModel[280] = new ModelRendererTurbo(this, 2041, 97, textureX, textureY); // Box 356
		bodyModel[281] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 357
		bodyModel[282] = new ModelRendererTurbo(this, 537, 105, textureX, textureY); // Box 358
		bodyModel[283] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 359
		bodyModel[284] = new ModelRendererTurbo(this, 889, 113, textureX, textureY); // Box 360
		bodyModel[285] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Box 361
		bodyModel[286] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 362
		bodyModel[287] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 363
		bodyModel[288] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Box 364
		bodyModel[289] = new ModelRendererTurbo(this, 2041, 113, textureX, textureY); // Box 367
		bodyModel[290] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 368
		bodyModel[291] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 369
		bodyModel[292] = new ModelRendererTurbo(this, 1169, 121, textureX, textureY); // Box 370
		bodyModel[293] = new ModelRendererTurbo(this, 1961, 113, textureX, textureY); // Box 371
		bodyModel[294] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 372
		bodyModel[295] = new ModelRendererTurbo(this, 1177, 121, textureX, textureY); // Box 373
		bodyModel[296] = new ModelRendererTurbo(this, 1657, 121, textureX, textureY); // Box 374
		bodyModel[297] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 375
		bodyModel[298] = new ModelRendererTurbo(this, 1697, 121, textureX, textureY); // Box 376
		bodyModel[299] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 377
		bodyModel[300] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 382
		bodyModel[301] = new ModelRendererTurbo(this, 585, 129, textureX, textureY); // Box 383
		bodyModel[302] = new ModelRendererTurbo(this, 1817, 185, textureX, textureY); // Box 384
		bodyModel[303] = new ModelRendererTurbo(this, 1369, 193, textureX, textureY); // Box 385
		bodyModel[304] = new ModelRendererTurbo(this, 1993, 177, textureX, textureY); // Box 386
		bodyModel[305] = new ModelRendererTurbo(this, 625, 169, textureX, textureY); // Box 387
		bodyModel[306] = new ModelRendererTurbo(this, 633, 129, textureX, textureY); // Box 388
		bodyModel[307] = new ModelRendererTurbo(this, 1481, 129, textureX, textureY); // Box 389
		bodyModel[308] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 390
		bodyModel[309] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 391
		bodyModel[310] = new ModelRendererTurbo(this, 1289, 177, textureX, textureY); // Box 392
		bodyModel[311] = new ModelRendererTurbo(this, 561, 201, textureX, textureY); // Box 393
		bodyModel[312] = new ModelRendererTurbo(this, 633, 201, textureX, textureY); // Box 394
		bodyModel[313] = new ModelRendererTurbo(this, 697, 201, textureX, textureY); // Box 395
		bodyModel[314] = new ModelRendererTurbo(this, 1697, 177, textureX, textureY); // Box 396
		bodyModel[315] = new ModelRendererTurbo(this, 1545, 129, textureX, textureY); // Box 397
		bodyModel[316] = new ModelRendererTurbo(this, 2017, 129, textureX, textureY); // Box 398
		bodyModel[317] = new ModelRendererTurbo(this, 1833, 201, textureX, textureY); // Box 399
		bodyModel[318] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 400
		bodyModel[319] = new ModelRendererTurbo(this, 1425, 201, textureX, textureY); // Box 401
		bodyModel[320] = new ModelRendererTurbo(this, 1329, 113, textureX, textureY); // Box 402
		bodyModel[321] = new ModelRendererTurbo(this, 1233, 113, textureX, textureY); // Box 403
		bodyModel[322] = new ModelRendererTurbo(this, 1249, 113, textureX, textureY); // Box 404
		bodyModel[323] = new ModelRendererTurbo(this, 1401, 113, textureX, textureY); // Box 405
		bodyModel[324] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 406
		bodyModel[325] = new ModelRendererTurbo(this, 1225, 121, textureX, textureY); // Box 407
		bodyModel[326] = new ModelRendererTurbo(this, 1753, 121, textureX, textureY); // Box 408
		bodyModel[327] = new ModelRendererTurbo(this, 1777, 121, textureX, textureY); // Box 409
		bodyModel[328] = new ModelRendererTurbo(this, 1841, 121, textureX, textureY); // Box 410
		bodyModel[329] = new ModelRendererTurbo(this, 1865, 121, textureX, textureY); // Box 411
		bodyModel[330] = new ModelRendererTurbo(this, 729, 193, textureX, textureY); // Box 412
		bodyModel[331] = new ModelRendererTurbo(this, 1985, 193, textureX, textureY); // Box 413
		bodyModel[332] = new ModelRendererTurbo(this, 1457, 129, textureX, textureY); // Box 414
		bodyModel[333] = new ModelRendererTurbo(this, 1281, 369, textureX, textureY); // Box 415
		bodyModel[334] = new ModelRendererTurbo(this, 1457, 129, textureX, textureY); // Box 462
		bodyModel[335] = new ModelRendererTurbo(this, 1457, 129, textureX, textureY); // Box 463

		bodyModel[0].addBox(0F, 0F, 0F, 124, 1, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-131F, -67F, -20F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 146, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(19F, -67F, -20F);

		bodyModel[2].addBox(0F, 0F, 0F, 124, 28, 2, 0F); // Box 2
		bodyModel[2].setRotationPoint(-131F, -56F, -20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 81, 9, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-119F, -28F, -20F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 31, 9, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-38F, -28F, -20F);

		bodyModel[5].addBox(0F, 0F, 0F, 8, 10, 2, 0F); // Box 5
		bodyModel[5].setRotationPoint(-131F, -66F, -20F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 10, 2, 0F); // Box 6
		bodyModel[6].setRotationPoint(-110F, -66F, -20F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-105F, -61F, -20F);

		bodyModel[8].addBox(0F, 0F, 0F, 6, 10, 2, 0F); // Box 8
		bodyModel[8].setRotationPoint(-91F, -66F, -20F);

		bodyModel[9].addBox(0F, 0F, 0F, 6, 10, 2, 0F); // Box 9
		bodyModel[9].setRotationPoint(-71F, -66F, -20F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 10, 2, 0F); // Box 10
		bodyModel[10].setRotationPoint(-52F, -66F, -20F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-37F, -61F, -20F);

		bodyModel[12].addBox(0F, 0F, 0F, 8, 10, 2, 0F); // Box 12
		bodyModel[12].setRotationPoint(-32F, -66F, -20F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 10, 2, 0F); // Box 13
		bodyModel[13].setRotationPoint(-11F, -66F, -20F);

		bodyModel[14].addBox(0F, 0F, 0F, 26, 1, 2, 0F); // Box 27
		bodyModel[14].setRotationPoint(-7F, -67F, -20F);

		bodyModel[15].addBox(0F, 0F, 0F, 7, 28, 2, 0F); // Box 33
		bodyModel[15].setRotationPoint(12F, -66F, -20F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 26, 14, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[16].setRotationPoint(-7F, -38F, -20F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 146, 38, 2, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, -13F, 0F, -24F, 13F, 0F, 0F, 0F); // Box 35
		bodyModel[17].setRotationPoint(19F, -66F, -20F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 25, 2, 10, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[18].setRotationPoint(-131F, -78F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 72, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[19].setRotationPoint(-106F, -81F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 53, 2, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[20].setRotationPoint(-34F, -81F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 146, 2, 10, 0F,0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -4F, 0F, 4F, -4F, 0F, 0F, 0F); // Box 66
		bodyModel[21].setRotationPoint(19F, -80F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 72, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 107
		bodyModel[22].setRotationPoint(-106F, -80F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 72, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 108
		bodyModel[23].setRotationPoint(-106F, -78F, -16F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 72, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 109
		bodyModel[24].setRotationPoint(-106F, -76F, -20F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 72, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[25].setRotationPoint(-106F, -75F, -20F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 25, 8, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[26].setRotationPoint(-131F, -75F, -20F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 25, 2, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 112
		bodyModel[27].setRotationPoint(-131F, -78F, -16F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 25, 2, 4, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, -2F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 113
		bodyModel[28].setRotationPoint(-131F, -76F, -20F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 114
		bodyModel[29].setRotationPoint(-131F, -80F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 53, 2, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 115
		bodyModel[30].setRotationPoint(-34F, -78F, -16F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 53, 2, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 116
		bodyModel[31].setRotationPoint(-34F, -80F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 53, 2, 4, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 117
		bodyModel[32].setRotationPoint(-34F, -76F, -20F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 53, 8, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[33].setRotationPoint(-34F, -75F, -20F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 146, 2, 6, 0F,0F, 0F, 0F, 0F, -4F, -7F, 0F, -3F, 4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 4F, -7F, 0F, 3F, 4F, 0F, -1F, 0F); // Box 119
		bodyModel[34].setRotationPoint(19F, -79F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 146, 2, 5, 0F,0F, 0F, 0F, 0F, -3F, -11F, 0F, -2F, 7F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, -11F, 0F, 2F, 7F, 0F, -2F, 0F); // Box 120
		bodyModel[35].setRotationPoint(19F, -77F, -16F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 146, 2, 4, 0F,0F, -1F, 0F, 0F, -3F, -13F, 0F, -1F, 11F, 0F, 2F, 0F, 0F, -1F, -2F, 0F, 1F, -15F, 0F, 1F, 11F, 0F, -2F, 0F); // Box 121
		bodyModel[36].setRotationPoint(19F, -75F, -20F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 146, 7, 2, 0F,0F, 0F, 0F, 0F, -2F, -13F, 0F, -2F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 0F); // Box 122
		bodyModel[37].setRotationPoint(19F, -74F, -20F);

		bodyModel[38].addBox(0F, 0F, 0F, 124, 1, 2, 0F); // Box 123
		bodyModel[38].setRotationPoint(-131F, -67F, 18F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 146, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 124
		bodyModel[39].setRotationPoint(19F, -67F, 18F);

		bodyModel[40].addBox(0F, 0F, 0F, 124, 28, 2, 0F); // Box 125
		bodyModel[40].setRotationPoint(-131F, -56F, 18F);

		bodyModel[41].addBox(0F, 0F, 0F, 8, 10, 2, 0F); // Box 128
		bodyModel[41].setRotationPoint(-131F, -66F, 18F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 10, 2, 0F); // Box 129
		bodyModel[42].setRotationPoint(-110F, -66F, 18F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[43].setRotationPoint(-105F, -61F, 18F);

		bodyModel[44].addBox(0F, 0F, 0F, 6, 10, 2, 0F); // Box 131
		bodyModel[44].setRotationPoint(-91F, -66F, 18F);

		bodyModel[45].addBox(0F, 0F, 0F, 6, 10, 2, 0F); // Box 132
		bodyModel[45].setRotationPoint(-71F, -66F, 18F);

		bodyModel[46].addBox(0F, 0F, 0F, 6, 10, 2, 0F); // Box 133
		bodyModel[46].setRotationPoint(-52F, -66F, 18F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[47].setRotationPoint(-37F, -61F, 18F);

		bodyModel[48].addBox(0F, 0F, 0F, 8, 10, 2, 0F); // Box 135
		bodyModel[48].setRotationPoint(-32F, -66F, 18F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 10, 2, 0F); // Box 136
		bodyModel[49].setRotationPoint(-11F, -66F, 18F);

		bodyModel[50].addBox(0F, 0F, 0F, 26, 1, 2, 0F); // Box 137
		bodyModel[50].setRotationPoint(-7F, -67F, 18F);

		bodyModel[51].addBox(0F, 0F, 0F, 19, 28, 2, 0F); // Box 138
		bodyModel[51].setRotationPoint(-7F, -66F, 18F);

		bodyModel[52].addBox(0F, 0F, 0F, 7, 28, 2, 0F); // Box 139
		bodyModel[52].setRotationPoint(12F, -66F, 18F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 146, 38, 2, 0F,0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 13F, 0F, -24F, -13F, 0F, 0F, 0F); // Box 141
		bodyModel[53].setRotationPoint(19F, -66F, 18F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 72, 2, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[54].setRotationPoint(-106F, -80F, 5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 72, 2, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[55].setRotationPoint(-106F, -78F, 11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 72, 2, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 144
		bodyModel[56].setRotationPoint(-106F, -76F, 16F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 72, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[57].setRotationPoint(-106F, -75F, 18F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 25, 8, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[58].setRotationPoint(-131F, -75F, 18F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 25, 2, 5, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 147
		bodyModel[59].setRotationPoint(-131F, -78F, 11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 25, 2, 4, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 0F, 2F, -2F); // Box 148
		bodyModel[60].setRotationPoint(-131F, -76F, 16F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 149
		bodyModel[61].setRotationPoint(-131F, -80F, 5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 53, 2, 5, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[62].setRotationPoint(-34F, -78F, 11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 53, 2, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[63].setRotationPoint(-34F, -80F, 5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 53, 2, 4, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 152
		bodyModel[64].setRotationPoint(-34F, -76F, 16F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 53, 8, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[65].setRotationPoint(-34F, -75F, 18F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 146, 2, 6, 0F,0F, 1F, 0F, 0F, -3F, 4F, 0F, -4F, -7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 4F, 0F, 4F, -7F, 0F, 0F, 0F); // Box 154
		bodyModel[66].setRotationPoint(19F, -79F, 5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 146, 2, 5, 0F,0F, 2F, 0F, 0F, -2F, 7F, 0F, -3F, -11F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 7F, 0F, 3F, -11F, 0F, 0F, 0F); // Box 155
		bodyModel[67].setRotationPoint(19F, -77F, 11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 146, 2, 4, 0F,0F, 2F, 0F, 0F, -1F, 11F, 0F, -3F, -13F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 11F, 0F, 1F, -15F, 0F, -1F, -2F); // Box 156
		bodyModel[68].setRotationPoint(19F, -75F, 16F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 146, 7, 2, 0F,0F, 0F, 0F, 0F, -2F, 13F, 0F, -2F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 157
		bodyModel[69].setRotationPoint(19F, -74F, 18F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 124, 10, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[70].setRotationPoint(-131F, -38F, -18F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 146, 2, 36, 0F,0F, 0F, 0F, 0F, 24F, -13F, 0F, 24F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, -13F, 0F, -24F, -13F, 0F, 0F, 0F); // Box 163
		bodyModel[71].setRotationPoint(19F, -30F, -18F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 13, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 164
		bodyModel[72].setRotationPoint(19F, -38F, -18F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 42, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[73].setRotationPoint(32F, -74F, -17F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 34, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[74].setRotationPoint(32F, -77F, -17F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[75].setRotationPoint(32F, -78F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 19, 28, 2, 0F,0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 78
		bodyModel[76].setRotationPoint(-150F, -56F, -20F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 19, 11, 2, 0F,0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F); // Box 79
		bodyModel[77].setRotationPoint(-150F, -67F, -20F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 15, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -6F, 0F, -9F, 6F, 0F, 0F, 0F); // Box 82
		bodyModel[78].setRotationPoint(165F, -72F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 15, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 6F, 0F, -9F, -6F, 0F, 0F, 0F); // Box 83
		bodyModel[79].setRotationPoint(165F, -72F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 84
		bodyModel[80].setRotationPoint(165F, -75F, -4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, -3F, 1F, 0F, -3F, -5F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -5F, 0F, 1F, 3F, 0F, 0F, 0F); // Box 85
		bodyModel[81].setRotationPoint(165F, -75F, -6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[82].setRotationPoint(165F, -76F, -1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 87
		bodyModel[83].setRotationPoint(165F, -75F, 1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, -5F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, -5F, 0F, 1F, -1F); // Box 88
		bodyModel[84].setRotationPoint(165F, -75F, 4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[85].setRotationPoint(165F, -76F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -5F, 0F, -9F, -5F, 0F, 0F, 0F); // Box 110
		bodyModel[86].setRotationPoint(165F, -54F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 19, 9, 40, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -5F); // Box 111
		bodyModel[87].setRotationPoint(-150F, -28F, -20F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 12, 9, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 112
		bodyModel[88].setRotationPoint(-131F, -28F, -20F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 12, 9, 2, 0F,0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F); // Box 113
		bodyModel[89].setRotationPoint(-162F, -60F, -19F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 12, 23, 2, 0F,0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 114
		bodyModel[90].setRotationPoint(-162F, -51F, -19F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 12, 6, 37, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F); // Box 115
		bodyModel[91].setRotationPoint(-162F, -28F, -19F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 19, 28, 2, 0F,0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 116
		bodyModel[92].setRotationPoint(-150F, -56F, 18F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 19, 11, 2, 0F,0F, -7F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F); // Box 117
		bodyModel[93].setRotationPoint(-150F, -67F, 18F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 12, 9, 2, 0F,0F, -7F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F); // Box 118
		bodyModel[94].setRotationPoint(-162F, -60F, 17F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 12, 23, 2, 0F,0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 119
		bodyModel[95].setRotationPoint(-162F, -51F, 17F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 24, 15, 2, 0F,0F, -1F, 0F, 0F, 2F, 7F, 0F, 2F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 8F, 7F, 0F, 8F, -7F, 0F, 0F, 0F); // Box 120
		bodyModel[96].setRotationPoint(-186F, -51F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 24, 15, 2, 0F,0F, -1F, 0F, 0F, 2F, -7F, 0F, 2F, 7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, 7F, 0F, 0F, 0F); // Box 121
		bodyModel[97].setRotationPoint(-186F, -51F, 9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, -2F, 2F, 0F, 5F, 3F, -2F, 8F, 1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -7F, 1F, -2F, -8F, 1F, 0F, -4F, 0F); // Box 122
		bodyModel[98].setRotationPoint(-162F, -55F, -16F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 4F, -1F, -2F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, -2F, -5F, 0F, 0F, -1F, 0F); // Box 124
		bodyModel[99].setRotationPoint(-162F, -59F, -13F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, 4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[100].setRotationPoint(-162F, -60F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 4F, 0F, -2F, 8F, 1F, 0F, 5F, 3F, 0F, -2F, 2F, 0F, -4F, 0F, -2F, -8F, 1F, 0F, -7F, 1F, 0F, 0F, 0F); // Box 126
		bodyModel[101].setRotationPoint(-162F, -55F, 13F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 1F, 0F, -2F, 5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 127
		bodyModel[102].setRotationPoint(-162F, -59F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, -2F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[103].setRotationPoint(-162F, -60F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 24, 2, 4, 0F,0F, 0F, 0F, 0F, 4F, 5F, 0F, 5F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 5F, 0F, -5F, -3F, 0F, -1F, 0F); // Box 129
		bodyModel[104].setRotationPoint(-186F, -55F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0F, -2F, 0F, 0F, 1F, 7F, 0F, 7F, -5F, 0F, 3F, 0F, 0F, 0F, -2F, 0F, -3F, 5F, 0F, -7F, -5F, 0F, -3F, 0F); // Box 130
		bodyModel[105].setRotationPoint(-186F, -52F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 24, 2, 4, 0F,0F, 0F, 0F, 0F, 4F, 3F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[106].setRotationPoint(-186F, -56F, -4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 24, 2, 4, 0F,0F, 1F, 0F, 0F, 5F, -3F, 0F, 4F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, -3F, 0F, -4F, 5F, 0F, 0F, 0F); // Box 135
		bodyModel[107].setRotationPoint(-186F, -55F, 4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0F, 3F, 0F, 0F, 7F, -5F, 0F, 1F, 7F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -7F, -5F, 0F, -3F, 5F, 0F, 0F, -2F); // Box 136
		bodyModel[108].setRotationPoint(-186F, -52F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 24, 2, 4, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 3F, 0F, 0F, 0F); // Box 137
		bodyModel[109].setRotationPoint(-186F, -56F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 24, 6, 23, 0F,0F, 0F, -1F, 0F, -8F, 6F, 0F, -8F, 7F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 6F, 3F, 0F, 6F, 4F, 0F, -2F, -3F); // Box 138
		bodyModel[110].setRotationPoint(-186F, -36F, -12F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 29, 4, 89, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -8F, 0F, 0F); // Box 139
		bodyModel[111].setRotationPoint(141F, -74F, 6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 4, 89, 0F,0F, -1F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -9F, -1F, 0F); // Box 140
		bodyModel[112].setRotationPoint(136F, -74F, 6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 29, 4, 89, 0F,-8F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[113].setRotationPoint(141F, -74F, -95F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 4, 89, 0F,-9F, -1F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9F, -1F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 142
		bodyModel[114].setRotationPoint(136F, -74F, -95F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[115].setRotationPoint(180F, -69F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 13, 52, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, 0F, 2F); // Box 148
		bodyModel[116].setRotationPoint(167F, -123F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 52, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 30F, 0F, 0F, -24F, 0F, 2F, -24F, 0F, 3F, 30F, 0F, 0F); // Box 149
		bodyModel[117].setRotationPoint(166F, -123F, -1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 19, 53, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[118].setRotationPoint(180F, -123F, -1F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 12, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[119].setRotationPoint(187F, -70F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 16, 7, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[120].setRotationPoint(-202F, -47F, -15F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 16, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[121].setRotationPoint(-202F, -52F, -15F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 16, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[122].setRotationPoint(-202F, -55F, -13F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 16, 3, 20, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[123].setRotationPoint(-202F, -58F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[124].setRotationPoint(-202F, -59F, -5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 16, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 159
		bodyModel[125].setRotationPoint(-202F, -40F, -15F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 16, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 160
		bodyModel[126].setRotationPoint(-202F, -35F, -13F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 16, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 161
		bodyModel[127].setRotationPoint(-202F, -32F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 162
		bodyModel[128].setRotationPoint(-202F, -29F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 163
		bodyModel[129].setRotationPoint(-204F, -47F, -15F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 164
		bodyModel[130].setRotationPoint(-204F, -52F, -13F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 1F, -2F); // Box 165
		bodyModel[131].setRotationPoint(-204F, -55F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 4F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 1F, -4F); // Box 166
		bodyModel[132].setRotationPoint(-204F, -58F, -5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[133].setRotationPoint(-204F, -57F, -2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 1F, 0F, 1F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[134].setRotationPoint(-204F, -57F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 169
		bodyModel[135].setRotationPoint(-204F, -52F, 12F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 2F); // Box 170
		bodyModel[136].setRotationPoint(-204F, -55F, 9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -4F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 1F, 4F); // Box 171
		bodyModel[137].setRotationPoint(-204F, -58F, 4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[138].setRotationPoint(-204F, -57F, 2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 173
		bodyModel[139].setRotationPoint(-204F, -47F, 14F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 174
		bodyModel[140].setRotationPoint(-204F, -40F, 12F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 175
		bodyModel[141].setRotationPoint(-204F, -35F, 9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 1F, -4F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 1F, 4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 176
		bodyModel[142].setRotationPoint(-204F, -32F, 4F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, -1F, 1F); // Box 177
		bodyModel[143].setRotationPoint(-204F, -31F, 2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[144].setRotationPoint(-204F, -31F, -2F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[145].setRotationPoint(-204F, -31F, -4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 1F, 4F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 1F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 180
		bodyModel[146].setRotationPoint(-204F, -32F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 1F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 181
		bodyModel[147].setRotationPoint(-204F, -35F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 182
		bodyModel[148].setRotationPoint(-204F, -40F, -13F);

		bodyModel[149].addShapeBox(0F, 12F, 4F, 2, 3, 1, 0F,0F, 1F, -4F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 1F, 4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 183
		bodyModel[149].setRotationPoint(-152F, -31F, -90F);
		bodyModel[149].rotateAngleY = 0.12217305F;
		bodyModel[149].rotateAngleZ = 0.01745329F;

		bodyModel[150].addShapeBox(0F, 13F, 2F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, -1F, 1F); // Box 184
		bodyModel[150].setRotationPoint(-152F, -31F, -90F);
		bodyModel[150].rotateAngleY = 0.12217305F;
		bodyModel[150].rotateAngleZ = 0.01745329F;

		bodyModel[151].addShapeBox(0F, 13F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[151].setRotationPoint(-152F, -31F, -90F);
		bodyModel[151].rotateAngleY = 0.12217305F;
		bodyModel[151].rotateAngleZ = 0.01745329F;

		bodyModel[152].addShapeBox(0F, 13F, -4F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[152].setRotationPoint(-152F, -31F, -90F);
		bodyModel[152].rotateAngleY = 0.12217305F;
		bodyModel[152].rotateAngleZ = 0.01745329F;

		bodyModel[153].addShapeBox(0F, 12F, -5F, 2, 3, 1, 0F,0F, 1F, 4F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 1F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 187
		bodyModel[153].setRotationPoint(-152F, -31F, -90F);
		bodyModel[153].rotateAngleY = 0.12217305F;
		bodyModel[153].rotateAngleZ = 0.01745329F;

		bodyModel[154].addShapeBox(0F, 9F, 9F, 2, 3, 1, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 188
		bodyModel[154].setRotationPoint(-152F, -31F, -90F);
		bodyModel[154].rotateAngleY = 0.12217305F;
		bodyModel[154].rotateAngleZ = 0.01745329F;

		bodyModel[155].addShapeBox(0F, 4F, 12F, 2, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 189
		bodyModel[155].setRotationPoint(-152F, -31F, -90F);
		bodyModel[155].rotateAngleY = 0.12217305F;
		bodyModel[155].rotateAngleZ = 0.01745329F;

		bodyModel[156].addShapeBox(0F, -3F, 14F, 2, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 190
		bodyModel[156].setRotationPoint(-152F, -31F, -90F);
		bodyModel[156].rotateAngleY = 0.12217305F;
		bodyModel[156].rotateAngleZ = 0.01745329F;

		bodyModel[157].addShapeBox(0F, -8F, 12F, 2, 5, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 191
		bodyModel[157].setRotationPoint(-152F, -31F, -90F);
		bodyModel[157].rotateAngleY = 0.12217305F;
		bodyModel[157].rotateAngleZ = 0.01745329F;

		bodyModel[158].addShapeBox(0F, -11F, 9F, 2, 3, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 2F); // Box 192
		bodyModel[158].setRotationPoint(-152F, -31F, -90F);
		bodyModel[158].rotateAngleY = 0.12217305F;
		bodyModel[158].rotateAngleZ = 0.01745329F;

		bodyModel[159].addShapeBox(0F, -14F, 4F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -4F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 1F, 4F); // Box 193
		bodyModel[159].setRotationPoint(-152F, -31F, -90F);
		bodyModel[159].rotateAngleY = 0.12217305F;
		bodyModel[159].rotateAngleZ = 0.01745329F;

		bodyModel[160].addShapeBox(0F, -13F, 2F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[160].setRotationPoint(-152F, -31F, -90F);
		bodyModel[160].rotateAngleY = 0.12217305F;
		bodyModel[160].rotateAngleZ = 0.01745329F;

		bodyModel[161].addShapeBox(0F, -13F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[161].setRotationPoint(-152F, -31F, -90F);
		bodyModel[161].rotateAngleY = 0.12217305F;
		bodyModel[161].rotateAngleZ = 0.01745329F;

		bodyModel[162].addShapeBox(0F, -13F, -4F, 2, 1, 2, 0F,0F, -1F, 1F, 0F, 1F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[162].setRotationPoint(-152F, -31F, -90F);
		bodyModel[162].rotateAngleY = 0.12217305F;
		bodyModel[162].rotateAngleZ = 0.01745329F;

		bodyModel[163].addShapeBox(0F, -14F, -5F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 4F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 1F, -4F); // Box 197
		bodyModel[163].setRotationPoint(-152F, -31F, -90F);
		bodyModel[163].rotateAngleY = 0.12217305F;
		bodyModel[163].rotateAngleZ = 0.01745329F;

		bodyModel[164].addShapeBox(0F, -11F, -10F, 2, 3, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 1F, -2F); // Box 198
		bodyModel[164].setRotationPoint(-152F, -31F, -90F);
		bodyModel[164].rotateAngleY = 0.12217305F;
		bodyModel[164].rotateAngleZ = 0.01745329F;

		bodyModel[165].addShapeBox(0F, -8F, -13F, 2, 5, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 199
		bodyModel[165].setRotationPoint(-152F, -31F, -90F);
		bodyModel[165].rotateAngleY = 0.12217305F;
		bodyModel[165].rotateAngleZ = 0.01745329F;

		bodyModel[166].addShapeBox(0F, -3F, -15F, 2, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 200
		bodyModel[166].setRotationPoint(-152F, -31F, -90F);
		bodyModel[166].rotateAngleY = 0.12217305F;
		bodyModel[166].rotateAngleZ = 0.01745329F;

		bodyModel[167].addShapeBox(0F, 4F, -13F, 2, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 201
		bodyModel[167].setRotationPoint(-152F, -31F, -90F);
		bodyModel[167].rotateAngleY = 0.12217305F;
		bodyModel[167].rotateAngleZ = 0.01745329F;

		bodyModel[168].addShapeBox(0F, 9F, -10F, 2, 3, 1, 0F,0F, 1F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 202
		bodyModel[168].setRotationPoint(-152F, -31F, -90F);
		bodyModel[168].rotateAngleY = 0.12217305F;
		bodyModel[168].rotateAngleZ = 0.01745329F;

		bodyModel[169].addShapeBox(2F, 15F, -5F, 16, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 203
		bodyModel[169].setRotationPoint(-152F, -31F, -90F);
		bodyModel[169].rotateAngleY = 0.12217305F;
		bodyModel[169].rotateAngleZ = 0.01745329F;

		bodyModel[170].addShapeBox(2F, 12F, -10F, 16, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 204
		bodyModel[170].setRotationPoint(-152F, -31F, -90F);
		bodyModel[170].rotateAngleY = 0.12217305F;
		bodyModel[170].rotateAngleZ = 0.01745329F;

		bodyModel[171].addShapeBox(2F, 9F, -13F, 16, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 205
		bodyModel[171].setRotationPoint(-152F, -31F, -90F);
		bodyModel[171].rotateAngleY = 0.12217305F;
		bodyModel[171].rotateAngleZ = 0.01745329F;

		bodyModel[172].addShapeBox(2F, 4F, -15F, 16, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 206
		bodyModel[172].setRotationPoint(-152F, -31F, -90F);
		bodyModel[172].rotateAngleY = 0.12217305F;
		bodyModel[172].rotateAngleZ = 0.01745329F;

		bodyModel[173].addShapeBox(2F, -3F, -15F, 16, 7, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[173].setRotationPoint(-152F, -31F, -90F);
		bodyModel[173].rotateAngleY = 0.12217305F;
		bodyModel[173].rotateAngleZ = 0.01745329F;

		bodyModel[174].addShapeBox(2F, -8F, -15F, 16, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[174].setRotationPoint(-152F, -31F, -90F);
		bodyModel[174].rotateAngleY = 0.12217305F;
		bodyModel[174].rotateAngleZ = 0.01745329F;

		bodyModel[175].addShapeBox(2F, -11F, -13F, 16, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[175].setRotationPoint(-152F, -31F, -90F);
		bodyModel[175].rotateAngleY = 0.12217305F;
		bodyModel[175].rotateAngleZ = 0.01745329F;

		bodyModel[176].addShapeBox(2F, -14F, -10F, 16, 3, 20, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[176].setRotationPoint(-152F, -31F, -90F);
		bodyModel[176].rotateAngleY = 0.12217305F;
		bodyModel[176].rotateAngleZ = 0.01745329F;

		bodyModel[177].addShapeBox(2F, -15F, -5F, 16, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[177].setRotationPoint(-152F, -31F, -90F);
		bodyModel[177].rotateAngleY = 0.12217305F;
		bodyModel[177].rotateAngleZ = 0.01745329F;

		bodyModel[178].addShapeBox(-8F, -0.5F, -0.5F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[178].setRotationPoint(-152F, -31F, -90F);
		bodyModel[178].rotateAngleY = 0.12217305F;
		bodyModel[178].rotateAngleZ = 0.01745329F;

		bodyModel[179].addShapeBox(18F, -2F, -10F, 35, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[179].setRotationPoint(-152F, -31F, -90F);
		bodyModel[179].rotateAngleY = 0.12217305F;
		bodyModel[179].rotateAngleZ = 0.01745329F;

		bodyModel[180].addShapeBox(18F, -6F, -10F, 35, 4, 20, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[180].setRotationPoint(-152F, -31F, -90F);
		bodyModel[180].rotateAngleY = 0.12217305F;
		bodyModel[180].rotateAngleZ = 0.01745329F;

		bodyModel[181].addShapeBox(18F, -8F, -8F, 35, 2, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[181].setRotationPoint(-152F, -31F, -90F);
		bodyModel[181].rotateAngleY = 0.12217305F;
		bodyModel[181].rotateAngleZ = 0.01745329F;

		bodyModel[182].addShapeBox(18F, -9F, -6F, 35, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[182].setRotationPoint(-152F, -31F, -90F);
		bodyModel[182].rotateAngleY = 0.12217305F;
		bodyModel[182].rotateAngleZ = 0.01745329F;

		bodyModel[183].addShapeBox(53F, -6F, -10F, 23, 4, 20, 0F,0F, 0F, -2F, -3F, 0F, -9F, -3F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 218
		bodyModel[183].setRotationPoint(-152F, -31F, -90F);
		bodyModel[183].rotateAngleY = 0.12217305F;
		bodyModel[183].rotateAngleZ = 0.01745329F;

		bodyModel[184].addShapeBox(53F, -8F, -8F, 20, 2, 16, 0F,0F, 0F, -2F, -5F, 0F, -7F, -5F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 219
		bodyModel[184].setRotationPoint(-152F, -31F, -90F);
		bodyModel[184].rotateAngleY = 0.12217305F;
		bodyModel[184].rotateAngleZ = 0.01745329F;

		bodyModel[185].addShapeBox(53F, -9F, -6F, 15, 1, 12, 0F,0F, 0F, -4F, -5F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 220
		bodyModel[185].setRotationPoint(-152F, -31F, -90F);
		bodyModel[185].rotateAngleY = 0.12217305F;
		bodyModel[185].rotateAngleZ = 0.01745329F;

		bodyModel[186].addShapeBox(18F, 3F, -10F, 35, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 221
		bodyModel[186].setRotationPoint(-152F, -31F, -90F);
		bodyModel[186].rotateAngleY = 0.12217305F;
		bodyModel[186].rotateAngleZ = 0.01745329F;

		bodyModel[187].addShapeBox(18F, 9F, -8F, 35, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 222
		bodyModel[187].setRotationPoint(-152F, -31F, -90F);
		bodyModel[187].rotateAngleY = 0.12217305F;
		bodyModel[187].rotateAngleZ = 0.01745329F;

		bodyModel[188].addShapeBox(18F, 12F, -6F, 35, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 223
		bodyModel[188].setRotationPoint(-152F, -31F, -90F);
		bodyModel[188].rotateAngleY = 0.12217305F;
		bodyModel[188].rotateAngleZ = 0.01745329F;

		bodyModel[189].addShapeBox(53F, 12F, -10F, 23, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -9F, -3F, 0F, -9F, 0F, 0F, -2F); // Box 224
		bodyModel[189].setRotationPoint(-152F, -40F, -90F);
		bodyModel[189].rotateAngleY = 0.12217305F;
		bodyModel[189].rotateAngleZ = 0.01745329F;

		bodyModel[190].addShapeBox(53F, 9F, -8F, 20, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -7F, -5F, 0F, -7F, 0F, 0F, -2F); // Box 225
		bodyModel[190].setRotationPoint(-152F, -31F, -90F);
		bodyModel[190].rotateAngleY = 0.12217305F;
		bodyModel[190].rotateAngleZ = 0.01745329F;

		bodyModel[191].addShapeBox(53F, 12F, -6F, 15, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, -4F); // Box 226
		bodyModel[191].setRotationPoint(-152F, -31F, -90F);
		bodyModel[191].rotateAngleY = 0.12217305F;
		bodyModel[191].rotateAngleZ = 0.01745329F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[192].setRotationPoint(-213F, -44.5F, -1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[193].setRotationPoint(-146F, -75F, -0.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[194].setRotationPoint(-145F, -74F, 9F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[195].setRotationPoint(-142F, -72F, 16F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[196].setRotationPoint(-145F, -74F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[197].setRotationPoint(-142F, -72F, -17F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[198].setRotationPoint(-147F, -75F, -0.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[199].setRotationPoint(-146F, -74F, 9F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[200].setRotationPoint(-143F, -72F, 16F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, -3F, 2F, 0F); // Box 271
		bodyModel[201].setRotationPoint(-146F, -74F, 10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0.5F, -1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0.5F, -1F, 1F, 0.5F); // Box 272
		bodyModel[202].setRotationPoint(-147F, -75F, 0.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[203].setRotationPoint(-146F, -74F, -10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[204].setRotationPoint(-143F, -72F, -17F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[205].setRotationPoint(-146F, -74F, -16F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, -1F, 0.5F, 1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0.5F, 1F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[206].setRotationPoint(-147F, -75F, -8.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[207].setRotationPoint(-150F, -71F, 9F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[208].setRotationPoint(-146F, -69F, 16F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, -4F, 2F, 0F); // Box 279
		bodyModel[209].setRotationPoint(-150F, -71F, 10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0.5F, -1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0.5F, -1F, 1F, 0.5F); // Box 280
		bodyModel[210].setRotationPoint(-151F, -72F, 0.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[211].setRotationPoint(-151F, -72F, -0.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, -1F, 0.5F, 1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0.5F, 1F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[212].setRotationPoint(-151F, -72F, -8.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[213].setRotationPoint(-150F, -71F, -10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[214].setRotationPoint(-146F, -69F, -17F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[215].setRotationPoint(-150F, -71F, -16F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[216].setRotationPoint(-149F, -72F, 9F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[217].setRotationPoint(-150F, -73F, -0.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[218].setRotationPoint(-149F, -72F, -10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[219].setRotationPoint(-145F, -70F, -17F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[220].setRotationPoint(-145F, -70F, 16F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[221].setRotationPoint(-145F, -69F, 16F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 2F, 4F, 0F, 2F); // Box 294
		bodyModel[222].setRotationPoint(-146F, -68F, 16F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 1F, 0F); // Box 295
		bodyModel[223].setRotationPoint(-150F, -70F, 9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[224].setRotationPoint(-145F, -69F, -17F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, -2F, 4F, 0F, -2F); // Box 297
		bodyModel[225].setRotationPoint(-146F, -68F, -17F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 5F, 1F, 0F); // Box 298
		bodyModel[226].setRotationPoint(-150F, -70F, -10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 299
		bodyModel[227].setRotationPoint(-151F, -71F, -0.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 300
		bodyModel[228].setRotationPoint(-138F, -71F, -17F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 301
		bodyModel[229].setRotationPoint(-138F, -71F, 16F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 25, 8, 0F); // Box 302
		bodyModel[230].setRotationPoint(-130F, -63F, -18F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[231].setRotationPoint(-130F, -68F, -18F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[232].setRotationPoint(-130F, -72F, -18F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[233].setRotationPoint(-130F, -74F, -18F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[234].setRotationPoint(-130F, -76F, -15F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 25, 8, 0F); // Box 307
		bodyModel[235].setRotationPoint(-130F, -63F, 10F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[236].setRotationPoint(-130F, -68F, 10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[237].setRotationPoint(-130F, -72F, 8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[238].setRotationPoint(-130F, -74F, 0F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[239].setRotationPoint(-130F, -76F, 0F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 312
		bodyModel[240].setRotationPoint(-132F, -68F, 6F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[241].setRotationPoint(-133F, -48F, 6F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[242].setRotationPoint(-139F, -47F, 6F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 315
		bodyModel[243].setRotationPoint(-143F, -47F, 6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,2F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 317
		bodyModel[244].setRotationPoint(-132F, -68F, -15F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 320
		bodyModel[245].setRotationPoint(-132F, -68F, -14F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[246].setRotationPoint(-139F, -47F, -14F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 322
		bodyModel[247].setRotationPoint(-143F, -47F, -14F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 32, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[248].setRotationPoint(-151F, -60F, -18F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, 5F, -2F, 0F, 5F); // Box 324
		bodyModel[249].setRotationPoint(-153F, -61F, -12F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, 5F, -2F, 0F, 5F); // Box 325
		bodyModel[250].setRotationPoint(-155F, -62F, -7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 5F, 2F, 0F, 5F, 2F, 0F, 5F, -2F, 0F, 5F); // Box 326
		bodyModel[251].setRotationPoint(-157F, -63F, -2F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[252].setRotationPoint(-150.9F, -59F, -13F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[253].setRotationPoint(-150.9F, -59F, -10F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[254].setRotationPoint(-150.9F, -57F, -10F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[255].setRotationPoint(-150.9F, -56F, -12F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[256].setRotationPoint(-150.9F, -56F, -14F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[257].setRotationPoint(-150.9F, -58F, -15F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[258].setRotationPoint(-150.9F, -59F, -6F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[259].setRotationPoint(-150.9F, -56F, -5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[260].setRotationPoint(-150.9F, -56F, -7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[261].setRotationPoint(-150.9F, -58F, -8F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[262].setRotationPoint(-150.9F, -59F, -3F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[263].setRotationPoint(-150.9F, -57F, -3F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[264].setRotationPoint(-150.9F, -59F, 1F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[265].setRotationPoint(-150.9F, -56F, 2F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[266].setRotationPoint(-150.9F, -56F, 0F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[267].setRotationPoint(-150.9F, -58F, -1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[268].setRotationPoint(-150.9F, -59F, 4F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[269].setRotationPoint(-150.9F, -57F, 4F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[270].setRotationPoint(-150.9F, -59F, 8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[271].setRotationPoint(-150.9F, -56F, 9F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[272].setRotationPoint(-150.9F, -56F, 7F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[273].setRotationPoint(-150.9F, -58F, 6F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[274].setRotationPoint(-150.9F, -59F, 11F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[275].setRotationPoint(-150.9F, -57F, 11F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[276].setRotationPoint(-150.9F, -55F, -10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[277].setRotationPoint(-150.9F, -54F, -12F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[278].setRotationPoint(-150.9F, -54F, -14F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[279].setRotationPoint(-150.9F, -56F, -15F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[280].setRotationPoint(-150.9F, -56F, -8F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[281].setRotationPoint(-150.9F, -54F, 2F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[282].setRotationPoint(-150.9F, -53F, 0F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[283].setRotationPoint(-150.9F, -53F, -2F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[284].setRotationPoint(-150.9F, -55F, -3F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[285].setRotationPoint(-150.9F, -55F, 4F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[286].setRotationPoint(-150.9F, -54F, 10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[287].setRotationPoint(-150.9F, -53F, 8F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[288].setRotationPoint(-150.9F, -55F, 12F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 2F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 367
		bodyModel[289].setRotationPoint(-132F, -68F, -6F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,2F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 368
		bodyModel[290].setRotationPoint(-132F, -68F, 5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 2F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 369
		bodyModel[291].setRotationPoint(-132F, -68F, 14F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 370
		bodyModel[292].setRotationPoint(-104.5F, -21F, 31F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[293].setRotationPoint(-102.5F, 3F, 30F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 372
		bodyModel[294].setRotationPoint(-102.5F, 1F, 25F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 5, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, -14F, 2F, 2F, -14F, 2F, -1F, 12F, -4F, -1F, 12F); // Box 373
		bodyModel[295].setRotationPoint(-106.5F, -20F, 11F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 374
		bodyModel[296].setRotationPoint(-104.5F, -21F, -32F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[297].setRotationPoint(-102.5F, 3F, -33F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[298].setRotationPoint(-102.5F, 1F, -30F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 5, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 12F, 2F, -1F, 12F, 2F, 2F, -14F, -4F, 2F, -14F); // Box 377
		bodyModel[299].setRotationPoint(-106.5F, -20F, -13F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F); // Box 382
		bodyModel[300].setRotationPoint(-75.5F, -21F, -32F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 26F, 0F, 0F); // Box 383
		bodyModel[301].setRotationPoint(-75.5F, -21F, 31F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 25, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[302].setRotationPoint(-113.5F, 3F, 33F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 23, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 385
		bodyModel[303].setRotationPoint(-112.5F, 0F, 33F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 19, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 386
		bodyModel[304].setRotationPoint(-110.5F, -3F, 33F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 13, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 387
		bodyModel[305].setRotationPoint(-107.5F, -6F, 33F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F); // Box 388
		bodyModel[306].setRotationPoint(-102.5F, -8F, 33F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[307].setRotationPoint(-102.5F, 15F, 33F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 23, 3, 7, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[308].setRotationPoint(-112.5F, 6F, 33F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 19, 3, 7, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[309].setRotationPoint(-110.5F, 9F, 33F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 13, 3, 7, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[310].setRotationPoint(-107.5F, 12F, 33F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 25, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[311].setRotationPoint(-113.5F, 3F, -40F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 23, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 394
		bodyModel[312].setRotationPoint(-112.5F, 0F, -40F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 19, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 395
		bodyModel[313].setRotationPoint(-110.5F, -3F, -40F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 13, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 396
		bodyModel[314].setRotationPoint(-107.5F, -6F, -40F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F); // Box 397
		bodyModel[315].setRotationPoint(-102.5F, -8F, -40F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[316].setRotationPoint(-102.5F, 15F, -40F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 23, 3, 7, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[317].setRotationPoint(-112.5F, 6F, -40F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 19, 3, 7, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[318].setRotationPoint(-110.5F, 9F, -40F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 13, 3, 7, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[319].setRotationPoint(-107.5F, 12F, -40F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[320].setRotationPoint(179F, -62F, -1F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[321].setRotationPoint(179F, -57F, -1F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[322].setRotationPoint(181F, -57F, 1F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[323].setRotationPoint(181F, -57F, -2F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[324].setRotationPoint(181F, -57F, 1F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[325].setRotationPoint(178F, -52F, -1F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[326].setRotationPoint(178F, -54F, -1F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[327].setRotationPoint(179F, -55F, -1F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 410
		bodyModel[328].setRotationPoint(178F, -49F, -1F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 411
		bodyModel[329].setRotationPoint(179F, -47F, -1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F); // Box 412
		bodyModel[330].setRotationPoint(146F, -56F, 6F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 26, 0F,0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[331].setRotationPoint(146F, -56F, -32F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[332].setRotationPoint(-124F, -99F, 14F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 289, 1, 1, 0F,0F, 0F, 0F, 0F, 24F, 14F, 0F, 24F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 14F, 0F, -24F, -14F, 0F, 0F, 0F); // Box 415
		bodyModel[333].setRotationPoint(-122F, -99F, 14F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[334].setRotationPoint(-147F, -52F, 10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[335].setRotationPoint(-147F, -52F, -11F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1233, 73, textureX, textureY); // Box 90
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 91
		rightWingModel[2] = new ModelRendererTurbo(this, 1313, 81, textureX, textureY); // Box 92
		rightWingModel[3] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 93
		rightWingModel[4] = new ModelRendererTurbo(this, 1425, 81, textureX, textureY); // Box 94
		rightWingModel[5] = new ModelRendererTurbo(this, 1193, 81, textureX, textureY); // Box 95
		rightWingModel[6] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 96
		rightWingModel[7] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 97
		rightWingModel[8] = new ModelRendererTurbo(this, 953, 369, textureX, textureY); // Box 98
		rightWingModel[9] = new ModelRendererTurbo(this, 1281, 393, textureX, textureY); // Box 99
		rightWingModel[10] = new ModelRendererTurbo(this, 1481, 81, textureX, textureY); // Box 110
		rightWingModel[11] = new ModelRendererTurbo(this, 1561, 81, textureX, textureY); // Box 111
		rightWingModel[12] = new ModelRendererTurbo(this, 1649, 89, textureX, textureY); // Box 112
		rightWingModel[13] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 113
		rightWingModel[14] = new ModelRendererTurbo(this, 1761, 89, textureX, textureY); // Box 114
		rightWingModel[15] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 115
		rightWingModel[16] = new ModelRendererTurbo(this, 289, 417, textureX, textureY); // Box 116
		rightWingModel[17] = new ModelRendererTurbo(this, 585, 441, textureX, textureY); // Box 117
		rightWingModel[18] = new ModelRendererTurbo(this, 905, 665, textureX, textureY); // Box 118
		rightWingModel[19] = new ModelRendererTurbo(this, 1233, 689, textureX, textureY); // Box 119
		rightWingModel[20] = new ModelRendererTurbo(this, 1433, 57, textureX, textureY); // Box 269
		rightWingModel[21] = new ModelRendererTurbo(this, 1633, 161, textureX, textureY); // Box 270
		rightWingModel[22] = new ModelRendererTurbo(this, 561, 161, textureX, textureY); // Box 271
		rightWingModel[23] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 272
		rightWingModel[24] = new ModelRendererTurbo(this, 1401, 129, textureX, textureY); // Box 273
		rightWingModel[25] = new ModelRendererTurbo(this, 2025, 57, textureX, textureY); // Box 274
		rightWingModel[26] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 275
		rightWingModel[27] = new ModelRendererTurbo(this, 1321, 49, textureX, textureY); // Box 276
		rightWingModel[28] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 277
		rightWingModel[29] = new ModelRendererTurbo(this, 2041, 57, textureX, textureY); // Box 278
		rightWingModel[30] = new ModelRendererTurbo(this, 1233, 73, textureX, textureY); // Box 279
		rightWingModel[31] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 280
		rightWingModel[32] = new ModelRendererTurbo(this, 649, 169, textureX, textureY); // Box 281
		rightWingModel[33] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Box 282
		rightWingModel[34] = new ModelRendererTurbo(this, 713, 169, textureX, textureY); // Box 283
		rightWingModel[35] = new ModelRendererTurbo(this, 1065, 65, textureX, textureY); // Box 284
		rightWingModel[36] = new ModelRendererTurbo(this, 1073, 65, textureX, textureY); // Box 285
		rightWingModel[37] = new ModelRendererTurbo(this, 1081, 65, textureX, textureY); // Box 286
		rightWingModel[38] = new ModelRendererTurbo(this, 1081, 57, textureX, textureY); // Box 287
		rightWingModel[39] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 288
		rightWingModel[40] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 289
		rightWingModel[41] = new ModelRendererTurbo(this, 1177, 65, textureX, textureY); // Box 290
		rightWingModel[42] = new ModelRendererTurbo(this, 1665, 65, textureX, textureY); // Box 291
		rightWingModel[43] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 292
		rightWingModel[44] = new ModelRendererTurbo(this, 1225, 169, textureX, textureY); // Box 293
		rightWingModel[45] = new ModelRendererTurbo(this, 1969, 73, textureX, textureY); // Box 294
		rightWingModel[46] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 295
		rightWingModel[47] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 296
		rightWingModel[48] = new ModelRendererTurbo(this, 1217, 73, textureX, textureY); // Box 297
		rightWingModel[49] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 298
		rightWingModel[50] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 299
		rightWingModel[51] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 300
		rightWingModel[52] = new ModelRendererTurbo(this, 769, 177, textureX, textureY); // Box 301
		rightWingModel[53] = new ModelRendererTurbo(this, 1897, 177, textureX, textureY); // Box 302
		rightWingModel[54] = new ModelRendererTurbo(this, 1721, 185, textureX, textureY); // Box 303
		rightWingModel[55] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 304
		rightWingModel[56] = new ModelRendererTurbo(this, 1369, 177, textureX, textureY); // Box 305
		rightWingModel[57] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 306
		rightWingModel[58] = new ModelRendererTurbo(this, 1481, 169, textureX, textureY); // Box 307
		rightWingModel[59] = new ModelRendererTurbo(this, 953, 177, textureX, textureY); // Box 308
		rightWingModel[60] = new ModelRendererTurbo(this, 1105, 185, textureX, textureY); // Box 309
		rightWingModel[61] = new ModelRendererTurbo(this, 1809, 145, textureX, textureY); // Box 310

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 22, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		rightWingModel[0].setRotationPoint(-101F, -35F, 20F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 26, 16, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 91
		rightWingModel[1].setRotationPoint(-79F, -35F, 20F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 39, 12, 14, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 92
		rightWingModel[2].setRotationPoint(-53F, -33F, 20F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 10, 16, 14, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 93
		rightWingModel[3].setRotationPoint(-111F, -35F, 20F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 4, 10, 14, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 94
		rightWingModel[4].setRotationPoint(-115F, -32F, 20F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 4, 10, 275, 0F,0F, -4F, 0F, 0F, 0F, 0F, 24F, 20F, 0F, -26F, 17F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 24F, -25F, 0F, -26F, -27F, 0F); // Box 95
		rightWingModel[5].setRotationPoint(-115F, -32F, 34F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 10, 16, 275, 0F,0F, -3F, 0F, 0F, 0F, 0F, 18F, 18F, 0F, -24F, 17F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 18F, -27F, 0F, -24F, -28F, 0F); // Box 96
		rightWingModel[6].setRotationPoint(-111F, -35F, 34F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 22, 16, 275, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 18F, 0F, -18F, 18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -27F, 0F, -18F, -27F, 0F); // Box 97
		rightWingModel[7].setRotationPoint(-101F, -35F, 34F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 26, 16, 275, 0F,0F, 0F, 0F, 0F, -2F, 0F, -8F, 16F, 0F, -6F, 18F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -8F, -29F, 0F, -6F, -27F, 0F); // Box 98
		rightWingModel[8].setRotationPoint(-79F, -35F, 34F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 39, 12, 275, 0F,0F, 0F, 0F, 0F, -6F, 0F, -34F, 16F, 0F, 8F, 18F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -34F, -28F, 0F, 8F, -27F, 0F); // Box 99
		rightWingModel[9].setRotationPoint(-53F, -33F, 34F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 22, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		rightWingModel[10].setRotationPoint(-101F, -35F, -34F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 26, 16, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 111
		rightWingModel[11].setRotationPoint(-79F, -35F, -34F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 39, 12, 14, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 112
		rightWingModel[12].setRotationPoint(-53F, -33F, -34F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 10, 16, 14, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 113
		rightWingModel[13].setRotationPoint(-111F, -35F, -34F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 4, 10, 14, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 114
		rightWingModel[14].setRotationPoint(-115F, -32F, -34F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 4, 10, 275, 0F,-26F, 17F, 0F, 24F, 20F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -26F, -27F, 0F, 24F, -25F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 115
		rightWingModel[15].setRotationPoint(-115F, -32F, -309F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 10, 16, 275, 0F,-24F, 17F, 0F, 18F, 18F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -24F, -28F, 0F, 18F, -27F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 116
		rightWingModel[16].setRotationPoint(-111F, -35F, -309F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 22, 16, 275, 0F,-18F, 18F, 0F, 6F, 18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -27F, 0F, 6F, -27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		rightWingModel[17].setRotationPoint(-101F, -35F, -309F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 26, 16, 275, 0F,-6F, 18F, 0F, -8F, 16F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -6F, -27F, 0F, -8F, -29F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 118
		rightWingModel[18].setRotationPoint(-79F, -35F, -309F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 39, 12, 275, 0F,8F, 18F, 0F, -34F, 16F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 8F, -27F, 0F, -34F, -28F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 119
		rightWingModel[19].setRotationPoint(-53F, -33F, -309F);

		rightWingModel[20].addShapeBox(-8F, -0.5F, -0.5F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		rightWingModel[20].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[20].rotateAngleY = -0.12217305F;
		rightWingModel[20].rotateAngleZ = 0.01745329F;

		rightWingModel[21].addShapeBox(2F, -3F, -15F, 16, 7, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		rightWingModel[21].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[21].rotateAngleY = -0.12217305F;
		rightWingModel[21].rotateAngleZ = 0.01745329F;

		rightWingModel[22].addShapeBox(2F, -11F, -13F, 16, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		rightWingModel[22].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[22].rotateAngleY = -0.12217305F;
		rightWingModel[22].rotateAngleZ = 0.01745329F;

		rightWingModel[23].addShapeBox(2F, -14F, -10F, 16, 3, 20, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		rightWingModel[23].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[23].rotateAngleY = -0.12217305F;
		rightWingModel[23].rotateAngleZ = 0.01745329F;

		rightWingModel[24].addShapeBox(2F, -15F, -5F, 16, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		rightWingModel[24].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[24].rotateAngleY = -0.12217305F;
		rightWingModel[24].rotateAngleZ = 0.01745329F;

		rightWingModel[25].addShapeBox(0F, -13F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 274
		rightWingModel[25].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[25].rotateAngleY = -0.12217305F;
		rightWingModel[25].rotateAngleZ = 0.01745329F;

		rightWingModel[26].addShapeBox(0F, -13F, 2F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 275
		rightWingModel[26].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[26].rotateAngleY = -0.12217305F;
		rightWingModel[26].rotateAngleZ = 0.01745329F;

		rightWingModel[27].addShapeBox(0F, -14F, 4F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -4F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 1F, 4F); // Box 276
		rightWingModel[27].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[27].rotateAngleY = -0.12217305F;
		rightWingModel[27].rotateAngleZ = 0.01745329F;

		rightWingModel[28].addShapeBox(0F, -11F, 9F, 2, 3, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 2F); // Box 277
		rightWingModel[28].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[28].rotateAngleY = -0.12217305F;
		rightWingModel[28].rotateAngleZ = 0.01745329F;

		rightWingModel[29].addShapeBox(0F, -8F, 12F, 2, 5, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 278
		rightWingModel[29].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[29].rotateAngleY = -0.12217305F;
		rightWingModel[29].rotateAngleZ = 0.01745329F;

		rightWingModel[30].addShapeBox(0F, -3F, 14F, 2, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 279
		rightWingModel[30].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[30].rotateAngleY = -0.12217305F;
		rightWingModel[30].rotateAngleZ = 0.01745329F;

		rightWingModel[31].addShapeBox(2F, 4F, -15F, 16, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 280
		rightWingModel[31].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[31].rotateAngleY = -0.12217305F;
		rightWingModel[31].rotateAngleZ = 0.01745329F;

		rightWingModel[32].addShapeBox(2F, 9F, -13F, 16, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 281
		rightWingModel[32].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[32].rotateAngleY = -0.12217305F;
		rightWingModel[32].rotateAngleZ = 0.01745329F;

		rightWingModel[33].addShapeBox(2F, 15F, -5F, 16, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 282
		rightWingModel[33].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[33].rotateAngleY = -0.12217305F;
		rightWingModel[33].rotateAngleZ = 0.01745329F;

		rightWingModel[34].addShapeBox(2F, 12F, -10F, 16, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 283
		rightWingModel[34].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[34].rotateAngleY = -0.12217305F;
		rightWingModel[34].rotateAngleZ = 0.01745329F;

		rightWingModel[35].addShapeBox(0F, 9F, 9F, 2, 3, 1, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 284
		rightWingModel[35].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[35].rotateAngleY = -0.12217305F;
		rightWingModel[35].rotateAngleZ = 0.01745329F;

		rightWingModel[36].addShapeBox(0F, 4F, 12F, 2, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 285
		rightWingModel[36].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[36].rotateAngleY = -0.12217305F;
		rightWingModel[36].rotateAngleZ = 0.01745329F;

		rightWingModel[37].addShapeBox(0F, 12F, 4F, 2, 3, 1, 0F,0F, 1F, -4F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 1F, 4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 286
		rightWingModel[37].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[37].rotateAngleY = -0.12217305F;
		rightWingModel[37].rotateAngleZ = 0.01745329F;

		rightWingModel[38].addShapeBox(0F, 13F, 2F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, -1F, 1F); // Box 287
		rightWingModel[38].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[38].rotateAngleY = -0.12217305F;
		rightWingModel[38].rotateAngleZ = 0.01745329F;

		rightWingModel[39].addShapeBox(0F, 13F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 288
		rightWingModel[39].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[39].rotateAngleY = -0.12217305F;
		rightWingModel[39].rotateAngleZ = 0.01745329F;

		rightWingModel[40].addShapeBox(0F, 13F, -4F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 289
		rightWingModel[40].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[40].rotateAngleY = -0.12217305F;
		rightWingModel[40].rotateAngleZ = 0.01745329F;

		rightWingModel[41].addShapeBox(0F, 12F, -5F, 2, 3, 1, 0F,0F, 1F, 4F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 1F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 290
		rightWingModel[41].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[41].rotateAngleY = -0.12217305F;
		rightWingModel[41].rotateAngleZ = 0.01745329F;

		rightWingModel[42].addShapeBox(0F, 9F, -10F, 2, 3, 1, 0F,0F, 1F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 291
		rightWingModel[42].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[42].rotateAngleY = -0.12217305F;
		rightWingModel[42].rotateAngleZ = 0.01745329F;

		rightWingModel[43].addShapeBox(0F, 4F, -13F, 2, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 292
		rightWingModel[43].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[43].rotateAngleY = -0.12217305F;
		rightWingModel[43].rotateAngleZ = 0.01745329F;

		rightWingModel[44].addShapeBox(2F, -8F, -15F, 16, 5, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightWingModel[44].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[44].rotateAngleY = -0.12217305F;
		rightWingModel[44].rotateAngleZ = 0.01745329F;

		rightWingModel[45].addShapeBox(0F, -3F, -15F, 2, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 294
		rightWingModel[45].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[45].rotateAngleY = -0.12217305F;
		rightWingModel[45].rotateAngleZ = 0.01745329F;

		rightWingModel[46].addShapeBox(0F, -8F, -13F, 2, 5, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 295
		rightWingModel[46].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[46].rotateAngleY = -0.12217305F;
		rightWingModel[46].rotateAngleZ = 0.01745329F;

		rightWingModel[47].addShapeBox(0F, -11F, -10F, 2, 3, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 1F, -2F); // Box 296
		rightWingModel[47].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[47].rotateAngleY = -0.12217305F;
		rightWingModel[47].rotateAngleZ = 0.01745329F;

		rightWingModel[48].addShapeBox(0F, -14F, -5F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 4F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 1F, -4F); // Box 297
		rightWingModel[48].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[48].rotateAngleY = -0.12217305F;
		rightWingModel[48].rotateAngleZ = 0.01745329F;

		rightWingModel[49].addShapeBox(0F, -13F, -4F, 2, 1, 2, 0F,0F, -1F, 1F, 0F, 1F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 298
		rightWingModel[49].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[49].rotateAngleY = -0.12217305F;
		rightWingModel[49].rotateAngleZ = 0.01745329F;

		rightWingModel[50].addShapeBox(18F, -9F, -6F, 35, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightWingModel[50].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[50].rotateAngleY = -0.12217305F;
		rightWingModel[50].rotateAngleZ = 0.01745329F;

		rightWingModel[51].addShapeBox(18F, -8F, -8F, 35, 2, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		rightWingModel[51].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[51].rotateAngleY = -0.12217305F;
		rightWingModel[51].rotateAngleZ = 0.01745329F;

		rightWingModel[52].addShapeBox(18F, -6F, -10F, 35, 4, 20, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightWingModel[52].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[52].rotateAngleY = -0.12217305F;
		rightWingModel[52].rotateAngleZ = 0.01745329F;

		rightWingModel[53].addShapeBox(18F, 3F, -10F, 35, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 302
		rightWingModel[53].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[53].rotateAngleY = -0.12217305F;
		rightWingModel[53].rotateAngleZ = 0.01745329F;

		rightWingModel[54].addShapeBox(18F, -2F, -10F, 35, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightWingModel[54].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[54].rotateAngleY = -0.12217305F;
		rightWingModel[54].rotateAngleZ = 0.01745329F;

		rightWingModel[55].addShapeBox(18F, 9F, -8F, 35, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 304
		rightWingModel[55].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[55].rotateAngleY = -0.12217305F;
		rightWingModel[55].rotateAngleZ = 0.01745329F;

		rightWingModel[56].addShapeBox(18F, 12F, -6F, 35, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 305
		rightWingModel[56].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[56].rotateAngleY = -0.12217305F;
		rightWingModel[56].rotateAngleZ = 0.01745329F;

		rightWingModel[57].addShapeBox(53F, 12F, -6F, 15, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, -4F); // Box 306
		rightWingModel[57].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[57].rotateAngleY = -0.12217305F;
		rightWingModel[57].rotateAngleZ = 0.01745329F;

		rightWingModel[58].addShapeBox(53F, 9F, -8F, 20, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -7F, -5F, 0F, -7F, 0F, 0F, -2F); // Box 307
		rightWingModel[58].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[58].rotateAngleY = -0.12217305F;
		rightWingModel[58].rotateAngleZ = 0.01745329F;

		rightWingModel[59].addShapeBox(53F, 12F, -10F, 23, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -9F, -3F, 0F, -9F, 0F, 0F, -2F); // Box 308
		rightWingModel[59].setRotationPoint(-152F, -40F, 90F);
		rightWingModel[59].rotateAngleY = -0.12217305F;
		rightWingModel[59].rotateAngleZ = 0.01745329F;

		rightWingModel[60].addShapeBox(53F, -8F, -8F, 20, 2, 16, 0F,0F, 0F, -2F, -5F, 0F, -7F, -5F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 309
		rightWingModel[60].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[60].rotateAngleY = -0.12217305F;
		rightWingModel[60].rotateAngleZ = 0.01745329F;

		rightWingModel[61].addShapeBox(53F, -9F, -6F, 15, 1, 12, 0F,0F, 0F, -4F, -5F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 310
		rightWingModel[61].setRotationPoint(-152F, -31F, 90F);
		rightWingModel[61].rotateAngleY = -0.12217305F;
		rightWingModel[61].rotateAngleZ = 0.01745329F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1369, 113, textureX, textureY); // Box 151
		yawFlapModel[1] = new ModelRendererTurbo(this, 1545, 81, textureX, textureY); // Box 152

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 11, 53, 2, 0F,0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 151
		yawFlapModel[0].setRotationPoint(199F, -123F, -1F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 11, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 152
		yawFlapModel[1].setRotationPoint(199F, -70F, -1F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1241, 113, textureX, textureY); // Box 143
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 1145, 57, textureX, textureY); // Box 144

		pitchFlapLeftModel[0].addShapeBox(0F, -1F, 0F, 14, 4, 99, 0F,0F, 0F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F); // Box 143
		pitchFlapLeftModel[0].setRotationPoint(171F, -72F, -105F);

		pitchFlapLeftModel[1].addShapeBox(-4F, -1F, 0F, 4, 4, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F); // Box 144
		pitchFlapLeftModel[1].setRotationPoint(171F, -72F, -105F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1097, 121, textureX, textureY); // Box 145
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 1409, 81, textureX, textureY); // Box 146

		pitchFlapRightModel[0].addShapeBox(0F, -1F, 0F, 14, 4, 99, 0F,0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 145
		pitchFlapRightModel[0].setRotationPoint(171F, -72F, 6F);

		pitchFlapRightModel[1].addShapeBox(-4F, -1F, 0F, 4, 4, 9, 0F,2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 146
		pitchFlapRightModel[1].setRotationPoint(171F, -72F, 96F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 1037, 227, textureX, textureY); // Box 458
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 1297, 1, textureX, textureY); // Box 459
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 1297, 1, textureX, textureY); // Box 460
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, -21, 292, textureX, textureY); // Box 461

		bodyDoorOpenModel[0].addBox(0F, 0F, 0F, 19, 18, 2, 0F); // Box 458
		bodyDoorOpenModel[0].setRotationPoint(12F, -56F, -21F);

		bodyDoorOpenModel[1].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Box 459
		bodyDoorOpenModel[1].setRotationPoint(12F, -63F, -21F);

		bodyDoorOpenModel[2].addBox(0F, 0F, 0F, 19, 3, 2, 0F); // Box 460
		bodyDoorOpenModel[2].setRotationPoint(12F, -66F, -21F);

		bodyDoorOpenModel[3].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Box 461
		bodyDoorOpenModel[3].setRotationPoint(27F, -63F, -21F);
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 1297, 1, textureX, textureY); // Box 31
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 1297, 1, textureX, textureY); // Box 455
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 1297, 1, textureX, textureY); // Box 456
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 1297, 1, textureX, textureY); // Box 457

		bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 19, 3, 2, 0F); // Box 31
		bodyDoorCloseModel[0].setRotationPoint(-7F, -66F, -20F);

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 19, 18, 2, 0F); // Box 455
		bodyDoorCloseModel[1].setRotationPoint(-7F, -56F, -20F);

		bodyDoorCloseModel[2].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Box 456
		bodyDoorCloseModel[2].setRotationPoint(-7F, -63F, -20F);

		bodyDoorCloseModel[3].addBox(0F, 0F, 0F, 4, 7, 2, 0F); // Box 457
		bodyDoorCloseModel[3].setRotationPoint(8F, -63F, -20F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[3][2];
		propellerModels[0] = makeProp1(-207F, -43F, 0F);
		propellerModels[1] = makeProp2(-158F, -30.5F, -90F);
		propellerModels[2] = makeProp3(-158F, -30.5F, 91F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 260, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 260, textureX, textureY);
		prop[0].addBox(-0.5F, -36F, -1.5F, 1, 36, 3, 0.0F);
		prop[1].addBox(-0.5F, -36F, -1.5F, 1, 36, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 260, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 260, textureX, textureY);
		prop[0].addBox(-0.5F, -36F, -1.5F, 1, 36, 3, 0.0F);
		prop[1].addBox(-0.5F, -36F, -1.5F, 1, 36, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = 0.12217305F;
		prop[1].rotateAngleY = 0.12217305F;
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 260, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 260, textureX, textureY);
		prop[0].addBox(-0.5F, -36F, -1.5F, 1, 36, 3, 0.0F);
		prop[1].addBox(-0.5F, -36F, -1.5F, 1, 36, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = -0.12217305F;
		prop[1].rotateAngleY = -0.12217305F;
		return prop;
	}
}