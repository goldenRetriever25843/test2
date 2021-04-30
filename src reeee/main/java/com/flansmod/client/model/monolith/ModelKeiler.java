//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.07.2016 - 19:41:20
// Last changed on: 18.07.2016 - 19:41:20

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKeiler extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKeiler() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[319];
		turretModel = new ModelRendererTurbo[203];
		barrelModel = new ModelRendererTurbo[38];
		leftTrackWheelModels = new ModelRendererTurbo[31];
		rightTrackWheelModels = new ModelRendererTurbo[31];
		leftTrackModel = new ModelRendererTurbo[10];
		rightTrackModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 300, 440, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 285, 370, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 255, 315, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 160, 345, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 125, 316, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 15, 355, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 15, 355, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 15, 355, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 15, 355, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 15, 355, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 15, 355, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 15, 355, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 0, 364, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 15, 364, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 0, 364, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 15, 364, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 0, 364, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 15, 364, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 0, 364, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 15, 364, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 0, 364, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 15, 364, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 0, 364, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 15, 364, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 0, 364, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 15, 364, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 0, 387, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 0, 393, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 15, 393, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 0, 393, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 0, 387, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 15, 393, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 0, 387, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 0, 393, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 15, 393, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 0, 393, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 0, 387, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 15, 393, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 0, 393, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 0, 387, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 15, 393, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 0, 393, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 0, 387, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 15, 393, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 68
		bodyModel[68] = new ModelRendererTurbo(this, 0, 393, textureX, textureY); // Box 69
		bodyModel[69] = new ModelRendererTurbo(this, 0, 387, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 15, 393, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 0, 374, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 15, 380, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 0, 374, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 15, 380, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 0, 374, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 15, 380, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 15, 380, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 0, 374, textureX, textureY); // Box 89
		bodyModel[89] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 15, 380, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 92
		bodyModel[92] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 0, 374, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 95
		bodyModel[95] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 96
		bodyModel[96] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 97
		bodyModel[97] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 98
		bodyModel[98] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 99
		bodyModel[99] = new ModelRendererTurbo(this, 0, 374, textureX, textureY); // Box 100
		bodyModel[100] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 101
		bodyModel[101] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 102
		bodyModel[102] = new ModelRendererTurbo(this, 15, 380, textureX, textureY); // Box 103
		bodyModel[103] = new ModelRendererTurbo(this, 27, 370, textureX, textureY); // Box 104
		bodyModel[104] = new ModelRendererTurbo(this, 0, 374, textureX, textureY); // Box 105
		bodyModel[105] = new ModelRendererTurbo(this, 31, 355, textureX, textureY); // Box 106
		bodyModel[106] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 107
		bodyModel[107] = new ModelRendererTurbo(this, 52, 318, textureX, textureY); // Box 150
		bodyModel[108] = new ModelRendererTurbo(this, 52, 310, textureX, textureY); // Box 154
		bodyModel[109] = new ModelRendererTurbo(this, 52, 327, textureX, textureY); // Box 155
		bodyModel[110] = new ModelRendererTurbo(this, 52, 318, textureX, textureY); // Box 159
		bodyModel[111] = new ModelRendererTurbo(this, 52, 310, textureX, textureY); // Box 160
		bodyModel[112] = new ModelRendererTurbo(this, 52, 327, textureX, textureY); // Box 161
		bodyModel[113] = new ModelRendererTurbo(this, 136, 319, textureX, textureY); // Box 165
		bodyModel[114] = new ModelRendererTurbo(this, 136, 327, textureX, textureY); // Box 166
		bodyModel[115] = new ModelRendererTurbo(this, 136, 341, textureX, textureY); // Box 167
		bodyModel[116] = new ModelRendererTurbo(this, 25, 386, textureX, textureY); // Box 175
		bodyModel[117] = new ModelRendererTurbo(this, 25, 386, textureX, textureY); // Box 176
		bodyModel[118] = new ModelRendererTurbo(this, 25, 386, textureX, textureY); // Box 178
		bodyModel[119] = new ModelRendererTurbo(this, 25, 386, textureX, textureY); // Box 180
		bodyModel[120] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 186
		bodyModel[121] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 187
		bodyModel[122] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 188
		bodyModel[123] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 189
		bodyModel[124] = new ModelRendererTurbo(this, 136, 327, textureX, textureY); // Box 199
		bodyModel[125] = new ModelRendererTurbo(this, 136, 319, textureX, textureY); // Box 200
		bodyModel[126] = new ModelRendererTurbo(this, 136, 341, textureX, textureY); // Box 201
		bodyModel[127] = new ModelRendererTurbo(this, 104, 332, textureX, textureY); // Box 213
		bodyModel[128] = new ModelRendererTurbo(this, 0, 408, textureX, textureY); // Box 214
		bodyModel[129] = new ModelRendererTurbo(this, 86, 335, textureX, textureY); // Box 215
		bodyModel[130] = new ModelRendererTurbo(this, 104, 317, textureX, textureY); // Box 216
		bodyModel[131] = new ModelRendererTurbo(this, 0, 408, textureX, textureY); // Box 217
		bodyModel[132] = new ModelRendererTurbo(this, 86, 317, textureX, textureY); // Box 218
		bodyModel[133] = new ModelRendererTurbo(this, 0, 306, textureX, textureY); // Box 219
		bodyModel[134] = new ModelRendererTurbo(this, 0, 302, textureX, textureY); // Box 220
		bodyModel[135] = new ModelRendererTurbo(this, 0, 416, textureX, textureY); // Box 221
		bodyModel[136] = new ModelRendererTurbo(this, 0, 468, textureX, textureY); // Box 222
		bodyModel[137] = new ModelRendererTurbo(this, 0, 468, textureX, textureY); // Box 223
		bodyModel[138] = new ModelRendererTurbo(this, 0, 416, textureX, textureY); // Box 224
		bodyModel[139] = new ModelRendererTurbo(this, 0, 468, textureX, textureY); // Box 225
		bodyModel[140] = new ModelRendererTurbo(this, 0, 416, textureX, textureY); // Box 226
		bodyModel[141] = new ModelRendererTurbo(this, 0, 468, textureX, textureY); // Box 227
		bodyModel[142] = new ModelRendererTurbo(this, 0, 416, textureX, textureY); // Box 228
		bodyModel[143] = new ModelRendererTurbo(this, 0, 322, textureX, textureY); // Box 229
		bodyModel[144] = new ModelRendererTurbo(this, 0, 427, textureX, textureY); // Box 231
		bodyModel[145] = new ModelRendererTurbo(this, 0, 457, textureX, textureY); // Box 232
		bodyModel[146] = new ModelRendererTurbo(this, 0, 457, textureX, textureY); // Box 233
		bodyModel[147] = new ModelRendererTurbo(this, 0, 427, textureX, textureY); // Box 234
		bodyModel[148] = new ModelRendererTurbo(this, 0, 457, textureX, textureY); // Box 235
		bodyModel[149] = new ModelRendererTurbo(this, 0, 427, textureX, textureY); // Box 236
		bodyModel[150] = new ModelRendererTurbo(this, 0, 457, textureX, textureY); // Box 237
		bodyModel[151] = new ModelRendererTurbo(this, 0, 427, textureX, textureY); // Box 238
		bodyModel[152] = new ModelRendererTurbo(this, 0, 333, textureX, textureY); // Box 239
		bodyModel[153] = new ModelRendererTurbo(this, 0, 271, textureX, textureY); // Box 240
		bodyModel[154] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 241
		bodyModel[155] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 242
		bodyModel[156] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 243
		bodyModel[157] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 244
		bodyModel[158] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 245
		bodyModel[159] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 246
		bodyModel[160] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 247
		bodyModel[161] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 248
		bodyModel[162] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 249
		bodyModel[163] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 250
		bodyModel[164] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 253
		bodyModel[165] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 254
		bodyModel[166] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 255
		bodyModel[167] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 256
		bodyModel[168] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 257
		bodyModel[169] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 258
		bodyModel[170] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 259
		bodyModel[171] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 260
		bodyModel[172] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 261
		bodyModel[173] = new ModelRendererTurbo(this, 30, 361, textureX, textureY); // Box 262
		bodyModel[174] = new ModelRendererTurbo(this, 80, 270, textureX, textureY); // Box 312
		bodyModel[175] = new ModelRendererTurbo(this, 80, 266, textureX, textureY); // Box 313
		bodyModel[176] = new ModelRendererTurbo(this, 87, 267, textureX, textureY); // Box 314
		bodyModel[177] = new ModelRendererTurbo(this, 87, 270, textureX, textureY); // Box 315
		bodyModel[178] = new ModelRendererTurbo(this, 87, 270, textureX, textureY); // Box 316
		bodyModel[179] = new ModelRendererTurbo(this, 80, 266, textureX, textureY); // Box 317
		bodyModel[180] = new ModelRendererTurbo(this, 80, 270, textureX, textureY); // Box 318
		bodyModel[181] = new ModelRendererTurbo(this, 87, 267, textureX, textureY); // Box 319
		bodyModel[182] = new ModelRendererTurbo(this, 87, 270, textureX, textureY); // Box 320
		bodyModel[183] = new ModelRendererTurbo(this, 80, 266, textureX, textureY); // Box 321
		bodyModel[184] = new ModelRendererTurbo(this, 80, 270, textureX, textureY); // Box 322
		bodyModel[185] = new ModelRendererTurbo(this, 87, 267, textureX, textureY); // Box 323
		bodyModel[186] = new ModelRendererTurbo(this, 141, 271, textureX, textureY); // Box 324
		bodyModel[187] = new ModelRendererTurbo(this, 123, 271, textureX, textureY); // Box 325
		bodyModel[188] = new ModelRendererTurbo(this, 150, 270, textureX, textureY); // Box 326
		bodyModel[189] = new ModelRendererTurbo(this, 115, 272, textureX, textureY); // Box 327
		bodyModel[190] = new ModelRendererTurbo(this, 146, 269, textureX, textureY); // Box 328
		bodyModel[191] = new ModelRendererTurbo(this, 141, 275, textureX, textureY); // Box 329
		bodyModel[192] = new ModelRendererTurbo(this, 54, 262, textureX, textureY); // Box 330
		bodyModel[193] = new ModelRendererTurbo(this, 54, 258, textureX, textureY); // Box 332
		bodyModel[194] = new ModelRendererTurbo(this, 54, 262, textureX, textureY); // Box 335
		bodyModel[195] = new ModelRendererTurbo(this, 54, 258, textureX, textureY); // Box 336
		bodyModel[196] = new ModelRendererTurbo(this, 41, 261, textureX, textureY); // Box 337
		bodyModel[197] = new ModelRendererTurbo(this, 41, 261, textureX, textureY); // Box 338
		bodyModel[198] = new ModelRendererTurbo(this, 12, 265, textureX, textureY); // Box 345
		bodyModel[199] = new ModelRendererTurbo(this, 12, 269, textureX, textureY); // Box 346
		bodyModel[200] = new ModelRendererTurbo(this, 13, 259, textureX, textureY); // Box 347
		bodyModel[201] = new ModelRendererTurbo(this, 12, 269, textureX, textureY); // Box 348
		bodyModel[202] = new ModelRendererTurbo(this, 12, 265, textureX, textureY); // Box 349
		bodyModel[203] = new ModelRendererTurbo(this, 13, 264, textureX, textureY); // Box 350
		bodyModel[204] = new ModelRendererTurbo(this, 12, 265, textureX, textureY); // Box 351
		bodyModel[205] = new ModelRendererTurbo(this, 12, 269, textureX, textureY); // Box 352
		bodyModel[206] = new ModelRendererTurbo(this, 13, 264, textureX, textureY); // Box 353
		bodyModel[207] = new ModelRendererTurbo(this, 12, 269, textureX, textureY); // Box 354
		bodyModel[208] = new ModelRendererTurbo(this, 12, 265, textureX, textureY); // Box 355
		bodyModel[209] = new ModelRendererTurbo(this, 13, 259, textureX, textureY); // Box 356
		bodyModel[210] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Box 357
		bodyModel[211] = new ModelRendererTurbo(this, 11, 310, textureX, textureY); // Box 358
		bodyModel[212] = new ModelRendererTurbo(this, 22, 310, textureX, textureY); // Box 359
		bodyModel[213] = new ModelRendererTurbo(this, 72, 269, textureX, textureY); // Box 360
		bodyModel[214] = new ModelRendererTurbo(this, 65, 269, textureX, textureY); // Box 361
		bodyModel[215] = new ModelRendererTurbo(this, 41, 266, textureX, textureY); // Box 362
		bodyModel[216] = new ModelRendererTurbo(this, 56, 269, textureX, textureY); // Box 363
		bodyModel[217] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Box 364
		bodyModel[218] = new ModelRendererTurbo(this, 11, 310, textureX, textureY); // Box 365
		bodyModel[219] = new ModelRendererTurbo(this, 22, 310, textureX, textureY); // Box 366
		bodyModel[220] = new ModelRendererTurbo(this, 72, 269, textureX, textureY); // Box 367
		bodyModel[221] = new ModelRendererTurbo(this, 65, 269, textureX, textureY); // Box 368
		bodyModel[222] = new ModelRendererTurbo(this, 41, 266, textureX, textureY); // Box 369
		bodyModel[223] = new ModelRendererTurbo(this, 56, 269, textureX, textureY); // Box 370
		bodyModel[224] = new ModelRendererTurbo(this, 12, 264, textureX, textureY); // Box 359
		bodyModel[225] = new ModelRendererTurbo(this, 27, 261, textureX, textureY); // Box 360
		bodyModel[226] = new ModelRendererTurbo(this, 6, 266, textureX, textureY); // Box 361
		bodyModel[227] = new ModelRendererTurbo(this, 231, 292, textureX, textureY); // Box 362
		bodyModel[228] = new ModelRendererTurbo(this, 61, 292, textureX, textureY); // Box 363
		bodyModel[229] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 364
		bodyModel[230] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 365
		bodyModel[231] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 366
		bodyModel[232] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 367
		bodyModel[233] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 368
		bodyModel[234] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 369
		bodyModel[235] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 370
		bodyModel[236] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 371
		bodyModel[237] = new ModelRendererTurbo(this, 301, 292, textureX, textureY); // Box 372
		bodyModel[238] = new ModelRendererTurbo(this, 130, 292, textureX, textureY); // Box 373
		bodyModel[239] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 374
		bodyModel[240] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 375
		bodyModel[241] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 376
		bodyModel[242] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 377
		bodyModel[243] = new ModelRendererTurbo(this, 231, 302, textureX, textureY); // Box 378
		bodyModel[244] = new ModelRendererTurbo(this, 61, 284, textureX, textureY); // Box 379
		bodyModel[245] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 380
		bodyModel[246] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 381
		bodyModel[247] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 382
		bodyModel[248] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 383
		bodyModel[249] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 384
		bodyModel[250] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 385
		bodyModel[251] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 386
		bodyModel[252] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 387
		bodyModel[253] = new ModelRendererTurbo(this, 301, 302, textureX, textureY); // Box 388
		bodyModel[254] = new ModelRendererTurbo(this, 130, 284, textureX, textureY); // Box 389
		bodyModel[255] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 390
		bodyModel[256] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 391
		bodyModel[257] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 392
		bodyModel[258] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 393
		bodyModel[259] = new ModelRendererTurbo(this, 0, 292, textureX, textureY); // Box 394
		bodyModel[260] = new ModelRendererTurbo(this, 22, 292, textureX, textureY); // Box 395
		bodyModel[261] = new ModelRendererTurbo(this, 0, 278, textureX, textureY); // Box 396
		bodyModel[262] = new ModelRendererTurbo(this, 44, 274, textureX, textureY); // Box 397
		bodyModel[263] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 398
		bodyModel[264] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 399
		bodyModel[265] = new ModelRendererTurbo(this, 5, 316, textureX, textureY); // Box 400
		bodyModel[266] = new ModelRendererTurbo(this, 0, 316, textureX, textureY); // Box 401
		bodyModel[267] = new ModelRendererTurbo(this, 88, 188, textureX, textureY); // Box 402
		bodyModel[268] = new ModelRendererTurbo(this, 43, 291, textureX, textureY); // Box 410
		bodyModel[269] = new ModelRendererTurbo(this, 43, 296, textureX, textureY); // Box 411
		bodyModel[270] = new ModelRendererTurbo(this, 52, 298, textureX, textureY); // Box 412
		bodyModel[271] = new ModelRendererTurbo(this, 52, 298, textureX, textureY); // Box 413
		bodyModel[272] = new ModelRendererTurbo(this, 52, 288, textureX, textureY); // Box 414
		bodyModel[273] = new ModelRendererTurbo(this, 52, 282, textureX, textureY); // Box 415
		bodyModel[274] = new ModelRendererTurbo(this, 21, 315, textureX, textureY); // Box 416
		bodyModel[275] = new ModelRendererTurbo(this, 16, 315, textureX, textureY); // Box 417
		bodyModel[276] = new ModelRendererTurbo(this, 11, 315, textureX, textureY); // Box 418
		bodyModel[277] = new ModelRendererTurbo(this, 59, 292, textureX, textureY); // Box 419
		bodyModel[278] = new ModelRendererTurbo(this, 59, 292, textureX, textureY); // Box 420
		bodyModel[279] = new ModelRendererTurbo(this, 11, 315, textureX, textureY); // Box 421
		bodyModel[280] = new ModelRendererTurbo(this, 21, 315, textureX, textureY); // Box 422
		bodyModel[281] = new ModelRendererTurbo(this, 16, 315, textureX, textureY); // Box 423
		bodyModel[282] = new ModelRendererTurbo(this, 52, 282, textureX, textureY); // Box 424
		bodyModel[283] = new ModelRendererTurbo(this, 52, 288, textureX, textureY); // Box 425
		bodyModel[284] = new ModelRendererTurbo(this, 52, 295, textureX, textureY); // Box 426
		bodyModel[285] = new ModelRendererTurbo(this, 52, 295, textureX, textureY); // Box 427
		bodyModel[286] = new ModelRendererTurbo(this, 43, 291, textureX, textureY); // Box 428
		bodyModel[287] = new ModelRendererTurbo(this, 43, 296, textureX, textureY); // Box 429
		bodyModel[288] = new ModelRendererTurbo(this, 196, 274, textureX, textureY); // Box 429
		bodyModel[289] = new ModelRendererTurbo(this, 196, 274, textureX, textureY); // Box 430
		bodyModel[290] = new ModelRendererTurbo(this, 184, 282, textureX, textureY); // Box 431
		bodyModel[291] = new ModelRendererTurbo(this, 202, 285, textureX, textureY); // Box 432
		bodyModel[292] = new ModelRendererTurbo(this, 202, 272, textureX, textureY); // Box 433
		bodyModel[293] = new ModelRendererTurbo(this, 186, 283, textureX, textureY); // Box 434
		bodyModel[294] = new ModelRendererTurbo(this, 202, 285, textureX, textureY); // Box 435
		bodyModel[295] = new ModelRendererTurbo(this, 196, 274, textureX, textureY); // Box 436
		bodyModel[296] = new ModelRendererTurbo(this, 184, 282, textureX, textureY); // Box 437
		bodyModel[297] = new ModelRendererTurbo(this, 202, 272, textureX, textureY); // Box 438
		bodyModel[298] = new ModelRendererTurbo(this, 196, 274, textureX, textureY); // Box 439
		bodyModel[299] = new ModelRendererTurbo(this, 186, 283, textureX, textureY); // Box 440
		bodyModel[300] = new ModelRendererTurbo(this, 97, 155, textureX, textureY); // Box 441
		bodyModel[301] = new ModelRendererTurbo(this, 141, 165, textureX, textureY); // Box 442
		bodyModel[302] = new ModelRendererTurbo(this, 277, 339, textureX, textureY); // Box 443
		bodyModel[303] = new ModelRendererTurbo(this, 254, 339, textureX, textureY); // Box 444
		bodyModel[304] = new ModelRendererTurbo(this, 171, 319, textureX, textureY); // Box 445
		bodyModel[305] = new ModelRendererTurbo(this, 233, 313, textureX, textureY); // Box 446
		bodyModel[306] = new ModelRendererTurbo(this, 375, 297, textureX, textureY); // Box 449
		bodyModel[307] = new ModelRendererTurbo(this, 160, 371, textureX, textureY); // Box 450
		bodyModel[308] = new ModelRendererTurbo(this, 160, 355, textureX, textureY); // Box 451
		bodyModel[309] = new ModelRendererTurbo(this, 90, 263, textureX, textureY); // Box 452
		bodyModel[310] = new ModelRendererTurbo(this, 330, 335, textureX, textureY); // Box 476
		bodyModel[311] = new ModelRendererTurbo(this, 362, 335, textureX, textureY); // Box 477
		bodyModel[312] = new ModelRendererTurbo(this, 362, 320, textureX, textureY); // Box 478
		bodyModel[313] = new ModelRendererTurbo(this, 330, 320, textureX, textureY); // Box 479
		bodyModel[314] = new ModelRendererTurbo(this, 330, 320, textureX, textureY); // Box 480
		bodyModel[315] = new ModelRendererTurbo(this, 330, 335, textureX, textureY); // Box 481
		bodyModel[316] = new ModelRendererTurbo(this, 362, 335, textureX, textureY); // Box 482
		bodyModel[317] = new ModelRendererTurbo(this, 362, 320, textureX, textureY); // Box 483
		bodyModel[318] = new ModelRendererTurbo(this, 333, 285, textureX, textureY); // Box 484

		bodyModel[0].addShapeBox(0F, 0F, 0F, 115, 11, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14.5F, 0F, 0F, -14.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-61F, -9F, -17F);

		bodyModel[1].addShapeBox(0F, -9F, 0F, 123, 11, 34, 0F,0.5F, -8.5F, 0F, -9F, -8.5F, 0F, -9F, -8.5F, 0F, 0.5F, -8.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-69F, -11F, -17F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 26, 9, 56, 0F,0F, 0F, -2.92F, -10F, 0F, -2.92F, -10F, 0F, -2.92F, 0F, 0F, -2.92F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 3
		bodyModel[2].setRotationPoint(19F, -14F, -28F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 16, 16, 50, 0F,0F, 0F, -2.25F, -15F, 0F, -2.25F, -15F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, -14F, 0.08F, 0F, -14F, 0.08F, 0F, -14F, 0.08F, 0F, -14F, 0.08F); // Box 4
		bodyModel[3].setRotationPoint(19F, -16F, -25F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 57, 5, 45, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 5.5F, 0F, -0.5F, 5.5F, 0F, -0.5F, 5.5F, 0F, -0.5F, 5.5F); // Box 5
		bodyModel[4].setRotationPoint(-38F, -16F, -22.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 7, 45, 0F,0F, 0F, -1F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, -1F, 0F, -1F, 5.5F, 0F, -1F, 5.5F, 0F, -1F, 5.5F, 0F, -1F, 5.5F); // Box 6
		bodyModel[5].setRotationPoint(-49F, -17.5F, -22.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 23, 7, 45, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, -2F, -1F, 5.5F, -0.5F, -1F, 5.5F, -0.5F, -1F, 5.5F, -2F, -1F, 5.5F); // Box 7
		bodyModel[6].setRotationPoint(-71.5F, -17.5F, -22.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 8, 34, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-69F, -9F, -17F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 3, 34, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-66F, -1F, -17F);

		bodyModel[9].addShapeBox(0F, -2.5F, 0F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(24.5F, 0.75F, -17.25F);
		bodyModel[9].rotateAngleZ = 0.17453293F;

		bodyModel[10].addShapeBox(-4F, -2.5F, 0F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[10].setRotationPoint(24.5F, 0.75F, -17.25F);
		bodyModel[10].rotateAngleZ = 0.17453293F;

		bodyModel[11].addShapeBox(-4F, -2.5F, 0F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[11].setRotationPoint(37.5F, 0.75F, -17.25F);
		bodyModel[11].rotateAngleZ = 0.17453293F;

		bodyModel[12].addShapeBox(0F, -2.5F, 0F, 4, 5, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(37.5F, 0.75F, -17.25F);
		bodyModel[12].rotateAngleZ = 0.17453293F;

		bodyModel[13].addShapeBox(0F, -2.5F, 0F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(11.5F, 0.75F, -17.25F);
		bodyModel[13].rotateAngleZ = 0.17453293F;

		bodyModel[14].addShapeBox(-4F, -2.5F, 0F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 15
		bodyModel[14].setRotationPoint(11.5F, 0.75F, -17.25F);
		bodyModel[14].rotateAngleZ = 0.17453293F;

		bodyModel[15].addShapeBox(0F, -2.5F, 0F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-1F, 0.75F, -17.25F);
		bodyModel[15].rotateAngleZ = 0.17453293F;

		bodyModel[16].addShapeBox(-4F, -2.5F, 0F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-1F, 0.75F, -17.25F);
		bodyModel[16].rotateAngleZ = 0.17453293F;

		bodyModel[17].addShapeBox(0F, -2.5F, 0F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-14F, 0.75F, -17.25F);
		bodyModel[17].rotateAngleZ = 0.17453293F;

		bodyModel[18].addShapeBox(-4F, -2.5F, 0F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-14F, 0.75F, -17.25F);
		bodyModel[18].rotateAngleZ = 0.17453293F;

		bodyModel[19].addShapeBox(0F, -2.5F, 0F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(-26.5F, 0.75F, -17.25F);
		bodyModel[19].rotateAngleZ = 0.17453293F;

		bodyModel[20].addShapeBox(-4F, -2.5F, 0F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-26.5F, 0.75F, -17.25F);
		bodyModel[20].rotateAngleZ = 0.17453293F;

		bodyModel[21].addShapeBox(0F, -2.5F, 0F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-39F, 0.75F, -17.25F);
		bodyModel[21].rotateAngleZ = 0.17453293F;

		bodyModel[22].addShapeBox(-4F, -2.5F, 0F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-39F, 0.75F, -17.25F);
		bodyModel[22].rotateAngleZ = 0.17453293F;

		bodyModel[23].addShapeBox(0F, -2.5F, -3F, 4, 5, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(37.5F, 0.75F, 17.25F);
		bodyModel[23].rotateAngleZ = 0.17453293F;

		bodyModel[24].addShapeBox(-4F, -2.5F, -3F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 25
		bodyModel[24].setRotationPoint(37.5F, 0.75F, 17.25F);
		bodyModel[24].rotateAngleZ = 0.17453293F;

		bodyModel[25].addShapeBox(0F, -2.5F, -3F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(24.5F, 0.75F, 17.25F);
		bodyModel[25].rotateAngleZ = 0.17453293F;

		bodyModel[26].addShapeBox(-4F, -2.5F, -3F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[26].setRotationPoint(24.5F, 0.75F, 17.25F);
		bodyModel[26].rotateAngleZ = 0.17453293F;

		bodyModel[27].addShapeBox(0F, -2.5F, -3F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-1F, 0.75F, 17.25F);
		bodyModel[27].rotateAngleZ = 0.17453293F;

		bodyModel[28].addShapeBox(-4F, -2.5F, -3F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-1F, 0.75F, 17.25F);
		bodyModel[28].rotateAngleZ = 0.17453293F;

		bodyModel[29].addShapeBox(0F, -2.5F, -3F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(11.5F, 0.75F, 17.25F);
		bodyModel[29].rotateAngleZ = 0.17453293F;

		bodyModel[30].addShapeBox(-4F, -2.5F, -3F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[30].setRotationPoint(11.5F, 0.75F, 17.25F);
		bodyModel[30].rotateAngleZ = 0.17453293F;

		bodyModel[31].addShapeBox(0F, -2.5F, -3F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(-14F, 0.75F, 17.25F);
		bodyModel[31].rotateAngleZ = 0.17453293F;

		bodyModel[32].addShapeBox(-4F, -2.5F, -3F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 33
		bodyModel[32].setRotationPoint(-14F, 0.75F, 17.25F);
		bodyModel[32].rotateAngleZ = 0.17453293F;

		bodyModel[33].addShapeBox(0F, -2.5F, -3F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(-26.5F, 0.75F, 17.25F);
		bodyModel[33].rotateAngleZ = 0.17453293F;

		bodyModel[34].addShapeBox(-4F, -2.5F, -3F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 35
		bodyModel[34].setRotationPoint(-26.5F, 0.75F, 17.25F);
		bodyModel[34].rotateAngleZ = 0.17453293F;

		bodyModel[35].addShapeBox(0F, -2.5F, -3F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[35].setRotationPoint(-39F, 0.75F, 17.25F);
		bodyModel[35].rotateAngleZ = 0.17453293F;

		bodyModel[36].addShapeBox(-4F, -2.5F, -3F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 37
		bodyModel[36].setRotationPoint(-39F, 0.75F, 17.25F);
		bodyModel[36].rotateAngleZ = 0.17453293F;

		bodyModel[37].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[37].setRotationPoint(37.5F, 0F, -18.25F);
		bodyModel[37].rotateAngleZ = 0.34906585F;

		bodyModel[38].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[38].setRotationPoint(37.5F, 0F, -18.25F);
		bodyModel[38].rotateAngleZ = 0.34906585F;

		bodyModel[39].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 40
		bodyModel[39].setRotationPoint(37.5F, 0F, -18.25F);
		bodyModel[39].rotateAngleZ = 0.34906585F;

		bodyModel[40].addShapeBox(-1F, -1F, -1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[40].setRotationPoint(37.5F, 0F, -18.25F);
		bodyModel[40].rotateAngleZ = 0.34906585F;

		bodyModel[41].addShapeBox(-9.5F, -1F, -3.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[41].setRotationPoint(37.5F, 0F, -18.25F);
		bodyModel[41].rotateAngleZ = 0.34906585F;

		bodyModel[42].addShapeBox(-9.5F, -1F, -3.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(24.5F, 0.5F, -18.25F);
		bodyModel[42].rotateAngleZ = 0.34906585F;

		bodyModel[43].addShapeBox(-1F, -1F, -1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(24.5F, 0.5F, -18.25F);
		bodyModel[43].rotateAngleZ = 0.34906585F;

		bodyModel[44].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[44].setRotationPoint(24.5F, 0.5F, -18.25F);
		bodyModel[44].rotateAngleZ = 0.34906585F;

		bodyModel[45].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[45].setRotationPoint(24.5F, 0.5F, -18.25F);
		bodyModel[45].rotateAngleZ = 0.34906585F;

		bodyModel[46].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 47
		bodyModel[46].setRotationPoint(24.5F, 0.5F, -18.25F);
		bodyModel[46].rotateAngleZ = 0.34906585F;

		bodyModel[47].addShapeBox(-1F, -1F, -1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[47].setRotationPoint(11.5F, 0.5F, -18.25F);
		bodyModel[47].rotateAngleZ = 0.34906585F;

		bodyModel[48].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[48].setRotationPoint(11.5F, 0.5F, -18.25F);
		bodyModel[48].rotateAngleZ = 0.34906585F;

		bodyModel[49].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[49].setRotationPoint(11.5F, 0.5F, -18.25F);
		bodyModel[49].rotateAngleZ = 0.34906585F;

		bodyModel[50].addShapeBox(-9.5F, -1F, -3.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[50].setRotationPoint(11.5F, 0.5F, -18.25F);
		bodyModel[50].rotateAngleZ = 0.34906585F;

		bodyModel[51].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 52
		bodyModel[51].setRotationPoint(11.5F, 0.5F, -18.25F);
		bodyModel[51].rotateAngleZ = 0.34906585F;

		bodyModel[52].addShapeBox(-1F, -1F, -1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[52].setRotationPoint(-1F, 0.5F, -18.25F);
		bodyModel[52].rotateAngleZ = 0.34906585F;

		bodyModel[53].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[53].setRotationPoint(-1F, 0.5F, -18.25F);
		bodyModel[53].rotateAngleZ = 0.34906585F;

		bodyModel[54].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[54].setRotationPoint(-1F, 0.5F, -18.25F);
		bodyModel[54].rotateAngleZ = 0.34906585F;

		bodyModel[55].addShapeBox(-9.5F, -1F, -3.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[55].setRotationPoint(-1F, 0.5F, -18.25F);
		bodyModel[55].rotateAngleZ = 0.34906585F;

		bodyModel[56].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 57
		bodyModel[56].setRotationPoint(-1F, 0.5F, -18.25F);
		bodyModel[56].rotateAngleZ = 0.34906585F;

		bodyModel[57].addShapeBox(-1F, -1F, -1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[57].setRotationPoint(-14F, 0.5F, -18.25F);
		bodyModel[57].rotateAngleZ = 0.34906585F;

		bodyModel[58].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[58].setRotationPoint(-14F, 0.5F, -18.25F);
		bodyModel[58].rotateAngleZ = 0.34906585F;

		bodyModel[59].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[59].setRotationPoint(-14F, 0.5F, -18.25F);
		bodyModel[59].rotateAngleZ = 0.34906585F;

		bodyModel[60].addShapeBox(-9.5F, -1F, -3.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[60].setRotationPoint(-14F, 0.5F, -18.25F);
		bodyModel[60].rotateAngleZ = 0.34906585F;

		bodyModel[61].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 62
		bodyModel[61].setRotationPoint(-14F, 0.5F, -18.25F);
		bodyModel[61].rotateAngleZ = 0.34906585F;

		bodyModel[62].addShapeBox(-1F, -1F, -1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[62].setRotationPoint(-26.5F, 0.5F, -18.25F);
		bodyModel[62].rotateAngleZ = 0.34906585F;

		bodyModel[63].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[63].setRotationPoint(-26.5F, 0.5F, -18.25F);
		bodyModel[63].rotateAngleZ = 0.34906585F;

		bodyModel[64].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[64].setRotationPoint(-26.5F, 0.5F, -18.25F);
		bodyModel[64].rotateAngleZ = 0.34906585F;

		bodyModel[65].addShapeBox(-9.5F, -1F, -3.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[65].setRotationPoint(-26.5F, 0.5F, -18.25F);
		bodyModel[65].rotateAngleZ = 0.34906585F;

		bodyModel[66].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 67
		bodyModel[66].setRotationPoint(-26.5F, 0.5F, -18.25F);
		bodyModel[66].rotateAngleZ = 0.34906585F;

		bodyModel[67].addShapeBox(-1F, -1F, -1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[67].setRotationPoint(-39F, 0.5F, -18.25F);
		bodyModel[67].rotateAngleZ = 0.34906585F;

		bodyModel[68].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[68].setRotationPoint(-39F, 0.5F, -18.25F);
		bodyModel[68].rotateAngleZ = 0.34906585F;

		bodyModel[69].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[69].setRotationPoint(-39F, 0.5F, -18.25F);
		bodyModel[69].rotateAngleZ = 0.34906585F;

		bodyModel[70].addShapeBox(-9.5F, -1F, -3.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[70].setRotationPoint(-39F, 0.5F, -18.25F);
		bodyModel[70].rotateAngleZ = 0.34906585F;

		bodyModel[71].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 72
		bodyModel[71].setRotationPoint(-39F, 0.5F, -18.25F);
		bodyModel[71].rotateAngleZ = 0.34906585F;

		bodyModel[72].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[72].setRotationPoint(-39F, 0.5F, 18.25F);
		bodyModel[72].rotateAngleZ = 0.34906585F;

		bodyModel[73].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 74
		bodyModel[73].setRotationPoint(-39F, 0.5F, 18.25F);
		bodyModel[73].rotateAngleZ = 0.34906585F;

		bodyModel[74].addShapeBox(-9.5F, -1F, -0.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[74].setRotationPoint(-39F, 0.5F, 18.25F);
		bodyModel[74].rotateAngleZ = 0.34906585F;

		bodyModel[75].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[75].setRotationPoint(-39F, 0.5F, 18.25F);
		bodyModel[75].rotateAngleZ = 0.34906585F;

		bodyModel[76].addShapeBox(-9.5F, -1F, -0.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[76].setRotationPoint(-26.5F, 0.5F, 18.25F);
		bodyModel[76].rotateAngleZ = 0.34906585F;

		bodyModel[77].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[77].setRotationPoint(-26.5F, 0.5F, 18.25F);
		bodyModel[77].rotateAngleZ = 0.34906585F;

		bodyModel[78].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[78].setRotationPoint(-26.5F, 0.5F, 18.25F);
		bodyModel[78].rotateAngleZ = 0.34906585F;

		bodyModel[79].addShapeBox(-1F, -1F, -0.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[79].setRotationPoint(-26.5F, 0.5F, 17.75F);
		bodyModel[79].rotateAngleZ = 0.34906585F;

		bodyModel[80].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 81
		bodyModel[80].setRotationPoint(-26.5F, 0.5F, 18.25F);
		bodyModel[80].rotateAngleZ = 0.34906585F;

		bodyModel[81].addShapeBox(-1F, -1F, -0.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[81].setRotationPoint(-39F, 0.5F, 17.75F);
		bodyModel[81].rotateAngleZ = 0.34906585F;

		bodyModel[82].addShapeBox(-9.5F, -1F, -0.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[82].setRotationPoint(-14F, 0.5F, 18.25F);
		bodyModel[82].rotateAngleZ = 0.34906585F;

		bodyModel[83].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[83].setRotationPoint(-14F, 0.5F, 18.25F);
		bodyModel[83].rotateAngleZ = 0.34906585F;

		bodyModel[84].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 85
		bodyModel[84].setRotationPoint(-14F, 0.5F, 18.25F);
		bodyModel[84].rotateAngleZ = 0.34906585F;

		bodyModel[85].addShapeBox(-1F, -1F, -0.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[85].setRotationPoint(-14F, 0.5F, 17.75F);
		bodyModel[85].rotateAngleZ = 0.34906585F;

		bodyModel[86].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[86].setRotationPoint(-14F, 0.5F, 18.25F);
		bodyModel[86].rotateAngleZ = 0.34906585F;

		bodyModel[87].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 88
		bodyModel[87].setRotationPoint(-1F, 0.5F, 18.25F);
		bodyModel[87].rotateAngleZ = 0.34906585F;

		bodyModel[88].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[88].setRotationPoint(11.5F, 0.5F, 18.25F);
		bodyModel[88].rotateAngleZ = 0.34906585F;

		bodyModel[89].addShapeBox(-9.5F, -1F, -0.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[89].setRotationPoint(11.5F, 0.5F, 18.25F);
		bodyModel[89].rotateAngleZ = 0.34906585F;

		bodyModel[90].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 91
		bodyModel[90].setRotationPoint(11.5F, 0.5F, 18.25F);
		bodyModel[90].rotateAngleZ = 0.34906585F;

		bodyModel[91].addShapeBox(-1F, -1F, -0.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[91].setRotationPoint(11.5F, 0.5F, 17.75F);
		bodyModel[91].rotateAngleZ = 0.34906585F;

		bodyModel[92].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[92].setRotationPoint(11.5F, 0.5F, 18.25F);
		bodyModel[92].rotateAngleZ = 0.34906585F;

		bodyModel[93].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[93].setRotationPoint(24.5F, 0.5F, 18.25F);
		bodyModel[93].rotateAngleZ = 0.34906585F;

		bodyModel[94].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 95
		bodyModel[94].setRotationPoint(24.5F, 0.5F, 18.25F);
		bodyModel[94].rotateAngleZ = 0.34906585F;

		bodyModel[95].addShapeBox(-9.5F, -1F, -0.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[95].setRotationPoint(24.5F, 0.5F, 18.25F);
		bodyModel[95].rotateAngleZ = 0.34906585F;

		bodyModel[96].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[96].setRotationPoint(24.5F, 0.5F, 18.25F);
		bodyModel[96].rotateAngleZ = 0.34906585F;

		bodyModel[97].addShapeBox(-1F, -1F, -0.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[97].setRotationPoint(24.5F, 0.5F, 17.75F);
		bodyModel[97].rotateAngleZ = 0.34906585F;

		bodyModel[98].addShapeBox(-9.5F, -1F, -0.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[98].setRotationPoint(37.5F, 0F, 18.25F);
		bodyModel[98].rotateAngleZ = 0.34906585F;

		bodyModel[99].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[99].setRotationPoint(37.5F, 0F, 18.25F);
		bodyModel[99].rotateAngleZ = 0.34906585F;

		bodyModel[100].addShapeBox(-1F, -1F, -0.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[100].setRotationPoint(37.5F, 0F, 17.75F);
		bodyModel[100].rotateAngleZ = 0.34906585F;

		bodyModel[101].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[101].setRotationPoint(37.5F, 0F, 18.25F);
		bodyModel[101].rotateAngleZ = 0.34906585F;

		bodyModel[102].addShapeBox(-11F, -1.5F, -1F, 2, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 103
		bodyModel[102].setRotationPoint(37.5F, 0F, 18.25F);
		bodyModel[102].rotateAngleZ = 0.34906585F;

		bodyModel[103].addShapeBox(-9.5F, -1F, -0.25F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[103].setRotationPoint(-1F, 0.5F, 18.25F);
		bodyModel[103].rotateAngleZ = 0.34906585F;

		bodyModel[104].addShapeBox(-9F, -1.5F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[104].setRotationPoint(-1F, 0.5F, 18.25F);
		bodyModel[104].rotateAngleZ = 0.34906585F;

		bodyModel[105].addShapeBox(-1F, -1F, -0.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[105].setRotationPoint(-1F, 0.5F, 17.75F);
		bodyModel[105].rotateAngleZ = 0.34906585F;

		bodyModel[106].addShapeBox(0F, -1.5F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[106].setRotationPoint(-1F, 0.5F, 18.25F);
		bodyModel[106].rotateAngleZ = 0.34906585F;

		bodyModel[107].addShapeBox(-2F, -1F, -1.25F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[107].setRotationPoint(41.5F, -4F, -20F);

		bodyModel[108].addShapeBox(-2F, -2F, -1.25F, 4, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[108].setRotationPoint(41.5F, -4F, -20F);

		bodyModel[109].addShapeBox(-2F, 1F, -1.25F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 155
		bodyModel[109].setRotationPoint(41.5F, -4F, -20F);

		bodyModel[110].addShapeBox(-2F, -1F, -3.25F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[110].setRotationPoint(41.5F, -4F, 20F);

		bodyModel[111].addShapeBox(-2F, -2F, -3.25F, 4, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[111].setRotationPoint(41.5F, -4F, 20F);

		bodyModel[112].addShapeBox(-2F, 1F, -3.25F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 161
		bodyModel[112].setRotationPoint(41.5F, -4F, 20F);

		bodyModel[113].addShapeBox(-3F, -3F, -1F, 6, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[113].setRotationPoint(-59.5F, -4F, -20F);

		bodyModel[114].addShapeBox(-3F, -2F, -1F, 6, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[114].setRotationPoint(-59.5F, -4F, -20F);

		bodyModel[115].addShapeBox(-3F, 2F, -1F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[115].setRotationPoint(-59.5F, -4F, -20F);

		bodyModel[116].addShapeBox(-1F, -1F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 175
		bodyModel[116].setRotationPoint(22.5F, -7F, -22F);

		bodyModel[117].addShapeBox(-1F, -1F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 176
		bodyModel[117].setRotationPoint(9.5F, -7F, -22F);

		bodyModel[118].addShapeBox(-1F, -1F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 178
		bodyModel[118].setRotationPoint(-41.25F, -7F, -22F);

		bodyModel[119].addShapeBox(-1F, -1F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 180
		bodyModel[119].setRotationPoint(-16.25F, -7F, -22F);

		bodyModel[120].addShapeBox(-1F, -1F, -4F, 2, 2, 5, 0F,1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[120].setRotationPoint(22.5F, -7F, 20.5F);

		bodyModel[121].addShapeBox(-1F, -1F, -4F, 2, 2, 5, 0F,1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[121].setRotationPoint(9.5F, -7F, 20.5F);

		bodyModel[122].addShapeBox(-1F, -1F, -4F, 2, 2, 5, 0F,1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[122].setRotationPoint(-16.25F, -7F, 20.5F);

		bodyModel[123].addShapeBox(-1F, -1F, -4F, 2, 2, 5, 0F,1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[123].setRotationPoint(-41.25F, -7F, 20.5F);

		bodyModel[124].addShapeBox(-3F, -2F, -4F, 6, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[124].setRotationPoint(-59.5F, -4F, 20F);

		bodyModel[125].addShapeBox(-3F, -3F, -4F, 6, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[125].setRotationPoint(-59.5F, -4F, 20F);

		bodyModel[126].addShapeBox(-3F, 2F, -4F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 201
		bodyModel[126].setRotationPoint(-59.5F, -4F, 20F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0.35F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.35F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F); // Box 213
		bodyModel[127].setRotationPoint(42F, -12F, -29F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 214
		bodyModel[128].setRotationPoint(42F, -11F, -29F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 5, 12, 0F,0F, 0.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, -0.5F, 0F); // Box 215
		bodyModel[129].setRotationPoint(48F, -10.5F, -29F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0.35F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.35F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F); // Box 216
		bodyModel[130].setRotationPoint(42F, -12F, 17F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 217
		bodyModel[131].setRotationPoint(42F, -11F, 28F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 5, 12, 0F,0F, 0.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, -0.5F, 0F); // Box 218
		bodyModel[132].setRotationPoint(48F, -10.5F, 17F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 111, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[133].setRotationPoint(-69F, -12.25F, -29F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 111, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[134].setRotationPoint(-69F, -12.25F, 27F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[135].setRotationPoint(29F, -11.25F, -29F);

		bodyModel[136].addShapeBox(-12F, 0F, 0F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F); // Box 222
		bodyModel[136].setRotationPoint(29F, -11.25F, -29F);

		bodyModel[137].addShapeBox(-12F, 0F, 0F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F); // Box 223
		bodyModel[137].setRotationPoint(4F, -11.25F, -29F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[138].setRotationPoint(4F, -11.25F, -29F);

		bodyModel[139].addShapeBox(-12F, 0F, 0F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F); // Box 225
		bodyModel[139].setRotationPoint(-21F, -11.25F, -29F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[140].setRotationPoint(-21F, -11.25F, -29F);

		bodyModel[141].addShapeBox(-12F, 0F, 0F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F); // Box 227
		bodyModel[141].setRotationPoint(-46F, -11.25F, -29F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[142].setRotationPoint(-46F, -11.25F, -29F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[143].setRotationPoint(-69F, -11.25F, -29F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[144].setRotationPoint(29F, -11.25F, 28F);

		bodyModel[145].addShapeBox(-12F, 0F, 0F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F); // Box 232
		bodyModel[145].setRotationPoint(29F, -11.25F, 28F);

		bodyModel[146].addShapeBox(-12F, 0F, 0F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F); // Box 233
		bodyModel[146].setRotationPoint(4F, -11.25F, 28F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[147].setRotationPoint(4F, -11.25F, 28F);

		bodyModel[148].addShapeBox(-12F, 0F, 0F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F); // Box 235
		bodyModel[148].setRotationPoint(-21F, -11.25F, 28F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[149].setRotationPoint(-21F, -11.25F, 28F);

		bodyModel[150].addShapeBox(-12F, 0F, 0F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F); // Box 237
		bodyModel[150].setRotationPoint(-46F, -11.25F, 28F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[151].setRotationPoint(-46F, -11.25F, 28F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[152].setRotationPoint(-69F, -11.25F, 28F);

		bodyModel[153].addShapeBox(0F, 0F, 11F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[153].setRotationPoint(-70F, -12.25F, 17F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 241
		bodyModel[154].setRotationPoint(15.5F, -6.5F, -29.25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 242
		bodyModel[155].setRotationPoint(15.5F, -10.5F, -29.25F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 243
		bodyModel[156].setRotationPoint(40.5F, -10.5F, -29.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 244
		bodyModel[157].setRotationPoint(40.5F, -6.5F, -29.25F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 245
		bodyModel[158].setRotationPoint(-9.5F, -10.5F, -29.25F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 246
		bodyModel[159].setRotationPoint(-9.5F, -6.5F, -29.25F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 247
		bodyModel[160].setRotationPoint(-34.5F, -6.5F, -29.25F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 248
		bodyModel[161].setRotationPoint(-34.5F, -10.5F, -29.25F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 249
		bodyModel[162].setRotationPoint(-59.5F, -10.5F, -29.25F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 250
		bodyModel[163].setRotationPoint(-59.5F, -6.5F, -29.25F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 253
		bodyModel[164].setRotationPoint(15.5F, -6.5F, 28.25F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 254
		bodyModel[165].setRotationPoint(15.5F, -10.5F, 28.25F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 255
		bodyModel[166].setRotationPoint(40.5F, -10.5F, 28.25F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 256
		bodyModel[167].setRotationPoint(40.5F, -6.5F, 28.25F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 257
		bodyModel[168].setRotationPoint(-9.5F, -10.5F, 28.25F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 258
		bodyModel[169].setRotationPoint(-9.5F, -6.5F, 28.25F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 259
		bodyModel[170].setRotationPoint(-34.5F, -6.5F, 28.25F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 260
		bodyModel[171].setRotationPoint(-34.5F, -10.5F, 28.25F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 261
		bodyModel[172].setRotationPoint(-59.5F, -10.5F, 28.25F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 262
		bodyModel[173].setRotationPoint(-59.5F, -6.5F, 28.25F);

		bodyModel[174].addBox(2.75F, -0.4F, -1F, 1, 1, 2, 0F); // Box 312
		bodyModel[174].setRotationPoint(28F, -15F, -11F);

		bodyModel[175].addShapeBox(2.75F, -1F, -1F, 1, 1, 2, 0F,0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F); // Box 313
		bodyModel[175].setRotationPoint(28F, -15F, -11F);

		bodyModel[176].addShapeBox(2.75F, -0.4F, -1.6F, 1, 1, 1, 0F,0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F); // Box 314
		bodyModel[176].setRotationPoint(28F, -15F, -11F);

		bodyModel[177].addShapeBox(2.75F, -0.4F, 0.6F, 1, 1, 1, 0F,0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F); // Box 315
		bodyModel[177].setRotationPoint(28F, -15F, -11F);

		bodyModel[178].addShapeBox(3.1F, -0.4F, -1.4F, 1, 1, 1, 0F,0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F); // Box 316
		bodyModel[178].setRotationPoint(28F, -15F, -11F);
		bodyModel[178].rotateAngleY = -0.34906585F;

		bodyModel[179].addShapeBox(3.1F, -1F, -3F, 1, 1, 2, 0F,0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F); // Box 317
		bodyModel[179].setRotationPoint(28F, -15F, -11F);
		bodyModel[179].rotateAngleY = -0.34906585F;

		bodyModel[180].addBox(3.1F, -0.4F, -3F, 1, 1, 2, 0F); // Box 318
		bodyModel[180].setRotationPoint(28F, -15F, -11F);
		bodyModel[180].rotateAngleY = -0.34906585F;

		bodyModel[181].addShapeBox(3.1F, -0.4F, -3.6F, 1, 1, 1, 0F,0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F); // Box 319
		bodyModel[181].setRotationPoint(28F, -15F, -11F);
		bodyModel[181].rotateAngleY = -0.34906585F;

		bodyModel[182].addShapeBox(3.1F, -0.4F, 2.4F, 1, 1, 1, 0F,0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F); // Box 320
		bodyModel[182].setRotationPoint(28F, -15F, -11F);
		bodyModel[182].rotateAngleY = 0.34906585F;

		bodyModel[183].addShapeBox(3.1F, -1F, 0.8F, 1, 1, 2, 0F,0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F); // Box 321
		bodyModel[183].setRotationPoint(28F, -15F, -11F);
		bodyModel[183].rotateAngleY = 0.34906585F;

		bodyModel[184].addBox(3.1F, -0.4F, 0.8F, 1, 1, 2, 0F); // Box 322
		bodyModel[184].setRotationPoint(28F, -15F, -11F);
		bodyModel[184].rotateAngleY = 0.34906585F;

		bodyModel[185].addShapeBox(3.1F, -0.4F, 0.2F, 1, 1, 1, 0F,0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F); // Box 323
		bodyModel[185].setRotationPoint(28F, -15F, -11F);
		bodyModel[185].rotateAngleY = 0.34906585F;

		bodyModel[186].addBox(-2F, -1F, -1F, 2, 1, 2, 0F); // Box 324
		bodyModel[186].setRotationPoint(30F, -13.9F, -17F);
		bodyModel[186].rotateAngleZ = -0.13962634F;

		bodyModel[187].addShapeBox(-6F, -1F, -1F, 4, 1, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[187].setRotationPoint(30F, -13.9F, -17F);
		bodyModel[187].rotateAngleZ = -0.13962634F;

		bodyModel[188].addShapeBox(-7F, -1F, 0F, 1, 1, 10, 0F,-0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 326
		bodyModel[188].setRotationPoint(30F, -13.9F, -17F);
		bodyModel[188].rotateAngleZ = -0.13962634F;

		bodyModel[189].addShapeBox(-6F, -1F, 8F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, 0F, 0F, -1F); // Box 327
		bodyModel[189].setRotationPoint(30F, -13.9F, -17F);
		bodyModel[189].rotateAngleZ = -0.13962634F;

		bodyModel[190].addShapeBox(-2F, -1F, 2F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[190].setRotationPoint(30F, -13.9F, -17F);
		bodyModel[190].rotateAngleZ = -0.13962634F;

		bodyModel[191].addShapeBox(0F, -1F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 329
		bodyModel[191].setRotationPoint(30F, -13.9F, -17F);
		bodyModel[191].rotateAngleZ = -0.13962634F;

		bodyModel[192].addShapeBox(0F, -1F, 0F, 4, 2, 2, 0F,-1.25F, -0.5F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 330
		bodyModel[192].setRotationPoint(49F, -10.5F, -14F);

		bodyModel[193].addShapeBox(4.5F, -1F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Box 332
		bodyModel[193].setRotationPoint(49F, -10.5F, -14F);

		bodyModel[194].addShapeBox(0F, -1F, 0F, 4, 2, 2, 0F,-1.25F, -0.5F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -1.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 335
		bodyModel[194].setRotationPoint(49F, -10.5F, 12F);

		bodyModel[195].addShapeBox(4.5F, -1F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Box 336
		bodyModel[195].setRotationPoint(49F, -10.5F, 12F);

		bodyModel[196].addShapeBox(0.5F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.9F, 0F, 0.4F, -0.9F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[196].setRotationPoint(49F, -10.5F, -14F);
		bodyModel[196].rotateAngleZ = -0.27925268F;

		bodyModel[197].addShapeBox(0.5F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.9F, 0F, 0.4F, -0.9F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[197].setRotationPoint(49F, -10.5F, 12F);
		bodyModel[197].rotateAngleZ = -0.27925268F;

		bodyModel[198].addShapeBox(2.2F, 0.5F, 0.1F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[198].setRotationPoint(54.4F, -8.3F, 15F);
		bodyModel[198].rotateAngleY = 3.14159265F;
		bodyModel[198].rotateAngleZ = 1.83259571F;

		bodyModel[199].addShapeBox(1.2F, 0.5F, 0.1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[199].setRotationPoint(54.4F, -8.3F, 15F);
		bodyModel[199].rotateAngleY = 3.14159265F;
		bodyModel[199].rotateAngleZ = 1.83259571F;

		bodyModel[200].addShapeBox(1.2F, 4.5F, 3.33066907387547E-16F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F); // Box 347
		bodyModel[200].setRotationPoint(54.4F, -8.3F, 15F);
		bodyModel[200].rotateAngleY = 3.14159265F;
		bodyModel[200].rotateAngleZ = 1.83259571F;

		bodyModel[201].addShapeBox(1.2F, 0.5F, 2.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[201].setRotationPoint(54.4F, -8.3F, 15F);
		bodyModel[201].rotateAngleY = 3.14159265F;
		bodyModel[201].rotateAngleZ = 1.83259571F;

		bodyModel[202].addShapeBox(2.2F, 0.5F, 2.9F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[202].setRotationPoint(54.4F, -8.3F, 15F);
		bodyModel[202].rotateAngleY = 3.14159265F;
		bodyModel[202].rotateAngleZ = 1.83259571F;

		bodyModel[203].addShapeBox(1.7F, -0.2F, 3.33066907387547E-16F, 1, 1, 4, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 350
		bodyModel[203].setRotationPoint(54.4F, -8.3F, 15F);
		bodyModel[203].rotateAngleY = 3.14159265F;
		bodyModel[203].rotateAngleZ = 1.3962634F;

		bodyModel[204].addShapeBox(2.2F, 0.5F, -3.9F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[204].setRotationPoint(54.4F, -8.3F, -15F);
		bodyModel[204].rotateAngleY = 3.14159265F;
		bodyModel[204].rotateAngleZ = 1.83259571F;

		bodyModel[205].addShapeBox(1.2F, 0.5F, -3.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[205].setRotationPoint(54.4F, -8.3F, -15F);
		bodyModel[205].rotateAngleY = 3.14159265F;
		bodyModel[205].rotateAngleZ = 1.83259571F;

		bodyModel[206].addShapeBox(1.7F, -0.2F, -4F, 1, 1, 4, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 353
		bodyModel[206].setRotationPoint(54.4F, -8.3F, -15F);
		bodyModel[206].rotateAngleY = 3.14159265F;
		bodyModel[206].rotateAngleZ = 1.3962634F;

		bodyModel[207].addShapeBox(1.2F, 0.5F, -1.1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[207].setRotationPoint(54.4F, -8.3F, -15F);
		bodyModel[207].rotateAngleY = 3.14159265F;
		bodyModel[207].rotateAngleZ = 1.83259571F;

		bodyModel[208].addShapeBox(2.2F, 0.5F, -1.1F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[208].setRotationPoint(54.4F, -8.3F, -15F);
		bodyModel[208].rotateAngleY = 3.14159265F;
		bodyModel[208].rotateAngleZ = 1.83259571F;

		bodyModel[209].addShapeBox(1.2F, 4.5F, -4F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F); // Box 356
		bodyModel[209].setRotationPoint(54.4F, -8.3F, -15F);
		bodyModel[209].rotateAngleY = 3.14159265F;
		bodyModel[209].rotateAngleZ = 1.83259571F;

		bodyModel[210].addShapeBox(-2F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[210].setRotationPoint(52.5F, -12.5F, -20F);

		bodyModel[211].addBox(-2F, 0F, 0F, 2, 1, 3, 0F); // Box 358
		bodyModel[211].setRotationPoint(52.5F, -11.5F, -20F);

		bodyModel[212].addShapeBox(-2F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 359
		bodyModel[212].setRotationPoint(52.5F, -10.5F, -20F);

		bodyModel[213].addBox(-2F, 0.5F, 0F, 1, 2, 2, 0F); // Box 360
		bodyModel[213].setRotationPoint(52F, -12F, -19.5F);

		bodyModel[214].addShapeBox(-2F, -0.5F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[214].setRotationPoint(52F, -12F, -19.5F);

		bodyModel[215].addShapeBox(-4.5F, 2.25F, -1F, 4, 1, 4, 0F,-1.5F, 0.6F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.95F, 0F, -1.5F, -1.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.45F, 0F); // Box 362
		bodyModel[215].setRotationPoint(52F, -12F, -19.5F);

		bodyModel[216].addBox(-2F, 2.5F, -0.25F, 1, 1, 3, 0F); // Box 363
		bodyModel[216].setRotationPoint(52F, -12F, -19.5F);

		bodyModel[217].addShapeBox(-2F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[217].setRotationPoint(52.5F, -12.5F, 17F);

		bodyModel[218].addBox(-2F, 0F, 0F, 2, 1, 3, 0F); // Box 365
		bodyModel[218].setRotationPoint(52.5F, -11.5F, 17F);

		bodyModel[219].addShapeBox(-2F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 366
		bodyModel[219].setRotationPoint(52.5F, -10.5F, 17F);

		bodyModel[220].addBox(-2F, 0.5F, 0F, 1, 2, 2, 0F); // Box 367
		bodyModel[220].setRotationPoint(52F, -12F, 17.5F);

		bodyModel[221].addShapeBox(-2F, -0.5F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[221].setRotationPoint(52F, -12F, 17.5F);

		bodyModel[222].addShapeBox(-4.5F, 2.25F, 1F, 4, 1, 4, 0F,0F, 0.95F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -1.5F, 0.6F, -0.5F, 0F, -1.45F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -1.5F, -1.1F, -0.5F); // Box 369
		bodyModel[222].setRotationPoint(52F, -12F, 15.5F);

		bodyModel[223].addBox(-2F, 2.5F, 0.25F, 1, 1, 3, 0F); // Box 370
		bodyModel[223].setRotationPoint(52F, -12F, 16.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[224].setRotationPoint(-70F, -12.25F, 17F);

		bodyModel[225].addShapeBox(0F, 0F, -11F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[225].setRotationPoint(-70F, -12.25F, -17F);

		bodyModel[226].addShapeBox(0F, 0F, -12F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[226].setRotationPoint(-70F, -12.25F, -17F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 28, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3.8F, 0F, -0.25F, -3.8F); // Box 362
		bodyModel[227].setRotationPoint(-8F, -15.25F, -28F);

		bodyModel[228].addShapeBox(0F, -0.5F, 0F, 28, 1, 5, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, -1.15F, 0.1F, -0.1F, -1.15F); // Box 363
		bodyModel[228].setRotationPoint(-8F, -15.25F, -28F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 364
		bodyModel[229].setRotationPoint(-5.5F, -15.5F, -28.25F);

		bodyModel[230].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 365
		bodyModel[230].setRotationPoint(-5.5F, -15.5F, -28.25F);

		bodyModel[231].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 366
		bodyModel[231].setRotationPoint(2.5F, -15.5F, -28.25F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 367
		bodyModel[232].setRotationPoint(2.5F, -15.5F, -28.25F);

		bodyModel[233].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 368
		bodyModel[233].setRotationPoint(9.5F, -15.5F, -28.25F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 369
		bodyModel[234].setRotationPoint(9.5F, -15.5F, -28.25F);

		bodyModel[235].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 370
		bodyModel[235].setRotationPoint(16.5F, -15.5F, -28.25F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 371
		bodyModel[236].setRotationPoint(16.5F, -15.5F, -28.25F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 18, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, -4F, 0F, -0.85F, -4F); // Box 372
		bodyModel[237].setRotationPoint(-28.75F, -14.5F, -28F);

		bodyModel[238].addShapeBox(0F, -0.5F, 0F, 18, 1, 5, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, -1.05F, 0.1F, -0.1F, -1.05F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, -2F, 0.1F, -0.1F, -2F); // Box 373
		bodyModel[238].setRotationPoint(-28.75F, -14.5F, -28F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 374
		bodyModel[239].setRotationPoint(-25F, -14.5F, -28.25F);

		bodyModel[240].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 375
		bodyModel[240].setRotationPoint(-25F, -14.5F, -28.25F);

		bodyModel[241].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 376
		bodyModel[241].setRotationPoint(-15.5F, -14.5F, -28.25F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 377
		bodyModel[242].setRotationPoint(-15.5F, -14.5F, -28.25F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 28, 3, 5, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3.8F, 0F, -0.25F, -3.8F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 378
		bodyModel[243].setRotationPoint(-8F, -15.25F, 23F);

		bodyModel[244].addShapeBox(0F, -0.5F, 0F, 28, 1, 5, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, -1.15F, 0.1F, -0.1F, -1.15F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F); // Box 379
		bodyModel[244].setRotationPoint(-8F, -15.25F, 23F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 380
		bodyModel[245].setRotationPoint(-5.5F, -15.5F, 27.25F);

		bodyModel[246].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 381
		bodyModel[246].setRotationPoint(-5.5F, -15.5F, 27.25F);

		bodyModel[247].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 382
		bodyModel[247].setRotationPoint(2.5F, -15.5F, 27.25F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 383
		bodyModel[248].setRotationPoint(2.5F, -15.5F, 27.25F);

		bodyModel[249].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 384
		bodyModel[249].setRotationPoint(9.5F, -15.5F, 27.25F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 385
		bodyModel[250].setRotationPoint(9.5F, -15.5F, 27.25F);

		bodyModel[251].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 386
		bodyModel[251].setRotationPoint(16.5F, -15.5F, 27.25F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 387
		bodyModel[252].setRotationPoint(16.5F, -15.5F, 27.25F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 25, 3, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -4F, 0F, -0.85F, -4F, 0F, -0.85F, 0F, 0F, -0.85F, 0F); // Box 388
		bodyModel[253].setRotationPoint(-34.25F, -14.5F, 23F);

		bodyModel[254].addShapeBox(0F, -0.5F, 0F, 25, 1, 5, 0F,0.1F, -0.1F, -1F, 0.1F, -0.1F, -1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, -1.95F, 0.1F, -0.1F, -1.95F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F); // Box 389
		bodyModel[254].setRotationPoint(-34.25F, -14.5F, 23F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 390
		bodyModel[255].setRotationPoint(-28.5F, -14.5F, 27.25F);

		bodyModel[256].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 391
		bodyModel[256].setRotationPoint(-28.5F, -14.5F, 27.25F);

		bodyModel[257].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 392
		bodyModel[257].setRotationPoint(-16F, -14.5F, 27.25F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 393
		bodyModel[258].setRotationPoint(-16F, -14.5F, 27.25F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0.1F, 0F, 0F, -0.6F, -3.7F, 0F, -0.6F, -1.2F, 0F, 0.1F, -0.6F, 0F, -0.25F, 0F, -2F, -0.25F, -1.2F, -2F, -0.25F, -3.7F, 0F, -0.25F, -3.8F); // Box 394
		bodyModel[259].setRotationPoint(20F, -15.25F, -28F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0.1F, -0.6F, 0F, -0.6F, -1.2F, 0F, -0.6F, -3.7F, 0F, 0.1F, 0F, 0F, -0.25F, -3.8F, -2F, -0.25F, -3.7F, -2F, -0.25F, -1.2F, 0F, -0.25F, 0F); // Box 395
		bodyModel[260].setRotationPoint(20F, -15.25F, 23F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 18, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.1F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -5.9F, 0F, -0.65F, -5.9F); // Box 396
		bodyModel[261].setRotationPoint(-69.5F, -16.75F, -28F);

		bodyModel[262].addShapeBox(0F, -0.5F, 0F, 18, 1, 7, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, -0.9F, 0.1F, -0.1F, -0.9F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, -1.75F, 0.1F, -0.1F, -1.75F); // Box 397
		bodyModel[262].setRotationPoint(-69.5F, -16.75F, -28F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 398
		bodyModel[263].setRotationPoint(-66F, -16.75F, -28.25F);

		bodyModel[264].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 399
		bodyModel[264].setRotationPoint(-66F, -16.75F, -28.25F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 400
		bodyModel[265].setRotationPoint(-56F, -16.75F, -28.25F);

		bodyModel[266].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F); // Box 401
		bodyModel[266].setRotationPoint(-56F, -16.75F, -28.25F);

		bodyModel[267].addShapeBox(-1F, 0F, 0F, 1, 5, 7, 0F,0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -6.1F, 0F, -0.6F, -6.1F); // Box 402
		bodyModel[267].setRotationPoint(-69.5F, -16.75F, -28F);

		bodyModel[268].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 410
		bodyModel[268].setRotationPoint(40.5F, -12.6F, -25.5F);

		bodyModel[269].addShapeBox(2F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[269].setRotationPoint(40.5F, -12.6F, -25.5F);

		bodyModel[270].addShapeBox(0F, -1F, 0.5F, 2, 1, 1, 0F,-0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 412
		bodyModel[270].setRotationPoint(40.5F, -12.6F, -25.5F);

		bodyModel[271].addShapeBox(0F, -1F, 1.5F, 2, 1, 1, 0F,-0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 413
		bodyModel[271].setRotationPoint(40.5F, -12.6F, -25.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 414
		bodyModel[272].setRotationPoint(41F, -13.6F, -26F);

		bodyModel[273].addShapeBox(0F, -3.9F, -0.1F, 1, 4, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 415
		bodyModel[273].setRotationPoint(41F, -13.6F, -26F);

		bodyModel[274].addShapeBox(-0.5F, -4.75F, -1.1F, 1, 3, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 416
		bodyModel[274].setRotationPoint(41F, -13.6F, -26F);

		bodyModel[275].addShapeBox(-0.5F, -4.75F, -2.1F, 1, 3, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 417
		bodyModel[275].setRotationPoint(41F, -13.6F, -26F);

		bodyModel[276].addShapeBox(-0.5F, -4.75F, 1.9F, 1, 3, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 418
		bodyModel[276].setRotationPoint(41F, -13.6F, -26F);

		bodyModel[277].addShapeBox(0F, -4.25F, -0.6F, 1, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 419
		bodyModel[277].setRotationPoint(41F, -13.6F, -26F);

		bodyModel[278].addShapeBox(0F, -4.25F, -1.4F, 1, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 420
		bodyModel[278].setRotationPoint(41F, -13.6F, 26F);

		bodyModel[279].addShapeBox(-0.5F, -4.75F, 1.1F, 1, 3, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 421
		bodyModel[279].setRotationPoint(41F, -13.6F, 26F);

		bodyModel[280].addShapeBox(-0.5F, -4.75F, -1.9F, 1, 3, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 422
		bodyModel[280].setRotationPoint(41F, -13.6F, 26F);

		bodyModel[281].addShapeBox(-0.5F, -4.75F, -2.9F, 1, 3, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 423
		bodyModel[281].setRotationPoint(41F, -13.6F, 26F);

		bodyModel[282].addShapeBox(0F, -3.9F, -0.9F, 1, 4, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 424
		bodyModel[282].setRotationPoint(41F, -13.6F, 26F);

		bodyModel[283].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.9F, -0.1F, -0.1F, -0.9F); // Box 425
		bodyModel[283].setRotationPoint(41F, -13.6F, 26F);

		bodyModel[284].addShapeBox(0F, -1F, -2.5F, 2, 1, 1, 0F,-0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 426
		bodyModel[284].setRotationPoint(40.5F, -12.6F, 25.5F);

		bodyModel[285].addShapeBox(0F, -1F, -1.5F, 2, 1, 1, 0F,-0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, -0.25F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 427
		bodyModel[285].setRotationPoint(40.5F, -12.6F, 25.5F);

		bodyModel[286].addBox(0F, 0F, -3F, 2, 1, 3, 0F); // Box 428
		bodyModel[286].setRotationPoint(40.5F, -12.6F, 25.5F);

		bodyModel[287].addShapeBox(2F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[287].setRotationPoint(40.5F, -12.6F, 25.5F);

		bodyModel[288].addShapeBox(2F, 0.5F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[288].setRotationPoint(-45F, -17.5F, -23.9F);
		bodyModel[288].rotateAngleY = -1.57079633F;
		bodyModel[288].rotateAngleZ = -0.70685835F;

		bodyModel[289].addShapeBox(2F, 0.5F, 5F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[289].setRotationPoint(-45F, -17.5F, -23.9F);
		bodyModel[289].rotateAngleY = -1.57079633F;
		bodyModel[289].rotateAngleZ = -0.70685835F;

		bodyModel[290].addShapeBox(1.5F, 1F, -0.5F, 3, 1, 10, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 431
		bodyModel[290].setRotationPoint(-45F, -17.5F, -23.9F);
		bodyModel[290].rotateAngleY = -1.57079633F;
		bodyModel[290].rotateAngleZ = -0.70685835F;

		bodyModel[291].addShapeBox(4.5F, 1F, -0.5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[291].setRotationPoint(-45F, -17.5F, -23.9F);
		bodyModel[291].rotateAngleY = -1.57079633F;
		bodyModel[291].rotateAngleZ = -0.70685835F;

		bodyModel[292].addShapeBox(1.5F, 0.9F, -0.5F, 1, 1, 10, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 433
		bodyModel[292].setRotationPoint(-45F, -17.5F, -23.9F);
		bodyModel[292].rotateAngleY = -1.57079633F;
		bodyModel[292].rotateAngleZ = -0.70685835F;

		bodyModel[293].addShapeBox(1.5F, 0.25F, 4F, 2, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, -0.1F, 0.5F, 0F, -0.1F); // Box 434
		bodyModel[293].setRotationPoint(-45F, -17.5F, -23.9F);
		bodyModel[293].rotateAngleY = -1.57079633F;
		bodyModel[293].rotateAngleZ = -0.70685835F;

		bodyModel[294].addShapeBox(-5.5F, 1F, -0.5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[294].setRotationPoint(-45F, -17.5F, 23.9F);
		bodyModel[294].rotateAngleY = -1.57079633F;
		bodyModel[294].rotateAngleZ = 0.70685835F;

		bodyModel[295].addShapeBox(-5F, 0.5F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[295].setRotationPoint(-45F, -17.5F, 23.9F);
		bodyModel[295].rotateAngleY = -1.57079633F;
		bodyModel[295].rotateAngleZ = 0.70685835F;

		bodyModel[296].addShapeBox(-4.5F, 1F, -0.5F, 3, 1, 10, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 437
		bodyModel[296].setRotationPoint(-45F, -17.5F, 23.9F);
		bodyModel[296].rotateAngleY = -1.57079633F;
		bodyModel[296].rotateAngleZ = 0.70685835F;

		bodyModel[297].addShapeBox(-2.5F, 0.9F, -0.5F, 1, 1, 10, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 438
		bodyModel[297].setRotationPoint(-45F, -17.5F, 23.9F);
		bodyModel[297].rotateAngleY = -1.57079633F;
		bodyModel[297].rotateAngleZ = 0.70685835F;

		bodyModel[298].addShapeBox(-5F, 0.5F, 5F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[298].setRotationPoint(-45F, -17.5F, 23.9F);
		bodyModel[298].rotateAngleY = -1.57079633F;
		bodyModel[298].rotateAngleZ = 0.70685835F;

		bodyModel[299].addShapeBox(-3.5F, 0.25F, 4F, 2, 2, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 1F, 0F, -0.1F); // Box 440
		bodyModel[299].setRotationPoint(-45F, -17.5F, 23.9F);
		bodyModel[299].rotateAngleY = -1.57079633F;
		bodyModel[299].rotateAngleZ = 0.70685835F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1.25F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 4F, -1.25F, -0.5F, 4F); // Box 441
		bodyModel[300].setRotationPoint(-70.5F, -17F, 22.2F);

		bodyModel[301].addShapeBox(12.75F, 0F, 0F, 8, 5, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -0.75F, 4F, 0F, -0.75F, 4F); // Box 442
		bodyModel[301].setRotationPoint(-70.5F, -17F, 22.2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 443
		bodyModel[302].setRotationPoint(-70F, -11.5F, 17.5F);
		bodyModel[302].rotateAngleZ = -0.08726646F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 444
		bodyModel[303].setRotationPoint(-70F, -11.5F, -27.5F);
		bodyModel[303].rotateAngleZ = -0.08726646F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 19, 2, 20, 0F,0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[304].setRotationPoint(-49F, -17.5F, -10F);

		bodyModel[305].addShapeBox(17F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, -1F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -1F, -2F, 0F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F); // Box 446
		bodyModel[305].setRotationPoint(-49F, -17.5F, -10F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 6, 54, 0F,-0.5F, -1F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, -0.5F, -1F, -5F, -3F, 0.5F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -3F, 0.5F, 1F); // Box 449
		bodyModel[306].setRotationPoint(-73.5F, -17.5F, -27F);

		bodyModel[307].addShapeBox(-0.5F, -1F, 0F, 4, 6, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 450
		bodyModel[307].setRotationPoint(-70F, -9F, -16F);

		bodyModel[308].addShapeBox(-0.5F, -1F, 0F, 4, 6, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 451
		bodyModel[308].setRotationPoint(-70F, -9F, 8F);

		bodyModel[309].addShapeBox(-0.5F, -1F, -14F, 2, 3, 14, 0F,0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 452
		bodyModel[309].setRotationPoint(-69F, -9F, 7F);

		bodyModel[310].addShapeBox(0F, 0F, -6F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 476
		bodyModel[310].setRotationPoint(-59.5F, -18F, -9F);

		bodyModel[311].addShapeBox(-3F, 0F, -6F, 3, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 477
		bodyModel[311].setRotationPoint(-59.5F, -18F, -9F);

		bodyModel[312].addShapeBox(-6F, 0F, -6F, 3, 1, 12, 0F,0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F); // Box 478
		bodyModel[312].setRotationPoint(-59.5F, -18F, -9F);

		bodyModel[313].addShapeBox(3F, 0F, -6F, 3, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -1F); // Box 479
		bodyModel[313].setRotationPoint(-59.5F, -18F, -9F);

		bodyModel[314].addShapeBox(3F, 0F, -6F, 3, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -1F); // Box 480
		bodyModel[314].setRotationPoint(-59.5F, -18F, 9F);

		bodyModel[315].addShapeBox(0F, 0F, -6F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 481
		bodyModel[315].setRotationPoint(-59.5F, -18F, 9F);

		bodyModel[316].addShapeBox(-3F, 0F, -6F, 3, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 482
		bodyModel[316].setRotationPoint(-59.5F, -18F, 9F);

		bodyModel[317].addShapeBox(-6F, 0F, -6F, 3, 1, 12, 0F,0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F); // Box 483
		bodyModel[317].setRotationPoint(-59.5F, -18F, 9F);

		bodyModel[318].addBox(0F, 0F, 0F, 15, 1, 32, 0F); // Box 484
		bodyModel[318].setRotationPoint(-67F, -17.65F, -16F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Box 263
		turretModel[1] = new ModelRendererTurbo(this, 275, 166, textureX, textureY); // Box 264
		turretModel[2] = new ModelRendererTurbo(this, 126, 165, textureX, textureY); // Box 265
		turretModel[3] = new ModelRendererTurbo(this, 398, 231, textureX, textureY); // Box 266
		turretModel[4] = new ModelRendererTurbo(this, 408, 184, textureX, textureY); // Box 267
		turretModel[5] = new ModelRendererTurbo(this, 363, 137, textureX, textureY); // Box 268
		turretModel[6] = new ModelRendererTurbo(this, 311, 119, textureX, textureY); // Box 269
		turretModel[7] = new ModelRendererTurbo(this, 206, 183, textureX, textureY); // Box 270
		turretModel[8] = new ModelRendererTurbo(this, 200, 135, textureX, textureY); // Box 271
		turretModel[9] = new ModelRendererTurbo(this, 283, 220, textureX, textureY); // Box 272
		turretModel[10] = new ModelRendererTurbo(this, 353, 254, textureX, textureY); // Box 306
		turretModel[11] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Box 309
		turretModel[12] = new ModelRendererTurbo(this, 21, 160, textureX, textureY); // Box 310
		turretModel[13] = new ModelRendererTurbo(this, 71, 154, textureX, textureY); // Box 455
		turretModel[14] = new ModelRendererTurbo(this, 84, 154, textureX, textureY); // Box 456
		turretModel[15] = new ModelRendererTurbo(this, 60, 154, textureX, textureY); // Box 457
		turretModel[16] = new ModelRendererTurbo(this, 19, 153, textureX, textureY); // Box 458
		turretModel[17] = new ModelRendererTurbo(this, 37, 153, textureX, textureY); // Box 459
		turretModel[18] = new ModelRendererTurbo(this, 55, 153, textureX, textureY); // Box 460
		turretModel[19] = new ModelRendererTurbo(this, 28, 153, textureX, textureY); // Box 461
		turretModel[20] = new ModelRendererTurbo(this, 28, 156, textureX, textureY); // Box 462
		turretModel[21] = new ModelRendererTurbo(this, 46, 153, textureX, textureY); // Box 463
		turretModel[22] = new ModelRendererTurbo(this, 7, 200, textureX, textureY); // Box 464
		turretModel[23] = new ModelRendererTurbo(this, 0, 194, textureX, textureY); // Box 465
		turretModel[24] = new ModelRendererTurbo(this, 0, 198, textureX, textureY); // Box 466
		turretModel[25] = new ModelRendererTurbo(this, 7, 200, textureX, textureY); // Box 468
		turretModel[26] = new ModelRendererTurbo(this, 21, 170, textureX, textureY); // Box 485
		turretModel[27] = new ModelRendererTurbo(this, 116, 174, textureX, textureY); // Box 486
		turretModel[28] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 467
		turretModel[29] = new ModelRendererTurbo(this, 88, 178, textureX, textureY); // Box 468
		turretModel[30] = new ModelRendererTurbo(this, 19, 136, textureX, textureY); // Box 468
		turretModel[31] = new ModelRendererTurbo(this, 44, 138, textureX, textureY); // Box 469
		turretModel[32] = new ModelRendererTurbo(this, 0, 138, textureX, textureY); // Box 470
		turretModel[33] = new ModelRendererTurbo(this, 105, 164, textureX, textureY); // Box 471
		turretModel[34] = new ModelRendererTurbo(this, 88, 166, textureX, textureY); // Box 473
		turretModel[35] = new ModelRendererTurbo(this, 124, 162, textureX, textureY); // Box 474
		turretModel[36] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 475
		turretModel[37] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 477
		turretModel[38] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 478
		turretModel[39] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 479
		turretModel[40] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 481
		turretModel[41] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 482
		turretModel[42] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 483
		turretModel[43] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 485
		turretModel[44] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 486
		turretModel[45] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 487
		turretModel[46] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 489
		turretModel[47] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 490
		turretModel[48] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 491
		turretModel[49] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 493
		turretModel[50] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 494
		turretModel[51] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 496
		turretModel[52] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 497
		turretModel[53] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 498
		turretModel[54] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 499
		turretModel[55] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 500
		turretModel[56] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 501
		turretModel[57] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 502
		turretModel[58] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 504
		turretModel[59] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 505
		turretModel[60] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 506
		turretModel[61] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 509
		turretModel[62] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 510
		turretModel[63] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 511
		turretModel[64] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 512
		turretModel[65] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 513
		turretModel[66] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 514
		turretModel[67] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 515
		turretModel[68] = new ModelRendererTurbo(this, 4, 152, textureX, textureY); // Box 518
		turretModel[69] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Box 522
		turretModel[70] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Box 523
		turretModel[71] = new ModelRendererTurbo(this, 4, 152, textureX, textureY); // Box 524
		turretModel[72] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Box 525
		turretModel[73] = new ModelRendererTurbo(this, 4, 152, textureX, textureY); // Box 526
		turretModel[74] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Box 527
		turretModel[75] = new ModelRendererTurbo(this, 4, 152, textureX, textureY); // Box 528
		turretModel[76] = new ModelRendererTurbo(this, 194, 198, textureX, textureY); // Box 529
		turretModel[77] = new ModelRendererTurbo(this, 211, 196, textureX, textureY); // Box 530
		turretModel[78] = new ModelRendererTurbo(this, 202, 184, textureX, textureY); // Box 532
		turretModel[79] = new ModelRendererTurbo(this, 12, 199, textureX, textureY); // Box 533
		turretModel[80] = new ModelRendererTurbo(this, 124, 162, textureX, textureY); // Box 534
		turretModel[81] = new ModelRendererTurbo(this, 88, 166, textureX, textureY); // Box 535
		turretModel[82] = new ModelRendererTurbo(this, 105, 164, textureX, textureY); // Box 536
		turretModel[83] = new ModelRendererTurbo(this, 202, 184, textureX, textureY); // Box 537
		turretModel[84] = new ModelRendererTurbo(this, 211, 196, textureX, textureY); // Box 538
		turretModel[85] = new ModelRendererTurbo(this, 194, 198, textureX, textureY); // Box 539
		turretModel[86] = new ModelRendererTurbo(this, 12, 199, textureX, textureY); // Box 540
		turretModel[87] = new ModelRendererTurbo(this, 4, 152, textureX, textureY); // Box 541
		turretModel[88] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Box 542
		turretModel[89] = new ModelRendererTurbo(this, 4, 152, textureX, textureY); // Box 543
		turretModel[90] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Box 544
		turretModel[91] = new ModelRendererTurbo(this, 4, 152, textureX, textureY); // Box 545
		turretModel[92] = new ModelRendererTurbo(this, 4, 152, textureX, textureY); // Box 546
		turretModel[93] = new ModelRendererTurbo(this, 19, 136, textureX, textureY); // Box 547
		turretModel[94] = new ModelRendererTurbo(this, 44, 138, textureX, textureY); // Box 548
		turretModel[95] = new ModelRendererTurbo(this, 0, 138, textureX, textureY); // Box 549
		turretModel[96] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 550
		turretModel[97] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 551
		turretModel[98] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 552
		turretModel[99] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 553
		turretModel[100] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 554
		turretModel[101] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Box 555
		turretModel[102] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 556
		turretModel[103] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 557
		turretModel[104] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 558
		turretModel[105] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 559
		turretModel[106] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 560
		turretModel[107] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 561
		turretModel[108] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 562
		turretModel[109] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Box 563
		turretModel[110] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 564
		turretModel[111] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 565
		turretModel[112] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 566
		turretModel[113] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 567
		turretModel[114] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 568
		turretModel[115] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 569
		turretModel[116] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 570
		turretModel[117] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 571
		turretModel[118] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 572
		turretModel[119] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 573
		turretModel[120] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 574
		turretModel[121] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 575
		turretModel[122] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 576
		turretModel[123] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 577
		turretModel[124] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 578
		turretModel[125] = new ModelRendererTurbo(this, 9, 160, textureX, textureY); // Box 579
		turretModel[126] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 580
		turretModel[127] = new ModelRendererTurbo(this, 16, 161, textureX, textureY); // Box 581
		turretModel[128] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 582
		turretModel[129] = new ModelRendererTurbo(this, 13, 165, textureX, textureY); // Box 583
		turretModel[130] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Box 585
		turretModel[131] = new ModelRendererTurbo(this, 0, 187, textureX, textureY); // Box 586
		turretModel[132] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Box 587
		turretModel[133] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Box 588
		turretModel[134] = new ModelRendererTurbo(this, 0, 187, textureX, textureY); // Box 589
		turretModel[135] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Box 590
		turretModel[136] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Box 591
		turretModel[137] = new ModelRendererTurbo(this, 0, 187, textureX, textureY); // Box 592
		turretModel[138] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Box 593
		turretModel[139] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Box 594
		turretModel[140] = new ModelRendererTurbo(this, 0, 187, textureX, textureY); // Box 595
		turretModel[141] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Box 596
		turretModel[142] = new ModelRendererTurbo(this, 0, 129, textureX, textureY); // Box 603
		turretModel[143] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 604
		turretModel[144] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 605
		turretModel[145] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 606
		turretModel[146] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 607
		turretModel[147] = new ModelRendererTurbo(this, 0, 139, textureX, textureY); // Box 608
		turretModel[148] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 609
		turretModel[149] = new ModelRendererTurbo(this, 0, 121, textureX, textureY); // Box 610
		turretModel[150] = new ModelRendererTurbo(this, 19, 140, textureX, textureY); // Box 611
		turretModel[151] = new ModelRendererTurbo(this, 19, 144, textureX, textureY); // Box 613
		turretModel[152] = new ModelRendererTurbo(this, 19, 144, textureX, textureY); // Box 614
		turretModel[153] = new ModelRendererTurbo(this, 19, 140, textureX, textureY); // Box 615
		turretModel[154] = new ModelRendererTurbo(this, 0, 121, textureX, textureY); // Box 616
		turretModel[155] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 617
		turretModel[156] = new ModelRendererTurbo(this, 0, 139, textureX, textureY); // Box 618
		turretModel[157] = new ModelRendererTurbo(this, 19, 144, textureX, textureY); // Box 619
		turretModel[158] = new ModelRendererTurbo(this, 19, 140, textureX, textureY); // Box 620
		turretModel[159] = new ModelRendererTurbo(this, 0, 121, textureX, textureY); // Box 621
		turretModel[160] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 622
		turretModel[161] = new ModelRendererTurbo(this, 0, 139, textureX, textureY); // Box 623
		turretModel[162] = new ModelRendererTurbo(this, 19, 144, textureX, textureY); // Box 624
		turretModel[163] = new ModelRendererTurbo(this, 19, 140, textureX, textureY); // Box 625
		turretModel[164] = new ModelRendererTurbo(this, 0, 121, textureX, textureY); // Box 626
		turretModel[165] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 627
		turretModel[166] = new ModelRendererTurbo(this, 0, 139, textureX, textureY); // Box 628
		turretModel[167] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 629
		turretModel[168] = new ModelRendererTurbo(this, 0, 129, textureX, textureY); // Box 630
		turretModel[169] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 631
		turretModel[170] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 632
		turretModel[171] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 633
		turretModel[172] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Box 634
		turretModel[173] = new ModelRendererTurbo(this, 0, 139, textureX, textureY); // Box 635
		turretModel[174] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 636
		turretModel[175] = new ModelRendererTurbo(this, 0, 121, textureX, textureY); // Box 637
		turretModel[176] = new ModelRendererTurbo(this, 19, 140, textureX, textureY); // Box 638
		turretModel[177] = new ModelRendererTurbo(this, 19, 144, textureX, textureY); // Box 639
		turretModel[178] = new ModelRendererTurbo(this, 19, 144, textureX, textureY); // Box 640
		turretModel[179] = new ModelRendererTurbo(this, 19, 140, textureX, textureY); // Box 641
		turretModel[180] = new ModelRendererTurbo(this, 0, 121, textureX, textureY); // Box 642
		turretModel[181] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 643
		turretModel[182] = new ModelRendererTurbo(this, 0, 139, textureX, textureY); // Box 644
		turretModel[183] = new ModelRendererTurbo(this, 19, 144, textureX, textureY); // Box 645
		turretModel[184] = new ModelRendererTurbo(this, 19, 140, textureX, textureY); // Box 646
		turretModel[185] = new ModelRendererTurbo(this, 0, 121, textureX, textureY); // Box 647
		turretModel[186] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 648
		turretModel[187] = new ModelRendererTurbo(this, 0, 139, textureX, textureY); // Box 649
		turretModel[188] = new ModelRendererTurbo(this, 19, 144, textureX, textureY); // Box 650
		turretModel[189] = new ModelRendererTurbo(this, 19, 140, textureX, textureY); // Box 651
		turretModel[190] = new ModelRendererTurbo(this, 0, 121, textureX, textureY); // Box 652
		turretModel[191] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Box 653
		turretModel[192] = new ModelRendererTurbo(this, 0, 139, textureX, textureY); // Box 654
		turretModel[193] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 655
		turretModel[194] = new ModelRendererTurbo(this, 13, 180, textureX, textureY); // Box 656
		turretModel[195] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Box 657
		turretModel[196] = new ModelRendererTurbo(this, 30, 180, textureX, textureY); // Box 658
		turretModel[197] = new ModelRendererTurbo(this, 19, 153, textureX, textureY); // Box 639
		turretModel[198] = new ModelRendererTurbo(this, 37, 153, textureX, textureY); // Box 640
		turretModel[199] = new ModelRendererTurbo(this, 28, 153, textureX, textureY); // Box 641
		turretModel[200] = new ModelRendererTurbo(this, 60, 154, textureX, textureY); // Box 642
		turretModel[201] = new ModelRendererTurbo(this, 71, 154, textureX, textureY); // Box 643
		turretModel[202] = new ModelRendererTurbo(this, 84, 154, textureX, textureY); // Box 644

		turretModel[0].addShapeBox(-2F, -1F, -22.5F, 21, 2, 45, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 263
		turretModel[0].setRotationPoint(0F, -17F, 0F);

		turretModel[1].addShapeBox(-2F, -15F, -22.5F, 21, 8, 45, 0F,-7.38F, 0F, -3.69F, 0F, 0F, -10F, 0F, 0F, -10F, -7.38F, 0F, -3.69F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 264
		turretModel[1].setRotationPoint(0F, -11F, 0F);

		turretModel[2].addShapeBox(-2F, -1F, -22.5F, 11, 2, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.75F, 0F, 0F); // Box 265
		turretModel[2].setRotationPoint(-11F, -17F, 0F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 23, 13, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -12F, 0F, 6F, -12F, 0F, 6F, 0F, 0F, 6F); // Box 266
		turretModel[3].setRotationPoint(-13F, -31F, -16.5F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 7, 13, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -1F, 5F); // Box 267
		turretModel[4].setRotationPoint(-20F, -31F, -16.5F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 17, 13, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 4.5F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, -1.5F, 4.5F); // Box 268
		turretModel[5].setRotationPoint(-37F, -31F, -16.5F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 9, 13, 33, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.5F, -1.75F, 4.25F, 0F, -1.5F, 4.5F, 0F, -1.5F, 4.5F, -3.5F, -1.75F, 4.25F); // Box 269
		turretModel[6].setRotationPoint(-46F, -31F, -16.5F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 45, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 270
		turretModel[7].setRotationPoint(-13F, -18F, -22.5F);

		turretModel[8].addShapeBox(-7F, 0F, 0F, 7, 2, 45, 0F,0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, -5F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -5F); // Box 271
		turretModel[8].setRotationPoint(-13F, -18F, -22.5F);

		turretModel[9].addShapeBox(-10F, 0F, 0F, 10, 3, 37, 0F,2F, 1F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, -18F, -9F, 0F, -18F, 5F, 0F, -1F, 5F, 0F, -1F, -9F, 0F, -18F); // Box 272
		turretModel[9].setRotationPoint(-20F, -19F, -18.5F);

		turretModel[10].addShapeBox(-2F, -15F, -12.5F, 9, 5, 25, 0F,0F, 0F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		turretModel[10].setRotationPoint(12F, -16F, 0F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, -3.5F, -2.75F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, -2.75F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F); // Box 309
		turretModel[11].setRotationPoint(11F, -30.65F, -16F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -2.75F, 0F, 0F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -2.75F, 0F, -0.35F, 0F); // Box 310
		turretModel[12].setRotationPoint(11F, -30.65F, 12F);

		turretModel[13].addBox(1F, 0F, -4.5F, 2, 1, 4, 0F); // Box 455
		turretModel[13].setRotationPoint(-4F, -31.5F, -9F);

		turretModel[14].addShapeBox(0F, 0F, -4.5F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 456
		turretModel[14].setRotationPoint(-4F, -31.5F, -9F);

		turretModel[15].addShapeBox(3F, 0F, -4.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 457
		turretModel[15].setRotationPoint(-4F, -31.5F, -9F);

		turretModel[16].addShapeBox(0.5F, -4.5F, -4F, 3, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		turretModel[16].setRotationPoint(-4F, -31.5F, -9F);

		turretModel[17].addShapeBox(0.5F, -4.5F, -2F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 459
		turretModel[17].setRotationPoint(-4F, -31.5F, -9F);

		turretModel[18].addShapeBox(0.5F, -3.5F, -3F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		turretModel[18].setRotationPoint(-4F, -31.5F, -9F);

		turretModel[19].addShapeBox(0.5F, -4.5F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		turretModel[19].setRotationPoint(-4F, -31.5F, -9F);

		turretModel[20].addShapeBox(1.5F, -0.5F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		turretModel[20].setRotationPoint(-4F, -31.5F, -9F);

		turretModel[21].addShapeBox(0.5F, -3.5F, -3F, 3, 3, 1, 0F,-0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F); // Box 463
		turretModel[21].setRotationPoint(-4F, -31.5F, -9F);

		turretModel[22].addShapeBox(2.75F, -0.4F, 0.75F, 1, 1, 1, 0F,0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, 0.5F, -0.15F, 0.1F, 0.5F, -0.15F); // Box 464
		turretModel[22].setRotationPoint(-3F, -32F, 11F);

		turretModel[23].addShapeBox(2.75F, -1F, -0.85F, 1, 1, 2, 0F,0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F); // Box 465
		turretModel[23].setRotationPoint(-3F, -32F, 11F);

		turretModel[24].addShapeBox(2.75F, -0.4F, -0.85F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 466
		turretModel[24].setRotationPoint(-3F, -32F, 11F);

		turretModel[25].addShapeBox(2.75F, -0.4F, -1.45F, 1, 1, 1, 0F,0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.5F, -0.15F, 0.1F, 0.5F, -0.15F, 0.1F, 0.5F, -0.4F, 0.1F, 0.5F, -0.4F); // Box 468
		turretModel[25].setRotationPoint(-3F, -32F, 11F);

		turretModel[26].addShapeBox(-7F, -15F, 12.5F, 6, 5, 4, 0F,-5F, 0F, 0F, 0F, -0.24F, 0F, 0F, -0.24F, -0.293F, -5F, 0F, 0F, -0.38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.293F, -0.38F, 0F, 2.31F); // Box 485
		turretModel[26].setRotationPoint(12F, -16F, 0F);

		turretModel[27].addShapeBox(5F, -12.5F, -11.5F, 3, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		turretModel[27].setRotationPoint(12F, -16F, 0F);

		turretModel[28].addShapeBox(-7F, -15F, -16.5F, 6, 5, 4, 0F,-5F, 0F, 0F, 0F, -0.24F, -0.293F, 0F, -0.24F, 0F, -5F, 0F, 0F, -0.38F, 0F, 2.31F, 0F, 0F, -0.293F, 0F, 0F, 0F, -0.38F, 0F, 0F); // Box 467
		turretModel[28].setRotationPoint(12F, -16F, 0F);

		turretModel[29].addShapeBox(6F, -12F, -11.5F, 2, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 468
		turretModel[29].setRotationPoint(12F, -7F, 0F);

		turretModel[30].addShapeBox(-3F, -0.2F, -6F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		turretModel[30].setRotationPoint(-9F, -31F, 7.5F);

		turretModel[31].addShapeBox(-6F, -0.2F, -6F, 3, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 469
		turretModel[31].setRotationPoint(-9F, -31F, 7.5F);

		turretModel[32].addShapeBox(3F, -0.2F, -6F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 470
		turretModel[32].setRotationPoint(-9F, -31F, 7.5F);

		turretModel[33].addShapeBox(-2F, -1.5F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		turretModel[33].setRotationPoint(-9F, -30.5F, 7.5F);

		turretModel[34].addShapeBox(-5F, -1.5F, -5F, 3, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 473
		turretModel[34].setRotationPoint(-9F, -30.5F, 7.5F);

		turretModel[35].addShapeBox(2F, -1.5F, -5F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 474
		turretModel[35].setRotationPoint(-9F, -30.5F, 7.5F);

		turretModel[36].addShapeBox(5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 475
		turretModel[36].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[36].rotateAngleY = -3.14159265F;

		turretModel[37].addShapeBox(5F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 477
		turretModel[37].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[37].rotateAngleY = -3.14159265F;

		turretModel[38].addShapeBox(5F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 478
		turretModel[38].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[38].rotateAngleY = -3.14159265F;

		turretModel[39].addShapeBox(5.4F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 479
		turretModel[39].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[39].rotateAngleY = 0.78539816F;

		turretModel[40].addShapeBox(5.4F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 481
		turretModel[40].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[40].rotateAngleY = 0.78539816F;

		turretModel[41].addShapeBox(5.4F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 482
		turretModel[41].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[41].rotateAngleY = 0.78539816F;

		turretModel[42].addShapeBox(5F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 483
		turretModel[42].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[42].rotateAngleY = 1.57079633F;

		turretModel[43].addShapeBox(5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 485
		turretModel[43].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[43].rotateAngleY = 1.57079633F;

		turretModel[44].addShapeBox(5F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 486
		turretModel[44].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[44].rotateAngleY = 1.57079633F;

		turretModel[45].addShapeBox(5.4F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 487
		turretModel[45].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[45].rotateAngleY = 2.35619449F;

		turretModel[46].addShapeBox(5.4F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 489
		turretModel[46].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[46].rotateAngleY = 2.35619449F;

		turretModel[47].addShapeBox(5.4F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 490
		turretModel[47].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[47].rotateAngleY = 2.35619449F;

		turretModel[48].addShapeBox(5.4F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 491
		turretModel[48].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[48].rotateAngleY = -2.35619449F;

		turretModel[49].addShapeBox(5.4F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 493
		turretModel[49].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[49].rotateAngleY = -2.35619449F;

		turretModel[50].addShapeBox(5.4F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 494
		turretModel[50].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[50].rotateAngleY = -2.35619449F;

		turretModel[51].addShapeBox(5.4F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 496
		turretModel[51].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[51].rotateAngleY = -0.78539816F;

		turretModel[52].addShapeBox(5.4F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 497
		turretModel[52].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[52].rotateAngleY = -0.78539816F;

		turretModel[53].addShapeBox(5.4F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 498
		turretModel[53].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[53].rotateAngleY = -0.78539816F;

		turretModel[54].addShapeBox(5F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 499
		turretModel[54].setRotationPoint(-9F, -32F, 7.5F);

		turretModel[55].addShapeBox(5F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 500
		turretModel[55].setRotationPoint(-9F, -32F, 7.5F);

		turretModel[56].addShapeBox(5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 501
		turretModel[56].setRotationPoint(-9F, -32F, 7.5F);

		turretModel[57].addShapeBox(5F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 502
		turretModel[57].setRotationPoint(-9F, -32F, 7.5F);

		turretModel[58].addShapeBox(5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 504
		turretModel[58].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[58].rotateAngleY = -1.57079633F;

		turretModel[59].addShapeBox(5F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 505
		turretModel[59].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[59].rotateAngleY = -1.57079633F;

		turretModel[60].addShapeBox(5F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 506
		turretModel[60].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[60].rotateAngleY = -1.57079633F;

		turretModel[61].addShapeBox(5.4F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 509
		turretModel[61].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[61].rotateAngleY = 0.78539816F;

		turretModel[62].addShapeBox(5.4F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 510
		turretModel[62].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[62].rotateAngleY = -0.78539816F;

		turretModel[63].addShapeBox(5F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 511
		turretModel[63].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[63].rotateAngleY = -1.57079633F;

		turretModel[64].addShapeBox(5.4F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 512
		turretModel[64].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[64].rotateAngleY = -2.35619449F;

		turretModel[65].addShapeBox(5F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 513
		turretModel[65].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[65].rotateAngleY = -3.14159265F;

		turretModel[66].addShapeBox(5F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 514
		turretModel[66].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[66].rotateAngleY = 1.57079633F;

		turretModel[67].addShapeBox(5.4F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 515
		turretModel[67].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[67].rotateAngleY = 2.35619449F;

		turretModel[68].addShapeBox(5F, -0.8F, -3F, 1, 1, 6, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F); // Box 518
		turretModel[68].setRotationPoint(-9F, -32F, 7.5F);

		turretModel[69].addShapeBox(5F, -0.8F, -6F, 1, 1, 3, 0F,2.5F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 2F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 522
		turretModel[69].setRotationPoint(-9F, -32F, 7.5F);

		turretModel[70].addShapeBox(5F, -0.8F, -6F, 1, 1, 3, 0F,2.5F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 2F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 523
		turretModel[70].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[70].rotateAngleY = -1.57079633F;

		turretModel[71].addShapeBox(5F, -0.8F, -3F, 1, 1, 6, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F); // Box 524
		turretModel[71].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[71].rotateAngleY = -1.57079633F;

		turretModel[72].addShapeBox(5F, -0.8F, -6F, 1, 1, 3, 0F,2.5F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 2F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 525
		turretModel[72].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[72].rotateAngleY = -3.14159265F;

		turretModel[73].addShapeBox(5F, -0.8F, -3F, 1, 1, 6, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F); // Box 526
		turretModel[73].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[73].rotateAngleY = -3.14159265F;

		turretModel[74].addShapeBox(5F, -0.8F, -6F, 1, 1, 3, 0F,2.5F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 2F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 527
		turretModel[74].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[74].rotateAngleY = -4.71238898F;

		turretModel[75].addShapeBox(5F, -0.8F, -3F, 1, 1, 6, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F); // Box 528
		turretModel[75].setRotationPoint(-9F, -32F, 7.5F);
		turretModel[75].rotateAngleY = -4.71238898F;

		turretModel[76].addShapeBox(1.75F, -2.2F, -5F, 3, 1, 10, 0F,0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, -0.25F); // Box 529
		turretModel[76].setRotationPoint(-9F, -30.5F, 7.5F);

		turretModel[77].addShapeBox(-2F, -2.2F, -5F, 4, 1, 10, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 530
		turretModel[77].setRotationPoint(-9F, -30.5F, 7.5F);

		turretModel[78].addShapeBox(-4.75F, -2.2F, -5F, 3, 1, 10, 0F,0F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F); // Box 532
		turretModel[78].setRotationPoint(-9F, -30.5F, 7.5F);

		turretModel[79].addShapeBox(-6F, -2.75F, -1F, 4, 1, 2, 0F,-0.5F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 533
		turretModel[79].setRotationPoint(-9F, -30.5F, 7.5F);

		turretModel[80].addShapeBox(2F, -1.5F, -5F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 534
		turretModel[80].setRotationPoint(-11F, -30.5F, -9F);

		turretModel[81].addShapeBox(-5F, -1.5F, -5F, 3, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 535
		turretModel[81].setRotationPoint(-11F, -30.5F, -9F);

		turretModel[82].addShapeBox(-2F, -1.5F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		turretModel[82].setRotationPoint(-11F, -30.5F, -9F);

		turretModel[83].addShapeBox(-4.75F, -2.2F, -5F, 3, 1, 10, 0F,0F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F); // Box 537
		turretModel[83].setRotationPoint(-11F, -30.5F, -9F);

		turretModel[84].addShapeBox(-2F, -2.2F, -5F, 4, 1, 10, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 538
		turretModel[84].setRotationPoint(-11F, -30.5F, -9F);

		turretModel[85].addShapeBox(1.75F, -2.2F, -5F, 3, 1, 10, 0F,0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, -0.25F); // Box 539
		turretModel[85].setRotationPoint(-11F, -30.5F, -9F);

		turretModel[86].addShapeBox(-6F, -2.75F, -1F, 4, 1, 2, 0F,-0.5F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 540
		turretModel[86].setRotationPoint(-11F, -30.5F, -9F);

		turretModel[87].addShapeBox(5F, -0.8F, -3F, 1, 1, 6, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F); // Box 541
		turretModel[87].setRotationPoint(-11F, -32F, -9F);
		turretModel[87].rotateAngleY = -3.14159265F;

		turretModel[88].addShapeBox(5F, -0.8F, -6F, 1, 1, 3, 0F,2.5F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 2F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 542
		turretModel[88].setRotationPoint(-11F, -32F, -9F);
		turretModel[88].rotateAngleY = -1.57079633F;

		turretModel[89].addShapeBox(5F, -0.8F, -3F, 1, 1, 6, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F); // Box 543
		turretModel[89].setRotationPoint(-11F, -32F, -9F);
		turretModel[89].rotateAngleY = -1.57079633F;

		turretModel[90].addShapeBox(5F, -0.8F, -6F, 1, 1, 3, 0F,2.5F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 2F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 544
		turretModel[90].setRotationPoint(-11F, -32F, -9F);

		turretModel[91].addShapeBox(5F, -0.8F, -3F, 1, 1, 6, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F); // Box 545
		turretModel[91].setRotationPoint(-11F, -32F, -9F);

		turretModel[92].addShapeBox(5F, -0.8F, -3F, 1, 1, 6, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F); // Box 546
		turretModel[92].setRotationPoint(-11F, -32F, -9F);
		turretModel[92].rotateAngleY = -4.71238898F;

		turretModel[93].addShapeBox(-3F, -0.2F, -6F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		turretModel[93].setRotationPoint(-11F, -31F, -9F);

		turretModel[94].addShapeBox(-6F, -0.2F, -6F, 3, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 548
		turretModel[94].setRotationPoint(-11F, -31F, -9F);

		turretModel[95].addShapeBox(3F, -0.2F, -6F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 549
		turretModel[95].setRotationPoint(-11F, -31F, -9F);

		turretModel[96].addShapeBox(5.4F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 550
		turretModel[96].setRotationPoint(-11F, -32F, -9F);
		turretModel[96].rotateAngleY = 0.78539816F;

		turretModel[97].addShapeBox(5.4F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 551
		turretModel[97].setRotationPoint(-11F, -32F, -9F);
		turretModel[97].rotateAngleY = 0.78539816F;

		turretModel[98].addShapeBox(5.4F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 552
		turretModel[98].setRotationPoint(-11F, -32F, -9F);
		turretModel[98].rotateAngleY = 0.78539816F;

		turretModel[99].addShapeBox(5.4F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 553
		turretModel[99].setRotationPoint(-11F, -32F, -9F);
		turretModel[99].rotateAngleY = 0.78539816F;

		turretModel[100].addShapeBox(5F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 554
		turretModel[100].setRotationPoint(-11F, -32F, -9F);

		turretModel[101].addShapeBox(5F, -0.8F, -6F, 1, 1, 3, 0F,2.5F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 2F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 555
		turretModel[101].setRotationPoint(-11F, -32F, -9F);
		turretModel[101].rotateAngleY = -4.71238898F;

		turretModel[102].addShapeBox(5F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 556
		turretModel[102].setRotationPoint(-11F, -32F, -9F);

		turretModel[103].addShapeBox(5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 557
		turretModel[103].setRotationPoint(-11F, -32F, -9F);
		turretModel[103].rotateAngleY = 1.57079633F;

		turretModel[104].addShapeBox(5F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 558
		turretModel[104].setRotationPoint(-11F, -32F, -9F);
		turretModel[104].rotateAngleY = 1.57079633F;

		turretModel[105].addShapeBox(5F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 559
		turretModel[105].setRotationPoint(-11F, -32F, -9F);
		turretModel[105].rotateAngleY = 1.57079633F;

		turretModel[106].addShapeBox(5F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 560
		turretModel[106].setRotationPoint(-11F, -32F, -9F);
		turretModel[106].rotateAngleY = 1.57079633F;

		turretModel[107].addShapeBox(5.4F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 561
		turretModel[107].setRotationPoint(-11F, -32F, -9F);
		turretModel[107].rotateAngleY = 2.35619449F;

		turretModel[108].addShapeBox(5.4F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 562
		turretModel[108].setRotationPoint(-11F, -32F, -9F);
		turretModel[108].rotateAngleY = 2.35619449F;

		turretModel[109].addShapeBox(5F, -0.8F, -6F, 1, 1, 3, 0F,2.5F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 2F, -0.3F, -1F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 563
		turretModel[109].setRotationPoint(-11F, -32F, -9F);
		turretModel[109].rotateAngleY = -3.14159265F;

		turretModel[110].addShapeBox(5.4F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 564
		turretModel[110].setRotationPoint(-11F, -32F, -9F);
		turretModel[110].rotateAngleY = 2.35619449F;

		turretModel[111].addShapeBox(5.4F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 565
		turretModel[111].setRotationPoint(-11F, -32F, -9F);
		turretModel[111].rotateAngleY = 2.35619449F;

		turretModel[112].addShapeBox(5F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 566
		turretModel[112].setRotationPoint(-11F, -32F, -9F);
		turretModel[112].rotateAngleY = -3.14159265F;

		turretModel[113].addShapeBox(5F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 567
		turretModel[113].setRotationPoint(-11F, -32F, -9F);
		turretModel[113].rotateAngleY = -3.14159265F;

		turretModel[114].addShapeBox(5F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 568
		turretModel[114].setRotationPoint(-11F, -32F, -9F);
		turretModel[114].rotateAngleY = -3.14159265F;

		turretModel[115].addShapeBox(5.4F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 569
		turretModel[115].setRotationPoint(-11F, -32F, -9F);
		turretModel[115].rotateAngleY = -2.35619449F;

		turretModel[116].addShapeBox(5.4F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 570
		turretModel[116].setRotationPoint(-11F, -32F, -9F);
		turretModel[116].rotateAngleY = -2.35619449F;

		turretModel[117].addShapeBox(5.4F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 571
		turretModel[117].setRotationPoint(-11F, -32F, -9F);
		turretModel[117].rotateAngleY = -2.35619449F;

		turretModel[118].addShapeBox(5.4F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 572
		turretModel[118].setRotationPoint(-11F, -32F, -9F);
		turretModel[118].rotateAngleY = -2.35619449F;

		turretModel[119].addShapeBox(5F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 573
		turretModel[119].setRotationPoint(-11F, -32F, -9F);
		turretModel[119].rotateAngleY = -1.57079633F;

		turretModel[120].addShapeBox(5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 574
		turretModel[120].setRotationPoint(-11F, -32F, -9F);
		turretModel[120].rotateAngleY = -1.57079633F;

		turretModel[121].addShapeBox(5F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 575
		turretModel[121].setRotationPoint(-11F, -32F, -9F);
		turretModel[121].rotateAngleY = -1.57079633F;

		turretModel[122].addShapeBox(5F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 576
		turretModel[122].setRotationPoint(-11F, -32F, -9F);
		turretModel[122].rotateAngleY = -1.57079633F;

		turretModel[123].addShapeBox(5.4F, 0F, 0.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 577
		turretModel[123].setRotationPoint(-11F, -32F, -9F);
		turretModel[123].rotateAngleY = -0.78539816F;

		turretModel[124].addShapeBox(5.4F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 578
		turretModel[124].setRotationPoint(-11F, -32F, -9F);
		turretModel[124].rotateAngleY = -0.78539816F;

		turretModel[125].addShapeBox(5.4F, -0.6F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F, -0.1F, -0.4F, 0.2F); // Box 579
		turretModel[125].setRotationPoint(-11F, -32F, -9F);
		turretModel[125].rotateAngleY = -0.78539816F;

		turretModel[126].addShapeBox(5.4F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 580
		turretModel[126].setRotationPoint(-11F, -32F, -9F);
		turretModel[126].rotateAngleY = -0.78539816F;

		turretModel[127].addShapeBox(5F, 0F, -1.6F, 1, 1, 1, 0F,-0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 581
		turretModel[127].setRotationPoint(-11F, -32F, -9F);

		turretModel[128].addShapeBox(5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 582
		turretModel[128].setRotationPoint(-11F, -32F, -9F);

		turretModel[129].addShapeBox(5F, 0F, -1F, 1, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 583
		turretModel[129].setRotationPoint(-11F, -32F, -9F);
		turretModel[129].rotateAngleY = -3.14159265F;

		turretModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 585
		turretModel[130].setRotationPoint(-9.5F, -21F, -23F);

		turretModel[131].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 586
		turretModel[131].setRotationPoint(-9.25F, -21F, -23.75F);

		turretModel[132].addShapeBox(7.5F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 587
		turretModel[132].setRotationPoint(-9.5F, -21F, -23F);

		turretModel[133].addShapeBox(7.5F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 588
		turretModel[133].setRotationPoint(-27.5F, -21F, -22.5F);

		turretModel[134].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 589
		turretModel[134].setRotationPoint(-27.25F, -21F, -23.25F);

		turretModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 590
		turretModel[135].setRotationPoint(-27.5F, -21F, -22.5F);

		turretModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 591
		turretModel[136].setRotationPoint(-9.5F, -21F, 21F);

		turretModel[137].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 592
		turretModel[137].setRotationPoint(-9.25F, -21F, 22.75F);

		turretModel[138].addShapeBox(7.5F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 593
		turretModel[138].setRotationPoint(-9.5F, -21F, 21F);

		turretModel[139].addShapeBox(7.5F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 594
		turretModel[139].setRotationPoint(-27.5F, -21F, 20.5F);

		turretModel[140].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 595
		turretModel[140].setRotationPoint(-27.25F, -21F, 22.25F);

		turretModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 596
		turretModel[141].setRotationPoint(-27.5F, -21F, 20.5F);

		turretModel[142].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F); // Box 603
		turretModel[142].setRotationPoint(-19.5F, -27F, -20.8F);

		turretModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 604
		turretModel[143].setRotationPoint(-18.5F, -26.5F, -20.7F);

		turretModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 605
		turretModel[144].setRotationPoint(-17F, -26.5F, -20.7F);

		turretModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 606
		turretModel[145].setRotationPoint(-9.5F, -26.5F, -20.7F);

		turretModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 607
		turretModel[146].setRotationPoint(-11F, -26.5F, -20.7F);

		turretModel[147].addShapeBox(-1F, -2F, 0F, 1, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 608
		turretModel[147].setRotationPoint(-7.5F, -26.75F, -20.75F);
		turretModel[147].rotateAngleZ = 0.78539816F;

		turretModel[148].addShapeBox(-1F, -2F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 609
		turretModel[148].setRotationPoint(-7.5F, -26.75F, -20.75F);
		turretModel[148].rotateAngleZ = 0.78539816F;

		turretModel[149].addShapeBox(-1F, -3F, 0F, 3, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 610
		turretModel[149].setRotationPoint(-7.5F, -26.75F, -20.75F);
		turretModel[149].rotateAngleZ = 0.78539816F;

		turretModel[150].addShapeBox(1F, -3F, 0F, 1, 1, 2, 0F,0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F); // Box 611
		turretModel[150].setRotationPoint(-7.5F, -26.75F, -20.75F);
		turretModel[150].rotateAngleZ = 0.78539816F;

		turretModel[151].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F,0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F); // Box 613
		turretModel[151].setRotationPoint(-7.5F, -26.75F, -20.75F);
		turretModel[151].rotateAngleZ = 0.78539816F;

		turretModel[152].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F,0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F); // Box 614
		turretModel[152].setRotationPoint(-10.75F, -26.75F, -20.75F);
		turretModel[152].rotateAngleZ = 0.78539816F;

		turretModel[153].addShapeBox(1F, -3F, 0F, 1, 1, 2, 0F,0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F); // Box 615
		turretModel[153].setRotationPoint(-10.75F, -26.75F, -20.75F);
		turretModel[153].rotateAngleZ = 0.78539816F;

		turretModel[154].addShapeBox(-1F, -3F, 0F, 3, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 616
		turretModel[154].setRotationPoint(-10.75F, -26.75F, -20.75F);
		turretModel[154].rotateAngleZ = 0.78539816F;

		turretModel[155].addShapeBox(-1F, -2F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 617
		turretModel[155].setRotationPoint(-10.75F, -26.75F, -20.75F);
		turretModel[155].rotateAngleZ = 0.78539816F;

		turretModel[156].addShapeBox(-1F, -2F, 0F, 1, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 618
		turretModel[156].setRotationPoint(-10.75F, -26.75F, -20.75F);
		turretModel[156].rotateAngleZ = 0.78539816F;

		turretModel[157].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F,0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F); // Box 619
		turretModel[157].setRotationPoint(-14F, -26.75F, -20.75F);
		turretModel[157].rotateAngleZ = 0.78539816F;

		turretModel[158].addShapeBox(1F, -3F, 0F, 1, 1, 2, 0F,0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F); // Box 620
		turretModel[158].setRotationPoint(-14F, -26.75F, -20.75F);
		turretModel[158].rotateAngleZ = 0.78539816F;

		turretModel[159].addShapeBox(-1F, -3F, 0F, 3, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 621
		turretModel[159].setRotationPoint(-14F, -26.75F, -20.75F);
		turretModel[159].rotateAngleZ = 0.78539816F;

		turretModel[160].addShapeBox(-1F, -2F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 622
		turretModel[160].setRotationPoint(-14F, -26.75F, -20.75F);
		turretModel[160].rotateAngleZ = 0.78539816F;

		turretModel[161].addShapeBox(-1F, -2F, 0F, 1, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 623
		turretModel[161].setRotationPoint(-14F, -26.75F, -20.75F);
		turretModel[161].rotateAngleZ = 0.78539816F;

		turretModel[162].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F,0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F); // Box 624
		turretModel[162].setRotationPoint(-17.25F, -26.75F, -20.75F);
		turretModel[162].rotateAngleZ = 0.78539816F;

		turretModel[163].addShapeBox(1F, -3F, 0F, 1, 1, 2, 0F,0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F); // Box 625
		turretModel[163].setRotationPoint(-17.25F, -26.75F, -20.75F);
		turretModel[163].rotateAngleZ = 0.78539816F;

		turretModel[164].addShapeBox(-1F, -3F, 0F, 3, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 626
		turretModel[164].setRotationPoint(-17.25F, -26.75F, -20.75F);
		turretModel[164].rotateAngleZ = 0.78539816F;

		turretModel[165].addShapeBox(-1F, -2F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 627
		turretModel[165].setRotationPoint(-17.25F, -26.75F, -20.75F);
		turretModel[165].rotateAngleZ = 0.78539816F;

		turretModel[166].addShapeBox(-1F, -2F, 0F, 1, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 628
		turretModel[166].setRotationPoint(-17.25F, -26.75F, -20.75F);
		turretModel[166].rotateAngleZ = 0.78539816F;

		turretModel[167].addShapeBox(0F, -1F, 0F, 12, 3, 1, 0F,0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 629
		turretModel[167].setRotationPoint(-19.5F, -28.2F, -19F);

		turretModel[168].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 630
		turretModel[168].setRotationPoint(-19.5F, -27F, 18.8F);

		turretModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F); // Box 631
		turretModel[169].setRotationPoint(-18.5F, -26.5F, 17.7F);

		turretModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F); // Box 632
		turretModel[170].setRotationPoint(-17F, -26.5F, 17.7F);

		turretModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F); // Box 633
		turretModel[171].setRotationPoint(-9.5F, -26.5F, 17.7F);

		turretModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F); // Box 634
		turretModel[172].setRotationPoint(-11F, -26.5F, 17.7F);

		turretModel[173].addShapeBox(-1F, -2F, 0F, 1, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 635
		turretModel[173].setRotationPoint(-7.5F, -26.75F, 18.75F);
		turretModel[173].rotateAngleZ = 0.78539816F;

		turretModel[174].addShapeBox(-1F, -2F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 636
		turretModel[174].setRotationPoint(-7.5F, -26.75F, 18.75F);
		turretModel[174].rotateAngleZ = 0.78539816F;

		turretModel[175].addShapeBox(-1F, -3F, 0F, 3, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 637
		turretModel[175].setRotationPoint(-7.5F, -26.75F, 18.75F);
		turretModel[175].rotateAngleZ = 0.78539816F;

		turretModel[176].addShapeBox(1F, -3F, 0F, 1, 1, 2, 0F,0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F); // Box 638
		turretModel[176].setRotationPoint(-7.5F, -26.75F, 18.75F);
		turretModel[176].rotateAngleZ = 0.78539816F;

		turretModel[177].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F,0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F); // Box 639
		turretModel[177].setRotationPoint(-7.5F, -26.75F, 18.75F);
		turretModel[177].rotateAngleZ = 0.78539816F;

		turretModel[178].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F,0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F); // Box 640
		turretModel[178].setRotationPoint(-10.75F, -26.75F, 18.75F);
		turretModel[178].rotateAngleZ = 0.78539816F;

		turretModel[179].addShapeBox(1F, -3F, 0F, 1, 1, 2, 0F,0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F); // Box 641
		turretModel[179].setRotationPoint(-10.75F, -26.75F, 18.75F);
		turretModel[179].rotateAngleZ = 0.78539816F;

		turretModel[180].addShapeBox(-1F, -3F, 0F, 3, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 642
		turretModel[180].setRotationPoint(-10.75F, -26.75F, 18.75F);
		turretModel[180].rotateAngleZ = 0.78539816F;

		turretModel[181].addShapeBox(-1F, -2F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 643
		turretModel[181].setRotationPoint(-10.75F, -26.75F, 18.75F);
		turretModel[181].rotateAngleZ = 0.78539816F;

		turretModel[182].addShapeBox(-1F, -2F, 0F, 1, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 644
		turretModel[182].setRotationPoint(-10.75F, -26.75F, 18.75F);
		turretModel[182].rotateAngleZ = 0.78539816F;

		turretModel[183].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F,0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F); // Box 645
		turretModel[183].setRotationPoint(-14F, -26.75F, 18.75F);
		turretModel[183].rotateAngleZ = 0.78539816F;

		turretModel[184].addShapeBox(1F, -3F, 0F, 1, 1, 2, 0F,0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F); // Box 646
		turretModel[184].setRotationPoint(-14F, -26.75F, 18.75F);
		turretModel[184].rotateAngleZ = 0.78539816F;

		turretModel[185].addShapeBox(-1F, -3F, 0F, 3, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 647
		turretModel[185].setRotationPoint(-14F, -26.75F, 18.75F);
		turretModel[185].rotateAngleZ = 0.78539816F;

		turretModel[186].addShapeBox(-1F, -2F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 648
		turretModel[186].setRotationPoint(-14F, -26.75F, 18.75F);
		turretModel[186].rotateAngleZ = 0.78539816F;

		turretModel[187].addShapeBox(-1F, -2F, 0F, 1, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 649
		turretModel[187].setRotationPoint(-14F, -26.75F, 18.75F);
		turretModel[187].rotateAngleZ = 0.78539816F;

		turretModel[188].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F,0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F); // Box 650
		turretModel[188].setRotationPoint(-17.25F, -26.75F, 18.75F);
		turretModel[188].rotateAngleZ = 0.78539816F;

		turretModel[189].addShapeBox(1F, -3F, 0F, 1, 1, 2, 0F,0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, -0.15F, -0.4F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F); // Box 651
		turretModel[189].setRotationPoint(-17.25F, -26.75F, 18.75F);
		turretModel[189].rotateAngleZ = 0.78539816F;

		turretModel[190].addShapeBox(-1F, -3F, 0F, 3, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 652
		turretModel[190].setRotationPoint(-17.25F, -26.75F, 18.75F);
		turretModel[190].rotateAngleZ = 0.78539816F;

		turretModel[191].addShapeBox(-1F, -2F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 653
		turretModel[191].setRotationPoint(-17.25F, -26.75F, 18.75F);
		turretModel[191].rotateAngleZ = 0.78539816F;

		turretModel[192].addShapeBox(-1F, -2F, 0F, 1, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 654
		turretModel[192].setRotationPoint(-17.25F, -26.75F, 18.75F);
		turretModel[192].rotateAngleZ = 0.78539816F;

		turretModel[193].addShapeBox(0F, -1F, 0F, 12, 3, 1, 0F,0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 655
		turretModel[193].setRotationPoint(-19.5F, -28.2F, 18F);

		turretModel[194].addBox(1F, 0F, -4.5F, 3, 1, 5, 0F); // Box 656
		turretModel[194].setRotationPoint(-22.5F, -31.5F, 5.75F);

		turretModel[195].addShapeBox(4F, 0F, -4.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 657
		turretModel[195].setRotationPoint(-22.5F, -31.5F, 5.75F);

		turretModel[196].addShapeBox(0F, 0F, -4.5F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 658
		turretModel[196].setRotationPoint(-22.5F, -31.5F, 5.75F);

		turretModel[197].addShapeBox(0.5F, -4.5F, -4F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		turretModel[197].setRotationPoint(-6F, -28F, -2.5F);

		turretModel[198].addShapeBox(0.5F, -4.5F, -2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 640
		turretModel[198].setRotationPoint(-6F, -28F, -2.5F);

		turretModel[199].addShapeBox(0.5F, -4.5F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		turretModel[199].setRotationPoint(-6F, -28F, -2.5F);

		turretModel[200].addShapeBox(3F, 0F, -4.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 642
		turretModel[200].setRotationPoint(-6F, -31.5F, -2.5F);

		turretModel[201].addBox(1F, 0F, -4.5F, 2, 1, 4, 0F); // Box 643
		turretModel[201].setRotationPoint(-6F, -31.5F, -2.5F);

		turretModel[202].addShapeBox(0F, 0F, -4.5F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 644
		turretModel[202].setRotationPoint(-6F, -31.5F, -2.5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 105, 214, textureX, textureY); // Box 273
		barrelModel[1] = new ModelRendererTurbo(this, 159, 227, textureX, textureY); // Box 274
		barrelModel[2] = new ModelRendererTurbo(this, 271, 264, textureX, textureY); // Box 275
		barrelModel[3] = new ModelRendererTurbo(this, 207, 232, textureX, textureY); // Box 276
		barrelModel[4] = new ModelRendererTurbo(this, 236, 242, textureX, textureY); // Box 277
		barrelModel[5] = new ModelRendererTurbo(this, 305, 261, textureX, textureY); // Box 278
		barrelModel[6] = new ModelRendererTurbo(this, 90, 217, textureX, textureY); // Box 279
		barrelModel[7] = new ModelRendererTurbo(this, 90, 209, textureX, textureY); // Box 280
		barrelModel[8] = new ModelRendererTurbo(this, 90, 228, textureX, textureY); // Box 281
		barrelModel[9] = new ModelRendererTurbo(this, 115, 209, textureX, textureY); // Box 282
		barrelModel[10] = new ModelRendererTurbo(this, 115, 228, textureX, textureY); // Box 283
		barrelModel[11] = new ModelRendererTurbo(this, 115, 217, textureX, textureY); // Box 284
		barrelModel[12] = new ModelRendererTurbo(this, 52, 222, textureX, textureY); // Box 288
		barrelModel[13] = new ModelRendererTurbo(this, 52, 215, textureX, textureY); // Box 289
		barrelModel[14] = new ModelRendererTurbo(this, 52, 209, textureX, textureY); // Box 290
		barrelModel[15] = new ModelRendererTurbo(this, 75, 209, textureX, textureY); // Box 291
		barrelModel[16] = new ModelRendererTurbo(this, 75, 215, textureX, textureY); // Box 292
		barrelModel[17] = new ModelRendererTurbo(this, 75, 222, textureX, textureY); // Box 294
		barrelModel[18] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Box 295
		barrelModel[19] = new ModelRendererTurbo(this, 0, 241, textureX, textureY); // Box 296
		barrelModel[20] = new ModelRendererTurbo(this, 0, 252, textureX, textureY); // Box 297
		barrelModel[21] = new ModelRendererTurbo(this, 0, 246, textureX, textureY); // Box 298
		barrelModel[22] = new ModelRendererTurbo(this, 0, 249, textureX, textureY); // Box 299
		barrelModel[23] = new ModelRendererTurbo(this, 0, 235, textureX, textureY); // Box 300
		barrelModel[24] = new ModelRendererTurbo(this, 0, 238, textureX, textureY); // Box 301
		barrelModel[25] = new ModelRendererTurbo(this, 27, 209, textureX, textureY); // Box 302
		barrelModel[26] = new ModelRendererTurbo(this, 27, 215, textureX, textureY); // Box 303
		barrelModel[27] = new ModelRendererTurbo(this, 27, 218, textureX, textureY); // Box 304
		barrelModel[28] = new ModelRendererTurbo(this, 27, 221, textureX, textureY); // Box 307
		barrelModel[29] = new ModelRendererTurbo(this, 0, 215, textureX, textureY); // Box 311
		barrelModel[30] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Box 312
		barrelModel[31] = new ModelRendererTurbo(this, 0, 222, textureX, textureY); // Box 313
		barrelModel[32] = new ModelRendererTurbo(this, 0, 209, textureX, textureY); // Box 315
		barrelModel[33] = new ModelRendererTurbo(this, 0, 212, textureX, textureY); // Box 316
		barrelModel[34] = new ModelRendererTurbo(this, 0, 225, textureX, textureY); // Box 317
		barrelModel[35] = new ModelRendererTurbo(this, 0, 257, textureX, textureY); // Box 584
		barrelModel[36] = new ModelRendererTurbo(this, 27, 215, textureX, textureY); // Box 636
		barrelModel[37] = new ModelRendererTurbo(this, 27, 218, textureX, textureY); // Box 637

		barrelModel[0].addShapeBox(0F, -6.5F, -13F, 13, 11, 26, 0F,0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F, -1.5F, -4F, -4F, -1.5F, -4F, 0F, 0.5F, 0F); // Box 273
		barrelModel[0].setRotationPoint(19F, -23F, 0F);

		barrelModel[1].addShapeBox(0F, 5F, -13F, 9, 1, 26, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -3.75F, -1F, -2F, -3.75F, 0F, 0F, 0F); // Box 274
		barrelModel[1].setRotationPoint(19F, -23F, 0F);

		barrelModel[2].addShapeBox(0F, 6F, -12.5F, 4, 1, 25, 0F,0F, 0F, 0.25F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, 0.25F, -1F, -0.5F, -0.5F, -1F, -1F, -1.75F, -1F, -1F, -1.75F, -1F, -0.5F, -0.5F); // Box 275
		barrelModel[2].setRotationPoint(19F, -23F, 0F);

		barrelModel[3].addShapeBox(-2F, -4F, -13F, 2, 9, 26, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 276
		barrelModel[3].setRotationPoint(19F, -23F, 0F);

		barrelModel[4].addShapeBox(-3F, -3F, -14F, 1, 7, 28, 0F,0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F); // Box 277
		barrelModel[4].setRotationPoint(19F, -23F, 0F);

		barrelModel[5].addShapeBox(-2F, 5F, -13F, 2, 1, 26, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.25F, -1.75F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.75F, 0.75F); // Box 278
		barrelModel[5].setRotationPoint(19F, -23F, 0F);

		barrelModel[6].addBox(7F, -1.5F, -3F, 6, 4, 6, 0F); // Box 279
		barrelModel[6].setRotationPoint(19F, -23F, 0F);

		barrelModel[7].addShapeBox(7F, -2.5F, -3F, 6, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		barrelModel[7].setRotationPoint(19F, -23F, 0F);

		barrelModel[8].addShapeBox(7F, 2.5F, -3F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 281
		barrelModel[8].setRotationPoint(19F, -23F, 0F);

		barrelModel[9].addShapeBox(13F, -2.5F, -3F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F); // Box 282
		barrelModel[9].setRotationPoint(19F, -23F, 0F);

		barrelModel[10].addShapeBox(13F, 2.5F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F); // Box 283
		barrelModel[10].setRotationPoint(19F, -23F, 0F);

		barrelModel[11].addShapeBox(13F, -1.5F, -3F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 284
		barrelModel[11].setRotationPoint(19F, -23F, 0F);

		barrelModel[12].addShapeBox(13.5F, 1.6F, -2F, 7, 1, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F); // Box 288
		barrelModel[12].setRotationPoint(19F, -23F, 0F);

		barrelModel[13].addShapeBox(13.5F, -0.5F, -2F, 7, 2, 4, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 289
		barrelModel[13].setRotationPoint(19F, -23F, 0F);

		barrelModel[14].addShapeBox(13.5F, -1.6F, -2F, 7, 1, 4, 0F,0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 290
		barrelModel[14].setRotationPoint(19F, -23F, 0F);

		barrelModel[15].addShapeBox(17.75F, -1.65F, -2F, 3, 1, 4, 0F,0F, 0.15F, -0.85F, 0F, 0.15F, -0.85F, 0F, 0.15F, -0.85F, 0F, 0.15F, -0.85F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 291
		barrelModel[15].setRotationPoint(19F, -23F, 0F);

		barrelModel[16].addShapeBox(17.75F, -0.5F, -2F, 3, 2, 4, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 292
		barrelModel[16].setRotationPoint(19F, -23F, 0F);

		barrelModel[17].addShapeBox(17.75F, 1.65F, -2F, 3, 1, 4, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.15F, -0.85F, 0F, 0.15F, -0.85F, 0F, 0.15F, -0.85F, 0F, 0.15F, -0.85F); // Box 294
		barrelModel[17].setRotationPoint(19F, -23F, 0F);

		barrelModel[18].addShapeBox(20.75F, -0.5F, -1F, 18, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		barrelModel[18].setRotationPoint(19F, -23F, 0F);

		barrelModel[19].addShapeBox(20.75F, -1.25F, -1.5F, 42, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 296
		barrelModel[19].setRotationPoint(19F, -23F, 0F);

		barrelModel[20].addShapeBox(20.75F, 1F, -1.5F, 42, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 297
		barrelModel[20].setRotationPoint(19F, -23F, 0F);

		barrelModel[21].addShapeBox(20.75F, -0.5F, -1.5F, 42, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F); // Box 298
		barrelModel[21].setRotationPoint(19F, -23F, 0F);

		barrelModel[22].addShapeBox(20.75F, 0.25F, -1.5F, 42, 1, 1, 0F,0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 299
		barrelModel[22].setRotationPoint(19F, -23F, 0F);

		barrelModel[23].addShapeBox(20.75F, 0.25F, 0.5F, 42, 1, 1, 0F,0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		barrelModel[23].setRotationPoint(19F, -23F, 0F);

		barrelModel[24].addShapeBox(20.75F, -0.5F, 0.5F, 42, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F); // Box 301
		barrelModel[24].setRotationPoint(19F, -23F, 0F);

		barrelModel[25].addShapeBox(29F, -2.15F, -1.5F, 9, 2, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 302
		barrelModel[25].setRotationPoint(19F, -23F, 0F);

		barrelModel[26].addShapeBox(29.25F, -0.4F, -1.75F, 9, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0.125F, -0.125F, 0.25F, -0.375F, -0.125F, 0.25F, -0.375F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F); // Box 303
		barrelModel[26].setRotationPoint(19F, -23F, 0F);

		barrelModel[27].addShapeBox(29.25F, 0.35F, -1.75F, 9, 1, 1, 0F,0.125F, -0.125F, 0.25F, -0.375F, -0.125F, 0.25F, -0.375F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.25F, 0.3F, 0F, -0.25F); // Box 304
		barrelModel[27].setRotationPoint(19F, -23F, 0F);

		barrelModel[28].addShapeBox(29F, 1.1F, -1.5F, 9, 1, 3, 0F,0.05F, -0.25F, 0.25F, 0.05F, -0.25F, 0.25F, 0.05F, -0.25F, 0.25F, 0.05F, -0.25F, 0.25F, 0.2F, 0.05F, -0.4F, 0.25F, 0.05F, -0.4F, 0.25F, 0.05F, -0.4F, 0.2F, 0.05F, -0.4F); // Box 307
		barrelModel[28].setRotationPoint(19F, -23F, 0F);

		barrelModel[29].addShapeBox(28.5F, -1.25F, -1.5F, 10, 1, 3, 0F,0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F); // Box 311
		barrelModel[29].setRotationPoint(19F, -23F, 0F);

		barrelModel[30].addShapeBox(28.5F, -0.5F, -1.6F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F); // Box 312
		barrelModel[30].setRotationPoint(19F, -23F, 0F);

		barrelModel[31].addShapeBox(28.5F, 0.25F, -1.6F, 10, 1, 1, 0F,0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 313
		barrelModel[31].setRotationPoint(19F, -23F, 0F);

		barrelModel[32].addShapeBox(28.5F, 0.25F, 0.6F, 10, 1, 1, 0F,0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		barrelModel[32].setRotationPoint(19F, -23F, 0F);

		barrelModel[33].addShapeBox(28.5F, -0.5F, 0.6F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F); // Box 316
		barrelModel[33].setRotationPoint(19F, -23F, 0F);

		barrelModel[34].addShapeBox(28.5F, 1F, -1.5F, 10, 1, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 317
		barrelModel[34].setRotationPoint(19F, -23F, 0F);

		barrelModel[35].addShapeBox(11.5F, 0F, -6F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F); // Box 584
		barrelModel[35].setRotationPoint(19F, -23F, 0F);

		barrelModel[36].addShapeBox(29.25F, -0.4F, 0.75F, 9, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.125F, -0.5F, -0.375F, -0.125F, -0.5F, -0.375F, -0.125F, 0.25F, 0.125F, -0.125F, 0.25F); // Box 636
		barrelModel[36].setRotationPoint(19F, -23F, 0F);

		barrelModel[37].addShapeBox(29.25F, 0.35F, 0.75F, 9, 1, 1, 0F,0.125F, -0.125F, -0.5F, -0.375F, -0.125F, -0.5F, -0.375F, -0.125F, 0.25F, 0.125F, -0.125F, 0.25F, 0.3F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, 0F, 0.3F, 0F, 0F); // Box 637
		barrelModel[37].setRotationPoint(19F, -23F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 129
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 130
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 131
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 132
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 133
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 134
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 135
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 136
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 137
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 138
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 139
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 140
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 141
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 142
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 143
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 144
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 145
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 146
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 147
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 148
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 149
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 460, 30, textureX, textureY); // Shape 156
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 430, 28, textureX, textureY); // Shape 157
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 460, 30, textureX, textureY); // Shape 158
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 460, 30, textureX, textureY); // Shape 168
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 460, 30, textureX, textureY); // Shape 169
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 430, 3, textureX, textureY); // Shape 170
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 430, 19, textureX, textureY); // Shape 182
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 430, 19, textureX, textureY); // Shape 183
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 430, 19, textureX, textureY); // Shape 184
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 430, 19, textureX, textureY); // Shape 185

		leftTrackWheelModels[0].addShape3D(5F, -5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 129
		leftTrackWheelModels[0].setRotationPoint(29F, 3.5F, 19.5F);

		leftTrackWheelModels[1].addShape3D(5F, -5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 130
		leftTrackWheelModels[1].setRotationPoint(29F, 3.5F, 19.5F);

		leftTrackWheelModels[2].addShape3D(4F, -4F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 131
		leftTrackWheelModels[2].setRotationPoint(29F, 3.5F, 19.5F);

		leftTrackWheelModels[3].addShape3D(5F, -5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 132
		leftTrackWheelModels[3].setRotationPoint(16F, 3.5F, 19.5F);

		leftTrackWheelModels[4].addShape3D(5F, -5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 133
		leftTrackWheelModels[4].setRotationPoint(16F, 3.5F, 19.5F);

		leftTrackWheelModels[5].addShape3D(4F, -4F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 134
		leftTrackWheelModels[5].setRotationPoint(16F, 3.5F, 19.5F);

		leftTrackWheelModels[6].addShape3D(5F, -5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 135
		leftTrackWheelModels[6].setRotationPoint(3F, 3.5F, 19.5F);

		leftTrackWheelModels[7].addShape3D(4F, -4F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 136
		leftTrackWheelModels[7].setRotationPoint(3F, 3.5F, 19.5F);

		leftTrackWheelModels[8].addShape3D(5F, -5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 137
		leftTrackWheelModels[8].setRotationPoint(3F, 3.5F, 19.5F);

		leftTrackWheelModels[9].addShape3D(5F, -5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 138
		leftTrackWheelModels[9].setRotationPoint(-9.5F, 3.5F, 19.5F);

		leftTrackWheelModels[10].addShape3D(4F, -4F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 139
		leftTrackWheelModels[10].setRotationPoint(-9.5F, 3.5F, 19.5F);

		leftTrackWheelModels[11].addShape3D(5F, -5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 140
		leftTrackWheelModels[11].setRotationPoint(-9.5F, 3.5F, 19.5F);

		leftTrackWheelModels[12].addShape3D(5F, -5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 141
		leftTrackWheelModels[12].setRotationPoint(-22.5F, 3.5F, 19.5F);

		leftTrackWheelModels[13].addShape3D(4F, -4F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 142
		leftTrackWheelModels[13].setRotationPoint(-22.5F, 3.5F, 19.5F);

		leftTrackWheelModels[14].addShape3D(5F, -5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 143
		leftTrackWheelModels[14].setRotationPoint(-22.5F, 3.5F, 19.5F);

		leftTrackWheelModels[15].addShape3D(5F, -5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 144
		leftTrackWheelModels[15].setRotationPoint(-35F, 3.5F, 19.5F);

		leftTrackWheelModels[16].addShape3D(4F, -4F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 145
		leftTrackWheelModels[16].setRotationPoint(-35F, 3.5F, 19.5F);

		leftTrackWheelModels[17].addShape3D(5F, -5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 146
		leftTrackWheelModels[17].setRotationPoint(-35F, 3.5F, 19.5F);

		leftTrackWheelModels[18].addShape3D(5F, -5F, -7F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 147
		leftTrackWheelModels[18].setRotationPoint(-47.5F, 3.5F, 19.5F);

		leftTrackWheelModels[19].addShape3D(4F, -4F, -4F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 148
		leftTrackWheelModels[19].setRotationPoint(-47.5F, 3.5F, 19.5F);

		leftTrackWheelModels[20].addShape3D(5F, -5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 149
		leftTrackWheelModels[20].setRotationPoint(-47.5F, 3.5F, 19.5F);

		leftTrackWheelModels[21].addShape3D(5F, -5F, -6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 156
		leftTrackWheelModels[21].setRotationPoint(41F, -4F, 19.5F);

		leftTrackWheelModels[22].addShape3D(4F, -4F, -6F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 5, 8, 8, 28, 5, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 157
		leftTrackWheelModels[22].setRotationPoint(41F, -4F, 19.5F);

		leftTrackWheelModels[23].addShape3D(5F, -5F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 158
		leftTrackWheelModels[23].setRotationPoint(41F, -4F, 19.5F);

		leftTrackWheelModels[24].addShape3D(5F, -5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 168
		leftTrackWheelModels[24].setRotationPoint(-60F, -4F, 19.5F);

		leftTrackWheelModels[25].addShape3D(5F, -5F, -7.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 169
		leftTrackWheelModels[25].setRotationPoint(-60F, -4F, 19.5F);

		leftTrackWheelModels[26].addShape3D(4F, -4F, -7F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 170
		leftTrackWheelModels[26].setRotationPoint(-60F, -4F, 19.5F);

		leftTrackWheelModels[27].addShape3D(2F, -2F, -3F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 3, 4, 4, 16, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 182
		leftTrackWheelModels[27].setRotationPoint(-41.25F, -7F, 21.25F);

		leftTrackWheelModels[28].addShape3D(2F, -2F, -3F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 3, 4, 4, 16, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 183
		leftTrackWheelModels[28].setRotationPoint(-16.25F, -7F, 21.25F);

		leftTrackWheelModels[29].addShape3D(2F, -2F, -3F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 3, 4, 4, 16, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 184
		leftTrackWheelModels[29].setRotationPoint(9.5F, -7F, 21.25F);

		leftTrackWheelModels[30].addShape3D(2F, -2F, -3F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 3, 4, 4, 16, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 185
		leftTrackWheelModels[30].setRotationPoint(22.5F, -7F, 21.25F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 108
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 109
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 110
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 111
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 112
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 113
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 114
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 115
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 116
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 117
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 118
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 119
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 120
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 121
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 122
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 123
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 124
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 125
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 126
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 460, 20, textureX, textureY); // Shape 127
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 460, 5, textureX, textureY); // Shape 128
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 460, 30, textureX, textureY); // Shape 151
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 430, 28, textureX, textureY); // Shape 152
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 460, 30, textureX, textureY); // Shape 153
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 460, 30, textureX, textureY); // Shape 162
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 430, 3, textureX, textureY); // Shape 163
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 460, 30, textureX, textureY); // Shape 164
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 430, 19, textureX, textureY); // Shape 174
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 430, 19, textureX, textureY); // Shape 177
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 430, 19, textureX, textureY); // Shape 179
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 430, 19, textureX, textureY); // Shape 181

		rightTrackWheelModels[0].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 108
		rightTrackWheelModels[0].setRotationPoint(29F, 3.5F, -19.5F);

		rightTrackWheelModels[1].addShape3D(5F, -5F, 4F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 109
		rightTrackWheelModels[1].setRotationPoint(29F, 3.5F, -19.5F);

		rightTrackWheelModels[2].addShape3D(4F, -4F, 3F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 110
		rightTrackWheelModels[2].setRotationPoint(29F, 3.5F, -19.5F);

		rightTrackWheelModels[3].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 111
		rightTrackWheelModels[3].setRotationPoint(16F, 3.5F, -19.5F);

		rightTrackWheelModels[4].addShape3D(5F, -5F, 4F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 112
		rightTrackWheelModels[4].setRotationPoint(16F, 3.5F, -19.5F);

		rightTrackWheelModels[5].addShape3D(4F, -4F, 3F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 113
		rightTrackWheelModels[5].setRotationPoint(16F, 3.5F, -19.5F);

		rightTrackWheelModels[6].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 114
		rightTrackWheelModels[6].setRotationPoint(3F, 3.5F, -19.5F);

		rightTrackWheelModels[7].addShape3D(4F, -4F, 3F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 115
		rightTrackWheelModels[7].setRotationPoint(3F, 3.5F, -19.5F);

		rightTrackWheelModels[8].addShape3D(5F, -5F, 4F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 116
		rightTrackWheelModels[8].setRotationPoint(3F, 3.5F, -19.5F);

		rightTrackWheelModels[9].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 117
		rightTrackWheelModels[9].setRotationPoint(-9.5F, 3.5F, -19.5F);

		rightTrackWheelModels[10].addShape3D(4F, -4F, 3F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 118
		rightTrackWheelModels[10].setRotationPoint(-9.5F, 3.5F, -19.5F);

		rightTrackWheelModels[11].addShape3D(5F, -5F, 4F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 119
		rightTrackWheelModels[11].setRotationPoint(-9.5F, 3.5F, -19.5F);

		rightTrackWheelModels[12].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 120
		rightTrackWheelModels[12].setRotationPoint(-22.5F, 3.5F, -19.5F);

		rightTrackWheelModels[13].addShape3D(4F, -4F, 3F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 121
		rightTrackWheelModels[13].setRotationPoint(-22.5F, 3.5F, -19.5F);

		rightTrackWheelModels[14].addShape3D(5F, -5F, 4F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 122
		rightTrackWheelModels[14].setRotationPoint(-22.5F, 3.5F, -19.5F);

		rightTrackWheelModels[15].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 123
		rightTrackWheelModels[15].setRotationPoint(-35F, 3.5F, -19.5F);

		rightTrackWheelModels[16].addShape3D(4F, -4F, 3F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 124
		rightTrackWheelModels[16].setRotationPoint(-35F, 3.5F, -19.5F);

		rightTrackWheelModels[17].addShape3D(5F, -5F, 4F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 125
		rightTrackWheelModels[17].setRotationPoint(-35F, 3.5F, -19.5F);

		rightTrackWheelModels[18].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 126
		rightTrackWheelModels[18].setRotationPoint(-47.5F, 3.5F, -19.5F);

		rightTrackWheelModels[19].addShape3D(4F, -4F, 3F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 1, 8, 8, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 127
		rightTrackWheelModels[19].setRotationPoint(-47.5F, 3.5F, -19.5F);

		rightTrackWheelModels[20].addShape3D(5F, -5F, 4F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 128
		rightTrackWheelModels[20].setRotationPoint(-47.5F, 3.5F, -19.5F);

		rightTrackWheelModels[21].addShape3D(5F, -5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 151
		rightTrackWheelModels[21].setRotationPoint(41F, -4F, -19.5F);

		rightTrackWheelModels[22].addShape3D(4F, -4F, 1F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 5, 8, 8, 28, 5, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 152
		rightTrackWheelModels[22].setRotationPoint(41F, -4F, -19.5F);

		rightTrackWheelModels[23].addShape3D(5F, -5F, 5.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 153
		rightTrackWheelModels[23].setRotationPoint(41F, -4F, -19.5F);

		rightTrackWheelModels[24].addShape3D(5F, -4.5F, 6.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 162
		rightTrackWheelModels[24].setRotationPoint(-60F, -3.5F, -19.5F);

		rightTrackWheelModels[25].addShape3D(4F, -3.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 163
		rightTrackWheelModels[25].setRotationPoint(-60F, -3.5F, -19.5F);

		rightTrackWheelModels[26].addShape3D(5F, -4.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 1, 10, 10, 36, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 164
		rightTrackWheelModels[26].setRotationPoint(-60F, -3.5F, -19.5F);

		rightTrackWheelModels[27].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 3, 4, 4, 16, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 174
		rightTrackWheelModels[27].setRotationPoint(22.5F, -7F, -21.25F);

		rightTrackWheelModels[28].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 3, 4, 4, 16, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 177
		rightTrackWheelModels[28].setRotationPoint(9.5F, -7F, -21.25F);

		rightTrackWheelModels[29].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 3, 4, 4, 16, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 179
		rightTrackWheelModels[29].setRotationPoint(-41.25F, -7F, -21.25F);

		rightTrackWheelModels[30].addShape3D(2F, -2F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 3, 4, 4, 16, 3, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 181
		rightTrackWheelModels[30].setRotationPoint(-16.25F, -7F, -21.25F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 275, 45, textureX, textureY); // Box 203
		leftTrackModel[1] = new ModelRendererTurbo(this, 307, 60, textureX, textureY); // Box 204
		leftTrackModel[2] = new ModelRendererTurbo(this, 438, 60, textureX, textureY); // Box 205
		leftTrackModel[3] = new ModelRendererTurbo(this, 340, 60, textureX, textureY); // Box 206
		leftTrackModel[4] = new ModelRendererTurbo(this, 405, 60, textureX, textureY); // Box 207
		leftTrackModel[5] = new ModelRendererTurbo(this, 372, 60, textureX, textureY); // Box 208
		leftTrackModel[6] = new ModelRendererTurbo(this, 275, 60, textureX, textureY); // Box 209
		leftTrackModel[7] = new ModelRendererTurbo(this, 275, 90, textureX, textureY); // Box 210
		leftTrackModel[8] = new ModelRendererTurbo(this, 275, 75, textureX, textureY); // Box 211
		leftTrackModel[9] = new ModelRendererTurbo(this, 324, 75, textureX, textureY); // Box 212

		leftTrackModel[0].addShapeBox(0F, 0F, -10F, 107, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 203
		leftTrackModel[0].setRotationPoint(-63F, -10.5F, 28F);

		leftTrackModel[1].addShapeBox(0F, 0F, -10F, 5, 2, 10, 0F,-0.5F, 0F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, -0.5F, 0F, 0F, -2.5F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2.5F, -1F, 0F); // Box 204
		leftTrackModel[1].setRotationPoint(-67F, -5.5F, 28F);

		leftTrackModel[2].addShapeBox(0F, 0F, -10F, 5, 2, 10, 0F,-2.5F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2.5F, -1F, 0F, -0.5F, 0F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, -0.5F, 0F, 0F); // Box 205
		leftTrackModel[2].setRotationPoint(-67F, -4.5F, 28F);

		leftTrackModel[3].addShapeBox(0F, 0F, -10F, 5, 2, 10, 0F,-2.5F, -3F, 0F, -2.5F, -4F, 0F, -2.5F, -4F, 0F, -2.5F, -3F, 0F, -0.5F, 0F, 0F, -4.5F, 3F, 0F, -4.5F, 3F, 0F, -0.5F, 0F, 0F); // Box 206
		leftTrackModel[3].setRotationPoint(-67F, -7.5F, 28F);

		leftTrackModel[4].addShapeBox(0F, 0F, -10F, 5, 2, 10, 0F,0F, -5F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, -5F, 0F, -1F, 5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 5F, 0F); // Box 207
		leftTrackModel[4].setRotationPoint(43F, -4.5F, 28F);

		leftTrackModel[5].addShapeBox(0F, 0F, -10F, 5, 2, 10, 0F,-2.5F, -4F, 0F, -2.5F, -3F, 0F, -2.5F, -3F, 0F, -2.5F, -4F, 0F, -4.5F, 3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 3F, 0F); // Box 208
		leftTrackModel[5].setRotationPoint(43F, -7.5F, 28F);

		leftTrackModel[6].addShapeBox(0F, 0F, -10F, 5, 2, 10, 0F,-1F, 5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 5F, 0F, 0F, -5F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, -5F, 0F); // Box 209
		leftTrackModel[6].setRotationPoint(43F, -5.5F, 28F);

		leftTrackModel[7].addShapeBox(0F, 0F, -10F, 82, 2, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		leftTrackModel[7].setRotationPoint(-50F, 8F, 28F);

		leftTrackModel[8].addShapeBox(0F, 0F, -10F, 13, 2, 10, 0F,-1F, 0F, 0F, 1F, -7.5F, 0F, 1F, -7.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F); // Box 211
		leftTrackModel[8].setRotationPoint(-63F, 0.5F, 28F);

		leftTrackModel[9].addShapeBox(0F, 0F, -10F, 12, 2, 10, 0F,1F, -7.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -7.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F); // Box 212
		leftTrackModel[9].setRotationPoint(32F, 0.5F, 28F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 275, 45, textureX, textureY); // Box 190
		rightTrackModel[1] = new ModelRendererTurbo(this, 307, 60, textureX, textureY); // Box 191
		rightTrackModel[2] = new ModelRendererTurbo(this, 438, 60, textureX, textureY); // Box 192
		rightTrackModel[3] = new ModelRendererTurbo(this, 340, 60, textureX, textureY); // Box 193
		rightTrackModel[4] = new ModelRendererTurbo(this, 405, 60, textureX, textureY); // Box 194
		rightTrackModel[5] = new ModelRendererTurbo(this, 372, 60, textureX, textureY); // Box 195
		rightTrackModel[6] = new ModelRendererTurbo(this, 275, 60, textureX, textureY); // Box 196
		rightTrackModel[7] = new ModelRendererTurbo(this, 275, 90, textureX, textureY); // Box 197
		rightTrackModel[8] = new ModelRendererTurbo(this, 275, 75, textureX, textureY); // Box 198
		rightTrackModel[9] = new ModelRendererTurbo(this, 324, 75, textureX, textureY); // Box 202

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 107, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 190
		rightTrackModel[0].setRotationPoint(-63F, -10.5F, -28F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,-0.5F, 0F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, -0.5F, 0F, 0F, -2.5F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2.5F, -1F, 0F); // Box 191
		rightTrackModel[1].setRotationPoint(-67F, -5.5F, -28F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,-2.5F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2.5F, -1F, 0F, -0.5F, 0F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, -0.5F, 0F, 0F); // Box 192
		rightTrackModel[2].setRotationPoint(-67F, -4.5F, -28F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,-2.5F, -3F, 0F, -2.5F, -4F, 0F, -2.5F, -4F, 0F, -2.5F, -3F, 0F, -0.5F, 0F, 0F, -4.5F, 3F, 0F, -4.5F, 3F, 0F, -0.5F, 0F, 0F); // Box 193
		rightTrackModel[3].setRotationPoint(-67F, -7.5F, -28F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,0F, -5F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, -5F, 0F, -1F, 5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 5F, 0F); // Box 194
		rightTrackModel[4].setRotationPoint(43F, -4.5F, -28F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,-2.5F, -4F, 0F, -2.5F, -3F, 0F, -2.5F, -3F, 0F, -2.5F, -4F, 0F, -4.5F, 3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 3F, 0F); // Box 195
		rightTrackModel[5].setRotationPoint(43F, -7.5F, -28F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,-1F, 5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 5F, 0F, 0F, -5F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, -5F, 0F); // Box 196
		rightTrackModel[6].setRotationPoint(43F, -5.5F, -28F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 82, 2, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		rightTrackModel[7].setRotationPoint(-50F, 8F, -28F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 13, 2, 10, 0F,-1F, 0F, 0F, 1F, -7.5F, 0F, 1F, -7.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F); // Box 198
		rightTrackModel[8].setRotationPoint(-63F, 0.5F, -28F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 10, 0F,1F, -7.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -7.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F); // Box 202
		rightTrackModel[9].setRotationPoint(32F, 0.5F, -28F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[6];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 425, 460, textureX, textureY); // Box 15
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 436, 460, textureX, textureY); // Box 16
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 457, 464, textureX, textureY); // Box 17
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 472, 468, textureX, textureY); // Box 18
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 441, 485, textureX, textureY); // Box 19
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 452, 482, textureX, textureY); // Box 20

		gun_1_Model[0][0].addShapeBox(-1F, 2F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_1_Model[0][1].addShapeBox(-1F, -1F, 1F, 2, 3, 1, 0F,2.5F, -0.5F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 2.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 16

		gun_1_Model[0][2].addShapeBox(-3.3F, -1.1F, 1F, 4, 1, 1, 0F,0F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0F, 0F, 0F, 0.4F, -0.4F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, 0.4F, -0.4F, 0F); // Box 17

		gun_1_Model[0][3].addShapeBox(0F, -0.1F, 1F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F); // Box 18

		gun_1_Model[0][4].addShapeBox(0F, -0.1F, -1.5F, 1, 1, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 19

		gun_1_Model[0][5].addShapeBox(-1F, 1.5F, -1F, 2, 3, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 20

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(-4F, -36.5F, -5F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[15];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 452, 476, textureX, textureY); // Import Box4
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 453, 460, textureX, textureY); // Import Box5
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 469, 460, textureX, textureY); // Import Box6
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 421, 468, textureX, textureY); // Import Box7
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 429, 468, textureX, textureY); // Import Box8
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 437, 468, textureX, textureY); // Import Box9
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 445, 468, textureX, textureY); // Import Box10
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 453, 468, textureX, textureY); // Import Box12
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 461, 468, textureX, textureY); // Import Box13
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 477, 468, textureX, textureY); // Import Box15
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 421, 476, textureX, textureY); // Import Box16
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 429, 476, textureX, textureY); // Import Box17
		gun_1_Model[2][12] = new ModelRendererTurbo(this, 452, 476, textureX, textureY); // Import Box0
		gun_1_Model[2][13] = new ModelRendererTurbo(this, 437, 476, textureX, textureY); // Import Box18
		gun_1_Model[2][14] = new ModelRendererTurbo(this, 445, 460, textureX, textureY); // Import Box19

		gun_1_Model[2][0].addShapeBox(1F, -1F, -0.5F, 12, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Import Box4

		gun_1_Model[2][1].addShapeBox(-2F, -1F, -0.5F, 3, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box5

		gun_1_Model[2][2].addShapeBox(-7F, -1F, -0.5F, 5, 1, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.2F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.2F); // Import Box6

		gun_1_Model[2][3].addShapeBox(14F, -1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F); // Import Box7

		gun_1_Model[2][4].addShapeBox(13F, -1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F); // Import Box8

		gun_1_Model[2][5].addShapeBox(0F, -1.2F, -2F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box9

		gun_1_Model[2][6].addShapeBox(0F, -1.2F, -1.5F, 1, 2, 1, 0F,-0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Import Box10

		gun_1_Model[2][7].addShapeBox(12F, -2F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box12

		gun_1_Model[2][8].addShapeBox(2F, -1.7F, -1F, 2, 1, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Import Box13

		gun_1_Model[2][9].addShapeBox(-4.9F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15

		gun_1_Model[2][10].addShapeBox(-9F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1F, 0F); // Import Box16

		gun_1_Model[2][11].addShapeBox(-6F, 0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, -0.2F); // Import Box17

		gun_1_Model[2][12].addShapeBox(1F, -1F, -0.5F, 12, 1, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F); // Import Box0

		gun_1_Model[2][13].addShapeBox(-1.5F, -1F, 2.1F, 2, 4, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Import Box18

		gun_1_Model[2][14].addShapeBox(-1.5F, -1.5F, 1F, 2, 1, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(-4F, -36.5F, -5F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);
	}
}