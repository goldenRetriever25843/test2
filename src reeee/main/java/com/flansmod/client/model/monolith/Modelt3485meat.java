//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: t-34-85
// Model Creator: 
// Created on: 04.09.2017 - 15:18:12
// Last changed on: 04.09.2017 - 15:18:12

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelt3485meat extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public Modelt3485meat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[156];
		bodyDoorCloseModel = new ModelRendererTurbo[23];
		turretModel = new ModelRendererTurbo[56];
		barrelModel = new ModelRendererTurbo[9];
		leftTrackWheelModels = new ModelRendererTurbo[66];
		rightTrackWheelModels = new ModelRendererTurbo[66];
		leftTrackModel = new ModelRendererTurbo[11];
		rightTrackModel = new ModelRendererTurbo[11];
		infantryModel = new ModelRendererTurbo[48];

		initbodyModel_1();
		initbodyDoorCloseModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();
		initinfantryModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 60
		bodyModel[13] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 61
		bodyModel[14] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 62
		bodyModel[15] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 63
		bodyModel[16] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 64
		bodyModel[17] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 65
		bodyModel[18] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 66
		bodyModel[19] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 67
		bodyModel[20] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 68
		bodyModel[21] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 69
		bodyModel[22] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 70
		bodyModel[23] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 71
		bodyModel[24] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 72
		bodyModel[25] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 73
		bodyModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 74
		bodyModel[27] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 75
		bodyModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 76
		bodyModel[29] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 77
		bodyModel[30] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 79
		bodyModel[31] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 80
		bodyModel[32] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 81
		bodyModel[33] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 82
		bodyModel[34] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 263
		bodyModel[35] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Box 264
		bodyModel[36] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 265
		bodyModel[37] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 266
		bodyModel[38] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 267
		bodyModel[39] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 268
		bodyModel[40] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 269
		bodyModel[41] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 270
		bodyModel[42] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 271
		bodyModel[43] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 272
		bodyModel[44] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 273
		bodyModel[45] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 274
		bodyModel[46] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 275
		bodyModel[47] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 276
		bodyModel[48] = new ModelRendererTurbo(this, 729, 105, textureX, textureY); // Box 277
		bodyModel[49] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 278
		bodyModel[50] = new ModelRendererTurbo(this, 617, 137, textureX, textureY); // Box 279
		bodyModel[51] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 280
		bodyModel[52] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 281
		bodyModel[53] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 282
		bodyModel[54] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 283
		bodyModel[55] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 290
		bodyModel[56] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 291
		bodyModel[57] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 292
		bodyModel[58] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 293
		bodyModel[59] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 294
		bodyModel[60] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 295
		bodyModel[61] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 296
		bodyModel[62] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 297
		bodyModel[63] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 298
		bodyModel[64] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Box 299
		bodyModel[65] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 300
		bodyModel[66] = new ModelRendererTurbo(this, 593, 177, textureX, textureY); // Box 301
		bodyModel[67] = new ModelRendererTurbo(this, 649, 177, textureX, textureY); // Box 302
		bodyModel[68] = new ModelRendererTurbo(this, 705, 177, textureX, textureY); // Box 303
		bodyModel[69] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 304
		bodyModel[70] = new ModelRendererTurbo(this, 649, 113, textureX, textureY); // Box 305
		bodyModel[71] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Box 306
		bodyModel[72] = new ModelRendererTurbo(this, 761, 177, textureX, textureY); // Box 307
		bodyModel[73] = new ModelRendererTurbo(this, 785, 177, textureX, textureY); // Box 308
		bodyModel[74] = new ModelRendererTurbo(this, 809, 177, textureX, textureY); // Box 309
		bodyModel[75] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 310
		bodyModel[76] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Box 311
		bodyModel[77] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 312
		bodyModel[78] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 313
		bodyModel[79] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 314
		bodyModel[80] = new ModelRendererTurbo(this, 841, 177, textureX, textureY); // Box 315
		bodyModel[81] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 316
		bodyModel[82] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 317
		bodyModel[83] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 318
		bodyModel[84] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 319
		bodyModel[85] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 320
		bodyModel[86] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 322
		bodyModel[87] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 323
		bodyModel[88] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 324
		bodyModel[89] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 308
		bodyModel[90] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 309
		bodyModel[91] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 310
		bodyModel[92] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 311
		bodyModel[93] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 312
		bodyModel[94] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 313
		bodyModel[95] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 314
		bodyModel[96] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 315
		bodyModel[97] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 316
		bodyModel[98] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 317
		bodyModel[99] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Box 318
		bodyModel[100] = new ModelRendererTurbo(this, 905, 185, textureX, textureY); // Box 319
		bodyModel[101] = new ModelRendererTurbo(this, 921, 185, textureX, textureY); // Box 320
		bodyModel[102] = new ModelRendererTurbo(this, 937, 185, textureX, textureY); // Box 321
		bodyModel[103] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Box 322
		bodyModel[104] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 323
		bodyModel[105] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 324
		bodyModel[106] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 325
		bodyModel[107] = new ModelRendererTurbo(this, 953, 185, textureX, textureY); // Box 327
		bodyModel[108] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 329
		bodyModel[109] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 330
		bodyModel[110] = new ModelRendererTurbo(this, 985, 185, textureX, textureY); // Box 329
		bodyModel[111] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 330
		bodyModel[112] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Box 331
		bodyModel[113] = new ModelRendererTurbo(this, 897, 129, textureX, textureY); // Box 332
		bodyModel[114] = new ModelRendererTurbo(this, 937, 145, textureX, textureY); // Box 333
		bodyModel[115] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 334
		bodyModel[116] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 335
		bodyModel[117] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 336
		bodyModel[118] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 337
		bodyModel[119] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 338
		bodyModel[120] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 339
		bodyModel[121] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 340
		bodyModel[122] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 342
		bodyModel[123] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 343
		bodyModel[124] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 347
		bodyModel[125] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 348
		bodyModel[126] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 349
		bodyModel[127] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 350
		bodyModel[128] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 351
		bodyModel[129] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 352
		bodyModel[130] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 353
		bodyModel[131] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 354
		bodyModel[132] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 355
		bodyModel[133] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 356
		bodyModel[134] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 357
		bodyModel[135] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 358
		bodyModel[136] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 359
		bodyModel[137] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 360
		bodyModel[138] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 361
		bodyModel[139] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 362
		bodyModel[140] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 363
		bodyModel[141] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 364
		bodyModel[142] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 365
		bodyModel[143] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 366
		bodyModel[144] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 367
		bodyModel[145] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 368
		bodyModel[146] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 369
		bodyModel[147] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 370
		bodyModel[148] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 374
		bodyModel[149] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 375
		bodyModel[150] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Box 376
		bodyModel[151] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 377
		bodyModel[152] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 378
		bodyModel[153] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 379
		bodyModel[154] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 380
		bodyModel[155] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 381

		bodyModel[0].addShapeBox(-9F, 0F, 0F, 96, 9, 37, 0F,-8F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-52F, -21F, -18F);

		bodyModel[1].addShapeBox(-9F, 0F, 0F, 96, 9, 7, 0F,-8F, 0F, 1F, -15F, 0F, 1F, -15F, 0F, -7F, -8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-52F, -21F, 19F);

		bodyModel[2].addShapeBox(-9F, 0F, 0F, 96, 9, 7, 0F,-8F, 0F, -7F, -15F, 0F, -7F, -15F, 0F, 1F, -8F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-52F, -21F, -25F);

		bodyModel[3].addShapeBox(-9F, 0F, 0F, 113, 7, 37, 0F,-6F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-58F, -12F, -18F);

		bodyModel[4].addShapeBox(-9F, 0F, 0F, 113, 6, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-58F, -4F, -18F);

		bodyModel[5].addBox(-9F, 0F, 0F, 113, 1, 37, 0F); // Box 5
		bodyModel[5].setRotationPoint(-58F, -5F, -18F);

		bodyModel[6].addShapeBox(-9F, 0F, 0F, 102, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-52F, -12F, 19F);

		bodyModel[7].addShapeBox(-9F, 0F, 0F, 7, 4, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-59F, -12F, 19F);

		bodyModel[8].addShapeBox(-9F, 0F, 0F, 7, 7, 11, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6.5F, 0F); // Box 8
		bodyModel[8].setRotationPoint(50F, -12F, 19F);

		bodyModel[9].addShapeBox(-9F, 0F, 0F, 7, 7, 11, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6.5F, 0F); // Box 9
		bodyModel[9].setRotationPoint(50F, -12F, -29F);

		bodyModel[10].addShapeBox(-9F, 0F, 0F, 102, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-52F, -12F, -29F);

		bodyModel[11].addShapeBox(-9F, 0F, 0F, 7, 4, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-59F, -12F, -29F);

		bodyModel[12].addShapeBox(-9F, 0F, 0F, 9, 6, 10, 0F,0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[12].setRotationPoint(33F, -19F, 0.5F);

		bodyModel[13].addShapeBox(-9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F); // Box 61
		bodyModel[13].setRotationPoint(42F, -13.5F, 0.5F);

		bodyModel[14].addShapeBox(-9F, 0F, 0F, 9, 2, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[14].setRotationPoint(33F, -18F, -13F);

		bodyModel[15].addShapeBox(-9F, 0F, 0F, 9, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[15].setRotationPoint(33F, -16F, -13F);

		bodyModel[16].addShapeBox(-9F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[16].setRotationPoint(33F, -15F, -13F);

		bodyModel[17].addShapeBox(-9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[17].setRotationPoint(44F, -12.25F, 0.5F);

		bodyModel[18].addShapeBox(-9F, 0F, 0F, 4, 4, 2, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[18].setRotationPoint(49F, -9.25F, -7F);

		bodyModel[19].addShapeBox(-9F, 0F, 0F, 4, 4, 2, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[19].setRotationPoint(49F, -9.25F, -4.75F);

		bodyModel[20].addShapeBox(-9F, 0F, 0F, 4, 4, 2, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[20].setRotationPoint(49F, -9.25F, -2.5F);

		bodyModel[21].addShapeBox(-9F, 0F, 0F, 4, 4, 2, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[21].setRotationPoint(49F, -9.25F, -0.25F);

		bodyModel[22].addShapeBox(-9F, 0F, 0F, 4, 4, 2, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[22].setRotationPoint(49F, -9.25F, 4.25F);

		bodyModel[23].addShapeBox(-9F, 0F, 0F, 4, 4, 2, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[23].setRotationPoint(49F, -9.25F, 6.5F);

		bodyModel[24].addShapeBox(-9F, 0F, 0F, 4, 4, 2, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[24].setRotationPoint(49F, -9.25F, 2F);

		bodyModel[25].addShapeBox(-9F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[25].setRotationPoint(35F, -18.5F, 0.5F);

		bodyModel[26].addShapeBox(-9F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[26].setRotationPoint(36F, -17.5F, 1.5F);

		bodyModel[27].addShapeBox(-9F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[27].setRotationPoint(36F, -17.5F, 6.5F);

		bodyModel[28].addShapeBox(-9F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[28].setRotationPoint(43F, -15F, -10.5F);

		bodyModel[29].addShapeBox(-9F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 77
		bodyModel[29].setRotationPoint(42F, -18F, -13F);

		bodyModel[30].addShapeBox(-9F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F); // Box 79
		bodyModel[30].setRotationPoint(50F, -12F, 18F);

		bodyModel[31].addShapeBox(-9F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[31].setRotationPoint(44F, -12F, 18F);

		bodyModel[32].addShapeBox(-9F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F); // Box 81
		bodyModel[32].setRotationPoint(50F, -12F, -18F);

		bodyModel[33].addShapeBox(-9F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[33].setRotationPoint(44F, -12F, -18F);

		bodyModel[34].addShapeBox(-9F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 263
		bodyModel[34].setRotationPoint(48F, -10.25F, -7F);

		bodyModel[35].addShapeBox(-9F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 264
		bodyModel[35].setRotationPoint(53F, -6.5F, -7F);

		bodyModel[36].addShapeBox(-9F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 265
		bodyModel[36].setRotationPoint(53F, -6.5F, -4.75F);

		bodyModel[37].addShapeBox(-9F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 266
		bodyModel[37].setRotationPoint(48F, -10.25F, -4.75F);

		bodyModel[38].addShapeBox(-9F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 267
		bodyModel[38].setRotationPoint(53F, -6.5F, -2.5F);

		bodyModel[39].addShapeBox(-9F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 268
		bodyModel[39].setRotationPoint(48F, -10.25F, -2.5F);

		bodyModel[40].addShapeBox(-9F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 269
		bodyModel[40].setRotationPoint(53F, -6.5F, -0.25F);

		bodyModel[41].addShapeBox(-9F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 270
		bodyModel[41].setRotationPoint(48F, -10.25F, -0.25F);

		bodyModel[42].addShapeBox(-9F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 271
		bodyModel[42].setRotationPoint(53F, -6.5F, 2F);

		bodyModel[43].addShapeBox(-9F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 272
		bodyModel[43].setRotationPoint(48F, -10.25F, 2F);

		bodyModel[44].addShapeBox(-9F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 273
		bodyModel[44].setRotationPoint(53F, -6.5F, 4.25F);

		bodyModel[45].addShapeBox(-9F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 274
		bodyModel[45].setRotationPoint(48F, -10.25F, 4.25F);

		bodyModel[46].addShapeBox(-9F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 275
		bodyModel[46].setRotationPoint(53F, -6.5F, 6.5F);

		bodyModel[47].addShapeBox(-9F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 276
		bodyModel[47].setRotationPoint(48F, -10.25F, 6.5F);

		bodyModel[48].addShapeBox(-9F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 277
		bodyModel[48].setRotationPoint(42F, -16F, -13F);

		bodyModel[49].addShapeBox(-9F, 0F, 0F, 24, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[49].setRotationPoint(13F, -16F, 26F);

		bodyModel[50].addShapeBox(-9F, 0F, 0F, 24, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[50].setRotationPoint(13F, -16F, -28F);

		bodyModel[51].addShapeBox(-9F, 0F, 0F, 24, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[51].setRotationPoint(-12F, -16F, -28F);

		bodyModel[52].addShapeBox(-9F, 0F, 0F, 20, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[52].setRotationPoint(-47F, -24F, 22F);

		bodyModel[53].addBox(-9F, 0F, 0F, 20, 3, 7, 0F); // Box 282
		bodyModel[53].setRotationPoint(-47F, -22F, 22F);

		bodyModel[54].addShapeBox(-9F, 0F, 0F, 20, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 283
		bodyModel[54].setRotationPoint(-47F, -19F, 22F);

		bodyModel[55].addShapeBox(-9F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 290
		bodyModel[55].setRotationPoint(-42F, -24.25F, 21.75F);

		bodyModel[56].addShapeBox(-9F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 291
		bodyModel[56].setRotationPoint(-42F, -22.25F, 21.75F);

		bodyModel[57].addShapeBox(-9F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 292
		bodyModel[57].setRotationPoint(-42F, -18.75F, 21.75F);

		bodyModel[58].addShapeBox(-9F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 293
		bodyModel[58].setRotationPoint(-33F, -24.25F, 21.75F);

		bodyModel[59].addShapeBox(-9F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 294
		bodyModel[59].setRotationPoint(-33F, -22.25F, 21.75F);

		bodyModel[60].addShapeBox(-9F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 295
		bodyModel[60].setRotationPoint(-33F, -18.75F, 21.75F);

		bodyModel[61].addShapeBox(-9F, 0F, 0F, 1, 3, 4, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 296
		bodyModel[61].setRotationPoint(-42F, -23.25F, 18.75F);

		bodyModel[62].addShapeBox(-9F, 0F, 0F, 1, 3, 4, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 297
		bodyModel[62].setRotationPoint(-33F, -23.25F, 18.75F);

		bodyModel[63].addShapeBox(-9F, 0F, 0F, 1, 5, 5, 0F,0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 298
		bodyModel[63].setRotationPoint(-42F, -18.25F, 23.75F);

		bodyModel[64].addShapeBox(-9F, 0F, 0F, 1, 5, 5, 0F,0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 299
		bodyModel[64].setRotationPoint(-33F, -18.25F, 23.75F);

		bodyModel[65].addShapeBox(-9F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[65].setRotationPoint(-42F, -23.25F, -22F);

		bodyModel[66].addShapeBox(-9F, 0F, 0F, 20, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[66].setRotationPoint(-47F, -24F, -28F);

		bodyModel[67].addBox(-9F, 0F, 0F, 20, 3, 7, 0F); // Box 302
		bodyModel[67].setRotationPoint(-47F, -22F, -28F);

		bodyModel[68].addShapeBox(-9F, 0F, 0F, 20, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 303
		bodyModel[68].setRotationPoint(-47F, -19F, -28F);

		bodyModel[69].addShapeBox(-9F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 304
		bodyModel[69].setRotationPoint(-42F, -22.25F, -28.25F);

		bodyModel[70].addShapeBox(-9F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 305
		bodyModel[70].setRotationPoint(-42F, -24.25F, -28.25F);

		bodyModel[71].addShapeBox(-9F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 306
		bodyModel[71].setRotationPoint(-33F, -24.25F, -28.25F);

		bodyModel[72].addShapeBox(-9F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 307
		bodyModel[72].setRotationPoint(-33F, -22.25F, -28.25F);

		bodyModel[73].addShapeBox(-9F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 308
		bodyModel[73].setRotationPoint(-33F, -18.75F, -28.25F);

		bodyModel[74].addShapeBox(-9F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 309
		bodyModel[74].setRotationPoint(-42F, -18.75F, -28.25F);

		bodyModel[75].addShapeBox(-9F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[75].setRotationPoint(-33F, -23.25F, -22F);

		bodyModel[76].addShapeBox(-9F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[76].setRotationPoint(-42F, -18.25F, -27.75F);

		bodyModel[77].addShapeBox(-9F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[77].setRotationPoint(-33F, -18.25F, -27.75F);

		bodyModel[78].addShapeBox(-9F, 0F, 0F, 7, 8, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -1F, -0.5F, 0F); // Box 313
		bodyModel[78].setRotationPoint(-59F, -12F, 18F);

		bodyModel[79].addShapeBox(-9F, 0F, 0F, 7, 8, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -1F, -0.5F, 0F); // Box 314
		bodyModel[79].setRotationPoint(-59F, -12F, -18F);

		bodyModel[80].addShapeBox(-9F, 0F, 0F, 13, 2, 37, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[80].setRotationPoint(-44F, -23F, -18F);

		bodyModel[81].addShapeBox(-9F, 0F, 0F, 26, 2, 37, 0F,0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[81].setRotationPoint(-30F, -23F, -18F);

		bodyModel[82].addBox(-9F, 0F, 0F, 9, 1, 5, 0F); // Box 317
		bodyModel[82].setRotationPoint(-41F, -23.25F, -12F);

		bodyModel[83].addBox(-9F, 0F, 0F, 9, 1, 5, 0F); // Box 318
		bodyModel[83].setRotationPoint(-41F, -23.25F, -6F);

		bodyModel[84].addBox(-9F, 0F, 0F, 9, 1, 5, 0F); // Box 319
		bodyModel[84].setRotationPoint(-41F, -23.25F, 0F);

		bodyModel[85].addBox(-9F, 0F, 0F, 9, 1, 5, 0F); // Box 320
		bodyModel[85].setRotationPoint(-41F, -23.25F, 8F);

		bodyModel[86].addBox(-9F, 0F, 0F, 23, 1, 9, 0F); // Box 322
		bodyModel[86].setRotationPoint(-30F, -23.25F, 7F);

		bodyModel[87].addBox(-9F, 0F, 0F, 23, 1, 9, 0F); // Box 323
		bodyModel[87].setRotationPoint(-30F, -23.25F, -16F);

		bodyModel[88].addBox(-9F, 0F, 0F, 23, 1, 12, 0F); // Box 324
		bodyModel[88].setRotationPoint(-30F, -23.25F, -6F);

		bodyModel[89].addShapeBox(-9F, 0F, 0F, 5, 6, 2, 0F,-4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 308
		bodyModel[89].setRotationPoint(-55F, -19F, -12F);

		bodyModel[90].addShapeBox(-9F, 0F, 0F, 5, 6, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 309
		bodyModel[90].setRotationPoint(-55F, -19F, -8F);

		bodyModel[91].addShapeBox(-9F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[91].setRotationPoint(-50F, -19F, -8F);

		bodyModel[92].addShapeBox(-9F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 311
		bodyModel[92].setRotationPoint(-50F, -19F, -12F);

		bodyModel[93].addShapeBox(-9F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[93].setRotationPoint(-50F, -19F, -10F);

		bodyModel[94].addShapeBox(-9F, 0F, 0F, 6, 6, 4, 0F,-4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, -1F, 0F); // Box 313
		bodyModel[94].setRotationPoint(-55F, -19F, -11F);

		bodyModel[95].addShapeBox(-9F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[95].setRotationPoint(-55F, -14F, -10.5F);

		bodyModel[96].addShapeBox(-9F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[96].setRotationPoint(-55F, -13F, -10.5F);

		bodyModel[97].addShapeBox(-9F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 316
		bodyModel[97].setRotationPoint(-55F, -12F, -10.5F);

		bodyModel[98].addShapeBox(-9F, 0F, 0F, 5, 6, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 317
		bodyModel[98].setRotationPoint(-55F, -19F, 12F);

		bodyModel[99].addShapeBox(-9F, 0F, 0F, 6, 6, 4, 0F,-4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, -1F, 0F); // Box 318
		bodyModel[99].setRotationPoint(-55F, -19F, 9F);

		bodyModel[100].addShapeBox(-9F, 0F, 0F, 5, 6, 2, 0F,-4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 319
		bodyModel[100].setRotationPoint(-55F, -19F, 8F);

		bodyModel[101].addShapeBox(-9F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 320
		bodyModel[101].setRotationPoint(-50F, -19F, 8F);

		bodyModel[102].addShapeBox(-9F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[102].setRotationPoint(-50F, -19F, 12F);

		bodyModel[103].addShapeBox(-9F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[103].setRotationPoint(-50F, -19F, 10F);

		bodyModel[104].addShapeBox(-9F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[104].setRotationPoint(-55F, -14F, 9.5F);

		bodyModel[105].addShapeBox(-9F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[105].setRotationPoint(-55F, -13F, 9.5F);

		bodyModel[106].addShapeBox(-9F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 325
		bodyModel[106].setRotationPoint(-55F, -12F, 9.5F);

		bodyModel[107].addShapeBox(-9F, 0F, 0F, 7, 6, 7, 0F,-5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[107].setRotationPoint(-53F, -18F, -2.5F);

		bodyModel[108].addShapeBox(-9F, 0F, 0F, 3, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 329
		bodyModel[108].setRotationPoint(-59F, -7F, 12.5F);

		bodyModel[109].addShapeBox(-9F, 0F, 0F, 3, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 330
		bodyModel[109].setRotationPoint(-59F, -7F, -15.5F);

		bodyModel[110].addShapeBox(-9F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 329
		bodyModel[110].setRotationPoint(-57.5F, -4F, 13.5F);

		bodyModel[111].addShapeBox(-9F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 330
		bodyModel[111].setRotationPoint(-56.5F, -1F, 13.5F);

		bodyModel[112].addShapeBox(-9F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 331
		bodyModel[112].setRotationPoint(-55.5F, 1F, 13.5F);

		bodyModel[113].addShapeBox(-9F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 332
		bodyModel[113].setRotationPoint(-55.5F, 1F, -17.5F);

		bodyModel[114].addShapeBox(-9F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 333
		bodyModel[114].setRotationPoint(-56.5F, -1F, -17.5F);

		bodyModel[115].addShapeBox(-9F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 334
		bodyModel[115].setRotationPoint(-57.5F, -4F, -17.5F);

		bodyModel[116].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 335
		bodyModel[116].setRotationPoint(14F, -21F, 19F);

		bodyModel[117].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 336
		bodyModel[117].setRotationPoint(5F, -21F, 19F);

		bodyModel[118].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 337
		bodyModel[118].setRotationPoint(5F, -21F, 21F);

		bodyModel[119].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 338
		bodyModel[119].setRotationPoint(16F, -21F, 19F);

		bodyModel[120].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 339
		bodyModel[120].setRotationPoint(16F, -21F, 21F);

		bodyModel[121].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 340
		bodyModel[121].setRotationPoint(25F, -21F, 19F);

		bodyModel[122].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 342
		bodyModel[122].setRotationPoint(16F, -21F, -22.5F);

		bodyModel[123].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[123].setRotationPoint(25F, -21F, -22F);

		bodyModel[124].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 347
		bodyModel[124].setRotationPoint(5F, -21F, -22.5F);

		bodyModel[125].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[125].setRotationPoint(16F, -21F, -22F);

		bodyModel[126].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[126].setRotationPoint(5F, -21F, -22F);

		bodyModel[127].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[127].setRotationPoint(14F, -21F, -22F);

		bodyModel[128].addShapeBox(-9F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 351
		bodyModel[128].setRotationPoint(-25.5F, -25F, 12F);

		bodyModel[129].addShapeBox(-9F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 352
		bodyModel[129].setRotationPoint(-18.5F, -25F, 12F);

		bodyModel[130].addShapeBox(-9F, 0F, 0F, 8, 1, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 353
		bodyModel[130].setRotationPoint(-25.5F, -25.5F, 12F);

		bodyModel[131].addShapeBox(-9F, 0F, 0F, 8, 1, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 354
		bodyModel[131].setRotationPoint(-25.5F, -25.5F, -12F);

		bodyModel[132].addShapeBox(-9F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 355
		bodyModel[132].setRotationPoint(-25.5F, -25F, -12F);

		bodyModel[133].addShapeBox(-9F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 356
		bodyModel[133].setRotationPoint(-18.5F, -25F, -12F);

		bodyModel[134].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 357
		bodyModel[134].setRotationPoint(-7F, -22F, -21.5F);

		bodyModel[135].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[135].setRotationPoint(-7F, -22F, -21F);

		bodyModel[136].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[136].setRotationPoint(2F, -22F, -21F);

		bodyModel[137].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 360
		bodyModel[137].setRotationPoint(-18F, -22F, -21.5F);

		bodyModel[138].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[138].setRotationPoint(-18F, -22F, -21F);

		bodyModel[139].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[139].setRotationPoint(-9F, -22F, -21F);

		bodyModel[140].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 363
		bodyModel[140].setRotationPoint(-7F, -22F, 21F);

		bodyModel[141].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 364
		bodyModel[141].setRotationPoint(2F, -22F, 19F);

		bodyModel[142].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 365
		bodyModel[142].setRotationPoint(-7F, -22F, 19F);

		bodyModel[143].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 366
		bodyModel[143].setRotationPoint(-9F, -22F, 19F);

		bodyModel[144].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 367
		bodyModel[144].setRotationPoint(-18F, -22F, 21F);

		bodyModel[145].addShapeBox(-9F, 0F, 0F, 1, 2, 3, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 368
		bodyModel[145].setRotationPoint(-18F, -22F, 19F);

		bodyModel[146].addShapeBox(-9F, 0F, 0F, 2, 4, 2, 0F,0F, -1.75F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[146].setRotationPoint(49F, -11F, -11F);

		bodyModel[147].addShapeBox(-9F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 370
		bodyModel[147].setRotationPoint(48F, -10F, -11F);

		bodyModel[148].addShapeBox(-9F, 0F, 0F, 2, 4, 2, 0F,0F, -1.75F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[148].setRotationPoint(49F, -11F, 9.5F);

		bodyModel[149].addShapeBox(-9F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 375
		bodyModel[149].setRotationPoint(48F, -10F, 9.5F);

		bodyModel[150].addShapeBox(-9F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[150].setRotationPoint(47F, -12F, -14.5F);

		bodyModel[151].addShapeBox(-9F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[151].setRotationPoint(46.25F, -12F, -14.5F);

		bodyModel[152].addShapeBox(-9F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[152].setRotationPoint(46.25F, -12F, 14.5F);

		bodyModel[153].addShapeBox(-9F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[153].setRotationPoint(47F, -12F, 14.5F);

		bodyModel[154].addShapeBox(-9F, 0F, 0F, 2, 2, 2, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[154].setRotationPoint(54.25F, -6.5F, -13.5F);

		bodyModel[155].addShapeBox(-9F, 0F, 0F, 2, 2, 2, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[155].setRotationPoint(54.25F, -6.5F, 12.5F);
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 20, 300, textureX, textureY); // Box 425
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 426
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 427
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 20, 300, textureX, textureY); // Box 428
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 429
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 430
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 80, 300, textureX, textureY); // Box 431
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 80, 300, textureX, textureY); // Box 432
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 80, 300, textureX, textureY); // Box 433
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 95, 300, textureX, textureY); // Box 434
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 435
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 436
		bodyDoorCloseModel[12] = new ModelRendererTurbo(this, 20, 300, textureX, textureY); // Box 437
		bodyDoorCloseModel[13] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 438
		bodyDoorCloseModel[14] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 439
		bodyDoorCloseModel[15] = new ModelRendererTurbo(this, 20, 300, textureX, textureY); // Box 440
		bodyDoorCloseModel[16] = new ModelRendererTurbo(this, 20, 300, textureX, textureY); // Box 441
		bodyDoorCloseModel[17] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 442
		bodyDoorCloseModel[18] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 443
		bodyDoorCloseModel[19] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 444
		bodyDoorCloseModel[20] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 445
		bodyDoorCloseModel[21] = new ModelRendererTurbo(this, 20, 300, textureX, textureY); // Box 446
		bodyDoorCloseModel[22] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 447

		bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 425
		bodyDoorCloseModel[0].setRotationPoint(15.5F, -22F, -22F);
		bodyDoorCloseModel[0].rotateAngleX = -0.29670597F;

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 426
		bodyDoorCloseModel[1].setRotationPoint(16F, -19F, -26F);
		bodyDoorCloseModel[1].rotateAngleX = -1.01229097F;
		bodyDoorCloseModel[1].rotateAngleY = -0.19198622F;

		bodyDoorCloseModel[2].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 427
		bodyDoorCloseModel[2].setRotationPoint(21F, -19F, -25F);
		bodyDoorCloseModel[2].rotateAngleX = -1.01229097F;
		bodyDoorCloseModel[2].rotateAngleY = 0.62831853F;

		bodyDoorCloseModel[3].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 428
		bodyDoorCloseModel[3].setRotationPoint(-8.5F, -24F, -24F);
		bodyDoorCloseModel[3].rotateAngleX = -0.29670597F;

		bodyDoorCloseModel[4].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 429
		bodyDoorCloseModel[4].setRotationPoint(-10F, -19F, -26F);
		bodyDoorCloseModel[4].rotateAngleX = -1.01229097F;
		bodyDoorCloseModel[4].rotateAngleY = -0.19198622F;

		bodyDoorCloseModel[5].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 430
		bodyDoorCloseModel[5].setRotationPoint(-5F, -19F, -25F);
		bodyDoorCloseModel[5].rotateAngleX = -1.01229097F;
		bodyDoorCloseModel[5].rotateAngleY = 0.62831853F;

		bodyDoorCloseModel[6].addShapeBox(-1F, 0F, -2F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 431
		bodyDoorCloseModel[6].setRotationPoint(-33F, -25F, -5F);
		bodyDoorCloseModel[6].rotateAngleZ = -1.57079633F;

		bodyDoorCloseModel[7].addShapeBox(-1F, 0F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyDoorCloseModel[7].setRotationPoint(-34F, -24F, -4F);
		bodyDoorCloseModel[7].rotateAngleZ = -1.57079633F;

		bodyDoorCloseModel[8].addShapeBox(-1F, 0F, -2F, 3, 3, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyDoorCloseModel[8].setRotationPoint(-35F, -25F, -5F);
		bodyDoorCloseModel[8].rotateAngleZ = -1.57079633F;

		bodyDoorCloseModel[9].addBox(-1F, 0F, -2F, 3, 5, 3, 0F); // Box 434
		bodyDoorCloseModel[9].setRotationPoint(-38F, -25F, -5F);
		bodyDoorCloseModel[9].rotateAngleZ = -1.57079633F;

		bodyDoorCloseModel[10].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 435
		bodyDoorCloseModel[10].setRotationPoint(-29F, -19F, -26F);
		bodyDoorCloseModel[10].rotateAngleX = -1.01229097F;
		bodyDoorCloseModel[10].rotateAngleY = -0.34906585F;

		bodyDoorCloseModel[11].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 436
		bodyDoorCloseModel[11].setRotationPoint(-24F, -19F, -25F);
		bodyDoorCloseModel[11].rotateAngleX = -1.01229097F;
		bodyDoorCloseModel[11].rotateAngleY = 0.36651914F;

		bodyDoorCloseModel[12].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 437
		bodyDoorCloseModel[12].setRotationPoint(-28.5F, -24F, -24F);
		bodyDoorCloseModel[12].rotateAngleX = -0.29670597F;

		bodyDoorCloseModel[13].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 438
		bodyDoorCloseModel[13].setRotationPoint(-13F, -17F, 24F);
		bodyDoorCloseModel[13].rotateAngleX = -1.09955743F;
		bodyDoorCloseModel[13].rotateAngleY = -2.63544717F;
		bodyDoorCloseModel[13].rotateAngleZ = -0.01745329F;

		bodyDoorCloseModel[14].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 439
		bodyDoorCloseModel[14].setRotationPoint(-9F, -16F, 25F);
		bodyDoorCloseModel[14].rotateAngleX = -1.08210414F;
		bodyDoorCloseModel[14].rotateAngleY = -3.5081118F;

		bodyDoorCloseModel[15].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 440
		bodyDoorCloseModel[15].setRotationPoint(-9.5F, -24F, 24F);
		bodyDoorCloseModel[15].rotateAngleX = -0.29670597F;
		bodyDoorCloseModel[15].rotateAngleY = -2.96705973F;

		bodyDoorCloseModel[16].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 441
		bodyDoorCloseModel[16].setRotationPoint(13.5F, -24F, 24F);
		bodyDoorCloseModel[16].rotateAngleX = -0.29670597F;
		bodyDoorCloseModel[16].rotateAngleY = -3.14159265F;

		bodyDoorCloseModel[17].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 442
		bodyDoorCloseModel[17].setRotationPoint(10F, -17F, 24F);
		bodyDoorCloseModel[17].rotateAngleX = -1.09955743F;
		bodyDoorCloseModel[17].rotateAngleY = -2.63544717F;
		bodyDoorCloseModel[17].rotateAngleZ = -0.01745329F;

		bodyDoorCloseModel[18].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 443
		bodyDoorCloseModel[18].setRotationPoint(13F, -17F, 25F);
		bodyDoorCloseModel[18].rotateAngleX = -1.08210414F;
		bodyDoorCloseModel[18].rotateAngleY = -3.5081118F;

		bodyDoorCloseModel[19].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 444
		bodyDoorCloseModel[19].setRotationPoint(-45F, -23F, 20F);
		bodyDoorCloseModel[19].rotateAngleX = -1.88495559F;
		bodyDoorCloseModel[19].rotateAngleY = -2.63544717F;

		bodyDoorCloseModel[20].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 445
		bodyDoorCloseModel[20].setRotationPoint(-40F, -23F, 20F);
		bodyDoorCloseModel[20].rotateAngleX = -1.83259571F;
		bodyDoorCloseModel[20].rotateAngleY = -3.4906585F;

		bodyDoorCloseModel[21].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 446
		bodyDoorCloseModel[21].setRotationPoint(-43.5F, -40F, 16.5F);
		bodyDoorCloseModel[21].rotateAngleY = -2.47836754F;

		bodyDoorCloseModel[22].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 447
		bodyDoorCloseModel[22].setRotationPoint(-44F, -34F, 13F);
		bodyDoorCloseModel[22].rotateAngleX = -0.61086524F;
		bodyDoorCloseModel[22].rotateAngleY = -2.63544717F;
		bodyDoorCloseModel[22].rotateAngleZ = -0.27925268F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 13
		turretModel[1] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 14
		turretModel[2] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 15
		turretModel[3] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 16
		turretModel[4] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 17
		turretModel[5] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 18
		turretModel[6] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Box 19
		turretModel[7] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 20
		turretModel[8] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 21
		turretModel[9] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 22
		turretModel[10] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 23
		turretModel[11] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 24
		turretModel[12] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 26
		turretModel[13] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 27
		turretModel[14] = new ModelRendererTurbo(this, 585, 89, textureX, textureY); // Box 28
		turretModel[15] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 29
		turretModel[16] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 30
		turretModel[17] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 31
		turretModel[18] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 32
		turretModel[19] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 33
		turretModel[20] = new ModelRendererTurbo(this, 729, 105, textureX, textureY); // Box 34
		turretModel[21] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 35
		turretModel[22] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 36
		turretModel[23] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 37
		turretModel[24] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 38
		turretModel[25] = new ModelRendererTurbo(this, 889, 105, textureX, textureY); // Box 39
		turretModel[26] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 40
		turretModel[27] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 41
		turretModel[28] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 51
		turretModel[29] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 52
		turretModel[30] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 53
		turretModel[31] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 54
		turretModel[32] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 55
		turretModel[33] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 56
		turretModel[34] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 57
		turretModel[35] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 58
		turretModel[36] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 59
		turretModel[37] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 58
		turretModel[38] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 59
		turretModel[39] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 237
		turretModel[40] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 238
		turretModel[41] = new ModelRendererTurbo(this, 561, 169, textureX, textureY); // Box 239
		turretModel[42] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 240
		turretModel[43] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 241
		turretModel[44] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 242
		turretModel[45] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 243
		turretModel[46] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 244
		turretModel[47] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 254
		turretModel[48] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 255
		turretModel[49] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 256
		turretModel[50] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 257
		turretModel[51] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 258
		turretModel[52] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 259
		turretModel[53] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 260
		turretModel[54] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 261
		turretModel[55] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 262

		turretModel[0].addShapeBox(-4F, 0F, -16F, 5, 3, 33, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 13
		turretModel[0].setRotationPoint(0F, -24F, 0F);

		turretModel[1].addShapeBox(-9F, 0F, -15F, 5, 3, 31, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 14
		turretModel[1].setRotationPoint(0F, -24F, 0F);

		turretModel[2].addShapeBox(-14F, 0F, -13F, 5, 3, 27, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 15
		turretModel[2].setRotationPoint(0F, -24F, 0F);

		turretModel[3].addShapeBox(9F, 0F, -15F, 5, 3, 31, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 16
		turretModel[3].setRotationPoint(0F, -24F, 0F);

		turretModel[4].addShapeBox(4F, 0F, -16F, 5, 3, 33, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 17
		turretModel[4].setRotationPoint(0F, -24F, 0F);

		turretModel[5].addShapeBox(14F, 0F, -13F, 5, 3, 27, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 18
		turretModel[5].setRotationPoint(0F, -24F, 0F);

		turretModel[6].addBox(1F, 0F, -16F, 3, 3, 33, 0F); // Box 19
		turretModel[6].setRotationPoint(0F, -24F, 0F);

		turretModel[7].addShapeBox(12F, 0F, -16F, 9, 3, 33, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1F); // Box 20
		turretModel[7].setRotationPoint(0F, -27F, 0F);

		turretModel[8].addShapeBox(3F, 0F, -17F, 9, 3, 35, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 21
		turretModel[8].setRotationPoint(0F, -27F, 0F);

		turretModel[9].addShapeBox(-3F, 0F, -18F, 6, 3, 37, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 22
		turretModel[9].setRotationPoint(0F, -27F, 0F);

		turretModel[10].addShapeBox(-14F, 0F, -18F, 11, 3, 37, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F); // Box 23
		turretModel[10].setRotationPoint(0F, -27F, 0F);

		turretModel[11].addShapeBox(-21F, 0F, -16F, 7, 3, 33, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 24
		turretModel[11].setRotationPoint(0F, -27F, 0F);

		turretModel[12].addShapeBox(-26F, 0F, -13F, 5, 3, 27, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, -1F, -1F, -7F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, -1F, -7F); // Box 26
		turretModel[12].setRotationPoint(0F, -27F, 0F);

		turretModel[13].addShapeBox(-3F, 0F, -17F, 6, 11, 35, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		turretModel[13].setRotationPoint(0F, -38F, 0F);

		turretModel[14].addShapeBox(-14F, 0F, -17F, 11, 11, 35, 0F,0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 28
		turretModel[14].setRotationPoint(0F, -38F, 0F);

		turretModel[15].addShapeBox(-21F, 0F, -15F, 7, 11, 31, 0F,0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 29
		turretModel[15].setRotationPoint(0F, -38F, 0F);

		turretModel[16].addShapeBox(-26F, 0F, -12F, 5, 11, 25, 0F,-2F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 30
		turretModel[16].setRotationPoint(0F, -38F, 0F);

		turretModel[17].addShapeBox(3F, 0F, -17F, 9, 11, 35, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 31
		turretModel[17].setRotationPoint(0F, -38F, 0F);

		turretModel[18].addShapeBox(12F, 0F, -16F, 9, 11, 33, 0F,0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 32
		turretModel[18].setRotationPoint(0F, -38F, 0F);

		turretModel[19].addShapeBox(21F, 0F, -13F, 5, 3, 27, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, -2F); // Box 33
		turretModel[19].setRotationPoint(0F, -27F, 0F);

		turretModel[20].addShapeBox(21F, 0F, -14F, 5, 9, 29, 0F,0F, 0F, -3F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 34
		turretModel[20].setRotationPoint(0F, -36F, 0F);

		turretModel[21].addShapeBox(21F, 0F, -11F, 5, 4, 23, 0F,0F, 0F, -1F, -1F, -3F, -3F, -1F, -3F, -3F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 35
		turretModel[21].setRotationPoint(0F, -37F, 0F);

		turretModel[22].addShapeBox(12F, 0F, -13F, 9, 4, 27, 0F,0F, 0F, -1F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -3F, 0F); // Box 36
		turretModel[22].setRotationPoint(0F, -39F, 0F);

		turretModel[23].addShapeBox(3F, 0F, -15F, 9, 1, 31, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 37
		turretModel[23].setRotationPoint(0F, -39F, 0F);

		turretModel[24].addShapeBox(-3F, 0F, -15F, 6, 1, 31, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[24].setRotationPoint(0F, -39F, 0F);

		turretModel[25].addShapeBox(-14F, 0F, -15F, 11, 1, 31, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 39
		turretModel[25].setRotationPoint(0F, -39F, 0F);

		turretModel[26].addShapeBox(-21F, 0F, -12F, 7, 1, 25, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 40
		turretModel[26].setRotationPoint(0F, -39F, 0F);

		turretModel[27].addShapeBox(-24F, 0F, -9F, 3, 1, 19, 0F,-1F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 41
		turretModel[27].setRotationPoint(0F, -39F, 0F);

		turretModel[28].addShapeBox(-14F, 0F, 1F, 4, 4, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 51
		turretModel[28].setRotationPoint(0F, -43F, 0F);

		turretModel[29].addShapeBox(-5F, 0F, 1F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 52
		turretModel[29].setRotationPoint(0F, -43F, 0F);

		turretModel[30].addBox(-10F, 0F, 1F, 5, 4, 12, 0F); // Box 53
		turretModel[30].setRotationPoint(0F, -43F, 0F);

		turretModel[31].addShapeBox(-4F, 0F, -11F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 54
		turretModel[31].setRotationPoint(0F, -39.5F, 0F);

		turretModel[32].addBox(-8F, 0F, -11F, 4, 1, 10, 0F); // Box 55
		turretModel[32].setRotationPoint(0F, -39.5F, 0F);

		turretModel[33].addShapeBox(-11F, 0F, -11F, 3, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 56
		turretModel[33].setRotationPoint(0F, -39.5F, 0F);

		turretModel[34].addShapeBox(18F, 0F, -8F, 3, 1, 16, 0F,0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		turretModel[34].setRotationPoint(0F, -38F, 0F);

		turretModel[35].addShapeBox(21F, 0F, -8F, 3, 3, 16, 0F,0F, -0.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		turretModel[35].setRotationPoint(0F, -37.5F, 0F);

		turretModel[36].addShapeBox(24F, 0F, -7F, 3, 9, 14, 0F,0F, -0.25F, 0F, -0.75F, -2.25F, 0F, -0.75F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 59
		turretModel[36].setRotationPoint(0F, -35.25F, 0F);

		turretModel[37].addShapeBox(23F, 0F, -7F, 4, 4, 14, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -3.75F, -0.75F, 0F, -3.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 58
		turretModel[37].setRotationPoint(0F, -27.25F, 0F);

		turretModel[38].addShapeBox(19F, 0F, -7F, 4, 1, 14, 0F,0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 59
		turretModel[38].setRotationPoint(0F, -24.25F, 0F);

		turretModel[39].addShapeBox(-5F, 0F, 1F, 4, 1, 12, 0F,0F, 0F, -1F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 237
		turretModel[39].setRotationPoint(0F, -44F, 0F);

		turretModel[40].addShapeBox(-10F, 0F, 1F, 5, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		turretModel[40].setRotationPoint(0F, -44F, 0F);

		turretModel[41].addShapeBox(-14F, 0F, 1F, 4, 1, 12, 0F,-1F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 239
		turretModel[41].setRotationPoint(0F, -44F, 0F);

		turretModel[42].addBox(-5F, 0F, 8F, 1, 1, 1, 0F); // Box 240
		turretModel[42].setRotationPoint(0F, -45F, 0F);

		turretModel[43].addBox(-5F, 0F, 6F, 1, 1, 1, 0F); // Box 241
		turretModel[43].setRotationPoint(0F, -45F, 0F);

		turretModel[44].addShapeBox(-4F, 0F, 6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 242
		turretModel[44].setRotationPoint(0F, -45F, 0F);

		turretModel[45].addShapeBox(-5.5F, 0F, 3F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 243
		turretModel[45].setRotationPoint(0F, -45F, 0F);

		turretModel[46].addShapeBox(-4.5F, 0F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 244
		turretModel[46].setRotationPoint(0F, -45F, 0F);

		turretModel[47].addShapeBox(0.5F, 0F, 12.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		turretModel[47].setRotationPoint(0F, -40F, 0F);

		turretModel[48].addBox(1F, 0F, 13F, 1, 2, 1, 0F); // Box 255
		turretModel[48].setRotationPoint(0F, -42F, 0F);

		turretModel[49].addShapeBox(0.5F, 0F, 12.5F, 1, 2, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 256
		turretModel[49].setRotationPoint(0F, -44F, 0F);

		turretModel[50].addShapeBox(3F, 0F, 10F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 257
		turretModel[50].setRotationPoint(0F, -40.5F, 0F);

		turretModel[51].addShapeBox(5F, 0F, 10F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 258
		turretModel[51].setRotationPoint(0F, -40.5F, 0F);

		turretModel[52].addBox(4F, 0F, 10F, 1, 2, 3, 0F); // Box 259
		turretModel[52].setRotationPoint(0F, -40.5F, 0F);

		turretModel[53].addBox(8F, 0F, -11F, 1, 2, 3, 0F); // Box 260
		turretModel[53].setRotationPoint(0F, -40.5F, 0F);

		turretModel[54].addShapeBox(9F, 0F, -11F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 261
		turretModel[54].setRotationPoint(0F, -40.5F, 0F);

		turretModel[55].addShapeBox(7F, 0F, -11F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 262
		turretModel[55].setRotationPoint(0F, -40.5F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 42
		barrelModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 43
		barrelModel[2] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 44
		barrelModel[3] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 45
		barrelModel[4] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 46
		barrelModel[5] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 47
		barrelModel[6] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 48
		barrelModel[7] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 49
		barrelModel[8] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 50

		barrelModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		barrelModel[0].setRotationPoint(25F, -32.5F, -2.5F);

		barrelModel[1].addBox(0F, 2F, 0F, 6, 2, 6, 0F); // Box 43
		barrelModel[1].setRotationPoint(25F, -32.5F, -2.5F);

		barrelModel[2].addShapeBox(0F, 4F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 44
		barrelModel[2].setRotationPoint(25F, -32.5F, -2.5F);

		barrelModel[3].addShapeBox(6F, 4F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2F); // Box 45
		barrelModel[3].setRotationPoint(25F, -32.5F, -2.5F);

		barrelModel[4].addShapeBox(6F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 46
		barrelModel[4].setRotationPoint(25F, -32.5F, -2.5F);

		barrelModel[5].addShapeBox(6F, 2F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 47
		barrelModel[5].setRotationPoint(25F, -32.5F, -2.5F);

		barrelModel[6].addShapeBox(7F, 1F, 1F, 58, 2, 4, 0F,0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F); // Box 48
		barrelModel[6].setRotationPoint(25F, -32.5F, -2.5F);

		barrelModel[7].addShapeBox(7F, 3F, 1F, 58, 2, 4, 0F,0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F); // Box 49
		barrelModel[7].setRotationPoint(25F, -32.5F, -2.5F);

		barrelModel[8].addShapeBox(7F, 2F, 1F, 58, 2, 4, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 50
		barrelModel[8].setRotationPoint(25F, -32.5F, -2.5F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 105
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 106
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 841, 145, textureX, textureY); // Box 107
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 108
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 109
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 110
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 111
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 112
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 113
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 114
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 115
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 116
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 889, 145, textureX, textureY); // Box 117
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 118
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 119
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 120
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 121
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 122
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 123
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 124
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 125
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 126
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 127
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 128
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 129
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 130
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 131
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 132
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 133
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Box 134
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 135
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 136
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 137
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 138
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 139
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 140
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 141
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // Box 142
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 929, 153, textureX, textureY); // Box 143
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 144
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 145
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 146
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Box 147
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Box 148
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 149
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 150
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 151
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 152
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 153
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 154
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 155
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Box 156
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 157
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 158
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 159
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 160
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 161
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 162
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 163
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 164
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 165
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 166
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 167
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 168
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 169
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 170

		leftTrackWheelModels[0].addShapeBox(-16F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		leftTrackWheelModels[0].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[1].addShapeBox(-16F, -2F, 0F, 15, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		leftTrackWheelModels[1].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[2].addShapeBox(-16F, 2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 107
		leftTrackWheelModels[2].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[3].addShapeBox(-16F, -7F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 108
		leftTrackWheelModels[3].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[4].addShapeBox(-7F, 2F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 109
		leftTrackWheelModels[4].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[5].addShapeBox(-7F, -7F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 110
		leftTrackWheelModels[5].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[6].addShapeBox(-16F, 2F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 111
		leftTrackWheelModels[6].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[7].addBox(-11F, -7F, 6F, 5, 1, 1, 0F); // Box 112
		leftTrackWheelModels[7].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[8].addBox(-11F, 6F, 6F, 5, 1, 1, 0F); // Box 113
		leftTrackWheelModels[8].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[9].addBox(-16F, -2F, 6F, 1, 4, 1, 0F); // Box 114
		leftTrackWheelModels[9].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[10].addBox(-2F, -2F, 6F, 1, 4, 1, 0F); // Box 115
		leftTrackWheelModels[10].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[11].addBox(-9F, -0.5F, 6F, 1, 1, 1, 0F); // Box 116
		leftTrackWheelModels[11].setRotationPoint(-38F, 2F, 20F);

		leftTrackWheelModels[12].addShapeBox(-16F, -2F, 0F, 15, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftTrackWheelModels[12].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[13].addShapeBox(-16F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		leftTrackWheelModels[13].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[14].addShapeBox(-16F, 2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 119
		leftTrackWheelModels[14].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[15].addShapeBox(-7F, 2F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftTrackWheelModels[15].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[16].addBox(-2F, -2F, 6F, 1, 4, 1, 0F); // Box 121
		leftTrackWheelModels[16].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[17].addShapeBox(-7F, -7F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 122
		leftTrackWheelModels[17].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[18].addBox(-9F, -0.5F, 6F, 1, 1, 1, 0F); // Box 123
		leftTrackWheelModels[18].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[19].addBox(-11F, 6F, 6F, 5, 1, 1, 0F); // Box 124
		leftTrackWheelModels[19].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[20].addShapeBox(-16F, 2F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 125
		leftTrackWheelModels[20].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[21].addBox(-16F, -2F, 6F, 1, 4, 1, 0F); // Box 126
		leftTrackWheelModels[21].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[22].addShapeBox(-16F, -7F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftTrackWheelModels[22].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[23].addBox(-11F, -7F, 6F, 5, 1, 1, 0F); // Box 128
		leftTrackWheelModels[23].setRotationPoint(-20F, 2F, 20F);

		leftTrackWheelModels[24].addShapeBox(-16F, -2F, 0F, 15, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		leftTrackWheelModels[24].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[25].addShapeBox(-16F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		leftTrackWheelModels[25].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[26].addShapeBox(-16F, 2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 131
		leftTrackWheelModels[26].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[27].addShapeBox(-7F, 2F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 132
		leftTrackWheelModels[27].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[28].addBox(-2F, -2F, 6F, 1, 4, 1, 0F); // Box 133
		leftTrackWheelModels[28].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[29].addShapeBox(-7F, -7F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 134
		leftTrackWheelModels[29].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[30].addBox(-9F, -0.5F, 6F, 1, 1, 1, 0F); // Box 135
		leftTrackWheelModels[30].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[31].addBox(-11F, 6F, 6F, 5, 1, 1, 0F); // Box 136
		leftTrackWheelModels[31].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[32].addShapeBox(-16F, 2F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 137
		leftTrackWheelModels[32].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[33].addBox(-16F, -2F, 6F, 1, 4, 1, 0F); // Box 138
		leftTrackWheelModels[33].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[34].addShapeBox(-16F, -7F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 139
		leftTrackWheelModels[34].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[35].addBox(-11F, -7F, 6F, 5, 1, 1, 0F); // Box 140
		leftTrackWheelModels[35].setRotationPoint(-3F, 2F, 20F);

		leftTrackWheelModels[36].addShapeBox(-16F, -2F, 0F, 15, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		leftTrackWheelModels[36].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[37].addShapeBox(-16F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		leftTrackWheelModels[37].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[38].addShapeBox(-16F, 2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 143
		leftTrackWheelModels[38].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[39].addShapeBox(-7F, 2F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 144
		leftTrackWheelModels[39].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[40].addBox(-2F, -2F, 6F, 1, 4, 1, 0F); // Box 145
		leftTrackWheelModels[40].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[41].addShapeBox(-7F, -7F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 146
		leftTrackWheelModels[41].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[42].addBox(-9F, -0.5F, 6F, 1, 1, 1, 0F); // Box 147
		leftTrackWheelModels[42].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[43].addBox(-11F, 6F, 6F, 5, 1, 1, 0F); // Box 148
		leftTrackWheelModels[43].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[44].addShapeBox(-16F, 2F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 149
		leftTrackWheelModels[44].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[45].addBox(-16F, -2F, 6F, 1, 4, 1, 0F); // Box 150
		leftTrackWheelModels[45].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[46].addShapeBox(-16F, -7F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 151
		leftTrackWheelModels[46].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[47].addBox(-11F, -7F, 6F, 5, 1, 1, 0F); // Box 152
		leftTrackWheelModels[47].setRotationPoint(17F, 2F, 20F);

		leftTrackWheelModels[48].addShapeBox(-16F, -2F, 0F, 15, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftTrackWheelModels[48].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[49].addShapeBox(-16F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		leftTrackWheelModels[49].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[50].addShapeBox(-16F, 2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 155
		leftTrackWheelModels[50].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[51].addShapeBox(-7F, 2F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftTrackWheelModels[51].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[52].addBox(-2F, -2F, 6F, 1, 4, 1, 0F); // Box 157
		leftTrackWheelModels[52].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[53].addShapeBox(-7F, -7F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 158
		leftTrackWheelModels[53].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[54].addBox(-9F, -0.5F, 6F, 1, 1, 1, 0F); // Box 159
		leftTrackWheelModels[54].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[55].addBox(-11F, 6F, 6F, 5, 1, 1, 0F); // Box 160
		leftTrackWheelModels[55].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[56].addShapeBox(-16F, 2F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 161
		leftTrackWheelModels[56].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[57].addBox(-16F, -2F, 6F, 1, 4, 1, 0F); // Box 162
		leftTrackWheelModels[57].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[58].addShapeBox(-16F, -7F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftTrackWheelModels[58].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[59].addBox(-11F, -7F, 6F, 5, 1, 1, 0F); // Box 164
		leftTrackWheelModels[59].setRotationPoint(36F, 1F, 20F);

		leftTrackWheelModels[60].addShapeBox(-16F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		leftTrackWheelModels[60].setRotationPoint(-52F, -1F, 20F);

		leftTrackWheelModels[61].addShapeBox(-16F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		leftTrackWheelModels[61].setRotationPoint(-52F, -1F, 20F);

		leftTrackWheelModels[62].addShapeBox(-16F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 167
		leftTrackWheelModels[62].setRotationPoint(-52F, -1F, 20F);

		leftTrackWheelModels[63].addShapeBox(-15F, -3F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		leftTrackWheelModels[63].setRotationPoint(50F, -3F, 20F);

		leftTrackWheelModels[64].addShapeBox(-15F, 1F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 169
		leftTrackWheelModels[64].setRotationPoint(50F, -3F, 20F);

		leftTrackWheelModels[65].addShapeBox(-15F, -6F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		leftTrackWheelModels[65].setRotationPoint(50F, -3F, 20F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 171
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 172
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 173
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 174
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 633, 161, textureX, textureY); // Box 175
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 681, 161, textureX, textureY); // Box 176
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 177
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 178
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Box 179
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Box 180
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 181
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 182
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 183
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 184
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 185
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 186
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 529, 169, textureX, textureY); // Box 187
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Box 188
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Box 189
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 190
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 191
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 192
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 193
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 194
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 195
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 196
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 197
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 198
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 199
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 200
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 201
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 202
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 203
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 204
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 205
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 206
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 207
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 208
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 209
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 210
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 211
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 212
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 785, 89, textureX, textureY); // Box 213
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 214
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 215
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 216
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 217
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 218
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 219
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Box 220
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 221
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 222
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 223
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 224
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 225
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 226
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 227
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 228
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 229
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 230
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 231
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 232
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 233
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Box 234
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 235
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 236

		rightTrackWheelModels[0].addShapeBox(-15F, -6F, 0F, 10, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		rightTrackWheelModels[0].setRotationPoint(50F, -3F, -25F);

		rightTrackWheelModels[1].addShapeBox(-15F, -3F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		rightTrackWheelModels[1].setRotationPoint(50F, -3F, -25F);

		rightTrackWheelModels[2].addShapeBox(-15F, 1F, 0F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 173
		rightTrackWheelModels[2].setRotationPoint(50F, -3F, -25F);

		rightTrackWheelModels[3].addShapeBox(-16F, 2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 174
		rightTrackWheelModels[3].setRotationPoint(36F, 1F, -25F);

		rightTrackWheelModels[4].addShapeBox(-16F, -2F, 0F, 15, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		rightTrackWheelModels[4].setRotationPoint(36F, 1F, -25F);

		rightTrackWheelModels[5].addShapeBox(-16F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rightTrackWheelModels[5].setRotationPoint(36F, 1F, -25F);

		rightTrackWheelModels[6].addShapeBox(-16F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		rightTrackWheelModels[6].setRotationPoint(17F, 2F, -25F);

		rightTrackWheelModels[7].addShapeBox(-16F, -2F, 0F, 15, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		rightTrackWheelModels[7].setRotationPoint(17F, 2F, -25F);

		rightTrackWheelModels[8].addShapeBox(-16F, 2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 179
		rightTrackWheelModels[8].setRotationPoint(17F, 2F, -25F);

		rightTrackWheelModels[9].addShapeBox(-16F, -2F, 0F, 15, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		rightTrackWheelModels[9].setRotationPoint(-3F, 2F, -25F);

		rightTrackWheelModels[10].addShapeBox(-16F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		rightTrackWheelModels[10].setRotationPoint(-3F, 2F, -25F);

		rightTrackWheelModels[11].addShapeBox(-16F, 2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 182
		rightTrackWheelModels[11].setRotationPoint(-3F, 2F, -25F);

		rightTrackWheelModels[12].addShapeBox(-16F, 2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 183
		rightTrackWheelModels[12].setRotationPoint(-20F, 2F, -25F);

		rightTrackWheelModels[13].addShapeBox(-16F, -2F, 0F, 15, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		rightTrackWheelModels[13].setRotationPoint(-20F, 2F, -25F);

		rightTrackWheelModels[14].addShapeBox(-16F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		rightTrackWheelModels[14].setRotationPoint(-20F, 2F, -25F);

		rightTrackWheelModels[15].addShapeBox(-16F, 2F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 186
		rightTrackWheelModels[15].setRotationPoint(-38F, 2F, -25F);

		rightTrackWheelModels[16].addShapeBox(-16F, -2F, 0F, 15, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		rightTrackWheelModels[16].setRotationPoint(-38F, 2F, -25F);

		rightTrackWheelModels[17].addShapeBox(-16F, -7F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		rightTrackWheelModels[17].setRotationPoint(-38F, 2F, -25F);

		rightTrackWheelModels[18].addShapeBox(-16F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		rightTrackWheelModels[18].setRotationPoint(-52F, -1F, -25F);

		rightTrackWheelModels[19].addShapeBox(-16F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		rightTrackWheelModels[19].setRotationPoint(-52F, -1F, -25F);

		rightTrackWheelModels[20].addShapeBox(-16F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 191
		rightTrackWheelModels[20].setRotationPoint(-52F, -1F, -25F);

		rightTrackWheelModels[21].addShapeBox(-16F, -7F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		rightTrackWheelModels[21].setRotationPoint(-38F, 2F, -32F);

		rightTrackWheelModels[22].addBox(-16F, -2F, 6F, 1, 4, 1, 0F); // Box 193
		rightTrackWheelModels[22].setRotationPoint(-38F, 2F, -32F);

		rightTrackWheelModels[23].addShapeBox(-16F, 2F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 194
		rightTrackWheelModels[23].setRotationPoint(-38F, 2F, -32F);

		rightTrackWheelModels[24].addBox(-11F, 6F, 6F, 5, 1, 1, 0F); // Box 195
		rightTrackWheelModels[24].setRotationPoint(-38F, 2F, -32F);

		rightTrackWheelModels[25].addShapeBox(-7F, 2F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 196
		rightTrackWheelModels[25].setRotationPoint(-38F, 2F, -32F);

		rightTrackWheelModels[26].addBox(-2F, -2F, 6F, 1, 4, 1, 0F); // Box 197
		rightTrackWheelModels[26].setRotationPoint(-38F, 2F, -32F);

		rightTrackWheelModels[27].addShapeBox(-7F, -7F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 198
		rightTrackWheelModels[27].setRotationPoint(-38F, 2F, -32F);

		rightTrackWheelModels[28].addBox(-11F, -7F, 6F, 5, 1, 1, 0F); // Box 199
		rightTrackWheelModels[28].setRotationPoint(-38F, 2F, -32F);

		rightTrackWheelModels[29].addBox(-9F, -0.5F, 6F, 1, 1, 1, 0F); // Box 200
		rightTrackWheelModels[29].setRotationPoint(-38F, 2F, -32F);

		rightTrackWheelModels[30].addBox(-9F, -0.5F, 6F, 1, 1, 1, 0F); // Box 201
		rightTrackWheelModels[30].setRotationPoint(-20F, 2F, -32F);

		rightTrackWheelModels[31].addBox(-11F, 6F, 6F, 5, 1, 1, 0F); // Box 202
		rightTrackWheelModels[31].setRotationPoint(-20F, 2F, -32F);

		rightTrackWheelModels[32].addShapeBox(-7F, 2F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 203
		rightTrackWheelModels[32].setRotationPoint(-20F, 2F, -32F);

		rightTrackWheelModels[33].addBox(-2F, -2F, 6F, 1, 4, 1, 0F); // Box 204
		rightTrackWheelModels[33].setRotationPoint(-20F, 2F, -32F);

		rightTrackWheelModels[34].addShapeBox(-7F, -7F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 205
		rightTrackWheelModels[34].setRotationPoint(-20F, 2F, -32F);

		rightTrackWheelModels[35].addBox(-11F, -7F, 6F, 5, 1, 1, 0F); // Box 206
		rightTrackWheelModels[35].setRotationPoint(-20F, 2F, -32F);

		rightTrackWheelModels[36].addBox(-16F, -2F, 6F, 1, 4, 1, 0F); // Box 207
		rightTrackWheelModels[36].setRotationPoint(-20F, 2F, -32F);

		rightTrackWheelModels[37].addShapeBox(-16F, 2F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 208
		rightTrackWheelModels[37].setRotationPoint(-20F, 2F, -32F);

		rightTrackWheelModels[38].addShapeBox(-16F, -7F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 209
		rightTrackWheelModels[38].setRotationPoint(-20F, 2F, -32F);

		rightTrackWheelModels[39].addShapeBox(-16F, -7F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightTrackWheelModels[39].setRotationPoint(-3F, 2F, -32F);

		rightTrackWheelModels[40].addBox(-11F, -7F, 6F, 5, 1, 1, 0F); // Box 211
		rightTrackWheelModels[40].setRotationPoint(-3F, 2F, -32F);

		rightTrackWheelModels[41].addBox(-16F, -2F, 6F, 1, 4, 1, 0F); // Box 212
		rightTrackWheelModels[41].setRotationPoint(-3F, 2F, -32F);

		rightTrackWheelModels[42].addShapeBox(-16F, 2F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 213
		rightTrackWheelModels[42].setRotationPoint(-3F, 2F, -32F);

		rightTrackWheelModels[43].addBox(-11F, 6F, 6F, 5, 1, 1, 0F); // Box 214
		rightTrackWheelModels[43].setRotationPoint(-3F, 2F, -32F);

		rightTrackWheelModels[44].addShapeBox(-7F, -7F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 215
		rightTrackWheelModels[44].setRotationPoint(-3F, 2F, -32F);

		rightTrackWheelModels[45].addBox(-2F, -2F, 6F, 1, 4, 1, 0F); // Box 216
		rightTrackWheelModels[45].setRotationPoint(-3F, 2F, -32F);

		rightTrackWheelModels[46].addShapeBox(-7F, 2F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 217
		rightTrackWheelModels[46].setRotationPoint(-3F, 2F, -32F);

		rightTrackWheelModels[47].addBox(-9F, -0.5F, 6F, 1, 1, 1, 0F); // Box 218
		rightTrackWheelModels[47].setRotationPoint(-3F, 2F, -32F);

		rightTrackWheelModels[48].addBox(-9F, -0.5F, 6F, 1, 1, 1, 0F); // Box 219
		rightTrackWheelModels[48].setRotationPoint(17F, 2F, -32F);

		rightTrackWheelModels[49].addBox(-11F, -7F, 6F, 5, 1, 1, 0F); // Box 220
		rightTrackWheelModels[49].setRotationPoint(17F, 2F, -32F);

		rightTrackWheelModels[50].addShapeBox(-7F, -7F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 221
		rightTrackWheelModels[50].setRotationPoint(17F, 2F, -32F);

		rightTrackWheelModels[51].addBox(-2F, -2F, 6F, 1, 4, 1, 0F); // Box 222
		rightTrackWheelModels[51].setRotationPoint(17F, 2F, -32F);

		rightTrackWheelModels[52].addShapeBox(-7F, 2F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 223
		rightTrackWheelModels[52].setRotationPoint(17F, 2F, -32F);

		rightTrackWheelModels[53].addBox(-11F, 6F, 6F, 5, 1, 1, 0F); // Box 224
		rightTrackWheelModels[53].setRotationPoint(17F, 2F, -32F);

		rightTrackWheelModels[54].addShapeBox(-16F, 2F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 225
		rightTrackWheelModels[54].setRotationPoint(17F, 2F, -32F);

		rightTrackWheelModels[55].addBox(-16F, -2F, 6F, 1, 4, 1, 0F); // Box 226
		rightTrackWheelModels[55].setRotationPoint(17F, 2F, -32F);

		rightTrackWheelModels[56].addShapeBox(-16F, -7F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightTrackWheelModels[56].setRotationPoint(17F, 2F, -32F);

		rightTrackWheelModels[57].addBox(-9F, -0.5F, 6F, 1, 1, 1, 0F); // Box 228
		rightTrackWheelModels[57].setRotationPoint(36F, 1F, -32F);

		rightTrackWheelModels[58].addBox(-11F, -7F, 6F, 5, 1, 1, 0F); // Box 229
		rightTrackWheelModels[58].setRotationPoint(36F, 1F, -32F);

		rightTrackWheelModels[59].addShapeBox(-7F, -7F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 230
		rightTrackWheelModels[59].setRotationPoint(36F, 1F, -32F);

		rightTrackWheelModels[60].addBox(-2F, -2F, 6F, 1, 4, 1, 0F); // Box 231
		rightTrackWheelModels[60].setRotationPoint(36F, 1F, -32F);

		rightTrackWheelModels[61].addShapeBox(-7F, 2F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 232
		rightTrackWheelModels[61].setRotationPoint(36F, 1F, -32F);

		rightTrackWheelModels[62].addBox(-11F, 6F, 6F, 5, 1, 1, 0F); // Box 233
		rightTrackWheelModels[62].setRotationPoint(36F, 1F, -32F);

		rightTrackWheelModels[63].addShapeBox(-16F, 2F, 6F, 6, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 234
		rightTrackWheelModels[63].setRotationPoint(36F, 1F, -32F);

		rightTrackWheelModels[64].addBox(-16F, -2F, 6F, 1, 4, 1, 0F); // Box 235
		rightTrackWheelModels[64].setRotationPoint(36F, 1F, -32F);

		rightTrackWheelModels[65].addShapeBox(-16F, -7F, 6F, 6, 5, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 236
		rightTrackWheelModels[65].setRotationPoint(36F, 1F, -32F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 83
		leftTrackModel[1] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 84
		leftTrackModel[2] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 85
		leftTrackModel[3] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 86
		leftTrackModel[4] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 87
		leftTrackModel[5] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 88
		leftTrackModel[6] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 89
		leftTrackModel[7] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 90
		leftTrackModel[8] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 91
		leftTrackModel[9] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 92
		leftTrackModel[10] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 93

		leftTrackModel[0].addBox(-9F, 0F, 0F, 101, 1, 9, 0F); // Box 83
		leftTrackModel[0].setRotationPoint(-53F, -10F, 19F);

		leftTrackModel[1].addShapeBox(-9F, 0F, 0F, 4, 3, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 84
		leftTrackModel[1].setRotationPoint(-57F, -10F, 19F);

		leftTrackModel[2].addShapeBox(-9F, 0F, 0F, 2, 3, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 85
		leftTrackModel[2].setRotationPoint(-59F, -8F, 19F);

		leftTrackModel[3].addShapeBox(-9F, 0F, 0F, 1, 7, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 86
		leftTrackModel[3].setRotationPoint(-60F, -6F, 19F);

		leftTrackModel[4].addShapeBox(-9F, 0F, 0F, 2, 6, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 87
		leftTrackModel[4].setRotationPoint(-60F, -2F, 19F);

		leftTrackModel[5].addShapeBox(-9F, 0F, 0F, 13, 8, 9, 0F,0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 88
		leftTrackModel[5].setRotationPoint(-58F, 2F, 19F);

		leftTrackModel[6].addShapeBox(-9F, 0F, 0F, 81, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		leftTrackModel[6].setRotationPoint(-45F, 9F, 19F);

		leftTrackModel[7].addShapeBox(-9F, 0F, 0F, 17, 11, 9, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 90
		leftTrackModel[7].setRotationPoint(36F, -1F, 19F);

		leftTrackModel[8].addShapeBox(-9F, 0F, 0F, 2, 4, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 91
		leftTrackModel[8].setRotationPoint(53F, -4F, 19F);

		leftTrackModel[9].addShapeBox(-9F, 0F, 0F, 2, 6, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 92
		leftTrackModel[9].setRotationPoint(53F, -9F, 19F);

		leftTrackModel[10].addShapeBox(-9F, 0F, 0F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 93
		leftTrackModel[10].setRotationPoint(48F, -10F, 19F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 94
		rightTrackModel[1] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 95
		rightTrackModel[2] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 96
		rightTrackModel[3] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 97
		rightTrackModel[4] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 98
		rightTrackModel[5] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 99
		rightTrackModel[6] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Box 100
		rightTrackModel[7] = new ModelRendererTurbo(this, 969, 129, textureX, textureY); // Box 101
		rightTrackModel[8] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 102
		rightTrackModel[9] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 103
		rightTrackModel[10] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 104

		rightTrackModel[0].addShapeBox(-9F, 0F, 0F, 4, 3, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 94
		rightTrackModel[0].setRotationPoint(-57F, -10F, -27F);

		rightTrackModel[1].addShapeBox(-9F, 0F, 0F, 2, 3, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 95
		rightTrackModel[1].setRotationPoint(-59F, -8F, -27F);

		rightTrackModel[2].addShapeBox(-9F, 0F, 0F, 1, 7, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 96
		rightTrackModel[2].setRotationPoint(-60F, -6F, -27F);

		rightTrackModel[3].addShapeBox(-9F, 0F, 0F, 2, 6, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 97
		rightTrackModel[3].setRotationPoint(-60F, -2F, -27F);

		rightTrackModel[4].addShapeBox(-9F, 0F, 0F, 13, 8, 9, 0F,0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 98
		rightTrackModel[4].setRotationPoint(-58F, 2F, -27F);

		rightTrackModel[5].addShapeBox(-9F, 0F, 0F, 81, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rightTrackModel[5].setRotationPoint(-45F, 9F, -27F);

		rightTrackModel[6].addBox(-9F, 0F, 0F, 101, 1, 9, 0F); // Box 100
		rightTrackModel[6].setRotationPoint(-53F, -10F, -27F);

		rightTrackModel[7].addShapeBox(-9F, 0F, 0F, 17, 11, 9, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 101
		rightTrackModel[7].setRotationPoint(36F, -1F, -27F);

		rightTrackModel[8].addShapeBox(-9F, 0F, 0F, 2, 4, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 102
		rightTrackModel[8].setRotationPoint(53F, -4F, -27F);

		rightTrackModel[9].addShapeBox(-9F, 0F, 0F, 2, 6, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 103
		rightTrackModel[9].setRotationPoint(53F, -9F, -27F);

		rightTrackModel[10].addShapeBox(-9F, 0F, 0F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 104
		rightTrackModel[10].setRotationPoint(48F, -10F, -27F);
	}

	private void initinfantryModel_1()
	{
		infantryModel[0] = new ModelRendererTurbo(this, 0, 237, textureX, textureY); // Box 375
		infantryModel[1] = new ModelRendererTurbo(this, 16, 253, textureX, textureY); // Box 376
		infantryModel[2] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 377
		infantryModel[3] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 378
		infantryModel[4] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 379
		infantryModel[5] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 380
		infantryModel[6] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 381
		infantryModel[7] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 382
		infantryModel[8] = new ModelRendererTurbo(this, 16, 253, textureX, textureY); // Box 383
		infantryModel[9] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 384
		infantryModel[10] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 385
		infantryModel[11] = new ModelRendererTurbo(this, 0, 237, textureX, textureY); // Box 386
		infantryModel[12] = new ModelRendererTurbo(this, 16, 253, textureX, textureY); // Box 387
		infantryModel[13] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 388
		infantryModel[14] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 389
		infantryModel[15] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 390
		infantryModel[16] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 391
		infantryModel[17] = new ModelRendererTurbo(this, 0, 237, textureX, textureY); // Box 392
		infantryModel[18] = new ModelRendererTurbo(this, 16, 253, textureX, textureY); // Box 393
		infantryModel[19] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 394
		infantryModel[20] = new ModelRendererTurbo(this, 36, 253, textureX, textureY); // Box 396
		infantryModel[21] = new ModelRendererTurbo(this, 36, 253, textureX, textureY); // Box 397
		infantryModel[22] = new ModelRendererTurbo(this, 0, 237, textureX, textureY); // Box 398
		infantryModel[23] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 399
		infantryModel[24] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 400
		infantryModel[25] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 401
		infantryModel[26] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 402
		infantryModel[27] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 403
		infantryModel[28] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 404
		infantryModel[29] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 405
		infantryModel[30] = new ModelRendererTurbo(this, 16, 253, textureX, textureY); // Box 406
		infantryModel[31] = new ModelRendererTurbo(this, 0, 237, textureX, textureY); // Box 407
		infantryModel[32] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 408
		infantryModel[33] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 409
		infantryModel[34] = new ModelRendererTurbo(this, 16, 253, textureX, textureY); // Box 410
		infantryModel[35] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 411
		infantryModel[36] = new ModelRendererTurbo(this, 0, 237, textureX, textureY); // Box 412
		infantryModel[37] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 413
		infantryModel[38] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 414
		infantryModel[39] = new ModelRendererTurbo(this, 0, 253, textureX, textureY); // Box 415
		infantryModel[40] = new ModelRendererTurbo(this, 16, 253, textureX, textureY); // Box 416
		infantryModel[41] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 417
		infantryModel[42] = new ModelRendererTurbo(this, 0, 237, textureX, textureY); // Box 418
		infantryModel[43] = new ModelRendererTurbo(this, 40, 253, textureX, textureY); // Box 419
		infantryModel[44] = new ModelRendererTurbo(this, 95, 300, textureX, textureY); // Box 420
		infantryModel[45] = new ModelRendererTurbo(this, 80, 300, textureX, textureY); // Box 421
		infantryModel[46] = new ModelRendererTurbo(this, 80, 300, textureX, textureY); // Box 422
		infantryModel[47] = new ModelRendererTurbo(this, 80, 300, textureX, textureY); // Box 423

		infantryModel[0].addBox(-4F, 0F, -4F, 8, 8, 8, 0F); // Box 375
		infantryModel[0].setRotationPoint(-6F, -37F, -20F);
		infantryModel[0].rotateAngleX = -0.08726646F;
		infantryModel[0].rotateAngleY = 0.45378561F;

		infantryModel[1].addBox(0F, 0F, -2F, 8, 12, 4, 0F); // Box 376
		infantryModel[1].setRotationPoint(-10F, -29F, -21F);
		infantryModel[1].rotateAngleX = -0.33161256F;

		infantryModel[2].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 377
		infantryModel[2].setRotationPoint(-8F, -18F, -25F);
		infantryModel[2].rotateAngleX = -1.01229097F;
		infantryModel[2].rotateAngleY = -0.43633231F;

		infantryModel[3].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 378
		infantryModel[3].setRotationPoint(-4F, -18F, -25F);
		infantryModel[3].rotateAngleX = -1.01229097F;
		infantryModel[3].rotateAngleY = 0.43633231F;

		infantryModel[4].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 379
		infantryModel[4].setRotationPoint(0F, -29F, -21F);
		infantryModel[4].rotateAngleX = -0.33161256F;
		infantryModel[4].rotateAngleZ = 0.2443461F;

		infantryModel[5].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 380
		infantryModel[5].setRotationPoint(-12F, -29F, -21F);
		infantryModel[5].rotateAngleX = -0.33161256F;
		infantryModel[5].rotateAngleZ = -0.2443461F;

		infantryModel[6].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 381
		infantryModel[6].setRotationPoint(-28F, -18F, -25F);
		infantryModel[6].rotateAngleX = -1.01229097F;
		infantryModel[6].rotateAngleY = -0.43633231F;

		infantryModel[7].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 382
		infantryModel[7].setRotationPoint(-24F, -18F, -25F);
		infantryModel[7].rotateAngleX = -1.01229097F;
		infantryModel[7].rotateAngleY = 0.43633231F;

		infantryModel[8].addBox(0F, 0F, -2F, 8, 12, 4, 0F); // Box 383
		infantryModel[8].setRotationPoint(-30F, -29F, -21F);
		infantryModel[8].rotateAngleX = -0.33161256F;

		infantryModel[9].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 384
		infantryModel[9].setRotationPoint(-32F, -29F, -21F);
		infantryModel[9].rotateAngleX = -0.33161256F;
		infantryModel[9].rotateAngleZ = -0.2443461F;

		infantryModel[10].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 385
		infantryModel[10].setRotationPoint(-20F, -29F, -21F);
		infantryModel[10].rotateAngleX = -0.33161256F;
		infantryModel[10].rotateAngleZ = 0.2443461F;

		infantryModel[11].addBox(-4F, 0F, -4F, 8, 8, 8, 0F); // Box 386
		infantryModel[11].setRotationPoint(-26F, -37F, -20F);
		infantryModel[11].rotateAngleX = -0.08726646F;
		infantryModel[11].rotateAngleY = 0.12217305F;

		infantryModel[12].addBox(0F, 0F, -2F, 8, 12, 4, 0F); // Box 387
		infantryModel[12].setRotationPoint(14F, -29F, -21F);
		infantryModel[12].rotateAngleX = -0.33161256F;
		infantryModel[12].rotateAngleY = 0.19198622F;

		infantryModel[13].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 388
		infantryModel[13].setRotationPoint(24F, -29F, -21F);
		infantryModel[13].rotateAngleX = 0.33161256F;
		infantryModel[13].rotateAngleZ = 0.2268928F;

		infantryModel[14].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 389
		infantryModel[14].setRotationPoint(12F, -29F, -21F);
		infantryModel[14].rotateAngleX = -0.33161256F;
		infantryModel[14].rotateAngleZ = -0.2443461F;

		infantryModel[15].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 390
		infantryModel[15].setRotationPoint(16F, -18F, -25F);
		infantryModel[15].rotateAngleX = -1.01229097F;
		infantryModel[15].rotateAngleY = -0.19198622F;

		infantryModel[16].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 391
		infantryModel[16].setRotationPoint(21F, -18F, -24F);
		infantryModel[16].rotateAngleX = -1.01229097F;
		infantryModel[16].rotateAngleY = 0.62831853F;

		infantryModel[17].addBox(-4F, 0F, -4F, 8, 8, 8, 0F); // Box 392
		infantryModel[17].setRotationPoint(18F, -37F, -20F);
		infantryModel[17].rotateAngleX = -0.08726646F;
		infantryModel[17].rotateAngleY = 0.83775804F;

		infantryModel[18].addBox(0F, 0F, -2F, 8, 12, 4, 0F); // Box 393
		infantryModel[18].setRotationPoint(-40F, -41F, -5F);
		infantryModel[18].rotateAngleX = 0.26179939F;
		infantryModel[18].rotateAngleY = -1.57079633F;

		infantryModel[19].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 394
		infantryModel[19].setRotationPoint(-39F, -40F, -4F);
		infantryModel[19].rotateAngleX = -0.33161256F;
		infantryModel[19].rotateAngleY = -1.57079633F;
		infantryModel[19].rotateAngleZ = -0.34906585F;

		infantryModel[20].addShapeBox(-2F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 396
		infantryModel[20].setRotationPoint(-38F, -30F, -12.5F);
		infantryModel[20].rotateAngleY = 0.41887902F;
		infantryModel[20].rotateAngleZ = -1.85004901F;

		infantryModel[21].addShapeBox(-2F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 397
		infantryModel[21].setRotationPoint(-39F, -30F, -8.5F);
		infantryModel[21].rotateAngleY = -0.41887902F;
		infantryModel[21].rotateAngleZ = -1.85004901F;

		infantryModel[22].addBox(-4F, 0F, -4F, 8, 8, 8, 0F); // Box 398
		infantryModel[22].setRotationPoint(-40F, -49F, -9F);
		infantryModel[22].rotateAngleY = -1.57079633F;

		infantryModel[23].addShapeBox(-2F, 0F, 0F, 4, 10, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		infantryModel[23].setRotationPoint(-42F, -32F, -14.5F);
		infantryModel[23].rotateAngleY = 0.41887902F;
		infantryModel[23].rotateAngleZ = 0.34906585F;

		infantryModel[24].addShapeBox(-2F, 0F, 0F, 4, 10, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		infantryModel[24].setRotationPoint(-43F, -32F, -6.5F);
		infantryModel[24].rotateAngleY = -0.41887902F;
		infantryModel[24].rotateAngleZ = 0.34906585F;

		infantryModel[25].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 401
		infantryModel[25].setRotationPoint(-39F, -39F, -15F);
		infantryModel[25].rotateAngleX = -1.3962634F;
		infantryModel[25].rotateAngleY = -1.57079633F;
		infantryModel[25].rotateAngleZ = 0.08726646F;

		infantryModel[26].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 402
		infantryModel[26].setRotationPoint(-18F, -29F, 21F);
		infantryModel[26].rotateAngleX = -0.33161256F;
		infantryModel[26].rotateAngleY = -3.14159265F;
		infantryModel[26].rotateAngleZ = 0.2443461F;

		infantryModel[27].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 403
		infantryModel[27].setRotationPoint(-6F, -29F, 21F);
		infantryModel[27].rotateAngleX = -0.33161256F;
		infantryModel[27].rotateAngleY = -3.14159265F;
		infantryModel[27].rotateAngleZ = -0.2443461F;

		infantryModel[28].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 404
		infantryModel[28].setRotationPoint(-10F, -18F, 25F);
		infantryModel[28].rotateAngleX = -1.01229097F;
		infantryModel[28].rotateAngleY = -3.57792497F;

		infantryModel[29].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 405
		infantryModel[29].setRotationPoint(-14F, -18F, 25F);
		infantryModel[29].rotateAngleX = -1.01229097F;
		infantryModel[29].rotateAngleY = -2.70526034F;

		infantryModel[30].addBox(0F, 0F, -2F, 8, 12, 4, 0F); // Box 406
		infantryModel[30].setRotationPoint(-8F, -29F, 21F);
		infantryModel[30].rotateAngleX = -0.33161256F;
		infantryModel[30].rotateAngleY = -3.14159265F;

		infantryModel[31].addBox(-4F, 0F, -4F, 8, 8, 8, 0F); // Box 407
		infantryModel[31].setRotationPoint(-12F, -37F, 22F);
		infantryModel[31].rotateAngleX = -0.08726646F;
		infantryModel[31].rotateAngleY = -3.40339204F;

		infantryModel[32].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 408
		infantryModel[32].setRotationPoint(9F, -18F, 25F);
		infantryModel[32].rotateAngleX = -1.01229097F;
		infantryModel[32].rotateAngleY = -2.70526034F;

		infantryModel[33].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 409
		infantryModel[33].setRotationPoint(13F, -18F, 25F);
		infantryModel[33].rotateAngleX = -1.01229097F;
		infantryModel[33].rotateAngleY = -3.57792497F;

		infantryModel[34].addBox(0F, 0F, -2F, 8, 12, 4, 0F); // Box 410
		infantryModel[34].setRotationPoint(15F, -29F, 21F);
		infantryModel[34].rotateAngleX = -0.33161256F;
		infantryModel[34].rotateAngleY = -3.14159265F;

		infantryModel[35].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 411
		infantryModel[35].setRotationPoint(17F, -29F, 21F);
		infantryModel[35].rotateAngleX = -0.33161256F;
		infantryModel[35].rotateAngleY = -3.14159265F;
		infantryModel[35].rotateAngleZ = -0.2443461F;

		infantryModel[36].addBox(-4F, 0F, -4F, 8, 8, 8, 0F); // Box 412
		infantryModel[36].setRotationPoint(11F, -37F, 22F);
		infantryModel[36].rotateAngleX = -0.08726646F;
		infantryModel[36].rotateAngleY = -3.40339204F;

		infantryModel[37].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 413
		infantryModel[37].setRotationPoint(5F, -29F, 21F);
		infantryModel[37].rotateAngleX = -0.33161256F;
		infantryModel[37].rotateAngleY = -3.14159265F;
		infantryModel[37].rotateAngleZ = 0.2443461F;

		infantryModel[38].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 414
		infantryModel[38].setRotationPoint(-45F, -23F, 20F);
		infantryModel[38].rotateAngleX = -1.74532925F;
		infantryModel[38].rotateAngleY = -2.70526034F;

		infantryModel[39].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 415
		infantryModel[39].setRotationPoint(-41F, -23F, 20F);
		infantryModel[39].rotateAngleX = -1.65806279F;
		infantryModel[39].rotateAngleY = -3.57792497F;

		infantryModel[40].addBox(0F, 0F, -2F, 8, 12, 4, 0F); // Box 416
		infantryModel[40].setRotationPoint(-39F, -34F, 12F);
		infantryModel[40].rotateAngleX = -0.57595865F;
		infantryModel[40].rotateAngleY = -3.14159265F;

		infantryModel[41].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 417
		infantryModel[41].setRotationPoint(-37F, -34F, 12F);
		infantryModel[41].rotateAngleY = -3.14159265F;
		infantryModel[41].rotateAngleZ = -0.38397244F;

		infantryModel[42].addBox(-4F, 0F, -4F, 8, 8, 8, 0F); // Box 418
		infantryModel[42].setRotationPoint(-43F, -41.5F, 12F);
		infantryModel[42].rotateAngleX = -0.08726646F;
		infantryModel[42].rotateAngleY = -2.44346095F;

		infantryModel[43].addBox(-2F, 0F, -2F, 4, 12, 4, 0F); // Box 419
		infantryModel[43].setRotationPoint(-49F, -34F, 13F);
		infantryModel[43].rotateAngleX = 0.33161256F;
		infantryModel[43].rotateAngleY = -3.14159265F;
		infantryModel[43].rotateAngleZ = 0.2443461F;

		infantryModel[44].addBox(-2F, 0F, -2F, 3, 5, 3, 0F); // Box 420
		infantryModel[44].setRotationPoint(-51F, -35F, -14F);

		infantryModel[45].addShapeBox(-2F, 0F, -2F, 3, 3, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		infantryModel[45].setRotationPoint(-51F, -38F, -14F);

		infantryModel[46].addShapeBox(-2F, 0F, -2F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 422
		infantryModel[46].setRotationPoint(-51F, -40F, -14F);

		infantryModel[47].addShapeBox(-2F, 0F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		infantryModel[47].setRotationPoint(-50F, -39F, -13F);
	}
}