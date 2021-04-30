//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.07.2017 - 12:41:07
// Last changed on: 24.07.2017 - 12:41:07

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTiger2New extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelTiger2New() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[228];
		turretModel = new ModelRendererTurbo[79];
		barrelModel = new ModelRendererTurbo[27];
		rightBackWheelModel = new ModelRendererTurbo[6];
		leftTrackWheelModels = new ModelRendererTurbo[91];
		rightTrackWheelModels = new ModelRendererTurbo[85];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initrightBackWheelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1329, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1569, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1289, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 1785, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 1609, 25, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 1881, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 1953, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 1313, 9, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 2009, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 1833, 25, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 1873, 25, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 1913, 25, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 1985, 25, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 1593, 49, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 1025, 33, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 1081, 41, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 1817, 49, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 1857, 49, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 1969, 49, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 1201, 1, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 1817, 1, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Box 58
		bodyModel[54] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 1129, 57, textureX, textureY); // Box 62
		bodyModel[57] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 63
		bodyModel[58] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 64
		bodyModel[59] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 68
		bodyModel[60] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 69
		bodyModel[61] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 70
		bodyModel[62] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 71
		bodyModel[63] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 69
		bodyModel[64] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 70
		bodyModel[65] = new ModelRendererTurbo(this, 2025, 41, textureX, textureY); // Box 71
		bodyModel[66] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 74
		bodyModel[69] = new ModelRendererTurbo(this, 1361, 57, textureX, textureY); // Box 75
		bodyModel[70] = new ModelRendererTurbo(this, 1409, 57, textureX, textureY); // Box 76
		bodyModel[71] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 1137, 73, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 1313, 1, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 328
		bodyModel[82] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Box 329
		bodyModel[83] = new ModelRendererTurbo(this, 1945, 57, textureX, textureY); // Box 330
		bodyModel[84] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Box 331
		bodyModel[85] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 332
		bodyModel[86] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 333
		bodyModel[87] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 334
		bodyModel[88] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 335
		bodyModel[89] = new ModelRendererTurbo(this, 1225, 1, textureX, textureY); // Box 336
		bodyModel[90] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 337
		bodyModel[91] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Box 338
		bodyModel[92] = new ModelRendererTurbo(this, 1361, 1, textureX, textureY); // Box 339
		bodyModel[93] = new ModelRendererTurbo(this, 1841, 1, textureX, textureY); // Box 340
		bodyModel[94] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 341
		bodyModel[95] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 342
		bodyModel[96] = new ModelRendererTurbo(this, 1313, 81, textureX, textureY); // Box 343
		bodyModel[97] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 344
		bodyModel[98] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Box 345
		bodyModel[99] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 346
		bodyModel[100] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 347
		bodyModel[101] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 348
		bodyModel[102] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 349
		bodyModel[103] = new ModelRendererTurbo(this, 1105, 33, textureX, textureY); // Box 350
		bodyModel[104] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 351
		bodyModel[105] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 353
		bodyModel[106] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 354
		bodyModel[107] = new ModelRendererTurbo(this, 1137, 33, textureX, textureY); // Box 355
		bodyModel[108] = new ModelRendererTurbo(this, 1217, 33, textureX, textureY); // Box 356
		bodyModel[109] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 357
		bodyModel[110] = new ModelRendererTurbo(this, 1145, 9, textureX, textureY); // Box 359
		bodyModel[111] = new ModelRendererTurbo(this, 1177, 9, textureX, textureY); // Box 360
		bodyModel[112] = new ModelRendererTurbo(this, 1241, 9, textureX, textureY); // Box 361
		bodyModel[113] = new ModelRendererTurbo(this, 1289, 9, textureX, textureY); // Box 363
		bodyModel[114] = new ModelRendererTurbo(this, 1313, 9, textureX, textureY); // Box 365
		bodyModel[115] = new ModelRendererTurbo(this, 1305, 33, textureX, textureY); // Box 366
		bodyModel[116] = new ModelRendererTurbo(this, 1297, 9, textureX, textureY); // Box 367
		bodyModel[117] = new ModelRendererTurbo(this, 1369, 81, textureX, textureY); // Box 368
		bodyModel[118] = new ModelRendererTurbo(this, 1329, 33, textureX, textureY); // Box 370
		bodyModel[119] = new ModelRendererTurbo(this, 1817, 33, textureX, textureY); // Box 371
		bodyModel[120] = new ModelRendererTurbo(this, 1393, 57, textureX, textureY); // Box 372
		bodyModel[121] = new ModelRendererTurbo(this, 1857, 33, textureX, textureY); // Box 373
		bodyModel[122] = new ModelRendererTurbo(this, 1649, 73, textureX, textureY); // Box 374
		bodyModel[123] = new ModelRendererTurbo(this, 1409, 81, textureX, textureY); // Box 375
		bodyModel[124] = new ModelRendererTurbo(this, 1513, 81, textureX, textureY); // Box 376
		bodyModel[125] = new ModelRendererTurbo(this, 1553, 81, textureX, textureY); // Box 377
		bodyModel[126] = new ModelRendererTurbo(this, 1809, 81, textureX, textureY); // Box 378
		bodyModel[127] = new ModelRendererTurbo(this, 1841, 81, textureX, textureY); // Box 379
		bodyModel[128] = new ModelRendererTurbo(this, 1569, 9, textureX, textureY); // Box 380
		bodyModel[129] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 381
		bodyModel[130] = new ModelRendererTurbo(this, 1809, 49, textureX, textureY); // Box 382
		bodyModel[131] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 383
		bodyModel[132] = new ModelRendererTurbo(this, 1969, 33, textureX, textureY); // Box 384
		bodyModel[133] = new ModelRendererTurbo(this, 1545, 57, textureX, textureY); // Box 322
		bodyModel[134] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 323
		bodyModel[135] = new ModelRendererTurbo(this, 1441, 57, textureX, textureY); // Box 324
		bodyModel[136] = new ModelRendererTurbo(this, 1913, 57, textureX, textureY); // Box 325
		bodyModel[137] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 326
		bodyModel[138] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 327
		bodyModel[139] = new ModelRendererTurbo(this, 2033, 9, textureX, textureY); // Box 328
		bodyModel[140] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 329
		bodyModel[141] = new ModelRendererTurbo(this, 1289, 9, textureX, textureY); // Box 330
		bodyModel[142] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 331
		bodyModel[143] = new ModelRendererTurbo(this, 1561, 65, textureX, textureY); // Box 332
		bodyModel[144] = new ModelRendererTurbo(this, 1881, 73, textureX, textureY); // Box 333
		bodyModel[145] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 334
		bodyModel[146] = new ModelRendererTurbo(this, 1393, 81, textureX, textureY); // Box 335
		bodyModel[147] = new ModelRendererTurbo(this, 1433, 81, textureX, textureY); // Box 336
		bodyModel[148] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 337
		bodyModel[149] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 338
		bodyModel[150] = new ModelRendererTurbo(this, 1537, 81, textureX, textureY); // Box 339
		bodyModel[151] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 343
		bodyModel[152] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 344
		bodyModel[153] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 345
		bodyModel[154] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Box 346
		bodyModel[155] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 347
		bodyModel[156] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Box 348
		bodyModel[157] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 349
		bodyModel[158] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 350
		bodyModel[159] = new ModelRendererTurbo(this, 1913, 25, textureX, textureY); // Box 351
		bodyModel[160] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 352
		bodyModel[161] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 353
		bodyModel[162] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 354
		bodyModel[163] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 355
		bodyModel[164] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 356
		bodyModel[165] = new ModelRendererTurbo(this, 1577, 81, textureX, textureY); // Box 357
		bodyModel[166] = new ModelRendererTurbo(this, 1865, 81, textureX, textureY); // Box 358
		bodyModel[167] = new ModelRendererTurbo(this, 1913, 81, textureX, textureY); // Box 359
		bodyModel[168] = new ModelRendererTurbo(this, 1241, 33, textureX, textureY); // Box 360
		bodyModel[169] = new ModelRendererTurbo(this, 1353, 33, textureX, textureY); // Box 361
		bodyModel[170] = new ModelRendererTurbo(this, 1609, 33, textureX, textureY); // Box 362
		bodyModel[171] = new ModelRendererTurbo(this, 1913, 33, textureX, textureY); // Box 363
		bodyModel[172] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 364
		bodyModel[173] = new ModelRendererTurbo(this, 2017, 33, textureX, textureY); // Box 365
		bodyModel[174] = new ModelRendererTurbo(this, 1937, 81, textureX, textureY); // Box 366
		bodyModel[175] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 367
		bodyModel[176] = new ModelRendererTurbo(this, 1217, 25, textureX, textureY); // Box 368
		bodyModel[177] = new ModelRendererTurbo(this, 2001, 81, textureX, textureY); // Box 369
		bodyModel[178] = new ModelRendererTurbo(this, 2025, 81, textureX, textureY); // Box 370
		bodyModel[179] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 371
		bodyModel[180] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 372
		bodyModel[181] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 373
		bodyModel[182] = new ModelRendererTurbo(this, 1033, 57, textureX, textureY); // Box 374
		bodyModel[183] = new ModelRendererTurbo(this, 1833, 81, textureX, textureY); // Box 375
		bodyModel[184] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 376
		bodyModel[185] = new ModelRendererTurbo(this, 1841, 49, textureX, textureY); // Box 377
		bodyModel[186] = new ModelRendererTurbo(this, 1857, 49, textureX, textureY); // Box 378
		bodyModel[187] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 379
		bodyModel[188] = new ModelRendererTurbo(this, 1513, 57, textureX, textureY); // Box 380
		bodyModel[189] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 381
		bodyModel[190] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 382
		bodyModel[191] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 383
		bodyModel[192] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 384
		bodyModel[193] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); // Box 393
		bodyModel[194] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 394
		bodyModel[195] = new ModelRendererTurbo(this, 1025, 41, textureX, textureY); // Box 395
		bodyModel[196] = new ModelRendererTurbo(this, 1609, 25, textureX, textureY); // Box 399
		bodyModel[197] = new ModelRendererTurbo(this, 1081, 41, textureX, textureY); // Box 400
		bodyModel[198] = new ModelRendererTurbo(this, 2009, 49, textureX, textureY); // Box 401
		bodyModel[199] = new ModelRendererTurbo(this, 1049, 57, textureX, textureY); // Box 402
		bodyModel[200] = new ModelRendererTurbo(this, 1057, 57, textureX, textureY); // Box 403
		bodyModel[201] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 404
		bodyModel[202] = new ModelRendererTurbo(this, 1105, 65, textureX, textureY); // Box 405
		bodyModel[203] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Box 406
		bodyModel[204] = new ModelRendererTurbo(this, 1945, 57, textureX, textureY); // Box 407
		bodyModel[205] = new ModelRendererTurbo(this, 1625, 73, textureX, textureY); // Box 408
		bodyModel[206] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 409
		bodyModel[207] = new ModelRendererTurbo(this, 1649, 73, textureX, textureY); // Box 410
		bodyModel[208] = new ModelRendererTurbo(this, 1745, 73, textureX, textureY); // Box 411
		bodyModel[209] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 412
		bodyModel[210] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 413
		bodyModel[211] = new ModelRendererTurbo(this, 937, 89, textureX, textureY); // Box 414
		bodyModel[212] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Box 415
		bodyModel[213] = new ModelRendererTurbo(this, 1561, 57, textureX, textureY); // Box 416
		bodyModel[214] = new ModelRendererTurbo(this, 1593, 57, textureX, textureY); // Box 417
		bodyModel[215] = new ModelRendererTurbo(this, 1969, 57, textureX, textureY); // Box 418
		bodyModel[216] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 419
		bodyModel[217] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 420
		bodyModel[218] = new ModelRendererTurbo(this, 2025, 65, textureX, textureY); // Box 421
		bodyModel[219] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 422
		bodyModel[220] = new ModelRendererTurbo(this, 1809, 73, textureX, textureY); // Box 423
		bodyModel[221] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 424
		bodyModel[222] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Box 425
		bodyModel[223] = new ModelRendererTurbo(this, 1025, 89, textureX, textureY); // Box 426
		bodyModel[224] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 484
		bodyModel[225] = new ModelRendererTurbo(this, 1113, 137, textureX, textureY); // Box 657
		bodyModel[226] = new ModelRendererTurbo(this, 873, 145, textureX, textureY); // Box 658
		bodyModel[227] = new ModelRendererTurbo(this, 2033, 129, textureX, textureY); // Box 659

		bodyModel[0].addShapeBox(0F, 0F, 0F, 29, 10, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(38F, -11F, -20F);

		bodyModel[1].addBox(0F, 0F, 0F, 97, 19, 40, 0F); // Box 1
		bodyModel[1].setRotationPoint(-59F, -20F, -20F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 8, 40, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(38F, -28F, -20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 29, 9, 40, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(38F, -20F, -20F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 19, 8, 11, 0F,0F, 0F, -4F, -9F, 0F, -4F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(38F, -28F, -31F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 8, 11, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(38F, -28F, 20F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 110, 13, 14, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, 0F, -6F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-72F, -28F, -34F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 110, 13, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -6F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -6F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-72F, -28F, 20F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 14, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-66F, -15F, -20F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 13, 13, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-72F, -28F, -20F);

		bodyModel[10].addBox(0F, 0F, 0F, 97, 8, 40, 0F); // Box 10
		bodyModel[10].setRotationPoint(-59F, -28F, -20F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 90, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-43F, 9F, -37F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 6, 16, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-60F, 4F, -37F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-62F, 2F, -37F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-64F, -1F, -37F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-65F, -4F, -37F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-65F, -7F, -37F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-65F, -10F, -37F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-62F, -11F, -37F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 94, 1, 16, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-59F, -12F, -37F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 17, 5, 16, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(35F, -16F, -37F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(52F, -16F, -37F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(59F, -16F, -37F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(64F, -10F, -37F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(63F, -6F, -37F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(61F, -3F, -37F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 10, 16, 0F,-16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(45F, 0F, -37F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-62F, -11F, 21F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(-65F, -10F, 21F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-65F, -7F, 21F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-65F, -4F, 21F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-64F, -1F, 21F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-62F, 2F, 21F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 17, 6, 16, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-60F, 4F, 21F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[34].setRotationPoint(52F, -16F, 21F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 94, 1, 16, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-59F, -12F, 21F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 17, 5, 16, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[36].setRotationPoint(35F, -16F, 21F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(59F, -16F, 21F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(64F, -10F, 21F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(63F, -6F, 21F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[40].setRotationPoint(61F, -3F, 21F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 90, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[41].setRotationPoint(-43F, 9F, 21F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 10, 16, 0F,-16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[42].setRotationPoint(45F, 0F, 21F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 122, 8, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[43].setRotationPoint(-66F, -21F, 30F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[44].setRotationPoint(56F, -21F, 30F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 5, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 48
		bodyModel[45].setRotationPoint(66F, -17F, 20F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 51
		bodyModel[46].setRotationPoint(64F, -19F, 20F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 52
		bodyModel[47].setRotationPoint(59F, -21F, 20F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[48].setRotationPoint(56F, -21F, 20F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 54
		bodyModel[49].setRotationPoint(64F, -19F, -30F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 5, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 55
		bodyModel[50].setRotationPoint(66F, -17F, -30F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 56
		bodyModel[51].setRotationPoint(59F, -21F, -30F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[52].setRotationPoint(56F, -21F, -30F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 58
		bodyModel[53].setRotationPoint(56F, -21F, -38F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 6, 8, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -5F, 0F); // Box 59
		bodyModel[54].setRotationPoint(59F, -21F, -38F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 7, 8, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -6F, 0F); // Box 60
		bodyModel[55].setRotationPoint(64F, -19F, -38F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 122, 8, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[56].setRotationPoint(-66F, -18F, 37F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 122, 8, 8, 0F,0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -2F, 0F); // Box 63
		bodyModel[57].setRotationPoint(-66F, -21F, -38F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 122, 8, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[58].setRotationPoint(-66F, -18F, -38F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 68
		bodyModel[59].setRotationPoint(64F, -16F, -38F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 69
		bodyModel[60].setRotationPoint(59F, -18F, -38F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 70
		bodyModel[61].setRotationPoint(56F, -18F, -38F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 9, 8, 0F,0F, -2F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -8F, 0F); // Box 71
		bodyModel[62].setRotationPoint(66F, -17F, -38F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 6, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 69
		bodyModel[63].setRotationPoint(59F, -21F, 30F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 70
		bodyModel[64].setRotationPoint(64F, -19F, 30F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 8, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -5F, 0F); // Box 71
		bodyModel[65].setRotationPoint(66F, -17F, 30F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 72
		bodyModel[66].setRotationPoint(64F, -16F, 37F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[67].setRotationPoint(59F, -18F, 37F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 74
		bodyModel[68].setRotationPoint(56F, -18F, 37F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 8, 15, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[69].setRotationPoint(-74F, -15F, 19F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 8, 15, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[70].setRotationPoint(-74F, -15F, -34F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 104, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 77
		bodyModel[71].setRotationPoint(-64F, -14F, 37F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[72].setRotationPoint(40F, -14F, 37F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 104, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[73].setRotationPoint(-64F, -14F, -38F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[74].setRotationPoint(40F, -14F, -38F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -4F, 0F); // Box 81
		bodyModel[75].setRotationPoint(66F, -16F, 20F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 82
		bodyModel[76].setRotationPoint(64F, -16F, 20F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 83
		bodyModel[77].setRotationPoint(59F, -18F, 20F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -4F, 0F); // Box 84
		bodyModel[78].setRotationPoint(66F, -16F, -21F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 85
		bodyModel[79].setRotationPoint(64F, -16F, -21F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[80].setRotationPoint(59F, -18F, -21F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[81].setRotationPoint(44.5F, -29F, -26.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[82].setRotationPoint(44.5F, -29F, -15.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[83].setRotationPoint(36F, -28.5F, -18.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 331
		bodyModel[84].setRotationPoint(31F, -28.5F, -18.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[85].setRotationPoint(37.5F, -29F, -17F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[86].setRotationPoint(40.5F, -30.5F, -19F);
		bodyModel[86].rotateAngleY = -0.31415927F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 334
		bodyModel[87].setRotationPoint(35.5F, -29F, -8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 335
		bodyModel[88].setRotationPoint(32.5F, -29.5F, -8.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[89].setRotationPoint(32.5F, -29F, -8.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[90].setRotationPoint(36F, -28.5F, 4.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 338
		bodyModel[91].setRotationPoint(31F, -28.5F, 4.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[92].setRotationPoint(37.5F, -29F, 16F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 340
		bodyModel[93].setRotationPoint(35.5F, -29F, 7.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341
		bodyModel[94].setRotationPoint(32.5F, -29.5F, 7.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[95].setRotationPoint(32.5F, -29F, 7.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, -1.5F, 0F, -2.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[96].setRotationPoint(44.5F, -29F, 13.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[97].setRotationPoint(23.5F, -29F, -25.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[98].setRotationPoint(29.5F, -29F, -26.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[99].setRotationPoint(35.5F, -29F, -26.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[100].setRotationPoint(21.5F, -29F, -26.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[101].setRotationPoint(21.5F, -29F, -23.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[102].setRotationPoint(23.5F, -29F, 23.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[103].setRotationPoint(25.5F, -29F, 24.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[104].setRotationPoint(35.5F, -29F, 23.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[105].setRotationPoint(26.5F, -29F, 23.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[106].setRotationPoint(23.5F, -29F, 22.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[107].setRotationPoint(42F, -30F, 7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[108].setRotationPoint(42F, -31F, 7.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[109].setRotationPoint(41F, -30F, 2.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[110].setRotationPoint(56F, -27.5F, -2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 360
		bodyModel[111].setRotationPoint(56F, -25.5F, -2F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 361
		bodyModel[112].setRotationPoint(56F, -26.5F, -2F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363
		bodyModel[113].setRotationPoint(56F, -24.5F, -1F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 365
		bodyModel[114].setRotationPoint(56F, -23.5F, -1.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 366
		bodyModel[115].setRotationPoint(54F, -22.5F, -2.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[116].setRotationPoint(55F, -22F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 368
		bodyModel[117].setRotationPoint(48F, -27F, -17F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[118].setRotationPoint(48F, -24F, -16F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[119].setRotationPoint(48F, -24F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 7, 3, 5, 0F); // Box 372
		bodyModel[120].setRotationPoint(48F, -24F, -15F);

		bodyModel[121].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 373
		bodyModel[121].setRotationPoint(52F, -22.5F, -14F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[122].setRotationPoint(-50.5F, -30F, 12.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 375
		bodyModel[123].setRotationPoint(-48.5F, -30F, 12.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 376
		bodyModel[124].setRotationPoint(-55.5F, -30F, 12.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 377
		bodyModel[125].setRotationPoint(-55.5F, -30F, -24.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[126].setRotationPoint(-50.5F, -30F, -24.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 379
		bodyModel[127].setRotationPoint(-48.5F, -30F, -24.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[128].setRotationPoint(-58.5F, -29F, 23.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 381
		bodyModel[129].setRotationPoint(-59.5F, -29F, 14.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[130].setRotationPoint(-57.5F, -29F, 14.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 18, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[131].setRotationPoint(-55.5F, -28.5F, -7.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[132].setRotationPoint(-53.5F, -29F, -10.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 322
		bodyModel[133].setRotationPoint(-54.5F, -30F, -3.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 323
		bodyModel[134].setRotationPoint(-50.5F, -30F, -3.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 324
		bodyModel[135].setRotationPoint(-51.5F, -30F, -3.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 325
		bodyModel[136].setRotationPoint(-41.5F, -30F, -3.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 326
		bodyModel[137].setRotationPoint(-40.5F, -30F, -3.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 327
		bodyModel[138].setRotationPoint(-44.5F, -30F, -3.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 328
		bodyModel[139].setRotationPoint(-62.5F, -29F, -2.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 329
		bodyModel[140].setRotationPoint(-59.5F, -29F, -2.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 330
		bodyModel[141].setRotationPoint(-60.5F, -29F, -2.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 331
		bodyModel[142].setRotationPoint(-62.5F, -30F, 3.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 332
		bodyModel[143].setRotationPoint(-66.5F, -30F, 3.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 333
		bodyModel[144].setRotationPoint(-64.5F, -30F, 3.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 334
		bodyModel[145].setRotationPoint(-64.5F, -30F, -9.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 335
		bodyModel[146].setRotationPoint(-62.5F, -30F, -9.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 336
		bodyModel[147].setRotationPoint(-66.5F, -30F, -9.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[148].setRotationPoint(-58.5F, -30F, -21.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 338
		bodyModel[149].setRotationPoint(-58.5F, -30F, -14.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[150].setRotationPoint(-59.5F, -31F, -19.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 24, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[151].setRotationPoint(-36.5F, -25F, 28.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 24, 4, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[152].setRotationPoint(-36.5F, -25F, -31.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 25, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 345
		bodyModel[153].setRotationPoint(-12.5F, -23F, 28.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[154].setRotationPoint(-12.5F, -26F, 26.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 25, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[155].setRotationPoint(-12.5F, -23F, -31.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[156].setRotationPoint(-12.5F, -26F, -29.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 349
		bodyModel[157].setRotationPoint(12.5F, -24F, 28.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[158].setRotationPoint(15.5F, -24F, 28.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[159].setRotationPoint(15.5F, -24F, -30.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 352
		bodyModel[160].setRotationPoint(12.5F, -24F, -30.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[161].setRotationPoint(1.5F, -27F, -29.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 354
		bodyModel[162].setRotationPoint(-1.5F, -27F, -29.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[163].setRotationPoint(1.5F, -27F, 27.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 356
		bodyModel[164].setRotationPoint(-1.5F, -27F, 27.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 2, 7, 0F); // Box 357
		bodyModel[165].setRotationPoint(32.5F, -30F, -3.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 358
		bodyModel[166].setRotationPoint(33.5F, -30F, -3.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 359
		bodyModel[167].setRotationPoint(29.5F, -30F, -3.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[168].setRotationPoint(-32.5F, -25F, 29.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[169].setRotationPoint(-16.5F, -25F, 29.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[170].setRotationPoint(-32.5F, -25F, -32.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[171].setRotationPoint(-16.5F, -25F, -32.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[172].setRotationPoint(21.5F, -26F, 27.5F);
		bodyModel[172].rotateAngleX = 0.38397244F;

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[173].setRotationPoint(38.5F, -27.5F, 27F);
		bodyModel[173].rotateAngleX = 0.38397244F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 366
		bodyModel[174].setRotationPoint(-67F, -13F, 18F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 367
		bodyModel[175].setRotationPoint(-68F, -13F, 18F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 368
		bodyModel[176].setRotationPoint(-68F, -13F, -19F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 8, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 369
		bodyModel[177].setRotationPoint(-67F, -13F, -19F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 370
		bodyModel[178].setRotationPoint(-64F, -10F, 11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 371
		bodyModel[179].setRotationPoint(-64F, -10F, -17F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 372
		bodyModel[180].setRotationPoint(-65F, -9.5F, 5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 373
		bodyModel[181].setRotationPoint(-63F, -7.5F, 5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 374
		bodyModel[182].setRotationPoint(-64F, -8.5F, 5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 6, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 375
		bodyModel[183].setRotationPoint(-69F, -19F, 11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 6, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 376
		bodyModel[184].setRotationPoint(-69F, -19F, 3F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, -1F); // Box 377
		bodyModel[185].setRotationPoint(-72F, -19F, 11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, -1F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F); // Box 378
		bodyModel[186].setRotationPoint(-72F, -19F, 3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -1F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, -1F, -3F, -3F, 0F, 0F, 4F, 0F, -2F, 4F, 0F, 0F, -3F, 0F, -3F); // Box 379
		bodyModel[187].setRotationPoint(-75F, -18F, 9F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -1F, -3F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, -1F, 0F, -3F, 0F, -3F, 4F, 0F, 0F, 4F, 0F, -2F, -3F, 0F, 0F); // Box 380
		bodyModel[188].setRotationPoint(-75F, -18F, 4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F); // Box 381
		bodyModel[189].setRotationPoint(-75F, -17F, 5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 10, 3, 0F,0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F); // Box 382
		bodyModel[190].setRotationPoint(-77F, -26F, 6.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 10, 3, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 383
		bodyModel[191].setRotationPoint(-76F, -26F, 6.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 10, 3, 0F,0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F); // Box 384
		bodyModel[192].setRotationPoint(-75F, -26F, 6.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F); // Box 393
		bodyModel[193].setRotationPoint(-77F, -28F, 6.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F); // Box 394
		bodyModel[194].setRotationPoint(-79F, -28F, 6.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 395
		bodyModel[195].setRotationPoint(-78F, -28F, 6.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 399
		bodyModel[196].setRotationPoint(-77F, -29F, 6.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[197].setRotationPoint(-80F, -28F, 6.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 401
		bodyModel[198].setRotationPoint(-80F, -27F, 6.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[199].setRotationPoint(-80F, -29F, 6.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[200].setRotationPoint(-65F, -11F, 5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[201].setRotationPoint(-69F, -11F, 5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 405
		bodyModel[202].setRotationPoint(-72F, -11F, 5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 7, 6, 0F,0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F); // Box 406
		bodyModel[203].setRotationPoint(-75F, -17F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -1F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, -1F, -3F, -3F, 0F, 0F, 4F, 0F, -2F, 4F, 0F, 0F, -3F, 0F, -3F); // Box 407
		bodyModel[204].setRotationPoint(-75F, -18F, -7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, -1F); // Box 408
		bodyModel[205].setRotationPoint(-72F, -19F, -5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 6, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 409
		bodyModel[206].setRotationPoint(-69F, -19F, -5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -1F, -3F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, -1F, 0F, -3F, 0F, -3F, 4F, 0F, 0F, 4F, 0F, -2F, -3F, 0F, 0F); // Box 410
		bodyModel[207].setRotationPoint(-75F, -18F, -12F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, -1F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F); // Box 411
		bodyModel[208].setRotationPoint(-72F, -19F, -13F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 6, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 412
		bodyModel[209].setRotationPoint(-69F, -19F, -13F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 10, 3, 0F,0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F); // Box 413
		bodyModel[210].setRotationPoint(-77F, -26F, -9.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 5, 10, 3, 0F,0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F); // Box 414
		bodyModel[211].setRotationPoint(-75F, -26F, -9.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 10, 3, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 415
		bodyModel[212].setRotationPoint(-76F, -26F, -9.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F); // Box 416
		bodyModel[213].setRotationPoint(-77F, -28F, -9.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 417
		bodyModel[214].setRotationPoint(-78F, -28F, -9.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F); // Box 418
		bodyModel[215].setRotationPoint(-79F, -28F, -9.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 419
		bodyModel[216].setRotationPoint(-80F, -27F, -9.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[217].setRotationPoint(-80F, -28F, -9.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[218].setRotationPoint(-80F, -29F, -9.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 422
		bodyModel[219].setRotationPoint(-72F, -11F, -11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[220].setRotationPoint(-69F, -11F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[221].setRotationPoint(-65F, -11F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 5, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 425
		bodyModel[222].setRotationPoint(-64F, -10F, -5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 7, 8, 8, 0F,-1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 426
		bodyModel[223].setRotationPoint(-74F, -26.5F, -24F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 484
		bodyModel[224].setRotationPoint(-77F, -29F, -9.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 10, 1, 11, 0F); // Box 657
		bodyModel[225].setRotationPoint(-70.5F, -28.5F, 14.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 10, 1, 11, 0F); // Box 658
		bodyModel[226].setRotationPoint(-70.5F, -28.5F, -25.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 40, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		bodyModel[227].setRotationPoint(-60.5F, -67F, -25.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1409, 57, textureX, textureY); // Box 206
		turretModel[1] = new ModelRendererTurbo(this, 1849, 49, textureX, textureY); // Box 208
		turretModel[2] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 209
		turretModel[3] = new ModelRendererTurbo(this, 1561, 73, textureX, textureY); // Box 210
		turretModel[4] = new ModelRendererTurbo(this, 1681, 73, textureX, textureY); // Box 211
		turretModel[5] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 212
		turretModel[6] = new ModelRendererTurbo(this, 1913, 73, textureX, textureY); // Box 213
		turretModel[7] = new ModelRendererTurbo(this, 1513, 57, textureX, textureY); // Box 214
		turretModel[8] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 215
		turretModel[9] = new ModelRendererTurbo(this, 1825, 49, textureX, textureY); // Box 216
		turretModel[10] = new ModelRendererTurbo(this, 1561, 57, textureX, textureY); // Box 218
		turretModel[11] = new ModelRendererTurbo(this, 1913, 57, textureX, textureY); // Box 219
		turretModel[12] = new ModelRendererTurbo(this, 1817, 17, textureX, textureY); // Box 220
		turretModel[13] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 221
		turretModel[14] = new ModelRendererTurbo(this, 1865, 17, textureX, textureY); // Box 222
		turretModel[15] = new ModelRendererTurbo(this, 1289, 25, textureX, textureY); // Box 223
		turretModel[16] = new ModelRendererTurbo(this, 2001, 57, textureX, textureY); // Box 224
		turretModel[17] = new ModelRendererTurbo(this, 1337, 73, textureX, textureY); // Box 225
		turretModel[18] = new ModelRendererTurbo(this, 1625, 73, textureX, textureY); // Box 226
		turretModel[19] = new ModelRendererTurbo(this, 1897, 25, textureX, textureY); // Box 227
		turretModel[20] = new ModelRendererTurbo(this, 1201, 1, textureX, textureY); // Box 228
		turretModel[21] = new ModelRendererTurbo(this, 1337, 1, textureX, textureY); // Box 229
		turretModel[22] = new ModelRendererTurbo(this, 1345, 17, textureX, textureY); // Box 230
		turretModel[23] = new ModelRendererTurbo(this, 1569, 1, textureX, textureY); // Box 231
		turretModel[24] = new ModelRendererTurbo(this, 1785, 1, textureX, textureY); // Box 232
		turretModel[25] = new ModelRendererTurbo(this, 1969, 25, textureX, textureY); // Box 233
		turretModel[26] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Box 234
		turretModel[27] = new ModelRendererTurbo(this, 1881, 1, textureX, textureY); // Box 235
		turretModel[28] = new ModelRendererTurbo(this, 2017, 25, textureX, textureY); // Box 237
		turretModel[29] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 238
		turretModel[30] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 239
		turretModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 240
		turretModel[32] = new ModelRendererTurbo(this, 1817, 1, textureX, textureY); // Box 243
		turretModel[33] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 244
		turretModel[34] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 245
		turretModel[35] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 246
		turretModel[36] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 247
		turretModel[37] = new ModelRendererTurbo(this, 1361, 17, textureX, textureY); // Box 427
		turretModel[38] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 428
		turretModel[39] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 429
		turretModel[40] = new ModelRendererTurbo(this, 1057, 89, textureX, textureY); // Box 430
		turretModel[41] = new ModelRendererTurbo(this, 1113, 89, textureX, textureY); // Box 431
		turretModel[42] = new ModelRendererTurbo(this, 1169, 89, textureX, textureY); // Box 432
		turretModel[43] = new ModelRendererTurbo(this, 1225, 89, textureX, textureY); // Box 433
		turretModel[44] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 434
		turretModel[45] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 435
		turretModel[46] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 436
		turretModel[47] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 437
		turretModel[48] = new ModelRendererTurbo(this, 1281, 89, textureX, textureY); // Box 438
		turretModel[49] = new ModelRendererTurbo(this, 2033, 9, textureX, textureY); // Box 439
		turretModel[50] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 440
		turretModel[51] = new ModelRendererTurbo(this, 1233, 33, textureX, textureY); // Box 441
		turretModel[52] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 442
		turretModel[53] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 443
		turretModel[54] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 444
		turretModel[55] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 445
		turretModel[56] = new ModelRendererTurbo(this, 1777, 89, textureX, textureY); // Box 446
		turretModel[57] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 447
		turretModel[58] = new ModelRendererTurbo(this, 1249, 25, textureX, textureY); // Box 448
		turretModel[59] = new ModelRendererTurbo(this, 1289, 25, textureX, textureY); // Box 449
		turretModel[60] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 450
		turretModel[61] = new ModelRendererTurbo(this, 1121, 65, textureX, textureY); // Box 451
		turretModel[62] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 452
		turretModel[63] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 453
		turretModel[64] = new ModelRendererTurbo(this, 1177, 25, textureX, textureY); // Box 454
		turretModel[65] = new ModelRendererTurbo(this, 1305, 25, textureX, textureY); // Box 455
		turretModel[66] = new ModelRendererTurbo(this, 1361, 25, textureX, textureY); // Box 456
		turretModel[67] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 457
		turretModel[68] = new ModelRendererTurbo(this, 1209, 17, textureX, textureY); // Box 458
		turretModel[69] = new ModelRendererTurbo(this, 1049, 89, textureX, textureY); // Box 459
		turretModel[70] = new ModelRendererTurbo(this, 1593, 89, textureX, textureY); // Box 460
		turretModel[71] = new ModelRendererTurbo(this, 1697, 89, textureX, textureY); // Box 461
		turretModel[72] = new ModelRendererTurbo(this, 1881, 89, textureX, textureY); // Box 462
		turretModel[73] = new ModelRendererTurbo(this, 1105, 89, textureX, textureY); // Box 463
		turretModel[74] = new ModelRendererTurbo(this, 1777, 17, textureX, textureY); // Box 464
		turretModel[75] = new ModelRendererTurbo(this, 1161, 89, textureX, textureY); // Box 465
		turretModel[76] = new ModelRendererTurbo(this, 1769, 73, textureX, textureY); // Box 466
		turretModel[77] = new ModelRendererTurbo(this, 1569, 25, textureX, textureY); // Box 467
		turretModel[78] = new ModelRendererTurbo(this, 1841, 25, textureX, textureY); // Box 468

		turretModel[0].addShapeBox(1F, 0F, -25F, 25, 20, 50, 0F,0F, 0F, -7F, -4F, -5F, -14F, -4F, -5F, -14F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 206
		turretModel[0].setRotationPoint(0F, -48F, 0F);

		turretModel[1].addShapeBox(-4F, 0F, -26F, 5, 21, 52, 0F,0F, 0F, -7F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 208
		turretModel[1].setRotationPoint(0F, -49F, 0F);

		turretModel[2].addShapeBox(-10F, 0F, -26F, 6, 21, 52, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		turretModel[2].setRotationPoint(0F, -49F, 0F);

		turretModel[3].addShapeBox(-15F, 0F, -26F, 5, 21, 52, 0F,0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		turretModel[3].setRotationPoint(0F, -49F, 0F);

		turretModel[4].addShapeBox(-20F, 0F, -26F, 5, 20, 52, 0F,0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 211
		turretModel[4].setRotationPoint(0F, -48F, 0F);

		turretModel[5].addShapeBox(-47F, 0F, -25F, 27, 17, 50, 0F,-6F, -2F, -13F, 0F, 0F, -7F, 0F, 0F, -7F, -6F, -2F, -13F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -9F); // Box 212
		turretModel[5].setRotationPoint(0F, -48F, 0F);

		turretModel[6].addShapeBox(-35F, 0F, -26F, 15, 3, 52, 0F,0F, 0F, -20F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -20F); // Box 213
		turretModel[6].setRotationPoint(0F, -31F, 0F);

		turretModel[7].addShapeBox(-48F, 0F, -6F, 8, 11, 12, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		turretModel[7].setRotationPoint(0F, -44F, 0F);

		turretModel[8].addShapeBox(-48F, 0F, -14F, 2, 1, 27, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		turretModel[8].setRotationPoint(0F, -34F, 0F);

		turretModel[9].addShapeBox(-48F, 0F, -14F, 2, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 216
		turretModel[9].setRotationPoint(0F, -33F, 0F);

		turretModel[10].addShapeBox(-11F, 0F, 0F, 5, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		turretModel[10].setRotationPoint(0F, -50F, 0F);

		turretModel[11].addShapeBox(-15F, 0F, 0F, 4, 2, 17, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 219
		turretModel[11].setRotationPoint(0F, -50F, 0F);

		turretModel[12].addShapeBox(-17F, 0F, 4F, 2, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 220
		turretModel[12].setRotationPoint(0F, -50F, 0F);

		turretModel[13].addShapeBox(-6F, 0F, 0F, 4, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 221
		turretModel[13].setRotationPoint(0F, -50F, 0F);

		turretModel[14].addShapeBox(-2F, 0F, 4F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 222
		turretModel[14].setRotationPoint(0F, -50F, 0F);

		turretModel[15].addShapeBox(-3F, 0F, 5F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 223
		turretModel[15].setRotationPoint(0F, -51F, 0F);

		turretModel[16].addShapeBox(-7F, 0F, 1F, 4, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 224
		turretModel[16].setRotationPoint(0F, -51F, 0F);

		turretModel[17].addShapeBox(-10F, 0F, 1F, 3, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		turretModel[17].setRotationPoint(0F, -51F, 0F);

		turretModel[18].addShapeBox(-14F, 0F, 1F, 4, 1, 15, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 226
		turretModel[18].setRotationPoint(0F, -51F, 0F);

		turretModel[19].addShapeBox(-16F, 0F, 5F, 2, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 227
		turretModel[19].setRotationPoint(0F, -51F, 0F);

		turretModel[20].addShapeBox(-1F, 0F, 7F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		turretModel[20].setRotationPoint(0F, -52F, 0F);

		turretModel[21].addShapeBox(-3F, 0F, 10F, 3, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 229
		turretModel[21].setRotationPoint(0F, -52F, 0F);

		turretModel[22].addShapeBox(-7F, 0F, 12F, 5, 1, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 230
		turretModel[22].setRotationPoint(0F, -52F, 0F);

		turretModel[23].addShapeBox(-11F, 0F, 16F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 231
		turretModel[23].setRotationPoint(0F, -52F, 0F);

		turretModel[24].addShapeBox(-11F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		turretModel[24].setRotationPoint(0F, -52F, 0F);

		turretModel[25].addShapeBox(-15F, 0F, 1F, 5, 1, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 233
		turretModel[25].setRotationPoint(0F, -52F, 0F);

		turretModel[26].addShapeBox(-17F, 0F, 7F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		turretModel[26].setRotationPoint(0F, -52F, 0F);

		turretModel[27].addShapeBox(-3F, 0F, 5F, 3, 1, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 235
		turretModel[27].setRotationPoint(0F, -52F, 0F);

		turretModel[28].addShapeBox(-7F, 0F, 1F, 5, 1, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 237
		turretModel[28].setRotationPoint(0F, -52F, 0F);

		turretModel[29].addShapeBox(-15F, 0F, 12F, 5, 1, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 238
		turretModel[29].setRotationPoint(0F, -52F, 0F);

		turretModel[30].addShapeBox(-17F, 0F, 10F, 3, 1, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 239
		turretModel[30].setRotationPoint(0F, -52F, 0F);

		turretModel[31].addShapeBox(-17F, 0F, 5F, 3, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 240
		turretModel[31].setRotationPoint(0F, -52F, 0F);

		turretModel[32].addBox(-10F, 0F, 1F, 3, 1, 1, 0F); // Box 243
		turretModel[32].setRotationPoint(0F, -51.5F, 0F);

		turretModel[33].addBox(-10F, 0F, 15F, 3, 1, 1, 0F); // Box 244
		turretModel[33].setRotationPoint(0F, -51.5F, 0F);

		turretModel[34].addShapeBox(-2F, 0F, 7F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		turretModel[34].setRotationPoint(0F, -51.5F, 0F);

		turretModel[35].addShapeBox(-16F, 0F, 7F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		turretModel[35].setRotationPoint(0F, -51.5F, 0F);

		turretModel[36].addShapeBox(-10F, 0F, 8F, 4, 2, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 247
		turretModel[36].setRotationPoint(0F, -52.5F, 0F);

		turretModel[37].addShapeBox(-45F, 0F, -1.5F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F); // Box 427
		turretModel[37].setRotationPoint(0F, -43.5F, 0F);

		turretModel[38].addShapeBox(-45F, 0F, 0.5F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F); // Box 428
		turretModel[38].setRotationPoint(0F, -43.5F, 0F);

		turretModel[39].addShapeBox(-45F, 0F, -1.5F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 429
		turretModel[39].setRotationPoint(0F, -43.5F, 0F);

		turretModel[40].addShapeBox(6F, 0F, 10.5F, 16, 7, 8, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 2F); // Box 430
		turretModel[40].setRotationPoint(0F, -44F, 0F);

		turretModel[41].addShapeBox(6F, 0F, 13.5F, 16, 7, 8, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 2F); // Box 431
		turretModel[41].setRotationPoint(0F, -36F, 0F);

		turretModel[42].addShapeBox(6F, 0F, -18.5F, 16, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 432
		turretModel[42].setRotationPoint(0F, -44F, 0F);

		turretModel[43].addShapeBox(6F, 0F, -21.5F, 16, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 433
		turretModel[43].setRotationPoint(0F, -36F, 0F);

		turretModel[44].addShapeBox(-42F, 0F, -20.5F, 16, 7, 8, 0F,0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -2F); // Box 434
		turretModel[44].setRotationPoint(0F, -47F, 0F);

		turretModel[45].addShapeBox(-42F, 0F, -23.5F, 16, 7, 8, 0F,0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -2F); // Box 435
		turretModel[45].setRotationPoint(0F, -39F, 0F);

		turretModel[46].addShapeBox(-42F, 0F, 13.5F, 16, 7, 8, 0F,0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F); // Box 436
		turretModel[46].setRotationPoint(0F, -47F, 0F);

		turretModel[47].addShapeBox(-42F, 0F, 16.5F, 16, 7, 8, 0F,0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F); // Box 437
		turretModel[47].setRotationPoint(0F, -39F, 0F);

		turretModel[48].addShapeBox(5F, 0F, -12F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		turretModel[48].setRotationPoint(0F, -49F, 0F);

		turretModel[49].addShapeBox(5F, 0F, 8F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		turretModel[49].setRotationPoint(0F, -49F, 0F);

		turretModel[50].addShapeBox(16F, 0F, 8F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		turretModel[50].setRotationPoint(0F, -46F, 0F);

		turretModel[51].addShapeBox(16F, 0F, 8F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		turretModel[51].setRotationPoint(0F, -47F, 0F);

		turretModel[52].addShapeBox(18F, 0F, 8F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		turretModel[52].setRotationPoint(0F, -46F, 0F);

		turretModel[53].addShapeBox(16F, 0F, -10F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		turretModel[53].setRotationPoint(0F, -47F, 0F);

		turretModel[54].addShapeBox(16F, 0F, -10F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		turretModel[54].setRotationPoint(0F, -46F, 0F);

		turretModel[55].addShapeBox(18F, 0F, -10F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		turretModel[55].setRotationPoint(0F, -46F, 0F);

		turretModel[56].addShapeBox(-18F, 0F, -17F, 8, 1, 11, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		turretModel[56].setRotationPoint(0F, -50F, 0F);

		turretModel[57].addBox(-18F, 0F, -17F, 8, 1, 11, 0F); // Box 447
		turretModel[57].setRotationPoint(0F, -49F, 0F);

		turretModel[58].addShapeBox(-11F, 0F, -14F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		turretModel[58].setRotationPoint(0F, -49.5F, 0F);

		turretModel[59].addShapeBox(-11F, 0F, -9F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		turretModel[59].setRotationPoint(0F, -49.5F, 0F);

		turretModel[60].addShapeBox(-9F, 0F, -10F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		turretModel[60].setRotationPoint(0F, -49.5F, 0F);

		turretModel[61].addShapeBox(-9F, 0F, -15F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		turretModel[61].setRotationPoint(0F, -49.5F, 0F);

		turretModel[62].addShapeBox(-8F, 0F, -17F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		turretModel[62].setRotationPoint(0F, -49.5F, 0F);

		turretModel[63].addShapeBox(-40F, 0F, -1F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		turretModel[63].setRotationPoint(0F, -48F, 0F);

		turretModel[64].addShapeBox(-38F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		turretModel[64].setRotationPoint(0F, -47F, 0F);

		turretModel[65].addShapeBox(-40F, 0F, -1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		turretModel[65].setRotationPoint(0F, -47F, 0F);

		turretModel[66].addShapeBox(-29.5F, 0F, 7.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		turretModel[66].setRotationPoint(0F, -49F, 0F);

		turretModel[67].addShapeBox(-4F, 0F, -16F, 2, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 457
		turretModel[67].setRotationPoint(0F, -50F, 0F);

		turretModel[68].addShapeBox(-2F, 0F, -16F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		turretModel[68].setRotationPoint(0F, -50F, 0F);

		turretModel[69].addShapeBox(-1F, 0F, -16F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 459
		turretModel[69].setRotationPoint(0F, -50F, 0F);

		turretModel[70].addShapeBox(-8F, 0F, -7F, 2, 2, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 460
		turretModel[70].setRotationPoint(0F, -50F, 0F);

		turretModel[71].addBox(-6F, 0F, -7F, 2, 2, 6, 0F); // Box 461
		turretModel[71].setRotationPoint(0F, -50F, 0F);

		turretModel[72].addShapeBox(-4F, 0F, -7F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 462
		turretModel[72].setRotationPoint(0F, -50F, 0F);

		turretModel[73].addShapeBox(-25F, 0F, -3F, 2, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 463
		turretModel[73].setRotationPoint(0F, -49F, 0F);

		turretModel[74].addShapeBox(-23F, 0F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		turretModel[74].setRotationPoint(0F, -49F, 0F);

		turretModel[75].addShapeBox(-22F, 0F, -3F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 465
		turretModel[75].setRotationPoint(0F, -49F, 0F);

		turretModel[76].addShapeBox(-24F, 0F, 2.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		turretModel[76].setRotationPoint(0F, -48.5F, 0F);

		turretModel[77].addShapeBox(-24F, 0F, 3.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		turretModel[77].setRotationPoint(0F, -48.5F, 0F);

		turretModel[78].addShapeBox(-22F, 0F, 3.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		turretModel[78].setRotationPoint(0F, -48.5F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1665, 73, textureX, textureY); // Box 248
		barrelModel[1] = new ModelRendererTurbo(this, 1745, 73, textureX, textureY); // Box 249
		barrelModel[2] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 250
		barrelModel[3] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 251
		barrelModel[4] = new ModelRendererTurbo(this, 1689, 73, textureX, textureY); // Box 252
		barrelModel[5] = new ModelRendererTurbo(this, 1769, 73, textureX, textureY); // Box 253
		barrelModel[6] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 254
		barrelModel[7] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 255
		barrelModel[8] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 304
		barrelModel[9] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 305
		barrelModel[10] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 306
		barrelModel[11] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 307
		barrelModel[12] = new ModelRendererTurbo(this, 1081, 33, textureX, textureY); // Box 308
		barrelModel[13] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 309
		barrelModel[14] = new ModelRendererTurbo(this, 1137, 81, textureX, textureY); // Box 310
		barrelModel[15] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 311
		barrelModel[16] = new ModelRendererTurbo(this, 1801, 49, textureX, textureY); // Box 312
		barrelModel[17] = new ModelRendererTurbo(this, 1881, 49, textureX, textureY); // Box 313
		barrelModel[18] = new ModelRendererTurbo(this, 1993, 49, textureX, textureY); // Box 314
		barrelModel[19] = new ModelRendererTurbo(this, 1985, 25, textureX, textureY); // Box 340
		barrelModel[20] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 341
		barrelModel[21] = new ModelRendererTurbo(this, 2033, 25, textureX, textureY); // Box 342
		barrelModel[22] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 660
		barrelModel[23] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 661
		barrelModel[24] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 662
		barrelModel[25] = new ModelRendererTurbo(this, 721, 105, textureX, textureY); // Box 663
		barrelModel[26] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Box 664

		barrelModel[0].addShapeBox(1F, -3F, 0F, 3, 4, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		barrelModel[0].setRotationPoint(24F, -37F, -9F);

		barrelModel[1].addShapeBox(1F, 1F, 0F, 3, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 249
		barrelModel[1].setRotationPoint(24F, -37F, -9F);

		barrelModel[2].addShapeBox(1F, -5F, 2F, 3, 2, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		barrelModel[2].setRotationPoint(24F, -37F, -9F);

		barrelModel[3].addShapeBox(1F, 5F, 2F, 3, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 251
		barrelModel[3].setRotationPoint(24F, -37F, -9F);

		barrelModel[4].addShapeBox(4F, -3F, 4F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 252
		barrelModel[4].setRotationPoint(24F, -37F, -9F);

		barrelModel[5].addShapeBox(4F, -2F, 2F, 14, 3, 11, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 253
		barrelModel[5].setRotationPoint(24F, -37F, -9F);

		barrelModel[6].addShapeBox(4F, 1F, 2F, 14, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 254
		barrelModel[6].setRotationPoint(24F, -37F, -9F);

		barrelModel[7].addShapeBox(4F, 4F, 4F, 14, 1, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 255
		barrelModel[7].setRotationPoint(24F, -37F, -9F);

		barrelModel[8].addShapeBox(-1F, -1.5F, 5F, 8, 1, 5, 0F,0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 304
		barrelModel[8].setRotationPoint(24F, -37F, -9F);

		barrelModel[9].addShapeBox(-1F, -0.5F, 4.5F, 8, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 305
		barrelModel[9].setRotationPoint(24F, -37F, -9F);

		barrelModel[10].addShapeBox(-1F, 0.5F, 4.5F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 306
		barrelModel[10].setRotationPoint(24F, -37F, -9F);

		barrelModel[11].addShapeBox(-1F, 2.5F, 4.5F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 307
		barrelModel[11].setRotationPoint(24F, -38F, -9F);

		barrelModel[12].addShapeBox(-1F, 3.5F, 5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F); // Box 308
		barrelModel[12].setRotationPoint(24F, -38F, -9F);

		barrelModel[13].addShapeBox(18F, -1F, 5.5F, 88, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		barrelModel[13].setRotationPoint(24F, -37F, -9F);

		barrelModel[14].addShapeBox(18F, 0F, 5.5F, 88, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		barrelModel[14].setRotationPoint(24F, -37F, -9F);

		barrelModel[15].addShapeBox(18F, 2F, 5.5F, 88, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 311
		barrelModel[15].setRotationPoint(24F, -37F, -9F);

		barrelModel[16].addShapeBox(106F, 0F, 4.5F, 2, 2, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 312
		barrelModel[16].setRotationPoint(24F, -37F, -9F);

		barrelModel[17].addShapeBox(106F, -2F, 4.5F, 2, 2, 6, 0F,0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 313
		barrelModel[17].setRotationPoint(24F, -37F, -9F);

		barrelModel[18].addShapeBox(106F, 2F, 4.5F, 2, 2, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F); // Box 314
		barrelModel[18].setRotationPoint(24F, -37F, -9F);

		barrelModel[19].addShapeBox(112F, -2F, 4.5F, 1, 2, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		barrelModel[19].setRotationPoint(24F, -37F, -9F);

		barrelModel[20].addShapeBox(112F, 0F, 4.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		barrelModel[20].setRotationPoint(24F, -37F, -9F);

		barrelModel[21].addShapeBox(112F, 2F, 4.5F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 342
		barrelModel[21].setRotationPoint(24F, -37F, -9F);

		barrelModel[22].addShapeBox(108F, -2F, 4.5F, 4, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		barrelModel[22].setRotationPoint(24F, -37F, -9F);

		barrelModel[23].addShapeBox(108F, -2F, 8.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		barrelModel[23].setRotationPoint(24F, -37F, -9F);

		barrelModel[24].addShapeBox(108F, 2F, 8.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 662
		barrelModel[24].setRotationPoint(24F, -37F, -9F);

		barrelModel[25].addShapeBox(108F, 2F, 4.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 663
		barrelModel[25].setRotationPoint(24F, -37F, -9F);

		barrelModel[26].addShapeBox(112F, 0F, 8.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		barrelModel[26].setRotationPoint(24F, -37F, -9F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 1025, 113, textureX, textureY); // Box 576
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 1625, 113, textureX, textureY); // Box 577
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 2001, 113, textureX, textureY); // Box 578
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 579
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 580
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 1233, 113, textureX, textureY); // Box 581

		rightBackWheelModel[0].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		rightBackWheelModel[0].setRotationPoint(29.5F, 1F, -21F);

		rightBackWheelModel[1].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		rightBackWheelModel[1].setRotationPoint(29.5F, 1F, -21F);

		rightBackWheelModel[2].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		rightBackWheelModel[2].setRotationPoint(29.5F, 1F, -21F);

		rightBackWheelModel[3].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 579
		rightBackWheelModel[3].setRotationPoint(29.5F, 1F, -21F);

		rightBackWheelModel[4].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 580
		rightBackWheelModel[4].setRotationPoint(29.5F, 1F, -21F);

		rightBackWheelModel[5].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 581
		rightBackWheelModel[5].setRotationPoint(29.5F, 1F, -21F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Box 114
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Box 115
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 1289, 1, textureX, textureY); // Box 116
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 117
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 118
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 1177, 25, textureX, textureY); // Box 119
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 1569, 25, textureX, textureY); // Box 120
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 121
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 1225, 25, textureX, textureY); // Box 125
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 482
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 483
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 484
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 485
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Box 486
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 487
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 785, 97, textureX, textureY); // Box 488
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Box 489
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 490
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 1297, 97, textureX, textureY); // Box 491
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 1337, 97, textureX, textureY); // Box 492
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 1385, 97, textureX, textureY); // Box 493
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 1513, 97, textureX, textureY); // Box 494
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 495
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 496
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Box 497
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 1825, 73, textureX, textureY); // Box 498
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 1553, 97, textureX, textureY); // Box 499
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 1625, 97, textureX, textureY); // Box 500
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 2001, 97, textureX, textureY); // Box 501
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 502
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 503
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 1665, 97, textureX, textureY); // Box 504
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 1841, 73, textureX, textureY); // Box 505
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 1337, 81, textureX, textureY); // Box 506
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 1857, 73, textureX, textureY); // Box 507
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 1745, 97, textureX, textureY); // Box 508
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 509
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Box 510
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 729, 105, textureX, textureY); // Box 511
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 873, 105, textureX, textureY); // Box 512
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 1817, 97, textureX, textureY); // Box 513
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 1873, 73, textureX, textureY); // Box 514
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 1361, 81, textureX, textureY); // Box 515
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 1409, 81, textureX, textureY); // Box 516
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Box 517
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 518
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 1057, 105, textureX, textureY); // Box 519
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 1105, 105, textureX, textureY); // Box 520
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 1153, 105, textureX, textureY); // Box 521
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 1193, 105, textureX, textureY); // Box 522
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 1513, 81, textureX, textureY); // Box 523
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 1553, 81, textureX, textureY); // Box 524
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 1593, 81, textureX, textureY); // Box 525
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 1225, 105, textureX, textureY); // Box 526
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 1257, 105, textureX, textureY); // Box 527
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 1561, 105, textureX, textureY); // Box 528
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 1665, 105, textureX, textureY); // Box 529
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 1745, 105, textureX, textureY); // Box 530
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 1785, 105, textureX, textureY); // Box 531
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 1769, 81, textureX, textureY); // Box 532
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 533
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 1809, 81, textureX, textureY); // Box 534
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 1817, 105, textureX, textureY); // Box 535
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 536
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 537
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 538
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 539
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 540
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 541
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 542
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 543
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 544
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 545
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 546
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 547
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Box 548
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 549
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 550
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 1217, 89, textureX, textureY); // Box 551
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Box 552
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 569, 113, textureX, textureY); // Box 553
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 554
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 977, 113, textureX, textureY); // Box 555
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 1185, 113, textureX, textureY); // Box 556
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 1289, 113, textureX, textureY); // Box 557
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 1353, 113, textureX, textureY); // Box 558
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 1801, 113, textureX, textureY); // Box 559
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 561
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 562
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 563
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 564

		leftTrackWheelModels[0].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftTrackWheelModels[0].setRotationPoint(40F, 1F, 32F);

		leftTrackWheelModels[1].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 115
		leftTrackWheelModels[1].setRotationPoint(40F, 1F, 32F);

		leftTrackWheelModels[2].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 116
		leftTrackWheelModels[2].setRotationPoint(40F, 1F, 32F);

		leftTrackWheelModels[3].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftTrackWheelModels[3].setRotationPoint(40F, 1F, 32F);

		leftTrackWheelModels[4].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		leftTrackWheelModels[4].setRotationPoint(40F, 1F, 32F);

		leftTrackWheelModels[5].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftTrackWheelModels[5].setRotationPoint(40F, 1F, 32F);

		leftTrackWheelModels[6].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 120
		leftTrackWheelModels[6].setRotationPoint(40F, 1F, 32F);

		leftTrackWheelModels[7].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 121
		leftTrackWheelModels[7].setRotationPoint(40F, 1F, 32F);

		leftTrackWheelModels[8].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 125
		leftTrackWheelModels[8].setRotationPoint(40F, 1F, 32F);

		leftTrackWheelModels[9].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 482
		leftTrackWheelModels[9].setRotationPoint(19F, 1F, 32F);

		leftTrackWheelModels[10].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 483
		leftTrackWheelModels[10].setRotationPoint(19F, 1F, 32F);

		leftTrackWheelModels[11].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 484
		leftTrackWheelModels[11].setRotationPoint(19F, 1F, 32F);

		leftTrackWheelModels[12].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 485
		leftTrackWheelModels[12].setRotationPoint(19F, 1F, 32F);

		leftTrackWheelModels[13].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 486
		leftTrackWheelModels[13].setRotationPoint(19F, 1F, 32F);

		leftTrackWheelModels[14].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		leftTrackWheelModels[14].setRotationPoint(19F, 1F, 32F);

		leftTrackWheelModels[15].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		leftTrackWheelModels[15].setRotationPoint(19F, 1F, 32F);

		leftTrackWheelModels[16].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		leftTrackWheelModels[16].setRotationPoint(19F, 1F, 32F);

		leftTrackWheelModels[17].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		leftTrackWheelModels[17].setRotationPoint(19F, 1F, 32F);

		leftTrackWheelModels[18].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		leftTrackWheelModels[18].setRotationPoint(-2F, 1F, 32F);

		leftTrackWheelModels[19].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		leftTrackWheelModels[19].setRotationPoint(-2F, 1F, 32F);

		leftTrackWheelModels[20].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 493
		leftTrackWheelModels[20].setRotationPoint(-2F, 1F, 32F);

		leftTrackWheelModels[21].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 494
		leftTrackWheelModels[21].setRotationPoint(-2F, 1F, 32F);

		leftTrackWheelModels[22].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 495
		leftTrackWheelModels[22].setRotationPoint(-2F, 1F, 32F);

		leftTrackWheelModels[23].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		leftTrackWheelModels[23].setRotationPoint(-2F, 1F, 32F);

		leftTrackWheelModels[24].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 497
		leftTrackWheelModels[24].setRotationPoint(-2F, 1F, 32F);

		leftTrackWheelModels[25].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 498
		leftTrackWheelModels[25].setRotationPoint(-2F, 1F, 32F);

		leftTrackWheelModels[26].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		leftTrackWheelModels[26].setRotationPoint(-2F, 1F, 32F);

		leftTrackWheelModels[27].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		leftTrackWheelModels[27].setRotationPoint(-23F, 1F, 32F);

		leftTrackWheelModels[28].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		leftTrackWheelModels[28].setRotationPoint(-23F, 1F, 32F);

		leftTrackWheelModels[29].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 502
		leftTrackWheelModels[29].setRotationPoint(-23F, 1F, 32F);

		leftTrackWheelModels[30].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 503
		leftTrackWheelModels[30].setRotationPoint(-23F, 1F, 32F);

		leftTrackWheelModels[31].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 504
		leftTrackWheelModels[31].setRotationPoint(-23F, 1F, 32F);

		leftTrackWheelModels[32].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		leftTrackWheelModels[32].setRotationPoint(-23F, 1F, 32F);

		leftTrackWheelModels[33].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 506
		leftTrackWheelModels[33].setRotationPoint(-23F, 1F, 32F);

		leftTrackWheelModels[34].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 507
		leftTrackWheelModels[34].setRotationPoint(-23F, 1F, 32F);

		leftTrackWheelModels[35].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		leftTrackWheelModels[35].setRotationPoint(-23F, 1F, 32F);

		leftTrackWheelModels[36].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		leftTrackWheelModels[36].setRotationPoint(-44F, 1F, 32F);

		leftTrackWheelModels[37].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		leftTrackWheelModels[37].setRotationPoint(-44F, 1F, 32F);

		leftTrackWheelModels[38].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 511
		leftTrackWheelModels[38].setRotationPoint(-44F, 1F, 32F);

		leftTrackWheelModels[39].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 512
		leftTrackWheelModels[39].setRotationPoint(-44F, 1F, 32F);

		leftTrackWheelModels[40].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 513
		leftTrackWheelModels[40].setRotationPoint(-44F, 1F, 32F);

		leftTrackWheelModels[41].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		leftTrackWheelModels[41].setRotationPoint(-44F, 1F, 32F);

		leftTrackWheelModels[42].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 515
		leftTrackWheelModels[42].setRotationPoint(-44F, 1F, 32F);

		leftTrackWheelModels[43].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 516
		leftTrackWheelModels[43].setRotationPoint(-44F, 1F, 32F);

		leftTrackWheelModels[44].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		leftTrackWheelModels[44].setRotationPoint(-44F, 1F, 32F);

		leftTrackWheelModels[45].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		leftTrackWheelModels[45].setRotationPoint(-33.5F, 1F, 26F);

		leftTrackWheelModels[46].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		leftTrackWheelModels[46].setRotationPoint(-33.5F, 1F, 26F);

		leftTrackWheelModels[47].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 520
		leftTrackWheelModels[47].setRotationPoint(-33.5F, 1F, 26F);

		leftTrackWheelModels[48].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 521
		leftTrackWheelModels[48].setRotationPoint(-33.5F, 1F, 26F);

		leftTrackWheelModels[49].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 522
		leftTrackWheelModels[49].setRotationPoint(-33.5F, 1F, 26F);

		leftTrackWheelModels[50].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		leftTrackWheelModels[50].setRotationPoint(-33.5F, 1F, 26F);

		leftTrackWheelModels[51].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 524
		leftTrackWheelModels[51].setRotationPoint(-33.5F, 1F, 26F);

		leftTrackWheelModels[52].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 525
		leftTrackWheelModels[52].setRotationPoint(-33.5F, 1F, 26F);

		leftTrackWheelModels[53].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		leftTrackWheelModels[53].setRotationPoint(-33.5F, 1F, 26F);

		leftTrackWheelModels[54].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		leftTrackWheelModels[54].setRotationPoint(-12.5F, 1F, 26F);

		leftTrackWheelModels[55].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		leftTrackWheelModels[55].setRotationPoint(-12.5F, 1F, 26F);

		leftTrackWheelModels[56].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 529
		leftTrackWheelModels[56].setRotationPoint(-12.5F, 1F, 26F);

		leftTrackWheelModels[57].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 530
		leftTrackWheelModels[57].setRotationPoint(-12.5F, 1F, 26F);

		leftTrackWheelModels[58].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 531
		leftTrackWheelModels[58].setRotationPoint(-12.5F, 1F, 26F);

		leftTrackWheelModels[59].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		leftTrackWheelModels[59].setRotationPoint(-12.5F, 1F, 26F);

		leftTrackWheelModels[60].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 533
		leftTrackWheelModels[60].setRotationPoint(-12.5F, 1F, 26F);

		leftTrackWheelModels[61].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 534
		leftTrackWheelModels[61].setRotationPoint(-12.5F, 1F, 26F);

		leftTrackWheelModels[62].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		leftTrackWheelModels[62].setRotationPoint(-12.5F, 1F, 26F);

		leftTrackWheelModels[63].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		leftTrackWheelModels[63].setRotationPoint(8.5F, 1F, 26F);

		leftTrackWheelModels[64].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		leftTrackWheelModels[64].setRotationPoint(8.5F, 1F, 26F);

		leftTrackWheelModels[65].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 538
		leftTrackWheelModels[65].setRotationPoint(8.5F, 1F, 26F);

		leftTrackWheelModels[66].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 539
		leftTrackWheelModels[66].setRotationPoint(8.5F, 1F, 26F);

		leftTrackWheelModels[67].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 540
		leftTrackWheelModels[67].setRotationPoint(8.5F, 1F, 26F);

		leftTrackWheelModels[68].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		leftTrackWheelModels[68].setRotationPoint(8.5F, 1F, 26F);

		leftTrackWheelModels[69].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 542
		leftTrackWheelModels[69].setRotationPoint(8.5F, 1F, 26F);

		leftTrackWheelModels[70].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 543
		leftTrackWheelModels[70].setRotationPoint(8.5F, 1F, 26F);

		leftTrackWheelModels[71].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		leftTrackWheelModels[71].setRotationPoint(8.5F, 1F, 26F);

		leftTrackWheelModels[72].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		leftTrackWheelModels[72].setRotationPoint(29.5F, 1F, 26F);

		leftTrackWheelModels[73].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		leftTrackWheelModels[73].setRotationPoint(29.5F, 1F, 26F);

		leftTrackWheelModels[74].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 547
		leftTrackWheelModels[74].setRotationPoint(29.5F, 1F, 26F);

		leftTrackWheelModels[75].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 548
		leftTrackWheelModels[75].setRotationPoint(29.5F, 1F, 26F);

		leftTrackWheelModels[76].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 549
		leftTrackWheelModels[76].setRotationPoint(29.5F, 1F, 26F);

		leftTrackWheelModels[77].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		leftTrackWheelModels[77].setRotationPoint(29.5F, 1F, 26F);

		leftTrackWheelModels[78].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 551
		leftTrackWheelModels[78].setRotationPoint(29.5F, 1F, 26F);

		leftTrackWheelModels[79].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 552
		leftTrackWheelModels[79].setRotationPoint(29.5F, 1F, 26F);

		leftTrackWheelModels[80].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		leftTrackWheelModels[80].setRotationPoint(29.5F, 1F, 26F);

		leftTrackWheelModels[81].addShapeBox(-4F, -8F, -5F, 8, 1, 12, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		leftTrackWheelModels[81].setRotationPoint(56F, -7F, 26F);

		leftTrackWheelModels[82].addShapeBox(-7F, -7F, -5F, 14, 3, 12, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		leftTrackWheelModels[82].setRotationPoint(56F, -7F, 26F);

		leftTrackWheelModels[83].addShapeBox(-8F, 0F, -5F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 556
		leftTrackWheelModels[83].setRotationPoint(56F, -7F, 26F);

		leftTrackWheelModels[84].addShapeBox(-8F, -4F, -5F, 16, 4, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		leftTrackWheelModels[84].setRotationPoint(56F, -7F, 26F);

		leftTrackWheelModels[85].addShapeBox(-7F, 4F, -5F, 14, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 558
		leftTrackWheelModels[85].setRotationPoint(56F, -7F, 26F);

		leftTrackWheelModels[86].addShapeBox(-4F, 7F, -5F, 8, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 559
		leftTrackWheelModels[86].setRotationPoint(56F, -7F, 26F);

		leftTrackWheelModels[87].addShapeBox(-6F, -6F, -5F, 11, 2, 12, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		leftTrackWheelModels[87].setRotationPoint(-57F, -3F, 26F);

		leftTrackWheelModels[88].addShapeBox(-7F, 0F, -5F, 13, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 562
		leftTrackWheelModels[88].setRotationPoint(-57F, -3F, 26F);

		leftTrackWheelModels[89].addShapeBox(-7F, -4F, -5F, 13, 4, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		leftTrackWheelModels[89].setRotationPoint(-57F, -3F, 26F);

		leftTrackWheelModels[90].addShapeBox(-6F, 4F, -5F, 11, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 564
		leftTrackWheelModels[90].setRotationPoint(-57F, -3F, 26F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 566
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 567
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 568
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 1025, 121, textureX, textureY); // Box 569
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 1089, 121, textureX, textureY); // Box 570
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 937, 121, textureX, textureY); // Box 571
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 1145, 121, textureX, textureY); // Box 572
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 1233, 121, textureX, textureY); // Box 573
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 574
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 575
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 582
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 1273, 89, textureX, textureY); // Box 583
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 584
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 1337, 113, textureX, textureY); // Box 585
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Box 586
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 1345, 129, textureX, textureY); // Box 587
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Box 588
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 977, 89, textureX, textureY); // Box 589
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 1297, 89, textureX, textureY); // Box 590
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 1393, 129, textureX, textureY); // Box 591
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 1441, 129, textureX, textureY); // Box 592
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 1705, 113, textureX, textureY); // Box 593
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 1785, 113, textureX, textureY); // Box 594
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 1481, 129, textureX, textureY); // Box 595
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 1801, 129, textureX, textureY); // Box 596
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 1313, 89, textureX, textureY); // Box 597
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 1409, 89, textureX, textureY); // Box 598
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 1513, 89, textureX, textureY); // Box 599
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 1849, 129, textureX, textureY); // Box 600
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 1521, 129, textureX, textureY); // Box 601
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 602
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 603
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 1897, 129, textureX, textureY); // Box 604
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 1937, 129, textureX, textureY); // Box 605
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 1553, 89, textureX, textureY); // Box 606
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 1713, 89, textureX, textureY); // Box 607
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 1809, 89, textureX, textureY); // Box 608
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 1985, 129, textureX, textureY); // Box 609
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 610
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 611
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 1073, 121, textureX, textureY); // Box 612
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 613
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 614
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 615
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 617, 137, textureX, textureY); // Box 616
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 617
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Box 618
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 713, 137, textureX, textureY); // Box 619
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 620
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Box 621
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 622
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 945, 137, textureX, textureY); // Box 623
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 1081, 137, textureX, textureY); // Box 624
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 1193, 137, textureX, textureY); // Box 625
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 626
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 627
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 628
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Box 629
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 630
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 1233, 137, textureX, textureY); // Box 631
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 1273, 137, textureX, textureY); // Box 632
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 633
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 634
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 635
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 873, 97, textureX, textureY); // Box 636
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 1377, 97, textureX, textureY); // Box 637
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 638
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 1313, 137, textureX, textureY); // Box 639
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 640
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 641
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 642
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 1425, 97, textureX, textureY); // Box 643
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 1441, 97, textureX, textureY); // Box 644
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 1577, 97, textureX, textureY); // Box 645
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 646
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 561, 145, textureX, textureY); // Box 647
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 648
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 649
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Box 650
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 1713, 97, textureX, textureY); // Box 651
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 1841, 97, textureX, textureY); // Box 652
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 1769, 97, textureX, textureY); // Box 653
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 841, 145, textureX, textureY); // Box 654
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 655
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 1025, 145, textureX, textureY); // Box 656

		rightTrackWheelModels[0].addShapeBox(-4F, -8F, -5F, 8, 1, 12, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		rightTrackWheelModels[0].setRotationPoint(56F, -7F, -28F);

		rightTrackWheelModels[1].addShapeBox(-7F, -7F, -5F, 14, 3, 12, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		rightTrackWheelModels[1].setRotationPoint(56F, -7F, -28F);

		rightTrackWheelModels[2].addShapeBox(-8F, -4F, -5F, 16, 4, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		rightTrackWheelModels[2].setRotationPoint(56F, -7F, -28F);

		rightTrackWheelModels[3].addShapeBox(-8F, 0F, -5F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 569
		rightTrackWheelModels[3].setRotationPoint(56F, -7F, -28F);

		rightTrackWheelModels[4].addShapeBox(-7F, 4F, -5F, 14, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 570
		rightTrackWheelModels[4].setRotationPoint(56F, -7F, -28F);

		rightTrackWheelModels[5].addShapeBox(-4F, 7F, -5F, 8, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 571
		rightTrackWheelModels[5].setRotationPoint(56F, -7F, -28F);

		rightTrackWheelModels[6].addShapeBox(-7F, -4F, -5F, 13, 4, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		rightTrackWheelModels[6].setRotationPoint(-57F, -3F, -28F);

		rightTrackWheelModels[7].addShapeBox(-6F, 4F, -5F, 11, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 573
		rightTrackWheelModels[7].setRotationPoint(-57F, -3F, -28F);

		rightTrackWheelModels[8].addShapeBox(-7F, 0F, -5F, 13, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 574
		rightTrackWheelModels[8].setRotationPoint(-57F, -3F, -28F);

		rightTrackWheelModels[9].addShapeBox(-6F, -6F, -5F, 11, 2, 12, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		rightTrackWheelModels[9].setRotationPoint(-57F, -3F, -28F);

		rightTrackWheelModels[10].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 582
		rightTrackWheelModels[10].setRotationPoint(29.5F, 1F, -27F);

		rightTrackWheelModels[11].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 583
		rightTrackWheelModels[11].setRotationPoint(29.5F, 1F, -27F);

		rightTrackWheelModels[12].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		rightTrackWheelModels[12].setRotationPoint(29.5F, 1F, -27F);

		rightTrackWheelModels[13].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		rightTrackWheelModels[13].setRotationPoint(8.5F, 1F, -21F);

		rightTrackWheelModels[14].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		rightTrackWheelModels[14].setRotationPoint(8.5F, 1F, -21F);

		rightTrackWheelModels[15].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		rightTrackWheelModels[15].setRotationPoint(8.5F, 1F, -21F);

		rightTrackWheelModels[16].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		rightTrackWheelModels[16].setRotationPoint(8.5F, 1F, -27F);

		rightTrackWheelModels[17].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 589
		rightTrackWheelModels[17].setRotationPoint(8.5F, 1F, -27F);

		rightTrackWheelModels[18].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 590
		rightTrackWheelModels[18].setRotationPoint(8.5F, 1F, -27F);

		rightTrackWheelModels[19].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 591
		rightTrackWheelModels[19].setRotationPoint(8.5F, 1F, -21F);

		rightTrackWheelModels[20].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 592
		rightTrackWheelModels[20].setRotationPoint(8.5F, 1F, -21F);

		rightTrackWheelModels[21].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 593
		rightTrackWheelModels[21].setRotationPoint(8.5F, 1F, -21F);

		rightTrackWheelModels[22].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 594
		rightTrackWheelModels[22].setRotationPoint(-12.5F, 1F, -21F);

		rightTrackWheelModels[23].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 595
		rightTrackWheelModels[23].setRotationPoint(-12.5F, 1F, -21F);

		rightTrackWheelModels[24].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 596
		rightTrackWheelModels[24].setRotationPoint(-12.5F, 1F, -21F);

		rightTrackWheelModels[25].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 597
		rightTrackWheelModels[25].setRotationPoint(-12.5F, 1F, -27F);

		rightTrackWheelModels[26].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 598
		rightTrackWheelModels[26].setRotationPoint(-12.5F, 1F, -27F);

		rightTrackWheelModels[27].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		rightTrackWheelModels[27].setRotationPoint(-12.5F, 1F, -27F);

		rightTrackWheelModels[28].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		rightTrackWheelModels[28].setRotationPoint(-12.5F, 1F, -21F);

		rightTrackWheelModels[29].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		rightTrackWheelModels[29].setRotationPoint(-12.5F, 1F, -21F);

		rightTrackWheelModels[30].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		rightTrackWheelModels[30].setRotationPoint(-12.5F, 1F, -21F);

		rightTrackWheelModels[31].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		rightTrackWheelModels[31].setRotationPoint(-33.5F, 1F, -21F);

		rightTrackWheelModels[32].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		rightTrackWheelModels[32].setRotationPoint(-33.5F, 1F, -21F);

		rightTrackWheelModels[33].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		rightTrackWheelModels[33].setRotationPoint(-33.5F, 1F, -21F);

		rightTrackWheelModels[34].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		rightTrackWheelModels[34].setRotationPoint(-33.5F, 1F, -27F);

		rightTrackWheelModels[35].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 607
		rightTrackWheelModels[35].setRotationPoint(-33.5F, 1F, -27F);

		rightTrackWheelModels[36].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 608
		rightTrackWheelModels[36].setRotationPoint(-33.5F, 1F, -27F);

		rightTrackWheelModels[37].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 609
		rightTrackWheelModels[37].setRotationPoint(-33.5F, 1F, -21F);

		rightTrackWheelModels[38].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 610
		rightTrackWheelModels[38].setRotationPoint(-33.5F, 1F, -21F);

		rightTrackWheelModels[39].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 611
		rightTrackWheelModels[39].setRotationPoint(-33.5F, 1F, -21F);

		rightTrackWheelModels[40].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		rightTrackWheelModels[40].setRotationPoint(40F, 1F, -26F);

		rightTrackWheelModels[41].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		rightTrackWheelModels[41].setRotationPoint(40F, 1F, -26F);

		rightTrackWheelModels[42].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 614
		rightTrackWheelModels[42].setRotationPoint(40F, 1F, -32F);

		rightTrackWheelModels[43].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 615
		rightTrackWheelModels[43].setRotationPoint(40F, 1F, -32F);

		rightTrackWheelModels[44].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		rightTrackWheelModels[44].setRotationPoint(40F, 1F, -26F);

		rightTrackWheelModels[45].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		rightTrackWheelModels[45].setRotationPoint(40F, 1F, -32F);

		rightTrackWheelModels[46].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 618
		rightTrackWheelModels[46].setRotationPoint(40F, 1F, -26F);

		rightTrackWheelModels[47].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 619
		rightTrackWheelModels[47].setRotationPoint(40F, 1F, -26F);

		rightTrackWheelModels[48].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 620
		rightTrackWheelModels[48].setRotationPoint(40F, 1F, -26F);

		rightTrackWheelModels[49].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 621
		rightTrackWheelModels[49].setRotationPoint(19F, 1F, -26F);

		rightTrackWheelModels[50].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 622
		rightTrackWheelModels[50].setRotationPoint(19F, 1F, -26F);

		rightTrackWheelModels[51].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 623
		rightTrackWheelModels[51].setRotationPoint(19F, 1F, -26F);

		rightTrackWheelModels[52].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		rightTrackWheelModels[52].setRotationPoint(19F, 1F, -26F);

		rightTrackWheelModels[53].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		rightTrackWheelModels[53].setRotationPoint(19F, 1F, -26F);

		rightTrackWheelModels[54].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		rightTrackWheelModels[54].setRotationPoint(19F, 1F, -26F);

		rightTrackWheelModels[55].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		rightTrackWheelModels[55].setRotationPoint(19F, 1F, -32F);

		rightTrackWheelModels[56].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 628
		rightTrackWheelModels[56].setRotationPoint(19F, 1F, -32F);

		rightTrackWheelModels[57].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 629
		rightTrackWheelModels[57].setRotationPoint(19F, 1F, -32F);

		rightTrackWheelModels[58].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		rightTrackWheelModels[58].setRotationPoint(-2F, 1F, -26F);

		rightTrackWheelModels[59].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		rightTrackWheelModels[59].setRotationPoint(-2F, 1F, -26F);

		rightTrackWheelModels[60].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 632
		rightTrackWheelModels[60].setRotationPoint(-2F, 1F, -26F);

		rightTrackWheelModels[61].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 633
		rightTrackWheelModels[61].setRotationPoint(-2F, 1F, -26F);

		rightTrackWheelModels[62].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 634
		rightTrackWheelModels[62].setRotationPoint(-2F, 1F, -26F);

		rightTrackWheelModels[63].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 635
		rightTrackWheelModels[63].setRotationPoint(-2F, 1F, -32F);

		rightTrackWheelModels[64].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 636
		rightTrackWheelModels[64].setRotationPoint(-2F, 1F, -32F);

		rightTrackWheelModels[65].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 637
		rightTrackWheelModels[65].setRotationPoint(-2F, 1F, -32F);

		rightTrackWheelModels[66].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		rightTrackWheelModels[66].setRotationPoint(-2F, 1F, -26F);

		rightTrackWheelModels[67].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		rightTrackWheelModels[67].setRotationPoint(-23F, 1F, -26F);

		rightTrackWheelModels[68].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 640
		rightTrackWheelModels[68].setRotationPoint(-23F, 1F, -26F);

		rightTrackWheelModels[69].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 641
		rightTrackWheelModels[69].setRotationPoint(-23F, 1F, -26F);

		rightTrackWheelModels[70].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 642
		rightTrackWheelModels[70].setRotationPoint(-23F, 1F, -26F);

		rightTrackWheelModels[71].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 643
		rightTrackWheelModels[71].setRotationPoint(-23F, 1F, -32F);

		rightTrackWheelModels[72].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 644
		rightTrackWheelModels[72].setRotationPoint(-23F, 1F, -32F);

		rightTrackWheelModels[73].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		rightTrackWheelModels[73].setRotationPoint(-23F, 1F, -32F);

		rightTrackWheelModels[74].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		rightTrackWheelModels[74].setRotationPoint(-23F, 1F, -26F);

		rightTrackWheelModels[75].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		rightTrackWheelModels[75].setRotationPoint(-23F, 1F, -26F);

		rightTrackWheelModels[76].addShapeBox(-4F, -8F, -5F, 8, 1, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		rightTrackWheelModels[76].setRotationPoint(-44F, 1F, -26F);

		rightTrackWheelModels[77].addShapeBox(-7F, -7F, -5F, 14, 3, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 649
		rightTrackWheelModels[77].setRotationPoint(-44F, 1F, -26F);

		rightTrackWheelModels[78].addShapeBox(-8F, -4F, -5F, 16, 4, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		rightTrackWheelModels[78].setRotationPoint(-44F, 1F, -26F);

		rightTrackWheelModels[79].addShapeBox(-2F, -2F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		rightTrackWheelModels[79].setRotationPoint(-44F, 1F, -32F);

		rightTrackWheelModels[80].addBox(-2F, -1F, 0F, 4, 2, 1, 0F); // Box 652
		rightTrackWheelModels[80].setRotationPoint(-44F, 1F, -32F);

		rightTrackWheelModels[81].addShapeBox(-2F, 1F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 653
		rightTrackWheelModels[81].setRotationPoint(-44F, 1F, -32F);

		rightTrackWheelModels[82].addShapeBox(-8F, 0F, -5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 654
		rightTrackWheelModels[82].setRotationPoint(-44F, 1F, -26F);

		rightTrackWheelModels[83].addShapeBox(-7F, 4F, -5F, 14, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 655
		rightTrackWheelModels[83].setRotationPoint(-44F, 1F, -26F);

		rightTrackWheelModels[84].addShapeBox(-4F, 7F, -5F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 656
		rightTrackWheelModels[84].setRotationPoint(-44F, 1F, -26F);
	}
}