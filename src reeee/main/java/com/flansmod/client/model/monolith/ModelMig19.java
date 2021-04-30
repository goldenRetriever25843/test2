//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.11.2016 - 10:59:04
// Last changed on: 17.11.2016 - 10:59:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMig19 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMig19() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[218];
		noseModel = new ModelRendererTurbo[49];
		tailModel = new ModelRendererTurbo[8];
		bayModel = new ModelRendererTurbo[108];
		leftWingModel = new ModelRendererTurbo[15];
		rightWingModel = new ModelRendererTurbo[15];
		bodyWheelModel = new ModelRendererTurbo[19];
		leftWingWheelModel = new ModelRendererTurbo[10];
		rightWingWheelModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initbayModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 58
		bodyModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 60
		bodyModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 61
		bodyModel[3] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 62
		bodyModel[4] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 63
		bodyModel[5] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 64
		bodyModel[6] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 65
		bodyModel[7] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 66
		bodyModel[8] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 67
		bodyModel[9] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 68
		bodyModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 69
		bodyModel[11] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 70
		bodyModel[12] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 71
		bodyModel[13] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 72
		bodyModel[14] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 73
		bodyModel[15] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Box 74
		bodyModel[16] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 75
		bodyModel[17] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 76
		bodyModel[18] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Box 77
		bodyModel[19] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 78
		bodyModel[20] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 79
		bodyModel[21] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 80
		bodyModel[22] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Box 81
		bodyModel[23] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 82
		bodyModel[24] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 83
		bodyModel[25] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 84
		bodyModel[26] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 85
		bodyModel[27] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 86
		bodyModel[28] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 87
		bodyModel[29] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 88
		bodyModel[30] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 89
		bodyModel[31] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 90
		bodyModel[32] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 91
		bodyModel[33] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 92
		bodyModel[34] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 93
		bodyModel[35] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 95
		bodyModel[36] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 96
		bodyModel[37] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 97
		bodyModel[38] = new ModelRendererTurbo(this, 889, 113, textureX, textureY); // Box 98
		bodyModel[39] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 100
		bodyModel[41] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 102
		bodyModel[43] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 104
		bodyModel[44] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 105
		bodyModel[45] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 108
		bodyModel[46] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 109
		bodyModel[47] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 110
		bodyModel[48] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 111
		bodyModel[49] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 113
		bodyModel[50] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 114
		bodyModel[51] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 115
		bodyModel[52] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 116
		bodyModel[53] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 117
		bodyModel[54] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 118
		bodyModel[55] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 121
		bodyModel[56] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 122
		bodyModel[57] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 123
		bodyModel[58] = new ModelRendererTurbo(this, 817, 121, textureX, textureY); // Box 124
		bodyModel[59] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 125
		bodyModel[60] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 126
		bodyModel[61] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 127
		bodyModel[62] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 128
		bodyModel[63] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 129
		bodyModel[64] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 130
		bodyModel[65] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 131
		bodyModel[66] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 132
		bodyModel[67] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 144
		bodyModel[68] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 145
		bodyModel[69] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 146
		bodyModel[70] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 149
		bodyModel[71] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Box 150
		bodyModel[72] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Box 151
		bodyModel[73] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Box 152
		bodyModel[74] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 153
		bodyModel[75] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 154
		bodyModel[76] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 155
		bodyModel[77] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 223
		bodyModel[78] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 224
		bodyModel[79] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 225
		bodyModel[80] = new ModelRendererTurbo(this, 801, 193, textureX, textureY); // Box 227
		bodyModel[81] = new ModelRendererTurbo(this, 913, 193, textureX, textureY); // Box 229
		bodyModel[82] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 232
		bodyModel[83] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Box 233
		bodyModel[84] = new ModelRendererTurbo(this, 169, 257, textureX, textureY); // Box 141
		bodyModel[85] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 145
		bodyModel[86] = new ModelRendererTurbo(this, 921, 249, textureX, textureY); // Box 146
		bodyModel[87] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Box 149
		bodyModel[88] = new ModelRendererTurbo(this, 57, 281, textureX, textureY); // Box 150
		bodyModel[89] = new ModelRendererTurbo(this, 777, 265, textureX, textureY); // Box 151
		bodyModel[90] = new ModelRendererTurbo(this, 841, 289, textureX, textureY); // Box 152
		bodyModel[91] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Box 153
		bodyModel[92] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 154
		bodyModel[93] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 155
		bodyModel[94] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 156
		bodyModel[95] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Box 157
		bodyModel[96] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 158
		bodyModel[97] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 159
		bodyModel[98] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 160
		bodyModel[99] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 161
		bodyModel[100] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 162
		bodyModel[101] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 163
		bodyModel[102] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 164
		bodyModel[103] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 165
		bodyModel[104] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 166
		bodyModel[105] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 167
		bodyModel[106] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 168
		bodyModel[107] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 169
		bodyModel[108] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 170
		bodyModel[109] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Box 171
		bodyModel[110] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 172
		bodyModel[111] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 173
		bodyModel[112] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 174
		bodyModel[113] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 175
		bodyModel[114] = new ModelRendererTurbo(this, 585, 89, textureX, textureY); // Box 176
		bodyModel[115] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Box 177
		bodyModel[116] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 178
		bodyModel[117] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Box 188
		bodyModel[118] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Box 191
		bodyModel[119] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 192
		bodyModel[120] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 193
		bodyModel[121] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 194
		bodyModel[122] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 195
		bodyModel[123] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 196
		bodyModel[124] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 197
		bodyModel[125] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 198
		bodyModel[126] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 199
		bodyModel[127] = new ModelRendererTurbo(this, 521, 49, textureX, textureY); // Box 200
		bodyModel[128] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 201
		bodyModel[129] = new ModelRendererTurbo(this, 865, 97, textureX, textureY); // Box 202
		bodyModel[130] = new ModelRendererTurbo(this, 905, 297, textureX, textureY); // Box 242
		bodyModel[131] = new ModelRendererTurbo(this, 961, 161, textureX, textureY); // Box 243
		bodyModel[132] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 244
		bodyModel[133] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 245
		bodyModel[134] = new ModelRendererTurbo(this, 617, 169, textureX, textureY); // Box 246
		bodyModel[135] = new ModelRendererTurbo(this, 993, 169, textureX, textureY); // Box 247
		bodyModel[136] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 248
		bodyModel[137] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 249
		bodyModel[138] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 250
		bodyModel[139] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 251
		bodyModel[140] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 252
		bodyModel[141] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 253
		bodyModel[142] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 271
		bodyModel[143] = new ModelRendererTurbo(this, 881, 193, textureX, textureY); // Box 273
		bodyModel[144] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Box 287
		bodyModel[145] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 288
		bodyModel[146] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 289
		bodyModel[147] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 290
		bodyModel[148] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 314
		bodyModel[149] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 315
		bodyModel[150] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 319
		bodyModel[151] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 320
		bodyModel[152] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 321
		bodyModel[153] = new ModelRendererTurbo(this, 649, 177, textureX, textureY); // Box 322
		bodyModel[154] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 323
		bodyModel[155] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 324
		bodyModel[156] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 325
		bodyModel[157] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 326
		bodyModel[158] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 327
		bodyModel[159] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 328
		bodyModel[160] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 329
		bodyModel[161] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 330
		bodyModel[162] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 331
		bodyModel[163] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 332
		bodyModel[164] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Box 345
		bodyModel[165] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 347
		bodyModel[166] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 348
		bodyModel[167] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 349
		bodyModel[168] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Box 350
		bodyModel[169] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 351
		bodyModel[170] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 352
		bodyModel[171] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 353
		bodyModel[172] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 356
		bodyModel[173] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 359
		bodyModel[174] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 361
		bodyModel[175] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 362
		bodyModel[176] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 363
		bodyModel[177] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 365
		bodyModel[178] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 366
		bodyModel[179] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 367
		bodyModel[180] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 368
		bodyModel[181] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 370
		bodyModel[182] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 378
		bodyModel[183] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 379
		bodyModel[184] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 380
		bodyModel[185] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 381
		bodyModel[186] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 382
		bodyModel[187] = new ModelRendererTurbo(this, 697, 105, textureX, textureY); // Box 383
		bodyModel[188] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 384
		bodyModel[189] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 385
		bodyModel[190] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 386
		bodyModel[191] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 387
		bodyModel[192] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 388
		bodyModel[193] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 389
		bodyModel[194] = new ModelRendererTurbo(this, 993, 161, textureX, textureY); // Box 399
		bodyModel[195] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 400
		bodyModel[196] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 401
		bodyModel[197] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 402
		bodyModel[198] = new ModelRendererTurbo(this, 585, 73, textureX, textureY); // Box 403
		bodyModel[199] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 404
		bodyModel[200] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 405
		bodyModel[201] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 406
		bodyModel[202] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 407
		bodyModel[203] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Box 408
		bodyModel[204] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Box 409
		bodyModel[205] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 410
		bodyModel[206] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 411
		bodyModel[207] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 413
		bodyModel[208] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 414
		bodyModel[209] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 415
		bodyModel[210] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 418
		bodyModel[211] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 421
		bodyModel[212] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 422
		bodyModel[213] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 424
		bodyModel[214] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 425
		bodyModel[215] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 426
		bodyModel[216] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 427
		bodyModel[217] = new ModelRendererTurbo(this, 185, 305, textureX, textureY); // Box 428

		bodyModel[0].addShapeBox(0F, 0F, 0F, 73, 8, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F); // Box 58
		bodyModel[0].setRotationPoint(-55F, -25.5F, -14.15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 38, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -0.5F); // Box 60
		bodyModel[1].setRotationPoint(18F, -25.5F, -14.15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 8, 26, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -0.5F); // Box 61
		bodyModel[2].setRotationPoint(56F, -25.5F, -13.15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 13, 8, 23, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F); // Box 62
		bodyModel[3].setRotationPoint(76F, -25.5F, -11.65F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 13, 8, 22, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F); // Box 63
		bodyModel[4].setRotationPoint(89F, -25.5F, -11.15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 73, 7, 27, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F); // Box 64
		bodyModel[5].setRotationPoint(-55F, -32.25F, -14.15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 38, 7, 28, 0F,0F, 0F, -3F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -3.5F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F); // Box 65
		bodyModel[6].setRotationPoint(18F, -32.25F, -14.15F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 20, 7, 28, 0F,0F, 0F, -4.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -1.5F); // Box 66
		bodyModel[7].setRotationPoint(56F, -32.25F, -14.15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 13, 7, 28, 0F,0F, 0F, -6F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -6F, 0F, -0.25F, -2F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2F); // Box 67
		bodyModel[8].setRotationPoint(76F, -32.25F, -14.15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 13, 7, 28, 0F,0F, -1F, -7F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, -1F, -7F, 0F, -0.25F, -2.5F, 0F, -0.25F, -3.5F, 0F, -0.25F, -3.5F, 0F, -0.25F, -2.5F); // Box 68
		bodyModel[9].setRotationPoint(89F, -32.25F, -14.15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 13, 7, 28, 0F,0F, -0.2F, -2.5F, 0F, -0.2F, -3.5F, 0F, -0.2F, -3.5F, 0F, -0.2F, -2.5F, 0F, -1F, -7F, 0F, -2F, -8F, 0F, -2F, -8.05F, 0F, -1F, -7F); // Box 69
		bodyModel[10].setRotationPoint(89F, -17.9F, -14.15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 7, 28, 0F,0F, -0.2F, -2F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2.5F, 0F, -0.2F, -2F, 0F, 0F, -6F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -6F); // Box 70
		bodyModel[11].setRotationPoint(76F, -17.9F, -14.15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 7, 28, 0F,0F, -0.2F, -1.5F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -1.5F, 0F, 0F, -5.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -5.5F); // Box 71
		bodyModel[12].setRotationPoint(56F, -17.9F, -14.15F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 38, 7, 28, 0F,0F, -0.2F, 0F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -0.5F, 0F, 0F, -4F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -4.5F); // Box 72
		bodyModel[13].setRotationPoint(18F, -17.9F, -14.15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 73, 7, 27, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.5F, 0F, 0F, -4F); // Box 73
		bodyModel[14].setRotationPoint(-55F, -17.9F, -14.15F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 73, 4, 27, 0F,0F, 0F, -7.5F, 0F, -0.05F, -7.5F, 0F, -0.05F, -7F, 0F, 0F, -7.5F, 0F, -0.2F, -4F, 0F, -0.2F, -3F, 0F, -0.2F, -2.5F, 0F, -0.2F, -4F); // Box 74
		bodyModel[15].setRotationPoint(-55F, -36.05F, -14.15F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 38, 4, 28, 0F,0F, 0F, -7.5F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, -8F, 0F, -0.25F, -3F, 0F, -0.25F, -4.5F, 0F, -0.25F, -4.5F, 0F, -0.25F, -3.5F); // Box 75
		bodyModel[16].setRotationPoint(18F, -36F, -14.15F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 20, 4, 28, 0F,0F, 0F, -10.5F, 0F, -1F, -11F, 0F, -1F, -10.5F, 0F, 0F, -10.5F, 0F, -0.25F, -4.5F, 0F, -0.25F, -6F, 0F, -0.25F, -6F, 0F, -0.25F, -4.5F); // Box 76
		bodyModel[17].setRotationPoint(56F, -36F, -14.15F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 13, 7, 28, 0F,0F, -0.25F, -11F, 0F, -1.8F, -11.25F, 0F, -1.8F, -10.75F, 0F, -0.25F, -10.5F, 0F, -4F, -6F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, -4F, -6F); // Box 77
		bodyModel[18].setRotationPoint(76F, -35.25F, -14.15F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 73, 4, 27, 0F,0F, -0.2F, -4F, 0F, -0.2F, -4F, 0F, -0.2F, -3.5F, 0F, -0.2F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -8.5F, 0F, 0F, -9F); // Box 78
		bodyModel[19].setRotationPoint(-55F, -11.1F, -14.15F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 38, 4, 28, 0F,0F, -0.2F, -4F, 0F, -0.2F, -5.5F, 0F, -0.2F, -5.5F, 0F, -0.2F, -4.5F, 0F, 0F, -9F, 0F, -0.5F, -11.5F, 0F, -0.5F, -11.5F, 0F, 0F, -9.5F); // Box 79
		bodyModel[20].setRotationPoint(18F, -11.1F, -14.15F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 20, 4, 28, 0F,0F, -0.2F, -5.5F, 0F, -0.2F, -6F, 0F, -0.2F, -6F, 0F, -0.2F, -5.5F, 0F, -0.5F, -11.5F, 0F, -1F, -11.5F, 0F, -1F, -11.5F, 0F, -0.5F, -11.5F); // Box 80
		bodyModel[21].setRotationPoint(56F, -11.1F, -14.15F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 4, 28, 0F,0F, -1F, -6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -6F, 0F, -0.2F, -11.5F, 0F, -1.5F, -12F, 0F, -1.5F, -12F, 0F, -0.2F, -11.5F); // Box 81
		bodyModel[22].setRotationPoint(76F, -11.9F, -14.15F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 4, 28, 0F,0F, -0.2F, -7F, 0F, 0.8F, -8F, 0F, 0.8F, -8F, 0F, -0.2F, -7F, 0F, -1.3F, -12F, 0F, -3.7F, -12F, 0F, -3.7F, -12F, 0F, -1.3F, -12F); // Box 82
		bodyModel[23].setRotationPoint(89F, -12.1F, -14.15F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 13, 3, 28, 0F,0F, -0.55F, -11.3F, 0F, -2F, -11.5F, 0F, -2F, -11F, 0F, -0.55F, -10.75F, 0F, -0.25F, -7F, 0F, 0.75F, -8F, 0F, 0.75F, -8F, 0F, -0.25F, -7F); // Box 83
		bodyModel[24].setRotationPoint(89F, -34F, -14.15F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 38, 1, 28, 0F,0F, 0.3F, -11.5F, 0F, -1F, -10.5F, 0F, -1F, -10.5F, 0F, 0.3F, -12F, 0F, 0F, -7.5F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, -8F); // Box 84
		bodyModel[25].setRotationPoint(18F, -37F, -14.15F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 63, 1, 27, 0F,0F, 0.5F, -13F, 0F, 0.25F, -11.5F, 0F, 0.25F, -11F, 0F, 0.5F, -13F, 10F, 0F, -7.5F, 0F, 0.05F, -7.5F, 0F, 0.05F, -7F, 10F, 0F, -7.5F); // Box 85
		bodyModel[26].setRotationPoint(-45F, -37.05F, -14.15F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 19, 8, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, 1F); // Box 86
		bodyModel[27].setRotationPoint(-74F, -25.5F, -14.15F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 19, 8, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F); // Box 87
		bodyModel[28].setRotationPoint(-74F, -25.5F, 6.35F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 19, 7, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F); // Box 88
		bodyModel[29].setRotationPoint(-74F, -32.25F, 6.35F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 19, 7, 6, 0F,0F, 0F, -4F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 89
		bodyModel[30].setRotationPoint(-74F, -32.25F, -13.65F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 19, 7, 6, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, -3.5F, 0F, 0.05F, -3.5F); // Box 90
		bodyModel[31].setRotationPoint(-74F, -17.95F, 6.35F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 19, 7, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.05F, -3.5F, 0F, 0.05F, -3.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F); // Box 91
		bodyModel[32].setRotationPoint(-74F, -17.95F, -13.65F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 19, 4, 27, 0F,0F, -0.2F, -4F, 0F, -0.2F, -4F, 0F, -0.2F, -4F, 0F, -0.2F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 92
		bodyModel[33].setRotationPoint(-74F, -11.1F, -14.15F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 19, 4, 5, 0F,0F, -1.6F, 0.95F, 0F, -0.25F, 1.1F, 0F, 0.05F, -6F, 0F, -1.6F, -5.4F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -2.5F, 0F, -0.25F, -3F); // Box 93
		bodyModel[34].setRotationPoint(-74F, -36F, 6.35F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 19, 4, 5, 0F,0F, -1.6F, -5.5F, 0F, 0.05F, -6F, 0F, -0.25F, 1.15F, 0F, -1.6F, 1F, 0F, -0.25F, -3F, 0F, -0.25F, -2.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 95
		bodyModel[35].setRotationPoint(-74F, -36F, -12.65F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 25, 7, 6, 0F,0F, -0.8F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 96
		bodyModel[36].setRotationPoint(-98.5F, -32.25F, -13.65F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 25, 7, 6, 0F,0F, -0.8F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -4F, 0F, -0.8F, -4F, 0F, 0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, 0F, 0.25F, -0.5F); // Box 97
		bodyModel[37].setRotationPoint(-98.5F, -32.25F, 6.35F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 24, 8, 6, 0F,0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0.5F, -0.2F, 0F); // Box 98
		bodyModel[38].setRotationPoint(-98F, -25.5F, 5.85F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 24, 8, 6, 0F,0.5F, -0.5F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.2F, 0.2F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 99
		bodyModel[39].setRotationPoint(-98F, -25.5F, -13.15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 25, 7, 6, 0F,0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.45F, 0.5F, -0.5F, -0.45F, 0.5F, -0.5F, -0.45F, -3.5F, 0F, -0.45F, -3.5F); // Box 100
		bodyModel[40].setRotationPoint(-98.5F, -17.45F, 6.35F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 25, 7, 6, 0F,0F, 0.25F, -0.3F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.45F, -3.5F, -0.5F, -0.45F, -3.5F, -0.5F, -0.45F, 0.5F, 0F, -0.45F, 0.5F); // Box 101
		bodyModel[41].setRotationPoint(-98.5F, -17.45F, -13.65F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 25, 4, 27, 0F,0F, -0.2F, -4F, -0.5F, -0.2F, -4F, -0.5F, -0.2F, -4F, 0F, -0.2F, -4F, 0F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, 0F, 0F, -9F); // Box 102
		bodyModel[42].setRotationPoint(-98.5F, -11.1F, -14.15F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 25, 3, 6, 0F,0F, -0.8F, 2.5F, -0.5F, -0.3F, 0.95F, -0.5F, -0.3F, -6.4F, 0F, -0.8F, -7F, 0F, 0.25F, 0.5F, -0.5F, -0.55F, 0.5F, -0.5F, -0.55F, -4F, 0F, 0.25F, -4F); // Box 104
		bodyModel[43].setRotationPoint(-98.5F, -34.7F, 6.35F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 25, 3, 6, 0F,0F, -0.8F, -7F, -0.5F, -0.3F, -6.5F, -0.5F, -0.3F, 1F, 0F, -0.8F, 2.5F, 0F, 0.25F, -4F, -0.5F, -0.55F, -4F, -0.5F, -0.55F, 0.5F, 0F, 0.25F, 0.5F); // Box 105
		bodyModel[44].setRotationPoint(-98.5F, -34.7F, -13.65F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 1, 27, 0F,0F, 0.2F, -13F, 0F, 0.45F, -11.6F, 0F, 0.45F, -11.6F, 0F, 0.2F, -13F, 0F, 0.15F, -7.5F, 7F, -0.18F, -7.18F, 7.1F, -0.19F, -7.1F, 0F, 0.15F, -7.5F); // Box 108
		bodyModel[45].setRotationPoint(-98.5F, -35.05F, -14.15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 21, 21, 14, 0F,0.5F, -0.5F, 0.2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F); // Box 109
		bodyModel[46].setRotationPoint(-106.5F, -32F, -7.15F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0.5F, -0.5F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0.5F, -0.5F, 0F, 0.5F, 0.1F, 2.2F, 0F, 0.1F, 2.5F, 0F, 0.1F, 2.5F, 0.5F, 0.1F, 2.5F); // Box 110
		bodyModel[47].setRotationPoint(-98F, -34.5F, -5.15F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 13, 8, 2, 0F,0F, 0F, 0.5F, 0.5F, -2F, -1.5F, 0.5F, -2F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, 0.5F, 0.5F, -3.2F, -1.5F, 0.5F, -3.2F, 0F, 0F, -0.2F, -0.5F); // Box 111
		bodyModel[48].setRotationPoint(102F, -25.5F, -10.15F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 8, 2, 0F,0F, 0F, -1.5F, 0.5F, -2F, -0.5F, 0.5F, -2F, -1F, 0F, 0F, 0.5F, 0F, -0.2F, -1.5F, 0.5F, -3.2F, -0.5F, 0.5F, -3.2F, -1F, 0F, -0.2F, 0.5F); // Box 113
		bodyModel[49].setRotationPoint(102F, -25.5F, 7.85F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 13, 9, 2, 0F,0F, 0F, 2.5F, 0.5F, -3.5F, 2F, 0.5F, -3.5F, -3.5F, 0F, -0.05F, -4F, 0F, -4.2F, -1.5F, 0.5F, -2.2F, -0.5F, 0.5F, -2.2F, -1F, 0F, -4.2F, 0.5F); // Box 114
		bodyModel[50].setRotationPoint(102F, -30.3F, 7.85F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 13, 9, 2, 0F,0F, -5.2F, -1.5F, 0.5F, -2.2F, -0.5F, 0.5F, -2.2F, -1F, 0F, -5.2F, 0.5F, 0F, 1F, 3.5F, 0.5F, -3.5F, 2F, 0.5F, -3.5F, -3.5F, 0F, 1F, -4.05F); // Box 115
		bodyModel[51].setRotationPoint(102F, -22.9F, 7.85F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 13, 9, 2, 0F,0F, 0F, -3.55F, 0.5F, -3.5F, -3.5F, 0.5F, -3.5F, 2F, 0F, 0F, 2.5F, 0F, -4.2F, 1F, 0.5F, -2.2F, -1F, 0.5F, -2.2F, -0.5F, 0F, -4.2F, -1F); // Box 116
		bodyModel[52].setRotationPoint(102F, -30.3F, -9.65F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 13, 9, 2, 0F,0F, -5.2F, 1F, 0.5F, -2.2F, -1F, 0.5F, -2.2F, -0.5F, 0F, -5.2F, -1F, 0F, 1F, -3.5F, 0.5F, -3.5F, -3.5F, 0.5F, -3.5F, 2F, 0F, 1F, 2.5F); // Box 117
		bodyModel[53].setRotationPoint(102F, -22.9F, -9.65F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 13, 9, 2, 0F,0F, 0F, 1.5F, 0.5F, -3.5F, 2F, 0.5F, -3.5F, 4F, 0F, 0F, 3.45F, 0F, -4.2F, -1F, 0.5F, -2.2F, -0.5F, 0.5F, -2.2F, 1F, 0F, -4.2F, 1F); // Box 118
		bodyModel[54].setRotationPoint(102F, -30.3F, -1.65F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 13, 9, 2, 0F,0F, -2.2F, -1.5F, 0.5F, -2.2F, -0.5F, 0.5F, -2.2F, 1F, 0F, -2.2F, 0.5F, 0F, 0F, 2.5F, 0.5F, -3.6F, 2F, 0.5F, -3.6F, 4F, 0F, 0F, 3.45F); // Box 121
		bodyModel[55].setRotationPoint(102F, -22.8F, -1.65F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 7, 2, 0F,0F, -0.2F, -1F, 0.5F, -2.2F, -0.5F, 0.5F, -2.2F, 1F, 0F, -0.2F, 1F, 0F, -1.9F, -1.5F, 0.5F, -1.9F, -0.5F, 0.5F, -1.9F, 1F, 0F, -1.9F, 0.45F); // Box 122
		bodyModel[56].setRotationPoint(102F, -25.7F, -1.65F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 13, 4, 28, 0F,0F, -0.15F, -8F, 0.5F, 4.35F, -8F, 0.5F, 4.35F, -7.5F, 0F, -0.15F, -8F, 0F, -2.75F, -12F, 0.5F, -6.7F, -12F, 0.5F, -6.7F, -12F, 0F, -2.75F, -12F); // Box 123
		bodyModel[57].setRotationPoint(102F, -13.05F, -14.15F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 13, 4, 28, 0F,0F, -2.1F, -11.5F, 0.5F, -5.1F, -12F, 0.5F, -5.1F, -12F, 0F, -2.1F, -11F, 0F, -0.2F, -8F, 0.5F, 3.3F, -8F, 0.5F, 3.3F, -7.5F, 0F, -0.15F, -8F); // Box 124
		bodyModel[58].setRotationPoint(102F, -34.1F, -14.15F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0F, 0F, 3.8F); // Box 125
		bodyModel[59].setRotationPoint(102F, -26.8F, -5.65F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 3.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.4F, 0F, 0F, 3.4F); // Box 126
		bodyModel[60].setRotationPoint(102F, -26.8F, 4.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 2.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0F, 0F, 3.8F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[61].setRotationPoint(102F, -18.4F, -5.65F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 3.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.4F, 0F, 0F, 3.4F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 128
		bodyModel[62].setRotationPoint(102F, -18.4F, 4.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F,0F, -3.5F, 2F, 11F, -4.2F, -2F, 11F, -4.2F, 0F, 0F, -3.5F, 4F, 0F, -2.2F, -0.5F, 5F, -2.2F, -1.5F, 5F, -2.2F, 0F, 0F, -2.2F, 1F); // Box 129
		bodyModel[63].setRotationPoint(115.5F, -30.3F, -1.65F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F,0F, -2.2F, -0.5F, 4.8F, -2.2F, -1.5F, 4.8F, -2.2F, 0F, 0F, -2.2F, 1F, 0F, -3.5F, 2F, 7.5F, -4F, -2F, 7.5F, -4F, 0F, 0F, -3.5F, 4F); // Box 130
		bodyModel[64].setRotationPoint(115.5F, -22.8F, -1.65F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 7, 2, 0F,0F, -2.2F, -0.5F, 1F, -2.2F, -1.5F, 1F, -2.2F, 0F, 0F, -2.2F, 1F, 0F, -1.9F, -0.5F, 0.8F, -1.9F, -1.5F, 0.8F, -1.9F, 0F, 0F, -1.9F, 1F); // Box 131
		bodyModel[65].setRotationPoint(115.5F, -25.7F, -1.65F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0.7F, 0.5F, 11F, -2F, -2F, 11F, -2F, 0F, 0F, 0.7F, 1.5F, 0F, -0.5F, 4.5F, 11F, 0.2F, -2F, 11F, 0.2F, 0F, 0F, -0.5F, 6F); // Box 132
		bodyModel[66].setRotationPoint(115.5F, -28.3F, -1.65F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, -0.5F); // Box 144
		bodyModel[67].setRotationPoint(-107F, -25.5F, 5.85F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F,-0.5F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, -4F, -0.5F, -0.8F, -5F, -0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -1F); // Box 145
		bodyModel[68].setRotationPoint(-107.5F, -32.25F, 6.35F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,-0.5F, -1F, 3F, 0F, -0.8F, 2.5F, 0F, -0.8F, -7F, -0.5F, -1F, -8F, -0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -4F, -0.5F, 0.25F, -5F); // Box 146
		bodyModel[69].setRotationPoint(-107.5F, -34.7F, 1.35F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F,-0.5F, -0.8F, -5F, 0F, -0.8F, -4F, 0F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, 0.25F, -1F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Box 149
		bodyModel[70].setRotationPoint(-107.5F, -32.25F, -13.65F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, -0.5F, 0.5F, -0.2F, 0.2F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 150
		bodyModel[71].setRotationPoint(-107F, -25.5F, -13.15F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F,-0.5F, 0.25F, -1F, 0F, 0.25F, -0.3F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.45F, -4.5F, 0F, -0.45F, -3.5F, 0F, -0.45F, 0.5F, -0.5F, -0.45F, 0.5F); // Box 151
		bodyModel[72].setRotationPoint(-107.5F, -17.45F, -13.65F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 4, 27, 0F,-0.5F, -0.2F, -5F, 0F, -0.2F, -4F, 0F, -0.2F, -4F, -0.5F, -0.2F, -5F, -0.5F, -1F, -10F, 0F, 0F, -9F, 0F, 0F, -9F, -0.5F, -1F, -10F); // Box 152
		bodyModel[73].setRotationPoint(-107.5F, -11.1F, -14.15F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F,-0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -1F, -0.5F, -0.45F, 0.5F, 0F, -0.45F, 0.5F, 0F, -0.45F, -3.5F, -0.5F, -0.45F, -4.5F); // Box 153
		bodyModel[74].setRotationPoint(-107.5F, -17.45F, 6.35F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 3, 14, 0F,-0.5F, -1F, -8F, 0F, -0.8F, -7F, 0F, -0.8F, -1.5F, -0.5F, -1F, -2F, -0.5F, 0.25F, -5F, 0F, 0.25F, -4F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Box 154
		bodyModel[75].setRotationPoint(-107.5F, -34.7F, -13.65F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 1, 27, 0F,0.5F, -0.6F, -13F, 0F, 0.2F, -13F, 0F, 0.2F, -13F, 0.5F, -0.6F, -13F, 0.5F, 0.35F, -8.5F, 0F, 0.15F, -7.5F, 0F, 0.15F, -7.5F, 0.5F, 0.35F, -8.5F); // Box 155
		bodyModel[76].setRotationPoint(-106.5F, -35.05F, -14.15F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 63, 1, 27, 0F,-9F, 0.8F, -13.4F, 0F, 1.2F, -13.5F, 0F, 1.2F, -12.5F, -9F, 0.8F, -13F, 0F, 0F, -12.5F, 0F, 0.05F, -11.5F, 0F, 0.05F, -11F, 0F, 0F, -12.5F); // Box 223
		bodyModel[77].setRotationPoint(-45F, -38.35F, -14.15F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 23, 1, 27, 0F,0F, 1.2F, -13.5F, -9F, 0.5F, -13.5F, -9F, 0.5F, -12.4F, 0F, 1.2F, -12.5F, 0F, 0.05F, -11.5F, 0F, 0.85F, -10.9F, 0F, 0.85F, -10.1F, 0F, 0.05F, -11F); // Box 224
		bodyModel[78].setRotationPoint(18F, -38.35F, -14.15F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 20, 4, 27, 0F,0F, 0F, -11F, -1.5F, 4F, -11F, -1.5F, 4F, -11.5F, 0F, 0F, -11.5F, 0F, -0.25F, -9.5F, 0F, 0.75F, -10F, 0F, 0.75F, -10.5F, 0F, -0.25F, -10.5F); // Box 225
		bodyModel[79].setRotationPoint(56F, -39.75F, -13.15F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 26, 4, 27, 0F,1.5F, 4.95F, -11F, 11F, -1F, -11F, 11F, -1F, -11.5F, 1.5F, 4.95F, -11.5F, 0F, -0.2F, -10F, 0F, 2.8F, -10.5F, 0F, 2.8F, -11F, 0F, -0.2F, -10.5F); // Box 227
		bodyModel[80].setRotationPoint(76F, -38.8F, -13.15F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 15, 4, 28, 0F,0.15F, -3.75F, -10.95F, -0.1F, -0.5F, -12.05F, -0.1F, -0.5F, -11.45F, 0.15F, -3.75F, -11.05F, 0.15F, -0.25F, -10.95F, 0F, 0.7F, -10.35F, -0.1F, 0.25F, -10.45F, 0.15F, -0.25F, -11F); // Box 229
		bodyModel[81].setRotationPoint(41.1F, -40.25F, -14.2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 16, 6, 28, 0F,-11F, 0F, -12F, 0.5F, -9.5F, -14F, 0.5F, -9.5F, -14F, -11F, 0F, -11.5F, 0F, -0.2F, -11.5F, 0.5F, 3.6F, -14F, 0.5F, 3.6F, -13.5F, 0.05F, -0.15F, -11F); // Box 232
		bodyModel[82].setRotationPoint(102F, -37.8F, -14.15F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 20, 4, 27, 0F,-1.5F, -5F, -12F, 3.6F, -2F, -11.1F, 3.6F, -2F, -11.6F, -1.5F, -5F, -12.5F, -1.5F, 4F, -11F, 0F, 0F, -11F, 0F, 0F, -11.5F, -1.5F, 4F, -11.5F); // Box 233
		bodyModel[83].setRotationPoint(54.5F, -47.75F, -13.15F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 15, 4, 28, 0F,7.9F, -5.5F, -13.15F, -0.1F, -1.25F, -13F, -0.1F, -1.25F, -12.45F, 7.9F, -5.5F, -13F, 0.15F, 3.5F, -10.95F, 0F, 0.25F, -12.05F, -0.1F, 0.25F, -11.45F, 0.15F, 3.5F, -11.05F); // Box 141
		bodyModel[84].setRotationPoint(41.1F, -44F, -14.2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 21, 2, 38, 0F,5F, 3F, 0F, 0F, 0F, 0.5F, 35F, -2F, -5F, -42F, -1F, -5F, 5F, 0F, 0F, 0F, 0F, 0.5F, 35F, 1F, -5F, -42F, 0F, -5F); // Box 145
		bodyModel[85].setRotationPoint(89F, -28.5F, 5.85F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 9, 2, 38, 0F,24F, 2F, 0F, -12.7F, 2.05F, 0.5F, 35F, -2F, -5F, -42F, -2.3F, -5F, 24F, -1F, 0F, -12.7F, 1F, 0.5F, 35F, 1F, -5F, -42F, 0.8F, -5F); // Box 146
		bodyModel[86].setRotationPoint(87F, -29.5F, 5.85F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 11, 2, 38, 0F,-7F, 1F, 0.5F, -1F, -0.5F, 0.5F, 38F, -1.3F, -5F, -42F, -1F, -5F, -7.5F, -1F, 0F, -1F, -1F, 0.5F, 38F, -0.6F, -5F, -42F, 0F, -5F); // Box 149
		bodyModel[87].setRotationPoint(103F, -27.5F, 5.85F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 21, 2, 38, 0F,-42F, -1F, -5F, 35F, -2F, -5F, 0F, 0F, 0.5F, 5F, 3F, 0F, -42F, 0F, -5F, 35F, 1F, -5F, 0F, 0F, 0.5F, 5F, 0F, 0F); // Box 150
		bodyModel[88].setRotationPoint(89F, -28.5F, -43.15F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 9, 2, 38, 0F,-42F, -2.3F, -5F, 35F, -2F, -5F, -12.7F, 2.05F, 0.5F, 24F, 2F, 0F, -42F, 0.8F, -5F, 35F, 1F, -5F, -12.7F, 1F, 0.5F, 24F, -1F, 0F); // Box 151
		bodyModel[89].setRotationPoint(87F, -29.5F, -43.15F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 11, 2, 38, 0F,-42F, -1F, -5F, 38F, -1.3F, -5F, -1F, -0.5F, 0.5F, -7F, 1F, 0.5F, -42F, 0F, -5F, 38F, -0.6F, -5F, -1F, -1F, 0.5F, -7.5F, -1F, 0F); // Box 152
		bodyModel[90].setRotationPoint(103F, -27.5F, -43.15F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 153
		bodyModel[91].setRotationPoint(129F, -27.5F, 39F);
		bodyModel[91].rotateAngleZ = -0.05235988F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 154
		bodyModel[92].setRotationPoint(124F, -27.75F, 39F);
		bodyModel[92].rotateAngleZ = -0.05235988F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 155
		bodyModel[93].setRotationPoint(151F, -26.35F, 39F);
		bodyModel[93].rotateAngleZ = -0.05235988F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 156
		bodyModel[94].setRotationPoint(151F, -26.35F, -40F);
		bodyModel[94].rotateAngleZ = -0.05235988F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 157
		bodyModel[95].setRotationPoint(124F, -27.75F, -40F);
		bodyModel[95].rotateAngleZ = -0.05235988F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 158
		bodyModel[96].setRotationPoint(129F, -27.5F, -40F);
		bodyModel[96].rotateAngleZ = -0.05235988F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[97].setRotationPoint(91F, -21.5F, -12.15F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[98].setRotationPoint(78F, -24.5F, -12.85F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F); // Box 161
		bodyModel[99].setRotationPoint(78F, -24.5F, 11.45F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F); // Box 162
		bodyModel[100].setRotationPoint(91F, -21.5F, 10.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[101].setRotationPoint(91F, -15.5F, -10.5F);
		bodyModel[101].rotateAngleX = 0.6981317F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F); // Box 164
		bodyModel[102].setRotationPoint(91F, -16F, 9F);
		bodyModel[102].rotateAngleX = -0.6981317F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F); // Box 165
		bodyModel[103].setRotationPoint(91F, -12.75F, 6F);
		bodyModel[103].rotateAngleX = -1.08210414F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[104].setRotationPoint(91F, -11.3F, -6F);
		bodyModel[104].rotateAngleX = 1.08210414F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F); // Box 167
		bodyModel[105].setRotationPoint(85.5F, -32.8F, 3F);
		bodyModel[105].rotateAngleX = 1.1693706F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[106].setRotationPoint(85.5F, -33.8F, -3F);
		bodyModel[106].rotateAngleX = -1.1693706F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, -1F); // Box 169
		bodyModel[107].setRotationPoint(-9.5F, -33.8F, 6F);
		bodyModel[107].rotateAngleX = 1.1693706F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[108].setRotationPoint(-9.5F, -35.5F, -7.5F);
		bodyModel[108].rotateAngleX = -1.1693706F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[109].setRotationPoint(18.5F, -33F, -11F);
		bodyModel[109].rotateAngleX = -0.9250245F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, 0F, -1F); // Box 172
		bodyModel[110].setRotationPoint(18.5F, -31.5F, 9F);
		bodyModel[110].rotateAngleX = 0.9250245F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F); // Box 173
		bodyModel[111].setRotationPoint(58F, -9F, -0.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 174
		bodyModel[112].setRotationPoint(42F, -9F, -0.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F); // Box 175
		bodyModel[113].setRotationPoint(31F, -9F, -0.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.5F, 0F); // Box 176
		bodyModel[114].setRotationPoint(20F, -11F, -0.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F); // Box 177
		bodyModel[115].setRotationPoint(76F, -11.5F, -0.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1.5F, 0F); // Box 178
		bodyModel[116].setRotationPoint(87F, -13.5F, -0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 188
		bodyModel[117].setRotationPoint(37F, -21F, 43.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[118].setRotationPoint(-57F, -21F, 15.2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 192
		bodyModel[119].setRotationPoint(-60F, -21F, 15.2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 193
		bodyModel[120].setRotationPoint(-63F, -21F, 15.2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0.5F, -0.15F, -0.15F, 0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0.5F, -0.15F, -0.15F); // Box 194
		bodyModel[121].setRotationPoint(-66F, -21F, 15.2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.5F, -0.5F); // Box 195
		bodyModel[122].setRotationPoint(-67.25F, -21F, 15.2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.15F, -0.15F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.15F, -0.15F); // Box 196
		bodyModel[123].setRotationPoint(-63.25F, -21F, 15.2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.15F, -0.15F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.15F, -0.15F); // Box 197
		bodyModel[124].setRotationPoint(-63.25F, -21F, -18.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0.5F, -0.15F, -0.15F, 0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0.5F, -0.15F, -0.15F); // Box 198
		bodyModel[125].setRotationPoint(-66F, -21F, -18.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.5F, -0.5F); // Box 199
		bodyModel[126].setRotationPoint(-67.25F, -21F, -18.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 200
		bodyModel[127].setRotationPoint(-63F, -21F, -18.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 201
		bodyModel[128].setRotationPoint(-60F, -21F, -18.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[129].setRotationPoint(-57F, -21F, -18.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 32, 8, 17, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, 1F); // Box 242
		bodyModel[130].setRotationPoint(-85F, -22.5F, -11.15F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 9, 8, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, 1F); // Box 243
		bodyModel[131].setRotationPoint(-69F, -23.25F, -6.15F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 1F, -0.5F, -0.2F, 0F); // Box 244
		bodyModel[132].setRotationPoint(-71F, -23.25F, -6.15F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F); // Box 245
		bodyModel[133].setRotationPoint(-71F, -23.25F, 2.35F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 246
		bodyModel[134].setRotationPoint(-58F, -35F, -6.15F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 247
		bodyModel[135].setRotationPoint(-58F, -35.8F, -6.15F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F,0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 1F, -0.2F, -0.5F); // Box 248
		bodyModel[136].setRotationPoint(-57F, -41.8F, -4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,-1F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -1F, -1F, 0F, -1.5F, 0F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, -0.5F); // Box 249
		bodyModel[137].setRotationPoint(-57F, -42.8F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 21, 10, 2, 0F,0.5F, -0.5F, 0.2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F); // Box 250
		bodyModel[138].setRotationPoint(-99F, -30F, -1.4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 5, 3, 0F,0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 1.5F, 0.5F, 0.5F, 1.5F, 0.5F, 0.1F, 0.25F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F); // Box 251
		bodyModel[139].setRotationPoint(-84F, -35F, -1.9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 252
		bodyModel[140].setRotationPoint(-84F, -35.5F, 3.1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0.5F, -1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2.2F); // Box 253
		bodyModel[141].setRotationPoint(-84F, -35.5F, -6.4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 27, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 271
		bodyModel[142].setRotationPoint(-85F, -26.25F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 27, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 273
		bodyModel[143].setRotationPoint(-85F, -26.25F, 5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0.5F, 2.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 2.5F, 0F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F); // Box 287
		bodyModel[144].setRotationPoint(-77F, -22F, -1.4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 288
		bodyModel[145].setRotationPoint(-74F, -27F, -1.1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F); // Box 289
		bodyModel[146].setRotationPoint(-74F, -26.5F, -1.1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 290
		bodyModel[147].setRotationPoint(-74F, -29F, -1.1F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 314
		bodyModel[148].setRotationPoint(-74.8F, -29.3F, -0.6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 315
		bodyModel[149].setRotationPoint(-74.8F, -29.3F, -1.6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.2F, 0F, -0.35F, -0.2F, -1F, -1F, -0.2F, -1F, 0.3F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -1F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.35F); // Box 319
		bodyModel[150].setRotationPoint(-74F, -25F, -2.1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.2F, 0F, -0.35F, -0.2F, -1F, 0.3F, -0.2F, -1F, -1F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, 0.3F, -0.2F, 0F, -1F, -0.2F, 0F, -0.35F); // Box 320
		bodyModel[151].setRotationPoint(-74F, -25F, -0.1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 321
		bodyModel[152].setRotationPoint(-85F, -26.25F, 4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 322
		bodyModel[153].setRotationPoint(-85F, -26.25F, -6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 323
		bodyModel[154].setRotationPoint(-85F, -30F, 5.2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, -1F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 324
		bodyModel[155].setRotationPoint(-85F, -30F, -7.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 325
		bodyModel[156].setRotationPoint(-85F, -30F, 4F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 326
		bodyModel[157].setRotationPoint(-85F, -30F, -7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, 0F, 0.2F, 0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F); // Box 327
		bodyModel[158].setRotationPoint(-73.25F, -26.5F, -6.4F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F); // Box 328
		bodyModel[159].setRotationPoint(-75.25F, -26.5F, -6.4F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F); // Box 329
		bodyModel[160].setRotationPoint(-74.25F, -26.5F, -6.4F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F); // Box 330
		bodyModel[161].setRotationPoint(-74.25F, -27.25F, -6.3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F); // Box 331
		bodyModel[162].setRotationPoint(-73.75F, -27.75F, -6.3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0.8F, -0.2F, -0.2F, 0.8F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0.8F, -0.2F, -0.2F, 0.8F); // Box 332
		bodyModel[163].setRotationPoint(-73.75F, -27.75F, -6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F); // Box 345
		bodyModel[164].setRotationPoint(-81.2F, -36F, -2.2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 347
		bodyModel[165].setRotationPoint(-78.45F, -36.5F, -3.8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[166].setRotationPoint(-79.5F, -36.5F, -3.8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 349
		bodyModel[167].setRotationPoint(-78.5F, -36.5F, -3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 350
		bodyModel[168].setRotationPoint(-79.4F, -36.7F, -2.2F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F); // Box 351
		bodyModel[169].setRotationPoint(-78.7F, -36.9F, -1.8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.8F, -0.4F, 0.2F, -0.8F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 352
		bodyModel[170].setRotationPoint(-78.7F, -37.9F, -2.2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.2F, -0.8F, -0.4F, 0.2F, -0.8F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 353
		bodyModel[171].setRotationPoint(-78.7F, -37.9F, -0.4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,-0.5F, -1.45F, 0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.15F, -0.5F, -1.45F, -0.3F, 0F, 1.6F, 0.1F, 0F, -0.7F, -0.4F, 0F, -0.7F, -0.15F, -0.2F, 0.6F, -0.3F); // Box 356
		bodyModel[172].setRotationPoint(-74F, -37F, -7.3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.5F, -0.2F, -0.3F, -0.5F, -1.45F, 0.1F, -0.5F, -1.45F, -0.3F, -0.5F, -0.2F, -0.15F, -0.5F, 0.9F, 0.1F, -1F, 1.8F, 0.1F, -0.8F, 0.6F, -0.3F, -0.5F, 0.6F, -0.15F); // Box 359
		bodyModel[173].setRotationPoint(-77F, -37F, -7.3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 1.9F, 0.3F, 0F, 1.8F, 0.3F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F); // Box 361
		bodyModel[174].setRotationPoint(-77.5F, -37F, -7.25F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 1F, 1.9F, 0.3F, 0F, 1.8F, 0.3F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F); // Box 362
		bodyModel[175].setRotationPoint(-78.5F, -37F, -7.25F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.65F, 0.2F, -0.5F, -0.1F, 0.35F, -0.5F, -0.15F, 0F, -0.5F, 0.2F, 0F, 1.9F, -0.1F, -1F, 1.8F, 0.25F, -0.1F, 0.6F, -0.15F, 0F, 0.6F, 0.2F); // Box 363
		bodyModel[176].setRotationPoint(-82.4F, -36F, -7.3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -1.55F, -0.8F, -0.5F, -0.3F, -0.8F, -0.5F, -0.15F, 0F, -0.3F, 1F, 0F, 1.9F, -1.1F, -0.8F, 1.8F, 0.25F, -0.8F, 0.6F, -0.15F, 0F, 0.6F, 1F); // Box 365
		bodyModel[177].setRotationPoint(-85.6F, -36F, -6.95F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -2.95F, -0.8F, -0.5F, -0.3F, -0.8F, -0.5F, -0.25F, 0F, -0.3F, 2.35F, 1F, 0.9F, -2.1F, -0.8F, 0.8F, -0.1F, -0.8F, 0.6F, -0.25F, 2.2F, 0.6F, 2.1F); // Box 366
		bodyModel[178].setRotationPoint(-88.8F, -36.2F, -5.7F);

		bodyModel[179].addShapeBox(0F, 0F, -2F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.4F, -0.05F, 0.35F, -0.4F, 0.2F, 0.75F, -0.2F, 0.2F, 0.75F, 1.5F, 0F, 0.2F, -0.4F, 0F, 1F, -0.4F, 0F, 0.75F, 1.5F, 0F, 0.75F); // Box 367
		bodyModel[179].setRotationPoint(-89F, -35.9F, -0.35F);

		bodyModel[180].addShapeBox(0F, 0F, -2F, 1, 1, 1, 0F,-0.2F, 0.2F, 0.75F, -0.4F, 0.2F, 0.75F, -0.4F, -0.05F, 0.35F, -0.2F, 0F, 0F, 1.5F, 0F, 0.75F, -0.4F, 0F, 0.75F, -0.4F, 0F, 1F, 1.4F, 0F, 0.2F); // Box 368
		bodyModel[180].setRotationPoint(-89F, -35.9F, 2.15F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, 2.35F, -0.8F, -0.5F, 0.15F, -0.8F, -0.5F, -0.7F, 0F, -0.3F, -2.95F, 2.2F, 0.6F, 3.1F, -0.8F, 0.6F, 0.15F, -0.8F, 0.8F, -0.45F, 1F, 0F, -2.8F); // Box 370
		bodyModel[181].setRotationPoint(-88.8F, -36.2F, 3.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, 1F, -0.8F, -0.5F, -0.65F, -0.8F, -0.5F, 0.2F, 0F, -0.3F, -1.55F, 0F, 0.6F, 1F, -0.8F, 0.6F, -0.65F, -0.8F, 1.8F, 0.7F, 0F, 1.9F, -1.1F); // Box 378
		bodyModel[182].setRotationPoint(-85.6F, -36F, 4.35F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0.35F, -0.5F, -0.15F, 0.2F, -0.5F, -0.1F, 0F, -0.5F, -0.45F, 0F, 0.6F, 0F, -0.1F, 0.6F, -0.15F, -1F, 1.8F, 0.25F, 0F, 1.9F, 0.1F); // Box 379
		bodyModel[183].setRotationPoint(-82.4F, -36F, 5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.25F, -1F, -0.2F, -0.25F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, 1.8F, 0.3F, 1F, 1.9F, 0.3F); // Box 380
		bodyModel[184].setRotationPoint(-78.5F, -37F, 4.95F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, 1.8F, 0.3F, 0F, 1.9F, 0.3F); // Box 381
		bodyModel[185].setRotationPoint(-77.5F, -37F, 4.95F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.5F, -0.2F, -0.15F, -0.5F, -1.45F, -0.3F, -0.5F, -1.45F, 0.1F, -0.5F, -0.2F, -0.3F, -0.5F, 0.6F, -0.15F, -0.8F, 0.6F, -0.3F, -1F, 1.8F, 0.1F, -0.5F, 0.9F, 0.1F); // Box 382
		bodyModel[186].setRotationPoint(-77F, -37F, 5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,-0.5F, -1.45F, -0.3F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.4F, -0.5F, -1.45F, 0.1F, -0.2F, 0.6F, -0.3F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.4F, 0F, 1.6F, 0.1F); // Box 383
		bodyModel[187].setRotationPoint(-74F, -37F, 5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.5F, -1.45F, -0.65F, 0F, -1F, -0.35F, 0F, -1F, -0.2F, -0.5F, -1.45F, 0.1F, -0.5F, 0.6F, -0.65F, 0F, 0.3F, -0.35F, 0F, 0.3F, -0.2F, -0.5F, 1.6F, 0.1F); // Box 384
		bodyModel[188].setRotationPoint(-55.5F, -38.05F, 4.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.5F, -1.45F, 0.1F, 0F, -1F, -0.4F, 0F, -1F, -0.15F, -0.5F, -1.45F, -0.65F, -0.5F, 1.6F, 0.1F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.15F, -0.5F, 0.6F, -0.65F); // Box 385
		bodyModel[189].setRotationPoint(-55.5F, -38.05F, -6.8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.5F, -1.45F, 0.1F, 0.5F, -1F, -1.4F, 0.5F, -1F, 0.8F, -0.5F, -1.45F, -0.65F, -0.5F, 1.6F, 0.1F, 0.5F, 0.3F, -1.4F, 0.5F, 0.3F, 0.8F, -0.5F, 0.6F, -0.65F); // Box 386
		bodyModel[190].setRotationPoint(-50F, -38.5F, -6.3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-0.5F, -1.45F, -0.65F, 0.5F, -1F, 0.85F, 0.5F, -1F, -1.4F, -0.5F, -1.45F, 0.1F, -0.5F, 0.6F, -0.65F, 0.5F, 0.3F, 0.85F, 0.5F, 0.3F, -1.4F, -0.5F, 1.6F, 0.1F); // Box 387
		bodyModel[191].setRotationPoint(-50F, -38.5F, 4.2F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-0.5F, -1.45F, 0.1F, 0F, -1F, -3.5F, 0F, -1F, 3.6F, -0.5F, -1.45F, -0.65F, -0.5F, 1.6F, 0.1F, 0F, 0.3F, -3F, 1F, 0.3F, 3.8F, -0.5F, 0.6F, -0.65F); // Box 388
		bodyModel[192].setRotationPoint(-44F, -38.95F, -4.8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-0.5F, -1.45F, -0.65F, 0.5F, -1F, 3.8F, 0F, -1F, -3.4F, -0.5F, -1.45F, 0.1F, -0.5F, 0.6F, -0.65F, 3F, 0.3F, 3.8F, 0F, 0.3F, -3F, -0.5F, 1.6F, 0.1F); // Box 389
		bodyModel[193].setRotationPoint(-44F, -38.95F, 2.7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0.25F, -2.45F, 3.1F, 0F, -2F, -0.9F, 0F, -2F, -0.75F, 0.25F, -2.45F, 3F, -0.5F, 1.6F, 3.4F, 0F, 1.15F, -0.2F, 0F, 1.15F, -0.2F, -0.5F, 1.6F, 3.3F); // Box 399
		bodyModel[194].setRotationPoint(-44F, -41.1F, -1.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -2.45F, 2.6F, 0F, -3.1F, -0.9F, 0F, -3.1F, -0.8F, 0F, -2.45F, 2.5F, 0.25F, 1.6F, 3.1F, 0F, 1.15F, -0.9F, 0F, 1.15F, -0.75F, 0.25F, 1.6F, 3F); // Box 400
		bodyModel[195].setRotationPoint(-44F, -42.25F, -1.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0.1F, -2.55F, 1.8F, 0F, -4.1F, -0.9F, 0F, -4.1F, -0.8F, 0.1F, -2.55F, 1.7F, 0F, 1.45F, 2.6F, 0F, 2.1F, -0.9F, 0F, 2.1F, -0.8F, 0F, 1.45F, 2.5F); // Box 401
		bodyModel[196].setRotationPoint(-44F, -43.25F, -1.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0.2F, -2.2F, -1F, 0F, -5F, -0.9F, 0F, -5F, -0.8F, 0.2F, -2.2F, -1F, 0.1F, 1.45F, 1.8F, 0F, 3F, -0.9F, 0F, 3F, -0.8F, 0.1F, 1.45F, 1.7F); // Box 402
		bodyModel[197].setRotationPoint(-44F, -44.15F, -1.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F); // Box 403
		bodyModel[198].setRotationPoint(-77.5F, -38.4F, -6.7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F); // Box 404
		bodyModel[199].setRotationPoint(-77.5F, -38.4F, 4.4F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F); // Box 405
		bodyModel[200].setRotationPoint(-77.5F, -40.1F, 3.7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, 1.2F, 0F, -0.6F, 1.2F, 0F, -0.6F, -1.7F, 0F, -0.6F, -1.7F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F); // Box 406
		bodyModel[201].setRotationPoint(-77.5F, -42.8F, 2.7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.6F, -1.7F, 0F, -0.6F, -1.7F, 0F, -0.6F, 1.2F, 0F, -0.6F, 1.2F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F); // Box 407
		bodyModel[202].setRotationPoint(-77.5F, -42.8F, -5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, -0.7F, 0F, 0.1F, -0.7F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F); // Box 408
		bodyModel[203].setRotationPoint(-77.5F, -40.1F, -6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, 1.2F, 0F, -0.8F, 1.2F, 0F, -0.8F, -1.7F, 0F, -0.8F, -1.7F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F); // Box 409
		bodyModel[204].setRotationPoint(-77.5F, -43.8F, 0.7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -1.7F, 0F, -0.8F, -1.7F, 0F, -0.8F, 1.2F, 0F, -0.8F, 1.2F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F); // Box 410
		bodyModel[205].setRotationPoint(-77.5F, -43.8F, -3F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F); // Box 411
		bodyModel[206].setRotationPoint(-77.5F, -43.6F, -1.15F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.8F, 0.6F, 1F, 2.3F, 0.6F, 1F, 2.3F, 0.6F, -1F, -2.8F, 0.6F, -1F, -0.1F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.15F, 0F, 0F); // Box 413
		bodyModel[207].setRotationPoint(-88.95F, -36.95F, -2.75F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.8F, 0.6F, -1F, 2.3F, 0.6F, -1F, 2.3F, 0.6F, 1F, -2.8F, 0.6F, 1F, -0.15F, 0F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.1F, 0.1F, 0F); // Box 414
		bodyModel[208].setRotationPoint(-88.95F, -36.95F, 0.55F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-3.3F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, 0F, 0F, -3.3F, 0F, 0F, -0.1F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.1F, 0.1F, 0F); // Box 415
		bodyModel[209].setRotationPoint(-86.25F, -39.65F, -3.75F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.5F, 0.6F, -1F, 2F, 0.6F, -1F, 2F, 0.6F, 1F, -2.5F, 0.6F, 1F, 0.05F, 0.1F, 0F, -0.55F, 0.1F, 0F, -0.55F, 0.1F, 0F, 0.05F, 0.1F, 0F); // Box 418
		bodyModel[210].setRotationPoint(-82.9F, -40.75F, -3.75F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.5F, 0.7F, 1F, 2F, 0.7F, 1F, 2F, 0.3F, -1F, -2.5F, 0.35F, -1F, -0.1F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.1F, 0.1F, 0F); // Box 421
		bodyModel[211].setRotationPoint(-80.5F, -42.45F, 0.55F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.5F, 0.35F, -1F, 2F, 0.35F, -1F, 2F, 0.7F, 1F, -2.5F, 0.7F, 1F, -0.1F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.1F, 0.1F, 0F); // Box 422
		bodyModel[212].setRotationPoint(-80.5F, -42.45F, -2.75F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, -0.5F, -0.45F, -0.3F, -0.5F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, -0.5F, -0.4F, 0.15F); // Box 424
		bodyModel[213].setRotationPoint(-78.5F, -43.6F, -1.15F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0F, -1F, 0.15F, 0F, 0F, 0.15F, 0.84F, 0.78F, 0F, 0.38F, 0.75F, 0F, 0.3F, 0F, 0.15F, 0.75F); // Box 425
		bodyModel[214].setRotationPoint(-45.25F, -38.5F, -4.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2.5F, 0.6F, 1F, 2F, 0.6F, 1F, 2F, 0.6F, -1F, -2.5F, 0.6F, -1F, 0.05F, 0.1F, 0F, -0.55F, 0.1F, 0F, -0.55F, 0.1F, 0F, 0.05F, 0.1F, 0F); // Box 426
		bodyModel[215].setRotationPoint(-82.9F, -40.75F, 1.55F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-3.3F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, 0F, 0F, -3.3F, 0F, 0F, -0.1F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.1F, 0.1F, 0F); // Box 427
		bodyModel[216].setRotationPoint(-86.25F, -39.65F, 1.55F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 40, 100, 0F,0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, -90F, 0.5F, 0.4F, -90F, 0.5F, -36F, 0F, 0.5F, -36F, 0F, 0.5F, -36F, -90F, 0.5F, -36F, -90F); // Box 428
		bodyModel[217].setRotationPoint(-78.9F, -34F, -5.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 156
		noseModel[1] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 157
		noseModel[2] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 158
		noseModel[3] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 159
		noseModel[4] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 160
		noseModel[5] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 161
		noseModel[6] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 162
		noseModel[7] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 163
		noseModel[8] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 164
		noseModel[9] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 165
		noseModel[10] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 166
		noseModel[11] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 167
		noseModel[12] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 168
		noseModel[13] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 169
		noseModel[14] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 170
		noseModel[15] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 172
		noseModel[16] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 173
		noseModel[17] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 175
		noseModel[18] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 176
		noseModel[19] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 178
		noseModel[20] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 180
		noseModel[21] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 181
		noseModel[22] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 182
		noseModel[23] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 183
		noseModel[24] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 184
		noseModel[25] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 186
		noseModel[26] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 187
		noseModel[27] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 188
		noseModel[28] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 189
		noseModel[29] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 190
		noseModel[30] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 191
		noseModel[31] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 192
		noseModel[32] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 193
		noseModel[33] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 195
		noseModel[34] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 196
		noseModel[35] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 197
		noseModel[36] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 198
		noseModel[37] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 199
		noseModel[38] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 200
		noseModel[39] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 201
		noseModel[40] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 203
		noseModel[41] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 204
		noseModel[42] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 205
		noseModel[43] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 207
		noseModel[44] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 208
		noseModel[45] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 209
		noseModel[46] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 210
		noseModel[47] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 211
		noseModel[48] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 212

		noseModel[0].addShapeBox(0F, 0F, 0F, 8, 8, 4, 0F,0F, -0.5F, -1.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 5F, 0F, -0.5F, 1F, 0F, -0.2F, -1.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 5F, 0F, -0.2F, 1F); // Box 156
		noseModel[0].setRotationPoint(-115.5F, -25.5F, -13.15F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F,-0.5F, -0.8F, -6F, 0F, -0.8F, -5F, 0F, -0.8F, 8.5F, -0.5F, -0.8F, 1.5F, -0.5F, 0.25F, -2F, 0F, 0.25F, -1F, 0F, 0.25F, 3.5F, -0.5F, 0.25F, -0.5F); // Box 157
		noseModel[1].setRotationPoint(-116F, -32.25F, -13.65F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 14, 0F,-0.5F, -2F, -10F, 0F, -1F, -8F, 0F, -1F, -1.5F, -0.5F, -2F, -2F, -0.5F, 0.25F, -6F, 0F, 0.25F, -5F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Box 158
		noseModel[2].setRotationPoint(-116F, -34.7F, -13.65F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F,-0.5F, 0.25F, -2F, 0F, 0.25F, -1F, 0F, 0.25F, 3.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.45F, -6.5F, 0F, -0.45F, -4.5F, 0F, -0.45F, 8.5F, -0.5F, -0.45F, 3.5F); // Box 159
		noseModel[3].setRotationPoint(-116F, -17.45F, -13.65F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 27, 0F,0.5F, -1.9F, -13.5F, 0F, -0.6F, -13F, 0F, -0.6F, -13F, 0.5F, -1.9F, -13.5F, 0.5F, 0.95F, -12.5F, 0F, 0.35F, -10.45F, 0F, 0.35F, -10.5F, 0.5F, 0.95F, -12.5F); // Box 160
		noseModel[4].setRotationPoint(-122.5F, -34.05F, -14.15F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 9, 4, 27, 0F,-0.5F, -0.2F, -7F, 0F, -0.2F, -5F, 0F, -0.2F, -5F, -0.5F, -0.2F, -7F, -0.5F, -1.5F, -11F, 0F, -1F, -10F, 0F, -1F, -10F, -0.5F, -1.5F, -11F); // Box 161
		noseModel[5].setRotationPoint(-116F, -11.1F, -14.15F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F,-0.5F, -0.8F, 1.5F, 0F, -0.8F, 8.5F, 0F, -0.8F, -5F, -0.5F, -0.8F, -6F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, 3.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -2F); // Box 162
		noseModel[6].setRotationPoint(-116F, -32.25F, 6.35F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 14, 0F,-0.5F, -2F, 0F, 0F, -1F, -1.5F, 0F, -1F, -8F, -0.5F, -2F, -10F, -0.5F, 0.25F, -2.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -5F, -0.5F, 0.25F, -6F); // Box 163
		noseModel[7].setRotationPoint(-116F, -34.7F, -1.65F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 8, 8, 4, 0F,0F, -0.5F, 1F, 0.5F, -0.5F, 5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.2F, 1F, 0.5F, -0.2F, 5F, 0.5F, -0.2F, -0.5F, 0F, -0.2F, -1.5F); // Box 164
		noseModel[8].setRotationPoint(-115.5F, -25.5F, 7.85F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F,-0.5F, 0.25F, -0.5F, 0F, 0.25F, 3.5F, 0F, 0.25F, -1F, -0.5F, 0.25F, -2F, -0.5F, -0.45F, 3.5F, 0F, -0.45F, 8.5F, 0F, -0.45F, -4.5F, -0.5F, -0.45F, -6.5F); // Box 165
		noseModel[9].setRotationPoint(-116F, -17.45F, 6.35F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -0.5F, 1F, 0.5F, -0.5F, 1F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -2.5F, 0F, -0.2F, 1F, 0.5F, -0.2F, 1F, 0.5F, -0.2F, -0.5F, 0F, -0.2F, -2.5F); // Box 166
		noseModel[10].setRotationPoint(-123F, -25.5F, 7.85F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -0.5F, -2.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.2F, -2.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 1F, 0F, -0.2F, 1F); // Box 167
		noseModel[11].setRotationPoint(-123F, -25.5F, -12.15F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 8, 7, 6, 0F,-0.5F, 0.25F, -4F, 0F, 0.25F, -2F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.45F, -8F, 0F, -0.45F, -6.5F, 0F, -0.45F, 3.5F, -0.5F, -0.45F, 3.5F); // Box 168
		noseModel[12].setRotationPoint(-123.5F, -17.45F, -13.65F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 8, 7, 6, 0F,-0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -2F, -0.5F, 0.25F, -4F, -0.5F, -0.45F, 3.5F, 0F, -0.45F, 3.5F, 0F, -0.45F, -6.5F, -0.5F, -0.45F, -8F); // Box 169
		noseModel[13].setRotationPoint(-123.5F, -17.45F, 6.35F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,-0.5F, 0.2F, 5.5F, 0F, 0.2F, 3.5F, 0F, 0.2F, -6F, -0.5F, 0.2F, -10F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -2F, -0.5F, 0.25F, -4F); // Box 170
		noseModel[14].setRotationPoint(-123.5F, -31.25F, 6.35F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,-0.5F, 0.15F, -10F, 0F, 0.2F, -6F, 0F, 0.15F, 3.5F, -0.5F, 0.15F, 5.5F, -0.5F, 0.25F, -4F, 0F, 0.25F, -2F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F); // Box 172
		noseModel[15].setRotationPoint(-123.5F, -31.25F, -13.65F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 8, 3, 13, 0F,-0.5F, -2.6F, -1F, 0F, -2F, -1.5F, 0F, -2F, -9F, -0.5F, -2.6F, -11F, -0.5F, 0.25F, -2.5F, 0F, 0.25F, -4.5F, 0F, 0.25F, -5F, -0.5F, 0.25F, -9F); // Box 173
		noseModel[16].setRotationPoint(-123.5F, -34.7F, -1.65F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 8, 3, 13, 0F,-0.5F, -2.55F, -11F, 0F, -1.95F, -8.95F, 0F, -2F, -0.5F, -0.5F, -2.55F, -1F, -0.5F, 0.25F, -9F, 0F, 0.2F, -5F, 0F, 0.25F, -4.5F, -0.5F, 0.25F, -2.5F); // Box 175
		noseModel[17].setRotationPoint(-123.5F, -34.65F, -12.65F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 27, 0F,0.5F, -1.6F, -13F, 0F, -0.6F, -13F, 0F, -0.6F, -13F, 0.5F, -1.6F, -13F, 0.5F, 1.35F, -10.5F, 0F, 0.35F, -8.5F, 0F, 0.35F, -8.5F, 0.5F, 1.35F, -10.5F); // Box 176
		noseModel[18].setRotationPoint(-115F, -35.05F, -14.15F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -1.5F, 2F, 0.5F, -0.5F, 1F, 0.5F, -0.5F, -2.5F, 0F, -1.5F, -3.5F, 0F, -1.2F, 2F, 0.5F, -0.2F, 1F, 0.5F, -0.2F, -2.5F, 0F, -1.2F, -3.5F); // Box 178
		noseModel[19].setRotationPoint(-125.5F, -25.5F, 7.85F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,-0.5F, 1.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -4F, -0.5F, 1.25F, -5F, -0.5F, -3.45F, 3.5F, 0F, -0.45F, 3.5F, 0F, -0.45F, -8F, -0.5F, -3.45F, -8F); // Box 180
		noseModel[20].setRotationPoint(-126F, -17.45F, 6.35F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -1.5F, -3.5F, 0.5F, -0.5F, -2.5F, 0.5F, -0.5F, 1F, 0F, -1.5F, 2F, 0F, -1.2F, -3.5F, 0.5F, -0.2F, -2.5F, 0.5F, -0.2F, 1F, 0F, -1.2F, 2F); // Box 181
		noseModel[21].setRotationPoint(-125.5F, -25.5F, -12.15F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,-0.5F, 1.25F, -5F, 0F, 0.25F, -4F, 0F, 0.25F, -0.5F, -0.5F, 1.25F, 0.5F, -0.5F, -3.45F, -8F, 0F, -0.45F, -8F, 0F, -0.45F, 3.5F, -0.5F, -3.45F, 3.5F); // Box 182
		noseModel[22].setRotationPoint(-126F, -17.45F, -13.65F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,-0.5F, -3.45F, -8F, 0F, -0.85F, -10F, 0F, -0.85F, 5.5F, -0.5F, -3.45F, 3.5F, -0.5F, 1.25F, -5F, 0F, 0.25F, -4F, 0F, 0.25F, -0.5F, -0.5F, 1.25F, 0.5F); // Box 183
		noseModel[23].setRotationPoint(-126F, -32.25F, -13.65F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,-0.5F, -3.45F, 3.5F, 0F, -0.85F, 5.5F, 0F, -0.8F, -10F, -0.5F, -3.45F, -8F, -0.5F, 1.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -4F, -0.5F, 1.25F, -5F); // Box 184
		noseModel[24].setRotationPoint(-126F, -32.25F, 6.35F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-0.5F, -1.5F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, -1.5F, -1F, -0.5F, 2.3F, 2F, 0F, -0.3F, 0F, 0F, -0.35F, 0F, -0.5F, 2.3F, 2F); // Box 186
		noseModel[25].setRotationPoint(-126F, -32.1F, -3.65F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, -0.5F, 1F, 1.5F, 0F, 0.8F, 2F, 0F, 0.8F, 2F, -0.5F, 1F, 1.5F); // Box 187
		noseModel[26].setRotationPoint(-126.5F, -30.6F, -3.65F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.2F, -1.5F, -2.8F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.2F, -1.5F, -2.8F, 0.2F, 1F, -1.5F, 0.5F, 1F, 1.5F, 0.5F, 1F, 1.5F, 0.2F, 1F, -1.5F); // Box 188
		noseModel[27].setRotationPoint(-127.5F, -30.6F, -3.65F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.2F, 1F, -1.5F, 0.5F, 1F, 1.5F, 0.5F, 1F, 1.5F, 0.2F, 1F, -1.5F, 0.2F, -1.5F, -1.8F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0.2F, -1.5F, -1.8F); // Box 189
		noseModel[28].setRotationPoint(-127.5F, -27.6F, -3.65F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0.8F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1.3F, 0F, 0F, -0.5F, 1.55F, 0F, -0.5F, -2F, 0F, -1.3F, 0F); // Box 190
		noseModel[29].setRotationPoint(-126.5F, -27.8F, -5.65F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.8F, -0.5F, 0F, -1.3F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 1.55F, 0F, -1.3F, 0F); // Box 191
		noseModel[30].setRotationPoint(-126.5F, -27.8F, 2.35F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 8, 4, 27, 0F,-0.5F, -0.2F, -8.5F, 0F, -0.2F, -7F, 0F, -0.2F, -7F, -0.5F, -0.2F, -8.5F, -0.5F, -2.5F, -13F, 0F, -1.5F, -11F, 0F, -1.5F, -11F, -0.5F, -2.5F, -13F); // Box 192
		noseModel[31].setRotationPoint(-123.5F, -11.1F, -14.15F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,-0.5F, 1.3F, 0.5F, 0F, 0.25F, -1.5F, 0F, -1.7F, -5F, -0.5F, 1.3F, -5F, -0.5F, -4.1F, 2.5F, 0F, -2.3F, 3.5F, 0F, -1.45F, -8F, -0.5F, -3.45F, -8F); // Box 193
		noseModel[32].setRotationPoint(-126F, -12.6F, 3.35F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,-0.5F, 1.3F, -5F, 0F, -1.7F, -5F, 0F, 0.25F, -1.5F, -0.5F, 1.3F, 0.5F, -0.5F, -3.45F, -8F, 0F, -1.45F, -8F, 0F, -2.3F, 3.5F, -0.5F, -4.1F, 2.5F); // Box 195
		noseModel[33].setRotationPoint(-126F, -12.6F, -10.65F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1.35F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, -1.35F, 0.5F); // Box 196
		noseModel[34].setRotationPoint(-125.5F, -11.7F, -2.15F);

		noseModel[35].addShapeBox(0F, 0F, -14F, 3, 3, 27, 0F,-0.5F, 0.95F, -11.5F, 0F, -1.05F, -11.5F, 0F, -1.05F, -11.5F, -0.5F, 0.95F, -11.5F, -0.5F, -3.5F, -13F, 0F, -1.5F, -13F, 0F, -1.5F, -13F, -0.5F, -3.5F, -13F); // Box 197
		noseModel[35].setRotationPoint(-126F, -11.1F, -0.15F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, -1F, 0.25F, 0F, 0F, -0.45F, 0F, -1F, -0.45F, 2F, -1F, -0.45F, 2F, 0F, -0.45F, 0F); // Box 198
		noseModel[36].setRotationPoint(-122.5F, -17.45F, -1.25F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 14, 7, 3, 0F,-1F, 0.25F, 0F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1.5F, -1F, 0.25F, 0F, 0F, -0.45F, 1F, 1F, -0.45F, 1.5F, 0F, -0.45F, 1.5F, 0F, -0.45F, 1F); // Box 199
		noseModel[37].setRotationPoint(-120.5F, -17.45F, -2.25F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 14, 7, 3, 0F,3F, -1.45F, 5F, 1F, -0.45F, 6.5F, 0F, -0.45F, 6.5F, 2.5F, -1.45F, 4.5F, -1F, 0.25F, 0F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1.5F, -1F, 0.25F, 0F); // Box 200
		noseModel[38].setRotationPoint(-120.5F, -28.45F, -2.25F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,3F, -1.3F, 1F, -4F, -1.5F, 6F, -3.8F, -1F, 5.9F, 3F, -1.3F, 1F, -1F, 0.25F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, -1F, 0.25F, 0F); // Box 201
		noseModel[39].setRotationPoint(-122.5F, -28.45F, -1.25F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,3F, 0F, 2F, -4F, 0F, 4F, -4F, 0F, 4F, 3F, 0F, 2F, 3F, 0F, 3F, -4F, 0F, 5F, -4F, 0F, 5F, 3F, 0F, 3F); // Box 203
		noseModel[40].setRotationPoint(-123.5F, -29.1F, -1.25F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 1.7F, 0F, -0.5F, 1.6F, 0F, -0.5F, 0F); // Box 204
		noseModel[41].setRotationPoint(-119.5F, -21.2F, -2.25F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 205
		noseModel[42].setRotationPoint(-121.5F, -21.2F, -2.25F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.7F, 0.5F); // Box 207
		noseModel[43].setRotationPoint(-123.5F, -20.2F, -2.25F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F); // Box 208
		noseModel[44].setRotationPoint(-123.5F, -20.2F, -0.75F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1.5F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -0.8F, 0.5F); // Box 209
		noseModel[45].setRotationPoint(-123.5F, -21.2F, -2.25F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, -1F, -1F, 0.5F); // Box 210
		noseModel[46].setRotationPoint(-123.5F, -21.2F, -0.75F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, -0.2F, 0F); // Box 211
		noseModel[47].setRotationPoint(-123.5F, -19.7F, -0.75F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -0.8F, 0.5F, -1.5F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 212
		noseModel[48].setRotationPoint(-123.5F, -19.7F, -2.25F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 841, 233, textureX, textureY); // Box 230
		tailModel[1] = new ModelRendererTurbo(this, 713, 241, textureX, textureY); // Box 231
		tailModel[2] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Box 431
		tailModel[3] = new ModelRendererTurbo(this, 289, 313, textureX, textureY); // Box 432
		tailModel[4] = new ModelRendererTurbo(this, 393, 313, textureX, textureY); // Box 433
		tailModel[5] = new ModelRendererTurbo(this, 545, 321, textureX, textureY); // Box 434
		tailModel[6] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 435
		tailModel[7] = new ModelRendererTurbo(this, 697, 337, textureX, textureY); // Box 436

		tailModel[0].addShapeBox(0F, 0F, 0F, 30, 26, 27, 0F,-45.5F, 1F, -12.5F, 37F, 1F, -12.5F, 37F, 1F, -12.5F, -45.5F, 1F, -12.5F, 0F, -0.2F, -11F, 8.5F, 5.7F, -11F, 8.5F, 5.7F, -11.5F, 0F, -0.2F, -11.5F); // Box 230
		tailModel[0].setRotationPoint(74.5F, -69.5F, -13.15F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 23, 29, 27, 0F,-44.2F, 1F, -12.5F, 38F, 1F, -13F, 38F, 1F, -13.5F, -44.2F, 1F, -12.5F, -15.7F, 2.7F, -11F, -1.5F, 12.5F, -13F, -1.5F, 12.5F, -13.5F, -15.7F, 2.7F, -11.5F); // Box 231
		tailModel[1].setRotationPoint(97.3F, -69.5F, -13.15F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 50, 50, 1, 0F,-17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F); // Box 431
		tailModel[2].setRotationPoint(83.5F, -75.5F, 1.75F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 50, 50, 1, 0F,-17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F); // Box 432
		tailModel[3].setRotationPoint(83.5F, -75.5F, -2.55F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 50, 1, 50, 0F,-17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F); // Box 433
		tailModel[4].setRotationPoint(26.5F, -19.1F, 69.75F);
		tailModel[4].rotateAngleX = -0.05235988F;
		tailModel[4].rotateAngleY = -0.89011792F;
		tailModel[4].rotateAngleZ = 0.03490659F;

		tailModel[5].addShapeBox(0F, 0F, 0F, 50, 1, 50, 0F,-17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F); // Box 434
		tailModel[5].setRotationPoint(64.5F, -16F, -101.25F);
		tailModel[5].rotateAngleX = 0.05235988F;
		tailModel[5].rotateAngleY = 0.89011792F;
		tailModel[5].rotateAngleZ = 0.05235988F;

		tailModel[6].addShapeBox(0F, 0F, 0F, 50, 1, 50, 0F,-17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F); // Box 435
		tailModel[6].setRotationPoint(64.5F, -12.7F, -101.25F);
		tailModel[6].rotateAngleX = 0.05235988F;
		tailModel[6].rotateAngleY = 0.89011792F;
		tailModel[6].rotateAngleZ = 0.08726646F;

		tailModel[7].addShapeBox(0F, 0F, 0F, 50, 1, 50, 0F,-17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F, -17F, -0.45F, -17F); // Box 436
		tailModel[7].setRotationPoint(26.5F, -14.9F, 69.75F);
		tailModel[7].rotateAngleX = -0.03490659F;
		tailModel[7].rotateAngleY = -0.89011792F;
		tailModel[7].rotateAngleZ = 0.08726646F;
	}

	private void initbayModel_1()
	{
		bayModel[0] = new ModelRendererTurbo(this, 697, 321, textureX, textureY); // Box 445
		bayModel[1] = new ModelRendererTurbo(this, 697, 329, textureX, textureY); // Box 446
		bayModel[2] = new ModelRendererTurbo(this, 849, 337, textureX, textureY); // Box 447
		bayModel[3] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 450
		bayModel[4] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 451
		bayModel[5] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 452
		bayModel[6] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 453
		bayModel[7] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 454
		bayModel[8] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 455
		bayModel[9] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 456
		bayModel[10] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 457
		bayModel[11] = new ModelRendererTurbo(this, 985, 185, textureX, textureY); // Box 458
		bayModel[12] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 459
		bayModel[13] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 460
		bayModel[14] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Box 461
		bayModel[15] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 462
		bayModel[16] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 463
		bayModel[17] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 464
		bayModel[18] = new ModelRendererTurbo(this, 849, 345, textureX, textureY); // Box 469
		bayModel[19] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 470
		bayModel[20] = new ModelRendererTurbo(this, 849, 353, textureX, textureY); // Box 471
		bayModel[21] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 472
		bayModel[22] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 473
		bayModel[23] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 474
		bayModel[24] = new ModelRendererTurbo(this, 849, 361, textureX, textureY); // Box 475
		bayModel[25] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 476
		bayModel[26] = new ModelRendererTurbo(this, 649, 193, textureX, textureY); // Box 477
		bayModel[27] = new ModelRendererTurbo(this, 801, 193, textureX, textureY); // Box 478
		bayModel[28] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 479
		bayModel[29] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 480
		bayModel[30] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 481
		bayModel[31] = new ModelRendererTurbo(this, 977, 193, textureX, textureY); // Box 482
		bayModel[32] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 483
		bayModel[33] = new ModelRendererTurbo(this, 1001, 193, textureX, textureY); // Box 484
		bayModel[34] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 485
		bayModel[35] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 486
		bayModel[36] = new ModelRendererTurbo(this, 153, 369, textureX, textureY); // Box 487
		bayModel[37] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 488
		bayModel[38] = new ModelRendererTurbo(this, 289, 369, textureX, textureY); // Box 489
		bayModel[39] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 490
		bayModel[40] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 491
		bayModel[41] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 492
		bayModel[42] = new ModelRendererTurbo(this, 849, 369, textureX, textureY); // Box 493
		bayModel[43] = new ModelRendererTurbo(this, 801, 201, textureX, textureY); // Box 494
		bayModel[44] = new ModelRendererTurbo(this, 977, 201, textureX, textureY); // Box 495
		bayModel[45] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 496
		bayModel[46] = new ModelRendererTurbo(this, 1009, 185, textureX, textureY); // Box 497
		bayModel[47] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Box 498
		bayModel[48] = new ModelRendererTurbo(this, 1009, 201, textureX, textureY); // Box 499
		bayModel[49] = new ModelRendererTurbo(this, 617, 209, textureX, textureY); // Box 500
		bayModel[50] = new ModelRendererTurbo(this, 641, 209, textureX, textureY); // Box 501
		bayModel[51] = new ModelRendererTurbo(this, 657, 209, textureX, textureY); // Box 502
		bayModel[52] = new ModelRendererTurbo(this, 801, 209, textureX, textureY); // Box 503
		bayModel[53] = new ModelRendererTurbo(this, 881, 209, textureX, textureY); // Box 504
		bayModel[54] = new ModelRendererTurbo(this, 289, 377, textureX, textureY); // Box 505
		bayModel[55] = new ModelRendererTurbo(this, 897, 209, textureX, textureY); // Box 506
		bayModel[56] = new ModelRendererTurbo(this, 425, 377, textureX, textureY); // Box 507
		bayModel[57] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 508
		bayModel[58] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 509
		bayModel[59] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 510
		bayModel[60] = new ModelRendererTurbo(this, 561, 377, textureX, textureY); // Box 511
		bayModel[61] = new ModelRendererTurbo(this, 977, 209, textureX, textureY); // Box 512
		bayModel[62] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 513
		bayModel[63] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 514
		bayModel[64] = new ModelRendererTurbo(this, 921, 209, textureX, textureY); // Box 515
		bayModel[65] = new ModelRendererTurbo(this, 1001, 209, textureX, textureY); // Box 516
		bayModel[66] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 517
		bayModel[67] = new ModelRendererTurbo(this, 1001, 217, textureX, textureY); // Box 518
		bayModel[68] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 519
		bayModel[69] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 520
		bayModel[70] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Box 521
		bayModel[71] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 522
		bayModel[72] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 523
		bayModel[73] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 524
		bayModel[74] = new ModelRendererTurbo(this, 1001, 225, textureX, textureY); // Box 525
		bayModel[75] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 526
		bayModel[76] = new ModelRendererTurbo(this, 849, 377, textureX, textureY); // Box 527
		bayModel[77] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 528
		bayModel[78] = new ModelRendererTurbo(this, 137, 385, textureX, textureY); // Box 529
		bayModel[79] = new ModelRendererTurbo(this, 17, 233, textureX, textureY); // Box 530
		bayModel[80] = new ModelRendererTurbo(this, 41, 233, textureX, textureY); // Box 531
		bayModel[81] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 532
		bayModel[82] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 533
		bayModel[83] = new ModelRendererTurbo(this, 617, 217, textureX, textureY); // Box 534
		bayModel[84] = new ModelRendererTurbo(this, 649, 217, textureX, textureY); // Box 535
		bayModel[85] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 536
		bayModel[86] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 537
		bayModel[87] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Box 538
		bayModel[88] = new ModelRendererTurbo(this, 625, 145, textureX, textureY); // Box 539
		bayModel[89] = new ModelRendererTurbo(this, 729, 145, textureX, textureY); // Box 540
		bayModel[90] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Box 541
		bayModel[91] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 542
		bayModel[92] = new ModelRendererTurbo(this, 289, 385, textureX, textureY); // Box 543
		bayModel[93] = new ModelRendererTurbo(this, 425, 385, textureX, textureY); // Box 544
		bayModel[94] = new ModelRendererTurbo(this, 561, 385, textureX, textureY); // Box 545
		bayModel[95] = new ModelRendererTurbo(this, 273, 233, textureX, textureY); // Box 546
		bayModel[96] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Box 547
		bayModel[97] = new ModelRendererTurbo(this, 945, 153, textureX, textureY); // Box 548
		bayModel[98] = new ModelRendererTurbo(this, 1001, 153, textureX, textureY); // Box 549
		bayModel[99] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 550
		bayModel[100] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 551
		bayModel[101] = new ModelRendererTurbo(this, 545, 233, textureX, textureY); // Box 552
		bayModel[102] = new ModelRendererTurbo(this, 561, 233, textureX, textureY); // Box 553
		bayModel[103] = new ModelRendererTurbo(this, 585, 233, textureX, textureY); // Box 554
		bayModel[104] = new ModelRendererTurbo(this, 929, 233, textureX, textureY); // Box 555
		bayModel[105] = new ModelRendererTurbo(this, 945, 233, textureX, textureY); // Box 556
		bayModel[106] = new ModelRendererTurbo(this, 969, 233, textureX, textureY); // Box 557
		bayModel[107] = new ModelRendererTurbo(this, 985, 233, textureX, textureY); // Box 558

		bayModel[0].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 445
		bayModel[0].setRotationPoint(-82F, -13F, 31.5F);

		bayModel[1].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 446
		bayModel[1].setRotationPoint(-82F, -14F, 31.5F);

		bayModel[2].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 447
		bayModel[2].setRotationPoint(-82F, -11.9F, 31.5F);

		bayModel[3].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F); // Box 450
		bayModel[3].setRotationPoint(-89F, -13F, 31.5F);

		bayModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F, 0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F); // Box 451
		bayModel[4].setRotationPoint(-89F, -14F, 31.5F);

		bayModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F, 0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F); // Box 452
		bayModel[5].setRotationPoint(-89F, -12F, 31.5F);

		bayModel[6].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 453
		bayModel[6].setRotationPoint(-82F, -17.3F, 31.5F);

		bayModel[7].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F); // Box 454
		bayModel[7].setRotationPoint(-82F, -11.7F, 31.5F);

		bayModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F); // Box 455
		bayModel[8].setRotationPoint(-82F, -13F, 32.5F);

		bayModel[9].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 456
		bayModel[9].setRotationPoint(-82F, -13F, 27.5F);

		bayModel[10].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 457
		bayModel[10].setRotationPoint(-33F, -17.6F, 35.5F);
		bayModel[10].rotateAngleX = -0.6981317F;

		bayModel[11].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 458
		bayModel[11].setRotationPoint(-28.5F, -17.6F, 35.5F);
		bayModel[11].rotateAngleX = -0.6981317F;

		bayModel[12].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 459
		bayModel[12].setRotationPoint(-33F, -16.9F, 27.75F);
		bayModel[12].rotateAngleX = 0.6981317F;

		bayModel[13].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 460
		bayModel[13].setRotationPoint(-28.5F, -16.9F, 27.75F);
		bayModel[13].rotateAngleX = 0.6981317F;

		bayModel[14].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 461
		bayModel[14].setRotationPoint(-33F, -12.2F, 30.7F);
		bayModel[14].rotateAngleX = -0.6981317F;

		bayModel[15].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 462
		bayModel[15].setRotationPoint(-28.5F, -12.2F, 30.7F);
		bayModel[15].rotateAngleX = -0.6981317F;

		bayModel[16].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 463
		bayModel[16].setRotationPoint(-33F, -11.7F, 32.7F);
		bayModel[16].rotateAngleX = 0.6981317F;

		bayModel[17].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 464
		bayModel[17].setRotationPoint(-28.5F, -11.7F, 32.7F);
		bayModel[17].rotateAngleX = 0.6981317F;

		bayModel[18].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 469
		bayModel[18].setRotationPoint(-91F, -15F, 22.75F);

		bayModel[19].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 470
		bayModel[19].setRotationPoint(-91F, -18.3F, 22.75F);

		bayModel[20].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 471
		bayModel[20].setRotationPoint(-91F, -14F, 22.75F);

		bayModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F, 0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F); // Box 472
		bayModel[21].setRotationPoint(-98F, -15F, 22.75F);

		bayModel[22].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F); // Box 473
		bayModel[22].setRotationPoint(-98F, -14F, 22.75F);

		bayModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F, 0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F); // Box 474
		bayModel[23].setRotationPoint(-98F, -13F, 22.75F);

		bayModel[24].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 475
		bayModel[24].setRotationPoint(-91F, -12.9F, 22.75F);

		bayModel[25].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F); // Box 476
		bayModel[25].setRotationPoint(-91F, -12.7F, 22.75F);

		bayModel[26].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F); // Box 477
		bayModel[26].setRotationPoint(-91F, -14F, 23.75F);

		bayModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 478
		bayModel[27].setRotationPoint(-91F, -14F, 18.75F);

		bayModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 479
		bayModel[28].setRotationPoint(-42F, -18.6F, 26.75F);
		bayModel[28].rotateAngleX = -0.6981317F;

		bayModel[29].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 480
		bayModel[29].setRotationPoint(-37.5F, -18.6F, 26.75F);
		bayModel[29].rotateAngleX = -0.6981317F;

		bayModel[30].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 481
		bayModel[30].setRotationPoint(-42F, -12.7F, 23.95F);
		bayModel[30].rotateAngleX = 0.6981317F;

		bayModel[31].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 482
		bayModel[31].setRotationPoint(-37.5F, -12.7F, 23.95F);
		bayModel[31].rotateAngleX = 0.6981317F;

		bayModel[32].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 483
		bayModel[32].setRotationPoint(-42F, -17.9F, 19F);
		bayModel[32].rotateAngleX = 0.6981317F;

		bayModel[33].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 484
		bayModel[33].setRotationPoint(-37.5F, -17.9F, 19F);
		bayModel[33].rotateAngleX = 0.6981317F;

		bayModel[34].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 485
		bayModel[34].setRotationPoint(-37.5F, -13.2F, 21.95F);
		bayModel[34].rotateAngleX = -0.6981317F;

		bayModel[35].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 486
		bayModel[35].setRotationPoint(-42F, -13.2F, 21.95F);
		bayModel[35].rotateAngleX = -0.6981317F;

		bayModel[36].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 487
		bayModel[36].setRotationPoint(-3F, -13F, 46.75F);

		bayModel[37].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 488
		bayModel[37].setRotationPoint(-3F, -16.3F, 46.75F);

		bayModel[38].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 489
		bayModel[38].setRotationPoint(-3F, -12F, 46.75F);

		bayModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F, 0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F); // Box 490
		bayModel[39].setRotationPoint(-10F, -13F, 46.75F);

		bayModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F); // Box 491
		bayModel[40].setRotationPoint(-10F, -12F, 46.75F);

		bayModel[41].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F, 0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F); // Box 492
		bayModel[41].setRotationPoint(-10F, -11F, 46.75F);

		bayModel[42].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 493
		bayModel[42].setRotationPoint(-3F, -10.9F, 46.75F);

		bayModel[43].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F); // Box 494
		bayModel[43].setRotationPoint(-3F, -10.7F, 46.75F);

		bayModel[44].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F); // Box 495
		bayModel[44].setRotationPoint(-3F, -12F, 47.75F);

		bayModel[45].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 496
		bayModel[45].setRotationPoint(-3F, -12F, 42.75F);

		bayModel[46].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 497
		bayModel[46].setRotationPoint(46F, -16.6F, 50.75F);
		bayModel[46].rotateAngleX = -0.6981317F;

		bayModel[47].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 498
		bayModel[47].setRotationPoint(50.5F, -16.6F, 50.75F);
		bayModel[47].rotateAngleX = -0.6981317F;

		bayModel[48].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 499
		bayModel[48].setRotationPoint(46F, -10.7F, 47.95F);
		bayModel[48].rotateAngleX = 0.6981317F;

		bayModel[49].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 500
		bayModel[49].setRotationPoint(50.5F, -10.7F, 47.95F);
		bayModel[49].rotateAngleX = 0.6981317F;

		bayModel[50].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 501
		bayModel[50].setRotationPoint(46F, -15.9F, 43F);
		bayModel[50].rotateAngleX = 0.6981317F;

		bayModel[51].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 502
		bayModel[51].setRotationPoint(50.5F, -15.9F, 43F);
		bayModel[51].rotateAngleX = 0.6981317F;

		bayModel[52].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 503
		bayModel[52].setRotationPoint(50.5F, -11.2F, 45.95F);
		bayModel[52].rotateAngleX = -0.6981317F;

		bayModel[53].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 504
		bayModel[53].setRotationPoint(46F, -11.2F, 45.95F);
		bayModel[53].rotateAngleX = -0.6981317F;

		bayModel[54].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 505
		bayModel[54].setRotationPoint(-3F, -13F, -49.25F);

		bayModel[55].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 506
		bayModel[55].setRotationPoint(-3F, -16.3F, -49.25F);

		bayModel[56].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 507
		bayModel[56].setRotationPoint(-3F, -12F, -49.25F);

		bayModel[57].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F, 0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F); // Box 508
		bayModel[57].setRotationPoint(-10F, -13F, -49.25F);

		bayModel[58].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F); // Box 509
		bayModel[58].setRotationPoint(-10F, -12F, -49.25F);

		bayModel[59].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F, 0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F); // Box 510
		bayModel[59].setRotationPoint(-10F, -11F, -49.25F);

		bayModel[60].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 511
		bayModel[60].setRotationPoint(-3F, -10.9F, -49.25F);

		bayModel[61].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F); // Box 512
		bayModel[61].setRotationPoint(-3F, -10.7F, -49.25F);

		bayModel[62].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F); // Box 513
		bayModel[62].setRotationPoint(-3F, -12F, -48.25F);

		bayModel[63].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 514
		bayModel[63].setRotationPoint(-3F, -12F, -53.25F);

		bayModel[64].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 515
		bayModel[64].setRotationPoint(46F, -16.6F, -45.25F);
		bayModel[64].rotateAngleX = -0.6981317F;

		bayModel[65].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 516
		bayModel[65].setRotationPoint(50.5F, -16.6F, -45.25F);
		bayModel[65].rotateAngleX = -0.6981317F;

		bayModel[66].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 517
		bayModel[66].setRotationPoint(46F, -10.7F, -48.05F);
		bayModel[66].rotateAngleX = 0.6981317F;

		bayModel[67].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 518
		bayModel[67].setRotationPoint(50.5F, -10.7F, -48.05F);
		bayModel[67].rotateAngleX = 0.6981317F;

		bayModel[68].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 519
		bayModel[68].setRotationPoint(46F, -15.9F, -53F);
		bayModel[68].rotateAngleX = 0.6981317F;

		bayModel[69].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 520
		bayModel[69].setRotationPoint(50.5F, -15.9F, -53F);
		bayModel[69].rotateAngleX = 0.6981317F;

		bayModel[70].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 521
		bayModel[70].setRotationPoint(50.5F, -11.2F, -50.05F);
		bayModel[70].rotateAngleX = -0.6981317F;

		bayModel[71].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 522
		bayModel[71].setRotationPoint(46F, -11.2F, -50.05F);
		bayModel[71].rotateAngleX = -0.6981317F;

		bayModel[72].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 523
		bayModel[72].setRotationPoint(-33F, -11.7F, -32.55F);
		bayModel[72].rotateAngleX = 0.6981317F;

		bayModel[73].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 524
		bayModel[73].setRotationPoint(-28.5F, -11.7F, -32.55F);
		bayModel[73].rotateAngleX = 0.6981317F;

		bayModel[74].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 525
		bayModel[74].setRotationPoint(-28.5F, -17.6F, -29.75F);
		bayModel[74].rotateAngleX = -0.6981317F;

		bayModel[75].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 526
		bayModel[75].setRotationPoint(-33F, -17.6F, -29.75F);
		bayModel[75].rotateAngleX = -0.6981317F;

		bayModel[76].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 527
		bayModel[76].setRotationPoint(-82F, -13F, -33.75F);

		bayModel[77].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 528
		bayModel[77].setRotationPoint(-82F, -14F, -33.75F);

		bayModel[78].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 529
		bayModel[78].setRotationPoint(-82F, -11.9F, -33.75F);

		bayModel[79].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 530
		bayModel[79].setRotationPoint(-28.5F, -12.2F, -34.55F);
		bayModel[79].rotateAngleX = -0.6981317F;

		bayModel[80].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 531
		bayModel[80].setRotationPoint(-28.5F, -16.9F, -37.5F);
		bayModel[80].rotateAngleX = 0.6981317F;

		bayModel[81].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 532
		bayModel[81].setRotationPoint(-33F, -16.9F, -37.5F);
		bayModel[81].rotateAngleX = 0.6981317F;

		bayModel[82].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 533
		bayModel[82].setRotationPoint(-33F, -12.2F, -34.55F);
		bayModel[82].rotateAngleX = -0.6981317F;

		bayModel[83].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F); // Box 534
		bayModel[83].setRotationPoint(-82F, -13F, -32.75F);

		bayModel[84].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 535
		bayModel[84].setRotationPoint(-82F, -17.3F, -33.75F);

		bayModel[85].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 536
		bayModel[85].setRotationPoint(-82F, -13F, -37.75F);

		bayModel[86].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F); // Box 537
		bayModel[86].setRotationPoint(-82F, -11.7F, -33.75F);

		bayModel[87].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F, 0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F); // Box 538
		bayModel[87].setRotationPoint(-89F, -12F, -33.75F);

		bayModel[88].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F); // Box 539
		bayModel[88].setRotationPoint(-89F, -13F, -33.75F);

		bayModel[89].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F, 0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F); // Box 540
		bayModel[89].setRotationPoint(-89F, -14F, -33.75F);

		bayModel[90].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F); // Box 541
		bayModel[90].setRotationPoint(-91F, -12.7F, -25.25F);

		bayModel[91].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, -3F); // Box 542
		bayModel[91].setRotationPoint(-91F, -14F, -24.25F);

		bayModel[92].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 543
		bayModel[92].setRotationPoint(-91F, -15F, -25.25F);

		bayModel[93].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0.1F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 544
		bayModel[93].setRotationPoint(-91F, -12.9F, -25.25F);

		bayModel[94].addShapeBox(0F, 0F, 0F, 64, 1, 1, 0F,0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, 1.1F); // Box 545
		bayModel[94].setRotationPoint(-91F, -14F, -25.25F);

		bayModel[95].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -3.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -3.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 546
		bayModel[95].setRotationPoint(-91F, -18.3F, -25.25F);

		bayModel[96].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F, 0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F); // Box 547
		bayModel[96].setRotationPoint(-98F, -15F, -25.25F);

		bayModel[97].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, -0.25F, 0.3F); // Box 548
		bayModel[97].setRotationPoint(-98F, -14F, -25.25F);

		bayModel[98].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.25F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0.25F, 0.3F, 0F, -0.7F, -0.35F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.7F, -0.35F); // Box 549
		bayModel[98].setRotationPoint(-98F, -13F, -25.25F);

		bayModel[99].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 550
		bayModel[99].setRotationPoint(-42F, -12.7F, -24.05F);
		bayModel[99].rotateAngleX = 0.6981317F;

		bayModel[100].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 551
		bayModel[100].setRotationPoint(-37.5F, -12.7F, -24.05F);
		bayModel[100].rotateAngleX = 0.6981317F;

		bayModel[101].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 552
		bayModel[101].setRotationPoint(-42F, -18.6F, -21.25F);
		bayModel[101].rotateAngleX = -0.6981317F;

		bayModel[102].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 553
		bayModel[102].setRotationPoint(-37.5F, -18.6F, -21.25F);
		bayModel[102].rotateAngleX = -0.6981317F;

		bayModel[103].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 554
		bayModel[103].setRotationPoint(-37.5F, -17.9F, -29F);
		bayModel[103].rotateAngleX = 0.6981317F;

		bayModel[104].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 555
		bayModel[104].setRotationPoint(-42F, -17.9F, -29F);
		bayModel[104].rotateAngleX = 0.6981317F;

		bayModel[105].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 556
		bayModel[105].setRotationPoint(-37.5F, -13.2F, -26.05F);
		bayModel[105].rotateAngleX = -0.6981317F;

		bayModel[106].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -4.2F, -0.4F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0F, -4.2F, -0.4F); // Box 557
		bayModel[106].setRotationPoint(-42F, -13.2F, -26.05F);
		bayModel[106].rotateAngleX = -0.6981317F;

		bayModel[107].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -3F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 558
		bayModel[107].setRotationPoint(-91F, -14F, -29F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 213
		leftWingModel[1] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 216
		leftWingModel[2] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 218
		leftWingModel[3] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 179
		leftWingModel[4] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 180
		leftWingModel[5] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 183
		leftWingModel[6] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 185
		leftWingModel[7] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 187
		leftWingModel[8] = new ModelRendererTurbo(this, 785, 145, textureX, textureY); // Box 437
		leftWingModel[9] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 438
		leftWingModel[10] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 439
		leftWingModel[11] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 440
		leftWingModel[12] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 467
		leftWingModel[13] = new ModelRendererTurbo(this, 801, 225, textureX, textureY); // Box 468
		leftWingModel[14] = new ModelRendererTurbo(this, 793, 241, textureX, textureY); // Box 559

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 54, 5, 70, 0F,-122F, -6F, 0F, 83F, -6F, -1F, 0F, 0F, 0.5F, -0.55F, 0.85F, 0F, -122F, 2.8F, 0F, 83F, 1.8F, -1F, 0F, -1.2F, 0.5F, 0F, -0.2F, 0F); // Box 213
		leftWingModel[0].setRotationPoint(-46F, -22.5F, -84.15F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 45, 5, 71, 0F,-129F, -6.8F, -1F, 93F, -6F, 0F, -31F, 1F, 0.5F, 0F, -1F, 0F, -129F, 1.8F, -1F, 93F, 2.8F, 0F, -31F, -0.25F, 0.5F, 0F, -1.2F, 0F); // Box 216
		leftWingModel[1].setRotationPoint(-62F, -22.5F, -84.15F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 41, 5, 71, 0F,-106.5F, -6F, 0F, 69F, -6.5F, -2F, -10F, -3F, 0.5F, -22F, 0.1F, -0.25F, -106.5F, 1.8F, 0F, 69F, 1.6F, -2F, -10F, -1.6F, 0.5F, -22F, -1.3F, -0.25F); // Box 218
		leftWingModel[2].setRotationPoint(-15.5F, -22.5F, -83.15F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 43, 6, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 10F, 0.5F, -0.4F, 10F, 0.5F, -0.4F, 0F, 0F, -0.4F); // Box 179
		leftWingModel[3].setRotationPoint(3F, -24.25F, -48.8F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 41, 3, 1, 0F,-7F, 0F, -0.4F, -10F, -1F, -0.4F, -10F, -1F, -0.4F, -7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 180
		leftWingModel[4].setRotationPoint(5F, -27.25F, -48.8F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 34, 3, 1, 0F,-7F, 0F, -0.4F, -10F, 0F, -0.4F, -10F, 0F, -0.4F, -7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 183
		leftWingModel[5].setRotationPoint(-26F, -24F, -28.8F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 185
		leftWingModel[6].setRotationPoint(6F, -23F, -20.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 187
		leftWingModel[7].setRotationPoint(37F, -21F, -45.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 437
		leftWingModel[8].setRotationPoint(-46F, -18.5F, -33.8F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 438
		leftWingModel[9].setRotationPoint(-61F, -19F, -24.8F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 439
		leftWingModel[10].setRotationPoint(-48F, -18.5F, -33.8F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 440
		leftWingModel[11].setRotationPoint(-63F, -19F, -24.8F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 467
		leftWingModel[12].setRotationPoint(-82F, -17.1F, -24.9F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 468
		leftWingModel[13].setRotationPoint(-70F, -16.55F, -33.7F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 559
		leftWingModel[14].setRotationPoint(10F, -16.55F, -49.4F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 617, 161, textureX, textureY); // Box 214
		rightWingModel[1] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 221
		rightWingModel[2] = new ModelRendererTurbo(this, 545, 241, textureX, textureY); // Box 222
		rightWingModel[3] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 181
		rightWingModel[4] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 182
		rightWingModel[5] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 184
		rightWingModel[6] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 186
		rightWingModel[7] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 189
		rightWingModel[8] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 441
		rightWingModel[9] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 442
		rightWingModel[10] = new ModelRendererTurbo(this, 617, 201, textureX, textureY); // Box 443
		rightWingModel[11] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 444
		rightWingModel[12] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 465
		rightWingModel[13] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 466
		rightWingModel[14] = new ModelRendererTurbo(this, 929, 241, textureX, textureY); // Box 560

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 54, 5, 70, 0F,-0.6F, 0.85F, 0F, 0.8F, 0F, 0.5F, 85F, -6F, 0F, -122F, -6F, 0F, 0F, -0.2F, 0F, 0.8F, -1.2F, 0.5F, 85F, 1.8F, 0F, -122F, 2.8F, 0F); // Box 214
		rightWingModel[0].setRotationPoint(-46F, -22.5F, 12.85F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 41, 5, 71, 0F,-22F, 0F, -0.25F, -10F, -3F, 0.5F, 69F, -6.5F, -2F, -106.5F, -6F, 0F, -22F, -1.3F, -0.25F, -10F, -1.6F, 0.5F, 69F, 1.6F, -2F, -106.5F, 1.8F, 0F); // Box 221
		rightWingModel[1].setRotationPoint(-13.5F, -22.5F, 11.85F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 45, 5, 71, 0F,0F, -1F, 0F, -31F, 1F, 0.5F, 93F, -6F, 0F, -129F, -6.8F, -1F, 0F, -1.2F, 0F, -31.5F, -0.25F, 0.5F, 93F, 2.8F, 0F, -129F, 1.8F, -1F); // Box 222
		rightWingModel[2].setRotationPoint(-62F, -22.5F, 11.85F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 41, 3, 1, 0F,-7F, 0F, -0.4F, -10F, -1F, -0.4F, -10F, -1F, -0.4F, -7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 181
		rightWingModel[3].setRotationPoint(7F, -27.25F, 47.2F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 43, 6, 1, 0F,-2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 10F, 0.5F, -0.4F, 10F, 0.5F, -0.4F, 0F, 0F, -0.4F); // Box 182
		rightWingModel[4].setRotationPoint(5F, -24.25F, 47.2F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 34, 3, 1, 0F,-7F, 0F, -0.4F, -10F, 0F, -0.4F, -10F, 0F, -0.4F, -7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 184
		rightWingModel[5].setRotationPoint(-26F, -24F, 27F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 186
		rightWingModel[6].setRotationPoint(6F, -23F, 18.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		rightWingModel[7].setRotationPoint(13F, -16.75F, 79.2F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 441
		rightWingModel[8].setRotationPoint(-63F, -19F, 22.6F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 442
		rightWingModel[9].setRotationPoint(-48F, -18.5F, 31.8F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 443
		rightWingModel[10].setRotationPoint(-46F, -18.5F, 31.8F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 444
		rightWingModel[11].setRotationPoint(-61F, -19F, 22.6F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 465
		rightWingModel[12].setRotationPoint(-70F, -16.55F, 31.8F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 466
		rightWingModel[13].setRotationPoint(-82F, -17.1F, 22.8F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 35, 3, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 560
		rightWingModel[14].setRotationPoint(10F, -16.55F, 46.6F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 203
		bodyWheelModel[1] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 204
		bodyWheelModel[2] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 205
		bodyWheelModel[3] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 206
		bodyWheelModel[4] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 207
		bodyWheelModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 208
		bodyWheelModel[6] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 209
		bodyWheelModel[7] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 210
		bodyWheelModel[8] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 211
		bodyWheelModel[9] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 212
		bodyWheelModel[10] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 213
		bodyWheelModel[11] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 214
		bodyWheelModel[12] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Box 215
		bodyWheelModel[13] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 216
		bodyWheelModel[14] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 217
		bodyWheelModel[15] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 218
		bodyWheelModel[16] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 219
		bodyWheelModel[17] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 220
		bodyWheelModel[18] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 221

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F); // Box 203
		bodyWheelModel[0].setRotationPoint(-104F, -11F, 1.1F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 204
		bodyWheelModel[1].setRotationPoint(-115F, -11F, 1.1F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 205
		bodyWheelModel[2].setRotationPoint(-115F, -11F, -3.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F); // Box 206
		bodyWheelModel[3].setRotationPoint(-104F, -11F, -3.5F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 1.5F, 0.2F, -0.5F, 1.5F, 0.2F, -0.5F, 1.5F, 0.2F, 0F, 1.5F, 0.2F); // Box 207
		bodyWheelModel[4].setRotationPoint(-98.5F, -4F, -1.25F);
		bodyWheelModel[4].rotateAngleZ = 0.54105207F;

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 1.5F, 0.2F, 0F, 1.5F, 0.2F, 0F, 1.5F, 0.2F, 0F, 1.5F, 0.2F); // Box 208
		bodyWheelModel[5].setRotationPoint(-95F, -8.5F, -1.25F);
		bodyWheelModel[5].rotateAngleZ = -0.54105207F;

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F); // Box 209
		bodyWheelModel[6].setRotationPoint(-98.5F, -4F, -1.25F);
		bodyWheelModel[6].rotateAngleZ = 0.54105207F;

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 210
		bodyWheelModel[7].setRotationPoint(-96.5F, -0.5F, -2.75F);
		bodyWheelModel[7].rotateAngleZ = 0.54105207F;

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -1F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -1F, -0.2F, -0.25F); // Box 211
		bodyWheelModel[8].setRotationPoint(-96.5F, -0.5F, -3.25F);
		bodyWheelModel[8].rotateAngleZ = 0.54105207F;

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -1F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -1F, -0.2F, -0.25F); // Box 212
		bodyWheelModel[9].setRotationPoint(-96.5F, -0.5F, 0.75F);
		bodyWheelModel[9].rotateAngleZ = 0.54105207F;

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 1.5F, 0.2F, 0.2F, 1.5F, 0.2F, 0.2F, 1.5F, 0.2F, 0.2F, 1.5F, 0.2F); // Box 213
		bodyWheelModel[10].setRotationPoint(-93.5F, -8.5F, -1.25F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 1.5F, -0.2F, -0.2F, 1.5F, -0.2F, -0.2F, 1.5F, -0.2F, -0.2F, 1.5F, -0.2F); // Box 214
		bodyWheelModel[11].setRotationPoint(-93.5F, -7.5F, -1.25F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 215
		bodyWheelModel[12].setRotationPoint(-96.5F, -2.2F, -1.25F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 216
		bodyWheelModel[13].setRotationPoint(-92F, -0.5F, -2.25F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F); // Box 217
		bodyWheelModel[14].setRotationPoint(-95.5F, -0.5F, -2.25F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F); // Box 218
		bodyWheelModel[15].setRotationPoint(-88.5F, -0.5F, -2.25F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 219
		bodyWheelModel[16].setRotationPoint(-92F, 0.5F, -2.25F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, 0F, 0.3F, 0F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, 0F, 0.3F); // Box 220
		bodyWheelModel[17].setRotationPoint(-89F, 0.5F, -2.25F);

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, -2.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -2.5F, 0.3F); // Box 221
		bodyWheelModel[18].setRotationPoint(-95F, 0.5F, -2.25F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 232
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 233
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 234
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 235
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 236
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 237
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 617, 153, textureX, textureY); // Box 238
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 633, 153, textureX, textureY); // Box 239
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 649, 161, textureX, textureY); // Box 240
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Box 241

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 5, 17, 1, 0F,0F, -0.2F, 0F, 0F, -6.2F, -1F, 0F, -6.2F, 1F, 0F, -0.2F, 0F, 0F, 2.5F, -2F, 0F, -2.5F, -2F, 0F, -2.5F, 2F, 0F, 2.5F, 2F); // Box 232
		leftWingWheelModel[0].setRotationPoint(4F, -17F, -42F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F,-4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -4F, -0.2F, 0F, 3F, 2.5F, -2F, 0F, 1.5F, -2F, 0F, 1.5F, 2F, 3F, 2.5F, 2F); // Box 233
		leftWingWheelModel[1].setRotationPoint(0F, -17F, -42F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		leftWingWheelModel[2].setRotationPoint(-2F, -17F, -39.25F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		leftWingWheelModel[3].setRotationPoint(-1F, -3.5F, -39F);
		leftWingWheelModel[3].rotateAngleZ = -0.61086524F;

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F); // Box 236
		leftWingWheelModel[4].setRotationPoint(2.5F, -1.5F, -38.25F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F); // Box 237
		leftWingWheelModel[5].setRotationPoint(9.5F, -1.5F, -38.25F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 238
		leftWingWheelModel[6].setRotationPoint(6F, -1.5F, -38.25F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, 0F, 0.3F, 0F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, 0F, 0.3F); // Box 239
		leftWingWheelModel[7].setRotationPoint(9F, -0.5F, -38.25F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 240
		leftWingWheelModel[8].setRotationPoint(6F, -0.5F, -38.25F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, -2.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -2.5F, 0.3F); // Box 241
		leftWingWheelModel[9].setRotationPoint(3F, -0.5F, -38.25F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 222
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 223
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Box 224
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 225
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 226
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 227
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 228
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 229
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Box 230
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 231

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, -2.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -2.5F, 0.3F); // Box 222
		rightWingWheelModel[0].setRotationPoint(3F, -0.5F, 34.75F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 223
		rightWingWheelModel[1].setRotationPoint(6F, -0.5F, 34.75F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, 0F, 0.3F, 0F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, 0F, 0.3F); // Box 224
		rightWingWheelModel[2].setRotationPoint(9F, -0.5F, 34.75F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F); // Box 225
		rightWingWheelModel[3].setRotationPoint(9.5F, -1.5F, 34.75F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 226
		rightWingWheelModel[4].setRotationPoint(6F, -1.5F, 34.75F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F); // Box 227
		rightWingWheelModel[5].setRotationPoint(2.5F, -1.5F, 34.75F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightWingWheelModel[6].setRotationPoint(-1F, -3.5F, 38F);
		rightWingWheelModel[6].rotateAngleZ = -0.61086524F;

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightWingWheelModel[7].setRotationPoint(-2F, -17F, 37.25F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F,-4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -4F, -0.2F, 0F, 3F, 2.5F, 2F, 0F, 1.5F, 2F, 0F, 1.5F, -2F, 3F, 2.5F, -2F); // Box 230
		rightWingWheelModel[8].setRotationPoint(0F, -17F, 41F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 5, 17, 1, 0F,0F, -0.2F, 0F, 0F, -6.2F, 1F, 0F, -6.2F, -1F, 0F, -0.2F, 0F, 0F, 2.5F, 2F, 0F, -2.5F, 2F, 0F, -2.5F, -2F, 0F, 2.5F, -2F); // Box 231
		rightWingWheelModel[9].setRotationPoint(4F, -17F, 41F);
	}
}