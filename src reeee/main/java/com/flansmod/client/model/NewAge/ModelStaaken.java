//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.12.2016 - 14:31:18
// Last changed on: 19.12.2016 - 14:31:18

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStaaken extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelStaaken() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[308];
		tailModel = new ModelRendererTurbo[19];
		leftWingModel = new ModelRendererTurbo[88];
		rightWingModel = new ModelRendererTurbo[93];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[4];
		pitchFlapRightModel = new ModelRendererTurbo[4];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 1657, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 1729, 1, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 1473, 41, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 1193, 57, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 1937, 17, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 1841, 1, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 1377, 57, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 1153, 57, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 1857, 1, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 2009, 17, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 1745, 17, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 1873, 73, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 1329, 57, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 1769, 17, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 1857, 1, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 1793, 17, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 1801, 17, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 1937, 17, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 1953, 17, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 46
		bodyModel[44] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 1857, 17, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 1897, 17, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 1825, 17, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 1961, 17, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 2009, 17, textureX, textureY); // Box 53
		bodyModel[51] = new ModelRendererTurbo(this, 1825, 25, textureX, textureY); // Box 54
		bodyModel[52] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 1961, 25, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 1873, 49, textureX, textureY); // Box 58
		bodyModel[55] = new ModelRendererTurbo(this, 1889, 49, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 1521, 33, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 1545, 33, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 1569, 33, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 1593, 33, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 1617, 33, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 1633, 33, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 1649, 33, textureX, textureY); // Box 69
		bodyModel[66] = new ModelRendererTurbo(this, 2009, 25, textureX, textureY); // Box 70
		bodyModel[67] = new ModelRendererTurbo(this, 2033, 25, textureX, textureY); // Box 71
		bodyModel[68] = new ModelRendererTurbo(this, 1945, 73, textureX, textureY); // Box 109
		bodyModel[69] = new ModelRendererTurbo(this, 1945, 89, textureX, textureY); // Box 110
		bodyModel[70] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 111
		bodyModel[71] = new ModelRendererTurbo(this, 1433, 57, textureX, textureY); // Box 112
		bodyModel[72] = new ModelRendererTurbo(this, 1433, 73, textureX, textureY); // Box 113
		bodyModel[73] = new ModelRendererTurbo(this, 1865, 121, textureX, textureY); // Box 133
		bodyModel[74] = new ModelRendererTurbo(this, 1025, 113, textureX, textureY); // Box 134
		bodyModel[75] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 135
		bodyModel[76] = new ModelRendererTurbo(this, 1145, 113, textureX, textureY); // Box 136
		bodyModel[77] = new ModelRendererTurbo(this, 1913, 57, textureX, textureY); // Box 137
		bodyModel[78] = new ModelRendererTurbo(this, 1761, 33, textureX, textureY); // Box 138
		bodyModel[79] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 139
		bodyModel[80] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 143
		bodyModel[81] = new ModelRendererTurbo(this, 1153, 57, textureX, textureY); // Box 144
		bodyModel[82] = new ModelRendererTurbo(this, 1353, 121, textureX, textureY); // Box 151
		bodyModel[83] = new ModelRendererTurbo(this, 1577, 129, textureX, textureY); // Box 152
		bodyModel[84] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 153
		bodyModel[85] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 154
		bodyModel[86] = new ModelRendererTurbo(this, 1777, 33, textureX, textureY); // Box 168
		bodyModel[87] = new ModelRendererTurbo(this, 1961, 33, textureX, textureY); // Box 169
		bodyModel[88] = new ModelRendererTurbo(this, 1873, 89, textureX, textureY); // Box 170
		bodyModel[89] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 171
		bodyModel[90] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 172
		bodyModel[91] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 173
		bodyModel[92] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 174
		bodyModel[93] = new ModelRendererTurbo(this, 1681, 33, textureX, textureY); // Box 260
		bodyModel[94] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 261
		bodyModel[95] = new ModelRendererTurbo(this, 1705, 33, textureX, textureY); // Box 262
		bodyModel[96] = new ModelRendererTurbo(this, 1849, 33, textureX, textureY); // Box 263
		bodyModel[97] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 264
		bodyModel[98] = new ModelRendererTurbo(this, 1945, 33, textureX, textureY); // Box 265
		bodyModel[99] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 268
		bodyModel[100] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 269
		bodyModel[101] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 270
		bodyModel[102] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Box 271
		bodyModel[103] = new ModelRendererTurbo(this, 1585, 33, textureX, textureY); // Box 272
		bodyModel[104] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 273
		bodyModel[105] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Box 278
		bodyModel[106] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 279
		bodyModel[107] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 280
		bodyModel[108] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 281
		bodyModel[109] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 282
		bodyModel[110] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 283
		bodyModel[111] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 284
		bodyModel[112] = new ModelRendererTurbo(this, 1721, 33, textureX, textureY); // Box 285
		bodyModel[113] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 286
		bodyModel[114] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 287
		bodyModel[115] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 288
		bodyModel[116] = new ModelRendererTurbo(this, 1929, 49, textureX, textureY); // Box 289
		bodyModel[117] = new ModelRendererTurbo(this, 1945, 49, textureX, textureY); // Box 290
		bodyModel[118] = new ModelRendererTurbo(this, 1961, 49, textureX, textureY); // Box 291
		bodyModel[119] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 292
		bodyModel[120] = new ModelRendererTurbo(this, 1873, 41, textureX, textureY); // Box 293
		bodyModel[121] = new ModelRendererTurbo(this, 1889, 41, textureX, textureY); // Box 294
		bodyModel[122] = new ModelRendererTurbo(this, 1905, 41, textureX, textureY); // Box 295
		bodyModel[123] = new ModelRendererTurbo(this, 2009, 49, textureX, textureY); // Box 296
		bodyModel[124] = new ModelRendererTurbo(this, 2025, 49, textureX, textureY); // Box 297
		bodyModel[125] = new ModelRendererTurbo(this, 1057, 289, textureX, textureY); // Box 341
		bodyModel[126] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 342
		bodyModel[127] = new ModelRendererTurbo(this, 1945, 73, textureX, textureY); // Box 344
		bodyModel[128] = new ModelRendererTurbo(this, 1393, 105, textureX, textureY); // Box 345
		bodyModel[129] = new ModelRendererTurbo(this, 1337, 81, textureX, textureY); // Box 346
		bodyModel[130] = new ModelRendererTurbo(this, 1561, 105, textureX, textureY); // Box 347
		bodyModel[131] = new ModelRendererTurbo(this, 1577, 105, textureX, textureY); // Box 349
		bodyModel[132] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Box 350
		bodyModel[133] = new ModelRendererTurbo(this, 1937, 41, textureX, textureY); // Box 351
		bodyModel[134] = new ModelRendererTurbo(this, 1873, 81, textureX, textureY); // Box 352
		bodyModel[135] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 353
		bodyModel[136] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 354
		bodyModel[137] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 355
		bodyModel[138] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Box 356
		bodyModel[139] = new ModelRendererTurbo(this, 1329, 97, textureX, textureY); // Box 357
		bodyModel[140] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 358
		bodyModel[141] = new ModelRendererTurbo(this, 1409, 105, textureX, textureY); // Box 359
		bodyModel[142] = new ModelRendererTurbo(this, 1393, 169, textureX, textureY); // Box 360
		bodyModel[143] = new ModelRendererTurbo(this, 1761, 169, textureX, textureY); // Box 361
		bodyModel[144] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 362
		bodyModel[145] = new ModelRendererTurbo(this, 1017, 329, textureX, textureY); // Box 363
		bodyModel[146] = new ModelRendererTurbo(this, 1073, 321, textureX, textureY); // Box 364
		bodyModel[147] = new ModelRendererTurbo(this, 1353, 345, textureX, textureY); // Box 365
		bodyModel[148] = new ModelRendererTurbo(this, 1713, 105, textureX, textureY); // Box 366
		bodyModel[149] = new ModelRendererTurbo(this, 1769, 105, textureX, textureY); // Box 367
		bodyModel[150] = new ModelRendererTurbo(this, 1385, 345, textureX, textureY); // Box 368
		bodyModel[151] = new ModelRendererTurbo(this, 1945, 105, textureX, textureY); // Box 369
		bodyModel[152] = new ModelRendererTurbo(this, 801, 337, textureX, textureY); // Box 370
		bodyModel[153] = new ModelRendererTurbo(this, 1961, 105, textureX, textureY); // Box 371
		bodyModel[154] = new ModelRendererTurbo(this, 1417, 345, textureX, textureY); // Box 372
		bodyModel[155] = new ModelRendererTurbo(this, 1225, 89, textureX, textureY); // Box 373
		bodyModel[156] = new ModelRendererTurbo(this, 1945, 89, textureX, textureY); // Box 374
		bodyModel[157] = new ModelRendererTurbo(this, 1833, 97, textureX, textureY); // Box 375
		bodyModel[158] = new ModelRendererTurbo(this, 961, 249, textureX, textureY); // Box 376
		bodyModel[159] = new ModelRendererTurbo(this, 1513, 177, textureX, textureY); // Box 377
		bodyModel[160] = new ModelRendererTurbo(this, 1841, 97, textureX, textureY); // Box 378
		bodyModel[161] = new ModelRendererTurbo(this, 1897, 97, textureX, textureY); // Box 379
		bodyModel[162] = new ModelRendererTurbo(this, 1857, 97, textureX, textureY); // Box 380
		bodyModel[163] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 381
		bodyModel[164] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 382
		bodyModel[165] = new ModelRendererTurbo(this, 1729, 105, textureX, textureY); // Box 383
		bodyModel[166] = new ModelRendererTurbo(this, 1017, 249, textureX, textureY); // Box 384
		bodyModel[167] = new ModelRendererTurbo(this, 1089, 249, textureX, textureY); // Box 385
		bodyModel[168] = new ModelRendererTurbo(this, 2017, 105, textureX, textureY); // Box 386
		bodyModel[169] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 387
		bodyModel[170] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 388
		bodyModel[171] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 390
		bodyModel[172] = new ModelRendererTurbo(this, 1185, 121, textureX, textureY); // Box 391
		bodyModel[173] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 392
		bodyModel[174] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 393
		bodyModel[175] = new ModelRendererTurbo(this, 1729, 257, textureX, textureY); // Box 394
		bodyModel[176] = new ModelRendererTurbo(this, 641, 281, textureX, textureY); // Box 395
		bodyModel[177] = new ModelRendererTurbo(this, 1785, 105, textureX, textureY); // Box 396
		bodyModel[178] = new ModelRendererTurbo(this, 1977, 105, textureX, textureY); // Box 397
		bodyModel[179] = new ModelRendererTurbo(this, 2033, 105, textureX, textureY); // Box 398
		bodyModel[180] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 399
		bodyModel[181] = new ModelRendererTurbo(this, 281, 313, textureX, textureY); // Box 400
		bodyModel[182] = new ModelRendererTurbo(this, 729, 217, textureX, textureY); // Box 401
		bodyModel[183] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Box 402
		bodyModel[184] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 403
		bodyModel[185] = new ModelRendererTurbo(this, 1761, 17, textureX, textureY); // Box 404
		bodyModel[186] = new ModelRendererTurbo(this, 1169, 257, textureX, textureY); // Box 405
		bodyModel[187] = new ModelRendererTurbo(this, 1145, 353, textureX, textureY); // Box 406
		bodyModel[188] = new ModelRendererTurbo(this, 2033, 49, textureX, textureY); // Box 407
		bodyModel[189] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 408
		bodyModel[190] = new ModelRendererTurbo(this, 433, 361, textureX, textureY); // Box 409
		bodyModel[191] = new ModelRendererTurbo(this, 1361, 97, textureX, textureY); // Box 410
		bodyModel[192] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 411
		bodyModel[193] = new ModelRendererTurbo(this, 1033, 113, textureX, textureY); // Box 412
		bodyModel[194] = new ModelRendererTurbo(this, 1449, 345, textureX, textureY); // Box 413
		bodyModel[195] = new ModelRendererTurbo(this, 1489, 345, textureX, textureY); // Box 414
		bodyModel[196] = new ModelRendererTurbo(this, 1529, 345, textureX, textureY); // Box 415
		bodyModel[197] = new ModelRendererTurbo(this, 1297, 353, textureX, textureY); // Box 416
		bodyModel[198] = new ModelRendererTurbo(this, 1041, 113, textureX, textureY); // Box 417
		bodyModel[199] = new ModelRendererTurbo(this, 937, 361, textureX, textureY); // Box 418
		bodyModel[200] = new ModelRendererTurbo(this, 2009, 353, textureX, textureY); // Box 419
		bodyModel[201] = new ModelRendererTurbo(this, 1145, 113, textureX, textureY); // Box 420
		bodyModel[202] = new ModelRendererTurbo(this, 185, 361, textureX, textureY); // Box 421
		bodyModel[203] = new ModelRendererTurbo(this, 225, 361, textureX, textureY); // Box 422
		bodyModel[204] = new ModelRendererTurbo(this, 265, 361, textureX, textureY); // Box 423
		bodyModel[205] = new ModelRendererTurbo(this, 585, 361, textureX, textureY); // Box 424
		bodyModel[206] = new ModelRendererTurbo(this, 1145, 361, textureX, textureY); // Box 425
		bodyModel[207] = new ModelRendererTurbo(this, 1185, 361, textureX, textureY); // Box 426
		bodyModel[208] = new ModelRendererTurbo(this, 1225, 361, textureX, textureY); // Box 427
		bodyModel[209] = new ModelRendererTurbo(this, 753, 369, textureX, textureY); // Box 428
		bodyModel[210] = new ModelRendererTurbo(this, 897, 369, textureX, textureY); // Box 429
		bodyModel[211] = new ModelRendererTurbo(this, 1265, 361, textureX, textureY); // Box 430
		bodyModel[212] = new ModelRendererTurbo(this, 2017, 113, textureX, textureY); // Box 431
		bodyModel[213] = new ModelRendererTurbo(this, 745, 377, textureX, textureY); // Box 432
		bodyModel[214] = new ModelRendererTurbo(this, 1033, 385, textureX, textureY); // Box 433
		bodyModel[215] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 434
		bodyModel[216] = new ModelRendererTurbo(this, 1065, 385, textureX, textureY); // Box 435
		bodyModel[217] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 436
		bodyModel[218] = new ModelRendererTurbo(this, 41, 425, textureX, textureY); // Box 437
		bodyModel[219] = new ModelRendererTurbo(this, 81, 425, textureX, textureY); // Box 438
		bodyModel[220] = new ModelRendererTurbo(this, 121, 425, textureX, textureY); // Box 439
		bodyModel[221] = new ModelRendererTurbo(this, 161, 425, textureX, textureY); // Box 440
		bodyModel[222] = new ModelRendererTurbo(this, 201, 425, textureX, textureY); // Box 441
		bodyModel[223] = new ModelRendererTurbo(this, 241, 425, textureX, textureY); // Box 442
		bodyModel[224] = new ModelRendererTurbo(this, 281, 425, textureX, textureY); // Box 443
		bodyModel[225] = new ModelRendererTurbo(this, 433, 425, textureX, textureY); // Box 444
		bodyModel[226] = new ModelRendererTurbo(this, 473, 425, textureX, textureY); // Box 445
		bodyModel[227] = new ModelRendererTurbo(this, 513, 425, textureX, textureY); // Box 446
		bodyModel[228] = new ModelRendererTurbo(this, 553, 425, textureX, textureY); // Box 447
		bodyModel[229] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 448
		bodyModel[230] = new ModelRendererTurbo(this, 657, 425, textureX, textureY); // Box 449
		bodyModel[231] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 450
		bodyModel[232] = new ModelRendererTurbo(this, 1585, 425, textureX, textureY); // Box 451
		bodyModel[233] = new ModelRendererTurbo(this, 1617, 425, textureX, textureY); // Box 452
		bodyModel[234] = new ModelRendererTurbo(this, 1657, 425, textureX, textureY); // Box 453
		bodyModel[235] = new ModelRendererTurbo(this, 1697, 425, textureX, textureY); // Box 454
		bodyModel[236] = new ModelRendererTurbo(this, 1889, 425, textureX, textureY); // Box 455
		bodyModel[237] = new ModelRendererTurbo(this, 1929, 425, textureX, textureY); // Box 456
		bodyModel[238] = new ModelRendererTurbo(this, 1969, 425, textureX, textureY); // Box 457
		bodyModel[239] = new ModelRendererTurbo(this, 2009, 425, textureX, textureY); // Box 458
		bodyModel[240] = new ModelRendererTurbo(this, 753, 433, textureX, textureY); // Box 459
		bodyModel[241] = new ModelRendererTurbo(this, 841, 449, textureX, textureY); // Box 460
		bodyModel[242] = new ModelRendererTurbo(this, 881, 449, textureX, textureY); // Box 461
		bodyModel[243] = new ModelRendererTurbo(this, 921, 449, textureX, textureY); // Box 462
		bodyModel[244] = new ModelRendererTurbo(this, 961, 449, textureX, textureY); // Box 463
		bodyModel[245] = new ModelRendererTurbo(this, 1745, 17, textureX, textureY); // Box 464
		bodyModel[246] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 465
		bodyModel[247] = new ModelRendererTurbo(this, 1433, 57, textureX, textureY); // Box 466
		bodyModel[248] = new ModelRendererTurbo(this, 1489, 57, textureX, textureY); // Box 467
		bodyModel[249] = new ModelRendererTurbo(this, 1433, 73, textureX, textureY); // Box 468
		bodyModel[250] = new ModelRendererTurbo(this, 1489, 73, textureX, textureY); // Box 469
		bodyModel[251] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 470
		bodyModel[252] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 471
		bodyModel[253] = new ModelRendererTurbo(this, 1329, 89, textureX, textureY); // Box 472
		bodyModel[254] = new ModelRendererTurbo(this, 1369, 89, textureX, textureY); // Box 473
		bodyModel[255] = new ModelRendererTurbo(this, 1465, 105, textureX, textureY); // Box 474
		bodyModel[256] = new ModelRendererTurbo(this, 1505, 105, textureX, textureY); // Box 475
		bodyModel[257] = new ModelRendererTurbo(this, 1713, 105, textureX, textureY); // Box 476
		bodyModel[258] = new ModelRendererTurbo(this, 1769, 105, textureX, textureY); // Box 477
		bodyModel[259] = new ModelRendererTurbo(this, 1945, 105, textureX, textureY); // Box 478
		bodyModel[260] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 479
		bodyModel[261] = new ModelRendererTurbo(this, 1777, 113, textureX, textureY); // Box 480
		bodyModel[262] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 481
		bodyModel[263] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 482
		bodyModel[264] = new ModelRendererTurbo(this, 1737, 33, textureX, textureY); // Box 483
		bodyModel[265] = new ModelRendererTurbo(this, 1737, 1, textureX, textureY); // Box 484
		bodyModel[266] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 485
		bodyModel[267] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 486
		bodyModel[268] = new ModelRendererTurbo(this, 1969, 41, textureX, textureY); // Box 488
		bodyModel[269] = new ModelRendererTurbo(this, 1937, 49, textureX, textureY); // Box 489
		bodyModel[270] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 484
		bodyModel[271] = new ModelRendererTurbo(this, 1201, 129, textureX, textureY); // Box 485
		bodyModel[272] = new ModelRendererTurbo(this, 793, 161, textureX, textureY); // Box 486
		bodyModel[273] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 487
		bodyModel[274] = new ModelRendererTurbo(this, 1393, 137, textureX, textureY); // Box 488
		bodyModel[275] = new ModelRendererTurbo(this, 1457, 137, textureX, textureY); // Box 489
		bodyModel[276] = new ModelRendererTurbo(this, 1561, 137, textureX, textureY); // Box 490
		bodyModel[277] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 491
		bodyModel[278] = new ModelRendererTurbo(this, 1449, 169, textureX, textureY); // Box 492
		bodyModel[279] = new ModelRendererTurbo(this, 1713, 137, textureX, textureY); // Box 493
		bodyModel[280] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 496
		bodyModel[281] = new ModelRendererTurbo(this, 849, 289, textureX, textureY); // Box 499
		bodyModel[282] = new ModelRendererTurbo(this, 1713, 337, textureX, textureY); // Box 504
		bodyModel[283] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 505
		bodyModel[284] = new ModelRendererTurbo(this, 57, 369, textureX, textureY); // Box 506
		bodyModel[285] = new ModelRendererTurbo(this, 1865, 257, textureX, textureY); // Box 507
		bodyModel[286] = new ModelRendererTurbo(this, 89, 369, textureX, textureY); // Box 508
		bodyModel[287] = new ModelRendererTurbo(this, 433, 369, textureX, textureY); // Box 509
		bodyModel[288] = new ModelRendererTurbo(this, 489, 369, textureX, textureY); // Box 510
		bodyModel[289] = new ModelRendererTurbo(this, 1945, 369, textureX, textureY); // Box 511
		bodyModel[290] = new ModelRendererTurbo(this, 1817, 337, textureX, textureY); // Box 512
		bodyModel[291] = new ModelRendererTurbo(this, 937, 369, textureX, textureY); // Box 513
		bodyModel[292] = new ModelRendererTurbo(this, 625, 377, textureX, textureY); // Box 514
		bodyModel[293] = new ModelRendererTurbo(this, 841, 393, textureX, textureY); // Box 515
		bodyModel[294] = new ModelRendererTurbo(this, 657, 377, textureX, textureY); // Box 516
		bodyModel[295] = new ModelRendererTurbo(this, 1849, 377, textureX, textureY); // Box 517
		bodyModel[296] = new ModelRendererTurbo(this, 89, 385, textureX, textureY); // Box 518
		bodyModel[297] = new ModelRendererTurbo(this, 433, 385, textureX, textureY); // Box 519
		bodyModel[298] = new ModelRendererTurbo(this, 1777, 137, textureX, textureY); // Box 529
		bodyModel[299] = new ModelRendererTurbo(this, 1777, 145, textureX, textureY); // Box 530
		bodyModel[300] = new ModelRendererTurbo(this, 1449, 177, textureX, textureY); // Box 531
		bodyModel[301] = new ModelRendererTurbo(this, 1553, 153, textureX, textureY); // Box 532
		bodyModel[302] = new ModelRendererTurbo(this, 1185, 185, textureX, textureY); // Box 533
		bodyModel[303] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 534
		bodyModel[304] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 535
		bodyModel[305] = new ModelRendererTurbo(this, 1337, 185, textureX, textureY); // Box 536
		bodyModel[306] = new ModelRendererTurbo(this, 553, 169, textureX, textureY); // Box 537
		bodyModel[307] = new ModelRendererTurbo(this, 1393, 185, textureX, textureY); // Box 538

		bodyModel[0].addShapeBox(0F, 0F, 0F, 26, 49, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(0F, -75F, -23F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 18, 49, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(-18F, -75F, -23F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 175, 49, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(-193F, -75F, -23F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 175, 49, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-193F, -75F, 22F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 44, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-237F, -53F, 22F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 30, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 7
		bodyModel[5].setRotationPoint(-253F, -53F, 22F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 31, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 8
		bodyModel[6].setRotationPoint(-264F, -53F, 19F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 31, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 9
		bodyModel[7].setRotationPoint(-272F, -53F, 16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 6, 31, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 10
		bodyModel[8].setRotationPoint(-278F, -53F, 13F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 31, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F); // Box 11
		bodyModel[9].setRotationPoint(-281F, -53F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 31, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-285F, -53F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 31, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-284F, -53F, 3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 44, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 14
		bodyModel[12].setRotationPoint(-237F, -53F, -23F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 16, 30, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F); // Box 15
		bodyModel[13].setRotationPoint(-253F, -53F, -23F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 31, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 16
		bodyModel[14].setRotationPoint(-264F, -53F, -20F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 31, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 17
		bodyModel[15].setRotationPoint(-272F, -53F, -17F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 31, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 18
		bodyModel[16].setRotationPoint(-278F, -53F, -14F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 31, 1, 0F,1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 19
		bodyModel[17].setRotationPoint(-281F, -53F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 31, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-284F, -53F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 175, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-193F, -75F, -22F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-237F, -75F, -22F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 44, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[21].setRotationPoint(-237F, -75F, 22F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 44, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[22].setRotationPoint(-237F, -75F, -23F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 175, 10, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(-193F, -36F, -22F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 44, 13, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[24].setRotationPoint(-237F, -36F, -22F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 14, 38, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(-253F, -36F, -19F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 31, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(-285F, -53F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 14, 32, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 29
		bodyModel[27].setRotationPoint(-264F, -36F, -16F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 14, 26, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 30
		bodyModel[28].setRotationPoint(-272F, -36F, -13F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 14, 20, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(-278F, -36F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 32
		bodyModel[30].setRotationPoint(-281F, -36F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(-283F, -36F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(-284F, -36F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 1, 44, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 35
		bodyModel[33].setRotationPoint(-247F, -75F, -22F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 30, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 36
		bodyModel[34].setRotationPoint(-252F, -75F, -15F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 37
		bodyModel[35].setRotationPoint(-247F, -75F, 15F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 1F, 0F, -1F); // Box 38
		bodyModel[36].setRotationPoint(-252F, -75F, 8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 40
		bodyModel[37].setRotationPoint(-247F, -75F, -16F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,1F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 41
		bodyModel[38].setRotationPoint(-252F, -75F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[39].setRotationPoint(-253F, -75F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[40].setRotationPoint(-229F, -68F, -23F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[41].setRotationPoint(-205F, -68F, -23F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[42].setRotationPoint(-226F, -68F, -23F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[43].setRotationPoint(-226F, -58F, -23F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[44].setRotationPoint(-212F, -58F, -23F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 48
		bodyModel[45].setRotationPoint(-212F, -68F, -23F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[46].setRotationPoint(-219F, -55F, -23F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[47].setRotationPoint(-219F, -68F, -23F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 51
		bodyModel[48].setRotationPoint(-196F, -68F, -23F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[49].setRotationPoint(-203F, -68F, -23F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[50].setRotationPoint(-203F, -58F, -23F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[51].setRotationPoint(-196F, -58F, -23F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[52].setRotationPoint(-200F, -54F, -23F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[53].setRotationPoint(-200F, -68F, -23F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[54].setRotationPoint(-229F, -68F, 22F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[55].setRotationPoint(-205F, -68F, 22F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[56].setRotationPoint(-226F, -68F, 22F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[57].setRotationPoint(-226F, -58F, 22F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[58].setRotationPoint(-212F, -58F, 22F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 63
		bodyModel[59].setRotationPoint(-212F, -68F, 22F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[60].setRotationPoint(-219F, -55F, 22F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[61].setRotationPoint(-219F, -68F, 22F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 66
		bodyModel[62].setRotationPoint(-196F, -68F, 22F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[63].setRotationPoint(-203F, -68F, 22F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[64].setRotationPoint(-203F, -58F, 22F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[65].setRotationPoint(-196F, -58F, 22F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[66].setRotationPoint(-200F, -54F, 22F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[67].setRotationPoint(-200F, -68F, 22F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 38, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[68].setRotationPoint(-231F, -75F, -22F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 38, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[69].setRotationPoint(-231F, -75F, 12F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 38, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[70].setRotationPoint(-231F, -75F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 24, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[71].setRotationPoint(-217F, -75F, -12F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 24, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[72].setRotationPoint(-217F, -75F, 5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 16, 17, 38, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 133
		bodyModel[73].setRotationPoint(-253F, -53F, -19F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 11, 16, 32, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 134
		bodyModel[74].setRotationPoint(-264F, -53F, -16F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 135
		bodyModel[75].setRotationPoint(-272F, -53F, -13F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 136
		bodyModel[76].setRotationPoint(-278F, -53F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 137
		bodyModel[77].setRotationPoint(-281F, -53F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 138
		bodyModel[78].setRotationPoint(-283F, -53F, -3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 139
		bodyModel[79].setRotationPoint(-284F, -53F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F, -1.2F, 0F, 0F, 0F); // Box 143
		bodyModel[80].setRotationPoint(-250F, -68F, -12F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 1.4F, 0F, 0F, 0F); // Box 144
		bodyModel[81].setRotationPoint(-250F, -68F, 11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 56, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, -18F); // Box 151
		bodyModel[82].setRotationPoint(-123F, -131F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 56, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 152
		bodyModel[83].setRotationPoint(-123F, -131F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 62, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 153
		bodyModel[84].setRotationPoint(-59F, -137F, -3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 62, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, -18F); // Box 154
		bodyModel[85].setRotationPoint(-59F, -137F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 168
		bodyModel[86].setRotationPoint(-247F, -57F, 15F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 1F, 0F, -1F); // Box 169
		bodyModel[87].setRotationPoint(-252F, -57F, 8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[88].setRotationPoint(-253F, -57F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,1F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 171
		bodyModel[89].setRotationPoint(-252F, -57F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 172
		bodyModel[90].setRotationPoint(-247F, -57F, -16F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[91].setRotationPoint(-237F, -57F, -23F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[92].setRotationPoint(-237F, -57F, 22F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F); // Box 260
		bodyModel[93].setRotationPoint(-281F, -54F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 261
		bodyModel[94].setRotationPoint(-284F, -54F, 3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[95].setRotationPoint(-285F, -54F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[96].setRotationPoint(-285F, -54F, -3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[97].setRotationPoint(-284F, -54F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 265
		bodyModel[98].setRotationPoint(-281F, -54F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -4F, 0F, 0F, 0F); // Box 268
		bodyModel[99].setRotationPoint(-268F, -54F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 269
		bodyModel[100].setRotationPoint(-263F, -54F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 270
		bodyModel[101].setRotationPoint(-262F, -54F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[102].setRotationPoint(-262F, -54F, -3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[103].setRotationPoint(-263F, -54F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 273
		bodyModel[104].setRotationPoint(-268F, -54F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 278
		bodyModel[105].setRotationPoint(-278F, -54F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 279
		bodyModel[106].setRotationPoint(-273F, -54F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 280
		bodyModel[107].setRotationPoint(-278F, -54F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 281
		bodyModel[108].setRotationPoint(-273F, -54F, 10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 282
		bodyModel[109].setRotationPoint(-12F, -76F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 283
		bodyModel[110].setRotationPoint(-7F, -76F, 10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F); // Box 284
		bodyModel[111].setRotationPoint(-15F, -76F, 10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 285
		bodyModel[112].setRotationPoint(-18F, -76F, 3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 286
		bodyModel[113].setRotationPoint(-19F, -76F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -4F, 0F, 0F, 0F); // Box 287
		bodyModel[114].setRotationPoint(-2F, -76F, 10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 288
		bodyModel[115].setRotationPoint(3F, -76F, 3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 289
		bodyModel[116].setRotationPoint(4F, -76F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[117].setRotationPoint(4F, -76F, -3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[118].setRotationPoint(3F, -76F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 292
		bodyModel[119].setRotationPoint(-2F, -76F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 293
		bodyModel[120].setRotationPoint(-7F, -76F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 294
		bodyModel[121].setRotationPoint(-12F, -76F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 295
		bodyModel[122].setRotationPoint(-15F, -76F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[123].setRotationPoint(-18F, -76F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[124].setRotationPoint(-19F, -76F, -3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[125].setRotationPoint(-271F, -7F, -12F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 47F, 0F, -14F, -47F, 0F, -14F, -47F, 0F, 14F, 47F, 0F, 14F); // Box 342
		bodyModel[126].setRotationPoint(-224F, -25F, -22F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[127].setRotationPoint(-269F, -7F, -8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 47F, 0F, 14F, -47F, 0F, 14F, -47F, 0F, -14F, 47F, 0F, -14F); // Box 345
		bodyModel[128].setRotationPoint(-224F, -25F, 20F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[129].setRotationPoint(-269F, -7F, 6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 3F, 12F, 0F, 3F, 12F, 0F, -3F, -12F, 0F, -3F); // Box 347
		bodyModel[130].setRotationPoint(-283F, -22F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -3F, 12F, 0F, -3F, 12F, 0F, 3F, -12F, 0F, 3F); // Box 349
		bodyModel[131].setRotationPoint(-283F, -22F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[132].setRotationPoint(-276F, -12F, -13F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[133].setRotationPoint(-276F, -14F, -13F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 352
		bodyModel[134].setRotationPoint(-276F, 0F, -13F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 353
		bodyModel[135].setRotationPoint(-278F, -12F, -13F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[136].setRotationPoint(-264F, -12F, -13F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[137].setRotationPoint(-276F, -12F, 12F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[138].setRotationPoint(-276F, -14F, 12F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 357
		bodyModel[139].setRotationPoint(-276F, 0F, 12F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 358
		bodyModel[140].setRotationPoint(-278F, -12F, 12F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[141].setRotationPoint(-264F, -12F, 12F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F); // Box 360
		bodyModel[142].setRotationPoint(-276F, -12F, 13F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 12, 1, 0F,-4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[143].setRotationPoint(-276F, -12F, -14F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 362
		bodyModel[144].setRotationPoint(-226F, -42F, -5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[145].setRotationPoint(-188F, -74F, -22F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 33, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[146].setRotationPoint(-188F, -69F, -22F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 33, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[147].setRotationPoint(-188F, -69F, 9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 366
		bodyModel[148].setRotationPoint(-188F, -69F, -9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[149].setRotationPoint(-188F, -69F, 4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 33, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[150].setRotationPoint(-146F, -69F, -22F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 369
		bodyModel[151].setRotationPoint(-146F, -69F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[152].setRotationPoint(-146F, -74F, -22F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[153].setRotationPoint(-146F, -69F, 4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 33, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[154].setRotationPoint(-146F, -69F, 9F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 373
		bodyModel[155].setRotationPoint(-226F, -42F, -14F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 374
		bodyModel[156].setRotationPoint(-215F, -42F, -14F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 375
		bodyModel[157].setRotationPoint(-215F, -42F, -5F);

		bodyModel[158].addBox(0F, 0F, 0F, 14, 1, 12, 0F); // Box 376
		bodyModel[158].setRotationPoint(-227F, -43F, -15F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // Box 377
		bodyModel[159].setRotationPoint(-214F, -55F, -15F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[160].setRotationPoint(-218F, -50F, -4F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[161].setRotationPoint(-218F, -50F, -15F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 380
		bodyModel[162].setRotationPoint(-226F, -42F, 4F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 381
		bodyModel[163].setRotationPoint(-226F, -42F, 13F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 382
		bodyModel[164].setRotationPoint(-215F, -42F, 13F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 383
		bodyModel[165].setRotationPoint(-215F, -42F, 4F);

		bodyModel[166].addBox(0F, 0F, 0F, 14, 1, 12, 0F); // Box 384
		bodyModel[166].setRotationPoint(-227F, -43F, 3F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // Box 385
		bodyModel[167].setRotationPoint(-214F, -55F, 3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[168].setRotationPoint(-218F, -50F, 3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[169].setRotationPoint(-218F, -50F, 14F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[170].setRotationPoint(-218F, -50F, 3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[171].setRotationPoint(-227F, -47F, 3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[172].setRotationPoint(-227F, -47F, 14F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[173].setRotationPoint(-227F, -47F, -4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[174].setRotationPoint(-227F, -47F, -15F);

		bodyModel[175].addBox(0F, 0F, 0F, 14, 1, 12, 0F); // Box 394
		bodyModel[175].setRotationPoint(-165F, -43F, -21F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // Box 395
		bodyModel[176].setRotationPoint(-152F, -55F, -21F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 396
		bodyModel[177].setRotationPoint(-153F, -42F, -20F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 397
		bodyModel[178].setRotationPoint(-164F, -42F, -20F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 398
		bodyModel[179].setRotationPoint(-153F, -42F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 399
		bodyModel[180].setRotationPoint(-164F, -42F, -11F);

		bodyModel[181].addBox(0F, 0F, 0F, 6, 23, 12, 0F); // Box 400
		bodyModel[181].setRotationPoint(-186F, -59F, -21F);

		bodyModel[182].addBox(0F, 0F, 0F, 5, 1, 12, 0F); // Box 401
		bodyModel[182].setRotationPoint(-180F, -49F, -21F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 402
		bodyModel[183].setRotationPoint(-180.5F, -57F, -20F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 403
		bodyModel[184].setRotationPoint(-179.5F, -56F, -19F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 404
		bodyModel[185].setRotationPoint(-180F, -55F, -17.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[186].setRotationPoint(-115F, -69F, -16F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 81, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[187].setRotationPoint(-107F, -72F, -16F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[188].setRotationPoint(-112F, -69F, -16F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 97, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[189].setRotationPoint(-115F, -69F, 15F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 81, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[190].setRotationPoint(-107F, -72F, 15F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[191].setRotationPoint(-112F, -69F, 15F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 411
		bodyModel[192].setRotationPoint(-26F, -69F, -16F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 412
		bodyModel[193].setRotationPoint(-26F, -69F, 15F);

		bodyModel[194].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 413
		bodyModel[194].setRotationPoint(-111F, -68F, -22F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 414
		bodyModel[195].setRotationPoint(-108F, -68F, -22F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 415
		bodyModel[196].setRotationPoint(-115F, -68F, -22F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 33, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[197].setRotationPoint(-117F, -69F, -22F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 417
		bodyModel[198].setRotationPoint(-117F, -69F, -9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[199].setRotationPoint(-117F, -74F, -22F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 33, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[200].setRotationPoint(-117F, -69F, 9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[201].setRotationPoint(-117F, -69F, 4F);

		bodyModel[202].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 421
		bodyModel[202].setRotationPoint(-111F, -68F, 8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 422
		bodyModel[203].setRotationPoint(-108F, -68F, 8F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 423
		bodyModel[204].setRotationPoint(-115F, -68F, 8F);

		bodyModel[205].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 424
		bodyModel[205].setRotationPoint(-99F, -68F, 8F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 425
		bodyModel[206].setRotationPoint(-96F, -68F, 8F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 426
		bodyModel[207].setRotationPoint(-103F, -68F, 8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 427
		bodyModel[208].setRotationPoint(-103F, -68F, -22F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 428
		bodyModel[209].setRotationPoint(-99F, -68F, -22F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 429
		bodyModel[210].setRotationPoint(-96F, -68F, -22F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 33, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[211].setRotationPoint(-91F, -69F, 9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[212].setRotationPoint(-91F, -69F, 4F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[213].setRotationPoint(-91F, -74F, -22F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 33, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[214].setRotationPoint(-91F, -69F, -22F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 434
		bodyModel[215].setRotationPoint(-91F, -69F, -9F);

		bodyModel[216].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 435
		bodyModel[216].setRotationPoint(-72F, -68F, 8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 436
		bodyModel[217].setRotationPoint(-76F, -68F, 8F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 437
		bodyModel[218].setRotationPoint(-69F, -68F, 8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 438
		bodyModel[219].setRotationPoint(-81F, -68F, 8F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 439
		bodyModel[220].setRotationPoint(-84F, -68F, 8F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 440
		bodyModel[221].setRotationPoint(-88F, -68F, 8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 441
		bodyModel[222].setRotationPoint(-76F, -68F, -22F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 442
		bodyModel[223].setRotationPoint(-72F, -68F, -22F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 443
		bodyModel[224].setRotationPoint(-69F, -68F, -22F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 444
		bodyModel[225].setRotationPoint(-81F, -68F, -22F);

		bodyModel[226].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 445
		bodyModel[226].setRotationPoint(-84F, -68F, -22F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 446
		bodyModel[227].setRotationPoint(-88F, -68F, -22F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 33, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[228].setRotationPoint(-64F, -69F, -22F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 448
		bodyModel[229].setRotationPoint(-64F, -69F, -9F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[230].setRotationPoint(-64F, -74F, -22F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[231].setRotationPoint(-64F, -69F, 4F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 33, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[232].setRotationPoint(-64F, -69F, 9F);

		bodyModel[233].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 452
		bodyModel[233].setRotationPoint(-57F, -68F, 8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 453
		bodyModel[234].setRotationPoint(-61F, -68F, 8F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 454
		bodyModel[235].setRotationPoint(-54F, -68F, 8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 455
		bodyModel[236].setRotationPoint(-54F, -68F, -22F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 456
		bodyModel[237].setRotationPoint(-57F, -68F, -22F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 457
		bodyModel[238].setRotationPoint(-61F, -68F, -22F);

		bodyModel[239].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 458
		bodyModel[239].setRotationPoint(-45F, -68F, 8F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 459
		bodyModel[240].setRotationPoint(-49F, -68F, 8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 460
		bodyModel[241].setRotationPoint(-42F, -68F, 8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 461
		bodyModel[242].setRotationPoint(-42F, -68F, -22F);

		bodyModel[243].addBox(0F, 0F, 0F, 3, 33, 14, 0F); // Box 462
		bodyModel[243].setRotationPoint(-45F, -68F, -22F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 4, 33, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 463
		bodyModel[244].setRotationPoint(-49F, -68F, -22F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[245].setRotationPoint(-237.5F, -51F, -15F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 465
		bodyModel[246].setRotationPoint(-237.5F, -51F, -14F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[247].setRotationPoint(-237.5F, -51F, -16F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[248].setRotationPoint(-237.5F, -51F, -12F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[249].setRotationPoint(-237.5F, -51F, -11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 469
		bodyModel[250].setRotationPoint(-237.5F, -51F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[251].setRotationPoint(-237.5F, -51F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[252].setRotationPoint(-237.5F, -51F, 0F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 472
		bodyModel[253].setRotationPoint(-237.5F, -51F, 1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[254].setRotationPoint(-237.5F, -47F, -11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[255].setRotationPoint(-237.5F, -47F, -10F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 475
		bodyModel[256].setRotationPoint(-237.5F, -47F, -9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[257].setRotationPoint(-237.5F, -47F, -15F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[258].setRotationPoint(-237.5F, -47F, -14F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 478
		bodyModel[259].setRotationPoint(-237.5F, -47F, -13F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[260].setRotationPoint(-237.5F, -51F, -7F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[261].setRotationPoint(-237.5F, -47F, -6F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[262].setRotationPoint(-232.5F, -52F, -9.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[263].setRotationPoint(-231.5F, -52F, -9.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[264].setRotationPoint(-229.5F, -52F, -11.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 484
		bodyModel[265].setRotationPoint(-229.5F, -51F, -11.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[266].setRotationPoint(-229.5F, -50F, -9.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 486
		bodyModel[267].setRotationPoint(-229.5F, -51F, -7.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[268].setRotationPoint(-229.5F, -53F, -11.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[269].setRotationPoint(-229.5F, -53F, -7.5F);

		bodyModel[270].addShapeBox(0F, -10F, 0F, 5, 10, 2, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[270].setRotationPoint(88F, -63F, -21.5F);
		bodyModel[270].rotateAngleY = 0.03490659F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[271].setRotationPoint(88F, -63F, -21.5F);
		bodyModel[271].rotateAngleY = 0.03490659F;

		bodyModel[272].addShapeBox(5F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[272].setRotationPoint(88F, -63F, -21.5F);
		bodyModel[272].rotateAngleY = 0.03490659F;

		bodyModel[273].addShapeBox(-10F, 0F, 0F, 10, 5, 2, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 487
		bodyModel[273].setRotationPoint(88F, -63F, -21.5F);
		bodyModel[273].rotateAngleY = 0.03490659F;

		bodyModel[274].addShapeBox(0F, 5F, 0F, 5, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 488
		bodyModel[274].setRotationPoint(88F, -63F, -21.5F);
		bodyModel[274].rotateAngleY = 0.03490659F;

		bodyModel[275].addShapeBox(0F, -10F, 0F, 5, 10, 2, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[275].setRotationPoint(88F, -63F, 19.5F);
		bodyModel[275].rotateAngleY = -0.03490659F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[276].setRotationPoint(88F, -63F, 19.5F);
		bodyModel[276].rotateAngleY = -0.03490659F;

		bodyModel[277].addShapeBox(5F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[277].setRotationPoint(88F, -63F, 19.5F);
		bodyModel[277].rotateAngleY = -0.03490659F;

		bodyModel[278].addShapeBox(-10F, 0F, 0F, 10, 5, 2, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 492
		bodyModel[278].setRotationPoint(88F, -63F, 19.5F);
		bodyModel[278].rotateAngleY = -0.03490659F;

		bodyModel[279].addShapeBox(0F, 5F, 0F, 5, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 493
		bodyModel[279].setRotationPoint(88F, -63F, 19.5F);
		bodyModel[279].rotateAngleY = -0.03490659F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 20, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[280].setRotationPoint(-107F, -141F, -272F);
		bodyModel[280].rotateAngleX = -1.57079633F;

		bodyModel[281].addShapeBox(-11F, 0F, 0F, 11, 20, 4, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 499
		bodyModel[281].setRotationPoint(-107F, -141F, -272F);
		bodyModel[281].rotateAngleX = -1.57079633F;

		bodyModel[282].addShapeBox(-20F, -4F, 0F, 9, 28, 4, 0F,0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 504
		bodyModel[282].setRotationPoint(-107F, -141F, -272F);
		bodyModel[282].rotateAngleX = -1.57079633F;

		bodyModel[283].addShapeBox(20F, 0F, 0F, 11, 20, 4, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[283].setRotationPoint(-107F, -141F, -272F);
		bodyModel[283].rotateAngleX = -1.57079633F;

		bodyModel[284].addShapeBox(0F, -4F, 0F, 9, 28, 4, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[284].setRotationPoint(-76F, -141F, -272F);
		bodyModel[284].rotateAngleX = -1.57079633F;
		bodyModel[284].rotateAngleZ = -0.15707963F;

		bodyModel[285].addShapeBox(0F, -11F, 0F, 20, 11, 4, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[285].setRotationPoint(-107F, -141F, -272F);
		bodyModel[285].rotateAngleX = -1.57079633F;

		bodyModel[286].addShapeBox(-4F, -20F, 0F, 28, 9, 4, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[286].setRotationPoint(-107F, -141F, -272F);
		bodyModel[286].rotateAngleX = -1.57079633F;

		bodyModel[287].addShapeBox(-20F, -31F, 0F, 20, 11, 4, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		bodyModel[287].setRotationPoint(-107F, -141F, -272F);
		bodyModel[287].rotateAngleX = -1.57079633F;
		bodyModel[287].rotateAngleY = 3.14159265F;

		bodyModel[288].addShapeBox(-24F, -40F, 0F, 28, 9, 4, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[288].setRotationPoint(-107F, -141F, -272F);
		bodyModel[288].rotateAngleX = -1.57079633F;
		bodyModel[288].rotateAngleY = 3.14159265F;

		bodyModel[289].addShapeBox(0F, 0F, 0F, 20, 20, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[289].setRotationPoint(-107F, -141F, 268F);
		bodyModel[289].rotateAngleX = -1.57079633F;

		bodyModel[290].addShapeBox(-11F, 0F, 0F, 11, 20, 4, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 512
		bodyModel[290].setRotationPoint(-107F, -141F, 268F);
		bodyModel[290].rotateAngleX = -1.57079633F;

		bodyModel[291].addShapeBox(-20F, -4F, 0F, 9, 28, 4, 0F,0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 513
		bodyModel[291].setRotationPoint(-107F, -141F, 268F);
		bodyModel[291].rotateAngleX = -1.57079633F;

		bodyModel[292].addShapeBox(20F, 0F, 0F, 11, 20, 4, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[292].setRotationPoint(-107F, -141F, 268F);
		bodyModel[292].rotateAngleX = -1.57079633F;

		bodyModel[293].addShapeBox(0F, -4F, 0F, 9, 28, 4, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[293].setRotationPoint(-76F, -141F, 268F);
		bodyModel[293].rotateAngleX = -1.57079633F;
		bodyModel[293].rotateAngleZ = -0.15707963F;

		bodyModel[294].addShapeBox(0F, -11F, 0F, 20, 11, 4, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[294].setRotationPoint(-107F, -141F, 268F);
		bodyModel[294].rotateAngleX = -1.57079633F;

		bodyModel[295].addShapeBox(-4F, -20F, 0F, 28, 9, 4, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[295].setRotationPoint(-107F, -141F, 268F);
		bodyModel[295].rotateAngleX = -1.57079633F;

		bodyModel[296].addShapeBox(-20F, -31F, 0F, 20, 11, 4, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[296].setRotationPoint(-107F, -141F, 268F);
		bodyModel[296].rotateAngleX = -1.57079633F;
		bodyModel[296].rotateAngleY = 3.14159265F;

		bodyModel[297].addShapeBox(-24F, -40F, 0F, 28, 9, 4, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[297].setRotationPoint(-107F, -141F, 268F);
		bodyModel[297].rotateAngleX = -1.57079633F;
		bodyModel[297].rotateAngleY = 3.14159265F;

		bodyModel[298].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[298].setRotationPoint(258F, -107F, -72.5F);

		bodyModel[299].addShapeBox(0F, 5F, 0F, 5, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 530
		bodyModel[299].setRotationPoint(258F, -107F, -72.5F);

		bodyModel[300].addShapeBox(-10F, 0F, 0F, 10, 5, 2, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 531
		bodyModel[300].setRotationPoint(258F, -107F, -72.5F);

		bodyModel[301].addShapeBox(0F, -10F, 0F, 5, 10, 2, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[301].setRotationPoint(258F, -107F, -72.5F);

		bodyModel[302].addShapeBox(5F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[302].setRotationPoint(258F, -107F, -72.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[303].setRotationPoint(258F, -107F, 70.5F);

		bodyModel[304].addShapeBox(0F, 5F, 0F, 5, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 535
		bodyModel[304].setRotationPoint(258F, -107F, 70.5F);

		bodyModel[305].addShapeBox(-10F, 0F, 0F, 10, 5, 2, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 536
		bodyModel[305].setRotationPoint(258F, -107F, 70.5F);

		bodyModel[306].addShapeBox(0F, -10F, 0F, 5, 10, 2, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[306].setRotationPoint(258F, -107F, 70.5F);

		bodyModel[307].addShapeBox(5F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[307].setRotationPoint(258F, -107F, 70.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		tailModel[1] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 41
		tailModel[2] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 42
		tailModel[3] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 114
		tailModel[4] = new ModelRendererTurbo(this, 1713, 105, textureX, textureY); // Box 115
		tailModel[5] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 116
		tailModel[6] = new ModelRendererTurbo(this, 1713, 193, textureX, textureY); // Box 117
		tailModel[7] = new ModelRendererTurbo(this, 1393, 105, textureX, textureY); // Box 118
		tailModel[8] = new ModelRendererTurbo(this, 1489, 105, textureX, textureY); // Box 119
		tailModel[9] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 120
		tailModel[10] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Box 121
		tailModel[11] = new ModelRendererTurbo(this, 1265, 121, textureX, textureY); // Box 145
		tailModel[12] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 146
		tailModel[13] = new ModelRendererTurbo(this, 1145, 137, textureX, textureY); // Box 148
		tailModel[14] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 149
		tailModel[15] = new ModelRendererTurbo(this, 1865, 89, textureX, textureY); // Box 155
		tailModel[16] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 156
		tailModel[17] = new ModelRendererTurbo(this, 2041, 105, textureX, textureY); // Box 157
		tailModel[18] = new ModelRendererTurbo(this, 1113, 113, textureX, textureY); // Box 158

		tailModel[0].addShapeBox(0F, 0F, 0F, 209, 38, 46, 0F,0F, 0F, 0F, 0F, 6F, -6F, 0F, 6F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, -6F, 0F, -21F, -6F, 0F, 0F, 0F); // Box 0
		tailModel[0].setRotationPoint(26F, -75F, -23F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 18, 23, 34, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 41
		tailModel[1].setRotationPoint(235F, -81F, -17F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 33, 1, 82, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 42
		tailModel[2].setRotationPoint(229F, -82F, 0F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 25, 20, 32, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -4F, 0F, -18F, -4F, 0F, 0F, 0F); // Box 114
		tailModel[3].setRotationPoint(253F, -82F, -16F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 33, 1, 82, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		tailModel[4].setRotationPoint(229F, -82F, -82F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 33, 1, 82, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		tailModel[5].setRotationPoint(229F, -126F, -82F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 33, 1, 82, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 117
		tailModel[6].setRotationPoint(229F, -126F, 0F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 21, 1, 23, 0F,-19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		tailModel[7].setRotationPoint(241F, -126F, -105F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 21, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F); // Box 119
		tailModel[8].setRotationPoint(241F, -126F, 82F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 21, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F); // Box 120
		tailModel[9].setRotationPoint(241F, -82F, 82F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 21, 1, 23, 0F,-19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		tailModel[10].setRotationPoint(241F, -82F, -105F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 31, 43, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		tailModel[11].setRotationPoint(245F, -125F, -72F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 9, 43, 1, 0F,0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F); // Box 146
		tailModel[12].setRotationPoint(236F, -125F, -72F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 31, 43, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		tailModel[13].setRotationPoint(245F, -125F, 71F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 9, 43, 1, 0F,0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F); // Box 149
		tailModel[14].setRotationPoint(236F, -125F, 71F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 1, 43, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		tailModel[15].setRotationPoint(241F, -125F, -34F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 1, 43, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		tailModel[16].setRotationPoint(241F, -125F, 33F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 1, 43, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		tailModel[17].setRotationPoint(260F, -125F, 33F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 1, 43, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		tailModel[18].setRotationPoint(260F, -125F, -34F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 82
		leftWingModel[1] = new ModelRendererTurbo(this, 1713, 89, textureX, textureY); // Box 83
		leftWingModel[2] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 84
		leftWingModel[3] = new ModelRendererTurbo(this, 1145, 425, textureX, textureY); // Box 85
		leftWingModel[4] = new ModelRendererTurbo(this, 1585, 425, textureX, textureY); // Box 87
		leftWingModel[5] = new ModelRendererTurbo(this, 497, 449, textureX, textureY); // Box 88
		leftWingModel[6] = new ModelRendererTurbo(this, 1201, 57, textureX, textureY); // Box 89
		leftWingModel[7] = new ModelRendererTurbo(this, 841, 449, textureX, textureY); // Box 90
		leftWingModel[8] = new ModelRendererTurbo(this, 1385, 1097, textureX, textureY); // Box 104
		leftWingModel[9] = new ModelRendererTurbo(this, 1, 1121, textureX, textureY); // Box 105
		leftWingModel[10] = new ModelRendererTurbo(this, 97, 1121, textureX, textureY); // Box 106
		leftWingModel[11] = new ModelRendererTurbo(this, 441, 1305, textureX, textureY); // Box 107
		leftWingModel[12] = new ModelRendererTurbo(this, 1193, 1305, textureX, textureY); // Box 108
		leftWingModel[13] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 166
		leftWingModel[14] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 167
		leftWingModel[15] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 168
		leftWingModel[16] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 169
		leftWingModel[17] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 170
		leftWingModel[18] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Box 171
		leftWingModel[19] = new ModelRendererTurbo(this, 641, 289, textureX, textureY); // Box 209
		leftWingModel[20] = new ModelRendererTurbo(this, 849, 289, textureX, textureY); // Box 210
		leftWingModel[21] = new ModelRendererTurbo(this, 1361, 313, textureX, textureY); // Box 211
		leftWingModel[22] = new ModelRendererTurbo(this, 1393, 249, textureX, textureY); // Box 212
		leftWingModel[23] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 213
		leftWingModel[24] = new ModelRendererTurbo(this, 1145, 321, textureX, textureY); // Box 214
		leftWingModel[25] = new ModelRendererTurbo(this, 1713, 321, textureX, textureY); // Box 215
		leftWingModel[26] = new ModelRendererTurbo(this, 1865, 241, textureX, textureY); // Box 216
		leftWingModel[27] = new ModelRendererTurbo(this, 1865, 249, textureX, textureY); // Box 217
		leftWingModel[28] = new ModelRendererTurbo(this, 657, 201, textureX, textureY); // Box 218
		leftWingModel[29] = new ModelRendererTurbo(this, 1865, 193, textureX, textureY); // Box 219
		leftWingModel[30] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 220
		leftWingModel[31] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 221
		leftWingModel[32] = new ModelRendererTurbo(this, 1465, 105, textureX, textureY); // Box 222
		leftWingModel[33] = new ModelRendererTurbo(this, 961, 209, textureX, textureY); // Box 223
		leftWingModel[34] = new ModelRendererTurbo(this, 1033, 169, textureX, textureY); // Box 224
		leftWingModel[35] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 225
		leftWingModel[36] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 226
		leftWingModel[37] = new ModelRendererTurbo(this, 641, 337, textureX, textureY); // Box 243
		leftWingModel[38] = new ModelRendererTurbo(this, 737, 337, textureX, textureY); // Box 244
		leftWingModel[39] = new ModelRendererTurbo(this, 729, 201, textureX, textureY); // Box 245
		leftWingModel[40] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 246
		leftWingModel[41] = new ModelRendererTurbo(this, 1713, 337, textureX, textureY); // Box 247
		leftWingModel[42] = new ModelRendererTurbo(this, 1817, 337, textureX, textureY); // Box 248
		leftWingModel[43] = new ModelRendererTurbo(this, 1913, 337, textureX, textureY); // Box 249
		leftWingModel[44] = new ModelRendererTurbo(this, 1865, 177, textureX, textureY); // Box 250
		leftWingModel[45] = new ModelRendererTurbo(this, 1033, 209, textureX, textureY); // Box 251
		leftWingModel[46] = new ModelRendererTurbo(this, 1513, 177, textureX, textureY); // Box 252
		leftWingModel[47] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 253
		leftWingModel[48] = new ModelRendererTurbo(this, 1145, 185, textureX, textureY); // Box 254
		leftWingModel[49] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 255
		leftWingModel[50] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 256
		leftWingModel[51] = new ModelRendererTurbo(this, 1713, 193, textureX, textureY); // Box 257
		leftWingModel[52] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 258
		leftWingModel[53] = new ModelRendererTurbo(this, 1497, 57, textureX, textureY); // Box 307
		leftWingModel[54] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 308
		leftWingModel[55] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 309
		leftWingModel[56] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 310
		leftWingModel[57] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 311
		leftWingModel[58] = new ModelRendererTurbo(this, 1761, 193, textureX, textureY); // Box 312
		leftWingModel[59] = new ModelRendererTurbo(this, 1777, 193, textureX, textureY); // Box 313
		leftWingModel[60] = new ModelRendererTurbo(this, 1713, 209, textureX, textureY); // Box 314
		leftWingModel[61] = new ModelRendererTurbo(this, 1729, 209, textureX, textureY); // Box 315
		leftWingModel[62] = new ModelRendererTurbo(this, 1081, 113, textureX, textureY); // Box 316
		leftWingModel[63] = new ModelRendererTurbo(this, 1097, 113, textureX, textureY); // Box 317
		leftWingModel[64] = new ModelRendererTurbo(this, 1873, 121, textureX, textureY); // Box 318
		leftWingModel[65] = new ModelRendererTurbo(this, 1889, 121, textureX, textureY); // Box 319
		leftWingModel[66] = new ModelRendererTurbo(this, 1905, 73, textureX, textureY); // Box 342
		leftWingModel[67] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 343
		leftWingModel[68] = new ModelRendererTurbo(this, 41, 265, textureX, textureY); // Box 344
		leftWingModel[69] = new ModelRendererTurbo(this, 1145, 257, textureX, textureY); // Box 345
		leftWingModel[70] = new ModelRendererTurbo(this, 121, 265, textureX, textureY); // Box 346
		leftWingModel[71] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 347
		leftWingModel[72] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 348
		leftWingModel[73] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Box 349
		leftWingModel[74] = new ModelRendererTurbo(this, 1553, 265, textureX, textureY); // Box 350
		leftWingModel[75] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 351
		leftWingModel[76] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 352
		leftWingModel[77] = new ModelRendererTurbo(this, 1225, 81, textureX, textureY); // Box 353
		leftWingModel[78] = new ModelRendererTurbo(this, 553, 233, textureX, textureY); // Box 354
		leftWingModel[79] = new ModelRendererTurbo(this, 433, 273, textureX, textureY); // Box 355
		leftWingModel[80] = new ModelRendererTurbo(this, 2017, 273, textureX, textureY); // Box 356
		leftWingModel[81] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 357
		leftWingModel[82] = new ModelRendererTurbo(this, 241, 297, textureX, textureY); // Box 358
		leftWingModel[83] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 359
		leftWingModel[84] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Box 360
		leftWingModel[85] = new ModelRendererTurbo(this, 1713, 281, textureX, textureY); // Box 361
		leftWingModel[86] = new ModelRendererTurbo(this, 1745, 233, textureX, textureY); // Box 362
		leftWingModel[87] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 363

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 55, 11, 320, 0F,-26F, 10F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -26F, -10F, 0F, 0F, -16F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 82
		leftWingModel[0].setRotationPoint(-100F, -32F, -347F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 55, 11, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -5F, 0F); // Box 83
		leftWingModel[1].setRotationPoint(-100F, -32F, -27F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 59, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 84
		leftWingModel[2].setRotationPoint(-159F, -32F, -27F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 59, 11, 320, 0F,-17F, 10F, 0F, 26F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, -10F, 0F, 26F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		leftWingModel[3].setRotationPoint(-159F, -32F, -347F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 68, 11, 161, 0F,-14F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		leftWingModel[4].setRotationPoint(-142F, -42F, -508F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 10, 11, 320, 0F,-17F, 4F, 0F, 17F, 10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -17F, -15F, 0F, 17F, -10F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 88
		leftWingModel[5].setRotationPoint(-169F, -32F, -347F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 10, 11, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F); // Box 89
		leftWingModel[6].setRotationPoint(-169F, -32F, -27F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 10, 11, 161, 0F,-14F, 0F, 0F, 14F, 5F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, -14F, -11F, 0F, 14F, -6F, 0F, 0F, -1F, 0F, 0F, -6F, 0F); // Box 90
		leftWingModel[7].setRotationPoint(-152F, -41F, -508F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 61, 11, 196, 0F,-14F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		leftWingModel[8].setRotationPoint(-134F, -140F, -516F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 10, 11, 196, 0F,-14F, -11F, 0F, 14F, -6F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, -14F, 0F, 0F, 14F, 5F, 0F, 0F, 1F, 0F, 0F, -5F, 0F); // Box 105
		leftWingModel[9].setRotationPoint(-144F, -141F, -516F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 10, 11, 320, 0F,-17F, -7F, 0F, 17F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -17F, -4F, 0F, 17F, 2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 106
		leftWingModel[10].setRotationPoint(-161F, -142F, -320F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 52, 11, 320, 0F,-17F, -2F, 0F, 26F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 2F, 0F, 26F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		leftWingModel[11].setRotationPoint(-151F, -142F, -320F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 55, 11, 320, 0F,-26F, -2F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -26F, 2F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 108
		leftWingModel[12].setRotationPoint(-99F, -142F, -320F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 2, 93, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		leftWingModel[13].setRotationPoint(-126F, -130F, -220F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 2, 93, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftWingModel[14].setRotationPoint(-126F, -130F, -343F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 2, 86, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		leftWingModel[15].setRotationPoint(-118F, -130F, -500F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 2, 86, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		leftWingModel[16].setRotationPoint(-86F, -130F, -500F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 2, 93, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		leftWingModel[17].setRotationPoint(-83F, -130F, -343F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 2, 93, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		leftWingModel[18].setRotationPoint(-83F, -130F, -220F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 85, 9, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		leftWingModel[19].setRotationPoint(-158F, -74F, -119F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 85, 5, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 210
		leftWingModel[20].setRotationPoint(-158F, -79F, -116F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 85, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 211
		leftWingModel[21].setRotationPoint(-158F, -83F, -112F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 85, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 212
		leftWingModel[22].setRotationPoint(-158F, -86F, -106F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 85, 5, 31, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		leftWingModel[23].setRotationPoint(-158F, -65F, -116F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 85, 4, 23, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		leftWingModel[24].setRotationPoint(-158F, -60F, -112F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 85, 3, 11, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		leftWingModel[25].setRotationPoint(-158F, -56F, -106F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 85, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 216
		leftWingModel[26].setRotationPoint(-158F, -87F, -103F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 85, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		leftWingModel[27].setRotationPoint(-158F, -53F, -103F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 17, 9, 37, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 218
		leftWingModel[28].setRotationPoint(-175F, -74F, -119F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 17, 5, 31, 0F,0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 1F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, -2F); // Box 219
		leftWingModel[29].setRotationPoint(-175F, -79F, -116F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 17, 4, 23, 0F,0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, 2F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 2F, -1F); // Box 220
		leftWingModel[30].setRotationPoint(-175F, -83F, -112F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 17, 3, 11, 0F,0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, 4F, 1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 4F, 1F); // Box 221
		leftWingModel[31].setRotationPoint(-175F, -86F, -106F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, -6.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.75F, -1.5F, 0F, 6F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 0F); // Box 222
		leftWingModel[32].setRotationPoint(-175F, -87F, -103F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 17, 5, 31, 0F,0F, 1F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, -2F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 223
		leftWingModel[33].setRotationPoint(-175F, -65F, -116F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 17, 4, 23, 0F,0F, 2F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 2F, -1F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F); // Box 224
		leftWingModel[34].setRotationPoint(-175F, -60F, -112F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 17, 3, 11, 0F,0F, 4F, 1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 4F, 1F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F); // Box 225
		leftWingModel[35].setRotationPoint(-175F, -56F, -106F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, 6F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 0F, 0F, -6.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.75F, -1.5F); // Box 226
		leftWingModel[36].setRotationPoint(-175F, -53F, -103F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 30, 5, 31, 0F,0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 3F); // Box 243
		leftWingModel[37].setRotationPoint(-73F, -79F, -116F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 30, 4, 23, 0F,0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 4F); // Box 244
		leftWingModel[38].setRotationPoint(-73F, -83F, -112F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 30, 3, 11, 0F,0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 0F, 6F); // Box 245
		leftWingModel[39].setRotationPoint(-73F, -86F, -106F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 30, 1, 5, 0F,0F, 0F, 0F, 0F, -6.75F, -1.5F, 0F, -6.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 3F); // Box 246
		leftWingModel[40].setRotationPoint(-73F, -87F, -103F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 30, 9, 37, 0F,0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 247
		leftWingModel[41].setRotationPoint(-73F, -74F, -119F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 30, 5, 31, 0F,0F, 0F, 3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F); // Box 248
		leftWingModel[42].setRotationPoint(-73F, -65F, -116F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 30, 4, 23, 0F,0F, 0F, 4F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F); // Box 249
		leftWingModel[43].setRotationPoint(-73F, -60F, -112F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 30, 1, 5, 0F,0F, 0F, 3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -6.75F, -1.5F, 0F, -6.75F, -1.5F, 0F, 0F, 0F); // Box 250
		leftWingModel[44].setRotationPoint(-73F, -53F, -103F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 30, 3, 11, 0F,0F, 0F, 6F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F); // Box 251
		leftWingModel[45].setRotationPoint(-73F, -56F, -106F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 12, 7, 27, 0F,0F, -2F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -9F); // Box 252
		leftWingModel[46].setRotationPoint(-187F, -73F, -114F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 12, 3, 13, 0F,0F, -3F, -3F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, -3F, -3F, 0F, 1F, -2F, 0F, -1F, 7F, 0F, -1F, 7F, 0F, 1F, -2F); // Box 253
		leftWingModel[47].setRotationPoint(-187F, -75F, -107F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F,0F, -3F, -4F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -3F, -4F, 0F, 1F, -2F, 0F, -4F, 5F, 0F, -4F, 5F, 0F, 1F, -2F); // Box 254
		leftWingModel[48].setRotationPoint(-187F, -76F, -106F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, -2.75F, -1F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, -2.75F, -1F, 0F, 0F, 0F, 0F, -6F, 5F, 0F, -6F, 5F, 0F, 0F, 0F); // Box 255
		leftWingModel[49].setRotationPoint(-187F, -76F, -102F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 12, 3, 13, 0F,0F, 1F, -2F, 0F, -1F, 7F, 0F, -1F, 7F, 0F, 1F, -2F, 0F, -3F, -3F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, -3F, -3F); // Box 256
		leftWingModel[50].setRotationPoint(-187F, -67F, -107F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F,0F, 1F, -2F, 0F, -4F, 5F, 0F, -4F, 5F, 0F, 1F, -2F, 0F, -3F, -4F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -3F, -4F); // Box 257
		leftWingModel[51].setRotationPoint(-187F, -66F, -106F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, 0F, 0F, -6F, 5F, 0F, -6F, 5F, 0F, 0F, 0F, 0F, -2.75F, -1F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, -2.75F, -1F); // Box 258
		leftWingModel[52].setRotationPoint(-187F, -66F, -102F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, 2F, -27F, 0F, 2F, -27F, 0F, -2F, 27F, 0F, -2F); // Box 307
		leftWingModel[53].setRotationPoint(-87F, -25F, -116F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		leftWingModel[54].setRotationPoint(-114F, -2F, -118F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, -2F, -27F, 0F, -2F, -27F, 0F, 2F, 27F, 0F, 2F); // Box 309
		leftWingModel[55].setRotationPoint(-87F, -25F, -87F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -2F, 27F, 0F, -2F, 27F, 0F, 2F, -27F, 0F, 2F); // Box 310
		leftWingModel[56].setRotationPoint(-141F, -25F, -87F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 2F, 27F, 0F, 2F, 27F, 0F, -2F, -27F, 0F, -2F); // Box 311
		leftWingModel[57].setRotationPoint(-141F, -25F, -116F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 2, 48, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 312
		leftWingModel[58].setRotationPoint(-146F, -131F, -90F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 2, 48, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 313
		leftWingModel[59].setRotationPoint(-146F, -131F, -113F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 2, 48, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 314
		leftWingModel[60].setRotationPoint(-79F, -131F, -113F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 2, 48, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 315
		leftWingModel[61].setRotationPoint(-79F, -131F, -90F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		leftWingModel[62].setRotationPoint(-79F, -58F, -113F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		leftWingModel[63].setRotationPoint(-79F, -58F, -90F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		leftWingModel[64].setRotationPoint(-146F, -58F, -113F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		leftWingModel[65].setRotationPoint(-146F, -58F, -90F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		leftWingModel[66].setRotationPoint(-114F, -2F, -121F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 4, 22, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		leftWingModel[67].setRotationPoint(-115F, -12F, -134F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 3, 20, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 344
		leftWingModel[68].setRotationPoint(-108F, -11F, -134F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 2, 16, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 345
		leftWingModel[69].setRotationPoint(-105F, -9F, -134F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 3, 22, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 346
		leftWingModel[70].setRotationPoint(-111F, -12F, -134F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 347
		leftWingModel[71].setRotationPoint(-103F, -6F, -134F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 348
		leftWingModel[72].setRotationPoint(-124F, -6F, -134F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 2, 16, 13, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 349
		leftWingModel[73].setRotationPoint(-123F, -9F, -134F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 3, 20, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 350
		leftWingModel[74].setRotationPoint(-121F, -11F, -134F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 3, 22, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 351
		leftWingModel[75].setRotationPoint(-118F, -12F, -134F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F); // Box 352
		leftWingModel[76].setRotationPoint(-115F, -3F, -136F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		leftWingModel[77].setRotationPoint(-114F, -2F, -83F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 354
		leftWingModel[78].setRotationPoint(-124F, -6F, -80F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 3, 20, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 355
		leftWingModel[79].setRotationPoint(-121F, -11F, -80F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 2, 16, 13, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 356
		leftWingModel[80].setRotationPoint(-123F, -9F, -80F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 3, 22, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 357
		leftWingModel[81].setRotationPoint(-118F, -12F, -80F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 4, 22, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		leftWingModel[82].setRotationPoint(-115F, -12F, -80F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 3, 22, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 359
		leftWingModel[83].setRotationPoint(-111F, -12F, -80F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 3, 20, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 360
		leftWingModel[84].setRotationPoint(-108F, -11F, -80F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 2, 16, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 361
		leftWingModel[85].setRotationPoint(-105F, -9F, -80F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 362
		leftWingModel[86].setRotationPoint(-103F, -6F, -80F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,3F, 3F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		leftWingModel[87].setRotationPoint(-115F, -3F, -67F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 72
		rightWingModel[1] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 73
		rightWingModel[2] = new ModelRendererTurbo(this, 1465, 89, textureX, textureY); // Box 74
		rightWingModel[3] = new ModelRendererTurbo(this, 1273, 89, textureX, textureY); // Box 75
		rightWingModel[4] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 77
		rightWingModel[5] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 78
		rightWingModel[6] = new ModelRendererTurbo(this, 1897, 49, textureX, textureY); // Box 79
		rightWingModel[7] = new ModelRendererTurbo(this, 1209, 105, textureX, textureY); // Box 81
		rightWingModel[8] = new ModelRendererTurbo(this, 1, 761, textureX, textureY); // Box 92
		rightWingModel[9] = new ModelRendererTurbo(this, 969, 761, textureX, textureY); // Box 93
		rightWingModel[10] = new ModelRendererTurbo(this, 1065, 761, textureX, textureY); // Box 94
		rightWingModel[11] = new ModelRendererTurbo(this, 201, 785, textureX, textureY); // Box 95
		rightWingModel[12] = new ModelRendererTurbo(this, 633, 969, textureX, textureY); // Box 96
		rightWingModel[13] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 159
		rightWingModel[14] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 161
		rightWingModel[15] = new ModelRendererTurbo(this, 1977, 137, textureX, textureY); // Box 162
		rightWingModel[16] = new ModelRendererTurbo(this, 1993, 137, textureX, textureY); // Box 163
		rightWingModel[17] = new ModelRendererTurbo(this, 2009, 137, textureX, textureY); // Box 164
		rightWingModel[18] = new ModelRendererTurbo(this, 2025, 137, textureX, textureY); // Box 165
		rightWingModel[19] = new ModelRendererTurbo(this, 1161, 57, textureX, textureY); // Box 157
		rightWingModel[20] = new ModelRendererTurbo(this, 1121, 17, textureX, textureY); // Box 159
		rightWingModel[21] = new ModelRendererTurbo(this, 1329, 57, textureX, textureY); // Box 161
		rightWingModel[22] = new ModelRendererTurbo(this, 1345, 57, textureX, textureY); // Box 162
		rightWingModel[23] = new ModelRendererTurbo(this, 1377, 57, textureX, textureY); // Box 163
		rightWingModel[24] = new ModelRendererTurbo(this, 433, 273, textureX, textureY); // Box 167
		rightWingModel[25] = new ModelRendererTurbo(this, 1145, 281, textureX, textureY); // Box 184
		rightWingModel[26] = new ModelRendererTurbo(this, 1145, 209, textureX, textureY); // Box 185
		rightWingModel[27] = new ModelRendererTurbo(this, 1393, 225, textureX, textureY); // Box 186
		rightWingModel[28] = new ModelRendererTurbo(this, 1713, 281, textureX, textureY); // Box 187
		rightWingModel[29] = new ModelRendererTurbo(this, 1353, 281, textureX, textureY); // Box 188
		rightWingModel[30] = new ModelRendererTurbo(this, 1145, 241, textureX, textureY); // Box 189
		rightWingModel[31] = new ModelRendererTurbo(this, 1865, 233, textureX, textureY); // Box 190
		rightWingModel[32] = new ModelRendererTurbo(this, 1393, 241, textureX, textureY); // Box 191
		rightWingModel[33] = new ModelRendererTurbo(this, 657, 153, textureX, textureY); // Box 196
		rightWingModel[34] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Box 197
		rightWingModel[35] = new ModelRendererTurbo(this, 1393, 137, textureX, textureY); // Box 198
		rightWingModel[36] = new ModelRendererTurbo(this, 1513, 137, textureX, textureY); // Box 199
		rightWingModel[37] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 200
		rightWingModel[38] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 205
		rightWingModel[39] = new ModelRendererTurbo(this, 1713, 137, textureX, textureY); // Box 206
		rightWingModel[40] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Box 207
		rightWingModel[41] = new ModelRendererTurbo(this, 1329, 89, textureX, textureY); // Box 208
		rightWingModel[42] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 227
		rightWingModel[43] = new ModelRendererTurbo(this, 1921, 257, textureX, textureY); // Box 228
		rightWingModel[44] = new ModelRendererTurbo(this, 1265, 169, textureX, textureY); // Box 229
		rightWingModel[45] = new ModelRendererTurbo(this, 513, 153, textureX, textureY); // Box 230
		rightWingModel[46] = new ModelRendererTurbo(this, 1913, 289, textureX, textureY); // Box 231
		rightWingModel[47] = new ModelRendererTurbo(this, 857, 329, textureX, textureY); // Box 232
		rightWingModel[48] = new ModelRendererTurbo(this, 953, 329, textureX, textureY); // Box 233
		rightWingModel[49] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Box 234
		rightWingModel[50] = new ModelRendererTurbo(this, 1265, 185, textureX, textureY); // Box 235
		rightWingModel[51] = new ModelRendererTurbo(this, 1393, 169, textureX, textureY); // Box 236
		rightWingModel[52] = new ModelRendererTurbo(this, 1513, 153, textureX, textureY); // Box 237
		rightWingModel[53] = new ModelRendererTurbo(this, 1465, 113, textureX, textureY); // Box 238
		rightWingModel[54] = new ModelRendererTurbo(this, 1201, 73, textureX, textureY); // Box 239
		rightWingModel[55] = new ModelRendererTurbo(this, 513, 169, textureX, textureY); // Box 240
		rightWingModel[56] = new ModelRendererTurbo(this, 1713, 169, textureX, textureY); // Box 241
		rightWingModel[57] = new ModelRendererTurbo(this, 1873, 73, textureX, textureY); // Box 242
		rightWingModel[58] = new ModelRendererTurbo(this, 1217, 121, textureX, textureY); // Box 298
		rightWingModel[59] = new ModelRendererTurbo(this, 569, 169, textureX, textureY); // Box 300
		rightWingModel[60] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 301
		rightWingModel[61] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 302
		rightWingModel[62] = new ModelRendererTurbo(this, 1393, 57, textureX, textureY); // Box 303
		rightWingModel[63] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 304
		rightWingModel[64] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 305
		rightWingModel[65] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Box 306
		rightWingModel[66] = new ModelRendererTurbo(this, 1881, 65, textureX, textureY); // Box 320
		rightWingModel[67] = new ModelRendererTurbo(this, 1937, 121, textureX, textureY); // Box 321
		rightWingModel[68] = new ModelRendererTurbo(this, 657, 153, textureX, textureY); // Box 322
		rightWingModel[69] = new ModelRendererTurbo(this, 961, 161, textureX, textureY); // Box 323
		rightWingModel[70] = new ModelRendererTurbo(this, 1937, 177, textureX, textureY); // Box 324
		rightWingModel[71] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 325
		rightWingModel[72] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 326
		rightWingModel[73] = new ModelRendererTurbo(this, 1865, 193, textureX, textureY); // Box 327
		rightWingModel[74] = new ModelRendererTurbo(this, 657, 201, textureX, textureY); // Box 328
		rightWingModel[75] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 329
		rightWingModel[76] = new ModelRendererTurbo(this, 1897, 65, textureX, textureY); // Box 330
		rightWingModel[77] = new ModelRendererTurbo(this, 1913, 65, textureX, textureY); // Box 331
		rightWingModel[78] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 332
		rightWingModel[79] = new ModelRendererTurbo(this, 513, 217, textureX, textureY); // Box 333
		rightWingModel[80] = new ModelRendererTurbo(this, 961, 209, textureX, textureY); // Box 334
		rightWingModel[81] = new ModelRendererTurbo(this, 769, 217, textureX, textureY); // Box 335
		rightWingModel[82] = new ModelRendererTurbo(this, 1065, 225, textureX, textureY); // Box 336
		rightWingModel[83] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Box 337
		rightWingModel[84] = new ModelRendererTurbo(this, 241, 257, textureX, textureY); // Box 338
		rightWingModel[85] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 339
		rightWingModel[86] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Box 340
		rightWingModel[87] = new ModelRendererTurbo(this, 2033, 73, textureX, textureY); // Box 341
		rightWingModel[88] = new ModelRendererTurbo(this, 1833, 89, textureX, textureY); // Box 364
		rightWingModel[89] = new ModelRendererTurbo(this, 1849, 89, textureX, textureY); // Box 365
		rightWingModel[90] = new ModelRendererTurbo(this, 1873, 89, textureX, textureY); // Box 336
		rightWingModel[91] = new ModelRendererTurbo(this, 1897, 89, textureX, textureY); // Box 337
		rightWingModel[92] = new ModelRendererTurbo(this, 2033, 89, textureX, textureY); // Box 338

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 55, 11, 320, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, -26F, 10F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -16F, 0F, -26F, -10F, 0F); // Box 72
		rightWingModel[0].setRotationPoint(-100F, -32F, 27F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 55, 11, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 73
		rightWingModel[1].setRotationPoint(-100F, -32F, 23F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 59, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightWingModel[2].setRotationPoint(-159F, -32F, 23F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 59, 11, 320, 0F,0F, 0F, 0F, 0F, 0F, 0F, 26F, 10F, 0F, -17F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 26F, -10F, 0F, -17F, -10F, 0F); // Box 75
		rightWingModel[3].setRotationPoint(-159F, -32F, 27F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 68, 11, 161, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -14F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -14F, -5F, 0F); // Box 77
		rightWingModel[4].setRotationPoint(-142F, -42F, 347F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 10, 11, 320, 0F,0F, -5F, 0F, 0F, 0F, 0F, 17F, 10F, 0F, -17F, 4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 17F, -10F, 0F, -17F, -15F, 0F); // Box 78
		rightWingModel[5].setRotationPoint(-169F, -32F, 27F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 10, 11, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 79
		rightWingModel[6].setRotationPoint(-169F, -32F, 23F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 10, 11, 161, 0F,0F, -5F, 0F, 0F, 1F, 0F, 14F, 5F, 0F, -14F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 14F, -6F, 0F, -14F, -11F, 0F); // Box 81
		rightWingModel[7].setRotationPoint(-152F, -41F, 347F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 61, 11, 196, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -14F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -14F, 4F, 0F); // Box 92
		rightWingModel[8].setRotationPoint(-134F, -140F, 320F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 10, 11, 196, 0F,0F, -6F, 0F, 0F, -1F, 0F, 14F, -6F, 0F, -14F, -11F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 14F, 5F, 0F, -14F, 0F, 0F); // Box 93
		rightWingModel[9].setRotationPoint(-144F, -141F, 320F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 10, 11, 320, 0F,0F, -5F, 0F, 0F, 0F, 0F, 17F, -2F, 0F, -17F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 17F, 2F, 0F, -17F, -4F, 0F); // Box 94
		rightWingModel[10].setRotationPoint(-161F, -142F, 0F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 52, 11, 320, 0F,0F, 0F, 0F, 0F, 0F, 0F, 26F, -2F, 0F, -17F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 26F, 2F, 0F, -17F, 2F, 0F); // Box 95
		rightWingModel[11].setRotationPoint(-151F, -142F, 0F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 55, 11, 320, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, -26F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, -26F, 2F, 0F); // Box 96
		rightWingModel[12].setRotationPoint(-99F, -142F, 0F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 2, 93, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		rightWingModel[13].setRotationPoint(-126F, -130F, 218F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 2, 93, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		rightWingModel[14].setRotationPoint(-126F, -130F, 341F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 2, 86, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		rightWingModel[15].setRotationPoint(-118F, -130F, 498F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 2, 86, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rightWingModel[16].setRotationPoint(-86F, -130F, 498F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 2, 93, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		rightWingModel[17].setRotationPoint(-83F, -130F, 341F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 2, 93, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		rightWingModel[18].setRotationPoint(-83F, -130F, 218F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, -2F, -27F, 0F, -2F, -27F, 0F, 2F, 27F, 0F, 2F); // Box 157
		rightWingModel[19].setRotationPoint(-87F, -25F, 114F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		rightWingModel[20].setRotationPoint(-114F, -2F, 83F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, 2F, -27F, 0F, 2F, -27F, 0F, -2F, 27F, 0F, -2F); // Box 161
		rightWingModel[21].setRotationPoint(-87F, -25F, 85F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 2F, 27F, 0F, 2F, 27F, 0F, -2F, -27F, 0F, -2F); // Box 162
		rightWingModel[22].setRotationPoint(-141F, -25F, 85F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -2F, 27F, 0F, -2F, 27F, 0F, 2F, -27F, 0F, 2F); // Box 163
		rightWingModel[23].setRotationPoint(-141F, -25F, 114F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 85, 9, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		rightWingModel[24].setRotationPoint(-158F, -74F, 82F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 85, 5, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 184
		rightWingModel[25].setRotationPoint(-158F, -79F, 85F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 85, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 185
		rightWingModel[26].setRotationPoint(-158F, -83F, 89F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 85, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 186
		rightWingModel[27].setRotationPoint(-158F, -86F, 95F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 85, 5, 31, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		rightWingModel[28].setRotationPoint(-158F, -65F, 85F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 85, 4, 23, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		rightWingModel[29].setRotationPoint(-158F, -60F, 89F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 85, 3, 11, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		rightWingModel[30].setRotationPoint(-158F, -56F, 95F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 85, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 190
		rightWingModel[31].setRotationPoint(-158F, -87F, 98F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 85, 1, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		rightWingModel[32].setRotationPoint(-158F, -53F, 98F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 17, 9, 37, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 196
		rightWingModel[33].setRotationPoint(-175F, -74F, 82F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 17, 5, 31, 0F,0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 1F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, -2F); // Box 197
		rightWingModel[34].setRotationPoint(-175F, -79F, 85F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 17, 4, 23, 0F,0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, 2F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 2F, -1F); // Box 198
		rightWingModel[35].setRotationPoint(-175F, -83F, 89F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 17, 3, 11, 0F,0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, 4F, 1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 4F, 1F); // Box 199
		rightWingModel[36].setRotationPoint(-175F, -86F, 95F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, -7F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1.5F, 0F, 6F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 0F); // Box 200
		rightWingModel[37].setRotationPoint(-175F, -87F, 98F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 17, 5, 31, 0F,0F, 1F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, -2F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 205
		rightWingModel[38].setRotationPoint(-175F, -65F, 85F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 17, 4, 23, 0F,0F, 2F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 2F, -1F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F); // Box 206
		rightWingModel[39].setRotationPoint(-175F, -60F, 89F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 17, 3, 11, 0F,0F, 4F, 1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 4F, 1F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F); // Box 207
		rightWingModel[40].setRotationPoint(-175F, -56F, 95F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, 6F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 0F, 0F, -7F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1.5F); // Box 208
		rightWingModel[41].setRotationPoint(-175F, -53F, 98F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 30, 5, 31, 0F,0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 3F); // Box 227
		rightWingModel[42].setRotationPoint(-73F, -79F, 85F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 30, 4, 23, 0F,0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 4F); // Box 228
		rightWingModel[43].setRotationPoint(-73F, -83F, 89F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 30, 3, 11, 0F,0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 0F, 6F); // Box 229
		rightWingModel[44].setRotationPoint(-73F, -86F, 95F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 30, 1, 5, 0F,0F, 0F, 0F, 0F, -6.75F, -1.5F, 0F, -6.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 3F); // Box 230
		rightWingModel[45].setRotationPoint(-73F, -87F, 98F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 30, 9, 37, 0F,0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 231
		rightWingModel[46].setRotationPoint(-73F, -74F, 82F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 30, 5, 31, 0F,0F, 0F, 3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F); // Box 232
		rightWingModel[47].setRotationPoint(-73F, -65F, 85F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 30, 4, 23, 0F,0F, 0F, 4F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F); // Box 233
		rightWingModel[48].setRotationPoint(-73F, -60F, 89F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 30, 1, 5, 0F,0F, 0F, 3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -6.75F, -1.5F, 0F, -6.75F, -1.5F, 0F, 0F, 0F); // Box 234
		rightWingModel[49].setRotationPoint(-73F, -53F, 98F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 30, 3, 11, 0F,0F, 0F, 6F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F); // Box 235
		rightWingModel[50].setRotationPoint(-73F, -56F, 95F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 12, 7, 27, 0F,0F, -2F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -9F); // Box 236
		rightWingModel[51].setRotationPoint(-187F, -73F, 87F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 12, 3, 13, 0F,0F, -3F, -3F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, -3F, -3F, 0F, 1F, -2F, 0F, -1F, 7F, 0F, -1F, 7F, 0F, 1F, -2F); // Box 237
		rightWingModel[52].setRotationPoint(-187F, -75F, 94F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F,0F, -3F, -4F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -3F, -4F, 0F, 1F, -2F, 0F, -4F, 5F, 0F, -4F, 5F, 0F, 1F, -2F); // Box 238
		rightWingModel[53].setRotationPoint(-187F, -76F, 95F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, -2.75F, -1F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, -2.75F, -1F, 0F, 0F, 0F, 0F, -6F, 5F, 0F, -6F, 5F, 0F, 0F, 0F); // Box 239
		rightWingModel[54].setRotationPoint(-187F, -76F, 99F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 12, 3, 13, 0F,0F, 1F, -2F, 0F, -1F, 7F, 0F, -1F, 7F, 0F, 1F, -2F, 0F, -3F, -3F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, -3F, -3F); // Box 240
		rightWingModel[55].setRotationPoint(-187F, -67F, 94F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F,0F, 1F, -2F, 0F, -4F, 5F, 0F, -4F, 5F, 0F, 1F, -2F, 0F, -3F, -4F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -3F, -4F); // Box 241
		rightWingModel[56].setRotationPoint(-187F, -66F, 95F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, 0F, 0F, -6F, 5F, 0F, -6F, 5F, 0F, 0F, 0F, 0F, -2.75F, -1F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, -2.75F, -1F); // Box 242
		rightWingModel[57].setRotationPoint(-187F, -66F, 99F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 2, 48, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 298
		rightWingModel[58].setRotationPoint(-146F, -131F, 88F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 2, 48, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 300
		rightWingModel[59].setRotationPoint(-146F, -131F, 111F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 2, 48, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 301
		rightWingModel[60].setRotationPoint(-79F, -131F, 111F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 2, 48, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 302
		rightWingModel[61].setRotationPoint(-79F, -131F, 88F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightWingModel[62].setRotationPoint(-79F, -58F, 111F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		rightWingModel[63].setRotationPoint(-79F, -58F, 88F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightWingModel[64].setRotationPoint(-146F, -58F, 111F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		rightWingModel[65].setRotationPoint(-146F, -58F, 88F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		rightWingModel[66].setRotationPoint(-114F, -2F, 118F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 4, 22, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		rightWingModel[67].setRotationPoint(-115F, -12F, 121F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 3, 20, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 322
		rightWingModel[68].setRotationPoint(-108F, -11F, 121F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 2, 16, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 323
		rightWingModel[69].setRotationPoint(-105F, -9F, 121F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 3, 22, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 324
		rightWingModel[70].setRotationPoint(-111F, -12F, 121F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 325
		rightWingModel[71].setRotationPoint(-103F, -6F, 121F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 326
		rightWingModel[72].setRotationPoint(-124F, -6F, 121F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 2, 16, 13, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 327
		rightWingModel[73].setRotationPoint(-123F, -9F, 121F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 3, 20, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 328
		rightWingModel[74].setRotationPoint(-121F, -11F, 121F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 3, 22, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 329
		rightWingModel[75].setRotationPoint(-118F, -12F, 121F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,3F, 3F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		rightWingModel[76].setRotationPoint(-115F, -3F, 134F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		rightWingModel[77].setRotationPoint(-114F, -2F, 80F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 332
		rightWingModel[78].setRotationPoint(-124F, -6F, 67F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 3, 20, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 333
		rightWingModel[79].setRotationPoint(-121F, -11F, 67F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 2, 16, 13, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 334
		rightWingModel[80].setRotationPoint(-123F, -9F, 67F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 3, 22, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 335
		rightWingModel[81].setRotationPoint(-118F, -12F, 67F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 4, 22, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		rightWingModel[82].setRotationPoint(-115F, -12F, 67F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 3, 22, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 337
		rightWingModel[83].setRotationPoint(-111F, -12F, 67F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 3, 20, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 338
		rightWingModel[84].setRotationPoint(-108F, -11F, 67F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 2, 16, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 339
		rightWingModel[85].setRotationPoint(-105F, -9F, 67F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 340
		rightWingModel[86].setRotationPoint(-103F, -6F, 67F);

		rightWingModel[87].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F); // Box 341
		rightWingModel[87].setRotationPoint(-115F, -3F, 65F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		rightWingModel[88].setRotationPoint(-191F, -71F, 99F);

		rightWingModel[89].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		rightWingModel[89].setRotationPoint(-43F, -71F, 99F);

		rightWingModel[90].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -12F, 0F, 0F, 11F, -2F, 0F, 11F, -2F, 0F, -12F, 0F, 0F); // Box 336
		rightWingModel[90].setRotationPoint(237F, -59F, -1F);

		rightWingModel[91].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		rightWingModel[91].setRotationPoint(-191F, -71F, -102F);

		rightWingModel[92].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		rightWingModel[92].setRotationPoint(-43F, -71F, -102F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 777, 113, textureX, textureY); // Box 147
		yawFlapModel[1] = new ModelRendererTurbo(this, 1337, 121, textureX, textureY); // Box 150

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 6, 43, 1, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); // Box 147
		yawFlapModel[0].setRotationPoint(276F, -125F, -72F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 6, 43, 1, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); // Box 150
		yawFlapModel[1].setRotationPoint(276F, -125F, 71F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1393, 137, textureX, textureY); // Box 124
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 1961, 105, textureX, textureY); // Box 125
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 126
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 127

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 16, 1, 82, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		pitchFlapLeftModel[0].setRotationPoint(262F, -126F, -82F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 16, 1, 23, 0F,0F, 0F, 0F, 6F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		pitchFlapLeftModel[1].setRotationPoint(262F, -126F, -105F);

		pitchFlapLeftModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 82, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		pitchFlapLeftModel[2].setRotationPoint(262F, -82F, -82F);

		pitchFlapLeftModel[3].addShapeBox(0F, 0F, 0F, 16, 1, 23, 0F,0F, 0F, 0F, 6F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		pitchFlapLeftModel[3].setRotationPoint(262F, -82F, -105F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1145, 121, textureX, textureY); // Box 122
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 1713, 105, textureX, textureY); // Box 123
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Box 128
		pitchFlapRightModel[3] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 129

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 16, 1, 82, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		pitchFlapRightModel[0].setRotationPoint(262F, -126F, 0F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 16, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, 0F, 0F, 0F); // Box 123
		pitchFlapRightModel[1].setRotationPoint(262F, -126F, 82F);

		pitchFlapRightModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 82, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		pitchFlapRightModel[2].setRotationPoint(262F, -82F, 0F);

		pitchFlapRightModel[3].addShapeBox(0F, 0F, 0F, 16, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, 0F, 0F, 0F); // Box 129
		pitchFlapRightModel[3].setRotationPoint(262F, -82F, 82F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 433, 425, textureX, textureY); // Box 86
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 1409, 761, textureX, textureY); // Box 103

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 29, 11, 161, 0F,0F, 4F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 86
		pitchFlapLeftWingModel[0].setRotationPoint(-74F, -42F, -508F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 2F, -83F, 29, 11, 196, 0F,0F, -5F, 0F, 0F, -10F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 103
		pitchFlapLeftWingModel[1].setRotationPoint(-73F, -142F, -433F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 76
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 993, 449, textureX, textureY); // Box 91

		pitchFlapRightWingModel[0].addShapeBox(0F, 2F, -83F, 29, 11, 161, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -10F, 0F, 0F, -5F, 0F); // Box 76
		pitchFlapRightWingModel[0].setRotationPoint(-74F, -44F, 430F);

		pitchFlapRightWingModel[1].addShapeBox(0F, 2F, -83F, 29, 11, 196, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 4F, 0F); // Box 91
		pitchFlapRightWingModel[1].setRotationPoint(-73F, -142F, 403F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][2];
		propellerModels[0] = makeProp1(-189F, -69.5F, 100.5F);
		propellerModels[1] = makeProp2(-190F, -69.5F, -100.5F);
		propellerModels[2] = makeProp3(-41F, -69.5F, 100.5F);
		propellerModels[3] = makeProp4(-41F, -69.5F, -100.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 530, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 530, textureX, textureY);
		prop[0].addBox(-0.5F, -46F, -2F, 1, 46, 4, 0.0F);
		prop[1].addBox(-0.5F, -46F, -2F, 1, 46, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 530, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 530, textureX, textureY);
		prop[0].addBox(-0.5F, -46F, -2F, 1, 46, 4, 0.0F);
		prop[1].addBox(-0.5F, -46F, -2F, 1, 46, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 530, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 530, textureX, textureY);
		prop[0].addBox(-0.5F, -46F, -2F, 1, 46, 4, 0.0F);
		prop[1].addBox(-0.5F, -46F, -2F, 1, 46, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = 3.14159265F;
		prop[1].rotateAngleY = 3.14159265F;
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 530, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 530, textureX, textureY);
		prop[0].addBox(-0.5F, -46F, -2.5F, 1, 46, 5, 0.0F);
		prop[1].addBox(-0.5F, -46F, -2.5F, 1, 46, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = 3.14159265F;
		prop[1].rotateAngleY = 3.14159265F;
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[24];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 0
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 1
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 2
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 3
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 4
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 5
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 6
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 7
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 8
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 9
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 10
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 11
		gun_1_Model[2][12] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 12
		gun_1_Model[2][13] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 13
		gun_1_Model[2][14] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 14
		gun_1_Model[2][15] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 15
		gun_1_Model[2][16] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 16
		gun_1_Model[2][17] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 17
		gun_1_Model[2][18] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 18
		gun_1_Model[2][19] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 19
		gun_1_Model[2][20] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 20
		gun_1_Model[2][21] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 21
		gun_1_Model[2][22] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 22
		gun_1_Model[2][23] = new ModelRendererTurbo(this, 77, 590, textureX, textureY); // Box 23

		gun_1_Model[2][0].addBox(12F, -4F, 0F, 1, 4, 1, 0F); // Box 0

		gun_1_Model[2][1].addShapeBox(12F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1

		gun_1_Model[2][2].addShapeBox(11F, 4F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 2

		gun_1_Model[2][3].addShapeBox(8F, -7F, -0.5F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_1_Model[2][4].addShapeBox(16F, -7F, -0.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4

		gun_1_Model[2][5].addShapeBox(16F, -6F, -0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5

		gun_1_Model[2][6].addShapeBox(18F, -7F, -0.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_1_Model[2][7].addShapeBox(19F, -5.5F, 0.25F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 7

		gun_1_Model[2][8].addBox(7F, -6.5F, 0F, 1, 2, 1, 0F); // Box 8

		gun_1_Model[2][9].addShapeBox(19F, -5.5F, 0.75F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 9

		gun_1_Model[2][10].addShapeBox(19F, -5.5F, 0.75F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 10

		gun_1_Model[2][11].addShapeBox(19F, -5.5F, -0.75F, 12, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		gun_1_Model[2][12].addShapeBox(4F, -6.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 12

		gun_1_Model[2][13].addBox(3F, -6.5F, 0F, 1, 3, 1, 0F); // Box 13

		gun_1_Model[2][14].addShapeBox(9F, -4.5F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 14

		gun_1_Model[2][15].addShapeBox(8F, -4.5F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_1_Model[2][16].addShapeBox(16F, -6F, 2.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_1_Model[2][17].addShapeBox(16F, -7F, 2.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_1_Model[2][18].addShapeBox(16F, -3F, 2.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 18

		gun_1_Model[2][19].addShapeBox(16F, -6F, 1.5F, 2, 3, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19

		gun_1_Model[2][20].addShapeBox(16F, -6F, 5.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 20

		gun_1_Model[2][21].addShapeBox(16F, -6.5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 21

		gun_1_Model[2][22].addShapeBox(16F, -6.5F, 1.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 22

		gun_1_Model[2][23].addShapeBox(16.5F, -5F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 23

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(-271F, -51F, 0F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[0];

		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[24];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 0
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 1
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 2
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 3
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 4
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 5
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 6
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 7
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 8
		gun_2_Model[2][9] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 9
		gun_2_Model[2][10] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 10
		gun_2_Model[2][11] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 11
		gun_2_Model[2][12] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 12
		gun_2_Model[2][13] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 13
		gun_2_Model[2][14] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 14
		gun_2_Model[2][15] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 15
		gun_2_Model[2][16] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 16
		gun_2_Model[2][17] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 17
		gun_2_Model[2][18] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 18
		gun_2_Model[2][19] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 19
		gun_2_Model[2][20] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 20
		gun_2_Model[2][21] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 21
		gun_2_Model[2][22] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 22
		gun_2_Model[2][23] = new ModelRendererTurbo(this, 124, 580, textureX, textureY); // Box 23

		gun_2_Model[2][0].addBox(12F, -4F, 0F, 1, 4, 1, 0F); // Box 0

		gun_2_Model[2][1].addShapeBox(12F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1

		gun_2_Model[2][2].addShapeBox(11F, 4F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 2

		gun_2_Model[2][3].addShapeBox(8F, -7F, -0.5F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_2_Model[2][4].addShapeBox(16F, -7F, -0.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4

		gun_2_Model[2][5].addShapeBox(16F, -6F, -0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5

		gun_2_Model[2][6].addShapeBox(18F, -7F, -0.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_2_Model[2][7].addShapeBox(19F, -5.5F, 0.25F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 7

		gun_2_Model[2][8].addBox(7F, -6.5F, 0F, 1, 2, 1, 0F); // Box 8

		gun_2_Model[2][9].addShapeBox(19F, -5.5F, 0.75F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 9

		gun_2_Model[2][10].addShapeBox(19F, -5.5F, 0.75F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 10

		gun_2_Model[2][11].addShapeBox(19F, -5.5F, -0.75F, 12, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		gun_2_Model[2][12].addShapeBox(4F, -6.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 12

		gun_2_Model[2][13].addBox(3F, -6.5F, 0F, 1, 3, 1, 0F); // Box 13

		gun_2_Model[2][14].addShapeBox(9F, -4.5F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 14

		gun_2_Model[2][15].addShapeBox(8F, -4.5F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_2_Model[2][16].addShapeBox(16F, -6F, 2.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_2_Model[2][17].addShapeBox(16F, -7F, 2.5F, 2, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_2_Model[2][18].addShapeBox(16F, -3F, 2.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 18

		gun_2_Model[2][19].addShapeBox(16F, -6F, 1.5F, 2, 3, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19

		gun_2_Model[2][20].addShapeBox(16F, -6F, 5.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 20

		gun_2_Model[2][21].addShapeBox(16F, -6.5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 21

		gun_2_Model[2][22].addShapeBox(16F, -6.5F, 1.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 22

		gun_2_Model[2][23].addShapeBox(16.5F, -5F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 23

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(-9F, -74F, 0F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);
	}
}