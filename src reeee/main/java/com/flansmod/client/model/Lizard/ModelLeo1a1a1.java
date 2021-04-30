//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.06.2017 - 21:40:31
// Last changed on: 23.06.2017 - 21:40:31

package com.flansmod.client.model.Lizard; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLeo1a1a1 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelLeo1a1a1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[242];
		turretModel = new ModelRendererTurbo[162];
		barrelModel = new ModelRendererTurbo[27];
		leftTrackWheelModels = new ModelRendererTurbo[36];
		rightTrackWheelModels = new ModelRendererTurbo[36];
		leftTrackModel = new ModelRendererTurbo[14];
		rightTrackModel = new ModelRendererTurbo[14];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 45
		bodyModel[21] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 48
		bodyModel[22] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 49
		bodyModel[23] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 64
		bodyModel[24] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 65
		bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 66
		bodyModel[26] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 67
		bodyModel[27] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 68
		bodyModel[28] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 69
		bodyModel[29] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 70
		bodyModel[30] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 71
		bodyModel[31] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 72
		bodyModel[32] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 73
		bodyModel[33] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 74
		bodyModel[34] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 75
		bodyModel[35] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 76
		bodyModel[36] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 77
		bodyModel[37] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 78
		bodyModel[38] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 79
		bodyModel[39] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 80
		bodyModel[40] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 81
		bodyModel[41] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 82
		bodyModel[42] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 83
		bodyModel[43] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 84
		bodyModel[44] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 85
		bodyModel[45] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 86
		bodyModel[46] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 87
		bodyModel[47] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 88
		bodyModel[48] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 89
		bodyModel[49] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 90
		bodyModel[50] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 91
		bodyModel[51] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 92
		bodyModel[52] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 93
		bodyModel[53] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 94
		bodyModel[54] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 95
		bodyModel[55] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 96
		bodyModel[56] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 97
		bodyModel[57] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 98
		bodyModel[58] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 99
		bodyModel[59] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 101
		bodyModel[61] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 102
		bodyModel[62] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 103
		bodyModel[63] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 104
		bodyModel[64] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 105
		bodyModel[65] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 106
		bodyModel[66] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 107
		bodyModel[67] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 108
		bodyModel[68] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 109
		bodyModel[69] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 110
		bodyModel[70] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 111
		bodyModel[71] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 112
		bodyModel[72] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Box 222
		bodyModel[73] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 223
		bodyModel[74] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 224
		bodyModel[75] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Box 225
		bodyModel[76] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 226
		bodyModel[77] = new ModelRendererTurbo(this, 281, 249, textureX, textureY); // Box 177
		bodyModel[78] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Box 178
		bodyModel[79] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 179
		bodyModel[80] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 180
		bodyModel[81] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 782
		bodyModel[82] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 783
		bodyModel[83] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 784
		bodyModel[84] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 785
		bodyModel[85] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 786
		bodyModel[86] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 787
		bodyModel[87] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 788
		bodyModel[88] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 789
		bodyModel[89] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 790
		bodyModel[90] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 779
		bodyModel[91] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 780
		bodyModel[92] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 781
		bodyModel[93] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 794
		bodyModel[94] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 795
		bodyModel[95] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 796
		bodyModel[96] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 622
		bodyModel[97] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 623
		bodyModel[98] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 624
		bodyModel[99] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 625
		bodyModel[100] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 626
		bodyModel[101] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 627
		bodyModel[102] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 628
		bodyModel[103] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 629
		bodyModel[104] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 630
		bodyModel[105] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 631
		bodyModel[106] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 214
		bodyModel[107] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 609
		bodyModel[108] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 610
		bodyModel[109] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 611
		bodyModel[110] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 612
		bodyModel[111] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 616
		bodyModel[112] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 617
		bodyModel[113] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 618
		bodyModel[114] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 619
		bodyModel[115] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 620
		bodyModel[116] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 621
		bodyModel[117] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 225
		bodyModel[118] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 639
		bodyModel[119] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 640
		bodyModel[120] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 641
		bodyModel[121] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 642
		bodyModel[122] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 643
		bodyModel[123] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 231
		bodyModel[124] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 232
		bodyModel[125] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 233
		bodyModel[126] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 234
		bodyModel[127] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 235
		bodyModel[128] = new ModelRendererTurbo(this, 9, 369, textureX, textureY); // Box 328
		bodyModel[129] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 365
		bodyModel[130] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 366
		bodyModel[131] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 367
		bodyModel[132] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 368
		bodyModel[133] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 366
		bodyModel[134] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 367
		bodyModel[135] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 368
		bodyModel[136] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 369
		bodyModel[137] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 370
		bodyModel[138] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 371
		bodyModel[139] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 372
		bodyModel[140] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 373
		bodyModel[141] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 413
		bodyModel[142] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 414
		bodyModel[143] = new ModelRendererTurbo(this, 25, 289, textureX, textureY); // Box 415
		bodyModel[144] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Box 416
		bodyModel[145] = new ModelRendererTurbo(this, 505, 249, textureX, textureY); // Box 427
		bodyModel[146] = new ModelRendererTurbo(this, 377, 361, textureX, textureY); // Box 428
		bodyModel[147] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Box 429
		bodyModel[148] = new ModelRendererTurbo(this, 417, 385, textureX, textureY); // Box 430
		bodyModel[149] = new ModelRendererTurbo(this, 185, 393, textureX, textureY); // Box 431
		bodyModel[150] = new ModelRendererTurbo(this, 225, 393, textureX, textureY); // Box 432
		bodyModel[151] = new ModelRendererTurbo(this, 265, 393, textureX, textureY); // Box 433
		bodyModel[152] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 434
		bodyModel[153] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Box 435
		bodyModel[154] = new ModelRendererTurbo(this, 305, 393, textureX, textureY); // Box 436
		bodyModel[155] = new ModelRendererTurbo(this, 113, 345, textureX, textureY); // Box 437
		bodyModel[156] = new ModelRendererTurbo(this, 473, 297, textureX, textureY); // Box 438
		bodyModel[157] = new ModelRendererTurbo(this, 185, 321, textureX, textureY); // Box 439
		bodyModel[158] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 440
		bodyModel[159] = new ModelRendererTurbo(this, 161, 345, textureX, textureY); // Box 441
		bodyModel[160] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 442
		bodyModel[161] = new ModelRendererTurbo(this, 137, 345, textureX, textureY); // Box 443
		bodyModel[162] = new ModelRendererTurbo(this, 49, 353, textureX, textureY); // Box 444
		bodyModel[163] = new ModelRendererTurbo(this, 497, 361, textureX, textureY); // Box 445
		bodyModel[164] = new ModelRendererTurbo(this, 105, 385, textureX, textureY); // Box 446
		bodyModel[165] = new ModelRendererTurbo(this, 345, 393, textureX, textureY); // Box 447
		bodyModel[166] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Box 448
		bodyModel[167] = new ModelRendererTurbo(this, 409, 393, textureX, textureY); // Box 449
		bodyModel[168] = new ModelRendererTurbo(this, 441, 393, textureX, textureY); // Box 450
		bodyModel[169] = new ModelRendererTurbo(this, 473, 393, textureX, textureY); // Box 451
		bodyModel[170] = new ModelRendererTurbo(this, 105, 401, textureX, textureY); // Box 452
		bodyModel[171] = new ModelRendererTurbo(this, 137, 401, textureX, textureY); // Box 453
		bodyModel[172] = new ModelRendererTurbo(this, 169, 401, textureX, textureY); // Box 454
		bodyModel[173] = new ModelRendererTurbo(this, 201, 401, textureX, textureY); // Box 455
		bodyModel[174] = new ModelRendererTurbo(this, 233, 401, textureX, textureY); // Box 456
		bodyModel[175] = new ModelRendererTurbo(this, 265, 401, textureX, textureY); // Box 457
		bodyModel[176] = new ModelRendererTurbo(this, 297, 401, textureX, textureY); // Box 458
		bodyModel[177] = new ModelRendererTurbo(this, 329, 401, textureX, textureY); // Box 459
		bodyModel[178] = new ModelRendererTurbo(this, 353, 401, textureX, textureY); // Box 460
		bodyModel[179] = new ModelRendererTurbo(this, 417, 401, textureX, textureY); // Box 461
		bodyModel[180] = new ModelRendererTurbo(this, 1, 409, textureX, textureY); // Box 462
		bodyModel[181] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 463
		bodyModel[182] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 464
		bodyModel[183] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 465
		bodyModel[184] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 466
		bodyModel[185] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 467
		bodyModel[186] = new ModelRendererTurbo(this, 73, 369, textureX, textureY); // Box 468
		bodyModel[187] = new ModelRendererTurbo(this, 89, 369, textureX, textureY); // Box 469
		bodyModel[188] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 470
		bodyModel[189] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 471
		bodyModel[190] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 472
		bodyModel[191] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 473
		bodyModel[192] = new ModelRendererTurbo(this, 281, 369, textureX, textureY); // Box 474
		bodyModel[193] = new ModelRendererTurbo(this, 145, 337, textureX, textureY); // Box 475
		bodyModel[194] = new ModelRendererTurbo(this, 65, 353, textureX, textureY); // Box 476
		bodyModel[195] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 477
		bodyModel[196] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 478
		bodyModel[197] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 479
		bodyModel[198] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 480
		bodyModel[199] = new ModelRendererTurbo(this, 497, 369, textureX, textureY); // Box 481
		bodyModel[200] = new ModelRendererTurbo(this, 457, 385, textureX, textureY); // Box 482
		bodyModel[201] = new ModelRendererTurbo(this, 497, 393, textureX, textureY); // Box 483
		bodyModel[202] = new ModelRendererTurbo(this, 481, 401, textureX, textureY); // Box 484
		bodyModel[203] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 485
		bodyModel[204] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 486
		bodyModel[205] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 424
		bodyModel[206] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 425
		bodyModel[207] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 426
		bodyModel[208] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 490
		bodyModel[209] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 491
		bodyModel[210] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 492
		bodyModel[211] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 493
		bodyModel[212] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 494
		bodyModel[213] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 495
		bodyModel[214] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 496
		bodyModel[215] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 497
		bodyModel[216] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 498
		bodyModel[217] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 499
		bodyModel[218] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 500
		bodyModel[219] = new ModelRendererTurbo(this, 129, 369, textureX, textureY); // Box 293
		bodyModel[220] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 294
		bodyModel[221] = new ModelRendererTurbo(this, 329, 369, textureX, textureY); // Box 295
		bodyModel[222] = new ModelRendererTurbo(this, 25, 385, textureX, textureY); // Box 296
		bodyModel[223] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 297
		bodyModel[224] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 506
		bodyModel[225] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 507
		bodyModel[226] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Box 508
		bodyModel[227] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 509
		bodyModel[228] = new ModelRendererTurbo(this, 473, 385, textureX, textureY); // Box 510
		bodyModel[229] = new ModelRendererTurbo(this, 409, 401, textureX, textureY); // Box 511
		bodyModel[230] = new ModelRendererTurbo(this, 145, 409, textureX, textureY); // Box 521
		bodyModel[231] = new ModelRendererTurbo(this, 209, 409, textureX, textureY); // Box 525
		bodyModel[232] = new ModelRendererTurbo(this, 257, 409, textureX, textureY); // Box 526
		bodyModel[233] = new ModelRendererTurbo(this, 305, 409, textureX, textureY); // Box 527
		bodyModel[234] = new ModelRendererTurbo(this, 329, 409, textureX, textureY); // Box 528
		bodyModel[235] = new ModelRendererTurbo(this, 81, 417, textureX, textureY); // Box 282
		bodyModel[236] = new ModelRendererTurbo(this, 305, 417, textureX, textureY); // Box 526
		bodyModel[237] = new ModelRendererTurbo(this, 401, 417, textureX, textureY); // Box 527
		bodyModel[238] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 528
		bodyModel[239] = new ModelRendererTurbo(this, 193, 425, textureX, textureY); // Box 529
		bodyModel[240] = new ModelRendererTurbo(this, 249, 433, textureX, textureY); // Box 530
		bodyModel[241] = new ModelRendererTurbo(this, 137, 449, textureX, textureY); // Box 531

		bodyModel[0].addShapeBox(0F, 0F, 0F, 46, 6, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 5F, 3F, -0.25F, 5F, 3F, -0.25F, 4.75F, 0F, -0.25F, 4.75F); // Box 0
		bodyModel[0].setRotationPoint(-16.35F, -17.6F, -25F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 20, 6, 51, 0F,0F, 2.5F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 2.5F, -2F, 0F, -0.25F, 4.75F, 0F, -0.25F, 4.75F, 0F, -0.25F, 5F, 0F, -0.25F, 5F); // Box 1
		bodyModel[1].setRotationPoint(-36.35F, -17.6F, -25.25F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 27, 9, 51, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, -0.75F, 5F, 0F, -0.75F, 5F, 0F, -0.75F, 4.75F, 0F, -0.75F, 4.75F); // Box 2
		bodyModel[2].setRotationPoint(-63.35F, -20.1F, -25F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 14, 6, 51, 0F,0F, 0F, 0F, 0.5F, 0F, -7F, 0.5F, 0F, -7.25F, 0F, 0F, -0.25F, -3F, -0.25F, 5F, 6F, -2.25F, -7F, 6F, -2.25F, -7.25F, -3F, -0.25F, 4.75F); // Box 3
		bodyModel[3].setRotationPoint(29.65F, -17.6F, -25F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 96, 10, 39, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-63.35F, -11.85F, -20F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 96, 6, 39, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0.5F, -3F, -0.75F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-63.35F, -2.6F, -20F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 17, 5, 37, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, -0.25F, 0F, 0F, 0.5F); // Box 6
		bodyModel[6].setRotationPoint(32.65F, -13.85F, -18F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 17, 11, 37, 0F,0F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0.5F, 1.5F, -3F, 0.25F, 0F, -3F, 0.25F, -0.25F, 0F, 0.5F, 0.5F); // Box 7
		bodyModel[7].setRotationPoint(32.65F, -8.85F, -18F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(56.5F, -13.85F, 18.75F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4.5F, 0F, 0F, 1F, 0F); // Box 11
		bodyModel[9].setRotationPoint(56.5F, -13.85F, 27.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12
		bodyModel[10].setRotationPoint(61.5F, -9.85F, 18.75F);

		bodyModel[11].addShapeBox(0F, 0F, -0.5F, 5, 1, 2, 0F,0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 14
		bodyModel[11].setRotationPoint(56.5F, -7.85F, 29.75F);

		bodyModel[12].addShapeBox(0F, 0F, -0.5F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F); // Box 15
		bodyModel[12].setRotationPoint(54.5F, -11.85F, 29.75F);

		bodyModel[13].addShapeBox(0F, 0F, -0.5F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 16
		bodyModel[13].setRotationPoint(52.5F, -11.85F, 29.75F);

		bodyModel[14].addShapeBox(0F, 0F, -0.5F, 7, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F); // Box 17
		bodyModel[14].setRotationPoint(45.5F, -11.85F, 29.75F);

		bodyModel[15].addShapeBox(0F, 0F, -0.5F, 16, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 18
		bodyModel[15].setRotationPoint(29.5F, -11.85F, 29.75F);

		bodyModel[16].addShapeBox(0F, 0F, -0.5F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F); // Box 21
		bodyModel[16].setRotationPoint(23.5F, -11.85F, 29.75F);

		bodyModel[17].addShapeBox(0F, 0F, -0.5F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F); // Box 22
		bodyModel[17].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[18].addShapeBox(0F, 0F, -0.5F, 21, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[18].setRotationPoint(-62.5F, -11.85F, 29.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 28
		bodyModel[19].setRotationPoint(-63.1F, -11.85F, 18.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -2.75F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[20].setRotationPoint(61.5F, -9.85F, 29.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 23, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[21].setRotationPoint(33.5F, -13.85F, 18.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 24, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.9F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.15F, 1F, 0F); // Box 49
		bodyModel[22].setRotationPoint(32.5F, -13.85F, 27.75F);

		bodyModel[23].addShapeBox(0F, 0F, -0.5F, 16, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 64
		bodyModel[23].setRotationPoint(1.5F, -11.85F, 29.75F);

		bodyModel[24].addShapeBox(0F, 0F, -0.5F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F); // Box 65
		bodyModel[24].setRotationPoint(-4.5F, -11.85F, 29.75F);

		bodyModel[25].addShapeBox(0F, 0F, -0.5F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F); // Box 66
		bodyModel[25].setRotationPoint(-10.5F, -11.85F, 29.75F);

		bodyModel[26].addShapeBox(0F, 0F, -0.5F, 16, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 67
		bodyModel[26].setRotationPoint(-26.5F, -11.85F, 29.75F);

		bodyModel[27].addShapeBox(0F, 0F, -0.5F, 7, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F); // Box 68
		bodyModel[27].setRotationPoint(-33.5F, -11.85F, 29.75F);

		bodyModel[28].addShapeBox(0F, 0F, -0.5F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F); // Box 69
		bodyModel[28].setRotationPoint(-41.5F, -11.85F, 29.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[29].setRotationPoint(-63.1F, -11.85F, -29.25F);

		bodyModel[30].addShapeBox(0F, 0F, -0.5F, 21, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[30].setRotationPoint(-62.5F, -11.85F, -30F);

		bodyModel[31].addShapeBox(0F, 0F, -0.5F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F); // Box 72
		bodyModel[31].setRotationPoint(-41.5F, -11.85F, -30F);

		bodyModel[32].addShapeBox(0F, 0F, -0.5F, 7, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F); // Box 73
		bodyModel[32].setRotationPoint(-33.5F, -11.85F, -30F);

		bodyModel[33].addShapeBox(0F, 0F, -0.5F, 16, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 74
		bodyModel[33].setRotationPoint(-26.5F, -11.85F, -30F);

		bodyModel[34].addShapeBox(0F, 0F, -0.5F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F); // Box 75
		bodyModel[34].setRotationPoint(-10.5F, -11.85F, -30F);

		bodyModel[35].addShapeBox(0F, 0F, -0.5F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F); // Box 76
		bodyModel[35].setRotationPoint(-4.5F, -11.85F, -30F);

		bodyModel[36].addShapeBox(0F, 0F, -0.5F, 16, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 77
		bodyModel[36].setRotationPoint(1.5F, -11.85F, -30F);

		bodyModel[37].addShapeBox(0F, 0F, -0.5F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F); // Box 78
		bodyModel[37].setRotationPoint(17.5F, -11.85F, -30F);

		bodyModel[38].addShapeBox(0F, 0F, -0.5F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F); // Box 79
		bodyModel[38].setRotationPoint(23.5F, -11.85F, -30F);

		bodyModel[39].addShapeBox(0F, 0F, -0.5F, 16, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 80
		bodyModel[39].setRotationPoint(29.5F, -11.85F, -30F);

		bodyModel[40].addShapeBox(0F, 0F, -0.5F, 7, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F); // Box 81
		bodyModel[40].setRotationPoint(45.5F, -11.85F, -30F);

		bodyModel[41].addShapeBox(0F, 0F, -0.5F, 5, 1, 2, 0F,0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 82
		bodyModel[41].setRotationPoint(56.5F, -7.85F, -30F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1.5F, 0F, 0F, -2.75F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 83
		bodyModel[42].setRotationPoint(61.5F, -9.85F, -30F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 4.5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[43].setRotationPoint(56.5F, -13.85F, -30F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[44].setRotationPoint(56.5F, -13.85F, -27F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[45].setRotationPoint(61.5F, -9.85F, -28F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 23, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[46].setRotationPoint(33.5F, -13.85F, -27F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 24, 1, 3, 0F,0.9F, 0F, -1.75F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[47].setRotationPoint(32.5F, -13.85F, -30F);

		bodyModel[48].addShapeBox(0F, 0F, -0.5F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 89
		bodyModel[48].setRotationPoint(52.5F, -11.85F, -30F);

		bodyModel[49].addShapeBox(0F, 0F, -0.5F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F); // Box 90
		bodyModel[49].setRotationPoint(54.5F, -11.85F, -30F);

		bodyModel[50].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F); // Box 91
		bodyModel[50].setRotationPoint(29.5F, -4.35F, 29.75F);

		bodyModel[51].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 92
		bodyModel[51].setRotationPoint(38.5F, -4.35F, 29.75F);

		bodyModel[52].addShapeBox(0F, 0F, -0.5F, 3, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 93
		bodyModel[52].setRotationPoint(35.5F, -3.45F, 29.75F);

		bodyModel[53].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F); // Box 94
		bodyModel[53].setRotationPoint(1.5F, -4.35F, 29.75F);

		bodyModel[54].addShapeBox(0F, 0F, -0.5F, 3, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 95
		bodyModel[54].setRotationPoint(7.5F, -3.45F, 29.75F);

		bodyModel[55].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 96
		bodyModel[55].setRotationPoint(10.5F, -4.35F, 29.75F);

		bodyModel[56].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F); // Box 97
		bodyModel[56].setRotationPoint(-26.5F, -4.35F, 29.75F);

		bodyModel[57].addShapeBox(0F, 0F, -0.5F, 3, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 98
		bodyModel[57].setRotationPoint(-20.5F, -3.45F, 29.75F);

		bodyModel[58].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 99
		bodyModel[58].setRotationPoint(-17.5F, -4.35F, 29.75F);

		bodyModel[59].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F); // Box 100
		bodyModel[59].setRotationPoint(-26.5F, -4.35F, -30F);

		bodyModel[60].addShapeBox(0F, 0F, -0.5F, 3, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 101
		bodyModel[60].setRotationPoint(-20.5F, -3.45F, -30F);

		bodyModel[61].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 102
		bodyModel[61].setRotationPoint(-17.5F, -4.35F, -30F);

		bodyModel[62].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F); // Box 103
		bodyModel[62].setRotationPoint(1.5F, -4.35F, -30F);

		bodyModel[63].addShapeBox(0F, 0F, -0.5F, 3, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 104
		bodyModel[63].setRotationPoint(7.5F, -3.45F, -30F);

		bodyModel[64].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 105
		bodyModel[64].setRotationPoint(10.5F, -4.35F, -30F);

		bodyModel[65].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 106
		bodyModel[65].setRotationPoint(38.5F, -4.35F, -30F);

		bodyModel[66].addShapeBox(0F, 0F, -0.5F, 3, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 107
		bodyModel[66].setRotationPoint(35.5F, -3.45F, -30F);

		bodyModel[67].addShapeBox(0F, 0F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -5F, 0.6F, 0F); // Box 108
		bodyModel[67].setRotationPoint(29.5F, -4.35F, -30F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[68].setRotationPoint(48.5F, -12.85F, 18.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 110
		bodyModel[69].setRotationPoint(48.5F, -8.85F, 18.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 111
		bodyModel[70].setRotationPoint(48.5F, -8.85F, -19F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[71].setRotationPoint(48.5F, -12.85F, -19F);

		bodyModel[72].addShapeBox(0F, -0.5F, 0F, 26, 10, 2, 0F,0F, -2F, -0.25F, -1F, -2F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.25F, -1F, -1F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 222
		bodyModel[72].setRotationPoint(-62.35F, -21F, -25F);
		bodyModel[72].rotateAngleX = -0.68067841F;

		bodyModel[73].addShapeBox(-11F, -0.5F, 0F, 26, 11, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 223
		bodyModel[73].setRotationPoint(-51.35F, -20F, 23.5F);
		bodyModel[73].rotateAngleX = 0.68067841F;

		bodyModel[74].addShapeBox(0F, -0.5F, 0F, 2, 7, 16, 0F,0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[74].setRotationPoint(-65.35F, -17.75F, 3.5F);

		bodyModel[75].addShapeBox(0F, 1.5F, 0F, 9, 9, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 225
		bodyModel[75].setRotationPoint(-35.35F, -20F, 23.5F);
		bodyModel[75].rotateAngleX = 0.68067841F;

		bodyModel[76].addShapeBox(0F, -0.5F, 0F, 9, 9, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 226
		bodyModel[76].setRotationPoint(-35.35F, -20F, -25F);
		bodyModel[76].rotateAngleX = -0.68067841F;

		bodyModel[77].addShapeBox(1.35F, 1.3F, 0F, 1, 3, 24, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 177
		bodyModel[77].setRotationPoint(45.65F, -18.6F, -12F);
		bodyModel[77].rotateAngleZ = -0.59341195F;

		bodyModel[78].addShapeBox(3.85F, 1.4F, 0F, 1, 3, 24, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 178
		bodyModel[78].setRotationPoint(45.65F, -18.6F, -12F);
		bodyModel[78].rotateAngleZ = -0.59341195F;

		bodyModel[79].addShapeBox(8.85F, 1.6F, 0F, 1, 3, 24, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 179
		bodyModel[79].setRotationPoint(45.65F, -18.6F, -12F);
		bodyModel[79].rotateAngleZ = -0.54105207F;

		bodyModel[80].addShapeBox(6.35F, 1.75F, 0F, 1, 3, 24, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 180
		bodyModel[80].setRotationPoint(45.65F, -18.6F, -12F);
		bodyModel[80].rotateAngleZ = -0.54105207F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		bodyModel[81].setRotationPoint(41.6F, -19.2F, -13.6F);

		bodyModel[82].addShapeBox(0.9F, 0F, -4.7F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 783
		bodyModel[82].setRotationPoint(41.6F, -19.2F, -13.6F);
		bodyModel[82].rotateAngleY = -0.6981317F;

		bodyModel[83].addShapeBox(2.9F, 0F, 4.1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		bodyModel[83].setRotationPoint(41.6F, -19.2F, -13.6F);
		bodyModel[83].rotateAngleY = 0.6981317F;

		bodyModel[84].addShapeBox(0.1F, 0.3F, -0.1F, 2, 1, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 785
		bodyModel[84].setRotationPoint(41.6F, -19.2F, -13.6F);

		bodyModel[85].addShapeBox(1F, 0.3F, -4.8F, 2, 1, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 786
		bodyModel[85].setRotationPoint(41.6F, -19.2F, -13.6F);
		bodyModel[85].rotateAngleY = -0.6981317F;

		bodyModel[86].addShapeBox(1.05F, 0.3F, 1.7F, 2, 1, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 787
		bodyModel[86].setRotationPoint(41.6F, -19.2F, -10.6F);
		bodyModel[86].rotateAngleY = 0.6981317F;

		bodyModel[87].addShapeBox(0F, 1.4F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 788
		bodyModel[87].setRotationPoint(41.6F, -19.2F, -13.6F);

		bodyModel[88].addShapeBox(2.9F, 1.4F, 4.1F, 2, 1, 3, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 789
		bodyModel[88].setRotationPoint(41.6F, -19.2F, -13.6F);
		bodyModel[88].rotateAngleY = 0.6981317F;

		bodyModel[89].addShapeBox(0.9F, 1.4F, -4.7F, 2, 1, 3, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 790
		bodyModel[89].setRotationPoint(41.6F, -19.2F, -13.6F);
		bodyModel[89].rotateAngleY = -0.6981317F;

		bodyModel[90].addShapeBox(21.1F, 10F, -0.35F, 8, 1, 3, 0F,-1.3F, -0.2F, 1F, -1.3F, -0.2F, 1F, -1.3F, -0.2F, 0.9F, -1.3F, -0.2F, 0.9F, -0.3F, -0.2F, 1F, -0.3F, -0.2F, 1F, -0.3F, -0.2F, 0.9F, -0.3F, -0.2F, 0.9F); // Box 779
		bodyModel[90].setRotationPoint(12.3F, -28.4F, -13F);

		bodyModel[91].addShapeBox(21.4F, 10F, -2.3F, 7, 1, 1, 0F,-3F, -0.2F, 0.5F, -2.5F, -0.2F, 0.5F, -0.6F, -0.2F, -0.05F, -1F, -0.2F, -0.05F, -2F, -0.2F, 1.5F, -1.5F, -0.2F, 1.5F, 0.4F, -0.2F, -0.05F, 0F, -0.2F, -0.05F); // Box 780
		bodyModel[91].setRotationPoint(12.3F, -28.4F, -13F);

		bodyModel[92].addShapeBox(21.4F, 10F, 1.5F, 7, 1, 1, 0F,-1F, -0.2F, -0.05F, -0.6F, -0.2F, -0.05F, -2.5F, -0.2F, 0.5F, -3F, -0.2F, 0.5F, 0F, -0.2F, -0.05F, 0.4F, -0.2F, -0.05F, -1.5F, -0.2F, 1.5F, -2F, -0.2F, 1.5F); // Box 781
		bodyModel[92].setRotationPoint(12.3F, -28.4F, -11F);

		bodyModel[93].addShapeBox(-4.1F, -0.9F, -6.9F, 1, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 794
		bodyModel[93].setRotationPoint(40.8F, -17.8F, -13.6F);
		bodyModel[93].rotateAngleY = -0.6981317F;

		bodyModel[94].addShapeBox(-4.1F, -0.9F, -8F, 1, 2, 1, 0F,0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 795
		bodyModel[94].setRotationPoint(40.8F, -17.8F, -13.6F);
		bodyModel[94].rotateAngleY = -0.6981317F;

		bodyModel[95].addShapeBox(-4.1F, -0.5F, -8F, 1, 2, 1, 0F,0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F); // Box 796
		bodyModel[95].setRotationPoint(40.8F, -17.8F, -13.6F);
		bodyModel[95].rotateAngleY = -0.6981317F;

		bodyModel[96].addShapeBox(-1.75F, -2F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		bodyModel[96].setRotationPoint(44F, -17F, -26.5F);
		bodyModel[96].rotateAngleY = -0.29670597F;

		bodyModel[97].addShapeBox(-0.87F, -2F, -0.86F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[97].setRotationPoint(44F, -17F, -23.5F);
		bodyModel[97].rotateAngleY = -0.29670597F;

		bodyModel[98].addShapeBox(-0.87F, -2F, -0.86F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 624
		bodyModel[98].setRotationPoint(44F, -18F, -23.5F);
		bodyModel[98].rotateAngleY = -0.29670597F;

		bodyModel[99].addShapeBox(-1.75F, -2F, -1F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		bodyModel[99].setRotationPoint(44F, -18F, -26.5F);
		bodyModel[99].rotateAngleY = -0.29670597F;

		bodyModel[100].addShapeBox(-0.6F, -2F, -5.82F, 2, 1, 1, 0F,0F, 0F, -0.9F, -1F, 0F, -0.9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		bodyModel[100].setRotationPoint(44F, -18F, -22.5F);
		bodyModel[100].rotateAngleY = -0.29670597F;

		bodyModel[101].addShapeBox(-0.6F, -2F, -5.82F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		bodyModel[101].setRotationPoint(44F, -17F, -22.5F);
		bodyModel[101].rotateAngleY = -0.29670597F;

		bodyModel[102].addShapeBox(-0.6F, 1F, -5.82F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -1F, 0F, -0.9F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 628
		bodyModel[102].setRotationPoint(44F, -18F, -22.5F);
		bodyModel[102].rotateAngleY = -0.29670597F;

		bodyModel[103].addShapeBox(-1.75F, -2F, -1F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 629
		bodyModel[103].setRotationPoint(44F, -15F, -26.5F);
		bodyModel[103].rotateAngleY = -0.29670597F;

		bodyModel[104].addShapeBox(-0.87F, 1F, -0.86F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 630
		bodyModel[104].setRotationPoint(44F, -18F, -23.5F);
		bodyModel[104].rotateAngleY = -0.29670597F;

		bodyModel[105].addShapeBox(0F, -1F, -0.5F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 631
		bodyModel[105].setRotationPoint(44F, -17.85F, -26.25F);

		bodyModel[106].addShapeBox(0F, -1.75F, -0.5F, 1, 1, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 214
		bodyModel[106].setRotationPoint(44F, -17.85F, -26.25F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 609
		bodyModel[107].setRotationPoint(43.5F, -18.85F, 25.5F);

		bodyModel[108].addShapeBox(-1F, -2F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		bodyModel[108].setRotationPoint(43.5F, -17F, 24.25F);
		bodyModel[108].rotateAngleY = 0.29670597F;

		bodyModel[109].addShapeBox(-1F, -2F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[109].setRotationPoint(43.5F, -18F, 24.25F);
		bodyModel[109].rotateAngleY = 0.29670597F;

		bodyModel[110].addShapeBox(-1F, -2F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[110].setRotationPoint(43.5F, -15F, 24.25F);
		bodyModel[110].rotateAngleY = 0.29670597F;

		bodyModel[111].addShapeBox(-2.15F, 1F, -4.83F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -1F, 0F, -0.9F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[111].setRotationPoint(43.5F, -18F, 28.25F);
		bodyModel[111].rotateAngleY = 0.29670597F;

		bodyModel[112].addShapeBox(-2.15F, -2F, -4.83F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		bodyModel[112].setRotationPoint(43.5F, -17F, 28.25F);
		bodyModel[112].rotateAngleY = 0.29670597F;

		bodyModel[113].addShapeBox(-2.15F, -2F, -4.83F, 2, 1, 1, 0F,0F, 0F, -0.9F, -1F, 0F, -0.9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		bodyModel[113].setRotationPoint(43.5F, -18F, 28.25F);
		bodyModel[113].rotateAngleY = 0.29670597F;

		bodyModel[114].addShapeBox(-2.16F, -2F, -0.83F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 619
		bodyModel[114].setRotationPoint(43.5F, -18F, 28.25F);
		bodyModel[114].rotateAngleY = 0.29670597F;

		bodyModel[115].addShapeBox(-2.16F, -2F, -0.83F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[115].setRotationPoint(43.5F, -17F, 28.25F);
		bodyModel[115].rotateAngleY = 0.29670597F;

		bodyModel[116].addShapeBox(-2.16F, 1F, -0.83F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 621
		bodyModel[116].setRotationPoint(43.5F, -18F, 28.25F);
		bodyModel[116].rotateAngleY = 0.29670597F;

		bodyModel[117].addShapeBox(0F, -0.75F, 0F, 1, 1, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 225
		bodyModel[117].setRotationPoint(43.5F, -18.85F, 25.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 639
		bodyModel[118].setRotationPoint(55F, -12.7F, -16F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F); // Box 640
		bodyModel[119].setRotationPoint(53F, -10.7F, -16F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 641
		bodyModel[120].setRotationPoint(55.6F, -11.75F, -17F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[121].setRotationPoint(55.6F, -12.75F, -17F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		bodyModel[122].setRotationPoint(55.6F, -13.75F, -17F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[123].setRotationPoint(55.6F, -13.75F, 14F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[124].setRotationPoint(55.6F, -12.75F, 14F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 233
		bodyModel[125].setRotationPoint(55.6F, -11.75F, 14F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 234
		bodyModel[126].setRotationPoint(55F, -12.7F, 15F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F); // Box 235
		bodyModel[127].setRotationPoint(53F, -10.7F, 15F);

		bodyModel[128].addShapeBox(2F, -1F, 12F, 17, 9, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[128].setRotationPoint(-63.35F, -20.1F, -25F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[129].setRotationPoint(52.6F, -12F, 9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[130].setRotationPoint(52.6F, -12F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0.2F, 0.2F, 1F, -2F, 0.2F, 1F, -2F, 0.2F, -1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 367
		bodyModel[131].setRotationPoint(56.6F, -12F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0.2F, 0.2F, 1F, -2F, 0.2F, 1F, -2F, 0.2F, -1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 368
		bodyModel[132].setRotationPoint(56.6F, -12F, 9F);

		bodyModel[133].addShapeBox(4.5F, 5.5F, -0.15F, 3, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 366
		bodyModel[133].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[134].addShapeBox(-23.5F, 5.5F, -0.15F, 3, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 367
		bodyModel[134].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[135].addShapeBox(-52.5F, 5.5F, -0.15F, 3, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 368
		bodyModel[135].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[136].addShapeBox(-52.5F, 5.5F, -60.65F, 3, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 369
		bodyModel[136].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[137].addShapeBox(-23.5F, 5.5F, -60.65F, 3, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 370
		bodyModel[137].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[138].addShapeBox(4.5F, 5.5F, -60.65F, 3, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 371
		bodyModel[138].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[139].addShapeBox(34F, 5.5F, -60.65F, 3, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 372
		bodyModel[139].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[140].addShapeBox(35F, 5F, -0.15F, 3, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 373
		bodyModel[140].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[141].addShapeBox(-2.16F, -2F, -1.15F, 3, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F); // Box 413
		bodyModel[141].setRotationPoint(33.5F, -15F, 28.25F);
		bodyModel[141].rotateAngleY = 1.04719755F;

		bodyModel[142].addShapeBox(46.84F, -2F, -28.15F, 3, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F); // Box 414
		bodyModel[142].setRotationPoint(33.5F, -15F, 28.25F);
		bodyModel[142].rotateAngleY = -1.04719755F;

		bodyModel[143].addShapeBox(-2.16F, -2F, -1.15F, 3, 3, 1, 0F,0F, -0.2F, 0.2F, -1.2F, -0.2F, 0.2F, -1.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 2F, 0.8F, 0.2F, -0.7F, -1.2F, 0.2F, -0.7F, -1.2F, 0.2F, 2F, 0.8F, 0.2F); // Box 415
		bodyModel[143].setRotationPoint(33.5F, -15F, 28.25F);
		bodyModel[143].rotateAngleY = 1.04719755F;

		bodyModel[144].addShapeBox(46.84F, -2F, -28.15F, 3, 3, 1, 0F,0F, -0.2F, 0.2F, -1.2F, -0.2F, 0.2F, -1.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 2F, 0.8F, 0.2F, -0.7F, -1.2F, 0.2F, -0.7F, -1.2F, 0.2F, 2F, 0.8F, 0.2F); // Box 416
		bodyModel[144].setRotationPoint(33.5F, -15F, 28.25F);
		bodyModel[144].rotateAngleY = -1.04719755F;

		bodyModel[145].addShapeBox(-2F, 3.5F, 0F, 1, 7, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 427
		bodyModel[145].setRotationPoint(3.65F, -20F, 23.5F);
		bodyModel[145].rotateAngleX = 0.68067841F;

		bodyModel[146].addShapeBox(39F, 2.5F, 0F, 4, 6, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 428
		bodyModel[146].setRotationPoint(-38.35F, -20F, -25F);
		bodyModel[146].rotateAngleX = -0.68067841F;

		bodyModel[147].addShapeBox(0F, 3.5F, 0F, 1, 7, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 429
		bodyModel[147].setRotationPoint(-12.35F, -20F, 23.5F);
		bodyModel[147].rotateAngleX = 0.68067841F;

		bodyModel[148].addShapeBox(1F, 3.65F, -0.25F, 17, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 430
		bodyModel[148].setRotationPoint(-14.35F, -20F, 23.5F);
		bodyModel[148].rotateAngleX = 0.68067841F;

		bodyModel[149].addShapeBox(1F, 4.9F, -0.25F, 17, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 431
		bodyModel[149].setRotationPoint(-14.35F, -20F, 23.5F);
		bodyModel[149].rotateAngleX = 0.68067841F;

		bodyModel[150].addShapeBox(1F, 6.15F, -0.25F, 17, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 432
		bodyModel[150].setRotationPoint(-14.35F, -20F, 23.5F);
		bodyModel[150].rotateAngleX = 0.68067841F;

		bodyModel[151].addShapeBox(1F, 7.4F, -0.25F, 17, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 433
		bodyModel[151].setRotationPoint(-14.35F, -20F, 23.5F);
		bodyModel[151].rotateAngleX = 0.68067841F;

		bodyModel[152].addShapeBox(-2F, 3.5F, 0F, 1, 7, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 434
		bodyModel[152].setRotationPoint(5.65F, -20F, 23.5F);
		bodyModel[152].rotateAngleX = 0.68067841F;

		bodyModel[153].addShapeBox(0F, 3.5F, 0F, 1, 7, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 435
		bodyModel[153].setRotationPoint(-14.35F, -20F, 23.5F);
		bodyModel[153].rotateAngleX = 0.68067841F;

		bodyModel[154].addShapeBox(-2F, 6.75F, -0.3F, 14, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 436
		bodyModel[154].setRotationPoint(9.65F, -20F, 23.5F);
		bodyModel[154].rotateAngleX = 0.68067841F;

		bodyModel[155].addShapeBox(9F, 6.75F, -0.3F, 3, 3, 2, 0F,0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 437
		bodyModel[155].setRotationPoint(10.65F, -20F, 23.5F);
		bodyModel[155].rotateAngleX = 0.68067841F;

		bodyModel[156].addShapeBox(12F, 7.15F, 0F, 5, 1, 2, 0F,0F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 438
		bodyModel[156].setRotationPoint(10.65F, -20F, 23.5F);
		bodyModel[156].rotateAngleX = 0.68067841F;

		bodyModel[157].addShapeBox(12F, 8.25F, -0.5F, 5, 1, 2, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F); // Box 439
		bodyModel[157].setRotationPoint(10.65F, -20F, 23.5F);
		bodyModel[157].rotateAngleX = 0.68067841F;

		bodyModel[158].addShapeBox(12F, 9.35F, 0F, 5, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 440
		bodyModel[158].setRotationPoint(10.65F, -20F, 23.5F);
		bodyModel[158].rotateAngleX = 0.68067841F;

		bodyModel[159].addShapeBox(-3F, 2.75F, -0.3F, 8, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 441
		bodyModel[159].setRotationPoint(10.65F, -20F, 23.5F);
		bodyModel[159].rotateAngleX = 0.68067841F;

		bodyModel[160].addShapeBox(5F, 2.75F, -0.3F, 1, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 442
		bodyModel[160].setRotationPoint(10.65F, -20F, 23.5F);
		bodyModel[160].rotateAngleX = 0.68067841F;

		bodyModel[161].addShapeBox(6F, 2.75F, -0.3F, 3, 3, 2, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 443
		bodyModel[161].setRotationPoint(10.65F, -20F, 23.5F);
		bodyModel[161].rotateAngleX = 0.68067841F;

		bodyModel[162].addShapeBox(8F, 2.75F, -0.25F, 3, 3, 2, 0F,-0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -0.25F, -0.2F, -1F, -0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F); // Box 444
		bodyModel[162].setRotationPoint(10.65F, -20F, 23.5F);
		bodyModel[162].rotateAngleX = 0.68067841F;

		bodyModel[163].addShapeBox(8F, 4.75F, -0.25F, 3, 2, 2, 0F,-0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -0.25F, -0.2F, -1F, -0.25F, -0.2F, 0.4F, -0.75F, -0.2F, 0.4F, -0.75F, -0.2F, 0.4F, -0.75F, -0.2F, 0.4F, -0.75F); // Box 445
		bodyModel[163].setRotationPoint(10.65F, -20F, 23.5F);
		bodyModel[163].rotateAngleX = 0.68067841F;

		bodyModel[164].addShapeBox(21.5F, 0.25F, -0.35F, 13, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 446
		bodyModel[164].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[165].addShapeBox(6.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 447
		bodyModel[165].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[166].addShapeBox(-5.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 448
		bodyModel[166].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[167].addShapeBox(-21.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 449
		bodyModel[167].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[168].addShapeBox(-33.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 450
		bodyModel[168].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[169].addShapeBox(-62.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 451
		bodyModel[169].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[170].addShapeBox(-50.5F, 0.25F, -0.35F, 12, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 452
		bodyModel[170].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[171].addShapeBox(21.5F, 0.25F, -0.35F, 13, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 453
		bodyModel[171].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[172].addShapeBox(6.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 454
		bodyModel[172].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[173].addShapeBox(-5.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 455
		bodyModel[173].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[174].addShapeBox(-21.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 456
		bodyModel[174].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[175].addShapeBox(-33.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 457
		bodyModel[175].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[176].addShapeBox(-50.5F, 0.25F, -0.35F, 12, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 458
		bodyModel[176].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[177].addShapeBox(-62.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 459
		bodyModel[177].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[178].addShapeBox(0F, 0.5F, -6F, 22, 7, 6, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 460
		bodyModel[178].setRotationPoint(-24.35F, -20F, -25F);

		bodyModel[179].addShapeBox(0F, 0.5F, -6.25F, 22, 3, 6, 0F,0.25F, -1.5F, 0.1F, 0.25F, -1.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -1.5F, 0.1F, 0.25F, -1.5F, 0.1F); // Box 461
		bodyModel[179].setRotationPoint(-24.35F, -20F, -25F);

		bodyModel[180].addShapeBox(0F, 0.5F, -6F, 22, 7, 6, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 462
		bodyModel[180].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[181].addShapeBox(0F, 0.5F, -6.25F, 22, 3, 6, 0F,0.25F, -1.5F, 0.1F, 0.25F, -1.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -1.5F, 0.1F, 0.25F, -1.5F, 0.1F); // Box 463
		bodyModel[181].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[182].addShapeBox(4F, 2.5F, -6.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[182].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[183].addShapeBox(18F, 2.5F, -6.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[183].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[184].addShapeBox(-15F, 2.5F, -6.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[184].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[185].addShapeBox(-29F, 2.5F, -6.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[185].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[186].addShapeBox(0F, -0.5F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[186].setRotationPoint(-63.75F, -17.65F, -6.4F);

		bodyModel[187].addShapeBox(0F, -0.5F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[187].setRotationPoint(-63.75F, -12.4F, -6.4F);

		bodyModel[188].addShapeBox(0F, -0.75F, 0F, 2, 5, 1, 0F,0.2F, 0.5F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 470
		bodyModel[188].setRotationPoint(-65.35F, -17.75F, 5.5F);

		bodyModel[189].addShapeBox(0F, -0.75F, 0F, 2, 5, 1, 0F,0.2F, 0.5F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 471
		bodyModel[189].setRotationPoint(-65.35F, -17.75F, 16.5F);

		bodyModel[190].addShapeBox(0F, -0.75F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[190].setRotationPoint(-64.75F, -18.75F, -2.75F);

		bodyModel[191].addShapeBox(0F, -0.75F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[191].setRotationPoint(-64.75F, -18.75F, 2F);

		bodyModel[192].addShapeBox(0F, -0.75F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[192].setRotationPoint(-64.15F, -17.75F, -1.9F);

		bodyModel[193].addShapeBox(0F, 3.25F, 0.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		bodyModel[193].setRotationPoint(-64.15F, -17.75F, -1.9F);

		bodyModel[194].addShapeBox(0F, 6.5F, 0.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[194].setRotationPoint(-64.15F, -17.75F, -1.9F);

		bodyModel[195].addShapeBox(0F, 3.25F, 3.5F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 477
		bodyModel[195].setRotationPoint(-64.15F, -17.75F, -1.9F);

		bodyModel[196].addShapeBox(0F, 3.25F, -0.5F, 2, 4, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 478
		bodyModel[196].setRotationPoint(-64.15F, -17.75F, -1.9F);

		bodyModel[197].addShapeBox(0.25F, 0F, 0.75F, 2, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[197].setRotationPoint(-64.15F, -17.75F, -1.9F);

		bodyModel[198].addShapeBox(0.25F, 0F, 2.25F, 2, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[198].setRotationPoint(-64.15F, -17.75F, -1.9F);

		bodyModel[199].addShapeBox(-0.5F, 8.5F, -0.1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[199].setRotationPoint(-64.15F, -17.75F, -1.9F);

		bodyModel[200].addShapeBox(-0.5F, 10.5F, -0.1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 482
		bodyModel[200].setRotationPoint(-64.15F, -17.75F, -1.9F);

		bodyModel[201].addShapeBox(0F, 4.5F, 3F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[201].setRotationPoint(-63.75F, -12.4F, -20.4F);

		bodyModel[202].addShapeBox(0F, 4.5F, 8.7F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[202].setRotationPoint(-63.75F, -12.4F, -20.4F);

		bodyModel[203].addShapeBox(0F, -0.75F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[203].setRotationPoint(-64.35F, -18.75F, 19.75F);

		bodyModel[204].addShapeBox(0F, -0.75F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[204].setRotationPoint(-64.35F, -18.75F, -20.75F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 424
		bodyModel[205].setRotationPoint(-63.5F, -13.6F, 26F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 425
		bodyModel[206].setRotationPoint(-63.5F, -14.6F, 26F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 426
		bodyModel[207].setRotationPoint(-63.5F, -15.6F, 26F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 490
		bodyModel[208].setRotationPoint(-63.5F, -13.6F, -26.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 491
		bodyModel[209].setRotationPoint(-63.5F, -15.6F, -26.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 492
		bodyModel[210].setRotationPoint(-63.5F, -14.6F, -26.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.3F, 0.75F, -0.25F, 0.3F, 0.75F, -0.25F, 0.3F, -0.75F, 1.25F, 0.3F, -0.75F, 1.25F, 0.3F, -0.5F, 1F, 0.3F, -0.5F, 1F, 0.3F, -0.15F, 0.5F, 0.3F, -0.15F, 0.5F); // Box 493
		bodyModel[211].setRotationPoint(-64F, -16.6F, -22.5F);

		bodyModel[212].addShapeBox(0F, -0.75F, -1F, 1, 3, 1, 0F,0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, -0.35F, 0.85F, 0.3F, -0.35F, 0.85F, 0.3F, 0.25F, -1F, 0.3F, 0.25F, -1F); // Box 494
		bodyModel[212].setRotationPoint(-64F, -16.6F, -22.5F);

		bodyModel[213].addShapeBox(0F, -0.75F, -1.9F, 1, 3, 1, 0F,0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1.5F, 0.35F, 0.3F, -1.5F, 0.35F, 0.3F, -0.35F, -0.95F, 0.3F, -0.35F, -0.95F); // Box 495
		bodyModel[213].setRotationPoint(-64F, -16.6F, -22.5F);

		bodyModel[214].addShapeBox(0F, 0.25F, 1.4F, 1, 3, 1, 0F,0.3F, -0.5F, -0.85F, 0.3F, -0.5F, -0.85F, 0.3F, -1.3F, 0.1F, 0.3F, -1.3F, 0.1F, 0.3F, -0.4F, -0.1F, 0.3F, -0.4F, -0.1F, 0.3F, -0.9F, -0.25F, 0.3F, -0.9F, -0.25F); // Box 496
		bodyModel[214].setRotationPoint(-64F, -16.6F, -22.5F);

		bodyModel[215].addShapeBox(0F, 0.25F, -1.4F, 1, 3, 1, 0F,0.3F, -1.3F, 0.1F, 0.3F, -1.3F, 0.1F, 0.3F, -0.5F, -0.85F, 0.3F, -0.5F, -0.85F, 0.3F, -0.9F, -0.25F, 0.3F, -0.9F, -0.25F, 0.3F, -0.4F, -0.1F, 0.3F, -0.4F, -0.1F); // Box 497
		bodyModel[215].setRotationPoint(-64F, -16.6F, 21.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.3F, -0.75F, 1.25F, 0.3F, -0.75F, 1.25F, 0.3F, 0.75F, -0.25F, 0.3F, 0.75F, -0.25F, 0.3F, -0.15F, 0.5F, 0.3F, -0.15F, 0.5F, 0.3F, -0.5F, 1F, 0.3F, -0.5F, 1F); // Box 498
		bodyModel[216].setRotationPoint(-64F, -16.6F, 21.5F);

		bodyModel[217].addShapeBox(0F, -0.75F, 1F, 1, 3, 1, 0F,0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0.25F, -1F, 0.3F, 0.25F, -1F, 0.3F, -0.35F, 0.85F, 0.3F, -0.35F, 0.85F); // Box 499
		bodyModel[217].setRotationPoint(-64F, -16.6F, 21.5F);

		bodyModel[218].addShapeBox(0F, -0.75F, 1.9F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.35F, -0.95F, 0.3F, -0.35F, -0.95F, 0.3F, -1.5F, 0.35F, 0.3F, -1.5F, 0.35F); // Box 500
		bodyModel[218].setRotationPoint(-64F, -16.6F, 21.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0.15F, 0.75F, 0.3F, 0.15F, 0.75F, 0.3F, 0.15F, 0.75F, 0.3F, 0.15F, 0.75F, 0.3F, 0.15F, 0.75F, 0.3F, 0.15F, 0.75F, 0.3F, 0.15F, 0.75F, 0.3F, 0.15F, 0.75F); // Box 293
		bodyModel[219].setRotationPoint(-64F, -14F, -14F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.3F, 0.75F, 0.3F, -0.3F, 0.75F, 0.3F, -0.3F, 0.75F, 0.3F, -0.3F, 0.75F); // Box 294
		bodyModel[220].setRotationPoint(-64F, -16.05F, -13F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0.2F, 0.75F, 0.3F, 0.2F, 0.75F, 0.3F, 0.2F, 0.75F, 0.3F, 0.2F, 0.75F); // Box 295
		bodyModel[221].setRotationPoint(-64F, -15.35F, -14F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0.2F, 0.75F, 0.3F, 0.2F, 0.75F, 0.3F, 0.2F, 0.75F, 0.3F, 0.2F, 0.75F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F); // Box 296
		bodyModel[222].setRotationPoint(-64F, -12.65F, -14F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.3F, 0.75F, 0.3F, -0.3F, 0.75F, 0.3F, -0.3F, 0.75F, 0.3F, -0.3F, 0.75F, 0.3F, -0.3F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F); // Box 297
		bodyModel[223].setRotationPoint(-64F, -11.95F, -13F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[224].setRotationPoint(-63.75F, -4.4F, -18.4F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[225].setRotationPoint(-63.75F, -4.4F, 17.6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[226].setRotationPoint(-64.75F, -4.4F, -0.4F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 509
		bodyModel[227].setRotationPoint(-65.75F, -5.4F, -0.4F);

		bodyModel[228].addShapeBox(0F, -0.5F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[228].setRotationPoint(-63.75F, -15.4F, -18.4F);

		bodyModel[229].addShapeBox(0F, -0.5F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[229].setRotationPoint(-63.75F, -18.65F, -18.4F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 17, 9, 25, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[230].setRotationPoint(39.65F, -7.85F, -12F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 17, 6, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[231].setRotationPoint(-35.35F, -20.6F, -17.25F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 17, 6, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[232].setRotationPoint(-35.35F, -20.6F, 11.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[233].setRotationPoint(-32.35F, -20.6F, 7.75F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		bodyModel[234].setRotationPoint(-32.35F, -20.6F, -10.25F);

		bodyModel[235].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 282
		bodyModel[235].setRotationPoint(38.75F, 2F, -18.5F);

		bodyModel[236].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 526
		bodyModel[236].setRotationPoint(25.75F, 2F, -18.5F);

		bodyModel[237].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 527
		bodyModel[237].setRotationPoint(13.25F, 2F, -18.5F);

		bodyModel[238].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 528
		bodyModel[238].setRotationPoint(0.25F, 2F, -18.5F);

		bodyModel[239].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 529
		bodyModel[239].setRotationPoint(-12F, 2F, -18.5F);

		bodyModel[240].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 530
		bodyModel[240].setRotationPoint(-25F, 2F, -18.5F);

		bodyModel[241].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 531
		bodyModel[241].setRotationPoint(-38F, 2F, -18.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 237
		turretModel[1] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 238
		turretModel[2] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 239
		turretModel[3] = new ModelRendererTurbo(this, 313, 249, textureX, textureY); // Box 240
		turretModel[4] = new ModelRendererTurbo(this, 65, 265, textureX, textureY); // Box 241
		turretModel[5] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 244
		turretModel[6] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Box 245
		turretModel[7] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Box 246
		turretModel[8] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 247
		turretModel[9] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 249
		turretModel[10] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 250
		turretModel[11] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 251
		turretModel[12] = new ModelRendererTurbo(this, 361, 289, textureX, textureY); // Box 252
		turretModel[13] = new ModelRendererTurbo(this, 65, 305, textureX, textureY); // Box 253
		turretModel[14] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 254
		turretModel[15] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 255
		turretModel[16] = new ModelRendererTurbo(this, 441, 281, textureX, textureY); // Box 257
		turretModel[17] = new ModelRendererTurbo(this, 153, 305, textureX, textureY); // Box 258
		turretModel[18] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 259
		turretModel[19] = new ModelRendererTurbo(this, 185, 321, textureX, textureY); // Box 260
		turretModel[20] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 262
		turretModel[21] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 263
		turretModel[22] = new ModelRendererTurbo(this, 489, 249, textureX, textureY); // Box 264
		turretModel[23] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 265
		turretModel[24] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 266
		turretModel[25] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Box 267
		turretModel[26] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Box 268
		turretModel[27] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 270
		turretModel[28] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 271
		turretModel[29] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Box 272
		turretModel[30] = new ModelRendererTurbo(this, 473, 281, textureX, textureY); // Box 273
		turretModel[31] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 274
		turretModel[32] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Box 276
		turretModel[33] = new ModelRendererTurbo(this, 433, 321, textureX, textureY); // Box 277
		turretModel[34] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Box 279
		turretModel[35] = new ModelRendererTurbo(this, 361, 289, textureX, textureY); // Box 280
		turretModel[36] = new ModelRendererTurbo(this, 377, 289, textureX, textureY); // Box 281
		turretModel[37] = new ModelRendererTurbo(this, 489, 297, textureX, textureY); // Box 282
		turretModel[38] = new ModelRendererTurbo(this, 121, 305, textureX, textureY); // Box 283
		turretModel[39] = new ModelRendererTurbo(this, 153, 305, textureX, textureY); // Box 285
		turretModel[40] = new ModelRendererTurbo(this, 417, 305, textureX, textureY); // Box 287
		turretModel[41] = new ModelRendererTurbo(this, 33, 321, textureX, textureY); // Box 288
		turretModel[42] = new ModelRendererTurbo(this, 481, 313, textureX, textureY); // Box 290
		turretModel[43] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 291
		turretModel[44] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 292
		turretModel[45] = new ModelRendererTurbo(this, 65, 321, textureX, textureY); // Box 293
		turretModel[46] = new ModelRendererTurbo(this, 121, 321, textureX, textureY); // Box 274
		turretModel[47] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 275
		turretModel[48] = new ModelRendererTurbo(this, 137, 321, textureX, textureY); // Box 276
		turretModel[49] = new ModelRendererTurbo(this, 217, 321, textureX, textureY); // Box 278
		turretModel[50] = new ModelRendererTurbo(this, 361, 329, textureX, textureY); // Box 280
		turretModel[51] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Box 281
		turretModel[52] = new ModelRendererTurbo(this, 465, 321, textureX, textureY); // Box 282
		turretModel[53] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 283
		turretModel[54] = new ModelRendererTurbo(this, 385, 329, textureX, textureY); // Box 284
		turretModel[55] = new ModelRendererTurbo(this, 401, 329, textureX, textureY); // Box 285
		turretModel[56] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 286
		turretModel[57] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 287
		turretModel[58] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 288
		turretModel[59] = new ModelRendererTurbo(this, 89, 345, textureX, textureY); // Box 301
		turretModel[60] = new ModelRendererTurbo(this, 121, 345, textureX, textureY); // Box 302
		turretModel[61] = new ModelRendererTurbo(this, 145, 345, textureX, textureY); // Box 303
		turretModel[62] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 304
		turretModel[63] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 305
		turretModel[64] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 306
		turretModel[65] = new ModelRendererTurbo(this, 377, 353, textureX, textureY); // Box 307
		turretModel[66] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Box 308
		turretModel[67] = new ModelRendererTurbo(this, 161, 289, textureX, textureY); // Box 309
		turretModel[68] = new ModelRendererTurbo(this, 361, 345, textureX, textureY); // Box 310
		turretModel[69] = new ModelRendererTurbo(this, 441, 353, textureX, textureY); // Box 311
		turretModel[70] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 312
		turretModel[71] = new ModelRendererTurbo(this, 49, 361, textureX, textureY); // Box 313
		turretModel[72] = new ModelRendererTurbo(this, 161, 353, textureX, textureY); // Box 316
		turretModel[73] = new ModelRendererTurbo(this, 97, 361, textureX, textureY); // Box 317
		turretModel[74] = new ModelRendererTurbo(this, 297, 361, textureX, textureY); // Box 318
		turretModel[75] = new ModelRendererTurbo(this, 337, 361, textureX, textureY); // Box 319
		turretModel[76] = new ModelRendererTurbo(this, 441, 361, textureX, textureY); // Box 320
		turretModel[77] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 321
		turretModel[78] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 323
		turretModel[79] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 324
		turretModel[80] = new ModelRendererTurbo(this, 105, 361, textureX, textureY); // Box 329
		turretModel[81] = new ModelRendererTurbo(this, 481, 345, textureX, textureY); // Box 330
		turretModel[82] = new ModelRendererTurbo(this, 497, 345, textureX, textureY); // Box 331
		turretModel[83] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 332
		turretModel[84] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 333
		turretModel[85] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 334
		turretModel[86] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 335
		turretModel[87] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 336
		turretModel[88] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 337
		turretModel[89] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 338
		turretModel[90] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 339
		turretModel[91] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 340
		turretModel[92] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 341
		turretModel[93] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 342
		turretModel[94] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 343
		turretModel[95] = new ModelRendererTurbo(this, 145, 361, textureX, textureY); // Box 344
		turretModel[96] = new ModelRendererTurbo(this, 481, 361, textureX, textureY); // Box 345
		turretModel[97] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 357
		turretModel[98] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 358
		turretModel[99] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Box 359
		turretModel[100] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Box 363
		turretModel[101] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Box 364
		turretModel[102] = new ModelRendererTurbo(this, 281, 313, textureX, textureY); // Box 365
		turretModel[103] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 372
		turretModel[104] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 373
		turretModel[105] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 374
		turretModel[106] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 375
		turretModel[107] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 376
		turretModel[108] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 377
		turretModel[109] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 378
		turretModel[110] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 379
		turretModel[111] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 380
		turretModel[112] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Box 381
		turretModel[113] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 382
		turretModel[114] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 383
		turretModel[115] = new ModelRendererTurbo(this, 153, 321, textureX, textureY); // Box 384
		turretModel[116] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 385
		turretModel[117] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 386
		turretModel[118] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 387
		turretModel[119] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 388
		turretModel[120] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 389
		turretModel[121] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 390
		turretModel[122] = new ModelRendererTurbo(this, 33, 337, textureX, textureY); // Box 391
		turretModel[123] = new ModelRendererTurbo(this, 481, 377, textureX, textureY); // Box 392
		turretModel[124] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Box 394
		turretModel[125] = new ModelRendererTurbo(this, 313, 345, textureX, textureY); // Box 395
		turretModel[126] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 396
		turretModel[127] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 397
		turretModel[128] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 398
		turretModel[129] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 399
		turretModel[130] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 400
		turretModel[131] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 401
		turretModel[132] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 402
		turretModel[133] = new ModelRendererTurbo(this, 161, 249, textureX, textureY); // Box 403
		turretModel[134] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 404
		turretModel[135] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Box 405
		turretModel[136] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 406
		turretModel[137] = new ModelRendererTurbo(this, 121, 265, textureX, textureY); // Box 407
		turretModel[138] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 408
		turretModel[139] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 409
		turretModel[140] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 410
		turretModel[141] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Box 411
		turretModel[142] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 412
		turretModel[143] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 417
		turretModel[144] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Box 418
		turretModel[145] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 419
		turretModel[146] = new ModelRendererTurbo(this, 137, 241, textureX, textureY); // Box 420
		turretModel[147] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); // Box 421
		turretModel[148] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Box 422
		turretModel[149] = new ModelRendererTurbo(this, 321, 305, textureX, textureY); // Box 423
		turretModel[150] = new ModelRendererTurbo(this, 185, 313, textureX, textureY); // Box 424
		turretModel[151] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Box 425
		turretModel[152] = new ModelRendererTurbo(this, 497, 329, textureX, textureY); // Box 426
		turretModel[153] = new ModelRendererTurbo(this, 121, 409, textureX, textureY); // Box 512
		turretModel[154] = new ModelRendererTurbo(this, 217, 337, textureX, textureY); // Box 513
		turretModel[155] = new ModelRendererTurbo(this, 497, 401, textureX, textureY); // Box 514
		turretModel[156] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 515
		turretModel[157] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 516
		turretModel[158] = new ModelRendererTurbo(this, 145, 409, textureX, textureY); // Box 517
		turretModel[159] = new ModelRendererTurbo(this, 161, 409, textureX, textureY); // Box 518
		turretModel[160] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 519
		turretModel[161] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 520

		turretModel[0].addShapeBox(-18F, -13.5F, -17F, 12, 14, 34, 0F,0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F); // Box 237
		turretModel[0].setRotationPoint(4F, -18F, 0F);

		turretModel[1].addShapeBox(6F, -0.5F, -17F, 12, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // Box 238
		turretModel[1].setRotationPoint(4F, -18F, 0F);

		turretModel[2].addBox(-6F, -13.5F, -17F, 12, 14, 34, 0F); // Box 239
		turretModel[2].setRotationPoint(4F, -18F, 0F);

		turretModel[3].addShapeBox(-6F, -13.5F, -22F, 12, 13, 5, 0F,0F, -1F, -3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		turretModel[3].setRotationPoint(4F, -18F, 0F);

		turretModel[4].addShapeBox(-6F, -13.5F, 17F, 12, 13, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F); // Box 241
		turretModel[4].setRotationPoint(4F, -18F, 0F);

		turretModel[5].addShapeBox(-26F, -13.5F, -6F, 8, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 3F, -6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3.5F, -6F, 0F); // Box 244
		turretModel[5].setRotationPoint(4F, -18F, 0F);

		turretModel[6].addShapeBox(-26F, -13.5F, 0F, 8, 14, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -6F, 0F); // Box 245
		turretModel[6].setRotationPoint(4F, -18F, 0F);

		turretModel[7].addShapeBox(-25F, -13.5F, -16F, 7, 14, 10, 0F,-9F, 0F, 0F, 12F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -5F, 0F, 12F, -1F, 1F, 0F, -0.5F, 0F, 4F, -6F, 0F); // Box 246
		turretModel[7].setRotationPoint(4F, -18F, 0F);

		turretModel[8].addShapeBox(-25F, -13.5F, 6F, 7, 14, 10, 0F,1F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 1F, -9F, 0F, 0F, 4F, -6F, 0F, 0F, -0.5F, 0F, 12F, -1F, 1F, -2F, -5F, 0F); // Box 247
		turretModel[8].setRotationPoint(4F, -18F, 0F);

		turretModel[9].addShapeBox(-16F, -13.5F, -21F, 10, 13, 4, 0F,-3F, -1F, -3F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -1.5F, 1F, 0F, 0F, 0F, 7F, -4F, 1F); // Box 249
		turretModel[9].setRotationPoint(4F, -18F, 0F);

		turretModel[10].addShapeBox(-16F, -13.5F, 17F, 10, 13, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -2F, -3F, -1F, -3F, 7F, -4F, 1F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, -4F, 0F); // Box 250
		turretModel[10].setRotationPoint(4F, -18F, 0F);

		turretModel[11].addShapeBox(-6F, -14.5F, -17F, 12, 1, 34, 0F,0F, -0.25F, -1F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		turretModel[11].setRotationPoint(4F, -18F, 0F);

		turretModel[12].addShapeBox(-16F, -14.5F, -17F, 10, 1, 34, 0F,0F, -0.25F, -3.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 252
		turretModel[12].setRotationPoint(4F, -18F, 0F);

		turretModel[13].addShapeBox(-25F, -14.5F, -16F, 9, 1, 32, 0F,0F, -0.25F, -11F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, -0.25F, -11F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 253
		turretModel[13].setRotationPoint(4F, -18F, 0F);

		turretModel[14].addShapeBox(-26F, -14.5F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, -0.5F, -0.25F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 254
		turretModel[14].setRotationPoint(4F, -18F, 0F);

		turretModel[15].addShapeBox(-26F, -14.5F, -6F, 1, 1, 6, 0F,-0.5F, -0.25F, -3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 255
		turretModel[15].setRotationPoint(4F, -18F, 0F);

		turretModel[16].addShapeBox(18F, -13.5F, -10F, 3, 13, 20, 0F,0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 257
		turretModel[16].setRotationPoint(4F, -18F, 0F);

		turretModel[17].addShapeBox(21F, -12.5F, -10F, 3, 12, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 258
		turretModel[17].setRotationPoint(4F, -18F, 0F);

		turretModel[18].addShapeBox(23.5F, -12.5F, -10F, 2, 12, 20, 0F,0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 259
		turretModel[18].setRotationPoint(4F, -18F, 0F);

		turretModel[19].addShapeBox(25F, -11.5F, -10F, 2, 11, 20, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 260
		turretModel[19].setRotationPoint(4F, -18F, 0F);

		turretModel[20].addShapeBox(21F, -12.5F, -12F, 3, 12, 2, 0F,0F, -0.75F, 0.25F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, -0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 262
		turretModel[20].setRotationPoint(4F, -18F, 0F);

		turretModel[21].addShapeBox(23F, -11.5F, -12F, 2, 11, 2, 0F,-0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 3.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 263
		turretModel[21].setRotationPoint(4F, -18F, 0F);

		turretModel[22].addShapeBox(24.5F, -11.5F, -12F, 2, 11, 2, 0F,-0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 2.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 264
		turretModel[22].setRotationPoint(4F, -18F, 0F);

		turretModel[23].addShapeBox(24.5F, -11.5F, 10F, 2, 11, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, 2.5F); // Box 265
		turretModel[23].setRotationPoint(4F, -18F, 0F);

		turretModel[24].addShapeBox(23F, -11.5F, 10F, 2, 11, 2, 0F,-0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -0.5F, 0F, 3.5F); // Box 266
		turretModel[24].setRotationPoint(4F, -18F, 0F);

		turretModel[25].addShapeBox(21F, -12.5F, 10F, 3, 12, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3.5F, 0F, 0F, 4.5F); // Box 267
		turretModel[25].setRotationPoint(4F, -18F, 0F);

		turretModel[26].addShapeBox(18F, -13.5F, -12F, 3, 13, 2, 0F,0F, -1F, 2.25F, 0F, -1.75F, 0.25F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 5.25F, 0F, 0F, 4.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		turretModel[26].setRotationPoint(4F, -18F, 0F);

		turretModel[27].addShapeBox(6F, -13.5F, -17F, 12, 13, 34, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 270
		turretModel[27].setRotationPoint(4F, -18F, 0F);

		turretModel[28].addShapeBox(6F, -13.5F, -18F, 12, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, -3.75F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -0.75F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 271
		turretModel[28].setRotationPoint(4F, -18F, 0F);

		turretModel[29].addShapeBox(6F, -13.5F, 17F, 12, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, -1F, -3.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -0.75F, 0F, -1F, 3F); // Box 272
		turretModel[29].setRotationPoint(4F, -18F, 0F);

		turretModel[30].addShapeBox(18F, -13.5F, 10F, 3, 13, 2, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1.75F, 0.25F, 0F, -1F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, 0F, 0F, 5.25F); // Box 273
		turretModel[30].setRotationPoint(4F, -18F, 0F);

		turretModel[31].addShapeBox(6F, -14.5F, -17F, 12, 1, 34, 0F,0F, -0.25F, -2F, -3F, -0.25F, -9F, -3F, -0.25F, -9F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 274
		turretModel[31].setRotationPoint(4F, -18F, 0F);

		turretModel[32].addShapeBox(26.5F, -12.5F, -10F, 3, 12, 19, 0F,0F, -0.5F, 0F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, 3F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 3F); // Box 276
		turretModel[32].setRotationPoint(4F, -18F, 0F);

		turretModel[33].addShapeBox(29F, -11.5F, -9.5F, 4, 10, 19, 0F,0F, -0.5F, 0F, -0.5F, -2F, -1F, -0.5F, -2F, -1F, 0F, -0.5F, 0F, -1F, 1F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -1F, 1F, 0F); // Box 277
		turretModel[33].setRotationPoint(4F, -18F, 0F);

		turretModel[34].addShapeBox(26.5F, -12.5F, -13F, 3, 12, 3, 0F,0F, -2.5F, 0F, -0.5F, -3.5F, -1F, -0.5F, -1.5F, 0.5F, 0F, -0.5F, 0F, 0F, -1F, 1F, 0.5F, -1F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, -3F); // Box 279
		turretModel[34].setRotationPoint(4F, -18F, 0F);

		turretModel[35].addShapeBox(26.5F, -12.5F, 10F, 3, 12, 3, 0F,0F, -0.5F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -3.5F, -1F, 0F, -2.5F, 0F, 0F, 0F, -3F, 0.5F, 0F, 0.5F, 0.5F, -1F, -1F, 0F, -1F, 1F); // Box 280
		turretModel[35].setRotationPoint(4F, -18F, 0F);

		turretModel[36].addShapeBox(29F, -11.5F, -11.5F, 4, 10, 2, 0F,0F, -2.5F, 0.5F, -0.5F, -4F, -1.5F, -0.5F, -2F, 1F, 0F, -0.5F, 0F, -1F, 0F, 0.5F, -0.5F, -2F, -1.5F, -0.5F, -1F, 1F, -1F, 1F, 0F); // Box 281
		turretModel[36].setRotationPoint(4F, -18F, 0F);

		turretModel[37].addShapeBox(29F, -11.5F, 9.5F, 4, 10, 2, 0F,0F, -0.5F, 0F, -0.5F, -2F, 1F, -0.5F, -4F, -1.5F, 0F, -2.5F, 0.5F, -1F, 1F, 0F, -0.5F, -1F, 1F, -0.5F, -2F, -1.5F, -1F, 0F, 0.5F); // Box 282
		turretModel[37].setRotationPoint(4F, -18F, 0F);

		turretModel[38].addShapeBox(-32F, -14.5F, 17F, 11, 10, 1, 0F,0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.2F, -1.5F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 1.75F, 1F, -1.5F, -0.25F); // Box 283
		turretModel[38].setRotationPoint(4F, -18F, 0F);

		turretModel[39].addShapeBox(-36F, -14.5F, 10.75F, 1, 8, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3.6F, 0F, 0F, 0.75F, 0.5F, 0F, -1.25F, 0.5F, 0F, 2F, 0.5F, 0F, -2.6F, 0.5F, 0F); // Box 285
		turretModel[39].setRotationPoint(4F, -18F, 0F);

		turretModel[40].addShapeBox(-36F, -14.5F, -17.75F, 1, 8, 7, 0F,-3.6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.6F, 0.5F, 0F, 2F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Box 287
		turretModel[40].setRotationPoint(4F, -18F, 0F);

		turretModel[41].addShapeBox(-32F, -14.5F, -18F, 11, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.2F, 0F, -0.25F, 1F, -1.5F, -0.25F, 0F, 0F, 1.75F, 0F, 0F, -1.25F, 1.2F, -1.5F, -0.25F); // Box 288
		turretModel[41].setRotationPoint(4F, -18F, 0F);

		turretModel[42].addShapeBox(-35.75F, -14.5F, -10.75F, 1, 8, 7, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1F, 0.5F, 0F, -1.5F, 0.5F, 0F, -3.25F, 0.5F, 0.25F, 2.75F, 0.5F, 0.25F); // Box 290
		turretModel[42].setRotationPoint(4F, -18F, 0F);

		turretModel[43].addShapeBox(-35.75F, -14.5F, 3.75F, 1, 8, 7, 0F,1.5F, 0F, 0.25F, -2F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 2.75F, 0.5F, 0.25F, -3.25F, 0.5F, 0.25F, -1.5F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 291
		turretModel[43].setRotationPoint(4F, -18F, 0F);

		turretModel[44].addShapeBox(-37.75F, -15.5F, -3.75F, 7, 9, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 1F, 0.5F, 0.25F); // Box 292
		turretModel[44].setRotationPoint(4F, -18F, 0F);

		turretModel[45].addShapeBox(-21F, -14.5F, -18F, 9, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, -1F, 0.8F, 4.75F, -1F, 0.9F, -4.25F, 0F, 0F, -1.25F); // Box 293
		turretModel[45].setRotationPoint(4F, -18F, 0F);

		turretModel[46].addShapeBox(-12F, -14.5F, -18F, 6, 12, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 1F, -1.2F, 4.75F, 0F, -0.25F, 7.25F, 0F, -0.25F, -7.75F, 1F, -1.2F, -5.25F); // Box 274
		turretModel[46].setRotationPoint(4F, -18F, 0F);

		turretModel[47].addShapeBox(-6F, -14.5F, -19F, 1, 12, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, 6.25F, 0F, 0F, 6.5F, 0F, 0F, -7F, 0F, -0.25F, -6.75F); // Box 275
		turretModel[47].setRotationPoint(4F, -18F, 0F);

		turretModel[48].addShapeBox(-5F, -14.5F, -19.25F, 6, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, 6.25F, 0F, 1.5F, 6.5F, 0F, 1.5F, -7F, 0F, 1F, -6.75F); // Box 276
		turretModel[48].setRotationPoint(4F, -18F, 0F);

		turretModel[49].addShapeBox(1F, -14.5F, -19.25F, 6, 12, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 6.5F, 0F, 1F, 5.75F, 0F, 1F, -6.25F, 0F, 0.5F, -7F); // Box 278
		turretModel[49].setRotationPoint(4F, -18F, 0F);

		turretModel[50].addShapeBox(-21F, -14.5F, 17F, 9, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0.9F, -3.25F, -1F, 0.8F, 4.75F, 0F, 0F, 1.75F); // Box 280
		turretModel[50].setRotationPoint(4F, -18F, 0F);

		turretModel[51].addShapeBox(-5F, -14.5F, 18.25F, 6, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -6.75F, 0F, 1.5F, -7F, 0F, 1.5F, 6.5F, 0F, 1F, 6.25F); // Box 281
		turretModel[51].setRotationPoint(4F, -18F, 0F);

		turretModel[52].addShapeBox(1F, -14.5F, 18.25F, 6, 12, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -7F, 0F, 1F, -6.25F, 0F, 1F, 5.75F, 0F, 0.5F, 6.5F); // Box 282
		turretModel[52].setRotationPoint(4F, -18F, 0F);

		turretModel[53].addShapeBox(-6F, -14.5F, 18F, 1, 12, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -6.75F, 0F, 0F, -7F, 0F, 0F, 6.5F, 0F, -0.25F, 6.25F); // Box 283
		turretModel[53].setRotationPoint(4F, -18F, 0F);

		turretModel[54].addShapeBox(-12F, -14.5F, 17F, 6, 12, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 1F, -1.2F, -5.25F, 0F, -0.25F, -7.75F, 0F, -0.25F, 7.25F, 1F, -1.2F, 4.75F); // Box 284
		turretModel[54].setRotationPoint(4F, -18F, 0F);

		turretModel[55].addShapeBox(7F, -13.5F, 18.25F, 6, 11, 1, 0F,0F, 0F, -0.25F, 1F, -5F, 0F, 1F, -5F, -0.5F, 0F, 0F, -0.25F, 0F, 1F, -6.25F, 2F, 1F, -3.25F, 1.75F, 1F, 2.8F, 0F, 1F, 5.75F); // Box 285
		turretModel[55].setRotationPoint(4F, -18F, 0F);

		turretModel[56].addShapeBox(14F, -8.5F, 18F, 8, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 3.75F, 0F, 0F, -4.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, 4F, -1F, 2.75F, 4F, -1F, -3.25F, -0.75F, 0F, 3.1F); // Box 286
		turretModel[56].setRotationPoint(4F, -18F, 0F);

		turretModel[57].addShapeBox(14F, -8.5F, -19F, 8, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -4.25F, 0F, 0F, 3.75F, 0F, 0F, -0.25F, -0.75F, 0F, 3.1F, 4F, -1F, -3.25F, 4F, -1F, 2.75F, 0F, 0F, -3.25F); // Box 287
		turretModel[57].setRotationPoint(4F, -18F, 0F);

		turretModel[58].addShapeBox(7F, -13.5F, -19.25F, 6, 11, 1, 0F,0F, 0F, -0.25F, 1F, -5F, -0.5F, 1F, -5F, 0F, 0F, 0F, -0.25F, 0F, 1F, 5.75F, 1.75F, 1F, 2.8F, 2F, 1F, -3.25F, 0F, 1F, -6.25F); // Box 288
		turretModel[58].setRotationPoint(4F, -18F, 0F);

		turretModel[59].addShapeBox(13F, -16.5F, -11F, 5, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		turretModel[59].setRotationPoint(4F, -18F, 0F);

		turretModel[60].addShapeBox(11F, -16.5F, -11F, 2, 4, 8, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 302
		turretModel[60].setRotationPoint(4F, -18F, 0F);

		turretModel[61].addShapeBox(9F, -16.5F, -11F, 2, 4, 8, 0F,0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.25F); // Box 303
		turretModel[61].setRotationPoint(4F, -18F, 0F);

		turretModel[62].addShapeBox(8F, -16.5F, -9F, 1, 4, 4, 0F,-0.35F, 0F, -1.9F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.35F, 0F, -1.9F, -0.35F, 0F, -1.9F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.35F, 0F, -1.9F); // Box 304
		turretModel[62].setRotationPoint(4F, -18F, 0F);

		turretModel[63].addShapeBox(16F, -16F, -10.75F, 5, 2, 1, 0F,0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 305
		turretModel[63].setRotationPoint(4F, -18F, 0F);

		turretModel[64].addShapeBox(16F, -16F, -4.25F, 5, 2, 1, 0F,0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 306
		turretModel[64].setRotationPoint(4F, -18F, 0F);

		turretModel[65].addShapeBox(-14F, -15F, -9F, 20, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		turretModel[65].setRotationPoint(4F, -18F, 0F);

		turretModel[66].addShapeBox(-14F, -15F, -12F, 20, 4, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		turretModel[66].setRotationPoint(4F, -18F, 0F);

		turretModel[67].addShapeBox(-13.5F, -15F, -15F, 19, 4, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		turretModel[67].setRotationPoint(4F, -18F, 0F);

		turretModel[68].addShapeBox(-11.5F, -15F, -17F, 15, 5, 2, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		turretModel[68].setRotationPoint(4F, -18F, 0F);

		turretModel[69].addShapeBox(-11.5F, -15F, 15F, 15, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 311
		turretModel[69].setRotationPoint(4F, -18F, 0F);

		turretModel[70].addShapeBox(-13.5F, -15F, 12F, 19, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 312
		turretModel[70].setRotationPoint(4F, -18F, 0F);

		turretModel[71].addShapeBox(-14F, -15F, 9F, 20, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 313
		turretModel[71].setRotationPoint(4F, -18F, 0F);

		turretModel[72].addShapeBox(-11.5F, -16F, 7F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		turretModel[72].setRotationPoint(4F, -18F, 0F);

		turretModel[73].addShapeBox(-11.5F, -16F, 3F, 13, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		turretModel[73].setRotationPoint(4F, -18F, 0F);

		turretModel[74].addShapeBox(-11.5F, -16F, 12F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 318
		turretModel[74].setRotationPoint(4F, -18F, 0F);

		turretModel[75].addShapeBox(-12.5F, -16F, -7F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 319
		turretModel[75].setRotationPoint(4F, -18F, 0F);

		turretModel[76].addShapeBox(-8.5F, -16F, -3F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		turretModel[76].setRotationPoint(0F, -18F, -9F);

		turretModel[77].addShapeBox(-12.5F, -16F, -16F, 13, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		turretModel[77].setRotationPoint(4F, -18F, 0F);

		turretModel[78].addShapeBox(-11.5F, -16.5F, -4.5F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		turretModel[78].setRotationPoint(4F, -18F, 0F);
		turretModel[78].rotateAngleY = -0.80285146F;

		turretModel[79].addShapeBox(-13.5F, -16.5F, 2F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		turretModel[79].setRotationPoint(4F, -18F, 0F);
		turretModel[79].rotateAngleY = 0.80285146F;

		turretModel[80].addShapeBox(-27.75F, -13.5F, -17.5F, 1, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		turretModel[80].setRotationPoint(4F, -18F, 0F);

		turretModel[81].addShapeBox(-30.75F, -15.5F, -3.75F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 330
		turretModel[81].setRotationPoint(4F, -18F, 0F);

		turretModel[82].addShapeBox(-30.75F, -15.5F, 2.5F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 331
		turretModel[82].setRotationPoint(4F, -18F, 0F);

		turretModel[83].addShapeBox(-34.75F, -7.5F, -13.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		turretModel[83].setRotationPoint(4F, -18F, 0F);

		turretModel[84].addShapeBox(-36.75F, -7.5F, -8.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		turretModel[84].setRotationPoint(4F, -18F, 0F);

		turretModel[85].addShapeBox(-36.75F, -7.5F, 7.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		turretModel[85].setRotationPoint(4F, -18F, 0F);

		turretModel[86].addShapeBox(-34.75F, -7.5F, 12.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		turretModel[86].setRotationPoint(4F, -18F, 0F);

		turretModel[87].addShapeBox(-31.75F, -7.5F, 10.5F, 1, 1, 7, 0F,0.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, 1.85F, -0.15F, 0F, -2.15F, -0.15F, 0F, 0.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, 1.85F, -0.15F, 0F, -2.15F, -0.15F, 0F); // Box 336
		turretModel[87].setRotationPoint(4F, -18F, 0F);

		turretModel[88].addShapeBox(-29.5F, -7.5F, 10.5F, 1, 1, 7, 0F,0.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, 1.85F, -0.15F, 0F, -2.15F, -0.15F, 0F, 0.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, 1.85F, -0.15F, 0F, -2.15F, -0.15F, 0F); // Box 337
		turretModel[88].setRotationPoint(4F, -18F, 0F);

		turretModel[89].addShapeBox(-29.5F, -7.5F, -17.5F, 1, 1, 7, 0F,-2.15F, -0.15F, 0F, 1.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, 0.85F, -0.15F, 0F, -2.15F, -0.15F, 0F, 1.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, 0.85F, -0.15F, 0F); // Box 338
		turretModel[89].setRotationPoint(4F, -18F, 0F);

		turretModel[90].addShapeBox(-31.75F, -7.5F, -17.5F, 1, 1, 7, 0F,-2.15F, -0.15F, 0F, 1.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, 0.85F, -0.15F, 0F, -2.15F, -0.15F, 0F, 1.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, 0.85F, -0.15F, 0F); // Box 339
		turretModel[90].setRotationPoint(4F, -18F, 0F);

		turretModel[91].addShapeBox(-30.5F, -7.5F, -10.5F, 1, 1, 7, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -1.15F, -0.15F, 0F, 0.85F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -1.15F, -0.15F, 0F, 0.85F, -0.15F, 0F); // Box 340
		turretModel[91].setRotationPoint(4F, -18F, 0F);

		turretModel[92].addShapeBox(-32.75F, -7.5F, -10.5F, 1, 1, 7, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -1.15F, -0.15F, 0F, 0.85F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -1.15F, -0.15F, 0F, 0.85F, -0.15F, 0F); // Box 341
		turretModel[92].setRotationPoint(4F, -18F, 0F);

		turretModel[93].addShapeBox(-30.5F, -7.5F, 3.5F, 1, 1, 7, 0F,0.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 342
		turretModel[93].setRotationPoint(4F, -18F, 0F);

		turretModel[94].addShapeBox(-32.75F, -7.5F, 3.5F, 1, 1, 7, 0F,0.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0.85F, -0.15F, 0F, -1.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 343
		turretModel[94].setRotationPoint(4F, -18F, 0F);

		turretModel[95].addShapeBox(-35.75F, -15.75F, 3.75F, 3, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 344
		turretModel[95].setRotationPoint(4F, -18F, 0F);

		turretModel[96].addShapeBox(-35.75F, -15.75F, -7F, 3, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 345
		turretModel[96].setRotationPoint(4F, -18F, 0F);

		turretModel[97].addShapeBox(12F, -12F, -17F, 5, 2, 5, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -1.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 357
		turretModel[97].setRotationPoint(4F, -18F, 0F);

		turretModel[98].addShapeBox(12F, -13.5F, -17F, 5, 2, 5, 0F,-1.75F, 0F, -1.5F, -1.75F, 0F, -1.75F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.4F, -0.25F, 0F, -0.4F, -1.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 358
		turretModel[98].setRotationPoint(4F, -18F, 0F);

		turretModel[99].addShapeBox(12F, -10.5F, -17F, 5, 2, 5, 0F,0F, -0.4F, 0.25F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.75F, 0F, 0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 359
		turretModel[99].setRotationPoint(4F, -18F, 0F);

		turretModel[100].addShapeBox(12F, -13.5F, 12F, 5, 2, 5, 0F,-1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -1.75F, -1.75F, 0F, -1.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.5F, 0F, -0.4F, -0.25F); // Box 363
		turretModel[100].setRotationPoint(4F, -18F, 0F);

		turretModel[101].addShapeBox(12F, -12F, 12F, 5, 2, 5, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.5F, 0F, -0.1F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, 0.25F); // Box 364
		turretModel[101].setRotationPoint(4F, -18F, 0F);

		turretModel[102].addShapeBox(12F, -10.5F, 12F, 5, 2, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, 0.25F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -0.25F, -1.75F, 0F, 0.25F); // Box 365
		turretModel[102].setRotationPoint(4F, -18F, 0F);

		turretModel[103].addShapeBox(-4.75F, -5.25F, -25.75F, 7, 1, 1, 0F,0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F, 0.5F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F, 0.5F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F); // Box 372
		turretModel[103].setRotationPoint(4F, -18F, 0F);
		turretModel[103].rotateAngleY = 0.12217305F;

		turretModel[104].addShapeBox(-0.75F, -5.25F, -26.25F, 6, 1, 1, 0F,0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F, 0.5F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F, 0.5F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F); // Box 373
		turretModel[104].setRotationPoint(4F, -18F, 0F);
		turretModel[104].rotateAngleY = 0.43633231F;

		turretModel[105].addShapeBox(-2.2F, -5.25F, -26.25F, 1, 1, 3, 0F,-0.6F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 374
		turretModel[105].setRotationPoint(4F, -18F, 0F);
		turretModel[105].rotateAngleY = 0.43633231F;

		turretModel[106].addShapeBox(5.7F, -5.25F, -26.25F, 1, 1, 3, 0F,0F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 375
		turretModel[106].setRotationPoint(4F, -18F, 0F);
		turretModel[106].rotateAngleY = 0.43633231F;

		turretModel[107].addShapeBox(2.7F, -5.25F, -25.75F, 1, 1, 3, 0F,0F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 376
		turretModel[107].setRotationPoint(4F, -18F, 0F);
		turretModel[107].rotateAngleY = 0.12217305F;

		turretModel[108].addShapeBox(-6.2F, -5.25F, -25.75F, 1, 1, 3, 0F,-0.6F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 377
		turretModel[108].setRotationPoint(4F, -18F, 0F);
		turretModel[108].rotateAngleY = 0.12217305F;

		turretModel[109].addShapeBox(-6.2F, -5.25F, 22.75F, 1, 1, 3, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F); // Box 378
		turretModel[109].setRotationPoint(4F, -18F, 0F);
		turretModel[109].rotateAngleY = -0.12217305F;

		turretModel[110].addShapeBox(-4.75F, -5.25F, 24.75F, 7, 1, 1, 0F,0.5F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F, 0.5F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F); // Box 379
		turretModel[110].setRotationPoint(4F, -18F, 0F);
		turretModel[110].rotateAngleY = -0.12217305F;

		turretModel[111].addShapeBox(2.7F, -5.25F, 22.75F, 1, 1, 3, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 380
		turretModel[111].setRotationPoint(4F, -18F, 0F);
		turretModel[111].rotateAngleY = -0.12217305F;

		turretModel[112].addShapeBox(-0.75F, -5.25F, 25F, 6, 1, 1, 0F,0.5F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F, 0.5F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F); // Box 381
		turretModel[112].setRotationPoint(4F, -18F, 0F);
		turretModel[112].rotateAngleY = -0.43633231F;

		turretModel[113].addShapeBox(-2.2F, -5.25F, 23F, 1, 1, 3, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F); // Box 382
		turretModel[113].setRotationPoint(4F, -18F, 0F);
		turretModel[113].rotateAngleY = -0.43633231F;

		turretModel[114].addShapeBox(5.7F, -5.25F, 23F, 1, 1, 3, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 383
		turretModel[114].setRotationPoint(4F, -18F, 0F);
		turretModel[114].rotateAngleY = -0.43633231F;

		turretModel[115].addShapeBox(-10.5F, -12.75F, 24.25F, 8, 1, 1, 0F,0.45F, -0.2F, -0.1F, 0.45F, -0.2F, -0.2F, 0.5F, -0.2F, -0.3F, 0F, -0.2F, -0.4F, 0.45F, -0.2F, -0.1F, 0.45F, -0.2F, -0.2F, 0.5F, -0.2F, -0.3F, 0F, -0.2F, -0.4F); // Box 384
		turretModel[115].setRotationPoint(4F, -18F, 0F);
		turretModel[115].rotateAngleY = 0.38397244F;

		turretModel[116].addShapeBox(-11.05F, -12.75F, 21.7F, 4, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.3F, 0.15F, -0.2F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.3F, 0.15F, -0.2F, -0.3F); // Box 385
		turretModel[116].setRotationPoint(4F, -18F, 0F);

		turretModel[117].addShapeBox(-7.05F, -12.75F, 21.7F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, 0.1F, 0.5F, -0.2F, -0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, 0.1F, 0.5F, -0.2F, -0.5F, 0F, -0.2F, -0.3F); // Box 386
		turretModel[117].setRotationPoint(4F, -18F, 0F);

		turretModel[118].addShapeBox(-5.55F, -12.75F, 21.5F, 1, 1, 1, 0F,0F, -0.2F, -0.1F, 1.25F, -0.2F, 2F, 1.5F, -0.2F, -2.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.1F, 1.25F, -0.2F, 2F, 1.5F, -0.2F, -2.5F, 0F, -0.2F, -0.3F); // Box 387
		turretModel[118].setRotationPoint(4F, -18F, 0F);

		turretModel[119].addShapeBox(-4.05F, -12.75F, -19.87F, 1, 1, 1, 0F,1.25F, -0.2F, 2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.3F, 1.5F, -0.2F, -2.5F, 1.25F, -0.2F, 2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.3F, 1.5F, -0.2F, -2.5F); // Box 388
		turretModel[119].setRotationPoint(4F, -18F, 0F);

		turretModel[120].addShapeBox(-6.6F, -12.75F, -22.07F, 1, 1, 1, 0F,0.5F, -0.2F, 0.1F, 0.3F, -0.2F, -0.2F, 0.05F, -0.2F, -0.3F, 0.5F, -0.2F, -0.55F, 0.5F, -0.2F, 0.1F, 0.3F, -0.2F, -0.2F, 0.05F, -0.2F, -0.3F, 0.5F, -0.2F, -0.55F); // Box 389
		turretModel[120].setRotationPoint(4F, -18F, 0F);

		turretModel[121].addShapeBox(-11.1F, -12.75F, -22.35F, 4, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 390
		turretModel[121].setRotationPoint(4F, -18F, 0F);

		turretModel[122].addShapeBox(-11.5F, -12.75F, -25F, 9, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.3F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.1F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.3F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.1F); // Box 391
		turretModel[122].setRotationPoint(4F, -18F, 0F);
		turretModel[122].rotateAngleY = -0.38397244F;

		turretModel[123].addShapeBox(-21F, -11.5F, -18F, 9, 7, 1, 0F,1F, 0.5F, 0F, -0.5F, -1F, 2.5F, 0F, -1F, -2.25F, 0F, 0F, -1F, 0F, 0F, 1.75F, -1F, 0.8F, 4.75F, -1F, 0.9F, -4.25F, 0F, 0F, -1.25F); // Box 392
		turretModel[123].setRotationPoint(4F, -18F, 0F);

		turretModel[124].addShapeBox(-12F, -10.5F, -18F, 6, 8, 1, 0F,0.5F, 0F, 2.5F, 0F, 0F, 3F, 0F, 0F, -3.25F, 0F, 0F, -2.25F, 1F, -1.2F, 4.75F, 0F, -0.25F, 7.25F, 0F, -0.25F, -7.75F, 1F, -1.2F, -5.25F); // Box 394
		turretModel[124].setRotationPoint(4F, -18F, 0F);

		turretModel[125].addShapeBox(-12F, -10.5F, 17F, 6, 8, 1, 0F,0F, 0F, -2.25F, 0F, 0F, -3.25F, 0F, 0F, 3F, 0.5F, 0F, 2.5F, 1F, -1.2F, -5.25F, 0F, -0.25F, -7.75F, 0F, -0.25F, 7.25F, 1F, -1.2F, 4.75F); // Box 395
		turretModel[125].setRotationPoint(4F, -18F, 0F);

		turretModel[126].addShapeBox(-21F, -11.5F, 17F, 9, 7, 1, 0F,0F, 0F, -1F, 0F, -1F, -2.25F, -0.5F, -1F, 2.5F, 1F, 0.5F, 0F, 0F, 0F, -1.25F, -1F, 0.9F, -4.25F, -1F, 0.8F, 4.75F, 0F, 0F, 1.75F); // Box 396
		turretModel[126].setRotationPoint(4F, -18F, 0F);

		turretModel[127].addShapeBox(-1.15F, -16.5F, 19.25F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		turretModel[127].setRotationPoint(4F, -18F, 0F);
		turretModel[127].rotateAngleZ = 0.68067841F;

		turretModel[128].addShapeBox(-2.6F, -18.5F, 18.75F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		turretModel[128].setRotationPoint(4F, -18F, 0F);
		turretModel[128].rotateAngleZ = 0.68067841F;

		turretModel[129].addShapeBox(-4.1F, -20.25F, 18F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		turretModel[129].setRotationPoint(4F, -18F, 0F);
		turretModel[129].rotateAngleZ = 0.68067841F;

		turretModel[130].addShapeBox(1.4F, -14.75F, 19.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		turretModel[130].setRotationPoint(4F, -18F, 0F);
		turretModel[130].rotateAngleZ = 0.68067841F;

		turretModel[131].addShapeBox(-0.15F, -16.5F, 19.25F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 401
		turretModel[131].setRotationPoint(4F, -18F, 0F);
		turretModel[131].rotateAngleZ = 0.68067841F;

		turretModel[132].addShapeBox(-1.6F, -18.5F, 18.75F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 402
		turretModel[132].setRotationPoint(4F, -18F, 0F);
		turretModel[132].rotateAngleZ = 0.68067841F;

		turretModel[133].addShapeBox(-3.1F, -20.25F, 18F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 403
		turretModel[133].setRotationPoint(4F, -18F, 0F);
		turretModel[133].rotateAngleZ = 0.68067841F;

		turretModel[134].addShapeBox(2.4F, -14.75F, 19.5F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 404
		turretModel[134].setRotationPoint(4F, -18F, 0F);
		turretModel[134].rotateAngleZ = 0.68067841F;

		turretModel[135].addShapeBox(-3.1F, -20.25F, -19.75F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 405
		turretModel[135].setRotationPoint(4F, -18F, 0F);
		turretModel[135].rotateAngleZ = 0.68067841F;

		turretModel[136].addShapeBox(-4.1F, -20.25F, -19.75F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		turretModel[136].setRotationPoint(4F, -18F, 0F);
		turretModel[136].rotateAngleZ = 0.68067841F;

		turretModel[137].addShapeBox(-1.6F, -18.5F, -20.25F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 407
		turretModel[137].setRotationPoint(4F, -18F, 0F);
		turretModel[137].rotateAngleZ = 0.68067841F;

		turretModel[138].addShapeBox(-2.6F, -18.5F, -20.25F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		turretModel[138].setRotationPoint(4F, -18F, 0F);
		turretModel[138].rotateAngleZ = 0.68067841F;

		turretModel[139].addShapeBox(-1.15F, -16.5F, -21.25F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		turretModel[139].setRotationPoint(4F, -18F, 0F);
		turretModel[139].rotateAngleZ = 0.68067841F;

		turretModel[140].addShapeBox(-0.15F, -16.5F, -21.25F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 410
		turretModel[140].setRotationPoint(4F, -18F, 0F);
		turretModel[140].rotateAngleZ = 0.68067841F;

		turretModel[141].addShapeBox(2.4F, -14.75F, -21.5F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 411
		turretModel[141].setRotationPoint(4F, -18F, 0F);
		turretModel[141].rotateAngleZ = 0.68067841F;

		turretModel[142].addShapeBox(1.4F, -14.75F, -21.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		turretModel[142].setRotationPoint(4F, -18F, 0F);
		turretModel[142].rotateAngleZ = 0.68067841F;

		turretModel[143].addShapeBox(-35.75F, -15.75F, 3.75F, 3, 1, 3, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 417
		turretModel[143].setRotationPoint(4F, -18F, 0F);

		turretModel[144].addShapeBox(-35.75F, -15.75F, -7.1F, 3, 1, 3, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 418
		turretModel[144].setRotationPoint(4F, -18F, 0F);

		turretModel[145].addShapeBox(2F, -16.5F, 8F, 1, 4, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		turretModel[145].setRotationPoint(4F, -18F, 0F);

		turretModel[146].addShapeBox(2.5F, -16.4F, 8F, 1, 1, 3, 0F,-0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F); // Box 420
		turretModel[146].setRotationPoint(4F, -18F, 0F);

		turretModel[147].addShapeBox(10.5F, -16.4F, 8F, 1, 1, 3, 0F,-0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F); // Box 421
		turretModel[147].setRotationPoint(4F, -18F, 0F);
		turretModel[147].rotateAngleY = 0.80285146F;

		turretModel[148].addShapeBox(10F, -16.5F, 8F, 1, 4, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		turretModel[148].setRotationPoint(4F, -18F, 0F);
		turretModel[148].rotateAngleY = 0.80285146F;

		turretModel[149].addShapeBox(9.5F, -16.4F, -12F, 1, 1, 3, 0F,-0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F); // Box 423
		turretModel[149].setRotationPoint(4F, -18F, 0F);
		turretModel[149].rotateAngleY = -0.76794487F;

		turretModel[150].addShapeBox(9F, -16.5F, -12F, 1, 4, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		turretModel[150].setRotationPoint(4F, -18F, 0F);
		turretModel[150].rotateAngleY = -0.76794487F;

		turretModel[151].addShapeBox(1.5F, -16.4F, -12F, 1, 1, 3, 0F,-0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F); // Box 425
		turretModel[151].setRotationPoint(4F, -18F, 0F);

		turretModel[152].addShapeBox(1F, -16.5F, -12F, 1, 4, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		turretModel[152].setRotationPoint(4F, -18F, 0F);

		turretModel[153].addShapeBox(13.25F, -16F, -9.75F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		turretModel[153].setRotationPoint(4F, -18F, 0F);

		turretModel[154].addShapeBox(13.25F, -16F, -5.75F, 5, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 513
		turretModel[154].setRotationPoint(4F, -18F, 0F);

		turretModel[155].addShapeBox(9.5F, -14.5F, -1F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		turretModel[155].setRotationPoint(4F, -18F, 0F);

		turretModel[156].addShapeBox(10F, -15.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		turretModel[156].setRotationPoint(4F, -18F, 0F);

		turretModel[157].addShapeBox(10F, -17.5F, -0.5F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 516
		turretModel[157].setRotationPoint(4F, -18F, 0F);

		turretModel[158].addShapeBox(2.25F, -17.5F, 11.5F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		turretModel[158].setRotationPoint(4F, -18F, 0F);

		turretModel[159].addShapeBox(2.25F, -19.5F, 11.5F, 2, 4, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 518
		turretModel[159].setRotationPoint(4F, -18F, 0F);

		turretModel[160].addShapeBox(3.25F, -19.25F, 12F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 519
		turretModel[160].setRotationPoint(4F, -18F, 0F);

		turretModel[161].addShapeBox(4.35F, -19.25F, 12F, 1, 1, 1, 0F,-0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F); // Box 520
		turretModel[161].setRotationPoint(4F, -18F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 481, 329, textureX, textureY); // Box 290
		barrelModel[1] = new ModelRendererTurbo(this, 65, 289, textureX, textureY); // Box 293
		barrelModel[2] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Box 294
		barrelModel[3] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 295
		barrelModel[4] = new ModelRendererTurbo(this, 73, 345, textureX, textureY); // Box 296
		barrelModel[5] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Box 297
		barrelModel[6] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 298
		barrelModel[7] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 299
		barrelModel[8] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 300
		barrelModel[9] = new ModelRendererTurbo(this, 161, 369, textureX, textureY); // Box 448
		barrelModel[10] = new ModelRendererTurbo(this, 201, 369, textureX, textureY); // Box 449
		barrelModel[11] = new ModelRendererTurbo(this, 241, 369, textureX, textureY); // Box 450
		barrelModel[12] = new ModelRendererTurbo(this, 361, 305, textureX, textureY); // Box 349
		barrelModel[13] = new ModelRendererTurbo(this, 401, 345, textureX, textureY); // Box 350
		barrelModel[14] = new ModelRendererTurbo(this, 73, 377, textureX, textureY); // Box 351
		barrelModel[15] = new ModelRendererTurbo(this, 105, 377, textureX, textureY); // Box 352
		barrelModel[16] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 353
		barrelModel[17] = new ModelRendererTurbo(this, 185, 377, textureX, textureY); // Box 354
		barrelModel[18] = new ModelRendererTurbo(this, 225, 377, textureX, textureY); // Box 355
		barrelModel[19] = new ModelRendererTurbo(this, 265, 377, textureX, textureY); // Box 356
		barrelModel[20] = new ModelRendererTurbo(this, 305, 377, textureX, textureY); // Box 357
		barrelModel[21] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 358
		barrelModel[22] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 359
		barrelModel[23] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 360
		barrelModel[24] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 361
		barrelModel[25] = new ModelRendererTurbo(this, 145, 385, textureX, textureY); // Box 362
		barrelModel[26] = new ModelRendererTurbo(this, 281, 385, textureX, textureY); // Box 364

		barrelModel[0].addShapeBox(1F, -2F, 2.5F, 3, 7, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 290
		barrelModel[0].setRotationPoint(35F, -26F, 0F);

		barrelModel[1].addShapeBox(-4F, -2F, 11.5F, 5, 7, 2, 0F,1F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 1.5F, -2F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 1.5F); // Box 293
		barrelModel[1].setRotationPoint(35F, -26F, 0F);

		barrelModel[2].addShapeBox(1F, -2F, -9.5F, 3, 7, 7, 0F,0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 294
		barrelModel[2].setRotationPoint(35F, -26F, 0F);

		barrelModel[3].addShapeBox(1F, -2F, 10.5F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 295
		barrelModel[3].setRotationPoint(35F, -26F, 0F);

		barrelModel[4].addShapeBox(1F, -2F, -13F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 296
		barrelModel[4].setRotationPoint(35F, -26F, 0F);

		barrelModel[5].addShapeBox(-4F, -2F, -13F, 5, 7, 2, 0F,1F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -2F, -2F, 1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, -2F); // Box 297
		barrelModel[5].setRotationPoint(35F, -26F, 0F);

		barrelModel[6].addShapeBox(1F, -2F, -2.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.5F, 0F, -1.25F, 0F); // Box 298
		barrelModel[6].setRotationPoint(35F, -26F, 0F);

		barrelModel[7].addShapeBox(1F, -2F, 0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F); // Box 299
		barrelModel[7].setRotationPoint(35F, -26F, 0F);

		barrelModel[8].addShapeBox(1F, -2F, -0.5F, 4, 2, 1, 0F,0F, 0F, 0F, -1F, -1.75F, 0.5F, -1F, -1.75F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -0.25F, 0F); // Box 300
		barrelModel[8].setRotationPoint(35F, -26F, 0F);

		barrelModel[9].addShapeBox(-3F, -0.75F, -2F, 13, 2, 4, 0F,0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 448
		barrelModel[9].setRotationPoint(39F, -24F, 0F);

		barrelModel[10].addShapeBox(-3F, -2.25F, -2F, 13, 2, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 449
		barrelModel[10].setRotationPoint(39F, -24F, 0F);

		barrelModel[11].addShapeBox(-3F, 0.75F, -2F, 13, 2, 4, 0F,0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 450
		barrelModel[11].setRotationPoint(39F, -24F, 0F);

		barrelModel[12].addShapeBox(19F, -2.25F, -2F, 10, 2, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 349
		barrelModel[12].setRotationPoint(39F, -24F, 0F);

		barrelModel[13].addShapeBox(19F, -0.75F, -2F, 10, 2, 4, 0F,0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 350
		barrelModel[13].setRotationPoint(39F, -24F, 0F);

		barrelModel[14].addShapeBox(19F, 0.75F, -2F, 10, 2, 4, 0F,0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 351
		barrelModel[14].setRotationPoint(39F, -24F, 0F);

		barrelModel[15].addShapeBox(32F, -2.25F, -2F, 12, 2, 4, 0F,0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 352
		barrelModel[15].setRotationPoint(39F, -24F, 0F);

		barrelModel[16].addShapeBox(32F, -0.75F, -2F, 12, 2, 4, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 353
		barrelModel[16].setRotationPoint(39F, -24F, 0F);

		barrelModel[17].addShapeBox(32F, 0.75F, -2F, 12, 2, 4, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F); // Box 354
		barrelModel[17].setRotationPoint(39F, -24F, 0F);

		barrelModel[18].addShapeBox(47F, -2.25F, -2F, 15, 2, 4, 0F,0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 355
		barrelModel[18].setRotationPoint(39F, -24F, 0F);

		barrelModel[19].addShapeBox(47F, -0.75F, -2F, 15, 2, 4, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 356
		barrelModel[19].setRotationPoint(39F, -24F, 0F);

		barrelModel[20].addShapeBox(47F, 0.75F, -2F, 15, 2, 4, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F); // Box 357
		barrelModel[20].setRotationPoint(39F, -24F, 0F);

		barrelModel[21].addShapeBox(63.5F, -2.25F, -2F, 4, 2, 4, 0F,0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 358
		barrelModel[21].setRotationPoint(39F, -24F, 0F);

		barrelModel[22].addShapeBox(63.5F, -0.75F, -2F, 4, 2, 4, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 359
		barrelModel[22].setRotationPoint(39F, -24F, 0F);

		barrelModel[23].addShapeBox(63.5F, 0.75F, -2F, 4, 2, 4, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F, 0F, -0.7F, -1.2F); // Box 360
		barrelModel[23].setRotationPoint(39F, -24F, 0F);

		barrelModel[24].addShapeBox(7F, -0.75F, -2F, 62, 2, 4, 0F,0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 361
		barrelModel[24].setRotationPoint(39F, -24F, 0F);

		barrelModel[25].addShapeBox(7F, -2.25F, -2F, 62, 2, 4, 0F,0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F); // Box 362
		barrelModel[25].setRotationPoint(39F, -24F, 0F);

		barrelModel[26].addShapeBox(7F, 0.75F, -2F, 62, 2, 4, 0F,0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F, 0F, -0.85F, -1.4F); // Box 364
		barrelModel[26].setRotationPoint(39F, -24F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 113
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 114
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 116
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 117
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 118
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 119
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 120
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 121
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 122
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 123
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 124
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 125
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 126
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 127
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 128
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 129
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 130
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 131
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 132
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 133
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 134
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 135
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 136
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 137
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 138
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 139
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 140
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 204
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 205
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 206
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 207
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 208
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 209
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 210
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 211
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 212

		leftTrackWheelModels[0].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 113
		leftTrackWheelModels[0].setRotationPoint(-0.25F, 3F, 27F);

		leftTrackWheelModels[1].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftTrackWheelModels[1].setRotationPoint(-0.25F, 3F, 27F);

		leftTrackWheelModels[2].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 116
		leftTrackWheelModels[2].setRotationPoint(-0.25F, 3F, 27F);

		leftTrackWheelModels[3].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 117
		leftTrackWheelModels[3].setRotationPoint(12.5F, 3F, 27F);

		leftTrackWheelModels[4].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 118
		leftTrackWheelModels[4].setRotationPoint(12.5F, 3F, 27F);

		leftTrackWheelModels[5].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftTrackWheelModels[5].setRotationPoint(12.5F, 3F, 27F);

		leftTrackWheelModels[6].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 120
		leftTrackWheelModels[6].setRotationPoint(25.25F, 3F, 27F);

		leftTrackWheelModels[7].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 121
		leftTrackWheelModels[7].setRotationPoint(25.25F, 3F, 27F);

		leftTrackWheelModels[8].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftTrackWheelModels[8].setRotationPoint(25.25F, 3F, 27F);

		leftTrackWheelModels[9].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 123
		leftTrackWheelModels[9].setRotationPoint(38F, 3F, 27F);

		leftTrackWheelModels[10].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 124
		leftTrackWheelModels[10].setRotationPoint(38F, 3F, 27F);

		leftTrackWheelModels[11].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftTrackWheelModels[11].setRotationPoint(38F, 3F, 27F);

		leftTrackWheelModels[12].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 126
		leftTrackWheelModels[12].setRotationPoint(-13F, 3F, 27F);

		leftTrackWheelModels[13].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftTrackWheelModels[13].setRotationPoint(-13F, 3F, 27F);

		leftTrackWheelModels[14].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 128
		leftTrackWheelModels[14].setRotationPoint(-13F, 3F, 27F);

		leftTrackWheelModels[15].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 129
		leftTrackWheelModels[15].setRotationPoint(-25.75F, 3F, 27F);

		leftTrackWheelModels[16].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		leftTrackWheelModels[16].setRotationPoint(-25.75F, 3F, 27F);

		leftTrackWheelModels[17].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 131
		leftTrackWheelModels[17].setRotationPoint(-25.75F, 3F, 27F);

		leftTrackWheelModels[18].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		leftTrackWheelModels[18].setRotationPoint(-38.75F, 3F, 27F);

		leftTrackWheelModels[19].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 133
		leftTrackWheelModels[19].setRotationPoint(-38.75F, 3F, 27F);

		leftTrackWheelModels[20].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 134
		leftTrackWheelModels[20].setRotationPoint(-38.75F, 3F, 27F);

		leftTrackWheelModels[21].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		leftTrackWheelModels[21].setRotationPoint(-52.25F, -5F, 27F);

		leftTrackWheelModels[22].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 136
		leftTrackWheelModels[22].setRotationPoint(-52.25F, -5F, 27F);

		leftTrackWheelModels[23].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 137
		leftTrackWheelModels[23].setRotationPoint(-52.25F, -5F, 27F);

		leftTrackWheelModels[24].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 138
		leftTrackWheelModels[24].setRotationPoint(52.25F, -5.25F, 27F);

		leftTrackWheelModels[25].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 139
		leftTrackWheelModels[25].setRotationPoint(52.25F, -5.25F, 27F);

		leftTrackWheelModels[26].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		leftTrackWheelModels[26].setRotationPoint(52.25F, -5.25F, 27F);

		leftTrackWheelModels[27].addShapeBox(-1F, -0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 204
		leftTrackWheelModels[27].setRotationPoint(32F, -8.5F, 24F);

		leftTrackWheelModels[28].addShapeBox(-1F, -1.5F, -5F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 205
		leftTrackWheelModels[28].setRotationPoint(32F, -8.5F, 24F);

		leftTrackWheelModels[29].addShapeBox(-1F, 0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 206
		leftTrackWheelModels[29].setRotationPoint(32F, -8.5F, 24F);

		leftTrackWheelModels[30].addShapeBox(-1F, 0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 207
		leftTrackWheelModels[30].setRotationPoint(-31F, -8.5F, 24F);

		leftTrackWheelModels[31].addShapeBox(-1F, -1.5F, -5F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 208
		leftTrackWheelModels[31].setRotationPoint(-31F, -8.5F, 24F);

		leftTrackWheelModels[32].addShapeBox(-1F, -0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 209
		leftTrackWheelModels[32].setRotationPoint(-31F, -8.5F, 24F);

		leftTrackWheelModels[33].addShapeBox(-1F, 0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 210
		leftTrackWheelModels[33].setRotationPoint(-7F, -8.5F, 24F);

		leftTrackWheelModels[34].addShapeBox(-1F, -1.5F, -5F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 211
		leftTrackWheelModels[34].setRotationPoint(-7F, -8.5F, 24F);

		leftTrackWheelModels[35].addShapeBox(-1F, -0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 212
		leftTrackWheelModels[35].setRotationPoint(-7F, -8.5F, 24F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 141
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 142
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 143
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 144
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 145
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 146
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 147
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 148
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 149
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 150
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box 151
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 152
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 153
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 154
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 155
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 156
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 157
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 158
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 159
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 160
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 161
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 162
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 163
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 164
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 165
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 166
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 167
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 213
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 214
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 215
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 216
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 217
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 218
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 219
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 220
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 221

		rightTrackWheelModels[0].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		rightTrackWheelModels[0].setRotationPoint(38F, 3F, -20F);

		rightTrackWheelModels[1].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 142
		rightTrackWheelModels[1].setRotationPoint(38F, 3F, -20F);

		rightTrackWheelModels[2].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 143
		rightTrackWheelModels[2].setRotationPoint(38F, 3F, -20F);

		rightTrackWheelModels[3].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		rightTrackWheelModels[3].setRotationPoint(52F, -5F, -21F);

		rightTrackWheelModels[4].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 145
		rightTrackWheelModels[4].setRotationPoint(52F, -5F, -21F);

		rightTrackWheelModels[5].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 146
		rightTrackWheelModels[5].setRotationPoint(52F, -5F, -21F);

		rightTrackWheelModels[6].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		rightTrackWheelModels[6].setRotationPoint(25.25F, 3F, -20F);

		rightTrackWheelModels[7].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 148
		rightTrackWheelModels[7].setRotationPoint(25.25F, 3F, -20F);

		rightTrackWheelModels[8].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 149
		rightTrackWheelModels[8].setRotationPoint(25.25F, 3F, -20F);

		rightTrackWheelModels[9].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 150
		rightTrackWheelModels[9].setRotationPoint(12.5F, 3F, -20F);

		rightTrackWheelModels[10].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 151
		rightTrackWheelModels[10].setRotationPoint(12.5F, 3F, -20F);

		rightTrackWheelModels[11].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		rightTrackWheelModels[11].setRotationPoint(12.5F, 3F, -20F);

		rightTrackWheelModels[12].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightTrackWheelModels[12].setRotationPoint(-0.25F, 3F, -20F);

		rightTrackWheelModels[13].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 154
		rightTrackWheelModels[13].setRotationPoint(-0.25F, 3F, -20F);

		rightTrackWheelModels[14].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 155
		rightTrackWheelModels[14].setRotationPoint(-0.25F, 3F, -20F);

		rightTrackWheelModels[15].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 156
		rightTrackWheelModels[15].setRotationPoint(-13F, 3F, -20F);

		rightTrackWheelModels[16].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 157
		rightTrackWheelModels[16].setRotationPoint(-13F, 3F, -20F);

		rightTrackWheelModels[17].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		rightTrackWheelModels[17].setRotationPoint(-13F, 3F, -20F);

		rightTrackWheelModels[18].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		rightTrackWheelModels[18].setRotationPoint(-25.75F, 3F, -20F);

		rightTrackWheelModels[19].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 160
		rightTrackWheelModels[19].setRotationPoint(-25.75F, 3F, -20F);

		rightTrackWheelModels[20].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 161
		rightTrackWheelModels[20].setRotationPoint(-25.75F, 3F, -20F);

		rightTrackWheelModels[21].addShapeBox(-5.75F, 2F, -7F, 12, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 162
		rightTrackWheelModels[21].setRotationPoint(-38.75F, 3F, -20F);

		rightTrackWheelModels[22].addBox(-5.75F, -2F, -7F, 12, 4, 7, 0F); // Box 163
		rightTrackWheelModels[22].setRotationPoint(-38.75F, 3F, -20F);

		rightTrackWheelModels[23].addShapeBox(-5.75F, -6F, -7F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		rightTrackWheelModels[23].setRotationPoint(-38.75F, 3F, -20F);

		rightTrackWheelModels[24].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 165
		rightTrackWheelModels[24].setRotationPoint(-52F, -5F, -21F);

		rightTrackWheelModels[25].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		rightTrackWheelModels[25].setRotationPoint(-52F, -5F, -21F);

		rightTrackWheelModels[26].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 167
		rightTrackWheelModels[26].setRotationPoint(-52F, -5F, -21F);

		rightTrackWheelModels[27].addShapeBox(-1F, 0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 213
		rightTrackWheelModels[27].setRotationPoint(-7F, -8.5F, -19F);

		rightTrackWheelModels[28].addShapeBox(-1F, -1.5F, -5F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 214
		rightTrackWheelModels[28].setRotationPoint(-7F, -8.5F, -19F);

		rightTrackWheelModels[29].addShapeBox(-1F, -0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 215
		rightTrackWheelModels[29].setRotationPoint(-7F, -8.5F, -19F);

		rightTrackWheelModels[30].addShapeBox(-1F, -1.5F, -5F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 216
		rightTrackWheelModels[30].setRotationPoint(-31F, -8.5F, -19F);

		rightTrackWheelModels[31].addShapeBox(-1F, -0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 217
		rightTrackWheelModels[31].setRotationPoint(-31F, -8.5F, -19F);

		rightTrackWheelModels[32].addShapeBox(-1F, 0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 218
		rightTrackWheelModels[32].setRotationPoint(-31F, -8.5F, -19F);

		rightTrackWheelModels[33].addShapeBox(-1F, -1.5F, -5F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 219
		rightTrackWheelModels[33].setRotationPoint(32F, -8.5F, -19F);

		rightTrackWheelModels[34].addShapeBox(-1F, -0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 220
		rightTrackWheelModels[34].setRotationPoint(32F, -8.5F, -19F);

		rightTrackWheelModels[35].addShapeBox(-1F, 0.5F, -5F, 2, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 221
		rightTrackWheelModels[35].setRotationPoint(32F, -8.5F, -19F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 168
		leftTrackModel[1] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 169
		leftTrackModel[2] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 170
		leftTrackModel[3] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 171
		leftTrackModel[4] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 172
		leftTrackModel[5] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 173
		leftTrackModel[6] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 174
		leftTrackModel[7] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 175
		leftTrackModel[8] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 179
		leftTrackModel[9] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Box 181
		leftTrackModel[10] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Box 183
		leftTrackModel[11] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 184
		leftTrackModel[12] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 185
		leftTrackModel[13] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 186

		leftTrackModel[0].addShapeBox(-5.75F, 2F, -7F, 75, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 168
		leftTrackModel[0].setRotationPoint(-32.5F, 7F, 26.5F);

		leftTrackModel[1].addShapeBox(-5.75F, 2F, -7F, 75, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 169
		leftTrackModel[1].setRotationPoint(-32.5F, -13F, 26.5F);

		leftTrackModel[2].addShapeBox(-5.75F, 2F, -7F, 16, 1, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 170
		leftTrackModel[2].setRotationPoint(-48.5F, -13F, 26.5F);

		leftTrackModel[3].addShapeBox(-5.75F, 2F, -7F, 18, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 171
		leftTrackModel[3].setRotationPoint(42.5F, -13F, 26.5F);

		leftTrackModel[4].addShapeBox(-5.75F, 2F, -7F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 172
		leftTrackModel[4].setRotationPoint(42.5F, 7F, 26.5F);

		leftTrackModel[5].addShapeBox(-5.75F, 2F, -7F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0.5F, 0F, 0F, 0.5F); // Box 173
		leftTrackModel[5].setRotationPoint(47.5F, 6F, 26.5F);

		leftTrackModel[6].addShapeBox(-5.75F, 2F, -7F, 14, 1, 9, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 8F, 0.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -8F, 0.5F); // Box 174
		leftTrackModel[6].setRotationPoint(-49.5F, 6F, 26.5F);

		leftTrackModel[7].addShapeBox(-5.75F, 2F, -7F, 3, 1, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 175
		leftTrackModel[7].setRotationPoint(-35.5F, 7F, 26.5F);

		leftTrackModel[8].addShapeBox(-5.75F, -2F, -7F, 1, 5, 9, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 179
		leftTrackModel[8].setRotationPoint(64.25F, -6F, 27F);

		leftTrackModel[9].addShapeBox(-5.75F, 2F, -7F, 3, 1, 9, 0F,0F, 0F, 0F, 0.25F, 4F, 0F, 0.25F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, -3.75F, 0F, 0.75F, -3.75F, 0.5F, 0F, 0F, 0.5F); // Box 181
		leftTrackModel[9].setRotationPoint(61.5F, -2F, 26.5F);

		leftTrackModel[10].addShapeBox(-5.75F, 2F, -7F, 4, 1, 9, 0F,0F, 0F, 0F, 0.75F, -3.75F, 0F, 0.75F, -3.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 4F, 0F, 0.25F, 4F, 0.5F, 0F, 0F, 0.5F); // Box 183
		leftTrackModel[10].setRotationPoint(60.5F, -14F, 26.5F);

		leftTrackModel[11].addShapeBox(-5.75F, -2F, -7F, 1, 5, 9, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 184
		leftTrackModel[11].setRotationPoint(-53.25F, -6F, 27F);

		leftTrackModel[12].addShapeBox(-5.75F, 2F, -7F, 4, 1, 9, 0F,0.75F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, -3.75F, 0.5F, 0.25F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 4F, 0.5F); // Box 185
		leftTrackModel[12].setRotationPoint(-52.5F, -14F, 26.5F);

		leftTrackModel[13].addShapeBox(-5.75F, 2F, -7F, 3, 1, 9, 0F,0.25F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 4F, 0.5F, 0.75F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, -3.75F, 0.5F); // Box 186
		leftTrackModel[13].setRotationPoint(-52.5F, -2F, 26.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 187
		rightTrackModel[1] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 188
		rightTrackModel[2] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 189
		rightTrackModel[3] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 190
		rightTrackModel[4] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 191
		rightTrackModel[5] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 192
		rightTrackModel[6] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 193
		rightTrackModel[7] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 194
		rightTrackModel[8] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 195
		rightTrackModel[9] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 196
		rightTrackModel[10] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Box 197
		rightTrackModel[11] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 198
		rightTrackModel[12] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 199
		rightTrackModel[13] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Box 200

		rightTrackModel[0].addShapeBox(-5.75F, 2F, -6.5F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0.5F, 0F, 0F, 0.5F); // Box 187
		rightTrackModel[0].setRotationPoint(47.5F, 6F, -22F);

		rightTrackModel[1].addShapeBox(-5.75F, 2F, -6.5F, 3, 1, 9, 0F,0F, 0F, 0F, 0.25F, 4F, 0F, 0.25F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, -3.75F, 0F, 0.75F, -3.75F, 0.5F, 0F, 0F, 0.5F); // Box 188
		rightTrackModel[1].setRotationPoint(61.5F, -2F, -22F);

		rightTrackModel[2].addShapeBox(-5.75F, -2F, -6.5F, 1, 5, 9, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 189
		rightTrackModel[2].setRotationPoint(64.25F, -6F, -21.5F);

		rightTrackModel[3].addShapeBox(-5.75F, 2F, -6.5F, 4, 1, 9, 0F,0F, 0F, 0F, 0.75F, -3.75F, 0F, 0.75F, -3.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 4F, 0F, 0.25F, 4F, 0.5F, 0F, 0F, 0.5F); // Box 190
		rightTrackModel[3].setRotationPoint(60.5F, -14F, -22F);

		rightTrackModel[4].addShapeBox(-5.75F, 2F, -6.5F, 18, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 191
		rightTrackModel[4].setRotationPoint(42.5F, -13F, -22F);

		rightTrackModel[5].addShapeBox(-5.75F, 2F, -6.5F, 75, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 192
		rightTrackModel[5].setRotationPoint(-32.5F, -13F, -22F);

		rightTrackModel[6].addShapeBox(-5.75F, 2F, -6.5F, 16, 1, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 193
		rightTrackModel[6].setRotationPoint(-48.5F, -13F, -22F);

		rightTrackModel[7].addShapeBox(-5.75F, 2F, -6.5F, 4, 1, 9, 0F,0.75F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, -3.75F, 0.5F, 0.25F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 4F, 0.5F); // Box 194
		rightTrackModel[7].setRotationPoint(-52.5F, -17F, -22F);

		rightTrackModel[8].addShapeBox(-5.75F, -2F, -6.5F, 1, 5, 9, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 195
		rightTrackModel[8].setRotationPoint(-53.25F, -6F, -21.5F);

		rightTrackModel[9].addShapeBox(-5.75F, 2F, -6.5F, 3, 1, 9, 0F,0.25F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 4F, 0.5F, 0.75F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, -3.75F, 0.5F); // Box 196
		rightTrackModel[9].setRotationPoint(-52.5F, -2F, -22F);

		rightTrackModel[10].addShapeBox(-5.75F, 2F, -6.5F, 14, 1, 9, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 8F, 0.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -8F, 0.5F); // Box 197
		rightTrackModel[10].setRotationPoint(-49.5F, 6F, -22F);

		rightTrackModel[11].addShapeBox(-5.75F, 2F, -6.5F, 3, 1, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F); // Box 198
		rightTrackModel[11].setRotationPoint(-35.5F, 7F, -22F);

		rightTrackModel[12].addShapeBox(-5.75F, 2F, -6.5F, 75, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 199
		rightTrackModel[12].setRotationPoint(-32.5F, 7F, -22F);

		rightTrackModel[13].addShapeBox(-5.75F, 2F, -6.5F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 200
		rightTrackModel[13].setRotationPoint(42.5F, 7F, -22F);
	}
}