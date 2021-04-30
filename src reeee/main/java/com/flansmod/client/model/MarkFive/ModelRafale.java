//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Rafale
// Model Creator: 
// Created on: 10.07.2015 - 12:02:04
// Last changed on: 10.07.2015 - 12:02:04

package com.flansmod.client.model.MarkFive; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRafale extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelRafale() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[157];
		tailModel = new ModelRendererTurbo[22];
		leftWingModel = new ModelRendererTurbo[11];
		rightWingModel = new ModelRendererTurbo[11];
		yawFlapModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[57];
		hudModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();
		inithudModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 272
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 273
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 274
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 275
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 276
		bodyModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 277
		bodyModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 290
		bodyModel[7] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 291
		bodyModel[8] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 292
		bodyModel[9] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 293
		bodyModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 294
		bodyModel[11] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 295
		bodyModel[12] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 296
		bodyModel[13] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 297
		bodyModel[14] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 298
		bodyModel[15] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 299
		bodyModel[16] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 300
		bodyModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 301
		bodyModel[18] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 302
		bodyModel[19] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 303
		bodyModel[20] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 304
		bodyModel[21] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 305
		bodyModel[22] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 306
		bodyModel[23] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 307
		bodyModel[24] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 308
		bodyModel[25] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 309
		bodyModel[26] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 310
		bodyModel[27] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 311
		bodyModel[28] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 312
		bodyModel[29] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Box 313
		bodyModel[30] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 314
		bodyModel[31] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 315
		bodyModel[32] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 316
		bodyModel[33] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 317
		bodyModel[34] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 318
		bodyModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 319
		bodyModel[36] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 320
		bodyModel[37] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 321
		bodyModel[38] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 322
		bodyModel[39] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 323
		bodyModel[40] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 324
		bodyModel[41] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 325
		bodyModel[42] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 326
		bodyModel[43] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 327
		bodyModel[44] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 328
		bodyModel[45] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 329
		bodyModel[46] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 330
		bodyModel[47] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 331
		bodyModel[48] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 332
		bodyModel[49] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 333
		bodyModel[50] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 334
		bodyModel[51] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 335
		bodyModel[52] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 336
		bodyModel[53] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 337
		bodyModel[54] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 338
		bodyModel[55] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 340
		bodyModel[56] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 342
		bodyModel[57] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 343
		bodyModel[58] = new ModelRendererTurbo(this, 521, 137, textureX, textureY); // Box 344
		bodyModel[59] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 345
		bodyModel[60] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 347
		bodyModel[61] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Box 348
		bodyModel[62] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 349
		bodyModel[63] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 350
		bodyModel[64] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Box 351
		bodyModel[65] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 352
		bodyModel[66] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 353
		bodyModel[67] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 354
		bodyModel[68] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 355
		bodyModel[69] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 356
		bodyModel[70] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 357
		bodyModel[71] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Box 358
		bodyModel[72] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 359
		bodyModel[73] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 360
		bodyModel[74] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 361
		bodyModel[75] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 362
		bodyModel[76] = new ModelRendererTurbo(this, 721, 153, textureX, textureY); // Box 366
		bodyModel[77] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 367
		bodyModel[78] = new ModelRendererTurbo(this, 897, 153, textureX, textureY); // Box 368
		bodyModel[79] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 369
		bodyModel[80] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 377
		bodyModel[81] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 378
		bodyModel[82] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 383
		bodyModel[83] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 384
		bodyModel[84] = new ModelRendererTurbo(this, 673, 161, textureX, textureY); // Box 385
		bodyModel[85] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 386
		bodyModel[86] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 387
		bodyModel[87] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 388
		bodyModel[88] = new ModelRendererTurbo(this, 929, 169, textureX, textureY); // Box 390
		bodyModel[89] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 391
		bodyModel[90] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 392
		bodyModel[91] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 393
		bodyModel[92] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 394
		bodyModel[93] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 395
		bodyModel[94] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 396
		bodyModel[95] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 397
		bodyModel[96] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 398
		bodyModel[97] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 399
		bodyModel[98] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 400
		bodyModel[99] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Box 401
		bodyModel[100] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 402
		bodyModel[101] = new ModelRendererTurbo(this, 633, 129, textureX, textureY); // Box 403
		bodyModel[102] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 404
		bodyModel[103] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 405
		bodyModel[104] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 407
		bodyModel[105] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 408
		bodyModel[106] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 409
		bodyModel[107] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 410
		bodyModel[108] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 411
		bodyModel[109] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 412
		bodyModel[110] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 413
		bodyModel[111] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 414
		bodyModel[112] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 415
		bodyModel[113] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 416
		bodyModel[114] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 417
		bodyModel[115] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 418
		bodyModel[116] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 419
		bodyModel[117] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 420
		bodyModel[118] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 421
		bodyModel[119] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 481
		bodyModel[120] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 482
		bodyModel[121] = new ModelRendererTurbo(this, 673, 201, textureX, textureY); // Box 483
		bodyModel[122] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Box 484
		bodyModel[123] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 485
		bodyModel[124] = new ModelRendererTurbo(this, 929, 201, textureX, textureY); // Box 486
		bodyModel[125] = new ModelRendererTurbo(this, 993, 193, textureX, textureY); // Box 487
		bodyModel[126] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 488
		bodyModel[127] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 489
		bodyModel[128] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 490
		bodyModel[129] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 491
		bodyModel[130] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 492
		bodyModel[131] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 493
		bodyModel[132] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 494
		bodyModel[133] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 495
		bodyModel[134] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 496
		bodyModel[135] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 497
		bodyModel[136] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 498
		bodyModel[137] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 499
		bodyModel[138] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 500
		bodyModel[139] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 521
		bodyModel[140] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 522
		bodyModel[141] = new ModelRendererTurbo(this, 985, 225, textureX, textureY); // Box 523
		bodyModel[142] = new ModelRendererTurbo(this, 761, 113, textureX, textureY); // Box 524
		bodyModel[143] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 525
		bodyModel[144] = new ModelRendererTurbo(this, 585, 233, textureX, textureY); // Box 526
		bodyModel[145] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 527
		bodyModel[146] = new ModelRendererTurbo(this, 41, 233, textureX, textureY); // Box 528
		bodyModel[147] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Box 529
		bodyModel[148] = new ModelRendererTurbo(this, 625, 233, textureX, textureY); // Box 530
		bodyModel[149] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Box 531
		bodyModel[150] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 532
		bodyModel[151] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 533
		bodyModel[152] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 534
		bodyModel[153] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 535
		bodyModel[154] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 536
		bodyModel[155] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 537
		bodyModel[156] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 538

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, -0.5F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, -0.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 272
		bodyModel[0].setRotationPoint(-120F, -35F, -4.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 273
		bodyModel[1].setRotationPoint(-120F, -32F, -4.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -3F, 0F, 0.4F, -2.5F, 0F, 0.4F, -2.5F, 0F, -0.5F, -3F); // Box 274
		bodyModel[2].setRotationPoint(-120F, -29F, -4.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 23, 3, 9, 0F,0F, 0F, 0F, 0F, -0.5F, 3.5F, 0F, -0.5F, 3.5F, 0F, 0F, 0F, 0F, 0.4F, -2.5F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.4F, -2.5F); // Box 275
		bodyModel[3].setRotationPoint(-116F, -29F, -4.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 23, 3, 9, 0F,0F, 0F, 0F, 0F, 1F, 4.5F, 0F, 1F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0F, 0F); // Box 276
		bodyModel[4].setRotationPoint(-116F, -32F, -4.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 23, 3, 9, 0F,0F, 0.5F, -2.5F, 0F, 5F, 0.5F, 0F, 5F, 0.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, 0F); // Box 277
		bodyModel[5].setRotationPoint(-116F, -35F, -4.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 114, 6, 18, 0F,0F, 8F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 6.5F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5F, 7.5F); // Box 290
		bodyModel[6].setRotationPoint(0.5F, -33F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 114, 6, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 5F, 7.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 5.5F); // Box 291
		bodyModel[7].setRotationPoint(0.5F, -27F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 114, 5, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 5.5F, 0F, 2F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 2F, -1F); // Box 292
		bodyModel[8].setRotationPoint(0.5F, -21F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 114, 6, 18, 0F,0F, 6.5F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 8F, -6F, 0F, -5F, 7.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 293
		bodyModel[9].setRotationPoint(0.5F, -33F, -18F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 114, 6, 18, 0F,0F, 5F, 7.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 5.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 294
		bodyModel[10].setRotationPoint(0.5F, -27F, -18F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 114, 5, 18, 0F,0F, -1F, 5.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 2F, -7F); // Box 295
		bodyModel[11].setRotationPoint(0.5F, -21F, -18F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 26, 5, 13, 0F,0F, 0F, 4F, 0F, 0F, 6.5F, 0F, -1F, 3.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, -4F); // Box 296
		bodyModel[12].setRotationPoint(-25.5F, -21F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 26, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, -2F); // Box 297
		bodyModel[13].setRotationPoint(-25.5F, -27F, 3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 26, 5, 13, 0F,0F, 0F, 4F, 0F, 0F, 6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, -3F, -6F); // Box 298
		bodyModel[14].setRotationPoint(-25.5F, -21F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 299
		bodyModel[15].setRotationPoint(-40.5F, -17F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -2F, 6F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, -1F, -7F); // Box 300
		bodyModel[16].setRotationPoint(-40.5F, -20F, 20F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 15, 7, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -5F); // Box 301
		bodyModel[17].setRotationPoint(-40.5F, -27F, 22F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1F); // Box 302
		bodyModel[18].setRotationPoint(-40.5F, -30F, 18F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F,0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -1F, 3F, 0F, -1F, 0F, 0F, 0F, 8F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -8F); // Box 303
		bodyModel[19].setRotationPoint(-44.5F, -31F, 18F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 19, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 6F, 0F, 0F, 3F, 0F, 0F, -3F, -1F, -1F, -6F); // Box 304
		bodyModel[20].setRotationPoint(-44.5F, -26F, 10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 26, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F); // Box 305
		bodyModel[21].setRotationPoint(-25.5F, -32F, 2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 26, 6, 18, 0F,0F, 8.5F, -7F, 0F, 8F, -6F, 0F, 6.5F, -3F, 0F, 7.5F, -5F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, -5F, 7.5F, 0F, -5F, 0F); // Box 306
		bodyModel[22].setRotationPoint(-25.5F, -33F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3.5F); // Box 307
		bodyModel[23].setRotationPoint(-44.5F, -38F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -8F, 0F, -2F, -9F); // Box 308
		bodyModel[24].setRotationPoint(-44.5F, -34F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -10F, 0F, -1F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 309
		bodyModel[25].setRotationPoint(-44.5F, -42F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -9F, 0F, -1F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 310
		bodyModel[26].setRotationPoint(-40.5F, -42F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -8F, 0F, -2F, -8F); // Box 311
		bodyModel[27].setRotationPoint(-40.5F, -34F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 312
		bodyModel[28].setRotationPoint(-40.5F, -38F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 32, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -8F, 0F, -2F, -8F); // Box 313
		bodyModel[29].setRotationPoint(-29.5F, -34F, 8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 32, 4, 14, 0F,0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -3F, -7F, 0F, -1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -1F); // Box 314
		bodyModel[30].setRotationPoint(-29.5F, -42F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 32, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -2F); // Box 315
		bodyModel[31].setRotationPoint(-29.5F, -38F, 8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 26, 5, 13, 0F,0F, -1F, 1F, 0F, -1F, 3.5F, 0F, 0F, 6.5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[32].setRotationPoint(-25.5F, -21F, -20F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 26, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[33].setRotationPoint(-25.5F, -27F, -23F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F); // Box 318
		bodyModel[34].setRotationPoint(-40.5F, -17F, -16F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -1F, -7F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, -2F, 6F); // Box 319
		bodyModel[35].setRotationPoint(-40.5F, -20F, -21F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 7, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 5F); // Box 320
		bodyModel[36].setRotationPoint(-40.5F, -27F, -23F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 321
		bodyModel[37].setRotationPoint(-40.5F, -30F, -19F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 8F); // Box 322
		bodyModel[38].setRotationPoint(-44.5F, -31F, -19F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 19, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -6F, 0F, 0F, -3F, 0F, 0F, 3F, -1F, -1F, 6F); // Box 323
		bodyModel[39].setRotationPoint(-44.5F, -26F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 26, 5, 22, 0F,0F, 0F, -6F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[40].setRotationPoint(-25.5F, -32F, -24F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 26, 6, 18, 0F,0F, 7.5F, -5F, 0F, 6.5F, -3F, 0F, 8F, -6F, 0F, 8.5F, -7F, 0F, -5F, 0F, 0F, -5F, 7.5F, 0F, -5F, -2F, 0F, -5F, -2F); // Box 325
		bodyModel[41].setRotationPoint(-25.5F, -33F, -18F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[42].setRotationPoint(-44.5F, -38F, -22F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F,0F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -9F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[43].setRotationPoint(-44.5F, -34F, -22F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, -1F, -11F, 0F, -1F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[44].setRotationPoint(-44.5F, -42F, -22F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,0F, -1F, -10F, 0F, -1F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[45].setRotationPoint(-40.5F, -42F, -22F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 11, 6, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[46].setRotationPoint(-40.5F, -34F, -22F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[47].setRotationPoint(-40.5F, -38F, -22F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 32, 6, 14, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[48].setRotationPoint(-29.5F, -34F, -22F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 32, 4, 14, 0F,0F, -1F, -9F, 0F, -3F, -7F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[49].setRotationPoint(-29.5F, -42F, -22F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 32, 4, 14, 0F,0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[50].setRotationPoint(-29.5F, -38F, -22F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 28, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -8.5F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, -2F, -8F, 0F, -0.7F, -12F); // Box 335
		bodyModel[51].setRotationPoint(-72.5F, -34F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 28, 4, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -8.5F); // Box 336
		bodyModel[52].setRotationPoint(-72.5F, -38F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 28, 4, 14, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -10F, 0F, -1F, -13F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 1F, -9F); // Box 337
		bodyModel[53].setRotationPoint(-72.5F, -42F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 21, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, -20F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, -20F, 0F, -2F); // Box 338
		bodyModel[54].setRotationPoint(-40F, -37.5F, 21F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 21, 1, 22, 0F,-20F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -20F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 340
		bodyModel[55].setRotationPoint(-40F, -37.5F, -43F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 50, 3, 9, 0F,0F, -0.5F, 3.5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, 3.5F, 0F, 2.5F, 0F, 0F, 6F, -0.5F, 0F, 6F, -0.5F, 0F, 2.5F, 0F); // Box 342
		bodyModel[56].setRotationPoint(-93F, -29F, -4.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 67, 3, 9, 0F,0F, 0F, 6F, 0F, -0.5F, 3.5F, 0F, -0.5F, 3.5F, 0F, 0F, 6F, 0F, 6F, -0.5F, 0F, 11.5F, 3F, 0F, 11.5F, 3F, 0F, 6F, -0.5F); // Box 343
		bodyModel[57].setRotationPoint(-43F, -29F, -4.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 90, 1, 15, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[58].setRotationPoint(24F, -15.5F, -7.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 3.5F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, 0F, 0.5F, -1F); // Box 345
		bodyModel[59].setRotationPoint(-93F, -33F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 3F, 0F, 0F, -2.3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 3.5F, 0F, 0F, 0F); // Box 347
		bodyModel[60].setRotationPoint(-93F, -37F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,0F, 0F, 0F, 0.5F, 1F, -3F, 0.5F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, 7F, 0F, 0F, 1.7F); // Box 348
		bodyModel[61].setRotationPoint(-93F, -40F, 4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 7F, -4F, 0F, 1F, 6.5F, 3F, 6F, 3F, 0F, 7F, 3F, -9F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -0.9F, -9F, 2F, -0.9F); // Box 349
		bodyModel[62].setRotationPoint(-34.5F, -23F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 7F, 3F, 3F, 6F, 3F, 0F, 1F, 6.5F, 0F, 7F, -4F, -9F, 2F, -0.9F, 0F, 2F, -0.9F, 0F, 2F, 0F, -9F, 2F, 0F); // Box 350
		bodyModel[63].setRotationPoint(-34.5F, -23F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 5, 22, 0F,0F, 0F, -7.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -16.5F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[64].setRotationPoint(-35.5F, -32F, -24F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 10, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -2F, -16.5F); // Box 352
		bodyModel[65].setRotationPoint(-35.5F, -32F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 28, 6, 13, 0F,0F, 0F, -8.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -12F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Box 353
		bodyModel[66].setRotationPoint(-72.5F, -34F, -21F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 28, 4, 13, 0F,0F, -1F, -9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -8.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[67].setRotationPoint(-72.5F, -38F, -21F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 28, 4, 14, 0F,0F, -1F, -13F, 0F, -1F, -10F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, -9F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 1F, 0F); // Box 355
		bodyModel[68].setRotationPoint(-72.5F, -42F, -21F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, 0F, 0.5F, 1F, 3.5F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Box 356
		bodyModel[69].setRotationPoint(-93F, -33F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, -2.3F, 0.5F, 0F, 3F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0.5F, -1F, 3.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[70].setRotationPoint(-93F, -37F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,0F, 0F, 0F, 0.5F, 1F, 3F, 0.5F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 1.7F, 0.5F, 0F, 7F, 0.5F, 0F, -3F, 0F, 0F, 0F); // Box 358
		bodyModel[71].setRotationPoint(-93F, -40F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 7, 9, 0F,0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 5F, 0F, 4.5F, 0F, 0F, 4F, 0F, 0F, 4F, 5F, 0F, 4.5F); // Box 359
		bodyModel[72].setRotationPoint(-26F, -47F, -4.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 12, 7, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 6F, 0F, 1F, 6F, 0F, 0F, 5F); // Box 360
		bodyModel[73].setRotationPoint(-22F, -47F, -3.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 50, 6, 7, 0F,0F, 0F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 6F); // Box 361
		bodyModel[74].setRotationPoint(-10F, -45F, -3.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 76, 2, 5, 0F,0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 3F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0F, 0.5F, 3F); // Box 362
		bodyModel[75].setRotationPoint(40F, -41.5F, -2.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 76, 2, 11, 0F,0F, -0.5F, 0F, 0F, -3F, -2.5F, 0F, -3F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 0F, 0F); // Box 366
		bodyModel[76].setRotationPoint(40F, -39.5F, -5.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 76, 2, 11, 0F,0F, 1F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 3F, -4.5F, 0F, 3F, -4.5F, 0F, -0.5F, 0F); // Box 367
		bodyModel[77].setRotationPoint(40F, -36.5F, -5.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 50, 6, 7, 0F,0F, 0F, 6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 368
		bodyModel[78].setRotationPoint(-10F, -39F, -3.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 76, 4, 7, 0F,0F, 4F, 0F, -7F, -2F, -1.5F, -7F, -2F, -1.5F, 0F, 4F, 0F, 0F, -3.5F, 4F, 0F, 3F, 4.5F, 3F, 3F, 3.5F, 3F, -3.5F, 4F); // Box 369
		bodyModel[79].setRotationPoint(40F, -36.5F, -3.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 34, 1, 5, 0F,0F, 6.5F, -3F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 2F, 2F, 0F, 4F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 377
		bodyModel[80].setRotationPoint(80.5F, -22F, 17F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 80, 1, 5, 0F,0F, 10F, -8.5F, 0F, 6.5F, -3F, 0F, 2F, 2F, 0F, 5.5F, 7F, 0F, 2F, 2F, 0F, 4F, 2F, 0F, 0F, 2F, 0F, -6F, 7F); // Box 378
		bodyModel[81].setRotationPoint(0.5F, -22F, 17F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 34, 1, 5, 0F,0F, 2F, 2F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 6.5F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 4F, 2F); // Box 383
		bodyModel[82].setRotationPoint(80.5F, -22F, -22F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 80, 1, 5, 0F,0F, 5.5F, 7F, 0F, 2F, 2F, 0F, 6.5F, -3F, 0F, 10F, -8.5F, 0F, -6F, 7F, 0F, 0F, 2F, 0F, 4F, 2F, 0F, 2F, 2F); // Box 384
		bodyModel[83].setRotationPoint(0.5F, -22F, -22F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, -2.4F, -4.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.4F, -4.4F, 0F, -0.5F, -4.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -4.4F); // Box 385
		bodyModel[84].setRotationPoint(-137F, -32F, -4.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, -5.4F, -4.4F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -5.4F, -4.4F, 0F, 2.5F, -4.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2.5F, -4.4F); // Box 386
		bodyModel[85].setRotationPoint(-137F, -35F, -4.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0F, 0.6F, -4.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.6F, -4.4F, 0F, -3.5F, -4.4F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3.5F, -4.4F); // Box 387
		bodyModel[86].setRotationPoint(-137F, -29F, -4.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 70, 36, 1, 0F,-55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F, -25F, 1F, 0F, -25F, 1F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[87].setRotationPoint(59F, -74.5F, -0.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 31, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[88].setRotationPoint(114F, -80.5F, -1.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 391
		bodyModel[89].setRotationPoint(112F, -80.5F, -1.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 392
		bodyModel[90].setRotationPoint(145F, -80.5F, -1.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F,0F, 8F, -5F, 0F, 10F, -8.5F, 0F, 5.5F, 7F, 0F, 5F, 1F, 0F, 1F, -4F, 0F, 2F, 2F, 0F, -6F, 7F, 0F, -6F, 1F); // Box 393
		bodyModel[91].setRotationPoint(-25.5F, -22F, 17F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F,0F, 5F, 1F, 0F, 5.5F, 7F, 0F, 10F, -8.5F, 0F, 8F, -5F, 0F, -6F, 1F, 0F, -6F, 7F, 0F, 2F, 2F, 0F, 1F, -4F); // Box 394
		bodyModel[92].setRotationPoint(-25.5F, -22F, -22F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 30, 6, 1, 0F,-20F, -2F, 0F, -10F, -2F, 0F, -10F, -2F, 0F, -20F, -2F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[93].setRotationPoint(43F, -46.5F, -0.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, -2F, 0F, 2F, 2.5F, 0F, 2F, 2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[94].setRotationPoint(63F, -46.5F, -0.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // Box 397
		bodyModel[95].setRotationPoint(130F, -85.5F, -0.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[96].setRotationPoint(135F, -85.5F, -0.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[97].setRotationPoint(135F, -82.5F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,-2F, -1.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, -1.5F, -3F, 3F, 0F, -3F, 4F, -2.2F, 1.2F, 4F, -2.2F, 1.2F, 3F, 0F, -3F); // Box 400
		bodyModel[98].setRotationPoint(-99F, -42F, -4.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, -0.5F, 2F, 0F, 1F, -3F, 0F, 1F, 2.5F, 0F, -0.5F, -2.3F, 8F, 1.5F, 2.5F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F); // Box 401
		bodyModel[99].setRotationPoint(-92.5F, -42F, 4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 43, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[100].setRotationPoint(-72.5F, -43F, 7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, -0.5F, -2.3F, 0F, 1F, 2.5F, 0F, 1F, -3F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 8F, 1.5F, 2.5F); // Box 403
		bodyModel[101].setRotationPoint(-92.5F, -42F, -5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 43, 2, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, -1.1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[102].setRotationPoint(-72.5F, -43F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 405
		bodyModel[103].setRotationPoint(-71F, -53F, 0F);
		bodyModel[103].rotateAngleZ = 0.34906585F;

		bodyModel[104].addShapeBox(0F, 0F, 2.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F); // Box 407
		bodyModel[104].setRotationPoint(-71F, -53F, 0F);
		bodyModel[104].rotateAngleZ = 0.34906585F;

		bodyModel[105].addShapeBox(0F, 4F, 6.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[105].setRotationPoint(-71F, -53F, 0F);
		bodyModel[105].rotateAngleZ = 0.34906585F;

		bodyModel[106].addShapeBox(0F, 0F, -6.5F, 1, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 409
		bodyModel[106].setRotationPoint(-71F, -53F, 0F);
		bodyModel[106].rotateAngleZ = 0.34906585F;

		bodyModel[107].addShapeBox(0F, 4F, -7.5F, 1, 7, 1, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 410
		bodyModel[107].setRotationPoint(-71F, -53F, 0F);
		bodyModel[107].rotateAngleZ = 0.34906585F;

		bodyModel[108].addShapeBox(0F, 0F, 2.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F); // Box 411
		bodyModel[108].setRotationPoint(-71F, -53F, 0F);
		bodyModel[108].rotateAngleZ = 0.34906585F;

		bodyModel[109].addShapeBox(0F, 0F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 412
		bodyModel[109].setRotationPoint(-71F, -53F, 0F);
		bodyModel[109].rotateAngleZ = 0.34906585F;

		bodyModel[110].addShapeBox(0F, 4F, 6.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[110].setRotationPoint(-71F, -53F, 0F);
		bodyModel[110].rotateAngleZ = 0.34906585F;

		bodyModel[111].addShapeBox(0F, 4F, -7.5F, 1, 7, 1, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 414
		bodyModel[111].setRotationPoint(-71F, -53F, 0F);
		bodyModel[111].rotateAngleZ = 0.34906585F;

		bodyModel[112].addShapeBox(0F, 0F, -6.5F, 1, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 415
		bodyModel[112].setRotationPoint(-71F, -53F, 0F);
		bodyModel[112].rotateAngleZ = 0.34906585F;

		bodyModel[113].addShapeBox(0F, 0F, 2.5F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F); // Box 416
		bodyModel[113].setRotationPoint(-46F, -52F, 0F);
		bodyModel[113].rotateAngleZ = -0.38397244F;

		bodyModel[114].addShapeBox(0F, 0F, -2.5F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 417
		bodyModel[114].setRotationPoint(-46F, -52F, 0F);
		bodyModel[114].rotateAngleZ = -0.38397244F;

		bodyModel[115].addShapeBox(0F, 4F, 6.5F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[115].setRotationPoint(-46F, -52F, 0F);
		bodyModel[115].rotateAngleZ = -0.38397244F;

		bodyModel[116].addShapeBox(0F, 4F, -7.5F, 2, 7, 1, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 419
		bodyModel[116].setRotationPoint(-46F, -52F, 0F);
		bodyModel[116].rotateAngleZ = -0.38397244F;

		bodyModel[117].addShapeBox(0F, 0F, -6.5F, 2, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 420
		bodyModel[117].setRotationPoint(-46F, -52F, 0F);
		bodyModel[117].rotateAngleZ = -0.38397244F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[118].setRotationPoint(-57.5F, -46F, -3F);
		bodyModel[118].rotateAngleZ = -0.48869219F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,-0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[119].setRotationPoint(-57.5F, -51F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[120].setRotationPoint(-51.5F, -50.5F, -3F);
		bodyModel[120].rotateAngleZ = -0.52359878F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 483
		bodyModel[121].setRotationPoint(-83.5F, -43.5F, -3F);
		bodyModel[121].rotateAngleZ = 0.34906585F;

		bodyModel[122].addShapeBox(-9F, 0F, 0F, 9, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 484
		bodyModel[122].setRotationPoint(-83.5F, -43.5F, -3F);
		bodyModel[122].rotateAngleZ = 0.45378561F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 485
		bodyModel[123].setRotationPoint(-45.5F, -46.5F, -3.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 11, 4, 7, 0F,0F, 0F, -1F, -1.5F, -2.5F, -1F, -1.5F, -2.5F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 486
		bodyModel[124].setRotationPoint(-39.5F, -46.5F, -3.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[125].setRotationPoint(-45.5F, -42.5F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0F); // Box 488
		bodyModel[126].setRotationPoint(-95F, -42F, 8F);
		bodyModel[126].rotateAngleX = -0.26179939F;

		bodyModel[127].addShapeBox(-9F, -6F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, -9F, -1F, 0F, 9F, -2F, 0F, 9F, -2F, 0F, -9F, -1F, 0F); // Box 489
		bodyModel[127].setRotationPoint(-95F, -42F, 8F);
		bodyModel[127].rotateAngleX = -0.26179939F;

		bodyModel[128].addShapeBox(-11F, -8.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F); // Box 490
		bodyModel[128].setRotationPoint(-95F, -42F, 8F);
		bodyModel[128].rotateAngleX = -0.26179939F;

		bodyModel[129].addShapeBox(-15F, -8.5F, -0.5F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[129].setRotationPoint(-95F, -42F, 8F);
		bodyModel[129].rotateAngleX = -0.26179939F;

		bodyModel[130].addShapeBox(-18F, -8.5F, -0.5F, 3, 3, 2, 0F,0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F); // Box 492
		bodyModel[130].setRotationPoint(-95F, -42F, 8F);
		bodyModel[130].rotateAngleX = -0.26179939F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 20, 4, 2, 0F,0F, 0F, 0F, 12F, 1F, 0F, 12F, 1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F); // Box 493
		bodyModel[131].setRotationPoint(70F, -15.5F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -2F, 0F, 0F); // Box 494
		bodyModel[132].setRotationPoint(77F, -11.5F, -1F);

		bodyModel[133].addShapeBox(0F, -0.5F, 0F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[133].setRotationPoint(80F, -9.5F, -0.5F);
		bodyModel[133].rotateAngleZ = 0.19198622F;

		bodyModel[134].addShapeBox(23F, -0.5F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[134].setRotationPoint(80F, -9.5F, -0.5F);
		bodyModel[134].rotateAngleZ = 0.19198622F;

		bodyModel[135].addShapeBox(25F, -2F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 497
		bodyModel[135].setRotationPoint(80F, -9.5F, -0.5F);
		bodyModel[135].rotateAngleZ = 0.19198622F;

		bodyModel[136].addShapeBox(26F, -2F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 498
		bodyModel[136].setRotationPoint(80F, -9.5F, -0.5F);
		bodyModel[136].rotateAngleZ = 0.19198622F;

		bodyModel[137].addShapeBox(27F, -0.5F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[137].setRotationPoint(80F, -9.5F, -0.5F);
		bodyModel[137].rotateAngleZ = 0.19198622F;

		bodyModel[138].addShapeBox(25.5F, 0.5F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 500
		bodyModel[138].setRotationPoint(80F, -9.5F, -0.5F);
		bodyModel[138].rotateAngleZ = 0.19198622F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 521
		bodyModel[139].setRotationPoint(-20.5F, -25F, 22.7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 522
		bodyModel[140].setRotationPoint(-20.5F, -27F, 22.7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 8, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[141].setRotationPoint(-66.5F, -40F, -3F);

		bodyModel[142].addShapeBox(7.5F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 524
		bodyModel[142].setRotationPoint(-83.5F, -43.4F, -1F);
		bodyModel[142].rotateAngleZ = 0.34906585F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 2F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[143].setRotationPoint(-83.5F, -39F, -6F);
		bodyModel[143].rotateAngleZ = 0.34906585F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[144].setRotationPoint(-83.5F, -39F, 5F);
		bodyModel[144].rotateAngleZ = 0.34906585F;

		bodyModel[145].addShapeBox(7.4F, 3F, 0F, 8, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[145].setRotationPoint(-83.5F, -43.4F, -1F);
		bodyModel[145].rotateAngleZ = 0.34906585F;

		bodyModel[146].addShapeBox(7.4F, 3F, 0F, 8, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 528
		bodyModel[146].setRotationPoint(-85.5F, -42.4F, 3F);
		bodyModel[146].rotateAngleZ = 0.34906585F;

		bodyModel[147].addShapeBox(7.4F, 3F, 0F, 8, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[147].setRotationPoint(-85.5F, -42.4F, -5F);
		bodyModel[147].rotateAngleZ = 0.34906585F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 14, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[148].setRotationPoint(-69.5F, -41F, -7.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 14, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		bodyModel[149].setRotationPoint(-69.5F, -41F, 3.5F);

		bodyModel[150].addShapeBox(0F, 3F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[150].setRotationPoint(-73.5F, -39.4F, -5F);
		bodyModel[150].rotateAngleZ = 1.43116999F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[151].setRotationPoint(-63.5F, -45.5F, -6.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[152].setRotationPoint(-66.5F, -46F, 4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 535
		bodyModel[153].setRotationPoint(-69.5F, -42F, 3.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 536
		bodyModel[154].setRotationPoint(-71.5F, -50.4F, -2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 537
		bodyModel[155].setRotationPoint(-71.5F, -50.4F, 1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 50, 50, 0F,-0.4F, 0F, 0F, -0.4F, -1F, -1F, -0.4F, -1F, -46F, -0.4F, 0F, -45F, -0.4F, -45F, 0F, -0.4F, -46F, -1F, -0.4F, -46F, -46F, -0.4F, -45F, -45F); // Box 538
		bodyModel[156].setRotationPoint(-71F, -51.4F, -2.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 278
		tailModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 279
		tailModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 280
		tailModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 281
		tailModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 282
		tailModel[5] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 283
		tailModel[6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 284
		tailModel[7] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 285
		tailModel[8] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 286
		tailModel[9] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 287
		tailModel[10] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 288
		tailModel[11] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 289
		tailModel[12] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Box 363
		tailModel[13] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 364
		tailModel[14] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 365
		tailModel[15] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 370
		tailModel[16] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 371
		tailModel[17] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Box 372
		tailModel[18] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Box 373
		tailModel[19] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 374
		tailModel[20] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 375
		tailModel[21] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Box 376

		tailModel[0].addShapeBox(0F, 0F, 0F, 2, 6, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 278
		tailModel[0].setRotationPoint(114.5F, -33F, 0F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 2, 6, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		tailModel[1].setRotationPoint(114.5F, -27F, 0F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 2, 5, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 280
		tailModel[2].setRotationPoint(114.5F, -21F, 0F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 7, 5, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -6F); // Box 281
		tailModel[3].setRotationPoint(116.5F, -21F, 0F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 7, 6, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 282
		tailModel[4].setRotationPoint(116.5F, -27F, 0F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 7, 6, 18, 0F,0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 283
		tailModel[5].setRotationPoint(116.5F, -33F, 0F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 2, 6, 18, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 284
		tailModel[6].setRotationPoint(114.5F, -33F, -18F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 2, 6, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 285
		tailModel[7].setRotationPoint(114.5F, -27F, -18F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 2, 5, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 286
		tailModel[8].setRotationPoint(114.5F, -21F, -18F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 7, 5, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -6F); // Box 287
		tailModel[9].setRotationPoint(116.5F, -21F, -18F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 7, 6, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 288
		tailModel[10].setRotationPoint(116.5F, -27F, -18F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 7, 6, 18, 0F,0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 289
		tailModel[11].setRotationPoint(116.5F, -33F, -18F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F); // Box 363
		tailModel[12].setRotationPoint(116F, -37.5F, -2F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 364
		tailModel[13].setRotationPoint(116F, -36.5F, -2F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F); // Box 365
		tailModel[14].setRotationPoint(116F, -33.5F, -2F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F); // Box 370
		tailModel[15].setRotationPoint(112F, -32F, -2F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 371
		tailModel[16].setRotationPoint(112F, -31F, -2F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F); // Box 372
		tailModel[17].setRotationPoint(112F, -29F, -2F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 373
		tailModel[18].setRotationPoint(112F, -26F, -1F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F); // Box 374
		tailModel[19].setRotationPoint(112F, -24F, -1F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 375
		tailModel[20].setRotationPoint(112F, -21F, -1F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 376
		tailModel[21].setRotationPoint(108F, -19F, -2F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 673, 169, textureX, textureY); // Box 380
		leftWingModel[1] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Box 501
		leftWingModel[2] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 502
		leftWingModel[3] = new ModelRendererTurbo(this, 929, 137, textureX, textureY); // Box 503
		leftWingModel[4] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 504
		leftWingModel[5] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 509
		leftWingModel[6] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 510
		leftWingModel[7] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 511
		leftWingModel[8] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 512
		leftWingModel[9] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 513
		leftWingModel[10] = new ModelRendererTurbo(this, 897, 217, textureX, textureY); // Box 514

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 80, 1, 63, 0F,-66F, -8F, 0F, 0F, -8F, 0F, 0F, -4F, 5F, 0F, 0F, 0F, -66F, 8F, 0F, 0F, 8F, 0F, 0F, 6F, 5F, 0F, 0F, 0F); // Box 380
		leftWingModel[0].setRotationPoint(0.5F, -28F, -92F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0F, 0F, 4F, 0F, -3F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -3F, -3F, 0F, 0F, -6F, 0F, 0F); // Box 501
		leftWingModel[1].setRotationPoint(47.5F, -20.5F, -97F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 51, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 502
		leftWingModel[2].setRotationPoint(47.5F, -20.5F, -97F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -12F, 0F, 0F); // Box 503
		leftWingModel[3].setRotationPoint(78.5F, -20.5F, -94F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		leftWingModel[4].setRotationPoint(69.5F, -20F, -95F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 27, 6, 2, 0F,0F, 0F, -0.2F, 3F, -1F, -0.2F, 3F, -1F, -0.2F, 0F, 0F, -0.2F, 5F, -1.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 5F, -1.5F, -0.2F); // Box 509
		leftWingModel[5].setRotationPoint(35F, -23F, -62F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 38, 4, 2, 0F,0F, 0F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -0.5F, 0.2F); // Box 510
		leftWingModel[6].setRotationPoint(25F, -19F, -62F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.5F, -1.5F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, -1.5F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, -0.7F, -0.2F); // Box 511
		leftWingModel[7].setRotationPoint(21F, -19F, -62F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.5F, -1.5F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, -1.5F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, -0.7F, -0.2F); // Box 512
		leftWingModel[8].setRotationPoint(8.5F, -20.5F, -40.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 64, 6, 2, 0F,6F, 1F, -0.2F, -3F, -2F, -0.2F, -3F, -2F, -0.2F, 6F, 1F, -0.2F, 2F, -1.5F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 2F, -1.5F, -0.2F); // Box 513
		leftWingModel[9].setRotationPoint(18.5F, -24.5F, -40.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 38, 4, 2, 0F,0F, 0F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -0.5F, 0.2F); // Box 514
		leftWingModel[10].setRotationPoint(12.5F, -20.5F, -40.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 379
		rightWingModel[1] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 505
		rightWingModel[2] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 506
		rightWingModel[3] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Box 507
		rightWingModel[4] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 508
		rightWingModel[5] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 515
		rightWingModel[6] = new ModelRendererTurbo(this, 897, 225, textureX, textureY); // Box 516
		rightWingModel[7] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 517
		rightWingModel[8] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 518
		rightWingModel[9] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 519
		rightWingModel[10] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 520

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 80, 1, 63, 0F,0F, 0F, 0F, 0F, -4F, 5F, 0F, -8F, 0F, -66F, -8F, 0F, 0F, 0F, 0F, 0F, 6F, 5F, 0F, 8F, 0F, -66F, 8F, 0F); // Box 379
		rightWingModel[0].setRotationPoint(0.5F, -28F, 29F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,-6F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, -3F, 0F, 0F, 0F); // Box 505
		rightWingModel[1].setRotationPoint(47.5F, -20.5F, 93F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 51, 2, 3, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		rightWingModel[2].setRotationPoint(47.5F, -20.5F, 94F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 20, 2, 2, 0F,-12F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		rightWingModel[3].setRotationPoint(78.5F, -20.5F, 92F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		rightWingModel[4].setRotationPoint(69.5F, -20F, 92F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 27, 6, 2, 0F,0F, 0F, -0.2F, 3F, -1F, -0.2F, 3F, -1F, -0.2F, 0F, 0F, -0.2F, 5F, -1.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 5F, -1.5F, -0.2F); // Box 515
		rightWingModel[5].setRotationPoint(35F, -23F, 60F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 38, 4, 2, 0F,0F, 0F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -0.5F, 0.2F); // Box 516
		rightWingModel[6].setRotationPoint(25F, -19F, 60F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.5F, -1.5F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, -1.5F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, -0.7F, -0.2F); // Box 517
		rightWingModel[7].setRotationPoint(21F, -19F, 60F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.5F, -1.5F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, -1.5F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, -0.7F, -0.2F); // Box 518
		rightWingModel[8].setRotationPoint(8.5F, -20.5F, 38.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 64, 6, 2, 0F,6F, 1F, -0.2F, -3F, -2F, -0.2F, -3F, -2F, -0.2F, 6F, 1F, -0.2F, 2F, -1.5F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 2F, -1.5F, -0.2F); // Box 519
		rightWingModel[9].setRotationPoint(18.5F, -24.5F, 38.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 38, 4, 2, 0F,0F, 0F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -0.5F, 0.2F); // Box 520
		rightWingModel[10].setRotationPoint(12.5F, -20.5F, 38.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Box 389

		yawFlapModel[0].addShapeBox(0F, -17.5F, -0.5F, 12, 44, 1, 0F,0F, 0F, 0F, -2F, 6F, 0F, -2F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -10F, 0F, 3F, -10F, 0F, 0F, 0F, 0F); // Box 389
		yawFlapModel[0].setRotationPoint(119F, -60F, 0F);
		yawFlapModel[0].rotateAngleZ = -0.59341195F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 339

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, -10F, 5, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, 1F, 0F, 0F, 0F); // Box 339
		pitchFlapLeftModel[0].setRotationPoint(-17.7F, -37.5F, 30F);
		pitchFlapLeftModel[0].rotateAngleY = -0.13962634F;
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 341

		pitchFlapRightModel[0].addShapeBox(0F, 0F, -12F, 5, 1, 23, 0F,0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 341
		pitchFlapRightModel[0].setRotationPoint(-17.7F, -37.5F, -31F);
		pitchFlapRightModel[0].rotateAngleY = 0.13962634F;
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 382

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, -34F, 13, 1, 67, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, 7F, -0.4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 7F, -0.4F, 0F, 0F, 0F, 0F); // Box 382
		pitchFlapLeftWingModel[0].setRotationPoint(80.5F, -21F, -57F);
		pitchFlapLeftWingModel[0].rotateAngleX = 0.02617994F;
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 381

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, -33F, 13, 1, 67, 0F,0F, 2F, 0F, 7F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 381
		pitchFlapRightWingModel[0].setRotationPoint(80.5F, -21F, 57F);
		pitchFlapRightWingModel[0].rotateAngleX = -0.02617994F;
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 422
		bodyWheelModel[1] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 423
		bodyWheelModel[2] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 424
		bodyWheelModel[3] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 425
		bodyWheelModel[4] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 426
		bodyWheelModel[5] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 427
		bodyWheelModel[6] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 428
		bodyWheelModel[7] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 429
		bodyWheelModel[8] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 430
		bodyWheelModel[9] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 431
		bodyWheelModel[10] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 432
		bodyWheelModel[11] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 433
		bodyWheelModel[12] = new ModelRendererTurbo(this, 713, 89, textureX, textureY); // Box 434
		bodyWheelModel[13] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 435
		bodyWheelModel[14] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 436
		bodyWheelModel[15] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 437
		bodyWheelModel[16] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 438
		bodyWheelModel[17] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 439
		bodyWheelModel[18] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 440
		bodyWheelModel[19] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 441
		bodyWheelModel[20] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 442
		bodyWheelModel[21] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 443
		bodyWheelModel[22] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 444
		bodyWheelModel[23] = new ModelRendererTurbo(this, 929, 129, textureX, textureY); // Box 445
		bodyWheelModel[24] = new ModelRendererTurbo(this, 721, 137, textureX, textureY); // Box 446
		bodyWheelModel[25] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 447
		bodyWheelModel[26] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 448
		bodyWheelModel[27] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 449
		bodyWheelModel[28] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 450
		bodyWheelModel[29] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 451
		bodyWheelModel[30] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 453
		bodyWheelModel[31] = new ModelRendererTurbo(this, 929, 185, textureX, textureY); // Box 454
		bodyWheelModel[32] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 455
		bodyWheelModel[33] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 456
		bodyWheelModel[34] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 457
		bodyWheelModel[35] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 458
		bodyWheelModel[36] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 459
		bodyWheelModel[37] = new ModelRendererTurbo(this, 969, 185, textureX, textureY); // Box 460
		bodyWheelModel[38] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 461
		bodyWheelModel[39] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 462
		bodyWheelModel[40] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 463
		bodyWheelModel[41] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 464
		bodyWheelModel[42] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 465
		bodyWheelModel[43] = new ModelRendererTurbo(this, 673, 193, textureX, textureY); // Box 466
		bodyWheelModel[44] = new ModelRendererTurbo(this, 969, 193, textureX, textureY); // Box 467
		bodyWheelModel[45] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 468
		bodyWheelModel[46] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 469
		bodyWheelModel[47] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 470
		bodyWheelModel[48] = new ModelRendererTurbo(this, 1009, 169, textureX, textureY); // Box 471
		bodyWheelModel[49] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 472
		bodyWheelModel[50] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Box 473
		bodyWheelModel[51] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 474
		bodyWheelModel[52] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 475
		bodyWheelModel[53] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 476
		bodyWheelModel[54] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 478
		bodyWheelModel[55] = new ModelRendererTurbo(this, 713, 177, textureX, textureY); // Box 479
		bodyWheelModel[56] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 480

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyWheelModel[0].setRotationPoint(-65.25F, 0.5F, -4.5F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyWheelModel[1].setRotationPoint(-65.25F, 3.5F, -4.5F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 424
		bodyWheelModel[2].setRotationPoint(-65.25F, 6.5F, -4.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyWheelModel[3].setRotationPoint(-65.25F, 0.5F, -5.5F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyWheelModel[4].setRotationPoint(-65.25F, 3.5F, -5.5F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 427
		bodyWheelModel[5].setRotationPoint(-65.25F, 6.5F, -5.5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 428
		bodyWheelModel[6].setRotationPoint(-65.25F, 0.5F, -3.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 429
		bodyWheelModel[7].setRotationPoint(-65.25F, 3.5F, -3.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F); // Box 430
		bodyWheelModel[8].setRotationPoint(-65.25F, 6.5F, -3.5F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyWheelModel[9].setRotationPoint(-65.25F, 0.5F, 3.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyWheelModel[10].setRotationPoint(-65.25F, 3.5F, 3.5F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 433
		bodyWheelModel[11].setRotationPoint(-65.25F, 6.5F, 3.5F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 434
		bodyWheelModel[12].setRotationPoint(-65.25F, 0.5F, 4.5F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 435
		bodyWheelModel[13].setRotationPoint(-65.25F, 3.5F, 4.5F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F); // Box 436
		bodyWheelModel[14].setRotationPoint(-65.25F, 6.5F, 4.5F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyWheelModel[15].setRotationPoint(-65.25F, 0.5F, 2.5F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyWheelModel[16].setRotationPoint(-65.25F, 3.5F, 2.5F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 439
		bodyWheelModel[17].setRotationPoint(-65.25F, 6.5F, 2.5F);

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyWheelModel[18].setRotationPoint(-61.25F, 4.5F, -3.5F);

		bodyWheelModel[19].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyWheelModel[19].setRotationPoint(-62.25F, -0.5F, -1F);

		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 442
		bodyWheelModel[20].setRotationPoint(-61.25F, -22.5F, -1F);
		bodyWheelModel[20].rotateAngleZ = -0.05235988F;

		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 2, 29, 2, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 443
		bodyWheelModel[21].setRotationPoint(-31.25F, -22.5F, -1F);
		bodyWheelModel[21].rotateAngleZ = -1.09955743F;

		bodyWheelModel[22].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 2F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 2F, 0.4F); // Box 444
		bodyWheelModel[22].setRotationPoint(-63.25F, -9.5F, -1.5F);

		bodyWheelModel[23].addShapeBox(0F, 0F, 0F, 19, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyWheelModel[23].setRotationPoint(-65.25F, -23.5F, -6F);
		bodyWheelModel[23].rotateAngleX = -0.12217305F;
		bodyWheelModel[23].rotateAngleZ = -0.08726646F;

		bodyWheelModel[24].addShapeBox(0F, -1F, 0F, 19, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyWheelModel[24].setRotationPoint(-65.25F, -23.5F, 5F);
		bodyWheelModel[24].rotateAngleX = 0.12217305F;
		bodyWheelModel[24].rotateAngleZ = -0.08726646F;

		bodyWheelModel[25].addShapeBox(3F, 0F, 0F, 1, 17, 4, 0F,-0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F); // Box 447
		bodyWheelModel[25].setRotationPoint(-31.25F, -22.5F, -2F);
		bodyWheelModel[25].rotateAngleZ = -1.09955743F;

		bodyWheelModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 448
		bodyWheelModel[26].setRotationPoint(-61.25F, -1.5F, -1.5F);
		bodyWheelModel[26].rotateAngleZ = 1.08210414F;

		bodyWheelModel[27].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 449
		bodyWheelModel[27].setRotationPoint(-53.25F, 1.5F, -1F);
		bodyWheelModel[27].rotateAngleZ = -1.23918377F;

		bodyWheelModel[28].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, -0.4F, 0F); // Box 450
		bodyWheelModel[28].setRotationPoint(-77.25F, -2F, -0.5F);

		bodyWheelModel[29].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 451
		bodyWheelModel[29].setRotationPoint(30.25F, 5F, -27F);

		bodyWheelModel[30].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyWheelModel[30].setRotationPoint(30.25F, 0F, -27F);

		bodyWheelModel[31].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyWheelModel[31].setRotationPoint(30.25F, -5F, -27F);

		bodyWheelModel[32].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 455
		bodyWheelModel[32].setRotationPoint(30.25F, 5F, -28F);

		bodyWheelModel[33].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,-5F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyWheelModel[33].setRotationPoint(30.25F, -5F, -28F);

		bodyWheelModel[34].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyWheelModel[34].setRotationPoint(30.25F, 0F, -28F);

		bodyWheelModel[35].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); // Box 458
		bodyWheelModel[35].setRotationPoint(30.25F, 5F, -24F);

		bodyWheelModel[36].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 459
		bodyWheelModel[36].setRotationPoint(30.25F, -5F, -24F);

		bodyWheelModel[37].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 460
		bodyWheelModel[37].setRotationPoint(30.25F, 0F, -24F);

		bodyWheelModel[38].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 461
		bodyWheelModel[38].setRotationPoint(30.25F, 5F, 24F);

		bodyWheelModel[39].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyWheelModel[39].setRotationPoint(30.25F, 0F, 24F);

		bodyWheelModel[40].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyWheelModel[40].setRotationPoint(30.25F, -5F, 24F);

		bodyWheelModel[41].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); // Box 464
		bodyWheelModel[41].setRotationPoint(30.25F, 5F, 27F);

		bodyWheelModel[42].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 465
		bodyWheelModel[42].setRotationPoint(30.25F, -5F, 27F);

		bodyWheelModel[43].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 466
		bodyWheelModel[43].setRotationPoint(30.25F, 0F, 27F);

		bodyWheelModel[44].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 467
		bodyWheelModel[44].setRotationPoint(30.25F, 5F, 23F);

		bodyWheelModel[45].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,-5F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyWheelModel[45].setRotationPoint(30.25F, -5F, 23F);

		bodyWheelModel[46].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyWheelModel[46].setRotationPoint(30.25F, 0F, 23F);

		bodyWheelModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyWheelModel[47].setRotationPoint(36.75F, 1.5F, 19F);

		bodyWheelModel[48].addShapeBox(-1F, -1F, -1F, 2, 19, 2, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 471
		bodyWheelModel[48].setRotationPoint(38.75F, -19.5F, 16.5F);
		bodyWheelModel[48].rotateAngleX = 0.19198622F;
		bodyWheelModel[48].rotateAngleZ = -0.05235988F;

		bodyWheelModel[49].addShapeBox(-1F, 14F, -1F, 2, 9, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 472
		bodyWheelModel[49].setRotationPoint(38.75F, -19.5F, 16.5F);
		bodyWheelModel[49].rotateAngleX = 0.19198622F;
		bodyWheelModel[49].rotateAngleZ = -0.05235988F;

		bodyWheelModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyWheelModel[50].setRotationPoint(36.75F, 1.5F, -23F);

		bodyWheelModel[51].addShapeBox(-1F, -1F, -1F, 2, 19, 2, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 474
		bodyWheelModel[51].setRotationPoint(38.75F, -19.5F, -16.5F);
		bodyWheelModel[51].rotateAngleX = -0.19198622F;
		bodyWheelModel[51].rotateAngleZ = -0.05235988F;

		bodyWheelModel[52].addShapeBox(-1F, 14F, -1F, 2, 9, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 475
		bodyWheelModel[52].setRotationPoint(38.75F, -19.5F, -16.5F);
		bodyWheelModel[52].rotateAngleX = -0.19198622F;
		bodyWheelModel[52].rotateAngleZ = -0.05235988F;

		bodyWheelModel[53].addShapeBox(-1F, -1F, -1F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyWheelModel[53].setRotationPoint(29.75F, -16.5F, 11.5F);
		bodyWheelModel[53].rotateAngleX = 0.45378561F;
		bodyWheelModel[53].rotateAngleZ = 0.6981317F;

		bodyWheelModel[54].addShapeBox(-1F, -1F, -1F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyWheelModel[54].setRotationPoint(29.75F, -16.5F, -12.5F);
		bodyWheelModel[54].rotateAngleX = -0.45378561F;
		bodyWheelModel[54].rotateAngleZ = 0.6981317F;

		bodyWheelModel[55].addShapeBox(-1F, -1F, -1F, 2, 15, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 4F, -1F, -0.3F, 4F, -1F); // Box 479
		bodyWheelModel[55].setRotationPoint(43.75F, -19.5F, -18.5F);
		bodyWheelModel[55].rotateAngleX = -0.13962634F;
		bodyWheelModel[55].rotateAngleZ = 0.17453293F;

		bodyWheelModel[56].addShapeBox(-1F, -1F, -1F, 2, 15, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 4F, -1F, -0.3F, 4F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 480
		bodyWheelModel[56].setRotationPoint(43.75F, -19.5F, 12.5F);
		bodyWheelModel[56].rotateAngleX = 0.13962634F;
		bodyWheelModel[56].rotateAngleZ = 0.17453293F;
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 539

		hudModel[0].addShapeBox(0F, -3F, -2.5F, 1, 50, 50, 0F,-0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -46F, -0.4F, 0F, -45F, -0.4F, -45F, 0F, -0.4F, -45F, -1F, -0.4F, -45F, -46F, -0.4F, -45F, -45F); // Box 539
		hudModel[0].setRotationPoint(-72F, -49.4F, 0F);
	}
}