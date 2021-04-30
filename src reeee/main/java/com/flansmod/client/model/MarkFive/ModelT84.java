//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.06.2017 - 16:00:58
// Last changed on: 19.06.2017 - 16:00:58

package com.flansmod.client.model.MarkFive; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelT84 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelT84() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[321];
		turretModel = new ModelRendererTurbo[161];
		barrelModel = new ModelRendererTurbo[67];
		leftTrackWheelModels = new ModelRendererTurbo[111];
		rightTrackWheelModels = new ModelRendererTurbo[111];
		leftTrackModel = new ModelRendererTurbo[11];
		rightTrackModel = new ModelRendererTurbo[11];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 689, 57, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 23
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 38
		bodyModel[29] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 42
		bodyModel[33] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 43
		bodyModel[34] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 44
		bodyModel[35] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 45
		bodyModel[36] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 46
		bodyModel[37] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 47
		bodyModel[38] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 48
		bodyModel[39] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 49
		bodyModel[40] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 50
		bodyModel[41] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 51
		bodyModel[42] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 53
		bodyModel[44] = new ModelRendererTurbo(this, 889, 193, textureX, textureY); // Box 277
		bodyModel[45] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 278
		bodyModel[46] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 279
		bodyModel[47] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 280
		bodyModel[48] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Box 281
		bodyModel[49] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 282
		bodyModel[50] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 283
		bodyModel[51] = new ModelRendererTurbo(this, 601, 201, textureX, textureY); // Box 284
		bodyModel[52] = new ModelRendererTurbo(this, 705, 201, textureX, textureY); // Box 285
		bodyModel[53] = new ModelRendererTurbo(this, 513, 209, textureX, textureY); // Box 286
		bodyModel[54] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 315
		bodyModel[55] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 316
		bodyModel[56] = new ModelRendererTurbo(this, 577, 225, textureX, textureY); // Box 317
		bodyModel[57] = new ModelRendererTurbo(this, 825, 225, textureX, textureY); // Box 318
		bodyModel[58] = new ModelRendererTurbo(this, 665, 233, textureX, textureY); // Box 319
		bodyModel[59] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 320
		bodyModel[60] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 321
		bodyModel[61] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 322
		bodyModel[62] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 323
		bodyModel[63] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 324
		bodyModel[64] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 325
		bodyModel[65] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 326
		bodyModel[66] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 327
		bodyModel[67] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 328
		bodyModel[68] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 329
		bodyModel[69] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 330
		bodyModel[70] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 331
		bodyModel[71] = new ModelRendererTurbo(this, 961, 225, textureX, textureY); // Box 332
		bodyModel[72] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 333
		bodyModel[73] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 334
		bodyModel[74] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 335
		bodyModel[75] = new ModelRendererTurbo(this, 825, 241, textureX, textureY); // Box 336
		bodyModel[76] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 337
		bodyModel[77] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 338
		bodyModel[78] = new ModelRendererTurbo(this, 721, 201, textureX, textureY); // Box 339
		bodyModel[79] = new ModelRendererTurbo(this, 521, 209, textureX, textureY); // Box 340
		bodyModel[80] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 341
		bodyModel[81] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 342
		bodyModel[82] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 343
		bodyModel[83] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 344
		bodyModel[84] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 345
		bodyModel[85] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 346
		bodyModel[86] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 347
		bodyModel[87] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 348
		bodyModel[88] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 349
		bodyModel[89] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 350
		bodyModel[90] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 351
		bodyModel[91] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 352
		bodyModel[92] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 353
		bodyModel[93] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 354
		bodyModel[94] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 355
		bodyModel[95] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 356
		bodyModel[96] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 357
		bodyModel[97] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 358
		bodyModel[98] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 359
		bodyModel[99] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 360
		bodyModel[100] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 361
		bodyModel[101] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 362
		bodyModel[102] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 363
		bodyModel[103] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 364
		bodyModel[104] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 365
		bodyModel[105] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 366
		bodyModel[106] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 367
		bodyModel[107] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 368
		bodyModel[108] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Box 369
		bodyModel[109] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 370
		bodyModel[110] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 371
		bodyModel[111] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 372
		bodyModel[112] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 373
		bodyModel[113] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 374
		bodyModel[114] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 375
		bodyModel[115] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 376
		bodyModel[116] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 377
		bodyModel[117] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 378
		bodyModel[118] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Box 379
		bodyModel[119] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 380
		bodyModel[120] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 381
		bodyModel[121] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 382
		bodyModel[122] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 383
		bodyModel[123] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Box 384
		bodyModel[124] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 385
		bodyModel[125] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 386
		bodyModel[126] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 387
		bodyModel[127] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Box 388
		bodyModel[128] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 389
		bodyModel[129] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 390
		bodyModel[130] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 391
		bodyModel[131] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 392
		bodyModel[132] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 393
		bodyModel[133] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 394
		bodyModel[134] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 395
		bodyModel[135] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 396
		bodyModel[136] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Box 113
		bodyModel[137] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); // Box 114
		bodyModel[138] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 115
		bodyModel[139] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 111
		bodyModel[140] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 112
		bodyModel[141] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Box 402
		bodyModel[142] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Box 403
		bodyModel[143] = new ModelRendererTurbo(this, 697, 105, textureX, textureY); // Box 404
		bodyModel[144] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 405
		bodyModel[145] = new ModelRendererTurbo(this, 657, 257, textureX, textureY); // Box 689
		bodyModel[146] = new ModelRendererTurbo(this, 889, 209, textureX, textureY); // Box 690
		bodyModel[147] = new ModelRendererTurbo(this, 721, 217, textureX, textureY); // Box 691
		bodyModel[148] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Box 692
		bodyModel[149] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 693
		bodyModel[150] = new ModelRendererTurbo(this, 521, 225, textureX, textureY); // Box 694
		bodyModel[151] = new ModelRendererTurbo(this, 769, 225, textureX, textureY); // Box 695
		bodyModel[152] = new ModelRendererTurbo(this, 889, 233, textureX, textureY); // Box 696
		bodyModel[153] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 697
		bodyModel[154] = new ModelRendererTurbo(this, 521, 241, textureX, textureY); // Box 698
		bodyModel[155] = new ModelRendererTurbo(this, 961, 241, textureX, textureY); // Box 699
		bodyModel[156] = new ModelRendererTurbo(this, 993, 241, textureX, textureY); // Box 700
		bodyModel[157] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 701
		bodyModel[158] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 121
		bodyModel[159] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 122
		bodyModel[160] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 123
		bodyModel[161] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 352
		bodyModel[162] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 353
		bodyModel[163] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 354
		bodyModel[164] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 355
		bodyModel[165] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 595
		bodyModel[166] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 596
		bodyModel[167] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 598
		bodyModel[168] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 637
		bodyModel[169] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 638
		bodyModel[170] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 639
		bodyModel[171] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 640
		bodyModel[172] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 641
		bodyModel[173] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 642
		bodyModel[174] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 643
		bodyModel[175] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 644
		bodyModel[176] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 645
		bodyModel[177] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 646
		bodyModel[178] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 647
		bodyModel[179] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 648
		bodyModel[180] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 649
		bodyModel[181] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 650
		bodyModel[182] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 651
		bodyModel[183] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 652
		bodyModel[184] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 653
		bodyModel[185] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 654
		bodyModel[186] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 655
		bodyModel[187] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 656
		bodyModel[188] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 657
		bodyModel[189] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 658
		bodyModel[190] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 659
		bodyModel[191] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 660
		bodyModel[192] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 661
		bodyModel[193] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 662
		bodyModel[194] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 599
		bodyModel[195] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 600
		bodyModel[196] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 687
		bodyModel[197] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 688
		bodyModel[198] = new ModelRendererTurbo(this, 913, 233, textureX, textureY); // Box 140
		bodyModel[199] = new ModelRendererTurbo(this, 721, 257, textureX, textureY); // Box 141
		bodyModel[200] = new ModelRendererTurbo(this, 825, 257, textureX, textureY); // Box 142
		bodyModel[201] = new ModelRendererTurbo(this, 769, 257, textureX, textureY); // Box 143
		bodyModel[202] = new ModelRendererTurbo(this, 953, 257, textureX, textureY); // Box 144
		bodyModel[203] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 495
		bodyModel[204] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Box 496
		bodyModel[205] = new ModelRendererTurbo(this, 545, 265, textureX, textureY); // Box 497
		bodyModel[206] = new ModelRendererTurbo(this, 953, 273, textureX, textureY); // Box 498
		bodyModel[207] = new ModelRendererTurbo(this, 633, 257, textureX, textureY); // Box 499
		bodyModel[208] = new ModelRendererTurbo(this, 457, 281, textureX, textureY); // Box 501
		bodyModel[209] = new ModelRendererTurbo(this, 561, 281, textureX, textureY); // Box 504
		bodyModel[210] = new ModelRendererTurbo(this, 673, 257, textureX, textureY); // Box 505
		bodyModel[211] = new ModelRendererTurbo(this, 873, 257, textureX, textureY); // Box 506
		bodyModel[212] = new ModelRendererTurbo(this, 913, 257, textureX, textureY); // Box 507
		bodyModel[213] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 508
		bodyModel[214] = new ModelRendererTurbo(this, 745, 289, textureX, textureY); // Box 509
		bodyModel[215] = new ModelRendererTurbo(this, 809, 289, textureX, textureY); // Box 510
		bodyModel[216] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 511
		bodyModel[217] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Box 512
		bodyModel[218] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 513
		bodyModel[219] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 514
		bodyModel[220] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 515
		bodyModel[221] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Box 516
		bodyModel[222] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Box 517
		bodyModel[223] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 519
		bodyModel[224] = new ModelRendererTurbo(this, 913, 289, textureX, textureY); // Box 520
		bodyModel[225] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 521
		bodyModel[226] = new ModelRendererTurbo(this, 593, 265, textureX, textureY); // Box 540
		bodyModel[227] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 541
		bodyModel[228] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 544
		bodyModel[229] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 545
		bodyModel[230] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 546
		bodyModel[231] = new ModelRendererTurbo(this, 753, 265, textureX, textureY); // Box 547
		bodyModel[232] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Box 548
		bodyModel[233] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 549
		bodyModel[234] = new ModelRendererTurbo(this, 817, 121, textureX, textureY); // Box 550
		bodyModel[235] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 551
		bodyModel[236] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 552
		bodyModel[237] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 553
		bodyModel[238] = new ModelRendererTurbo(this, 913, 129, textureX, textureY); // Box 554
		bodyModel[239] = new ModelRendererTurbo(this, 1017, 129, textureX, textureY); // Box 555
		bodyModel[240] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Box 556
		bodyModel[241] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 557
		bodyModel[242] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 558
		bodyModel[243] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 559
		bodyModel[244] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Box 560
		bodyModel[245] = new ModelRendererTurbo(this, 545, 281, textureX, textureY); // Box 561
		bodyModel[246] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 562
		bodyModel[247] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 563
		bodyModel[248] = new ModelRendererTurbo(this, 993, 161, textureX, textureY); // Box 564
		bodyModel[249] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 565
		bodyModel[250] = new ModelRendererTurbo(this, 825, 169, textureX, textureY); // Box 566
		bodyModel[251] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 567
		bodyModel[252] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 568
		bodyModel[253] = new ModelRendererTurbo(this, 985, 217, textureX, textureY); // Box 569
		bodyModel[254] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 570
		bodyModel[255] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Box 571
		bodyModel[256] = new ModelRendererTurbo(this, 577, 241, textureX, textureY); // Box 572
		bodyModel[257] = new ModelRendererTurbo(this, 609, 241, textureX, textureY); // Box 573
		bodyModel[258] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 574
		bodyModel[259] = new ModelRendererTurbo(this, 169, 297, textureX, textureY); // Box 575
		bodyModel[260] = new ModelRendererTurbo(this, 289, 297, textureX, textureY); // Box 576
		bodyModel[261] = new ModelRendererTurbo(this, 354, 298, textureX, textureY); // Box 577
		bodyModel[262] = new ModelRendererTurbo(this, 425, 313, textureX, textureY); // Box 578
		bodyModel[263] = new ModelRendererTurbo(this, 649, 313, textureX, textureY); // Box 579
		bodyModel[264] = new ModelRendererTurbo(this, 593, 361, textureX, textureY); // Box 897
		bodyModel[265] = new ModelRendererTurbo(this, 649, 361, textureX, textureY); // Box 898
		bodyModel[266] = new ModelRendererTurbo(this, 673, 361, textureX, textureY); // Box 899
		bodyModel[267] = new ModelRendererTurbo(this, 873, 361, textureX, textureY); // Box 900
		bodyModel[268] = new ModelRendererTurbo(this, 921, 361, textureX, textureY); // Box 901
		bodyModel[269] = new ModelRendererTurbo(this, 969, 361, textureX, textureY); // Box 902
		bodyModel[270] = new ModelRendererTurbo(this, 993, 361, textureX, textureY); // Box 903
		bodyModel[271] = new ModelRendererTurbo(this, 25, 369, textureX, textureY); // Box 904
		bodyModel[272] = new ModelRendererTurbo(this, 73, 369, textureX, textureY); // Box 905
		bodyModel[273] = new ModelRendererTurbo(this, 185, 369, textureX, textureY); // Box 906
		bodyModel[274] = new ModelRendererTurbo(this, 209, 369, textureX, textureY); // Box 907
		bodyModel[275] = new ModelRendererTurbo(this, 257, 369, textureX, textureY); // Box 908
		bodyModel[276] = new ModelRendererTurbo(this, 305, 369, textureX, textureY); // Box 909
		bodyModel[277] = new ModelRendererTurbo(this, 353, 369, textureX, textureY); // Box 910
		bodyModel[278] = new ModelRendererTurbo(this, 377, 369, textureX, textureY); // Box 911
		bodyModel[279] = new ModelRendererTurbo(this, 577, 369, textureX, textureY); // Box 912
		bodyModel[280] = new ModelRendererTurbo(this, 601, 369, textureX, textureY); // Box 913
		bodyModel[281] = new ModelRendererTurbo(this, 801, 369, textureX, textureY); // Box 914
		bodyModel[282] = new ModelRendererTurbo(this, 825, 369, textureX, textureY); // Box 915
		bodyModel[283] = new ModelRendererTurbo(this, 873, 369, textureX, textureY); // Box 916
		bodyModel[284] = new ModelRendererTurbo(this, 921, 369, textureX, textureY); // Box 917
		bodyModel[285] = new ModelRendererTurbo(this, 969, 369, textureX, textureY); // Box 918
		bodyModel[286] = new ModelRendererTurbo(this, 993, 369, textureX, textureY); // Box 919
		bodyModel[287] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 920
		bodyModel[288] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 921
		bodyModel[289] = new ModelRendererTurbo(this, 73, 377, textureX, textureY); // Box 922
		bodyModel[290] = new ModelRendererTurbo(this, 121, 377, textureX, textureY); // Box 923
		bodyModel[291] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 924
		bodyModel[292] = new ModelRendererTurbo(this, 185, 377, textureX, textureY); // Box 925
		bodyModel[293] = new ModelRendererTurbo(this, 209, 377, textureX, textureY); // Box 926
		bodyModel[294] = new ModelRendererTurbo(this, 257, 377, textureX, textureY); // Box 927
		bodyModel[295] = new ModelRendererTurbo(this, 305, 377, textureX, textureY); // Box 928
		bodyModel[296] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Box 929
		bodyModel[297] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 930
		bodyModel[298] = new ModelRendererTurbo(this, 425, 377, textureX, textureY); // Box 931
		bodyModel[299] = new ModelRendererTurbo(this, 449, 377, textureX, textureY); // Box 932
		bodyModel[300] = new ModelRendererTurbo(this, 489, 377, textureX, textureY); // Box 933
		bodyModel[301] = new ModelRendererTurbo(this, 513, 377, textureX, textureY); // Box 934
		bodyModel[302] = new ModelRendererTurbo(this, 577, 377, textureX, textureY); // Box 935
		bodyModel[303] = new ModelRendererTurbo(this, 601, 377, textureX, textureY); // Box 936
		bodyModel[304] = new ModelRendererTurbo(this, 185, 401, textureX, textureY); // turretring
		bodyModel[305] = new ModelRendererTurbo(this, 281, 377, textureX, textureY); // Box 779
		bodyModel[306] = new ModelRendererTurbo(this, 977, 377, textureX, textureY); // Box 780
		bodyModel[307] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 782
		bodyModel[308] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 783
		bodyModel[309] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 784
		bodyModel[310] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 785
		bodyModel[311] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 786
		bodyModel[312] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 787
		bodyModel[313] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 788
		bodyModel[314] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 789
		bodyModel[315] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 790
		bodyModel[316] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 791
		bodyModel[317] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 792
		bodyModel[318] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 793
		bodyModel[319] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 794
		bodyModel[320] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 795

		bodyModel[0].addShapeBox(0F, 0F, 0F, 19, 2, 40, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 0
		bodyModel[0].setRotationPoint(21F, -20.2F, -20F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 30, 2, 44, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 10.5F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10.5F, 0F); // Box 1
		bodyModel[1].setRotationPoint(40F, -20.2F, -22F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 11, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F); // Box 2
		bodyModel[2].setRotationPoint(59F, -8.2F, -22F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 119, 9, 44, 0F,4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-60F, -8.2F, -22F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 104, 10, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-64F, -18.2F, -22F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 74, 3, 44, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-64F, -21.2F, -22F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 10, 44, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-70F, -21.2F, -22F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 3, 44, 0F,0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[7].setRotationPoint(10F, -21.2F, -22F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 128, 2, 11, 0F,1F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 16
		bodyModel[8].setRotationPoint(-60F, -17F, -35F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0F, -3F, 2.5F, -1F, 0F, 2.5F, 0F, 0F, 2F, 0F, -3F, 2F, 0F, 2F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 2F, 2F); // Box 17
		bodyModel[9].setRotationPoint(-65F, -17F, -35F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,0F, 0F, 2.5F, 0F, -2F, 4.5F, 0F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, 4.5F, 0F, 2.5F, 4.5F, 0F, 2.5F, 2F, 0F, 0F, 2F); // Box 18
		bodyModel[10].setRotationPoint(68F, -17F, -35F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, 0F, 2.5F, 0F, -5F, 2.5F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0.5F, 2.5F, 0F, 6F, 2.5F, 0F, 6F, 2F, 0F, 0.5F, 2F); // Box 19
		bodyModel[11].setRotationPoint(75F, -15F, -37F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 128, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 1.4F, 0.5F, 0F, 1.4F, -1F, 0F, 1F, -1F, 0F); // Box 20
		bodyModel[12].setRotationPoint(-60F, -17F, -39.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -3.25F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 21
		bodyModel[13].setRotationPoint(-65F, -17F, -39.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 128, 2, 11, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2.5F, 1F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 22
		bodyModel[14].setRotationPoint(-60F, -17F, 24F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0F, -3F, 2F, 0F, 0F, 2F, -1F, 0F, 2.5F, 0F, -3F, 2.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 2F, 2.5F); // Box 23
		bodyModel[15].setRotationPoint(-65F, -17F, 24F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -3F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -3.25F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F); // Box 24
		bodyModel[16].setRotationPoint(-65F, -17F, 37.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 128, 2, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, 1.4F, -1F, 0F, 1.4F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 25
		bodyModel[17].setRotationPoint(-60F, -17F, 37.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,0F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, 4.5F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 2.5F, 2F, 0F, 2.5F, 4.5F, 0F, 0F, 4.5F); // Box 26
		bodyModel[18].setRotationPoint(68F, -17F, 24F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, 0F, 2F, 0F, -5F, 2F, 0F, -5F, 2.5F, 0F, 0F, 2.5F, 0F, 0.5F, 2F, 0F, 6F, 2F, 0F, 6F, 2.5F, 0F, 0.5F, 2.5F); // Box 27
		bodyModel[19].setRotationPoint(75F, -15F, 24F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 35, 3, 17, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 28
		bodyModel[20].setRotationPoint(-63.5F, -20F, -39F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 35, 1, 17, 0F,-1F, 0F, -1F, -1F, 1F, -1F, -1F, 1F, -0.25F, -1F, 0.25F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 29
		bodyModel[21].setRotationPoint(-63.5F, -21F, -39F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 25, 3, 17, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 30
		bodyModel[22].setRotationPoint(-28F, -20F, -39F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 25, 2, 17, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 31
		bodyModel[23].setRotationPoint(-28F, -22F, -39F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 35, 1, 17, 0F,-1F, 0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -0.25F, -1F, 0.25F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 33
		bodyModel[24].setRotationPoint(-1.5F, -21F, -39F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 23, 3, 17, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 34
		bodyModel[25].setRotationPoint(34F, -19F, -39F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 35, 3, 17, 0F,-1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 35
		bodyModel[26].setRotationPoint(-1.5F, -20F, -39F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 23, 1, 17, 0F,-1F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 37
		bodyModel[27].setRotationPoint(34F, -20F, -39F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 19, 0F,0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[28].setRotationPoint(56F, -19F, -39.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 21, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 39
		bodyModel[29].setRotationPoint(47F, -17F, -22F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 8, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 40
		bodyModel[30].setRotationPoint(68F, -17F, -22F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -1F, 0F); // Box 41
		bodyModel[31].setRotationPoint(75F, -13F, -22F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 2F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 42
		bodyModel[32].setRotationPoint(75F, -13F, 20F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 8, 2, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[33].setRotationPoint(68F, -17F, 20F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 21, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[34].setRotationPoint(47F, -17F, 20F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 23, 1, 17, 0F,-1F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 45
		bodyModel[35].setRotationPoint(34F, -20F, 22F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 23, 3, 17, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 46
		bodyModel[36].setRotationPoint(34F, -19F, 22F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 35, 3, 17, 0F,-1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 47
		bodyModel[37].setRotationPoint(-1.5F, -20F, 22F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 35, 1, 17, 0F,-1F, 0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -1F, -1F, 0.25F, -1F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 48
		bodyModel[38].setRotationPoint(-1.5F, -21F, 22F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 25, 3, 17, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 49
		bodyModel[39].setRotationPoint(-28F, -20F, 22F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 25, 2, 17, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 50
		bodyModel[40].setRotationPoint(-28F, -22F, 22F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 35, 3, 17, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 51
		bodyModel[41].setRotationPoint(-63.5F, -20F, 22F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 35, 1, 17, 0F,-1F, 0.25F, -0.25F, -1F, 1F, -0.25F, -1F, 1F, -1F, -1F, 0F, -1F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 52
		bodyModel[42].setRotationPoint(-63.5F, -21F, 22F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 19, 0F,0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 53
		bodyModel[43].setRotationPoint(56F, -19F, 20.5F);

		bodyModel[44].addShapeBox(-2.5F, -1F, -2F, 3, 3, 58, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 277
		bodyModel[44].setRotationPoint(-33F, -10.75F, -27.5F);

		bodyModel[45].addShapeBox(-2.5F, -1F, -2F, 3, 3, 58, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 278
		bodyModel[45].setRotationPoint(-12.5F, -10.75F, -27.5F);

		bodyModel[46].addShapeBox(-2.5F, -1F, -2F, 3, 3, 58, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 279
		bodyModel[46].setRotationPoint(4.25F, -10.75F, -27.5F);

		bodyModel[47].addShapeBox(-2.5F, -1F, -2F, 3, 3, 58, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 280
		bodyModel[47].setRotationPoint(23F, -10.75F, -27.5F);

		bodyModel[48].addShapeBox(-2.5F, -1F, -2F, 3, 3, 58, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 281
		bodyModel[48].setRotationPoint(42F, -10.75F, -27.5F);

		bodyModel[49].addShapeBox(-2.5F, -1F, -2F, 6, 6, 45, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 282
		bodyModel[49].setRotationPoint(38F, -2.75F, -20.5F);

		bodyModel[50].addShapeBox(-2.5F, -1F, -2F, 6, 6, 45, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 283
		bodyModel[50].setRotationPoint(18F, -2.75F, -20.5F);

		bodyModel[51].addShapeBox(-2.5F, -1F, -2F, 6, 6, 45, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 284
		bodyModel[51].setRotationPoint(1.25F, -2.75F, -20.5F);

		bodyModel[52].addShapeBox(-2.5F, -1F, -2F, 6, 6, 45, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 285
		bodyModel[52].setRotationPoint(-17.5F, -2.75F, -20.5F);

		bodyModel[53].addShapeBox(-2.5F, -1F, -2F, 6, 6, 45, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 286
		bodyModel[53].setRotationPoint(-37F, -2.75F, -20.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 3F, -1F, 0F); // Box 315
		bodyModel[54].setRotationPoint(-62F, -14.75F, 39F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 28, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[55].setRotationPoint(-49.8F, -14.75F, 39F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 28, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[56].setRotationPoint(-21.6F, -14.75F, 39F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 28, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[57].setRotationPoint(6.6F, -14.75F, 39F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 35, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[58].setRotationPoint(34.8F, -14.75F, 39F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 320
		bodyModel[59].setRotationPoint(-50.4F, -11F, 39.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 321
		bodyModel[60].setRotationPoint(-22.2F, -11F, 39.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 322
		bodyModel[61].setRotationPoint(6F, -11F, 39.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 323
		bodyModel[62].setRotationPoint(34.2F, -11F, 39.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 324
		bodyModel[63].setRotationPoint(68.2F, -9F, 39.25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, -0.1F, 0F, -5F, -0.1F, 0F, -5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.25F, -0.1F, 0F, -1.25F, -0.1F, 0F, 0F, -0.1F); // Box 325
		bodyModel[64].setRotationPoint(74.8F, -14.75F, 39F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 326
		bodyModel[65].setRotationPoint(69.8F, -14.75F, 39F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, -0.1F, 0F, -5F, -0.1F, 0F, -5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.25F, -0.1F, 0F, -1.25F, -0.1F, 0F, 0F, -0.1F); // Box 327
		bodyModel[66].setRotationPoint(74.8F, -14.75F, -40F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 328
		bodyModel[67].setRotationPoint(69.8F, -14.75F, -40F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 329
		bodyModel[68].setRotationPoint(68.2F, -9F, -40.2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 35, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[69].setRotationPoint(34.8F, -14.75F, -40F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 331
		bodyModel[70].setRotationPoint(34.2F, -11F, -40.2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 28, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[71].setRotationPoint(6.6F, -14.75F, -40F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 333
		bodyModel[72].setRotationPoint(6F, -11F, -40.2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 28, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[73].setRotationPoint(-21.6F, -14.75F, -40F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 335
		bodyModel[74].setRotationPoint(-22.2F, -11F, -40.2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 28, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[75].setRotationPoint(-49.8F, -14.75F, -40F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 337
		bodyModel[76].setRotationPoint(-50.4F, -11F, -40.2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 3F, -1F, 0F); // Box 338
		bodyModel[77].setRotationPoint(-62F, -14.75F, -40F);

		bodyModel[78].addShapeBox(-5F, -2F, 1F, 5, 2, 9, 0F,0F, -3.5F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 2.5F, 0F, -3.5F, 2.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 2F, 2.5F); // Box 339
		bodyModel[78].setRotationPoint(-64F, -14F, 24.5F);
		bodyModel[78].rotateAngleZ = 0.48869219F;

		bodyModel[79].addShapeBox(-5F, -2F, 1F, 5, 2, 9, 0F,0F, -3.5F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 2.5F, 0F, -3.5F, 2.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 2F, 2.5F); // Box 340
		bodyModel[79].setRotationPoint(-64F, -14F, -36F);
		bodyModel[79].rotateAngleZ = 0.48869219F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[80].setRotationPoint(-26F, -22.35F, -35F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[81].setRotationPoint(-25F, -22.5F, -35.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[82].setRotationPoint(-20.4F, -22.5F, -35.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[83].setRotationPoint(-15.8F, -22.5F, -35.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[84].setRotationPoint(-11F, -22.5F, -35.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[85].setRotationPoint(-11F, -22.25F, -31.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[86].setRotationPoint(-15.8F, -22.25F, -31.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[87].setRotationPoint(-20.4F, -22.25F, -31.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[88].setRotationPoint(-25F, -22.25F, -31.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[89].setRotationPoint(4F, -21.25F, -31.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[90].setRotationPoint(8.6F, -21.25F, -31.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[91].setRotationPoint(13.2F, -21.25F, -31.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[92].setRotationPoint(18F, -21.25F, -31.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[93].setRotationPoint(3F, -21.35F, -35F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[94].setRotationPoint(18F, -21.5F, -35.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[95].setRotationPoint(13.2F, -21.5F, -35.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[96].setRotationPoint(8.6F, -21.5F, -35.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[97].setRotationPoint(4F, -21.5F, -35.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[98].setRotationPoint(28F, -21.25F, -35.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[99].setRotationPoint(22.2F, -21.25F, -35.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[100].setRotationPoint(36F, -20.35F, -35F);
		bodyModel[100].rotateAngleZ = -0.00872665F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[101].setRotationPoint(37F, -20.5F, -35.5F);
		bodyModel[101].rotateAngleZ = -0.00872665F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[102].setRotationPoint(41.6F, -20.5F, -35.5F);
		bodyModel[102].rotateAngleZ = -0.00872665F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[103].setRotationPoint(46.2F, -20.45F, -35.5F);
		bodyModel[103].rotateAngleZ = -0.00872665F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[104].setRotationPoint(51F, -20.4F, -35.5F);
		bodyModel[104].rotateAngleZ = -0.00872665F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[105].setRotationPoint(37F, -20.25F, -31.5F);
		bodyModel[105].rotateAngleZ = -0.00872665F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[106].setRotationPoint(41.6F, -20.25F, -31.5F);
		bodyModel[106].rotateAngleZ = -0.00872665F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[107].setRotationPoint(46.2F, -20.2F, -31.5F);
		bodyModel[107].rotateAngleZ = -0.00872665F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[108].setRotationPoint(51F, -20.1F, -31.5F);
		bodyModel[108].rotateAngleZ = -0.00872665F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[109].setRotationPoint(36F, -20.35F, 29F);
		bodyModel[109].rotateAngleZ = -0.00872665F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[110].setRotationPoint(37F, -20.25F, 28.5F);
		bodyModel[110].rotateAngleZ = -0.00872665F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[111].setRotationPoint(41.6F, -20.25F, 28.5F);
		bodyModel[111].rotateAngleZ = -0.00872665F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[112].setRotationPoint(46.2F, -20.2F, 28.5F);
		bodyModel[112].rotateAngleZ = -0.00872665F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[113].setRotationPoint(51F, -20.1F, 28.5F);
		bodyModel[113].rotateAngleZ = -0.00872665F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[114].setRotationPoint(51F, -20.4F, 32.5F);
		bodyModel[114].rotateAngleZ = -0.00872665F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[115].setRotationPoint(46.2F, -20.45F, 32.5F);
		bodyModel[115].rotateAngleZ = -0.00872665F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[116].setRotationPoint(41.6F, -20.5F, 32.5F);
		bodyModel[116].rotateAngleZ = -0.00872665F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[117].setRotationPoint(37F, -20.5F, 32.5F);
		bodyModel[117].rotateAngleZ = -0.00872665F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[118].setRotationPoint(3F, -21.35F, 29F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[119].setRotationPoint(4F, -21.5F, 32.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[120].setRotationPoint(8.6F, -21.5F, 32.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[121].setRotationPoint(13.2F, -21.5F, 32.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[122].setRotationPoint(18F, -21.5F, 32.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[123].setRotationPoint(18F, -21.25F, 28.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[124].setRotationPoint(13.2F, -21.25F, 28.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[125].setRotationPoint(8.6F, -21.25F, 28.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[126].setRotationPoint(4F, -21.25F, 28.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[127].setRotationPoint(-26F, -22.35F, 29F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[128].setRotationPoint(-11F, -22.25F, 28.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[129].setRotationPoint(-15.8F, -22.25F, 28.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[130].setRotationPoint(-20.4F, -22.25F, 28.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[131].setRotationPoint(-25F, -22.25F, 28.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[132].setRotationPoint(-25F, -22.5F, 32.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[133].setRotationPoint(-20.4F, -22.5F, 32.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[134].setRotationPoint(-15.8F, -22.5F, 32.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[135].setRotationPoint(-11F, -22.5F, 32.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[136].setRotationPoint(32.3F, -20.8F, -3.45F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[137].setRotationPoint(32.3F, -20.8F, -6.45F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 115
		bodyModel[138].setRotationPoint(32.3F, -20.8F, 4.55F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F); // Box 111
		bodyModel[139].setRotationPoint(42.3F, -20.95F, -2.45F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 112
		bodyModel[140].setRotationPoint(42.4F, -20.75F, -2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F); // Box 402
		bodyModel[141].setRotationPoint(39.8F, -20.95F, -7.95F);
		bodyModel[141].rotateAngleY = -0.45378561F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 403
		bodyModel[142].setRotationPoint(40.2F, -20.75F, -7.5F);
		bodyModel[142].rotateAngleY = -0.45378561F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 404
		bodyModel[143].setRotationPoint(41.9F, -20.75F, 5F);
		bodyModel[143].rotateAngleY = 0.45378561F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F); // Box 405
		bodyModel[144].setRotationPoint(42F, -20.95F, 4.55F);
		bodyModel[144].rotateAngleY = 0.45378561F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 10, 6, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[145].setRotationPoint(58F, -4.5F, -21.5F);
		bodyModel[145].rotateAngleZ = 0.20943951F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 690
		bodyModel[146].setRotationPoint(58F, -4.5F, -21.5F);
		bodyModel[146].rotateAngleZ = 0.20943951F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 691
		bodyModel[147].setRotationPoint(58F, -4.5F, -13.5F);
		bodyModel[147].rotateAngleZ = 0.20943951F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 692
		bodyModel[148].setRotationPoint(58F, -4.5F, -6.5F);
		bodyModel[148].rotateAngleZ = 0.20943951F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 693
		bodyModel[149].setRotationPoint(58F, -4.5F, 5.5F);
		bodyModel[149].rotateAngleZ = 0.20943951F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 694
		bodyModel[150].setRotationPoint(58F, -4.5F, 12.5F);
		bodyModel[150].rotateAngleZ = 0.20943951F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 695
		bodyModel[151].setRotationPoint(58F, -4.5F, 18.5F);
		bodyModel[151].rotateAngleZ = 0.20943951F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 696
		bodyModel[152].setRotationPoint(48.35F, -4.15F, -6.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 697
		bodyModel[153].setRotationPoint(48.35F, -4.15F, -13.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 698
		bodyModel[154].setRotationPoint(48.35F, -4.15F, -21.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 699
		bodyModel[155].setRotationPoint(48.35F, -4.15F, 5.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 700
		bodyModel[156].setRotationPoint(48.35F, -4.15F, 12.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 701
		bodyModel[157].setRotationPoint(48.35F, -4.15F, 18.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 121
		bodyModel[158].setRotationPoint(62.2F, -15.4F, 16.15F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 122
		bodyModel[159].setRotationPoint(62.2F, -16.4F, 16.15F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 123
		bodyModel[160].setRotationPoint(62.2F, -14.4F, 16.15F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 352
		bodyModel[161].setRotationPoint(61.3F, -15.9F, -18.4F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 353
		bodyModel[162].setRotationPoint(62.2F, -14.4F, -16.85F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 354
		bodyModel[163].setRotationPoint(62.2F, -15.4F, -16.85F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 355
		bodyModel[164].setRotationPoint(62.2F, -16.4F, -16.85F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 595
		bodyModel[165].setRotationPoint(61.2F, -12F, -17.85F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 596
		bodyModel[166].setRotationPoint(61.2F, -12F, 15.15F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 598
		bodyModel[167].setRotationPoint(61.3F, -15.9F, -15.3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 637
		bodyModel[168].setRotationPoint(63.3F, -15.9F, -18.4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 638
		bodyModel[169].setRotationPoint(63.3F, -15.9F, -15.3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 639
		bodyModel[170].setRotationPoint(61.3F, -16.9F, -15.3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 640
		bodyModel[171].setRotationPoint(61.3F, -16.9F, -18.4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 641
		bodyModel[172].setRotationPoint(63.3F, -16.9F, -18.4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 642
		bodyModel[173].setRotationPoint(63.3F, -16.9F, -15.3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.3F, -0.25F, -0.4F, 0.3F); // Box 643
		bodyModel[174].setRotationPoint(63.3F, -17.15F, -17F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.3F, -0.25F, -0.4F, 0.3F); // Box 644
		bodyModel[175].setRotationPoint(61.3F, -17.15F, -17F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 645
		bodyModel[176].setRotationPoint(61.8F, -15.9F, -15.3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 646
		bodyModel[177].setRotationPoint(61.8F, -15.9F, -18.4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 647
		bodyModel[178].setRotationPoint(61.8F, -17.15F, -17.4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 648
		bodyModel[179].setRotationPoint(61.8F, -17.15F, -16.3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 649
		bodyModel[180].setRotationPoint(61.8F, -17.15F, 16.7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 650
		bodyModel[181].setRotationPoint(61.3F, -16.9F, 17.7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.3F, -0.25F, -0.4F, 0.3F); // Box 651
		bodyModel[182].setRotationPoint(61.3F, -17.15F, 16F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 652
		bodyModel[183].setRotationPoint(61.3F, -16.9F, 14.6F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 653
		bodyModel[184].setRotationPoint(61.3F, -15.9F, 14.6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 654
		bodyModel[185].setRotationPoint(61.3F, -15.9F, 17.7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 655
		bodyModel[186].setRotationPoint(61.8F, -17.15F, 15.6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.3F, -0.25F, -0.4F, 0.3F); // Box 656
		bodyModel[187].setRotationPoint(63.3F, -17.15F, 16F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 657
		bodyModel[188].setRotationPoint(63.3F, -16.9F, 14.6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 658
		bodyModel[189].setRotationPoint(63.3F, -16.9F, 17.7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 659
		bodyModel[190].setRotationPoint(63.3F, -15.9F, 17.7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 660
		bodyModel[191].setRotationPoint(63.3F, -15.9F, 14.6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 661
		bodyModel[192].setRotationPoint(61.8F, -15.9F, 14.6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 662
		bodyModel[193].setRotationPoint(61.8F, -15.9F, 17.7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 599
		bodyModel[194].setRotationPoint(66.2F, -10F, -13.85F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 600
		bodyModel[195].setRotationPoint(66.2F, -10F, 12.15F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 687
		bodyModel[196].setRotationPoint(66.2F, -11F, 12.15F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		bodyModel[197].setRotationPoint(66.2F, -11F, -13.85F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,-0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[198].setRotationPoint(-65.4F, -5.85F, -22.3F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.35F, 0.4F, 0F); // Box 141
		bodyModel[199].setRotationPoint(-65.4F, -3.85F, -22.3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 13, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F); // Box 142
		bodyModel[200].setRotationPoint(-65.05F, -1.45F, -22.3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.6F, 0F, 0F); // Box 143
		bodyModel[201].setRotationPoint(-63.7F, 0.55F, -22.3F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -2.2F, -0.1F, 0F); // Box 144
		bodyModel[202].setRotationPoint(-62.7F, 1.55F, -22.3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -2.2F, -0.1F, 0F); // Box 495
		bodyModel[203].setRotationPoint(-62.7F, 1.55F, 12F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.6F, 0F, 0F); // Box 496
		bodyModel[204].setRotationPoint(-63.7F, 0.55F, 12F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 13, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F); // Box 497
		bodyModel[205].setRotationPoint(-65.05F, -1.45F, 12F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.35F, 0.4F, 0F); // Box 498
		bodyModel[206].setRotationPoint(-65.4F, -3.85F, 12F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,-0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[207].setRotationPoint(-65.4F, -5.85F, 12F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 7, 6, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[208].setRotationPoint(-76.5F, -19.2F, -17F);
		bodyModel[208].rotateAngleZ = 0.19198622F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 7, 4, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[209].setRotationPoint(-76.5F, -17.2F, -18F);
		bodyModel[209].rotateAngleZ = 0.19198622F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[210].setRotationPoint(-70.5F, -20.2F, -21F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[211].setRotationPoint(-70.5F, -20.2F, 12F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,-1F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 507
		bodyModel[212].setRotationPoint(-69.5F, -22F, -21F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,-1F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[213].setRotationPoint(-69.5F, -22F, 12.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 11, 3, 20, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		bodyModel[214].setRotationPoint(-41F, -22.2F, -21F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 11, 3, 20, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[215].setRotationPoint(-41F, -22.2F, 1F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 3, 40, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 511
		bodyModel[216].setRotationPoint(-43.75F, -22.5F, -20F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 512
		bodyModel[217].setRotationPoint(-45F, -22F, -18.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 513
		bodyModel[218].setRotationPoint(-45F, -22F, -11.25F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 514
		bodyModel[219].setRotationPoint(-45F, -22F, -4.25F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 515
		bodyModel[220].setRotationPoint(-45F, -22F, 3.25F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 516
		bodyModel[221].setRotationPoint(-45F, -22F, 10.25F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 517
		bodyModel[222].setRotationPoint(-45F, -22F, 17.75F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[223].setRotationPoint(-27.75F, -22F, -13.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 8, 1, 30, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 1.25F, 0F, 6.5F, 2.25F, 0F, 6.5F, 2.25F, 0F, 6.5F, 1.25F, 0F, 6.5F); // Box 520
		bodyModel[224].setRotationPoint(-54.75F, -22.25F, -15F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 2.25F, 0F, 4.5F, 1.25F, 0F, 6.5F, 1.25F, 0F, 6.5F, 2.25F, 0F, 4.5F); // Box 521
		bodyModel[225].setRotationPoint(-60.25F, -22.25F, -10F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[226].setRotationPoint(-69F, -20.5F, -32.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[227].setRotationPoint(-68F, -20.5F, -32.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[228].setRotationPoint(-68F, -20.5F, -23.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[229].setRotationPoint(-68F, -20.5F, 22.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[230].setRotationPoint(-68F, -20.5F, 23.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		bodyModel[231].setRotationPoint(-69F, -20.5F, 22.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[232].setRotationPoint(-69F, -16.5F, 24F);
		bodyModel[232].rotateAngleZ = 1.04719755F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		bodyModel[233].setRotationPoint(-69F, -16.5F, 27F);
		bodyModel[233].rotateAngleZ = 1.04719755F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		bodyModel[234].setRotationPoint(-69F, -16.5F, 30.5F);
		bodyModel[234].rotateAngleZ = 1.04719755F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[235].setRotationPoint(-69F, -16.5F, -26F);
		bodyModel[235].rotateAngleZ = 1.04719755F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[236].setRotationPoint(-69F, -16.5F, -29.5F);
		bodyModel[236].rotateAngleZ = 1.04719755F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[237].setRotationPoint(-69F, -16.5F, -32.5F);
		bodyModel[237].rotateAngleZ = 1.04719755F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[238].setRotationPoint(-71F, -20.2F, 17F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		bodyModel[239].setRotationPoint(-71F, -20.2F, -18F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[240].setRotationPoint(-71F, -17.2F, -13.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[241].setRotationPoint(-71F, -17.2F, 12.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, -7F, -1F, 2F, 7F, -1F, 2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -7F, 1F, 2F, 7F, 1F, 2F); // Box 558
		bodyModel[242].setRotationPoint(77F, -10F, -18.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,7F, -1F, 2F, -7F, -1F, 2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 7F, 1F, 2F, -7F, 1F, 2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 559
		bodyModel[243].setRotationPoint(77F, -10F, 9.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, -0.5F, -5.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[244].setRotationPoint(70F, -9F, 7.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 561
		bodyModel[245].setRotationPoint(70F, -9F, -18.5F);

		bodyModel[246].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 562
		bodyModel[246].setRotationPoint(-43F, 1F, -24F);
		bodyModel[246].rotateAngleZ = 0.29670597F;

		bodyModel[247].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 563
		bodyModel[247].setRotationPoint(-23F, 1F, -24F);
		bodyModel[247].rotateAngleZ = 0.29670597F;

		bodyModel[248].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 564
		bodyModel[248].setRotationPoint(-3F, 1F, -24F);
		bodyModel[248].rotateAngleZ = 0.29670597F;

		bodyModel[249].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 565
		bodyModel[249].setRotationPoint(13F, 1F, -24F);
		bodyModel[249].rotateAngleZ = 0.29670597F;

		bodyModel[250].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 566
		bodyModel[250].setRotationPoint(33F, 1F, -24F);
		bodyModel[250].rotateAngleZ = 0.29670597F;

		bodyModel[251].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 567
		bodyModel[251].setRotationPoint(50F, 1F, -24F);
		bodyModel[251].rotateAngleZ = 0.29670597F;

		bodyModel[252].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 568
		bodyModel[252].setRotationPoint(-43F, 1F, 27F);
		bodyModel[252].rotateAngleZ = 0.29670597F;

		bodyModel[253].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 569
		bodyModel[253].setRotationPoint(-23F, 1F, 27F);
		bodyModel[253].rotateAngleZ = 0.29670597F;

		bodyModel[254].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 570
		bodyModel[254].setRotationPoint(-3F, 1F, 27F);
		bodyModel[254].rotateAngleZ = 0.29670597F;

		bodyModel[255].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 571
		bodyModel[255].setRotationPoint(13F, 1F, 27F);
		bodyModel[255].rotateAngleZ = 0.29670597F;

		bodyModel[256].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 572
		bodyModel[256].setRotationPoint(33F, 1F, 27F);
		bodyModel[256].rotateAngleZ = 0.29670597F;

		bodyModel[257].addShapeBox(-2.5F, -1F, -2F, 10, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 573
		bodyModel[257].setRotationPoint(50F, 1F, 27F);
		bodyModel[257].rotateAngleZ = 0.29670597F;

		bodyModel[258].addShapeBox(-2.5F, -1F, -8.5F, 5, 2, 51, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 574
		bodyModel[258].setRotationPoint(-57.5F, -5F, -17.8F);

		bodyModel[259].addShapeBox(-2.5F, -2.45F, -8.5F, 5, 2, 51, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 575
		bodyModel[259].setRotationPoint(-57.5F, -5F, -17.8F);

		bodyModel[260].addShapeBox(-2.5F, 0.45F, -8.5F, 5, 2, 51, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 576
		bodyModel[260].setRotationPoint(-57.5F, -5F, -17.8F);

		bodyModel[261].addShapeBox(-2.5F, -1F, -8.5F, 5, 2, 54, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 577
		bodyModel[261].setRotationPoint(66.25F, -7.5F, -17.8F);

		bodyModel[262].addShapeBox(-2.5F, -2.45F, -8.5F, 5, 2, 54, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 578
		bodyModel[262].setRotationPoint(66.25F, -7.5F, -17.8F);

		bodyModel[263].addShapeBox(-2.5F, 0.45F, -8.5F, 5, 2, 54, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 579
		bodyModel[263].setRotationPoint(66.25F, -7.5F, -17.8F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 897
		bodyModel[264].setRotationPoint(61.25F, -14.2F, -8.2F);
		bodyModel[264].rotateAngleZ = -0.36651914F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
		bodyModel[265].setRotationPoint(61.25F, -14.2F, -5F);
		bodyModel[265].rotateAngleZ = -0.36651914F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 899
		bodyModel[266].setRotationPoint(61.25F, -14.2F, 1.4F);
		bodyModel[266].rotateAngleZ = -0.36651914F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		bodyModel[267].setRotationPoint(61.25F, -14.2F, -1.8F);
		bodyModel[267].rotateAngleZ = -0.36651914F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 901
		bodyModel[268].setRotationPoint(61.25F, -14.2F, 4.6F);
		bodyModel[268].rotateAngleZ = -0.36651914F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 902
		bodyModel[269].setRotationPoint(56.25F, -16F, 4.6F);
		bodyModel[269].rotateAngleZ = -0.36651914F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 903
		bodyModel[270].setRotationPoint(56.25F, -16F, -5F);
		bodyModel[270].rotateAngleZ = -0.36651914F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		bodyModel[271].setRotationPoint(56.25F, -16F, -8.2F);
		bodyModel[271].rotateAngleZ = -0.36651914F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 905
		bodyModel[272].setRotationPoint(56.25F, -16F, -1.8F);
		bodyModel[272].rotateAngleZ = -0.36651914F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 906
		bodyModel[273].setRotationPoint(56.25F, -16F, 1.4F);
		bodyModel[273].rotateAngleZ = -0.36651914F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 907
		bodyModel[274].setRotationPoint(56.25F, -16F, 11F);
		bodyModel[274].rotateAngleZ = -0.36651914F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		bodyModel[275].setRotationPoint(56.25F, -16F, 7.8F);
		bodyModel[275].rotateAngleZ = -0.36651914F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		bodyModel[276].setRotationPoint(56.25F, -16F, 14.2F);
		bodyModel[276].rotateAngleZ = -0.36651914F;

		bodyModel[277].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		bodyModel[277].setRotationPoint(56.25F, -16F, -11.4F);
		bodyModel[277].rotateAngleZ = -0.36651914F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		bodyModel[278].setRotationPoint(56.25F, -16F, -14.6F);
		bodyModel[278].rotateAngleZ = -0.36651914F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 912
		bodyModel[279].setRotationPoint(56.25F, -16F, -17.8F);
		bodyModel[279].rotateAngleZ = -0.36651914F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 913
		bodyModel[280].setRotationPoint(51.25F, -17.8F, 14.2F);
		bodyModel[280].rotateAngleZ = -0.36651914F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 914
		bodyModel[281].setRotationPoint(51.25F, -17.8F, 7.8F);
		bodyModel[281].rotateAngleZ = -0.36651914F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 915
		bodyModel[282].setRotationPoint(51.25F, -17.8F, 11F);
		bodyModel[282].rotateAngleZ = -0.36651914F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 916
		bodyModel[283].setRotationPoint(51.25F, -17.8F, 4.6F);
		bodyModel[283].rotateAngleZ = -0.36651914F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917
		bodyModel[284].setRotationPoint(51.25F, -17.8F, 1.4F);
		bodyModel[284].rotateAngleZ = -0.36651914F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 918
		bodyModel[285].setRotationPoint(51.25F, -17.8F, -1.8F);
		bodyModel[285].rotateAngleZ = -0.36651914F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 919
		bodyModel[286].setRotationPoint(51.25F, -17.8F, -5F);
		bodyModel[286].rotateAngleZ = -0.36651914F;

		bodyModel[287].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 920
		bodyModel[287].setRotationPoint(51.25F, -17.8F, -8.2F);
		bodyModel[287].rotateAngleZ = -0.36651914F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
		bodyModel[288].setRotationPoint(51.25F, -17.8F, -11.4F);
		bodyModel[288].rotateAngleZ = -0.36651914F;

		bodyModel[289].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
		bodyModel[289].setRotationPoint(51.25F, -17.8F, -14.6F);
		bodyModel[289].rotateAngleZ = -0.36651914F;

		bodyModel[290].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 923
		bodyModel[290].setRotationPoint(51.25F, -17.8F, -17.8F);
		bodyModel[290].rotateAngleZ = -0.36651914F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
		bodyModel[291].setRotationPoint(46.35F, -19.6F, 14.2F);
		bodyModel[291].rotateAngleZ = -0.36651914F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 925
		bodyModel[292].setRotationPoint(46.35F, -19.6F, 7.8F);
		bodyModel[292].rotateAngleZ = -0.36651914F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 926
		bodyModel[293].setRotationPoint(46.35F, -19.6F, 11F);
		bodyModel[293].rotateAngleZ = -0.36651914F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
		bodyModel[294].setRotationPoint(46.35F, -19.6F, 4.6F);
		bodyModel[294].rotateAngleZ = -0.36651914F;

		bodyModel[295].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		bodyModel[295].setRotationPoint(46.35F, -19.6F, 1.4F);
		bodyModel[295].rotateAngleZ = -0.36651914F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 929
		bodyModel[296].setRotationPoint(46.35F, -19.6F, -1.8F);
		bodyModel[296].rotateAngleZ = -0.36651914F;

		bodyModel[297].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 930
		bodyModel[297].setRotationPoint(46.35F, -19.6F, -5F);
		bodyModel[297].rotateAngleZ = -0.36651914F;

		bodyModel[298].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 931
		bodyModel[298].setRotationPoint(46.35F, -19.6F, -8.2F);
		bodyModel[298].rotateAngleZ = -0.36651914F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 932
		bodyModel[299].setRotationPoint(46.35F, -19.6F, -11.4F);
		bodyModel[299].rotateAngleZ = -0.36651914F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 933
		bodyModel[300].setRotationPoint(46.35F, -19.6F, -14.6F);
		bodyModel[300].rotateAngleZ = -0.36651914F;

		bodyModel[301].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 934
		bodyModel[301].setRotationPoint(46.35F, -19.6F, -17.8F);
		bodyModel[301].rotateAngleZ = -0.36651914F;

		bodyModel[302].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 935
		bodyModel[302].setRotationPoint(46.35F, -19.6F, 17.4F);
		bodyModel[302].rotateAngleZ = -0.36651914F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 936
		bodyModel[303].setRotationPoint(46.35F, -19.6F, -21F);
		bodyModel[303].rotateAngleZ = -0.36651914F;

		bodyModel[304].addBox(0F, 0F, 0F, 30, 5, 30, 0F); // turretring
		bodyModel[304].setRotationPoint(-15F, -23F, -15F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 12, 21, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 779
		bodyModel[305].setRotationPoint(68F, -6.5F, 0.2F);
		bodyModel[305].rotateAngleZ = -0.31415927F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 12, 21, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 780
		bodyModel[306].setRotationPoint(68F, -6.5F, -21.2F);
		bodyModel[306].rotateAngleZ = -0.31415927F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 100, 15, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 782
		bodyModel[307].setRotationPoint(-45.8F, -9.75F, -44F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 13, 15, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -8F, -0.3F, 0F, -8F, -0.3F, 0F, 0F, -0.3F); // Box 783
		bodyModel[308].setRotationPoint(54.2F, -9.75F, -44F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 20, 15, 1, 0F,0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.9F, -13.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.9F, -13.5F, -0.3F); // Box 784
		bodyModel[309].setRotationPoint(-65.8F, -9.75F, -44F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 100, 15, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 785
		bodyModel[310].setRotationPoint(-45.8F, -9.75F, 43F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 13, 15, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -8F, -0.3F, 0F, -8F, -0.3F, 0F, 0F, -0.3F); // Box 786
		bodyModel[311].setRotationPoint(54.2F, -9.75F, 43F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 20, 15, 1, 0F,0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.9F, -13.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.9F, -13.5F, -0.3F); // Box 787
		bodyModel[312].setRotationPoint(-65.8F, -9.75F, 43F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 56, 12, 6, 0F,-3F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		bodyModel[313].setRotationPoint(-65.8F, -21.75F, -44F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 77, 12, 6, 0F,0F, -1F, -2F, 0F, -6F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		bodyModel[314].setRotationPoint(-9.8F, -21.75F, -44F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 56, 12, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -3F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 790
		bodyModel[315].setRotationPoint(-65.8F, -21.75F, 38F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 77, 12, 6, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		bodyModel[316].setRotationPoint(-9.8F, -21.75F, 38F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, -1.2F, 0F, 0F, -3.9F, 0F, 0F, -1.9F, -2.5F, -1F, 0F, -0.5F, 0F, 2F, 0.1F, 0F, 2F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 792
		bodyModel[317].setRotationPoint(67F, -17F, -43F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 8, 12, 6, 0F,0F, 0F, 0.1F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0F, 3F, -4F, -3F, 0F, 0F, -6F); // Box 793
		bodyModel[318].setRotationPoint(67F, -15F, -43F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-1F, 0F, -0.5F, 0F, -1.9F, -2.5F, 0F, -3.9F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 2F, 0F, 0F, 2F, 0.1F); // Box 794
		bodyModel[319].setRotationPoint(67F, -17F, 37F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 8, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0.1F, 0F, 0F, -6F, 3F, -4F, -3F, 0F, -4F, 0F, 0F, 0F, 0.5F); // Box 795
		bodyModel[320].setRotationPoint(67F, -15F, 37F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 585, 313, textureX, textureY); // Box 578
		turretModel[1] = new ModelRendererTurbo(this, 593, 377, textureX, textureY); // Box 579
		turretModel[2] = new ModelRendererTurbo(this, 497, 329, textureX, textureY); // Box 580
		turretModel[3] = new ModelRendererTurbo(this, 729, 377, textureX, textureY); // Box 581
		turretModel[4] = new ModelRendererTurbo(this, 257, 297, textureX, textureY); // Box 582
		turretModel[5] = new ModelRendererTurbo(this, 865, 377, textureX, textureY); // Box 623
		turretModel[6] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 624
		turretModel[7] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 625
		turretModel[8] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 626
		turretModel[9] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Box 627
		turretModel[10] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 628
		turretModel[11] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Box 629
		turretModel[12] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 630
		turretModel[13] = new ModelRendererTurbo(this, 801, 209, textureX, textureY); // Box 631
		turretModel[14] = new ModelRendererTurbo(this, 801, 217, textureX, textureY); // Box 632
		turretModel[15] = new ModelRendererTurbo(this, 801, 225, textureX, textureY); // Box 633
		turretModel[16] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 634
		turretModel[17] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Box 635
		turretModel[18] = new ModelRendererTurbo(this, 817, 209, textureX, textureY); // Box 636
		turretModel[19] = new ModelRendererTurbo(this, 801, 233, textureX, textureY); // Box 637
		turretModel[20] = new ModelRendererTurbo(this, 809, 249, textureX, textureY); // Box 638
		turretModel[21] = new ModelRendererTurbo(this, 617, 257, textureX, textureY); // Box 639
		turretModel[22] = new ModelRendererTurbo(this, 657, 257, textureX, textureY); // Box 640
		turretModel[23] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 641
		turretModel[24] = new ModelRendererTurbo(this, 857, 297, textureX, textureY); // Box 239
		turretModel[25] = new ModelRendererTurbo(this, 913, 273, textureX, textureY); // Box 243
		turretModel[26] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 244
		turretModel[27] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 245
		turretModel[28] = new ModelRendererTurbo(this, 705, 169, textureX, textureY); // Box 246
		turretModel[29] = new ModelRendererTurbo(this, 113, 305, textureX, textureY); // Box 708
		turretModel[30] = new ModelRendererTurbo(this, 169, 305, textureX, textureY); // Box 709
		turretModel[31] = new ModelRendererTurbo(this, 721, 313, textureX, textureY); // Box 710
		turretModel[32] = new ModelRendererTurbo(this, 529, 313, textureX, textureY); // Box 711
		turretModel[33] = new ModelRendererTurbo(this, 569, 313, textureX, textureY); // Box 713
		turretModel[34] = new ModelRendererTurbo(this, 657, 313, textureX, textureY); // Box 714
		turretModel[35] = new ModelRendererTurbo(this, 913, 289, textureX, textureY); // Box 716
		turretModel[36] = new ModelRendererTurbo(this, 817, 313, textureX, textureY); // Box 718
		turretModel[37] = new ModelRendererTurbo(this, 913, 305, textureX, textureY); // Box 719
		turretModel[38] = new ModelRendererTurbo(this, 753, 313, textureX, textureY); // Box 720
		turretModel[39] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 722
		turretModel[40] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 723
		turretModel[41] = new ModelRendererTurbo(this, 233, 321, textureX, textureY); // Box 769
		turretModel[42] = new ModelRendererTurbo(this, 1001, 345, textureX, textureY); // Box 867
		turretModel[43] = new ModelRendererTurbo(this, 769, 185, textureX, textureY); // Box 868
		turretModel[44] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 869
		turretModel[45] = new ModelRendererTurbo(this, 1009, 201, textureX, textureY); // Box 870
		turretModel[46] = new ModelRendererTurbo(this, 913, 289, textureX, textureY); // Box 664
		turretModel[47] = new ModelRendererTurbo(this, 913, 289, textureX, textureY); // Box 665
		turretModel[48] = new ModelRendererTurbo(this, 17, 361, textureX, textureY); // Box 666
		turretModel[49] = new ModelRendererTurbo(this, 425, 313, textureX, textureY); // Box 667
		turretModel[50] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 668
		turretModel[51] = new ModelRendererTurbo(this, 201, 361, textureX, textureY); // Box 669
		turretModel[52] = new ModelRendererTurbo(this, 865, 313, textureX, textureY); // Box 670
		turretModel[53] = new ModelRendererTurbo(this, 369, 313, textureX, textureY); // Box 671
		turretModel[54] = new ModelRendererTurbo(this, 289, 297, textureX, textureY); // Box 672
		turretModel[55] = new ModelRendererTurbo(this, 993, 265, textureX, textureY); // Box 673
		turretModel[56] = new ModelRendererTurbo(this, 961, 305, textureX, textureY); // Box 674
		turretModel[57] = new ModelRendererTurbo(this, 617, 281, textureX, textureY); // Box 675
		turretModel[58] = new ModelRendererTurbo(this, 233, 297, textureX, textureY); // Box 676
		turretModel[59] = new ModelRendererTurbo(this, 945, 321, textureX, textureY); // Box 677
		turretModel[60] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 678
		turretModel[61] = new ModelRendererTurbo(this, 529, 297, textureX, textureY); // Box 679
		turretModel[62] = new ModelRendererTurbo(this, 313, 377, textureX, textureY); // Box 680
		turretModel[63] = new ModelRendererTurbo(this, 265, 329, textureX, textureY); // Box 681
		turretModel[64] = new ModelRendererTurbo(this, 777, 321, textureX, textureY); // Box 682
		turretModel[65] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 683
		turretModel[66] = new ModelRendererTurbo(this, 945, 345, textureX, textureY); // Box 684
		turretModel[67] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Box 685
		turretModel[68] = new ModelRendererTurbo(this, 529, 377, textureX, textureY); // Box 686
		turretModel[69] = new ModelRendererTurbo(this, 801, 257, textureX, textureY); // Box 687
		turretModel[70] = new ModelRendererTurbo(this, 89, 385, textureX, textureY); // Box 688
		turretModel[71] = new ModelRendererTurbo(this, 441, 385, textureX, textureY); // Box 689
		turretModel[72] = new ModelRendererTurbo(this, 257, 353, textureX, textureY); // Box 690
		turretModel[73] = new ModelRendererTurbo(this, 129, 385, textureX, textureY); // Box 691
		turretModel[74] = new ModelRendererTurbo(this, 633, 289, textureX, textureY); // Box 692
		turretModel[75] = new ModelRendererTurbo(this, 993, 313, textureX, textureY); // Box 693
		turretModel[76] = new ModelRendererTurbo(this, 553, 329, textureX, textureY); // Box 694
		turretModel[77] = new ModelRendererTurbo(this, 753, 417, textureX, textureY); // Box 783
		turretModel[78] = new ModelRendererTurbo(this, 25, 425, textureX, textureY); // Box 784
		turretModel[79] = new ModelRendererTurbo(this, 329, 425, textureX, textureY); // Box 785
		turretModel[80] = new ModelRendererTurbo(this, 353, 297, textureX, textureY); // Box 786
		turretModel[81] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 787
		turretModel[82] = new ModelRendererTurbo(this, 577, 249, textureX, textureY); // Box 789
		turretModel[83] = new ModelRendererTurbo(this, 673, 281, textureX, textureY); // Box 790
		turretModel[84] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 791
		turretModel[85] = new ModelRendererTurbo(this, 81, 297, textureX, textureY); // Box 792
		turretModel[86] = new ModelRendererTurbo(this, 793, 297, textureX, textureY); // Box 704
		turretModel[87] = new ModelRendererTurbo(this, 753, 257, textureX, textureY); // Box 705
		turretModel[88] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 706
		turretModel[89] = new ModelRendererTurbo(this, 513, 281, textureX, textureY); // Box 707
		turretModel[90] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 708
		turretModel[91] = new ModelRendererTurbo(this, 889, 257, textureX, textureY); // Box 709
		turretModel[92] = new ModelRendererTurbo(this, 657, 41, textureX, textureY); // Box 710
		turretModel[93] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 711
		turretModel[94] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 712
		turretModel[95] = new ModelRendererTurbo(this, 793, 177, textureX, textureY); // Box 713
		turretModel[96] = new ModelRendererTurbo(this, 721, 281, textureX, textureY); // Box 714
		turretModel[97] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 715
		turretModel[98] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Box 716
		turretModel[99] = new ModelRendererTurbo(this, 753, 281, textureX, textureY); // Box 717
		turretModel[100] = new ModelRendererTurbo(this, 929, 257, textureX, textureY); // Box 718
		turretModel[101] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 719
		turretModel[102] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 720
		turretModel[103] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 721
		turretModel[104] = new ModelRendererTurbo(this, 801, 281, textureX, textureY); // Box 722
		turretModel[105] = new ModelRendererTurbo(this, 841, 281, textureX, textureY); // Box 723
		turretModel[106] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Box 724
		turretModel[107] = new ModelRendererTurbo(this, 609, 265, textureX, textureY); // Box 725
		turretModel[108] = new ModelRendererTurbo(this, 897, 265, textureX, textureY); // Box 726
		turretModel[109] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 727
		turretModel[110] = new ModelRendererTurbo(this, 657, 281, textureX, textureY); // Box 728
		turretModel[111] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 729
		turretModel[112] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 1077
		turretModel[113] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 265
		turretModel[114] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 266
		turretModel[115] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 267
		turretModel[116] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 270
		turretModel[117] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 765
		turretModel[118] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Box 737
		turretModel[119] = new ModelRendererTurbo(this, 921, 321, textureX, textureY); // Box 738
		turretModel[120] = new ModelRendererTurbo(this, 137, 337, textureX, textureY); // Box 739
		turretModel[121] = new ModelRendererTurbo(this, 881, 281, textureX, textureY); // Box 740
		turretModel[122] = new ModelRendererTurbo(this, 961, 289, textureX, textureY); // Box 741
		turretModel[123] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Box 742
		turretModel[124] = new ModelRendererTurbo(this, 305, 353, textureX, textureY); // Box 743
		turretModel[125] = new ModelRendererTurbo(this, 769, 353, textureX, textureY); // Box 744
		turretModel[126] = new ModelRendererTurbo(this, 809, 353, textureX, textureY); // Box 745
		turretModel[127] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Box 746
		turretModel[128] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 747
		turretModel[129] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 748
		turretModel[130] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 749
		turretModel[131] = new ModelRendererTurbo(this, 993, 281, textureX, textureY); // Box 750
		turretModel[132] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 751
		turretModel[133] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 752
		turretModel[134] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Box 753
		turretModel[135] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 754
		turretModel[136] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 755
		turretModel[137] = new ModelRendererTurbo(this, 641, 313, textureX, textureY); // Box 756
		turretModel[138] = new ModelRendererTurbo(this, 929, 209, textureX, textureY); // Box 757
		turretModel[139] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 758
		turretModel[140] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 759
		turretModel[141] = new ModelRendererTurbo(this, 849, 313, textureX, textureY); // Box 760
		turretModel[142] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 761
		turretModel[143] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 762
		turretModel[144] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 763
		turretModel[145] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Box 764
		turretModel[146] = new ModelRendererTurbo(this, 569, 281, textureX, textureY); // Box 765
		turretModel[147] = new ModelRendererTurbo(this, 673, 337, textureX, textureY); // Box 766
		turretModel[148] = new ModelRendererTurbo(this, 561, 297, textureX, textureY); // Box 767
		turretModel[149] = new ModelRendererTurbo(this, 137, 305, textureX, textureY); // Box 768
		turretModel[150] = new ModelRendererTurbo(this, 305, 313, textureX, textureY); // Box 769
		turretModel[151] = new ModelRendererTurbo(this, 193, 313, textureX, textureY); // Box 770
		turretModel[152] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 771
		turretModel[153] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 772
		turretModel[154] = new ModelRendererTurbo(this, 745, 121, textureX, textureY); // Box 773
		turretModel[155] = new ModelRendererTurbo(this, 777, 121, textureX, textureY); // Box 774
		turretModel[156] = new ModelRendererTurbo(this, 617, 353, textureX, textureY); // Box 775
		turretModel[157] = new ModelRendererTurbo(this, 737, 169, textureX, textureY); // Box 776
		turretModel[158] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 777
		turretModel[159] = new ModelRendererTurbo(this, 1009, 169, textureX, textureY); // Box 778
		turretModel[160] = new ModelRendererTurbo(this, 345, 393, textureX, textureY); // Box 781

		turretModel[0].addShapeBox(0F, 0F, 0F, 15, 11, 25, 0F,0F, 0.5F, 0F, -1F, -0.5F, -16.5F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, -1F, 0F, -16.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		turretModel[0].setRotationPoint(12.5F, -33F, -32F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 40, 12, 25, 0F,-3F, 1F, -15F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 1F, 1F, 2F, -3F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 579
		turretModel[1].setRotationPoint(-27.5F, -34F, -32F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 15, 11, 25, 0F,0F, 2.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -16.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -16.5F, 0F, 0F, 0F); // Box 580
		turretModel[2].setRotationPoint(12.5F, -33F, 7F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 40, 12, 25, 0F,1F, 1F, 2F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, -3F, 1F, -15F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -15F); // Box 581
		turretModel[3].setRotationPoint(-27.5F, -34F, 7F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 8, 13, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 582
		turretModel[4].setRotationPoint(12.5F, -35.5F, -7F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 40, 13, 14, 0F,1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F); // Box 623
		turretModel[5].setRotationPoint(-27.5F, -35.5F, -7F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 624
		turretModel[6].setRotationPoint(4.5F, -36.5F, -7.5F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 625
		turretModel[7].setRotationPoint(4.5F, -36.5F, -3.5F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 626
		turretModel[8].setRotationPoint(4.5F, -36.5F, 0.5F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 627
		turretModel[9].setRotationPoint(4.5F, -36.5F, 4.5F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 628
		turretModel[10].setRotationPoint(-2.5F, -36.5F, 2F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 629
		turretModel[11].setRotationPoint(-2.5F, -36.5F, -1.5F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 630
		turretModel[12].setRotationPoint(-2.5F, -36.5F, -5F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 631
		turretModel[13].setRotationPoint(-9.5F, -36.5F, -3.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 632
		turretModel[14].setRotationPoint(-9.5F, -36.5F, 0.5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 633
		turretModel[15].setRotationPoint(-26.5F, -35.5F, -5F);
		turretModel[15].rotateAngleZ = 0.12217305F;

		turretModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 634
		turretModel[16].setRotationPoint(-26.5F, -35.5F, 2F);
		turretModel[16].rotateAngleZ = 0.12217305F;

		turretModel[17].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 635
		turretModel[17].setRotationPoint(-26.5F, -35.5F, -1.5F);
		turretModel[17].rotateAngleZ = 0.12217305F;

		turretModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 636
		turretModel[18].setRotationPoint(-19.5F, -36F, -2.5F);
		turretModel[18].rotateAngleZ = 0.10471976F;

		turretModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 637
		turretModel[19].setRotationPoint(-21.5F, -36F, -15.5F);
		turretModel[19].rotateAngleZ = 0.10471976F;

		turretModel[20].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 638
		turretModel[20].setRotationPoint(14.5F, -35.5F, -10.5F);
		turretModel[20].rotateAngleZ = -0.03490659F;

		turretModel[21].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 639
		turretModel[21].setRotationPoint(12.5F, -35.5F, -14.5F);
		turretModel[21].rotateAngleZ = -0.03490659F;

		turretModel[22].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 640
		turretModel[22].setRotationPoint(12.5F, -35.5F, -18.5F);
		turretModel[22].rotateAngleZ = -0.03490659F;

		turretModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F); // Box 641
		turretModel[23].setRotationPoint(26.5F, -25.3F, -8.2F);
		turretModel[23].rotateAngleZ = -0.03490659F;

		turretModel[24].addShapeBox(-12.3F, -20F, 5.5F, 11, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		turretModel[24].setRotationPoint(-3F, -17.2F, 3F);
		turretModel[24].rotateAngleX = 0.03490659F;
		turretModel[24].rotateAngleZ = 0.08726646F;

		turretModel[25].addShapeBox(-12.3F, -20.35F, 2.5F, 11, 4, 3, 0F,-2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		turretModel[25].setRotationPoint(-3F, -17.2F, 3F);
		turretModel[25].rotateAngleX = 0.03490659F;
		turretModel[25].rotateAngleZ = 0.08726646F;

		turretModel[26].addShapeBox(-9.8F, -20.55F, 1.5F, 7, 4, 1, 0F,-2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		turretModel[26].setRotationPoint(-3F, -17.2F, 3F);
		turretModel[26].rotateAngleX = 0.03490659F;
		turretModel[26].rotateAngleZ = 0.08726646F;

		turretModel[27].addShapeBox(-12.3F, -19F, 12.5F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.45F, 0F, -2.5F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 245
		turretModel[27].setRotationPoint(-3F, -17.2F, 3F);
		turretModel[27].rotateAngleX = 0.03490659F;
		turretModel[27].rotateAngleZ = 0.08726646F;

		turretModel[28].addShapeBox(-9.8F, -18.55F, 15.5F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 246
		turretModel[28].setRotationPoint(-3F, -17.2F, 3F);
		turretModel[28].rotateAngleX = 0.03490659F;
		turretModel[28].rotateAngleZ = 0.08726646F;

		turretModel[29].addShapeBox(-2.75F, -17F, -19.9F, 5, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 708
		turretModel[29].setRotationPoint(2F, -18.1F, -2F);

		turretModel[30].addShapeBox(-15.75F, -17F, -17.9F, 5, 5, 12, 0F,0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 2F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 7F, 1F, 0F, 0F); // Box 709
		turretModel[30].setRotationPoint(2F, -18.1F, -2F);

		turretModel[31].addShapeBox(-10.75F, -17F, -21.9F, 8, 5, 13, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 710
		turretModel[31].setRotationPoint(2F, -18.1F, -2F);

		turretModel[32].addShapeBox(-15.75F, -18F, -18.9F, 5, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F); // Box 711
		turretModel[32].setRotationPoint(2F, -18.1F, -1F);

		turretModel[33].addShapeBox(-2.75F, -18F, -17.9F, 5, 1, 12, 0F,0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F); // Box 713
		turretModel[33].setRotationPoint(2F, -18.1F, -2F);

		turretModel[34].addShapeBox(-10.75F, -18F, -19.9F, 8, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 714
		turretModel[34].setRotationPoint(2F, -18.1F, -2F);

		turretModel[35].addShapeBox(-13.75F, -19.5F, -17.9F, 4, 2, 10, 0F,0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, -2F); // Box 716
		turretModel[35].setRotationPoint(2F, -18.1F, -1F);

		turretModel[36].addShapeBox(-9.75F, -20.5F, -18.9F, 6, 1, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		turretModel[36].setRotationPoint(2F, -18.1F, -2F);

		turretModel[37].addShapeBox(-13.75F, -20.5F, -16.9F, 4, 1, 10, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, -2F); // Box 719
		turretModel[37].setRotationPoint(2F, -18.1F, -2F);

		turretModel[38].addShapeBox(-3.75F, -20.5F, -16.9F, 4, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 2F); // Box 720
		turretModel[38].setRotationPoint(2F, -18.1F, -2F);

		turretModel[39].addShapeBox(-9.75F, -22.5F, -17.9F, 5, 2, 11, 0F,0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 722
		turretModel[39].setRotationPoint(2F, -18.1F, -2F);

		turretModel[40].addShapeBox(-12.75F, -21.5F, -18.9F, 5, 1, 13, 0F,0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 723
		turretModel[40].setRotationPoint(2F, -18.1F, -2F);

		turretModel[41].addShapeBox(-4.75F, -21.5F, -18.25F, 3, 1, 12, 0F,0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 769
		turretModel[41].setRotationPoint(2F, -18.1F, -2F);

		turretModel[42].addShapeBox(-3.3F, -21F, 4.5F, 2, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 867
		turretModel[42].setRotationPoint(-3F, -17.2F, 3F);
		turretModel[42].rotateAngleX = 0.03490659F;
		turretModel[42].rotateAngleZ = 0.08726646F;

		turretModel[43].addShapeBox(-4.1F, -21F, 5.5F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		turretModel[43].setRotationPoint(-3F, -17.2F, 3F);
		turretModel[43].rotateAngleX = 0.03490659F;
		turretModel[43].rotateAngleZ = 0.08726646F;

		turretModel[44].addShapeBox(-4.1F, -20.4F, 11.5F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 869
		turretModel[44].setRotationPoint(-3F, -17.2F, 3F);
		turretModel[44].rotateAngleX = 0.03490659F;
		turretModel[44].rotateAngleZ = 0.08726646F;

		turretModel[45].addShapeBox(-4.3F, -20.4F, 7.5F, 4, 4, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		turretModel[45].setRotationPoint(-3F, -17.2F, 3F);
		turretModel[45].rotateAngleX = 0.03490659F;
		turretModel[45].rotateAngleZ = 0.08726646F;

		turretModel[46].addShapeBox(-13.75F, -19.5F, -17.9F, 4, 2, 10, 0F,0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 2F); // Box 664
		turretModel[46].setRotationPoint(12F, -18.1F, -1F);

		turretModel[47].addShapeBox(-13.75F, -19.5F, -17.9F, 6, 2, 10, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 665
		turretModel[47].setRotationPoint(6F, -18.1F, -1F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 13, 9, 25, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 666
		turretModel[48].setRotationPoint(20.5F, -32F, -33.5F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 13, 9, 13, 0F,0F, 0F, 0F, -8F, -3F, 0F, 6F, -3F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 6F, 0F, 0F, -13F, 0F, 0F); // Box 667
		turretModel[49].setRotationPoint(20.5F, -32F, -33.5F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 668
		turretModel[50].setRotationPoint(33.5F, -32F, -20.5F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 13, 9, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 669
		turretModel[51].setRotationPoint(20.5F, -32F, 8.5F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 13, 9, 13, 0F,-13F, 0F, 0F, 6F, -3F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 6F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 670
		turretModel[52].setRotationPoint(20.5F, -32F, 20.5F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		turretModel[53].setRotationPoint(33.5F, -32F, 8.5F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 17, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 672
		turretModel[54].setRotationPoint(2.5F, -33F, -36.5F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 673
		turretModel[55].setRotationPoint(19.5F, -33F, -36.5F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 17, 10, 3, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		turretModel[56].setRotationPoint(2.5F, -33F, 33.5F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F,-2F, 0F, 0F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 675
		turretModel[57].setRotationPoint(19.5F, -33F, 33.5F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 11, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 676
		turretModel[58].setRotationPoint(-8.5F, -33F, -35.5F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 11, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 677
		turretModel[59].setRotationPoint(-8.5F, -33F, -32.5F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 14, 9, 5, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 3F); // Box 678
		turretModel[60].setRotationPoint(-22.5F, -33F, -35.5F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 11, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 679
		turretModel[61].setRotationPoint(-8.5F, -33F, 32.5F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 11, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 680
		turretModel[62].setRotationPoint(-8.5F, -33F, 22.5F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 14, 9, 6, 0F,0.8F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -6F, 0.8F, 0F, 3F, 0F, 0F, -2F, 0F, -2F, 0F, 2F, -2F, -6F); // Box 681
		turretModel[63].setRotationPoint(-22.5F, -33F, 30.5F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 14, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 682
		turretModel[64].setRotationPoint(-22.5F, -33F, -27.5F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 14, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, -1F, 3F); // Box 683
		turretModel[65].setRotationPoint(-36.5F, -33F, -30.5F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 2F, 0F, 0F, -2F, -5.8F); // Box 684
		turretModel[66].setRotationPoint(-49.5F, -35F, -30.5F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 13, 10, 13, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 685
		turretModel[67].setRotationPoint(-49.5F, -35F, -30.5F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 14, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 686
		turretModel[68].setRotationPoint(-36.5F, -33F, -24.5F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 687
		turretModel[69].setRotationPoint(-36.5F, -35F, -30.5F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 18, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		turretModel[70].setRotationPoint(2.5F, -32F, -33.5F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 18, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		turretModel[71].setRotationPoint(2.5F, -32F, 21.5F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 14, 9, 6, 0F,-2.5F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.8F, 0F, -2F, -2.5F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.8F, 0F, -2F); // Box 690
		turretModel[72].setRotationPoint(-22.5F, -33F, 23.5F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 15, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F); // Box 691
		turretModel[73].setRotationPoint(-42.5F, -36F, -16.5F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 692
		turretModel[74].setRotationPoint(-27.5F, -36F, -16.5F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 693
		turretModel[75].setRotationPoint(-46.5F, -35F, -13.5F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 694
		turretModel[76].setRotationPoint(-46.5F, -35F, -2.5F);

		turretModel[77].addShapeBox(-42.5F, -11.75F, -23F, 5, 2, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 783
		turretModel[77].setRotationPoint(11F, -26.45F, 5F);

		turretModel[78].addShapeBox(-42.5F, -13.75F, -23F, 5, 1, 30, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 784
		turretModel[78].setRotationPoint(11F, -25.45F, 5F);

		turretModel[79].addShapeBox(-42.5F, -8.75F, -23F, 5, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 785
		turretModel[79].setRotationPoint(11F, -27.45F, 5F);

		turretModel[80].addShapeBox(-43.5F, -12.75F, -23.5F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 786
		turretModel[80].setRotationPoint(11F, -25.45F, 5F);

		turretModel[81].addShapeBox(-43.5F, -13.75F, -23.5F, 7, 1, 1, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 787
		turretModel[81].setRotationPoint(11F, -25.45F, 5F);

		turretModel[82].addShapeBox(-43.5F, -7.75F, -23.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F); // Box 789
		turretModel[82].setRotationPoint(11F, -28.45F, 5F);

		turretModel[83].addShapeBox(-43F, -11.75F, 22.5F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 790
		turretModel[83].setRotationPoint(11F, -26.45F, -11F);

		turretModel[84].addShapeBox(-43F, -13.75F, 22.5F, 6, 1, 1, 0F,-2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, -0.25F, -2.5F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 791
		turretModel[84].setRotationPoint(11F, -25.45F, -11F);

		turretModel[85].addShapeBox(-43F, -8.25F, 22.5F, 6, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.25F, -2.5F, 0F, -0.25F); // Box 792
		turretModel[85].setRotationPoint(11F, -27.45F, -11F);

		turretModel[86].addShapeBox(0F, 0F, -0.5F, 13, 10, 1, 0F,0F, 0F, -0.2F, 0.5F, -5F, -0.2F, 0.5F, -5F, -0.2F, 0F, 0F, -0.2F, 0F, -6F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -6F, -0.2F); // Box 704
		turretModel[86].setRotationPoint(-36.5F, -36.5F, 24.5F);
		turretModel[86].rotateAngleY = 0.43633231F;

		turretModel[87].addShapeBox(-10F, 0F, -0.5F, 10, 4, 1, 0F,0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 705
		turretModel[87].setRotationPoint(-36.5F, -36.5F, 24.5F);
		turretModel[87].rotateAngleY = 0.43633231F;

		turretModel[88].addShapeBox(-10F, 0F, -0.5F, 10, 2, 1, 0F,0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 2.8F, 0.5F, 0F, 2.8F, 0.5F, 0F, -3.2F, 0F, 0F, -3.2F); // Box 706
		turretModel[88].setRotationPoint(-36.5F, -32.5F, 24.5F);
		turretModel[88].rotateAngleY = 0.43633231F;

		turretModel[89].addShapeBox(0F, 0F, -0.5F, 13, 8, 1, 0F,0F, 0F, -0.2F, 0.5F, -6F, -0.2F, 0.5F, -6F, -0.2F, 0F, 0F, -0.2F, 0F, -6F, 2.8F, 0.5F, 0F, 2.8F, 0.5F, 0F, -3.2F, 0F, -6F, -3.2F); // Box 707
		turretModel[89].setRotationPoint(-36.5F, -32.5F, 24.5F);
		turretModel[89].rotateAngleY = 0.43633231F;

		turretModel[90].addShapeBox(-13.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 708
		turretModel[90].setRotationPoint(-36.5F, -36.7F, 24.5F);
		turretModel[90].rotateAngleY = 0.43633231F;

		turretModel[91].addShapeBox(-14.5F, 0F, -3F, 13, 1, 1, 0F,0F, -0.3F, -0.3F, 0.5F, -1.3F, -0.3F, 0.5F, -1.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, 0.7F, -0.3F, 0.5F, 0.7F, -0.3F, 0F, -0.3F, -0.3F); // Box 709
		turretModel[91].setRotationPoint(-36.5F, -31.7F, 24.5F);
		turretModel[91].rotateAngleY = 0.43633231F;

		turretModel[92].addShapeBox(-13.5F, 0F, -3F, 12, 1, 1, 0F,0F, -0.3F, -0.3F, 0.5F, -1.3F, -0.3F, 0.5F, -1.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, 0.7F, -0.3F, 0.5F, 0.7F, -0.3F, 0F, -0.3F, -0.3F); // Box 710
		turretModel[92].setRotationPoint(-36.5F, -31.7F, 19.5F);
		turretModel[92].rotateAngleY = 0.33161256F;

		turretModel[93].addShapeBox(-14.2F, 0F, -3F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 711
		turretModel[93].setRotationPoint(-36.5F, -36.2F, 19.5F);
		turretModel[93].rotateAngleY = 0.33161256F;

		turretModel[94].addShapeBox(-14.2F, 0F, -3F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 712
		turretModel[94].setRotationPoint(-36.5F, -36.2F, 23F);
		turretModel[94].rotateAngleY = 0.33161256F;

		turretModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 713
		turretModel[95].setRotationPoint(-49F, -36.7F, 8F);

		turretModel[96].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 714
		turretModel[96].setRotationPoint(-49F, -36.7F, 8F);

		turretModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 715
		turretModel[97].setRotationPoint(-37F, -36.7F, 8F);

		turretModel[98].addShapeBox(-14.2F, 0F, -3F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 716
		turretModel[98].setRotationPoint(-24.5F, -36.2F, 20.5F);
		turretModel[98].rotateAngleY = 0.33161256F;

		turretModel[99].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 717
		turretModel[99].setRotationPoint(-37F, -37F, 13.5F);
		turretModel[99].rotateAngleY = 0.34906585F;
		turretModel[99].rotateAngleZ = -0.2268928F;

		turretModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 718
		turretModel[100].setRotationPoint(-37.5F, -31F, 7.5F);

		turretModel[101].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 719
		turretModel[101].setRotationPoint(-37.5F, -36.5F, 7.5F);

		turretModel[102].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 720
		turretModel[102].setRotationPoint(-43.5F, -36.5F, 7.5F);

		turretModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 721
		turretModel[103].setRotationPoint(-43.5F, -31F, 7.5F);

		turretModel[104].addShapeBox(-19.5F, -1.5F, -0.5F, 17, 1, 1, 0F,0F, -0.3F, -0.3F, 0.5F, -1.3F, -0.3F, 0.5F, -1.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, 0.7F, -0.3F, 0.5F, 0.7F, -0.3F, 0F, -0.3F, -0.3F); // Box 722
		turretModel[104].setRotationPoint(-19.5F, -24.2F, 23.5F);
		turretModel[104].rotateAngleY = 0.38397244F;
		turretModel[104].rotateAngleZ = -0.27052603F;

		turretModel[105].addShapeBox(-19.5F, -1.5F, -0.5F, 18, 1, 1, 0F,0F, -0.3F, -0.3F, 0.5F, -1.3F, -0.3F, 0.5F, -1.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, 0.7F, -0.3F, 0.5F, 0.7F, -0.3F, 0F, -0.3F, -0.3F); // Box 723
		turretModel[105].setRotationPoint(-19.5F, -25.2F, 20.5F);
		turretModel[105].rotateAngleY = 0.38397244F;
		turretModel[105].rotateAngleZ = -0.27052603F;

		turretModel[106].addShapeBox(-14.2F, 0F, -3F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 724
		turretModel[106].setRotationPoint(-21.5F, -35.7F, 22F);
		turretModel[106].rotateAngleY = 0.33161256F;

		turretModel[107].addShapeBox(-14.2F, 0F, -3F, 1, 1, 8, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, -1.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, -1.3F, -0.3F, -0.3F); // Box 725
		turretModel[107].setRotationPoint(-21.5F, -30.7F, 22F);
		turretModel[107].rotateAngleY = 0.33161256F;

		turretModel[108].addShapeBox(-14.2F, 0F, -3F, 1, 1, 8, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 726
		turretModel[108].setRotationPoint(-14.5F, -27.7F, 24.5F);
		turretModel[108].rotateAngleY = 0.33161256F;

		turretModel[109].addShapeBox(-14.2F, 0F, -3F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 727
		turretModel[109].setRotationPoint(-14.5F, -33.7F, 24.5F);
		turretModel[109].rotateAngleY = 0.33161256F;

		turretModel[110].addShapeBox(-14.2F, 0F, -3F, 1, 1, 9, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 728
		turretModel[110].setRotationPoint(-9.5F, -25.7F, 26.5F);
		turretModel[110].rotateAngleY = 0.33161256F;

		turretModel[111].addShapeBox(-14.2F, 0F, -3F, 1, 7, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 729
		turretModel[111].setRotationPoint(-9.5F, -32.7F, 26.5F);
		turretModel[111].rotateAngleY = 0.33161256F;

		turretModel[112].addShapeBox(9F, -19F, 9.5F, 5, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1077
		turretModel[112].setRotationPoint(0F, -19.1F, -1F);

		turretModel[113].addShapeBox(14F, -12.4F, 13.1F, 4, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 265
		turretModel[113].setRotationPoint(0F, -25.1F, -1F);

		turretModel[114].addShapeBox(14F, -12.4F, 10.1F, 4, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 266
		turretModel[114].setRotationPoint(0F, -25.1F, -1F);

		turretModel[115].addShapeBox(14F, -13F, 10.6F, 4, 1, 3, 0F,0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 267
		turretModel[115].setRotationPoint(0F, -25.1F, -1F);

		turretModel[116].addShapeBox(14F, -12.9F, 9.6F, 2, 5, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 270
		turretModel[116].setRotationPoint(0F, -25.1F, 0F);

		turretModel[117].addShapeBox(16F, -12.6F, 10.6F, 2, 5, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 765
		turretModel[117].setRotationPoint(0F, -23.5F, -1F);

		turretModel[118].addShapeBox(0F, 0F, 0F, 12, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 737
		turretModel[118].setRotationPoint(-0.5F, -38F, -16F);

		turretModel[119].addShapeBox(0F, 0F, 0F, 12, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 738
		turretModel[119].setRotationPoint(-0.5F, -38F, -12F);

		turretModel[120].addShapeBox(0F, 0F, 0F, 12, 5, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 739
		turretModel[120].setRotationPoint(-0.5F, -38F, -20F);

		turretModel[121].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -4.2F, 0F, -1F, -4.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -4.2F, 0F, -1F, -4.2F, 0F, -1F); // Box 740
		turretModel[121].setRotationPoint(-0.5F, -41F, -12F);

		turretModel[122].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 741
		turretModel[122].setRotationPoint(-0.5F, -41F, -16F);

		turretModel[123].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,-4.2F, 0F, -1F, -4.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -4.2F, 0F, -1F, -4.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 742
		turretModel[123].setRotationPoint(-0.5F, -41F, -20F);

		turretModel[124].addShapeBox(0F, 0F, 0F, 12, 10, 4, 0F,-0.2F, 0F, 0F, -3.2F, 0F, 0F, -4.2F, 0F, -1F, -4.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -4.2F, 0F, -1F, -4.2F, 0F, -1F); // Box 743
		turretModel[124].setRotationPoint(-0.5F, -51F, -12F);

		turretModel[125].addShapeBox(0F, 0F, 0F, 12, 10, 4, 0F,-4.2F, 0F, -1F, -4.2F, 0F, -1F, -3.2F, 0F, 0F, -0.2F, 0F, 0F, -4.2F, 0F, -1F, -4.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 744
		turretModel[125].setRotationPoint(-0.5F, -51F, -20F);

		turretModel[126].addShapeBox(0F, 0F, 0F, 12, 10, 4, 0F,-0.2F, 0F, 0F, -3.2F, 0F, 0F, -3.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 745
		turretModel[126].setRotationPoint(-0.5F, -51F, -16F);

		turretModel[127].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		turretModel[127].setRotationPoint(-25.5F, -50F, 5.5F);

		turretModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 747
		turretModel[128].setRotationPoint(-25.5F, -49F, 5.5F);

		turretModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 748
		turretModel[129].setRotationPoint(-25.5F, -52F, 5.5F);

		turretModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F, 0.3F, -0.4F, 0.3F); // Box 749
		turretModel[130].setRotationPoint(-25.5F, -52F, 5.5F);

		turretModel[131].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 750
		turretModel[131].setRotationPoint(-21.5F, -36F, -30F);
		turretModel[131].rotateAngleY = -0.31415927F;

		turretModel[132].addShapeBox(8F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 751
		turretModel[132].setRotationPoint(-21.5F, -36F, -30F);
		turretModel[132].rotateAngleY = -0.31415927F;

		turretModel[133].addShapeBox(8F, 0F, 0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		turretModel[133].setRotationPoint(-21.5F, -33.5F, -30F);
		turretModel[133].rotateAngleY = -0.31415927F;
		turretModel[133].rotateAngleZ = 0.2443461F;

		turretModel[134].addShapeBox(8F, 0F, 3.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 753
		turretModel[134].setRotationPoint(-21.5F, -33.5F, -30F);
		turretModel[134].rotateAngleY = -0.31415927F;
		turretModel[134].rotateAngleZ = 0.2443461F;

		turretModel[135].addShapeBox(8F, 0F, 3.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		turretModel[135].setRotationPoint(-11.5F, -33.5F, -34.5F);
		turretModel[135].rotateAngleZ = 0.2443461F;

		turretModel[136].addShapeBox(8F, 0F, 0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		turretModel[136].setRotationPoint(-11.5F, -33.5F, -34.5F);
		turretModel[136].rotateAngleZ = 0.2443461F;

		turretModel[137].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 756
		turretModel[137].setRotationPoint(-11.5F, -36F, -34.5F);

		turretModel[138].addShapeBox(8F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 757
		turretModel[138].setRotationPoint(-11.5F, -36F, -34.5F);

		turretModel[139].addShapeBox(8F, 0F, 3.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		turretModel[139].setRotationPoint(-12.5F, -33.5F, 28.5F);
		turretModel[139].rotateAngleZ = 0.2443461F;

		turretModel[140].addShapeBox(8F, 0F, 0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
		turretModel[140].setRotationPoint(-12.5F, -33.5F, 28.5F);
		turretModel[140].rotateAngleZ = 0.2443461F;

		turretModel[141].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 760
		turretModel[141].setRotationPoint(-12.5F, -36F, 28.5F);

		turretModel[142].addShapeBox(8F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 761
		turretModel[142].setRotationPoint(-12.5F, -36F, 28.5F);

		turretModel[143].addShapeBox(8F, 0F, 3.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		turretModel[143].setRotationPoint(-20.5F, -33.5F, 23.5F);
		turretModel[143].rotateAngleY = 0.36651914F;
		turretModel[143].rotateAngleZ = 0.2443461F;

		turretModel[144].addShapeBox(8F, 0F, 0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		turretModel[144].setRotationPoint(-20.5F, -33.5F, 23.5F);
		turretModel[144].rotateAngleY = 0.36651914F;
		turretModel[144].rotateAngleZ = 0.2443461F;

		turretModel[145].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 764
		turretModel[145].setRotationPoint(-20.5F, -36F, 23.5F);
		turretModel[145].rotateAngleY = 0.36651914F;

		turretModel[146].addShapeBox(8F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 765
		turretModel[146].setRotationPoint(-20.5F, -36F, 23.5F);
		turretModel[146].rotateAngleY = 0.36651914F;

		turretModel[147].addShapeBox(-3F, 0F, -3.5F, 6, 6, 7, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 766
		turretModel[147].setRotationPoint(40.5F, -30.7F, -25.5F);
		turretModel[147].rotateAngleY = -0.20943951F;

		turretModel[148].addShapeBox(-3F, 0F, -1F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		turretModel[148].setRotationPoint(33.5F, -30.7F, -25.5F);

		turretModel[149].addShapeBox(-3F, 0F, -1F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		turretModel[149].setRotationPoint(33.5F, -25.7F, -25.5F);

		turretModel[150].addShapeBox(-3F, 0F, -1F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		turretModel[150].setRotationPoint(31.5F, -30.7F, 26.5F);

		turretModel[151].addShapeBox(-3F, 0F, -1F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		turretModel[151].setRotationPoint(33.5F, -25.7F, 26.5F);

		turretModel[152].addShapeBox(2F, 1F, -2F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 771
		turretModel[152].setRotationPoint(40.5F, -30.7F, -25.5F);
		turretModel[152].rotateAngleY = -0.20943951F;

		turretModel[153].addShapeBox(2F, 3F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 772
		turretModel[153].setRotationPoint(40.5F, -30.7F, -25.5F);
		turretModel[153].rotateAngleY = -0.20943951F;

		turretModel[154].addShapeBox(2F, 1F, -2F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		turretModel[154].setRotationPoint(40.5F, -30.7F, 26.5F);
		turretModel[154].rotateAngleY = 0.20943951F;

		turretModel[155].addShapeBox(2F, 3F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 774
		turretModel[155].setRotationPoint(40.5F, -30.7F, 26.5F);
		turretModel[155].rotateAngleY = 0.20943951F;

		turretModel[156].addShapeBox(-3F, 0F, -3.5F, 6, 6, 7, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 775
		turretModel[156].setRotationPoint(40.5F, -30.7F, 26.5F);
		turretModel[156].rotateAngleY = 0.20943951F;

		turretModel[157].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 776
		turretModel[157].setRotationPoint(-22.5F, -37F, -23.5F);

		turretModel[158].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 777
		turretModel[158].setRotationPoint(-22.5F, -40F, -23.5F);

		turretModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 778
		turretModel[159].setRotationPoint(-22.5F, -41F, -23.5F);

		turretModel[160].addShapeBox(0F, 0F, 0F, 8, 12, 14, 0F,0F, -2F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 781
		turretModel[160].setRotationPoint(20.5F, -35.5F, -7F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 319
		barrelModel[1] = new ModelRendererTurbo(this, 721, 337, textureX, textureY); // Box 448
		barrelModel[2] = new ModelRendererTurbo(this, 721, 345, textureX, textureY); // Box 449
		barrelModel[3] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 450
		barrelModel[4] = new ModelRendererTurbo(this, 825, 273, textureX, textureY); // Box 451
		barrelModel[5] = new ModelRendererTurbo(this, 721, 289, textureX, textureY); // Box 452
		barrelModel[6] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Box 453
		barrelModel[7] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 454
		barrelModel[8] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 455
		barrelModel[9] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 456
		barrelModel[10] = new ModelRendererTurbo(this, 529, 137, textureX, textureY); // Box 457
		barrelModel[11] = new ModelRendererTurbo(this, 657, 137, textureX, textureY); // Box 458
		barrelModel[12] = new ModelRendererTurbo(this, 721, 137, textureX, textureY); // Box 459
		barrelModel[13] = new ModelRendererTurbo(this, 769, 137, textureX, textureY); // Box 460
		barrelModel[14] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 461
		barrelModel[15] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 462
		barrelModel[16] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 463
		barrelModel[17] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Box 464
		barrelModel[18] = new ModelRendererTurbo(this, 681, 145, textureX, textureY); // Box 465
		barrelModel[19] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 466
		barrelModel[20] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 467
		barrelModel[21] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 468
		barrelModel[22] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 469
		barrelModel[23] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 470
		barrelModel[24] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // Box 471
		barrelModel[25] = new ModelRendererTurbo(this, 585, 153, textureX, textureY); // Box 472
		barrelModel[26] = new ModelRendererTurbo(this, 721, 153, textureX, textureY); // Box 473
		barrelModel[27] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Box 474
		barrelModel[28] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 475
		barrelModel[29] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 476
		barrelModel[30] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 477
		barrelModel[31] = new ModelRendererTurbo(this, 985, 257, textureX, textureY); // Box 478
		barrelModel[32] = new ModelRendererTurbo(this, 721, 273, textureX, textureY); // Box 479
		barrelModel[33] = new ModelRendererTurbo(this, 777, 273, textureX, textureY); // Box 480
		barrelModel[34] = new ModelRendererTurbo(this, 857, 289, textureX, textureY); // Box 481
		barrelModel[35] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 482
		barrelModel[36] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Box 483
		barrelModel[37] = new ModelRendererTurbo(this, 593, 161, textureX, textureY); // Box 484
		barrelModel[38] = new ModelRendererTurbo(this, 897, 161, textureX, textureY); // Box 485
		barrelModel[39] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Box 486
		barrelModel[40] = new ModelRendererTurbo(this, 769, 241, textureX, textureY); // Box 487
		barrelModel[41] = new ModelRendererTurbo(this, 793, 289, textureX, textureY); // Box 488
		barrelModel[42] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Box 489
		barrelModel[43] = new ModelRendererTurbo(this, 633, 273, textureX, textureY); // Box 490
		barrelModel[44] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 493
		barrelModel[45] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 494
		barrelModel[46] = new ModelRendererTurbo(this, 905, 129, textureX, textureY); // Box 498
		barrelModel[47] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 499
		barrelModel[48] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 500
		barrelModel[49] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 501
		barrelModel[50] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 502
		barrelModel[51] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 503
		barrelModel[52] = new ModelRendererTurbo(this, 537, 137, textureX, textureY); // Box 504
		barrelModel[53] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Box 505
		barrelModel[54] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Box 506
		barrelModel[55] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Box 507
		barrelModel[56] = new ModelRendererTurbo(this, 857, 137, textureX, textureY); // Box 508
		barrelModel[57] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 509
		barrelModel[58] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 510
		barrelModel[59] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 511
		barrelModel[60] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 512
		barrelModel[61] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 822
		barrelModel[62] = new ModelRendererTurbo(this, 113, 329, textureX, textureY); // Box 823
		barrelModel[63] = new ModelRendererTurbo(this, 169, 329, textureX, textureY); // Box 826
		barrelModel[64] = new ModelRendererTurbo(this, 385, 297, textureX, textureY); // Box 827
		barrelModel[65] = new ModelRendererTurbo(this, 425, 297, textureX, textureY); // Box 829
		barrelModel[66] = new ModelRendererTurbo(this, 353, 305, textureX, textureY); // Box 830

		barrelModel[0].addShapeBox(-8F, 2F, -2F, 5, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F); // Box 319
		barrelModel[0].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[1].addShapeBox(-6F, -1F, -2.25F, 107, 2, 4, 0F,0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 448
		barrelModel[1].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[2].addShapeBox(-6F, -2.5F, -2.25F, 107, 2, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 449
		barrelModel[2].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[3].addShapeBox(-6F, 0.5F, -2.25F, 107, 2, 4, 0F,0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 450
		barrelModel[3].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[4].addShapeBox(52.5F, -1F, -2.25F, 17, 2, 4, 0F,0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F); // Box 451
		barrelModel[4].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[5].addShapeBox(52.5F, 0.5F, -2.25F, 17, 2, 4, 0F,0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, 0.5F, -0.85F, 0F, 0.5F, -0.85F, 0F, 0.5F, -0.85F, 0F, 0.5F, -0.85F); // Box 452
		barrelModel[5].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[6].addShapeBox(52.5F, -2.5F, -2.25F, 17, 2, 4, 0F,0F, 0.5F, -0.85F, 0F, 0.5F, -0.85F, 0F, 0.5F, -0.85F, 0F, 0.5F, -0.85F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F); // Box 453
		barrelModel[6].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[7].addShapeBox(70.5F, 0.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 454
		barrelModel[7].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[8].addShapeBox(70.5F, -1F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 455
		barrelModel[8].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[9].addShapeBox(70.5F, -2.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 456
		barrelModel[9].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[10].addShapeBox(83.5F, 0.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 457
		barrelModel[10].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[11].addShapeBox(83.5F, -1F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 458
		barrelModel[11].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[12].addShapeBox(83.5F, -2.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 459
		barrelModel[12].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[13].addShapeBox(85.5F, 0.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 460
		barrelModel[13].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[14].addShapeBox(85.5F, -1F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 461
		barrelModel[14].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[15].addShapeBox(85.5F, -2.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 462
		barrelModel[15].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[16].addShapeBox(99.5F, 0.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 463
		barrelModel[16].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[17].addShapeBox(99.5F, -1F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 464
		barrelModel[17].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[18].addShapeBox(99.5F, -2.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 465
		barrelModel[18].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[19].addShapeBox(48.5F, 0.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 466
		barrelModel[19].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[20].addShapeBox(48.5F, -1F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 467
		barrelModel[20].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[21].addShapeBox(48.5F, -2.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 468
		barrelModel[21].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[22].addShapeBox(31.5F, 0.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 469
		barrelModel[22].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[23].addShapeBox(31.5F, -1F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 470
		barrelModel[23].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[24].addShapeBox(31.5F, -2.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 471
		barrelModel[24].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[25].addShapeBox(29.5F, 0.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 472
		barrelModel[25].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[26].addShapeBox(29.5F, -1F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 473
		barrelModel[26].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[27].addShapeBox(29.5F, -2.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 474
		barrelModel[27].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[28].addShapeBox(12.5F, 0.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 475
		barrelModel[28].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[29].addShapeBox(12.5F, -1F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 476
		barrelModel[29].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[30].addShapeBox(12.5F, -2.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 477
		barrelModel[30].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[31].addShapeBox(0.5F, 0.5F, -2.25F, 11, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 478
		barrelModel[31].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[32].addShapeBox(0.5F, -1F, -2.25F, 11, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 479
		barrelModel[32].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[33].addShapeBox(0.5F, -2.5F, -2.25F, 11, 2, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 480
		barrelModel[33].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[34].addShapeBox(14.5F, 0.5F, -2.25F, 15, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 481
		barrelModel[34].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[35].addShapeBox(14.5F, -1F, -2.25F, 15, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 482
		barrelModel[35].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[36].addShapeBox(14.5F, -2.5F, -2.25F, 15, 2, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 483
		barrelModel[36].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[37].addShapeBox(101F, -1F, -2.25F, 3, 2, 4, 0F,0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F); // Box 484
		barrelModel[37].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[38].addShapeBox(101F, 0.35F, -2.25F, 3, 2, 4, 0F,0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.7F, -1.1F, 0F, -0.7F, -1.1F, 0F, -0.7F, -1.1F, 0F, -0.7F, -1.1F); // Box 485
		barrelModel[38].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[39].addShapeBox(101F, -2.35F, -2.25F, 3, 2, 4, 0F,0F, -0.7F, -1.1F, 0F, -0.7F, -1.1F, 0F, -0.7F, -1.1F, 0F, -0.7F, -1.1F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F); // Box 486
		barrelModel[39].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[40].addShapeBox(14.5F, -3F, -0.75F, 15, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 487
		barrelModel[40].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[41].addShapeBox(33F, -3F, -0.75F, 15, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 488
		barrelModel[41].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[42].addShapeBox(72F, -3F, -0.75F, 11, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 489
		barrelModel[42].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[43].addShapeBox(87F, -3F, -0.75F, 12, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 490
		barrelModel[43].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[44].addShapeBox(99.5F, -3F, -0.5F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 493
		barrelModel[44].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[45].addShapeBox(99.5F, -3F, -1F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 494
		barrelModel[45].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[46].addShapeBox(85.5F, -3F, -1F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 498
		barrelModel[46].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[47].addShapeBox(85.5F, -3F, -0.5F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 499
		barrelModel[47].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[48].addShapeBox(83.5F, -3F, -1F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 500
		barrelModel[48].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[49].addShapeBox(83.5F, -3F, -0.5F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 501
		barrelModel[49].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[50].addShapeBox(70.5F, -3F, -1F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 502
		barrelModel[50].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[51].addShapeBox(70.5F, -3F, -0.5F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 503
		barrelModel[51].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[52].addShapeBox(48.5F, -3F, -1F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 504
		barrelModel[52].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[53].addShapeBox(48.5F, -3F, -0.5F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 505
		barrelModel[53].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[54].addShapeBox(31.5F, -3F, -1F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 506
		barrelModel[54].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[55].addShapeBox(31.5F, -3F, -0.5F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 507
		barrelModel[55].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[56].addShapeBox(29.5F, -3F, -1F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 508
		barrelModel[56].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[57].addShapeBox(29.5F, -3F, -0.5F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 509
		barrelModel[57].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[58].addShapeBox(12.5F, -3F, -1F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 510
		barrelModel[58].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[59].addShapeBox(12.5F, -3F, -0.5F, 1, 2, 1, 0F,0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 511
		barrelModel[59].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[60].addShapeBox(-6.5F, 0.3F, -8.4F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 512
		barrelModel[60].setRotationPoint(34F, -25.5F, 0.2F);

		barrelModel[61].addShapeBox(-5.5F, -4.5F, -4.25F, 5, 2, 8, 0F,0F, 0.25F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0.25F, -2F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F); // Box 822
		barrelModel[61].setRotationPoint(34F, -26.5F, 0.2F);

		barrelModel[62].addShapeBox(-5.5F, -2F, -4.25F, 5, 3, 8, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F); // Box 823
		barrelModel[62].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[63].addShapeBox(-5.5F, 0.5F, -4.25F, 5, 3, 8, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0.75F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0.75F, -2F); // Box 826
		barrelModel[63].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[64].addShapeBox(-7.5F, -4.5F, -4.25F, 2, 2, 8, 0F,0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 827
		barrelModel[64].setRotationPoint(34F, -26.5F, 0.2F);

		barrelModel[65].addShapeBox(-7.5F, -2F, -4.25F, 2, 3, 8, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 829
		barrelModel[65].setRotationPoint(34F, -27.5F, 0.2F);

		barrelModel[66].addShapeBox(-7.5F, 0.5F, -4.25F, 2, 3, 8, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.75F, -2F, 0F, 0.75F, -2F, 0F, 0.75F, -2F, 0F, 0.75F, -2F); // Box 830
		barrelModel[66].setRotationPoint(34F, -27.5F, 0.2F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 806
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 807
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 808
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 809
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 810
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 811
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 812
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 813
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 814
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 815
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 816
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 817
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 818
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 819
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 69
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 70
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 71
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 72
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 73
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 74
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 75
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 76
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 77
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 78
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 79
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 80
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 81
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Box 82
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 83
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Box 84
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 85
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Box 86
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 87
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Box 88
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 89
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 90
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Box 91
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 92
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 93
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 94
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 95
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 96
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 97
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 98
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 99
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 100
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 101
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 102
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 529, 113, textureX, textureY); // Box 103
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 104
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 105
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 106
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 697, 113, textureX, textureY); // Box 107
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 108
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 109
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 110
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 111
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 112
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 113
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 114
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 115
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 865, 129, textureX, textureY); // Box 116
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 817, 121, textureX, textureY); // Box 117
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Box 118
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 119
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 120
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 121
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 122
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 123
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 124
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 673, 129, textureX, textureY); // Box 125
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 126
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 127
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 128
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 129
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 130
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 131
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 132
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 945, 129, textureX, textureY); // Box 133
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 913, 129, textureX, textureY); // Box 134
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 135
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 136
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 137
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 138
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 67
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 68
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Box 69
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 862
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 863
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 864
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 229
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 649, 185, textureX, textureY); // Box 230
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 697, 185, textureX, textureY); // Box 231
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 232
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 233
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 745, 185, textureX, textureY); // Box 234
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 247
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 248
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 249
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 250
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 251
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 252
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Box 253
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Box 254
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 255
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 256
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 257
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 258
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 259
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 260
		leftTrackWheelModels[110] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 261

		leftTrackWheelModels[0].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 806
		leftTrackWheelModels[0].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[1].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 807
		leftTrackWheelModels[1].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[2].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 808
		leftTrackWheelModels[2].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[3].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 809
		leftTrackWheelModels[3].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[4].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 810
		leftTrackWheelModels[4].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[5].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 811
		leftTrackWheelModels[5].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[6].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 812
		leftTrackWheelModels[6].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[7].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 813
		leftTrackWheelModels[7].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[8].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 814
		leftTrackWheelModels[8].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[9].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 815
		leftTrackWheelModels[9].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[10].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 816
		leftTrackWheelModels[10].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[11].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 817
		leftTrackWheelModels[11].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[12].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 818
		leftTrackWheelModels[12].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[13].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 819
		leftTrackWheelModels[13].setRotationPoint(49F, 1.75F, 37F);

		leftTrackWheelModels[14].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 69
		leftTrackWheelModels[14].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[15].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 70
		leftTrackWheelModels[15].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[16].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 71
		leftTrackWheelModels[16].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[17].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 72
		leftTrackWheelModels[17].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[18].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 73
		leftTrackWheelModels[18].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[19].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 74
		leftTrackWheelModels[19].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[20].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 75
		leftTrackWheelModels[20].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[21].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 76
		leftTrackWheelModels[21].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[22].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 77
		leftTrackWheelModels[22].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[23].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 78
		leftTrackWheelModels[23].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[24].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 79
		leftTrackWheelModels[24].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[25].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 80
		leftTrackWheelModels[25].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[26].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 81
		leftTrackWheelModels[26].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[27].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 82
		leftTrackWheelModels[27].setRotationPoint(31F, 1.75F, 37F);

		leftTrackWheelModels[28].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 83
		leftTrackWheelModels[28].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[29].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 84
		leftTrackWheelModels[29].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[30].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 85
		leftTrackWheelModels[30].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[31].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 86
		leftTrackWheelModels[31].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[32].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 87
		leftTrackWheelModels[32].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[33].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 88
		leftTrackWheelModels[33].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[34].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 89
		leftTrackWheelModels[34].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[35].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 90
		leftTrackWheelModels[35].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[36].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 91
		leftTrackWheelModels[36].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[37].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 92
		leftTrackWheelModels[37].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[38].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 93
		leftTrackWheelModels[38].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[39].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 94
		leftTrackWheelModels[39].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[40].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 95
		leftTrackWheelModels[40].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[41].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 96
		leftTrackWheelModels[41].setRotationPoint(12F, 1.75F, 37F);

		leftTrackWheelModels[42].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 97
		leftTrackWheelModels[42].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[43].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 98
		leftTrackWheelModels[43].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[44].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 99
		leftTrackWheelModels[44].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[45].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 100
		leftTrackWheelModels[45].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[46].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 101
		leftTrackWheelModels[46].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[47].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 102
		leftTrackWheelModels[47].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[48].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 103
		leftTrackWheelModels[48].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[49].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 104
		leftTrackWheelModels[49].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[50].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 105
		leftTrackWheelModels[50].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[51].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 106
		leftTrackWheelModels[51].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[52].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 107
		leftTrackWheelModels[52].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[53].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 108
		leftTrackWheelModels[53].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[54].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 109
		leftTrackWheelModels[54].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[55].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 110
		leftTrackWheelModels[55].setRotationPoint(-5F, 1.75F, 37F);

		leftTrackWheelModels[56].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 111
		leftTrackWheelModels[56].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[57].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 112
		leftTrackWheelModels[57].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[58].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 113
		leftTrackWheelModels[58].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[59].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 114
		leftTrackWheelModels[59].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[60].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 115
		leftTrackWheelModels[60].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[61].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 116
		leftTrackWheelModels[61].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[62].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 117
		leftTrackWheelModels[62].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[63].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 118
		leftTrackWheelModels[63].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[64].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 119
		leftTrackWheelModels[64].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[65].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 120
		leftTrackWheelModels[65].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[66].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 121
		leftTrackWheelModels[66].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[67].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 122
		leftTrackWheelModels[67].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[68].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 123
		leftTrackWheelModels[68].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[69].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 124
		leftTrackWheelModels[69].setRotationPoint(-24F, 1.75F, 37F);

		leftTrackWheelModels[70].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 125
		leftTrackWheelModels[70].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[71].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 126
		leftTrackWheelModels[71].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[72].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 127
		leftTrackWheelModels[72].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[73].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 128
		leftTrackWheelModels[73].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[74].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 129
		leftTrackWheelModels[74].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[75].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 130
		leftTrackWheelModels[75].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[76].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 131
		leftTrackWheelModels[76].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[77].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 132
		leftTrackWheelModels[77].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[78].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 133
		leftTrackWheelModels[78].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[79].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 134
		leftTrackWheelModels[79].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[80].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 135
		leftTrackWheelModels[80].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[81].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 136
		leftTrackWheelModels[81].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[82].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 137
		leftTrackWheelModels[82].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[83].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 138
		leftTrackWheelModels[83].setRotationPoint(-44F, 1.75F, 37F);

		leftTrackWheelModels[84].addShapeBox(-6.5F, 1.8F, -9F, 13, 4, 9, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 67
		leftTrackWheelModels[84].setRotationPoint(67.5F, -7F, 36.2F);

		leftTrackWheelModels[85].addShapeBox(-6.5F, -1.5F, -9F, 13, 3, 9, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 68
		leftTrackWheelModels[85].setRotationPoint(67.5F, -7F, 36.2F);

		leftTrackWheelModels[86].addShapeBox(-6.5F, -5.8F, -9F, 13, 4, 9, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 69
		leftTrackWheelModels[86].setRotationPoint(67.5F, -7F, 36.2F);

		leftTrackWheelModels[87].addShapeBox(-2.5F, -2.45F, -8.5F, 5, 2, 9, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 862
		leftTrackWheelModels[87].setRotationPoint(67.5F, -7F, 36.2F);

		leftTrackWheelModels[88].addShapeBox(-2.5F, -1F, -8.5F, 5, 2, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 863
		leftTrackWheelModels[88].setRotationPoint(67.5F, -7F, 36.2F);

		leftTrackWheelModels[89].addShapeBox(-2.5F, 0.45F, -8.5F, 5, 2, 9, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 864
		leftTrackWheelModels[89].setRotationPoint(67.5F, -7F, 36.2F);

		leftTrackWheelModels[90].addShapeBox(-6.5F, -5.8F, -9F, 13, 4, 9, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 229
		leftTrackWheelModels[90].setRotationPoint(-57.5F, -5F, 36.2F);

		leftTrackWheelModels[91].addShapeBox(-6.5F, -1.5F, -9F, 13, 3, 9, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 230
		leftTrackWheelModels[91].setRotationPoint(-57.5F, -5F, 36.2F);

		leftTrackWheelModels[92].addShapeBox(-6.5F, 1.8F, -9F, 13, 4, 9, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 231
		leftTrackWheelModels[92].setRotationPoint(-57.5F, -5F, 36.2F);

		leftTrackWheelModels[93].addShapeBox(-2.5F, 0.45F, -8.5F, 5, 2, 9, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 232
		leftTrackWheelModels[93].setRotationPoint(-57.5F, -5F, 36.2F);

		leftTrackWheelModels[94].addShapeBox(-2.5F, -1F, -8.5F, 5, 2, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 233
		leftTrackWheelModels[94].setRotationPoint(-57.5F, -5F, 36.2F);

		leftTrackWheelModels[95].addShapeBox(-2.5F, -2.45F, -8.5F, 5, 2, 9, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 234
		leftTrackWheelModels[95].setRotationPoint(-57.5F, -5F, 36.2F);

		leftTrackWheelModels[96].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 247
		leftTrackWheelModels[96].setRotationPoint(41F, -10.25F, 30.5F);

		leftTrackWheelModels[97].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 248
		leftTrackWheelModels[97].setRotationPoint(41F, -10.25F, 30.5F);

		leftTrackWheelModels[98].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 249
		leftTrackWheelModels[98].setRotationPoint(41F, -10.25F, 30.5F);

		leftTrackWheelModels[99].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 250
		leftTrackWheelModels[99].setRotationPoint(22F, -10.25F, 30.5F);

		leftTrackWheelModels[100].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		leftTrackWheelModels[100].setRotationPoint(22F, -10.25F, 30.5F);

		leftTrackWheelModels[101].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 252
		leftTrackWheelModels[101].setRotationPoint(22F, -10.25F, 30.5F);

		leftTrackWheelModels[102].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 253
		leftTrackWheelModels[102].setRotationPoint(3F, -10.25F, 30.5F);

		leftTrackWheelModels[103].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 254
		leftTrackWheelModels[103].setRotationPoint(3F, -10.25F, 30.5F);

		leftTrackWheelModels[104].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 255
		leftTrackWheelModels[104].setRotationPoint(3F, -10.25F, 30.5F);

		leftTrackWheelModels[105].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 256
		leftTrackWheelModels[105].setRotationPoint(-13F, -10.25F, 30.5F);

		leftTrackWheelModels[106].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 257
		leftTrackWheelModels[106].setRotationPoint(-13F, -10.25F, 30.5F);

		leftTrackWheelModels[107].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 258
		leftTrackWheelModels[107].setRotationPoint(-13F, -10.25F, 30.5F);

		leftTrackWheelModels[108].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 259
		leftTrackWheelModels[108].setRotationPoint(-34F, -10.25F, 30.5F);

		leftTrackWheelModels[109].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 260
		leftTrackWheelModels[109].setRotationPoint(-34F, -10.25F, 30.5F);

		leftTrackWheelModels[110].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 261
		leftTrackWheelModels[110].setRotationPoint(-34F, -10.25F, 30.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 139
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 633, 137, textureX, textureY); // Box 140
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 697, 137, textureX, textureY); // Box 141
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Box 142
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Box 143
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 144
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 145
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 146
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 147
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Box 148
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Box 149
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 150
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 151
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 152
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 153
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 609, 145, textureX, textureY); // Box 154
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 155
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 156
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 157
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 657, 145, textureX, textureY); // Box 158
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 159
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Box 160
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 857, 145, textureX, textureY); // Box 161
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 937, 145, textureX, textureY); // Box 162
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 163
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 164
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 165
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 166
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 167
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 168
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 169
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 170
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 171
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 172
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 173
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 529, 153, textureX, textureY); // Box 174
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 681, 153, textureX, textureY); // Box 175
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Box 176
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Box 177
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 178
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 785, 153, textureX, textureY); // Box 179
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 833, 153, textureX, textureY); // Box 180
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 181
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 905, 161, textureX, textureY); // Box 182
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 953, 161, textureX, textureY); // Box 183
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 641, 153, textureX, textureY); // Box 184
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 185
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 186
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 187
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 188
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 189
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 190
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 191
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 192
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 193
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 194
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 195
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 196
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 665, 169, textureX, textureY); // Box 197
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 198
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 713, 169, textureX, textureY); // Box 199
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 745, 169, textureX, textureY); // Box 200
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 201
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 202
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 203
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 585, 169, textureX, textureY); // Box 204
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Box 205
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 809, 169, textureX, textureY); // Box 206
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 985, 169, textureX, textureY); // Box 207
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 841, 169, textureX, textureY); // Box 208
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 209
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 537, 177, textureX, textureY); // Box 210
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 609, 177, textureX, textureY); // Box 211
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 212
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 889, 169, textureX, textureY); // Box 213
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 937, 169, textureX, textureY); // Box 214
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 215
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 216
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 217
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 218
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 219
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 865, 177, textureX, textureY); // Box 220
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Box 221
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 961, 177, textureX, textureY); // Box 222
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 235
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 236
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 537, 193, textureX, textureY); // Box 237
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 985, 185, textureX, textureY); // Box 238
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 239
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 240
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 585, 193, textureX, textureY); // Box 241
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 617, 193, textureX, textureY); // Box 242
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 769, 193, textureX, textureY); // Box 243
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 801, 193, textureX, textureY); // Box 244
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 849, 193, textureX, textureY); // Box 245
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 897, 193, textureX, textureY); // Box 246
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 262
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 263
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 264
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 265
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 266
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 267
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 268
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 269
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 270
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 271
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 272
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 273
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 274
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 275
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 276

		rightTrackWheelModels[0].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 139
		rightTrackWheelModels[0].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[1].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 140
		rightTrackWheelModels[1].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[2].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 141
		rightTrackWheelModels[2].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[3].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 142
		rightTrackWheelModels[3].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[4].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 143
		rightTrackWheelModels[4].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[5].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 144
		rightTrackWheelModels[5].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[6].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 145
		rightTrackWheelModels[6].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[7].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 146
		rightTrackWheelModels[7].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[8].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 147
		rightTrackWheelModels[8].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[9].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 148
		rightTrackWheelModels[9].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[10].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 149
		rightTrackWheelModels[10].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[11].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 150
		rightTrackWheelModels[11].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[12].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 151
		rightTrackWheelModels[12].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[13].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 152
		rightTrackWheelModels[13].setRotationPoint(-44F, 1.75F, -26F);

		rightTrackWheelModels[14].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightTrackWheelModels[14].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[15].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 154
		rightTrackWheelModels[15].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[16].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 155
		rightTrackWheelModels[16].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[17].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 156
		rightTrackWheelModels[17].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[18].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 157
		rightTrackWheelModels[18].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[19].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 158
		rightTrackWheelModels[19].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[20].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 159
		rightTrackWheelModels[20].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[21].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 160
		rightTrackWheelModels[21].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[22].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 161
		rightTrackWheelModels[22].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[23].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 162
		rightTrackWheelModels[23].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[24].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 163
		rightTrackWheelModels[24].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[25].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 164
		rightTrackWheelModels[25].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[26].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 165
		rightTrackWheelModels[26].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[27].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 166
		rightTrackWheelModels[27].setRotationPoint(-24F, 1.75F, -26F);

		rightTrackWheelModels[28].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 167
		rightTrackWheelModels[28].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[29].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 168
		rightTrackWheelModels[29].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[30].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 169
		rightTrackWheelModels[30].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[31].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 170
		rightTrackWheelModels[31].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[32].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 171
		rightTrackWheelModels[32].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[33].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 172
		rightTrackWheelModels[33].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[34].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 173
		rightTrackWheelModels[34].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[35].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 174
		rightTrackWheelModels[35].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[36].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 175
		rightTrackWheelModels[36].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[37].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 176
		rightTrackWheelModels[37].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[38].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 177
		rightTrackWheelModels[38].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[39].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 178
		rightTrackWheelModels[39].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[40].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 179
		rightTrackWheelModels[40].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[41].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 180
		rightTrackWheelModels[41].setRotationPoint(-5F, 1.75F, -26F);

		rightTrackWheelModels[42].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 181
		rightTrackWheelModels[42].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[43].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 182
		rightTrackWheelModels[43].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[44].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 183
		rightTrackWheelModels[44].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[45].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 184
		rightTrackWheelModels[45].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[46].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 185
		rightTrackWheelModels[46].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[47].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 186
		rightTrackWheelModels[47].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[48].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 187
		rightTrackWheelModels[48].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[49].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 188
		rightTrackWheelModels[49].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[50].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 189
		rightTrackWheelModels[50].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[51].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 190
		rightTrackWheelModels[51].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[52].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 191
		rightTrackWheelModels[52].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[53].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 192
		rightTrackWheelModels[53].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[54].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		rightTrackWheelModels[54].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[55].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 194
		rightTrackWheelModels[55].setRotationPoint(12F, 1.75F, -26F);

		rightTrackWheelModels[56].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 195
		rightTrackWheelModels[56].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[57].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 196
		rightTrackWheelModels[57].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[58].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 197
		rightTrackWheelModels[58].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[59].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 198
		rightTrackWheelModels[59].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[60].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 199
		rightTrackWheelModels[60].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[61].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 200
		rightTrackWheelModels[61].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[62].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 201
		rightTrackWheelModels[62].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[63].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 202
		rightTrackWheelModels[63].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[64].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 203
		rightTrackWheelModels[64].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[65].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 204
		rightTrackWheelModels[65].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[66].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 205
		rightTrackWheelModels[66].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[67].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 206
		rightTrackWheelModels[67].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[68].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 207
		rightTrackWheelModels[68].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[69].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 208
		rightTrackWheelModels[69].setRotationPoint(31F, 1.75F, -26F);

		rightTrackWheelModels[70].addShapeBox(-6F, 2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 209
		rightTrackWheelModels[70].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[71].addShapeBox(-6F, -2F, -9.8F, 12, 4, 9, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 210
		rightTrackWheelModels[71].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[72].addShapeBox(-6F, -6F, -9.8F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 211
		rightTrackWheelModels[72].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[73].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 11, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 212
		rightTrackWheelModels[73].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[74].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 11, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 213
		rightTrackWheelModels[74].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[75].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 214
		rightTrackWheelModels[75].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[76].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 11, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 215
		rightTrackWheelModels[76].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[77].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 11, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 216
		rightTrackWheelModels[77].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[78].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 217
		rightTrackWheelModels[78].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[79].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 11, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 218
		rightTrackWheelModels[79].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[80].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 11, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 219
		rightTrackWheelModels[80].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[81].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 10, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 220
		rightTrackWheelModels[81].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[82].addShapeBox(-2.5F, -1F, -10F, 5, 2, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 221
		rightTrackWheelModels[82].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[83].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 222
		rightTrackWheelModels[83].setRotationPoint(49F, 1.75F, -26F);

		rightTrackWheelModels[84].addShapeBox(-6.5F, -5.8F, -9F, 13, 4, 9, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 235
		rightTrackWheelModels[84].setRotationPoint(-57.5F, -5F, -25.8F);

		rightTrackWheelModels[85].addShapeBox(-6.5F, -1.5F, -9F, 13, 3, 9, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 236
		rightTrackWheelModels[85].setRotationPoint(-57.5F, -5F, -25.8F);

		rightTrackWheelModels[86].addShapeBox(-6.5F, 1.8F, -9F, 13, 4, 9, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 237
		rightTrackWheelModels[86].setRotationPoint(-57.5F, -5F, -25.8F);

		rightTrackWheelModels[87].addShapeBox(-2.5F, 0.45F, -8.5F, 5, 2, 9, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 238
		rightTrackWheelModels[87].setRotationPoint(-57.5F, -5F, -26.8F);

		rightTrackWheelModels[88].addShapeBox(-2.5F, -1F, -8.5F, 5, 2, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 239
		rightTrackWheelModels[88].setRotationPoint(-57.5F, -5F, -26.8F);

		rightTrackWheelModels[89].addShapeBox(-2.5F, -2.45F, -8.5F, 5, 2, 9, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 240
		rightTrackWheelModels[89].setRotationPoint(-57.5F, -5F, -26.8F);

		rightTrackWheelModels[90].addShapeBox(-2.5F, -2.45F, -8.5F, 5, 2, 9, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 241
		rightTrackWheelModels[90].setRotationPoint(67.5F, -7F, -26.8F);

		rightTrackWheelModels[91].addShapeBox(-2.5F, -1F, -8.5F, 5, 2, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 242
		rightTrackWheelModels[91].setRotationPoint(67.5F, -7F, -26.8F);

		rightTrackWheelModels[92].addShapeBox(-2.5F, 0.45F, -8.5F, 5, 2, 9, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 243
		rightTrackWheelModels[92].setRotationPoint(67.5F, -7F, -26.8F);

		rightTrackWheelModels[93].addShapeBox(-6.5F, -5.8F, -9F, 13, 4, 9, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 244
		rightTrackWheelModels[93].setRotationPoint(67.5F, -7F, -25.8F);

		rightTrackWheelModels[94].addShapeBox(-6.5F, -1.5F, -9F, 13, 3, 9, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 245
		rightTrackWheelModels[94].setRotationPoint(67.5F, -7F, -25.8F);

		rightTrackWheelModels[95].addShapeBox(-6.5F, 1.8F, -9F, 13, 4, 9, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 246
		rightTrackWheelModels[95].setRotationPoint(67.5F, -7F, -25.8F);

		rightTrackWheelModels[96].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 262
		rightTrackWheelModels[96].setRotationPoint(-34F, -10.25F, -28.5F);

		rightTrackWheelModels[97].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 263
		rightTrackWheelModels[97].setRotationPoint(-34F, -10.25F, -28.5F);

		rightTrackWheelModels[98].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 264
		rightTrackWheelModels[98].setRotationPoint(-34F, -10.25F, -28.5F);

		rightTrackWheelModels[99].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 265
		rightTrackWheelModels[99].setRotationPoint(-13F, -10.25F, -28.5F);

		rightTrackWheelModels[100].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 266
		rightTrackWheelModels[100].setRotationPoint(-13F, -10.25F, -28.5F);

		rightTrackWheelModels[101].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 267
		rightTrackWheelModels[101].setRotationPoint(-13F, -10.25F, -28.5F);

		rightTrackWheelModels[102].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 268
		rightTrackWheelModels[102].setRotationPoint(3F, -10.25F, -28.5F);

		rightTrackWheelModels[103].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 269
		rightTrackWheelModels[103].setRotationPoint(3F, -10.25F, -28.5F);

		rightTrackWheelModels[104].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 270
		rightTrackWheelModels[104].setRotationPoint(3F, -10.25F, -28.5F);

		rightTrackWheelModels[105].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 271
		rightTrackWheelModels[105].setRotationPoint(22F, -10.25F, -28.5F);

		rightTrackWheelModels[106].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 272
		rightTrackWheelModels[106].setRotationPoint(22F, -10.25F, -28.5F);

		rightTrackWheelModels[107].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 273
		rightTrackWheelModels[107].setRotationPoint(22F, -10.25F, -28.5F);

		rightTrackWheelModels[108].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 274
		rightTrackWheelModels[108].setRotationPoint(41F, -10.25F, -28.5F);

		rightTrackWheelModels[109].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 275
		rightTrackWheelModels[109].setRotationPoint(41F, -10.25F, -28.5F);

		rightTrackWheelModels[110].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 276
		rightTrackWheelModels[110].setRotationPoint(41F, -10.25F, -28.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 10
		leftTrackModel[1] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 291
		leftTrackModel[2] = new ModelRendererTurbo(this, 665, 201, textureX, textureY); // Box 292
		leftTrackModel[3] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 293
		leftTrackModel[4] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 295
		leftTrackModel[5] = new ModelRendererTurbo(this, 961, 193, textureX, textureY); // Box 296
		leftTrackModel[6] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 297
		leftTrackModel[7] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 298
		leftTrackModel[8] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 299
		leftTrackModel[9] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 302
		leftTrackModel[10] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 303

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 96, 1, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 10
		leftTrackModel[0].setRotationPoint(-45F, 9F, 24.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 111, 1, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 291
		leftTrackModel[1].setRotationPoint(-41F, -14F, 24.5F);

		leftTrackModel[2].addShapeBox(-19F, 0F, 0F, 19, 1, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 292
		leftTrackModel[2].setRotationPoint(-41F, -14F, 24.5F);
		leftTrackModel[2].rotateAngleZ = 0.08726646F;

		leftTrackModel[3].addShapeBox(-18F, 0F, 0F, 18, 1, 14, 0F,0F, 0.15F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0F, 0.25F, 0F); // Box 293
		leftTrackModel[3].setRotationPoint(-45F, 9F, 24.5F);
		leftTrackModel[3].rotateAngleZ = -0.50614548F;

		leftTrackModel[4].addShapeBox(-18F, 0F, 0F, 22, 1, 14, 0F,0F, 0.25F, 0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, 0F, 0.25F, 0F); // Box 295
		leftTrackModel[4].setRotationPoint(66.15F, 0.4F, 24.5F);
		leftTrackModel[4].rotateAngleZ = 0.50614548F;

		leftTrackModel[5].addShapeBox(-1F, 0F, 0F, 4, 1, 14, 0F,0F, 0.25F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, 0F, 0.25F, 0F, 1.25F, -0.35F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.25F, -0.35F, 0F); // Box 296
		leftTrackModel[5].setRotationPoint(70.9F, -2.6F, 24.5F);
		leftTrackModel[5].rotateAngleZ = 0.9424778F;

		leftTrackModel[6].addShapeBox(-1F, 0F, 0F, 5, 1, 14, 0F,1.25F, -0.35F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.25F, -0.35F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 297
		leftTrackModel[6].setRotationPoint(71.6F, -12.6F, 24.5F);
		leftTrackModel[6].rotateAngleZ = -0.9424778F;

		leftTrackModel[7].addShapeBox(-1F, 0F, 0F, 1, 5, 14, 0F,0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.6F, -0.1F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0.6F, 0F, 0.6F, -0.1F, 0F); // Box 298
		leftTrackModel[7].setRotationPoint(74.6F, -9.6F, 24.5F);

		leftTrackModel[8].addShapeBox(-1F, 0F, 0F, 5, 1, 14, 0F,0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 1.25F, -0.35F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.25F, -0.35F, 0F); // Box 299
		leftTrackModel[8].setRotationPoint(-63.05F, -10F, 24.5F);
		leftTrackModel[8].rotateAngleZ = 0.82030475F;

		leftTrackModel[9].addShapeBox(-1F, 0F, 0F, 1, 6, 14, 0F,0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.6F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, -0.5F, 0.6F, 0F); // Box 302
		leftTrackModel[9].setRotationPoint(-63F, -9F, 24.5F);
		leftTrackModel[9].rotateAngleZ = -0.26179939F;

		leftTrackModel[10].addShapeBox(-1F, 0F, 0F, 4, 1, 14, 0F,-0.1F, 0.25F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F, 0F, -0.1F, 0.25F, 0F, 1.25F, -0.35F, 0F, 0.4F, 0.25F, 0F, 0.4F, 0.25F, 0F, 1.25F, -0.35F, 0F); // Box 303
		leftTrackModel[10].setRotationPoint(-63.1F, -1.8F, 24.5F);
		leftTrackModel[10].rotateAngleZ = -0.71558499F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 304
		rightTrackModel[1] = new ModelRendererTurbo(this, 825, 209, textureX, textureY); // Box 305
		rightTrackModel[2] = new ModelRendererTurbo(this, 985, 201, textureX, textureY); // Box 306
		rightTrackModel[3] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 307
		rightTrackModel[4] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Box 308
		rightTrackModel[5] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 309
		rightTrackModel[6] = new ModelRendererTurbo(this, 665, 217, textureX, textureY); // Box 310
		rightTrackModel[7] = new ModelRendererTurbo(this, 769, 209, textureX, textureY); // Box 311
		rightTrackModel[8] = new ModelRendererTurbo(this, 905, 209, textureX, textureY); // Box 312
		rightTrackModel[9] = new ModelRendererTurbo(this, 961, 209, textureX, textureY); // Box 313
		rightTrackModel[10] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 314

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 96, 1, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 304
		rightTrackModel[0].setRotationPoint(-45F, 9F, -37.5F);

		rightTrackModel[1].addShapeBox(-18F, 0F, 0F, 22, 1, 14, 0F,0F, 0.25F, 0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, 0F, 0.25F, 0F); // Box 305
		rightTrackModel[1].setRotationPoint(66.15F, 0.4F, -37.5F);
		rightTrackModel[1].rotateAngleZ = 0.50614548F;

		rightTrackModel[2].addShapeBox(-1F, 0F, 0F, 4, 1, 14, 0F,0F, 0.25F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, 0F, 0.25F, 0F, 1.25F, -0.35F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.25F, -0.35F, 0F); // Box 306
		rightTrackModel[2].setRotationPoint(70.9F, -2.6F, -37.5F);
		rightTrackModel[2].rotateAngleZ = 0.9424778F;

		rightTrackModel[3].addShapeBox(-1F, 0F, 0F, 1, 5, 14, 0F,0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.6F, -0.1F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0.6F, 0F, 0.6F, -0.1F, 0F); // Box 307
		rightTrackModel[3].setRotationPoint(74.6F, -9.6F, -37.5F);

		rightTrackModel[4].addShapeBox(-1F, 0F, 0F, 5, 1, 14, 0F,1.25F, -0.35F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.25F, -0.35F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 308
		rightTrackModel[4].setRotationPoint(71.6F, -12.6F, -37.5F);
		rightTrackModel[4].rotateAngleZ = -0.9424778F;

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 111, 1, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 309
		rightTrackModel[5].setRotationPoint(-41F, -14F, -37.5F);

		rightTrackModel[6].addShapeBox(-19F, 0F, 0F, 19, 1, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 310
		rightTrackModel[6].setRotationPoint(-41F, -14F, -37.5F);
		rightTrackModel[6].rotateAngleZ = 0.08726646F;

		rightTrackModel[7].addShapeBox(-1F, 0F, 0F, 5, 1, 14, 0F,0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 1.25F, -0.35F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.25F, -0.35F, 0F); // Box 311
		rightTrackModel[7].setRotationPoint(-63.05F, -10F, -37.5F);
		rightTrackModel[7].rotateAngleZ = 0.82030475F;

		rightTrackModel[8].addShapeBox(-1F, 0F, 0F, 1, 6, 14, 0F,0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.6F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, -0.5F, 0.6F, 0F); // Box 312
		rightTrackModel[8].setRotationPoint(-63F, -9F, -37.5F);
		rightTrackModel[8].rotateAngleZ = -0.26179939F;

		rightTrackModel[9].addShapeBox(-1F, 0F, 0F, 4, 1, 14, 0F,-0.1F, 0.25F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F, 0F, -0.1F, 0.25F, 0F, 1.25F, -0.35F, 0F, 0.4F, 0.25F, 0F, 0.4F, 0.25F, 0F, 1.25F, -0.35F, 0F); // Box 313
		rightTrackModel[9].setRotationPoint(-63.1F, -1.8F, -37.5F);
		rightTrackModel[9].rotateAngleZ = -0.71558499F;

		rightTrackModel[10].addShapeBox(-18F, 0F, 0F, 18, 1, 14, 0F,0F, 0.15F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0F, 0.25F, 0F); // Box 314
		rightTrackModel[10].setRotationPoint(-45F, 9F, -37.5F);
		rightTrackModel[10].rotateAngleZ = -0.50614548F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[23];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 359
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 633, 281, textureX, textureY); // Box 360
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 361
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 362
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 368
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 369
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 913, 281, textureX, textureY); // Box 370
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 371
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Box 372
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 373
		gun_1_Model[0][10] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 374
		gun_1_Model[0][11] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 375
		gun_1_Model[0][12] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 377
		gun_1_Model[0][13] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 378
		gun_1_Model[0][14] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 379
		gun_1_Model[0][15] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 380
		gun_1_Model[0][16] = new ModelRendererTurbo(this, 593, 289, textureX, textureY); // Box 388
		gun_1_Model[0][17] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 389
		gun_1_Model[0][18] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 398
		gun_1_Model[0][19] = new ModelRendererTurbo(this, 521, 161, textureX, textureY); // Box 401
		gun_1_Model[0][20] = new ModelRendererTurbo(this, 673, 161, textureX, textureY); // Box 402
		gun_1_Model[0][21] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 403
		gun_1_Model[0][22] = new ModelRendererTurbo(this, 529, 177, textureX, textureY); // Box 404

		gun_1_Model[0][0].addShapeBox(3F, -2.5F, -2.1F, 3, 1, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.4F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0.4F, 0F, -0.2F); // Box 359

		gun_1_Model[0][1].addShapeBox(-1F, -1.4F, -1.6F, 13, 1, 1, 0F,0F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, 0.1F, -0.35F, -0.4F, 0.1F, -0.35F, 0F, 0.1F, -0.35F, 0F, 0.1F, -0.35F); // Box 360

		gun_1_Model[0][2].addShapeBox(1F, -0.4F, -1.6F, 9, 1, 1, 0F,-0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F); // Box 361

		gun_1_Model[0][3].addShapeBox(10F, -0.4F, -1.6F, 2, 1, 1, 0F,0F, -0.1F, -0.1F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, -0.1F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, 0F, 0.1F, -0.1F); // Box 362

		gun_1_Model[0][4].addShapeBox(1F, -1.3F, 0.4F, 3, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 368

		gun_1_Model[0][5].addShapeBox(1F, -0.5F, 0.8F, 3, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -0.6F, 0F, -0.2F); // Box 369

		gun_1_Model[0][6].addShapeBox(-0.35F, 0.7F, 0.6F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 370

		gun_1_Model[0][7].addShapeBox(11.65F, -0.1F, 0.35F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 371

		gun_1_Model[0][8].addShapeBox(-0.35F, 0.7F, -1.6F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 372

		gun_1_Model[0][9].addShapeBox(11.65F, -0.1F, -1.45F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 373

		gun_1_Model[0][10].addShapeBox(-1.5F, -1F, 0.7F, 3, 6, 1, 0F,-1F, 0.2F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -1F, 0.2F, -0.2F, 1F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, 1F, -0.2F, -0.2F); // Box 374

		gun_1_Model[0][11].addShapeBox(-1.5F, -1F, -1.7F, 3, 6, 1, 0F,-1F, 0.2F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -1F, 0.2F, -0.2F, 1F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, 1F, -0.2F, -0.2F); // Box 375

		gun_1_Model[0][12].addShapeBox(-2F, -1.8F, 0.8F, 2, 3, 1, 0F,0F, 0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 1.2F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 1.2F, -0.2F); // Box 377

		gun_1_Model[0][13].addShapeBox(-2F, -1.8F, -1.8F, 2, 3, 1, 0F,0F, 0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 1.2F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 1.2F, -0.2F); // Box 378

		gun_1_Model[0][14].addShapeBox(-3F, -1.8F, 0.8F, 1, 3, 1, 0F,-0.3F, -1.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.3F, -1.2F, -0.2F, -0.4F, 0F, -0.2F, 0F, 1.2F, -0.2F, 0F, 1.2F, -0.2F, -0.4F, 0F, -0.2F); // Box 379

		gun_1_Model[0][15].addShapeBox(-3F, -1.8F, -1.8F, 1, 3, 1, 0F,-0.3F, -1.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.3F, -1.2F, -0.2F, -0.4F, 0F, -0.2F, 0F, 1.2F, -0.2F, 0F, 1.2F, -0.2F, -0.4F, 0F, -0.2F); // Box 380

		gun_1_Model[0][16].addShapeBox(3F, -2F, -9.6F, 4, 5, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388

		gun_1_Model[0][17].addShapeBox(3F, -2F, -9.6F, 4, 1, 8, 0F,0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 389

		gun_1_Model[0][18].addShapeBox(3F, -1.2F, 0.4F, 1, 1, 3, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 398

		gun_1_Model[0][19].addShapeBox(1.5F, -4.5F, -1.8F, 1, 5, 1, 0F,-0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 401

		gun_1_Model[0][20].addShapeBox(1.5F, -6.1F, -2.8F, 1, 2, 1, 0F,-0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 402

		gun_1_Model[0][21].addShapeBox(1.5F, -4.5F, -2.2F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F); // Box 403

		gun_1_Model[0][22].addShapeBox(1.3F, -6.5F, -3F, 3, 2, 1, 0F,-0.1F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 404

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(-19.5F, -45.8F, -22F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[22];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 985, 297, textureX, textureY); // Box 356
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 357
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 358
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 363
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 364
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 366
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 553, 153, textureX, textureY); // Box 367
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 489, 297, textureX, textureY); // Box 381
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 633, 153, textureX, textureY); // Box 382
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Box 383
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 384
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 929, 153, textureX, textureY); // Box 385
		gun_1_Model[2][12] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 386
		gun_1_Model[2][13] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 387
		gun_1_Model[2][14] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 390
		gun_1_Model[2][15] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 391
		gun_1_Model[2][16] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 392
		gun_1_Model[2][17] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 393
		gun_1_Model[2][18] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 394
		gun_1_Model[2][19] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 395
		gun_1_Model[2][20] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 396
		gun_1_Model[2][21] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Box 397

		gun_1_Model[2][0].addShapeBox(-1F, -1.5F, -1F, 13, 3, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.4F, -0.05F, 0F, -0.4F, -0.05F, 0F, -0.4F, -0.05F, 0F, -0.4F, -0.05F); // Box 356

		gun_1_Model[2][1].addShapeBox(3F, -2.5F, -1F, 4, 1, 2, 0F,0F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0.4F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.4F, 0F, 0.3F); // Box 357

		gun_1_Model[2][2].addShapeBox(7.5F, -2.5F, -1F, 1, 1, 2, 0F,0F, -0.2F, 0.3F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, 0.3F, 0F, 0F, 0.3F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, 0F, 0.3F); // Box 358

		gun_1_Model[2][3].addShapeBox(2.5F, -1F, 0.75F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 363

		gun_1_Model[2][4].addShapeBox(12F, -0.5F, -1F, 1, 2, 2, 0F,0F, 0.1F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, 0F, 0.1F, -0.05F, 0F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F, 0F, -0.4F, -0.05F); // Box 364

		gun_1_Model[2][5].addShapeBox(-0.5F, -2.5F, -1F, 1, 1, 2, 0F,-0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F); // Box 366

		gun_1_Model[2][6].addShapeBox(0.5F, -2.5F, -1F, 2, 1, 2, 0F,0.3F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, 0.3F, -0.5F, -0.6F, 0.3F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, 0.3F, 0F, -0.6F); // Box 367

		gun_1_Model[2][7].addShapeBox(12F, -1.3F, -0.5F, 20, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 381

		gun_1_Model[2][8].addShapeBox(12F, -0.2F, -0.5F, 8, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 382

		gun_1_Model[2][9].addShapeBox(20.5F, -0.2F, -0.5F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 383

		gun_1_Model[2][10].addShapeBox(19.5F, -0.2F, -0.5F, 2, 1, 1, 0F,0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F); // Box 384

		gun_1_Model[2][11].addShapeBox(18.9F, -1.3F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 385

		gun_1_Model[2][12].addShapeBox(32F, -1.3F, -0.5F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 386

		gun_1_Model[2][13].addShapeBox(33F, -1.3F, -0.5F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 1F, 0.05F, 0.05F, 1F, 0.05F, 0.05F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 1F, 0.05F, 0.05F, 1F, 0.05F, 0.05F, 0F, -0.15F, -0.15F); // Box 387

		gun_1_Model[2][14].addShapeBox(30F, -1.3F, -0.5F, 2, 1, 1, 0F,0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 390

		gun_1_Model[2][15].addShapeBox(25.9F, -2.9F, -0.5F, 1, 2, 1, 0F,-0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 391

		gun_1_Model[2][16].addShapeBox(25.9F, -1.3F, -0.5F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 392

		gun_1_Model[2][17].addShapeBox(25.9F, -4.1F, -0.95F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 393

		gun_1_Model[2][18].addShapeBox(25.9F, -3.7F, -0.15F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.52F, -0.2F, -0.4F, -0.52F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 394

		gun_1_Model[2][19].addShapeBox(25.9F, -3.7F, -0.85F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.52F, -0.2F, -0.4F, -0.52F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 395

		gun_1_Model[2][20].addShapeBox(25.9F, -4.1F, -0.05F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 396

		gun_1_Model[2][21].addShapeBox(25.9F, -3.65F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.15F, -0.42F, -0.4F, -0.15F, -0.42F, -0.4F, -0.15F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F); // Box 397

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(-19.5F, -45.8F, -22F);
		}


		registerGunModel("AntiAirGun", gun_1_Model);
	}
}