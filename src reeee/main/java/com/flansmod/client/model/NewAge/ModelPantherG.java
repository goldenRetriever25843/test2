//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.08.2017 - 19:16:21
// Last changed on: 18.08.2017 - 19:16:21

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelPantherG extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelPantherG() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[276];
		turretModel = new ModelRendererTurbo[104];
		barrelModel = new ModelRendererTurbo[2];
		leftTrackWheelModels = new ModelRendererTurbo[38];
		rightTrackWheelModels = new ModelRendererTurbo[38];
		animBarrelModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initanimBarrelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 41
		bodyModel[23] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 42
		bodyModel[24] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 43
		bodyModel[25] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 44
		bodyModel[26] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 45
		bodyModel[27] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 46
		bodyModel[28] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 47
		bodyModel[29] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 48
		bodyModel[30] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 49
		bodyModel[31] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 50
		bodyModel[32] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 51
		bodyModel[33] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 52
		bodyModel[34] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 53
		bodyModel[35] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 54
		bodyModel[36] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 55
		bodyModel[37] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 56
		bodyModel[38] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 57
		bodyModel[39] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 58
		bodyModel[40] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 59
		bodyModel[41] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 60
		bodyModel[42] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Box 61
		bodyModel[43] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 62
		bodyModel[44] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 63
		bodyModel[45] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 64
		bodyModel[46] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 65
		bodyModel[47] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 66
		bodyModel[48] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 67
		bodyModel[49] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 68
		bodyModel[50] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 69
		bodyModel[51] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 70
		bodyModel[52] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 71
		bodyModel[53] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Box 72
		bodyModel[54] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 74
		bodyModel[56] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 75
		bodyModel[57] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 76
		bodyModel[58] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 77
		bodyModel[59] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 78
		bodyModel[60] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 79
		bodyModel[61] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 80
		bodyModel[62] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 81
		bodyModel[63] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 82
		bodyModel[64] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 83
		bodyModel[65] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 84
		bodyModel[66] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 85
		bodyModel[67] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 86
		bodyModel[68] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Box 87
		bodyModel[69] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 89
		bodyModel[70] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 90
		bodyModel[71] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 98
		bodyModel[72] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 99
		bodyModel[73] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 100
		bodyModel[74] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 101
		bodyModel[75] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 102
		bodyModel[76] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 103
		bodyModel[77] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 104
		bodyModel[78] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 105
		bodyModel[79] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 106
		bodyModel[80] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 107
		bodyModel[81] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 237
		bodyModel[82] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 238
		bodyModel[83] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 239
		bodyModel[84] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 240
		bodyModel[85] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 242
		bodyModel[86] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 243
		bodyModel[87] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 244
		bodyModel[88] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Box 245
		bodyModel[89] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 262
		bodyModel[90] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 263
		bodyModel[91] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 264
		bodyModel[92] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 265
		bodyModel[93] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 266
		bodyModel[94] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 267
		bodyModel[95] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 268
		bodyModel[96] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 269
		bodyModel[97] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 270
		bodyModel[98] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 271
		bodyModel[99] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 273
		bodyModel[100] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 274
		bodyModel[101] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Box 275
		bodyModel[102] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 276
		bodyModel[103] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Box 277
		bodyModel[104] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 278
		bodyModel[105] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 279
		bodyModel[106] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 280
		bodyModel[107] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 281
		bodyModel[108] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 282
		bodyModel[109] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 283
		bodyModel[110] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 284
		bodyModel[111] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 285
		bodyModel[112] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 286
		bodyModel[113] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 287
		bodyModel[114] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 289
		bodyModel[115] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 290
		bodyModel[116] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 291
		bodyModel[117] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 292
		bodyModel[118] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 293
		bodyModel[119] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 294
		bodyModel[120] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 295
		bodyModel[121] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 296
		bodyModel[122] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 297
		bodyModel[123] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 298
		bodyModel[124] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 299
		bodyModel[125] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 300
		bodyModel[126] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Box 301
		bodyModel[127] = new ModelRendererTurbo(this, 585, 89, textureX, textureY); // Box 302
		bodyModel[128] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 303
		bodyModel[129] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 304
		bodyModel[130] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 323
		bodyModel[131] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 324
		bodyModel[132] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Box 325
		bodyModel[133] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 329
		bodyModel[134] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 330
		bodyModel[135] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 331
		bodyModel[136] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 332
		bodyModel[137] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 333
		bodyModel[138] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 334
		bodyModel[139] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 335
		bodyModel[140] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 336
		bodyModel[141] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 337
		bodyModel[142] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 338
		bodyModel[143] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 339
		bodyModel[144] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 343
		bodyModel[145] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 344
		bodyModel[146] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 345
		bodyModel[147] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 346
		bodyModel[148] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 321
		bodyModel[149] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Box 322
		bodyModel[150] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 323
		bodyModel[151] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 324
		bodyModel[152] = new ModelRendererTurbo(this, 937, 121, textureX, textureY); // Box 325
		bodyModel[153] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 326
		bodyModel[154] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 327
		bodyModel[155] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 328
		bodyModel[156] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 329
		bodyModel[157] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 330
		bodyModel[158] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Box 331
		bodyModel[159] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 332
		bodyModel[160] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 333
		bodyModel[161] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 334
		bodyModel[162] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 335
		bodyModel[163] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 336
		bodyModel[164] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 337
		bodyModel[165] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 338
		bodyModel[166] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 340
		bodyModel[167] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 341
		bodyModel[168] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 342
		bodyModel[169] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 343
		bodyModel[170] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 344
		bodyModel[171] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 345
		bodyModel[172] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 346
		bodyModel[173] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 347
		bodyModel[174] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 348
		bodyModel[175] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 349
		bodyModel[176] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Box 350
		bodyModel[177] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 351
		bodyModel[178] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 352
		bodyModel[179] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 353
		bodyModel[180] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 354
		bodyModel[181] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 355
		bodyModel[182] = new ModelRendererTurbo(this, 841, 105, textureX, textureY); // Box 356
		bodyModel[183] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 357
		bodyModel[184] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 358
		bodyModel[185] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 359
		bodyModel[186] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 360
		bodyModel[187] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 361
		bodyModel[188] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Box 362
		bodyModel[189] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 363
		bodyModel[190] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 364
		bodyModel[191] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Box 365
		bodyModel[192] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 366
		bodyModel[193] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 367
		bodyModel[194] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 368
		bodyModel[195] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 369
		bodyModel[196] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 370
		bodyModel[197] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 371
		bodyModel[198] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 372
		bodyModel[199] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 373
		bodyModel[200] = new ModelRendererTurbo(this, 985, 169, textureX, textureY); // Box 374
		bodyModel[201] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 375
		bodyModel[202] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 376
		bodyModel[203] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 377
		bodyModel[204] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 378
		bodyModel[205] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 379
		bodyModel[206] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 380
		bodyModel[207] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 381
		bodyModel[208] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 382
		bodyModel[209] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 383
		bodyModel[210] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 384
		bodyModel[211] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 385
		bodyModel[212] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 386
		bodyModel[213] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 387
		bodyModel[214] = new ModelRendererTurbo(this, 513, 185, textureX, textureY); // Box 388
		bodyModel[215] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 389
		bodyModel[216] = new ModelRendererTurbo(this, 745, 137, textureX, textureY); // Box 390
		bodyModel[217] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Box 391
		bodyModel[218] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 392
		bodyModel[219] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 393
		bodyModel[220] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 394
		bodyModel[221] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 395
		bodyModel[222] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 396
		bodyModel[223] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 397
		bodyModel[224] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 398
		bodyModel[225] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 399
		bodyModel[226] = new ModelRendererTurbo(this, 561, 185, textureX, textureY); // Box 400
		bodyModel[227] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Box 401
		bodyModel[228] = new ModelRendererTurbo(this, 633, 185, textureX, textureY); // Box 402
		bodyModel[229] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Box 403
		bodyModel[230] = new ModelRendererTurbo(this, 673, 185, textureX, textureY); // Box 404
		bodyModel[231] = new ModelRendererTurbo(this, 825, 185, textureX, textureY); // Box 405
		bodyModel[232] = new ModelRendererTurbo(this, 857, 185, textureX, textureY); // Box 406
		bodyModel[233] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 407
		bodyModel[234] = new ModelRendererTurbo(this, 897, 185, textureX, textureY); // Box 408
		bodyModel[235] = new ModelRendererTurbo(this, 929, 185, textureX, textureY); // Box 409
		bodyModel[236] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 410
		bodyModel[237] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 411
		bodyModel[238] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 412
		bodyModel[239] = new ModelRendererTurbo(this, 953, 185, textureX, textureY); // Box 413
		bodyModel[240] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 414
		bodyModel[241] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 415
		bodyModel[242] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 416
		bodyModel[243] = new ModelRendererTurbo(this, 1001, 185, textureX, textureY); // Box 417
		bodyModel[244] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 418
		bodyModel[245] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 419
		bodyModel[246] = new ModelRendererTurbo(this, 1001, 153, textureX, textureY); // Box 420
		bodyModel[247] = new ModelRendererTurbo(this, 721, 169, textureX, textureY); // Box 421
		bodyModel[248] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 424
		bodyModel[249] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 425
		bodyModel[250] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 426
		bodyModel[251] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 427
		bodyModel[252] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Box 428
		bodyModel[253] = new ModelRendererTurbo(this, 713, 185, textureX, textureY); // Box 429
		bodyModel[254] = new ModelRendererTurbo(this, 777, 121, textureX, textureY); // Box 430
		bodyModel[255] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 431
		bodyModel[256] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 432
		bodyModel[257] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 433
		bodyModel[258] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 434
		bodyModel[259] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 435
		bodyModel[260] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 436
		bodyModel[261] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 437
		bodyModel[262] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 438
		bodyModel[263] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 439
		bodyModel[264] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 440
		bodyModel[265] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 441
		bodyModel[266] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 442
		bodyModel[267] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 443
		bodyModel[268] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 444
		bodyModel[269] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 445
		bodyModel[270] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 446
		bodyModel[271] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 447
		bodyModel[272] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 448
		bodyModel[273] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 449
		bodyModel[274] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 450
		bodyModel[275] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 451

		bodyModel[0].addBox(0F, 0F, 0F, 88, 27, 36, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42F, -26.5F, -18F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 24, 17, 36, 0F,0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(46F, -27F, -18F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 9, 11, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, -4F, 0F, -8F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -8F, -4F); // Box 2
		bodyModel[2].setRotationPoint(46F, -27F, 18F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 100, 9, 11, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-42F, -26.5F, 18F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 9, 11, 0F,0F, 0F, -4F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -8F, 0F); // Box 4
		bodyModel[4].setRotationPoint(46F, -27F, -29F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 100, 9, 11, 0F,0F, 0F, -4F, -12F, 0F, -4F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-42F, -26.5F, -29F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 11, 36, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(57F, -10.5F, -18F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 11, 36, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(46F, -10.5F, -18F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 8, 58, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-57F, -26.5F, -29F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 11, 5, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-53F, -18.5F, -29F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 14, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-50F, -13.5F, -18F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 11, 4, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-42F, -18.5F, -29F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-31F, -18.5F, -29F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 13
		bodyModel[13].setRotationPoint(58F, -19F, 18F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 14
		bodyModel[14].setRotationPoint(64F, -18F, 18F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 15
		bodyModel[15].setRotationPoint(67F, -17F, 18F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 16
		bodyModel[16].setRotationPoint(69F, -16F, 18F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 17
		bodyModel[17].setRotationPoint(58F, -19F, -31F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 18
		bodyModel[18].setRotationPoint(64F, -18F, -31F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 19
		bodyModel[19].setRotationPoint(67F, -17F, -31F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 20
		bodyModel[20].setRotationPoint(69F, -16F, -31F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.8F, 0F); // Box 35
		bodyModel[21].setRotationPoint(70F, -9F, 18F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 5, 12, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[22].setRotationPoint(67F, -3F, 18F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 18, 10, 12, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[23].setRotationPoint(49F, 0F, 18F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 81, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[24].setRotationPoint(-32F, 8F, 18F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 7, 12, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 44
		bodyModel[25].setRotationPoint(67F, -14F, 18F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 4, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 45
		bodyModel[26].setRotationPoint(61F, -16F, 18F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 4, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[27].setRotationPoint(55F, -16F, 18F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 6, 12, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[28].setRotationPoint(47F, -14F, 18F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 81, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[29].setRotationPoint(-34F, -10F, 18F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[30].setRotationPoint(-37F, -11F, 18F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[31].setRotationPoint(-44F, -11F, 18F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[32].setRotationPoint(-48F, -11F, 18F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.8F, 0F); // Box 52
		bodyModel[33].setRotationPoint(-48F, -7F, 18F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 6, 12, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 53
		bodyModel[34].setRotationPoint(-47F, -2F, 18F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 54
		bodyModel[35].setRotationPoint(-42F, 2F, 18F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 55
		bodyModel[36].setRotationPoint(-36F, 6F, 18F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 7, 12, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 56
		bodyModel[37].setRotationPoint(67F, -14F, -30F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 4, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 57
		bodyModel[38].setRotationPoint(61F, -16F, -30F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 4, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[39].setRotationPoint(55F, -16F, -30F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 6, 12, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[40].setRotationPoint(47F, -14F, -30F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 81, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[41].setRotationPoint(-34F, -10F, -30F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.8F, 0F); // Box 61
		bodyModel[42].setRotationPoint(70F, -9F, -30F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 5, 12, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[43].setRotationPoint(67F, -3F, -30F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 18, 10, 12, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[44].setRotationPoint(49F, 0F, -30F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 81, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[45].setRotationPoint(-32F, 8F, -30F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 65
		bodyModel[46].setRotationPoint(-36F, 6F, -30F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 66
		bodyModel[47].setRotationPoint(-42F, 2F, -30F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 6, 12, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 67
		bodyModel[48].setRotationPoint(-47F, -2F, -30F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.8F, 0F); // Box 68
		bodyModel[49].setRotationPoint(-48F, -7F, -30F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[50].setRotationPoint(-48F, -11F, -30F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[51].setRotationPoint(-44F, -11F, -30F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 71
		bodyModel[52].setRotationPoint(-37F, -11F, -30F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 22, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[53].setRotationPoint(38.5F, -19F, 30.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 109, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 73
		bodyModel[54].setRotationPoint(-51F, -19F, 29F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 109, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 74
		bodyModel[55].setRotationPoint(-51F, -19F, -31F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 22, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[56].setRotationPoint(16.25F, -19F, 30.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 22, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[57].setRotationPoint(-6F, -19F, 30.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 22, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[58].setRotationPoint(-28.25F, -19F, 30.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 22, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[59].setRotationPoint(-50.5F, -19F, 30.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 22, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[60].setRotationPoint(38.5F, -19F, -32F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 22, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[61].setRotationPoint(16.25F, -19F, -32F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 22, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[62].setRotationPoint(-6F, -19F, -32F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 22, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[63].setRotationPoint(-28.25F, -19F, -32F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 22, 12, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[64].setRotationPoint(-50.5F, -19F, -32F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 84
		bodyModel[65].setRotationPoint(56F, -21F, -16F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[66].setRotationPoint(54F, -22.5F, -16F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 86
		bodyModel[67].setRotationPoint(52F, -23.5F, -16F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0F, 0F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 87
		bodyModel[68].setRotationPoint(54F, -24.5F, -16F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-1.5F, -0.5F, -3F, 0F, -1F, -2F, 0F, -1F, -2F, -1.5F, -0.5F, -3F, 0F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, -2F); // Box 89
		bodyModel[69].setRotationPoint(52F, -25.5F, -16F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, -2F, 0F, 0F, 0F); // Box 90
		bodyModel[70].setRotationPoint(56F, -23F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 98
		bodyModel[71].setRotationPoint(69F, -16F, -18F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 99
		bodyModel[72].setRotationPoint(67F, -17F, -18F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 100
		bodyModel[73].setRotationPoint(64F, -18F, -18F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 101
		bodyModel[74].setRotationPoint(58F, -19F, -18F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 102
		bodyModel[75].setRotationPoint(69F, -16F, 17.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 103
		bodyModel[76].setRotationPoint(67F, -17F, 17.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 104
		bodyModel[77].setRotationPoint(64F, -18F, 17.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 105
		bodyModel[78].setRotationPoint(58F, -19F, 17.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -2F, -1F, -1F, -3F, -1F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1.5F, -2F, 0F, 1.5F, 0.5F, 0F, 0F, 0.5F); // Box 106
		bodyModel[79].setRotationPoint(56F, -23F, -16F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[80].setRotationPoint(56F, -23F, -13F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 237
		bodyModel[81].setRotationPoint(43.5F, -26.5F, 24.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 238
		bodyModel[82].setRotationPoint(29.5F, -26.5F, 24.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 239
		bodyModel[83].setRotationPoint(13.5F, -26.5F, 24.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 240
		bodyModel[84].setRotationPoint(-7.5F, -26.5F, 24.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[85].setRotationPoint(43.5F, -26.5F, -30.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[86].setRotationPoint(29.5F, -26.5F, -30.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[87].setRotationPoint(13.5F, -26.5F, -30.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 8, 6, 0F,0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[88].setRotationPoint(-7.5F, -26.5F, -30.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 262
		bodyModel[89].setRotationPoint(59F, -19F, 21.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[90].setRotationPoint(60F, -21F, 23F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[91].setRotationPoint(60F, -24F, 22F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[92].setRotationPoint(60F, -23F, 22F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 266
		bodyModel[93].setRotationPoint(60F, -22F, 22F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 267
		bodyModel[94].setRotationPoint(61F, -24F, 22F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 268
		bodyModel[95].setRotationPoint(61F, -23F, 22F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F); // Box 269
		bodyModel[96].setRotationPoint(61F, -22F, 22F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 270
		bodyModel[97].setRotationPoint(-41.5F, -26.5F, 25F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 271
		bodyModel[98].setRotationPoint(-41.5F, -22.5F, 27F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 273
		bodyModel[99].setRotationPoint(-53.5F, -26.5F, 25F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 274
		bodyModel[100].setRotationPoint(-29.5F, -22.5F, 27F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 275
		bodyModel[101].setRotationPoint(-29.5F, -26.5F, 25F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 276
		bodyModel[102].setRotationPoint(-39.5F, -26F, 26F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 277
		bodyModel[103].setRotationPoint(-33.5F, -26F, 26F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 278
		bodyModel[104].setRotationPoint(-45.5F, -26F, 26F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 279
		bodyModel[105].setRotationPoint(-51.5F, -26F, 26F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 280
		bodyModel[106].setRotationPoint(-21.5F, -26F, 26F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 281
		bodyModel[107].setRotationPoint(-27.5F, -26F, 26F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 282
		bodyModel[108].setRotationPoint(-21.5F, -22F, 28F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 283
		bodyModel[109].setRotationPoint(-27.5F, -22F, 28F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 284
		bodyModel[110].setRotationPoint(-33.5F, -22F, 28F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 285
		bodyModel[111].setRotationPoint(-39.5F, -22F, 28F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 286
		bodyModel[112].setRotationPoint(-29.5F, -26.5F, -29F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[113].setRotationPoint(-27.5F, -26F, -28F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[114].setRotationPoint(-21.5F, -26F, -28F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[115].setRotationPoint(-21.5F, -22F, -30F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 291
		bodyModel[116].setRotationPoint(-29.5F, -22.5F, -31F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[117].setRotationPoint(-27.5F, -22F, -30F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[118].setRotationPoint(-33.5F, -22F, -30F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 294
		bodyModel[119].setRotationPoint(-41.5F, -22.5F, -31F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[120].setRotationPoint(-39.5F, -22F, -30F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[121].setRotationPoint(-33.5F, -26F, -28F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 297
		bodyModel[122].setRotationPoint(-41.5F, -26.5F, -29F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[123].setRotationPoint(-39.5F, -26F, -28F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[124].setRotationPoint(-45.5F, -26F, -28F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 300
		bodyModel[125].setRotationPoint(-53.5F, -26.5F, -29F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[126].setRotationPoint(-51.5F, -26F, -28F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 302
		bodyModel[127].setRotationPoint(-53.5F, -22.5F, -31F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[128].setRotationPoint(-51.5F, -22F, -30F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[129].setRotationPoint(-45.5F, -22F, -30F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 323
		bodyModel[130].setRotationPoint(58F, -19F, -17.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 324
		bodyModel[131].setRotationPoint(70F, -12F, -17.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 325
		bodyModel[132].setRotationPoint(70F, -12F, -15.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 329
		bodyModel[133].setRotationPoint(71F, -11F, -17.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 330
		bodyModel[134].setRotationPoint(58F, -19F, 15.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 331
		bodyModel[135].setRotationPoint(70F, -12F, 14.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 332
		bodyModel[136].setRotationPoint(71F, -11F, 14.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 333
		bodyModel[137].setRotationPoint(70F, -12F, 16.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 334
		bodyModel[138].setRotationPoint(43F, -28F, 9.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 335
		bodyModel[139].setRotationPoint(43F, -28F, 12.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 336
		bodyModel[140].setRotationPoint(43F, -28.25F, 9.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[141].setRotationPoint(43F, -28.25F, 9.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 338
		bodyModel[142].setRotationPoint(46F, -28F, 12.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 339
		bodyModel[143].setRotationPoint(46F, -28F, 9.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 343
		bodyModel[144].setRotationPoint(41F, -28.5F, -18F);
		bodyModel[144].rotateAngleY = -0.43633231F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 344
		bodyModel[145].setRotationPoint(41F, -28.5F, -18F);
		bodyModel[145].rotateAngleY = -0.43633231F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 345
		bodyModel[146].setRotationPoint(41F, -27.5F, -18F);
		bodyModel[146].rotateAngleY = -0.43633231F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 346
		bodyModel[147].setRotationPoint(42.25F, -27.5F, -15.25F);
		bodyModel[147].rotateAngleY = -0.43633231F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[148].setRotationPoint(33F, -26.75F, 5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 322
		bodyModel[149].setRotationPoint(32F, -26.75F, 5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 323
		bodyModel[150].setRotationPoint(37F, -26.75F, 5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[151].setRotationPoint(33F, -26.75F, -15F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 325
		bodyModel[152].setRotationPoint(32F, -26.75F, -15F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 326
		bodyModel[153].setRotationPoint(37F, -26.75F, -15F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[154].setRotationPoint(33.15F, -27.5F, 5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[155].setRotationPoint(36.65F, -27.5F, 5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.25F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 329
		bodyModel[156].setRotationPoint(33.15F, -27.75F, 5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.25F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 330
		bodyModel[157].setRotationPoint(33.15F, -27.75F, -7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[158].setRotationPoint(36.65F, -27.5F, -7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[159].setRotationPoint(33.15F, -27.5F, -7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[160].setRotationPoint(45F, -29.5F, -4.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[161].setRotationPoint(45F, -29.5F, -2.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[162].setRotationPoint(45F, -29.5F, 2.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[163].setRotationPoint(43F, -28.5F, 3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[164].setRotationPoint(43F, -28.5F, -4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 338
		bodyModel[165].setRotationPoint(39F, -28.5F, -3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[166].setRotationPoint(43.25F, -28.5F, -3F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 341
		bodyModel[167].setRotationPoint(37F, -28.5F, -3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 342
		bodyModel[168].setRotationPoint(37F, -28.5F, 1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[169].setRotationPoint(32.5F, -22.5F, 26.5F);
		bodyModel[169].rotateAngleX = 0.45378561F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[170].setRotationPoint(28.5F, -24F, 26F);
		bodyModel[170].rotateAngleX = 0.45378561F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[171].setRotationPoint(14.5F, -26F, 26F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[172].setRotationPoint(14.5F, -25F, 26F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 347
		bodyModel[173].setRotationPoint(14.5F, -24F, 26F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[174].setRotationPoint(13.5F, -26F, 26F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[175].setRotationPoint(13.5F, -25F, 26F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 350
		bodyModel[176].setRotationPoint(13.5F, -24F, 26F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[177].setRotationPoint(-6.5F, -26F, 26F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[178].setRotationPoint(-6.5F, -25F, 26F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 353
		bodyModel[179].setRotationPoint(-6.5F, -24F, 26F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[180].setRotationPoint(-7.5F, -26F, 26F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[181].setRotationPoint(-7.5F, -25F, 26F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 356
		bodyModel[182].setRotationPoint(-7.5F, -24F, 26F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[183].setRotationPoint(-14.5F, -26F, 26F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[184].setRotationPoint(-14.5F, -25F, 26F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 359
		bodyModel[185].setRotationPoint(-14.5F, -24F, 26F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[186].setRotationPoint(-15.5F, -25.5F, -26F);
		bodyModel[186].rotateAngleX = -0.41887902F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[187].setRotationPoint(-13.5F, -20.5F, -28.5F);
		bodyModel[187].rotateAngleX = -0.41887902F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[188].setRotationPoint(-13.5F, -23.5F, -27F);
		bodyModel[188].rotateAngleX = -0.41887902F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[189].setRotationPoint(-15.5F, -24.5F, -27F);
		bodyModel[189].rotateAngleX = -0.41887902F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 364
		bodyModel[190].setRotationPoint(20.5F, -24.5F, -30F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[191].setRotationPoint(20.5F, -25.5F, -28F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 366
		bodyModel[192].setRotationPoint(20.5F, -26.5F, -28F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[193].setRotationPoint(28.5F, -25F, -29F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[194].setRotationPoint(28.5F, -24F, -29F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 369
		bodyModel[195].setRotationPoint(28.5F, -23F, -29F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[196].setRotationPoint(26.5F, -24F, -28F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[197].setRotationPoint(26.5F, -26F, -26.75F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[198].setRotationPoint(39.5F, -22F, -28.25F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 373
		bodyModel[199].setRotationPoint(38.5F, -26F, -28.25F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 8, 14, 4, 0F,0F, -1.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, -1.5F, 0F, -6F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -6F, -0.5F, 0F); // Box 374
		bodyModel[200].setRotationPoint(-65.5F, -29F, 5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 7, 14, 4, 0F,0F, -0.5F, 0F, -6F, 0F, -1F, -6F, 0F, -1F, 0F, -0.5F, 0F, -6F, -1.5F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, -6F, -1.5F, 0F); // Box 375
		bodyModel[201].setRotationPoint(-63.5F, -29F, 5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 7, 14, 4, 0F,0F, -2F, -1F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, 0F, -2F, -1F, -6F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -6F, 0F, -1F); // Box 376
		bodyModel[202].setRotationPoint(-66.5F, -29F, 5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F); // Box 377
		bodyModel[203].setRotationPoint(-61.5F, -26F, 9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F); // Box 378
		bodyModel[204].setRotationPoint(-61.5F, -26F, 4.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 379
		bodyModel[205].setRotationPoint(-57.5F, -25.5F, 9F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 380
		bodyModel[206].setRotationPoint(-57.5F, -25.5F, 4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 8, 7, 6, 0F,0F, -2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F); // Box 381
		bodyModel[207].setRotationPoint(-55.5F, -16.5F, 4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 382
		bodyModel[208].setRotationPoint(-56F, -18.5F, 6.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 383
		bodyModel[209].setRotationPoint(-59F, -20.5F, 6.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 384
		bodyModel[210].setRotationPoint(-59F, -20.5F, -7.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 385
		bodyModel[211].setRotationPoint(-56F, -18.5F, -7.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 8, 7, 6, 0F,0F, -2F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F); // Box 386
		bodyModel[212].setRotationPoint(-55.5F, -16.5F, -10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 8, 14, 4, 0F,0F, -1.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, -1.5F, 0F, -6F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -6F, -0.5F, 0F); // Box 387
		bodyModel[213].setRotationPoint(-65.5F, -29F, -9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 7, 14, 4, 0F,0F, -2F, -1F, -6F, -1.5F, 0F, -6F, -1.5F, 0F, 0F, -2F, -1F, -6F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -6F, 0F, -1F); // Box 388
		bodyModel[214].setRotationPoint(-66.5F, -29F, -9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 7, 14, 4, 0F,0F, -0.5F, 0F, -6F, 0F, -1F, -6F, 0F, -1F, 0F, -0.5F, 0F, -6F, -1.5F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, -6F, -1.5F, 0F); // Box 389
		bodyModel[215].setRotationPoint(-63.5F, -29F, -9F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F); // Box 390
		bodyModel[216].setRotationPoint(-61.5F, -26F, -5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 391
		bodyModel[217].setRotationPoint(-57.5F, -25.5F, -5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F); // Box 392
		bodyModel[218].setRotationPoint(-61.5F, -26F, -9.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 393
		bodyModel[219].setRotationPoint(-57.5F, -25.5F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[220].setRotationPoint(-58.5F, -26.5F, 23F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[221].setRotationPoint(-59.5F, -26.5F, 23F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 396
		bodyModel[222].setRotationPoint(-59.5F, -24.5F, 23F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 397
		bodyModel[223].setRotationPoint(-59.5F, -24.5F, -25F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[224].setRotationPoint(-59.5F, -26.5F, -25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[225].setRotationPoint(-58.5F, -26.5F, -25F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 7, 4, 8, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[226].setRotationPoint(-62F, -26.5F, 13F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 11, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 401
		bodyModel[227].setRotationPoint(-62F, -22.5F, 13F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 402
		bodyModel[228].setRotationPoint(-61F, -21.5F, 21F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[229].setRotationPoint(-61F, -25.5F, 21F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 404
		bodyModel[230].setRotationPoint(-61F, -21.5F, -27F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 7, 4, 8, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[231].setRotationPoint(-62F, -26.5F, -21F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 11, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 406
		bodyModel[232].setRotationPoint(-62F, -22.5F, -21F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[233].setRotationPoint(-61F, -25.5F, -23F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 408
		bodyModel[234].setRotationPoint(-49.5F, -10.5F, -3.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 409
		bodyModel[235].setRotationPoint(-48.5F, -8.5F, -3.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 410
		bodyModel[236].setRotationPoint(-46.5F, -5.5F, -3.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 411
		bodyModel[237].setRotationPoint(-49.5F, -8F, -2.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 412
		bodyModel[238].setRotationPoint(-49.5F, -8F, 1.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[239].setRotationPoint(-44F, -29.5F, 8F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[240].setRotationPoint(-55F, -27F, -24F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[241].setRotationPoint(-55F, -27F, -14F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[242].setRotationPoint(-55F, -27F, -23F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[243].setRotationPoint(-47F, -27F, -23F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[244].setRotationPoint(-55F, -26.75F, -22F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[245].setRotationPoint(-55F, -26.75F, -20F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[246].setRotationPoint(-55F, -26.75F, -18F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[247].setRotationPoint(-55F, -26.75F, -16F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 9, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[248].setRotationPoint(-55F, -26.75F, 11F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 14, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[249].setRotationPoint(-44F, -29.5F, 11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 426
		bodyModel[250].setRotationPoint(-44F, -29.5F, 18F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 427
		bodyModel[251].setRotationPoint(-42F, -29.5F, 21F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 428
		bodyModel[252].setRotationPoint(-30F, -27.5F, 21F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 42, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[253].setRotationPoint(-29F, -69.5F, 22F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[254].setRotationPoint(-29F, -27.5F, 21F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 431
		bodyModel[255].setRotationPoint(-28F, -27.5F, 21F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F); // Box 432
		bodyModel[256].setRotationPoint(-42F, -28F, 3F);

		bodyModel[257].addShapeBox(0F, 0F, -0.5F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[257].setRotationPoint(-42F, -28F, 5F);

		bodyModel[258].addShapeBox(0F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[258].setRotationPoint(-42F, -27F, 5F);

		bodyModel[259].addShapeBox(0F, 0F, -2F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 435
		bodyModel[259].setRotationPoint(-42F, -28F, 3F);

		bodyModel[260].addShapeBox(0F, 0F, -2F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[260].setRotationPoint(-42F, -27F, 3F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 437
		bodyModel[261].setRotationPoint(-52F, -27.5F, 3.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[262].setRotationPoint(-50F, -27.5F, 3.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 439
		bodyModel[263].setRotationPoint(-48F, -27.5F, 3.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 440
		bodyModel[264].setRotationPoint(-52F, -27.5F, -9.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[265].setRotationPoint(-50F, -27.5F, -9.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 442
		bodyModel[266].setRotationPoint(-48F, -27.5F, -9.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 443
		bodyModel[267].setRotationPoint(-40F, -27.5F, -7.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[268].setRotationPoint(-38F, -27.5F, -7.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 445
		bodyModel[269].setRotationPoint(-36F, -27.5F, -7.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 446
		bodyModel[270].setRotationPoint(-40F, -27.5F, 0.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[271].setRotationPoint(-38F, -27.5F, 0.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 448
		bodyModel[272].setRotationPoint(-36F, -27.5F, 0.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 449
		bodyModel[273].setRotationPoint(-42F, -28.5F, -23.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[274].setRotationPoint(-38F, -28.5F, -23.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 451
		bodyModel[275].setRotationPoint(-34F, -28.5F, -23.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 108
		turretModel[1] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 109
		turretModel[2] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Box 110
		turretModel[3] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 111
		turretModel[4] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 112
		turretModel[5] = new ModelRendererTurbo(this, 697, 105, textureX, textureY); // Box 115
		turretModel[6] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 116
		turretModel[7] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 117
		turretModel[8] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 118
		turretModel[9] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 119
		turretModel[10] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Box 120
		turretModel[11] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 121
		turretModel[12] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 122
		turretModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 123
		turretModel[14] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 124
		turretModel[15] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 125
		turretModel[16] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Box 126
		turretModel[17] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Box 127
		turretModel[18] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 128
		turretModel[19] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 129
		turretModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 130
		turretModel[21] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 131
		turretModel[22] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 132
		turretModel[23] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 133
		turretModel[24] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 134
		turretModel[25] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 135
		turretModel[26] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 136
		turretModel[27] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 137
		turretModel[28] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 138
		turretModel[29] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 145
		turretModel[30] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 146
		turretModel[31] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 147
		turretModel[32] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Box 148
		turretModel[33] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 149
		turretModel[34] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 150
		turretModel[35] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 153
		turretModel[36] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 154
		turretModel[37] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 155
		turretModel[38] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 156
		turretModel[39] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Box 157
		turretModel[40] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 158
		turretModel[41] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 159
		turretModel[42] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Box 160
		turretModel[43] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 161
		turretModel[44] = new ModelRendererTurbo(this, 817, 25, textureX, textureY); // Box 162
		turretModel[45] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 163
		turretModel[46] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 164
		turretModel[47] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 165
		turretModel[48] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 166
		turretModel[49] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 167
		turretModel[50] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 169
		turretModel[51] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 170
		turretModel[52] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 171
		turretModel[53] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 172
		turretModel[54] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 173
		turretModel[55] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Box 174
		turretModel[56] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Box 177
		turretModel[57] = new ModelRendererTurbo(this, 657, 41, textureX, textureY); // Box 178
		turretModel[58] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 179
		turretModel[59] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 180
		turretModel[60] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 181
		turretModel[61] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 182
		turretModel[62] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 184
		turretModel[63] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 185
		turretModel[64] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 186
		turretModel[65] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 187
		turretModel[66] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 188
		turretModel[67] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 189
		turretModel[68] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Box 198
		turretModel[69] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 199
		turretModel[70] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 200
		turretModel[71] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 201
		turretModel[72] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 202
		turretModel[73] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 203
		turretModel[74] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 204
		turretModel[75] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 205
		turretModel[76] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 206
		turretModel[77] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 207
		turretModel[78] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 208
		turretModel[79] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 210
		turretModel[80] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 211
		turretModel[81] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 212
		turretModel[82] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Box 213
		turretModel[83] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 214
		turretModel[84] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 216
		turretModel[85] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 218
		turretModel[86] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 219
		turretModel[87] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 220
		turretModel[88] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 221
		turretModel[89] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 222
		turretModel[90] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 223
		turretModel[91] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 224
		turretModel[92] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 225
		turretModel[93] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 226
		turretModel[94] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 227
		turretModel[95] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 228
		turretModel[96] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 229
		turretModel[97] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 230
		turretModel[98] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 231
		turretModel[99] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 232
		turretModel[100] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 233
		turretModel[101] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 234
		turretModel[102] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 235
		turretModel[103] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 236

		turretModel[0].addShapeBox(-11F, 0F, -22.5F, 17, 16, 45, 0F,-2F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 108
		turretModel[0].setRotationPoint(0F, -42F, 0F);

		turretModel[1].addShapeBox(6F, 0F, -21.5F, 12, 16, 43, 0F,0F, 0F, -7F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 109
		turretModel[1].setRotationPoint(0F, -42F, 0F);

		turretModel[2].addShapeBox(18F, 0F, -20.5F, 5, 15, 41, 0F,0F, 0F, -7F, -3.5F, 1F, -7F, -3.5F, 1F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 110
		turretModel[2].setRotationPoint(0F, -41F, 0F);

		turretModel[3].addShapeBox(19F, 0F, -13.5F, 7, 14, 27, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 111
		turretModel[3].setRotationPoint(0F, -41F, 0F);

		turretModel[4].addShapeBox(26F, 0F, -14.5F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		turretModel[4].setRotationPoint(0F, -38F, 0F);

		turretModel[5].addShapeBox(25F, 0F, -14.5F, 3, 2, 29, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 115
		turretModel[5].setRotationPoint(0F, -40F, 0F);

		turretModel[6].addShapeBox(23F, 0F, -14.5F, 4, 1, 29, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 116
		turretModel[6].setRotationPoint(0F, -41F, 0F);

		turretModel[7].addShapeBox(20F, 0F, -14.5F, 5, 1, 29, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 117
		turretModel[7].setRotationPoint(0F, -42F, 0F);

		turretModel[8].addShapeBox(25F, 0F, -14.5F, 3, 2, 29, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 118
		turretModel[8].setRotationPoint(0F, -33F, 0F);

		turretModel[9].addShapeBox(24.5F, 0F, -14.5F, 3, 3, 29, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 119
		turretModel[9].setRotationPoint(0F, -31F, 0F);

		turretModel[10].addShapeBox(24F, 0F, -14.5F, 1, 3, 29, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		turretModel[10].setRotationPoint(0F, -31F, 0F);

		turretModel[11].addShapeBox(23F, 0F, -14.5F, 1, 3, 29, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 121
		turretModel[11].setRotationPoint(0F, -30.5F, 0F);

		turretModel[12].addShapeBox(26F, 0F, -15.5F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[12].setRotationPoint(0F, -38F, 0F);

		turretModel[13].addShapeBox(25F, 0F, -15.5F, 3, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 123
		turretModel[13].setRotationPoint(0F, -40F, 0F);

		turretModel[14].addShapeBox(23F, 0F, -15.5F, 4, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, -0.75F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 124
		turretModel[14].setRotationPoint(0F, -41F, 0F);

		turretModel[15].addShapeBox(20F, 0F, -15.5F, 5, 1, 1, 0F,0F, 0F, 0F, -3F, 0F, -0.75F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 125
		turretModel[15].setRotationPoint(0F, -42F, 0F);

		turretModel[16].addShapeBox(25F, 0F, -15.5F, 3, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 126
		turretModel[16].setRotationPoint(0F, -33F, 0F);

		turretModel[17].addShapeBox(24.5F, 0F, -15.5F, 3, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 127
		turretModel[17].setRotationPoint(0F, -31F, 0F);

		turretModel[18].addShapeBox(23.5F, 0F, -15.5F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 128
		turretModel[18].setRotationPoint(0F, -31F, 0F);

		turretModel[19].addShapeBox(22.5F, 0F, -15.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 129
		turretModel[19].setRotationPoint(0F, -30F, 0F);

		turretModel[20].addShapeBox(26F, 0F, 14.5F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 130
		turretModel[20].setRotationPoint(0F, -38F, 0F);

		turretModel[21].addShapeBox(25F, 0F, 14.5F, 3, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, 0F); // Box 131
		turretModel[21].setRotationPoint(0F, -40F, 0F);

		turretModel[22].addShapeBox(23F, 0F, 14.5F, 4, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.75F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2F, 0F, 0F); // Box 132
		turretModel[22].setRotationPoint(0F, -41F, 0F);

		turretModel[23].addShapeBox(20F, 0F, 14.5F, 5, 1, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.75F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -3F, 0F, 0F); // Box 133
		turretModel[23].setRotationPoint(0F, -42F, 0F);

		turretModel[24].addShapeBox(25F, 0F, 14.5F, 3, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, 0F); // Box 134
		turretModel[24].setRotationPoint(0F, -33F, 0F);

		turretModel[25].addShapeBox(24.5F, 0F, 14.5F, 3, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F); // Box 135
		turretModel[25].setRotationPoint(0F, -31F, 0F);

		turretModel[26].addShapeBox(24F, 0F, 14.5F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		turretModel[26].setRotationPoint(0F, -31F, 0F);

		turretModel[27].addShapeBox(23F, 0F, 14.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		turretModel[27].setRotationPoint(0F, -30F, 0F);

		turretModel[28].addShapeBox(-23F, 0F, -22.5F, 14, 16, 45, 0F,-8F, 0F, -12F, 0F, 0F, -7F, 0F, 0F, -7F, -8F, 0F, -12F, 0F, 0F, -8F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -8F); // Box 138
		turretModel[28].setRotationPoint(0F, -42F, 0F);

		turretModel[29].addShapeBox(-11F, 0F, 2.5F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		turretModel[29].setRotationPoint(0F, -45F, 0F);

		turretModel[30].addShapeBox(-11F, 0F, 8.5F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 146
		turretModel[30].setRotationPoint(0F, -45F, 0F);

		turretModel[31].addShapeBox(-11F, 0F, 0.5F, 4, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 147
		turretModel[31].setRotationPoint(0F, -45F, 0F);

		turretModel[32].addShapeBox(-1F, 0F, 2.5F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		turretModel[32].setRotationPoint(0F, -45F, 0F);

		turretModel[33].addShapeBox(-4F, 0F, 0.5F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 149
		turretModel[33].setRotationPoint(0F, -45F, 0F);

		turretModel[34].addShapeBox(-4F, 0F, 8.5F, 4, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 150
		turretModel[34].setRotationPoint(0F, -45F, 0F);

		turretModel[35].addBox(-7F, 0F, 10.5F, 3, 3, 1, 0F); // Box 153
		turretModel[35].setRotationPoint(0F, -45F, 0F);

		turretModel[36].addBox(-7F, 0F, 0.5F, 3, 3, 1, 0F); // Box 154
		turretModel[36].setRotationPoint(0F, -45F, 0F);

		turretModel[37].addShapeBox(-4F, 0F, 1.5F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 155
		turretModel[37].setRotationPoint(0F, -44F, 0F);

		turretModel[38].addShapeBox(-10F, 0F, 1.5F, 3, 5, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 156
		turretModel[38].setRotationPoint(0F, -44F, 0F);

		turretModel[39].addBox(-7F, 0F, 1.5F, 3, 5, 9, 0F); // Box 157
		turretModel[39].setRotationPoint(0F, -44F, 0F);

		turretModel[40].addShapeBox(-7F, 0F, 4.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		turretModel[40].setRotationPoint(0F, -45F, 0F);

		turretModel[41].addShapeBox(-7F, 0F, 7.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		turretModel[41].setRotationPoint(0F, -45F, 0F);

		turretModel[42].addShapeBox(-7F, 0F, 1.5F, 3, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		turretModel[42].setRotationPoint(0F, -45F, 0F);

		turretModel[43].addShapeBox(-10F, 0F, 4.5F, 3, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		turretModel[43].setRotationPoint(0F, -45F, 0F);

		turretModel[44].addShapeBox(-4F, 0F, 4.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		turretModel[44].setRotationPoint(0F, -45F, 0F);

		turretModel[45].addShapeBox(-4F, 0F, 7.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 163
		turretModel[45].setRotationPoint(0F, -45F, 0F);

		turretModel[46].addShapeBox(-4F, 0F, 1.5F, 3, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		turretModel[46].setRotationPoint(0F, -45F, 0F);

		turretModel[47].addShapeBox(-10F, 0F, 1.5F, 3, 2, 3, 0F,0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		turretModel[47].setRotationPoint(0F, -45F, 0F);

		turretModel[48].addShapeBox(-10F, 0F, 7.5F, 3, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 166
		turretModel[48].setRotationPoint(0F, -45F, 0F);

		turretModel[49].addShapeBox(-7F, 0F, 5.5F, 3, 1, 9, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 167
		turretModel[49].setRotationPoint(0F, -46F, 0F);

		turretModel[50].addShapeBox(-1F, 0F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		turretModel[50].setRotationPoint(0F, -46F, 0F);

		turretModel[51].addShapeBox(-1F, 0F, 7.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		turretModel[51].setRotationPoint(0F, -46F, 0F);

		turretModel[52].addShapeBox(-11F, 0F, 7.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		turretModel[52].setRotationPoint(0F, -46F, 0F);

		turretModel[53].addShapeBox(-11F, 0F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		turretModel[53].setRotationPoint(0F, -46F, 0F);

		turretModel[54].addShapeBox(-5F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		turretModel[54].setRotationPoint(0F, -46F, 0F);

		turretModel[55].addShapeBox(-7F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		turretModel[55].setRotationPoint(0F, -46F, 0F);

		turretModel[56].addShapeBox(-1F, 0F, 2.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		turretModel[56].setRotationPoint(0F, -47F, 0F);

		turretModel[57].addShapeBox(-11F, 0F, 2.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		turretModel[57].setRotationPoint(0F, -47F, 0F);

		turretModel[58].addShapeBox(-4F, 0F, 0.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 179
		turretModel[58].setRotationPoint(0F, -47F, 0F);

		turretModel[59].addShapeBox(-11F, 0F, 0.5F, 4, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 180
		turretModel[59].setRotationPoint(0F, -47F, 0F);

		turretModel[60].addBox(-7F, 0F, 0.5F, 3, 1, 1, 0F); // Box 181
		turretModel[60].setRotationPoint(0F, -47F, 0F);

		turretModel[61].addShapeBox(-11F, 0F, 8.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 182
		turretModel[61].setRotationPoint(0F, -47F, 0F);

		turretModel[62].addShapeBox(-4F, 0F, 8.5F, 4, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 184
		turretModel[62].setRotationPoint(0F, -47F, 0F);

		turretModel[63].addShapeBox(26F, 0F, -10.5F, 2, 5, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		turretModel[63].setRotationPoint(0F, -38F, 0F);

		turretModel[64].addShapeBox(26F, 0F, -11.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		turretModel[64].setRotationPoint(0F, -38F, 0F);

		turretModel[65].addShapeBox(26F, 0F, -11.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		turretModel[65].setRotationPoint(0F, -35F, 0F);

		turretModel[66].addShapeBox(25F, 0F, -11.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		turretModel[66].setRotationPoint(0F, -36F, 0F);

		turretModel[67].addShapeBox(9F, 0F, -11.5F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		turretModel[67].setRotationPoint(0F, -43F, 0F);

		turretModel[68].addShapeBox(7F, 0F, -11.5F, 2, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 198
		turretModel[68].setRotationPoint(0F, -43F, 0F);

		turretModel[69].addShapeBox(12F, 0F, -11.5F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 199
		turretModel[69].setRotationPoint(0F, -43F, 0F);

		turretModel[70].addShapeBox(8F, 0F, -10.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 200
		turretModel[70].setRotationPoint(0F, -43F, 0F);
		turretModel[70].rotateAngleY = -0.43633231F;

		turretModel[71].addShapeBox(8F, 0F, -8.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 201
		turretModel[71].setRotationPoint(0F, -43F, 0F);
		turretModel[71].rotateAngleY = -0.43633231F;

		turretModel[72].addShapeBox(8F, 0F, -10.5F, 2, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 202
		turretModel[72].setRotationPoint(0F, -44F, 0F);
		turretModel[72].rotateAngleY = -0.43633231F;

		turretModel[73].addShapeBox(8F, 0F, -10.5F, 1, 2, 3, 0F,0F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 203
		turretModel[73].setRotationPoint(0F, -44F, 0F);
		turretModel[73].rotateAngleY = -0.43633231F;

		turretModel[74].addShapeBox(17F, 0F, -10.5F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		turretModel[74].setRotationPoint(0F, -42F, 0F);

		turretModel[75].addShapeBox(17F, 0F, -11.5F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		turretModel[75].setRotationPoint(0F, -43F, 0F);

		turretModel[76].addShapeBox(17F, 0F, -13F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		turretModel[76].setRotationPoint(0F, -42F, 0F);

		turretModel[77].addShapeBox(17F, 0F, -13F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 207
		turretModel[77].setRotationPoint(0F, -43F, 0F);

		turretModel[78].addShapeBox(17F, 0F, -11F, 1, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F); // Box 208
		turretModel[78].setRotationPoint(0F, -43F, 0F);

		turretModel[79].addShapeBox(17F, 0F, 11F, 1, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F); // Box 210
		turretModel[79].setRotationPoint(0F, -43F, 0F);

		turretModel[80].addShapeBox(17F, 0F, 9F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		turretModel[80].setRotationPoint(0F, -42F, 0F);

		turretModel[81].addShapeBox(17F, 0F, 9F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 212
		turretModel[81].setRotationPoint(0F, -43F, 0F);

		turretModel[82].addShapeBox(17F, 0F, 10.5F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		turretModel[82].setRotationPoint(0F, -43F, 0F);

		turretModel[83].addShapeBox(17F, 0F, 11.5F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		turretModel[83].setRotationPoint(0F, -42F, 0F);

		turretModel[84].addShapeBox(-8F, 0F, 5F, 1, 1, 4, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, -1.5F, 0F, -0.75F, -1.5F); // Box 216
		turretModel[84].setRotationPoint(0F, -47F, 0F);
		turretModel[84].rotateAngleY = -0.2443461F;

		turretModel[85].addShapeBox(-8F, 0F, 4F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 218
		turretModel[85].setRotationPoint(0F, -47F, 0F);
		turretModel[85].rotateAngleY = -0.2443461F;

		turretModel[86].addShapeBox(-8F, 0F, 6.5F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 219
		turretModel[86].setRotationPoint(0F, -47F, 0F);
		turretModel[86].rotateAngleY = -0.2443461F;

		turretModel[87].addShapeBox(-13.5F, 0F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F); // Box 220
		turretModel[87].setRotationPoint(0F, -44F, 0F);

		turretModel[88].addShapeBox(-13.5F, 0F, -1.5F, 1, 1, 2, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 221
		turretModel[88].setRotationPoint(0F, -44F, 0F);

		turretModel[89].addShapeBox(-13.5F, 0F, -1.5F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		turretModel[89].setRotationPoint(0F, -43F, 0F);

		turretModel[90].addShapeBox(-13.5F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		turretModel[90].setRotationPoint(0F, -44F, 0F);

		turretModel[91].addShapeBox(-13.5F, 0F, 1F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		turretModel[91].setRotationPoint(0F, -43F, 0F);

		turretModel[92].addShapeBox(-14F, 0F, -2.5F, 1, 1, 1, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 225
		turretModel[92].setRotationPoint(0F, -43F, 0F);

		turretModel[93].addShapeBox(-17F, 0F, -2.5F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 226
		turretModel[93].setRotationPoint(0F, -43F, 0F);

		turretModel[94].addShapeBox(-17F, 0F, -8.5F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		turretModel[94].setRotationPoint(0F, -43F, 0F);

		turretModel[95].addShapeBox(-14F, 0F, -8.5F, 1, 1, 1, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 228
		turretModel[95].setRotationPoint(0F, -43F, 0F);

		turretModel[96].addShapeBox(-17F, 0F, -8.5F, 1, 1, 7, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 229
		turretModel[96].setRotationPoint(0F, -43F, 0F);

		turretModel[97].addShapeBox(-20F, 0F, -7.5F, 1, 1, 5, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 230
		turretModel[97].setRotationPoint(0F, -35F, 0F);

		turretModel[98].addShapeBox(-20F, 0F, -3.5F, 3, 1, 1, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 231
		turretModel[98].setRotationPoint(0F, -35F, 0F);

		turretModel[99].addShapeBox(-20F, 0F, -7.5F, 3, 1, 1, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 232
		turretModel[99].setRotationPoint(0F, -35F, 0F);

		turretModel[100].addShapeBox(-19.5F, 0F, 1.5F, 2, 1, 1, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 233
		turretModel[100].setRotationPoint(0F, -34.5F, 0F);

		turretModel[101].addShapeBox(-19.5F, 0F, -0.5F, 4, 5, 1, 0F,-2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 234
		turretModel[101].setRotationPoint(0F, -38.5F, 0F);

		turretModel[102].addShapeBox(-19.5F, 0F, -9.5F, 4, 5, 1, 0F,-2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 235
		turretModel[102].setRotationPoint(0F, -38.5F, 0F);

		turretModel[103].addShapeBox(-18F, 0F, -9.5F, 2, 1, 10, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 236
		turretModel[103].setRotationPoint(0F, -38.5F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Box 139
		barrelModel[1] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 141

		barrelModel[0].addShapeBox(6F, 0F, 3F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 139
		barrelModel[0].setRotationPoint(20F, -38F, -6F);

		barrelModel[1].addShapeBox(6F, 1.5F, 4.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		barrelModel[1].setRotationPoint(20F, -38F, -6F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 937, 105, textureX, textureY); // Box 246
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 247
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 248
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 249
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 250
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 737, 121, textureX, textureY); // Box 251
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 252
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 253
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 254
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 969, 129, textureX, textureY); // Box 255
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 256
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 257
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 261
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 697, 137, textureX, textureY); // Box 262
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 263
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Box 264
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 265
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 266
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 267
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Box 268
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 269
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 270
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 271
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 272
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 297
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 298
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 299
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 256
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 257
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 258
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 449
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 450
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 451
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 452
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 453
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 454
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Box 455
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 456

		leftTrackWheelModels[0].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		leftTrackWheelModels[0].setRotationPoint(47F, 0F, 18F);

		leftTrackWheelModels[1].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftTrackWheelModels[1].setRotationPoint(47F, 0F, 18F);

		leftTrackWheelModels[2].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 248
		leftTrackWheelModels[2].setRotationPoint(47F, 0F, 18F);

		leftTrackWheelModels[3].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		leftTrackWheelModels[3].setRotationPoint(25F, 0F, 18F);

		leftTrackWheelModels[4].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 250
		leftTrackWheelModels[4].setRotationPoint(25F, 0F, 18F);

		leftTrackWheelModels[5].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		leftTrackWheelModels[5].setRotationPoint(25F, 0F, 18F);

		leftTrackWheelModels[6].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		leftTrackWheelModels[6].setRotationPoint(3F, 0F, 18F);

		leftTrackWheelModels[7].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 253
		leftTrackWheelModels[7].setRotationPoint(3F, 0F, 18F);

		leftTrackWheelModels[8].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		leftTrackWheelModels[8].setRotationPoint(3F, 0F, 18F);

		leftTrackWheelModels[9].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		leftTrackWheelModels[9].setRotationPoint(-19F, 0F, 18F);

		leftTrackWheelModels[10].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 256
		leftTrackWheelModels[10].setRotationPoint(-19F, 0F, 18F);

		leftTrackWheelModels[11].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		leftTrackWheelModels[11].setRotationPoint(-19F, 0F, 18F);

		leftTrackWheelModels[12].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		leftTrackWheelModels[12].setRotationPoint(36F, 0F, 24F);

		leftTrackWheelModels[13].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		leftTrackWheelModels[13].setRotationPoint(36F, 0F, 24F);

		leftTrackWheelModels[14].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 263
		leftTrackWheelModels[14].setRotationPoint(36F, 0F, 24F);

		leftTrackWheelModels[15].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		leftTrackWheelModels[15].setRotationPoint(14F, 0F, 24F);

		leftTrackWheelModels[16].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		leftTrackWheelModels[16].setRotationPoint(14F, 0F, 24F);

		leftTrackWheelModels[17].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 266
		leftTrackWheelModels[17].setRotationPoint(14F, 0F, 24F);

		leftTrackWheelModels[18].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		leftTrackWheelModels[18].setRotationPoint(-8F, 0F, 24F);

		leftTrackWheelModels[19].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 268
		leftTrackWheelModels[19].setRotationPoint(-8F, 0F, 24F);

		leftTrackWheelModels[20].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftTrackWheelModels[20].setRotationPoint(-8F, 0F, 24F);

		leftTrackWheelModels[21].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		leftTrackWheelModels[21].setRotationPoint(-30F, 0F, 24F);

		leftTrackWheelModels[22].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftTrackWheelModels[22].setRotationPoint(-30F, 0F, 24F);

		leftTrackWheelModels[23].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 272
		leftTrackWheelModels[23].setRotationPoint(-30F, 0F, 24F);

		leftTrackWheelModels[24].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 10, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		leftTrackWheelModels[24].setRotationPoint(62.5F, -5.5F, 19F);

		leftTrackWheelModels[25].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		leftTrackWheelModels[25].setRotationPoint(62.5F, -5.5F, 19F);

		leftTrackWheelModels[26].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 299
		leftTrackWheelModels[26].setRotationPoint(62.5F, -5.5F, 19F);

		leftTrackWheelModels[27].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		leftTrackWheelModels[27].setRotationPoint(-41.5F, -3.5F, 24F);

		leftTrackWheelModels[28].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		leftTrackWheelModels[28].setRotationPoint(-41.5F, -3.5F, 24F);

		leftTrackWheelModels[29].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 258
		leftTrackWheelModels[29].setRotationPoint(-41.5F, -3.5F, 24F);

		leftTrackWheelModels[30].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		leftTrackWheelModels[30].setRotationPoint(36F, 0F, 24F);

		leftTrackWheelModels[31].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		leftTrackWheelModels[31].setRotationPoint(14F, 0F, 24F);

		leftTrackWheelModels[32].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		leftTrackWheelModels[32].setRotationPoint(-8F, 0F, 24F);

		leftTrackWheelModels[33].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		leftTrackWheelModels[33].setRotationPoint(-30F, 0F, 24F);

		leftTrackWheelModels[34].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		leftTrackWheelModels[34].setRotationPoint(47F, 0F, 18F);

		leftTrackWheelModels[35].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		leftTrackWheelModels[35].setRotationPoint(25F, 0F, 18F);

		leftTrackWheelModels[36].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		leftTrackWheelModels[36].setRotationPoint(3F, 0F, 18F);

		leftTrackWheelModels[37].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		leftTrackWheelModels[37].setRotationPoint(-19F, 0F, 18F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Box 273
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 857, 153, textureX, textureY); // Box 274
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 905, 153, textureX, textureY); // Box 275
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 276
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 277
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 278
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 279
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 280
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 281
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 282
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 283
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Box 284
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 285
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 286
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 287
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 537, 169, textureX, textureY); // Box 288
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 585, 169, textureX, textureY); // Box 289
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 633, 169, textureX, textureY); // Box 290
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 681, 169, textureX, textureY); // Box 291
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 841, 169, textureX, textureY); // Box 292
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 889, 169, textureX, textureY); // Box 293
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 294
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 295
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 296
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 300
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 721, 177, textureX, textureY); // Box 301
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 777, 177, textureX, textureY); // Box 302
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 259
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 260
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 553, 137, textureX, textureY); // Box 261
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 625, 73, textureX, textureY); // Box 457
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 458
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 459
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 460
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 461
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 462
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 463
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 464

		rightTrackWheelModels[0].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		rightTrackWheelModels[0].setRotationPoint(47F, 0F, -24F);

		rightTrackWheelModels[1].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		rightTrackWheelModels[1].setRotationPoint(47F, 0F, -24F);

		rightTrackWheelModels[2].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 275
		rightTrackWheelModels[2].setRotationPoint(47F, 0F, -24F);

		rightTrackWheelModels[3].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 276
		rightTrackWheelModels[3].setRotationPoint(25F, 0F, -24F);

		rightTrackWheelModels[4].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		rightTrackWheelModels[4].setRotationPoint(25F, 0F, -24F);

		rightTrackWheelModels[5].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		rightTrackWheelModels[5].setRotationPoint(25F, 0F, -24F);

		rightTrackWheelModels[6].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightTrackWheelModels[6].setRotationPoint(3F, 0F, -24F);

		rightTrackWheelModels[7].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightTrackWheelModels[7].setRotationPoint(3F, 0F, -24F);

		rightTrackWheelModels[8].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 281
		rightTrackWheelModels[8].setRotationPoint(3F, 0F, -24F);

		rightTrackWheelModels[9].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 282
		rightTrackWheelModels[9].setRotationPoint(-19F, 0F, -24F);

		rightTrackWheelModels[10].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		rightTrackWheelModels[10].setRotationPoint(-19F, 0F, -24F);

		rightTrackWheelModels[11].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		rightTrackWheelModels[11].setRotationPoint(-19F, 0F, -24F);

		rightTrackWheelModels[12].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightTrackWheelModels[12].setRotationPoint(36F, 0F, -30F);

		rightTrackWheelModels[13].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		rightTrackWheelModels[13].setRotationPoint(36F, 0F, -30F);

		rightTrackWheelModels[14].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 287
		rightTrackWheelModels[14].setRotationPoint(36F, 0F, -30F);

		rightTrackWheelModels[15].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 288
		rightTrackWheelModels[15].setRotationPoint(14F, 0F, -30F);

		rightTrackWheelModels[16].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		rightTrackWheelModels[16].setRotationPoint(14F, 0F, -30F);

		rightTrackWheelModels[17].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightTrackWheelModels[17].setRotationPoint(14F, 0F, -30F);

		rightTrackWheelModels[18].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightTrackWheelModels[18].setRotationPoint(-8F, 0F, -30F);

		rightTrackWheelModels[19].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightTrackWheelModels[19].setRotationPoint(-8F, 0F, -30F);

		rightTrackWheelModels[20].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 293
		rightTrackWheelModels[20].setRotationPoint(-8F, 0F, -30F);

		rightTrackWheelModels[21].addShapeBox(-7F, 3F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 294
		rightTrackWheelModels[21].setRotationPoint(-30F, 0F, -30F);

		rightTrackWheelModels[22].addShapeBox(-7F, -2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		rightTrackWheelModels[22].setRotationPoint(-30F, 0F, -30F);

		rightTrackWheelModels[23].addShapeBox(-7F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightTrackWheelModels[23].setRotationPoint(-30F, 0F, -30F);

		rightTrackWheelModels[24].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 300
		rightTrackWheelModels[24].setRotationPoint(62.5F, -5.5F, -29F);

		rightTrackWheelModels[25].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightTrackWheelModels[25].setRotationPoint(62.5F, -5.5F, -29F);

		rightTrackWheelModels[26].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 10, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		rightTrackWheelModels[26].setRotationPoint(62.5F, -5.5F, -29F);

		rightTrackWheelModels[27].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightTrackWheelModels[27].setRotationPoint(-41.5F, -3.5F, -30F);

		rightTrackWheelModels[28].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		rightTrackWheelModels[28].setRotationPoint(-41.5F, -3.5F, -30F);

		rightTrackWheelModels[29].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 261
		rightTrackWheelModels[29].setRotationPoint(-41.5F, -3.5F, -30F);

		rightTrackWheelModels[30].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		rightTrackWheelModels[30].setRotationPoint(-30F, 0F, -37F);

		rightTrackWheelModels[31].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		rightTrackWheelModels[31].setRotationPoint(-8F, 0F, -37F);

		rightTrackWheelModels[32].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		rightTrackWheelModels[32].setRotationPoint(14F, 0F, -37F);

		rightTrackWheelModels[33].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		rightTrackWheelModels[33].setRotationPoint(36F, 0F, -37F);

		rightTrackWheelModels[34].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		rightTrackWheelModels[34].setRotationPoint(-19F, 0F, -31F);

		rightTrackWheelModels[35].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		rightTrackWheelModels[35].setRotationPoint(3F, 0F, -31F);

		rightTrackWheelModels[36].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		rightTrackWheelModels[36].setRotationPoint(25F, 0F, -31F);

		rightTrackWheelModels[37].addShapeBox(-0.5F, -0.5F, 6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		rightTrackWheelModels[37].setRotationPoint(47F, 0F, -31F);
	}

	private void initanimBarrelModel_1()
	{
		animBarrelModel[0] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 140
		animBarrelModel[1] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 142
		animBarrelModel[2] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 143
		animBarrelModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 144

		animBarrelModel[0].addShapeBox(-7F, 0.75F, 3.75F, 62, 4, 4, 0F,0F, -0.5F, -0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 140
		animBarrelModel[0].setRotationPoint(20F, 0F, -6F);

		animBarrelModel[1].addShapeBox(70F, 0.5F, 3.5F, 5, 5, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 142
		animBarrelModel[1].setRotationPoint(0F, 0F, -6F);

		animBarrelModel[2].addShapeBox(75F, 1F, 4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		animBarrelModel[2].setRotationPoint(0F, 0F, -6F);

		animBarrelModel[3].addShapeBox(79F, 1F, 4F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 144
		animBarrelModel[3].setRotationPoint(0F, 0F, -6F);
		barrelAttach = new Vector3f(1.10F, 2.37F, 0F);
		
		
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[3];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 57, 101, textureX, textureY); // Box 0
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 81, 101, textureX, textureY); // Box 1
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 105, 101, textureX, textureY); // Box 2

		gun_1_Model[0][0].addShapeBox(0F, -0.25F, -0.5F, 7, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0

		gun_1_Model[0][1].addShapeBox(0F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1

		gun_1_Model[0][2].addShapeBox(0F, 0.5F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 2

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(56F, -21F, -12F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);
	}
}