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

public class ModelGepard extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelGepard() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[214];
		turretModel = new ModelRendererTurbo[175];
		barrelModel = new ModelRendererTurbo[83];
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
		bodyModel[3] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 7
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
		bodyModel[21] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 48
		bodyModel[22] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 49
		bodyModel[23] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 64
		bodyModel[24] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 65
		bodyModel[25] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 66
		bodyModel[26] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 67
		bodyModel[27] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 68
		bodyModel[28] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 69
		bodyModel[29] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 70
		bodyModel[30] = new ModelRendererTurbo(this, 817, 9, textureX, textureY); // Box 71
		bodyModel[31] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 72
		bodyModel[32] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 73
		bodyModel[33] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 74
		bodyModel[34] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 75
		bodyModel[35] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 76
		bodyModel[36] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 77
		bodyModel[37] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 78
		bodyModel[38] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 79
		bodyModel[39] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 80
		bodyModel[40] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 81
		bodyModel[41] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Box 82
		bodyModel[42] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 83
		bodyModel[43] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 84
		bodyModel[44] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 85
		bodyModel[45] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Box 86
		bodyModel[46] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 87
		bodyModel[47] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 88
		bodyModel[48] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 89
		bodyModel[49] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 90
		bodyModel[50] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 91
		bodyModel[51] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 92
		bodyModel[52] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 93
		bodyModel[53] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 94
		bodyModel[54] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 95
		bodyModel[55] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 96
		bodyModel[56] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); // Box 97
		bodyModel[57] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 98
		bodyModel[58] = new ModelRendererTurbo(this, 817, 25, textureX, textureY); // Box 99
		bodyModel[59] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 101
		bodyModel[61] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Box 102
		bodyModel[62] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 103
		bodyModel[63] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 104
		bodyModel[64] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 105
		bodyModel[65] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 106
		bodyModel[66] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 107
		bodyModel[67] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 108
		bodyModel[68] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 109
		bodyModel[69] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 110
		bodyModel[70] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 111
		bodyModel[71] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 112
		bodyModel[72] = new ModelRendererTurbo(this, 537, 121, textureX, textureY); // Box 222
		bodyModel[73] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Box 223
		bodyModel[74] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 224
		bodyModel[75] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 225
		bodyModel[76] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Box 226
		bodyModel[77] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Box 177
		bodyModel[78] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 178
		bodyModel[79] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 179
		bodyModel[80] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 180
		bodyModel[81] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 782
		bodyModel[82] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 783
		bodyModel[83] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Box 784
		bodyModel[84] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 785
		bodyModel[85] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 786
		bodyModel[86] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 787
		bodyModel[87] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 788
		bodyModel[88] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 789
		bodyModel[89] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 790
		bodyModel[90] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 779
		bodyModel[91] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 780
		bodyModel[92] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 781
		bodyModel[93] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 794
		bodyModel[94] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 795
		bodyModel[95] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 796
		bodyModel[96] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 622
		bodyModel[97] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 623
		bodyModel[98] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 624
		bodyModel[99] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 625
		bodyModel[100] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 626
		bodyModel[101] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 627
		bodyModel[102] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 628
		bodyModel[103] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 629
		bodyModel[104] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 630
		bodyModel[105] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Box 631
		bodyModel[106] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 214
		bodyModel[107] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 609
		bodyModel[108] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 610
		bodyModel[109] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 611
		bodyModel[110] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 612
		bodyModel[111] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 616
		bodyModel[112] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 617
		bodyModel[113] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 618
		bodyModel[114] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 619
		bodyModel[115] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 620
		bodyModel[116] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 621
		bodyModel[117] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 225
		bodyModel[118] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 639
		bodyModel[119] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 640
		bodyModel[120] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 641
		bodyModel[121] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 642
		bodyModel[122] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 643
		bodyModel[123] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 231
		bodyModel[124] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 232
		bodyModel[125] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 233
		bodyModel[126] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 234
		bodyModel[127] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 235
		bodyModel[128] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 328
		bodyModel[129] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 365
		bodyModel[130] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 366
		bodyModel[131] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 367
		bodyModel[132] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 368
		bodyModel[133] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 366
		bodyModel[134] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 367
		bodyModel[135] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 368
		bodyModel[136] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 369
		bodyModel[137] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 370
		bodyModel[138] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 371
		bodyModel[139] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 372
		bodyModel[140] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 373
		bodyModel[141] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 413
		bodyModel[142] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 414
		bodyModel[143] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 415
		bodyModel[144] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 416
		bodyModel[145] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 427
		bodyModel[146] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 428
		bodyModel[147] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 429
		bodyModel[148] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 430
		bodyModel[149] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 431
		bodyModel[150] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 432
		bodyModel[151] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 433
		bodyModel[152] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 434
		bodyModel[153] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 435
		bodyModel[154] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 446
		bodyModel[155] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 447
		bodyModel[156] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 448
		bodyModel[157] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Box 449
		bodyModel[158] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 450
		bodyModel[159] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 451
		bodyModel[160] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 452
		bodyModel[161] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 453
		bodyModel[162] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 454
		bodyModel[163] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 455
		bodyModel[164] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 456
		bodyModel[165] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 457
		bodyModel[166] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 458
		bodyModel[167] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 459
		bodyModel[168] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 460
		bodyModel[169] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 461
		bodyModel[170] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 462
		bodyModel[171] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 463
		bodyModel[172] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 464
		bodyModel[173] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 465
		bodyModel[174] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 466
		bodyModel[175] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 467
		bodyModel[176] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 468
		bodyModel[177] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 469
		bodyModel[178] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 470
		bodyModel[179] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 471
		bodyModel[180] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 481
		bodyModel[181] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 482
		bodyModel[182] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 495
		bodyModel[183] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 497
		bodyModel[184] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 506
		bodyModel[185] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 507
		bodyModel[186] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 508
		bodyModel[187] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 510
		bodyModel[188] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 511
		bodyModel[189] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 521
		bodyModel[190] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 525
		bodyModel[191] = new ModelRendererTurbo(this, 841, 129, textureX, textureY); // Box 526
		bodyModel[192] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Box 527
		bodyModel[193] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 528
		bodyModel[194] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 282
		bodyModel[195] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 526
		bodyModel[196] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 527
		bodyModel[197] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 528
		bodyModel[198] = new ModelRendererTurbo(this, 585, 137, textureX, textureY); // Box 529
		bodyModel[199] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 530
		bodyModel[200] = new ModelRendererTurbo(this, 641, 145, textureX, textureY); // Box 531
		bodyModel[201] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 661
		bodyModel[202] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 662
		bodyModel[203] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 663
		bodyModel[204] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 664
		bodyModel[205] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 665
		bodyModel[206] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 666
		bodyModel[207] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 667
		bodyModel[208] = new ModelRendererTurbo(this, 521, 137, textureX, textureY); // Box 668
		bodyModel[209] = new ModelRendererTurbo(this, 817, 241, textureX, textureY); // Box 877
		bodyModel[210] = new ModelRendererTurbo(this, 945, 241, textureX, textureY); // Box 878
		bodyModel[211] = new ModelRendererTurbo(this, 633, 249, textureX, textureY); // Box 879
		bodyModel[212] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 880
		bodyModel[213] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 881

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

		bodyModel[74].addShapeBox(0F, -0.5F, -4F, 2, 5, 16, 0F,0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[74].setRotationPoint(-73.35F, -17.75F, 3.5F);
		bodyModel[74].rotateAngleZ = 0.2443461F;

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

		bodyModel[154].addShapeBox(21.5F, 0.25F, -0.35F, 13, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 446
		bodyModel[154].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[155].addShapeBox(6.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 447
		bodyModel[155].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[156].addShapeBox(-5.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 448
		bodyModel[156].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[157].addShapeBox(-21.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 449
		bodyModel[157].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[158].addShapeBox(-33.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 450
		bodyModel[158].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[159].addShapeBox(-62.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 451
		bodyModel[159].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[160].addShapeBox(-50.5F, 0.25F, -0.35F, 12, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 452
		bodyModel[160].setRotationPoint(17.5F, -11.85F, 29.75F);

		bodyModel[161].addShapeBox(21.5F, 0.25F, -0.35F, 13, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 453
		bodyModel[161].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[162].addShapeBox(6.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 454
		bodyModel[162].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[163].addShapeBox(-5.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 455
		bodyModel[163].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[164].addShapeBox(-21.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 456
		bodyModel[164].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[165].addShapeBox(-33.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 457
		bodyModel[165].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[166].addShapeBox(-50.5F, 0.25F, -0.35F, 12, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 458
		bodyModel[166].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[167].addShapeBox(-62.5F, 0.25F, -0.35F, 11, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 459
		bodyModel[167].setRotationPoint(17.5F, -11.85F, -30.25F);

		bodyModel[168].addShapeBox(0F, 0.5F, -6F, 22, 7, 6, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 460
		bodyModel[168].setRotationPoint(-24.35F, -20F, -25F);

		bodyModel[169].addShapeBox(0F, 0.5F, -6.25F, 22, 3, 6, 0F,0.25F, -1.5F, 0.1F, 0.25F, -1.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -1.5F, 0.1F, 0.25F, -1.5F, 0.1F); // Box 461
		bodyModel[169].setRotationPoint(-24.35F, -20F, -25F);

		bodyModel[170].addShapeBox(0F, 0.5F, -6F, 22, 7, 6, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 462
		bodyModel[170].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[171].addShapeBox(0F, 0.5F, -6.25F, 22, 3, 6, 0F,0.25F, -1.5F, 0.1F, 0.25F, -1.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -0.5F, 0.1F, 0.25F, -1.5F, 0.1F, 0.25F, -1.5F, 0.1F); // Box 463
		bodyModel[171].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[172].addShapeBox(4F, 2.5F, -6.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[172].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[173].addShapeBox(18F, 2.5F, -6.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[173].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[174].addShapeBox(-15F, 2.5F, -6.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[174].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[175].addShapeBox(-29F, 2.5F, -6.5F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[175].setRotationPoint(7.65F, -20F, -25F);

		bodyModel[176].addShapeBox(1.75F, -1.25F, 0F, 3, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[176].setRotationPoint(-74.75F, -17.65F, -14.4F);
		bodyModel[176].rotateAngleZ = 0.26179939F;

		bodyModel[177].addShapeBox(3F, -2.25F, 0F, 3, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[177].setRotationPoint(-74.75F, -12.4F, -14.4F);
		bodyModel[177].rotateAngleZ = 0.26179939F;

		bodyModel[178].addShapeBox(0F, -0.75F, -4F, 2, 5, 1, 0F,0.2F, 0.5F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 470
		bodyModel[178].setRotationPoint(-73.35F, -17.75F, 5.5F);
		bodyModel[178].rotateAngleZ = 0.2443461F;

		bodyModel[179].addShapeBox(0F, -0.75F, -4F, 2, 5, 1, 0F,0.2F, 0.5F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 471
		bodyModel[179].setRotationPoint(-73.35F, -17.75F, 16.5F);
		bodyModel[179].rotateAngleZ = 0.2443461F;

		bodyModel[180].addShapeBox(-0.5F, 8.5F, -0.1F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[180].setRotationPoint(-68.15F, -20.75F, -1.9F);

		bodyModel[181].addShapeBox(-0.5F, 10.5F, -0.1F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 482
		bodyModel[181].setRotationPoint(-68.15F, -18.75F, -1.9F);

		bodyModel[182].addShapeBox(0F, -0.75F, -1.9F, 1, 3, 1, 0F,0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1.5F, 0.35F, 0.3F, -1.5F, 0.35F, 0.3F, -0.35F, -0.95F, 0.3F, -0.35F, -0.95F); // Box 495
		bodyModel[182].setRotationPoint(-64F, -16.6F, -22.5F);

		bodyModel[183].addShapeBox(0F, 0.25F, -1.4F, 1, 3, 1, 0F,0.3F, -1.3F, 0.1F, 0.3F, -1.3F, 0.1F, 0.3F, -0.5F, -0.85F, 0.3F, -0.5F, -0.85F, 0.3F, -0.9F, -0.25F, 0.3F, -0.9F, -0.25F, 0.3F, -0.4F, -0.1F, 0.3F, -0.4F, -0.1F); // Box 497
		bodyModel[183].setRotationPoint(-64F, -16.6F, 21.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[184].setRotationPoint(-63.75F, -4.4F, -18.4F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[185].setRotationPoint(-63.75F, -4.4F, 17.6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[186].setRotationPoint(-64.75F, -4.4F, -0.4F);

		bodyModel[187].addShapeBox(2.5F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[187].setRotationPoint(-74.75F, -15.4F, -18.4F);
		bodyModel[187].rotateAngleZ = 0.2268928F;

		bodyModel[188].addShapeBox(1.5F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[188].setRotationPoint(-74.75F, -18.65F, -18.4F);
		bodyModel[188].rotateAngleZ = 0.2268928F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 17, 9, 25, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[189].setRotationPoint(39.65F, -7.85F, -12F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 17, 6, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[190].setRotationPoint(-35.35F, -20.6F, -17.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 17, 6, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[191].setRotationPoint(-35.35F, -20.6F, 11.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[192].setRotationPoint(-32.35F, -20.6F, 7.75F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		bodyModel[193].setRotationPoint(-32.35F, -20.6F, -10.25F);

		bodyModel[194].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 282
		bodyModel[194].setRotationPoint(38.75F, 2F, -18.5F);

		bodyModel[195].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 526
		bodyModel[195].setRotationPoint(25.75F, 2F, -18.5F);

		bodyModel[196].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 527
		bodyModel[196].setRotationPoint(13.25F, 2F, -18.5F);

		bodyModel[197].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 528
		bodyModel[197].setRotationPoint(0.25F, 2F, -18.5F);

		bodyModel[198].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 529
		bodyModel[198].setRotationPoint(-12F, 2F, -18.5F);

		bodyModel[199].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 530
		bodyModel[199].setRotationPoint(-25F, 2F, -18.5F);

		bodyModel[200].addShapeBox(-2.5F, -1F, -2F, 4, 4, 41, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 531
		bodyModel[200].setRotationPoint(-38F, 2F, -18.5F);

		bodyModel[201].addShapeBox(21F, 3.5F, 0F, 1, 7, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 661
		bodyModel[201].setRotationPoint(5.65F, -20F, 23.5F);
		bodyModel[201].rotateAngleX = 0.68067841F;

		bodyModel[202].addShapeBox(21F, 3.5F, 0F, 1, 7, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 662
		bodyModel[202].setRotationPoint(3.65F, -20F, 23.5F);
		bodyModel[202].rotateAngleX = 0.68067841F;

		bodyModel[203].addShapeBox(24F, 3.65F, -0.25F, 17, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 663
		bodyModel[203].setRotationPoint(-14.35F, -20F, 23.5F);
		bodyModel[203].rotateAngleX = 0.68067841F;

		bodyModel[204].addShapeBox(24F, 4.9F, -0.25F, 17, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 664
		bodyModel[204].setRotationPoint(-14.35F, -20F, 23.5F);
		bodyModel[204].rotateAngleX = 0.68067841F;

		bodyModel[205].addShapeBox(24F, 6.15F, -0.25F, 17, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 665
		bodyModel[205].setRotationPoint(-14.35F, -20F, 23.5F);
		bodyModel[205].rotateAngleX = 0.68067841F;

		bodyModel[206].addShapeBox(24F, 7.4F, -0.25F, 17, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 666
		bodyModel[206].setRotationPoint(-14.35F, -20F, 23.5F);
		bodyModel[206].rotateAngleX = 0.68067841F;

		bodyModel[207].addShapeBox(23F, 3.5F, 0F, 1, 7, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 667
		bodyModel[207].setRotationPoint(-12.35F, -20F, 23.5F);
		bodyModel[207].rotateAngleX = 0.68067841F;

		bodyModel[208].addShapeBox(23F, 3.5F, 0F, 1, 7, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 668
		bodyModel[208].setRotationPoint(-14.35F, -20F, 23.5F);
		bodyModel[208].rotateAngleX = 0.68067841F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 9, 51, 0F,0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2.25F, 0F, 0F, -7.25F, -2F, -0.75F, 3F, 0F, -0.75F, 5F, 0F, -0.75F, 4.75F, -2F, -0.75F, 1.75F); // Box 877
		bodyModel[209].setRotationPoint(-72.35F, -20.1F, -25F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 8, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 878
		bodyModel[210].setRotationPoint(-70.35F, -11.85F, -18F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 8, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 879
		bodyModel[211].setRotationPoint(-70.35F, -11.85F, 2F);

		bodyModel[212].addShapeBox(1.5F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 880
		bodyModel[212].setRotationPoint(-74.75F, -18.65F, 16.6F);
		bodyModel[212].rotateAngleZ = 0.2268928F;

		bodyModel[213].addShapeBox(2.5F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		bodyModel[213].setRotationPoint(-74.75F, -15.4F, 16.6F);
		bodyModel[213].rotateAngleZ = 0.2268928F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 532
		turretModel[1] = new ModelRendererTurbo(this, 689, 153, textureX, textureY); // Box 533
		turretModel[2] = new ModelRendererTurbo(this, 793, 153, textureX, textureY); // Box 534
		turretModel[3] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 535
		turretModel[4] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 536
		turretModel[5] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Box 537
		turretModel[6] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 538
		turretModel[7] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 539
		turretModel[8] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 540
		turretModel[9] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 541
		turretModel[10] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Box 542
		turretModel[11] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 543
		turretModel[12] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 546
		turretModel[13] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 548
		turretModel[14] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 549
		turretModel[15] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 550
		turretModel[16] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 551
		turretModel[17] = new ModelRendererTurbo(this, 545, 185, textureX, textureY); // Box 552
		turretModel[18] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 553
		turretModel[19] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 554
		turretModel[20] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 555
		turretModel[21] = new ModelRendererTurbo(this, 849, 153, textureX, textureY); // Box 556
		turretModel[22] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Box 557
		turretModel[23] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Box 558
		turretModel[24] = new ModelRendererTurbo(this, 969, 169, textureX, textureY); // Box 559
		turretModel[25] = new ModelRendererTurbo(this, 897, 121, textureX, textureY); // Box 560
		turretModel[26] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 561
		turretModel[27] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 562
		turretModel[28] = new ModelRendererTurbo(this, 641, 201, textureX, textureY); // Box 563
		turretModel[29] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 564
		turretModel[30] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 566
		turretModel[31] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Box 567
		turretModel[32] = new ModelRendererTurbo(this, 641, 145, textureX, textureY); // Box 568
		turretModel[33] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 569
		turretModel[34] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 571
		turretModel[35] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 572
		turretModel[36] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 573
		turretModel[37] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 574
		turretModel[38] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 575
		turretModel[39] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 576
		turretModel[40] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 577
		turretModel[41] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 578
		turretModel[42] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 579
		turretModel[43] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 580
		turretModel[44] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 581
		turretModel[45] = new ModelRendererTurbo(this, 721, 201, textureX, textureY); // Box 582
		turretModel[46] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 583
		turretModel[47] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // Box 584
		turretModel[48] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 585
		turretModel[49] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 586
		turretModel[50] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 587
		turretModel[51] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 588
		turretModel[52] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 589
		turretModel[53] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 590
		turretModel[54] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 591
		turretModel[55] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 592
		turretModel[56] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 593
		turretModel[57] = new ModelRendererTurbo(this, 513, 153, textureX, textureY); // Box 594
		turretModel[58] = new ModelRendererTurbo(this, 593, 153, textureX, textureY); // Box 595
		turretModel[59] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Box 596
		turretModel[60] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 597
		turretModel[61] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Box 598
		turretModel[62] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 599
		turretModel[63] = new ModelRendererTurbo(this, 793, 153, textureX, textureY); // Box 600
		turretModel[64] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 601
		turretModel[65] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 602
		turretModel[66] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 603
		turretModel[67] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 604
		turretModel[68] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 605
		turretModel[69] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 606
		turretModel[70] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 607
		turretModel[71] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Box 608
		turretModel[72] = new ModelRendererTurbo(this, 697, 201, textureX, textureY); // Box 609
		turretModel[73] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 610
		turretModel[74] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 611
		turretModel[75] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 612
		turretModel[76] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 613
		turretModel[77] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 614
		turretModel[78] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 615
		turretModel[79] = new ModelRendererTurbo(this, 801, 153, textureX, textureY); // Box 616
		turretModel[80] = new ModelRendererTurbo(this, 521, 185, textureX, textureY); // Box 617
		turretModel[81] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 618
		turretModel[82] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 619
		turretModel[83] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 620
		turretModel[84] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 621
		turretModel[85] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 622
		turretModel[86] = new ModelRendererTurbo(this, 913, 161, textureX, textureY); // Box 623
		turretModel[87] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 625
		turretModel[88] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 626
		turretModel[89] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 627
		turretModel[90] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 628
		turretModel[91] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 629
		turretModel[92] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 630
		turretModel[93] = new ModelRendererTurbo(this, 809, 177, textureX, textureY); // Box 631
		turretModel[94] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 632
		turretModel[95] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Box 633
		turretModel[96] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 634
		turretModel[97] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 635
		turretModel[98] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 636
		turretModel[99] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Box 638
		turretModel[100] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 639
		turretModel[101] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 640
		turretModel[102] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 641
		turretModel[103] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Box 642
		turretModel[104] = new ModelRendererTurbo(this, 969, 169, textureX, textureY); // Box 643
		turretModel[105] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 644
		turretModel[106] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 645
		turretModel[107] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 646
		turretModel[108] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 647
		turretModel[109] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 648
		turretModel[110] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 649
		turretModel[111] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 650
		turretModel[112] = new ModelRendererTurbo(this, 609, 185, textureX, textureY); // Box 651
		turretModel[113] = new ModelRendererTurbo(this, 753, 185, textureX, textureY); // Box 652
		turretModel[114] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 656
		turretModel[115] = new ModelRendererTurbo(this, 625, 193, textureX, textureY); // Box 657
		turretModel[116] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 658
		turretModel[117] = new ModelRendererTurbo(this, 761, 201, textureX, textureY); // Box 659
		turretModel[118] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 660
		turretModel[119] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 669
		turretModel[120] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 670
		turretModel[121] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 671
		turretModel[122] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 672
		turretModel[123] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 673
		turretModel[124] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 674
		turretModel[125] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 675
		turretModel[126] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 676
		turretModel[127] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 677
		turretModel[128] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 678
		turretModel[129] = new ModelRendererTurbo(this, 769, 201, textureX, textureY); // Box 679
		turretModel[130] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 680
		turretModel[131] = new ModelRendererTurbo(this, 689, 137, textureX, textureY); // Box 681
		turretModel[132] = new ModelRendererTurbo(this, 825, 201, textureX, textureY); // Box 682
		turretModel[133] = new ModelRendererTurbo(this, 857, 209, textureX, textureY); // Box 683
		turretModel[134] = new ModelRendererTurbo(this, 705, 137, textureX, textureY); // Box 684
		turretModel[135] = new ModelRendererTurbo(this, 1009, 137, textureX, textureY); // Box 685
		turretModel[136] = new ModelRendererTurbo(this, 849, 153, textureX, textureY); // Box 686
		turretModel[137] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 687
		turretModel[138] = new ModelRendererTurbo(this, 641, 193, textureX, textureY); // Box 688
		turretModel[139] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 689
		turretModel[140] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 690
		turretModel[141] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 691
		turretModel[142] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 692
		turretModel[143] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 693
		turretModel[144] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 694
		turretModel[145] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 695
		turretModel[146] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 696
		turretModel[147] = new ModelRendererTurbo(this, 761, 161, textureX, textureY); // Box 697
		turretModel[148] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Box 698
		turretModel[149] = new ModelRendererTurbo(this, 937, 161, textureX, textureY); // Box 699
		turretModel[150] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 700
		turretModel[151] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 701
		turretModel[152] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 702
		turretModel[153] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 703
		turretModel[154] = new ModelRendererTurbo(this, 825, 153, textureX, textureY); // Box 713
		turretModel[155] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Box 714
		turretModel[156] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 715
		turretModel[157] = new ModelRendererTurbo(this, 1009, 169, textureX, textureY); // Box 716
		turretModel[158] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 717
		turretModel[159] = new ModelRendererTurbo(this, 697, 177, textureX, textureY); // Box 718
		turretModel[160] = new ModelRendererTurbo(this, 713, 177, textureX, textureY); // Box 719
		turretModel[161] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Box 720
		turretModel[162] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 721
		turretModel[163] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 722
		turretModel[164] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 723
		turretModel[165] = new ModelRendererTurbo(this, 1009, 177, textureX, textureY); // Box 724
		turretModel[166] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 725
		turretModel[167] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 726
		turretModel[168] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 727
		turretModel[169] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 740
		turretModel[170] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 741
		turretModel[171] = new ModelRendererTurbo(this, 273, 233, textureX, textureY); // Box 745
		turretModel[172] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 748
		turretModel[173] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 749
		turretModel[174] = new ModelRendererTurbo(this, 537, 233, textureX, textureY); // Box 750

		turretModel[0].addShapeBox(-8F, -0.75F, -21.5F, 8, 2, 43, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 532
		turretModel[0].setRotationPoint(10F, -19F, 0F);

		turretModel[1].addShapeBox(0F, -0.75F, -21.5F, 8, 2, 43, 0F,0F, 0.5F, 0.25F, 0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.25F); // Box 533
		turretModel[1].setRotationPoint(10F, -19F, 0F);

		turretModel[2].addShapeBox(-13.5F, -0.75F, -21.5F, 6, 2, 43, 0F,0F, 0.5F, -1.75F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -1.75F, 0F, 0F, -1.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.75F); // Box 534
		turretModel[2].setRotationPoint(10F, -19F, 0F);

		turretModel[3].addShapeBox(-20F, -0.75F, -20F, 7, 2, 40, 0F,0F, 0.5F, -4.75F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -4.75F, 0F, 0F, -4.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -4.75F); // Box 535
		turretModel[3].setRotationPoint(10F, -19F, 0F);

		turretModel[4].addShapeBox(-24.5F, -0.75F, -15.5F, 5, 2, 31, 0F,2F, 0.5F, -6.75F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 2F, 0.5F, -6.75F, 0F, 0F, -6.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -6.75F); // Box 536
		turretModel[4].setRotationPoint(10F, -19F, 0F);

		turretModel[5].addShapeBox(7.5F, -0.75F, -20F, 7, 2, 40, 0F,-0.5F, 0.5F, -0.25F, 0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -0.25F); // Box 537
		turretModel[5].setRotationPoint(10F, -19F, 0F);

		turretModel[6].addShapeBox(14F, -0.75F, -15.5F, 6, 2, 31, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, -7.75F, 0F, 0.5F, -7.75F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -7.75F, 0F, 0F, -7.75F, -0.5F, 0F, 0F); // Box 538
		turretModel[6].setRotationPoint(10F, -19F, 0F);

		turretModel[7].addShapeBox(0F, -5.25F, -21.5F, 8, 4, 23, 0F,0F, 0.75F, -2.25F, 0F, 0.75F, -3.75F, 0F, 2.75F, -2F, 0F, 2.75F, -2F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 539
		turretModel[7].setRotationPoint(10F, -19F, 0F);

		turretModel[8].addShapeBox(-8F, -5.25F, -21.5F, 8, 4, 23, 0F,-1F, 0.75F, -2.5F, 0F, 0.75F, -2.25F, 0F, 2.75F, -2F, -1F, 2.75F, -2F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 540
		turretModel[8].setRotationPoint(10F, -19F, 0F);

		turretModel[9].addShapeBox(-13.5F, -5.25F, -21.5F, 6, 4, 23, 0F,-6F, 0.75F, -2.5F, 0.5F, 0.75F, -2.5F, 0.5F, 2.75F, -2F, -6F, 2.75F, -2F, 0F, 0F, -1.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Box 541
		turretModel[9].setRotationPoint(10F, -19F, 0F);

		turretModel[10].addShapeBox(7.5F, -5.25F, -20F, 7, 4, 19, 0F,-0.5F, 0.75F, -2.25F, 0F, -1F, -4.5F, 0F, -1F, 0.5F, -0.5F, 2.75F, 0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 542
		turretModel[10].setRotationPoint(10F, -19F, 0F);

		turretModel[11].addShapeBox(14F, -3.25F, -15.5F, 6, 2, 31, 0F,-0.5F, 0.75F, -1F, 0F, 0.75F, -7.75F, 0F, 0.75F, -7.75F, -0.5F, 0.75F, -1F, -0.5F, 0F, 0F, 0F, 0F, -7.75F, 0F, 0F, -7.75F, -0.5F, 0F, 0F); // Box 543
		turretModel[11].setRotationPoint(10F, -19F, 0F);

		turretModel[12].addShapeBox(0F, -5.25F, -2.5F, 8, 4, 24, 0F,0F, 2.75F, -2F, 0F, 2.75F, -2F, 0F, 0.75F, -3.75F, 0F, 0.75F, -2.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, 0.25F); // Box 546
		turretModel[12].setRotationPoint(10F, -19F, 0F);

		turretModel[13].addShapeBox(-8F, -5.25F, -2.5F, 8, 4, 24, 0F,-1F, 2.75F, -2F, 0F, 2.75F, -2F, 0F, 0.75F, -2.25F, -1F, 0.75F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 548
		turretModel[13].setRotationPoint(10F, -19F, 0F);

		turretModel[14].addShapeBox(-13.5F, -5.25F, -2.5F, 6, 4, 24, 0F,-6F, 2.75F, -2F, 0.5F, 2.75F, -2F, 0.5F, 0.75F, -2.5F, -6F, 0.75F, -2.5F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.25F, 0F, 0F, -1.75F); // Box 549
		turretModel[14].setRotationPoint(10F, -19F, 0F);

		turretModel[15].addShapeBox(-22F, -20.75F, -12F, 14, 20, 24, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		turretModel[15].setRotationPoint(10F, -19F, 0F);

		turretModel[16].addShapeBox(-8F, -20.75F, -12F, 3, 20, 24, 0F,0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 551
		turretModel[16].setRotationPoint(10F, -19F, 0F);

		turretModel[17].addShapeBox(-5F, -20.75F, -13F, 18, 20, 26, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 552
		turretModel[17].setRotationPoint(10F, -19F, 0F);

		turretModel[18].addShapeBox(12.5F, -20.75F, -13F, 3, 20, 26, 0F,0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		turretModel[18].setRotationPoint(10F, -19F, 0F);

		turretModel[19].addShapeBox(15.5F, -20.75F, -13F, 2, 20, 26, 0F,0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 554
		turretModel[19].setRotationPoint(10F, -19F, 0F);

		turretModel[20].addShapeBox(14F, -3.5F, -15.5F, 9, 4, 31, 0F,-0.5F, 0.75F, 0F, 0F, 0.75F, -6.5F, 0F, 0.75F, -6.5F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, -0.5F, 0F, 0F); // Box 555
		turretModel[20].setRotationPoint(10F, -19F, 0F);

		turretModel[21].addShapeBox(22.5F, -3.5F, -9F, 4, 4, 18, 0F,-0.5F, 0.75F, 0F, 0.5F, 0.75F, -3.25F, 0.5F, 0.75F, -3.25F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0.5F, -2.5F, -3.25F, 0.5F, -2.5F, -3.25F, -0.5F, 0F, 0F); // Box 556
		turretModel[21].setRotationPoint(10F, -19F, 0F);

		turretModel[22].addShapeBox(26.5F, -3.75F, -6F, 3, 2, 12, 0F,-0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, -1.5F, -0.5F, 0.5F, -0.25F, -0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.25F); // Box 557
		turretModel[22].setRotationPoint(10F, -19F, 0F);

		turretModel[23].addShapeBox(29.5F, -3.75F, -4.5F, 2, 2, 9, 0F,-0.5F, 0.5F, 0F, 0.5F, 0.5F, -3.5F, 0.5F, 0.5F, -3.5F, -0.5F, 0.5F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, -3.5F, 0.5F, -0.25F, -3.5F, -0.5F, -0.25F, 0F); // Box 558
		turretModel[23].setRotationPoint(10F, -19F, 0F);

		turretModel[24].addShapeBox(7.5F, -5.25F, 0F, 7, 4, 20, 0F,-0.5F, 2.75F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -4.5F, -0.5F, 0.75F, -2.25F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, -0.5F, 0F, -0.25F); // Box 559
		turretModel[24].setRotationPoint(10F, -19F, 0F);

		turretModel[25].addShapeBox(17.5F, -20.75F, -12.25F, 2, 17, 4, 0F,0F, -0.75F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0F, 0F, 3.5F, 0F, -3.75F, 3.5F, 0F, 1F, 0F, 0F, 1F); // Box 560
		turretModel[25].setRotationPoint(10F, -19F, 0F);

		turretModel[26].addShapeBox(17.5F, -20.75F, 8.25F, 2, 17, 4, 0F,0F, -0.75F, -2F, -1F, -0.75F, -2F, -1F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 1F, 3.5F, 0F, 1F, 3.5F, 0F, -3.75F, 0F, 0F, 0F); // Box 561
		turretModel[26].setRotationPoint(10F, -19F, 0F);

		turretModel[27].addShapeBox(17.5F, -20.75F, -10F, 1, 2, 20, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0.25F); // Box 562
		turretModel[27].setRotationPoint(10F, -19F, 0F);

		turretModel[28].addShapeBox(-36F, -20.75F, -12F, 14, 20, 24, 0F,-2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 0.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -2F, 0F); // Box 563
		turretModel[28].setRotationPoint(10F, -19F, 0F);

		turretModel[29].addShapeBox(-43F, -19.75F, -11F, 9, 17, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 564
		turretModel[29].setRotationPoint(10F, -19F, 0F);

		turretModel[30].addShapeBox(-42F, -20.75F, -11F, 9, 1, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 566
		turretModel[30].setRotationPoint(10F, -19F, 0F);

		turretModel[31].addShapeBox(-42F, -20.75F, 4F, 9, 1, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 567
		turretModel[31].setRotationPoint(10F, -19F, 0F);

		turretModel[32].addShapeBox(-43F, -19.75F, 4F, 9, 17, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 568
		turretModel[32].setRotationPoint(10F, -19F, 0F);

		turretModel[33].addShapeBox(-44F, -9.75F, -4F, 9, 7, 2, 0F,-0.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, -0.38F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		turretModel[33].setRotationPoint(10F, -19F, 0F);

		turretModel[34].addShapeBox(-44F, -9.75F, -2F, 9, 7, 4, 0F,-0.38F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.38F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		turretModel[34].setRotationPoint(10F, -19F, 0F);

		turretModel[35].addShapeBox(-44F, -9.75F, 2F, 9, 7, 2, 0F,-0.38F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		turretModel[35].setRotationPoint(10F, -19F, 0F);

		turretModel[36].addShapeBox(-54F, -8.5F, 4F, 9, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		turretModel[36].setRotationPoint(10F, -19F, 0F);
		turretModel[36].rotateAngleZ = -0.08726646F;

		turretModel[37].addShapeBox(-54F, -8.5F, -11F, 9, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		turretModel[37].setRotationPoint(10F, -19F, 0F);
		turretModel[37].rotateAngleZ = -0.08726646F;

		turretModel[38].addShapeBox(-54F, -7.5F, 11F, 9, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		turretModel[38].setRotationPoint(10F, -19F, 0F);
		turretModel[38].rotateAngleZ = -0.08726646F;

		turretModel[39].addShapeBox(-54F, -7.5F, -14F, 9, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		turretModel[39].setRotationPoint(10F, -19F, 0F);
		turretModel[39].rotateAngleZ = -0.08726646F;

		turretModel[40].addShapeBox(-56F, -7.5F, 4F, 2, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		turretModel[40].setRotationPoint(10F, -19F, 0F);
		turretModel[40].rotateAngleZ = -0.08726646F;

		turretModel[41].addShapeBox(-56F, -7.5F, -11F, 2, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		turretModel[41].setRotationPoint(10F, -19F, 0F);
		turretModel[41].rotateAngleZ = -0.08726646F;

		turretModel[42].addShapeBox(-54F, -1.5F, -3F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		turretModel[42].setRotationPoint(10F, -19F, 0F);
		turretModel[42].rotateAngleZ = -0.08726646F;

		turretModel[43].addShapeBox(-54F, -1.5F, -4F, 9, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		turretModel[43].setRotationPoint(10F, -19F, 0F);
		turretModel[43].rotateAngleZ = -0.08726646F;

		turretModel[44].addShapeBox(-54F, -1.5F, 3F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		turretModel[44].setRotationPoint(10F, -19F, 0F);
		turretModel[44].rotateAngleZ = -0.08726646F;

		turretModel[45].addShapeBox(-34F, -7F, -18F, 3, 4, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		turretModel[45].setRotationPoint(10F, -19F, 0F);

		turretModel[46].addShapeBox(-42F, -20.75F, -4F, 6, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 583
		turretModel[46].setRotationPoint(10F, -19F, 0F);

		turretModel[47].addShapeBox(-46.5F, -23.75F, -3.5F, 7, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		turretModel[47].setRotationPoint(10F, -19F, 0F);

		turretModel[48].addShapeBox(-45F, -27.75F, -1.5F, 5, 7, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 585
		turretModel[48].setRotationPoint(10F, -19F, 0F);

		turretModel[49].addShapeBox(-48.5F, -23F, -3F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		turretModel[49].setRotationPoint(10F, -19F, 0F);

		turretModel[50].addShapeBox(-47.5F, -26F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		turretModel[50].setRotationPoint(10F, -19F, 0F);

		turretModel[51].addShapeBox(-50.5F, -26F, -0.5F, 3, 1, 1, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 588
		turretModel[51].setRotationPoint(10F, -19F, 0F);

		turretModel[52].addShapeBox(-50.5F, -31F, -0.5F, 1, 4, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		turretModel[52].setRotationPoint(10F, -19F, 0F);

		turretModel[53].addShapeBox(-53.5F, -35F, -1.5F, 4, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 590
		turretModel[53].setRotationPoint(10F, -19F, 0F);

		turretModel[54].addShapeBox(-50.5F, -34.5F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		turretModel[54].setRotationPoint(10F, -19F, 0F);

		turretModel[55].addShapeBox(-38.5F, -48F, -3F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		turretModel[55].setRotationPoint(10F, -19F, 0F);
		turretModel[55].rotateAngleZ = 0.26179939F;

		turretModel[56].addShapeBox(-42.5F, -43F, 0F, 1, 6, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 593
		turretModel[56].setRotationPoint(10F, -19F, 0F);

		turretModel[57].addShapeBox(-42.5F, -43F, -6F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 594
		turretModel[57].setRotationPoint(10F, -19F, 0F);

		turretModel[58].addShapeBox(-42.5F, -37F, 0F, 1, 6, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		turretModel[58].setRotationPoint(10F, -19F, 0F);

		turretModel[59].addShapeBox(-42.5F, -37F, -6F, 1, 6, 6, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 596
		turretModel[59].setRotationPoint(10F, -19F, 0F);

		turretModel[60].addShapeBox(-42.5F, -37F, 6F, 1, 6, 5, 0F,-2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 597
		turretModel[60].setRotationPoint(10F, -19F, 0F);

		turretModel[61].addShapeBox(-42.5F, -43F, 6F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 598
		turretModel[61].setRotationPoint(10F, -19F, 0F);

		turretModel[62].addShapeBox(-42.5F, -43F, -11F, 1, 6, 5, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 599
		turretModel[62].setRotationPoint(10F, -19F, 0F);

		turretModel[63].addShapeBox(-42.5F, -37F, -11F, 1, 6, 5, 0F,2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		turretModel[63].setRotationPoint(10F, -19F, 0F);

		turretModel[64].addShapeBox(-40F, -34.75F, -1.5F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 601
		turretModel[64].setRotationPoint(10F, -19F, 0F);

		turretModel[65].addShapeBox(-40F, -30.75F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		turretModel[65].setRotationPoint(10F, -19F, 0F);

		turretModel[66].addShapeBox(-40F, -27.75F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 603
		turretModel[66].setRotationPoint(10F, -19F, 0F);

		turretModel[67].addShapeBox(-33F, -22F, -0.5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		turretModel[67].setRotationPoint(10F, -19F, 0F);

		turretModel[68].addShapeBox(-33F, -22F, 4F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		turretModel[68].setRotationPoint(10F, -19F, 0F);

		turretModel[69].addShapeBox(-33F, -22F, -5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		turretModel[69].setRotationPoint(10F, -19F, 0F);

		turretModel[70].addShapeBox(-41.5F, -46F, -0.5F, 1, 3, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 607
		turretModel[70].setRotationPoint(10F, -19F, 0F);

		turretModel[71].addShapeBox(-42F, -44.5F, -1F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 608
		turretModel[71].setRotationPoint(10F, -19F, 0F);

		turretModel[72].addShapeBox(-24F, -23.75F, -8F, 13, 2, 16, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		turretModel[72].setRotationPoint(10F, -19F, 0F);

		turretModel[73].addShapeBox(-26F, -25.75F, -8F, 6, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		turretModel[73].setRotationPoint(10F, -19F, 0F);

		turretModel[74].addShapeBox(-19F, -25.75F, -8F, 8, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		turretModel[74].setRotationPoint(10F, -19F, 0F);

		turretModel[75].addShapeBox(-23F, -21.75F, -7F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		turretModel[75].setRotationPoint(10F, -19F, 0F);

		turretModel[76].addShapeBox(-13F, -21.75F, -7F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		turretModel[76].setRotationPoint(10F, -19F, 0F);

		turretModel[77].addShapeBox(-13F, -21.75F, 6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		turretModel[77].setRotationPoint(10F, -19F, 0F);

		turretModel[78].addShapeBox(-23F, -21.75F, 6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		turretModel[78].setRotationPoint(10F, -19F, 0F);

		turretModel[79].addShapeBox(-20F, -24.75F, -8F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		turretModel[79].setRotationPoint(10F, -19F, 0F);

		turretModel[80].addShapeBox(-4F, -22.25F, -8F, 8, 2, 16, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 617
		turretModel[80].setRotationPoint(10F, -19F, 0F);

		turretModel[81].addShapeBox(-4F, -22.25F, -11F, 8, 2, 3, 0F,-2F, 0.5F, 0F, -2.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 618
		turretModel[81].setRotationPoint(10F, -19F, 0F);

		turretModel[82].addShapeBox(-4F, -22.25F, 8F, 8, 2, 3, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F); // Box 619
		turretModel[82].setRotationPoint(10F, -19F, 0F);

		turretModel[83].addShapeBox(-2.25F, -22.75F, 9.5F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 620
		turretModel[83].setRotationPoint(10F, -19F, 0F);

		turretModel[84].addShapeBox(1.75F, -22.75F, 9.5F, 3, 1, 3, 0F,0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0F); // Box 621
		turretModel[84].setRotationPoint(10F, -19F, 0F);

		turretModel[85].addShapeBox(-5.25F, -22.75F, 9.5F, 3, 1, 3, 0F,-3F, -0.25F, 0.9F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.25F, -3F, -0.25F, 0.9F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.25F); // Box 622
		turretModel[85].setRotationPoint(10F, -19F, 0F);

		turretModel[86].addShapeBox(-5.25F, -22.75F, -0.5F, 3, 1, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.85F, 0F, -0.25F, 1.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.85F, 0F, -0.25F, 1.75F); // Box 623
		turretModel[86].setRotationPoint(10F, -19F, 0F);

		turretModel[87].addShapeBox(-2.25F, -22.75F, -12.5F, 4, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 625
		turretModel[87].setRotationPoint(10F, -19F, 0F);

		turretModel[88].addShapeBox(1.75F, -22.75F, -12.5F, 3, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, -1.25F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.25F, -2F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 626
		turretModel[88].setRotationPoint(10F, -19F, 0F);

		turretModel[89].addShapeBox(-5.25F, -22.75F, -12.5F, 3, 1, 3, 0F,0F, -0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 627
		turretModel[89].setRotationPoint(10F, -19F, 0F);

		turretModel[90].addShapeBox(-5.5F, -22.15F, -9F, 2, 2, 9, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 628
		turretModel[90].setRotationPoint(10F, -19F, 0F);

		turretModel[91].addShapeBox(12.5F, -21.75F, -1F, 4, 6, 2, 0F,0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 629
		turretModel[91].setRotationPoint(10F, -19F, 0F);

		turretModel[92].addShapeBox(-41.5F, -20.75F, 5F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		turretModel[92].setRotationPoint(10F, -19F, 0F);

		turretModel[93].addShapeBox(-41.5F, -20.75F, -12F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		turretModel[93].setRotationPoint(10F, -19F, 0F);

		turretModel[94].addShapeBox(-1.25F, -22.25F, 9.85F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		turretModel[94].setRotationPoint(10F, -19F, 0F);

		turretModel[95].addShapeBox(2.25F, -22.25F, 10.75F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 633
		turretModel[95].setRotationPoint(10F, -19F, 0F);

		turretModel[96].addShapeBox(-4.75F, -22.25F, 10.75F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 634
		turretModel[96].setRotationPoint(10F, -19F, 0F);

		turretModel[97].addShapeBox(2.25F, -22.25F, -12.75F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
		turretModel[97].setRotationPoint(10F, -19F, 0F);

		turretModel[98].addShapeBox(-4.75F, -22.25F, -12.75F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		turretModel[98].setRotationPoint(10F, -19F, 0F);

		turretModel[99].addShapeBox(2.25F, -22.25F, -12.75F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		turretModel[99].setRotationPoint(10F, -19F, 0F);

		turretModel[100].addShapeBox(-1.25F, -22.25F, -12.85F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		turretModel[100].setRotationPoint(10F, -19F, 0F);

		turretModel[101].addShapeBox(-4.75F, -22.25F, -12.75F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		turretModel[101].setRotationPoint(10F, -19F, 0F);

		turretModel[102].addShapeBox(5F, -21.25F, 4F, 3, 2, 7, 0F,0F, 0.5F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 641
		turretModel[102].setRotationPoint(10F, -19F, 0F);

		turretModel[103].addShapeBox(5F, -24.75F, 4F, 3, 3, 7, 0F,-1.25F, 0F, -2F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -1.25F, 0F, -2F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 642
		turretModel[103].setRotationPoint(10F, -19F, 0F);

		turretModel[104].addShapeBox(7.5F, -24.75F, 4F, 2, 3, 7, 0F,-0.5F, 0.5F, -1.5F, -1F, 0.5F, -1.5F, -1F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 643
		turretModel[104].setRotationPoint(10F, -19F, 0F);

		turretModel[105].addShapeBox(8.5F, -24.75F, 4F, 3, 3, 7, 0F,0F, 0.5F, -1.5F, -1.75F, 0F, -2.5F, -1.75F, 0F, -2.5F, 0F, 0.5F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Box 644
		turretModel[105].setRotationPoint(10F, -19F, 0F);

		turretModel[106].addShapeBox(7.5F, -21.25F, 4F, 2, 2, 7, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 645
		turretModel[106].setRotationPoint(10F, -19F, 0F);

		turretModel[107].addShapeBox(9F, -21.25F, 4F, 3, 2, 7, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 646
		turretModel[107].setRotationPoint(10F, -19F, 0F);

		turretModel[108].addShapeBox(8.5F, -24.75F, -11F, 3, 3, 7, 0F,0F, 0.5F, -1.5F, -1.75F, 0F, -2.5F, -1.75F, 0F, -2.5F, 0F, 0.5F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Box 647
		turretModel[108].setRotationPoint(10F, -19F, 0F);

		turretModel[109].addShapeBox(7.5F, -24.75F, -11F, 2, 3, 7, 0F,-0.5F, 0.5F, -1.5F, -1F, 0.5F, -1.5F, -1F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 648
		turretModel[109].setRotationPoint(10F, -19F, 0F);

		turretModel[110].addShapeBox(5F, -24.75F, -11F, 3, 3, 7, 0F,-1.25F, 0F, -2F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -1.25F, 0F, -2F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 649
		turretModel[110].setRotationPoint(10F, -19F, 0F);

		turretModel[111].addShapeBox(7.5F, -21.25F, -11F, 2, 2, 7, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 650
		turretModel[111].setRotationPoint(10F, -19F, 0F);

		turretModel[112].addShapeBox(5F, -21.25F, -11F, 3, 2, 7, 0F,0F, 0.5F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 651
		turretModel[112].setRotationPoint(10F, -19F, 0F);

		turretModel[113].addShapeBox(9F, -21.25F, -11F, 3, 2, 7, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 652
		turretModel[113].setRotationPoint(10F, -19F, 0F);

		turretModel[114].addShapeBox(7.5F, -21.25F, -11F, 2, 2, 7, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 656
		turretModel[114].setRotationPoint(10F, -19F, 0F);

		turretModel[115].addShapeBox(5F, -21.25F, -11F, 3, 2, 7, 0F,0F, 0.5F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 657
		turretModel[115].setRotationPoint(10F, -19F, 0F);

		turretModel[116].addShapeBox(9F, -21.25F, -11F, 3, 2, 7, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 658
		turretModel[116].setRotationPoint(10F, -19F, 0F);

		turretModel[117].addShapeBox(7.5F, -2.75F, -22.5F, 7, 1, 45, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -0.25F); // Box 659
		turretModel[117].setRotationPoint(10F, -19F, 0F);

		turretModel[118].addShapeBox(14F, -2.75F, -18.25F, 4, 1, 37, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -0.5F, 0F, -0.75F); // Box 660
		turretModel[118].setRotationPoint(10F, -19F, 0F);

		turretModel[119].addShapeBox(7F, -8.25F, -20.5F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 669
		turretModel[119].setRotationPoint(10F, -19F, 0F);
		turretModel[119].rotateAngleZ = -0.38397244F;

		turretModel[120].addShapeBox(9F, -9.25F, -19.25F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 670
		turretModel[120].setRotationPoint(10F, -19F, 0F);
		turretModel[120].rotateAngleZ = -0.38397244F;

		turretModel[121].addShapeBox(11F, -10F, -17.75F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 671
		turretModel[121].setRotationPoint(10F, -19F, 0F);
		turretModel[121].rotateAngleZ = -0.38397244F;

		turretModel[122].addShapeBox(13.15F, -10.5F, -15.75F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 672
		turretModel[122].setRotationPoint(10F, -19F, 0F);
		turretModel[122].rotateAngleZ = -0.38397244F;

		turretModel[123].addShapeBox(11F, -10F, 16.75F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 673
		turretModel[123].setRotationPoint(10F, -19F, 0F);
		turretModel[123].rotateAngleZ = -0.38397244F;

		turretModel[124].addShapeBox(9F, -9.25F, 17.75F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 674
		turretModel[124].setRotationPoint(10F, -19F, 0F);
		turretModel[124].rotateAngleZ = -0.38397244F;

		turretModel[125].addShapeBox(7F, -8.25F, 18.75F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 675
		turretModel[125].setRotationPoint(10F, -19F, 0F);
		turretModel[125].rotateAngleZ = -0.38397244F;

		turretModel[126].addShapeBox(13.15F, -10.5F, 15F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F); // Box 676
		turretModel[126].setRotationPoint(10F, -19F, 0F);
		turretModel[126].rotateAngleZ = -0.38397244F;

		turretModel[127].addShapeBox(-28F, -21.25F, -16.25F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 677
		turretModel[127].setRotationPoint(10F, -19F, 0F);
		turretModel[127].rotateAngleZ = 0.38397244F;

		turretModel[128].addShapeBox(-28F, -21.25F, 15.75F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 678
		turretModel[128].setRotationPoint(10F, -19F, 0F);
		turretModel[128].rotateAngleZ = 0.38397244F;

		turretModel[129].addShapeBox(21F, -17F, -5F, 5, 9, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		turretModel[129].setRotationPoint(10F, -19F, 0F);

		turretModel[130].addShapeBox(20F, -8F, -4F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		turretModel[130].setRotationPoint(10F, -19F, 0F);

		turretModel[131].addShapeBox(20F, -8F, 3F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		turretModel[131].setRotationPoint(10F, -19F, 0F);

		turretModel[132].addShapeBox(19F, -6F, -5F, 9, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 682
		turretModel[132].setRotationPoint(10F, -19F, 0F);

		turretModel[133].addShapeBox(28F, -6F, -5F, 3, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 683
		turretModel[133].setRotationPoint(10F, -19F, 0F);

		turretModel[134].addShapeBox(22F, -13.5F, -5F, 4, 4, 3, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 684
		turretModel[134].setRotationPoint(10F, -19F, 0F);
		turretModel[134].rotateAngleZ = 0.2443461F;

		turretModel[135].addShapeBox(22F, -13.5F, 2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		turretModel[135].setRotationPoint(10F, -19F, 0F);
		turretModel[135].rotateAngleZ = 0.2443461F;

		turretModel[136].addShapeBox(22F, -13.5F, -2F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 686
		turretModel[136].setRotationPoint(10F, -19F, 0F);
		turretModel[136].rotateAngleZ = 0.2443461F;

		turretModel[137].addShapeBox(26.5F, -15.75F, -5F, 1, 3, 10, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 687
		turretModel[137].setRotationPoint(10F, -19F, 0F);

		turretModel[138].addShapeBox(26.5F, -12.75F, -5F, 1, 3, 10, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 688
		turretModel[138].setRotationPoint(10F, -19F, 0F);

		turretModel[139].addShapeBox(26.5F, -18.75F, -4F, 1, 3, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		turretModel[139].setRotationPoint(10F, -19F, 0F);

		turretModel[140].addShapeBox(26.5F, -18.75F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 690
		turretModel[140].setRotationPoint(10F, -19F, 0F);

		turretModel[141].addShapeBox(26.5F, -9.75F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 691
		turretModel[141].setRotationPoint(10F, -19F, 0F);

		turretModel[142].addShapeBox(26.5F, -9.75F, -4F, 1, 3, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		turretModel[142].setRotationPoint(10F, -19F, 0F);

		turretModel[143].addShapeBox(27.5F, -18.75F, -4F, 1, 3, 4, 0F,0F, -0.5F, -1F, 0F, -1.5F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 1.5F, 2F, 0F, 0F, 0F, 0F); // Box 693
		turretModel[143].setRotationPoint(10F, -19F, 0F);

		turretModel[144].addShapeBox(27.5F, -18.75F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 1.5F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F); // Box 694
		turretModel[144].setRotationPoint(10F, -19F, 0F);

		turretModel[145].addShapeBox(27.5F, -9.75F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 1.5F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -2F, 0F, -0.5F, -1F); // Box 695
		turretModel[145].setRotationPoint(10F, -19F, 0F);

		turretModel[146].addShapeBox(27.5F, -9.75F, -4F, 1, 3, 4, 0F,0F, 0F, 1.5F, 0F, 0F, 0.5F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1.5F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 696
		turretModel[146].setRotationPoint(10F, -19F, 0F);

		turretModel[147].addShapeBox(27.5F, -12.75F, -5F, 1, 3, 5, 0F,0F, 0F, 1.5F, 0F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1.5F, -2F, 0F, 0F, 0F, 0F); // Box 697
		turretModel[147].setRotationPoint(10F, -19F, 0F);

		turretModel[148].addShapeBox(27.5F, -12.75F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1.5F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 698
		turretModel[148].setRotationPoint(10F, -19F, 0F);

		turretModel[149].addShapeBox(27.5F, -15.75F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 1.5F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F); // Box 699
		turretModel[149].setRotationPoint(10F, -19F, 0F);

		turretModel[150].addShapeBox(27.5F, -15.75F, -5F, 1, 3, 5, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 700
		turretModel[150].setRotationPoint(10F, -19F, 0F);

		turretModel[151].addShapeBox(19.25F, -14F, -7F, 7, 3, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 701
		turretModel[151].setRotationPoint(10F, -19F, 0F);

		turretModel[152].addShapeBox(19.25F, -15.75F, -7F, 7, 2, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		turretModel[152].setRotationPoint(10F, -19F, 0F);

		turretModel[153].addShapeBox(19.25F, -11.25F, -7F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 703
		turretModel[153].setRotationPoint(10F, -19F, 0F);

		turretModel[154].addShapeBox(22.75F, -14.5F, 6.75F, 4, 4, 1, 0F,0F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, -0.25F, 0F); // Box 713
		turretModel[154].setRotationPoint(10F, -19F, 0F);

		turretModel[155].addShapeBox(22.75F, -17.5F, 6.75F, 4, 4, 1, 0F,0F, -0.5F, 0F, -1.75F, -1.25F, 0F, -1.75F, -1.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.75F, 0F); // Box 714
		turretModel[155].setRotationPoint(10F, -19F, 0F);

		turretModel[156].addShapeBox(18.75F, -17.5F, 6.75F, 4, 4, 1, 0F,-1.75F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1.75F, -1.25F, -0.5F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, -0.5F); // Box 715
		turretModel[156].setRotationPoint(10F, -19F, 0F);

		turretModel[157].addShapeBox(18.75F, -14.5F, 6.75F, 4, 4, 1, 0F,0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, -0.5F); // Box 716
		turretModel[157].setRotationPoint(10F, -19F, 0F);

		turretModel[158].addShapeBox(18.75F, -11.5F, 6.75F, 4, 4, 1, 0F,0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, -0.5F, -1.75F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1.75F, -1.25F, -0.5F); // Box 717
		turretModel[158].setRotationPoint(10F, -19F, 0F);

		turretModel[159].addShapeBox(22.75F, -11.5F, 6.75F, 4, 4, 1, 0F,0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -1.75F, -1.25F, 0F, -1.75F, -1.25F, -0.5F, 0F, -0.5F, -0.5F); // Box 718
		turretModel[159].setRotationPoint(10F, -19F, 0F);

		turretModel[160].addShapeBox(19.25F, -15.75F, 5F, 7, 2, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		turretModel[160].setRotationPoint(10F, -19F, 0F);

		turretModel[161].addShapeBox(19.25F, -11.25F, 5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 720
		turretModel[161].setRotationPoint(10F, -19F, 0F);

		turretModel[162].addShapeBox(19.25F, -14F, 5F, 7, 3, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 721
		turretModel[162].setRotationPoint(10F, -19F, 0F);

		turretModel[163].addShapeBox(18.75F, -14.5F, -7.75F, 4, 4, 1, 0F,0.25F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, 0F); // Box 722
		turretModel[163].setRotationPoint(10F, -19F, 0F);

		turretModel[164].addShapeBox(22.75F, -14.5F, -7.75F, 4, 4, 1, 0F,0F, -0.25F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, -0.25F, 0F); // Box 723
		turretModel[164].setRotationPoint(10F, -19F, 0F);

		turretModel[165].addShapeBox(22.75F, -17.5F, -7.75F, 4, 4, 1, 0F,0F, -0.5F, -0.5F, -1.75F, -1.25F, -0.5F, -1.75F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, -0.75F, 0F); // Box 724
		turretModel[165].setRotationPoint(10F, -19F, 0F);

		turretModel[166].addShapeBox(18.75F, -17.5F, -7.75F, 4, 4, 1, 0F,-1.75F, -1.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1.75F, -1.25F, 0F, 0.25F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F); // Box 725
		turretModel[166].setRotationPoint(10F, -19F, 0F);

		turretModel[167].addShapeBox(18.75F, -11.5F, -7.75F, 4, 4, 1, 0F,0.25F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, -1.75F, -1.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1.75F, -1.25F, 0F); // Box 726
		turretModel[167].setRotationPoint(10F, -19F, 0F);

		turretModel[168].addShapeBox(22.75F, -11.5F, -7.75F, 4, 4, 1, 0F,0F, -0.75F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.5F, -1.75F, -1.25F, -0.5F, -1.75F, -1.25F, 0F, 0F, -0.5F, 0F); // Box 727
		turretModel[168].setRotationPoint(10F, -19F, 0F);

		turretModel[169].addShapeBox(-22F, -15.75F, -13.5F, 12, 3, 27, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F); // Box 740
		turretModel[169].setRotationPoint(10F, -19F, 0F);

		turretModel[170].addShapeBox(-16F, -18.75F, -13.5F, 5, 3, 27, 0F,0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 741
		turretModel[170].setRotationPoint(10F, -19F, 0F);

		turretModel[171].addShapeBox(-21F, -18.75F, -13.5F, 5, 3, 27, 0F,-1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 745
		turretModel[171].setRotationPoint(10F, -19F, 0F);

		turretModel[172].addShapeBox(-22F, -11.75F, -13.5F, 12, 3, 27, 0F,1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 748
		turretModel[172].setRotationPoint(10F, -8F, 0F);

		turretModel[173].addShapeBox(-21F, -8.75F, -13.5F, 5, 3, 27, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F); // Box 749
		turretModel[173].setRotationPoint(10F, -19F, 0F);

		turretModel[174].addShapeBox(-16F, -8.75F, -13.5F, 5, 3, 27, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 750
		turretModel[174].setRotationPoint(10F, -19F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 728
		barrelModel[1] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 729
		barrelModel[2] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 730
		barrelModel[3] = new ModelRendererTurbo(this, 825, 217, textureX, textureY); // Box 731
		barrelModel[4] = new ModelRendererTurbo(this, 873, 217, textureX, textureY); // Box 733
		barrelModel[5] = new ModelRendererTurbo(this, 913, 217, textureX, textureY); // Box 734
		barrelModel[6] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 735
		barrelModel[7] = new ModelRendererTurbo(this, 953, 217, textureX, textureY); // Box 736
		barrelModel[8] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 737
		barrelModel[9] = new ModelRendererTurbo(this, 977, 225, textureX, textureY); // Box 738
		barrelModel[10] = new ModelRendererTurbo(this, 521, 185, textureX, textureY); // Box 739
		barrelModel[11] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 751
		barrelModel[12] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 752
		barrelModel[13] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 753
		barrelModel[14] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 754
		barrelModel[15] = new ModelRendererTurbo(this, 657, 193, textureX, textureY); // Box 755
		barrelModel[16] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 756
		barrelModel[17] = new ModelRendererTurbo(this, 625, 185, textureX, textureY); // Box 757
		barrelModel[18] = new ModelRendererTurbo(this, 769, 185, textureX, textureY); // Box 758
		barrelModel[19] = new ModelRendererTurbo(this, 913, 193, textureX, textureY); // Box 759
		barrelModel[20] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 760
		barrelModel[21] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Box 761
		barrelModel[22] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 762
		barrelModel[23] = new ModelRendererTurbo(this, 825, 233, textureX, textureY); // Box 763
		barrelModel[24] = new ModelRendererTurbo(this, 761, 153, textureX, textureY); // Box 794
		barrelModel[25] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 795
		barrelModel[26] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 797
		barrelModel[27] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 798
		barrelModel[28] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 799
		barrelModel[29] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 800
		barrelModel[30] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Box 801
		barrelModel[31] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 802
		barrelModel[32] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 803
		barrelModel[33] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 804
		barrelModel[34] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 805
		barrelModel[35] = new ModelRendererTurbo(this, 785, 137, textureX, textureY); // Box 806
		barrelModel[36] = new ModelRendererTurbo(this, 881, 129, textureX, textureY); // Box 807
		barrelModel[37] = new ModelRendererTurbo(this, 673, 145, textureX, textureY); // Box 808
		barrelModel[38] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 809
		barrelModel[39] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 810
		barrelModel[40] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 811
		barrelModel[41] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 812
		barrelModel[42] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 836
		barrelModel[43] = new ModelRendererTurbo(this, 793, 185, textureX, textureY); // Box 837
		barrelModel[44] = new ModelRendererTurbo(this, 609, 201, textureX, textureY); // Box 838
		barrelModel[45] = new ModelRendererTurbo(this, 849, 185, textureX, textureY); // Box 839
		barrelModel[46] = new ModelRendererTurbo(this, 969, 201, textureX, textureY); // Box 840
		barrelModel[47] = new ModelRendererTurbo(this, 697, 201, textureX, textureY); // Box 841
		barrelModel[48] = new ModelRendererTurbo(this, 1009, 201, textureX, textureY); // Box 842
		barrelModel[49] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 843
		barrelModel[50] = new ModelRendererTurbo(this, 505, 233, textureX, textureY); // Box 844
		barrelModel[51] = new ModelRendererTurbo(this, 577, 233, textureX, textureY); // Box 845
		barrelModel[52] = new ModelRendererTurbo(this, 921, 233, textureX, textureY); // Box 846
		barrelModel[53] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Box 847
		barrelModel[54] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 848
		barrelModel[55] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Box 849
		barrelModel[56] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 850
		barrelModel[57] = new ModelRendererTurbo(this, 313, 241, textureX, textureY); // Box 851
		barrelModel[58] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Box 852
		barrelModel[59] = new ModelRendererTurbo(this, 609, 241, textureX, textureY); // Box 853
		barrelModel[60] = new ModelRendererTurbo(this, 641, 209, textureX, textureY); // Box 854
		barrelModel[61] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 855
		barrelModel[62] = new ModelRendererTurbo(this, 881, 209, textureX, textureY); // Box 856
		barrelModel[63] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 857
		barrelModel[64] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 858
		barrelModel[65] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Box 859
		barrelModel[66] = new ModelRendererTurbo(this, 153, 249, textureX, textureY); // Box 860
		barrelModel[67] = new ModelRendererTurbo(this, 1001, 161, textureX, textureY); // Box 861
		barrelModel[68] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 862
		barrelModel[69] = new ModelRendererTurbo(this, 841, 129, textureX, textureY); // Box 863
		barrelModel[70] = new ModelRendererTurbo(this, 569, 137, textureX, textureY); // Box 864
		barrelModel[71] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 865
		barrelModel[72] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 866
		barrelModel[73] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Box 867
		barrelModel[74] = new ModelRendererTurbo(this, 641, 137, textureX, textureY); // Box 868
		barrelModel[75] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 869
		barrelModel[76] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 870
		barrelModel[77] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 871
		barrelModel[78] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 872
		barrelModel[79] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 873
		barrelModel[80] = new ModelRendererTurbo(this, 641, 145, textureX, textureY); // Box 874
		barrelModel[81] = new ModelRendererTurbo(this, 673, 193, textureX, textureY); // Box 875
		barrelModel[82] = new ModelRendererTurbo(this, 697, 193, textureX, textureY); // Box 876

		barrelModel[0].addBox(-4F, -2F, -0.75F, 8, 4, 11, 0F); // Box 728
		barrelModel[0].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[1].addShapeBox(-4F, -5F, -0.75F, 8, 3, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		barrelModel[1].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[2].addShapeBox(-4F, 2F, -0.75F, 8, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F); // Box 730
		barrelModel[2].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[3].addShapeBox(-12F, -2F, -0.75F, 8, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 731
		barrelModel[3].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[4].addShapeBox(-12F, 2F, -0.75F, 8, 3, 11, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.5F, 0F, -3.5F, -4F); // Box 733
		barrelModel[4].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[5].addShapeBox(-12F, -5F, 1.25F, 8, 3, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 734
		barrelModel[5].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[6].addShapeBox(-8F, -5F, -0.75F, 4, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		barrelModel[6].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[7].addShapeBox(4F, -2F, -0.75F, 6, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 736
		barrelModel[7].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[8].addShapeBox(4F, -4F, -0.75F, 6, 2, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 737
		barrelModel[8].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[9].addShapeBox(4F, 2F, -0.75F, 6, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, -4F, 0F, -0.5F, -3.5F); // Box 738
		barrelModel[9].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[10].addShapeBox(10F, -4.5F, 0.25F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 739
		barrelModel[10].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[11].addShapeBox(-11F, 3.5F, -1F, 7, 3, 11, 0F,0.75F, 3F, 0F, 1F, 0F, 0F, 1F, 0F, -3.5F, 0.75F, 3F, -4F, 0F, -3.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -3.5F, 0F, -3.5F, -4F); // Box 751
		barrelModel[11].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[12].addShapeBox(-14F, -1.5F, 1.25F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 752
		barrelModel[12].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[13].addShapeBox(-14F, -4.5F, 1.25F, 2, 3, 5, 0F,-0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 753
		barrelModel[13].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[14].addShapeBox(-13.5F, 1.5F, 1.25F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -2.5F, 0F, 0F); // Box 754
		barrelModel[14].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[15].addShapeBox(-4F, -8.5F, 3.5F, 6, 4, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 5F, -3.5F, 0F, 5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F); // Box 755
		barrelModel[15].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[16].addShapeBox(-4F, -8.5F, 1.5F, 6, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		barrelModel[16].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[17].addShapeBox(2F, -8.5F, 1.5F, 5, 4, 2, 0F,0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 757
		barrelModel[17].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[18].addShapeBox(-9F, -8.5F, 1.5F, 5, 4, 2, 0F,0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 758
		barrelModel[18].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[19].addShapeBox(-12F, -6F, 1.5F, 3, 1, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -0.5F); // Box 759
		barrelModel[19].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[20].addShapeBox(11F, -2.5F, 1.25F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 760
		barrelModel[20].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[21].addShapeBox(11F, -3.5F, 1.25F, 9, 2, 5, 0F,1F, 1F, -1.25F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 1F, 1F, -1.25F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F); // Box 761
		barrelModel[21].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[22].addShapeBox(11F, 0.5F, 1.25F, 9, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 2F, -0.5F, -1.25F, 0F, -1.9F, -2F, 0F, -1.9F, -2F, 2F, -0.5F, -1.25F); // Box 762
		barrelModel[22].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[23].addShapeBox(18F, -1.5F, 2.75F, 49, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 763
		barrelModel[23].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[24].addShapeBox(61F, -1.5F, 2.75F, 4, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 794
		barrelModel[24].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[25].addShapeBox(66F, -1.5F, 2.75F, 2, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 795
		barrelModel[25].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[26].addShapeBox(74F, -1.5F, 2.7F, 1, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 797
		barrelModel[26].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[27].addShapeBox(66F, -2F, 3.25F, 10, 1, 1, 0F,0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F); // Box 798
		barrelModel[27].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[28].addShapeBox(66F, 0F, 3.25F, 10, 1, 1, 0F,0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 799
		barrelModel[28].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[29].addShapeBox(66F, -1F, 4.3F, 10, 1, 1, 0F,0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 800
		barrelModel[29].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[30].addShapeBox(66F, -1F, 2.2F, 10, 1, 1, 0F,0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 801
		barrelModel[30].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[31].addShapeBox(74F, -1.5F, 3.7F, 1, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 802
		barrelModel[31].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[32].addShapeBox(74F, -1.6F, 2.6F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 803
		barrelModel[32].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[33].addShapeBox(74F, -0.15F, 2.6F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 804
		barrelModel[33].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[34].addShapeBox(70.5F, -1.5F, 3.7F, 2, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 805
		barrelModel[34].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[35].addShapeBox(70.5F, -1.6F, 2.6F, 2, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 806
		barrelModel[35].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[36].addShapeBox(70.5F, -1.5F, 2.7F, 2, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 807
		barrelModel[36].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[37].addShapeBox(70.5F, -0.15F, 2.6F, 2, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 808
		barrelModel[37].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[38].addShapeBox(68F, -1.5F, 3.7F, 1, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 809
		barrelModel[38].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[39].addShapeBox(68F, -1.6F, 2.6F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 810
		barrelModel[39].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[40].addShapeBox(68F, -1.5F, 2.7F, 1, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 811
		barrelModel[40].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[41].addShapeBox(68F, -0.15F, 2.6F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 812
		barrelModel[41].setRotationPoint(-5F, -31.25F, 12F);

		barrelModel[42].addShapeBox(-4F, -8.5F, 3.5F, 6, 4, 3, 0F,5F, -2.5F, 0F, 5F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 836
		barrelModel[42].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[43].addShapeBox(2F, -8.5F, 6.5F, 5, 4, 2, 0F,0F, -0.5F, 0F, 0F, -3.5F, 3F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
		barrelModel[43].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[44].addShapeBox(-4F, -8.5F, 6.5F, 6, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 838
		barrelModel[44].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[45].addShapeBox(-9F, -8.5F, 6.5F, 5, 4, 2, 0F,0F, -2.5F, 3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 839
		barrelModel[45].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[46].addShapeBox(-12F, -6F, 3.5F, 3, 1, 5, 0F,0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Box 840
		barrelModel[46].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[47].addShapeBox(-14F, -4.5F, 3.5F, 2, 3, 5, 0F,-0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 841
		barrelModel[47].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[48].addShapeBox(-14F, -1.5F, 3.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 842
		barrelModel[48].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[49].addShapeBox(-13.5F, 1.5F, 3.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -2.5F, 0F, 0F); // Box 843
		barrelModel[49].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[50].addShapeBox(-11F, 3.5F, 0F, 7, 3, 11, 0F,0.75F, 3F, -4F, 1F, 0F, -3.5F, 1F, 0F, 0F, 0.75F, 3F, 0F, 0F, -3.5F, -4F, -0.5F, -0.75F, -3.5F, -0.5F, -0.75F, 0F, 0F, -3.5F, 0F); // Box 844
		barrelModel[50].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[51].addShapeBox(-12F, 2F, -0.5F, 8, 3, 11, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3.5F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, -3.5F, 0F); // Box 845
		barrelModel[51].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[52].addShapeBox(-12F, -2F, -0.5F, 8, 4, 11, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 846
		barrelModel[52].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[53].addShapeBox(-12F, -5F, -0.5F, 8, 3, 9, 0F,0F, -0.5F, -4F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 847
		barrelModel[53].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[54].addShapeBox(-4F, -5F, -0.5F, 8, 3, 11, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 848
		barrelModel[54].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[55].addBox(-4F, -2F, -0.5F, 8, 4, 11, 0F); // Box 849
		barrelModel[55].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[56].addShapeBox(-4F, 2F, -0.5F, 8, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 850
		barrelModel[56].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[57].addShapeBox(4F, 2F, -0.5F, 6, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3.5F, -5F, -0.5F, -4F, -5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 851
		barrelModel[57].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[58].addShapeBox(4F, -2F, -0.5F, 6, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 852
		barrelModel[58].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[59].addShapeBox(4F, -4F, -0.5F, 6, 2, 11, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 853
		barrelModel[59].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[60].addShapeBox(10F, -4.5F, 3.5F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 854
		barrelModel[60].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[61].addShapeBox(11F, -2.5F, 3.5F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 855
		barrelModel[61].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[62].addShapeBox(11F, -3.5F, 3.5F, 9, 2, 5, 0F,1F, 1F, -1.25F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 1F, 1F, -1.25F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F); // Box 856
		barrelModel[62].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[63].addShapeBox(11F, 0.5F, 3.5F, 9, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 2F, -0.5F, -1.25F, 0F, -1.9F, -2F, 0F, -1.9F, -2F, 2F, -0.5F, -1.25F); // Box 857
		barrelModel[63].setRotationPoint(-5F, -31.25F, -22F);

		barrelModel[64].addShapeBox(66F, -1.5F, 3F, 2, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 858
		barrelModel[64].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[65].addShapeBox(61F, -1.5F, 3F, 4, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 859
		barrelModel[65].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[66].addShapeBox(18F, -1.5F, 3F, 49, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 860
		barrelModel[66].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[67].addShapeBox(66F, -1F, 4.55F, 10, 1, 1, 0F,0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 861
		barrelModel[67].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[68].addShapeBox(66F, -2F, 3.5F, 10, 1, 1, 0F,0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F); // Box 862
		barrelModel[68].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[69].addShapeBox(68F, -1.5F, 3.95F, 1, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 863
		barrelModel[69].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[70].addShapeBox(68F, -1.6F, 2.85F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 864
		barrelModel[70].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[71].addShapeBox(68F, -1.5F, 2.95F, 1, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 865
		barrelModel[71].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[72].addShapeBox(70.5F, -1.6F, 2.85F, 2, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 866
		barrelModel[72].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[73].addShapeBox(70.5F, -1.5F, 3.95F, 2, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 867
		barrelModel[73].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[74].addShapeBox(70.5F, -1.5F, 2.95F, 2, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 868
		barrelModel[74].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[75].addShapeBox(74F, -1.6F, 2.85F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 869
		barrelModel[75].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[76].addShapeBox(74F, -1.5F, 2.95F, 1, 2, 1, 0F,0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Box 870
		barrelModel[76].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[77].addShapeBox(74F, -1.5F, 3.95F, 1, 2, 1, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F); // Box 871
		barrelModel[77].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[78].addShapeBox(70.5F, -0.15F, 2.85F, 2, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 872
		barrelModel[78].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[79].addShapeBox(68F, -0.15F, 2.85F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 873
		barrelModel[79].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[80].addShapeBox(74F, -0.15F, 2.85F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 874
		barrelModel[80].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[81].addShapeBox(66F, 0F, 3.5F, 10, 1, 1, 0F,0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 875
		barrelModel[81].setRotationPoint(-5F, -31.25F, -20F);

		barrelModel[82].addShapeBox(66F, -1F, 2.45F, 10, 1, 1, 0F,0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 876
		barrelModel[82].setRotationPoint(-5F, -31.25F, -20F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 113
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 114
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 116
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 117
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 118
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 119
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 120
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 121
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 122
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 123
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 124
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 125
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 126
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 127
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 128
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 129
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 130
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 131
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 132
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 133
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 134
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Box 135
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 136
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 137
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 138
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 139
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 140
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 204
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 205
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 206
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 207
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 208
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 209
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 210
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 211
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 212

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
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 141
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 142
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 143
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 144
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 145
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 146
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 147
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 148
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 149
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 150
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 151
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 152
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 153
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 154
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 155
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 156
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 157
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 158
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 159
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 160
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 161
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 162
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 163
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 164
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 165
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 166
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 167
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 213
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 214
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 215
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 216
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 217
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 218
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 219
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 220
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 221

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
		leftTrackModel[0] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 168
		leftTrackModel[1] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Box 169
		leftTrackModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 170
		leftTrackModel[3] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 171
		leftTrackModel[4] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 172
		leftTrackModel[5] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 173
		leftTrackModel[6] = new ModelRendererTurbo(this, 841, 105, textureX, textureY); // Box 174
		leftTrackModel[7] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 175
		leftTrackModel[8] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 179
		leftTrackModel[9] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 181
		leftTrackModel[10] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 183
		leftTrackModel[11] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Box 184
		leftTrackModel[12] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 185
		leftTrackModel[13] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Box 186

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
		rightTrackModel[0] = new ModelRendererTurbo(this, 889, 105, textureX, textureY); // Box 187
		rightTrackModel[1] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 188
		rightTrackModel[2] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 189
		rightTrackModel[3] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 190
		rightTrackModel[4] = new ModelRendererTurbo(this, 937, 105, textureX, textureY); // Box 191
		rightTrackModel[5] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 192
		rightTrackModel[6] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 193
		rightTrackModel[7] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 194
		rightTrackModel[8] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 195
		rightTrackModel[9] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 196
		rightTrackModel[10] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 197
		rightTrackModel[11] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 198
		rightTrackModel[12] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 199
		rightTrackModel[13] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 200

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