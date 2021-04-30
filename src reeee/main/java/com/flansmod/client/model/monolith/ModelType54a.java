//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Type54a
// Model Creator: 
// Created on: 17.06.2015 - 19:50:04
// Last changed on: 17.06.2015 - 19:50:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelType54a extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelType54a() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[447];
		bodyDoorOpenModel = new ModelRendererTurbo[1];
		bodyDoorCloseModel = new ModelRendererTurbo[1];
		leftFrontWheelModel = new ModelRendererTurbo[1];
		frontWheelModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initleftFrontWheelModel_1();
		initfrontWheelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 721, 105, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 825, 113, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 617, 161, textureX, textureY); // Box 63
		bodyModel[29] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 64
		bodyModel[30] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 65
		bodyModel[31] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 66
		bodyModel[32] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 67
		bodyModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 76
		bodyModel[34] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 77
		bodyModel[35] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 78
		bodyModel[36] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 79
		bodyModel[37] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 98
		bodyModel[38] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 114
		bodyModel[39] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 128
		bodyModel[40] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 129
		bodyModel[41] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 130
		bodyModel[42] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 131
		bodyModel[43] = new ModelRendererTurbo(this, 690, 739, textureX, textureY); // Box 162
		bodyModel[44] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 168
		bodyModel[45] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 169
		bodyModel[46] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 170
		bodyModel[47] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 171
		bodyModel[48] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 205
		bodyModel[49] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 209
		bodyModel[50] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 224
		bodyModel[51] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 239
		bodyModel[52] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 307
		bodyModel[53] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 308
		bodyModel[54] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 309
		bodyModel[55] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 310
		bodyModel[56] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 311
		bodyModel[57] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 312
		bodyModel[58] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 313
		bodyModel[59] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 314
		bodyModel[60] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 315
		bodyModel[61] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 316
		bodyModel[62] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Box 317
		bodyModel[63] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 318
		bodyModel[64] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 319
		bodyModel[65] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 320
		bodyModel[66] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 321
		bodyModel[67] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 322
		bodyModel[68] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 323
		bodyModel[69] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Box 324
		bodyModel[70] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 325
		bodyModel[71] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 326
		bodyModel[72] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Box 307
		bodyModel[73] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Box 308
		bodyModel[74] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 309
		bodyModel[75] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 310
		bodyModel[76] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 312
		bodyModel[77] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 313
		bodyModel[78] = new ModelRendererTurbo(this, 673, 185, textureX, textureY); // Box 316
		bodyModel[79] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 317
		bodyModel[80] = new ModelRendererTurbo(this, 577, 193, textureX, textureY); // Box 318
		bodyModel[81] = new ModelRendererTurbo(this, 769, 201, textureX, textureY); // Box 319
		bodyModel[82] = new ModelRendererTurbo(this, 897, 201, textureX, textureY); // Box 320
		bodyModel[83] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 321
		bodyModel[84] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 322
		bodyModel[85] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 323
		bodyModel[86] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 324
		bodyModel[87] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 325
		bodyModel[88] = new ModelRendererTurbo(this, 422, 301, textureX, textureY); // Box 135
		bodyModel[89] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 137
		bodyModel[90] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Box 138
		bodyModel[91] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 139
		bodyModel[92] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 140
		bodyModel[93] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 141
		bodyModel[94] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 142
		bodyModel[95] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 143
		bodyModel[96] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 144
		bodyModel[97] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 145
		bodyModel[98] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 146
		bodyModel[99] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 147
		bodyModel[100] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 148
		bodyModel[101] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 149
		bodyModel[102] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Box 150
		bodyModel[103] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Box 151
		bodyModel[104] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 152
		bodyModel[105] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 153
		bodyModel[106] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 154
		bodyModel[107] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 155
		bodyModel[108] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 156
		bodyModel[109] = new ModelRendererTurbo(this, 689, 241, textureX, textureY); // Box 157
		bodyModel[110] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 158
		bodyModel[111] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Box 159
		bodyModel[112] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 160
		bodyModel[113] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 161
		bodyModel[114] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 162
		bodyModel[115] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 95
		bodyModel[116] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 93
		bodyModel[117] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 166
		bodyModel[118] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 167
		bodyModel[119] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 168
		bodyModel[120] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 169
		bodyModel[121] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 170
		bodyModel[122] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 171
		bodyModel[123] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 172
		bodyModel[124] = new ModelRendererTurbo(this, 831, 39, textureX, textureY); // Box 174
		bodyModel[125] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 175
		bodyModel[126] = new ModelRendererTurbo(this, -1, 95, textureX, textureY); // Box 176
		bodyModel[127] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 177
		bodyModel[128] = new ModelRendererTurbo(this, 545, 257, textureX, textureY); // Box 179
		bodyModel[129] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 180
		bodyModel[130] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 181
		bodyModel[131] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 182
		bodyModel[132] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Box 183
		bodyModel[133] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Box 184
		bodyModel[134] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 185
		bodyModel[135] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 186
		bodyModel[136] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 187
		bodyModel[137] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 188
		bodyModel[138] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 189
		bodyModel[139] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 190
		bodyModel[140] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 191
		bodyModel[141] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 192
		bodyModel[142] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 193
		bodyModel[143] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 194
		bodyModel[144] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Box 198
		bodyModel[145] = new ModelRendererTurbo(this, 1001, 105, textureX, textureY); // Box 199
		bodyModel[146] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 200
		bodyModel[147] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 201
		bodyModel[148] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 203
		bodyModel[149] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Box 204
		bodyModel[150] = new ModelRendererTurbo(this, 817, 9, textureX, textureY); // Box 205
		bodyModel[151] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 206
		bodyModel[152] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 207
		bodyModel[153] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 208
		bodyModel[154] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 209
		bodyModel[155] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 210
		bodyModel[156] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 211
		bodyModel[157] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 212
		bodyModel[158] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 213
		bodyModel[159] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 214
		bodyModel[160] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 215
		bodyModel[161] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 216
		bodyModel[162] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 217
		bodyModel[163] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 218
		bodyModel[164] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 219
		bodyModel[165] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 222
		bodyModel[166] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 225
		bodyModel[167] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 232
		bodyModel[168] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 233
		bodyModel[169] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 234
		bodyModel[170] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 235
		bodyModel[171] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 236
		bodyModel[172] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 238
		bodyModel[173] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 239
		bodyModel[174] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 240
		bodyModel[175] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 241
		bodyModel[176] = new ModelRendererTurbo(this, 310, 254, textureX, textureY); // Box 242
		bodyModel[177] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 244
		bodyModel[178] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 245
		bodyModel[179] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 249
		bodyModel[180] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 254
		bodyModel[181] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 255
		bodyModel[182] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 259
		bodyModel[183] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 261
		bodyModel[184] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 262
		bodyModel[185] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 269
		bodyModel[186] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 271
		bodyModel[187] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 273
		bodyModel[188] = new ModelRendererTurbo(this, 977, 89, textureX, textureY); // Box 212
		bodyModel[189] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 214
		bodyModel[190] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 216
		bodyModel[191] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 217
		bodyModel[192] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 218
		bodyModel[193] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 219
		bodyModel[194] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 220
		bodyModel[195] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 221
		bodyModel[196] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 222
		bodyModel[197] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Box 223
		bodyModel[198] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 224
		bodyModel[199] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 225
		bodyModel[200] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 226
		bodyModel[201] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 227
		bodyModel[202] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 228
		bodyModel[203] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 229
		bodyModel[204] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 230
		bodyModel[205] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 231
		bodyModel[206] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 232
		bodyModel[207] = new ModelRendererTurbo(this, 777, 153, textureX, textureY); // Box 233
		bodyModel[208] = new ModelRendererTurbo(this, 801, 153, textureX, textureY); // Box 234
		bodyModel[209] = new ModelRendererTurbo(this, 1001, 153, textureX, textureY); // Box 235
		bodyModel[210] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 236
		bodyModel[211] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 237
		bodyModel[212] = new ModelRendererTurbo(this, 689, 161, textureX, textureY); // Box 238
		bodyModel[213] = new ModelRendererTurbo(this, 625, 169, textureX, textureY); // Box 239
		bodyModel[214] = new ModelRendererTurbo(this, 873, 169, textureX, textureY); // Box 240
		bodyModel[215] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Box 241
		bodyModel[216] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Box 242
		bodyModel[217] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 243
		bodyModel[218] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 244
		bodyModel[219] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 245
		bodyModel[220] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 246
		bodyModel[221] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 247
		bodyModel[222] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 248
		bodyModel[223] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 249
		bodyModel[224] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 250
		bodyModel[225] = new ModelRendererTurbo(this, 585, 177, textureX, textureY); // Box 251
		bodyModel[226] = new ModelRendererTurbo(this, 609, 177, textureX, textureY); // Box 252
		bodyModel[227] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 253
		bodyModel[228] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 254
		bodyModel[229] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 255
		bodyModel[230] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 256
		bodyModel[231] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 257
		bodyModel[232] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 258
		bodyModel[233] = new ModelRendererTurbo(this, 673, 193, textureX, textureY); // Box 259
		bodyModel[234] = new ModelRendererTurbo(this, 697, 193, textureX, textureY); // Box 260
		bodyModel[235] = new ModelRendererTurbo(this, 593, 201, textureX, textureY); // Box 261
		bodyModel[236] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 263
		bodyModel[237] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 264
		bodyModel[238] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 265
		bodyModel[239] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 266
		bodyModel[240] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 267
		bodyModel[241] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 268
		bodyModel[242] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 269
		bodyModel[243] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 270
		bodyModel[244] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 271
		bodyModel[245] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 272
		bodyModel[246] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 273
		bodyModel[247] = new ModelRendererTurbo(this, 513, 73, textureX, textureY); // Box 274
		bodyModel[248] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 275
		bodyModel[249] = new ModelRendererTurbo(this, 769, 73, textureX, textureY); // Box 276
		bodyModel[250] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Box 277
		bodyModel[251] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 278
		bodyModel[252] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 279
		bodyModel[253] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 280
		bodyModel[254] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 281
		bodyModel[255] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 282
		bodyModel[256] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 283
		bodyModel[257] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 284
		bodyModel[258] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 285
		bodyModel[259] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 286
		bodyModel[260] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Box 287
		bodyModel[261] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 288
		bodyModel[262] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 289
		bodyModel[263] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Box 290
		bodyModel[264] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 291
		bodyModel[265] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 292
		bodyModel[266] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 293
		bodyModel[267] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 294
		bodyModel[268] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 295
		bodyModel[269] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 296
		bodyModel[270] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Box 297
		bodyModel[271] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 298
		bodyModel[272] = new ModelRendererTurbo(this, 737, 89, textureX, textureY); // Box 299
		bodyModel[273] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 300
		bodyModel[274] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Box 301
		bodyModel[275] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 302
		bodyModel[276] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 303
		bodyModel[277] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 304
		bodyModel[278] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 305
		bodyModel[279] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 306
		bodyModel[280] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Box 307
		bodyModel[281] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 308
		bodyModel[282] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 309
		bodyModel[283] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 310
		bodyModel[284] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 311
		bodyModel[285] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 312
		bodyModel[286] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Box 313
		bodyModel[287] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 314
		bodyModel[288] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 315
		bodyModel[289] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 316
		bodyModel[290] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 317
		bodyModel[291] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 318
		bodyModel[292] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 319
		bodyModel[293] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Box 320
		bodyModel[294] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 321
		bodyModel[295] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 322
		bodyModel[296] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Box 323
		bodyModel[297] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Box 324
		bodyModel[298] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Box 325
		bodyModel[299] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Box 326
		bodyModel[300] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Box 327
		bodyModel[301] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 328
		bodyModel[302] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 329
		bodyModel[303] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 330
		bodyModel[304] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 331
		bodyModel[305] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 332
		bodyModel[306] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 333
		bodyModel[307] = new ModelRendererTurbo(this, 729, 105, textureX, textureY); // Box 334
		bodyModel[308] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 335
		bodyModel[309] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Box 336
		bodyModel[310] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 337
		bodyModel[311] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 338
		bodyModel[312] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Box 339
		bodyModel[313] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Box 340
		bodyModel[314] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 341
		bodyModel[315] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 342
		bodyModel[316] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 343
		bodyModel[317] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 344
		bodyModel[318] = new ModelRendererTurbo(this, 977, 113, textureX, textureY); // Box 345
		bodyModel[319] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Box 346
		bodyModel[320] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 347
		bodyModel[321] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 348
		bodyModel[322] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 349
		bodyModel[323] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 350
		bodyModel[324] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 351
		bodyModel[325] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 352
		bodyModel[326] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 353
		bodyModel[327] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 354
		bodyModel[328] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 355
		bodyModel[329] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Box 356
		bodyModel[330] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Box 357
		bodyModel[331] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 358
		bodyModel[332] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 359
		bodyModel[333] = new ModelRendererTurbo(this, 857, 121, textureX, textureY); // Box 360
		bodyModel[334] = new ModelRendererTurbo(this, 793, 201, textureX, textureY); // Box 343
		bodyModel[335] = new ModelRendererTurbo(this, 897, 201, textureX, textureY); // Box 344
		bodyModel[336] = new ModelRendererTurbo(this, 985, 201, textureX, textureY); // Box 345
		bodyModel[337] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 346
		bodyModel[338] = new ModelRendererTurbo(this, 673, 209, textureX, textureY); // Box 347
		bodyModel[339] = new ModelRendererTurbo(this, 697, 209, textureX, textureY); // Box 348
		bodyModel[340] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 349
		bodyModel[341] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 350
		bodyModel[342] = new ModelRendererTurbo(this, 913, 217, textureX, textureY); // Box 351
		bodyModel[343] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 352
		bodyModel[344] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 351
		bodyModel[345] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 353
		bodyModel[346] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 355
		bodyModel[347] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 356
		bodyModel[348] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Box 353
		bodyModel[349] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 354
		bodyModel[350] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 355
		bodyModel[351] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 356
		bodyModel[352] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 357
		bodyModel[353] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 358
		bodyModel[354] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 359
		bodyModel[355] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 360
		bodyModel[356] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 361
		bodyModel[357] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 362
		bodyModel[358] = new ModelRendererTurbo(this, 924, 244, textureX, textureY); // Box 363
		bodyModel[359] = new ModelRendererTurbo(this, 924, 244, textureX, textureY); // Box 365
		bodyModel[360] = new ModelRendererTurbo(this, 924, 244, textureX, textureY); // Box 366
		bodyModel[361] = new ModelRendererTurbo(this, 924, 244, textureX, textureY); // Box 367
		bodyModel[362] = new ModelRendererTurbo(this, 998, 270, textureX, textureY); // Box 368
		bodyModel[363] = new ModelRendererTurbo(this, 998, 270, textureX, textureY); // Box 369
		bodyModel[364] = new ModelRendererTurbo(this, 998, 270, textureX, textureY); // Box 370
		bodyModel[365] = new ModelRendererTurbo(this, 998, 270, textureX, textureY); // Box 371
		bodyModel[366] = new ModelRendererTurbo(this, 815, 273, textureX, textureY); // Box 372
		bodyModel[367] = new ModelRendererTurbo(this, 815, 273, textureX, textureY); // Box 383
		bodyModel[368] = new ModelRendererTurbo(this, 815, 273, textureX, textureY); // Box 384
		bodyModel[369] = new ModelRendererTurbo(this, 815, 273, textureX, textureY); // Box 385
		bodyModel[370] = new ModelRendererTurbo(this, 815, 273, textureX, textureY); // Box 386
		bodyModel[371] = new ModelRendererTurbo(this, 815, 273, textureX, textureY); // Box 387
		bodyModel[372] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 389
		bodyModel[373] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 390
		bodyModel[374] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 391
		bodyModel[375] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 392
		bodyModel[376] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 393
		bodyModel[377] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 394
		bodyModel[378] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 395
		bodyModel[379] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 396
		bodyModel[380] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 397
		bodyModel[381] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 398
		bodyModel[382] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 399
		bodyModel[383] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 400
		bodyModel[384] = new ModelRendererTurbo(this, 690, 739, textureX, textureY); // Box 390
		bodyModel[385] = new ModelRendererTurbo(this, 809, 348, textureX, textureY); // Box 390
		bodyModel[386] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 391
		bodyModel[387] = new ModelRendererTurbo(this, 14, 306, textureX, textureY); // Box 20
		bodyModel[388] = new ModelRendererTurbo(this, 82, 304, textureX, textureY); // Box 21
		bodyModel[389] = new ModelRendererTurbo(this, 25, 263, textureX, textureY); // Box 23
		bodyModel[390] = new ModelRendererTurbo(this, 24, 287, textureX, textureY); // Box 24
		bodyModel[391] = new ModelRendererTurbo(this, 213, 299, textureX, textureY); // Box 19
		bodyModel[392] = new ModelRendererTurbo(this, 165, 305, textureX, textureY); // Box 17
		bodyModel[393] = new ModelRendererTurbo(this, 149, 307, textureX, textureY); // Box 398
		bodyModel[394] = new ModelRendererTurbo(this, 196, 306, textureX, textureY); // Box 399
		bodyModel[395] = new ModelRendererTurbo(this, 269, 940, textureX, textureY); // Box 401
		bodyModel[396] = new ModelRendererTurbo(this, 80, 940, textureX, textureY); // Box 402
		bodyModel[397] = new ModelRendererTurbo(this, 82, 855, textureX, textureY); // Box 402
		bodyModel[398] = new ModelRendererTurbo(this, 859, 419, textureX, textureY); // Box 404
		bodyModel[399] = new ModelRendererTurbo(this, 768, 431, textureX, textureY); // Box 136
		bodyModel[400] = new ModelRendererTurbo(this, 892, 561, textureX, textureY); // Box 406
		bodyModel[401] = new ModelRendererTurbo(this, 946, 435, textureX, textureY); // Box 407
		bodyModel[402] = new ModelRendererTurbo(this, 819, 544, textureX, textureY); // Box 408
		bodyModel[403] = new ModelRendererTurbo(this, 855, 459, textureX, textureY); // Box 409
		bodyModel[404] = new ModelRendererTurbo(this, 714, 304, textureX, textureY); // Box 410
		bodyModel[405] = new ModelRendererTurbo(this, 844, 316, textureX, textureY); // Box 411
		bodyModel[406] = new ModelRendererTurbo(this, 793, 337, textureX, textureY); // Box 412
		bodyModel[407] = new ModelRendererTurbo(this, 962, 310, textureX, textureY); // Box 413
		bodyModel[408] = new ModelRendererTurbo(this, 776, 316, textureX, textureY); // Box 418
		bodyModel[409] = new ModelRendererTurbo(this, 793, 337, textureX, textureY); // Box 419
		bodyModel[410] = new ModelRendererTurbo(this, 793, 337, textureX, textureY); // Box 420
		bodyModel[411] = new ModelRendererTurbo(this, 793, 337, textureX, textureY); // Box 421
		bodyModel[412] = new ModelRendererTurbo(this, 793, 337, textureX, textureY); // Box 422
		bodyModel[413] = new ModelRendererTurbo(this, 776, 316, textureX, textureY); // Box 423
		bodyModel[414] = new ModelRendererTurbo(this, 397, 264, textureX, textureY); // Box 419
		bodyModel[415] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 210
		bodyModel[416] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 421
		bodyModel[417] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 422
		bodyModel[418] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 423
		bodyModel[419] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 424
		bodyModel[420] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 425
		bodyModel[421] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 426
		bodyModel[422] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 427
		bodyModel[423] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 428
		bodyModel[424] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 429
		bodyModel[425] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 430
		bodyModel[426] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 431
		bodyModel[427] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 432
		bodyModel[428] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 433
		bodyModel[429] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 434
		bodyModel[430] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 435
		bodyModel[431] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 436
		bodyModel[432] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 437
		bodyModel[433] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 438
		bodyModel[434] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 439
		bodyModel[435] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 440
		bodyModel[436] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 441
		bodyModel[437] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 442
		bodyModel[438] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 443
		bodyModel[439] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 444
		bodyModel[440] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 445
		bodyModel[441] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 446
		bodyModel[442] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 447
		bodyModel[443] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 448
		bodyModel[444] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 449
		bodyModel[445] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 450
		bodyModel[446] = new ModelRendererTurbo(this, 634, 307, textureX, textureY); // Box 451

		bodyModel[0].addBox(0F, 0F, -23F, 80, 10, 46, 0F); // Box 1
		bodyModel[0].setRotationPoint(-20F, 4F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, -23F, 60, 10, 46, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1
		bodyModel[1].setRotationPoint(-80F, 4F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, -13.5F, 36, 10, 27, 0F,0F, 0F, 3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 3F); // Box 3
		bodyModel[2].setRotationPoint(-141F, 4F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, -7.5F, 19, 7, 15, 0F,3F, 0F, 7F, 0F, 0F, 9F, 0F, 0F, 9F, 3F, 0F, 7F, 1F, 0F, 7F, 0F, 0F, 9F, 0F, 0F, 9F, 1F, 0F, 7F); // Box 4
		bodyModel[3].setRotationPoint(-160F, 4F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, -23F, 40, 10, 46, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(60F, 4F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, -19F, 35, 10, 38, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(100F, 4F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, -12F, 27, 10, 24, 0F,0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F); // Box 7
		bodyModel[6].setRotationPoint(135F, 4F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, -10F, 27, 10, 20, 0F,0F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, -4F, -9F, 0F, -10F, -9F, 0F, -10F, 0F, 0F, -4F); // Box 8
		bodyModel[7].setRotationPoint(162F, 4F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, -10F, 27, 7, 20, 0F,0F, 0F, -4F, -9F, 0F, -10F, -9F, 0F, -10F, 0F, 0F, -4F, 0F, 0F, -6F, -17F, 0F, -10F, -17F, 0F, -10F, 0F, 0F, -6F); // Box 9
		bodyModel[8].setRotationPoint(162F, 14F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, -12F, 27, 7, 24, 0F,0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F); // Box 10
		bodyModel[9].setRotationPoint(135F, 14F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, -19F, 35, 7, 38, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -3F); // Box 11
		bodyModel[10].setRotationPoint(100F, 14F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, -23F, 60, 7, 46, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F); // Box 12
		bodyModel[11].setRotationPoint(-80F, 14F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, -23F, 80, 7, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 13
		bodyModel[12].setRotationPoint(-20F, 14F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, -23F, 40, 7, 46, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -3F); // Box 14
		bodyModel[13].setRotationPoint(60F, 14F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, -17F, 25, 7, 34, 0F,0F, 0F, 2.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2.5F, 0F, 0F, -6.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6.5F); // Box 15
		bodyModel[14].setRotationPoint(-105F, 14F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, -9F, 24, 5, 18, 0F,0F, 0F, -5F, -14F, 0F, -9F, -14F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, -8.9F, -23F, 0F, -8.9F, -23F, 0F, -8.9F, 0F, 0F, -8.9F); // Box 16
		bodyModel[15].setRotationPoint(162F, 21F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, -7.5F, 19, 3, 15, 0F,1F, 0F, 7F, 0F, 0F, 9F, 0F, 0F, 9F, 1F, 0F, 7F, -1F, 0F, 6F, 0F, 0F, 9F, 0F, 0F, 9F, -1F, 0F, 6F); // Box 17
		bodyModel[16].setRotationPoint(-160F, 11F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, -12F, 27, 5, 24, 0F,0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0F, -11.9F, 0F, 0F, -11.9F, 0F, 0F, -11F); // Box 18
		bodyModel[17].setRotationPoint(135F, 21F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, -19F, 35, 5, 38, 0F,0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F); // Box 19
		bodyModel[18].setRotationPoint(100F, 21F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, -23F, 40, 5, 46, 0F,0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, -22F); // Box 20
		bodyModel[19].setRotationPoint(60F, 21F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, -23F, 80, 5, 46, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, -22F); // Box 21
		bodyModel[20].setRotationPoint(-20F, 21F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, -23F, 60, 5, 46, 0F,0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, -22F); // Box 22
		bodyModel[21].setRotationPoint(-80F, 21F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, -17F, 25, 5, 34, 0F,0F, 0F, -6.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6.5F, -2F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, -2F, 0F, -16F); // Box 23
		bodyModel[22].setRotationPoint(-105F, 21F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, -10F, 27, 5, 20, 0F,0F, -1F, 1F, 4F, 0.65F, -10F, 4F, 0.65F, -10F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -3F); // Box 24
		bodyModel[23].setRotationPoint(162F, -1F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F); // Box 25
		bodyModel[24].setRotationPoint(190.4F, -12F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, -13.5F, 36, 7, 27, 0F,0F, 0F, 3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, -4F, -10.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, -10.5F); // Box 26
		bodyModel[25].setRotationPoint(-141F, 14F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, -7.5F, 18, 3, 15, 0F,0F, 0F, 6F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 6F, 0F, -3F, 6F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -3F, 6F); // Box 27
		bodyModel[26].setRotationPoint(-159F, 14F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, -11F, 27, 6, 22, 0F,0F, -1.1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 5F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 4F); // Box 28
		bodyModel[27].setRotationPoint(135F, 0F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, -13.5F, 22, 4, 27, 0F,-5F, 2F, -13.5F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 2F, -13.5F, -9F, -0.1F, -13.5F, 2F, 0F, -12F, 2F, 0F, -12F, -9F, -0.1F, -13.5F); // Box 63
		bodyModel[28].setRotationPoint(-127F, 21F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 64
		bodyModel[29].setRotationPoint(127F, -0.199999999999999F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 65
		bodyModel[30].setRotationPoint(135F, -0.199999999999999F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[31].setRotationPoint(127F, -0.199999999999999F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[32].setRotationPoint(135F, -0.199999999999999F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[33].setRotationPoint(-83.8F, -20.9F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[34].setRotationPoint(-75.8F, -20.9F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 78
		bodyModel[35].setRotationPoint(-75.8F, -20.9F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 79
		bodyModel[36].setRotationPoint(-83.8F, -20.9F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[37].setRotationPoint(-133F, 17F, 6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 20, 8, 0F,4F, 0F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, -0.6F, 4F, 0F, -0.6F, 5F, 0F, 3F, 5F, 0F, 3F, 5F, 0F, 3F, 5F, 0F, 3F); // Box 114
		bodyModel[38].setRotationPoint(37F, -47F, -4F);

		bodyModel[39].addShapeBox(0F, -5F, 0F, 5, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[39].setRotationPoint(-16.5F, -36F, -5F);

		bodyModel[40].addShapeBox(0F, -5F, 0F, 5, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 129
		bodyModel[40].setRotationPoint(-9.5F, -36F, -5F);

		bodyModel[41].addShapeBox(0F, -5F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[41].setRotationPoint(-11.5F, -36F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.7F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -3F, -0.7F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -3F); // Box 131
		bodyModel[42].setRotationPoint(-18.5F, -41F, -5F);

		bodyModel[43].addShapeBox(0F, -9F, 0F, 1, 120, 160, 0F,0F, -65F, -89F, 0F, -65F, -89F, 0F, -66F, -89F, 0F, -66F, -89F, 0F, -67F, -89F, 0F, -67F, -89F, 0F, -66F, -89F, 0F, -66F, -89F); // Box 162
		bodyModel[43].setRotationPoint(39F, -114F, -80F);

		bodyModel[44].addShapeBox(0F, -5F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[44].setRotationPoint(34.5F, -63F, -2F);

		bodyModel[45].addShapeBox(0F, -14F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[45].setRotationPoint(36.5F, -54F, -2F);

		bodyModel[46].addShapeBox(0F, -5F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 170
		bodyModel[46].setRotationPoint(34.5F, -63F, 0F);

		bodyModel[47].addShapeBox(0F, -6F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 171
		bodyModel[47].setRotationPoint(36.5F, -62F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[48].setRotationPoint(27F, -70F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F); // Box 209
		bodyModel[49].setRotationPoint(39F, -48.5F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 27, 7, 14, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[50].setRotationPoint(32F, -27F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, -0.5F, 1, 13, 1, 0F,-0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Box 239
		bodyModel[51].setRotationPoint(25.65F, -82.5F, 0F);
		bodyModel[51].rotateAngleZ = 0.10471976F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 307
		bodyModel[52].setRotationPoint(-115F, 21F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 308
		bodyModel[53].setRotationPoint(-125F, 22F, 4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[54].setRotationPoint(-118F, 21F, 8F);

		bodyModel[55].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[55].setRotationPoint(-117F, 21.5F, 8.5F);

		bodyModel[56].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[56].setRotationPoint(-117F, 21.5F, 8.5F);
		bodyModel[56].rotateAngleX = 2.0943951F;

		bodyModel[57].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[57].setRotationPoint(-117F, 21.5F, 8.5F);
		bodyModel[57].rotateAngleX = 4.1887902F;

		bodyModel[58].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[58].setRotationPoint(-117F, 22.5F, 4.5F);
		bodyModel[58].rotateAngleX = 4.1887902F;

		bodyModel[59].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[59].setRotationPoint(-117F, 22.5F, 4.5F);
		bodyModel[59].rotateAngleX = 2.0943951F;

		bodyModel[60].addShapeBox(-10F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[60].setRotationPoint(-118F, 22F, 4F);

		bodyModel[61].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[61].setRotationPoint(-117F, 22.5F, 4.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 317
		bodyModel[62].setRotationPoint(-115F, 21F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 318
		bodyModel[63].setRotationPoint(-125F, 22F, -5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[64].setRotationPoint(-118F, 21F, -9F);

		bodyModel[65].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[65].setRotationPoint(-117F, 21.5F, -8.5F);

		bodyModel[66].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[66].setRotationPoint(-117F, 21.5F, -8.5F);
		bodyModel[66].rotateAngleX = 2.0943951F;

		bodyModel[67].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[67].setRotationPoint(-117F, 21.5F, -8.5F);
		bodyModel[67].rotateAngleX = 4.1887902F;

		bodyModel[68].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[68].setRotationPoint(-117F, 22.5F, -4.5F);
		bodyModel[68].rotateAngleX = 4.1887902F;

		bodyModel[69].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[69].setRotationPoint(-117F, 22.5F, -4.5F);
		bodyModel[69].rotateAngleX = 2.0943951F;

		bodyModel[70].addShapeBox(-10F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[70].setRotationPoint(-118F, 22F, -5F);

		bodyModel[71].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[71].setRotationPoint(-117F, 22.5F, -4.5F);

		bodyModel[72].addShapeBox(0F, 0F, -11F, 35, 6, 22, 0F,0F, -1.9F, 9F, 0F, -1.1F, 5F, 0F, -1.1F, 5F, 0F, -1.9F, 9F, 0F, -2F, 8F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, -2F, 8F); // Box 307
		bodyModel[72].setRotationPoint(100F, 0F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, -11F, 40, 6, 22, 0F,0F, -3F, 12.6F, 0F, -1.9F, 9F, 0F, -1.9F, 9F, 0F, -3F, 12.6F, 0F, -2F, 12F, 0F, -2F, 8F, 0F, -2F, 8F, 0F, -2F, 12F); // Box 308
		bodyModel[73].setRotationPoint(60F, 0F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, -11F, 40, 6, 22, 0F,0F, -3.95F, 12F, 0F, -3F, 12.6F, 0F, -3F, 12.6F, 0F, -3.95F, 12F, 0F, -2F, 12F, 0F, -2F, 12F, 0F, -2F, 12F, 0F, -2F, 12F); // Box 309
		bodyModel[74].setRotationPoint(20F, 0F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, -23F, 21, 11, 46, 0F,0F, 10F, -4F, -1F, 10F, -6F, -1F, 10F, -6F, 0F, 10F, -4F, 0F, -1.1F, 0.66F, 0F, -1.7F, -1.3F, 0F, -1.7F, -1.3F, 0F, -1.1F, 0.66F); // Box 310
		bodyModel[75].setRotationPoint(60F, -6.9F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, -23F, 30, 11, 46, 0F,-2F, 10F, -4F, 0F, 10F, -4F, 0F, 10F, -4F, -2F, 10F, -4F, 0F, -0.4F, 0.25F, 0F, -1.1F, 0.65F, 0F, -1.1F, 0.65F, 0F, -0.4F, 0.25F); // Box 312
		bodyModel[76].setRotationPoint(30F, -6.9F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, -23F, 11, 3, 46, 0F,-1F, 10F, -2.8F, 1.3F, 10F, -2.5F, 1.3F, 10F, -2.5F, -1F, 10F, -2.8F, 0F, -0.45F, 0.05F, 0F, -0.8F, 0.25F, 0F, -0.8F, 0.25F, 0F, -0.45F, 0.05F); // Box 313
		bodyModel[77].setRotationPoint(19F, 1.5F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, -23F, 23, 3, 46, 0F,0F, 10F, -2.8F, -1F, 10F, -2.8F, -1F, 10F, -2.8F, 0F, 10F, -2.8F, 0F, -0.5F, 0.05F, -2F, -0.3F, 0.05F, -2F, -0.45F, 0.05F, 0F, -0.5F, 0.05F); // Box 316
		bodyModel[78].setRotationPoint(-2F, 1.5F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, -23F, 18, 9, 46, 0F,0F, 10F, -4F, 0F, 10F, -4F, 0F, 10F, -4F, 0F, 10F, -4F, 0F, -0.1F, 0.02F, 0F, -0.1F, 0.02F, 0F, -0.1F, 0.02F, 0F, -0.1F, 0.02F); // Box 317
		bodyModel[79].setRotationPoint(-20F, -4.9F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, -23F, 21, 9, 46, 0F,0F, 10F, -4.4F, 0F, 10F, -4F, 0F, 10F, -4F, 0F, 10F, -4.4F, 0F, -0.1F, -0.78F, 0F, -0.1F, 0.02F, 0F, -0.1F, 0.02F, 0F, -0.1F, -0.78F); // Box 318
		bodyModel[80].setRotationPoint(-41F, -4.9F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, -23F, 39, 11, 46, 0F,0F, 10F, -5.3F, 0F, 10F, -4.8F, 0F, 10F, -4.8F, 0F, 10F, -5.3F, 0F, -0.1F, -2.08F, 0F, -0.1F, -0.78F, 0F, -0.1F, -0.78F, 0F, -0.1F, -2.08F); // Box 319
		bodyModel[81].setRotationPoint(-80F, -6.9F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, -17F, 25, 7, 34, 0F,0F, 3F, 2.5F, 0F, 3F, 4F, 0F, 3F, 4F, 0F, 3F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2.5F); // Box 320
		bodyModel[82].setRotationPoint(-105F, 7F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, -23F, 25, 11, 46, 0F,-2.2F, 10F, -6.45F, 0F, 10F, -5.3F, 0F, 10F, -5.3F, -2.2F, 10F, -6.45F, 0F, -0.1F, -3.53F, 0F, -0.1F, -2.08F, 0F, -0.1F, -2.08F, 0F, -0.1F, -3.53F); // Box 321
		bodyModel[83].setRotationPoint(-105F, -6.9F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, -15F, 3, 7, 36, 0F,0F, 0F, 1F, 1.4F, 0F, -2.6F, 1.4F, 0F, -2.6F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F); // Box 322
		bodyModel[84].setRotationPoint(83F, -20.5F, -3F);

		bodyModel[85].addShapeBox(0F, 0F, -15F, 15, 7, 34, 0F,0F, 0F, -1F, -1F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, -1F, 0F, -2F, -1F, -1F, -2F, 1F, -1F, -2F, 1F, 0F, -2F, -1F); // Box 323
		bodyModel[85].setRotationPoint(69F, -20.5F, -2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 12, 18, 28, 0F,1F, 3F, 3F, -8F, 2F, -4F, -8F, 2F, -4F, 1F, 3F, 3F, 0F, -1.6F, 7.7F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, -1.6F, 7.7F); // Box 324
		bodyModel[86].setRotationPoint(81F, -14F, -14F);

		bodyModel[87].addShapeBox(0F, 0F, -15F, 3, 5, 30, 0F,0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, -1.4F, -4F, 0F, -1.4F, 1F, 0F, -1.4F, 1F, 0F, -1.4F, -4F); // Box 325
		bodyModel[87].setRotationPoint(32F, -20.5F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, -15F, 32, 1, 30, 0F,0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[88].setRotationPoint(92F, 1F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, -15F, 34, 5, 30, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 137
		bodyModel[89].setRotationPoint(35F, -20.5F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, -23F, 23, 1, 8, 0F,0F, 10F, -0.37F, -1.05F, 10F, -0.27F, -1.05F, 10F, -5.95F, 0F, 10F, -5.95F, 0F, -8.5F, 0.21F, -1.05F, -8.5F, 0.21F, -1.05F, -8.5F, -5.95F, 0F, -8.5F, -5.95F); // Box 138
		bodyModel[90].setRotationPoint(-2F, -1F, 3F);

		bodyModel[91].addShapeBox(0F, 0F, -23F, 12, 1, 8, 0F,0.05F, 10F, -0.27F, -0.5F, 10F, 0.03F, 0.3F, 10F, -6.15F, 0.05F, 10F, -5.95F, 0.05F, -8.5F, 0.21F, -0.7F, -8.5F, 0.51F, 0.3F, -8.5F, -6.15F, 0.05F, -8.5F, -5.95F); // Box 139
		bodyModel[91].setRotationPoint(20F, -1F, 3F);

		bodyModel[92].addShapeBox(0F, 0F, -23F, 23, 1, 8, 0F,0F, 10F, -5.95F, -1.05F, 10F, -5.95F, -1.05F, 10F, -0.27F, 0F, 10F, -0.37F, 0F, -8.5F, -5.95F, -1.05F, -8.5F, -5.95F, -1.05F, -8.5F, 0.21F, 0F, -8.5F, 0.21F); // Box 140
		bodyModel[92].setRotationPoint(-2F, -1F, 35F);

		bodyModel[93].addShapeBox(0F, 0F, -23F, 12, 1, 8, 0F,0.05F, 10F, -5.95F, 0.3F, 10F, -6.15F, -0.5F, 10F, 0.03F, 0.05F, 10F, -0.27F, 0.05F, -8.5F, -5.95F, 0.3F, -8.5F, -6.15F, -0.7F, -8.5F, 0.51F, 0.05F, -8.5F, 0.21F); // Box 141
		bodyModel[93].setRotationPoint(20F, -1F, 35F);

		bodyModel[94].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[94].setRotationPoint(8.5F, -5.55F, -14.5F);

		bodyModel[95].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[95].setRotationPoint(8.5F, -5.55F, -11.5F);

		bodyModel[96].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[96].setRotationPoint(8.5F, -5.55F, -8.5F);

		bodyModel[97].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[97].setRotationPoint(8.5F, -5.55F, -5.5F);

		bodyModel[98].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[98].setRotationPoint(8.5F, -7.55F, -7F);

		bodyModel[99].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[99].setRotationPoint(8.5F, -7.55F, -10F);

		bodyModel[100].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[100].setRotationPoint(8.5F, -7.55F, -13F);

		bodyModel[101].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[101].setRotationPoint(16.5F, -5.55F, 12.5F);

		bodyModel[102].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[102].setRotationPoint(16.5F, -5.55F, 9.5F);

		bodyModel[103].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[103].setRotationPoint(16.5F, -5.55F, 6.5F);

		bodyModel[104].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[104].setRotationPoint(16.5F, -5.55F, 3.5F);

		bodyModel[105].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[105].setRotationPoint(16.5F, -7.55F, 5F);

		bodyModel[106].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[106].setRotationPoint(16.5F, -7.55F, 8F);

		bodyModel[107].addShapeBox(0F, -5F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[107].setRotationPoint(16.5F, -7.55F, 11F);

		bodyModel[108].addShapeBox(0F, 0F, -15F, 4, 6, 30, 0F,0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 1F, -7F, 0F, 1F, -10F, 0F, 1F, -10F, 0F, 1F, -7F); // Box 156
		bodyModel[108].setRotationPoint(-2F, -15F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, -15F, 4, 6, 30, 0F,0F, 0F, -10F, -1F, 0F, -10F, -1F, 0F, -10F, 0F, 0F, -10F, 0F, 1F, -10F, 2F, 1F, -10F, 2F, 1F, -10F, 0F, 1F, -10F); // Box 157
		bodyModel[109].setRotationPoint(2F, -15F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, -0.5F, 21, 5, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 158
		bodyModel[110].setRotationPoint(13F, -12F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 20, 15, 14, 0F,0F, 0F, 1F, -2.6F, 0F, -2F, -2.6F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, -0.8F, 0F, 3F, -0.8F, 0F, 3F, 0F, 0F, 3F); // Box 159
		bodyModel[111].setRotationPoint(-26F, -30F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 10, 15, 14, 0F,-4F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 160
		bodyModel[112].setRotationPoint(-36F, -30F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 20, 2, 14, 0F,0F, 0F, 1F, -2.6F, 0F, -2F, -2.6F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, -2.6F, 0F, -2F, -2.6F, 0F, -2F, 0F, 0F, 1F); // Box 161
		bodyModel[113].setRotationPoint(-26F, -32F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 11, 2, 14, 0F,-4.6F, 0F, -0.2F, 0F, 0F, 1F, 0F, 0F, 1F, -4.6F, 0F, -0.2F, -4.6F, 0F, -0.2F, 0F, 0F, 1F, 0F, 0F, 1F, -4.6F, 0F, -0.2F); // Box 162
		bodyModel[114].setRotationPoint(-37F, -32F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[115].setRotationPoint(-29F, -32.6F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 93
		bodyModel[116].setRotationPoint(-32F, -32.6F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 166
		bodyModel[117].setRotationPoint(-32F, -32.6F, -4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 167
		bodyModel[118].setRotationPoint(-29F, -32.6F, -4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 168
		bodyModel[119].setRotationPoint(-29F, -32.6F, 4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 169
		bodyModel[120].setRotationPoint(-32F, -32.6F, 4F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 170
		bodyModel[121].setRotationPoint(-32F, -32.6F, 1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[122].setRotationPoint(-29F, -32.6F, 1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, -2F, 0.4F, 4F, -2F, -0.6F, 4F, -2F, -0.6F, 0F, -2F, 0.4F, 4F, 0F, 4.75F, 5F, 0F, 3F, 5F, 0F, 3F, 4F, 0F, 4.75F); // Box 172
		bodyModel[123].setRotationPoint(-14.6F, -41F, -2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0.4F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1.8F, 0F, -0.4F, -1.8F, 0.4F); // Box 174
		bodyModel[124].setRotationPoint(-14.5F, -39F, -0.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F); // Box 175
		bodyModel[125].setRotationPoint(34F, -45F, 3.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,-0.4F, 0F, 0.4F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.4F, -1.8F, 0.4F, -1F, -1.8F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 176
		bodyModel[126].setRotationPoint(-14.5F, -39F, -11.5F);

		bodyModel[127].addShapeBox(0F, 0F, -15F, 3, 5, 22, 0F,0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, -1.4F, 2F, 0F, -1.4F, -4F, 0F, -1.4F, -4F, 0F, -1.4F, 2F); // Box 177
		bodyModel[127].setRotationPoint(-48F, -20.5F, 4F);

		bodyModel[128].addShapeBox(0F, 0F, -15F, 55, 4, 22, 0F,-0.55F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.55F, 0F, 1F, -0.2F, -0.4F, 2F, 0F, -0.4F, 2F, 0F, -0.4F, 2F, -0.2F, -0.4F, 2F); // Box 179
		bodyModel[128].setRotationPoint(-103F, -20.5F, 4F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 180
		bodyModel[129].setRotationPoint(61F, -22.2F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[130].setRotationPoint(61F, -22.2F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[131].setRotationPoint(69F, -22.2F, -8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 183
		bodyModel[132].setRotationPoint(69F, -22.2F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 184
		bodyModel[133].setRotationPoint(-29F, -15.6F, 11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 185
		bodyModel[134].setRotationPoint(-29F, -15.6F, 14F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[135].setRotationPoint(-26F, -15.6F, 11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 187
		bodyModel[136].setRotationPoint(-26F, -15.6F, 14F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[137].setRotationPoint(-26F, -15.6F, -17F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 189
		bodyModel[138].setRotationPoint(-26F, -15.6F, -14F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 190
		bodyModel[139].setRotationPoint(-29F, -15.6F, -14F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 191
		bodyModel[140].setRotationPoint(-29F, -15.6F, -17F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,5F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 1F, 5F, 0F, 1F, 4F, 0F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, -0.6F, 4F, 0F, -0.6F); // Box 192
		bodyModel[141].setRotationPoint(37F, -53F, -4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 193
		bodyModel[142].setRotationPoint(34F, -45F, -9.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,3F, 0F, 14.4F, -1F, 0F, 14.4F, 3F, 0F, -9F, 5F, 0F, -9F, 5F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, -8F, 5F, 0F, -8F); // Box 194
		bodyModel[143].setRotationPoint(37F, -56F, -4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,5F, -3F, 1F, 3F, -3F, 1F, 3F, -3F, 1F, 5F, -3F, 1F, 5F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 1F, 5F, 0F, 1F); // Box 198
		bodyModel[144].setRotationPoint(37F, -59F, -4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,5F, -3F, 1F, 0.6F, -3F, -1F, 0.6F, -3F, -1F, 5F, -3F, 1F, 5F, 0F, 0F, -2F, -0.9F, -2.2F, -2F, -0.9F, -2.2F, 5F, 0F, 0F); // Box 199
		bodyModel[145].setRotationPoint(46F, -59F, -4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0.6F, -3F, -1F, 5F, -3F, 1F, 5F, -3F, 1F, 0.6F, -3F, -1F, -2F, -0.9F, -2.2F, 5F, 0F, 0F, 5F, 0F, 0F, -2F, -0.9F, -2.2F); // Box 200
		bodyModel[146].setRotationPoint(26F, -59F, -4F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,5F, 0F, -9F, 3F, 0F, -9F, -1F, 0F, 14.4F, 3F, 0F, 14.4F, 5F, 0F, -8F, 3F, 0F, -8F, 3F, 0F, 1F, 5F, 0F, 1F); // Box 201
		bodyModel[147].setRotationPoint(37F, -56F, -4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 203
		bodyModel[148].setRotationPoint(27F, -68F, -5.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F); // Box 204
		bodyModel[149].setRotationPoint(27F, -68F, 0.5F);

		bodyModel[150].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 205
		bodyModel[150].setRotationPoint(27.5F, -68.5F, -5.5F);

		bodyModel[151].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 206
		bodyModel[151].setRotationPoint(27.5F, -68.5F, -4.5F);

		bodyModel[152].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 207
		bodyModel[152].setRotationPoint(27.5F, -68.5F, 4.5F);

		bodyModel[153].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 208
		bodyModel[153].setRotationPoint(27.5F, -68.5F, 3.5F);

		bodyModel[154].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 209
		bodyModel[154].setRotationPoint(27.5F, -68.5F, 2.5F);

		bodyModel[155].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 210
		bodyModel[155].setRotationPoint(27.5F, -68.5F, -3.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F); // Box 211
		bodyModel[156].setRotationPoint(39F, -42.5F, -1.5F);

		bodyModel[157].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 212
		bodyModel[157].setRotationPoint(36.5F, -57.5F, -7.5F);

		bodyModel[158].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 213
		bodyModel[158].setRotationPoint(36.5F, -57.5F, -12.5F);

		bodyModel[159].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 214
		bodyModel[159].setRotationPoint(36.5F, -57.5F, 6.5F);

		bodyModel[160].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 215
		bodyModel[160].setRotationPoint(36.5F, -57.5F, 11.5F);

		bodyModel[161].addShapeBox(-0.5F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 216
		bodyModel[161].setRotationPoint(35.5F, -60F, 14.5F);

		bodyModel[162].addShapeBox(-0.5F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 217
		bodyModel[162].setRotationPoint(35.5F, -59F, 16.5F);

		bodyModel[163].addShapeBox(-0.5F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 218
		bodyModel[163].setRotationPoint(35.5F, -59F, -17.5F);

		bodyModel[164].addShapeBox(-0.5F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 219
		bodyModel[164].setRotationPoint(35.5F, -60F, -15.5F);

		bodyModel[165].addShapeBox(0F, 0F, -0.5F, 1, 4, 1, 0F,-0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Box 222
		bodyModel[165].setRotationPoint(34.65F, -62.5F, -17F);
		bodyModel[165].rotateAngleZ = 0.10471976F;

		bodyModel[166].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,-0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, -1.35F, -0.2F, -0.4F, -1.35F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F); // Box 225
		bodyModel[166].setRotationPoint(35F, -54.5F, -17F);
		bodyModel[166].rotateAngleZ = 0.10471976F;

		bodyModel[167].addShapeBox(0F, 0F, -0.5F, 1, 4, 1, 0F,-0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Box 232
		bodyModel[167].setRotationPoint(34.65F, -62.5F, 17F);
		bodyModel[167].rotateAngleZ = 0.10471976F;

		bodyModel[168].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,-0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, -1.35F, -0.2F, -0.4F, -1.35F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F); // Box 233
		bodyModel[168].setRotationPoint(35F, -54.5F, 17F);
		bodyModel[168].rotateAngleZ = 0.10471976F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F); // Box 234
		bodyModel[169].setRotationPoint(36F, -66F, -0.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0.95F, 0F, 0.95F, 0.95F, 0F, 0.95F, 0.95F, 0F, 0.95F, 0.95F, 0F, 0.95F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 235
		bodyModel[170].setRotationPoint(36F, -67F, -0.5F);

		bodyModel[171].addShapeBox(0F, -13F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[171].setRotationPoint(33.5F, -53F, -1F);

		bodyModel[172].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 238
		bodyModel[172].setRotationPoint(-13F, -41.5F, -6.5F);

		bodyModel[173].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 239
		bodyModel[173].setRotationPoint(-13F, -41.5F, 5.5F);

		bodyModel[174].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 240
		bodyModel[174].setRotationPoint(-13F, -40.5F, -8.5F);

		bodyModel[175].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 241
		bodyModel[175].setRotationPoint(-13F, -40.5F, 7.5F);

		bodyModel[176].addShapeBox(0F, 0F, -23F, 3, 14, 29, 0F,-2.2F, 10F, -6.45F, 0F, 10F, -6.45F, 0F, 10F, -6.45F, -2.2F, 10F, -6.45F, 0F, -0.1F, -3.53F, 0F, -0.1F, -4.08F, 0F, -0.1F, -4.08F, 0F, -0.1F, -3.53F); // Box 242
		bodyModel[176].setRotationPoint(-105.5F, -9.9F, 8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 244
		bodyModel[177].setRotationPoint(-163F, 2F, -0.5F);

		bodyModel[178].addShapeBox(0F, 0F, -0.5F, 1, 29, 1, 0F,-0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Box 245
		bodyModel[178].setRotationPoint(28.65F, -54.5F, 0F);
		bodyModel[178].rotateAngleZ = 0.10471976F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F); // Box 249
		bodyModel[179].setRotationPoint(-11F, -43F, -0.5F);

		bodyModel[180].addShapeBox(-0.5F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 254
		bodyModel[180].setRotationPoint(-13F, -40.5F, 10.5F);

		bodyModel[181].addShapeBox(-0.5F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 255
		bodyModel[181].setRotationPoint(-13F, -40.5F, -11.5F);

		bodyModel[182].addBox(0F, -4F, 0F, 3, 1, 1, 0F); // Box 259
		bodyModel[182].setRotationPoint(-14.5F, -38F, -11.5F);

		bodyModel[183].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 261
		bodyModel[183].setRotationPoint(47F, -22.5F, 12.5F);

		bodyModel[184].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 262
		bodyModel[184].setRotationPoint(47F, -22.5F, -11.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F); // Box 269
		bodyModel[185].setRotationPoint(-76.3F, -23F, -0.5F);

		bodyModel[186].addBox(0F, -4F, 0F, 12, 4, 4, 0F); // Box 271
		bodyModel[186].setRotationPoint(-82F, -27F, -2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[187].setRotationPoint(-133F, 17F, -6.5F);

		bodyModel[188].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[188].setRotationPoint(-78F, -27F, -6F);

		bodyModel[189].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[189].setRotationPoint(-78F, -31F, -2F);

		bodyModel[190].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[190].setRotationPoint(-78F, -31F, -6F);

		bodyModel[191].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, -1.33F, -1.33F, -2F, -2F, -2F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[191].setRotationPoint(-74F, -31F, -6F);

		bodyModel[192].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[192].setRotationPoint(-74F, -31F, -2F);

		bodyModel[193].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[193].setRotationPoint(-74F, -27F, -6F);

		bodyModel[194].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,-1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[194].setRotationPoint(-82F, -27F, -6F);

		bodyModel[195].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,-1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[195].setRotationPoint(-82F, -31F, -2F);

		bodyModel[196].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,-2F, -2F, -2F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[196].setRotationPoint(-82F, -31F, -6F);

		bodyModel[197].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[197].setRotationPoint(-78F, -23F, -2F);

		bodyModel[198].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[198].setRotationPoint(-74F, -23F, -2F);

		bodyModel[199].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F); // Box 225
		bodyModel[199].setRotationPoint(-82F, -23F, -2F);

		bodyModel[200].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[200].setRotationPoint(-78F, -23F, -6F);

		bodyModel[201].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,-1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -2F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, -1.33F, -1.33F, 0F); // Box 227
		bodyModel[201].setRotationPoint(-82F, -23F, -6F);

		bodyModel[202].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, -2F, -2F, -2F, -1.33F, -1.33F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[202].setRotationPoint(-74F, -23F, -6F);

		bodyModel[203].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[203].setRotationPoint(-78F, -27F, 2F);

		bodyModel[204].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[204].setRotationPoint(-78F, -31F, 2F);

		bodyModel[205].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -1.33F, -1.33F, 0F, -2F, -2F, -2F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F); // Box 231
		bodyModel[205].setRotationPoint(-74F, -31F, 2F);

		bodyModel[206].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F); // Box 232
		bodyModel[206].setRotationPoint(-74F, -27F, 2F);

		bodyModel[207].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F); // Box 233
		bodyModel[207].setRotationPoint(-82F, -27F, 2F);

		bodyModel[208].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,-1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, -2F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F); // Box 234
		bodyModel[208].setRotationPoint(-82F, -31F, 2F);

		bodyModel[209].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F); // Box 235
		bodyModel[209].setRotationPoint(-78F, -23F, 2F);

		bodyModel[210].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, -2F, -2F, -2F); // Box 236
		bodyModel[210].setRotationPoint(-82F, -23F, 2F);

		bodyModel[211].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -2F, -2F, -2F, 0F, -1.33F, -1.33F); // Box 237
		bodyModel[211].setRotationPoint(-74F, -23F, 2F);

		bodyModel[212].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, -2F, -2F, -2F); // Box 238
		bodyModel[212].setRotationPoint(-16.5F, -42F, 2F);

		bodyModel[213].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F); // Box 239
		bodyModel[213].setRotationPoint(-12.5F, -42F, 2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F); // Box 240
		bodyModel[214].setRotationPoint(-16.5F, -46F, -2F);

		bodyModel[215].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[215].setRotationPoint(-12.5F, -42F, -2F);

		bodyModel[216].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,-1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -2F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, -1.33F, -1.33F, 0F); // Box 242
		bodyModel[216].setRotationPoint(-16.5F, -42F, -6F);

		bodyModel[217].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[217].setRotationPoint(-12.5F, -42F, -6F);

		bodyModel[218].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, -2F, -2F, -2F, -1.33F, -1.33F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[218].setRotationPoint(-8.5F, -42F, -6F);

		bodyModel[219].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[219].setRotationPoint(-8.5F, -42F, -2F);

		bodyModel[220].addBox(0F, -4F, 0F, 12, 4, 4, 0F); // Box 246
		bodyModel[220].setRotationPoint(-16.5F, -46F, -2F);

		bodyModel[221].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F); // Box 247
		bodyModel[221].setRotationPoint(-8.5F, -46F, 2F);

		bodyModel[222].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[222].setRotationPoint(-8.5F, -46F, -6F);

		bodyModel[223].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[223].setRotationPoint(-12.5F, -46F, -6F);

		bodyModel[224].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,-1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[224].setRotationPoint(-16.5F, -46F, -6F);

		bodyModel[225].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F); // Box 251
		bodyModel[225].setRotationPoint(-16.5F, -46F, 2F);

		bodyModel[226].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,-1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, -2F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F); // Box 252
		bodyModel[226].setRotationPoint(-16.5F, -50F, 2F);

		bodyModel[227].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,-1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[227].setRotationPoint(-16.5F, -50F, -2F);

		bodyModel[228].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,-2F, -2F, -2F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[228].setRotationPoint(-16.5F, -50F, -6F);

		bodyModel[229].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[229].setRotationPoint(-12.5F, -50F, -2F);

		bodyModel[230].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[230].setRotationPoint(-12.5F, -50F, 2F);

		bodyModel[231].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -1.33F, -1.33F, 0F, -2F, -2F, -2F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F); // Box 257
		bodyModel[231].setRotationPoint(-8.5F, -50F, 2F);

		bodyModel[232].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[232].setRotationPoint(-12.5F, -50F, -6F);

		bodyModel[233].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, -1.33F, -1.33F, -2F, -2F, -2F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[233].setRotationPoint(-8.5F, -50F, -6F);

		bodyModel[234].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[234].setRotationPoint(-8.5F, -50F, -2F);

		bodyModel[235].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -2F, -2F, -2F, 0F, -1.33F, -1.33F); // Box 261
		bodyModel[235].setRotationPoint(-8.5F, -42F, 2F);

		bodyModel[236].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 263
		bodyModel[236].setRotationPoint(-13.5F, -39F, -11.5F);

		bodyModel[237].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 264
		bodyModel[237].setRotationPoint(-13.5F, -37F, -11.5F);

		bodyModel[238].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 265
		bodyModel[238].setRotationPoint(-13.5F, -38F, -12.5F);

		bodyModel[239].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 266
		bodyModel[239].setRotationPoint(-13.5F, -38F, -10.5F);

		bodyModel[240].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[240].setRotationPoint(-14.5F, -38F, -12.5F);

		bodyModel[241].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[241].setRotationPoint(-12.5F, -38F, -12.5F);

		bodyModel[242].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[242].setRotationPoint(-13.5F, -39F, -12.5F);

		bodyModel[243].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[243].setRotationPoint(-12.5F, -39F, -11.5F);

		bodyModel[244].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[244].setRotationPoint(-12.5F, -39F, -12.5F);

		bodyModel[245].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[245].setRotationPoint(-14.5F, -39F, -12.5F);

		bodyModel[246].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[246].setRotationPoint(-14.5F, -39F, -11.5F);

		bodyModel[247].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F); // Box 274
		bodyModel[247].setRotationPoint(-14.5F, -37F, -11.5F);

		bodyModel[248].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, -0.33F, -0.33F, 0F); // Box 275
		bodyModel[248].setRotationPoint(-14.5F, -37F, -12.5F);

		bodyModel[249].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[249].setRotationPoint(-13.5F, -37F, -12.5F);

		bodyModel[250].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[250].setRotationPoint(-12.5F, -37F, -11.5F);

		bodyModel[251].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, -0.33F, -0.33F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[251].setRotationPoint(-12.5F, -37F, -12.5F);

		bodyModel[252].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F); // Box 279
		bodyModel[252].setRotationPoint(-14.5F, -37F, -10.5F);

		bodyModel[253].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F); // Box 280
		bodyModel[253].setRotationPoint(-13.5F, -37F, -10.5F);

		bodyModel[254].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F); // Box 281
		bodyModel[254].setRotationPoint(-12.5F, -37F, -10.5F);

		bodyModel[255].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F); // Box 282
		bodyModel[255].setRotationPoint(-12.5F, -38F, -10.5F);

		bodyModel[256].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[256].setRotationPoint(-13.5F, -39F, -10.5F);

		bodyModel[257].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F); // Box 284
		bodyModel[257].setRotationPoint(-12.5F, -39F, -10.5F);

		bodyModel[258].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F); // Box 285
		bodyModel[258].setRotationPoint(-14.5F, -39F, -10.5F);

		bodyModel[259].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F); // Box 286
		bodyModel[259].setRotationPoint(-14.5F, -38F, -10.5F);

		bodyModel[260].addBox(0F, -4F, 0F, 3, 1, 1, 0F); // Box 287
		bodyModel[260].setRotationPoint(-14.5F, -38F, 10.5F);

		bodyModel[261].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 288
		bodyModel[261].setRotationPoint(-13.5F, -39F, 10.5F);

		bodyModel[262].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 289
		bodyModel[262].setRotationPoint(-13.5F, -37F, 10.5F);

		bodyModel[263].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 290
		bodyModel[263].setRotationPoint(-13.5F, -38F, 11.5F);

		bodyModel[264].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F); // Box 291
		bodyModel[264].setRotationPoint(-14.5F, -38F, 11.5F);

		bodyModel[265].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F); // Box 292
		bodyModel[265].setRotationPoint(-12.5F, -38F, 11.5F);

		bodyModel[266].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[266].setRotationPoint(-13.5F, -39F, 11.5F);

		bodyModel[267].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[267].setRotationPoint(-12.5F, -39F, 10.5F);

		bodyModel[268].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F); // Box 295
		bodyModel[268].setRotationPoint(-12.5F, -39F, 11.5F);

		bodyModel[269].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F); // Box 296
		bodyModel[269].setRotationPoint(-14.5F, -39F, 11.5F);

		bodyModel[270].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[270].setRotationPoint(-14.5F, -39F, 10.5F);

		bodyModel[271].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F); // Box 298
		bodyModel[271].setRotationPoint(-14.5F, -37F, 10.5F);

		bodyModel[272].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F); // Box 299
		bodyModel[272].setRotationPoint(-14.5F, -37F, 11.5F);

		bodyModel[273].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F); // Box 300
		bodyModel[273].setRotationPoint(-13.5F, -37F, 11.5F);

		bodyModel[274].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[274].setRotationPoint(-12.5F, -37F, 10.5F);

		bodyModel[275].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F); // Box 302
		bodyModel[275].setRotationPoint(-12.5F, -37F, 11.5F);

		bodyModel[276].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, -0.33F, -0.33F, 0F); // Box 303
		bodyModel[276].setRotationPoint(-14.5F, -37F, 9.5F);

		bodyModel[277].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[277].setRotationPoint(-13.5F, -37F, 9.5F);

		bodyModel[278].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, -0.33F, -0.33F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[278].setRotationPoint(-12.5F, -37F, 9.5F);

		bodyModel[279].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[279].setRotationPoint(-12.5F, -38F, 9.5F);

		bodyModel[280].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[280].setRotationPoint(-13.5F, -39F, 9.5F);

		bodyModel[281].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[281].setRotationPoint(-12.5F, -39F, 9.5F);

		bodyModel[282].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[282].setRotationPoint(-14.5F, -39F, 9.5F);

		bodyModel[283].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[283].setRotationPoint(-14.5F, -38F, 9.5F);

		bodyModel[284].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 311
		bodyModel[284].setRotationPoint(46.5F, -20F, -12.5F);

		bodyModel[285].addBox(0F, -4F, 0F, 3, 1, 1, 0F); // Box 312
		bodyModel[285].setRotationPoint(45.5F, -20F, -11.5F);

		bodyModel[286].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 313
		bodyModel[286].setRotationPoint(46.5F, -20F, -10.5F);

		bodyModel[287].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 314
		bodyModel[287].setRotationPoint(46.5F, -21F, -11.5F);

		bodyModel[288].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[288].setRotationPoint(45.5F, -21F, -11.5F);

		bodyModel[289].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F); // Box 316
		bodyModel[289].setRotationPoint(45.5F, -21F, -10.5F);

		bodyModel[290].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[290].setRotationPoint(46.5F, -21F, -10.5F);

		bodyModel[291].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F); // Box 318
		bodyModel[291].setRotationPoint(47.5F, -21F, -10.5F);

		bodyModel[292].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[292].setRotationPoint(47.5F, -21F, -11.5F);

		bodyModel[293].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[293].setRotationPoint(47.5F, -21F, -12.5F);

		bodyModel[294].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[294].setRotationPoint(46.5F, -21F, -12.5F);

		bodyModel[295].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[295].setRotationPoint(45.5F, -21F, -12.5F);

		bodyModel[296].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F); // Box 323
		bodyModel[296].setRotationPoint(45.5F, -20F, -10.5F);

		bodyModel[297].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[297].setRotationPoint(45.5F, -20F, -12.5F);

		bodyModel[298].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[298].setRotationPoint(47.5F, -20F, -12.5F);

		bodyModel[299].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F); // Box 326
		bodyModel[299].setRotationPoint(47.5F, -20F, -10.5F);

		bodyModel[300].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F); // Box 327
		bodyModel[300].setRotationPoint(47.5F, -19F, -10.5F);

		bodyModel[301].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[301].setRotationPoint(47.5F, -19F, -11.5F);

		bodyModel[302].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F); // Box 329
		bodyModel[302].setRotationPoint(46.5F, -19F, -10.5F);

		bodyModel[303].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, -0.33F, -0.33F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[303].setRotationPoint(47.5F, -19F, -12.5F);

		bodyModel[304].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[304].setRotationPoint(46.5F, -19F, -12.5F);

		bodyModel[305].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, -0.33F, -0.33F, 0F); // Box 332
		bodyModel[305].setRotationPoint(45.5F, -19F, -12.5F);

		bodyModel[306].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F); // Box 333
		bodyModel[306].setRotationPoint(45.5F, -19F, -11.5F);

		bodyModel[307].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F); // Box 334
		bodyModel[307].setRotationPoint(45.5F, -19F, -10.5F);

		bodyModel[308].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 335
		bodyModel[308].setRotationPoint(46.5F, -19F, -11.5F);

		bodyModel[309].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 336
		bodyModel[309].setRotationPoint(46.5F, -20F, 13.5F);

		bodyModel[310].addBox(0F, -4F, 0F, 3, 1, 1, 0F); // Box 337
		bodyModel[310].setRotationPoint(45.5F, -20F, 12.5F);

		bodyModel[311].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 338
		bodyModel[311].setRotationPoint(46.5F, -20F, 11.5F);

		bodyModel[312].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 339
		bodyModel[312].setRotationPoint(46.5F, -21F, 12.5F);

		bodyModel[313].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[313].setRotationPoint(45.5F, -21F, 12.5F);

		bodyModel[314].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[314].setRotationPoint(45.5F, -21F, 11.5F);

		bodyModel[315].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[315].setRotationPoint(46.5F, -21F, 11.5F);

		bodyModel[316].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[316].setRotationPoint(47.5F, -21F, 11.5F);

		bodyModel[317].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[317].setRotationPoint(47.5F, -21F, 12.5F);

		bodyModel[318].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F); // Box 345
		bodyModel[318].setRotationPoint(47.5F, -21F, 13.5F);

		bodyModel[319].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[319].setRotationPoint(46.5F, -21F, 13.5F);

		bodyModel[320].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F); // Box 347
		bodyModel[320].setRotationPoint(45.5F, -21F, 13.5F);

		bodyModel[321].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[321].setRotationPoint(45.5F, -20F, 11.5F);

		bodyModel[322].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F); // Box 349
		bodyModel[322].setRotationPoint(45.5F, -20F, 13.5F);

		bodyModel[323].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F); // Box 350
		bodyModel[323].setRotationPoint(47.5F, -20F, 13.5F);

		bodyModel[324].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[324].setRotationPoint(47.5F, -20F, 11.5F);

		bodyModel[325].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F, -0.33F, -0.33F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[325].setRotationPoint(47.5F, -19F, 11.5F);

		bodyModel[326].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[326].setRotationPoint(47.5F, -19F, 12.5F);

		bodyModel[327].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[327].setRotationPoint(46.5F, -19F, 11.5F);

		bodyModel[328].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F); // Box 355
		bodyModel[328].setRotationPoint(47.5F, -19F, 13.5F);

		bodyModel[329].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, -0.33F, -0.33F); // Box 356
		bodyModel[329].setRotationPoint(46.5F, -19F, 13.5F);

		bodyModel[330].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, 0F, -0.33F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, -0.5F, -0.5F, -0.5F); // Box 357
		bodyModel[330].setRotationPoint(45.5F, -19F, 13.5F);

		bodyModel[331].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.33F, -0.33F, 0F); // Box 358
		bodyModel[331].setRotationPoint(45.5F, -19F, 12.5F);

		bodyModel[332].addShapeBox(0F, -4F, 0F, 1, 1, 1, 0F,-0.33F, 0F, -0.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.33F, -0.33F, 0F, 0F, 0F, -0.33F, -0.33F, 0F); // Box 359
		bodyModel[332].setRotationPoint(45.5F, -19F, 11.5F);

		bodyModel[333].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 360
		bodyModel[333].setRotationPoint(46.5F, -19F, 12.5F);

		bodyModel[334].addShapeBox(0F, -4F, 0F, 4, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[334].setRotationPoint(67F, -30F, -2F);

		bodyModel[335].addShapeBox(0F, -5F, 0F, 4, 12, 4, 0F,0F, 0F, 0F, -1.33F, -1.33F, 0F, -2F, -2F, -2F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F); // Box 344
		bodyModel[335].setRotationPoint(71F, -29F, 2F);

		bodyModel[336].addShapeBox(0F, -4F, 0F, 4, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[336].setRotationPoint(67F, -30F, 2F);

		bodyModel[337].addShapeBox(0F, -4F, 0F, 4, 12, 4, 0F,-1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[337].setRotationPoint(63F, -30F, -2F);

		bodyModel[338].addShapeBox(0F, -4F, 0F, 4, 12, 4, 0F,-2F, -2F, -2F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[338].setRotationPoint(63F, -30F, -6F);

		bodyModel[339].addShapeBox(0F, -4F, 8F, 4, 12, 4, 0F,-1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, -1.33F, -1.33F, -2F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F); // Box 348
		bodyModel[339].setRotationPoint(63F, -30F, -6F);

		bodyModel[340].addShapeBox(0F, -4F, 0F, 4, 12, 4, 0F,0F, 0F, 0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[340].setRotationPoint(71F, -30F, -2F);

		bodyModel[341].addShapeBox(0F, -5F, 0F, 4, 12, 4, 0F,0F, -1.33F, -1.33F, -2F, -2F, -2F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.33F, 0F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[341].setRotationPoint(71F, -29F, -6F);

		bodyModel[342].addShapeBox(0F, -4F, 0F, 4, 12, 4, 0F,0F, -1.33F, -1.33F, 0F, -1.33F, -1.33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[342].setRotationPoint(67F, -30F, -6F);

		bodyModel[343].addShapeBox(0F, -4F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[343].setRotationPoint(-12.5F, -46F, 2F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-80.7F, 19.7F, -0.3F, 80.7F, 19.4F, -0.3F, 80.7F, 19.4F, -0.3F, -80.7F, 19.7F, -0.3F, -35.3F, -20.6F, -0.3F, 34.7F, -20.8F, -0.3F, 34.7F, -20.8F, -0.3F, -35.3F, -20.6F, -0.3F); // Box 351
		bodyModel[344].setRotationPoint(-112.6F, -10F, -0.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,148.7F, 43.4F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, 148.7F, 43.4F, -0.3F, -0.3F, -10F, -0.3F, -0.3F, -10F, -0.3F, -0.3F, -10F, -0.3F, -0.3F, -10F, -0.3F); // Box 353
		bodyModel[345].setRotationPoint(190.4F, -12F, -0.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-70.7F, 23.3F, -0.3F, 70.7F, 23.3F, -0.3F, 70.7F, 23.3F, -0.3F, -70.7F, 23.3F, -0.3F, -10.3F, -10F, -0.3F, 9.7F, -10F, -0.3F, 9.7F, -10F, -0.3F, -10.3F, -10F, -0.3F); // Box 355
		bodyModel[346].setRotationPoint(-173F, 2F, -0.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0.1F, -0.3F, 42.7F, 20.4F, -0.3F, 42.7F, 20.4F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, -10F, -0.3F, -0.3F, -10F, -0.3F, -0.3F, -10F, -0.3F, -0.3F, -10F, -0.3F); // Box 356
		bodyModel[347].setRotationPoint(-16.6F, -35F, -0.5F);

		bodyModel[348].addBox(0F, -4F, 0F, 1, 1, 1, 0F); // Box 353
		bodyModel[348].setRotationPoint(-13.5F, -38F, 9.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 354
		bodyModel[349].setRotationPoint(30F, -36.5F, -2F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 355
		bodyModel[350].setRotationPoint(-22F, -32.6F, -4F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[351].setRotationPoint(-22F, -32.6F, -7F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 357
		bodyModel[352].setRotationPoint(-25F, -32.6F, -4F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 358
		bodyModel[353].setRotationPoint(-25F, -32.6F, -7F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[354].setRotationPoint(-22F, -32.6F, 1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 360
		bodyModel[355].setRotationPoint(-22F, -32.6F, 4F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 361
		bodyModel[356].setRotationPoint(-25F, -32.6F, 4F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 362
		bodyModel[357].setRotationPoint(-25F, -32.6F, 1F);

		bodyModel[358].addShapeBox(0F, 0F, -15F, 4, 3, 17, 0F,0.2F, 0F, -8.2F, -3.8F, 0F, -8.2F, -3.8F, 0F, -8.6F, 0F, 0F, -8.6F, 0F, 0.9F, -7.3F, 0F, 0.75F, -7.7F, 0F, 0.75F, -8.6F, 0F, 1F, -8.6F); // Box 363
		bodyModel[358].setRotationPoint(81F, -1.5F, -14F);

		bodyModel[359].addShapeBox(0F, 0F, -15F, 4, 3, 17, 0F,0F, 0F, -8.6F, -3.8F, 0F, -8.6F, -3.8F, 0F, -8.2F, 0.2F, 0F, -8.2F, 0F, 1F, -8.6F, 0F, 0.75F, -8.6F, 0F, 0.75F, -7.7F, 0F, 0.9F, -7.3F); // Box 365
		bodyModel[359].setRotationPoint(81F, -1.5F, 27F);

		bodyModel[360].addShapeBox(0F, 0F, -15F, 4, 3, 17, 0F,-3.8F, 0F, -8.6F, 0.4F, 0F, -8.6F, 0.4F, 0F, -7.9F, -3.8F, 0F, -8F, 0F, 0.75F, -8.85F, 0F, 0.9F, -8.95F, 0F, 0.8F, -7.3F, 0F, 0.8F, -7.6F); // Box 366
		bodyModel[360].setRotationPoint(-109F, 0.199999999999999F, 24.8F);

		bodyModel[361].addShapeBox(0F, 0F, -15F, 4, 3, 17, 0F,-3.8F, 0F, -8F, 0.4F, 0F, -7.9F, 0.4F, 0F, -8.6F, -3.8F, 0F, -8.6F, 0F, 0.8F, -7.6F, 0F, 0.8F, -7.3F, 0F, 0.9F, -8.95F, 0F, 0.75F, -8.85F); // Box 367
		bodyModel[361].setRotationPoint(-109F, 0.199999999999999F, -11.8F);

		bodyModel[362].addShapeBox(0F, 0F, -0.5F, 1, 13, 1, 0F,-0.4F, 32.8F, -0.4F, -0.4F, 32.8F, -0.4F, -0.4F, 32.8F, -0.4F, -0.4F, 32.8F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Box 368
		bodyModel[362].setRotationPoint(-46.35F, -29.5F, 16F);
		bodyModel[362].rotateAngleZ = 0.10471976F;

		bodyModel[363].addShapeBox(0F, 0F, -0.5F, 1, 13, 1, 0F,-0.4F, 30.8F, -0.4F, -0.4F, 30.8F, -0.4F, -0.4F, 30.8F, -0.4F, -0.4F, 30.8F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Box 369
		bodyModel[363].setRotationPoint(-101.35F, -29.5F, 15F);
		bodyModel[363].rotateAngleZ = 0.10471976F;

		bodyModel[364].addShapeBox(0F, 0F, -0.5F, 1, 13, 1, 0F,-0.4F, 30.8F, -0.4F, -0.4F, 30.8F, -0.4F, -0.4F, 30.8F, -0.4F, -0.4F, 30.8F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Box 370
		bodyModel[364].setRotationPoint(-101.35F, -29.5F, -15F);
		bodyModel[364].rotateAngleZ = 0.10471976F;

		bodyModel[365].addShapeBox(0F, 0F, -0.5F, 1, 13, 1, 0F,-0.4F, 32.8F, -0.4F, -0.4F, 32.8F, -0.4F, -0.4F, 32.8F, -0.4F, -0.4F, 32.8F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Box 371
		bodyModel[365].setRotationPoint(-46.35F, -29.5F, -16F);
		bodyModel[365].rotateAngleZ = 0.10471976F;

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, -2.55F, 0F, 0F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[366].setRotationPoint(86F, -20F, -13F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, -2.55F, 0F, 0F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[367].setRotationPoint(86F, -20F, -8.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, -2.55F, 0F, 0F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[368].setRotationPoint(86F, -20F, -4F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, -2.55F, 0F, 0F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[369].setRotationPoint(86F, -20F, 11F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, -2.55F, 0F, 0F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[370].setRotationPoint(86F, -20F, 6.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, -2.55F, 0F, 0F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[371].setRotationPoint(86F, -20F, 2F);

		bodyModel[372].addShapeBox(-0.5F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 389
		bodyModel[372].setRotationPoint(66.5F, -24F, -12.5F);

		bodyModel[373].addShapeBox(-0.5F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 390
		bodyModel[373].setRotationPoint(66.5F, -24F, 11.5F);

		bodyModel[374].addShapeBox(-0.5F, -2F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 391
		bodyModel[374].setRotationPoint(36F, -46F, 7.5F);

		bodyModel[375].addShapeBox(-0.5F, -2F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 392
		bodyModel[375].setRotationPoint(36F, -45F, 4.5F);

		bodyModel[376].addShapeBox(-0.5F, -2F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 393
		bodyModel[376].setRotationPoint(36F, -46F, -8.5F);

		bodyModel[377].addShapeBox(-0.5F, -2F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 394
		bodyModel[377].setRotationPoint(36F, -45F, 6F);

		bodyModel[378].addShapeBox(-0.5F, -2F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 395
		bodyModel[378].setRotationPoint(36F, -45F, -7F);

		bodyModel[379].addShapeBox(-0.5F, -2F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 396
		bodyModel[379].setRotationPoint(36F, -45F, -5.5F);

		bodyModel[380].addShapeBox(-0.5F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 397
		bodyModel[380].setRotationPoint(80.5F, -24F, -9.5F);

		bodyModel[381].addShapeBox(-0.5F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 398
		bodyModel[381].setRotationPoint(80.5F, -24F, 7.5F);

		bodyModel[382].addShapeBox(-0.5F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 399
		bodyModel[382].setRotationPoint(-17.5F, -18F, -16.5F);

		bodyModel[383].addShapeBox(-0.5F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 400
		bodyModel[383].setRotationPoint(-17.5F, -18F, 16.5F);

		bodyModel[384].addShapeBox(0F, -9F, 0F, 1, 120, 160, 0F,0F, -66F, -89F, 0F, -66F, -89F, 0F, -65F, -89F, 0F, -65F, -89F, 0F, -66F, -89F, 0F, -66F, -89F, 0F, -67F, -89F, 0F, -67F, -89F); // Box 390
		bodyModel[384].setRotationPoint(33F, -114F, -80F);

		bodyModel[385].addBox(0F, 0F, -13.5F, 48, 10, 27, 0F); // Box 390
		bodyModel[385].setRotationPoint(-157F, 3.9F, 0F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,12.7F, 35.2F, -0.3F, 13.3F, 35.2F, -0.3F, 13.3F, 35.2F, -0.3F, 12.7F, 35.2F, -0.3F, 12.7F, -45.8F, -0.3F, 13.3F, -45.8F, -0.3F, 13.3F, -45.8F, -0.3F, 12.7F, -45.8F, -0.3F); // Box 391
		bodyModel[386].setRotationPoint(-90F, 14F, -0.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 23, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -1.3F, 0F, 2F, 0F, 0F, 0F, 0F, -7F, -0.5F, -1.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, 0F); // Box 20
		bodyModel[387].setRotationPoint(144F, 24F, -2F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 23, 3, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -1.3F, 0F, 0F, -2F, -7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, -1.8F); // Box 21
		bodyModel[388].setRotationPoint(144F, 24F, 0F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, -1.8F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.3F, -6.5F, -1F, -1.5F); // Box 23
		bodyModel[389].setRotationPoint(152F, 26F, 0F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F,1F, -0.5F, -1.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -6.5F, -1F, -1.5F, 0F, -1F, -1.3F, 0F, -1F, 0F, -6F, -1F, 0F); // Box 24
		bodyModel[390].setRotationPoint(152F, 26F, -2F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.3F, -1.5F, -1.3F, -1.5F, -0.8F, -1.5F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[391].setRotationPoint(167F, 26F, -2F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -1.3F, -1.5F, 0F, -1.5F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[392].setRotationPoint(167F, 24F, -2F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 2F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.3F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 398
		bodyModel[393].setRotationPoint(167F, 24F, 0F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.8F, -1.5F, 0F, -1.5F, -1.3F, -1.5F, 0F, -1F, -1.3F); // Box 399
		bodyModel[394].setRotationPoint(167F, 26F, 0F);

		bodyModel[395].addShapeBox(0F, 0F, -19.3F, 188, 84, 1, 0F,-86F, -37F, -1F, -86F, -37F, -3F, -86F, -37F, 3F, -86F, -37F, 1F, -86F, -37F, -1.4F, -86F, -37F, -3.6F, -86F, -37F, 4F, -86F, -37F, 2F); // Box 401
		bodyModel[395].setRotationPoint(16F, -33F, -1F);

		bodyModel[396].addShapeBox(0F, 0F, -18.6F, 188, 84, 1, 0F,-86F, -37F, 1F, -86F, -37F, 3F, -86F, -37F, -3F, -86F, -37F, -1F, -86F, -37F, 2F, -86F, -37F, 4F, -86F, -37F, -4F, -86F, -37F, -1.4F); // Box 402
		bodyModel[396].setRotationPoint(16F, -33F, 38F);

		bodyModel[397].addShapeBox(0F, 0F, -18.6F, 188, 84, 1, 0F,-86F, -37F, 1F, -86F, -37F, 3F, -86F, -37F, -3F, -86F, -37F, -1F, -86F, -37F, 4F, -86F, -37F, 4.4F, -86F, -37F, -4.8F, -86F, -37F, -2.2F); // Box 402
		bodyModel[397].setRotationPoint(33F, -33F, 36F);

		bodyModel[398].addBox(0F, 0F, -0.5F, 7, 1, 6, 0F); // Box 404
		bodyModel[398].setRotationPoint(23F, -9.5F, -12F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[399].setRotationPoint(27.3F, -9F, -18F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[400].setRotationPoint(24F, -9F, -18F);

		bodyModel[401].addBox(0F, 0F, -5.5F, 7, 1, 6, 0F); // Box 407
		bodyModel[401].setRotationPoint(-1F, -9.5F, 13F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[402].setRotationPoint(3F, -9F, 8F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[403].setRotationPoint(0F, -9F, 9F);

		bodyModel[404].addShapeBox(0F, -7F, 0F, 3, 3, 13, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, 0.6F, 0F, -2F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 410
		bodyModel[404].setRotationPoint(23.3F, -7.55F, -23.5F);

		bodyModel[405].addShapeBox(0F, -7F, 0F, 3, 3, 13, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, 0.6F, 0F, -2F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 411
		bodyModel[405].setRotationPoint(26.7F, -7.55F, -23.5F);

		bodyModel[406].addShapeBox(0F, -11F, 0F, 3, 3, 13, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, 0.6F, 0F, -2F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 412
		bodyModel[406].setRotationPoint(23.3F, -7.55F, -22.5F);

		bodyModel[407].addShapeBox(0F, -11F, 0F, 3, 3, 13, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, 0.6F, 0F, -2F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 413
		bodyModel[407].setRotationPoint(26.7F, -7.55F, -22.5F);

		bodyModel[408].addShapeBox(0F, -11F, 0F, 6, 5, 1, 0F,0F, 0.2F, -2F, 0F, 0.2F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 418
		bodyModel[408].setRotationPoint(23.5F, -5.55F, -19.5F);

		bodyModel[409].addShapeBox(-24F, -11F, 0F, 3, 3, 13, 0F,0F, -2F, 0.6F, 0F, -2F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[409].setRotationPoint(23.7F, -3.55F, 10.5F);

		bodyModel[410].addShapeBox(-24F, -11F, 0F, 3, 3, 13, 0F,0F, -2F, 0.6F, 0F, -2F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[410].setRotationPoint(27.3F, -3.55F, 10.5F);

		bodyModel[411].addShapeBox(-24F, -11F, 0F, 3, 3, 13, 0F,0F, -2F, 0.6F, 0F, -2F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[411].setRotationPoint(27.3F, -7.55F, 9.5F);

		bodyModel[412].addShapeBox(-24F, -11F, 0F, 3, 3, 13, 0F,0F, -2F, 0.6F, 0F, -2F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[412].setRotationPoint(23.3F, -7.55F, 9.5F);

		bodyModel[413].addShapeBox(0F, -11F, 0F, 6, 5, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.2F, -2F, 0F, 0.2F, -2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[413].setRotationPoint(-0.5F, -5.55F, 18.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-1.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.2F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F); // Box 419
		bodyModel[414].setRotationPoint(-3.4F, -50F, -0.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 210
		bodyModel[415].setRotationPoint(95F, 0.699999999999999F, -10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 421
		bodyModel[416].setRotationPoint(98F, 0.699999999999999F, -10F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 422
		bodyModel[417].setRotationPoint(101F, 0.699999999999999F, -10F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 423
		bodyModel[418].setRotationPoint(104F, 0.699999999999999F, -10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 424
		bodyModel[419].setRotationPoint(104F, 0.699999999999999F, -6F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 425
		bodyModel[420].setRotationPoint(101F, 0.699999999999999F, -6F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 426
		bodyModel[421].setRotationPoint(98F, 0.699999999999999F, -6F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 427
		bodyModel[422].setRotationPoint(95F, 0.699999999999999F, -6F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 428
		bodyModel[423].setRotationPoint(110F, 0.699999999999999F, -6F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 429
		bodyModel[424].setRotationPoint(110F, 0.699999999999999F, -10F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 430
		bodyModel[425].setRotationPoint(113F, 0.699999999999999F, -10F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 431
		bodyModel[426].setRotationPoint(113F, 0.699999999999999F, -6F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 432
		bodyModel[427].setRotationPoint(116F, 0.699999999999999F, -6F);

		bodyModel[428].addShapeBox(0F, 0F, -4F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 433
		bodyModel[428].setRotationPoint(116F, 0.699999999999999F, -6F);

		bodyModel[429].addShapeBox(0F, 0F, -4F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 434
		bodyModel[429].setRotationPoint(119F, 0.699999999999999F, -6F);

		bodyModel[430].addShapeBox(0F, 0F, -4F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 435
		bodyModel[430].setRotationPoint(119F, 0.699999999999999F, -2F);

		bodyModel[431].addShapeBox(0F, 0F, -4F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 436
		bodyModel[431].setRotationPoint(119F, 0.699999999999999F, 11F);

		bodyModel[432].addShapeBox(0F, 0F, -4F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 437
		bodyModel[432].setRotationPoint(116F, 0.699999999999999F, 11F);

		bodyModel[433].addShapeBox(0F, 0F, -4F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 438
		bodyModel[433].setRotationPoint(113F, 0.699999999999999F, 11F);

		bodyModel[434].addShapeBox(0F, 0F, -4F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 439
		bodyModel[434].setRotationPoint(110F, 0.699999999999999F, 11F);

		bodyModel[435].addShapeBox(0F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 440
		bodyModel[435].setRotationPoint(110F, 0.699999999999999F, 11F);

		bodyModel[436].addShapeBox(0F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 441
		bodyModel[436].setRotationPoint(113F, 0.699999999999999F, 11F);

		bodyModel[437].addShapeBox(0F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 442
		bodyModel[437].setRotationPoint(116F, 0.699999999999999F, 11F);

		bodyModel[438].addShapeBox(0F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 443
		bodyModel[438].setRotationPoint(119F, 0.699999999999999F, 11F);

		bodyModel[439].addShapeBox(0F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 444
		bodyModel[439].setRotationPoint(104F, 0.699999999999999F, 11F);

		bodyModel[440].addShapeBox(0F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 445
		bodyModel[440].setRotationPoint(101F, 0.699999999999999F, 11F);

		bodyModel[441].addShapeBox(0F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 446
		bodyModel[441].setRotationPoint(98F, 0.699999999999999F, 11F);

		bodyModel[442].addShapeBox(0F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 447
		bodyModel[442].setRotationPoint(95F, 0.699999999999999F, 11F);

		bodyModel[443].addShapeBox(0F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 448
		bodyModel[443].setRotationPoint(95F, 0.699999999999999F, 15F);

		bodyModel[444].addShapeBox(0F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 449
		bodyModel[444].setRotationPoint(98F, 0.699999999999999F, 15F);

		bodyModel[445].addShapeBox(0F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 450
		bodyModel[445].setRotationPoint(101F, 0.699999999999999F, 15F);

		bodyModel[446].addShapeBox(3F, 0F, -8F, 2, 6, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 451
		bodyModel[446].setRotationPoint(101F, 0.699999999999999F, 15F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 205, 565, textureX, textureY); // Box 389

		bodyDoorOpenModel[0].addShapeBox(0F, -2F, -0.5F, 247, 170, 1, 0F,-117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F); // Box 389
		bodyDoorOpenModel[0].setRotationPoint(-108.1F, -104.5F, 20.5F);
		bodyDoorOpenModel[0].rotateAngleX = 0.05235988F;
		bodyDoorOpenModel[0].rotateAngleY = -0.17453293F;
		bodyDoorOpenModel[0].rotateAngleZ = 0.13962634F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 205, 364, textureX, textureY); // Box 240

		bodyDoorCloseModel[0].addShapeBox(0F, -2F, -0.5F, 250, 170, 1, 0F,-117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F, -117.2F, -88.2F, -0.4F); // Box 240
		bodyDoorCloseModel[0].setRotationPoint(-111.6F, -111.5F, 20.5F);
		bodyDoorCloseModel[0].rotateAngleX = 0.05235988F;
		bodyDoorCloseModel[0].rotateAngleY = -0.17453293F;
		bodyDoorCloseModel[0].rotateAngleZ = 0.13962634F;
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 97

		leftFrontWheelModel[0].addShapeBox(-7F, 0F, -1F, 10, 6, 2, 0F,-1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 97
		leftFrontWheelModel[0].setRotationPoint(-132F, 19F, 7F);
	}

	private void initfrontWheelModel_1()
	{
		frontWheelModel[0] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 274

		frontWheelModel[0].addShapeBox(-7F, 0F, -1F, 10, 6, 2, 0F,-1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 274
		frontWheelModel[0].setRotationPoint(-132F, 19F, -6F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[58];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 1, 786, textureX, textureY); // Box 0
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 25, 786, textureX, textureY); // Box 2
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 49, 786, textureX, textureY); // Box 16
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 81, 786, textureX, textureY); // Box 61
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 105, 786, textureX, textureY); // Box 62
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 129, 786, textureX, textureY); // Box 64
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 161, 786, textureX, textureY); // Box 66
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 185, 786, textureX, textureY); // Box 52
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 201, 786, textureX, textureY); // Box 53
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 217, 786, textureX, textureY); // Box 55
		gun_1_Model[0][10] = new ModelRendererTurbo(this, 241, 786, textureX, textureY); // Box 56
		gun_1_Model[0][11] = new ModelRendererTurbo(this, 265, 786, textureX, textureY); // Box 57
		gun_1_Model[0][12] = new ModelRendererTurbo(this, 289, 786, textureX, textureY); // Box 58
		gun_1_Model[0][13] = new ModelRendererTurbo(this, 313, 786, textureX, textureY); // Box 61
		gun_1_Model[0][14] = new ModelRendererTurbo(this, 337, 786, textureX, textureY); // Box 62
		gun_1_Model[0][15] = new ModelRendererTurbo(this, 361, 786, textureX, textureY); // Box 63
		gun_1_Model[0][16] = new ModelRendererTurbo(this, 393, 786, textureX, textureY); // Box 64
		gun_1_Model[0][17] = new ModelRendererTurbo(this, 417, 786, textureX, textureY); // Box 65
		gun_1_Model[0][18] = new ModelRendererTurbo(this, 441, 786, textureX, textureY); // Box 66
		gun_1_Model[0][19] = new ModelRendererTurbo(this, 465, 786, textureX, textureY); // Box 68
		gun_1_Model[0][20] = new ModelRendererTurbo(this, 489, 786, textureX, textureY); // Box 69
		gun_1_Model[0][21] = new ModelRendererTurbo(this, 97, 786, textureX, textureY); // Box 70
		gun_1_Model[0][22] = new ModelRendererTurbo(this, 121, 786, textureX, textureY); // Box 71
		gun_1_Model[0][23] = new ModelRendererTurbo(this, 153, 786, textureX, textureY); // Box 73
		gun_1_Model[0][24] = new ModelRendererTurbo(this, 177, 786, textureX, textureY); // Box 74
		gun_1_Model[0][25] = new ModelRendererTurbo(this, 217, 786, textureX, textureY); // Box 75
		gun_1_Model[0][26] = new ModelRendererTurbo(this, 1, 794, textureX, textureY); // Box 76
		gun_1_Model[0][27] = new ModelRendererTurbo(this, 25, 794, textureX, textureY); // Box 77
		gun_1_Model[0][28] = new ModelRendererTurbo(this, 57, 794, textureX, textureY); // Box 78
		gun_1_Model[0][29] = new ModelRendererTurbo(this, 41, 802, textureX, textureY); // Box 79
		gun_1_Model[0][30] = new ModelRendererTurbo(this, 73, 802, textureX, textureY); // Box 80
		gun_1_Model[0][31] = new ModelRendererTurbo(this, 193, 786, textureX, textureY); // Box 81
		gun_1_Model[0][32] = new ModelRendererTurbo(this, 233, 786, textureX, textureY); // Box 82
		gun_1_Model[0][33] = new ModelRendererTurbo(this, 257, 786, textureX, textureY); // Box 83
		gun_1_Model[0][34] = new ModelRendererTurbo(this, 281, 786, textureX, textureY); // Box 84
		gun_1_Model[0][35] = new ModelRendererTurbo(this, 289, 786, textureX, textureY); // Box 85
		gun_1_Model[0][36] = new ModelRendererTurbo(this, 305, 786, textureX, textureY); // Box 86
		gun_1_Model[0][37] = new ModelRendererTurbo(this, 313, 802, textureX, textureY); // Box 42
		gun_1_Model[0][38] = new ModelRendererTurbo(this, 361, 802, textureX, textureY); // Box 64
		gun_1_Model[0][39] = new ModelRendererTurbo(this, 377, 802, textureX, textureY); // Box 65
		gun_1_Model[0][40] = new ModelRendererTurbo(this, 329, 802, textureX, textureY); // Box 66
		gun_1_Model[0][41] = new ModelRendererTurbo(this, 393, 802, textureX, textureY); // Box 67
		gun_1_Model[0][42] = new ModelRendererTurbo(this, 409, 802, textureX, textureY); // Box 68
		gun_1_Model[0][43] = new ModelRendererTurbo(this, 425, 802, textureX, textureY); // Box 69
		gun_1_Model[0][44] = new ModelRendererTurbo(this, 441, 802, textureX, textureY); // Box 70
		gun_1_Model[0][45] = new ModelRendererTurbo(this, 457, 802, textureX, textureY); // Box 71
		gun_1_Model[0][46] = new ModelRendererTurbo(this, 473, 802, textureX, textureY); // Box 72
		gun_1_Model[0][47] = new ModelRendererTurbo(this, 73, 794, textureX, textureY); // Box 73
		gun_1_Model[0][48] = new ModelRendererTurbo(this, 489, 802, textureX, textureY); // Box 74
		gun_1_Model[0][49] = new ModelRendererTurbo(this, 25, 810, textureX, textureY); // Box 75
		gun_1_Model[0][50] = new ModelRendererTurbo(this, 41, 794, textureX, textureY); // Box 76
		gun_1_Model[0][51] = new ModelRendererTurbo(this, 505, 802, textureX, textureY); // Box 77
		gun_1_Model[0][52] = new ModelRendererTurbo(this, 65, 810, textureX, textureY); // Box 78
		gun_1_Model[0][53] = new ModelRendererTurbo(this, 1, 786, textureX, textureY); // Box 81
		gun_1_Model[0][54] = new ModelRendererTurbo(this, 185, 786, textureX, textureY); // Box 82
		gun_1_Model[0][55] = new ModelRendererTurbo(this, 97, 810, textureX, textureY); // Box 83
		gun_1_Model[0][56] = new ModelRendererTurbo(this, 105, 810, textureX, textureY); // Box 84
		gun_1_Model[0][57] = new ModelRendererTurbo(this, 113, 810, textureX, textureY); // Box 83

		gun_1_Model[0][0].addBox(-4.5F, -2F, -2.5F, 9, 1, 5, 0F); // Box 0

		gun_1_Model[0][1].addShapeBox(-5.5F, -2F, 2.5F, 11, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 2

		gun_1_Model[0][2].addShapeBox(1.5F, -10.2F, -2.5F, 2, 6, 5, 0F,0F, 0.4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F); // Box 16

		gun_1_Model[0][3].addShapeBox(3F, -5F, 2F, 4, 3, 7, 0F,0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -4F, 0F, 0F, -3F); // Box 61

		gun_1_Model[0][4].addShapeBox(3F, -8F, 2F, 4, 3, 7, 0F,0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4F, 0F, 0F, -3F); // Box 62

		gun_1_Model[0][5].addShapeBox(-3F, -8F, 2F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 64

		gun_1_Model[0][6].addShapeBox(-2F, -11F, 2F, 2, 3, 7, 0F,1F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -3.5F, 1F, -1F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F); // Box 66

		gun_1_Model[0][7].addShapeBox(-2.5F, -10.2F, -2.5F, 1, 6, 5, 0F,0F, -1F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F); // Box 52

		gun_1_Model[0][8].addShapeBox(-1.5F, -10.2F, -2.5F, 1, 6, 5, 0F,0F, 0.4F, -0.5F, 2F, 0.4F, -0.5F, 2F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 53

		gun_1_Model[0][9].addShapeBox(-7F, -11F, 2F, 4, 3, 7, 0F,-4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -4F, -1F, -4F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.8F, 0F, -4F); // Box 55

		gun_1_Model[0][10].addShapeBox(-7F, -8F, 2F, 4, 3, 7, 0F,-1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.8F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F); // Box 56

		gun_1_Model[0][11].addShapeBox(-7F, -5F, 2F, 4, 3, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F); // Box 57

		gun_1_Model[0][12].addShapeBox(3F, -11F, -9F, 4, 3, 7, 0F,0F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, -3F, -1.8F, 0F, -4F, -1.8F, 0F, 0F, 0F, 0F, 0F); // Box 58

		gun_1_Model[0][13].addShapeBox(-5F, -9.8F, -2F, 4, 7, 4, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61

		gun_1_Model[0][14].addShapeBox(-8F, -9F, -4F, 3, 9, 8, 0F,-1F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -1F, -0.4F, 0F, -0.4F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.4F, -3F, 0F); // Box 62

		gun_1_Model[0][15].addShapeBox(-3F, -8F, -6F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 63

		gun_1_Model[0][16].addShapeBox(-7F, -11F, -9F, 4, 3, 7, 0F,-4F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, -4F, -1F, 0F, -1.8F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1.8F, 0F, 0F); // Box 64

		gun_1_Model[0][17].addShapeBox(-7F, -8F, -9F, 4, 3, 7, 0F,-1.8F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 65

		gun_1_Model[0][18].addShapeBox(-7F, -5F, -9F, 4, 3, 7, 0F,-1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 66

		gun_1_Model[0][19].addShapeBox(-2F, -11F, -9F, 2, 3, 7, 0F,1F, -1F, -4F, 0F, -0.6F, -3.5F, 0F, -0.6F, 0F, 1F, -1F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 68

		gun_1_Model[0][20].addShapeBox(0F, -11F, -9F, 2, 3, 7, 0F,0F, -0.6F, -3.5F, 1F, -1.4F, -4F, 1F, -1.4F, 0F, 0F, -0.6F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 69

		gun_1_Model[0][21].addBox(-2.5F, -8F, -6.5F, 5, 5, 1, 0F); // Box 70

		gun_1_Model[0][22].addShapeBox(-2.5F, -9F, -6.5F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71

		gun_1_Model[0][23].addShapeBox(-2.5F, -3F, -6.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 73

		gun_1_Model[0][24].addShapeBox(-3.5F, -8F, -6.5F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 74

		gun_1_Model[0][25].addShapeBox(2.5F, -8F, -6.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 75

		gun_1_Model[0][26].addShapeBox(-5F, -9F, -4F, 3, 9, 8, 0F,0F, 0.6F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, -2F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, -2F, 0F); // Box 76

		gun_1_Model[0][27].addShapeBox(3F, -11F, 2F, 4, 3, 7, 0F,0F, -1.4F, 0F, -4F, -1.4F, 0F, -4F, -1.4F, -4F, 0F, -1.4F, -4F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -4F, 0F, 0F, -3F); // Box 77

		gun_1_Model[0][28].addShapeBox(0F, -11F, 2F, 2, 3, 7, 0F,0F, -0.6F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, -4F, 0F, -0.6F, -3.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F); // Box 78

		gun_1_Model[0][29].addShapeBox(3F, -8F, -9F, 4, 3, 7, 0F,0F, 0F, -3F, -1.8F, 0F, -4F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.4F, 0F, -4F, -1.4F, 0F, 0F, 0F, 0F, 0F); // Box 79

		gun_1_Model[0][30].addShapeBox(3F, -5F, -9F, 4, 3, 7, 0F,0F, 0F, -3F, -1.4F, 0F, -4F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.1F, 0F, -4F, -1.1F, 0F, 0F, 0F, 0F, 0F); // Box 80

		gun_1_Model[0][31].addShapeBox(-2.5F, -9F, 5.5F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81

		gun_1_Model[0][32].addBox(-2.5F, -8F, 5.5F, 5, 5, 1, 0F); // Box 82

		gun_1_Model[0][33].addShapeBox(-2.5F, -3F, 5.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 83

		gun_1_Model[0][34].addShapeBox(2.5F, -8F, 5.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 84

		gun_1_Model[0][35].addShapeBox(-3.5F, -8F, 5.5F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 85

		gun_1_Model[0][36].addBox(0.5F, -3F, -0.5F, 4, 1, 1, 0F); // Box 86

		gun_1_Model[0][37].addShapeBox(-7F, -12F, 2.1F, 3, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 42

		gun_1_Model[0][38].addShapeBox(-7F, -10F, 2.1F, 3, 2, 2, 0F,1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 64

		gun_1_Model[0][39].addShapeBox(-6F, -8F, 2.1F, 3, 2, 2, 0F,1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 65

		gun_1_Model[0][40].addShapeBox(-7.5F, -12.5F, 2.1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 66

		gun_1_Model[0][41].addShapeBox(-7.5F, -13.5F, 2.1F, 2, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67

		gun_1_Model[0][42].addShapeBox(-7.5F, -11.5F, -4.5F, 2, 2, 2, 0F,-0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68

		gun_1_Model[0][43].addShapeBox(-7.5F, -9.5F, -4.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 69

		gun_1_Model[0][44].addShapeBox(-7.5F, -11.5F, -4.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 70

		gun_1_Model[0][45].addShapeBox(-7.5F, -13.6F, -4.5F, 2, 1, 2, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71

		gun_1_Model[0][46].addShapeBox(-7.5F, -12.6F, -4.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 72

		gun_1_Model[0][47].addShapeBox(-7.5F, -11F, -5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F); // Box 73

		gun_1_Model[0][48].addShapeBox(-7.5F, -13F, -5.2F, 2, 2, 2, 0F,-0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -1.4F, -0.5F, -0.7F, -1.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.4F, 0F, 0F, -1.4F); // Box 74

		gun_1_Model[0][49].addShapeBox(-7.5F, -13F, -3.8F, 2, 2, 2, 0F,-0.5F, -0.7F, -1.4F, -0.5F, -0.7F, -1.4F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 75

		gun_1_Model[0][50].addShapeBox(-7.5F, -12.6F, -4.5F, 1, 1, 2, 0F,-0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F); // Box 76

		gun_1_Model[0][51].addShapeBox(-6F, -13.6F, 2.1F, 1, 2, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 77

		gun_1_Model[0][52].addShapeBox(-6F, -14.7F, 2.1F, 1, 1, 2, 0F,-0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 78

		gun_1_Model[0][53].addShapeBox(-6F, -13.6F, 1.1F, 1, 2, 1, 0F,-0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 81

		gun_1_Model[0][54].addShapeBox(-6F, -13.6F, 4.1F, 1, 2, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F); // Box 82

		gun_1_Model[0][55].addShapeBox(-6F, -11.4F, 2.1F, 1, 1, 2, 0F,-0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F); // Box 83

		gun_1_Model[0][56].addShapeBox(-5.8F, -13.6F, 2.1F, 1, 2, 2, 0F,-0.4F, 0F, 0F, -0.4F, -0.85F, -1F, -0.4F, -0.85F, -1F, -0.4F, 0F, 0F, -0.4F, 0.1F, 0F, -0.4F, -1F, -1F, -0.4F, -1F, -1F, -0.4F, 0.1F, 0F); // Box 84

		gun_1_Model[0][57].addShapeBox(-5.5F, -2F, -4.5F, 11, 1, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 83

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(-27F, -14F, -14F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[25];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 65, 786, textureX, textureY); // Box 34
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 329, 786, textureX, textureY); // Box 0
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 353, 786, textureX, textureY); // Box 0
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 385, 786, textureX, textureY); // Box 0
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 409, 786, textureX, textureY); // Box 0
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 433, 786, textureX, textureY); // Box 0
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 457, 786, textureX, textureY); // Box 0
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 481, 786, textureX, textureY); // Box 0
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 17, 794, textureX, textureY); // Box 0
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 89, 802, textureX, textureY); // Box 0
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 105, 802, textureX, textureY); // Box 0
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 121, 802, textureX, textureY); // Box 0
		gun_1_Model[2][12] = new ModelRendererTurbo(this, 137, 802, textureX, textureY); // Box 0
		gun_1_Model[2][13] = new ModelRendererTurbo(this, 153, 802, textureX, textureY); // Box 0
		gun_1_Model[2][14] = new ModelRendererTurbo(this, 169, 802, textureX, textureY); // Box 0
		gun_1_Model[2][15] = new ModelRendererTurbo(this, 185, 802, textureX, textureY); // Box 0
		gun_1_Model[2][16] = new ModelRendererTurbo(this, 201, 802, textureX, textureY); // Box 0
		gun_1_Model[2][17] = new ModelRendererTurbo(this, 217, 802, textureX, textureY); // Box 0
		gun_1_Model[2][18] = new ModelRendererTurbo(this, 233, 802, textureX, textureY); // Box 0
		gun_1_Model[2][19] = new ModelRendererTurbo(this, 249, 802, textureX, textureY); // Box 0
		gun_1_Model[2][20] = new ModelRendererTurbo(this, 209, 786, textureX, textureY); // Box 0
		gun_1_Model[2][21] = new ModelRendererTurbo(this, 505, 786, textureX, textureY); // Box 0
		gun_1_Model[2][22] = new ModelRendererTurbo(this, 1, 794, textureX, textureY); // Box 0
		gun_1_Model[2][23] = new ModelRendererTurbo(this, 265, 802, textureX, textureY); // Box 63
		gun_1_Model[2][24] = new ModelRendererTurbo(this, 289, 802, textureX, textureY); // Box 64

		gun_1_Model[2][0].addShapeBox(3.5F, -9.6F, -1.5F, 5, 1, 3, 0F,0F, 0.2F, -0.6F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, 0.2F, -0.6F, 0F, 0F, 0.2F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.2F); // Box 34

		gun_1_Model[2][1].addShapeBox(7F, -8F, -0.9F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_1_Model[2][2].addShapeBox(7F, -8F, -1.4F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_1_Model[2][3].addShapeBox(7F, -8F, -1.15F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_1_Model[2][4].addShapeBox(7F, -7.5F, -0.4F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_1_Model[2][5].addShapeBox(7F, -7.5F, -0.65F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_1_Model[2][6].addShapeBox(7F, -7.5F, -0.15F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_1_Model[2][7].addShapeBox(7F, -8F, 0.35F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_1_Model[2][8].addShapeBox(7F, -8F, 0.6F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_1_Model[2][9].addShapeBox(7F, -8F, 0.1F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_1_Model[2][10].addShapeBox(7F, -8.9F, 0.35F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_1_Model[2][11].addShapeBox(7F, -8.9F, 0.6F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_1_Model[2][12].addShapeBox(7F, -8.9F, -1.4F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_1_Model[2][13].addShapeBox(7F, -8.9F, -0.9F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_1_Model[2][14].addShapeBox(7F, -8.9F, -1.15F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_1_Model[2][15].addShapeBox(7F, -9.3F, -0.65F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_1_Model[2][16].addShapeBox(7F, -9.3F, -0.15F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_1_Model[2][17].addShapeBox(7F, -9.3F, -0.4F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_1_Model[2][18].addShapeBox(7F, -8.9F, 0.1F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_1_Model[2][19].addShapeBox(7F, -8.15F, -0.15F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 0

		gun_1_Model[2][20].addShapeBox(10.5F, -8.4F, -1.4F, 0, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F); // Box 0

		gun_1_Model[2][21].addShapeBox(10.5F, -7.65F, -1.4F, 0, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 0

		gun_1_Model[2][22].addShapeBox(10.5F, -9.4F, -1.4F, 0, 1, 3, 0F,-0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F); // Box 0

		gun_1_Model[2][23].addShapeBox(3.5F, -7.6F, -1.5F, 5, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.2F, 0F, 0.2F, -0.6F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, 0.2F, -0.6F); // Box 63

		gun_1_Model[2][24].addShapeBox(3.5F, -8.6F, -1.5F, 5, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.2F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.2F); // Box 64

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(-27F, -14F, -14F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[58];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1, 786, textureX, textureY); // Box 0
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 25, 786, textureX, textureY); // Box 2
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 49, 786, textureX, textureY); // Box 16
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 81, 786, textureX, textureY); // Box 61
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 105, 786, textureX, textureY); // Box 62
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 129, 786, textureX, textureY); // Box 64
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 161, 786, textureX, textureY); // Box 66
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 185, 786, textureX, textureY); // Box 52
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 201, 786, textureX, textureY); // Box 53
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 217, 786, textureX, textureY); // Box 55
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 241, 786, textureX, textureY); // Box 56
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 265, 786, textureX, textureY); // Box 57
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 289, 786, textureX, textureY); // Box 58
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 313, 786, textureX, textureY); // Box 61
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 337, 786, textureX, textureY); // Box 62
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 361, 786, textureX, textureY); // Box 63
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 393, 786, textureX, textureY); // Box 64
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 417, 786, textureX, textureY); // Box 65
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 441, 786, textureX, textureY); // Box 66
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 465, 786, textureX, textureY); // Box 68
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 489, 786, textureX, textureY); // Box 69
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 97, 786, textureX, textureY); // Box 70
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 121, 786, textureX, textureY); // Box 71
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 153, 786, textureX, textureY); // Box 73
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 177, 786, textureX, textureY); // Box 74
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 217, 786, textureX, textureY); // Box 75
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 1, 794, textureX, textureY); // Box 76
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 25, 794, textureX, textureY); // Box 77
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 57, 794, textureX, textureY); // Box 78
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 41, 802, textureX, textureY); // Box 79
		gun_2_Model[0][30] = new ModelRendererTurbo(this, 73, 802, textureX, textureY); // Box 80
		gun_2_Model[0][31] = new ModelRendererTurbo(this, 193, 786, textureX, textureY); // Box 81
		gun_2_Model[0][32] = new ModelRendererTurbo(this, 233, 786, textureX, textureY); // Box 82
		gun_2_Model[0][33] = new ModelRendererTurbo(this, 257, 786, textureX, textureY); // Box 83
		gun_2_Model[0][34] = new ModelRendererTurbo(this, 281, 786, textureX, textureY); // Box 84
		gun_2_Model[0][35] = new ModelRendererTurbo(this, 289, 786, textureX, textureY); // Box 85
		gun_2_Model[0][36] = new ModelRendererTurbo(this, 305, 786, textureX, textureY); // Box 86
		gun_2_Model[0][37] = new ModelRendererTurbo(this, 313, 802, textureX, textureY); // Box 42
		gun_2_Model[0][38] = new ModelRendererTurbo(this, 361, 802, textureX, textureY); // Box 64
		gun_2_Model[0][39] = new ModelRendererTurbo(this, 377, 802, textureX, textureY); // Box 65
		gun_2_Model[0][40] = new ModelRendererTurbo(this, 329, 802, textureX, textureY); // Box 66
		gun_2_Model[0][41] = new ModelRendererTurbo(this, 393, 802, textureX, textureY); // Box 67
		gun_2_Model[0][42] = new ModelRendererTurbo(this, 409, 802, textureX, textureY); // Box 68
		gun_2_Model[0][43] = new ModelRendererTurbo(this, 425, 802, textureX, textureY); // Box 69
		gun_2_Model[0][44] = new ModelRendererTurbo(this, 441, 802, textureX, textureY); // Box 70
		gun_2_Model[0][45] = new ModelRendererTurbo(this, 457, 802, textureX, textureY); // Box 71
		gun_2_Model[0][46] = new ModelRendererTurbo(this, 473, 802, textureX, textureY); // Box 72
		gun_2_Model[0][47] = new ModelRendererTurbo(this, 73, 794, textureX, textureY); // Box 73
		gun_2_Model[0][48] = new ModelRendererTurbo(this, 489, 802, textureX, textureY); // Box 74
		gun_2_Model[0][49] = new ModelRendererTurbo(this, 25, 810, textureX, textureY); // Box 75
		gun_2_Model[0][50] = new ModelRendererTurbo(this, 41, 794, textureX, textureY); // Box 76
		gun_2_Model[0][51] = new ModelRendererTurbo(this, 505, 802, textureX, textureY); // Box 77
		gun_2_Model[0][52] = new ModelRendererTurbo(this, 65, 810, textureX, textureY); // Box 78
		gun_2_Model[0][53] = new ModelRendererTurbo(this, 1, 786, textureX, textureY); // Box 81
		gun_2_Model[0][54] = new ModelRendererTurbo(this, 185, 786, textureX, textureY); // Box 82
		gun_2_Model[0][55] = new ModelRendererTurbo(this, 97, 810, textureX, textureY); // Box 83
		gun_2_Model[0][56] = new ModelRendererTurbo(this, 105, 810, textureX, textureY); // Box 84
		gun_2_Model[0][57] = new ModelRendererTurbo(this, 113, 810, textureX, textureY); // Box 83

		gun_2_Model[0][0].addBox(-4.5F, -2F, -2.5F, 9, 1, 5, 0F); // Box 0

		gun_2_Model[0][1].addShapeBox(-5.5F, -2F, 2.5F, 11, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 2

		gun_2_Model[0][2].addShapeBox(1.5F, -10.2F, -2.5F, 2, 6, 5, 0F,0F, 0.4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F); // Box 16

		gun_2_Model[0][3].addShapeBox(3F, -5F, 2F, 4, 3, 7, 0F,0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -4F, 0F, 0F, -3F); // Box 61

		gun_2_Model[0][4].addShapeBox(3F, -8F, 2F, 4, 3, 7, 0F,0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -4F, 0F, 0F, -3F); // Box 62

		gun_2_Model[0][5].addShapeBox(-3F, -8F, 2F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 64

		gun_2_Model[0][6].addShapeBox(-2F, -11F, 2F, 2, 3, 7, 0F,1F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -3.5F, 1F, -1F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F); // Box 66

		gun_2_Model[0][7].addShapeBox(-2.5F, -10.2F, -2.5F, 1, 6, 5, 0F,0F, -1F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F); // Box 52

		gun_2_Model[0][8].addShapeBox(-1.5F, -10.2F, -2.5F, 1, 6, 5, 0F,0F, 0.4F, -0.5F, 2F, 0.4F, -0.5F, 2F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 53

		gun_2_Model[0][9].addShapeBox(-7F, -11F, 2F, 4, 3, 7, 0F,-4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -4F, -1F, -4F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.8F, 0F, -4F); // Box 55

		gun_2_Model[0][10].addShapeBox(-7F, -8F, 2F, 4, 3, 7, 0F,-1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.8F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F); // Box 56

		gun_2_Model[0][11].addShapeBox(-7F, -5F, 2F, 4, 3, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F); // Box 57

		gun_2_Model[0][12].addShapeBox(3F, -11F, -9F, 4, 3, 7, 0F,0F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, -3F, -1.8F, 0F, -4F, -1.8F, 0F, 0F, 0F, 0F, 0F); // Box 58

		gun_2_Model[0][13].addShapeBox(-5F, -9.8F, -2F, 4, 7, 4, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61

		gun_2_Model[0][14].addShapeBox(-8F, -9F, -4F, 3, 9, 8, 0F,-1F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -1F, -0.4F, 0F, -0.4F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.4F, -3F, 0F); // Box 62

		gun_2_Model[0][15].addShapeBox(-3F, -8F, -6F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 63

		gun_2_Model[0][16].addShapeBox(-7F, -11F, -9F, 4, 3, 7, 0F,-4F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, -4F, -1F, 0F, -1.8F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1.8F, 0F, 0F); // Box 64

		gun_2_Model[0][17].addShapeBox(-7F, -8F, -9F, 4, 3, 7, 0F,-1.8F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 65

		gun_2_Model[0][18].addShapeBox(-7F, -5F, -9F, 4, 3, 7, 0F,-1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 66

		gun_2_Model[0][19].addShapeBox(-2F, -11F, -9F, 2, 3, 7, 0F,1F, -1F, -4F, 0F, -0.6F, -3.5F, 0F, -0.6F, 0F, 1F, -1F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 68

		gun_2_Model[0][20].addShapeBox(0F, -11F, -9F, 2, 3, 7, 0F,0F, -0.6F, -3.5F, 1F, -1.4F, -4F, 1F, -1.4F, 0F, 0F, -0.6F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 69

		gun_2_Model[0][21].addBox(-2.5F, -8F, -6.5F, 5, 5, 1, 0F); // Box 70

		gun_2_Model[0][22].addShapeBox(-2.5F, -9F, -6.5F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71

		gun_2_Model[0][23].addShapeBox(-2.5F, -3F, -6.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 73

		gun_2_Model[0][24].addShapeBox(-3.5F, -8F, -6.5F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 74

		gun_2_Model[0][25].addShapeBox(2.5F, -8F, -6.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 75

		gun_2_Model[0][26].addShapeBox(-5F, -9F, -4F, 3, 9, 8, 0F,0F, 0.6F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, -2F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, -2F, 0F); // Box 76

		gun_2_Model[0][27].addShapeBox(3F, -11F, 2F, 4, 3, 7, 0F,0F, -1.4F, 0F, -4F, -1.4F, 0F, -4F, -1.4F, -4F, 0F, -1.4F, -4F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -4F, 0F, 0F, -3F); // Box 77

		gun_2_Model[0][28].addShapeBox(0F, -11F, 2F, 2, 3, 7, 0F,0F, -0.6F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, -4F, 0F, -0.6F, -3.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F); // Box 78

		gun_2_Model[0][29].addShapeBox(3F, -8F, -9F, 4, 3, 7, 0F,0F, 0F, -3F, -1.8F, 0F, -4F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.4F, 0F, -4F, -1.4F, 0F, 0F, 0F, 0F, 0F); // Box 79

		gun_2_Model[0][30].addShapeBox(3F, -5F, -9F, 4, 3, 7, 0F,0F, 0F, -3F, -1.4F, 0F, -4F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.1F, 0F, -4F, -1.1F, 0F, 0F, 0F, 0F, 0F); // Box 80

		gun_2_Model[0][31].addShapeBox(-2.5F, -9F, 5.5F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81

		gun_2_Model[0][32].addBox(-2.5F, -8F, 5.5F, 5, 5, 1, 0F); // Box 82

		gun_2_Model[0][33].addShapeBox(-2.5F, -3F, 5.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 83

		gun_2_Model[0][34].addShapeBox(2.5F, -8F, 5.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 84

		gun_2_Model[0][35].addShapeBox(-3.5F, -8F, 5.5F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 85

		gun_2_Model[0][36].addBox(0.5F, -3F, -0.5F, 4, 1, 1, 0F); // Box 86

		gun_2_Model[0][37].addShapeBox(-7F, -12F, 2.1F, 3, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 42

		gun_2_Model[0][38].addShapeBox(-7F, -10F, 2.1F, 3, 2, 2, 0F,1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 64

		gun_2_Model[0][39].addShapeBox(-6F, -8F, 2.1F, 3, 2, 2, 0F,1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 65

		gun_2_Model[0][40].addShapeBox(-7.5F, -12.5F, 2.1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 66

		gun_2_Model[0][41].addShapeBox(-7.5F, -13.5F, 2.1F, 2, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67

		gun_2_Model[0][42].addShapeBox(-7.5F, -11.5F, -4.5F, 2, 2, 2, 0F,-0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68

		gun_2_Model[0][43].addShapeBox(-7.5F, -9.5F, -4.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 69

		gun_2_Model[0][44].addShapeBox(-7.5F, -11.5F, -4.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 70

		gun_2_Model[0][45].addShapeBox(-7.5F, -13.6F, -4.5F, 2, 1, 2, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71

		gun_2_Model[0][46].addShapeBox(-7.5F, -12.6F, -4.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 72

		gun_2_Model[0][47].addShapeBox(-7.5F, -11F, -5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F); // Box 73

		gun_2_Model[0][48].addShapeBox(-7.5F, -13F, -5.2F, 2, 2, 2, 0F,-0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -1.4F, -0.5F, -0.7F, -1.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.4F, 0F, 0F, -1.4F); // Box 74

		gun_2_Model[0][49].addShapeBox(-7.5F, -13F, -3.8F, 2, 2, 2, 0F,-0.5F, -0.7F, -1.4F, -0.5F, -0.7F, -1.4F, -0.5F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 75

		gun_2_Model[0][50].addShapeBox(-7.5F, -12.6F, -4.5F, 1, 1, 2, 0F,-0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F); // Box 76

		gun_2_Model[0][51].addShapeBox(-6F, -13.6F, 2.1F, 1, 2, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 77

		gun_2_Model[0][52].addShapeBox(-6F, -14.7F, 2.1F, 1, 1, 2, 0F,-0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 78

		gun_2_Model[0][53].addShapeBox(-6F, -13.6F, 1.1F, 1, 2, 1, 0F,-0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 81

		gun_2_Model[0][54].addShapeBox(-6F, -13.6F, 4.1F, 1, 2, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F); // Box 82

		gun_2_Model[0][55].addShapeBox(-6F, -11.4F, 2.1F, 1, 1, 2, 0F,-0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F); // Box 83

		gun_2_Model[0][56].addShapeBox(-5.8F, -13.6F, 2.1F, 1, 2, 2, 0F,-0.4F, 0F, 0F, -0.4F, -0.85F, -1F, -0.4F, -0.85F, -1F, -0.4F, 0F, 0F, -0.4F, 0.1F, 0F, -0.4F, -1F, -1F, -0.4F, -1F, -1F, -0.4F, 0.1F, 0F); // Box 84

		gun_2_Model[0][57].addShapeBox(-5.5F, -2F, -4.5F, 11, 1, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 83

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-27F, -14F, 14F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[25];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 65, 786, textureX, textureY); // Box 34
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 329, 786, textureX, textureY); // Box 0
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 353, 786, textureX, textureY); // Box 0
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 385, 786, textureX, textureY); // Box 0
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 409, 786, textureX, textureY); // Box 0
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 433, 786, textureX, textureY); // Box 0
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 457, 786, textureX, textureY); // Box 0
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 481, 786, textureX, textureY); // Box 0
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 17, 794, textureX, textureY); // Box 0
		gun_2_Model[2][9] = new ModelRendererTurbo(this, 89, 802, textureX, textureY); // Box 0
		gun_2_Model[2][10] = new ModelRendererTurbo(this, 105, 802, textureX, textureY); // Box 0
		gun_2_Model[2][11] = new ModelRendererTurbo(this, 121, 802, textureX, textureY); // Box 0
		gun_2_Model[2][12] = new ModelRendererTurbo(this, 137, 802, textureX, textureY); // Box 0
		gun_2_Model[2][13] = new ModelRendererTurbo(this, 153, 802, textureX, textureY); // Box 0
		gun_2_Model[2][14] = new ModelRendererTurbo(this, 169, 802, textureX, textureY); // Box 0
		gun_2_Model[2][15] = new ModelRendererTurbo(this, 185, 802, textureX, textureY); // Box 0
		gun_2_Model[2][16] = new ModelRendererTurbo(this, 201, 802, textureX, textureY); // Box 0
		gun_2_Model[2][17] = new ModelRendererTurbo(this, 217, 802, textureX, textureY); // Box 0
		gun_2_Model[2][18] = new ModelRendererTurbo(this, 233, 802, textureX, textureY); // Box 0
		gun_2_Model[2][19] = new ModelRendererTurbo(this, 249, 802, textureX, textureY); // Box 0
		gun_2_Model[2][20] = new ModelRendererTurbo(this, 209, 786, textureX, textureY); // Box 0
		gun_2_Model[2][21] = new ModelRendererTurbo(this, 505, 786, textureX, textureY); // Box 0
		gun_2_Model[2][22] = new ModelRendererTurbo(this, 1, 794, textureX, textureY); // Box 0
		gun_2_Model[2][23] = new ModelRendererTurbo(this, 265, 802, textureX, textureY); // Box 63
		gun_2_Model[2][24] = new ModelRendererTurbo(this, 289, 802, textureX, textureY); // Box 64

		gun_2_Model[2][0].addShapeBox(3.5F, -9.6F, -1.5F, 5, 1, 3, 0F,0F, 0.2F, -0.6F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, 0.2F, -0.6F, 0F, 0F, 0.2F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.2F); // Box 34

		gun_2_Model[2][1].addShapeBox(7F, -8F, -0.9F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_2_Model[2][2].addShapeBox(7F, -8F, -1.4F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_2_Model[2][3].addShapeBox(7F, -8F, -1.15F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_2_Model[2][4].addShapeBox(7F, -7.5F, -0.4F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_2_Model[2][5].addShapeBox(7F, -7.5F, -0.65F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_2_Model[2][6].addShapeBox(7F, -7.5F, -0.15F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_2_Model[2][7].addShapeBox(7F, -8F, 0.35F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_2_Model[2][8].addShapeBox(7F, -8F, 0.6F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_2_Model[2][9].addShapeBox(7F, -8F, 0.1F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_2_Model[2][10].addShapeBox(7F, -8.9F, 0.35F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_2_Model[2][11].addShapeBox(7F, -8.9F, 0.6F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_2_Model[2][12].addShapeBox(7F, -8.9F, -1.4F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_2_Model[2][13].addShapeBox(7F, -8.9F, -0.9F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_2_Model[2][14].addShapeBox(7F, -8.9F, -1.15F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_2_Model[2][15].addShapeBox(7F, -9.3F, -0.65F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_2_Model[2][16].addShapeBox(7F, -9.3F, -0.15F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_2_Model[2][17].addShapeBox(7F, -9.3F, -0.4F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_2_Model[2][18].addShapeBox(7F, -8.9F, 0.1F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_2_Model[2][19].addShapeBox(7F, -8.15F, -0.15F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 0

		gun_2_Model[2][20].addShapeBox(10.5F, -8.4F, -1.4F, 0, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F); // Box 0

		gun_2_Model[2][21].addShapeBox(10.5F, -7.65F, -1.4F, 0, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 0

		gun_2_Model[2][22].addShapeBox(10.5F, -9.4F, -1.4F, 0, 1, 3, 0F,-0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F); // Box 0

		gun_2_Model[2][23].addShapeBox(3.5F, -7.6F, -1.5F, 5, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.2F, 0F, 0.2F, -0.6F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, 0.2F, -0.6F); // Box 63

		gun_2_Model[2][24].addShapeBox(3.5F, -8.6F, -1.5F, 5, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.2F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.2F); // Box 64

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(-27F, -14F, 14F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[5];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 1, 320, textureX, textureY); // Box 238
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 9, 320, textureX, textureY); // Box 240
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 41, 320, textureX, textureY); // Box 24
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 57, 320, textureX, textureY); // Box 25
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 73, 320, textureX, textureY); // Box 26

		gun_3_Model[0][0].addShapeBox(-1F, 0F, -2F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238

		gun_3_Model[0][1].addShapeBox(-1F, 0F, 1F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 240

		gun_3_Model[0][2].addShapeBox(-0.44F, 1.2F, -2F, 1, 1, 4, 0F,0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F); // Box 24

		gun_3_Model[0][3].addShapeBox(-0.44F, 0.75F, -2F, 1, 1, 4, 0F,-0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F); // Box 25

		gun_3_Model[0][4].addShapeBox(-0.44F, 1.65F, -2F, 1, 1, 4, 0F,0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, -0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F); // Box 26

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-73F, -20F, -15F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[22];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 17, 320, textureX, textureY); // Box 241
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 33, 320, textureX, textureY); // Box 242
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 49, 320, textureX, textureY); // Box 4
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 5
		gun_3_Model[2][4] = new ModelRendererTurbo(this, 81, 320, textureX, textureY); // Box 6
		gun_3_Model[2][5] = new ModelRendererTurbo(this, 97, 320, textureX, textureY); // Box 7
		gun_3_Model[2][6] = new ModelRendererTurbo(this, 113, 320, textureX, textureY); // Box 8
		gun_3_Model[2][7] = new ModelRendererTurbo(this, 129, 320, textureX, textureY); // Box 9
		gun_3_Model[2][8] = new ModelRendererTurbo(this, 145, 320, textureX, textureY); // Box 10
		gun_3_Model[2][9] = new ModelRendererTurbo(this, 161, 320, textureX, textureY); // Box 11
		gun_3_Model[2][10] = new ModelRendererTurbo(this, 177, 320, textureX, textureY); // Box 12
		gun_3_Model[2][11] = new ModelRendererTurbo(this, 193, 320, textureX, textureY); // Box 13
		gun_3_Model[2][12] = new ModelRendererTurbo(this, 209, 320, textureX, textureY); // Box 14
		gun_3_Model[2][13] = new ModelRendererTurbo(this, 225, 320, textureX, textureY); // Box 15
		gun_3_Model[2][14] = new ModelRendererTurbo(this, 241, 320, textureX, textureY); // Box 16
		gun_3_Model[2][15] = new ModelRendererTurbo(this, 257, 320, textureX, textureY); // Box 17
		gun_3_Model[2][16] = new ModelRendererTurbo(this, 273, 320, textureX, textureY); // Box 18
		gun_3_Model[2][17] = new ModelRendererTurbo(this, 289, 320, textureX, textureY); // Box 19
		gun_3_Model[2][18] = new ModelRendererTurbo(this, 305, 320, textureX, textureY); // Box 20
		gun_3_Model[2][19] = new ModelRendererTurbo(this, 321, 320, textureX, textureY); // Box 21
		gun_3_Model[2][20] = new ModelRendererTurbo(this, 337, 320, textureX, textureY); // Box 22
		gun_3_Model[2][21] = new ModelRendererTurbo(this, 353, 320, textureX, textureY); // Box 23

		gun_3_Model[2][0].addShapeBox(-2F, -1F, -1F, 3, 2, 2, 0F,0.25F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.25F, 0F, 0.2F); // Box 241

		gun_3_Model[2][1].addShapeBox(-2F, 0.6F, -1F, 3, 1, 2, 0F,0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F); // Box 242

		gun_3_Model[2][2].addShapeBox(-2.15F, -1F, -1.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 4

		gun_3_Model[2][3].addShapeBox(-2.15F, -1F, -1F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 5

		gun_3_Model[2][4].addShapeBox(-2.15F, -1F, -0.5F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 6

		gun_3_Model[2][5].addShapeBox(-2.15F, -1F, 0F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 7

		gun_3_Model[2][6].addShapeBox(-2.15F, -1F, 0.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 8

		gun_3_Model[2][7].addShapeBox(-2.15F, 0.3F, -1.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 9

		gun_3_Model[2][8].addShapeBox(-2.15F, 0.3F, -1F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 10

		gun_3_Model[2][9].addShapeBox(-2.15F, 0.3F, -0.5F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 11

		gun_3_Model[2][10].addShapeBox(-2.15F, 0.3F, 0F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 12

		gun_3_Model[2][11].addShapeBox(-2.15F, 0.3F, 0.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 13

		gun_3_Model[2][12].addShapeBox(-2.15F, -0.55F, -1.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 14

		gun_3_Model[2][13].addShapeBox(-2.15F, -0.55F, -1F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 15

		gun_3_Model[2][14].addShapeBox(-2.15F, -0.55F, -0.5F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 16

		gun_3_Model[2][15].addShapeBox(-2.15F, -0.55F, 0F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 17

		gun_3_Model[2][16].addShapeBox(-2.15F, -0.55F, 0.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 18

		gun_3_Model[2][17].addShapeBox(-2.15F, -0.14F, -1.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 19

		gun_3_Model[2][18].addShapeBox(-2.15F, -0.14F, -1F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 20

		gun_3_Model[2][19].addShapeBox(-2.15F, -0.14F, -0.5F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 21

		gun_3_Model[2][20].addShapeBox(-2.15F, -0.14F, 0F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 22

		gun_3_Model[2][21].addShapeBox(-2.15F, -0.14F, 0.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 23

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(-73F, -20F, -15F);
		}


		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[5];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 1, 320, textureX, textureY); // Box 238
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 9, 320, textureX, textureY); // Box 240
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 41, 320, textureX, textureY); // Box 24
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 57, 320, textureX, textureY); // Box 25
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 73, 320, textureX, textureY); // Box 26

		gun_4_Model[0][0].addShapeBox(-1F, 0F, -2F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238

		gun_4_Model[0][1].addShapeBox(-1F, 0F, 1F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 240

		gun_4_Model[0][2].addShapeBox(-0.44F, 1.2F, -2F, 1, 1, 4, 0F,0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F); // Box 24

		gun_4_Model[0][3].addShapeBox(-0.44F, 0.75F, -2F, 1, 1, 4, 0F,-0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F); // Box 25

		gun_4_Model[0][4].addShapeBox(-0.44F, 1.65F, -2F, 1, 1, 4, 0F,0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, -0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F, -0.25F, -0.425F, 0F); // Box 26

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-73F, -20F, 15F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[22];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 17, 320, textureX, textureY); // Box 241
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 33, 320, textureX, textureY); // Box 242
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 49, 320, textureX, textureY); // Box 4
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 65, 320, textureX, textureY); // Box 5
		gun_4_Model[2][4] = new ModelRendererTurbo(this, 81, 320, textureX, textureY); // Box 6
		gun_4_Model[2][5] = new ModelRendererTurbo(this, 97, 320, textureX, textureY); // Box 7
		gun_4_Model[2][6] = new ModelRendererTurbo(this, 113, 320, textureX, textureY); // Box 8
		gun_4_Model[2][7] = new ModelRendererTurbo(this, 129, 320, textureX, textureY); // Box 9
		gun_4_Model[2][8] = new ModelRendererTurbo(this, 145, 320, textureX, textureY); // Box 10
		gun_4_Model[2][9] = new ModelRendererTurbo(this, 161, 320, textureX, textureY); // Box 11
		gun_4_Model[2][10] = new ModelRendererTurbo(this, 177, 320, textureX, textureY); // Box 12
		gun_4_Model[2][11] = new ModelRendererTurbo(this, 193, 320, textureX, textureY); // Box 13
		gun_4_Model[2][12] = new ModelRendererTurbo(this, 209, 320, textureX, textureY); // Box 14
		gun_4_Model[2][13] = new ModelRendererTurbo(this, 225, 320, textureX, textureY); // Box 15
		gun_4_Model[2][14] = new ModelRendererTurbo(this, 241, 320, textureX, textureY); // Box 16
		gun_4_Model[2][15] = new ModelRendererTurbo(this, 257, 320, textureX, textureY); // Box 17
		gun_4_Model[2][16] = new ModelRendererTurbo(this, 273, 320, textureX, textureY); // Box 18
		gun_4_Model[2][17] = new ModelRendererTurbo(this, 289, 320, textureX, textureY); // Box 19
		gun_4_Model[2][18] = new ModelRendererTurbo(this, 305, 320, textureX, textureY); // Box 20
		gun_4_Model[2][19] = new ModelRendererTurbo(this, 321, 320, textureX, textureY); // Box 21
		gun_4_Model[2][20] = new ModelRendererTurbo(this, 337, 320, textureX, textureY); // Box 22
		gun_4_Model[2][21] = new ModelRendererTurbo(this, 353, 320, textureX, textureY); // Box 23

		gun_4_Model[2][0].addShapeBox(-2F, -1F, -1F, 3, 2, 2, 0F,0.25F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.25F, 0F, 0.2F); // Box 241

		gun_4_Model[2][1].addShapeBox(-2F, 0.6F, -1F, 3, 1, 2, 0F,0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F); // Box 242

		gun_4_Model[2][2].addShapeBox(-2.15F, -1F, -1.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 4

		gun_4_Model[2][3].addShapeBox(-2.15F, -1F, -1F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 5

		gun_4_Model[2][4].addShapeBox(-2.15F, -1F, -0.5F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 6

		gun_4_Model[2][5].addShapeBox(-2.15F, -1F, 0F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 7

		gun_4_Model[2][6].addShapeBox(-2.15F, -1F, 0.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 8

		gun_4_Model[2][7].addShapeBox(-2.15F, 0.3F, -1.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 9

		gun_4_Model[2][8].addShapeBox(-2.15F, 0.3F, -1F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 10

		gun_4_Model[2][9].addShapeBox(-2.15F, 0.3F, -0.5F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 11

		gun_4_Model[2][10].addShapeBox(-2.15F, 0.3F, 0F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 12

		gun_4_Model[2][11].addShapeBox(-2.15F, 0.3F, 0.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 13

		gun_4_Model[2][12].addShapeBox(-2.15F, -0.55F, -1.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 14

		gun_4_Model[2][13].addShapeBox(-2.15F, -0.55F, -1F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 15

		gun_4_Model[2][14].addShapeBox(-2.15F, -0.55F, -0.5F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 16

		gun_4_Model[2][15].addShapeBox(-2.15F, -0.55F, 0F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 17

		gun_4_Model[2][16].addShapeBox(-2.15F, -0.55F, 0.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 18

		gun_4_Model[2][17].addShapeBox(-2.15F, -0.14F, -1.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 19

		gun_4_Model[2][18].addShapeBox(-2.15F, -0.14F, -1F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 20

		gun_4_Model[2][19].addShapeBox(-2.15F, -0.14F, -0.5F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 21

		gun_4_Model[2][20].addShapeBox(-2.15F, -0.14F, 0F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 22

		gun_4_Model[2][21].addShapeBox(-2.15F, -0.14F, 0.45F, 4, 1, 1, 0F,-0.35F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.1F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F); // Box 23

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(-73F, -20F, 15F);
		}


		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[33];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 1, 754, textureX, textureY); // Box 0
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 49, 754, textureX, textureY); // Box 1
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 97, 754, textureX, textureY); // Box 2
		gun_6_Model[0][3] = new ModelRendererTurbo(this, 129, 754, textureX, textureY); // Box 3
		gun_6_Model[0][4] = new ModelRendererTurbo(this, 153, 754, textureX, textureY); // Box 9
		gun_6_Model[0][5] = new ModelRendererTurbo(this, 169, 754, textureX, textureY); // Box 13
		gun_6_Model[0][6] = new ModelRendererTurbo(this, 209, 754, textureX, textureY); // Box 15
		gun_6_Model[0][7] = new ModelRendererTurbo(this, 249, 754, textureX, textureY); // Box 16
		gun_6_Model[0][8] = new ModelRendererTurbo(this, 193, 754, textureX, textureY); // Box 18
		gun_6_Model[0][9] = new ModelRendererTurbo(this, 265, 754, textureX, textureY); // Box 19
		gun_6_Model[0][10] = new ModelRendererTurbo(this, 281, 754, textureX, textureY); // Box 20
		gun_6_Model[0][11] = new ModelRendererTurbo(this, 1, 754, textureX, textureY); // Box 26
		gun_6_Model[0][12] = new ModelRendererTurbo(this, 89, 754, textureX, textureY); // Box 54
		gun_6_Model[0][13] = new ModelRendererTurbo(this, 401, 762, textureX, textureY); // Box 56
		gun_6_Model[0][14] = new ModelRendererTurbo(this, 433, 762, textureX, textureY); // Box 57
		gun_6_Model[0][15] = new ModelRendererTurbo(this, 465, 762, textureX, textureY); // Box 58
		gun_6_Model[0][16] = new ModelRendererTurbo(this, 1, 770, textureX, textureY); // Box 59
		gun_6_Model[0][17] = new ModelRendererTurbo(this, 33, 770, textureX, textureY); // Box 61
		gun_6_Model[0][18] = new ModelRendererTurbo(this, 65, 770, textureX, textureY); // Box 62
		gun_6_Model[0][19] = new ModelRendererTurbo(this, 97, 770, textureX, textureY); // Box 63
		gun_6_Model[0][20] = new ModelRendererTurbo(this, 265, 770, textureX, textureY); // Box 64
		gun_6_Model[0][21] = new ModelRendererTurbo(this, 297, 770, textureX, textureY); // Box 65
		gun_6_Model[0][22] = new ModelRendererTurbo(this, 321, 770, textureX, textureY); // Box 66
		gun_6_Model[0][23] = new ModelRendererTurbo(this, 345, 770, textureX, textureY); // Box 67
		gun_6_Model[0][24] = new ModelRendererTurbo(this, 425, 762, textureX, textureY); // Box 68
		gun_6_Model[0][25] = new ModelRendererTurbo(this, 137, 754, textureX, textureY); // Box 73
		gun_6_Model[0][26] = new ModelRendererTurbo(this, 177, 754, textureX, textureY); // Box 74
		gun_6_Model[0][27] = new ModelRendererTurbo(this, 209, 754, textureX, textureY); // Box 75
		gun_6_Model[0][28] = new ModelRendererTurbo(this, 337, 754, textureX, textureY); // Box 76
		gun_6_Model[0][29] = new ModelRendererTurbo(this, 385, 754, textureX, textureY); // Box 77
		gun_6_Model[0][30] = new ModelRendererTurbo(this, 433, 754, textureX, textureY); // Box 78
		gun_6_Model[0][31] = new ModelRendererTurbo(this, 505, 754, textureX, textureY); // Box 79
		gun_6_Model[0][32] = new ModelRendererTurbo(this, 89, 762, textureX, textureY); // Box 80

		gun_6_Model[0][0].addBox(-8.5F, -1F, -5F, 17, 2, 10, 0F); // Box 0

		gun_6_Model[0][1].addShapeBox(-8.5F, -1F, -9F, 17, 2, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1

		gun_6_Model[0][2].addShapeBox(-8.5F, -1F, 5F, 17, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 2

		gun_6_Model[0][3].addShapeBox(-10.5F, -12F, -7F, 4, 9, 14, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1.1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, -4F); // Box 3

		gun_6_Model[0][4].addShapeBox(-6.5F, -15F, -4F, 9, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9

		gun_6_Model[0][5].addShapeBox(-10.5F, -14F, -7F, 4, 2, 14, 0F,-2F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, -1F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F); // Box 13

		gun_6_Model[0][6].addShapeBox(-6.5F, -13F, -3F, 10, 10, 6, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_6_Model[0][7].addShapeBox(3.5F, -13F, -3F, 4, 10, 6, 0F,0F, 0.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16

		gun_6_Model[0][8].addShapeBox(-6.5F, -13F, -6F, 5, 1, 2, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18

		gun_6_Model[0][9].addShapeBox(-6.5F, -13.5F, -6F, 5, 1, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 19

		gun_6_Model[0][10].addShapeBox(-6.5F, -14F, -6F, 5, 1, 2, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 20

		gun_6_Model[0][11].addShapeBox(8.80000000000001F, -8.5F, -3.5F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 26

		gun_6_Model[0][12].addShapeBox(7.80000000000001F, -10.5F, -3.5F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 54

		gun_6_Model[0][13].addShapeBox(2.5F, -9F, -9F, 6, 6, 7, 0F,0F, 0F, -3F, 1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -0.8F, -5F, 1F, -0.8F, 0F, 0F, 0F, 0F); // Box 56

		gun_6_Model[0][14].addShapeBox(-6.5F, -12F, -9F, 9, 9, 6, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57

		gun_6_Model[0][15].addShapeBox(2.5F, -12F, -9F, 6, 3, 7, 0F,0F, 0F, -3F, -1.8F, 0F, -5F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -5F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 58

		gun_6_Model[0][16].addShapeBox(2.5F, -15F, -9F, 6, 3, 7, 0F,0F, -1F, -5F, -4F, -1F, -5F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, -1.8F, 0F, -5F, -1.8F, 0F, 0F, 0F, 0F, 0F); // Box 59

		gun_6_Model[0][17].addShapeBox(2.5F, -9F, 2F, 6, 6, 7, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, -5F, 0F, 0F, -3F); // Box 61

		gun_6_Model[0][18].addShapeBox(2.5F, -12F, 3F, 6, 3, 7, 0F,0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -5F, 0F, 0F, -3F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -3F); // Box 62

		gun_6_Model[0][19].addShapeBox(2.5F, -15F, 2F, 6, 3, 7, 0F,0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, -5F, 0F, -1F, -4F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -5F, 0F, 0F, -3F); // Box 63

		gun_6_Model[0][20].addShapeBox(-6.5F, -12F, 3F, 9, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 64

		gun_6_Model[0][21].addShapeBox(-1.5F, -15F, 2F, 4, 3, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.5F); // Box 65

		gun_6_Model[0][22].addShapeBox(-5.5F, -15F, 2F, 4, 3, 7, 0F,1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -3.5F, 1F, -1F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 1F, 0F, -2F); // Box 66

		gun_6_Model[0][23].addBox(-4.5F, -4F, -4F, 9, 4, 8, 0F); // Box 67

		gun_6_Model[0][24].addShapeBox(-6F, -14.5F, -6F, 4, 1, 2, 0F,-1.2F, -0.55F, 0F, -1.2F, -0.55F, 0F, -1.2F, -0.55F, 0F, -1.2F, -0.55F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 68

		gun_6_Model[0][25].addShapeBox(6.40000000000001F, -12F, -3.5F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 73

		gun_6_Model[0][26].addShapeBox(4.90000000000001F, -13.5F, -3.5F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 74

		gun_6_Model[0][27].addShapeBox(4.90000000000001F, -13.5F, 2.5F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 75

		gun_6_Model[0][28].addShapeBox(6.40000000000001F, -12F, 2.5F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 76

		gun_6_Model[0][29].addShapeBox(7.80000000000001F, -10.5F, 2.5F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 77

		gun_6_Model[0][30].addShapeBox(8.80000000000001F, -6.5F, -3.5F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 78

		gun_6_Model[0][31].addShapeBox(8.80000000000001F, -6.5F, 2.5F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 79

		gun_6_Model[0][32].addShapeBox(8.80000000000001F, -8.5F, 2.5F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 80

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(135F, 0F, 0F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[6];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 441, 754, textureX, textureY); // Box 36
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 57, 762, textureX, textureY); // Box 37
		gun_6_Model[1][2] = new ModelRendererTurbo(this, 97, 762, textureX, textureY); // Box 38
		gun_6_Model[1][3] = new ModelRendererTurbo(this, 241, 754, textureX, textureY); // Box 50
		gun_6_Model[1][4] = new ModelRendererTurbo(this, 489, 754, textureX, textureY); // Box 52
		gun_6_Model[1][5] = new ModelRendererTurbo(this, 25, 770, textureX, textureY); // Box 72

		gun_6_Model[1][0].addShapeBox(7.5F, -11F, -1.5F, 19, 1, 3, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 36

		gun_6_Model[1][1].addShapeBox(12.5F, -12F, -1.5F, 14, 1, 3, 0F,0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 37

		gun_6_Model[1][2].addShapeBox(14.5F, -10F, -1.5F, 12, 1, 3, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F); // Box 38

		gun_6_Model[1][3].addShapeBox(25.5F, -11F, -1.5F, 3, 1, 3, 0F,0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 50

		gun_6_Model[1][4].addShapeBox(25.5F, -10F, -1.5F, 3, 1, 3, 0F,0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.4F, -0.85F, 0F, -0.4F, -0.85F, 0F, -0.4F, -0.85F, 0F, -0.4F, -0.85F); // Box 52

		gun_6_Model[1][5].addShapeBox(25.5F, -12F, -1.5F, 3, 1, 3, 0F,0F, -0.4F, -0.85F, 0F, -0.4F, -0.85F, 0F, -0.4F, -0.85F, 0F, -0.4F, -0.85F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 72

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(135F, 0F, 0F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[13];
		gun_6_Model[2][0] = new ModelRendererTurbo(this, 297, 754, textureX, textureY); // Box 33
		gun_6_Model[2][1] = new ModelRendererTurbo(this, 345, 754, textureX, textureY); // Box 34
		gun_6_Model[2][2] = new ModelRendererTurbo(this, 393, 754, textureX, textureY); // Box 35
		gun_6_Model[2][3] = new ModelRendererTurbo(this, 273, 762, textureX, textureY); // Box 46
		gun_6_Model[2][4] = new ModelRendererTurbo(this, 313, 762, textureX, textureY); // Box 48
		gun_6_Model[2][5] = new ModelRendererTurbo(this, 353, 762, textureX, textureY); // Box 49
		gun_6_Model[2][6] = new ModelRendererTurbo(this, 153, 762, textureX, textureY); // Box 57
		gun_6_Model[2][7] = new ModelRendererTurbo(this, 129, 762, textureX, textureY); // Box 58
		gun_6_Model[2][8] = new ModelRendererTurbo(this, 193, 762, textureX, textureY); // Box 59
		gun_6_Model[2][9] = new ModelRendererTurbo(this, 393, 762, textureX, textureY); // Box 60
		gun_6_Model[2][10] = new ModelRendererTurbo(this, 489, 762, textureX, textureY); // Box 69
		gun_6_Model[2][11] = new ModelRendererTurbo(this, 377, 770, textureX, textureY); // Box 70
		gun_6_Model[2][12] = new ModelRendererTurbo(this, 489, 770, textureX, textureY); // Box 71

		gun_6_Model[2][0].addBox(-3.5F, -11F, -1.5F, 17, 1, 3, 0F); // Box 33

		gun_6_Model[2][1].addShapeBox(-3.5F, -12F, -1.5F, 17, 1, 3, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34

		gun_6_Model[2][2].addShapeBox(-3.5F, -10F, -1.5F, 17, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 35

		gun_6_Model[2][3].addShapeBox(-3.5F, -9F, -1.5F, 15, 1, 3, 0F,0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 46

		gun_6_Model[2][4].addShapeBox(-3.5F, -9.59999999999999F, -1.5F, 15, 1, 3, 0F,0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 48

		gun_6_Model[2][5].addShapeBox(-3.5F, -8F, -1.5F, 15, 1, 3, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F); // Box 49

		gun_6_Model[2][6].addShapeBox(6.5F, -13.5F, -1.5F, 10, 1, 3, 0F,0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 57

		gun_6_Model[2][7].addShapeBox(15.5F, -12.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58

		gun_6_Model[2][8].addBox(15.5F, -11.5F, -1.5F, 1, 1, 3, 0F); // Box 59

		gun_6_Model[2][9].addShapeBox(15.5F, -10.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 60

		gun_6_Model[2][10].addShapeBox(1.5F, -14.1F, -1.5F, 6, 1, 3, 0F,0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 69

		gun_6_Model[2][11].addShapeBox(1.5F, -13.5F, -1.5F, 6, 1, 3, 0F,0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 70

		gun_6_Model[2][12].addShapeBox(1.5F, -12.5F, -1.5F, 6, 1, 3, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F); // Box 71

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[2])
		{
			gunPart.setRotationPoint(135F, 0F, 0F);
		}


		registerGunModel("PassengerGun6", gun_6_Model);
	}
}