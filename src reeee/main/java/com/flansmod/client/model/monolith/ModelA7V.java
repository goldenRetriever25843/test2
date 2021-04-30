//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: A7V
// Model Creator: 
// Created on: 04.03.2016 - 15:22:30
// Last changed on: 04.03.2016 - 15:22:30

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelA7V extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelA7V() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1119];
		bodyDoorOpenModel = new ModelRendererTurbo[6];
		bodyDoorCloseModel = new ModelRendererTurbo[6];
		leftTrackWheelModels = new ModelRendererTurbo[134];
		rightTrackWheelModels = new ModelRendererTurbo[134];
		leftTrackModel = new ModelRendererTurbo[56];
		rightTrackModel = new ModelRendererTurbo[56];
		steeringWheelModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		initbodyModel_2();
		initbodyModel_3();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();
		initsteeringWheelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 43
		bodyModel[27] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 44
		bodyModel[28] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 47
		bodyModel[29] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 48
		bodyModel[30] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 49
		bodyModel[31] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 51
		bodyModel[32] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 52
		bodyModel[33] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 55
		bodyModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 56
		bodyModel[36] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 57
		bodyModel[37] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 58
		bodyModel[38] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 59
		bodyModel[39] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 60
		bodyModel[40] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 61
		bodyModel[41] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 63
		bodyModel[42] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 276
		bodyModel[43] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 276
		bodyModel[44] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 276
		bodyModel[45] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 276
		bodyModel[46] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 68
		bodyModel[47] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 69
		bodyModel[48] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 70
		bodyModel[49] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 276
		bodyModel[50] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 72
		bodyModel[51] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 73
		bodyModel[52] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 74
		bodyModel[53] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 75
		bodyModel[54] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 76
		bodyModel[55] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 77
		bodyModel[56] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 78
		bodyModel[57] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 79
		bodyModel[58] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 80
		bodyModel[59] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 93
		bodyModel[60] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 95
		bodyModel[61] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 97
		bodyModel[62] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 118
		bodyModel[63] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 119
		bodyModel[64] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 122
		bodyModel[65] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 127
		bodyModel[66] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 346
		bodyModel[67] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 346
		bodyModel[68] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 107
		bodyModel[69] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 108
		bodyModel[70] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 109
		bodyModel[71] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 110
		bodyModel[72] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 111
		bodyModel[73] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 112
		bodyModel[74] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 113
		bodyModel[75] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 114
		bodyModel[76] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 116
		bodyModel[77] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 117
		bodyModel[78] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 118
		bodyModel[79] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 119
		bodyModel[80] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 120
		bodyModel[81] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 121
		bodyModel[82] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 122
		bodyModel[83] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 126
		bodyModel[84] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 129
		bodyModel[85] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 130
		bodyModel[86] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 131
		bodyModel[87] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 132
		bodyModel[88] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 135
		bodyModel[89] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 136
		bodyModel[90] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 137
		bodyModel[91] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 138
		bodyModel[92] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 139
		bodyModel[93] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 140
		bodyModel[94] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 151
		bodyModel[95] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 152
		bodyModel[96] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 153
		bodyModel[97] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 154
		bodyModel[98] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 155
		bodyModel[99] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 156
		bodyModel[100] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 157
		bodyModel[101] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 158
		bodyModel[102] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 159
		bodyModel[103] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 160
		bodyModel[104] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 161
		bodyModel[105] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 256
		bodyModel[106] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 257
		bodyModel[107] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 269
		bodyModel[108] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 270
		bodyModel[109] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 271
		bodyModel[110] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 272
		bodyModel[111] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 276
		bodyModel[112] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 276
		bodyModel[113] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 276
		bodyModel[114] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 276
		bodyModel[115] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 277
		bodyModel[116] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 278
		bodyModel[117] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 279
		bodyModel[118] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 280
		bodyModel[119] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 281
		bodyModel[120] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 282
		bodyModel[121] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 283
		bodyModel[122] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 284
		bodyModel[123] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 285
		bodyModel[124] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 286
		bodyModel[125] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 287
		bodyModel[126] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 288
		bodyModel[127] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 289
		bodyModel[128] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 290
		bodyModel[129] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 291
		bodyModel[130] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 276
		bodyModel[131] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 295
		bodyModel[132] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 296
		bodyModel[133] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 346
		bodyModel[134] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 311
		bodyModel[135] = new ModelRendererTurbo(this, 9, 145, textureX, textureY); // Box 312
		bodyModel[136] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 313
		bodyModel[137] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 314
		bodyModel[138] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 315
		bodyModel[139] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 316
		bodyModel[140] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 317
		bodyModel[141] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 318
		bodyModel[142] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 319
		bodyModel[143] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 320
		bodyModel[144] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 321
		bodyModel[145] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 322
		bodyModel[146] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 323
		bodyModel[147] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 324
		bodyModel[148] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 325
		bodyModel[149] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 326
		bodyModel[150] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 327
		bodyModel[151] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 328
		bodyModel[152] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 329
		bodyModel[153] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 330
		bodyModel[154] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 331
		bodyModel[155] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 332
		bodyModel[156] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 333
		bodyModel[157] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 334
		bodyModel[158] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 335
		bodyModel[159] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 336
		bodyModel[160] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 337
		bodyModel[161] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 338
		bodyModel[162] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 339
		bodyModel[163] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 340
		bodyModel[164] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 341
		bodyModel[165] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 342
		bodyModel[166] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 343
		bodyModel[167] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 344
		bodyModel[168] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 346
		bodyModel[169] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 346
		bodyModel[170] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 347
		bodyModel[171] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 348
		bodyModel[172] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 349
		bodyModel[173] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 350
		bodyModel[174] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 357
		bodyModel[175] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 350
		bodyModel[176] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 359
		bodyModel[177] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 360
		bodyModel[178] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 350
		bodyModel[179] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 362
		bodyModel[180] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 363
		bodyModel[181] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 364
		bodyModel[182] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 365
		bodyModel[183] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 366
		bodyModel[184] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 367
		bodyModel[185] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 368
		bodyModel[186] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 369
		bodyModel[187] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 350
		bodyModel[188] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 350
		bodyModel[189] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 350
		bodyModel[190] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 373
		bodyModel[191] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 374
		bodyModel[192] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 375
		bodyModel[193] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 350
		bodyModel[194] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 350
		bodyModel[195] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 350
		bodyModel[196] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 350
		bodyModel[197] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 380
		bodyModel[198] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 381
		bodyModel[199] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 382
		bodyModel[200] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 383
		bodyModel[201] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 384
		bodyModel[202] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 385
		bodyModel[203] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 386
		bodyModel[204] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 387
		bodyModel[205] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 373
		bodyModel[206] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 350
		bodyModel[207] = new ModelRendererTurbo(this, 41, 233, textureX, textureY); // Box 390
		bodyModel[208] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 391
		bodyModel[209] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 392
		bodyModel[210] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 350
		bodyModel[211] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 394
		bodyModel[212] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Box 395
		bodyModel[213] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 396
		bodyModel[214] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 397
		bodyModel[215] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 398
		bodyModel[216] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 399
		bodyModel[217] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 400
		bodyModel[218] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 401
		bodyModel[219] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 402
		bodyModel[220] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 403
		bodyModel[221] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 404
		bodyModel[222] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 405
		bodyModel[223] = new ModelRendererTurbo(this, 129, 249, textureX, textureY); // Box 406
		bodyModel[224] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 407
		bodyModel[225] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Box 408
		bodyModel[226] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 409
		bodyModel[227] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 410
		bodyModel[228] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 411
		bodyModel[229] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 412
		bodyModel[230] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 413
		bodyModel[231] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 414
		bodyModel[232] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 415
		bodyModel[233] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 416
		bodyModel[234] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 417
		bodyModel[235] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 418
		bodyModel[236] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 419
		bodyModel[237] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 420
		bodyModel[238] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 421
		bodyModel[239] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 422
		bodyModel[240] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 350
		bodyModel[241] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 350
		bodyModel[242] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 350
		bodyModel[243] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 427
		bodyModel[244] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 257
		bodyModel[245] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 429
		bodyModel[246] = new ModelRendererTurbo(this, 217, 249, textureX, textureY); // Box 430
		bodyModel[247] = new ModelRendererTurbo(this, 17, 249, textureX, textureY); // Box 431
		bodyModel[248] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 432
		bodyModel[249] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 433
		bodyModel[250] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 434
		bodyModel[251] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 435
		bodyModel[252] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 436
		bodyModel[253] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Box 437
		bodyModel[254] = new ModelRendererTurbo(this, 209, 249, textureX, textureY); // Box 441
		bodyModel[255] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 443
		bodyModel[256] = new ModelRendererTurbo(this, 113, 265, textureX, textureY); // Box 444
		bodyModel[257] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 445
		bodyModel[258] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 446
		bodyModel[259] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 447
		bodyModel[260] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 448
		bodyModel[261] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 449
		bodyModel[262] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 450
		bodyModel[263] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 451
		bodyModel[264] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 452
		bodyModel[265] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Box 453
		bodyModel[266] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 454
		bodyModel[267] = new ModelRendererTurbo(this, 377, 297, textureX, textureY); // Box 455
		bodyModel[268] = new ModelRendererTurbo(this, 249, 329, textureX, textureY); // Box 456
		bodyModel[269] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 457
		bodyModel[270] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Box 458
		bodyModel[271] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 459
		bodyModel[272] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 460
		bodyModel[273] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 461
		bodyModel[274] = new ModelRendererTurbo(this, 321, 345, textureX, textureY); // Box 462
		bodyModel[275] = new ModelRendererTurbo(this, 433, 337, textureX, textureY); // Box 276
		bodyModel[276] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 464
		bodyModel[277] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 465
		bodyModel[278] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 466
		bodyModel[279] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 467
		bodyModel[280] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 468
		bodyModel[281] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Box 469
		bodyModel[282] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 470
		bodyModel[283] = new ModelRendererTurbo(this, 425, 249, textureX, textureY); // Box 471
		bodyModel[284] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 472
		bodyModel[285] = new ModelRendererTurbo(this, 9, 257, textureX, textureY); // Box 473
		bodyModel[286] = new ModelRendererTurbo(this, 89, 361, textureX, textureY); // Box 474
		bodyModel[287] = new ModelRendererTurbo(this, 153, 361, textureX, textureY); // Box 475
		bodyModel[288] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 476
		bodyModel[289] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 477
		bodyModel[290] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 478
		bodyModel[291] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 479
		bodyModel[292] = new ModelRendererTurbo(this, 185, 361, textureX, textureY); // Box 480
		bodyModel[293] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Box 481
		bodyModel[294] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 482
		bodyModel[295] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 483
		bodyModel[296] = new ModelRendererTurbo(this, 281, 369, textureX, textureY); // Box 484
		bodyModel[297] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 485
		bodyModel[298] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 486
		bodyModel[299] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 487
		bodyModel[300] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 488
		bodyModel[301] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Box 489
		bodyModel[302] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Box 490
		bodyModel[303] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Box 491
		bodyModel[304] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 492
		bodyModel[305] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 493
		bodyModel[306] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 494
		bodyModel[307] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 495
		bodyModel[308] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 496
		bodyModel[309] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 497
		bodyModel[310] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 498
		bodyModel[311] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 499
		bodyModel[312] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 500
		bodyModel[313] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 501
		bodyModel[314] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 502
		bodyModel[315] = new ModelRendererTurbo(this, 137, 297, textureX, textureY); // Box 503
		bodyModel[316] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Box 504
		bodyModel[317] = new ModelRendererTurbo(this, 297, 297, textureX, textureY); // Box 505
		bodyModel[318] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 506
		bodyModel[319] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 507
		bodyModel[320] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 508
		bodyModel[321] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 509
		bodyModel[322] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 510
		bodyModel[323] = new ModelRendererTurbo(this, 433, 377, textureX, textureY); // Box 521
		bodyModel[324] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 522
		bodyModel[325] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 523
		bodyModel[326] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 524
		bodyModel[327] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 525
		bodyModel[328] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 526
		bodyModel[329] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 528
		bodyModel[330] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Box 529
		bodyModel[331] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 530
		bodyModel[332] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Box 531
		bodyModel[333] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Box 532
		bodyModel[334] = new ModelRendererTurbo(this, 137, 265, textureX, textureY); // Box 533
		bodyModel[335] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Box 534
		bodyModel[336] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 535
		bodyModel[337] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 536
		bodyModel[338] = new ModelRendererTurbo(this, 377, 297, textureX, textureY); // Box 537
		bodyModel[339] = new ModelRendererTurbo(this, 473, 297, textureX, textureY); // Box 538
		bodyModel[340] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 539
		bodyModel[341] = new ModelRendererTurbo(this, 249, 305, textureX, textureY); // Box 540
		bodyModel[342] = new ModelRendererTurbo(this, 393, 297, textureX, textureY); // Box 541
		bodyModel[343] = new ModelRendererTurbo(this, 289, 313, textureX, textureY); // Box 542
		bodyModel[344] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Box 543
		bodyModel[345] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 544
		bodyModel[346] = new ModelRendererTurbo(this, 321, 273, textureX, textureY); // Box 547
		bodyModel[347] = new ModelRendererTurbo(this, 241, 281, textureX, textureY); // Box 548
		bodyModel[348] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Box 550
		bodyModel[349] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 551
		bodyModel[350] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 552
		bodyModel[351] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 553
		bodyModel[352] = new ModelRendererTurbo(this, 225, 329, textureX, textureY); // Box 554
		bodyModel[353] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 555
		bodyModel[354] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 556
		bodyModel[355] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 557
		bodyModel[356] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 558
		bodyModel[357] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 559
		bodyModel[358] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 560
		bodyModel[359] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 561
		bodyModel[360] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 562
		bodyModel[361] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 563
		bodyModel[362] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 564
		bodyModel[363] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 565
		bodyModel[364] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 566
		bodyModel[365] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 567
		bodyModel[366] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 568
		bodyModel[367] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 569
		bodyModel[368] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 570
		bodyModel[369] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 571
		bodyModel[370] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 572
		bodyModel[371] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 573
		bodyModel[372] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 574
		bodyModel[373] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 575
		bodyModel[374] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 576
		bodyModel[375] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 577
		bodyModel[376] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 578
		bodyModel[377] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 579
		bodyModel[378] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 580
		bodyModel[379] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 581
		bodyModel[380] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 582
		bodyModel[381] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 583
		bodyModel[382] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 584
		bodyModel[383] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 585
		bodyModel[384] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 586
		bodyModel[385] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 587
		bodyModel[386] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 588
		bodyModel[387] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 589
		bodyModel[388] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 590
		bodyModel[389] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 591
		bodyModel[390] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 592
		bodyModel[391] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 593
		bodyModel[392] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 594
		bodyModel[393] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 595
		bodyModel[394] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 596
		bodyModel[395] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 597
		bodyModel[396] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Box 598
		bodyModel[397] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Box 599
		bodyModel[398] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 600
		bodyModel[399] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 601
		bodyModel[400] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 602
		bodyModel[401] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 603
		bodyModel[402] = new ModelRendererTurbo(this, 817, 9, textureX, textureY); // Box 604
		bodyModel[403] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Box 605
		bodyModel[404] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 606
		bodyModel[405] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 607
		bodyModel[406] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 608
		bodyModel[407] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 609
		bodyModel[408] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 610
		bodyModel[409] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 611
		bodyModel[410] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 612
		bodyModel[411] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 613
		bodyModel[412] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Box 614
		bodyModel[413] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Box 615
		bodyModel[414] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Box 616
		bodyModel[415] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 617
		bodyModel[416] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Box 618
		bodyModel[417] = new ModelRendererTurbo(this, 777, 9, textureX, textureY); // Box 619
		bodyModel[418] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 813
		bodyModel[419] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 758
		bodyModel[420] = new ModelRendererTurbo(this, 641, 73, textureX, textureY); // Box 759
		bodyModel[421] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 760
		bodyModel[422] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 761
		bodyModel[423] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 762
		bodyModel[424] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 763
		bodyModel[425] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 764
		bodyModel[426] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 765
		bodyModel[427] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 766
		bodyModel[428] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 767
		bodyModel[429] = new ModelRendererTurbo(this, 937, 73, textureX, textureY); // Box 768
		bodyModel[430] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 769
		bodyModel[431] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 770
		bodyModel[432] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 771
		bodyModel[433] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 772
		bodyModel[434] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Box 773
		bodyModel[435] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Box 774
		bodyModel[436] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 775
		bodyModel[437] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Box 776
		bodyModel[438] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 777
		bodyModel[439] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Box 778
		bodyModel[440] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 779
		bodyModel[441] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 780
		bodyModel[442] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 781
		bodyModel[443] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 782
		bodyModel[444] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Box 783
		bodyModel[445] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 784
		bodyModel[446] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 785
		bodyModel[447] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 786
		bodyModel[448] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 787
		bodyModel[449] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 813
		bodyModel[450] = new ModelRendererTurbo(this, 785, 81, textureX, textureY); // Box 789
		bodyModel[451] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 790
		bodyModel[452] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 791
		bodyModel[453] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 792
		bodyModel[454] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 793
		bodyModel[455] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 794
		bodyModel[456] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 795
		bodyModel[457] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 796
		bodyModel[458] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 797
		bodyModel[459] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 798
		bodyModel[460] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 799
		bodyModel[461] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 800
		bodyModel[462] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 801
		bodyModel[463] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 802
		bodyModel[464] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 803
		bodyModel[465] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 804
		bodyModel[466] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 805
		bodyModel[467] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 806
		bodyModel[468] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 807
		bodyModel[469] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 808
		bodyModel[470] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 809
		bodyModel[471] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 810
		bodyModel[472] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 811
		bodyModel[473] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 812
		bodyModel[474] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Box 813
		bodyModel[475] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 814
		bodyModel[476] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 815
		bodyModel[477] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Box 816
		bodyModel[478] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 817
		bodyModel[479] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Box 818
		bodyModel[480] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 819
		bodyModel[481] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 820
		bodyModel[482] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 821
		bodyModel[483] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Box 822
		bodyModel[484] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Box 823
		bodyModel[485] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 824
		bodyModel[486] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 825
		bodyModel[487] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Box 826
		bodyModel[488] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 827
		bodyModel[489] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 828
		bodyModel[490] = new ModelRendererTurbo(this, 625, 97, textureX, textureY); // Box 829
		bodyModel[491] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 830
		bodyModel[492] = new ModelRendererTurbo(this, 809, 97, textureX, textureY); // Box 831
		bodyModel[493] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 0
		bodyModel[494] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 1
		bodyModel[495] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 47
		bodyModel[496] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 48
		bodyModel[497] = new ModelRendererTurbo(this, 513, 129, textureX, textureY); // Box 49
		bodyModel[498] = new ModelRendererTurbo(this, 537, 129, textureX, textureY); // Box 50
		bodyModel[499] = new ModelRendererTurbo(this, 561, 129, textureX, textureY); // Box 51

		bodyModel[0].addBox(-10F, -57F, -19F, 19, 1, 26, 0F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-8F, -58F, -16F, 15, 1, 10, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-7F, -58F, 6F, 1, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(5F, -58F, 6F, 1, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-6F, -58F, 6F, 11, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-6F, -58F, 14F, 11, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1F, -58F, 7F, 1, 1, 7, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 7
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-6F, -58F, 8F, 11, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-6F, -58F, 10F, 11, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-6F, -58F, 12F, 11, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1.5F, -58.5F, -3F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.5F, -58.5F, -3F, 2, 1, 6, 0F,-1.95F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.95F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 15
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-13F, -38F, -21F, 1, 1, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[12].setRotationPoint(0F, -8F, 0F);

		bodyModel[13].addShapeBox(11F, -38F, -21F, 1, 1, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[13].setRotationPoint(0F, -8F, 0F);

		bodyModel[14].addShapeBox(-12F, -38F, -21F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[14].setRotationPoint(0F, -8F, 0F);

		bodyModel[15].addShapeBox(-12F, -38F, 20F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[15].setRotationPoint(0F, -8F, 0F);

		bodyModel[16].addShapeBox(-1F, -11F, -20F, 1, 11, 6, 0F,0F, 0F, -1.1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[16].setRotationPoint(11F, -46F, 0F);
		bodyModel[16].rotateAngleZ = 0.19198622F;

		bodyModel[17].addShapeBox(-12F, -11F, -1F, 8, 11, 1, 0F,-2.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, -2F, 0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[17].setRotationPoint(0F, -46F, 21F);
		bodyModel[17].rotateAngleX = 0.17453293F;

		bodyModel[18].addShapeBox(-1F, -11F, -4F, 1, 11, 8, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[18].setRotationPoint(11F, -46F, 0F);
		bodyModel[18].rotateAngleZ = 0.19198622F;

		bodyModel[19].addShapeBox(-1F, -11F, 14F, 1, 11, 6, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.1F); // Box 32
		bodyModel[19].setRotationPoint(11F, -46F, 0F);
		bodyModel[19].rotateAngleZ = 0.19198622F;

		bodyModel[20].addShapeBox(-1F, -4F, 4F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(11F, -46F, 0F);
		bodyModel[20].rotateAngleZ = 0.19198622F;

		bodyModel[21].addShapeBox(-1F, -11F, 4F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[21].setRotationPoint(11F, -46F, 0F);
		bodyModel[21].rotateAngleZ = 0.19198622F;

		bodyModel[22].addShapeBox(-1F, -11F, -14F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[22].setRotationPoint(11F, -46F, 0F);
		bodyModel[22].rotateAngleZ = 0.19198622F;

		bodyModel[23].addShapeBox(-1F, -4F, -14F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[23].setRotationPoint(11F, -46F, 0F);
		bodyModel[23].rotateAngleZ = 0.19198622F;

		bodyModel[24].addShapeBox(0F, -10.8F, -13F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[24].setRotationPoint(11F, -46F, 0F);
		bodyModel[24].rotateAngleZ = 0.19198622F;

		bodyModel[25].addShapeBox(0F, -10.8F, -6F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[25].setRotationPoint(11F, -46F, 0F);
		bodyModel[25].rotateAngleZ = 0.19198622F;

		bodyModel[26].addShapeBox(0F, -10.8F, 5F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[26].setRotationPoint(11F, -46F, 0F);
		bodyModel[26].rotateAngleZ = 0.19198622F;

		bodyModel[27].addShapeBox(0F, -10.8F, 12F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[27].setRotationPoint(11F, -46F, 0F);
		bodyModel[27].rotateAngleZ = 0.19198622F;

		bodyModel[28].addBox(-10F, -57F, 14F, 19, 1, 5, 0F); // Box 47
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addBox(-10F, -57F, 7F, 4, 1, 7, 0F); // Box 48
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addBox(5F, -57F, 7F, 4, 1, 7, 0F); // Box 49
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3.5F, -10.8F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
		bodyModel[31].setRotationPoint(0F, -46F, 21F);
		bodyModel[31].rotateAngleX = 0.19198622F;

		bodyModel[32].addShapeBox(2.5F, -10.8F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[32].setRotationPoint(-1F, -46F, 21F);
		bodyModel[32].rotateAngleX = 0.19198622F;

		bodyModel[33].addShapeBox(3F, -11F, -1F, 8, 11, 1, 0F,-0.5F, 0F, 0F, -2.2F, 0F, 0F, -2F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 54
		bodyModel[33].setRotationPoint(0F, -46F, 21F);
		bodyModel[33].rotateAngleX = 0.17453293F;

		bodyModel[34].addShapeBox(-4.5F, -4F, -1F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[34].setRotationPoint(0F, -46F, 21F);
		bodyModel[34].rotateAngleX = 0.17453293F;

		bodyModel[35].addShapeBox(-4.5F, -11F, -1F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[35].setRotationPoint(0F, -46F, 21F);
		bodyModel[35].rotateAngleX = 0.17453293F;

		bodyModel[36].addShapeBox(3F, -11F, 0F, 8, 11, 1, 0F,-0.5F, 0.2F, 0F, -2F, 0.2F, 0F, -2.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 57
		bodyModel[36].setRotationPoint(0F, -46F, -21F);
		bodyModel[36].rotateAngleX = -0.17453293F;

		bodyModel[37].addShapeBox(-4.5F, -4F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[37].setRotationPoint(0F, -46F, -21F);
		bodyModel[37].rotateAngleX = -0.17453293F;

		bodyModel[38].addShapeBox(-12F, -11F, 0F, 8, 11, 1, 0F,-2F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[38].setRotationPoint(0F, -46F, -21F);
		bodyModel[38].rotateAngleX = -0.17453293F;

		bodyModel[39].addShapeBox(-4.5F, -11F, 0F, 8, 2, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[39].setRotationPoint(0F, -46F, -21F);
		bodyModel[39].rotateAngleX = -0.17453293F;

		bodyModel[40].addShapeBox(2.5F, -10.8F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[40].setRotationPoint(-1F, -46F, -22F);
		bodyModel[40].rotateAngleX = -0.17453293F;

		bodyModel[41].addShapeBox(-3.5F, -10.8F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[41].setRotationPoint(0F, -46F, -22F);
		bodyModel[41].rotateAngleX = -0.17453293F;

		bodyModel[42].addBox(-11F, 0F, -23F, 11, 1, 46, 0F); // Box 276
		bodyModel[42].setRotationPoint(-13F, -46F, 0F);
		bodyModel[42].rotateAngleZ = 0.15707963F;

		bodyModel[43].addShapeBox(-50F, 0F, -23F, 39, 1, 14, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 276
		bodyModel[43].setRotationPoint(-13F, -46F, 0F);
		bodyModel[43].rotateAngleZ = 0.15707963F;

		bodyModel[44].addShapeBox(-50F, 0F, 9F, 39, 1, 14, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 276
		bodyModel[44].setRotationPoint(-13F, -46F, 0F);
		bodyModel[44].rotateAngleZ = 0.15707963F;

		bodyModel[45].addShapeBox(-59F, 0F, -23F, 9, 1, 46, 0F,0F, 0F, -22F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -22F); // Box 276
		bodyModel[45].setRotationPoint(-13F, -46F, 0F);
		bodyModel[45].rotateAngleZ = 0.15707963F;

		bodyModel[46].addShapeBox(-50F, -1F, -10.5F, 39, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[46].setRotationPoint(-13F, -46F, 0F);
		bodyModel[46].rotateAngleZ = 0.15707963F;

		bodyModel[47].addShapeBox(-50F, -1F, 8.5F, 39, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[47].setRotationPoint(-13F, -46F, 0F);
		bodyModel[47].rotateAngleZ = 0.15707963F;

		bodyModel[48].addShapeBox(-11F, -1F, -10.5F, 2, 1, 21, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[48].setRotationPoint(-13F, -46F, 0F);
		bodyModel[48].rotateAngleZ = 0.15707963F;

		bodyModel[49].addShapeBox(-55F, -1F, -10.5F, 5, 1, 21, 0F,0F, -0.5F, -10F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 276
		bodyModel[49].setRotationPoint(-13F, -46F, 0F);
		bodyModel[49].rotateAngleZ = 0.15707963F;

		bodyModel[50].addShapeBox(-50F, -1F, -7.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[50].setRotationPoint(-13F, -46F, 0F);
		bodyModel[50].rotateAngleZ = 0.15707963F;

		bodyModel[51].addShapeBox(-50F, -1F, -5.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[51].setRotationPoint(-13F, -46F, 0F);
		bodyModel[51].rotateAngleZ = 0.15707963F;

		bodyModel[52].addShapeBox(-50F, -1F, -1.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[52].setRotationPoint(-13F, -46F, 0F);
		bodyModel[52].rotateAngleZ = 0.15707963F;

		bodyModel[53].addShapeBox(-50F, -1F, -3.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[53].setRotationPoint(-13F, -46F, 0F);
		bodyModel[53].rotateAngleZ = 0.15707963F;

		bodyModel[54].addShapeBox(-50F, -1F, 2.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[54].setRotationPoint(-13F, -46F, 0F);
		bodyModel[54].rotateAngleZ = 0.15707963F;

		bodyModel[55].addShapeBox(-50F, -1F, 0.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[55].setRotationPoint(-13F, -46F, 0F);
		bodyModel[55].rotateAngleZ = 0.15707963F;

		bodyModel[56].addShapeBox(-50F, -1F, 6.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[56].setRotationPoint(-13F, -46F, 0F);
		bodyModel[56].rotateAngleZ = 0.15707963F;

		bodyModel[57].addShapeBox(-50F, -1F, 4.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[57].setRotationPoint(-13F, -46F, 0F);
		bodyModel[57].rotateAngleZ = 0.15707963F;

		bodyModel[58].addShapeBox(-19F, -1F, -8.5F, 1, 1, 17, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 80
		bodyModel[58].setRotationPoint(-13F, -46F, 0F);
		bodyModel[58].rotateAngleZ = 0.15707963F;

		bodyModel[59].addShapeBox(-27F, -1F, -8.5F, 1, 1, 17, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 93
		bodyModel[59].setRotationPoint(-13F, -46F, 0F);
		bodyModel[59].rotateAngleZ = 0.15707963F;

		bodyModel[60].addShapeBox(-35F, -1F, -8.5F, 1, 1, 17, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 95
		bodyModel[60].setRotationPoint(-13F, -46F, 0F);
		bodyModel[60].rotateAngleZ = 0.15707963F;

		bodyModel[61].addShapeBox(-43F, -1F, -8.5F, 1, 1, 17, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 97
		bodyModel[61].setRotationPoint(-13F, -46F, 0F);
		bodyModel[61].rotateAngleZ = 0.15707963F;

		bodyModel[62].addShapeBox(-13F, -38F, 21F, 25, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[62].setRotationPoint(0F, -8F, 0F);

		bodyModel[63].addShapeBox(-13F, -38F, -23F, 25, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[63].setRotationPoint(0F, -8F, 0F);

		bodyModel[64].addBox(-38F, -0.5F, -29F, 74, 1, 58, 0F); // Box 122
		bodyModel[64].setRotationPoint(0F, -11F, 0F);

		bodyModel[65].addShapeBox(-11F, -47F, -1F, 3, 11, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[65].setRotationPoint(0F, 0F, -31F);
		bodyModel[65].rotateAngleX = -0.19373155F;

		bodyModel[66].addShapeBox(0F, -47F, -1F, 17, 13, 1, 0F,0F, -0.3F, 0F, 0F, -3.1F, 0F, 0F, -3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[66].setRotationPoint(12F, 0F, -31F);
		bodyModel[66].rotateAngleX = -0.19373155F;
		bodyModel[66].rotateAngleY = 0.0296706F;

		bodyModel[67].addShapeBox(27F, -43F, -1F, 23, 34, 1, 0F,0F, -0.7F, 0F, 0F, -4.3F, 0F, 0F, -4.3F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[67].setRotationPoint(12F, 0F, -31F);
		bodyModel[67].rotateAngleX = -0.19373155F;
		bodyModel[67].rotateAngleY = 0.0296706F;

		bodyModel[68].addShapeBox(17F, -30F, -1F, 8, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[68].setRotationPoint(12F, 0F, -31F);
		bodyModel[68].rotateAngleX = -0.19373155F;
		bodyModel[68].rotateAngleY = 0.0296706F;

		bodyModel[69].addShapeBox(17F, -44F, -1F, 8, 9, 1, 0F,0F, -0.1F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[69].setRotationPoint(12F, 0F, -31F);
		bodyModel[69].rotateAngleX = -0.19373155F;
		bodyModel[69].rotateAngleY = 0.0296706F;

		bodyModel[70].addShapeBox(-11F, -36F, -1F, 21, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[70].setRotationPoint(0F, 0F, -31F);
		bodyModel[70].rotateAngleX = -0.19373155F;

		bodyModel[71].addShapeBox(-11F, -15F, -1F, 21, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[71].setRotationPoint(0F, 0F, -31F);
		bodyModel[71].rotateAngleX = -0.19373155F;

		bodyModel[72].addShapeBox(7F, -47F, -1F, 3, 11, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[72].setRotationPoint(0F, 0F, -31F);
		bodyModel[72].rotateAngleX = -0.19373155F;

		bodyModel[73].addShapeBox(-8F, -47F, -1F, 15, 4, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[73].setRotationPoint(0F, 0F, -31F);
		bodyModel[73].rotateAngleX = -0.19373155F;

		bodyModel[74].addShapeBox(-8F, -38F, -1F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[74].setRotationPoint(0F, 0F, -31F);
		bodyModel[74].rotateAngleX = -0.19373155F;

		bodyModel[75].addShapeBox(-8F, -43F, -1.8F, 7, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[75].setRotationPoint(0F, 0F, -31F);
		bodyModel[75].rotateAngleX = -0.19373155F;

		bodyModel[76].addShapeBox(6F, -42.5F, -1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[76].setRotationPoint(0F, 0F, -31F);
		bodyModel[76].rotateAngleX = -0.19373155F;

		bodyModel[77].addShapeBox(6F, -39.5F, -1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[77].setRotationPoint(0F, 0F, -31F);
		bodyModel[77].rotateAngleX = -0.19373155F;

		bodyModel[78].addShapeBox(-10F, -42.5F, -1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[78].setRotationPoint(0F, 0F, -31F);
		bodyModel[78].rotateAngleX = -0.19373155F;

		bodyModel[79].addShapeBox(-10F, -39.5F, -1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[79].setRotationPoint(0F, 0F, -31F);
		bodyModel[79].rotateAngleX = -0.19373155F;

		bodyModel[80].addShapeBox(13F, -9.5F, -1.8F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[80].setRotationPoint(2F, 0F, -31F);
		bodyModel[80].rotateAngleX = -0.19373155F;
		bodyModel[80].rotateAngleY = 0.00872665F;

		bodyModel[81].addShapeBox(11F, -8F, -1.5F, 14, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[81].setRotationPoint(2F, 0F, -31F);
		bodyModel[81].rotateAngleX = -0.19373155F;
		bodyModel[81].rotateAngleY = 0.00872665F;

		bodyModel[82].addShapeBox(21F, -9.5F, -1.8F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[82].setRotationPoint(2F, 0F, -31F);
		bodyModel[82].rotateAngleX = -0.19373155F;
		bodyModel[82].rotateAngleY = 0.00872665F;

		bodyModel[83].addShapeBox(0F, -43F, -1.8F, 7, 5, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 126
		bodyModel[83].setRotationPoint(0F, 0F, -31F);
		bodyModel[83].rotateAngleX = -0.19373155F;
		bodyModel[83].rotateAngleY = -0.01745329F;

		bodyModel[84].addShapeBox(-8F, -10F, -4F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[84].setRotationPoint(0F, 0F, -31F);
		bodyModel[84].rotateAngleX = -0.19373155F;

		bodyModel[85].addShapeBox(-6F, -10.5F, -3.5F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[85].setRotationPoint(0F, 0F, -31F);
		bodyModel[85].rotateAngleX = -0.19373155F;

		bodyModel[86].addShapeBox(-10F, -9.5F, -3.5F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 131
		bodyModel[86].setRotationPoint(0F, 0F, -31F);
		bodyModel[86].rotateAngleX = -0.19373155F;

		bodyModel[87].addShapeBox(-12F, -9.5F, -3.5F, 2, 2, 2, 0F,0F, -0.1F, 0.9F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -1.1F); // Box 132
		bodyModel[87].setRotationPoint(0F, 0F, -31F);
		bodyModel[87].rotateAngleX = -0.19373155F;

		bodyModel[88].addShapeBox(35F, -1F, -1.2F, 15, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[88].setRotationPoint(12F, 0F, -31F);
		bodyModel[88].rotateAngleX = -0.19373155F;
		bodyModel[88].rotateAngleY = 0.0296706F;

		bodyModel[89].addShapeBox(31F, -1F, -1.2F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[89].setRotationPoint(12F, 0F, -31F);
		bodyModel[89].rotateAngleX = -0.19373155F;
		bodyModel[89].rotateAngleY = 0.0296706F;

		bodyModel[90].addShapeBox(27F, -1F, -1.2F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 137
		bodyModel[90].setRotationPoint(12F, 0F, -31F);
		bodyModel[90].rotateAngleX = -0.19373155F;
		bodyModel[90].rotateAngleY = 0.0296706F;

		bodyModel[91].addShapeBox(27F, -9F, -1.2F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[91].setRotationPoint(12F, 0F, -31F);
		bodyModel[91].rotateAngleX = -0.19373155F;
		bodyModel[91].rotateAngleY = 0.0296706F;

		bodyModel[92].addShapeBox(30F, -10.5F, -1.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[92].setRotationPoint(12F, 0F, -31F);
		bodyModel[92].rotateAngleX = -0.19373155F;
		bodyModel[92].rotateAngleY = 0.0296706F;

		bodyModel[93].addShapeBox(45F, -10.5F, -1.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[93].setRotationPoint(12F, 0F, -31F);
		bodyModel[93].rotateAngleX = -0.19373155F;
		bodyModel[93].rotateAngleY = 0.0296706F;

		bodyModel[94].addShapeBox(0F, -11F, -4F, 1, 11, 8, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[94].setRotationPoint(-12F, -46F, 0F);
		bodyModel[94].rotateAngleZ = -0.19198622F;

		bodyModel[95].addShapeBox(0F, -4F, -14F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[95].setRotationPoint(-12F, -46F, 0F);
		bodyModel[95].rotateAngleZ = -0.19198622F;

		bodyModel[96].addShapeBox(0F, -11F, -20F, 1, 11, 6, 0F,0F, 0.2F, -1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[96].setRotationPoint(-12F, -46F, 0F);
		bodyModel[96].rotateAngleZ = -0.19198622F;

		bodyModel[97].addShapeBox(0F, -11F, -14F, 1, 2, 10, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[97].setRotationPoint(-12F, -46F, 0F);
		bodyModel[97].rotateAngleZ = -0.19198622F;

		bodyModel[98].addShapeBox(0F, -11F, 4F, 1, 2, 10, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[98].setRotationPoint(-12F, -46F, 0F);
		bodyModel[98].rotateAngleZ = -0.19198622F;

		bodyModel[99].addShapeBox(0F, -11F, 14F, 1, 11, 6, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 1F); // Box 156
		bodyModel[99].setRotationPoint(-12F, -46F, 0F);
		bodyModel[99].rotateAngleZ = -0.19198622F;

		bodyModel[100].addShapeBox(0F, -4F, 4F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[100].setRotationPoint(-12F, -46F, 0F);
		bodyModel[100].rotateAngleZ = -0.19198622F;

		bodyModel[101].addShapeBox(0F, -10.8F, 5F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 158
		bodyModel[101].setRotationPoint(-13F, -46F, 0F);
		bodyModel[101].rotateAngleZ = -0.19198622F;

		bodyModel[102].addShapeBox(0F, -10.8F, 12F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 159
		bodyModel[102].setRotationPoint(-13F, -46F, 0F);
		bodyModel[102].rotateAngleZ = -0.19198622F;

		bodyModel[103].addShapeBox(0F, -10.8F, -6F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 160
		bodyModel[103].setRotationPoint(-13F, -46F, 0F);
		bodyModel[103].rotateAngleZ = -0.19198622F;

		bodyModel[104].addShapeBox(0F, -10.8F, -11F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 161
		bodyModel[104].setRotationPoint(-13F, -46F, 0F);
		bodyModel[104].rotateAngleZ = -0.19198622F;

		bodyModel[105].addShapeBox(0F, -26F, -1F, 1, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[105].setRotationPoint(-75F, -11F, 0F);
		bodyModel[105].rotateAngleZ = -0.143117F;

		bodyModel[106].addShapeBox(0F, 0F, -30F, 1, 17, 60, 0F,0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, -29F, -0.3F, -0.9F, 0.6F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.3F, -0.9F, 0.6F); // Box 257
		bodyModel[106].setRotationPoint(-75F, -11F, 0F);
		bodyModel[106].rotateAngleZ = 0.82030475F;

		bodyModel[107].addBox(-2F, -57.5F, -4.5F, 3, 1, 9, 0F); // Box 269
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(1F, -57.5F, -4.5F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 270
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-5F, -57.5F, -4.5F, 3, 1, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 271
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(0.5F, -58.5F, -3F, 2, 1, 6, 0F,0F, 0F, -2F, -1.95F, 0F, -2F, -1.95F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 272
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addBox(0F, 0F, -23F, 11, 1, 46, 0F); // Box 276
		bodyModel[111].setRotationPoint(12F, -46F, 0F);
		bodyModel[111].rotateAngleZ = -0.15707963F;

		bodyModel[112].addShapeBox(11F, 0F, 9F, 39, 1, 14, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[112].setRotationPoint(12F, -46F, 0F);
		bodyModel[112].rotateAngleZ = -0.15707963F;

		bodyModel[113].addShapeBox(50F, 0F, -23F, 9, 1, 46, 0F,-0.2F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, -0.2F, 0F, 0F); // Box 276
		bodyModel[113].setRotationPoint(12F, -46F, 0F);
		bodyModel[113].rotateAngleZ = -0.15707963F;

		bodyModel[114].addShapeBox(11F, 0F, -23F, 39, 1, 14, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[114].setRotationPoint(12F, -46F, 0F);
		bodyModel[114].rotateAngleZ = -0.15707963F;

		bodyModel[115].addShapeBox(11F, -1F, -10.5F, 39, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[115].setRotationPoint(12F, -46F, 0F);
		bodyModel[115].rotateAngleZ = -0.15707963F;

		bodyModel[116].addShapeBox(11F, -1F, 8.5F, 39, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[116].setRotationPoint(12F, -46F, 0F);
		bodyModel[116].rotateAngleZ = -0.15707963F;

		bodyModel[117].addShapeBox(11F, -1F, 6.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[117].setRotationPoint(12F, -46F, 0F);
		bodyModel[117].rotateAngleZ = -0.15707963F;

		bodyModel[118].addShapeBox(11F, -1F, 4.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[118].setRotationPoint(12F, -46F, 0F);
		bodyModel[118].rotateAngleZ = -0.15707963F;

		bodyModel[119].addShapeBox(11F, -1F, 2.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[119].setRotationPoint(12F, -46F, 0F);
		bodyModel[119].rotateAngleZ = -0.15707963F;

		bodyModel[120].addShapeBox(11F, -1F, 0.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[120].setRotationPoint(12F, -46F, 0F);
		bodyModel[120].rotateAngleZ = -0.15707963F;

		bodyModel[121].addShapeBox(11F, -1F, -1.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[121].setRotationPoint(12F, -46F, 0F);
		bodyModel[121].rotateAngleZ = -0.15707963F;

		bodyModel[122].addShapeBox(11F, -1F, -3.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[122].setRotationPoint(12F, -46F, 0F);
		bodyModel[122].rotateAngleZ = -0.15707963F;

		bodyModel[123].addShapeBox(11F, -1F, -5.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[123].setRotationPoint(12F, -46F, 0F);
		bodyModel[123].rotateAngleZ = -0.15707963F;

		bodyModel[124].addShapeBox(11F, -1F, -7.5F, 39, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[124].setRotationPoint(12F, -46F, 0F);
		bodyModel[124].rotateAngleZ = -0.15707963F;

		bodyModel[125].addShapeBox(42F, -1F, -8.5F, 1, 1, 17, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 287
		bodyModel[125].setRotationPoint(12F, -46F, 0F);
		bodyModel[125].rotateAngleZ = -0.15707963F;

		bodyModel[126].addShapeBox(34F, -1F, -8.5F, 1, 1, 17, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 288
		bodyModel[126].setRotationPoint(12F, -46F, 0F);
		bodyModel[126].rotateAngleZ = -0.15707963F;

		bodyModel[127].addShapeBox(26F, -1F, -8.5F, 1, 1, 17, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 289
		bodyModel[127].setRotationPoint(12F, -46F, 0F);
		bodyModel[127].rotateAngleZ = -0.15707963F;

		bodyModel[128].addShapeBox(18F, -1F, -8.5F, 1, 1, 17, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 290
		bodyModel[128].setRotationPoint(12F, -46F, 0F);
		bodyModel[128].rotateAngleZ = -0.15707963F;

		bodyModel[129].addShapeBox(9F, -1F, -10.5F, 2, 1, 21, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[129].setRotationPoint(12F, -46F, 0F);
		bodyModel[129].rotateAngleZ = -0.15707963F;

		bodyModel[130].addShapeBox(50F, -1F, -10.5F, 5, 1, 21, 0F,0F, -0.5F, 0F, 0F, -0.5F, -10F, 0F, -0.5F, -10F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 276
		bodyModel[130].setRotationPoint(12F, -46F, 0F);
		bodyModel[130].rotateAngleZ = -0.15707963F;

		bodyModel[131].addShapeBox(-13F, -47F, -1F, 2, 47, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[131].setRotationPoint(0F, 0F, -31F);
		bodyModel[131].rotateAngleX = -0.19373155F;

		bodyModel[132].addShapeBox(10F, -47F, -1F, 2, 47, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[132].setRotationPoint(0F, 0F, -31F);
		bodyModel[132].rotateAngleX = -0.19373155F;

		bodyModel[133].addShapeBox(25F, -43F, -1F, 2, 43, 1, 0F,0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[133].setRotationPoint(12F, 0F, -31F);
		bodyModel[133].rotateAngleX = -0.19373155F;
		bodyModel[133].rotateAngleY = 0.0296706F;

		bodyModel[134].addShapeBox(-25F, -44F, -1F, 8, 9, 1, 0F,0F, -1.3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[134].setRotationPoint(-13F, 0F, -31F);
		bodyModel[134].rotateAngleX = -0.19373155F;
		bodyModel[134].rotateAngleY = -0.0296706F;

		bodyModel[135].addShapeBox(-25F, -30F, -1F, 8, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[135].setRotationPoint(-13F, 0F, -31F);
		bodyModel[135].rotateAngleX = -0.19373155F;
		bodyModel[135].rotateAngleY = -0.0296706F;

		bodyModel[136].addShapeBox(-27F, -43F, -1F, 2, 43, 1, 0F,0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[136].setRotationPoint(-13F, 0F, -31F);
		bodyModel[136].rotateAngleX = -0.19373155F;
		bodyModel[136].rotateAngleY = -0.0296706F;

		bodyModel[137].addShapeBox(-50F, -43F, -1F, 23, 7, 1, 0F,0F, -4.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[137].setRotationPoint(-13F, 0F, -31F);
		bodyModel[137].rotateAngleX = -0.19373155F;
		bodyModel[137].rotateAngleY = -0.0296706F;

		bodyModel[138].addShapeBox(-17F, -8F, -1.5F, 14, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[138].setRotationPoint(-11F, 0F, -31F);
		bodyModel[138].rotateAngleX = -0.19373155F;
		bodyModel[138].rotateAngleY = -0.00872665F;

		bodyModel[139].addShapeBox(-15F, -9.5F, -1.8F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[139].setRotationPoint(-11F, 0F, -31F);
		bodyModel[139].rotateAngleX = -0.19373155F;
		bodyModel[139].rotateAngleY = -0.00872665F;

		bodyModel[140].addShapeBox(-7F, -9.5F, -1.8F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[140].setRotationPoint(-11F, 0F, -31F);
		bodyModel[140].rotateAngleX = -0.19373155F;
		bodyModel[140].rotateAngleY = -0.00872665F;

		bodyModel[141].addShapeBox(-49F, -10.5F, -1.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[141].setRotationPoint(-11F, 0F, -31F);
		bodyModel[141].rotateAngleX = -0.19373155F;
		bodyModel[141].rotateAngleY = -0.0296706F;

		bodyModel[142].addShapeBox(-52F, -9F, -1.2F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[142].setRotationPoint(-11F, 0F, -31F);
		bodyModel[142].rotateAngleX = -0.19373155F;
		bodyModel[142].rotateAngleY = -0.0296706F;

		bodyModel[143].addShapeBox(-34F, -10.5F, -1.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[143].setRotationPoint(-11F, 0F, -31F);
		bodyModel[143].rotateAngleX = -0.19373155F;
		bodyModel[143].rotateAngleY = -0.0296706F;

		bodyModel[144].addShapeBox(-52F, -1F, -1.2F, 15, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 321
		bodyModel[144].setRotationPoint(-11F, 0F, -31F);
		bodyModel[144].rotateAngleX = -0.19373155F;
		bodyModel[144].rotateAngleY = -0.0296706F;

		bodyModel[145].addShapeBox(-37F, -1F, -1.2F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[145].setRotationPoint(-11F, 0F, -31F);
		bodyModel[145].rotateAngleX = -0.19373155F;
		bodyModel[145].rotateAngleY = -0.0296706F;

		bodyModel[146].addShapeBox(-33F, -1F, -1.2F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[146].setRotationPoint(-11F, 0F, -31F);
		bodyModel[146].rotateAngleX = -0.19373155F;
		bodyModel[146].rotateAngleY = -0.0296706F;

		bodyModel[147].addShapeBox(-50F, -16F, -1F, 23, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[147].setRotationPoint(-13F, 0F, -31F);
		bodyModel[147].rotateAngleX = -0.19373155F;
		bodyModel[147].rotateAngleY = -0.0296706F;

		bodyModel[148].addShapeBox(-50F, -18F, -1F, 10, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[148].setRotationPoint(-13F, 0F, -31F);
		bodyModel[148].rotateAngleX = -0.19373155F;
		bodyModel[148].rotateAngleY = -0.0296706F;

		bodyModel[149].addShapeBox(-50F, -36F, -1F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[149].setRotationPoint(-13F, 0F, -31F);
		bodyModel[149].rotateAngleX = -0.19373155F;
		bodyModel[149].rotateAngleY = -0.0296706F;

		bodyModel[150].addShapeBox(-32F, -36F, -1F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 327
		bodyModel[150].setRotationPoint(-13F, 0F, -31F);
		bodyModel[150].rotateAngleX = -0.19373155F;
		bodyModel[150].rotateAngleY = -0.0296706F;

		bodyModel[151].addShapeBox(-32F, -18F, -1F, 5, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[151].setRotationPoint(-13F, 0F, -31F);
		bodyModel[151].rotateAngleX = -0.19373155F;
		bodyModel[151].rotateAngleY = -0.0296706F;

		bodyModel[152].addShapeBox(-50F, -34F, -1F, 8, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[152].setRotationPoint(-13F, 0F, -31F);
		bodyModel[152].rotateAngleX = -0.19373155F;
		bodyModel[152].rotateAngleY = -0.0296706F;

		bodyModel[153].addShapeBox(-30F, -34F, -1F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[153].setRotationPoint(-13F, 0F, -31F);
		bodyModel[153].rotateAngleX = -0.19373155F;
		bodyModel[153].rotateAngleY = -0.0296706F;

		bodyModel[154].addShapeBox(-42F, -34F, -2F, 12, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[154].setRotationPoint(-13F, 0F, -31F);
		bodyModel[154].rotateAngleX = -0.19373155F;
		bodyModel[154].rotateAngleY = -0.0296706F;

		bodyModel[155].addShapeBox(-42F, -36F, -2F, 12, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[155].setRotationPoint(-13F, 0F, -31F);
		bodyModel[155].rotateAngleX = -0.19373155F;
		bodyModel[155].rotateAngleY = -0.0296706F;

		bodyModel[156].addShapeBox(-42F, -18F, -2F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 333
		bodyModel[156].setRotationPoint(-13F, 0F, -31F);
		bodyModel[156].rotateAngleX = -0.19373155F;
		bodyModel[156].rotateAngleY = -0.0296706F;

		bodyModel[157].addShapeBox(-32F, -21F, -3F, 4, 2, 2, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 334
		bodyModel[157].setRotationPoint(-13F, 0F, -31F);
		bodyModel[157].rotateAngleX = -0.19373155F;
		bodyModel[157].rotateAngleY = -0.0296706F;

		bodyModel[158].addShapeBox(-32F, -33F, -3F, 4, 2, 2, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 335
		bodyModel[158].setRotationPoint(-13F, 0F, -31F);
		bodyModel[158].rotateAngleX = -0.19373155F;
		bodyModel[158].rotateAngleY = -0.0296706F;

		bodyModel[159].addShapeBox(-32F, -27F, -3F, 4, 2, 2, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 336
		bodyModel[159].setRotationPoint(-13F, 0F, -31F);
		bodyModel[159].rotateAngleX = -0.19373155F;
		bodyModel[159].rotateAngleY = -0.0296706F;

		bodyModel[160].addShapeBox(-40F, -33F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[160].setRotationPoint(-13F, 0F, -31F);
		bodyModel[160].rotateAngleX = -0.19373155F;
		bodyModel[160].rotateAngleY = -0.0296706F;

		bodyModel[161].addShapeBox(-40F, -20F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[161].setRotationPoint(-13F, 0F, -31F);
		bodyModel[161].rotateAngleX = -0.19373155F;
		bodyModel[161].rotateAngleY = -0.0296706F;

		bodyModel[162].addShapeBox(-40F, -25F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[162].setRotationPoint(-13F, 0F, -31F);
		bodyModel[162].rotateAngleX = -0.19373155F;
		bodyModel[162].rotateAngleY = -0.0296706F;

		bodyModel[163].addShapeBox(-40F, -28F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[163].setRotationPoint(-13F, 0F, -31F);
		bodyModel[163].rotateAngleX = -0.19373155F;
		bodyModel[163].rotateAngleY = -0.0296706F;

		bodyModel[164].addShapeBox(-40F, -28F, -4F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[164].setRotationPoint(-13F, 0F, -31F);
		bodyModel[164].rotateAngleX = -0.19373155F;
		bodyModel[164].rotateAngleY = -0.0296706F;

		bodyModel[165].addShapeBox(-45F, -28F, -3F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[165].setRotationPoint(-13F, 0F, -31F);
		bodyModel[165].rotateAngleX = -0.19373155F;
		bodyModel[165].rotateAngleY = -0.0296706F;

		bodyModel[166].addShapeBox(-45F, -28F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[166].setRotationPoint(-13F, 0F, -31F);
		bodyModel[166].rotateAngleX = -0.19373155F;
		bodyModel[166].rotateAngleY = -0.0296706F;

		bodyModel[167].addShapeBox(-45F, -25F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[167].setRotationPoint(-13F, 0F, -31F);
		bodyModel[167].rotateAngleX = -0.19373155F;
		bodyModel[167].rotateAngleY = -0.0296706F;

		bodyModel[168].addShapeBox(-12F, -46F, -1F, 41, 41, 1, 0F,-12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F); // Box 346
		bodyModel[168].setRotationPoint(12F, 0F, -31F);
		bodyModel[168].rotateAngleX = -0.19373155F;
		bodyModel[168].rotateAngleY = 0.0296706F;

		bodyModel[169].addShapeBox(0F, -17F, -1F, 17, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[169].setRotationPoint(12F, 0F, -31F);
		bodyModel[169].rotateAngleX = -0.19373155F;
		bodyModel[169].rotateAngleY = 0.0296706F;

		bodyModel[170].addShapeBox(-17F, -17F, -1F, 17, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[170].setRotationPoint(-13F, 0F, -31F);
		bodyModel[170].rotateAngleX = -0.19373155F;
		bodyModel[170].rotateAngleY = -0.0296706F;

		bodyModel[171].addShapeBox(-29F, -46F, -1F, 41, 41, 1, 0F,-12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F); // Box 348
		bodyModel[171].setRotationPoint(-13F, 0F, -31F);
		bodyModel[171].rotateAngleX = -0.19373155F;
		bodyModel[171].rotateAngleY = -0.0296706F;

		bodyModel[172].addShapeBox(-17F, -47F, -1F, 17, 13, 1, 0F,0F, -3.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[172].setRotationPoint(-13F, 0F, -31F);
		bodyModel[172].rotateAngleX = -0.19373155F;
		bodyModel[172].rotateAngleY = -0.0296706F;

		bodyModel[173].addShapeBox(-11F, -15F, 0F, 21, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[173].setRotationPoint(0F, 0F, 31F);
		bodyModel[173].rotateAngleX = 0.19373155F;

		bodyModel[174].addShapeBox(-11F, -36F, 0F, 21, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[174].setRotationPoint(0F, 0F, 31F);
		bodyModel[174].rotateAngleX = 0.19373155F;

		bodyModel[175].addShapeBox(-13F, -47F, 0F, 2, 47, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[175].setRotationPoint(0F, 0F, 31F);
		bodyModel[175].rotateAngleX = 0.19373155F;

		bodyModel[176].addShapeBox(-11F, -47F, 0F, 3, 11, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[176].setRotationPoint(0F, 0F, 31F);
		bodyModel[176].rotateAngleX = 0.19373155F;

		bodyModel[177].addShapeBox(7F, -47F, 0F, 3, 11, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[177].setRotationPoint(0F, 0F, 31F);
		bodyModel[177].rotateAngleX = 0.19373155F;

		bodyModel[178].addShapeBox(10F, -47F, 0F, 2, 47, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[178].setRotationPoint(0F, 0F, 31F);
		bodyModel[178].rotateAngleX = 0.19373155F;

		bodyModel[179].addShapeBox(-8F, -38F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[179].setRotationPoint(0F, 0F, 31F);
		bodyModel[179].rotateAngleX = 0.19373155F;

		bodyModel[180].addShapeBox(-8F, -43F, 0.8F, 7, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[180].setRotationPoint(0F, 0F, 31F);
		bodyModel[180].rotateAngleX = 0.19373155F;

		bodyModel[181].addShapeBox(0F, -43F, 0.8F, 7, 5, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 364
		bodyModel[181].setRotationPoint(0F, 0F, 31F);
		bodyModel[181].rotateAngleX = 0.19373155F;
		bodyModel[181].rotateAngleY = 0.01745329F;

		bodyModel[182].addShapeBox(6F, -42.5F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[182].setRotationPoint(0F, 0F, 31F);
		bodyModel[182].rotateAngleX = 0.19373155F;

		bodyModel[183].addShapeBox(6F, -39.5F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[183].setRotationPoint(0F, 0F, 31F);
		bodyModel[183].rotateAngleX = 0.19373155F;

		bodyModel[184].addShapeBox(-10F, -42.5F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[184].setRotationPoint(0F, 0F, 31F);
		bodyModel[184].rotateAngleX = 0.19373155F;

		bodyModel[185].addShapeBox(-10F, -39.5F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[185].setRotationPoint(0F, 0F, 31F);
		bodyModel[185].rotateAngleX = 0.19373155F;

		bodyModel[186].addShapeBox(-8F, -47F, 0F, 15, 4, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[186].setRotationPoint(0F, 0F, 31F);
		bodyModel[186].rotateAngleX = 0.19373155F;

		bodyModel[187].addShapeBox(-17F, -47F, 0F, 17, 13, 1, 0F,0F, -3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -3.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[187].setRotationPoint(-13F, 0F, 31F);
		bodyModel[187].rotateAngleX = 0.19373155F;
		bodyModel[187].rotateAngleY = 0.0296706F;

		bodyModel[188].addShapeBox(-29F, -46F, 0F, 41, 41, 1, 0F,-12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F); // Box 350
		bodyModel[188].setRotationPoint(-13F, 0F, 31F);
		bodyModel[188].rotateAngleX = 0.19373155F;
		bodyModel[188].rotateAngleY = 0.0296706F;

		bodyModel[189].addShapeBox(-17F, -17F, 0F, 17, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[189].setRotationPoint(-13F, 0F, 31F);
		bodyModel[189].rotateAngleX = 0.19373155F;
		bodyModel[189].rotateAngleY = 0.0296706F;

		bodyModel[190].addShapeBox(-15F, -8F, 0.5F, 14, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[190].setRotationPoint(-13F, 0F, 31F);
		bodyModel[190].rotateAngleX = 0.19373155F;
		bodyModel[190].rotateAngleY = 0.00872665F;

		bodyModel[191].addShapeBox(-3F, -9.5F, 0.8F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[191].setRotationPoint(-23F, 0F, 31F);
		bodyModel[191].rotateAngleX = 0.19373155F;
		bodyModel[191].rotateAngleY = 0.00872665F;

		bodyModel[192].addShapeBox(5F, -9.5F, 0.8F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[192].setRotationPoint(-23F, 0F, 31F);
		bodyModel[192].rotateAngleX = 0.19373155F;
		bodyModel[192].rotateAngleY = 0.00872665F;

		bodyModel[193].addShapeBox(-25F, -30F, 0F, 8, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[193].setRotationPoint(-13F, 0F, 31F);
		bodyModel[193].rotateAngleX = 0.19373155F;
		bodyModel[193].rotateAngleY = 0.0296706F;

		bodyModel[194].addShapeBox(-25F, -44F, 0F, 8, 9, 1, 0F,0F, -1.3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[194].setRotationPoint(-13F, 0F, 31F);
		bodyModel[194].rotateAngleX = 0.19373155F;
		bodyModel[194].rotateAngleY = 0.0296706F;

		bodyModel[195].addShapeBox(-27F, -43F, 0F, 2, 43, 1, 0F,0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[195].setRotationPoint(-13F, 0F, 31F);
		bodyModel[195].rotateAngleX = 0.19373155F;
		bodyModel[195].rotateAngleY = 0.0296706F;

		bodyModel[196].addShapeBox(-50F, -43F, 0F, 23, 34, 1, 0F,0F, -4.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[196].setRotationPoint(-13F, 0F, 31F);
		bodyModel[196].rotateAngleX = 0.19373155F;
		bodyModel[196].rotateAngleY = 0.0296706F;

		bodyModel[197].addShapeBox(-47F, -10.5F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[197].setRotationPoint(-13F, 0F, 31F);
		bodyModel[197].rotateAngleX = 0.19373155F;
		bodyModel[197].rotateAngleY = 0.0296706F;

		bodyModel[198].addShapeBox(-50F, -9F, 0.2F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[198].setRotationPoint(-13F, 0F, 31F);
		bodyModel[198].rotateAngleX = 0.19373155F;
		bodyModel[198].rotateAngleY = 0.0296706F;

		bodyModel[199].addShapeBox(-31F, -1F, 0.2F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[199].setRotationPoint(-13F, 0F, 31F);
		bodyModel[199].rotateAngleX = 0.19373155F;
		bodyModel[199].rotateAngleY = 0.0296706F;

		bodyModel[200].addShapeBox(-35F, -1F, 0.2F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[200].setRotationPoint(-13F, 0F, 31F);
		bodyModel[200].rotateAngleX = 0.19373155F;
		bodyModel[200].rotateAngleY = 0.0296706F;

		bodyModel[201].addShapeBox(-50F, -1F, 0.2F, 15, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 384
		bodyModel[201].setRotationPoint(-13F, 0F, 31F);
		bodyModel[201].rotateAngleX = 0.19373155F;
		bodyModel[201].rotateAngleY = 0.0296706F;

		bodyModel[202].addShapeBox(-32F, -10.5F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[202].setRotationPoint(-13F, 0F, 31F);
		bodyModel[202].rotateAngleX = 0.19373155F;
		bodyModel[202].rotateAngleY = 0.0296706F;

		bodyModel[203].addShapeBox(12F, -9.5F, 0.8F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[203].setRotationPoint(12F, 0F, 31F);
		bodyModel[203].rotateAngleX = 0.19373155F;
		bodyModel[203].rotateAngleY = -0.05061455F;

		bodyModel[204].addShapeBox(4F, -9.5F, 0.8F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[204].setRotationPoint(12F, 0F, 31F);
		bodyModel[204].rotateAngleX = 0.19373155F;
		bodyModel[204].rotateAngleY = -0.05061455F;

		bodyModel[205].addShapeBox(2F, -8F, 0.5F, 14, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[205].setRotationPoint(12F, 0F, 31F);
		bodyModel[205].rotateAngleX = 0.19373155F;
		bodyModel[205].rotateAngleY = -0.05061455F;

		bodyModel[206].addShapeBox(0F, -17F, 0F, 17, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[206].setRotationPoint(12F, 0F, 31F);
		bodyModel[206].rotateAngleX = 0.19373155F;
		bodyModel[206].rotateAngleY = -0.0296706F;

		bodyModel[207].addShapeBox(-12F, -46F, 0F, 41, 41, 1, 0F,-12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, -12F, 0F); // Box 390
		bodyModel[207].setRotationPoint(12F, 0F, 31F);
		bodyModel[207].rotateAngleX = 0.19373155F;
		bodyModel[207].rotateAngleY = -0.0296706F;

		bodyModel[208].addShapeBox(0F, -47F, 0F, 17, 13, 1, 0F,0F, -0.3F, 0F, 0F, -3F, 0F, 0F, -3.1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[208].setRotationPoint(12F, 0F, 31F);
		bodyModel[208].rotateAngleX = 0.19373155F;
		bodyModel[208].rotateAngleY = -0.0296706F;

		bodyModel[209].addShapeBox(17F, -44F, 0F, 8, 9, 1, 0F,0F, -0.1F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[209].setRotationPoint(12F, 0F, 31F);
		bodyModel[209].rotateAngleX = 0.19373155F;
		bodyModel[209].rotateAngleY = -0.0296706F;

		bodyModel[210].addShapeBox(17F, -30F, 0F, 8, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[210].setRotationPoint(12F, 0F, 31F);
		bodyModel[210].rotateAngleX = 0.19373155F;
		bodyModel[210].rotateAngleY = -0.0296706F;

		bodyModel[211].addShapeBox(25F, -43F, 0F, 2, 43, 1, 0F,0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[211].setRotationPoint(12F, 0F, 31F);
		bodyModel[211].rotateAngleX = 0.19373155F;
		bodyModel[211].rotateAngleY = -0.0296706F;

		bodyModel[212].addShapeBox(27F, -9F, 0.2F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[212].setRotationPoint(12F, 0F, 31F);
		bodyModel[212].rotateAngleX = 0.19373155F;
		bodyModel[212].rotateAngleY = -0.0296706F;

		bodyModel[213].addShapeBox(45F, -10.5F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[213].setRotationPoint(12F, 0F, 31F);
		bodyModel[213].rotateAngleX = 0.19373155F;
		bodyModel[213].rotateAngleY = -0.0296706F;

		bodyModel[214].addShapeBox(30F, -10.5F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[214].setRotationPoint(12F, 0F, 31F);
		bodyModel[214].rotateAngleX = 0.19373155F;
		bodyModel[214].rotateAngleY = -0.0296706F;

		bodyModel[215].addShapeBox(27F, -1F, 0.2F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 398
		bodyModel[215].setRotationPoint(12F, 0F, 31F);
		bodyModel[215].rotateAngleX = 0.19373155F;
		bodyModel[215].rotateAngleY = -0.0296706F;

		bodyModel[216].addShapeBox(31F, -1F, 0.2F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[216].setRotationPoint(12F, 0F, 31F);
		bodyModel[216].rotateAngleX = 0.19373155F;
		bodyModel[216].rotateAngleY = -0.0296706F;

		bodyModel[217].addShapeBox(35F, -1F, 0.2F, 15, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[217].setRotationPoint(12F, 0F, 31F);
		bodyModel[217].rotateAngleX = 0.19373155F;
		bodyModel[217].rotateAngleY = -0.0296706F;

		bodyModel[218].addShapeBox(27F, -16F, 0F, 23, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[218].setRotationPoint(12F, 0F, 31F);
		bodyModel[218].rotateAngleX = 0.19373155F;
		bodyModel[218].rotateAngleY = -0.0296706F;

		bodyModel[219].addShapeBox(45F, -18F, 0F, 5, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[219].setRotationPoint(12F, 0F, 31F);
		bodyModel[219].rotateAngleX = 0.19373155F;
		bodyModel[219].rotateAngleY = -0.0296706F;

		bodyModel[220].addShapeBox(27F, -18F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[220].setRotationPoint(12F, 0F, 31F);
		bodyModel[220].rotateAngleX = 0.19373155F;
		bodyModel[220].rotateAngleY = -0.0296706F;

		bodyModel[221].addShapeBox(27F, -34F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[221].setRotationPoint(12F, 0F, 31F);
		bodyModel[221].rotateAngleX = 0.19373155F;
		bodyModel[221].rotateAngleY = -0.0296706F;

		bodyModel[222].addShapeBox(27F, -36F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[222].setRotationPoint(12F, 0F, 31F);
		bodyModel[222].rotateAngleX = 0.19373155F;
		bodyModel[222].rotateAngleY = -0.0296706F;

		bodyModel[223].addShapeBox(27F, -43F, 0F, 23, 7, 1, 0F,0F, -0.7F, 0F, 0F, -4.3F, 0F, 0F, -4.3F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[223].setRotationPoint(12F, 0F, 31F);
		bodyModel[223].rotateAngleX = 0.19373155F;
		bodyModel[223].rotateAngleY = -0.0296706F;

		bodyModel[224].addShapeBox(45F, -36F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 407
		bodyModel[224].setRotationPoint(12F, 0F, 31F);
		bodyModel[224].rotateAngleX = 0.19373155F;
		bodyModel[224].rotateAngleY = -0.0296706F;

		bodyModel[225].addShapeBox(47F, -34F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[225].setRotationPoint(12F, 0F, 31F);
		bodyModel[225].rotateAngleX = 0.19373155F;
		bodyModel[225].rotateAngleY = -0.0296706F;

		bodyModel[226].addShapeBox(45F, -21F, 1F, 4, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 409
		bodyModel[226].setRotationPoint(12F, 0F, 31F);
		bodyModel[226].rotateAngleX = 0.19373155F;
		bodyModel[226].rotateAngleY = -0.0296706F;

		bodyModel[227].addShapeBox(45F, -27F, 1F, 4, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 410
		bodyModel[227].setRotationPoint(12F, 0F, 31F);
		bodyModel[227].rotateAngleX = 0.19373155F;
		bodyModel[227].rotateAngleY = -0.0296706F;

		bodyModel[228].addShapeBox(45F, -33F, 1F, 4, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 411
		bodyModel[228].setRotationPoint(12F, 0F, 31F);
		bodyModel[228].rotateAngleX = 0.19373155F;
		bodyModel[228].rotateAngleY = -0.0296706F;

		bodyModel[229].addShapeBox(37F, -33F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[229].setRotationPoint(12F, 0F, 31F);
		bodyModel[229].rotateAngleX = 0.19373155F;
		bodyModel[229].rotateAngleY = -0.0296706F;

		bodyModel[230].addShapeBox(35F, -34F, 1F, 12, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[230].setRotationPoint(12F, 0F, 31F);
		bodyModel[230].rotateAngleX = 0.19373155F;
		bodyModel[230].rotateAngleY = -0.0296706F;

		bodyModel[231].addShapeBox(37F, -28F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[231].setRotationPoint(12F, 0F, 31F);
		bodyModel[231].rotateAngleX = 0.19373155F;
		bodyModel[231].rotateAngleY = -0.0296706F;

		bodyModel[232].addShapeBox(37F, -28F, 3F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 415
		bodyModel[232].setRotationPoint(12F, 0F, 31F);
		bodyModel[232].rotateAngleX = 0.19373155F;
		bodyModel[232].rotateAngleY = -0.0296706F;

		bodyModel[233].addShapeBox(37F, -25F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[233].setRotationPoint(12F, 0F, 31F);
		bodyModel[233].rotateAngleX = 0.19373155F;
		bodyModel[233].rotateAngleY = -0.0296706F;

		bodyModel[234].addShapeBox(37F, -20F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[234].setRotationPoint(12F, 0F, 31F);
		bodyModel[234].rotateAngleX = 0.19373155F;
		bodyModel[234].rotateAngleY = -0.0296706F;

		bodyModel[235].addShapeBox(32F, -25F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[235].setRotationPoint(12F, 0F, 31F);
		bodyModel[235].rotateAngleX = 0.19373155F;
		bodyModel[235].rotateAngleY = -0.0296706F;

		bodyModel[236].addShapeBox(32F, -28F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 419
		bodyModel[236].setRotationPoint(12F, 0F, 31F);
		bodyModel[236].rotateAngleX = 0.19373155F;
		bodyModel[236].rotateAngleY = -0.0296706F;

		bodyModel[237].addShapeBox(32F, -28F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[237].setRotationPoint(12F, 0F, 31F);
		bodyModel[237].rotateAngleX = 0.19373155F;
		bodyModel[237].rotateAngleY = -0.0296706F;

		bodyModel[238].addShapeBox(35F, -18F, 1F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 421
		bodyModel[238].setRotationPoint(12F, 0F, 31F);
		bodyModel[238].rotateAngleX = 0.19373155F;
		bodyModel[238].rotateAngleY = -0.0296706F;

		bodyModel[239].addShapeBox(35F, -36F, 1F, 12, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[239].setRotationPoint(12F, 0F, 31F);
		bodyModel[239].rotateAngleX = 0.19373155F;
		bodyModel[239].rotateAngleY = -0.0296706F;

		bodyModel[240].addShapeBox(0F, -26F, 0F, 1, 7, 23, 0F,0F, 0F, -1F, 0F, 0F, -1F, 2.3F, 1.7F, 1F, -2.3F, 1.8F, 1.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 3F, 0F, 2.6F, -3F, 0F, 3F); // Box 350
		bodyModel[240].setRotationPoint(-75F, -11F, 1F);
		bodyModel[240].rotateAngleY = -0.26179939F;
		bodyModel[240].rotateAngleZ = -0.13962634F;

		bodyModel[241].addShapeBox(0F, -14F, 0F, 1, 14, 23, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 3.4F, 0F, 3.7F, -3.4F, 0F, 4.1F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 10.1F, 8.6F, -5.4F, 10.1F, 8.7F); // Box 350
		bodyModel[241].setRotationPoint(-75F, -11F, 1F);
		bodyModel[241].rotateAngleY = -0.26179939F;
		bodyModel[241].rotateAngleZ = -0.13962634F;

		bodyModel[242].addShapeBox(0F, -19F, 17F, 1, 5, 9, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2.1F, 0F, 0F, 2.1F, 0F, 0F, 3.4F, 0F, 1F, -3.4F, 0F, 1F); // Box 350
		bodyModel[242].setRotationPoint(-75F, -11F, 1F);
		bodyModel[242].rotateAngleY = -0.26179939F;
		bodyModel[242].rotateAngleZ = -0.13962634F;

		bodyModel[243].addShapeBox(0F, -19F, 0F, 1, 5, 9, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.1F, 0F, 0F, -1.1F, 0F, 0F); // Box 427
		bodyModel[243].setRotationPoint(-75F, -11F, 1F);
		bodyModel[243].rotateAngleY = -0.26179939F;
		bodyModel[243].rotateAngleZ = -0.13962634F;

		bodyModel[244].addShapeBox(0F, -14F, -23F, 1, 14, 23, 0F,-3.4F, 0F, 4.1F, 3.4F, 0F, 3.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -5.4F, 10.1F, 8.7F, 5.5F, 10.1F, 8.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[244].setRotationPoint(-75F, -11F, -1F);
		bodyModel[244].rotateAngleY = 0.26179939F;
		bodyModel[244].rotateAngleZ = -0.13962634F;

		bodyModel[245].addShapeBox(0F, -19F, -9F, 1, 5, 9, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -1.1F, 0F, 0F, 1.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 429
		bodyModel[245].setRotationPoint(-75F, -11F, -1F);
		bodyModel[245].rotateAngleY = 0.26179939F;
		bodyModel[245].rotateAngleZ = -0.13962634F;

		bodyModel[246].addShapeBox(0F, -26F, -23F, 1, 7, 23, 0F,-2.3F, 1.8F, 1.5F, 2.3F, 1.7F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 3F, 3F, 0F, 2.6F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 430
		bodyModel[246].setRotationPoint(-75F, -11F, -1F);
		bodyModel[246].rotateAngleY = 0.26179939F;
		bodyModel[246].rotateAngleZ = -0.13962634F;

		bodyModel[247].addShapeBox(0F, -19F, -26F, 1, 5, 9, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -3.4F, 0F, 1F, 3.4F, 0F, 1F, 2.1F, 0F, 0F, -2.1F, 0F, 0F); // Box 431
		bodyModel[247].setRotationPoint(-75F, -11F, -1F);
		bodyModel[247].rotateAngleY = 0.26179939F;
		bodyModel[247].rotateAngleZ = -0.13962634F;

		bodyModel[248].addShapeBox(-1F, 0F, -30F, 1, 17, 60, 0F,0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, -29F, 0.3F, 0.3F, 0F, -0.3F, -0.9F, 0.6F, -0.3F, -0.9F, 0.6F, 0.3F, 0.3F, 0F); // Box 432
		bodyModel[248].setRotationPoint(74F, -11F, 0F);
		bodyModel[248].rotateAngleZ = -0.82030475F;

		bodyModel[249].addShapeBox(-1F, -14F, 0F, 1, 14, 23, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.4F, 0F, 4.1F, 3.4F, 0F, 3.7F, 0F, 0F, 0F, 0F, 0F, 0F, -5.4F, 10.1F, 8.7F, 5.5F, 10.1F, 8.6F); // Box 433
		bodyModel[249].setRotationPoint(74F, -11F, 1F);
		bodyModel[249].rotateAngleY = 0.26179939F;
		bodyModel[249].rotateAngleZ = 0.13962634F;

		bodyModel[250].addShapeBox(-1F, -26F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[250].setRotationPoint(74F, -11F, 0F);
		bodyModel[250].rotateAngleZ = 0.143117F;

		bodyModel[251].addShapeBox(-1F, -14F, -23F, 1, 14, 23, 0F,3.4F, 0F, 3.7F, -3.4F, 0F, 4.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 5.5F, 10.1F, 8.6F, -5.4F, 10.1F, 8.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[251].setRotationPoint(74F, -11F, -1F);
		bodyModel[251].rotateAngleY = -0.26179939F;
		bodyModel[251].rotateAngleZ = 0.13962634F;

		bodyModel[252].addShapeBox(-1F, -19F, -9F, 1, 5, 3, 0F,0.95F, 0F, 0F, -1.05F, 0F, 0F, -0.8F, 0F, -1F, 0.8F, 0F, -1F, 1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.8F, 0F, -1F, 0.8F, 0F, -1F); // Box 436
		bodyModel[252].setRotationPoint(74F, -11F, -1F);
		bodyModel[252].rotateAngleY = -0.26179939F;
		bodyModel[252].rotateAngleZ = 0.13962634F;

		bodyModel[253].addShapeBox(-1F, -26F, -23F, 1, 2, 23, 0F,2.3F, 1.7F, 1F, -2.3F, 1.8F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 2.5F, 0F, 2.2F, -2.5F, 0F, 2.2F, 0.05F, 0F, -0.85F, -0.05F, 0F, -0.85F); // Box 437
		bodyModel[253].setRotationPoint(74F, -11F, -1F);
		bodyModel[253].rotateAngleY = -0.26179939F;
		bodyModel[253].rotateAngleZ = 0.13962634F;

		bodyModel[254].addShapeBox(-1F, -19F, -26F, 1, 5, 9, 0F,3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 3.4F, 0F, 1F, -3.4F, 0F, 1F, -2.1F, 0F, 0F, 2.15F, 0F, 0F); // Box 441
		bodyModel[254].setRotationPoint(74F, -11F, -1F);
		bodyModel[254].rotateAngleY = -0.26179939F;
		bodyModel[254].rotateAngleZ = 0.13962634F;

		bodyModel[255].addShapeBox(-1F, -16F, -1F, 1, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[255].setRotationPoint(74F, -11F, 0F);
		bodyModel[255].rotateAngleZ = 0.143117F;

		bodyModel[256].addShapeBox(-1F, -24F, -26F, 1, 5, 19, 0F,2.5F, 0F, -0.8F, -2.5F, 0F, -0.8F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F); // Box 444
		bodyModel[256].setRotationPoint(74F, -11F, -1F);
		bodyModel[256].rotateAngleY = -0.26179939F;
		bodyModel[256].rotateAngleZ = 0.13962634F;

		bodyModel[257].addShapeBox(-1F, -16F, -7F, 1, 2, 6, 0F,0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.05F, 0F, 0.4F, -0.05F, 0F, 0.15F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0F, 0.15F); // Box 445
		bodyModel[257].setRotationPoint(74F, -11F, -1F);
		bodyModel[257].rotateAngleY = -0.26179939F;
		bodyModel[257].rotateAngleZ = 0.13962634F;

		bodyModel[258].addShapeBox(-1F, -16F, 1F, 1, 2, 6, 0F,0F, 0F, 0.15F, 0F, 0F, 0.45F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.05F, 0F, 0.15F, 0.05F, 0F, 0.4F, -0.8F, 0F, 0F, 0.8F, 0F, 0F); // Box 446
		bodyModel[258].setRotationPoint(74F, -11F, 1F);
		bodyModel[258].rotateAngleY = 0.26179939F;
		bodyModel[258].rotateAngleZ = 0.13962634F;

		bodyModel[259].addShapeBox(-1F, -26F, 0F, 1, 2, 23, 0F,0F, 0F, -1F, 0F, 0F, -1F, -2.3F, 1.8F, 1.5F, 2.3F, 1.7F, 1F, -0.05F, 0F, -0.85F, 0.05F, 0F, -0.85F, -2.5F, 0F, 2.2F, 2.5F, 0F, 2.2F); // Box 447
		bodyModel[259].setRotationPoint(74F, -11F, 1F);
		bodyModel[259].rotateAngleY = 0.26179939F;
		bodyModel[259].rotateAngleZ = 0.13962634F;

		bodyModel[260].addShapeBox(-1F, -24F, 7F, 1, 5, 19, 0F,0.6F, 0F, 0F, -0.6F, 0F, 0F, -2.5F, 0F, -0.8F, 2.5F, 0F, -0.8F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 448
		bodyModel[260].setRotationPoint(74F, -11F, 1F);
		bodyModel[260].rotateAngleY = 0.26179939F;
		bodyModel[260].rotateAngleZ = 0.13962634F;

		bodyModel[261].addShapeBox(-1F, -19F, 6F, 1, 5, 3, 0F,0.8F, 0F, -1F, -0.8F, 0F, -1F, -1.05F, 0F, 0F, 0.95F, 0F, 0F, 0.8F, 0F, -1F, -0.8F, 0F, -1F, -1.1F, 0F, 0F, 1.1F, 0F, 0F); // Box 449
		bodyModel[261].setRotationPoint(74F, -11F, 1F);
		bodyModel[261].rotateAngleY = 0.26179939F;
		bodyModel[261].rotateAngleZ = 0.13962634F;

		bodyModel[262].addShapeBox(-1F, -19F, 17F, 1, 5, 9, 0F,2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 2.15F, 0F, 0F, -2.1F, 0F, 0F, -3.4F, 0F, 1F, 3.4F, 0F, 1F); // Box 450
		bodyModel[262].setRotationPoint(74F, -11F, 1F);
		bodyModel[262].rotateAngleY = 0.26179939F;
		bodyModel[262].rotateAngleZ = 0.13962634F;

		bodyModel[263].addShapeBox(-62F, -0.5F, -29F, 24, 1, 58, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 451
		bodyModel[263].setRotationPoint(0F, -11F, 0F);

		bodyModel[264].addShapeBox(-74F, -0.5F, -28F, 12, 1, 56, 0F,0F, 1F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -26F, 0F, -1F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -26F); // Box 452
		bodyModel[264].setRotationPoint(0F, -11F, 0F);

		bodyModel[265].addShapeBox(36F, -0.5F, -29F, 24, 1, 58, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 453
		bodyModel[265].setRotationPoint(0F, -11F, 0F);

		bodyModel[266].addShapeBox(60F, -0.5F, -28F, 12, 1, 56, 0F,0F, 0F, 0F, 0F, 1F, -26F, 0F, 1F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -26F, 0F, -1F, -26F, 0F, 0F, 0F); // Box 454
		bodyModel[266].setRotationPoint(0F, -11F, 0F);

		bodyModel[267].addBox(-12F, -0.5F, -18F, 28, 1, 36, 0F); // Box 455
		bodyModel[267].setRotationPoint(0F, -30F, 0F);

		bodyModel[268].addBox(16F, -9.5F, -16F, 1, 28, 32, 0F); // Box 456
		bodyModel[268].setRotationPoint(0F, -30F, 0F);

		bodyModel[269].addBox(-13F, -15F, -17F, 1, 34, 34, 0F); // Box 457
		bodyModel[269].setRotationPoint(0F, -30F, 0F);

		bodyModel[270].addBox(16F, -15F, -18F, 2, 34, 2, 0F); // Box 458
		bodyModel[270].setRotationPoint(0F, -30F, 0F);

		bodyModel[271].addBox(16F, -15F, 16F, 2, 34, 2, 0F); // Box 459
		bodyModel[271].setRotationPoint(0F, -30F, 0F);

		bodyModel[272].addBox(-1F, -1F, 13F, 2, 32, 1, 0F); // Box 460
		bodyModel[272].setRotationPoint(17F, -42F, 5F);
		bodyModel[272].rotateAngleZ = 0.15707963F;

		bodyModel[273].addShapeBox(1F, 15F, 13F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[273].setRotationPoint(17F, -42F, 5F);
		bodyModel[273].rotateAngleZ = 0.15707963F;

		bodyModel[274].addBox(17F, -3.5F, -15F, 3, 22, 30, 0F); // Box 462
		bodyModel[274].setRotationPoint(0F, -30F, 0F);

		bodyModel[275].addShapeBox(17F, -5.5F, -15F, 4, 2, 30, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[275].setRotationPoint(0F, -30F, 0F);

		bodyModel[276].addBox(20F, -1.5F, -15F, 1, 18, 2, 0F); // Box 464
		bodyModel[276].setRotationPoint(0F, -30F, 0F);

		bodyModel[277].addBox(20F, -1.5F, 13F, 1, 18, 2, 0F); // Box 465
		bodyModel[277].setRotationPoint(0F, -30F, 0F);

		bodyModel[278].addBox(20F, -1.5F, 10F, 1, 18, 2, 0F); // Box 466
		bodyModel[278].setRotationPoint(0F, -30F, 0F);

		bodyModel[279].addBox(20F, -1.5F, -12F, 1, 18, 2, 0F); // Box 467
		bodyModel[279].setRotationPoint(0F, -30F, 0F);

		bodyModel[280].addBox(20F, -1.5F, -9F, 1, 18, 2, 0F); // Box 468
		bodyModel[280].setRotationPoint(0F, -30F, 0F);

		bodyModel[281].addBox(20F, -1.5F, 7F, 1, 18, 2, 0F); // Box 469
		bodyModel[281].setRotationPoint(0F, -30F, 0F);

		bodyModel[282].addBox(20F, -1.5F, 4F, 1, 18, 2, 0F); // Box 470
		bodyModel[282].setRotationPoint(0F, -30F, 0F);

		bodyModel[283].addBox(20F, -1.5F, -6F, 1, 18, 2, 0F); // Box 471
		bodyModel[283].setRotationPoint(0F, -30F, 0F);

		bodyModel[284].addBox(20F, -1.5F, -3F, 1, 18, 2, 0F); // Box 472
		bodyModel[284].setRotationPoint(0F, -30F, 0F);

		bodyModel[285].addBox(20F, -1.5F, 1F, 1, 18, 2, 0F); // Box 473
		bodyModel[285].setRotationPoint(0F, -30F, 0F);

		bodyModel[286].addShapeBox(20F, -3.5F, -15F, 1, 2, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[286].setRotationPoint(0F, -30F, 0F);

		bodyModel[287].addShapeBox(20F, 16.5F, -15F, 1, 2, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		bodyModel[287].setRotationPoint(0F, -30F, 0F);

		bodyModel[288].addShapeBox(17F, -7.5F, -5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[288].setRotationPoint(0F, -30F, 0F);

		bodyModel[289].addShapeBox(17F, -7.5F, 3F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[289].setRotationPoint(0F, -30F, 0F);

		bodyModel[290].addShapeBox(17F, -6.5F, 11F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyModel[290].setRotationPoint(0F, -30F, 0F);

		bodyModel[291].addShapeBox(17F, -6.5F, -13F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[291].setRotationPoint(0F, -30F, 0F);

		bodyModel[292].addBox(2F, 15F, -23F, 1, 2, 36, 0F); // Box 480
		bodyModel[292].setRotationPoint(17F, -42F, 5F);
		bodyModel[292].rotateAngleZ = 0.15707963F;

		bodyModel[293].addBox(-1F, -1F, -24F, 2, 32, 1, 0F); // Box 481
		bodyModel[293].setRotationPoint(17F, -42F, 5F);
		bodyModel[293].rotateAngleZ = 0.15707963F;

		bodyModel[294].addShapeBox(1F, 15F, -24F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[294].setRotationPoint(17F, -42F, 5F);
		bodyModel[294].rotateAngleZ = 0.15707963F;

		bodyModel[295].addShapeBox(1F, 24F, -24F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[295].setRotationPoint(17F, -42F, 5F);
		bodyModel[295].rotateAngleZ = 0.15707963F;

		bodyModel[296].addBox(2F, 24F, -23F, 1, 2, 36, 0F); // Box 484
		bodyModel[296].setRotationPoint(17F, -42F, 5F);
		bodyModel[296].rotateAngleZ = 0.15707963F;

		bodyModel[297].addShapeBox(1F, 24F, 13F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[297].setRotationPoint(17F, -42F, 5F);
		bodyModel[297].rotateAngleZ = 0.15707963F;

		bodyModel[298].addBox(-6F, -3.5F, 8.5F, 3, 3, 1, 0F); // Box 486
		bodyModel[298].setRotationPoint(0F, -30F, 0F);

		bodyModel[299].addShapeBox(-6F, -3.5F, 9.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 487
		bodyModel[299].setRotationPoint(0F, -30F, 0F);

		bodyModel[300].addShapeBox(-6F, -3.5F, 7.5F, 3, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[300].setRotationPoint(0F, -30F, 0F);

		bodyModel[301].addBox(-7F, -4.5F, 5F, 11, 1, 8, 0F); // Box 489
		bodyModel[301].setRotationPoint(0F, -30F, 0F);

		bodyModel[302].addShapeBox(-8F, -15.5F, 5F, 1, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 490
		bodyModel[302].setRotationPoint(0F, -30F, 0F);

		bodyModel[303].addShapeBox(-8F, -17.5F, 5F, 1, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[303].setRotationPoint(0F, -30F, 0F);

		bodyModel[304].addShapeBox(-8F, -9.5F, 13F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 492
		bodyModel[304].setRotationPoint(0F, -30F, 0F);

		bodyModel[305].addShapeBox(-7F, -9.5F, 14F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[305].setRotationPoint(0F, -30F, 0F);

		bodyModel[306].addShapeBox(-6F, -9.5F, 13.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[306].setRotationPoint(0F, -30F, 0F);

		bodyModel[307].addShapeBox(-8F, -9.5F, 3F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[307].setRotationPoint(0F, -30F, 0F);

		bodyModel[308].addShapeBox(-7F, -9.5F, 3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[308].setRotationPoint(0F, -30F, 0F);

		bodyModel[309].addShapeBox(-6F, -9.5F, 2.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[309].setRotationPoint(0F, -30F, 0F);

		bodyModel[310].addShapeBox(-1F, -9.5F, -15F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[310].setRotationPoint(0F, -30F, 0F);

		bodyModel[311].addShapeBox(0F, -9.5F, -15.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[311].setRotationPoint(0F, -30F, 0F);

		bodyModel[312].addShapeBox(0F, -9.5F, -4.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[312].setRotationPoint(0F, -30F, 0F);

		bodyModel[313].addShapeBox(-2F, -9.5F, -5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 501
		bodyModel[313].setRotationPoint(0F, -30F, 0F);

		bodyModel[314].addShapeBox(-1F, -9.5F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[314].setRotationPoint(0F, -30F, 0F);

		bodyModel[315].addShapeBox(-2F, -15.5F, -13F, 1, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 503
		bodyModel[315].setRotationPoint(0F, -30F, 0F);

		bodyModel[316].addShapeBox(-2F, -17.5F, -13F, 1, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[316].setRotationPoint(0F, -30F, 0F);

		bodyModel[317].addBox(-1F, -4.5F, -13F, 11, 1, 8, 0F); // Box 505
		bodyModel[317].setRotationPoint(0F, -30F, 0F);

		bodyModel[318].addShapeBox(0F, -3.5F, -8.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 506
		bodyModel[318].setRotationPoint(0F, -30F, 0F);

		bodyModel[319].addBox(0F, -3.5F, -9.5F, 3, 3, 1, 0F); // Box 507
		bodyModel[319].setRotationPoint(0F, -30F, 0F);

		bodyModel[320].addShapeBox(0F, -3.5F, -10.5F, 3, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[320].setRotationPoint(0F, -30F, 0F);

		bodyModel[321].addShapeBox(-2F, -9.5F, -15F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		bodyModel[321].setRotationPoint(0F, -30F, 0F);

		bodyModel[322].addShapeBox(5F, -11.5F, 8.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[322].setRotationPoint(0F, -30F, 0F);

		bodyModel[323].addShapeBox(-0.5F, 0F, -25.5F, 1, 1, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[323].setRotationPoint(-1.5F, -32.5F, 9F);

		bodyModel[324].addShapeBox(-0.5F, 0F, -26.5F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[324].setRotationPoint(-1.5F, -32.5F, 9F);

		bodyModel[325].addShapeBox(-0.5F, 0F, 7.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[325].setRotationPoint(-1.5F, -32.5F, 9F);

		bodyModel[326].addShapeBox(-0.5F, -5.5F, 6.5F, 1, 5, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 524
		bodyModel[326].setRotationPoint(-1.5F, -32F, 9F);

		bodyModel[327].addShapeBox(-0.5F, -8.5F, 6.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[327].setRotationPoint(-1.5F, -32F, 9F);

		bodyModel[328].addShapeBox(-1F, -1F, 6.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[328].setRotationPoint(-1.5F, -32F, 9F);

		bodyModel[329].addShapeBox(-0.5F, -5.5F, -7.5F, 1, 5, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 528
		bodyModel[329].setRotationPoint(-1.5F, -32F, 9F);
		bodyModel[329].rotateAngleZ = -0.12217305F;

		bodyModel[330].addShapeBox(-1F, -1F, -7.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[330].setRotationPoint(-1.5F, -32F, 9F);
		bodyModel[330].rotateAngleZ = -0.12217305F;

		bodyModel[331].addShapeBox(-0.5F, -8.5F, -7.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[331].setRotationPoint(-1.5F, -32F, 9F);
		bodyModel[331].rotateAngleZ = -0.12217305F;

		bodyModel[332].addBox(-7.5F, -1.5F, 8F, 6, 1, 2, 0F); // Box 531
		bodyModel[332].setRotationPoint(0F, -30F, 0F);

		bodyModel[333].addShapeBox(-7.5F, -1.5F, 10F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 532
		bodyModel[333].setRotationPoint(0F, -30F, 0F);

		bodyModel[334].addShapeBox(-7.5F, -1.5F, 6F, 6, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[334].setRotationPoint(0F, -30F, 0F);

		bodyModel[335].addShapeBox(-1.5F, -1.5F, -12F, 6, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[335].setRotationPoint(0F, -30F, 0F);

		bodyModel[336].addShapeBox(-1.5F, -1.5F, -8F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 535
		bodyModel[336].setRotationPoint(0F, -30F, 0F);

		bodyModel[337].addBox(-1.5F, -1.5F, -10F, 6, 1, 2, 0F); // Box 536
		bodyModel[337].setRotationPoint(0F, -30F, 0F);

		bodyModel[338].addBox(1F, 0.5F, 16F, 2, 18, 2, 0F); // Box 537
		bodyModel[338].setRotationPoint(0F, -30F, 0F);

		bodyModel[339].addBox(3F, 0.5F, 16F, 13, 18, 1, 0F); // Box 538
		bodyModel[339].setRotationPoint(0F, -30F, 0F);

		bodyModel[340].addBox(-12F, 0.5F, 16F, 13, 18, 1, 0F); // Box 539
		bodyModel[340].setRotationPoint(0F, -30F, 0F);

		bodyModel[341].addBox(3F, 0.5F, -17F, 13, 18, 1, 0F); // Box 540
		bodyModel[341].setRotationPoint(0F, -30F, 0F);

		bodyModel[342].addBox(1F, 0.5F, -18F, 2, 18, 2, 0F); // Box 541
		bodyModel[342].setRotationPoint(0F, -30F, 0F);

		bodyModel[343].addBox(-12F, 0.5F, -17F, 13, 18, 1, 0F); // Box 542
		bodyModel[343].setRotationPoint(0F, -30F, 0F);

		bodyModel[344].addShapeBox(-8F, -9F, -4F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[344].setRotationPoint(0F, 0F, -31F);
		bodyModel[344].rotateAngleX = -0.19373155F;

		bodyModel[345].addShapeBox(-8F, -8F, -4F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 544
		bodyModel[345].setRotationPoint(0F, 0F, -31F);
		bodyModel[345].rotateAngleX = -0.19373155F;

		bodyModel[346].addShapeBox(-3F, -10F, -5F, 10, 1, 3, 0F,0F, 0F, -2F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 1F); // Box 547
		bodyModel[346].setRotationPoint(0F, 0F, -31F);
		bodyModel[346].rotateAngleX = -0.19373155F;

		bodyModel[347].addShapeBox(-3F, -9F, -5F, 10, 1, 3, 0F,0F, 0F, -1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 1F); // Box 548
		bodyModel[347].setRotationPoint(0F, 0F, -31F);
		bodyModel[347].rotateAngleX = -0.19373155F;

		bodyModel[348].addShapeBox(-3F, -8F, -5F, 10, 1, 3, 0F,0F, 0F, -1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 0F, 0F); // Box 550
		bodyModel[348].setRotationPoint(0F, 0F, -31F);
		bodyModel[348].rotateAngleX = -0.19373155F;

		bodyModel[349].addShapeBox(7F, -4F, -5F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[349].setRotationPoint(0F, 0F, -31F);
		bodyModel[349].rotateAngleX = -0.19373155F;

		bodyModel[350].addShapeBox(7F, -3F, -5F, 2, 1, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[350].setRotationPoint(0F, 0F, -31F);
		bodyModel[350].rotateAngleX = -0.19373155F;

		bodyModel[351].addShapeBox(7F, -2F, -5F, 2, 1, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 553
		bodyModel[351].setRotationPoint(0F, 0F, -31F);
		bodyModel[351].rotateAngleX = -0.19373155F;

		bodyModel[352].addShapeBox(7F, -3F, -4F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[352].setRotationPoint(0F, 0F, -31F);
		bodyModel[352].rotateAngleX = -0.19373155F;

		bodyModel[353].addShapeBox(7F, -4F, -4F, 3, 1, 19, 0F,-1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		bodyModel[353].setRotationPoint(0F, 0F, -31F);
		bodyModel[353].rotateAngleX = -0.19373155F;

		bodyModel[354].addShapeBox(7F, -2F, -4F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 556
		bodyModel[354].setRotationPoint(0F, 0F, -31F);
		bodyModel[354].rotateAngleX = -0.19373155F;

		bodyModel[355].addShapeBox(-6F, -10.5F, -4.5F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[355].setRotationPoint(0F, 0F, -31F);
		bodyModel[355].rotateAngleX = -0.19373155F;

		bodyModel[356].addShapeBox(-12F, -9.5F, 1.5F, 2, 2, 2, 0F,0F, -0.1F, -1.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.9F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.9F); // Box 558
		bodyModel[356].setRotationPoint(0F, 0F, 31F);
		bodyModel[356].rotateAngleX = 0.19373155F;

		bodyModel[357].addShapeBox(-10F, -9.5F, 1.5F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 559
		bodyModel[357].setRotationPoint(0F, 0F, 31F);
		bodyModel[357].rotateAngleX = 0.19373155F;

		bodyModel[358].addShapeBox(-8F, -10F, 1F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[358].setRotationPoint(0F, 0F, 31F);
		bodyModel[358].rotateAngleX = 0.19373155F;

		bodyModel[359].addShapeBox(-8F, -9F, 1F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[359].setRotationPoint(0F, 0F, 31F);
		bodyModel[359].rotateAngleX = 0.19373155F;

		bodyModel[360].addShapeBox(-8F, -8F, 1F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 562
		bodyModel[360].setRotationPoint(0F, 0F, 31F);
		bodyModel[360].rotateAngleX = 0.19373155F;

		bodyModel[361].addShapeBox(-6F, -10.5F, 3.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 563
		bodyModel[361].setRotationPoint(0F, 0F, 31F);
		bodyModel[361].rotateAngleX = 0.19373155F;

		bodyModel[362].addShapeBox(-6F, -10.5F, 0.5F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[362].setRotationPoint(0F, 0F, 31F);
		bodyModel[362].rotateAngleX = 0.19373155F;

		bodyModel[363].addShapeBox(-3F, -10F, 2F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, -1F); // Box 565
		bodyModel[363].setRotationPoint(0F, 0F, 31F);
		bodyModel[363].rotateAngleX = 0.19373155F;

		bodyModel[364].addShapeBox(-3F, -9F, 2F, 10, 1, 3, 0F,0F, 0F, 1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, -1F); // Box 566
		bodyModel[364].setRotationPoint(0F, 0F, 31F);
		bodyModel[364].rotateAngleX = 0.19373155F;

		bodyModel[365].addShapeBox(-3F, -8F, 2F, 10, 1, 3, 0F,0F, 0F, 1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, -1F, 0F, 0F, -2F); // Box 567
		bodyModel[365].setRotationPoint(0F, 0F, 31F);
		bodyModel[365].rotateAngleX = 0.19373155F;

		bodyModel[366].addShapeBox(7F, -4F, -14F, 3, 1, 18, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 568
		bodyModel[366].setRotationPoint(0F, 0F, 31F);
		bodyModel[366].rotateAngleX = 0.19373155F;

		bodyModel[367].addShapeBox(7F, -4F, 2F, 2, 1, 3, 0F,0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[367].setRotationPoint(0F, 0F, 31F);
		bodyModel[367].rotateAngleX = 0.19373155F;

		bodyModel[368].addShapeBox(7F, -3F, -14F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 570
		bodyModel[368].setRotationPoint(0F, 0F, 31F);
		bodyModel[368].rotateAngleX = 0.19373155F;

		bodyModel[369].addShapeBox(7F, -3F, 2F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[369].setRotationPoint(0F, 0F, 31F);
		bodyModel[369].rotateAngleX = 0.19373155F;

		bodyModel[370].addShapeBox(7F, -2F, 2F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 572
		bodyModel[370].setRotationPoint(0F, 0F, 31F);
		bodyModel[370].rotateAngleX = 0.19373155F;

		bodyModel[371].addShapeBox(7F, -2F, -14F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F); // Box 573
		bodyModel[371].setRotationPoint(0F, 0F, 31F);
		bodyModel[371].rotateAngleX = 0.19373155F;

		bodyModel[372].addBox(-14F, -15F, 16F, 2, 34, 2, 0F); // Box 574
		bodyModel[372].setRotationPoint(0F, -30F, 0F);

		bodyModel[373].addBox(-14F, -15F, -18F, 2, 34, 2, 0F); // Box 575
		bodyModel[373].setRotationPoint(0F, -30F, 0F);

		bodyModel[374].addBox(-1F, -1F, 13F, 2, 32, 1, 0F); // Box 576
		bodyModel[374].setRotationPoint(-13F, -42F, 5F);
		bodyModel[374].rotateAngleZ = -0.15707963F;

		bodyModel[375].addShapeBox(-3F, 15F, 13F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 577
		bodyModel[375].setRotationPoint(-13F, -42F, 5F);
		bodyModel[375].rotateAngleZ = -0.15707963F;

		bodyModel[376].addBox(-3F, 15F, -23F, 1, 2, 36, 0F); // Box 578
		bodyModel[376].setRotationPoint(-13F, -42F, 5F);
		bodyModel[376].rotateAngleZ = -0.15707963F;

		bodyModel[377].addBox(-3F, 24F, -23F, 1, 2, 36, 0F); // Box 579
		bodyModel[377].setRotationPoint(-13F, -42F, 5F);
		bodyModel[377].rotateAngleZ = -0.15707963F;

		bodyModel[378].addShapeBox(-3F, 24F, 13F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 580
		bodyModel[378].setRotationPoint(-13F, -42F, 5F);
		bodyModel[378].rotateAngleZ = -0.15707963F;

		bodyModel[379].addShapeBox(-3F, 15F, -24F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		bodyModel[379].setRotationPoint(-13F, -42F, 5F);
		bodyModel[379].rotateAngleZ = -0.15707963F;

		bodyModel[380].addBox(-1F, -1F, -24F, 2, 32, 1, 0F); // Box 582
		bodyModel[380].setRotationPoint(-13F, -42F, 5F);
		bodyModel[380].rotateAngleZ = -0.15707963F;

		bodyModel[381].addShapeBox(-3F, 24F, -24F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[381].setRotationPoint(-13F, -42F, 5F);
		bodyModel[381].rotateAngleZ = -0.15707963F;

		bodyModel[382].addBox(17F, -3.5F, -15F, 3, 22, 30, 0F); // Box 584
		bodyModel[382].setRotationPoint(-33F, -30F, 0F);

		bodyModel[383].addShapeBox(-17F, -5.5F, -15F, 4, 2, 30, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[383].setRotationPoint(0F, -30F, 0F);

		bodyModel[384].addShapeBox(-14F, -7.5F, 3F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[384].setRotationPoint(0F, -30F, 0F);

		bodyModel[385].addShapeBox(-14F, -6.5F, 11F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[385].setRotationPoint(0F, -30F, 0F);

		bodyModel[386].addShapeBox(-14F, -7.5F, -5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[386].setRotationPoint(0F, -30F, 0F);

		bodyModel[387].addShapeBox(-14F, -6.5F, -13F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[387].setRotationPoint(0F, -30F, 0F);

		bodyModel[388].addBox(-17F, -1.5F, -15F, 1, 18, 2, 0F); // Box 590
		bodyModel[388].setRotationPoint(0F, -30F, 0F);

		bodyModel[389].addShapeBox(-17F, -3.5F, -15F, 1, 2, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		bodyModel[389].setRotationPoint(0F, -30F, 0F);

		bodyModel[390].addBox(-17F, -1.5F, -12F, 1, 18, 2, 0F); // Box 592
		bodyModel[390].setRotationPoint(0F, -30F, 0F);

		bodyModel[391].addBox(-17F, -1.5F, -9F, 1, 18, 2, 0F); // Box 593
		bodyModel[391].setRotationPoint(0F, -30F, 0F);

		bodyModel[392].addBox(-17F, -1.5F, -6F, 1, 18, 2, 0F); // Box 594
		bodyModel[392].setRotationPoint(0F, -30F, 0F);

		bodyModel[393].addBox(-17F, -1.5F, -3F, 1, 18, 2, 0F); // Box 595
		bodyModel[393].setRotationPoint(0F, -30F, 0F);

		bodyModel[394].addBox(-17F, -1.5F, 1F, 1, 18, 2, 0F); // Box 596
		bodyModel[394].setRotationPoint(0F, -30F, 0F);

		bodyModel[395].addBox(-17F, -1.5F, 4F, 1, 18, 2, 0F); // Box 597
		bodyModel[395].setRotationPoint(0F, -30F, 0F);

		bodyModel[396].addBox(-17F, -1.5F, 7F, 1, 18, 2, 0F); // Box 598
		bodyModel[396].setRotationPoint(0F, -30F, 0F);

		bodyModel[397].addBox(-17F, -1.5F, 10F, 1, 18, 2, 0F); // Box 599
		bodyModel[397].setRotationPoint(0F, -30F, 0F);

		bodyModel[398].addBox(-17F, -1.5F, 13F, 1, 18, 2, 0F); // Box 600
		bodyModel[398].setRotationPoint(0F, -30F, 0F);

		bodyModel[399].addShapeBox(-17F, 16.5F, -15F, 1, 2, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		bodyModel[399].setRotationPoint(0F, -30F, 0F);

		bodyModel[400].addShapeBox(-40F, -28F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 602
		bodyModel[400].setRotationPoint(-13F, 0F, -31F);
		bodyModel[400].rotateAngleX = -0.19373155F;
		bodyModel[400].rotateAngleY = -0.0296706F;

		bodyModel[401].addShapeBox(37F, -28F, -1F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[401].setRotationPoint(12F, 0F, 31F);
		bodyModel[401].rotateAngleX = 0.19373155F;
		bodyModel[401].rotateAngleY = -0.0296706F;

		bodyModel[402].addShapeBox(-6F, 15F, -9.5F, 1, 2, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 604
		bodyModel[402].setRotationPoint(-13F, -42F, 0F);
		bodyModel[402].rotateAngleZ = -0.15707963F;

		bodyModel[403].addShapeBox(-5F, 15F, -6.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[403].setRotationPoint(-13F, -42F, 0F);
		bodyModel[403].rotateAngleZ = -0.15707963F;

		bodyModel[404].addShapeBox(-5F, 15F, 8.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[404].setRotationPoint(-13F, -42F, 0F);
		bodyModel[404].rotateAngleZ = -0.15707963F;

		bodyModel[405].addShapeBox(-5F, 15F, 5.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[405].setRotationPoint(-13F, -42F, 0F);
		bodyModel[405].rotateAngleZ = -0.15707963F;

		bodyModel[406].addShapeBox(-5F, 15F, -3.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		bodyModel[406].setRotationPoint(-13F, -42F, 0F);
		bodyModel[406].rotateAngleZ = -0.15707963F;

		bodyModel[407].addShapeBox(-5F, 15F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[407].setRotationPoint(-13F, -42F, 0F);
		bodyModel[407].rotateAngleZ = -0.15707963F;

		bodyModel[408].addShapeBox(-5F, 15F, 2.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		bodyModel[408].setRotationPoint(-13F, -42F, 0F);
		bodyModel[408].rotateAngleZ = -0.15707963F;

		bodyModel[409].addShapeBox(-5F, 15F, -9.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[409].setRotationPoint(-13F, -42F, 0F);
		bodyModel[409].rotateAngleZ = -0.15707963F;

		bodyModel[410].addShapeBox(-7F, 24F, -9.5F, 1, 2, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 612
		bodyModel[410].setRotationPoint(-13F, -42F, 0F);
		bodyModel[410].rotateAngleZ = -0.15707963F;

		bodyModel[411].addShapeBox(-6F, 24F, 8.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		bodyModel[411].setRotationPoint(-13F, -42F, 0F);
		bodyModel[411].rotateAngleZ = -0.15707963F;

		bodyModel[412].addShapeBox(-6F, 24F, 5.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		bodyModel[412].setRotationPoint(-13F, -42F, 0F);
		bodyModel[412].rotateAngleZ = -0.15707963F;

		bodyModel[413].addShapeBox(-6F, 24F, 2.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[413].setRotationPoint(-13F, -42F, 0F);
		bodyModel[413].rotateAngleZ = -0.15707963F;

		bodyModel[414].addShapeBox(-6F, 24F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[414].setRotationPoint(-13F, -42F, 0F);
		bodyModel[414].rotateAngleZ = -0.15707963F;

		bodyModel[415].addShapeBox(-6F, 24F, -3.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		bodyModel[415].setRotationPoint(-13F, -42F, 0F);
		bodyModel[415].rotateAngleZ = -0.15707963F;

		bodyModel[416].addShapeBox(-6F, 24F, -6.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		bodyModel[416].setRotationPoint(-13F, -42F, 0F);
		bodyModel[416].rotateAngleZ = -0.15707963F;

		bodyModel[417].addShapeBox(-6F, 24F, -9.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		bodyModel[417].setRotationPoint(-13F, -42F, 0F);
		bodyModel[417].rotateAngleZ = -0.15707963F;

		bodyModel[418].addShapeBox(-21F, -4.5F, 27.5F, 22, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 813
		bodyModel[418].setRotationPoint(37F, 7F, 0F);

		bodyModel[419].addShapeBox(-21F, 0.5F, 27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		bodyModel[419].setRotationPoint(37F, 7F, 0F);

		bodyModel[420].addShapeBox(-21F, -5.5F, 27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
		bodyModel[420].setRotationPoint(37F, 7F, 0F);

		bodyModel[421].addShapeBox(-20F, -5.5F, 20.5F, 20, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[421].setRotationPoint(37F, 7F, 0F);

		bodyModel[422].addShapeBox(-21F, -5.5F, 19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[422].setRotationPoint(37F, 7F, 0F);

		bodyModel[423].addShapeBox(-21F, 0.5F, 19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		bodyModel[423].setRotationPoint(37F, 7F, 0F);

		bodyModel[424].addShapeBox(-21F, -4.5F, 19.5F, 22, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[424].setRotationPoint(37F, 7F, 0F);

		bodyModel[425].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		bodyModel[425].setRotationPoint(37F, 7F, 0F);

		bodyModel[426].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		bodyModel[426].setRotationPoint(32F, 7F, 0F);

		bodyModel[427].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[427].setRotationPoint(27F, 7F, 0F);

		bodyModel[428].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[428].setRotationPoint(22F, 7F, 0F);

		bodyModel[429].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		bodyModel[429].setRotationPoint(17F, 7F, 0F);

		bodyModel[430].addShapeBox(-14F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		bodyModel[430].setRotationPoint(37F, 7F, 0F);

		bodyModel[431].addShapeBox(-7F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		bodyModel[431].setRotationPoint(37F, 7F, 0F);

		bodyModel[432].addShapeBox(-13F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 771
		bodyModel[432].setRotationPoint(37F, 7F, 0F);

		bodyModel[433].addShapeBox(-15F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 772
		bodyModel[433].setRotationPoint(37F, 7F, 0F);

		bodyModel[434].addShapeBox(-8F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 773
		bodyModel[434].setRotationPoint(37F, 7F, 0F);

		bodyModel[435].addShapeBox(-6F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 774
		bodyModel[435].setRotationPoint(37F, 7F, 0F);

		bodyModel[436].addShapeBox(-16F, -9.5F, 21.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 775
		bodyModel[436].setRotationPoint(37F, 7F, 0F);

		bodyModel[437].addShapeBox(-9F, -9.5F, 21.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		bodyModel[437].setRotationPoint(37F, 7F, 0F);

		bodyModel[438].addShapeBox(-17F, -10.5F, 22.5F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 777
		bodyModel[438].setRotationPoint(37F, 7F, 0F);

		bodyModel[439].addShapeBox(-17F, -13.5F, 23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 778
		bodyModel[439].setRotationPoint(37F, 7F, 0F);

		bodyModel[440].addShapeBox(-6F, -13.5F, 23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 779
		bodyModel[440].setRotationPoint(37F, 7F, 0F);

		bodyModel[441].addShapeBox(-5F, -12.5F, 22.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 780
		bodyModel[441].setRotationPoint(37F, 7F, 0F);

		bodyModel[442].addShapeBox(-16F, -12.5F, 22.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		bodyModel[442].setRotationPoint(37F, 7F, 0F);

		bodyModel[443].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		bodyModel[443].setRotationPoint(-10F, 7F, 0F);

		bodyModel[444].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 783
		bodyModel[444].setRotationPoint(-5F, 7F, 0F);

		bodyModel[445].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		bodyModel[445].setRotationPoint(0F, 7F, 0F);

		bodyModel[446].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 785
		bodyModel[446].setRotationPoint(5F, 7F, 0F);

		bodyModel[447].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		bodyModel[447].setRotationPoint(10F, 7F, 0F);

		bodyModel[448].addShapeBox(-21F, 0.5F, 27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 787
		bodyModel[448].setRotationPoint(10F, 7F, 0F);

		bodyModel[449].addShapeBox(-21F, -4.5F, 27.5F, 22, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 813
		bodyModel[449].setRotationPoint(10F, 7F, 0F);

		bodyModel[450].addShapeBox(-21F, -5.5F, 27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		bodyModel[450].setRotationPoint(10F, 7F, 0F);

		bodyModel[451].addShapeBox(-20F, -5.5F, 20.5F, 20, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 790
		bodyModel[451].setRotationPoint(10F, 7F, 0F);

		bodyModel[452].addShapeBox(-21F, -5.5F, 19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		bodyModel[452].setRotationPoint(10F, 7F, 0F);

		bodyModel[453].addShapeBox(-21F, -4.5F, 19.5F, 22, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		bodyModel[453].setRotationPoint(10F, 7F, 0F);

		bodyModel[454].addShapeBox(-21F, 0.5F, 19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		bodyModel[454].setRotationPoint(10F, 7F, 0F);

		bodyModel[455].addShapeBox(-15F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 794
		bodyModel[455].setRotationPoint(10F, 7F, 0F);

		bodyModel[456].addShapeBox(-13F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 795
		bodyModel[456].setRotationPoint(10F, 7F, 0F);

		bodyModel[457].addShapeBox(-14F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 796
		bodyModel[457].setRotationPoint(10F, 7F, 0F);

		bodyModel[458].addShapeBox(-8F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 797
		bodyModel[458].setRotationPoint(10F, 7F, 0F);

		bodyModel[459].addShapeBox(-7F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		bodyModel[459].setRotationPoint(10F, 7F, 0F);

		bodyModel[460].addShapeBox(-6F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 799
		bodyModel[460].setRotationPoint(10F, 7F, 0F);

		bodyModel[461].addShapeBox(-9F, -9.5F, 21.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 800
		bodyModel[461].setRotationPoint(10F, 7F, 0F);

		bodyModel[462].addShapeBox(-16F, -9.5F, 21.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
		bodyModel[462].setRotationPoint(10F, 7F, 0F);

		bodyModel[463].addShapeBox(-17F, -10.5F, 22.5F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		bodyModel[463].setRotationPoint(10F, 7F, 0F);

		bodyModel[464].addShapeBox(-17F, -13.5F, 23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 803
		bodyModel[464].setRotationPoint(10F, 7F, 0F);

		bodyModel[465].addShapeBox(-16F, -12.5F, 22.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		bodyModel[465].setRotationPoint(10F, 7F, 0F);

		bodyModel[466].addShapeBox(-6F, -13.5F, 23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		bodyModel[466].setRotationPoint(10F, 7F, 0F);

		bodyModel[467].addShapeBox(-5F, -12.5F, 22.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		bodyModel[467].setRotationPoint(10F, 7F, 0F);

		bodyModel[468].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 807
		bodyModel[468].setRotationPoint(-37F, 7F, 0F);

		bodyModel[469].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		bodyModel[469].setRotationPoint(-32F, 7F, 0F);

		bodyModel[470].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		bodyModel[470].setRotationPoint(-27F, 7F, 0F);

		bodyModel[471].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		bodyModel[471].setRotationPoint(-22F, 7F, 0F);

		bodyModel[472].addShapeBox(-0.5F, -0.5F, 19.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
		bodyModel[472].setRotationPoint(-17F, 7F, 0F);

		bodyModel[473].addShapeBox(-21F, 0.5F, 27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		bodyModel[473].setRotationPoint(-17F, 7F, 0F);

		bodyModel[474].addShapeBox(-21F, -4.5F, 27.5F, 22, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 813
		bodyModel[474].setRotationPoint(-17F, 7F, 0F);

		bodyModel[475].addShapeBox(-21F, -5.5F, 27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814
		bodyModel[475].setRotationPoint(-17F, 7F, 0F);

		bodyModel[476].addShapeBox(-20F, -5.5F, 20.5F, 20, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		bodyModel[476].setRotationPoint(-17F, 7F, 0F);

		bodyModel[477].addShapeBox(-21F, -5.5F, 19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 816
		bodyModel[477].setRotationPoint(-17F, 7F, 0F);

		bodyModel[478].addShapeBox(-21F, -4.5F, 19.5F, 22, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		bodyModel[478].setRotationPoint(-17F, 7F, 0F);

		bodyModel[479].addShapeBox(-21F, 0.5F, 19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 818
		bodyModel[479].setRotationPoint(-17F, 7F, 0F);

		bodyModel[480].addShapeBox(-15F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 819
		bodyModel[480].setRotationPoint(-17F, 7F, 0F);

		bodyModel[481].addShapeBox(-13F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 820
		bodyModel[481].setRotationPoint(-17F, 7F, 0F);

		bodyModel[482].addShapeBox(-14F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 821
		bodyModel[482].setRotationPoint(-17F, 7F, 0F);

		bodyModel[483].addShapeBox(-8F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 822
		bodyModel[483].setRotationPoint(-17F, 7F, 0F);

		bodyModel[484].addShapeBox(-7F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 823
		bodyModel[484].setRotationPoint(-17F, 7F, 0F);

		bodyModel[485].addShapeBox(-6F, -8.5F, 22.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 824
		bodyModel[485].setRotationPoint(-17F, 7F, 0F);

		bodyModel[486].addShapeBox(-9F, -9.5F, 21.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 825
		bodyModel[486].setRotationPoint(-17F, 7F, 0F);

		bodyModel[487].addShapeBox(-16F, -9.5F, 21.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		bodyModel[487].setRotationPoint(-17F, 7F, 0F);

		bodyModel[488].addShapeBox(-17F, -10.5F, 22.5F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 827
		bodyModel[488].setRotationPoint(-17F, 7F, 0F);

		bodyModel[489].addShapeBox(-17F, -13.5F, 23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 828
		bodyModel[489].setRotationPoint(-17F, 7F, 0F);

		bodyModel[490].addShapeBox(-16F, -12.5F, 22.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 829
		bodyModel[490].setRotationPoint(-17F, 7F, 0F);

		bodyModel[491].addShapeBox(-6F, -13.5F, 23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 830
		bodyModel[491].setRotationPoint(-17F, 7F, 0F);

		bodyModel[492].addShapeBox(-5F, -12.5F, 22.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 831
		bodyModel[492].setRotationPoint(-17F, 7F, 0F);

		bodyModel[493].addShapeBox(-53F, 0.5F, -17F, 106, 13, 34, 0F,5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[493].setRotationPoint(0F, -11F, 0F);

		bodyModel[494].addShapeBox(-17F, -12.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[494].setRotationPoint(-17F, 7F, 0F);

		bodyModel[495].addShapeBox(-17F, -13.5F, 16.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[495].setRotationPoint(-17F, 7F, 0F);

		bodyModel[496].addShapeBox(-17F, -11.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 48
		bodyModel[496].setRotationPoint(-17F, 7F, 0F);

		bodyModel[497].addShapeBox(-17F, -11.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 49
		bodyModel[497].setRotationPoint(-6F, 7F, 0F);

		bodyModel[498].addShapeBox(-17F, -13.5F, 16.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[498].setRotationPoint(-6F, 7F, 0F);

		bodyModel[499].addShapeBox(-17F, -12.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[499].setRotationPoint(-6F, 7F, 0F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 585, 129, textureX, textureY); // Box 52
		bodyModel[501] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 53
		bodyModel[502] = new ModelRendererTurbo(this, 633, 129, textureX, textureY); // Box 54
		bodyModel[503] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 55
		bodyModel[504] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 56
		bodyModel[505] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 57
		bodyModel[506] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 58
		bodyModel[507] = new ModelRendererTurbo(this, 513, 145, textureX, textureY); // Box 59
		bodyModel[508] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Box 60
		bodyModel[509] = new ModelRendererTurbo(this, 561, 145, textureX, textureY); // Box 61
		bodyModel[510] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Box 62
		bodyModel[511] = new ModelRendererTurbo(this, 609, 145, textureX, textureY); // Box 63
		bodyModel[512] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Box 1
		bodyModel[513] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 2
		bodyModel[514] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Box 3
		bodyModel[515] = new ModelRendererTurbo(this, 657, 145, textureX, textureY); // Box 4
		bodyModel[516] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Box 5
		bodyModel[517] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 6
		bodyModel[518] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 7
		bodyModel[519] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 8
		bodyModel[520] = new ModelRendererTurbo(this, 625, 153, textureX, textureY); // Box 9
		bodyModel[521] = new ModelRendererTurbo(this, 641, 153, textureX, textureY); // Box 10
		bodyModel[522] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 11
		bodyModel[523] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 12
		bodyModel[524] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Box 13
		bodyModel[525] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 14
		bodyModel[526] = new ModelRendererTurbo(this, 737, 153, textureX, textureY); // Box 15
		bodyModel[527] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 16
		bodyModel[528] = new ModelRendererTurbo(this, 761, 153, textureX, textureY); // Box 17
		bodyModel[529] = new ModelRendererTurbo(this, 777, 153, textureX, textureY); // Box 18
		bodyModel[530] = new ModelRendererTurbo(this, 793, 153, textureX, textureY); // Box 19
		bodyModel[531] = new ModelRendererTurbo(this, 801, 153, textureX, textureY); // Box 20
		bodyModel[532] = new ModelRendererTurbo(this, 809, 153, textureX, textureY); // Box 21
		bodyModel[533] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Box 22
		bodyModel[534] = new ModelRendererTurbo(this, 857, 153, textureX, textureY); // Box 23
		bodyModel[535] = new ModelRendererTurbo(this, 873, 153, textureX, textureY); // Box 24
		bodyModel[536] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 25
		bodyModel[537] = new ModelRendererTurbo(this, 897, 153, textureX, textureY); // Box 26
		bodyModel[538] = new ModelRendererTurbo(this, 721, 129, textureX, textureY); // Box 27
		bodyModel[539] = new ModelRendererTurbo(this, 913, 153, textureX, textureY); // Box 28
		bodyModel[540] = new ModelRendererTurbo(this, 945, 153, textureX, textureY); // Box 29
		bodyModel[541] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 30
		bodyModel[542] = new ModelRendererTurbo(this, 1009, 153, textureX, textureY); // Box 31
		bodyModel[543] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Box 32
		bodyModel[544] = new ModelRendererTurbo(this, 521, 161, textureX, textureY); // Box 33
		bodyModel[545] = new ModelRendererTurbo(this, 537, 161, textureX, textureY); // Box 34
		bodyModel[546] = new ModelRendererTurbo(this, 545, 161, textureX, textureY); // Box 35
		bodyModel[547] = new ModelRendererTurbo(this, 561, 161, textureX, textureY); // Box 36
		bodyModel[548] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 37
		bodyModel[549] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 38
		bodyModel[550] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Box 39
		bodyModel[551] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 40
		bodyModel[552] = new ModelRendererTurbo(this, 649, 161, textureX, textureY); // Box 41
		bodyModel[553] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Box 42
		bodyModel[554] = new ModelRendererTurbo(this, 681, 161, textureX, textureY); // Box 43
		bodyModel[555] = new ModelRendererTurbo(this, 689, 161, textureX, textureY); // Box 44
		bodyModel[556] = new ModelRendererTurbo(this, 705, 161, textureX, textureY); // Box 45
		bodyModel[557] = new ModelRendererTurbo(this, 713, 161, textureX, textureY); // Box 46
		bodyModel[558] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 47
		bodyModel[559] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Box 48
		bodyModel[560] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 49
		bodyModel[561] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Box 50
		bodyModel[562] = new ModelRendererTurbo(this, 913, 161, textureX, textureY); // Box 51
		bodyModel[563] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 52
		bodyModel[564] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 53
		bodyModel[565] = new ModelRendererTurbo(this, 953, 161, textureX, textureY); // Box 54
		bodyModel[566] = new ModelRendererTurbo(this, 977, 161, textureX, textureY); // Box 55
		bodyModel[567] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 56
		bodyModel[568] = new ModelRendererTurbo(this, 545, 169, textureX, textureY); // Box 68
		bodyModel[569] = new ModelRendererTurbo(this, 513, 169, textureX, textureY); // Box 69
		bodyModel[570] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Box 70
		bodyModel[571] = new ModelRendererTurbo(this, 649, 169, textureX, textureY); // Box 82
		bodyModel[572] = new ModelRendererTurbo(this, 577, 169, textureX, textureY); // Box 83
		bodyModel[573] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Box 84
		bodyModel[574] = new ModelRendererTurbo(this, 569, 169, textureX, textureY); // Box 85
		bodyModel[575] = new ModelRendererTurbo(this, 705, 169, textureX, textureY); // Box 86
		bodyModel[576] = new ModelRendererTurbo(this, 673, 169, textureX, textureY); // Box 87
		bodyModel[577] = new ModelRendererTurbo(this, 721, 169, textureX, textureY); // Box 88
		bodyModel[578] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Box 89
		bodyModel[579] = new ModelRendererTurbo(this, 737, 169, textureX, textureY); // Box 90
		bodyModel[580] = new ModelRendererTurbo(this, 745, 169, textureX, textureY); // Box 91
		bodyModel[581] = new ModelRendererTurbo(this, 817, 169, textureX, textureY); // Box 92
		bodyModel[582] = new ModelRendererTurbo(this, 761, 169, textureX, textureY); // Box 93
		bodyModel[583] = new ModelRendererTurbo(this, 953, 169, textureX, textureY); // Box 94
		bodyModel[584] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Box 95
		bodyModel[585] = new ModelRendererTurbo(this, 737, 201, textureX, textureY); // Box 793
		bodyModel[586] = new ModelRendererTurbo(this, 849, 201, textureX, textureY); // Box 794
		bodyModel[587] = new ModelRendererTurbo(this, 681, 209, textureX, textureY); // Box 795
		bodyModel[588] = new ModelRendererTurbo(this, 729, 209, textureX, textureY); // Box 796
		bodyModel[589] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 797
		bodyModel[590] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 798
		bodyModel[591] = new ModelRendererTurbo(this, 825, 209, textureX, textureY); // Box 799
		bodyModel[592] = new ModelRendererTurbo(this, 905, 193, textureX, textureY); // Box 800
		bodyModel[593] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 801
		bodyModel[594] = new ModelRendererTurbo(this, 969, 193, textureX, textureY); // Box 802
		bodyModel[595] = new ModelRendererTurbo(this, 1001, 193, textureX, textureY); // Box 803
		bodyModel[596] = new ModelRendererTurbo(this, 873, 209, textureX, textureY); // Box 804
		bodyModel[597] = new ModelRendererTurbo(this, 921, 209, textureX, textureY); // Box 805
		bodyModel[598] = new ModelRendererTurbo(this, 601, 209, textureX, textureY); // Box 806
		bodyModel[599] = new ModelRendererTurbo(this, 969, 209, textureX, textureY); // Box 807
		bodyModel[600] = new ModelRendererTurbo(this, 633, 209, textureX, textureY); // Box 808
		bodyModel[601] = new ModelRendererTurbo(this, 513, 217, textureX, textureY); // Box 809
		bodyModel[602] = new ModelRendererTurbo(this, 537, 217, textureX, textureY); // Box 810
		bodyModel[603] = new ModelRendererTurbo(this, 561, 217, textureX, textureY); // Box 811
		bodyModel[604] = new ModelRendererTurbo(this, 737, 217, textureX, textureY); // Box 812
		bodyModel[605] = new ModelRendererTurbo(this, 785, 217, textureX, textureY); // Box 813
		bodyModel[606] = new ModelRendererTurbo(this, 825, 217, textureX, textureY); // Box 814
		bodyModel[607] = new ModelRendererTurbo(this, 873, 217, textureX, textureY); // Box 815
		bodyModel[608] = new ModelRendererTurbo(this, 785, 185, textureX, textureY); // Box 816
		bodyModel[609] = new ModelRendererTurbo(this, 681, 201, textureX, textureY); // Box 817
		bodyModel[610] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 818
		bodyModel[611] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 819
		bodyModel[612] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); // Box 820
		bodyModel[613] = new ModelRendererTurbo(this, 553, 129, textureX, textureY); // Box 821
		bodyModel[614] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 822
		bodyModel[615] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 823
		bodyModel[616] = new ModelRendererTurbo(this, 913, 217, textureX, textureY); // Box 824
		bodyModel[617] = new ModelRendererTurbo(this, 577, 217, textureX, textureY); // Box 825
		bodyModel[618] = new ModelRendererTurbo(this, 617, 217, textureX, textureY); // Box 826
		bodyModel[619] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 827
		bodyModel[620] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Box 828
		bodyModel[621] = new ModelRendererTurbo(this, 673, 129, textureX, textureY); // Box 829
		bodyModel[622] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 830
		bodyModel[623] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 831
		bodyModel[624] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Box 832
		bodyModel[625] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Box 833
		bodyModel[626] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Box 834
		bodyModel[627] = new ModelRendererTurbo(this, 601, 145, textureX, textureY); // Box 835
		bodyModel[628] = new ModelRendererTurbo(this, 649, 217, textureX, textureY); // Box 836
		bodyModel[629] = new ModelRendererTurbo(this, 953, 217, textureX, textureY); // Box 837
		bodyModel[630] = new ModelRendererTurbo(this, 985, 217, textureX, textureY); // Box 838
		bodyModel[631] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 839
		bodyModel[632] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 840
		bodyModel[633] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 841
		bodyModel[634] = new ModelRendererTurbo(this, 625, 145, textureX, textureY); // Box 842
		bodyModel[635] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Box 843
		bodyModel[636] = new ModelRendererTurbo(this, 625, 177, textureX, textureY); // Box 844
		bodyModel[637] = new ModelRendererTurbo(this, 649, 177, textureX, textureY); // Box 845
		bodyModel[638] = new ModelRendererTurbo(this, 1009, 177, textureX, textureY); // Box 846
		bodyModel[639] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 847
		bodyModel[640] = new ModelRendererTurbo(this, 585, 225, textureX, textureY); // Box 848
		bodyModel[641] = new ModelRendererTurbo(this, 625, 225, textureX, textureY); // Box 849
		bodyModel[642] = new ModelRendererTurbo(this, 673, 225, textureX, textureY); // Box 850
		bodyModel[643] = new ModelRendererTurbo(this, 721, 225, textureX, textureY); // Box 851
		bodyModel[644] = new ModelRendererTurbo(this, 769, 225, textureX, textureY); // Box 852
		bodyModel[645] = new ModelRendererTurbo(this, 1001, 217, textureX, textureY); // Box 853
		bodyModel[646] = new ModelRendererTurbo(this, 809, 225, textureX, textureY); // Box 854
		bodyModel[647] = new ModelRendererTurbo(this, 873, 225, textureX, textureY); // Box 855
		bodyModel[648] = new ModelRendererTurbo(this, 897, 225, textureX, textureY); // Box 856
		bodyModel[649] = new ModelRendererTurbo(this, 921, 225, textureX, textureY); // Box 857
		bodyModel[650] = new ModelRendererTurbo(this, 937, 225, textureX, textureY); // Box 858
		bodyModel[651] = new ModelRendererTurbo(this, 513, 233, textureX, textureY); // Box 859
		bodyModel[652] = new ModelRendererTurbo(this, 561, 233, textureX, textureY); // Box 860
		bodyModel[653] = new ModelRendererTurbo(this, 681, 233, textureX, textureY); // Box 861
		bodyModel[654] = new ModelRendererTurbo(this, 977, 225, textureX, textureY); // Box 862
		bodyModel[655] = new ModelRendererTurbo(this, 601, 233, textureX, textureY); // Box 863
		bodyModel[656] = new ModelRendererTurbo(this, 721, 233, textureX, textureY); // Box 864
		bodyModel[657] = new ModelRendererTurbo(this, 745, 233, textureX, textureY); // Box 865
		bodyModel[658] = new ModelRendererTurbo(this, 769, 233, textureX, textureY); // Box 866
		bodyModel[659] = new ModelRendererTurbo(this, 793, 233, textureX, textureY); // Box 867
		bodyModel[660] = new ModelRendererTurbo(this, 825, 233, textureX, textureY); // Box 868
		bodyModel[661] = new ModelRendererTurbo(this, 849, 233, textureX, textureY); // Box 869
		bodyModel[662] = new ModelRendererTurbo(this, 937, 233, textureX, textureY); // Box 870
		bodyModel[663] = new ModelRendererTurbo(this, 961, 233, textureX, textureY); // Box 871
		bodyModel[664] = new ModelRendererTurbo(this, 993, 233, textureX, textureY); // Box 872
		bodyModel[665] = new ModelRendererTurbo(this, 513, 241, textureX, textureY); // Box 873
		bodyModel[666] = new ModelRendererTurbo(this, 537, 241, textureX, textureY); // Box 874
		bodyModel[667] = new ModelRendererTurbo(this, 561, 241, textureX, textureY); // Box 875
		bodyModel[668] = new ModelRendererTurbo(this, 585, 241, textureX, textureY); // Box 876
		bodyModel[669] = new ModelRendererTurbo(this, 617, 241, textureX, textureY); // Box 877
		bodyModel[670] = new ModelRendererTurbo(this, 641, 241, textureX, textureY); // Box 878
		bodyModel[671] = new ModelRendererTurbo(this, 665, 241, textureX, textureY); // Box 879
		bodyModel[672] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 971
		bodyModel[673] = new ModelRendererTurbo(this, 513, 201, textureX, textureY); // Box 972
		bodyModel[674] = new ModelRendererTurbo(this, 809, 201, textureX, textureY); // Box 973
		bodyModel[675] = new ModelRendererTurbo(this, 841, 201, textureX, textureY); // Box 974
		bodyModel[676] = new ModelRendererTurbo(this, 897, 201, textureX, textureY); // Box 975
		bodyModel[677] = new ModelRendererTurbo(this, 513, 217, textureX, textureY); // Box 976
		bodyModel[678] = new ModelRendererTurbo(this, 617, 265, textureX, textureY); // Box 977
		bodyModel[679] = new ModelRendererTurbo(this, 657, 265, textureX, textureY); // Box 979
		bodyModel[680] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 980
		bodyModel[681] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 981
		bodyModel[682] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 982
		bodyModel[683] = new ModelRendererTurbo(this, 681, 265, textureX, textureY); // Box 983
		bodyModel[684] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 984
		bodyModel[685] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 32
		bodyModel[686] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 32
		bodyModel[687] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 32
		bodyModel[688] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 32
		bodyModel[689] = new ModelRendererTurbo(this, 27, 413, textureX, textureY); // Box 0
		bodyModel[690] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1
		bodyModel[691] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 2
		bodyModel[692] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 3
		bodyModel[693] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 4
		bodyModel[694] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 5
		bodyModel[695] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 6
		bodyModel[696] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 7
		bodyModel[697] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 8
		bodyModel[698] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 9
		bodyModel[699] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 10
		bodyModel[700] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 11
		bodyModel[701] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 12
		bodyModel[702] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 13
		bodyModel[703] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 14
		bodyModel[704] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 15
		bodyModel[705] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 16
		bodyModel[706] = new ModelRendererTurbo(this, 86, 413, textureX, textureY); // Box 37
		bodyModel[707] = new ModelRendererTurbo(this, 78, 413, textureX, textureY); // Box 38
		bodyModel[708] = new ModelRendererTurbo(this, 71, 414, textureX, textureY); // Box 39
		bodyModel[709] = new ModelRendererTurbo(this, 65, 414, textureX, textureY); // Box 40
		bodyModel[710] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 44
		bodyModel[711] = new ModelRendererTurbo(this, 97, 422, textureX, textureY); // Box 45
		bodyModel[712] = new ModelRendererTurbo(this, 88, 425, textureX, textureY); // Box 46
		bodyModel[713] = new ModelRendererTurbo(this, 79, 425, textureX, textureY); // Box 29
		bodyModel[714] = new ModelRendererTurbo(this, 68, 423, textureX, textureY); // Box 30
		bodyModel[715] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 31
		bodyModel[716] = new ModelRendererTurbo(this, 57, 413, textureX, textureY); // Box 32
		bodyModel[717] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 33
		bodyModel[718] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 34
		bodyModel[719] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 35
		bodyModel[720] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 985
		bodyModel[721] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 986
		bodyModel[722] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 987
		bodyModel[723] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 988
		bodyModel[724] = new ModelRendererTurbo(this, 27, 413, textureX, textureY); // Box 989
		bodyModel[725] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 990
		bodyModel[726] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 991
		bodyModel[727] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 992
		bodyModel[728] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 993
		bodyModel[729] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 994
		bodyModel[730] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 995
		bodyModel[731] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 996
		bodyModel[732] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 997
		bodyModel[733] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 998
		bodyModel[734] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 999
		bodyModel[735] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1000
		bodyModel[736] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1001
		bodyModel[737] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1002
		bodyModel[738] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1003
		bodyModel[739] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1004
		bodyModel[740] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1005
		bodyModel[741] = new ModelRendererTurbo(this, 86, 413, textureX, textureY); // Box 1006
		bodyModel[742] = new ModelRendererTurbo(this, 78, 413, textureX, textureY); // Box 1007
		bodyModel[743] = new ModelRendererTurbo(this, 71, 414, textureX, textureY); // Box 1008
		bodyModel[744] = new ModelRendererTurbo(this, 65, 414, textureX, textureY); // Box 1009
		bodyModel[745] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1010
		bodyModel[746] = new ModelRendererTurbo(this, 97, 422, textureX, textureY); // Box 1011
		bodyModel[747] = new ModelRendererTurbo(this, 88, 425, textureX, textureY); // Box 1012
		bodyModel[748] = new ModelRendererTurbo(this, 79, 425, textureX, textureY); // Box 1013
		bodyModel[749] = new ModelRendererTurbo(this, 68, 423, textureX, textureY); // Box 1014
		bodyModel[750] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1015
		bodyModel[751] = new ModelRendererTurbo(this, 57, 413, textureX, textureY); // Box 1016
		bodyModel[752] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1017
		bodyModel[753] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1018
		bodyModel[754] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1019
		bodyModel[755] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1020
		bodyModel[756] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1021
		bodyModel[757] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1022
		bodyModel[758] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1023
		bodyModel[759] = new ModelRendererTurbo(this, 27, 413, textureX, textureY); // Box 1024
		bodyModel[760] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1025
		bodyModel[761] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1026
		bodyModel[762] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1027
		bodyModel[763] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1028
		bodyModel[764] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1029
		bodyModel[765] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1030
		bodyModel[766] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1031
		bodyModel[767] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1032
		bodyModel[768] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1033
		bodyModel[769] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1034
		bodyModel[770] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1035
		bodyModel[771] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1036
		bodyModel[772] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1037
		bodyModel[773] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1038
		bodyModel[774] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1039
		bodyModel[775] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1040
		bodyModel[776] = new ModelRendererTurbo(this, 86, 413, textureX, textureY); // Box 1041
		bodyModel[777] = new ModelRendererTurbo(this, 78, 413, textureX, textureY); // Box 1042
		bodyModel[778] = new ModelRendererTurbo(this, 71, 414, textureX, textureY); // Box 1043
		bodyModel[779] = new ModelRendererTurbo(this, 65, 414, textureX, textureY); // Box 1044
		bodyModel[780] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1045
		bodyModel[781] = new ModelRendererTurbo(this, 97, 422, textureX, textureY); // Box 1046
		bodyModel[782] = new ModelRendererTurbo(this, 88, 425, textureX, textureY); // Box 1047
		bodyModel[783] = new ModelRendererTurbo(this, 79, 425, textureX, textureY); // Box 1048
		bodyModel[784] = new ModelRendererTurbo(this, 68, 423, textureX, textureY); // Box 1049
		bodyModel[785] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1050
		bodyModel[786] = new ModelRendererTurbo(this, 57, 413, textureX, textureY); // Box 1051
		bodyModel[787] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1052
		bodyModel[788] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1053
		bodyModel[789] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1054
		bodyModel[790] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1055
		bodyModel[791] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1056
		bodyModel[792] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1057
		bodyModel[793] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1058
		bodyModel[794] = new ModelRendererTurbo(this, 27, 413, textureX, textureY); // Box 1059
		bodyModel[795] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1060
		bodyModel[796] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1061
		bodyModel[797] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1062
		bodyModel[798] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1063
		bodyModel[799] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1064
		bodyModel[800] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1065
		bodyModel[801] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1066
		bodyModel[802] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1067
		bodyModel[803] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1068
		bodyModel[804] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1069
		bodyModel[805] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1070
		bodyModel[806] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1071
		bodyModel[807] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1072
		bodyModel[808] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1073
		bodyModel[809] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1074
		bodyModel[810] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1075
		bodyModel[811] = new ModelRendererTurbo(this, 86, 413, textureX, textureY); // Box 1076
		bodyModel[812] = new ModelRendererTurbo(this, 78, 413, textureX, textureY); // Box 1077
		bodyModel[813] = new ModelRendererTurbo(this, 71, 414, textureX, textureY); // Box 1078
		bodyModel[814] = new ModelRendererTurbo(this, 65, 414, textureX, textureY); // Box 1079
		bodyModel[815] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1080
		bodyModel[816] = new ModelRendererTurbo(this, 97, 422, textureX, textureY); // Box 1081
		bodyModel[817] = new ModelRendererTurbo(this, 88, 425, textureX, textureY); // Box 1082
		bodyModel[818] = new ModelRendererTurbo(this, 79, 425, textureX, textureY); // Box 1083
		bodyModel[819] = new ModelRendererTurbo(this, 68, 423, textureX, textureY); // Box 1084
		bodyModel[820] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1085
		bodyModel[821] = new ModelRendererTurbo(this, 57, 413, textureX, textureY); // Box 1086
		bodyModel[822] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1087
		bodyModel[823] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1088
		bodyModel[824] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1089
		bodyModel[825] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1230
		bodyModel[826] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1231
		bodyModel[827] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1232
		bodyModel[828] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1233
		bodyModel[829] = new ModelRendererTurbo(this, 27, 413, textureX, textureY); // Box 1234
		bodyModel[830] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1235
		bodyModel[831] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1236
		bodyModel[832] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1237
		bodyModel[833] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1238
		bodyModel[834] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1239
		bodyModel[835] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1240
		bodyModel[836] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1241
		bodyModel[837] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1242
		bodyModel[838] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1243
		bodyModel[839] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1244
		bodyModel[840] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1245
		bodyModel[841] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1246
		bodyModel[842] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1247
		bodyModel[843] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1248
		bodyModel[844] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1249
		bodyModel[845] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1250
		bodyModel[846] = new ModelRendererTurbo(this, 86, 413, textureX, textureY); // Box 1251
		bodyModel[847] = new ModelRendererTurbo(this, 78, 413, textureX, textureY); // Box 1252
		bodyModel[848] = new ModelRendererTurbo(this, 71, 414, textureX, textureY); // Box 1253
		bodyModel[849] = new ModelRendererTurbo(this, 65, 414, textureX, textureY); // Box 1254
		bodyModel[850] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1255
		bodyModel[851] = new ModelRendererTurbo(this, 97, 422, textureX, textureY); // Box 1256
		bodyModel[852] = new ModelRendererTurbo(this, 88, 425, textureX, textureY); // Box 1257
		bodyModel[853] = new ModelRendererTurbo(this, 79, 425, textureX, textureY); // Box 1258
		bodyModel[854] = new ModelRendererTurbo(this, 68, 423, textureX, textureY); // Box 1259
		bodyModel[855] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1260
		bodyModel[856] = new ModelRendererTurbo(this, 57, 413, textureX, textureY); // Box 1261
		bodyModel[857] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1262
		bodyModel[858] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1263
		bodyModel[859] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1264
		bodyModel[860] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1265
		bodyModel[861] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1266
		bodyModel[862] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1267
		bodyModel[863] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1268
		bodyModel[864] = new ModelRendererTurbo(this, 27, 413, textureX, textureY); // Box 1269
		bodyModel[865] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1270
		bodyModel[866] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1271
		bodyModel[867] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1272
		bodyModel[868] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1273
		bodyModel[869] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1274
		bodyModel[870] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1275
		bodyModel[871] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1276
		bodyModel[872] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1277
		bodyModel[873] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1278
		bodyModel[874] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1279
		bodyModel[875] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1280
		bodyModel[876] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1281
		bodyModel[877] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1282
		bodyModel[878] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1283
		bodyModel[879] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1284
		bodyModel[880] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1285
		bodyModel[881] = new ModelRendererTurbo(this, 86, 413, textureX, textureY); // Box 1286
		bodyModel[882] = new ModelRendererTurbo(this, 78, 413, textureX, textureY); // Box 1287
		bodyModel[883] = new ModelRendererTurbo(this, 71, 414, textureX, textureY); // Box 1288
		bodyModel[884] = new ModelRendererTurbo(this, 65, 414, textureX, textureY); // Box 1289
		bodyModel[885] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1290
		bodyModel[886] = new ModelRendererTurbo(this, 97, 422, textureX, textureY); // Box 1291
		bodyModel[887] = new ModelRendererTurbo(this, 88, 425, textureX, textureY); // Box 1292
		bodyModel[888] = new ModelRendererTurbo(this, 79, 425, textureX, textureY); // Box 1293
		bodyModel[889] = new ModelRendererTurbo(this, 68, 423, textureX, textureY); // Box 1294
		bodyModel[890] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1295
		bodyModel[891] = new ModelRendererTurbo(this, 57, 413, textureX, textureY); // Box 1296
		bodyModel[892] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1297
		bodyModel[893] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1298
		bodyModel[894] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1299
		bodyModel[895] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1300
		bodyModel[896] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1301
		bodyModel[897] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1302
		bodyModel[898] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1303
		bodyModel[899] = new ModelRendererTurbo(this, 27, 413, textureX, textureY); // Box 1304
		bodyModel[900] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1305
		bodyModel[901] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1306
		bodyModel[902] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1307
		bodyModel[903] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1308
		bodyModel[904] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1309
		bodyModel[905] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1310
		bodyModel[906] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1311
		bodyModel[907] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1312
		bodyModel[908] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1313
		bodyModel[909] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1314
		bodyModel[910] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1315
		bodyModel[911] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1316
		bodyModel[912] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1317
		bodyModel[913] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1318
		bodyModel[914] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1319
		bodyModel[915] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1320
		bodyModel[916] = new ModelRendererTurbo(this, 86, 413, textureX, textureY); // Box 1321
		bodyModel[917] = new ModelRendererTurbo(this, 78, 413, textureX, textureY); // Box 1322
		bodyModel[918] = new ModelRendererTurbo(this, 71, 414, textureX, textureY); // Box 1323
		bodyModel[919] = new ModelRendererTurbo(this, 65, 414, textureX, textureY); // Box 1324
		bodyModel[920] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1325
		bodyModel[921] = new ModelRendererTurbo(this, 97, 422, textureX, textureY); // Box 1326
		bodyModel[922] = new ModelRendererTurbo(this, 88, 425, textureX, textureY); // Box 1327
		bodyModel[923] = new ModelRendererTurbo(this, 79, 425, textureX, textureY); // Box 1328
		bodyModel[924] = new ModelRendererTurbo(this, 68, 423, textureX, textureY); // Box 1329
		bodyModel[925] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1330
		bodyModel[926] = new ModelRendererTurbo(this, 57, 413, textureX, textureY); // Box 1331
		bodyModel[927] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1332
		bodyModel[928] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1333
		bodyModel[929] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1334
		bodyModel[930] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1335
		bodyModel[931] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1336
		bodyModel[932] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1337
		bodyModel[933] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1338
		bodyModel[934] = new ModelRendererTurbo(this, 27, 413, textureX, textureY); // Box 1339
		bodyModel[935] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1340
		bodyModel[936] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1341
		bodyModel[937] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1342
		bodyModel[938] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1343
		bodyModel[939] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1344
		bodyModel[940] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1345
		bodyModel[941] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1346
		bodyModel[942] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1347
		bodyModel[943] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1348
		bodyModel[944] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1349
		bodyModel[945] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1350
		bodyModel[946] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1351
		bodyModel[947] = new ModelRendererTurbo(this, 161, 413, textureX, textureY); // Box 1352
		bodyModel[948] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1353
		bodyModel[949] = new ModelRendererTurbo(this, 145, 413, textureX, textureY); // Box 1354
		bodyModel[950] = new ModelRendererTurbo(this, 121, 413, textureX, textureY); // Box 1355
		bodyModel[951] = new ModelRendererTurbo(this, 86, 413, textureX, textureY); // Box 1356
		bodyModel[952] = new ModelRendererTurbo(this, 78, 413, textureX, textureY); // Box 1357
		bodyModel[953] = new ModelRendererTurbo(this, 71, 414, textureX, textureY); // Box 1358
		bodyModel[954] = new ModelRendererTurbo(this, 65, 414, textureX, textureY); // Box 1359
		bodyModel[955] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1360
		bodyModel[956] = new ModelRendererTurbo(this, 97, 422, textureX, textureY); // Box 1361
		bodyModel[957] = new ModelRendererTurbo(this, 88, 425, textureX, textureY); // Box 1362
		bodyModel[958] = new ModelRendererTurbo(this, 79, 425, textureX, textureY); // Box 1363
		bodyModel[959] = new ModelRendererTurbo(this, 68, 423, textureX, textureY); // Box 1364
		bodyModel[960] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1365
		bodyModel[961] = new ModelRendererTurbo(this, 57, 413, textureX, textureY); // Box 1366
		bodyModel[962] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1367
		bodyModel[963] = new ModelRendererTurbo(this, 56, 413, textureX, textureY); // Box 1368
		bodyModel[964] = new ModelRendererTurbo(this, 0, 413, textureX, textureY); // Box 1369
		bodyModel[965] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 0
		bodyModel[966] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 1
		bodyModel[967] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 2
		bodyModel[968] = new ModelRendererTurbo(this, 113, 550, textureX, textureY); // Box 3
		bodyModel[969] = new ModelRendererTurbo(this, 76, 522, textureX, textureY); // Box 4
		bodyModel[970] = new ModelRendererTurbo(this, 171, 501, textureX, textureY); // Box 17
		bodyModel[971] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 18
		bodyModel[972] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 19
		bodyModel[973] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 20
		bodyModel[974] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 21
		bodyModel[975] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 22
		bodyModel[976] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 23
		bodyModel[977] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 24
		bodyModel[978] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 25
		bodyModel[979] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 26
		bodyModel[980] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 27
		bodyModel[981] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 28
		bodyModel[982] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 29
		bodyModel[983] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 30
		bodyModel[984] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 31
		bodyModel[985] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 32
		bodyModel[986] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 33
		bodyModel[987] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 34
		bodyModel[988] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 35
		bodyModel[989] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 36
		bodyModel[990] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 37
		bodyModel[991] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 38
		bodyModel[992] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 39
		bodyModel[993] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 40
		bodyModel[994] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 41
		bodyModel[995] = new ModelRendererTurbo(this, 40, 520, textureX, textureY); // Box 42
		bodyModel[996] = new ModelRendererTurbo(this, 58, 501, textureX, textureY); // Box 43
		bodyModel[997] = new ModelRendererTurbo(this, 111, 527, textureX, textureY); // Box 45
		bodyModel[998] = new ModelRendererTurbo(this, 58, 501, textureX, textureY); // Box 46
		bodyModel[999] = new ModelRendererTurbo(this, 58, 501, textureX, textureY); // Box 47

		bodyModel[500].addShapeBox(-17F, -13.5F, 16.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[500].setRotationPoint(10F, 7F, 0F);

		bodyModel[501].addShapeBox(-17F, -12.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[501].setRotationPoint(10F, 7F, 0F);

		bodyModel[502].addShapeBox(-17F, -11.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 54
		bodyModel[502].setRotationPoint(10F, 7F, 0F);

		bodyModel[503].addShapeBox(-17F, -13.5F, 16.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[503].setRotationPoint(21F, 7F, 0F);

		bodyModel[504].addShapeBox(-17F, -12.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[504].setRotationPoint(21F, 7F, 0F);

		bodyModel[505].addShapeBox(-17F, -11.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 57
		bodyModel[505].setRotationPoint(21F, 7F, 0F);

		bodyModel[506].addShapeBox(-17F, -13.5F, 16.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[506].setRotationPoint(37F, 7F, 0F);

		bodyModel[507].addShapeBox(-17F, -12.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[507].setRotationPoint(37F, 7F, 0F);

		bodyModel[508].addShapeBox(-17F, -11.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 60
		bodyModel[508].setRotationPoint(37F, 7F, 0F);

		bodyModel[509].addShapeBox(-17F, -13.5F, 16.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[509].setRotationPoint(48F, 7F, 0F);

		bodyModel[510].addShapeBox(-17F, -12.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[510].setRotationPoint(48F, 7F, 0F);

		bodyModel[511].addShapeBox(-17F, -11.5F, 16.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 63
		bodyModel[511].setRotationPoint(48F, 7F, 0F);

		bodyModel[512].addShapeBox(32F, -17.5F, -23F, 2, 17, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[512].setRotationPoint(0F, -11F, 0F);

		bodyModel[513].addShapeBox(31F, -3.5F, -24F, 4, 2, 4, 0F,-1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[513].setRotationPoint(0F, -11F, 0F);

		bodyModel[514].addShapeBox(30F, -1.5F, -25F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[514].setRotationPoint(0F, -11F, 0F);

		bodyModel[515].addShapeBox(27F, -8.5F, -12F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[515].setRotationPoint(0F, -11F, 0F);

		bodyModel[516].addShapeBox(39F, -12.5F, -12F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[516].setRotationPoint(0F, -11F, 0F);

		bodyModel[517].addShapeBox(39F, -12.5F, -5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[517].setRotationPoint(0F, -11F, 0F);

		bodyModel[518].addShapeBox(39F, -8.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[518].setRotationPoint(0F, -11F, 0F);

		bodyModel[519].addShapeBox(39F, -2.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[519].setRotationPoint(0F, -11F, 0F);

		bodyModel[520].addShapeBox(39F, -12.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[520].setRotationPoint(0F, -11F, 0F);

		bodyModel[521].addShapeBox(26F, -12.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[521].setRotationPoint(0F, -11F, 0F);

		bodyModel[522].addShapeBox(26F, -12.5F, -12F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[522].setRotationPoint(0F, -11F, 0F);

		bodyModel[523].addShapeBox(26F, -8.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[523].setRotationPoint(0F, -11F, 0F);

		bodyModel[524].addShapeBox(26F, -2.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[524].setRotationPoint(0F, -11F, 0F);

		bodyModel[525].addShapeBox(26F, -12.5F, -5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[525].setRotationPoint(0F, -11F, 0F);

		bodyModel[526].addShapeBox(26F, -12.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[526].setRotationPoint(-67F, -11F, 0F);

		bodyModel[527].addShapeBox(26F, -12.5F, -12F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[527].setRotationPoint(-67F, -11F, 0F);

		bodyModel[528].addShapeBox(26F, -8.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[528].setRotationPoint(-67F, -11F, 0F);

		bodyModel[529].addShapeBox(26F, -2.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[529].setRotationPoint(-67F, -11F, 0F);

		bodyModel[530].addShapeBox(26F, -12.5F, -5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[530].setRotationPoint(-67F, -11F, 0F);

		bodyModel[531].addShapeBox(39F, -12.5F, -12F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[531].setRotationPoint(-67F, -11F, 0F);

		bodyModel[532].addShapeBox(39F, -8.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[532].setRotationPoint(-67F, -11F, 0F);

		bodyModel[533].addShapeBox(27F, -8.5F, -12F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[533].setRotationPoint(-67F, -11F, 0F);

		bodyModel[534].addShapeBox(39F, -12.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[534].setRotationPoint(-67F, -11F, 0F);

		bodyModel[535].addShapeBox(39F, -12.5F, -5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[535].setRotationPoint(-67F, -11F, 0F);

		bodyModel[536].addShapeBox(39F, -2.5F, -11F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[536].setRotationPoint(-67F, -11F, 0F);

		bodyModel[537].addShapeBox(32F, -17.5F, -23F, 2, 17, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[537].setRotationPoint(-67F, -11F, 0F);

		bodyModel[538].addShapeBox(31F, -3.5F, -24F, 4, 2, 4, 0F,-1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[538].setRotationPoint(-67F, -11F, 0F);

		bodyModel[539].addShapeBox(30F, -1.5F, -25F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[539].setRotationPoint(-67F, -11F, 0F);

		bodyModel[540].addShapeBox(30F, -1.5F, 19F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[540].setRotationPoint(0F, -11F, 0F);

		bodyModel[541].addShapeBox(31F, -3.5F, 20F, 4, 2, 4, 0F,-1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[541].setRotationPoint(0F, -11F, 0F);

		bodyModel[542].addShapeBox(32F, -17.5F, 21F, 2, 17, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[542].setRotationPoint(0F, -11F, 0F);

		bodyModel[543].addShapeBox(39F, -12.5F, 4F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[543].setRotationPoint(0F, -11F, 0F);

		bodyModel[544].addShapeBox(39F, -2.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[544].setRotationPoint(0F, -11F, 0F);

		bodyModel[545].addShapeBox(39F, -12.5F, 11F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[545].setRotationPoint(0F, -11F, 0F);

		bodyModel[546].addShapeBox(39F, -8.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[546].setRotationPoint(0F, -11F, 0F);

		bodyModel[547].addShapeBox(39F, -12.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[547].setRotationPoint(0F, -11F, 0F);

		bodyModel[548].addShapeBox(26F, -12.5F, 4F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[548].setRotationPoint(0F, -11F, 0F);

		bodyModel[549].addShapeBox(26F, -2.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[549].setRotationPoint(0F, -11F, 0F);

		bodyModel[550].addShapeBox(26F, -12.5F, 11F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[550].setRotationPoint(0F, -11F, 0F);

		bodyModel[551].addShapeBox(27F, -8.5F, 4F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[551].setRotationPoint(0F, -11F, 0F);

		bodyModel[552].addShapeBox(26F, -8.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[552].setRotationPoint(0F, -11F, 0F);

		bodyModel[553].addShapeBox(26F, -12.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[553].setRotationPoint(0F, -11F, 0F);

		bodyModel[554].addShapeBox(39F, -12.5F, 4F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[554].setRotationPoint(-67F, -11F, 0F);

		bodyModel[555].addShapeBox(39F, -2.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[555].setRotationPoint(-67F, -11F, 0F);

		bodyModel[556].addShapeBox(39F, -12.5F, 11F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[556].setRotationPoint(-67F, -11F, 0F);

		bodyModel[557].addShapeBox(39F, -8.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[557].setRotationPoint(-67F, -11F, 0F);

		bodyModel[558].addShapeBox(39F, -12.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[558].setRotationPoint(-67F, -11F, 0F);

		bodyModel[559].addShapeBox(26F, -12.5F, 4F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[559].setRotationPoint(-67F, -11F, 0F);

		bodyModel[560].addShapeBox(26F, -2.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[560].setRotationPoint(-67F, -11F, 0F);

		bodyModel[561].addShapeBox(26F, -12.5F, 11F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[561].setRotationPoint(-67F, -11F, 0F);

		bodyModel[562].addShapeBox(27F, -8.5F, 4F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[562].setRotationPoint(-67F, -11F, 0F);

		bodyModel[563].addShapeBox(26F, -8.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[563].setRotationPoint(-67F, -11F, 0F);

		bodyModel[564].addShapeBox(26F, -12.5F, 5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[564].setRotationPoint(-67F, -11F, 0F);

		bodyModel[565].addShapeBox(31F, -3.5F, 20F, 4, 2, 4, 0F,-1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[565].setRotationPoint(-67F, -11F, 0F);

		bodyModel[566].addShapeBox(30F, -1.5F, 19F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[566].setRotationPoint(-67F, -11F, 0F);

		bodyModel[567].addShapeBox(32F, -17.5F, 21F, 2, 17, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[567].setRotationPoint(-67F, -11F, 0F);

		bodyModel[568].addShapeBox(9.5F, -3.5F, -1F, 4, 2, 4, 0F,-1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[568].setRotationPoint(-67F, -11F, 0F);
		bodyModel[568].rotateAngleY = 1.20427718F;

		bodyModel[569].addShapeBox(8.5F, -1.5F, -2F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[569].setRotationPoint(-67F, -11F, 0F);
		bodyModel[569].rotateAngleY = 1.20427718F;

		bodyModel[570].addShapeBox(10.5F, -12.5F, 0F, 2, 17, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[570].setRotationPoint(-67F, -11F, 0F);
		bodyModel[570].rotateAngleY = 1.20427718F;

		bodyModel[571].addShapeBox(9.5F, -3.5F, -3F, 4, 2, 4, 0F,-1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[571].setRotationPoint(-67F, -11F, 0F);
		bodyModel[571].rotateAngleY = -1.20427718F;

		bodyModel[572].addShapeBox(8.5F, -1.5F, -4F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[572].setRotationPoint(-67F, -11F, 0F);
		bodyModel[572].rotateAngleY = -1.20427718F;

		bodyModel[573].addShapeBox(10.5F, -12.5F, -2F, 2, 17, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[573].setRotationPoint(-67F, -11F, 0F);
		bodyModel[573].rotateAngleY = -1.20427718F;

		bodyModel[574].addShapeBox(-14F, -8.5F, 14F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[574].setRotationPoint(-67F, -11F, 0F);
		bodyModel[574].rotateAngleY = -1.57079633F;

		bodyModel[575].addShapeBox(-11F, -8.5F, 15F, 1, 1, 6, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[575].setRotationPoint(-67F, -11F, 0F);
		bodyModel[575].rotateAngleY = -1.57079633F;

		bodyModel[576].addShapeBox(-11F, -8.5F, 21F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[576].setRotationPoint(-67F, -11F, 0F);
		bodyModel[576].rotateAngleY = -1.57079633F;

		bodyModel[577].addShapeBox(-11F, -4.5F, 15F, 1, 1, 6, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[577].setRotationPoint(-67F, -11F, 0F);
		bodyModel[577].rotateAngleY = -1.57079633F;

		bodyModel[578].addShapeBox(-10F, -4.5F, 21F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[578].setRotationPoint(-67F, -11F, 0F);
		bodyModel[578].rotateAngleY = -1.57079633F;

		bodyModel[579].addShapeBox(13F, -8.5F, 14F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[579].setRotationPoint(-67F, -11F, 0F);
		bodyModel[579].rotateAngleY = -1.57079633F;

		bodyModel[580].addShapeBox(10F, -4.5F, 15F, 1, 1, 6, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[580].setRotationPoint(-67F, -11F, 0F);
		bodyModel[580].rotateAngleY = -1.57079633F;

		bodyModel[581].addShapeBox(10F, -8.5F, 15F, 1, 1, 6, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[581].setRotationPoint(-67F, -11F, 0F);
		bodyModel[581].rotateAngleY = -1.57079633F;

		bodyModel[582].addShapeBox(10F, -8.5F, 21F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[582].setRotationPoint(-67F, -11F, 0F);
		bodyModel[582].rotateAngleY = -1.57079633F;

		bodyModel[583].addShapeBox(-10F, -4.5F, 15F, 20, 1, 6, 0F,3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[583].setRotationPoint(-67F, -11F, 0F);
		bodyModel[583].rotateAngleY = -1.57079633F;

		bodyModel[584].addShapeBox(-13F, -4.5F, 14F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[584].setRotationPoint(-67F, -11F, 0F);
		bodyModel[584].rotateAngleY = -1.57079633F;

		bodyModel[585].addShapeBox(-21F, -4.5F, -19.5F, 22, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 793
		bodyModel[585].setRotationPoint(10F, 7F, 0F);

		bodyModel[586].addShapeBox(-21F, -5.5F, -19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 794
		bodyModel[586].setRotationPoint(10F, 7F, 0F);

		bodyModel[587].addShapeBox(-20F, -5.5F, -26.5F, 20, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 795
		bodyModel[587].setRotationPoint(10F, 7F, 0F);

		bodyModel[588].addShapeBox(-21F, -5.5F, -27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 796
		bodyModel[588].setRotationPoint(10F, 7F, 0F);

		bodyModel[589].addShapeBox(-21F, -4.5F, -27.5F, 22, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
		bodyModel[589].setRotationPoint(10F, 7F, 0F);

		bodyModel[590].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		bodyModel[590].setRotationPoint(-10F, 7F, 0F);

		bodyModel[591].addShapeBox(-21F, 0.5F, -19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 799
		bodyModel[591].setRotationPoint(10F, 7F, 0F);

		bodyModel[592].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 800
		bodyModel[592].setRotationPoint(-5F, 7F, 0F);

		bodyModel[593].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
		bodyModel[593].setRotationPoint(0F, 7F, 0F);

		bodyModel[594].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		bodyModel[594].setRotationPoint(5F, 7F, 0F);

		bodyModel[595].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 803
		bodyModel[595].setRotationPoint(10F, 7F, 0F);

		bodyModel[596].addShapeBox(-21F, -5.5F, -19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		bodyModel[596].setRotationPoint(37F, 7F, 0F);

		bodyModel[597].addShapeBox(-21F, -4.5F, -19.5F, 22, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 805
		bodyModel[597].setRotationPoint(37F, 7F, 0F);

		bodyModel[598].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		bodyModel[598].setRotationPoint(22F, 7F, 0F);

		bodyModel[599].addShapeBox(-21F, 0.5F, -19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 807
		bodyModel[599].setRotationPoint(37F, 7F, 0F);

		bodyModel[600].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		bodyModel[600].setRotationPoint(17F, 7F, 0F);

		bodyModel[601].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		bodyModel[601].setRotationPoint(32F, 7F, 0F);

		bodyModel[602].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		bodyModel[602].setRotationPoint(37F, 7F, 0F);

		bodyModel[603].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
		bodyModel[603].setRotationPoint(27F, 7F, 0F);

		bodyModel[604].addShapeBox(-21F, -5.5F, -27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		bodyModel[604].setRotationPoint(37F, 7F, 0F);

		bodyModel[605].addShapeBox(-21F, -4.5F, -27.5F, 22, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 813
		bodyModel[605].setRotationPoint(37F, 7F, 0F);

		bodyModel[606].addShapeBox(-20F, -5.5F, -26.5F, 20, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814
		bodyModel[606].setRotationPoint(37F, 7F, 0F);

		bodyModel[607].addShapeBox(-17F, -10.5F, -24.5F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		bodyModel[607].setRotationPoint(37F, 7F, 0F);

		bodyModel[608].addShapeBox(-9F, -9.5F, -25.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 816
		bodyModel[608].setRotationPoint(37F, 7F, 0F);

		bodyModel[609].addShapeBox(-16F, -9.5F, -25.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		bodyModel[609].setRotationPoint(37F, 7F, 0F);

		bodyModel[610].addShapeBox(-13F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 818
		bodyModel[610].setRotationPoint(37F, 7F, 0F);

		bodyModel[611].addShapeBox(-14F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 819
		bodyModel[611].setRotationPoint(37F, 7F, 0F);

		bodyModel[612].addShapeBox(-15F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 820
		bodyModel[612].setRotationPoint(37F, 7F, 0F);

		bodyModel[613].addShapeBox(-8F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 821
		bodyModel[613].setRotationPoint(37F, 7F, 0F);

		bodyModel[614].addShapeBox(-6F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 822
		bodyModel[614].setRotationPoint(37F, 7F, 0F);

		bodyModel[615].addShapeBox(-7F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 823
		bodyModel[615].setRotationPoint(37F, 7F, 0F);

		bodyModel[616].addShapeBox(-17F, -10.5F, -24.5F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 824
		bodyModel[616].setRotationPoint(10F, 7F, 0F);

		bodyModel[617].addShapeBox(-9F, -9.5F, -25.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 825
		bodyModel[617].setRotationPoint(10F, 7F, 0F);

		bodyModel[618].addShapeBox(-16F, -9.5F, -25.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		bodyModel[618].setRotationPoint(10F, 7F, 0F);

		bodyModel[619].addShapeBox(-6F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 827
		bodyModel[619].setRotationPoint(10F, 7F, 0F);

		bodyModel[620].addShapeBox(-7F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 828
		bodyModel[620].setRotationPoint(10F, 7F, 0F);

		bodyModel[621].addShapeBox(-8F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 829
		bodyModel[621].setRotationPoint(10F, 7F, 0F);

		bodyModel[622].addShapeBox(-13F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 830
		bodyModel[622].setRotationPoint(10F, 7F, 0F);

		bodyModel[623].addShapeBox(-14F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 831
		bodyModel[623].setRotationPoint(10F, 7F, 0F);

		bodyModel[624].addShapeBox(-15F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 832
		bodyModel[624].setRotationPoint(10F, 7F, 0F);

		bodyModel[625].addShapeBox(-6F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 833
		bodyModel[625].setRotationPoint(-17F, 7F, 0F);

		bodyModel[626].addShapeBox(-7F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 834
		bodyModel[626].setRotationPoint(-17F, 7F, 0F);

		bodyModel[627].addShapeBox(-8F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 835
		bodyModel[627].setRotationPoint(-17F, 7F, 0F);

		bodyModel[628].addShapeBox(-9F, -9.5F, -25.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 836
		bodyModel[628].setRotationPoint(-17F, 7F, 0F);

		bodyModel[629].addShapeBox(-17F, -10.5F, -24.5F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
		bodyModel[629].setRotationPoint(-17F, 7F, 0F);

		bodyModel[630].addShapeBox(-16F, -9.5F, -25.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 838
		bodyModel[630].setRotationPoint(-17F, 7F, 0F);

		bodyModel[631].addShapeBox(-13F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 839
		bodyModel[631].setRotationPoint(-17F, 7F, 0F);

		bodyModel[632].addShapeBox(-14F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 840
		bodyModel[632].setRotationPoint(-17F, 7F, 0F);

		bodyModel[633].addShapeBox(-15F, -8.5F, -24.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 841
		bodyModel[633].setRotationPoint(-17F, 7F, 0F);

		bodyModel[634].addShapeBox(-17F, -13.5F, -23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 842
		bodyModel[634].setRotationPoint(-17F, 7F, 0F);

		bodyModel[635].addShapeBox(-6F, -13.5F, -23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 843
		bodyModel[635].setRotationPoint(-17F, 7F, 0F);

		bodyModel[636].addShapeBox(-17F, -13.5F, -23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
		bodyModel[636].setRotationPoint(10F, 7F, 0F);

		bodyModel[637].addShapeBox(-6F, -13.5F, -23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 845
		bodyModel[637].setRotationPoint(10F, 7F, 0F);

		bodyModel[638].addShapeBox(-17F, -13.5F, -23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 846
		bodyModel[638].setRotationPoint(37F, 7F, 0F);

		bodyModel[639].addShapeBox(-6F, -13.5F, -23.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 847
		bodyModel[639].setRotationPoint(37F, 7F, 0F);

		bodyModel[640].addShapeBox(-21F, -5.5F, -19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 848
		bodyModel[640].setRotationPoint(-17F, 7F, 0F);

		bodyModel[641].addShapeBox(-20F, -5.5F, -26.5F, 20, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 849
		bodyModel[641].setRotationPoint(-17F, 7F, 0F);

		bodyModel[642].addShapeBox(-21F, -5.5F, -27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 850
		bodyModel[642].setRotationPoint(-17F, 7F, 0F);

		bodyModel[643].addShapeBox(-21F, -4.5F, -19.5F, 22, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 851
		bodyModel[643].setRotationPoint(-17F, 7F, 0F);

		bodyModel[644].addShapeBox(-21F, 0.5F, -19.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 852
		bodyModel[644].setRotationPoint(-17F, 7F, 0F);

		bodyModel[645].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 853
		bodyModel[645].setRotationPoint(-17F, 7F, 0F);

		bodyModel[646].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 854
		bodyModel[646].setRotationPoint(-22F, 7F, 0F);

		bodyModel[647].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 855
		bodyModel[647].setRotationPoint(-27F, 7F, 0F);

		bodyModel[648].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 856
		bodyModel[648].setRotationPoint(-32F, 7F, 0F);

		bodyModel[649].addShapeBox(-0.5F, -0.5F, -27.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 857
		bodyModel[649].setRotationPoint(-37F, 7F, 0F);

		bodyModel[650].addShapeBox(-21F, -4.5F, -27.5F, 22, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 858
		bodyModel[650].setRotationPoint(-17F, 7F, 0F);

		bodyModel[651].addShapeBox(-21F, 0.5F, -27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 859
		bodyModel[651].setRotationPoint(-17F, 7F, 0F);

		bodyModel[652].addShapeBox(-21F, 0.5F, -27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 860
		bodyModel[652].setRotationPoint(10F, 7F, 0F);

		bodyModel[653].addShapeBox(-21F, 0.5F, -27.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 861
		bodyModel[653].setRotationPoint(37F, 7F, 0F);

		bodyModel[654].addShapeBox(-17F, -13.5F, -22.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 862
		bodyModel[654].setRotationPoint(48F, 7F, 0F);

		bodyModel[655].addShapeBox(-17F, -12.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 863
		bodyModel[655].setRotationPoint(48F, 7F, 0F);

		bodyModel[656].addShapeBox(-17F, -11.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 864
		bodyModel[656].setRotationPoint(48F, 7F, 0F);

		bodyModel[657].addShapeBox(-17F, -13.5F, -22.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 865
		bodyModel[657].setRotationPoint(37F, 7F, 0F);

		bodyModel[658].addShapeBox(-17F, -12.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 866
		bodyModel[658].setRotationPoint(37F, 7F, 0F);

		bodyModel[659].addShapeBox(-17F, -11.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 867
		bodyModel[659].setRotationPoint(37F, 7F, 0F);

		bodyModel[660].addShapeBox(-17F, -13.5F, -22.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		bodyModel[660].setRotationPoint(21F, 7F, 0F);

		bodyModel[661].addShapeBox(-17F, -12.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 869
		bodyModel[661].setRotationPoint(21F, 7F, 0F);

		bodyModel[662].addShapeBox(-17F, -11.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 870
		bodyModel[662].setRotationPoint(21F, 7F, 0F);

		bodyModel[663].addShapeBox(-17F, -13.5F, -22.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		bodyModel[663].setRotationPoint(10F, 7F, 0F);

		bodyModel[664].addShapeBox(-17F, -12.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 872
		bodyModel[664].setRotationPoint(10F, 7F, 0F);

		bodyModel[665].addShapeBox(-17F, -11.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 873
		bodyModel[665].setRotationPoint(10F, 7F, 0F);

		bodyModel[666].addShapeBox(-17F, -13.5F, -22.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 874
		bodyModel[666].setRotationPoint(-6F, 7F, 0F);

		bodyModel[667].addShapeBox(-17F, -12.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[667].setRotationPoint(-6F, 7F, 0F);

		bodyModel[668].addShapeBox(-17F, -11.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 876
		bodyModel[668].setRotationPoint(-6F, 7F, 0F);

		bodyModel[669].addShapeBox(-17F, -13.5F, -22.5F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 877
		bodyModel[669].setRotationPoint(-17F, 7F, 0F);

		bodyModel[670].addShapeBox(-17F, -12.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 878
		bodyModel[670].setRotationPoint(-17F, 7F, 0F);

		bodyModel[671].addShapeBox(-17F, -11.5F, -22.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 879
		bodyModel[671].setRotationPoint(-17F, 7F, 0F);

		bodyModel[672].addShapeBox(-5F, -12.5F, -24.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 971
		bodyModel[672].setRotationPoint(37F, 7F, 0F);

		bodyModel[673].addShapeBox(-16F, -12.5F, -24.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 972
		bodyModel[673].setRotationPoint(37F, 7F, 0F);

		bodyModel[674].addShapeBox(-16F, -12.5F, -24.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 973
		bodyModel[674].setRotationPoint(10F, 7F, 0F);

		bodyModel[675].addShapeBox(-5F, -12.5F, -24.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 974
		bodyModel[675].setRotationPoint(10F, 7F, 0F);

		bodyModel[676].addShapeBox(-5F, -12.5F, -24.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 975
		bodyModel[676].setRotationPoint(-17F, 7F, 0F);

		bodyModel[677].addShapeBox(-16F, -12.5F, -24.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 976
		bodyModel[677].setRotationPoint(-17F, 7F, 0F);

		bodyModel[678].addShapeBox(-5F, -16.5F, -4F, 8, 16, 8, 0F,-3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 977
		bodyModel[678].setRotationPoint(66F, -11F, 0F);

		bodyModel[679].addShapeBox(-0.5F, -19F, 8F, 1, 5, 9, 0F,0.8F, 0F, -1F, -0.8F, 0F, -1F, -1.6F, 0F, 0F, 1.45F, 0F, 0F, 0.8F, 0F, -1F, -0.8F, 0F, -1F, -1.6F, 0F, 0F, 2.1F, 0F, 0F); // Box 979
		bodyModel[679].setRotationPoint(74F, -11F, 1F);
		bodyModel[679].rotateAngleY = 0.26179939F;
		bodyModel[679].rotateAngleZ = 0.13962634F;

		bodyModel[680].addShapeBox(-1.5F, -20F, 10F, 1, 2, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 980
		bodyModel[680].setRotationPoint(74F, -11F, 1F);
		bodyModel[680].rotateAngleY = 0.26179939F;
		bodyModel[680].rotateAngleZ = 0.13962634F;

		bodyModel[681].addShapeBox(-1.9F, -20F, 15F, 1, 2, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 981
		bodyModel[681].setRotationPoint(74F, -11F, 1F);
		bodyModel[681].rotateAngleY = 0.26179939F;
		bodyModel[681].rotateAngleZ = 0.13962634F;

		bodyModel[682].addShapeBox(-1.9F, -20F, -16F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 982
		bodyModel[682].setRotationPoint(74F, -11F, -1F);
		bodyModel[682].rotateAngleY = -0.26179939F;
		bodyModel[682].rotateAngleZ = 0.13962634F;

		bodyModel[683].addShapeBox(-0.5F, -19F, -17F, 1, 5, 9, 0F,1.45F, 0F, 0F, -1.6F, 0F, 0F, -0.8F, 0F, -1F, 0.8F, 0F, -1F, 2.1F, 0F, 0F, -1.6F, 0F, 0F, -0.8F, 0F, -1F, 0.8F, 0F, -1F); // Box 983
		bodyModel[683].setRotationPoint(74F, -11F, -1F);
		bodyModel[683].rotateAngleY = -0.26179939F;
		bodyModel[683].rotateAngleZ = 0.13962634F;

		bodyModel[684].addShapeBox(-1.5F, -20F, -11F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 984
		bodyModel[684].setRotationPoint(74F, -11F, -1F);
		bodyModel[684].rotateAngleY = -0.26179939F;
		bodyModel[684].rotateAngleZ = 0.13962634F;

		bodyModel[685].addShapeBox(1F, -4F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 32
		bodyModel[685].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[686].addShapeBox(1F, -3F, 0F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 32
		bodyModel[686].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[687].addShapeBox(0F, -1F, 0F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 32
		bodyModel[687].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[688].addShapeBox(1F, -1F, 0F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 32
		bodyModel[688].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[689].addShapeBox(-1F, 0F, -1F, 6, 1, 12, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[689].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[690].addShapeBox(0F, -1F, 2F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1
		bodyModel[690].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[690].rotateAngleZ = 0.03490659F;

		bodyModel[691].addShapeBox(1F, -1F, 2F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 2
		bodyModel[691].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[691].rotateAngleZ = 0.03490659F;

		bodyModel[692].addShapeBox(1F, -3F, 2F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 3
		bodyModel[692].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[692].rotateAngleZ = 0.03490659F;

		bodyModel[693].addShapeBox(1F, -4F, 2F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 4
		bodyModel[693].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[693].rotateAngleZ = 0.03490659F;

		bodyModel[694].addShapeBox(0F, -1F, 4F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 5
		bodyModel[694].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[694].rotateAngleZ = 0.01745329F;

		bodyModel[695].addShapeBox(1F, -1F, 4F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 6
		bodyModel[695].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[695].rotateAngleZ = 0.01745329F;

		bodyModel[696].addShapeBox(1F, -3F, 4F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 7
		bodyModel[696].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[696].rotateAngleZ = 0.01745329F;

		bodyModel[697].addShapeBox(1F, -4F, 4F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 8
		bodyModel[697].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[697].rotateAngleZ = 0.01745329F;

		bodyModel[698].addShapeBox(0F, -1F, 6F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 9
		bodyModel[698].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[698].rotateAngleZ = -0.03490659F;

		bodyModel[699].addShapeBox(1F, -1F, 6F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 10
		bodyModel[699].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[699].rotateAngleZ = -0.03490659F;

		bodyModel[700].addShapeBox(1F, -3F, 6F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 11
		bodyModel[700].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[700].rotateAngleZ = -0.03490659F;

		bodyModel[701].addShapeBox(1F, -4F, 6F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 12
		bodyModel[701].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[701].rotateAngleZ = -0.03490659F;

		bodyModel[702].addShapeBox(0F, -1F, 8F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 13
		bodyModel[702].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[702].rotateAngleZ = 0.03490659F;

		bodyModel[703].addShapeBox(1F, -1F, 8F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 14
		bodyModel[703].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[703].rotateAngleZ = 0.03490659F;

		bodyModel[704].addShapeBox(1F, -3F, 8F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 15
		bodyModel[704].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[704].rotateAngleZ = 0.03490659F;

		bodyModel[705].addShapeBox(1F, -4F, 8F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 16
		bodyModel[705].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[705].rotateAngleZ = 0.03490659F;

		bodyModel[706].addShapeBox(-1F, -4F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[706].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[707].addShapeBox(4F, -4F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[707].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[708].addShapeBox(4F, -4F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[708].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[709].addShapeBox(-1F, -4F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[709].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[710].addShapeBox(-1F, -3F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 44
		bodyModel[710].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[711].addShapeBox(1F, -3F, 10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 45
		bodyModel[711].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[712].addShapeBox(1F, -1F, 10F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 46
		bodyModel[712].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[713].addShapeBox(1F, -3F, -1F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 29
		bodyModel[713].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[714].addShapeBox(1F, -1F, -1F, 2, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[714].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[715].addShapeBox(3F, -3F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[715].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[716].addShapeBox(0F, -3F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[716].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[717].addShapeBox(0F, -3F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 33
		bodyModel[717].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[718].addShapeBox(3F, -3F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[718].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[719].addShapeBox(4F, -3F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[719].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[720].addShapeBox(1F, -4F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 985
		bodyModel[720].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[721].addShapeBox(1F, -3F, 0F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 986
		bodyModel[721].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[722].addShapeBox(0F, -1F, 0F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 987
		bodyModel[722].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[723].addShapeBox(1F, -1F, 0F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 988
		bodyModel[723].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[724].addShapeBox(-1F, 0F, -1F, 6, 1, 12, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 989
		bodyModel[724].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[725].addShapeBox(0F, -1F, 2F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 990
		bodyModel[725].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[725].rotateAngleZ = 0.03490659F;

		bodyModel[726].addShapeBox(1F, -1F, 2F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 991
		bodyModel[726].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[726].rotateAngleZ = 0.03490659F;

		bodyModel[727].addShapeBox(1F, -3F, 2F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 992
		bodyModel[727].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[727].rotateAngleZ = 0.03490659F;

		bodyModel[728].addShapeBox(1F, -4F, 2F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 993
		bodyModel[728].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[728].rotateAngleZ = 0.03490659F;

		bodyModel[729].addShapeBox(0F, -1F, 4F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 994
		bodyModel[729].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[729].rotateAngleZ = 0.01745329F;

		bodyModel[730].addShapeBox(1F, -1F, 4F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 995
		bodyModel[730].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[730].rotateAngleZ = 0.01745329F;

		bodyModel[731].addShapeBox(1F, -3F, 4F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 996
		bodyModel[731].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[731].rotateAngleZ = 0.01745329F;

		bodyModel[732].addShapeBox(1F, -4F, 4F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 997
		bodyModel[732].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[732].rotateAngleZ = 0.01745329F;

		bodyModel[733].addShapeBox(0F, -1F, 6F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 998
		bodyModel[733].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[733].rotateAngleZ = -0.03490659F;

		bodyModel[734].addShapeBox(1F, -1F, 6F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 999
		bodyModel[734].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[734].rotateAngleZ = -0.03490659F;

		bodyModel[735].addShapeBox(1F, -3F, 6F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1000
		bodyModel[735].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[735].rotateAngleZ = -0.03490659F;

		bodyModel[736].addShapeBox(1F, -4F, 6F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1001
		bodyModel[736].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[736].rotateAngleZ = -0.03490659F;

		bodyModel[737].addShapeBox(0F, -1F, 8F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1002
		bodyModel[737].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[737].rotateAngleZ = 0.03490659F;

		bodyModel[738].addShapeBox(1F, -1F, 8F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1003
		bodyModel[738].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[738].rotateAngleZ = 0.03490659F;

		bodyModel[739].addShapeBox(1F, -3F, 8F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1004
		bodyModel[739].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[739].rotateAngleZ = 0.03490659F;

		bodyModel[740].addShapeBox(1F, -4F, 8F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1005
		bodyModel[740].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[740].rotateAngleZ = 0.03490659F;

		bodyModel[741].addShapeBox(-1F, -4F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1006
		bodyModel[741].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[742].addShapeBox(4F, -4F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1007
		bodyModel[742].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[743].addShapeBox(4F, -4F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		bodyModel[743].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[744].addShapeBox(-1F, -4F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1009
		bodyModel[744].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[745].addShapeBox(-1F, -3F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1010
		bodyModel[745].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[746].addShapeBox(1F, -3F, 10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1011
		bodyModel[746].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[747].addShapeBox(1F, -1F, 10F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1012
		bodyModel[747].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[748].addShapeBox(1F, -3F, -1F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1013
		bodyModel[748].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[749].addShapeBox(1F, -1F, -1F, 2, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1014
		bodyModel[749].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[750].addShapeBox(3F, -3F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1015
		bodyModel[750].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[751].addShapeBox(0F, -3F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1016
		bodyModel[751].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[752].addShapeBox(0F, -3F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1017
		bodyModel[752].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[753].addShapeBox(3F, -3F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1018
		bodyModel[753].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[754].addShapeBox(4F, -3F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1019
		bodyModel[754].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[755].addShapeBox(1F, -9F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1020
		bodyModel[755].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[756].addShapeBox(1F, -8F, 0F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1021
		bodyModel[756].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[757].addShapeBox(0F, -6F, 0F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1022
		bodyModel[757].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[758].addShapeBox(1F, -6F, 0F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1023
		bodyModel[758].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[759].addShapeBox(-1F, -5F, -1F, 6, 1, 12, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 1024
		bodyModel[759].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[760].addShapeBox(0F, -6F, 2F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1025
		bodyModel[760].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[760].rotateAngleZ = 0.03490659F;

		bodyModel[761].addShapeBox(1F, -6F, 2F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1026
		bodyModel[761].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[761].rotateAngleZ = 0.03490659F;

		bodyModel[762].addShapeBox(1F, -8F, 2F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1027
		bodyModel[762].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[762].rotateAngleZ = 0.03490659F;

		bodyModel[763].addShapeBox(1F, -9F, 2F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1028
		bodyModel[763].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[763].rotateAngleZ = 0.03490659F;

		bodyModel[764].addShapeBox(0F, -6F, 4F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1029
		bodyModel[764].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[764].rotateAngleZ = 0.01745329F;

		bodyModel[765].addShapeBox(1F, -6F, 4F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1030
		bodyModel[765].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[765].rotateAngleZ = 0.01745329F;

		bodyModel[766].addShapeBox(1F, -8F, 4F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1031
		bodyModel[766].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[766].rotateAngleZ = 0.01745329F;

		bodyModel[767].addShapeBox(1F, -9F, 4F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1032
		bodyModel[767].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[767].rotateAngleZ = 0.01745329F;

		bodyModel[768].addShapeBox(0F, -6F, 6F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1033
		bodyModel[768].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[768].rotateAngleZ = -0.03490659F;

		bodyModel[769].addShapeBox(1F, -6F, 6F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1034
		bodyModel[769].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[769].rotateAngleZ = -0.03490659F;

		bodyModel[770].addShapeBox(1F, -8F, 6F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1035
		bodyModel[770].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[770].rotateAngleZ = -0.03490659F;

		bodyModel[771].addShapeBox(1F, -9F, 6F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1036
		bodyModel[771].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[771].rotateAngleZ = -0.03490659F;

		bodyModel[772].addShapeBox(0F, -6F, 8F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1037
		bodyModel[772].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[772].rotateAngleZ = 0.03490659F;

		bodyModel[773].addShapeBox(1F, -6F, 8F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1038
		bodyModel[773].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[773].rotateAngleZ = 0.03490659F;

		bodyModel[774].addShapeBox(1F, -8F, 8F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1039
		bodyModel[774].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[774].rotateAngleZ = 0.03490659F;

		bodyModel[775].addShapeBox(1F, -9F, 8F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1040
		bodyModel[775].setRotationPoint(-52F, -12.5F, 15.5F);
		bodyModel[775].rotateAngleZ = 0.03490659F;

		bodyModel[776].addShapeBox(-1F, -9F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1041
		bodyModel[776].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[777].addShapeBox(4F, -9F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1042
		bodyModel[777].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[778].addShapeBox(4F, -9F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1043
		bodyModel[778].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[779].addShapeBox(-1F, -9F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1044
		bodyModel[779].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[780].addShapeBox(-1F, -8F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1045
		bodyModel[780].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[781].addShapeBox(1F, -8F, 10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1046
		bodyModel[781].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[782].addShapeBox(1F, -6F, 10F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1047
		bodyModel[782].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[783].addShapeBox(1F, -8F, -1F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1048
		bodyModel[783].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[784].addShapeBox(1F, -6F, -1F, 2, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1049
		bodyModel[784].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[785].addShapeBox(3F, -8F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1050
		bodyModel[785].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[786].addShapeBox(0F, -8F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1051
		bodyModel[786].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[787].addShapeBox(0F, -8F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1052
		bodyModel[787].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[788].addShapeBox(3F, -8F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1053
		bodyModel[788].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[789].addShapeBox(4F, -8F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1054
		bodyModel[789].setRotationPoint(-52F, -12.5F, 15.5F);

		bodyModel[790].addShapeBox(1F, -9F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1055
		bodyModel[790].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[791].addShapeBox(1F, -8F, 0F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1056
		bodyModel[791].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[792].addShapeBox(0F, -6F, 0F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1057
		bodyModel[792].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[793].addShapeBox(1F, -6F, 0F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1058
		bodyModel[793].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[794].addShapeBox(-1F, -5F, -1F, 6, 1, 12, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 1059
		bodyModel[794].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[795].addShapeBox(0F, -6F, 2F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1060
		bodyModel[795].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[795].rotateAngleZ = 0.03490659F;

		bodyModel[796].addShapeBox(1F, -6F, 2F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1061
		bodyModel[796].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[796].rotateAngleZ = 0.03490659F;

		bodyModel[797].addShapeBox(1F, -8F, 2F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1062
		bodyModel[797].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[797].rotateAngleZ = 0.03490659F;

		bodyModel[798].addShapeBox(1F, -9F, 2F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1063
		bodyModel[798].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[798].rotateAngleZ = 0.03490659F;

		bodyModel[799].addShapeBox(0F, -6F, 4F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1064
		bodyModel[799].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[799].rotateAngleZ = 0.01745329F;

		bodyModel[800].addShapeBox(1F, -6F, 4F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1065
		bodyModel[800].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[800].rotateAngleZ = 0.01745329F;

		bodyModel[801].addShapeBox(1F, -8F, 4F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1066
		bodyModel[801].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[801].rotateAngleZ = 0.01745329F;

		bodyModel[802].addShapeBox(1F, -9F, 4F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1067
		bodyModel[802].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[802].rotateAngleZ = 0.01745329F;

		bodyModel[803].addShapeBox(0F, -6F, 6F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1068
		bodyModel[803].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[803].rotateAngleZ = -0.03490659F;

		bodyModel[804].addShapeBox(1F, -6F, 6F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1069
		bodyModel[804].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[804].rotateAngleZ = -0.03490659F;

		bodyModel[805].addShapeBox(1F, -8F, 6F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1070
		bodyModel[805].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[805].rotateAngleZ = -0.03490659F;

		bodyModel[806].addShapeBox(1F, -9F, 6F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1071
		bodyModel[806].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[806].rotateAngleZ = -0.03490659F;

		bodyModel[807].addShapeBox(0F, -6F, 8F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1072
		bodyModel[807].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[807].rotateAngleZ = 0.03490659F;

		bodyModel[808].addShapeBox(1F, -6F, 8F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1073
		bodyModel[808].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[808].rotateAngleZ = 0.03490659F;

		bodyModel[809].addShapeBox(1F, -8F, 8F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1074
		bodyModel[809].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[809].rotateAngleZ = 0.03490659F;

		bodyModel[810].addShapeBox(1F, -9F, 8F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1075
		bodyModel[810].setRotationPoint(-46F, -12.5F, 15F);
		bodyModel[810].rotateAngleZ = 0.03490659F;

		bodyModel[811].addShapeBox(-1F, -9F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1076
		bodyModel[811].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[812].addShapeBox(4F, -9F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1077
		bodyModel[812].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[813].addShapeBox(4F, -9F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1078
		bodyModel[813].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[814].addShapeBox(-1F, -9F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1079
		bodyModel[814].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[815].addShapeBox(-1F, -8F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1080
		bodyModel[815].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[816].addShapeBox(1F, -8F, 10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1081
		bodyModel[816].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[817].addShapeBox(1F, -6F, 10F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1082
		bodyModel[817].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[818].addShapeBox(1F, -8F, -1F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1083
		bodyModel[818].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[819].addShapeBox(1F, -6F, -1F, 2, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1084
		bodyModel[819].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[820].addShapeBox(3F, -8F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1085
		bodyModel[820].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[821].addShapeBox(0F, -8F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1086
		bodyModel[821].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[822].addShapeBox(0F, -8F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1087
		bodyModel[822].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[823].addShapeBox(3F, -8F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1088
		bodyModel[823].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[824].addShapeBox(4F, -8F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1089
		bodyModel[824].setRotationPoint(-46F, -12.5F, 15F);

		bodyModel[825].addShapeBox(1F, -4F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1230
		bodyModel[825].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[826].addShapeBox(1F, -3F, 0F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1231
		bodyModel[826].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[827].addShapeBox(0F, -1F, 0F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1232
		bodyModel[827].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[828].addShapeBox(1F, -1F, 0F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1233
		bodyModel[828].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[829].addShapeBox(-1F, 0F, -1F, 6, 1, 12, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 1234
		bodyModel[829].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[830].addShapeBox(0F, -1F, 2F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1235
		bodyModel[830].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[830].rotateAngleZ = 0.03490659F;

		bodyModel[831].addShapeBox(1F, -1F, 2F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1236
		bodyModel[831].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[831].rotateAngleZ = 0.03490659F;

		bodyModel[832].addShapeBox(1F, -3F, 2F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1237
		bodyModel[832].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[832].rotateAngleZ = 0.03490659F;

		bodyModel[833].addShapeBox(1F, -4F, 2F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1238
		bodyModel[833].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[833].rotateAngleZ = 0.03490659F;

		bodyModel[834].addShapeBox(0F, -1F, 4F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1239
		bodyModel[834].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[834].rotateAngleZ = 0.01745329F;

		bodyModel[835].addShapeBox(1F, -1F, 4F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1240
		bodyModel[835].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[835].rotateAngleZ = 0.01745329F;

		bodyModel[836].addShapeBox(1F, -3F, 4F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1241
		bodyModel[836].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[836].rotateAngleZ = 0.01745329F;

		bodyModel[837].addShapeBox(1F, -4F, 4F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1242
		bodyModel[837].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[837].rotateAngleZ = 0.01745329F;

		bodyModel[838].addShapeBox(0F, -1F, 6F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1243
		bodyModel[838].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[838].rotateAngleZ = -0.03490659F;

		bodyModel[839].addShapeBox(1F, -1F, 6F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1244
		bodyModel[839].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[839].rotateAngleZ = -0.03490659F;

		bodyModel[840].addShapeBox(1F, -3F, 6F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1245
		bodyModel[840].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[840].rotateAngleZ = -0.03490659F;

		bodyModel[841].addShapeBox(1F, -4F, 6F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1246
		bodyModel[841].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[841].rotateAngleZ = -0.03490659F;

		bodyModel[842].addShapeBox(0F, -1F, 8F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1247
		bodyModel[842].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[842].rotateAngleZ = 0.03490659F;

		bodyModel[843].addShapeBox(1F, -1F, 8F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1248
		bodyModel[843].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[843].rotateAngleZ = 0.03490659F;

		bodyModel[844].addShapeBox(1F, -3F, 8F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1249
		bodyModel[844].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[844].rotateAngleZ = 0.03490659F;

		bodyModel[845].addShapeBox(1F, -4F, 8F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1250
		bodyModel[845].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[845].rotateAngleZ = 0.03490659F;

		bodyModel[846].addShapeBox(-1F, -4F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1251
		bodyModel[846].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[847].addShapeBox(4F, -4F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1252
		bodyModel[847].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[848].addShapeBox(4F, -4F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1253
		bodyModel[848].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[849].addShapeBox(-1F, -4F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1254
		bodyModel[849].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[850].addShapeBox(-1F, -3F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1255
		bodyModel[850].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[851].addShapeBox(1F, -3F, 10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1256
		bodyModel[851].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[852].addShapeBox(1F, -1F, 10F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1257
		bodyModel[852].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[853].addShapeBox(1F, -3F, -1F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1258
		bodyModel[853].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[854].addShapeBox(1F, -1F, -1F, 2, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1259
		bodyModel[854].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[855].addShapeBox(3F, -3F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1260
		bodyModel[855].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[856].addShapeBox(0F, -3F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1261
		bodyModel[856].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[857].addShapeBox(0F, -3F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1262
		bodyModel[857].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[858].addShapeBox(3F, -3F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1263
		bodyModel[858].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[859].addShapeBox(4F, -3F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1264
		bodyModel[859].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[860].addShapeBox(1F, -4F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1265
		bodyModel[860].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[861].addShapeBox(1F, -3F, 0F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1266
		bodyModel[861].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[862].addShapeBox(0F, -1F, 0F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1267
		bodyModel[862].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[863].addShapeBox(1F, -1F, 0F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1268
		bodyModel[863].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[864].addShapeBox(-1F, 0F, -1F, 6, 1, 12, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 1269
		bodyModel[864].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[865].addShapeBox(0F, -1F, 2F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1270
		bodyModel[865].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[865].rotateAngleZ = 0.03490659F;

		bodyModel[866].addShapeBox(1F, -1F, 2F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1271
		bodyModel[866].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[866].rotateAngleZ = 0.03490659F;

		bodyModel[867].addShapeBox(1F, -3F, 2F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1272
		bodyModel[867].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[867].rotateAngleZ = 0.03490659F;

		bodyModel[868].addShapeBox(1F, -4F, 2F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1273
		bodyModel[868].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[868].rotateAngleZ = 0.03490659F;

		bodyModel[869].addShapeBox(0F, -1F, 4F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1274
		bodyModel[869].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[869].rotateAngleZ = 0.01745329F;

		bodyModel[870].addShapeBox(1F, -1F, 4F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1275
		bodyModel[870].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[870].rotateAngleZ = 0.01745329F;

		bodyModel[871].addShapeBox(1F, -3F, 4F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1276
		bodyModel[871].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[871].rotateAngleZ = 0.01745329F;

		bodyModel[872].addShapeBox(1F, -4F, 4F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1277
		bodyModel[872].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[872].rotateAngleZ = 0.01745329F;

		bodyModel[873].addShapeBox(0F, -1F, 6F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1278
		bodyModel[873].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[873].rotateAngleZ = -0.03490659F;

		bodyModel[874].addShapeBox(1F, -1F, 6F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1279
		bodyModel[874].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[874].rotateAngleZ = -0.03490659F;

		bodyModel[875].addShapeBox(1F, -3F, 6F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1280
		bodyModel[875].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[875].rotateAngleZ = -0.03490659F;

		bodyModel[876].addShapeBox(1F, -4F, 6F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1281
		bodyModel[876].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[876].rotateAngleZ = -0.03490659F;

		bodyModel[877].addShapeBox(0F, -1F, 8F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1282
		bodyModel[877].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[877].rotateAngleZ = 0.03490659F;

		bodyModel[878].addShapeBox(1F, -1F, 8F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1283
		bodyModel[878].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[878].rotateAngleZ = 0.03490659F;

		bodyModel[879].addShapeBox(1F, -3F, 8F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1284
		bodyModel[879].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[879].rotateAngleZ = 0.03490659F;

		bodyModel[880].addShapeBox(1F, -4F, 8F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1285
		bodyModel[880].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[880].rotateAngleZ = 0.03490659F;

		bodyModel[881].addShapeBox(-1F, -4F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1286
		bodyModel[881].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[882].addShapeBox(4F, -4F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1287
		bodyModel[882].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[883].addShapeBox(4F, -4F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1288
		bodyModel[883].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[884].addShapeBox(-1F, -4F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1289
		bodyModel[884].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[885].addShapeBox(-1F, -3F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1290
		bodyModel[885].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[886].addShapeBox(1F, -3F, 10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1291
		bodyModel[886].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[887].addShapeBox(1F, -1F, 10F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1292
		bodyModel[887].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[888].addShapeBox(1F, -3F, -1F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1293
		bodyModel[888].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[889].addShapeBox(1F, -1F, -1F, 2, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1294
		bodyModel[889].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[890].addShapeBox(3F, -3F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1295
		bodyModel[890].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[891].addShapeBox(0F, -3F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1296
		bodyModel[891].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[892].addShapeBox(0F, -3F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1297
		bodyModel[892].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[893].addShapeBox(3F, -3F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1298
		bodyModel[893].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[894].addShapeBox(4F, -3F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1299
		bodyModel[894].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[895].addShapeBox(1F, -9F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1300
		bodyModel[895].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[896].addShapeBox(1F, -8F, 0F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1301
		bodyModel[896].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[897].addShapeBox(0F, -6F, 0F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1302
		bodyModel[897].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[898].addShapeBox(1F, -6F, 0F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1303
		bodyModel[898].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[899].addShapeBox(-1F, -5F, -1F, 6, 1, 12, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 1304
		bodyModel[899].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[900].addShapeBox(0F, -6F, 2F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1305
		bodyModel[900].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[900].rotateAngleZ = 0.03490659F;

		bodyModel[901].addShapeBox(1F, -6F, 2F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1306
		bodyModel[901].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[901].rotateAngleZ = 0.03490659F;

		bodyModel[902].addShapeBox(1F, -8F, 2F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1307
		bodyModel[902].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[902].rotateAngleZ = 0.03490659F;

		bodyModel[903].addShapeBox(1F, -9F, 2F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1308
		bodyModel[903].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[903].rotateAngleZ = 0.03490659F;

		bodyModel[904].addShapeBox(0F, -6F, 4F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1309
		bodyModel[904].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[904].rotateAngleZ = 0.01745329F;

		bodyModel[905].addShapeBox(1F, -6F, 4F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1310
		bodyModel[905].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[905].rotateAngleZ = 0.01745329F;

		bodyModel[906].addShapeBox(1F, -8F, 4F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1311
		bodyModel[906].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[906].rotateAngleZ = 0.01745329F;

		bodyModel[907].addShapeBox(1F, -9F, 4F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1312
		bodyModel[907].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[907].rotateAngleZ = 0.01745329F;

		bodyModel[908].addShapeBox(0F, -6F, 6F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1313
		bodyModel[908].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[908].rotateAngleZ = -0.03490659F;

		bodyModel[909].addShapeBox(1F, -6F, 6F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1314
		bodyModel[909].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[909].rotateAngleZ = -0.03490659F;

		bodyModel[910].addShapeBox(1F, -8F, 6F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1315
		bodyModel[910].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[910].rotateAngleZ = -0.03490659F;

		bodyModel[911].addShapeBox(1F, -9F, 6F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1316
		bodyModel[911].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[911].rotateAngleZ = -0.03490659F;

		bodyModel[912].addShapeBox(0F, -6F, 8F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1317
		bodyModel[912].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[912].rotateAngleZ = 0.03490659F;

		bodyModel[913].addShapeBox(1F, -6F, 8F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1318
		bodyModel[913].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[913].rotateAngleZ = 0.03490659F;

		bodyModel[914].addShapeBox(1F, -8F, 8F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1319
		bodyModel[914].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[914].rotateAngleZ = 0.03490659F;

		bodyModel[915].addShapeBox(1F, -9F, 8F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1320
		bodyModel[915].setRotationPoint(51F, -12.5F, 8.5F);
		bodyModel[915].rotateAngleZ = 0.03490659F;

		bodyModel[916].addShapeBox(-1F, -9F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1321
		bodyModel[916].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[917].addShapeBox(4F, -9F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1322
		bodyModel[917].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[918].addShapeBox(4F, -9F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1323
		bodyModel[918].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[919].addShapeBox(-1F, -9F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1324
		bodyModel[919].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[920].addShapeBox(-1F, -8F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1325
		bodyModel[920].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[921].addShapeBox(1F, -8F, 10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1326
		bodyModel[921].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[922].addShapeBox(1F, -6F, 10F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1327
		bodyModel[922].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[923].addShapeBox(1F, -8F, -1F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1328
		bodyModel[923].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[924].addShapeBox(1F, -6F, -1F, 2, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1329
		bodyModel[924].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[925].addShapeBox(3F, -8F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1330
		bodyModel[925].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[926].addShapeBox(0F, -8F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1331
		bodyModel[926].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[927].addShapeBox(0F, -8F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1332
		bodyModel[927].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[928].addShapeBox(3F, -8F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1333
		bodyModel[928].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[929].addShapeBox(4F, -8F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1334
		bodyModel[929].setRotationPoint(51F, -12.5F, 8.5F);

		bodyModel[930].addShapeBox(1F, -9F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1335
		bodyModel[930].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[931].addShapeBox(1F, -8F, 0F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1336
		bodyModel[931].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[932].addShapeBox(0F, -6F, 0F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1337
		bodyModel[932].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[933].addShapeBox(1F, -6F, 0F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1338
		bodyModel[933].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[934].addShapeBox(-1F, -5F, -1F, 6, 1, 12, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 1339
		bodyModel[934].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[935].addShapeBox(0F, -6F, 2F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1340
		bodyModel[935].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[935].rotateAngleZ = 0.03490659F;

		bodyModel[936].addShapeBox(1F, -6F, 2F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1341
		bodyModel[936].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[936].rotateAngleZ = 0.03490659F;

		bodyModel[937].addShapeBox(1F, -8F, 2F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1342
		bodyModel[937].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[937].rotateAngleZ = 0.03490659F;

		bodyModel[938].addShapeBox(1F, -9F, 2F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1343
		bodyModel[938].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[938].rotateAngleZ = 0.03490659F;

		bodyModel[939].addShapeBox(0F, -6F, 4F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1344
		bodyModel[939].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[939].rotateAngleZ = 0.01745329F;

		bodyModel[940].addShapeBox(1F, -6F, 4F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1345
		bodyModel[940].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[940].rotateAngleZ = 0.01745329F;

		bodyModel[941].addShapeBox(1F, -8F, 4F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1346
		bodyModel[941].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[941].rotateAngleZ = 0.01745329F;

		bodyModel[942].addShapeBox(1F, -9F, 4F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1347
		bodyModel[942].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[942].rotateAngleZ = 0.01745329F;

		bodyModel[943].addShapeBox(0F, -6F, 6F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1348
		bodyModel[943].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[943].rotateAngleZ = -0.03490659F;

		bodyModel[944].addShapeBox(1F, -6F, 6F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1349
		bodyModel[944].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[944].rotateAngleZ = -0.03490659F;

		bodyModel[945].addShapeBox(1F, -8F, 6F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1350
		bodyModel[945].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[945].rotateAngleZ = -0.03490659F;

		bodyModel[946].addShapeBox(1F, -9F, 6F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1351
		bodyModel[946].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[946].rotateAngleZ = -0.03490659F;

		bodyModel[947].addShapeBox(0F, -6F, 8F, 4, 1, 2, 0F,0F, 0F, -0.1F, -1.2F, 0.3F, -0.1F, -1.2F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.2F, -0.3F, -0.1F, -1.2F, -0.3F, -0.1F, 0F, 0F, -0.1F); // Box 1352
		bodyModel[947].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[947].rotateAngleZ = 0.03490659F;

		bodyModel[948].addShapeBox(1F, -6F, 8F, 3, 1, 2, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 1353
		bodyModel[948].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[948].rotateAngleZ = 0.03490659F;

		bodyModel[949].addShapeBox(1F, -8F, 8F, 3, 2, 2, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.4F, -0.1F, 0F); // Box 1354
		bodyModel[949].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[949].rotateAngleZ = 0.03490659F;

		bodyModel[950].addShapeBox(1F, -9F, 8F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F); // Box 1355
		bodyModel[950].setRotationPoint(57F, -12.5F, 8F);
		bodyModel[950].rotateAngleZ = 0.03490659F;

		bodyModel[951].addShapeBox(-1F, -9F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[951].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[952].addShapeBox(4F, -9F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[952].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[953].addShapeBox(4F, -9F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[953].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[954].addShapeBox(-1F, -9F, 10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1359
		bodyModel[954].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[955].addShapeBox(-1F, -8F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1360
		bodyModel[955].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[956].addShapeBox(1F, -8F, 10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1361
		bodyModel[956].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[957].addShapeBox(1F, -6F, 10F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1362
		bodyModel[957].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[958].addShapeBox(1F, -8F, -1F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1363
		bodyModel[958].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[959].addShapeBox(1F, -6F, -1F, 2, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1364
		bodyModel[959].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[960].addShapeBox(3F, -8F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1365
		bodyModel[960].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[961].addShapeBox(0F, -8F, -1F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1366
		bodyModel[961].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[962].addShapeBox(0F, -8F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1367
		bodyModel[962].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[963].addShapeBox(3F, -8F, 10F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1368
		bodyModel[963].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[964].addShapeBox(4F, -8F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1369
		bodyModel[964].setRotationPoint(57F, -12.5F, 8F);

		bodyModel[965].addBox(1.5F, 0F, 0F, 1, 5, 2, 0F); // Box 0
		bodyModel[965].setRotationPoint(37F, -22F, -25F);

		bodyModel[966].addShapeBox(2.5F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 1
		bodyModel[966].setRotationPoint(37F, -22F, -25F);

		bodyModel[967].addShapeBox(0.5F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 2
		bodyModel[967].setRotationPoint(37F, -22F, -25F);

		bodyModel[968].addShapeBox(0F, -1F, -1F, 24, 11, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[968].setRotationPoint(37F, -22F, -25F);

		bodyModel[969].addBox(0F, -1F, 0F, 1, 11, 12, 0F); // Box 4
		bodyModel[969].setRotationPoint(37F, -22F, -25F);

		bodyModel[970].addShapeBox(0F, -1F, 12F, 24, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 17
		bodyModel[970].setRotationPoint(37F, -22F, -25F);

		bodyModel[971].addShapeBox(5F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 18
		bodyModel[971].setRotationPoint(37F, -22F, -25F);

		bodyModel[972].addBox(4F, 0F, 0F, 1, 5, 2, 0F); // Box 19
		bodyModel[972].setRotationPoint(37F, -22F, -25F);

		bodyModel[973].addShapeBox(3F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 20
		bodyModel[973].setRotationPoint(37F, -22F, -25F);

		bodyModel[974].addShapeBox(7.5F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 21
		bodyModel[974].setRotationPoint(37F, -22F, -25F);

		bodyModel[975].addBox(6.5F, 0F, 0F, 1, 5, 2, 0F); // Box 22
		bodyModel[975].setRotationPoint(37F, -22F, -25F);

		bodyModel[976].addShapeBox(5.5F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 23
		bodyModel[976].setRotationPoint(37F, -22F, -25F);

		bodyModel[977].addShapeBox(12.5F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 24
		bodyModel[977].setRotationPoint(37F, -22F, -25F);

		bodyModel[978].addBox(11.5F, 0F, 0F, 1, 5, 2, 0F); // Box 25
		bodyModel[978].setRotationPoint(37F, -22F, -25F);

		bodyModel[979].addShapeBox(10.5F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 26
		bodyModel[979].setRotationPoint(37F, -22F, -25F);

		bodyModel[980].addShapeBox(10F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 27
		bodyModel[980].setRotationPoint(37F, -22F, -25F);

		bodyModel[981].addBox(9F, 0F, 0F, 1, 5, 2, 0F); // Box 28
		bodyModel[981].setRotationPoint(37F, -22F, -25F);

		bodyModel[982].addShapeBox(8F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 29
		bodyModel[982].setRotationPoint(37F, -22F, -25F);

		bodyModel[983].addShapeBox(17.5F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 30
		bodyModel[983].setRotationPoint(37F, -22F, -25F);

		bodyModel[984].addBox(16.5F, 0F, 0F, 1, 5, 2, 0F); // Box 31
		bodyModel[984].setRotationPoint(37F, -22F, -25F);

		bodyModel[985].addShapeBox(15.5F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 32
		bodyModel[985].setRotationPoint(37F, -22F, -25F);

		bodyModel[986].addShapeBox(15F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 33
		bodyModel[986].setRotationPoint(37F, -22F, -25F);

		bodyModel[987].addBox(14F, 0F, 0F, 1, 5, 2, 0F); // Box 34
		bodyModel[987].setRotationPoint(37F, -22F, -25F);

		bodyModel[988].addShapeBox(13F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 35
		bodyModel[988].setRotationPoint(37F, -22F, -25F);

		bodyModel[989].addShapeBox(20F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 36
		bodyModel[989].setRotationPoint(37F, -22F, -25F);

		bodyModel[990].addBox(19F, 0F, 0F, 1, 5, 2, 0F); // Box 37
		bodyModel[990].setRotationPoint(37F, -22F, -25F);

		bodyModel[991].addShapeBox(18F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 38
		bodyModel[991].setRotationPoint(37F, -22F, -25F);

		bodyModel[992].addShapeBox(22.5F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 39
		bodyModel[992].setRotationPoint(37F, -22F, -25F);

		bodyModel[993].addBox(21.5F, 0F, 0F, 1, 5, 2, 0F); // Box 40
		bodyModel[993].setRotationPoint(37F, -22F, -25F);

		bodyModel[994].addShapeBox(20.5F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 41
		bodyModel[994].setRotationPoint(37F, -22F, -25F);

		bodyModel[995].addBox(23F, -1F, 0F, 1, 11, 12, 0F); // Box 42
		bodyModel[995].setRotationPoint(37F, -22F, -25F);

		bodyModel[996].addShapeBox(3F, 1F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[996].setRotationPoint(37F, -22F, -25F);

		bodyModel[997].addBox(1F, 0F, 0F, 22, 5, 12, 0F); // Box 45
		bodyModel[997].setRotationPoint(37F, -17F, -25F);

		bodyModel[998].addShapeBox(5F, 1F, 0F, 1, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 46
		bodyModel[998].setRotationPoint(37F, -22F, -25F);

		bodyModel[999].addShapeBox(8F, 1F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[999].setRotationPoint(37F, -22F, -25F);
	}

	private void initbodyModel_3()
	{
		bodyModel[1000] = new ModelRendererTurbo(this, 58, 501, textureX, textureY); // Box 48
		bodyModel[1001] = new ModelRendererTurbo(this, 58, 501, textureX, textureY); // Box 49
		bodyModel[1002] = new ModelRendererTurbo(this, 58, 501, textureX, textureY); // Box 50
		bodyModel[1003] = new ModelRendererTurbo(this, 58, 501, textureX, textureY); // Box 51
		bodyModel[1004] = new ModelRendererTurbo(this, 58, 501, textureX, textureY); // Box 52
		bodyModel[1005] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 54
		bodyModel[1006] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 55
		bodyModel[1007] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 56
		bodyModel[1008] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 57
		bodyModel[1009] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 58
		bodyModel[1010] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 59
		bodyModel[1011] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 60
		bodyModel[1012] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 61
		bodyModel[1013] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 62
		bodyModel[1014] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 63
		bodyModel[1015] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 64
		bodyModel[1016] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 65
		bodyModel[1017] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 66
		bodyModel[1018] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 67
		bodyModel[1019] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 68
		bodyModel[1020] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 69
		bodyModel[1021] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 70
		bodyModel[1022] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 71
		bodyModel[1023] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 72
		bodyModel[1024] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 73
		bodyModel[1025] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 74
		bodyModel[1026] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 75
		bodyModel[1027] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 76
		bodyModel[1028] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 77
		bodyModel[1029] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 78
		bodyModel[1030] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 79
		bodyModel[1031] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 80
		bodyModel[1032] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 81
		bodyModel[1033] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 82
		bodyModel[1034] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 83
		bodyModel[1035] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 84
		bodyModel[1036] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 85
		bodyModel[1037] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 86
		bodyModel[1038] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 87
		bodyModel[1039] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 88
		bodyModel[1040] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 89
		bodyModel[1041] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 90
		bodyModel[1042] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 91
		bodyModel[1043] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 92
		bodyModel[1044] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 93
		bodyModel[1045] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 94
		bodyModel[1046] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 95
		bodyModel[1047] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 96
		bodyModel[1048] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 97
		bodyModel[1049] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 98
		bodyModel[1050] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 99
		bodyModel[1051] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 100
		bodyModel[1052] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 101
		bodyModel[1053] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 102
		bodyModel[1054] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 103
		bodyModel[1055] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 104
		bodyModel[1056] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 105
		bodyModel[1057] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 106
		bodyModel[1058] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 107
		bodyModel[1059] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 108
		bodyModel[1060] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 109
		bodyModel[1061] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 110
		bodyModel[1062] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 111
		bodyModel[1063] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 112
		bodyModel[1064] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 113
		bodyModel[1065] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 114
		bodyModel[1066] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 115
		bodyModel[1067] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 116
		bodyModel[1068] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 117
		bodyModel[1069] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 118
		bodyModel[1070] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 119
		bodyModel[1071] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 120
		bodyModel[1072] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 121
		bodyModel[1073] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 122
		bodyModel[1074] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 123
		bodyModel[1075] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 124
		bodyModel[1076] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 125
		bodyModel[1077] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 126
		bodyModel[1078] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 127
		bodyModel[1079] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 128
		bodyModel[1080] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 129
		bodyModel[1081] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 130
		bodyModel[1082] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 131
		bodyModel[1083] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 132
		bodyModel[1084] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 133
		bodyModel[1085] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 134
		bodyModel[1086] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 135
		bodyModel[1087] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 136
		bodyModel[1088] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 137
		bodyModel[1089] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 138
		bodyModel[1090] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 139
		bodyModel[1091] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 140
		bodyModel[1092] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 141
		bodyModel[1093] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 142
		bodyModel[1094] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 143
		bodyModel[1095] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 144
		bodyModel[1096] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 145
		bodyModel[1097] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 146
		bodyModel[1098] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 147
		bodyModel[1099] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 148
		bodyModel[1100] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 149
		bodyModel[1101] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 150
		bodyModel[1102] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 151
		bodyModel[1103] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 152
		bodyModel[1104] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 153
		bodyModel[1105] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 154
		bodyModel[1106] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 155
		bodyModel[1107] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 156
		bodyModel[1108] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 157
		bodyModel[1109] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 158
		bodyModel[1110] = new ModelRendererTurbo(this, 17, 501, textureX, textureY); // Box 159
		bodyModel[1111] = new ModelRendererTurbo(this, 1, 501, textureX, textureY); // Box 160
		bodyModel[1112] = new ModelRendererTurbo(this, 9, 501, textureX, textureY); // Box 161
		bodyModel[1113] = new ModelRendererTurbo(this, 90, 501, textureX, textureY); // Box 162
		bodyModel[1114] = new ModelRendererTurbo(this, 90, 501, textureX, textureY); // Box 163
		bodyModel[1115] = new ModelRendererTurbo(this, 90, 501, textureX, textureY); // Box 164
		bodyModel[1116] = new ModelRendererTurbo(this, 90, 501, textureX, textureY); // Box 165
		bodyModel[1117] = new ModelRendererTurbo(this, 39, 501, textureX, textureY); // Box 166
		bodyModel[1118] = new ModelRendererTurbo(this, 39, 501, textureX, textureY); // Box 167

		bodyModel[1000].addShapeBox(10F, 1F, 0F, 1, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 48
		bodyModel[1000].setRotationPoint(37F, -22F, -25F);

		bodyModel[1001].addShapeBox(13F, 1F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[1001].setRotationPoint(37F, -22F, -25F);

		bodyModel[1002].addShapeBox(15F, 1F, 0F, 1, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 50
		bodyModel[1002].setRotationPoint(37F, -22F, -25F);

		bodyModel[1003].addShapeBox(18F, 1F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[1003].setRotationPoint(37F, -22F, -25F);

		bodyModel[1004].addShapeBox(20F, 1F, 0F, 1, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[1004].setRotationPoint(37F, -22F, -25F);

		bodyModel[1005].addBox(9F, 0F, 2.5F, 1, 5, 2, 0F); // Box 54
		bodyModel[1005].setRotationPoint(37F, -22F, -25F);

		bodyModel[1006].addShapeBox(10F, 0F, 2.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 55
		bodyModel[1006].setRotationPoint(37F, -22F, -25F);

		bodyModel[1007].addShapeBox(7.5F, 0F, 2.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 56
		bodyModel[1007].setRotationPoint(37F, -22F, -25F);

		bodyModel[1008].addBox(6.5F, 0F, 2.5F, 1, 5, 2, 0F); // Box 57
		bodyModel[1008].setRotationPoint(37F, -22F, -25F);

		bodyModel[1009].addShapeBox(5.5F, 0F, 2.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 58
		bodyModel[1009].setRotationPoint(37F, -22F, -25F);

		bodyModel[1010].addShapeBox(8F, 0F, 2.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 59
		bodyModel[1010].setRotationPoint(37F, -22F, -25F);

		bodyModel[1011].addShapeBox(5F, 0F, 2.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 60
		bodyModel[1011].setRotationPoint(37F, -22F, -25F);

		bodyModel[1012].addBox(4F, 0F, 2.5F, 1, 5, 2, 0F); // Box 61
		bodyModel[1012].setRotationPoint(37F, -22F, -25F);

		bodyModel[1013].addShapeBox(3F, 0F, 2.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 62
		bodyModel[1013].setRotationPoint(37F, -22F, -25F);

		bodyModel[1014].addShapeBox(2.5F, 0F, 2.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 63
		bodyModel[1014].setRotationPoint(37F, -22F, -25F);

		bodyModel[1015].addBox(1.5F, 0F, 2.5F, 1, 5, 2, 0F); // Box 64
		bodyModel[1015].setRotationPoint(37F, -22F, -25F);

		bodyModel[1016].addShapeBox(0.5F, 0F, 2.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 65
		bodyModel[1016].setRotationPoint(37F, -22F, -25F);

		bodyModel[1017].addShapeBox(10.5F, 0F, 2.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 66
		bodyModel[1017].setRotationPoint(37F, -22F, -25F);

		bodyModel[1018].addBox(11.5F, 0F, 2.5F, 1, 5, 2, 0F); // Box 67
		bodyModel[1018].setRotationPoint(37F, -22F, -25F);

		bodyModel[1019].addShapeBox(12.5F, 0F, 2.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 68
		bodyModel[1019].setRotationPoint(37F, -22F, -25F);

		bodyModel[1020].addShapeBox(13F, 0F, 2.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 69
		bodyModel[1020].setRotationPoint(37F, -22F, -25F);

		bodyModel[1021].addBox(14F, 0F, 2.5F, 1, 5, 2, 0F); // Box 70
		bodyModel[1021].setRotationPoint(37F, -22F, -25F);

		bodyModel[1022].addShapeBox(15F, 0F, 2.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 71
		bodyModel[1022].setRotationPoint(37F, -22F, -25F);

		bodyModel[1023].addShapeBox(15.5F, 0F, 2.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 72
		bodyModel[1023].setRotationPoint(37F, -22F, -25F);

		bodyModel[1024].addBox(16.5F, 0F, 2.5F, 1, 5, 2, 0F); // Box 73
		bodyModel[1024].setRotationPoint(37F, -22F, -25F);

		bodyModel[1025].addShapeBox(17.5F, 0F, 2.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 74
		bodyModel[1025].setRotationPoint(37F, -22F, -25F);

		bodyModel[1026].addShapeBox(18F, 0F, 2.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 75
		bodyModel[1026].setRotationPoint(37F, -22F, -25F);

		bodyModel[1027].addBox(19F, 0F, 2.5F, 1, 5, 2, 0F); // Box 76
		bodyModel[1027].setRotationPoint(37F, -22F, -25F);

		bodyModel[1028].addShapeBox(20F, 0F, 2.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 77
		bodyModel[1028].setRotationPoint(37F, -22F, -25F);

		bodyModel[1029].addShapeBox(20.5F, 0F, 2.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 78
		bodyModel[1029].setRotationPoint(37F, -22F, -25F);

		bodyModel[1030].addBox(21.5F, 0F, 2.5F, 1, 5, 2, 0F); // Box 79
		bodyModel[1030].setRotationPoint(37F, -22F, -25F);

		bodyModel[1031].addShapeBox(22.5F, 0F, 2.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 80
		bodyModel[1031].setRotationPoint(37F, -22F, -25F);

		bodyModel[1032].addBox(9F, 0F, 5F, 1, 5, 2, 0F); // Box 81
		bodyModel[1032].setRotationPoint(37F, -22F, -25F);

		bodyModel[1033].addShapeBox(10F, 0F, 5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 82
		bodyModel[1033].setRotationPoint(37F, -22F, -25F);

		bodyModel[1034].addShapeBox(7.5F, 0F, 5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 83
		bodyModel[1034].setRotationPoint(37F, -22F, -25F);

		bodyModel[1035].addBox(6.5F, 0F, 5F, 1, 5, 2, 0F); // Box 84
		bodyModel[1035].setRotationPoint(37F, -22F, -25F);

		bodyModel[1036].addShapeBox(5.5F, 0F, 5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 85
		bodyModel[1036].setRotationPoint(37F, -22F, -25F);

		bodyModel[1037].addShapeBox(8F, 0F, 5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 86
		bodyModel[1037].setRotationPoint(37F, -22F, -25F);

		bodyModel[1038].addShapeBox(5F, 0F, 5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 87
		bodyModel[1038].setRotationPoint(37F, -22F, -25F);

		bodyModel[1039].addBox(4F, 0F, 5F, 1, 5, 2, 0F); // Box 88
		bodyModel[1039].setRotationPoint(37F, -22F, -25F);

		bodyModel[1040].addShapeBox(3F, 0F, 5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 89
		bodyModel[1040].setRotationPoint(37F, -22F, -25F);

		bodyModel[1041].addShapeBox(2.5F, 0F, 5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 90
		bodyModel[1041].setRotationPoint(37F, -22F, -25F);

		bodyModel[1042].addBox(1.5F, 0F, 5F, 1, 5, 2, 0F); // Box 91
		bodyModel[1042].setRotationPoint(37F, -22F, -25F);

		bodyModel[1043].addShapeBox(0.5F, 0F, 5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 92
		bodyModel[1043].setRotationPoint(37F, -22F, -25F);

		bodyModel[1044].addShapeBox(10.5F, 0F, 5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 93
		bodyModel[1044].setRotationPoint(37F, -22F, -25F);

		bodyModel[1045].addBox(11.5F, 0F, 5F, 1, 5, 2, 0F); // Box 94
		bodyModel[1045].setRotationPoint(37F, -22F, -25F);

		bodyModel[1046].addShapeBox(12.5F, 0F, 5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 95
		bodyModel[1046].setRotationPoint(37F, -22F, -25F);

		bodyModel[1047].addShapeBox(13F, 0F, 5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 96
		bodyModel[1047].setRotationPoint(37F, -22F, -25F);

		bodyModel[1048].addBox(14F, 0F, 5F, 1, 5, 2, 0F); // Box 97
		bodyModel[1048].setRotationPoint(37F, -22F, -25F);

		bodyModel[1049].addShapeBox(15F, 0F, 5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 98
		bodyModel[1049].setRotationPoint(37F, -22F, -25F);

		bodyModel[1050].addShapeBox(15.5F, 0F, 5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 99
		bodyModel[1050].setRotationPoint(37F, -22F, -25F);

		bodyModel[1051].addBox(16.5F, 0F, 5F, 1, 5, 2, 0F); // Box 100
		bodyModel[1051].setRotationPoint(37F, -22F, -25F);

		bodyModel[1052].addShapeBox(17.5F, 0F, 5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 101
		bodyModel[1052].setRotationPoint(37F, -22F, -25F);

		bodyModel[1053].addShapeBox(18F, 0F, 5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 102
		bodyModel[1053].setRotationPoint(37F, -22F, -25F);

		bodyModel[1054].addBox(19F, 0F, 5F, 1, 5, 2, 0F); // Box 103
		bodyModel[1054].setRotationPoint(37F, -22F, -25F);

		bodyModel[1055].addShapeBox(20F, 0F, 5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 104
		bodyModel[1055].setRotationPoint(37F, -22F, -25F);

		bodyModel[1056].addShapeBox(20.5F, 0F, 5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 105
		bodyModel[1056].setRotationPoint(37F, -22F, -25F);

		bodyModel[1057].addBox(21.5F, 0F, 5F, 1, 5, 2, 0F); // Box 106
		bodyModel[1057].setRotationPoint(37F, -22F, -25F);

		bodyModel[1058].addShapeBox(22.5F, 0F, 5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 107
		bodyModel[1058].setRotationPoint(37F, -22F, -25F);

		bodyModel[1059].addBox(9F, 0F, 7.5F, 1, 5, 2, 0F); // Box 108
		bodyModel[1059].setRotationPoint(37F, -22F, -25F);

		bodyModel[1060].addShapeBox(10F, 0F, 7.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 109
		bodyModel[1060].setRotationPoint(37F, -22F, -25F);

		bodyModel[1061].addShapeBox(7.5F, 0F, 7.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 110
		bodyModel[1061].setRotationPoint(37F, -22F, -25F);

		bodyModel[1062].addBox(6.5F, 0F, 7.5F, 1, 5, 2, 0F); // Box 111
		bodyModel[1062].setRotationPoint(37F, -22F, -25F);

		bodyModel[1063].addShapeBox(5.5F, 0F, 7.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 112
		bodyModel[1063].setRotationPoint(37F, -22F, -25F);

		bodyModel[1064].addShapeBox(8F, 0F, 7.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 113
		bodyModel[1064].setRotationPoint(37F, -22F, -25F);

		bodyModel[1065].addShapeBox(5F, 0F, 7.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 114
		bodyModel[1065].setRotationPoint(37F, -22F, -25F);

		bodyModel[1066].addBox(4F, 0F, 7.5F, 1, 5, 2, 0F); // Box 115
		bodyModel[1066].setRotationPoint(37F, -22F, -25F);

		bodyModel[1067].addShapeBox(3F, 0F, 7.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 116
		bodyModel[1067].setRotationPoint(37F, -22F, -25F);

		bodyModel[1068].addShapeBox(2.5F, 0F, 7.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 117
		bodyModel[1068].setRotationPoint(37F, -22F, -25F);

		bodyModel[1069].addBox(1.5F, 0F, 7.5F, 1, 5, 2, 0F); // Box 118
		bodyModel[1069].setRotationPoint(37F, -22F, -25F);

		bodyModel[1070].addShapeBox(0.5F, 0F, 7.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 119
		bodyModel[1070].setRotationPoint(37F, -22F, -25F);

		bodyModel[1071].addShapeBox(10.5F, 0F, 7.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 120
		bodyModel[1071].setRotationPoint(37F, -22F, -25F);

		bodyModel[1072].addBox(11.5F, 0F, 7.5F, 1, 5, 2, 0F); // Box 121
		bodyModel[1072].setRotationPoint(37F, -22F, -25F);

		bodyModel[1073].addShapeBox(12.5F, 0F, 7.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 122
		bodyModel[1073].setRotationPoint(37F, -22F, -25F);

		bodyModel[1074].addShapeBox(13F, 0F, 7.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 123
		bodyModel[1074].setRotationPoint(37F, -22F, -25F);

		bodyModel[1075].addBox(14F, 0F, 7.5F, 1, 5, 2, 0F); // Box 124
		bodyModel[1075].setRotationPoint(37F, -22F, -25F);

		bodyModel[1076].addShapeBox(15F, 0F, 7.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 125
		bodyModel[1076].setRotationPoint(37F, -22F, -25F);

		bodyModel[1077].addShapeBox(15.5F, 0F, 7.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 126
		bodyModel[1077].setRotationPoint(37F, -22F, -25F);

		bodyModel[1078].addBox(16.5F, 0F, 7.5F, 1, 5, 2, 0F); // Box 127
		bodyModel[1078].setRotationPoint(37F, -22F, -25F);

		bodyModel[1079].addShapeBox(17.5F, 0F, 7.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 128
		bodyModel[1079].setRotationPoint(37F, -22F, -25F);

		bodyModel[1080].addShapeBox(18F, 0F, 7.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 129
		bodyModel[1080].setRotationPoint(37F, -22F, -25F);

		bodyModel[1081].addBox(19F, 0F, 7.5F, 1, 5, 2, 0F); // Box 130
		bodyModel[1081].setRotationPoint(37F, -22F, -25F);

		bodyModel[1082].addShapeBox(20F, 0F, 7.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 131
		bodyModel[1082].setRotationPoint(37F, -22F, -25F);

		bodyModel[1083].addShapeBox(20.5F, 0F, 7.5F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 132
		bodyModel[1083].setRotationPoint(37F, -22F, -25F);

		bodyModel[1084].addBox(21.5F, 0F, 7.5F, 1, 5, 2, 0F); // Box 133
		bodyModel[1084].setRotationPoint(37F, -22F, -25F);

		bodyModel[1085].addShapeBox(22.5F, 0F, 7.5F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 134
		bodyModel[1085].setRotationPoint(37F, -22F, -25F);

		bodyModel[1086].addBox(9F, 0F, 10F, 1, 5, 2, 0F); // Box 135
		bodyModel[1086].setRotationPoint(37F, -22F, -25F);

		bodyModel[1087].addShapeBox(10F, 0F, 10F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 136
		bodyModel[1087].setRotationPoint(37F, -22F, -25F);

		bodyModel[1088].addShapeBox(7.5F, 0F, 10F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 137
		bodyModel[1088].setRotationPoint(37F, -22F, -25F);

		bodyModel[1089].addBox(6.5F, 0F, 10F, 1, 5, 2, 0F); // Box 138
		bodyModel[1089].setRotationPoint(37F, -22F, -25F);

		bodyModel[1090].addShapeBox(5.5F, 0F, 10F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 139
		bodyModel[1090].setRotationPoint(37F, -22F, -25F);

		bodyModel[1091].addShapeBox(8F, 0F, 10F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 140
		bodyModel[1091].setRotationPoint(37F, -22F, -25F);

		bodyModel[1092].addShapeBox(5F, 0F, 10F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 141
		bodyModel[1092].setRotationPoint(37F, -22F, -25F);

		bodyModel[1093].addBox(4F, 0F, 10F, 1, 5, 2, 0F); // Box 142
		bodyModel[1093].setRotationPoint(37F, -22F, -25F);

		bodyModel[1094].addShapeBox(3F, 0F, 10F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 143
		bodyModel[1094].setRotationPoint(37F, -22F, -25F);

		bodyModel[1095].addShapeBox(2.5F, 0F, 10F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 144
		bodyModel[1095].setRotationPoint(37F, -22F, -25F);

		bodyModel[1096].addBox(1.5F, 0F, 10F, 1, 5, 2, 0F); // Box 145
		bodyModel[1096].setRotationPoint(37F, -22F, -25F);

		bodyModel[1097].addShapeBox(0.5F, 0F, 10F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 146
		bodyModel[1097].setRotationPoint(37F, -22F, -25F);

		bodyModel[1098].addShapeBox(10.5F, 0F, 10F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 147
		bodyModel[1098].setRotationPoint(37F, -22F, -25F);

		bodyModel[1099].addBox(11.5F, 0F, 10F, 1, 5, 2, 0F); // Box 148
		bodyModel[1099].setRotationPoint(37F, -22F, -25F);

		bodyModel[1100].addShapeBox(12.5F, 0F, 10F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 149
		bodyModel[1100].setRotationPoint(37F, -22F, -25F);

		bodyModel[1101].addShapeBox(13F, 0F, 10F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 150
		bodyModel[1101].setRotationPoint(37F, -22F, -25F);

		bodyModel[1102].addBox(14F, 0F, 10F, 1, 5, 2, 0F); // Box 151
		bodyModel[1102].setRotationPoint(37F, -22F, -25F);

		bodyModel[1103].addShapeBox(15F, 0F, 10F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 152
		bodyModel[1103].setRotationPoint(37F, -22F, -25F);

		bodyModel[1104].addShapeBox(15.5F, 0F, 10F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 153
		bodyModel[1104].setRotationPoint(37F, -22F, -25F);

		bodyModel[1105].addBox(16.5F, 0F, 10F, 1, 5, 2, 0F); // Box 154
		bodyModel[1105].setRotationPoint(37F, -22F, -25F);

		bodyModel[1106].addShapeBox(17.5F, 0F, 10F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 155
		bodyModel[1106].setRotationPoint(37F, -22F, -25F);

		bodyModel[1107].addShapeBox(18F, 0F, 10F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 156
		bodyModel[1107].setRotationPoint(37F, -22F, -25F);

		bodyModel[1108].addBox(19F, 0F, 10F, 1, 5, 2, 0F); // Box 157
		bodyModel[1108].setRotationPoint(37F, -22F, -25F);

		bodyModel[1109].addShapeBox(20F, 0F, 10F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 158
		bodyModel[1109].setRotationPoint(37F, -22F, -25F);

		bodyModel[1110].addShapeBox(20.5F, 0F, 10F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 159
		bodyModel[1110].setRotationPoint(37F, -22F, -25F);

		bodyModel[1111].addBox(21.5F, 0F, 10F, 1, 5, 2, 0F); // Box 160
		bodyModel[1111].setRotationPoint(37F, -22F, -25F);

		bodyModel[1112].addShapeBox(22.5F, 0F, 10F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 161
		bodyModel[1112].setRotationPoint(37F, -22F, -25F);

		bodyModel[1113].addShapeBox(1F, 1F, 2F, 22, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 162
		bodyModel[1113].setRotationPoint(37F, -22F, -25F);

		bodyModel[1114].addShapeBox(1F, 1F, 7F, 22, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 163
		bodyModel[1114].setRotationPoint(37F, -22F, -25F);

		bodyModel[1115].addShapeBox(1F, 1F, 9F, 22, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[1115].setRotationPoint(37F, -22F, -25F);

		bodyModel[1116].addShapeBox(1F, 1F, 4F, 22, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[1116].setRotationPoint(37F, -22F, -25F);

		bodyModel[1117].addBox(-1F, 1F, 4F, 1, 1, 4, 0F); // Box 166
		bodyModel[1117].setRotationPoint(37F, -22F, -25F);

		bodyModel[1118].addBox(24F, 1F, 4F, 1, 1, 4, 0F); // Box 167
		bodyModel[1118].setRotationPoint(37F, -22F, -25F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 39
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 42
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 50
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 62
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 164
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 165

		bodyDoorOpenModel[0].addShapeBox(-1.5F, 0F, -14F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyDoorOpenModel[0].setRotationPoint(11F, -55F, 0F);
		bodyDoorOpenModel[0].rotateAngleZ = 0.08726646F;

		bodyDoorOpenModel[1].addShapeBox(-1.5F, 0F, 4F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyDoorOpenModel[1].setRotationPoint(11F, -55F, 0F);
		bodyDoorOpenModel[1].rotateAngleZ = 0.08726646F;

		bodyDoorOpenModel[2].addShapeBox(-1.5F, 0F, -1F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyDoorOpenModel[2].setRotationPoint(-3F, -55F, 20F);
		bodyDoorOpenModel[2].rotateAngleX = 0.17453293F;

		bodyDoorOpenModel[3].addShapeBox(-1.5F, 0F, -4F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyDoorOpenModel[3].setRotationPoint(-3F, -55F, -20F);
		bodyDoorOpenModel[3].rotateAngleX = -0.20943951F;

		bodyDoorOpenModel[4].addShapeBox(-4.5F, 0F, 4F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyDoorOpenModel[4].setRotationPoint(-11F, -55F, 0F);
		bodyDoorOpenModel[4].rotateAngleZ = -0.08726646F;

		bodyDoorOpenModel[5].addShapeBox(-4.5F, 0F, -14F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyDoorOpenModel[5].setRotationPoint(-11F, -55F, 0F);
		bodyDoorOpenModel[5].rotateAngleZ = -0.08726646F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 46
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 46
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 120
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 121
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 162
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 163

		bodyDoorCloseModel[0].addShapeBox(-0.5F, 1F, 4F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyDoorCloseModel[0].setRotationPoint(11F, -54.5F, 0F);
		bodyDoorCloseModel[0].rotateAngleZ = -1.3962634F;

		bodyDoorCloseModel[1].addShapeBox(-0.5F, 1F, -14F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyDoorCloseModel[1].setRotationPoint(11F, -54.5F, 0F);
		bodyDoorCloseModel[1].rotateAngleZ = -1.3962634F;

		bodyDoorCloseModel[2].addShapeBox(-4.5F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyDoorCloseModel[2].setRotationPoint(0F, -55F, -20F);
		bodyDoorCloseModel[2].rotateAngleX = -0.19198622F;

		bodyDoorCloseModel[3].addShapeBox(-4.5F, 0F, -1F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyDoorCloseModel[3].setRotationPoint(0F, -55F, 20F);
		bodyDoorCloseModel[3].rotateAngleX = 0.19198622F;

		bodyDoorCloseModel[4].addShapeBox(-4.5F, 1F, 4F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyDoorCloseModel[4].setRotationPoint(-12F, -54.5F, 0F);
		bodyDoorCloseModel[4].rotateAngleZ = 1.3962634F;

		bodyDoorCloseModel[5].addShapeBox(-4.5F, 1F, -14F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyDoorCloseModel[5].setRotationPoint(-12F, -54.5F, 0F);
		bodyDoorCloseModel[5].rotateAngleZ = 1.3962634F;
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Box 628
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 630
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 631
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 633
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 635
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 637
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 638
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 649
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 650
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 651
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Box 652
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 653
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 654
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 655
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 656
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 657
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 658
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 659
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 668
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 669
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Box 670
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 671
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 672
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 673
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 674
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 675
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 676
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 677
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 678
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 679
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 680
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 681
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 682
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Box 683
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 684
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 685
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 569, 57, textureX, textureY); // Box 686
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Box 687
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Box 688
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 689
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Box 690
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 691
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 692
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 693
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 711
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 712
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 713
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Box 714
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 715
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 716
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 717
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 718
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 719
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Box 720
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 721
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 722
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Box 723
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 724
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 725
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Box 727
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 728
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 729
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 730
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 731
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 732
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 733
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 734
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 735
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 736
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 737
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 738
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 739
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 740
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 741
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 742
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 743
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 744
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Box 745
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 746
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 747
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 748
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 749
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 750
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 751
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 513, 73, textureX, textureY); // Box 752
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Box 753
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 754
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 755
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Box 756
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 2
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 3
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 4
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 5
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 6
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Box 7
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 633, 105, textureX, textureY); // Box 8
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 9
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Box 10
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 11
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Box 12
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 13
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Box 14
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 529, 113, textureX, textureY); // Box 15
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 16
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 17
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 18
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 19
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 609, 113, textureX, textureY); // Box 20
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 21
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 22
		leftTrackWheelModels[110] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 23
		leftTrackWheelModels[111] = new ModelRendererTurbo(this, 673, 113, textureX, textureY); // Box 24
		leftTrackWheelModels[112] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 25
		leftTrackWheelModels[113] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 26
		leftTrackWheelModels[114] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Box 27
		leftTrackWheelModels[115] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 28
		leftTrackWheelModels[116] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 29
		leftTrackWheelModels[117] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 30
		leftTrackWheelModels[118] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 31
		leftTrackWheelModels[119] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 32
		leftTrackWheelModels[120] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 33
		leftTrackWheelModels[121] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 34
		leftTrackWheelModels[122] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 35
		leftTrackWheelModels[123] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Box 36
		leftTrackWheelModels[124] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 37
		leftTrackWheelModels[125] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 38
		leftTrackWheelModels[126] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 39
		leftTrackWheelModels[127] = new ModelRendererTurbo(this, 641, 121, textureX, textureY); // Box 40
		leftTrackWheelModels[128] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 41
		leftTrackWheelModels[129] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 42
		leftTrackWheelModels[130] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 43
		leftTrackWheelModels[131] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 44
		leftTrackWheelModels[132] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 45
		leftTrackWheelModels[133] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 46

		leftTrackWheelModels[0].addShapeBox(6F, -3F, 20.5F, 3, 6, 7, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 628
		leftTrackWheelModels[0].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[1].addShapeBox(-3F, -9F, 20.5F, 6, 3, 7, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 630
		leftTrackWheelModels[1].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[2].addShapeBox(-3F, -3F, 20.5F, 6, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		leftTrackWheelModels[2].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[3].addShapeBox(6F, -9F, 20.5F, 3, 6, 7, 0F,4F, -3F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 633
		leftTrackWheelModels[3].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[4].addShapeBox(6F, 3F, 20.5F, 3, 6, 7, 0F,0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F); // Box 635
		leftTrackWheelModels[4].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[5].addShapeBox(-3F, 1F, 20.5F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 637
		leftTrackWheelModels[5].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[6].addShapeBox(-3F, -1F, 20.5F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		leftTrackWheelModels[6].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[7].addShapeBox(-1F, -6F, 21.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 649
		leftTrackWheelModels[7].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[8].addShapeBox(-1F, 3F, 21.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		leftTrackWheelModels[8].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[9].addShapeBox(2F, -1F, 21.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		leftTrackWheelModels[9].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[10].addShapeBox(-6F, -1F, 21.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		leftTrackWheelModels[10].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[11].addShapeBox(-6F, -3F, 21.5F, 4, 2, 4, 0F,-1F, 3.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F); // Box 653
		leftTrackWheelModels[11].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[12].addShapeBox(2F, -3F, 21.5F, 4, 2, 4, 0F,1F, -1F, 0F, -1F, 3.5F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F); // Box 654
		leftTrackWheelModels[12].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[13].addShapeBox(-6F, 1F, 21.5F, 4, 2, 4, 0F,0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F); // Box 655
		leftTrackWheelModels[13].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[14].addShapeBox(2F, 1F, 21.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F); // Box 656
		leftTrackWheelModels[14].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[15].addShapeBox(-1.5F, -0.5F, 16.5F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		leftTrackWheelModels[15].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[16].addShapeBox(-1.5F, -1.5F, 16.5F, 3, 1, 11, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		leftTrackWheelModels[16].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[17].addShapeBox(-1.5F, 0.5F, 16.5F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 659
		leftTrackWheelModels[17].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[18].addShapeBox(-1F, -6F, 21.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 668
		leftTrackWheelModels[18].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[19].addShapeBox(-3F, -3F, 20.5F, 6, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		leftTrackWheelModels[19].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[20].addShapeBox(-1.5F, -1.5F, 16.5F, 3, 1, 11, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		leftTrackWheelModels[20].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[21].addShapeBox(-1.5F, -0.5F, 16.5F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		leftTrackWheelModels[21].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[22].addShapeBox(-1.5F, 0.5F, 16.5F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 672
		leftTrackWheelModels[22].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[23].addShapeBox(-3F, -1F, 20.5F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 673
		leftTrackWheelModels[23].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[24].addShapeBox(-3F, 1F, 20.5F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 674
		leftTrackWheelModels[24].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[25].addShapeBox(2F, 1F, 21.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F); // Box 675
		leftTrackWheelModels[25].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[26].addShapeBox(2F, -1F, 21.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		leftTrackWheelModels[26].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[27].addShapeBox(2F, -3F, 21.5F, 4, 2, 4, 0F,1F, -1F, 0F, -1F, 3.5F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F); // Box 677
		leftTrackWheelModels[27].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[28].addShapeBox(-6F, -3F, 21.5F, 4, 2, 4, 0F,-1F, 3.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F); // Box 678
		leftTrackWheelModels[28].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[29].addShapeBox(-6F, -1F, 21.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		leftTrackWheelModels[29].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[30].addShapeBox(-6F, 1F, 21.5F, 4, 2, 4, 0F,0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F); // Box 680
		leftTrackWheelModels[30].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[31].addShapeBox(-1F, 3F, 21.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		leftTrackWheelModels[31].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[32].addShapeBox(-3F, 6F, 20.5F, 6, 3, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 682
		leftTrackWheelModels[32].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[33].addShapeBox(-9F, -3F, 20.5F, 3, 6, 7, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 683
		leftTrackWheelModels[33].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[34].addShapeBox(-9F, 3F, 20.5F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F); // Box 684
		leftTrackWheelModels[34].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[35].addShapeBox(-9F, -9F, 20.5F, 3, 6, 7, 0F,-5.5F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 685
		leftTrackWheelModels[35].setRotationPoint(-50F, 0F, 0F);

		leftTrackWheelModels[36].addShapeBox(-3F, -9F, 20.5F, 6, 3, 7, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 686
		leftTrackWheelModels[36].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[37].addShapeBox(-9F, -9F, 20.5F, 3, 6, 7, 0F,-5.5F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 687
		leftTrackWheelModels[37].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[38].addShapeBox(-9F, -3F, 20.5F, 3, 6, 7, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 688
		leftTrackWheelModels[38].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[39].addShapeBox(-9F, 3F, 20.5F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F); // Box 689
		leftTrackWheelModels[39].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[40].addShapeBox(-3F, 6F, 20.5F, 6, 3, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 690
		leftTrackWheelModels[40].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[41].addShapeBox(6F, 3F, 20.5F, 3, 6, 7, 0F,0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F); // Box 691
		leftTrackWheelModels[41].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[42].addShapeBox(6F, -3F, 20.5F, 3, 6, 7, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 692
		leftTrackWheelModels[42].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[43].addShapeBox(6F, -9F, 20.5F, 3, 6, 7, 0F,4F, -3F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 693
		leftTrackWheelModels[43].setRotationPoint(50F, 0F, 0F);

		leftTrackWheelModels[44].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 711
		leftTrackWheelModels[44].setRotationPoint(-37F, 7F, 0F);

		leftTrackWheelModels[45].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 712
		leftTrackWheelModels[45].setRotationPoint(-37F, 7F, 0F);

		leftTrackWheelModels[46].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 713
		leftTrackWheelModels[46].setRotationPoint(-37F, 7F, 0F);

		leftTrackWheelModels[47].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 714
		leftTrackWheelModels[47].setRotationPoint(-32F, 7F, 0F);

		leftTrackWheelModels[48].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 715
		leftTrackWheelModels[48].setRotationPoint(-32F, 7F, 0F);

		leftTrackWheelModels[49].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		leftTrackWheelModels[49].setRotationPoint(-32F, 7F, 0F);

		leftTrackWheelModels[50].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 717
		leftTrackWheelModels[50].setRotationPoint(-27F, 7F, 0F);

		leftTrackWheelModels[51].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		leftTrackWheelModels[51].setRotationPoint(-27F, 7F, 0F);

		leftTrackWheelModels[52].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		leftTrackWheelModels[52].setRotationPoint(-27F, 7F, 0F);

		leftTrackWheelModels[53].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 720
		leftTrackWheelModels[53].setRotationPoint(-22F, 7F, 0F);

		leftTrackWheelModels[54].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		leftTrackWheelModels[54].setRotationPoint(-22F, 7F, 0F);

		leftTrackWheelModels[55].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 722
		leftTrackWheelModels[55].setRotationPoint(-22F, 7F, 0F);

		leftTrackWheelModels[56].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 723
		leftTrackWheelModels[56].setRotationPoint(-17F, 7F, 0F);

		leftTrackWheelModels[57].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		leftTrackWheelModels[57].setRotationPoint(-17F, 7F, 0F);

		leftTrackWheelModels[58].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		leftTrackWheelModels[58].setRotationPoint(-17F, 7F, 0F);

		leftTrackWheelModels[59].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		leftTrackWheelModels[59].setRotationPoint(37F, 7F, 0F);

		leftTrackWheelModels[60].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		leftTrackWheelModels[60].setRotationPoint(37F, 7F, 0F);

		leftTrackWheelModels[61].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 729
		leftTrackWheelModels[61].setRotationPoint(37F, 7F, 0F);

		leftTrackWheelModels[62].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		leftTrackWheelModels[62].setRotationPoint(32F, 7F, 0F);

		leftTrackWheelModels[63].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		leftTrackWheelModels[63].setRotationPoint(32F, 7F, 0F);

		leftTrackWheelModels[64].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 732
		leftTrackWheelModels[64].setRotationPoint(32F, 7F, 0F);

		leftTrackWheelModels[65].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 733
		leftTrackWheelModels[65].setRotationPoint(27F, 7F, 0F);

		leftTrackWheelModels[66].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 734
		leftTrackWheelModels[66].setRotationPoint(27F, 7F, 0F);

		leftTrackWheelModels[67].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 735
		leftTrackWheelModels[67].setRotationPoint(27F, 7F, 0F);

		leftTrackWheelModels[68].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 736
		leftTrackWheelModels[68].setRotationPoint(22F, 7F, 0F);

		leftTrackWheelModels[69].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 737
		leftTrackWheelModels[69].setRotationPoint(22F, 7F, 0F);

		leftTrackWheelModels[70].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 738
		leftTrackWheelModels[70].setRotationPoint(22F, 7F, 0F);

		leftTrackWheelModels[71].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 739
		leftTrackWheelModels[71].setRotationPoint(17F, 7F, 0F);

		leftTrackWheelModels[72].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 740
		leftTrackWheelModels[72].setRotationPoint(17F, 7F, 0F);

		leftTrackWheelModels[73].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 741
		leftTrackWheelModels[73].setRotationPoint(17F, 7F, 0F);

		leftTrackWheelModels[74].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 742
		leftTrackWheelModels[74].setRotationPoint(10F, 7F, 0F);

		leftTrackWheelModels[75].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 743
		leftTrackWheelModels[75].setRotationPoint(10F, 7F, 0F);

		leftTrackWheelModels[76].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 744
		leftTrackWheelModels[76].setRotationPoint(10F, 7F, 0F);

		leftTrackWheelModels[77].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
		leftTrackWheelModels[77].setRotationPoint(5F, 7F, 0F);

		leftTrackWheelModels[78].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		leftTrackWheelModels[78].setRotationPoint(5F, 7F, 0F);

		leftTrackWheelModels[79].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 747
		leftTrackWheelModels[79].setRotationPoint(5F, 7F, 0F);

		leftTrackWheelModels[80].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		leftTrackWheelModels[80].setRotationPoint(0F, 7F, 0F);

		leftTrackWheelModels[81].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 749
		leftTrackWheelModels[81].setRotationPoint(0F, 7F, 0F);

		leftTrackWheelModels[82].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 750
		leftTrackWheelModels[82].setRotationPoint(0F, 7F, 0F);

		leftTrackWheelModels[83].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 751
		leftTrackWheelModels[83].setRotationPoint(-5F, 7F, 0F);

		leftTrackWheelModels[84].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		leftTrackWheelModels[84].setRotationPoint(-5F, 7F, 0F);

		leftTrackWheelModels[85].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 753
		leftTrackWheelModels[85].setRotationPoint(-5F, 7F, 0F);

		leftTrackWheelModels[86].addShapeBox(-2F, -1F, 20.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		leftTrackWheelModels[86].setRotationPoint(-10F, 7F, 0F);

		leftTrackWheelModels[87].addShapeBox(-2F, -2F, 20.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		leftTrackWheelModels[87].setRotationPoint(-10F, 7F, 0F);

		leftTrackWheelModels[88].addShapeBox(-2F, 1F, 20.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 756
		leftTrackWheelModels[88].setRotationPoint(-10F, 7F, 0F);

		leftTrackWheelModels[89].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftTrackWheelModels[89].setRotationPoint(-37F, 7F, 0F);

		leftTrackWheelModels[90].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftTrackWheelModels[90].setRotationPoint(-37F, 7F, 0F);

		leftTrackWheelModels[91].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 4
		leftTrackWheelModels[91].setRotationPoint(-37F, 7F, 0F);

		leftTrackWheelModels[92].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftTrackWheelModels[92].setRotationPoint(-32F, 7F, 0F);

		leftTrackWheelModels[93].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[93].setRotationPoint(-32F, 7F, 0F);

		leftTrackWheelModels[94].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 7
		leftTrackWheelModels[94].setRotationPoint(-32F, 7F, 0F);

		leftTrackWheelModels[95].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
		leftTrackWheelModels[95].setRotationPoint(-27F, 7F, 0F);

		leftTrackWheelModels[96].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftTrackWheelModels[96].setRotationPoint(-27F, 7F, 0F);

		leftTrackWheelModels[97].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftTrackWheelModels[97].setRotationPoint(-27F, 7F, 0F);

		leftTrackWheelModels[98].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftTrackWheelModels[98].setRotationPoint(-22F, 7F, 0F);

		leftTrackWheelModels[99].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[99].setRotationPoint(-22F, 7F, 0F);

		leftTrackWheelModels[100].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		leftTrackWheelModels[100].setRotationPoint(-22F, 7F, 0F);

		leftTrackWheelModels[101].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftTrackWheelModels[101].setRotationPoint(-17F, 7F, 0F);

		leftTrackWheelModels[102].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[102].setRotationPoint(-17F, 7F, 0F);

		leftTrackWheelModels[103].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 16
		leftTrackWheelModels[103].setRotationPoint(-17F, 7F, 0F);

		leftTrackWheelModels[104].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 17
		leftTrackWheelModels[104].setRotationPoint(-10F, 7F, 0F);

		leftTrackWheelModels[105].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftTrackWheelModels[105].setRotationPoint(-10F, 7F, 0F);

		leftTrackWheelModels[106].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		leftTrackWheelModels[106].setRotationPoint(-10F, 7F, 0F);

		leftTrackWheelModels[107].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 20
		leftTrackWheelModels[107].setRotationPoint(-5F, 7F, 0F);

		leftTrackWheelModels[108].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		leftTrackWheelModels[108].setRotationPoint(-5F, 7F, 0F);

		leftTrackWheelModels[109].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftTrackWheelModels[109].setRotationPoint(-5F, 7F, 0F);

		leftTrackWheelModels[110].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 23
		leftTrackWheelModels[110].setRotationPoint(0F, 7F, 0F);

		leftTrackWheelModels[111].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftTrackWheelModels[111].setRotationPoint(0F, 7F, 0F);

		leftTrackWheelModels[112].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		leftTrackWheelModels[112].setRotationPoint(0F, 7F, 0F);

		leftTrackWheelModels[113].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 26
		leftTrackWheelModels[113].setRotationPoint(10F, 7F, 0F);

		leftTrackWheelModels[114].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftTrackWheelModels[114].setRotationPoint(10F, 7F, 0F);

		leftTrackWheelModels[115].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftTrackWheelModels[115].setRotationPoint(10F, 7F, 0F);

		leftTrackWheelModels[116].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 29
		leftTrackWheelModels[116].setRotationPoint(5F, 7F, 0F);

		leftTrackWheelModels[117].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		leftTrackWheelModels[117].setRotationPoint(5F, 7F, 0F);

		leftTrackWheelModels[118].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		leftTrackWheelModels[118].setRotationPoint(5F, 7F, 0F);

		leftTrackWheelModels[119].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		leftTrackWheelModels[119].setRotationPoint(17F, 7F, 0F);

		leftTrackWheelModels[120].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		leftTrackWheelModels[120].setRotationPoint(17F, 7F, 0F);

		leftTrackWheelModels[121].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		leftTrackWheelModels[121].setRotationPoint(17F, 7F, 0F);

		leftTrackWheelModels[122].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 35
		leftTrackWheelModels[122].setRotationPoint(22F, 7F, 0F);

		leftTrackWheelModels[123].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		leftTrackWheelModels[123].setRotationPoint(22F, 7F, 0F);

		leftTrackWheelModels[124].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftTrackWheelModels[124].setRotationPoint(22F, 7F, 0F);

		leftTrackWheelModels[125].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		leftTrackWheelModels[125].setRotationPoint(27F, 7F, 0F);

		leftTrackWheelModels[126].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		leftTrackWheelModels[126].setRotationPoint(27F, 7F, 0F);

		leftTrackWheelModels[127].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		leftTrackWheelModels[127].setRotationPoint(27F, 7F, 0F);

		leftTrackWheelModels[128].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftTrackWheelModels[128].setRotationPoint(32F, 7F, 0F);

		leftTrackWheelModels[129].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftTrackWheelModels[129].setRotationPoint(32F, 7F, 0F);

		leftTrackWheelModels[130].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 43
		leftTrackWheelModels[130].setRotationPoint(32F, 7F, 0F);

		leftTrackWheelModels[131].addShapeBox(-2F, 1F, 24.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 44
		leftTrackWheelModels[131].setRotationPoint(37F, 7F, 0F);

		leftTrackWheelModels[132].addShapeBox(-2F, -1F, 24.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftTrackWheelModels[132].setRotationPoint(37F, 7F, 0F);

		leftTrackWheelModels[133].addShapeBox(-2F, -2F, 24.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftTrackWheelModels[133].setRotationPoint(37F, 7F, 0F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 833, 169, textureX, textureY); // Box 749
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Box 750
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 705, 177, textureX, textureY); // Box 751
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 657, 177, textureX, textureY); // Box 752
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 769, 177, textureX, textureY); // Box 753
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 745, 177, textureX, textureY); // Box 754
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 793, 177, textureX, textureY); // Box 755
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 865, 177, textureX, textureY); // Box 756
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 889, 177, textureX, textureY); // Box 757
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 758
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Box 759
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Box 760
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 953, 177, textureX, textureY); // Box 761
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Box 762
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 513, 185, textureX, textureY); // Box 763
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 545, 185, textureX, textureY); // Box 764
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 729, 185, textureX, textureY); // Box 765
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Box 766
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 753, 185, textureX, textureY); // Box 767
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 673, 185, textureX, textureY); // Box 768
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 769, 185, textureX, textureY); // Box 769
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 833, 185, textureX, textureY); // Box 770
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 849, 185, textureX, textureY); // Box 771
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 873, 185, textureX, textureY); // Box 772
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 633, 193, textureX, textureY); // Box 773
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 649, 193, textureX, textureY); // Box 774
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 697, 193, textureX, textureY); // Box 775
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 785, 193, textureX, textureY); // Box 776
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 1009, 185, textureX, textureY); // Box 777
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 753, 193, textureX, textureY); // Box 778
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 817, 193, textureX, textureY); // Box 779
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 713, 193, textureX, textureY); // Box 780
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 897, 193, textureX, textureY); // Box 781
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 921, 193, textureX, textureY); // Box 782
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 953, 193, textureX, textureY); // Box 783
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 985, 193, textureX, textureY); // Box 784
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 513, 201, textureX, textureY); // Box 785
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 545, 201, textureX, textureY); // Box 786
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 577, 201, textureX, textureY); // Box 787
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 537, 201, textureX, textureY); // Box 788
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 569, 201, textureX, textureY); // Box 789
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 601, 201, textureX, textureY); // Box 790
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 617, 201, textureX, textureY); // Box 791
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 665, 201, textureX, textureY); // Box 792
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Box 881
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 809, 193, textureX, textureY); // Box 882
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 633, 201, textureX, textureY); // Box 883
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 697, 201, textureX, textureY); // Box 884
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 649, 209, textureX, textureY); // Box 885
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 529, 217, textureX, textureY); // Box 886
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 553, 217, textureX, textureY); // Box 887
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 889, 225, textureX, textureY); // Box 888
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 665, 217, textureX, textureY); // Box 889
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 913, 225, textureX, textureY); // Box 890
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 737, 233, textureX, textureY); // Box 891
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 761, 233, textureX, textureY); // Box 892
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 785, 233, textureX, textureY); // Box 893
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 841, 233, textureX, textureY); // Box 894
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 953, 233, textureX, textureY); // Box 895
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 1009, 233, textureX, textureY); // Box 896
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 529, 241, textureX, textureY); // Box 897
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 553, 241, textureX, textureY); // Box 898
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 577, 241, textureX, textureY); // Box 899
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 633, 241, textureX, textureY); // Box 900
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 657, 241, textureX, textureY); // Box 901
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 681, 241, textureX, textureY); // Box 902
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 697, 241, textureX, textureY); // Box 903
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 873, 241, textureX, textureY); // Box 904
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 889, 241, textureX, textureY); // Box 905
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 905, 241, textureX, textureY); // Box 906
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 921, 241, textureX, textureY); // Box 907
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 689, 249, textureX, textureY); // Box 908
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 705, 249, textureX, textureY); // Box 909
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 721, 249, textureX, textureY); // Box 910
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 737, 249, textureX, textureY); // Box 911
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 753, 249, textureX, textureY); // Box 912
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 769, 249, textureX, textureY); // Box 913
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 785, 249, textureX, textureY); // Box 914
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 801, 249, textureX, textureY); // Box 915
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 817, 249, textureX, textureY); // Box 916
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 833, 249, textureX, textureY); // Box 917
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 849, 249, textureX, textureY); // Box 918
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 865, 249, textureX, textureY); // Box 919
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 881, 249, textureX, textureY); // Box 920
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 897, 249, textureX, textureY); // Box 921
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 913, 249, textureX, textureY); // Box 922
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 929, 249, textureX, textureY); // Box 923
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 945, 249, textureX, textureY); // Box 924
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 961, 249, textureX, textureY); // Box 925
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 977, 249, textureX, textureY); // Box 926
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 993, 249, textureX, textureY); // Box 927
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 1009, 249, textureX, textureY); // Box 928
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Box 929
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 930
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 513, 257, textureX, textureY); // Box 931
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 529, 257, textureX, textureY); // Box 932
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 545, 257, textureX, textureY); // Box 933
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 561, 257, textureX, textureY); // Box 934
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 577, 257, textureX, textureY); // Box 935
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 593, 257, textureX, textureY); // Box 936
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 609, 257, textureX, textureY); // Box 937
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 625, 257, textureX, textureY); // Box 938
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 641, 257, textureX, textureY); // Box 939
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 657, 257, textureX, textureY); // Box 940
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 673, 257, textureX, textureY); // Box 941
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 689, 257, textureX, textureY); // Box 942
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 705, 257, textureX, textureY); // Box 943
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 721, 257, textureX, textureY); // Box 944
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 737, 257, textureX, textureY); // Box 945
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 753, 257, textureX, textureY); // Box 946
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 769, 257, textureX, textureY); // Box 947
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 785, 257, textureX, textureY); // Box 948
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 801, 257, textureX, textureY); // Box 949
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 817, 257, textureX, textureY); // Box 950
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 833, 257, textureX, textureY); // Box 951
		rightTrackWheelModels[115] = new ModelRendererTurbo(this, 849, 257, textureX, textureY); // Box 952
		rightTrackWheelModels[116] = new ModelRendererTurbo(this, 865, 257, textureX, textureY); // Box 953
		rightTrackWheelModels[117] = new ModelRendererTurbo(this, 881, 257, textureX, textureY); // Box 954
		rightTrackWheelModels[118] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Box 955
		rightTrackWheelModels[119] = new ModelRendererTurbo(this, 913, 257, textureX, textureY); // Box 956
		rightTrackWheelModels[120] = new ModelRendererTurbo(this, 929, 257, textureX, textureY); // Box 957
		rightTrackWheelModels[121] = new ModelRendererTurbo(this, 945, 257, textureX, textureY); // Box 958
		rightTrackWheelModels[122] = new ModelRendererTurbo(this, 961, 257, textureX, textureY); // Box 959
		rightTrackWheelModels[123] = new ModelRendererTurbo(this, 977, 257, textureX, textureY); // Box 960
		rightTrackWheelModels[124] = new ModelRendererTurbo(this, 993, 257, textureX, textureY); // Box 961
		rightTrackWheelModels[125] = new ModelRendererTurbo(this, 1009, 257, textureX, textureY); // Box 962
		rightTrackWheelModels[126] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Box 963
		rightTrackWheelModels[127] = new ModelRendererTurbo(this, 513, 265, textureX, textureY); // Box 964
		rightTrackWheelModels[128] = new ModelRendererTurbo(this, 529, 265, textureX, textureY); // Box 965
		rightTrackWheelModels[129] = new ModelRendererTurbo(this, 545, 265, textureX, textureY); // Box 966
		rightTrackWheelModels[130] = new ModelRendererTurbo(this, 561, 265, textureX, textureY); // Box 967
		rightTrackWheelModels[131] = new ModelRendererTurbo(this, 577, 265, textureX, textureY); // Box 968
		rightTrackWheelModels[132] = new ModelRendererTurbo(this, 593, 265, textureX, textureY); // Box 969
		rightTrackWheelModels[133] = new ModelRendererTurbo(this, 609, 265, textureX, textureY); // Box 970

		rightTrackWheelModels[0].addShapeBox(6F, -3F, -26.5F, 3, 6, 7, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 749
		rightTrackWheelModels[0].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[1].addShapeBox(6F, -9F, -26.5F, 3, 6, 7, 0F,4F, -3F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 750
		rightTrackWheelModels[1].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[2].addShapeBox(-3F, -9F, -26.5F, 6, 3, 7, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 751
		rightTrackWheelModels[2].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[3].addShapeBox(-9F, -9F, -26.5F, 3, 6, 7, 0F,-5.5F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 752
		rightTrackWheelModels[3].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[4].addShapeBox(-6F, -3F, -25.5F, 4, 2, 4, 0F,-1F, 3.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F); // Box 753
		rightTrackWheelModels[4].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[5].addShapeBox(-1F, -6F, -25.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		rightTrackWheelModels[5].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[6].addShapeBox(2F, -3F, -25.5F, 4, 2, 4, 0F,1F, -1F, 0F, -1F, 3.5F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F); // Box 755
		rightTrackWheelModels[6].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[7].addShapeBox(2F, -1F, -25.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		rightTrackWheelModels[7].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[8].addShapeBox(2F, 1F, -25.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F); // Box 757
		rightTrackWheelModels[8].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[9].addShapeBox(-1.5F, -0.5F, -27.5F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		rightTrackWheelModels[9].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[10].addShapeBox(-1.5F, -1.5F, -27.5F, 3, 1, 11, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
		rightTrackWheelModels[10].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[11].addShapeBox(-1.5F, 0.5F, -27.5F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 760
		rightTrackWheelModels[11].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[12].addShapeBox(-3F, -1F, -26.5F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
		rightTrackWheelModels[12].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[13].addShapeBox(-3F, -3F, -26.5F, 6, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		rightTrackWheelModels[13].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[14].addShapeBox(-3F, 1F, -26.5F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 763
		rightTrackWheelModels[14].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[15].addShapeBox(6F, 3F, -26.5F, 3, 6, 7, 0F,0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F); // Box 764
		rightTrackWheelModels[15].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[16].addShapeBox(-3F, 6F, -26.5F, 6, 3, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 765
		rightTrackWheelModels[16].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[17].addShapeBox(-1F, 3F, -25.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 766
		rightTrackWheelModels[17].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[18].addShapeBox(-6F, 1F, -25.5F, 4, 2, 4, 0F,0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F); // Box 767
		rightTrackWheelModels[18].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[19].addShapeBox(-9F, 3F, -26.5F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F); // Box 768
		rightTrackWheelModels[19].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[20].addShapeBox(-9F, -3F, -26.5F, 3, 6, 7, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 769
		rightTrackWheelModels[20].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[21].addShapeBox(-6F, -1F, -25.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		rightTrackWheelModels[21].setRotationPoint(50F, 0F, 0F);

		rightTrackWheelModels[22].addShapeBox(6F, -3F, -26.5F, 3, 6, 7, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 771
		rightTrackWheelModels[22].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[23].addShapeBox(6F, 3F, -26.5F, 3, 6, 7, 0F,0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F); // Box 772
		rightTrackWheelModels[23].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[24].addShapeBox(2F, -1F, -25.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		rightTrackWheelModels[24].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[25].addShapeBox(6F, -9F, -26.5F, 3, 6, 7, 0F,4F, -3F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 774
		rightTrackWheelModels[25].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[26].addShapeBox(2F, -3F, -25.5F, 4, 2, 4, 0F,1F, -1F, 0F, -1F, 3.5F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F); // Box 775
		rightTrackWheelModels[26].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[27].addShapeBox(-3F, -9F, -26.5F, 6, 3, 7, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 776
		rightTrackWheelModels[27].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[28].addShapeBox(-1F, -6F, -25.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 777
		rightTrackWheelModels[28].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[29].addShapeBox(-1F, 3F, -25.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 778
		rightTrackWheelModels[29].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[30].addShapeBox(-3F, 6F, -26.5F, 6, 3, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 779
		rightTrackWheelModels[30].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[31].addShapeBox(-9F, 3F, -26.5F, 3, 6, 7, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -5.5F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F); // Box 780
		rightTrackWheelModels[31].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[32].addShapeBox(2F, 1F, -25.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F); // Box 781
		rightTrackWheelModels[32].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[33].addShapeBox(-3F, 1F, -26.5F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 782
		rightTrackWheelModels[33].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[34].addShapeBox(-3F, -1F, -26.5F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 783
		rightTrackWheelModels[34].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[35].addShapeBox(-3F, -3F, -26.5F, 6, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		rightTrackWheelModels[35].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[36].addShapeBox(-1.5F, -1.5F, -27.5F, 3, 1, 11, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 785
		rightTrackWheelModels[36].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[37].addShapeBox(-1.5F, -0.5F, -27.5F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		rightTrackWheelModels[37].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[38].addShapeBox(-1.5F, 0.5F, -27.5F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 787
		rightTrackWheelModels[38].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[39].addShapeBox(-6F, 1F, -25.5F, 4, 2, 4, 0F,0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, -1F, 3.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F); // Box 788
		rightTrackWheelModels[39].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[40].addShapeBox(-6F, -1F, -25.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		rightTrackWheelModels[40].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[41].addShapeBox(-6F, -3F, -25.5F, 4, 2, 4, 0F,-1F, 3.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 3.5F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F); // Box 790
		rightTrackWheelModels[41].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[42].addShapeBox(-9F, -3F, -26.5F, 3, 6, 7, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 791
		rightTrackWheelModels[42].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[43].addShapeBox(-9F, -9F, -26.5F, 3, 6, 7, 0F,-5.5F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, -5.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 792
		rightTrackWheelModels[43].setRotationPoint(-50F, 0F, 0F);

		rightTrackWheelModels[44].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		rightTrackWheelModels[44].setRotationPoint(-37F, 7F, 0F);

		rightTrackWheelModels[45].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		rightTrackWheelModels[45].setRotationPoint(-37F, 7F, 0F);

		rightTrackWheelModels[46].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 883
		rightTrackWheelModels[46].setRotationPoint(-37F, 7F, 0F);

		rightTrackWheelModels[47].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 884
		rightTrackWheelModels[47].setRotationPoint(-37F, 7F, 0F);

		rightTrackWheelModels[48].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 885
		rightTrackWheelModels[48].setRotationPoint(-37F, 7F, 0F);

		rightTrackWheelModels[49].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 886
		rightTrackWheelModels[49].setRotationPoint(-37F, 7F, 0F);

		rightTrackWheelModels[50].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 887
		rightTrackWheelModels[50].setRotationPoint(-32F, 7F, 0F);

		rightTrackWheelModels[51].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 888
		rightTrackWheelModels[51].setRotationPoint(-32F, 7F, 0F);

		rightTrackWheelModels[52].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 889
		rightTrackWheelModels[52].setRotationPoint(-32F, 7F, 0F);

		rightTrackWheelModels[53].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 890
		rightTrackWheelModels[53].setRotationPoint(-32F, 7F, 0F);

		rightTrackWheelModels[54].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 891
		rightTrackWheelModels[54].setRotationPoint(-32F, 7F, 0F);

		rightTrackWheelModels[55].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 892
		rightTrackWheelModels[55].setRotationPoint(-32F, 7F, 0F);

		rightTrackWheelModels[56].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 893
		rightTrackWheelModels[56].setRotationPoint(-27F, 7F, 0F);

		rightTrackWheelModels[57].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 894
		rightTrackWheelModels[57].setRotationPoint(-27F, 7F, 0F);

		rightTrackWheelModels[58].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 895
		rightTrackWheelModels[58].setRotationPoint(-27F, 7F, 0F);

		rightTrackWheelModels[59].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 896
		rightTrackWheelModels[59].setRotationPoint(-27F, 7F, 0F);

		rightTrackWheelModels[60].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 897
		rightTrackWheelModels[60].setRotationPoint(-27F, 7F, 0F);

		rightTrackWheelModels[61].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
		rightTrackWheelModels[61].setRotationPoint(-27F, 7F, 0F);

		rightTrackWheelModels[62].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 899
		rightTrackWheelModels[62].setRotationPoint(-22F, 7F, 0F);

		rightTrackWheelModels[63].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		rightTrackWheelModels[63].setRotationPoint(-22F, 7F, 0F);

		rightTrackWheelModels[64].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 901
		rightTrackWheelModels[64].setRotationPoint(-22F, 7F, 0F);

		rightTrackWheelModels[65].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 902
		rightTrackWheelModels[65].setRotationPoint(-22F, 7F, 0F);

		rightTrackWheelModels[66].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 903
		rightTrackWheelModels[66].setRotationPoint(-22F, 7F, 0F);

		rightTrackWheelModels[67].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		rightTrackWheelModels[67].setRotationPoint(-22F, 7F, 0F);

		rightTrackWheelModels[68].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 905
		rightTrackWheelModels[68].setRotationPoint(-17F, 7F, 0F);

		rightTrackWheelModels[69].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 906
		rightTrackWheelModels[69].setRotationPoint(-17F, 7F, 0F);

		rightTrackWheelModels[70].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 907
		rightTrackWheelModels[70].setRotationPoint(-17F, 7F, 0F);

		rightTrackWheelModels[71].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		rightTrackWheelModels[71].setRotationPoint(-17F, 7F, 0F);

		rightTrackWheelModels[72].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 909
		rightTrackWheelModels[72].setRotationPoint(-17F, 7F, 0F);

		rightTrackWheelModels[73].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		rightTrackWheelModels[73].setRotationPoint(-17F, 7F, 0F);

		rightTrackWheelModels[74].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		rightTrackWheelModels[74].setRotationPoint(-10F, 7F, 0F);

		rightTrackWheelModels[75].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 912
		rightTrackWheelModels[75].setRotationPoint(-10F, 7F, 0F);

		rightTrackWheelModels[76].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 913
		rightTrackWheelModels[76].setRotationPoint(-10F, 7F, 0F);

		rightTrackWheelModels[77].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 914
		rightTrackWheelModels[77].setRotationPoint(-10F, 7F, 0F);

		rightTrackWheelModels[78].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 915
		rightTrackWheelModels[78].setRotationPoint(-10F, 7F, 0F);

		rightTrackWheelModels[79].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 916
		rightTrackWheelModels[79].setRotationPoint(-10F, 7F, 0F);

		rightTrackWheelModels[80].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917
		rightTrackWheelModels[80].setRotationPoint(-5F, 7F, 0F);

		rightTrackWheelModels[81].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 918
		rightTrackWheelModels[81].setRotationPoint(-5F, 7F, 0F);

		rightTrackWheelModels[82].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 919
		rightTrackWheelModels[82].setRotationPoint(-5F, 7F, 0F);

		rightTrackWheelModels[83].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 920
		rightTrackWheelModels[83].setRotationPoint(-5F, 7F, 0F);

		rightTrackWheelModels[84].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 921
		rightTrackWheelModels[84].setRotationPoint(-5F, 7F, 0F);

		rightTrackWheelModels[85].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
		rightTrackWheelModels[85].setRotationPoint(-5F, 7F, 0F);

		rightTrackWheelModels[86].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 923
		rightTrackWheelModels[86].setRotationPoint(0F, 7F, 0F);

		rightTrackWheelModels[87].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
		rightTrackWheelModels[87].setRotationPoint(0F, 7F, 0F);

		rightTrackWheelModels[88].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 925
		rightTrackWheelModels[88].setRotationPoint(0F, 7F, 0F);

		rightTrackWheelModels[89].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 926
		rightTrackWheelModels[89].setRotationPoint(0F, 7F, 0F);

		rightTrackWheelModels[90].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 927
		rightTrackWheelModels[90].setRotationPoint(0F, 7F, 0F);

		rightTrackWheelModels[91].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		rightTrackWheelModels[91].setRotationPoint(0F, 7F, 0F);

		rightTrackWheelModels[92].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 929
		rightTrackWheelModels[92].setRotationPoint(5F, 7F, 0F);

		rightTrackWheelModels[93].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 930
		rightTrackWheelModels[93].setRotationPoint(5F, 7F, 0F);

		rightTrackWheelModels[94].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 931
		rightTrackWheelModels[94].setRotationPoint(5F, 7F, 0F);

		rightTrackWheelModels[95].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 932
		rightTrackWheelModels[95].setRotationPoint(5F, 7F, 0F);

		rightTrackWheelModels[96].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 933
		rightTrackWheelModels[96].setRotationPoint(5F, 7F, 0F);

		rightTrackWheelModels[97].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 934
		rightTrackWheelModels[97].setRotationPoint(5F, 7F, 0F);

		rightTrackWheelModels[98].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 935
		rightTrackWheelModels[98].setRotationPoint(10F, 7F, 0F);

		rightTrackWheelModels[99].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 936
		rightTrackWheelModels[99].setRotationPoint(10F, 7F, 0F);

		rightTrackWheelModels[100].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 937
		rightTrackWheelModels[100].setRotationPoint(10F, 7F, 0F);

		rightTrackWheelModels[101].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 938
		rightTrackWheelModels[101].setRotationPoint(10F, 7F, 0F);

		rightTrackWheelModels[102].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 939
		rightTrackWheelModels[102].setRotationPoint(10F, 7F, 0F);

		rightTrackWheelModels[103].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 940
		rightTrackWheelModels[103].setRotationPoint(10F, 7F, 0F);

		rightTrackWheelModels[104].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 941
		rightTrackWheelModels[104].setRotationPoint(17F, 7F, 0F);

		rightTrackWheelModels[105].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 942
		rightTrackWheelModels[105].setRotationPoint(17F, 7F, 0F);

		rightTrackWheelModels[106].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 943
		rightTrackWheelModels[106].setRotationPoint(17F, 7F, 0F);

		rightTrackWheelModels[107].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 944
		rightTrackWheelModels[107].setRotationPoint(17F, 7F, 0F);

		rightTrackWheelModels[108].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 945
		rightTrackWheelModels[108].setRotationPoint(17F, 7F, 0F);

		rightTrackWheelModels[109].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 946
		rightTrackWheelModels[109].setRotationPoint(17F, 7F, 0F);

		rightTrackWheelModels[110].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 947
		rightTrackWheelModels[110].setRotationPoint(22F, 7F, 0F);

		rightTrackWheelModels[111].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 948
		rightTrackWheelModels[111].setRotationPoint(22F, 7F, 0F);

		rightTrackWheelModels[112].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 949
		rightTrackWheelModels[112].setRotationPoint(22F, 7F, 0F);

		rightTrackWheelModels[113].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 950
		rightTrackWheelModels[113].setRotationPoint(22F, 7F, 0F);

		rightTrackWheelModels[114].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 951
		rightTrackWheelModels[114].setRotationPoint(22F, 7F, 0F);

		rightTrackWheelModels[115].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 952
		rightTrackWheelModels[115].setRotationPoint(22F, 7F, 0F);

		rightTrackWheelModels[116].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 953
		rightTrackWheelModels[116].setRotationPoint(27F, 7F, 0F);

		rightTrackWheelModels[117].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 954
		rightTrackWheelModels[117].setRotationPoint(27F, 7F, 0F);

		rightTrackWheelModels[118].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 955
		rightTrackWheelModels[118].setRotationPoint(27F, 7F, 0F);

		rightTrackWheelModels[119].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 956
		rightTrackWheelModels[119].setRotationPoint(27F, 7F, 0F);

		rightTrackWheelModels[120].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 957
		rightTrackWheelModels[120].setRotationPoint(27F, 7F, 0F);

		rightTrackWheelModels[121].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 958
		rightTrackWheelModels[121].setRotationPoint(27F, 7F, 0F);

		rightTrackWheelModels[122].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 959
		rightTrackWheelModels[122].setRotationPoint(32F, 7F, 0F);

		rightTrackWheelModels[123].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 960
		rightTrackWheelModels[123].setRotationPoint(32F, 7F, 0F);

		rightTrackWheelModels[124].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 961
		rightTrackWheelModels[124].setRotationPoint(32F, 7F, 0F);

		rightTrackWheelModels[125].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		rightTrackWheelModels[125].setRotationPoint(32F, 7F, 0F);

		rightTrackWheelModels[126].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 963
		rightTrackWheelModels[126].setRotationPoint(32F, 7F, 0F);

		rightTrackWheelModels[127].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		rightTrackWheelModels[127].setRotationPoint(32F, 7F, 0F);

		rightTrackWheelModels[128].addShapeBox(-2F, -2F, -22.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 965
		rightTrackWheelModels[128].setRotationPoint(37F, 7F, 0F);

		rightTrackWheelModels[129].addShapeBox(-2F, -1F, -22.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 966
		rightTrackWheelModels[129].setRotationPoint(37F, 7F, 0F);

		rightTrackWheelModels[130].addShapeBox(-2F, 1F, -22.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 967
		rightTrackWheelModels[130].setRotationPoint(37F, 7F, 0F);

		rightTrackWheelModels[131].addShapeBox(-2F, -2F, -26.5F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		rightTrackWheelModels[131].setRotationPoint(37F, 7F, 0F);

		rightTrackWheelModels[132].addShapeBox(-2F, 1F, -26.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 969
		rightTrackWheelModels[132].setRotationPoint(37F, 7F, 0F);

		rightTrackWheelModels[133].addShapeBox(-2F, -1F, -26.5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 970
		rightTrackWheelModels[133].setRotationPoint(37F, 7F, 0F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1409
		leftTrackModel[1] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1410
		leftTrackModel[2] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1411
		leftTrackModel[3] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1412
		leftTrackModel[4] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1413
		leftTrackModel[5] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1414
		leftTrackModel[6] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1415
		leftTrackModel[7] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1416
		leftTrackModel[8] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1417
		leftTrackModel[9] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1418
		leftTrackModel[10] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1419
		leftTrackModel[11] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1420
		leftTrackModel[12] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1421
		leftTrackModel[13] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1422
		leftTrackModel[14] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1423
		leftTrackModel[15] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1424
		leftTrackModel[16] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1425
		leftTrackModel[17] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1426
		leftTrackModel[18] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1427
		leftTrackModel[19] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1428
		leftTrackModel[20] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1429
		leftTrackModel[21] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1430
		leftTrackModel[22] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1431
		leftTrackModel[23] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1432
		leftTrackModel[24] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1433
		leftTrackModel[25] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1434
		leftTrackModel[26] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1435
		leftTrackModel[27] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1436
		leftTrackModel[28] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1437
		leftTrackModel[29] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1438
		leftTrackModel[30] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1439
		leftTrackModel[31] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1440
		leftTrackModel[32] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1441
		leftTrackModel[33] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1442
		leftTrackModel[34] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1443
		leftTrackModel[35] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1444
		leftTrackModel[36] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1445
		leftTrackModel[37] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1446
		leftTrackModel[38] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1447
		leftTrackModel[39] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1448
		leftTrackModel[40] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1449
		leftTrackModel[41] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1450
		leftTrackModel[42] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1451
		leftTrackModel[43] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1452
		leftTrackModel[44] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1453
		leftTrackModel[45] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1454
		leftTrackModel[46] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1455
		leftTrackModel[47] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1456
		leftTrackModel[48] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1457
		leftTrackModel[49] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1458
		leftTrackModel[50] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1459
		leftTrackModel[51] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1460
		leftTrackModel[52] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1461
		leftTrackModel[53] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1462
		leftTrackModel[54] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1463
		leftTrackModel[55] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1464

		leftTrackModel[0].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1409
		leftTrackModel[0].setRotationPoint(-6.5F, 9F, 29F);

		leftTrackModel[1].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1410
		leftTrackModel[1].setRotationPoint(-6.5F, 9F, 29F);

		leftTrackModel[2].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1411
		leftTrackModel[2].setRotationPoint(-1.5F, 9F, 29F);

		leftTrackModel[3].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1412
		leftTrackModel[3].setRotationPoint(-1.5F, 9F, 29F);

		leftTrackModel[4].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1413
		leftTrackModel[4].setRotationPoint(3.5F, 9F, 29F);

		leftTrackModel[5].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1414
		leftTrackModel[5].setRotationPoint(3.5F, 9F, 29F);

		leftTrackModel[6].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1415
		leftTrackModel[6].setRotationPoint(18.5F, 9F, 29F);

		leftTrackModel[7].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1416
		leftTrackModel[7].setRotationPoint(18.5F, 9F, 29F);

		leftTrackModel[8].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1417
		leftTrackModel[8].setRotationPoint(13.5F, 9F, 29F);

		leftTrackModel[9].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1418
		leftTrackModel[9].setRotationPoint(13.5F, 9F, 29F);

		leftTrackModel[10].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1419
		leftTrackModel[10].setRotationPoint(8.5F, 9F, 29F);

		leftTrackModel[11].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1420
		leftTrackModel[11].setRotationPoint(8.5F, 9F, 29F);

		leftTrackModel[12].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1421
		leftTrackModel[12].setRotationPoint(28.5F, 9F, 29F);

		leftTrackModel[13].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1422
		leftTrackModel[13].setRotationPoint(33.5F, 9F, 29F);

		leftTrackModel[14].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1423
		leftTrackModel[14].setRotationPoint(33.5F, 9F, 29F);

		leftTrackModel[15].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1424
		leftTrackModel[15].setRotationPoint(28.5F, 9F, 29F);

		leftTrackModel[16].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1425
		leftTrackModel[16].setRotationPoint(23.5F, 9F, 29F);

		leftTrackModel[17].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1426
		leftTrackModel[17].setRotationPoint(23.5F, 9F, 29F);

		leftTrackModel[18].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1427
		leftTrackModel[18].setRotationPoint(43.5F, 9F, 29F);

		leftTrackModel[19].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1428
		leftTrackModel[19].setRotationPoint(48.5F, 9F, 29F);

		leftTrackModel[20].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1429
		leftTrackModel[20].setRotationPoint(48.5F, 9F, 29F);

		leftTrackModel[21].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1430
		leftTrackModel[21].setRotationPoint(43.5F, 9F, 29F);

		leftTrackModel[22].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1431
		leftTrackModel[22].setRotationPoint(38.5F, 9F, 29F);

		leftTrackModel[23].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1432
		leftTrackModel[23].setRotationPoint(38.5F, 9F, 29F);

		leftTrackModel[24].addShapeBox(0F, -1F, -10F, 5, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F); // Box 1433
		leftTrackModel[24].setRotationPoint(53.5F, 10F, 29F);
		leftTrackModel[24].rotateAngleZ = 0.78539816F;

		leftTrackModel[25].addShapeBox(4F, 0F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1434
		leftTrackModel[25].setRotationPoint(53.5F, 10F, 29F);
		leftTrackModel[25].rotateAngleZ = 0.78539816F;

		leftTrackModel[26].addShapeBox(0F, -1F, -10F, 5, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 1435
		leftTrackModel[26].setRotationPoint(57.3F, 6.5F, 29F);
		leftTrackModel[26].rotateAngleZ = 0.99483767F;

		leftTrackModel[27].addShapeBox(4F, 0F, -10F, 1, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1436
		leftTrackModel[27].setRotationPoint(57.3F, 6.5F, 29F);
		leftTrackModel[27].rotateAngleZ = 0.99483767F;

		leftTrackModel[28].addBox(0F, -1F, -10F, 5, 1, 10, 0F); // Box 1437
		leftTrackModel[28].setRotationPoint(60F, 2F, 29F);
		leftTrackModel[28].rotateAngleZ = 1.57079633F;

		leftTrackModel[29].addShapeBox(4F, 0F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1438
		leftTrackModel[29].setRotationPoint(60F, 2F, 29F);
		leftTrackModel[29].rotateAngleZ = 1.57079633F;

		leftTrackModel[30].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1439
		leftTrackModel[30].setRotationPoint(-21.5F, 9F, 29F);

		leftTrackModel[31].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1440
		leftTrackModel[31].setRotationPoint(-21.5F, 9F, 29F);

		leftTrackModel[32].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1441
		leftTrackModel[32].setRotationPoint(-16.5F, 9F, 29F);

		leftTrackModel[33].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1442
		leftTrackModel[33].setRotationPoint(-16.5F, 9F, 29F);

		leftTrackModel[34].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1443
		leftTrackModel[34].setRotationPoint(-11.5F, 9F, 29F);

		leftTrackModel[35].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1444
		leftTrackModel[35].setRotationPoint(-11.5F, 9F, 29F);

		leftTrackModel[36].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1445
		leftTrackModel[36].setRotationPoint(-36.5F, 9F, 29F);

		leftTrackModel[37].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1446
		leftTrackModel[37].setRotationPoint(-36.5F, 9F, 29F);

		leftTrackModel[38].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1447
		leftTrackModel[38].setRotationPoint(-31.5F, 9F, 29F);

		leftTrackModel[39].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1448
		leftTrackModel[39].setRotationPoint(-31.5F, 9F, 29F);

		leftTrackModel[40].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1449
		leftTrackModel[40].setRotationPoint(-26.5F, 9F, 29F);

		leftTrackModel[41].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1450
		leftTrackModel[41].setRotationPoint(-26.5F, 9F, 29F);

		leftTrackModel[42].addShapeBox(0F, 0F, -10F, 5, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F); // Box 1451
		leftTrackModel[42].setRotationPoint(-51.5F, 9F, 29F);

		leftTrackModel[43].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1452
		leftTrackModel[43].setRotationPoint(-51.5F, 9F, 29F);

		leftTrackModel[44].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1453
		leftTrackModel[44].setRotationPoint(-46.5F, 9F, 29F);

		leftTrackModel[45].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1454
		leftTrackModel[45].setRotationPoint(-46.5F, 9F, 29F);

		leftTrackModel[46].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1455
		leftTrackModel[46].setRotationPoint(-41.5F, 9F, 29F);

		leftTrackModel[47].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1456
		leftTrackModel[47].setRotationPoint(-41.5F, 9F, 29F);

		leftTrackModel[48].addBox(-5F, 0F, -10F, 5, 1, 10, 0F); // Box 1457
		leftTrackModel[48].setRotationPoint(-58.5F, 4F, 29F);
		leftTrackModel[48].rotateAngleZ = -1.51843645F;

		leftTrackModel[49].addShapeBox(-1F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1458
		leftTrackModel[49].setRotationPoint(-58.5F, 4F, 29F);
		leftTrackModel[49].rotateAngleZ = -1.51843645F;

		leftTrackModel[50].addShapeBox(-5F, -1F, -10F, 5, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 1459
		leftTrackModel[50].setRotationPoint(-56F, 8F, 29F);
		leftTrackModel[50].rotateAngleZ = -0.87266463F;

		leftTrackModel[51].addShapeBox(-1F, 0F, -10F, 1, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1460
		leftTrackModel[51].setRotationPoint(-56F, 8F, 29F);
		leftTrackModel[51].rotateAngleZ = -0.87266463F;

		leftTrackModel[52].addBox(-5F, -1F, -10F, 5, 1, 10, 0F); // Box 1461
		leftTrackModel[52].setRotationPoint(-51.5F, 10F, 29F);
		leftTrackModel[52].rotateAngleZ = -0.40142573F;

		leftTrackModel[53].addShapeBox(-1F, 0F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1462
		leftTrackModel[53].setRotationPoint(-51.5F, 10F, 29F);
		leftTrackModel[53].rotateAngleZ = -0.40142573F;

		leftTrackModel[54].addBox(-5F, 0F, -10F, 5, 1, 10, 0F); // Box 1463
		leftTrackModel[54].setRotationPoint(-58.8F, -1F, 29F);
		leftTrackModel[54].rotateAngleZ = -1.60570291F;

		leftTrackModel[55].addShapeBox(-1F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1464
		leftTrackModel[55].setRotationPoint(-58.8F, -1F, 29F);
		leftTrackModel[55].rotateAngleZ = -1.60570291F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1465
		rightTrackModel[1] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1466
		rightTrackModel[2] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1467
		rightTrackModel[3] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1468
		rightTrackModel[4] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1469
		rightTrackModel[5] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1470
		rightTrackModel[6] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1471
		rightTrackModel[7] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1472
		rightTrackModel[8] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1473
		rightTrackModel[9] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1474
		rightTrackModel[10] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1475
		rightTrackModel[11] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1476
		rightTrackModel[12] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1477
		rightTrackModel[13] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1478
		rightTrackModel[14] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1479
		rightTrackModel[15] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1480
		rightTrackModel[16] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1481
		rightTrackModel[17] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1482
		rightTrackModel[18] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1483
		rightTrackModel[19] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1484
		rightTrackModel[20] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1485
		rightTrackModel[21] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1486
		rightTrackModel[22] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1487
		rightTrackModel[23] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1488
		rightTrackModel[24] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1489
		rightTrackModel[25] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1490
		rightTrackModel[26] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1491
		rightTrackModel[27] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1492
		rightTrackModel[28] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1493
		rightTrackModel[29] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1494
		rightTrackModel[30] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1495
		rightTrackModel[31] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1496
		rightTrackModel[32] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1497
		rightTrackModel[33] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1498
		rightTrackModel[34] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1499
		rightTrackModel[35] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1500
		rightTrackModel[36] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1501
		rightTrackModel[37] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1502
		rightTrackModel[38] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1503
		rightTrackModel[39] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1504
		rightTrackModel[40] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1505
		rightTrackModel[41] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1506
		rightTrackModel[42] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1507
		rightTrackModel[43] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1508
		rightTrackModel[44] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1509
		rightTrackModel[45] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1510
		rightTrackModel[46] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1511
		rightTrackModel[47] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1512
		rightTrackModel[48] = new ModelRendererTurbo(this, 29, 799, textureX, textureY); // Box 1513
		rightTrackModel[49] = new ModelRendererTurbo(this, 33, 816, textureX, textureY); // Box 1514
		rightTrackModel[50] = new ModelRendererTurbo(this, 60, 793, textureX, textureY); // Box 1515
		rightTrackModel[51] = new ModelRendererTurbo(this, 59, 816, textureX, textureY); // Box 1516
		rightTrackModel[52] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1517
		rightTrackModel[53] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1518
		rightTrackModel[54] = new ModelRendererTurbo(this, 91, 799, textureX, textureY); // Box 1519
		rightTrackModel[55] = new ModelRendererTurbo(this, 91, 816, textureX, textureY); // Box 1520

		rightTrackModel[0].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1465
		rightTrackModel[0].setRotationPoint(-6.5F, 9F, -18F);

		rightTrackModel[1].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1466
		rightTrackModel[1].setRotationPoint(-6.5F, 9F, -18F);

		rightTrackModel[2].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1467
		rightTrackModel[2].setRotationPoint(-1.5F, 9F, -18F);

		rightTrackModel[3].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1468
		rightTrackModel[3].setRotationPoint(-1.5F, 9F, -18F);

		rightTrackModel[4].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1469
		rightTrackModel[4].setRotationPoint(3.5F, 9F, -18F);

		rightTrackModel[5].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1470
		rightTrackModel[5].setRotationPoint(3.5F, 9F, -18F);

		rightTrackModel[6].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1471
		rightTrackModel[6].setRotationPoint(18.5F, 9F, -18F);

		rightTrackModel[7].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1472
		rightTrackModel[7].setRotationPoint(18.5F, 9F, -18F);

		rightTrackModel[8].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1473
		rightTrackModel[8].setRotationPoint(13.5F, 9F, -18F);

		rightTrackModel[9].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1474
		rightTrackModel[9].setRotationPoint(13.5F, 9F, -18F);

		rightTrackModel[10].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1475
		rightTrackModel[10].setRotationPoint(8.5F, 9F, -18F);

		rightTrackModel[11].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1476
		rightTrackModel[11].setRotationPoint(8.5F, 9F, -18F);

		rightTrackModel[12].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1477
		rightTrackModel[12].setRotationPoint(28.5F, 9F, -18F);

		rightTrackModel[13].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1478
		rightTrackModel[13].setRotationPoint(33.5F, 9F, -18F);

		rightTrackModel[14].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1479
		rightTrackModel[14].setRotationPoint(33.5F, 9F, -18F);

		rightTrackModel[15].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1480
		rightTrackModel[15].setRotationPoint(28.5F, 9F, -18F);

		rightTrackModel[16].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1481
		rightTrackModel[16].setRotationPoint(23.5F, 9F, -18F);

		rightTrackModel[17].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1482
		rightTrackModel[17].setRotationPoint(23.5F, 9F, -18F);

		rightTrackModel[18].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1483
		rightTrackModel[18].setRotationPoint(43.5F, 9F, -18F);

		rightTrackModel[19].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1484
		rightTrackModel[19].setRotationPoint(48.5F, 9F, -18F);

		rightTrackModel[20].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1485
		rightTrackModel[20].setRotationPoint(48.5F, 9F, -18F);

		rightTrackModel[21].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1486
		rightTrackModel[21].setRotationPoint(43.5F, 9F, -18F);

		rightTrackModel[22].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1487
		rightTrackModel[22].setRotationPoint(38.5F, 9F, -18F);

		rightTrackModel[23].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1488
		rightTrackModel[23].setRotationPoint(38.5F, 9F, -18F);

		rightTrackModel[24].addShapeBox(0F, -1F, -10F, 5, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F); // Box 1489
		rightTrackModel[24].setRotationPoint(53.5F, 10F, -18F);
		rightTrackModel[24].rotateAngleZ = 0.78539816F;

		rightTrackModel[25].addShapeBox(4F, 0F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1490
		rightTrackModel[25].setRotationPoint(53.5F, 10F, -18F);
		rightTrackModel[25].rotateAngleZ = 0.78539816F;

		rightTrackModel[26].addShapeBox(0F, -1F, -10F, 5, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 1491
		rightTrackModel[26].setRotationPoint(57.3F, 6.5F, -18F);
		rightTrackModel[26].rotateAngleZ = 0.99483767F;

		rightTrackModel[27].addShapeBox(4F, 0F, -10F, 1, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1492
		rightTrackModel[27].setRotationPoint(57.3F, 6.5F, -18F);
		rightTrackModel[27].rotateAngleZ = 0.99483767F;

		rightTrackModel[28].addBox(0F, -1F, -10F, 5, 1, 10, 0F); // Box 1493
		rightTrackModel[28].setRotationPoint(60F, 2F, -18F);
		rightTrackModel[28].rotateAngleZ = 1.57079633F;

		rightTrackModel[29].addShapeBox(4F, 0F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1494
		rightTrackModel[29].setRotationPoint(60F, 2F, -18F);
		rightTrackModel[29].rotateAngleZ = 1.57079633F;

		rightTrackModel[30].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1495
		rightTrackModel[30].setRotationPoint(-21.5F, 9F, -18F);

		rightTrackModel[31].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1496
		rightTrackModel[31].setRotationPoint(-21.5F, 9F, -18F);

		rightTrackModel[32].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1497
		rightTrackModel[32].setRotationPoint(-16.5F, 9F, -18F);

		rightTrackModel[33].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1498
		rightTrackModel[33].setRotationPoint(-16.5F, 9F, -18F);

		rightTrackModel[34].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1499
		rightTrackModel[34].setRotationPoint(-11.5F, 9F, -18F);

		rightTrackModel[35].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1500
		rightTrackModel[35].setRotationPoint(-11.5F, 9F, -18F);

		rightTrackModel[36].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1501
		rightTrackModel[36].setRotationPoint(-36.5F, 9F, -18F);

		rightTrackModel[37].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1502
		rightTrackModel[37].setRotationPoint(-36.5F, 9F, -18F);

		rightTrackModel[38].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1503
		rightTrackModel[38].setRotationPoint(-31.5F, 9F, -18F);

		rightTrackModel[39].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1504
		rightTrackModel[39].setRotationPoint(-31.5F, 9F, -18F);

		rightTrackModel[40].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1505
		rightTrackModel[40].setRotationPoint(-26.5F, 9F, -18F);

		rightTrackModel[41].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1506
		rightTrackModel[41].setRotationPoint(-26.5F, 9F, -18F);

		rightTrackModel[42].addShapeBox(0F, 0F, -10F, 5, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F); // Box 1507
		rightTrackModel[42].setRotationPoint(-51.5F, 9F, -18F);

		rightTrackModel[43].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1508
		rightTrackModel[43].setRotationPoint(-51.5F, 9F, -18F);

		rightTrackModel[44].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1509
		rightTrackModel[44].setRotationPoint(-46.5F, 9F, -18F);

		rightTrackModel[45].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1510
		rightTrackModel[45].setRotationPoint(-46.5F, 9F, -18F);

		rightTrackModel[46].addBox(0F, 0F, -10F, 5, 1, 10, 0F); // Box 1511
		rightTrackModel[46].setRotationPoint(-41.5F, 9F, -18F);

		rightTrackModel[47].addShapeBox(4F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1512
		rightTrackModel[47].setRotationPoint(-41.5F, 9F, -18F);

		rightTrackModel[48].addBox(-5F, 0F, -10F, 5, 1, 10, 0F); // Box 1513
		rightTrackModel[48].setRotationPoint(-58.5F, 4F, -18F);
		rightTrackModel[48].rotateAngleZ = -1.51843645F;

		rightTrackModel[49].addShapeBox(-1F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1514
		rightTrackModel[49].setRotationPoint(-58.5F, 4F, -18F);
		rightTrackModel[49].rotateAngleZ = -1.51843645F;

		rightTrackModel[50].addShapeBox(-5F, -1F, -10F, 5, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 1515
		rightTrackModel[50].setRotationPoint(-56F, 8F, -18F);
		rightTrackModel[50].rotateAngleZ = -0.87266463F;

		rightTrackModel[51].addShapeBox(-1F, 0F, -10F, 1, 1, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1516
		rightTrackModel[51].setRotationPoint(-56F, 8F, -18F);
		rightTrackModel[51].rotateAngleZ = -0.87266463F;

		rightTrackModel[52].addBox(-5F, -1F, -10F, 5, 1, 10, 0F); // Box 1517
		rightTrackModel[52].setRotationPoint(-51.5F, 10F, -18F);
		rightTrackModel[52].rotateAngleZ = -0.40142573F;

		rightTrackModel[53].addShapeBox(-1F, 0F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1518
		rightTrackModel[53].setRotationPoint(-51.5F, 10F, -18F);
		rightTrackModel[53].rotateAngleZ = -0.40142573F;

		rightTrackModel[54].addBox(-5F, 0F, -10F, 5, 1, 10, 0F); // Box 1519
		rightTrackModel[54].setRotationPoint(-58.8F, -1F, -18F);
		rightTrackModel[54].rotateAngleZ = -1.60570291F;

		rightTrackModel[55].addShapeBox(-1F, 1F, -10F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1520
		rightTrackModel[55].setRotationPoint(-58.8F, -1F, -18F);
		rightTrackModel[55].rotateAngleZ = -1.60570291F;
	}

	private void initsteeringWheelModel_1()
	{
		steeringWheelModel[0] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Box 639
		steeringWheelModel[1] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Box 640
		steeringWheelModel[2] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 641
		steeringWheelModel[3] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Box 642
		steeringWheelModel[4] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 643
		steeringWheelModel[5] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Box 644
		steeringWheelModel[6] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Box 645
		steeringWheelModel[7] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 646
		steeringWheelModel[8] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Box 647
		steeringWheelModel[9] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 648

		steeringWheelModel[0].addShapeBox(-0.5F, -0.5F, -4.5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		steeringWheelModel[0].setRotationPoint(5.5F, -42F, 9F);
		steeringWheelModel[0].rotateAngleZ = 1.57079633F;

		steeringWheelModel[1].addShapeBox(-0.5F, -4.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		steeringWheelModel[1].setRotationPoint(5.5F, -42F, 9F);
		steeringWheelModel[1].rotateAngleZ = 1.57079633F;

		steeringWheelModel[2].addShapeBox(-0.5F, -5.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		steeringWheelModel[2].setRotationPoint(5.5F, -42F, 9F);
		steeringWheelModel[2].rotateAngleZ = 1.57079633F;

		steeringWheelModel[3].addShapeBox(-0.5F, -2.5F, 4.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		steeringWheelModel[3].setRotationPoint(5.5F, -42F, 9F);
		steeringWheelModel[3].rotateAngleZ = 1.57079633F;

		steeringWheelModel[4].addShapeBox(-0.5F, -5.5F, 4.5F, 1, 3, 1, 0F,0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		steeringWheelModel[4].setRotationPoint(5.5F, -42F, 9F);
		steeringWheelModel[4].rotateAngleZ = 1.57079633F;

		steeringWheelModel[5].addShapeBox(-0.5F, -5.5F, -5.5F, 1, 3, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		steeringWheelModel[5].setRotationPoint(5.5F, -42F, 9F);
		steeringWheelModel[5].rotateAngleZ = 1.57079633F;

		steeringWheelModel[6].addShapeBox(-0.5F, -2.5F, -5.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		steeringWheelModel[6].setRotationPoint(5.5F, -42F, 9F);
		steeringWheelModel[6].rotateAngleZ = 1.57079633F;

		steeringWheelModel[7].addShapeBox(-0.5F, 4.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		steeringWheelModel[7].setRotationPoint(5.5F, -42F, 9F);
		steeringWheelModel[7].rotateAngleZ = 1.57079633F;

		steeringWheelModel[8].addShapeBox(-0.5F, 2.5F, 4.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 647
		steeringWheelModel[8].setRotationPoint(5.5F, -42F, 9F);
		steeringWheelModel[8].rotateAngleZ = 1.57079633F;

		steeringWheelModel[9].addShapeBox(-0.5F, 2.5F, -5.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 648
		steeringWheelModel[9].setRotationPoint(5.5F, -42F, 9F);
		steeringWheelModel[9].rotateAngleZ = 1.57079633F;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[8];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 433, 481, textureX, textureY); // Box 8
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 441, 481, textureX, textureY); // Box 10
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 449, 481, textureX, textureY); // Box 11
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 457, 481, textureX, textureY); // Box 12
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 473, 481, textureX, textureY); // Box 13
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 481, 481, textureX, textureY); // Box 14
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 489, 481, textureX, textureY); // Box 15
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 49, 489, textureX, textureY); // Box 20

		gun_2_Model[0][0].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 8

		gun_2_Model[0][1].addShapeBox(-0.5F, -3.5F, -2.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10

		gun_2_Model[0][2].addShapeBox(-0.5F, -3.5F, 1.5F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		gun_2_Model[0][3].addShapeBox(-0.5F, 2.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12

		gun_2_Model[0][4].addShapeBox(-0.5F, -3.5F, 2.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 13

		gun_2_Model[0][5].addShapeBox(-0.5F, -3.5F, -4.5F, 1, 7, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_2_Model[0][6].addShapeBox(-0.5F, -3.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15

		gun_2_Model[0][7].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(33F, -32F, -22F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[49];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 0
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 33, 481, textureX, textureY); // Box 0
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 65, 481, textureX, textureY); // Box 0
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 97, 481, textureX, textureY); // Box 0
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 105, 481, textureX, textureY); // Box 0
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 113, 481, textureX, textureY); // Box 0
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 121, 481, textureX, textureY); // Box 0
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 129, 481, textureX, textureY); // Box 0
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 137, 481, textureX, textureY); // Box 0
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 145, 481, textureX, textureY); // Box 0
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 153, 481, textureX, textureY); // Box 0
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 161, 481, textureX, textureY); // Box 0
		gun_2_Model[1][12] = new ModelRendererTurbo(this, 169, 481, textureX, textureY); // Box 0
		gun_2_Model[1][13] = new ModelRendererTurbo(this, 193, 481, textureX, textureY); // Box 0
		gun_2_Model[1][14] = new ModelRendererTurbo(this, 201, 481, textureX, textureY); // Box 0
		gun_2_Model[1][15] = new ModelRendererTurbo(this, 209, 481, textureX, textureY); // Box 0
		gun_2_Model[1][16] = new ModelRendererTurbo(this, 225, 481, textureX, textureY); // Box 0
		gun_2_Model[1][17] = new ModelRendererTurbo(this, 233, 481, textureX, textureY); // Box 0
		gun_2_Model[1][18] = new ModelRendererTurbo(this, 241, 481, textureX, textureY); // Box 0
		gun_2_Model[1][19] = new ModelRendererTurbo(this, 249, 481, textureX, textureY); // Box 0
		gun_2_Model[1][20] = new ModelRendererTurbo(this, 257, 481, textureX, textureY); // Box 0
		gun_2_Model[1][21] = new ModelRendererTurbo(this, 265, 481, textureX, textureY); // Box 0
		gun_2_Model[1][22] = new ModelRendererTurbo(this, 273, 481, textureX, textureY); // Box 0
		gun_2_Model[1][23] = new ModelRendererTurbo(this, 281, 481, textureX, textureY); // Box 0
		gun_2_Model[1][24] = new ModelRendererTurbo(this, 289, 481, textureX, textureY); // Box 0
		gun_2_Model[1][25] = new ModelRendererTurbo(this, 297, 481, textureX, textureY); // Box 0
		gun_2_Model[1][26] = new ModelRendererTurbo(this, 305, 481, textureX, textureY); // Box 0
		gun_2_Model[1][27] = new ModelRendererTurbo(this, 313, 481, textureX, textureY); // Box 0
		gun_2_Model[1][28] = new ModelRendererTurbo(this, 321, 481, textureX, textureY); // Box 0
		gun_2_Model[1][29] = new ModelRendererTurbo(this, 329, 481, textureX, textureY); // Box 0
		gun_2_Model[1][30] = new ModelRendererTurbo(this, 337, 481, textureX, textureY); // Box 0
		gun_2_Model[1][31] = new ModelRendererTurbo(this, 345, 481, textureX, textureY); // Box 0
		gun_2_Model[1][32] = new ModelRendererTurbo(this, 353, 481, textureX, textureY); // Box 0
		gun_2_Model[1][33] = new ModelRendererTurbo(this, 361, 481, textureX, textureY); // Box 0
		gun_2_Model[1][34] = new ModelRendererTurbo(this, 369, 481, textureX, textureY); // Box 0
		gun_2_Model[1][35] = new ModelRendererTurbo(this, 377, 481, textureX, textureY); // Box 0
		gun_2_Model[1][36] = new ModelRendererTurbo(this, 393, 481, textureX, textureY); // Box 0
		gun_2_Model[1][37] = new ModelRendererTurbo(this, 401, 481, textureX, textureY); // Box 0
		gun_2_Model[1][38] = new ModelRendererTurbo(this, 409, 481, textureX, textureY); // Box 0
		gun_2_Model[1][39] = new ModelRendererTurbo(this, 417, 481, textureX, textureY); // Box 0
		gun_2_Model[1][40] = new ModelRendererTurbo(this, 425, 481, textureX, textureY); // Box 0
		gun_2_Model[1][41] = new ModelRendererTurbo(this, 465, 481, textureX, textureY); // Box 16
		gun_2_Model[1][42] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Box 17
		gun_2_Model[1][43] = new ModelRendererTurbo(this, 17, 489, textureX, textureY); // Box 18
		gun_2_Model[1][44] = new ModelRendererTurbo(this, 33, 489, textureX, textureY); // Box 19
		gun_2_Model[1][45] = new ModelRendererTurbo(this, 65, 489, textureX, textureY); // Box 32
		gun_2_Model[1][46] = new ModelRendererTurbo(this, 81, 489, textureX, textureY); // Box 32
		gun_2_Model[1][47] = new ModelRendererTurbo(this, 97, 489, textureX, textureY); // Box 32
		gun_2_Model[1][48] = new ModelRendererTurbo(this, 113, 489, textureX, textureY); // Box 32

		gun_2_Model[1][0].addShapeBox(-0.5F, -0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_2_Model[1][1].addShapeBox(-0.5F, -1.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_2_Model[1][2].addShapeBox(-0.5F, 0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 0

		gun_2_Model[1][3].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_2_Model[1][4].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 0

		gun_2_Model[1][5].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 0

		gun_2_Model[1][6].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F); // Box 0

		gun_2_Model[1][7].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F); // Box 0

		gun_2_Model[1][8].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F); // Box 0

		gun_2_Model[1][9].addShapeBox(9F, 1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_2_Model[1][10].addShapeBox(9F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 0

		gun_2_Model[1][11].addShapeBox(-2F, -1F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_2_Model[1][12].addShapeBox(-9.5F, -1F, -1F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_2_Model[1][13].addShapeBox(-3F, -1F, -1F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_2_Model[1][14].addShapeBox(-3F, 0.5F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_2_Model[1][15].addShapeBox(-7.5F, 1.3F, -1.2F, 6, 1, 1, 0F,-0.6F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.8F, -0.6F, 0.4F, -0.8F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, -0.6F, -0.2F, -0.8F); // Box 0

		gun_2_Model[1][16].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F); // Box 0

		gun_2_Model[1][17].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.15F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.8F, 0F, -0.15F, -0.8F); // Box 0

		gun_2_Model[1][18].addShapeBox(10F, 0.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_2_Model[1][19].addShapeBox(10F, -0.7F, -1F, 1, 1, 2, 0F,-0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_2_Model[1][20].addShapeBox(10F, 1.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 0

		gun_2_Model[1][21].addShapeBox(-7.5F, -1.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_2_Model[1][22].addShapeBox(-7F, -1.5F, -0.1F, 2, 1, 1, 0F,-0.7F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0

		gun_2_Model[1][23].addShapeBox(-7F, -1.5F, -0.9F, 2, 1, 1, 0F,-0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F); // Box 0

		gun_2_Model[1][24].addShapeBox(-8.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_2_Model[1][25].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 0

		gun_2_Model[1][26].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_2_Model[1][27].addShapeBox(-11.5F, -0.75F, 1F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_2_Model[1][28].addShapeBox(-11.5F, -0.75F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_2_Model[1][29].addShapeBox(-11.5F, 1.25F, 1F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[1][30].addShapeBox(-10.5F, -0.75F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_2_Model[1][31].addShapeBox(-10.5F, 1.25F, 1F, 2, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[1][32].addShapeBox(-10.5F, 1.25F, -2F, 2, 1, 1, 0F,0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[1][33].addShapeBox(-10.5F, -0.75F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_2_Model[1][34].addShapeBox(-10.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 0

		gun_2_Model[1][35].addShapeBox(-7.5F, 1.3F, 0.2F, 6, 1, 1, 0F,-0.6F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.2F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, -0.6F, -0.2F, 0F); // Box 0

		gun_2_Model[1][36].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,0F, -0.35F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0F, 0F, -0.15F, 0F); // Box 0

		gun_2_Model[1][37].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,-0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 0

		gun_2_Model[1][38].addShapeBox(-11.5F, -0.75F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_2_Model[1][39].addShapeBox(-11.5F, -0.75F, -2F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_2_Model[1][40].addShapeBox(-11.5F, 1.25F, -2F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[1][41].addShapeBox(9F, -2.7F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 16

		gun_2_Model[1][42].addShapeBox(-0.5F, -1.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F); // Box 17

		gun_2_Model[1][43].addShapeBox(-0.5F, 0.5F, -1.5F, 1, 1, 3, 0F,0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F); // Box 18

		gun_2_Model[1][44].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 19

		gun_2_Model[1][45].addShapeBox(-3.75F, -3.1F, -5.75F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F); // Box 32

		gun_2_Model[1][46].addShapeBox(-3.75F, -2.1F, -5.75F, 2, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F); // Box 32

		gun_2_Model[1][47].addShapeBox(-3.75F, -0.1F, -4.75F, 2, 1, 4, 0F,-0.1F, 0.3F, -1.2F, -0.1F, 0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, -1.2F, -0.1F, -0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 32

		gun_2_Model[1][48].addShapeBox(-3.75F, -0.1F, -5.75F, 2, 1, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F, 0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F); // Box 32

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(33F, -32F, -22F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[8];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 433, 481, textureX, textureY); // Box 8
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 441, 481, textureX, textureY); // Box 10
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 449, 481, textureX, textureY); // Box 11
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 457, 481, textureX, textureY); // Box 12
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 473, 481, textureX, textureY); // Box 13
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 481, 481, textureX, textureY); // Box 14
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 489, 481, textureX, textureY); // Box 15
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 49, 489, textureX, textureY); // Box 20

		gun_3_Model[0][0].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 8

		gun_3_Model[0][1].addShapeBox(-0.5F, -3.5F, -2.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10

		gun_3_Model[0][2].addShapeBox(-0.5F, -3.5F, 1.5F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		gun_3_Model[0][3].addShapeBox(-0.5F, 2.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12

		gun_3_Model[0][4].addShapeBox(-0.5F, -3.5F, 2.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 13

		gun_3_Model[0][5].addShapeBox(-0.5F, -3.5F, -4.5F, 1, 7, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_3_Model[0][6].addShapeBox(-0.5F, -3.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15

		gun_3_Model[0][7].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-34F, -32F, -22F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[49];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 0
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 33, 481, textureX, textureY); // Box 0
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 65, 481, textureX, textureY); // Box 0
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 97, 481, textureX, textureY); // Box 0
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 105, 481, textureX, textureY); // Box 0
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 113, 481, textureX, textureY); // Box 0
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 121, 481, textureX, textureY); // Box 0
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 129, 481, textureX, textureY); // Box 0
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 137, 481, textureX, textureY); // Box 0
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 145, 481, textureX, textureY); // Box 0
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 153, 481, textureX, textureY); // Box 0
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 161, 481, textureX, textureY); // Box 0
		gun_3_Model[1][12] = new ModelRendererTurbo(this, 169, 481, textureX, textureY); // Box 0
		gun_3_Model[1][13] = new ModelRendererTurbo(this, 193, 481, textureX, textureY); // Box 0
		gun_3_Model[1][14] = new ModelRendererTurbo(this, 201, 481, textureX, textureY); // Box 0
		gun_3_Model[1][15] = new ModelRendererTurbo(this, 209, 481, textureX, textureY); // Box 0
		gun_3_Model[1][16] = new ModelRendererTurbo(this, 225, 481, textureX, textureY); // Box 0
		gun_3_Model[1][17] = new ModelRendererTurbo(this, 233, 481, textureX, textureY); // Box 0
		gun_3_Model[1][18] = new ModelRendererTurbo(this, 241, 481, textureX, textureY); // Box 0
		gun_3_Model[1][19] = new ModelRendererTurbo(this, 249, 481, textureX, textureY); // Box 0
		gun_3_Model[1][20] = new ModelRendererTurbo(this, 257, 481, textureX, textureY); // Box 0
		gun_3_Model[1][21] = new ModelRendererTurbo(this, 265, 481, textureX, textureY); // Box 0
		gun_3_Model[1][22] = new ModelRendererTurbo(this, 273, 481, textureX, textureY); // Box 0
		gun_3_Model[1][23] = new ModelRendererTurbo(this, 281, 481, textureX, textureY); // Box 0
		gun_3_Model[1][24] = new ModelRendererTurbo(this, 289, 481, textureX, textureY); // Box 0
		gun_3_Model[1][25] = new ModelRendererTurbo(this, 297, 481, textureX, textureY); // Box 0
		gun_3_Model[1][26] = new ModelRendererTurbo(this, 305, 481, textureX, textureY); // Box 0
		gun_3_Model[1][27] = new ModelRendererTurbo(this, 313, 481, textureX, textureY); // Box 0
		gun_3_Model[1][28] = new ModelRendererTurbo(this, 321, 481, textureX, textureY); // Box 0
		gun_3_Model[1][29] = new ModelRendererTurbo(this, 329, 481, textureX, textureY); // Box 0
		gun_3_Model[1][30] = new ModelRendererTurbo(this, 337, 481, textureX, textureY); // Box 0
		gun_3_Model[1][31] = new ModelRendererTurbo(this, 345, 481, textureX, textureY); // Box 0
		gun_3_Model[1][32] = new ModelRendererTurbo(this, 353, 481, textureX, textureY); // Box 0
		gun_3_Model[1][33] = new ModelRendererTurbo(this, 361, 481, textureX, textureY); // Box 0
		gun_3_Model[1][34] = new ModelRendererTurbo(this, 369, 481, textureX, textureY); // Box 0
		gun_3_Model[1][35] = new ModelRendererTurbo(this, 377, 481, textureX, textureY); // Box 0
		gun_3_Model[1][36] = new ModelRendererTurbo(this, 393, 481, textureX, textureY); // Box 0
		gun_3_Model[1][37] = new ModelRendererTurbo(this, 401, 481, textureX, textureY); // Box 0
		gun_3_Model[1][38] = new ModelRendererTurbo(this, 409, 481, textureX, textureY); // Box 0
		gun_3_Model[1][39] = new ModelRendererTurbo(this, 417, 481, textureX, textureY); // Box 0
		gun_3_Model[1][40] = new ModelRendererTurbo(this, 425, 481, textureX, textureY); // Box 0
		gun_3_Model[1][41] = new ModelRendererTurbo(this, 465, 481, textureX, textureY); // Box 16
		gun_3_Model[1][42] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Box 17
		gun_3_Model[1][43] = new ModelRendererTurbo(this, 17, 489, textureX, textureY); // Box 18
		gun_3_Model[1][44] = new ModelRendererTurbo(this, 33, 489, textureX, textureY); // Box 19
		gun_3_Model[1][45] = new ModelRendererTurbo(this, 65, 489, textureX, textureY); // Box 32
		gun_3_Model[1][46] = new ModelRendererTurbo(this, 81, 489, textureX, textureY); // Box 32
		gun_3_Model[1][47] = new ModelRendererTurbo(this, 97, 489, textureX, textureY); // Box 32
		gun_3_Model[1][48] = new ModelRendererTurbo(this, 113, 489, textureX, textureY); // Box 32

		gun_3_Model[1][0].addShapeBox(-0.5F, -0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_3_Model[1][1].addShapeBox(-0.5F, -1.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_3_Model[1][2].addShapeBox(-0.5F, 0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 0

		gun_3_Model[1][3].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_3_Model[1][4].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 0

		gun_3_Model[1][5].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 0

		gun_3_Model[1][6].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F); // Box 0

		gun_3_Model[1][7].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F); // Box 0

		gun_3_Model[1][8].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F); // Box 0

		gun_3_Model[1][9].addShapeBox(9F, 1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_3_Model[1][10].addShapeBox(9F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 0

		gun_3_Model[1][11].addShapeBox(-2F, -1F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_3_Model[1][12].addShapeBox(-9.5F, -1F, -1F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_3_Model[1][13].addShapeBox(-3F, -1F, -1F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_3_Model[1][14].addShapeBox(-3F, 0.5F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_3_Model[1][15].addShapeBox(-7.5F, 1.3F, -1.2F, 6, 1, 1, 0F,-0.6F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.8F, -0.6F, 0.4F, -0.8F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, -0.6F, -0.2F, -0.8F); // Box 0

		gun_3_Model[1][16].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F); // Box 0

		gun_3_Model[1][17].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.15F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.8F, 0F, -0.15F, -0.8F); // Box 0

		gun_3_Model[1][18].addShapeBox(10F, 0.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_3_Model[1][19].addShapeBox(10F, -0.7F, -1F, 1, 1, 2, 0F,-0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_3_Model[1][20].addShapeBox(10F, 1.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 0

		gun_3_Model[1][21].addShapeBox(-7.5F, -1.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_3_Model[1][22].addShapeBox(-7F, -1.5F, -0.1F, 2, 1, 1, 0F,-0.7F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0

		gun_3_Model[1][23].addShapeBox(-7F, -1.5F, -0.9F, 2, 1, 1, 0F,-0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F); // Box 0

		gun_3_Model[1][24].addShapeBox(-8.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_3_Model[1][25].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 0

		gun_3_Model[1][26].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_3_Model[1][27].addShapeBox(-11.5F, -0.75F, 1F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_3_Model[1][28].addShapeBox(-11.5F, -0.75F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_3_Model[1][29].addShapeBox(-11.5F, 1.25F, 1F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[1][30].addShapeBox(-10.5F, -0.75F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_3_Model[1][31].addShapeBox(-10.5F, 1.25F, 1F, 2, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[1][32].addShapeBox(-10.5F, 1.25F, -2F, 2, 1, 1, 0F,0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[1][33].addShapeBox(-10.5F, -0.75F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_3_Model[1][34].addShapeBox(-10.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 0

		gun_3_Model[1][35].addShapeBox(-7.5F, 1.3F, 0.2F, 6, 1, 1, 0F,-0.6F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.2F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, -0.6F, -0.2F, 0F); // Box 0

		gun_3_Model[1][36].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,0F, -0.35F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0F, 0F, -0.15F, 0F); // Box 0

		gun_3_Model[1][37].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,-0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 0

		gun_3_Model[1][38].addShapeBox(-11.5F, -0.75F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_3_Model[1][39].addShapeBox(-11.5F, -0.75F, -2F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_3_Model[1][40].addShapeBox(-11.5F, 1.25F, -2F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[1][41].addShapeBox(9F, -2.7F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 16

		gun_3_Model[1][42].addShapeBox(-0.5F, -1.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F); // Box 17

		gun_3_Model[1][43].addShapeBox(-0.5F, 0.5F, -1.5F, 1, 1, 3, 0F,0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F); // Box 18

		gun_3_Model[1][44].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 19

		gun_3_Model[1][45].addShapeBox(-3.75F, -3.1F, -5.75F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F); // Box 32

		gun_3_Model[1][46].addShapeBox(-3.75F, -2.1F, -5.75F, 2, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F); // Box 32

		gun_3_Model[1][47].addShapeBox(-3.75F, -0.1F, -4.75F, 2, 1, 4, 0F,-0.1F, 0.3F, -1.2F, -0.1F, 0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, -1.2F, -0.1F, -0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 32

		gun_3_Model[1][48].addShapeBox(-3.75F, -0.1F, -5.75F, 2, 1, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F, 0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F); // Box 32

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-34F, -32F, -22F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[8];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 433, 481, textureX, textureY); // Box 8
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 441, 481, textureX, textureY); // Box 10
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 449, 481, textureX, textureY); // Box 11
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 457, 481, textureX, textureY); // Box 12
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 473, 481, textureX, textureY); // Box 13
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 481, 481, textureX, textureY); // Box 14
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 489, 481, textureX, textureY); // Box 15
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 49, 489, textureX, textureY); // Box 20

		gun_4_Model[0][0].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 8

		gun_4_Model[0][1].addShapeBox(-0.5F, -3.5F, -2.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10

		gun_4_Model[0][2].addShapeBox(-0.5F, -3.5F, 1.5F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		gun_4_Model[0][3].addShapeBox(-0.5F, 2.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12

		gun_4_Model[0][4].addShapeBox(-0.5F, -3.5F, 2.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 13

		gun_4_Model[0][5].addShapeBox(-0.5F, -3.5F, -4.5F, 1, 7, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_4_Model[0][6].addShapeBox(-0.5F, -3.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15

		gun_4_Model[0][7].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(33F, -32F, 22F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[49];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 0
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 33, 481, textureX, textureY); // Box 0
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 65, 481, textureX, textureY); // Box 0
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 97, 481, textureX, textureY); // Box 0
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 105, 481, textureX, textureY); // Box 0
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 113, 481, textureX, textureY); // Box 0
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 121, 481, textureX, textureY); // Box 0
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 129, 481, textureX, textureY); // Box 0
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 137, 481, textureX, textureY); // Box 0
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 145, 481, textureX, textureY); // Box 0
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 153, 481, textureX, textureY); // Box 0
		gun_4_Model[1][11] = new ModelRendererTurbo(this, 161, 481, textureX, textureY); // Box 0
		gun_4_Model[1][12] = new ModelRendererTurbo(this, 169, 481, textureX, textureY); // Box 0
		gun_4_Model[1][13] = new ModelRendererTurbo(this, 193, 481, textureX, textureY); // Box 0
		gun_4_Model[1][14] = new ModelRendererTurbo(this, 201, 481, textureX, textureY); // Box 0
		gun_4_Model[1][15] = new ModelRendererTurbo(this, 209, 481, textureX, textureY); // Box 0
		gun_4_Model[1][16] = new ModelRendererTurbo(this, 225, 481, textureX, textureY); // Box 0
		gun_4_Model[1][17] = new ModelRendererTurbo(this, 233, 481, textureX, textureY); // Box 0
		gun_4_Model[1][18] = new ModelRendererTurbo(this, 241, 481, textureX, textureY); // Box 0
		gun_4_Model[1][19] = new ModelRendererTurbo(this, 249, 481, textureX, textureY); // Box 0
		gun_4_Model[1][20] = new ModelRendererTurbo(this, 257, 481, textureX, textureY); // Box 0
		gun_4_Model[1][21] = new ModelRendererTurbo(this, 265, 481, textureX, textureY); // Box 0
		gun_4_Model[1][22] = new ModelRendererTurbo(this, 273, 481, textureX, textureY); // Box 0
		gun_4_Model[1][23] = new ModelRendererTurbo(this, 281, 481, textureX, textureY); // Box 0
		gun_4_Model[1][24] = new ModelRendererTurbo(this, 289, 481, textureX, textureY); // Box 0
		gun_4_Model[1][25] = new ModelRendererTurbo(this, 297, 481, textureX, textureY); // Box 0
		gun_4_Model[1][26] = new ModelRendererTurbo(this, 305, 481, textureX, textureY); // Box 0
		gun_4_Model[1][27] = new ModelRendererTurbo(this, 313, 481, textureX, textureY); // Box 0
		gun_4_Model[1][28] = new ModelRendererTurbo(this, 321, 481, textureX, textureY); // Box 0
		gun_4_Model[1][29] = new ModelRendererTurbo(this, 329, 481, textureX, textureY); // Box 0
		gun_4_Model[1][30] = new ModelRendererTurbo(this, 337, 481, textureX, textureY); // Box 0
		gun_4_Model[1][31] = new ModelRendererTurbo(this, 345, 481, textureX, textureY); // Box 0
		gun_4_Model[1][32] = new ModelRendererTurbo(this, 353, 481, textureX, textureY); // Box 0
		gun_4_Model[1][33] = new ModelRendererTurbo(this, 361, 481, textureX, textureY); // Box 0
		gun_4_Model[1][34] = new ModelRendererTurbo(this, 369, 481, textureX, textureY); // Box 0
		gun_4_Model[1][35] = new ModelRendererTurbo(this, 377, 481, textureX, textureY); // Box 0
		gun_4_Model[1][36] = new ModelRendererTurbo(this, 393, 481, textureX, textureY); // Box 0
		gun_4_Model[1][37] = new ModelRendererTurbo(this, 401, 481, textureX, textureY); // Box 0
		gun_4_Model[1][38] = new ModelRendererTurbo(this, 409, 481, textureX, textureY); // Box 0
		gun_4_Model[1][39] = new ModelRendererTurbo(this, 417, 481, textureX, textureY); // Box 0
		gun_4_Model[1][40] = new ModelRendererTurbo(this, 425, 481, textureX, textureY); // Box 0
		gun_4_Model[1][41] = new ModelRendererTurbo(this, 465, 481, textureX, textureY); // Box 16
		gun_4_Model[1][42] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Box 17
		gun_4_Model[1][43] = new ModelRendererTurbo(this, 17, 489, textureX, textureY); // Box 18
		gun_4_Model[1][44] = new ModelRendererTurbo(this, 33, 489, textureX, textureY); // Box 19
		gun_4_Model[1][45] = new ModelRendererTurbo(this, 65, 489, textureX, textureY); // Box 32
		gun_4_Model[1][46] = new ModelRendererTurbo(this, 81, 489, textureX, textureY); // Box 32
		gun_4_Model[1][47] = new ModelRendererTurbo(this, 97, 489, textureX, textureY); // Box 32
		gun_4_Model[1][48] = new ModelRendererTurbo(this, 113, 489, textureX, textureY); // Box 32

		gun_4_Model[1][0].addShapeBox(-0.5F, -0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_4_Model[1][1].addShapeBox(-0.5F, -1.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_4_Model[1][2].addShapeBox(-0.5F, 0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 0

		gun_4_Model[1][3].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_4_Model[1][4].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 0

		gun_4_Model[1][5].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 0

		gun_4_Model[1][6].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F); // Box 0

		gun_4_Model[1][7].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F); // Box 0

		gun_4_Model[1][8].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F); // Box 0

		gun_4_Model[1][9].addShapeBox(9F, 1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_4_Model[1][10].addShapeBox(9F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 0

		gun_4_Model[1][11].addShapeBox(-2F, -1F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_4_Model[1][12].addShapeBox(-9.5F, -1F, -1F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_4_Model[1][13].addShapeBox(-3F, -1F, -1F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_4_Model[1][14].addShapeBox(-3F, 0.5F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_4_Model[1][15].addShapeBox(-7.5F, 1.3F, -1.2F, 6, 1, 1, 0F,-0.6F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.8F, -0.6F, 0.4F, -0.8F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, -0.6F, -0.2F, -0.8F); // Box 0

		gun_4_Model[1][16].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F); // Box 0

		gun_4_Model[1][17].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.15F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.8F, 0F, -0.15F, -0.8F); // Box 0

		gun_4_Model[1][18].addShapeBox(10F, 0.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_4_Model[1][19].addShapeBox(10F, -0.7F, -1F, 1, 1, 2, 0F,-0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_4_Model[1][20].addShapeBox(10F, 1.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 0

		gun_4_Model[1][21].addShapeBox(-7.5F, -1.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_4_Model[1][22].addShapeBox(-7F, -1.5F, -0.1F, 2, 1, 1, 0F,-0.7F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0

		gun_4_Model[1][23].addShapeBox(-7F, -1.5F, -0.9F, 2, 1, 1, 0F,-0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F); // Box 0

		gun_4_Model[1][24].addShapeBox(-8.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_4_Model[1][25].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 0

		gun_4_Model[1][26].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_4_Model[1][27].addShapeBox(-11.5F, -0.75F, 1F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_4_Model[1][28].addShapeBox(-11.5F, -0.75F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_4_Model[1][29].addShapeBox(-11.5F, 1.25F, 1F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_4_Model[1][30].addShapeBox(-10.5F, -0.75F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_4_Model[1][31].addShapeBox(-10.5F, 1.25F, 1F, 2, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_4_Model[1][32].addShapeBox(-10.5F, 1.25F, -2F, 2, 1, 1, 0F,0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_4_Model[1][33].addShapeBox(-10.5F, -0.75F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_4_Model[1][34].addShapeBox(-10.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 0

		gun_4_Model[1][35].addShapeBox(-7.5F, 1.3F, 0.2F, 6, 1, 1, 0F,-0.6F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.2F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, -0.6F, -0.2F, 0F); // Box 0

		gun_4_Model[1][36].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,0F, -0.35F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0F, 0F, -0.15F, 0F); // Box 0

		gun_4_Model[1][37].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,-0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 0

		gun_4_Model[1][38].addShapeBox(-11.5F, -0.75F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_4_Model[1][39].addShapeBox(-11.5F, -0.75F, -2F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_4_Model[1][40].addShapeBox(-11.5F, 1.25F, -2F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_4_Model[1][41].addShapeBox(9F, -2.7F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 16

		gun_4_Model[1][42].addShapeBox(-0.5F, -1.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F); // Box 17

		gun_4_Model[1][43].addShapeBox(-0.5F, 0.5F, -1.5F, 1, 1, 3, 0F,0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F); // Box 18

		gun_4_Model[1][44].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 19

		gun_4_Model[1][45].addShapeBox(-3.75F, -3.1F, -5.75F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F); // Box 32

		gun_4_Model[1][46].addShapeBox(-3.75F, -2.1F, -5.75F, 2, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F); // Box 32

		gun_4_Model[1][47].addShapeBox(-3.75F, -0.1F, -4.75F, 2, 1, 4, 0F,-0.1F, 0.3F, -1.2F, -0.1F, 0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, -1.2F, -0.1F, -0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 32

		gun_4_Model[1][48].addShapeBox(-3.75F, -0.1F, -5.75F, 2, 1, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F, 0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F); // Box 32

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(33F, -32F, 22F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[8];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 433, 481, textureX, textureY); // Box 8
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 441, 481, textureX, textureY); // Box 10
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 449, 481, textureX, textureY); // Box 11
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 457, 481, textureX, textureY); // Box 12
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 473, 481, textureX, textureY); // Box 13
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 481, 481, textureX, textureY); // Box 14
		gun_5_Model[0][6] = new ModelRendererTurbo(this, 489, 481, textureX, textureY); // Box 15
		gun_5_Model[0][7] = new ModelRendererTurbo(this, 49, 489, textureX, textureY); // Box 20

		gun_5_Model[0][0].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 8

		gun_5_Model[0][1].addShapeBox(-0.5F, -3.5F, -2.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10

		gun_5_Model[0][2].addShapeBox(-0.5F, -3.5F, 1.5F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		gun_5_Model[0][3].addShapeBox(-0.5F, 2.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12

		gun_5_Model[0][4].addShapeBox(-0.5F, -3.5F, 2.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 13

		gun_5_Model[0][5].addShapeBox(-0.5F, -3.5F, -4.5F, 1, 7, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_5_Model[0][6].addShapeBox(-0.5F, -3.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15

		gun_5_Model[0][7].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-34F, -32F, 22F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[49];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 0
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 33, 481, textureX, textureY); // Box 0
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 65, 481, textureX, textureY); // Box 0
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 97, 481, textureX, textureY); // Box 0
		gun_5_Model[1][4] = new ModelRendererTurbo(this, 105, 481, textureX, textureY); // Box 0
		gun_5_Model[1][5] = new ModelRendererTurbo(this, 113, 481, textureX, textureY); // Box 0
		gun_5_Model[1][6] = new ModelRendererTurbo(this, 121, 481, textureX, textureY); // Box 0
		gun_5_Model[1][7] = new ModelRendererTurbo(this, 129, 481, textureX, textureY); // Box 0
		gun_5_Model[1][8] = new ModelRendererTurbo(this, 137, 481, textureX, textureY); // Box 0
		gun_5_Model[1][9] = new ModelRendererTurbo(this, 145, 481, textureX, textureY); // Box 0
		gun_5_Model[1][10] = new ModelRendererTurbo(this, 153, 481, textureX, textureY); // Box 0
		gun_5_Model[1][11] = new ModelRendererTurbo(this, 161, 481, textureX, textureY); // Box 0
		gun_5_Model[1][12] = new ModelRendererTurbo(this, 169, 481, textureX, textureY); // Box 0
		gun_5_Model[1][13] = new ModelRendererTurbo(this, 193, 481, textureX, textureY); // Box 0
		gun_5_Model[1][14] = new ModelRendererTurbo(this, 201, 481, textureX, textureY); // Box 0
		gun_5_Model[1][15] = new ModelRendererTurbo(this, 209, 481, textureX, textureY); // Box 0
		gun_5_Model[1][16] = new ModelRendererTurbo(this, 225, 481, textureX, textureY); // Box 0
		gun_5_Model[1][17] = new ModelRendererTurbo(this, 233, 481, textureX, textureY); // Box 0
		gun_5_Model[1][18] = new ModelRendererTurbo(this, 241, 481, textureX, textureY); // Box 0
		gun_5_Model[1][19] = new ModelRendererTurbo(this, 249, 481, textureX, textureY); // Box 0
		gun_5_Model[1][20] = new ModelRendererTurbo(this, 257, 481, textureX, textureY); // Box 0
		gun_5_Model[1][21] = new ModelRendererTurbo(this, 265, 481, textureX, textureY); // Box 0
		gun_5_Model[1][22] = new ModelRendererTurbo(this, 273, 481, textureX, textureY); // Box 0
		gun_5_Model[1][23] = new ModelRendererTurbo(this, 281, 481, textureX, textureY); // Box 0
		gun_5_Model[1][24] = new ModelRendererTurbo(this, 289, 481, textureX, textureY); // Box 0
		gun_5_Model[1][25] = new ModelRendererTurbo(this, 297, 481, textureX, textureY); // Box 0
		gun_5_Model[1][26] = new ModelRendererTurbo(this, 305, 481, textureX, textureY); // Box 0
		gun_5_Model[1][27] = new ModelRendererTurbo(this, 313, 481, textureX, textureY); // Box 0
		gun_5_Model[1][28] = new ModelRendererTurbo(this, 321, 481, textureX, textureY); // Box 0
		gun_5_Model[1][29] = new ModelRendererTurbo(this, 329, 481, textureX, textureY); // Box 0
		gun_5_Model[1][30] = new ModelRendererTurbo(this, 337, 481, textureX, textureY); // Box 0
		gun_5_Model[1][31] = new ModelRendererTurbo(this, 345, 481, textureX, textureY); // Box 0
		gun_5_Model[1][32] = new ModelRendererTurbo(this, 353, 481, textureX, textureY); // Box 0
		gun_5_Model[1][33] = new ModelRendererTurbo(this, 361, 481, textureX, textureY); // Box 0
		gun_5_Model[1][34] = new ModelRendererTurbo(this, 369, 481, textureX, textureY); // Box 0
		gun_5_Model[1][35] = new ModelRendererTurbo(this, 377, 481, textureX, textureY); // Box 0
		gun_5_Model[1][36] = new ModelRendererTurbo(this, 393, 481, textureX, textureY); // Box 0
		gun_5_Model[1][37] = new ModelRendererTurbo(this, 401, 481, textureX, textureY); // Box 0
		gun_5_Model[1][38] = new ModelRendererTurbo(this, 409, 481, textureX, textureY); // Box 0
		gun_5_Model[1][39] = new ModelRendererTurbo(this, 417, 481, textureX, textureY); // Box 0
		gun_5_Model[1][40] = new ModelRendererTurbo(this, 425, 481, textureX, textureY); // Box 0
		gun_5_Model[1][41] = new ModelRendererTurbo(this, 465, 481, textureX, textureY); // Box 16
		gun_5_Model[1][42] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Box 17
		gun_5_Model[1][43] = new ModelRendererTurbo(this, 17, 489, textureX, textureY); // Box 18
		gun_5_Model[1][44] = new ModelRendererTurbo(this, 33, 489, textureX, textureY); // Box 19
		gun_5_Model[1][45] = new ModelRendererTurbo(this, 65, 489, textureX, textureY); // Box 32
		gun_5_Model[1][46] = new ModelRendererTurbo(this, 81, 489, textureX, textureY); // Box 32
		gun_5_Model[1][47] = new ModelRendererTurbo(this, 97, 489, textureX, textureY); // Box 32
		gun_5_Model[1][48] = new ModelRendererTurbo(this, 113, 489, textureX, textureY); // Box 32

		gun_5_Model[1][0].addShapeBox(-0.5F, -0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_5_Model[1][1].addShapeBox(-0.5F, -1.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_5_Model[1][2].addShapeBox(-0.5F, 0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 0

		gun_5_Model[1][3].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_5_Model[1][4].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 0

		gun_5_Model[1][5].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 0

		gun_5_Model[1][6].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F); // Box 0

		gun_5_Model[1][7].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F); // Box 0

		gun_5_Model[1][8].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F); // Box 0

		gun_5_Model[1][9].addShapeBox(9F, 1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_5_Model[1][10].addShapeBox(9F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 0

		gun_5_Model[1][11].addShapeBox(-2F, -1F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_5_Model[1][12].addShapeBox(-9.5F, -1F, -1F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_5_Model[1][13].addShapeBox(-3F, -1F, -1F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_5_Model[1][14].addShapeBox(-3F, 0.5F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_5_Model[1][15].addShapeBox(-7.5F, 1.3F, -1.2F, 6, 1, 1, 0F,-0.6F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.8F, -0.6F, 0.4F, -0.8F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, -0.6F, -0.2F, -0.8F); // Box 0

		gun_5_Model[1][16].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F); // Box 0

		gun_5_Model[1][17].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.15F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.8F, 0F, -0.15F, -0.8F); // Box 0

		gun_5_Model[1][18].addShapeBox(10F, 0.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_5_Model[1][19].addShapeBox(10F, -0.7F, -1F, 1, 1, 2, 0F,-0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_5_Model[1][20].addShapeBox(10F, 1.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 0

		gun_5_Model[1][21].addShapeBox(-7.5F, -1.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_5_Model[1][22].addShapeBox(-7F, -1.5F, -0.1F, 2, 1, 1, 0F,-0.7F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0

		gun_5_Model[1][23].addShapeBox(-7F, -1.5F, -0.9F, 2, 1, 1, 0F,-0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F); // Box 0

		gun_5_Model[1][24].addShapeBox(-8.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_5_Model[1][25].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 0

		gun_5_Model[1][26].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_5_Model[1][27].addShapeBox(-11.5F, -0.75F, 1F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_5_Model[1][28].addShapeBox(-11.5F, -0.75F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_5_Model[1][29].addShapeBox(-11.5F, 1.25F, 1F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_5_Model[1][30].addShapeBox(-10.5F, -0.75F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_5_Model[1][31].addShapeBox(-10.5F, 1.25F, 1F, 2, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_5_Model[1][32].addShapeBox(-10.5F, 1.25F, -2F, 2, 1, 1, 0F,0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_5_Model[1][33].addShapeBox(-10.5F, -0.75F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_5_Model[1][34].addShapeBox(-10.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 0

		gun_5_Model[1][35].addShapeBox(-7.5F, 1.3F, 0.2F, 6, 1, 1, 0F,-0.6F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.2F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, -0.6F, -0.2F, 0F); // Box 0

		gun_5_Model[1][36].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,0F, -0.35F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0F, 0F, -0.15F, 0F); // Box 0

		gun_5_Model[1][37].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,-0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 0

		gun_5_Model[1][38].addShapeBox(-11.5F, -0.75F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_5_Model[1][39].addShapeBox(-11.5F, -0.75F, -2F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_5_Model[1][40].addShapeBox(-11.5F, 1.25F, -2F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_5_Model[1][41].addShapeBox(9F, -2.7F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 16

		gun_5_Model[1][42].addShapeBox(-0.5F, -1.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F); // Box 17

		gun_5_Model[1][43].addShapeBox(-0.5F, 0.5F, -1.5F, 1, 1, 3, 0F,0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F); // Box 18

		gun_5_Model[1][44].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 19

		gun_5_Model[1][45].addShapeBox(-3.75F, -3.1F, -5.75F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F); // Box 32

		gun_5_Model[1][46].addShapeBox(-3.75F, -2.1F, -5.75F, 2, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F); // Box 32

		gun_5_Model[1][47].addShapeBox(-3.75F, -0.1F, -4.75F, 2, 1, 4, 0F,-0.1F, 0.3F, -1.2F, -0.1F, 0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, -1.2F, -0.1F, -0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 32

		gun_5_Model[1][48].addShapeBox(-3.75F, -0.1F, -5.75F, 2, 1, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F, 0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F); // Box 32

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-34F, -32F, 22F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[8];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 433, 481, textureX, textureY); // Box 8
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 441, 481, textureX, textureY); // Box 10
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 449, 481, textureX, textureY); // Box 11
		gun_6_Model[0][3] = new ModelRendererTurbo(this, 457, 481, textureX, textureY); // Box 12
		gun_6_Model[0][4] = new ModelRendererTurbo(this, 473, 481, textureX, textureY); // Box 13
		gun_6_Model[0][5] = new ModelRendererTurbo(this, 481, 481, textureX, textureY); // Box 14
		gun_6_Model[0][6] = new ModelRendererTurbo(this, 489, 481, textureX, textureY); // Box 15
		gun_6_Model[0][7] = new ModelRendererTurbo(this, 49, 489, textureX, textureY); // Box 20

		gun_6_Model[0][0].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 8

		gun_6_Model[0][1].addShapeBox(-0.5F, -3.5F, -2.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10

		gun_6_Model[0][2].addShapeBox(-0.5F, -3.5F, 1.5F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		gun_6_Model[0][3].addShapeBox(-0.5F, 2.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12

		gun_6_Model[0][4].addShapeBox(-0.5F, -3.5F, 2.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 13

		gun_6_Model[0][5].addShapeBox(-0.5F, -3.5F, -4.5F, 1, 7, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_6_Model[0][6].addShapeBox(-0.5F, -3.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15

		gun_6_Model[0][7].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(-64F, -27F, 11F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[49];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 0
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 33, 481, textureX, textureY); // Box 0
		gun_6_Model[1][2] = new ModelRendererTurbo(this, 65, 481, textureX, textureY); // Box 0
		gun_6_Model[1][3] = new ModelRendererTurbo(this, 97, 481, textureX, textureY); // Box 0
		gun_6_Model[1][4] = new ModelRendererTurbo(this, 105, 481, textureX, textureY); // Box 0
		gun_6_Model[1][5] = new ModelRendererTurbo(this, 113, 481, textureX, textureY); // Box 0
		gun_6_Model[1][6] = new ModelRendererTurbo(this, 121, 481, textureX, textureY); // Box 0
		gun_6_Model[1][7] = new ModelRendererTurbo(this, 129, 481, textureX, textureY); // Box 0
		gun_6_Model[1][8] = new ModelRendererTurbo(this, 137, 481, textureX, textureY); // Box 0
		gun_6_Model[1][9] = new ModelRendererTurbo(this, 145, 481, textureX, textureY); // Box 0
		gun_6_Model[1][10] = new ModelRendererTurbo(this, 153, 481, textureX, textureY); // Box 0
		gun_6_Model[1][11] = new ModelRendererTurbo(this, 161, 481, textureX, textureY); // Box 0
		gun_6_Model[1][12] = new ModelRendererTurbo(this, 169, 481, textureX, textureY); // Box 0
		gun_6_Model[1][13] = new ModelRendererTurbo(this, 193, 481, textureX, textureY); // Box 0
		gun_6_Model[1][14] = new ModelRendererTurbo(this, 201, 481, textureX, textureY); // Box 0
		gun_6_Model[1][15] = new ModelRendererTurbo(this, 209, 481, textureX, textureY); // Box 0
		gun_6_Model[1][16] = new ModelRendererTurbo(this, 225, 481, textureX, textureY); // Box 0
		gun_6_Model[1][17] = new ModelRendererTurbo(this, 233, 481, textureX, textureY); // Box 0
		gun_6_Model[1][18] = new ModelRendererTurbo(this, 241, 481, textureX, textureY); // Box 0
		gun_6_Model[1][19] = new ModelRendererTurbo(this, 249, 481, textureX, textureY); // Box 0
		gun_6_Model[1][20] = new ModelRendererTurbo(this, 257, 481, textureX, textureY); // Box 0
		gun_6_Model[1][21] = new ModelRendererTurbo(this, 265, 481, textureX, textureY); // Box 0
		gun_6_Model[1][22] = new ModelRendererTurbo(this, 273, 481, textureX, textureY); // Box 0
		gun_6_Model[1][23] = new ModelRendererTurbo(this, 281, 481, textureX, textureY); // Box 0
		gun_6_Model[1][24] = new ModelRendererTurbo(this, 289, 481, textureX, textureY); // Box 0
		gun_6_Model[1][25] = new ModelRendererTurbo(this, 297, 481, textureX, textureY); // Box 0
		gun_6_Model[1][26] = new ModelRendererTurbo(this, 305, 481, textureX, textureY); // Box 0
		gun_6_Model[1][27] = new ModelRendererTurbo(this, 313, 481, textureX, textureY); // Box 0
		gun_6_Model[1][28] = new ModelRendererTurbo(this, 321, 481, textureX, textureY); // Box 0
		gun_6_Model[1][29] = new ModelRendererTurbo(this, 329, 481, textureX, textureY); // Box 0
		gun_6_Model[1][30] = new ModelRendererTurbo(this, 337, 481, textureX, textureY); // Box 0
		gun_6_Model[1][31] = new ModelRendererTurbo(this, 345, 481, textureX, textureY); // Box 0
		gun_6_Model[1][32] = new ModelRendererTurbo(this, 353, 481, textureX, textureY); // Box 0
		gun_6_Model[1][33] = new ModelRendererTurbo(this, 361, 481, textureX, textureY); // Box 0
		gun_6_Model[1][34] = new ModelRendererTurbo(this, 369, 481, textureX, textureY); // Box 0
		gun_6_Model[1][35] = new ModelRendererTurbo(this, 377, 481, textureX, textureY); // Box 0
		gun_6_Model[1][36] = new ModelRendererTurbo(this, 393, 481, textureX, textureY); // Box 0
		gun_6_Model[1][37] = new ModelRendererTurbo(this, 401, 481, textureX, textureY); // Box 0
		gun_6_Model[1][38] = new ModelRendererTurbo(this, 409, 481, textureX, textureY); // Box 0
		gun_6_Model[1][39] = new ModelRendererTurbo(this, 417, 481, textureX, textureY); // Box 0
		gun_6_Model[1][40] = new ModelRendererTurbo(this, 425, 481, textureX, textureY); // Box 0
		gun_6_Model[1][41] = new ModelRendererTurbo(this, 465, 481, textureX, textureY); // Box 16
		gun_6_Model[1][42] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Box 17
		gun_6_Model[1][43] = new ModelRendererTurbo(this, 17, 489, textureX, textureY); // Box 18
		gun_6_Model[1][44] = new ModelRendererTurbo(this, 33, 489, textureX, textureY); // Box 19
		gun_6_Model[1][45] = new ModelRendererTurbo(this, 65, 489, textureX, textureY); // Box 32
		gun_6_Model[1][46] = new ModelRendererTurbo(this, 81, 489, textureX, textureY); // Box 32
		gun_6_Model[1][47] = new ModelRendererTurbo(this, 97, 489, textureX, textureY); // Box 32
		gun_6_Model[1][48] = new ModelRendererTurbo(this, 113, 489, textureX, textureY); // Box 32

		gun_6_Model[1][0].addShapeBox(-0.5F, -0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_6_Model[1][1].addShapeBox(-0.5F, -1.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_6_Model[1][2].addShapeBox(-0.5F, 0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 0

		gun_6_Model[1][3].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_6_Model[1][4].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 0

		gun_6_Model[1][5].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 0

		gun_6_Model[1][6].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F); // Box 0

		gun_6_Model[1][7].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F); // Box 0

		gun_6_Model[1][8].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F); // Box 0

		gun_6_Model[1][9].addShapeBox(9F, 1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_6_Model[1][10].addShapeBox(9F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 0

		gun_6_Model[1][11].addShapeBox(-2F, -1F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_6_Model[1][12].addShapeBox(-9.5F, -1F, -1F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_6_Model[1][13].addShapeBox(-3F, -1F, -1F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_6_Model[1][14].addShapeBox(-3F, 0.5F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_6_Model[1][15].addShapeBox(-7.5F, 1.3F, -1.2F, 6, 1, 1, 0F,-0.6F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.8F, -0.6F, 0.4F, -0.8F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, -0.6F, -0.2F, -0.8F); // Box 0

		gun_6_Model[1][16].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F); // Box 0

		gun_6_Model[1][17].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.15F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.8F, 0F, -0.15F, -0.8F); // Box 0

		gun_6_Model[1][18].addShapeBox(10F, 0.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_6_Model[1][19].addShapeBox(10F, -0.7F, -1F, 1, 1, 2, 0F,-0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_6_Model[1][20].addShapeBox(10F, 1.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 0

		gun_6_Model[1][21].addShapeBox(-7.5F, -1.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_6_Model[1][22].addShapeBox(-7F, -1.5F, -0.1F, 2, 1, 1, 0F,-0.7F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0

		gun_6_Model[1][23].addShapeBox(-7F, -1.5F, -0.9F, 2, 1, 1, 0F,-0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F); // Box 0

		gun_6_Model[1][24].addShapeBox(-8.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_6_Model[1][25].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 0

		gun_6_Model[1][26].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_6_Model[1][27].addShapeBox(-11.5F, -0.75F, 1F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_6_Model[1][28].addShapeBox(-11.5F, -0.75F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_6_Model[1][29].addShapeBox(-11.5F, 1.25F, 1F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_6_Model[1][30].addShapeBox(-10.5F, -0.75F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_6_Model[1][31].addShapeBox(-10.5F, 1.25F, 1F, 2, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_6_Model[1][32].addShapeBox(-10.5F, 1.25F, -2F, 2, 1, 1, 0F,0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_6_Model[1][33].addShapeBox(-10.5F, -0.75F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_6_Model[1][34].addShapeBox(-10.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 0

		gun_6_Model[1][35].addShapeBox(-7.5F, 1.3F, 0.2F, 6, 1, 1, 0F,-0.6F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.2F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, -0.6F, -0.2F, 0F); // Box 0

		gun_6_Model[1][36].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,0F, -0.35F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0F, 0F, -0.15F, 0F); // Box 0

		gun_6_Model[1][37].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,-0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 0

		gun_6_Model[1][38].addShapeBox(-11.5F, -0.75F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_6_Model[1][39].addShapeBox(-11.5F, -0.75F, -2F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_6_Model[1][40].addShapeBox(-11.5F, 1.25F, -2F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_6_Model[1][41].addShapeBox(9F, -2.7F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 16

		gun_6_Model[1][42].addShapeBox(-0.5F, -1.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F); // Box 17

		gun_6_Model[1][43].addShapeBox(-0.5F, 0.5F, -1.5F, 1, 1, 3, 0F,0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F); // Box 18

		gun_6_Model[1][44].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 19

		gun_6_Model[1][45].addShapeBox(-3.75F, -3.1F, -5.75F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F); // Box 32

		gun_6_Model[1][46].addShapeBox(-3.75F, -2.1F, -5.75F, 2, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F); // Box 32

		gun_6_Model[1][47].addShapeBox(-3.75F, -0.1F, -4.75F, 2, 1, 4, 0F,-0.1F, 0.3F, -1.2F, -0.1F, 0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, -1.2F, -0.1F, -0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 32

		gun_6_Model[1][48].addShapeBox(-3.75F, -0.1F, -5.75F, 2, 1, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F, 0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F); // Box 32

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(-64F, -27F, 11F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[8];
		gun_7_Model[0][0] = new ModelRendererTurbo(this, 433, 481, textureX, textureY); // Box 8
		gun_7_Model[0][1] = new ModelRendererTurbo(this, 441, 481, textureX, textureY); // Box 10
		gun_7_Model[0][2] = new ModelRendererTurbo(this, 449, 481, textureX, textureY); // Box 11
		gun_7_Model[0][3] = new ModelRendererTurbo(this, 457, 481, textureX, textureY); // Box 12
		gun_7_Model[0][4] = new ModelRendererTurbo(this, 473, 481, textureX, textureY); // Box 13
		gun_7_Model[0][5] = new ModelRendererTurbo(this, 481, 481, textureX, textureY); // Box 14
		gun_7_Model[0][6] = new ModelRendererTurbo(this, 489, 481, textureX, textureY); // Box 15
		gun_7_Model[0][7] = new ModelRendererTurbo(this, 49, 489, textureX, textureY); // Box 20

		gun_7_Model[0][0].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 8

		gun_7_Model[0][1].addShapeBox(-0.5F, -3.5F, -2.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10

		gun_7_Model[0][2].addShapeBox(-0.5F, -3.5F, 1.5F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		gun_7_Model[0][3].addShapeBox(-0.5F, 2.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12

		gun_7_Model[0][4].addShapeBox(-0.5F, -3.5F, 2.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 13

		gun_7_Model[0][5].addShapeBox(-0.5F, -3.5F, -4.5F, 1, 7, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_7_Model[0][6].addShapeBox(-0.5F, -3.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15

		gun_7_Model[0][7].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[0])
		{
			gunPart.setRotationPoint(-64F, -27F, -11F);
		}


		gun_7_Model[1] = new ModelRendererTurbo[49];
		gun_7_Model[1][0] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 0
		gun_7_Model[1][1] = new ModelRendererTurbo(this, 33, 481, textureX, textureY); // Box 0
		gun_7_Model[1][2] = new ModelRendererTurbo(this, 65, 481, textureX, textureY); // Box 0
		gun_7_Model[1][3] = new ModelRendererTurbo(this, 97, 481, textureX, textureY); // Box 0
		gun_7_Model[1][4] = new ModelRendererTurbo(this, 105, 481, textureX, textureY); // Box 0
		gun_7_Model[1][5] = new ModelRendererTurbo(this, 113, 481, textureX, textureY); // Box 0
		gun_7_Model[1][6] = new ModelRendererTurbo(this, 121, 481, textureX, textureY); // Box 0
		gun_7_Model[1][7] = new ModelRendererTurbo(this, 129, 481, textureX, textureY); // Box 0
		gun_7_Model[1][8] = new ModelRendererTurbo(this, 137, 481, textureX, textureY); // Box 0
		gun_7_Model[1][9] = new ModelRendererTurbo(this, 145, 481, textureX, textureY); // Box 0
		gun_7_Model[1][10] = new ModelRendererTurbo(this, 153, 481, textureX, textureY); // Box 0
		gun_7_Model[1][11] = new ModelRendererTurbo(this, 161, 481, textureX, textureY); // Box 0
		gun_7_Model[1][12] = new ModelRendererTurbo(this, 169, 481, textureX, textureY); // Box 0
		gun_7_Model[1][13] = new ModelRendererTurbo(this, 193, 481, textureX, textureY); // Box 0
		gun_7_Model[1][14] = new ModelRendererTurbo(this, 201, 481, textureX, textureY); // Box 0
		gun_7_Model[1][15] = new ModelRendererTurbo(this, 209, 481, textureX, textureY); // Box 0
		gun_7_Model[1][16] = new ModelRendererTurbo(this, 225, 481, textureX, textureY); // Box 0
		gun_7_Model[1][17] = new ModelRendererTurbo(this, 233, 481, textureX, textureY); // Box 0
		gun_7_Model[1][18] = new ModelRendererTurbo(this, 241, 481, textureX, textureY); // Box 0
		gun_7_Model[1][19] = new ModelRendererTurbo(this, 249, 481, textureX, textureY); // Box 0
		gun_7_Model[1][20] = new ModelRendererTurbo(this, 257, 481, textureX, textureY); // Box 0
		gun_7_Model[1][21] = new ModelRendererTurbo(this, 265, 481, textureX, textureY); // Box 0
		gun_7_Model[1][22] = new ModelRendererTurbo(this, 273, 481, textureX, textureY); // Box 0
		gun_7_Model[1][23] = new ModelRendererTurbo(this, 281, 481, textureX, textureY); // Box 0
		gun_7_Model[1][24] = new ModelRendererTurbo(this, 289, 481, textureX, textureY); // Box 0
		gun_7_Model[1][25] = new ModelRendererTurbo(this, 297, 481, textureX, textureY); // Box 0
		gun_7_Model[1][26] = new ModelRendererTurbo(this, 305, 481, textureX, textureY); // Box 0
		gun_7_Model[1][27] = new ModelRendererTurbo(this, 313, 481, textureX, textureY); // Box 0
		gun_7_Model[1][28] = new ModelRendererTurbo(this, 321, 481, textureX, textureY); // Box 0
		gun_7_Model[1][29] = new ModelRendererTurbo(this, 329, 481, textureX, textureY); // Box 0
		gun_7_Model[1][30] = new ModelRendererTurbo(this, 337, 481, textureX, textureY); // Box 0
		gun_7_Model[1][31] = new ModelRendererTurbo(this, 345, 481, textureX, textureY); // Box 0
		gun_7_Model[1][32] = new ModelRendererTurbo(this, 353, 481, textureX, textureY); // Box 0
		gun_7_Model[1][33] = new ModelRendererTurbo(this, 361, 481, textureX, textureY); // Box 0
		gun_7_Model[1][34] = new ModelRendererTurbo(this, 369, 481, textureX, textureY); // Box 0
		gun_7_Model[1][35] = new ModelRendererTurbo(this, 377, 481, textureX, textureY); // Box 0
		gun_7_Model[1][36] = new ModelRendererTurbo(this, 393, 481, textureX, textureY); // Box 0
		gun_7_Model[1][37] = new ModelRendererTurbo(this, 401, 481, textureX, textureY); // Box 0
		gun_7_Model[1][38] = new ModelRendererTurbo(this, 409, 481, textureX, textureY); // Box 0
		gun_7_Model[1][39] = new ModelRendererTurbo(this, 417, 481, textureX, textureY); // Box 0
		gun_7_Model[1][40] = new ModelRendererTurbo(this, 425, 481, textureX, textureY); // Box 0
		gun_7_Model[1][41] = new ModelRendererTurbo(this, 465, 481, textureX, textureY); // Box 16
		gun_7_Model[1][42] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Box 17
		gun_7_Model[1][43] = new ModelRendererTurbo(this, 17, 489, textureX, textureY); // Box 18
		gun_7_Model[1][44] = new ModelRendererTurbo(this, 33, 489, textureX, textureY); // Box 19
		gun_7_Model[1][45] = new ModelRendererTurbo(this, 65, 489, textureX, textureY); // Box 32
		gun_7_Model[1][46] = new ModelRendererTurbo(this, 81, 489, textureX, textureY); // Box 32
		gun_7_Model[1][47] = new ModelRendererTurbo(this, 97, 489, textureX, textureY); // Box 32
		gun_7_Model[1][48] = new ModelRendererTurbo(this, 113, 489, textureX, textureY); // Box 32

		gun_7_Model[1][0].addShapeBox(-0.5F, -0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_7_Model[1][1].addShapeBox(-0.5F, -1.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_7_Model[1][2].addShapeBox(-0.5F, 0.5F, -1.5F, 11, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 0

		gun_7_Model[1][3].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_7_Model[1][4].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 0

		gun_7_Model[1][5].addShapeBox(10.5F, 0.3F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 0

		gun_7_Model[1][6].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F); // Box 0

		gun_7_Model[1][7].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F); // Box 0

		gun_7_Model[1][8].addShapeBox(12F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F); // Box 0

		gun_7_Model[1][9].addShapeBox(9F, 1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_7_Model[1][10].addShapeBox(9F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 0

		gun_7_Model[1][11].addShapeBox(-2F, -1F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_7_Model[1][12].addShapeBox(-9.5F, -1F, -1F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0

		gun_7_Model[1][13].addShapeBox(-3F, -1F, -1F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_7_Model[1][14].addShapeBox(-3F, 0.5F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_7_Model[1][15].addShapeBox(-7.5F, 1.3F, -1.2F, 6, 1, 1, 0F,-0.6F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.8F, -0.6F, 0.4F, -0.8F, -0.6F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, -0.6F, -0.2F, -0.8F); // Box 0

		gun_7_Model[1][16].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F); // Box 0

		gun_7_Model[1][17].addShapeBox(-7.9F, 0.9F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.15F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.8F, 0F, -0.15F, -0.8F); // Box 0

		gun_7_Model[1][18].addShapeBox(10F, 0.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_7_Model[1][19].addShapeBox(10F, -0.7F, -1F, 1, 1, 2, 0F,-0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 0

		gun_7_Model[1][20].addShapeBox(10F, 1.3F, -1F, 1, 1, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 0

		gun_7_Model[1][21].addShapeBox(-7.5F, -1.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_7_Model[1][22].addShapeBox(-7F, -1.5F, -0.1F, 2, 1, 1, 0F,-0.7F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.5F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0

		gun_7_Model[1][23].addShapeBox(-7F, -1.5F, -0.9F, 2, 1, 1, 0F,-0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F); // Box 0

		gun_7_Model[1][24].addShapeBox(-8.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_7_Model[1][25].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 0

		gun_7_Model[1][26].addShapeBox(-8.5F, -1.8F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_7_Model[1][27].addShapeBox(-11.5F, -0.75F, 1F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_7_Model[1][28].addShapeBox(-11.5F, -0.75F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_7_Model[1][29].addShapeBox(-11.5F, 1.25F, 1F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_7_Model[1][30].addShapeBox(-10.5F, -0.75F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_7_Model[1][31].addShapeBox(-10.5F, 1.25F, 1F, 2, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_7_Model[1][32].addShapeBox(-10.5F, 1.25F, -2F, 2, 1, 1, 0F,0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_7_Model[1][33].addShapeBox(-10.5F, -0.75F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_7_Model[1][34].addShapeBox(-10.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 0

		gun_7_Model[1][35].addShapeBox(-7.5F, 1.3F, 0.2F, 6, 1, 1, 0F,-0.6F, 0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.2F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, -0.6F, -0.2F, 0F); // Box 0

		gun_7_Model[1][36].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,0F, -0.35F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0F, 0F, -0.15F, 0F); // Box 0

		gun_7_Model[1][37].addShapeBox(-7.9F, 0.9F, 0.2F, 1, 1, 1, 0F,-0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 0

		gun_7_Model[1][38].addShapeBox(-11.5F, -0.75F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_7_Model[1][39].addShapeBox(-11.5F, -0.75F, -2F, 1, 3, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0

		gun_7_Model[1][40].addShapeBox(-11.5F, 1.25F, -2F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_7_Model[1][41].addShapeBox(9F, -2.7F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, -0.8F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 16

		gun_7_Model[1][42].addShapeBox(-0.5F, -1.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F); // Box 17

		gun_7_Model[1][43].addShapeBox(-0.5F, 0.5F, -1.5F, 1, 1, 3, 0F,0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F, 0.1F, 0.2F, -0.8F); // Box 18

		gun_7_Model[1][44].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F); // Box 19

		gun_7_Model[1][45].addShapeBox(-3.75F, -3.1F, -5.75F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F); // Box 32

		gun_7_Model[1][46].addShapeBox(-3.75F, -2.1F, -5.75F, 2, 2, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.5F); // Box 32

		gun_7_Model[1][47].addShapeBox(-3.75F, -0.1F, -4.75F, 2, 1, 4, 0F,-0.1F, 0.3F, -1.2F, -0.1F, 0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, -1.2F, -0.1F, -0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 32

		gun_7_Model[1][48].addShapeBox(-3.75F, -0.1F, -5.75F, 2, 1, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.5F, 0F, 0F, -1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.6F, 0F, 0F, -0.5F); // Box 32

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[1])
		{
			gunPart.setRotationPoint(-64F, -27F, -11F);
		}


		gun_7_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun7", gun_7_Model);

		// Passenger 9
		ModelRendererTurbo[][] gun_8_Model = new ModelRendererTurbo[3][];

		gun_8_Model[0] = new ModelRendererTurbo[16];
		gun_8_Model[0][0] = new ModelRendererTurbo(this, 169, 451, textureX, textureY); // Box 7
		gun_8_Model[0][1] = new ModelRendererTurbo(this, 177, 451, textureX, textureY); // Box 8
		gun_8_Model[0][2] = new ModelRendererTurbo(this, 193, 451, textureX, textureY); // Box 10
		gun_8_Model[0][3] = new ModelRendererTurbo(this, 65, 451, textureX, textureY); // Box 11
		gun_8_Model[0][4] = new ModelRendererTurbo(this, 201, 451, textureX, textureY); // Box 12
		gun_8_Model[0][5] = new ModelRendererTurbo(this, 217, 451, textureX, textureY); // Box 13
		gun_8_Model[0][6] = new ModelRendererTurbo(this, 249, 451, textureX, textureY); // Box 28
		gun_8_Model[0][7] = new ModelRendererTurbo(this, 137, 451, textureX, textureY); // Box 30
		gun_8_Model[0][8] = new ModelRendererTurbo(this, 153, 451, textureX, textureY); // Box 31
		gun_8_Model[0][9] = new ModelRendererTurbo(this, 65, 451, textureX, textureY); // Box 32
		gun_8_Model[0][10] = new ModelRendererTurbo(this, 185, 451, textureX, textureY); // Box 33
		gun_8_Model[0][11] = new ModelRendererTurbo(this, 433, 451, textureX, textureY); // Box 36
		gun_8_Model[0][12] = new ModelRendererTurbo(this, 449, 451, textureX, textureY); // Box 37
		gun_8_Model[0][13] = new ModelRendererTurbo(this, 465, 451, textureX, textureY); // Box 38
		gun_8_Model[0][14] = new ModelRendererTurbo(this, 481, 451, textureX, textureY); // Box 39
		gun_8_Model[0][15] = new ModelRendererTurbo(this, 201, 451, textureX, textureY); // Box 42

		gun_8_Model[0][0].addShapeBox(2F, -0.5F, -3.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_8_Model[0][1].addShapeBox(2F, -4.5F, -7.5F, 1, 10, 4, 0F,4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_8_Model[0][2].addShapeBox(2F, -4.5F, 2.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10

		gun_8_Model[0][3].addShapeBox(2F, -4.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		gun_8_Model[0][4].addShapeBox(2F, 3.5F, -2.5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_8_Model[0][5].addShapeBox(-0.5F, -0.5F, -6F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_8_Model[0][6].addShapeBox(-0.5F, -0.5F, 1F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F); // Box 28

		gun_8_Model[0][7].addShapeBox(-0.5F, 0.5F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_8_Model[0][8].addShapeBox(-0.5F, 0.5F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31

		gun_8_Model[0][9].addShapeBox(-0.5F, -0.5F, 2F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 32

		gun_8_Model[0][10].addShapeBox(-0.5F, -0.5F, -3F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 33

		gun_8_Model[0][11].addShapeBox(-0.5F, 2.5F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 36

		gun_8_Model[0][12].addShapeBox(-5F, -4.5F, -7.5F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37

		gun_8_Model[0][13].addShapeBox(-5F, -4.5F, 6.5F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38

		gun_8_Model[0][14].addShapeBox(2F, -4.5F, 3.5F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, -1F); // Box 39

		gun_8_Model[0][15].addShapeBox(2F, -4.5F, -3.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[0])
		{
			gunPart.setRotationPoint(65F, -31F, 0F);
		}


		gun_8_Model[1] = new ModelRendererTurbo[21];
		gun_8_Model[1][0] = new ModelRendererTurbo(this, 1, 451, textureX, textureY); // Box 0
		gun_8_Model[1][1] = new ModelRendererTurbo(this, 33, 451, textureX, textureY); // Box 1
		gun_8_Model[1][2] = new ModelRendererTurbo(this, 73, 451, textureX, textureY); // Box 3
		gun_8_Model[1][3] = new ModelRendererTurbo(this, 105, 451, textureX, textureY); // Box 4
		gun_8_Model[1][4] = new ModelRendererTurbo(this, 137, 451, textureX, textureY); // Box 5
		gun_8_Model[1][5] = new ModelRendererTurbo(this, 153, 451, textureX, textureY); // Box 6
		gun_8_Model[1][6] = new ModelRendererTurbo(this, 209, 451, textureX, textureY); // Box 15
		gun_8_Model[1][7] = new ModelRendererTurbo(this, 225, 451, textureX, textureY); // Box 16
		gun_8_Model[1][8] = new ModelRendererTurbo(this, 241, 451, textureX, textureY); // Box 17
		gun_8_Model[1][9] = new ModelRendererTurbo(this, 257, 451, textureX, textureY); // Box 18
		gun_8_Model[1][10] = new ModelRendererTurbo(this, 273, 451, textureX, textureY); // Box 19
		gun_8_Model[1][11] = new ModelRendererTurbo(this, 289, 451, textureX, textureY); // Box 20
		gun_8_Model[1][12] = new ModelRendererTurbo(this, 313, 451, textureX, textureY); // Box 21
		gun_8_Model[1][13] = new ModelRendererTurbo(this, 337, 451, textureX, textureY); // Box 22
		gun_8_Model[1][14] = new ModelRendererTurbo(this, 353, 451, textureX, textureY); // Box 23
		gun_8_Model[1][15] = new ModelRendererTurbo(this, 369, 451, textureX, textureY); // Box 24
		gun_8_Model[1][16] = new ModelRendererTurbo(this, 385, 451, textureX, textureY); // Box 25
		gun_8_Model[1][17] = new ModelRendererTurbo(this, 401, 451, textureX, textureY); // Box 26
		gun_8_Model[1][18] = new ModelRendererTurbo(this, 417, 451, textureX, textureY); // Box 27
		gun_8_Model[1][19] = new ModelRendererTurbo(this, 497, 451, textureX, textureY); // Box 40
		gun_8_Model[1][20] = new ModelRendererTurbo(this, 1, 459, textureX, textureY); // Box 41

		gun_8_Model[1][0].addShapeBox(5F, -0.5F, -1.5F, 14, 1, 1, 0F,0F, 0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F); // Box 0

		gun_8_Model[1][1].addShapeBox(5F, -1.5F, -1.5F, 14, 1, 3, 0F,0F, 0.3F, -0.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.3F, -0.8F, 0F, -0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.2F); // Box 1

		gun_8_Model[1][2].addShapeBox(5F, 0.5F, -1.5F, 14, 1, 3, 0F,0F, -0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.2F, 0F, 0.3F, -0.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.3F, -0.8F); // Box 3

		gun_8_Model[1][3].addShapeBox(5F, -0.5F, 0.5F, 14, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.2F); // Box 4

		gun_8_Model[1][4].addShapeBox(3F, -2.5F, -2.5F, 2, 5, 5, 0F,0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 5

		gun_8_Model[1][5].addShapeBox(1F, -3.5F, -2.5F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_8_Model[1][6].addShapeBox(-8F, -0.5F, 0.5F, 4, 1, 1, 0F,0F, 1F, 0F, 0F, 1.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0F, 0F); // Box 15

		gun_8_Model[1][7].addShapeBox(-8F, 0.5F, -1.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0F, -1F); // Box 16

		gun_8_Model[1][8].addShapeBox(-8F, -0.5F, -1.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.1F, 0.2F, 0F, 1.1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Box 17

		gun_8_Model[1][9].addShapeBox(-4F, -0.5F, 0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0F, 0F); // Box 18

		gun_8_Model[1][10].addShapeBox(-4F, -0.5F, -1.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Box 19

		gun_8_Model[1][11].addShapeBox(-4F, -1.5F, -1.5F, 6, 1, 3, 0F,0F, 0F, -1F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0F, 0F); // Box 20

		gun_8_Model[1][12].addShapeBox(-4F, 0.5F, -1.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0F, -1F); // Box 21

		gun_8_Model[1][13].addShapeBox(-4F, -2.5F, -2.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22

		gun_8_Model[1][14].addShapeBox(-4F, -2.5F, 0.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23

		gun_8_Model[1][15].addShapeBox(-4F, -3.5F, -2.5F, 5, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24

		gun_8_Model[1][16].addShapeBox(-4F, -3.5F, 0.5F, 5, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_8_Model[1][17].addShapeBox(-4F, -1.5F, 0.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 26

		gun_8_Model[1][18].addShapeBox(-4F, -1.5F, -2.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 27

		gun_8_Model[1][19].addShapeBox(-4F, -0.5F, 1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 40

		gun_8_Model[1][20].addShapeBox(-9F, -0.5F, 3.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[1])
		{
			gunPart.setRotationPoint(65F, -31F, 0F);
		}


		gun_8_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun8", gun_8_Model);
	}
}