//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.07.2016 - 17:44:18
// Last changed on: 06.07.2016 - 17:44:18

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelT72B extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelT72B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[316];
		turretModel = new ModelRendererTurbo[259];
		barrelModel = new ModelRendererTurbo[15];
		leftTrackWheelModels = new ModelRendererTurbo[24];
		rightTrackWheelModels = new ModelRendererTurbo[24];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 79
		bodyModel[9] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 80
		bodyModel[10] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 81
		bodyModel[11] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 82
		bodyModel[12] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 83
		bodyModel[13] = new ModelRendererTurbo(this, 529, 113, textureX, textureY); // Box 85
		bodyModel[14] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 83
		bodyModel[15] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 85
		bodyModel[16] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 86
		bodyModel[17] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 87
		bodyModel[18] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 88
		bodyModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 89
		bodyModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 90
		bodyModel[21] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 91
		bodyModel[22] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 92
		bodyModel[23] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 93
		bodyModel[24] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 94
		bodyModel[25] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 95
		bodyModel[26] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 96
		bodyModel[27] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 97
		bodyModel[28] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 98
		bodyModel[29] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 99
		bodyModel[30] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 100
		bodyModel[31] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 101
		bodyModel[32] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 102
		bodyModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 106
		bodyModel[34] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 111
		bodyModel[35] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 112
		bodyModel[36] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 113
		bodyModel[37] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 114
		bodyModel[38] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 115
		bodyModel[39] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Box 116
		bodyModel[40] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 117
		bodyModel[41] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Box 118
		bodyModel[42] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 119
		bodyModel[43] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 120
		bodyModel[44] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 121
		bodyModel[45] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 122
		bodyModel[46] = new ModelRendererTurbo(this, 873, 105, textureX, textureY); // Box 11
		bodyModel[47] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 126
		bodyModel[48] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 127
		bodyModel[49] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 129
		bodyModel[51] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 130
		bodyModel[52] = new ModelRendererTurbo(this, 601, 249, textureX, textureY); // Box 332
		bodyModel[53] = new ModelRendererTurbo(this, 793, 249, textureX, textureY); // Box 333
		bodyModel[54] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 334
		bodyModel[55] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 335
		bodyModel[56] = new ModelRendererTurbo(this, 873, 249, textureX, textureY); // Box 336
		bodyModel[57] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 337
		bodyModel[58] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 338
		bodyModel[59] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 339
		bodyModel[60] = new ModelRendererTurbo(this, 665, 169, textureX, textureY); // Box 340
		bodyModel[61] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 341
		bodyModel[62] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 342
		bodyModel[63] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 343
		bodyModel[64] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 121
		bodyModel[65] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 122
		bodyModel[66] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 123
		bodyModel[67] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 126
		bodyModel[68] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 352
		bodyModel[69] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 353
		bodyModel[70] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 354
		bodyModel[71] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 355
		bodyModel[72] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 595
		bodyModel[73] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 596
		bodyModel[74] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 597
		bodyModel[75] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 598
		bodyModel[76] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 599
		bodyModel[77] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 600
		bodyModel[78] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 405
		bodyModel[79] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 409
		bodyModel[80] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 410
		bodyModel[81] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 518
		bodyModel[82] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 519
		bodyModel[83] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 520
		bodyModel[84] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 527
		bodyModel[85] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 528
		bodyModel[86] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 529
		bodyModel[87] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 530
		bodyModel[88] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 531
		bodyModel[89] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Box 532
		bodyModel[90] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 551
		bodyModel[91] = new ModelRendererTurbo(this, 929, 113, textureX, textureY); // Box 552
		bodyModel[92] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 553
		bodyModel[93] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 554
		bodyModel[94] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 555
		bodyModel[95] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 556
		bodyModel[96] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 557
		bodyModel[97] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 558
		bodyModel[98] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 559
		bodyModel[99] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 560
		bodyModel[100] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 561
		bodyModel[101] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 562
		bodyModel[102] = new ModelRendererTurbo(this, 713, 137, textureX, textureY); // Box 563
		bodyModel[103] = new ModelRendererTurbo(this, 745, 137, textureX, textureY); // Box 564
		bodyModel[104] = new ModelRendererTurbo(this, 769, 137, textureX, textureY); // Box 565
		bodyModel[105] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 566
		bodyModel[106] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 567
		bodyModel[107] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Box 568
		bodyModel[108] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 569
		bodyModel[109] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 570
		bodyModel[110] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 571
		bodyModel[111] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 572
		bodyModel[112] = new ModelRendererTurbo(this, 561, 145, textureX, textureY); // Box 573
		bodyModel[113] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 574
		bodyModel[114] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Box 576
		bodyModel[115] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Box 577
		bodyModel[116] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 578
		bodyModel[117] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 579
		bodyModel[118] = new ModelRendererTurbo(this, 801, 153, textureX, textureY); // Box 580
		bodyModel[119] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 581
		bodyModel[120] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 582
		bodyModel[121] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 583
		bodyModel[122] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 584
		bodyModel[123] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 588
		bodyModel[124] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 589
		bodyModel[125] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 590
		bodyModel[126] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 591
		bodyModel[127] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 592
		bodyModel[128] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 593
		bodyModel[129] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 594
		bodyModel[130] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 595
		bodyModel[131] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 596
		bodyModel[132] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 600
		bodyModel[133] = new ModelRendererTurbo(this, 609, 169, textureX, textureY); // Box 601
		bodyModel[134] = new ModelRendererTurbo(this, 625, 169, textureX, textureY); // Box 602
		bodyModel[135] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 603
		bodyModel[136] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Box 604
		bodyModel[137] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 605
		bodyModel[138] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 606
		bodyModel[139] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 607
		bodyModel[140] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 608
		bodyModel[141] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 609
		bodyModel[142] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 611
		bodyModel[143] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 612
		bodyModel[144] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 613
		bodyModel[145] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 614
		bodyModel[146] = new ModelRendererTurbo(this, 729, 177, textureX, textureY); // Box 615
		bodyModel[147] = new ModelRendererTurbo(this, 745, 177, textureX, textureY); // Box 616
		bodyModel[148] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 617
		bodyModel[149] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Box 618
		bodyModel[150] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 619
		bodyModel[151] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 620
		bodyModel[152] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 621
		bodyModel[153] = new ModelRendererTurbo(this, 513, 185, textureX, textureY); // Box 622
		bodyModel[154] = new ModelRendererTurbo(this, 545, 185, textureX, textureY); // Box 623
		bodyModel[155] = new ModelRendererTurbo(this, 585, 185, textureX, textureY); // Box 624
		bodyModel[156] = new ModelRendererTurbo(this, 601, 185, textureX, textureY); // Box 625
		bodyModel[157] = new ModelRendererTurbo(this, 633, 185, textureX, textureY); // Box 626
		bodyModel[158] = new ModelRendererTurbo(this, 745, 185, textureX, textureY); // Box 627
		bodyModel[159] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Box 628
		bodyModel[160] = new ModelRendererTurbo(this, 825, 185, textureX, textureY); // Box 629
		bodyModel[161] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Box 630
		bodyModel[162] = new ModelRendererTurbo(this, 881, 185, textureX, textureY); // Box 631
		bodyModel[163] = new ModelRendererTurbo(this, 913, 185, textureX, textureY); // Box 632
		bodyModel[164] = new ModelRendererTurbo(this, 961, 185, textureX, textureY); // Box 633
		bodyModel[165] = new ModelRendererTurbo(this, 1001, 185, textureX, textureY); // Box 634
		bodyModel[166] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 635
		bodyModel[167] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 636
		bodyModel[168] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 637
		bodyModel[169] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 638
		bodyModel[170] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 639
		bodyModel[171] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 640
		bodyModel[172] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 641
		bodyModel[173] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 642
		bodyModel[174] = new ModelRendererTurbo(this, 545, 193, textureX, textureY); // Box 643
		bodyModel[175] = new ModelRendererTurbo(this, 585, 193, textureX, textureY); // Box 644
		bodyModel[176] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Box 645
		bodyModel[177] = new ModelRendererTurbo(this, 633, 193, textureX, textureY); // Box 646
		bodyModel[178] = new ModelRendererTurbo(this, 865, 193, textureX, textureY); // Box 647
		bodyModel[179] = new ModelRendererTurbo(this, 881, 193, textureX, textureY); // Box 648
		bodyModel[180] = new ModelRendererTurbo(this, 913, 193, textureX, textureY); // Box 649
		bodyModel[181] = new ModelRendererTurbo(this, 961, 193, textureX, textureY); // Box 650
		bodyModel[182] = new ModelRendererTurbo(this, 1001, 193, textureX, textureY); // Box 651
		bodyModel[183] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 652
		bodyModel[184] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Box 653
		bodyModel[185] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 654
		bodyModel[186] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 655
		bodyModel[187] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 656
		bodyModel[188] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 657
		bodyModel[189] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 658
		bodyModel[190] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 659
		bodyModel[191] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 660
		bodyModel[192] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 661
		bodyModel[193] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 662
		bodyModel[194] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 663
		bodyModel[195] = new ModelRendererTurbo(this, 585, 201, textureX, textureY); // Box 664
		bodyModel[196] = new ModelRendererTurbo(this, 601, 201, textureX, textureY); // Box 665
		bodyModel[197] = new ModelRendererTurbo(this, 633, 201, textureX, textureY); // Box 666
		bodyModel[198] = new ModelRendererTurbo(this, 681, 201, textureX, textureY); // Box 667
		bodyModel[199] = new ModelRendererTurbo(this, 721, 201, textureX, textureY); // Box 668
		bodyModel[200] = new ModelRendererTurbo(this, 737, 201, textureX, textureY); // Box 669
		bodyModel[201] = new ModelRendererTurbo(this, 769, 201, textureX, textureY); // Box 670
		bodyModel[202] = new ModelRendererTurbo(this, 913, 201, textureX, textureY); // Box 671
		bodyModel[203] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 672
		bodyModel[204] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Box 673
		bodyModel[205] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 674
		bodyModel[206] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 675
		bodyModel[207] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 676
		bodyModel[208] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Box 677
		bodyModel[209] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 678
		bodyModel[210] = new ModelRendererTurbo(this, 721, 209, textureX, textureY); // Box 679
		bodyModel[211] = new ModelRendererTurbo(this, 1001, 209, textureX, textureY); // Box 680
		bodyModel[212] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 681
		bodyModel[213] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 682
		bodyModel[214] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 683
		bodyModel[215] = new ModelRendererTurbo(this, 521, 217, textureX, textureY); // Box 684
		bodyModel[216] = new ModelRendererTurbo(this, 569, 217, textureX, textureY); // Box 685
		bodyModel[217] = new ModelRendererTurbo(this, 585, 217, textureX, textureY); // Box 686
		bodyModel[218] = new ModelRendererTurbo(this, 633, 217, textureX, textureY); // Box 687
		bodyModel[219] = new ModelRendererTurbo(this, 649, 217, textureX, textureY); // Box 688
		bodyModel[220] = new ModelRendererTurbo(this, 769, 217, textureX, textureY); // Box 689
		bodyModel[221] = new ModelRendererTurbo(this, 785, 217, textureX, textureY); // Box 690
		bodyModel[222] = new ModelRendererTurbo(this, 817, 217, textureX, textureY); // Box 691
		bodyModel[223] = new ModelRendererTurbo(this, 833, 217, textureX, textureY); // Box 692
		bodyModel[224] = new ModelRendererTurbo(this, 865, 217, textureX, textureY); // Box 693
		bodyModel[225] = new ModelRendererTurbo(this, 881, 217, textureX, textureY); // Box 694
		bodyModel[226] = new ModelRendererTurbo(this, 913, 217, textureX, textureY); // Box 695
		bodyModel[227] = new ModelRendererTurbo(this, 929, 217, textureX, textureY); // Box 696
		bodyModel[228] = new ModelRendererTurbo(this, 953, 217, textureX, textureY); // Box 697
		bodyModel[229] = new ModelRendererTurbo(this, 969, 217, textureX, textureY); // Box 698
		bodyModel[230] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 699
		bodyModel[231] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 700
		bodyModel[232] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 701
		bodyModel[233] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 702
		bodyModel[234] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 703
		bodyModel[235] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 704
		bodyModel[236] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 705
		bodyModel[237] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 706
		bodyModel[238] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 707
		bodyModel[239] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 708
		bodyModel[240] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 709
		bodyModel[241] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 710
		bodyModel[242] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 711
		bodyModel[243] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 712
		bodyModel[244] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 713
		bodyModel[245] = new ModelRendererTurbo(this, 633, 137, textureX, textureY); // Box 714
		bodyModel[246] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 715
		bodyModel[247] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 716
		bodyModel[248] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 717
		bodyModel[249] = new ModelRendererTurbo(this, 865, 177, textureX, textureY); // Box 718
		bodyModel[250] = new ModelRendererTurbo(this, 649, 185, textureX, textureY); // Box 719
		bodyModel[251] = new ModelRendererTurbo(this, 929, 185, textureX, textureY); // Box 720
		bodyModel[252] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 721
		bodyModel[253] = new ModelRendererTurbo(this, 649, 193, textureX, textureY); // Box 722
		bodyModel[254] = new ModelRendererTurbo(this, 681, 193, textureX, textureY); // Box 723
		bodyModel[255] = new ModelRendererTurbo(this, 929, 193, textureX, textureY); // Box 724
		bodyModel[256] = new ModelRendererTurbo(this, 649, 201, textureX, textureY); // Box 725
		bodyModel[257] = new ModelRendererTurbo(this, 929, 201, textureX, textureY); // Box 726
		bodyModel[258] = new ModelRendererTurbo(this, 681, 217, textureX, textureY); // Box 727
		bodyModel[259] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 728
		bodyModel[260] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Box 729
		bodyModel[261] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 730
		bodyModel[262] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Box 731
		bodyModel[263] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 732
		bodyModel[264] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 733
		bodyModel[265] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 734
		bodyModel[266] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 735
		bodyModel[267] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 736
		bodyModel[268] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 737
		bodyModel[269] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 738
		bodyModel[270] = new ModelRendererTurbo(this, 521, 225, textureX, textureY); // Box 739
		bodyModel[271] = new ModelRendererTurbo(this, 569, 225, textureX, textureY); // Box 740
		bodyModel[272] = new ModelRendererTurbo(this, 585, 225, textureX, textureY); // Box 741
		bodyModel[273] = new ModelRendererTurbo(this, 633, 225, textureX, textureY); // Box 742
		bodyModel[274] = new ModelRendererTurbo(this, 649, 225, textureX, textureY); // Box 743
		bodyModel[275] = new ModelRendererTurbo(this, 681, 225, textureX, textureY); // Box 744
		bodyModel[276] = new ModelRendererTurbo(this, 697, 225, textureX, textureY); // Box 745
		bodyModel[277] = new ModelRendererTurbo(this, 713, 225, textureX, textureY); // Box 746
		bodyModel[278] = new ModelRendererTurbo(this, 729, 225, textureX, textureY); // Box 747
		bodyModel[279] = new ModelRendererTurbo(this, 769, 225, textureX, textureY); // Box 748
		bodyModel[280] = new ModelRendererTurbo(this, 785, 225, textureX, textureY); // Box 749
		bodyModel[281] = new ModelRendererTurbo(this, 817, 225, textureX, textureY); // Box 750
		bodyModel[282] = new ModelRendererTurbo(this, 833, 225, textureX, textureY); // Box 751
		bodyModel[283] = new ModelRendererTurbo(this, 865, 225, textureX, textureY); // Box 752
		bodyModel[284] = new ModelRendererTurbo(this, 881, 225, textureX, textureY); // Box 753
		bodyModel[285] = new ModelRendererTurbo(this, 913, 225, textureX, textureY); // Box 754
		bodyModel[286] = new ModelRendererTurbo(this, 969, 225, textureX, textureY); // Box 755
		bodyModel[287] = new ModelRendererTurbo(this, 985, 225, textureX, textureY); // Box 756
		bodyModel[288] = new ModelRendererTurbo(this, 1001, 225, textureX, textureY); // Box 757
		bodyModel[289] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 758
		bodyModel[290] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 759
		bodyModel[291] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 760
		bodyModel[292] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 761
		bodyModel[293] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Box 762
		bodyModel[294] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Box 763
		bodyModel[295] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Box 764
		bodyModel[296] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 765
		bodyModel[297] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Box 766
		bodyModel[298] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Box 767
		bodyModel[299] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Box 768
		bodyModel[300] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Box 769
		bodyModel[301] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 770
		bodyModel[302] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 771
		bodyModel[303] = new ModelRendererTurbo(this, 697, 233, textureX, textureY); // Box 772
		bodyModel[304] = new ModelRendererTurbo(this, 969, 233, textureX, textureY); // Box 773
		bodyModel[305] = new ModelRendererTurbo(this, 985, 233, textureX, textureY); // Box 774
		bodyModel[306] = new ModelRendererTurbo(this, 1001, 233, textureX, textureY); // Box 775
		bodyModel[307] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Box 776
		bodyModel[308] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Box 777
		bodyModel[309] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 778
		bodyModel[310] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Box 779
		bodyModel[311] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 780
		bodyModel[312] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box 781
		bodyModel[313] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 782
		bodyModel[314] = new ModelRendererTurbo(this, 521, 241, textureX, textureY); // Box 783
		bodyModel[315] = new ModelRendererTurbo(this, 537, 241, textureX, textureY); // Box 784

		bodyModel[0].addBox(0F, 0F, 0F, 63, 23, 45, 0F); // Box 0
		bodyModel[0].setRotationPoint(-31F, -18.5F, -22.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 31, 23, 45, 0F,0F, 0F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(32F, -18.5F, -22.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 33, 23, 45, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-64F, -18.5F, -22.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 21, 45, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -13F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -13F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-70.9F, -18.5F, -22.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 129, 1, 13, 0F); // Box 4
		bodyModel[4].setRotationPoint(-69F, -15F, -35.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 129, 1, 13, 0F); // Box 5
		bodyModel[5].setRotationPoint(-69F, -15F, 22.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-73F, -15F, -35.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-73F, -15F, 22.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[8].setRotationPoint(-63F, -18.6F, -20.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[9].setRotationPoint(-63F, -18.6F, 0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 4, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[10].setRotationPoint(-48F, -19F, -19.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[11].setRotationPoint(-70.5F, -17.8F, 6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[12].setRotationPoint(-70.5F, -17.8F, -9.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 101, 5, 12, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[13].setRotationPoint(-69F, -19.6F, 22.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 101, 5, 12, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[14].setRotationPoint(-69F, -19.6F, -34.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 24, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 3F, -0.6F, -0.3F, 3F, -0.6F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[15].setRotationPoint(36F, -15F, 21.95F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 24, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[16].setRotationPoint(5F, -18.6F, 26.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 22, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[17].setRotationPoint(-31F, -19F, 25.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 88
		bodyModel[18].setRotationPoint(5F, -18.8F, 26.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 89
		bodyModel[19].setRotationPoint(10F, -18.8F, 26.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 90
		bodyModel[20].setRotationPoint(18F, -18.8F, 26.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 91
		bodyModel[21].setRotationPoint(25F, -18.8F, 26.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 92
		bodyModel[22].setRotationPoint(-14F, -19.8F, 25.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 93
		bodyModel[23].setRotationPoint(-21F, -19.8F, 25.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 94
		bodyModel[24].setRotationPoint(-28F, -19.8F, 25.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[25].setRotationPoint(-68F, -19F, 25.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 96
		bodyModel[26].setRotationPoint(-57F, -19.8F, 25.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 97
		bodyModel[27].setRotationPoint(-66F, -19.8F, 25.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 98
		bodyModel[28].setRotationPoint(-62F, -19.8F, 25.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 99
		bodyModel[29].setRotationPoint(-53F, -19.8F, -34F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 100
		bodyModel[30].setRotationPoint(-35F, -19.8F, -34F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 101
		bodyModel[31].setRotationPoint(5F, -18.8F, -34F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 102
		bodyModel[32].setRotationPoint(30F, -18.3F, -34F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0.3F, -0.2F, -0.2F, -0.15F, -0.2F, -0.15F, -0.15F, -0.25F, -0.3F, 0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, -0.2F); // Box 106
		bodyModel[33].setRotationPoint(54.55F, -9.62F, -0.45F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F); // Box 111
		bodyModel[34].setRotationPoint(34.3F, -18.2F, -2.45F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F); // Box 112
		bodyModel[35].setRotationPoint(34.4F, -18F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[36].setRotationPoint(24.3F, -18.8F, -3.45F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[37].setRotationPoint(24.3F, -18.8F, -6.45F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 115
		bodyModel[38].setRotationPoint(24.3F, -18.8F, 4.55F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[39].setRotationPoint(60F, -15F, -35.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[40].setRotationPoint(65F, -14F, -35.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[41].setRotationPoint(65F, -14F, 22.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[42].setRotationPoint(60F, -15F, 22.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 0F, -0.5F, -2F, -1F, -0.5F, -2F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, -1.1F, -0.5F, 3F, -1.1F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[43].setRotationPoint(60F, -15F, 21.95F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 0F, -0.5F, -2F, -1F, -0.5F, -2F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, -1.1F, -0.5F, 3F, -1.1F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[44].setRotationPoint(60F, -15F, -23.45F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 24, 9, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 3F, -0.6F, -0.3F, 3F, -0.6F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[45].setRotationPoint(36F, -15F, -23.45F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 2, 71, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[46].setRotationPoint(-76.75F, -10.8F, -35F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 71, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[47].setRotationPoint(-76.75F, -7.8F, -35F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 71, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 127
		bodyModel[48].setRotationPoint(-76.75F, -8.8F, -35F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 128
		bodyModel[49].setRotationPoint(-76.75F, -5.8F, -20F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 129
		bodyModel[50].setRotationPoint(-76.75F, -5.8F, 20F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 130
		bodyModel[51].setRotationPoint(-76.75F, -5.8F, 0F);

		bodyModel[52].addBox(0F, 0F, 0F, 93, 10, 1, 0F); // Box 332
		bodyModel[52].setRotationPoint(-33F, -15F, -36.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 36, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F); // Box 333
		bodyModel[53].setRotationPoint(-69F, -15F, -36.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[54].setRotationPoint(60F, -15F, -36.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 335
		bodyModel[55].setRotationPoint(65F, -14F, -36.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 36, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F); // Box 336
		bodyModel[56].setRotationPoint(-69F, -15F, 35.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 93, 10, 1, 0F); // Box 337
		bodyModel[57].setRotationPoint(-33F, -15F, 35.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[58].setRotationPoint(60F, -15F, 35.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 339
		bodyModel[59].setRotationPoint(65F, -14F, 35.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 340
		bodyModel[60].setRotationPoint(-51F, -19F, 34F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[61].setRotationPoint(-49.5F, -17.5F, 34F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F); // Box 342
		bodyModel[62].setRotationPoint(-50.5F, -17.5F, 34F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[63].setRotationPoint(-36.5F, -17.5F, 34F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 121
		bodyModel[64].setRotationPoint(53.3F, -13.4F, 17.15F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 122
		bodyModel[65].setRotationPoint(53.3F, -14.4F, 17.15F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 123
		bodyModel[66].setRotationPoint(53.3F, -12.4F, 17.15F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 126
		bodyModel[67].setRotationPoint(52.4F, -12.9F, 16.1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 352
		bodyModel[68].setRotationPoint(52.5F, -12.9F, -18.9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 353
		bodyModel[69].setRotationPoint(53F, -12.4F, -17.85F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 354
		bodyModel[70].setRotationPoint(53F, -13.4F, -17.85F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 355
		bodyModel[71].setRotationPoint(53F, -14.4F, -17.85F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 595
		bodyModel[72].setRotationPoint(52F, -10F, -18.85F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 596
		bodyModel[73].setRotationPoint(52.3F, -10F, 16.15F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 597
		bodyModel[74].setRotationPoint(52.4F, -12.9F, 18.1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 598
		bodyModel[75].setRotationPoint(52.5F, -12.9F, -16.9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 599
		bodyModel[76].setRotationPoint(58.2F, -7.2F, -12.85F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 600
		bodyModel[77].setRotationPoint(58.2F, -7.2F, 13.15F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 405
		bodyModel[78].setRotationPoint(50.6F, -8F, 36.9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 409
		bodyModel[79].setRotationPoint(51.4F, -10.9F, 36.9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 410
		bodyModel[80].setRotationPoint(51.4F, -13.8F, 36.9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 518
		bodyModel[81].setRotationPoint(46.4F, -13.7F, 36.9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 519
		bodyModel[82].setRotationPoint(46.4F, -8F, 36.9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 520
		bodyModel[83].setRotationPoint(46.4F, -10.8F, 36.9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 527
		bodyModel[84].setRotationPoint(42.2F, -8F, 36.9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 528
		bodyModel[85].setRotationPoint(42F, -10.8F, 36.9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 529
		bodyModel[86].setRotationPoint(42F, -13.7F, 36.9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 530
		bodyModel[87].setRotationPoint(37.9F, -8F, 36.9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 531
		bodyModel[88].setRotationPoint(37F, -10.8F, 36.9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 532
		bodyModel[89].setRotationPoint(37F, -13.7F, 36.9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 551
		bodyModel[90].setRotationPoint(17.9F, -8F, 36.9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 552
		bodyModel[91].setRotationPoint(22.2F, -8F, 36.9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 553
		bodyModel[92].setRotationPoint(26.4F, -8F, 36.9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 554
		bodyModel[93].setRotationPoint(30.6F, -8F, 36.9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 555
		bodyModel[94].setRotationPoint(31.4F, -10.9F, 36.9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 556
		bodyModel[95].setRotationPoint(31.4F, -13.8F, 36.9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 557
		bodyModel[96].setRotationPoint(26.4F, -10.8F, 36.9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 558
		bodyModel[97].setRotationPoint(26.4F, -13.7F, 36.9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 559
		bodyModel[98].setRotationPoint(22F, -13.7F, 36.9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 560
		bodyModel[99].setRotationPoint(22F, -10.8F, 36.9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 561
		bodyModel[100].setRotationPoint(17F, -10.8F, 36.9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 562
		bodyModel[101].setRotationPoint(17F, -13.7F, 36.9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 563
		bodyModel[102].setRotationPoint(-2.1F, -8F, 36.9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 564
		bodyModel[103].setRotationPoint(2.2F, -8F, 36.9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 565
		bodyModel[104].setRotationPoint(6.4F, -8F, 36.9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 566
		bodyModel[105].setRotationPoint(10.6F, -8F, 36.9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 567
		bodyModel[106].setRotationPoint(11.4F, -10.9F, 36.9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 568
		bodyModel[107].setRotationPoint(11.4F, -13.8F, 36.9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 569
		bodyModel[108].setRotationPoint(6.4F, -10.8F, 36.9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 570
		bodyModel[109].setRotationPoint(6.4F, -13.7F, 36.9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 571
		bodyModel[110].setRotationPoint(2F, -13.7F, 36.9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 572
		bodyModel[111].setRotationPoint(2F, -10.8F, 36.9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 573
		bodyModel[112].setRotationPoint(-3F, -10.8F, 36.9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 574
		bodyModel[113].setRotationPoint(-3F, -13.7F, 36.9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 576
		bodyModel[114].setRotationPoint(-17.8F, -8F, 36.9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 577
		bodyModel[115].setRotationPoint(-13.6F, -8F, 36.9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 578
		bodyModel[116].setRotationPoint(-9.4F, -8F, 36.9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 579
		bodyModel[117].setRotationPoint(-8.6F, -10.9F, 36.9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 580
		bodyModel[118].setRotationPoint(-8.6F, -13.8F, 36.9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 581
		bodyModel[119].setRotationPoint(-13.6F, -10.8F, 36.9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 582
		bodyModel[120].setRotationPoint(-13.6F, -13.7F, 36.9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 583
		bodyModel[121].setRotationPoint(-18F, -13.7F, 36.9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 584
		bodyModel[122].setRotationPoint(-18F, -10.8F, 36.9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 588
		bodyModel[123].setRotationPoint(-31.8F, -8F, 36.9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 589
		bodyModel[124].setRotationPoint(-27.6F, -8F, 36.9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 590
		bodyModel[125].setRotationPoint(-22.6F, -8F, 36.9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 591
		bodyModel[126].setRotationPoint(-22.6F, -10.9F, 36.9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 592
		bodyModel[127].setRotationPoint(-22.6F, -13.8F, 36.9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 593
		bodyModel[128].setRotationPoint(-27.6F, -10.8F, 36.9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 594
		bodyModel[129].setRotationPoint(-27.6F, -13.7F, 36.9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 595
		bodyModel[130].setRotationPoint(-32F, -13.7F, 36.9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 596
		bodyModel[131].setRotationPoint(-32F, -10.8F, 36.9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 600
		bodyModel[132].setRotationPoint(42.4F, -16.6F, 36.9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 601
		bodyModel[133].setRotationPoint(37.4F, -16.6F, 36.9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 602
		bodyModel[134].setRotationPoint(31.4F, -16.6F, 36.9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 603
		bodyModel[135].setRotationPoint(26.4F, -16.6F, 36.9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 604
		bodyModel[136].setRotationPoint(21.9F, -16.6F, 36.9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 605
		bodyModel[137].setRotationPoint(16.9F, -16.6F, 36.9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 606
		bodyModel[138].setRotationPoint(-3.1F, -16.6F, 36.9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 607
		bodyModel[139].setRotationPoint(1.9F, -16.6F, 36.9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 608
		bodyModel[140].setRotationPoint(6.4F, -16.6F, 36.9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 609
		bodyModel[141].setRotationPoint(11.4F, -16.6F, 36.9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 611
		bodyModel[142].setRotationPoint(-18.1F, -16.6F, 36.9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 612
		bodyModel[143].setRotationPoint(-13.6F, -16.6F, 36.9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 613
		bodyModel[144].setRotationPoint(-8.6F, -16.6F, 36.9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 614
		bodyModel[145].setRotationPoint(26.4F, -18.6F, 34.9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 615
		bodyModel[146].setRotationPoint(21.9F, -18.6F, 34.9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 616
		bodyModel[147].setRotationPoint(16.9F, -18.6F, 34.9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 617
		bodyModel[148].setRotationPoint(11.4F, -18.6F, 34.9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 618
		bodyModel[149].setRotationPoint(6.4F, -18.6F, 34.9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 619
		bodyModel[150].setRotationPoint(1.9F, -18.6F, 34.9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 620
		bodyModel[151].setRotationPoint(-12.1F, -18.6F, 34.9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 621
		bodyModel[152].setRotationPoint(-7.6F, -18.6F, 34.9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 622
		bodyModel[153].setRotationPoint(-2.6F, -18.6F, 34.9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 623
		bodyModel[154].setRotationPoint(50.6F, -8F, -37.8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 624
		bodyModel[155].setRotationPoint(51.4F, -10.9F, -37.8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 625
		bodyModel[156].setRotationPoint(51.4F, -13.8F, -37.8F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 626
		bodyModel[157].setRotationPoint(46.4F, -13.7F, -37.8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 627
		bodyModel[158].setRotationPoint(46.4F, -10.8F, -37.8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 628
		bodyModel[159].setRotationPoint(46.4F, -8F, -37.8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 629
		bodyModel[160].setRotationPoint(42.2F, -8F, -37.8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 630
		bodyModel[161].setRotationPoint(37.9F, -8F, -37.8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 631
		bodyModel[162].setRotationPoint(37F, -10.8F, -37.8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 632
		bodyModel[163].setRotationPoint(37F, -13.7F, -37.8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 633
		bodyModel[164].setRotationPoint(37.4F, -16.6F, -37.8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 634
		bodyModel[165].setRotationPoint(42.4F, -16.6F, -37.8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 635
		bodyModel[166].setRotationPoint(42F, -13.7F, -37.8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 636
		bodyModel[167].setRotationPoint(42F, -10.8F, -37.8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 637
		bodyModel[168].setRotationPoint(30.6F, -8F, -37.8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 638
		bodyModel[169].setRotationPoint(26.4F, -8F, -37.8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 639
		bodyModel[170].setRotationPoint(22.2F, -8F, -37.8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 640
		bodyModel[171].setRotationPoint(17.9F, -8F, -37.8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 641
		bodyModel[172].setRotationPoint(17F, -10.8F, -37.8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 642
		bodyModel[173].setRotationPoint(22F, -10.8F, -37.8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 643
		bodyModel[174].setRotationPoint(26.4F, -10.8F, -37.8F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 644
		bodyModel[175].setRotationPoint(31.4F, -10.9F, -37.8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 645
		bodyModel[176].setRotationPoint(31.4F, -13.8F, -37.8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 646
		bodyModel[177].setRotationPoint(31.4F, -16.6F, -37.8F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 647
		bodyModel[178].setRotationPoint(26.4F, -13.7F, -37.8F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 648
		bodyModel[179].setRotationPoint(22F, -13.7F, -37.8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 649
		bodyModel[180].setRotationPoint(17F, -13.7F, -37.8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 650
		bodyModel[181].setRotationPoint(16.9F, -16.6F, -37.8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 651
		bodyModel[182].setRotationPoint(21.9F, -16.6F, -37.8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 652
		bodyModel[183].setRotationPoint(26.4F, -16.6F, -37.8F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 653
		bodyModel[184].setRotationPoint(-2.1F, -8F, -37.8F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 654
		bodyModel[185].setRotationPoint(2.2F, -8F, -37.8F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 655
		bodyModel[186].setRotationPoint(6.4F, -8F, -37.8F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 656
		bodyModel[187].setRotationPoint(10.6F, -8F, -37.8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 657
		bodyModel[188].setRotationPoint(11.4F, -10.9F, -37.8F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 658
		bodyModel[189].setRotationPoint(11.4F, -13.8F, -37.8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 659
		bodyModel[190].setRotationPoint(11.4F, -16.6F, -37.8F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 660
		bodyModel[191].setRotationPoint(6.4F, -10.8F, -37.8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 661
		bodyModel[192].setRotationPoint(6.4F, -13.7F, -37.8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 662
		bodyModel[193].setRotationPoint(6.4F, -16.6F, -37.8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 663
		bodyModel[194].setRotationPoint(2F, -10.8F, -37.8F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 664
		bodyModel[195].setRotationPoint(2F, -13.7F, -37.8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 665
		bodyModel[196].setRotationPoint(1.9F, -16.6F, -37.8F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 666
		bodyModel[197].setRotationPoint(-3F, -10.8F, -37.8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 667
		bodyModel[198].setRotationPoint(-3F, -13.7F, -37.8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 668
		bodyModel[199].setRotationPoint(-3.1F, -16.6F, -37.8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 669
		bodyModel[200].setRotationPoint(-17.8F, -8F, -37.8F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 670
		bodyModel[201].setRotationPoint(-13.6F, -8F, -37.8F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 671
		bodyModel[202].setRotationPoint(-9.4F, -8F, -37.8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 672
		bodyModel[203].setRotationPoint(-8.6F, -10.9F, -37.8F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 673
		bodyModel[204].setRotationPoint(-8.6F, -13.8F, -37.8F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 674
		bodyModel[205].setRotationPoint(-8.6F, -16.6F, -37.8F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 675
		bodyModel[206].setRotationPoint(-13.6F, -10.8F, -37.8F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 676
		bodyModel[207].setRotationPoint(-13.6F, -13.7F, -37.8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 677
		bodyModel[208].setRotationPoint(-13.6F, -16.6F, -37.8F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 678
		bodyModel[209].setRotationPoint(-18F, -10.8F, -37.8F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 679
		bodyModel[210].setRotationPoint(-18F, -13.7F, -37.8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 680
		bodyModel[211].setRotationPoint(-18.1F, -16.6F, -37.8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 681
		bodyModel[212].setRotationPoint(-31.8F, -8F, -37.8F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 682
		bodyModel[213].setRotationPoint(-27.6F, -8F, -37.8F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 683
		bodyModel[214].setRotationPoint(-22.6F, -8F, -37.8F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 684
		bodyModel[215].setRotationPoint(-22.6F, -10.9F, -37.8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 685
		bodyModel[216].setRotationPoint(-22.6F, -13.8F, -37.8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 686
		bodyModel[217].setRotationPoint(-27.6F, -13.7F, -37.8F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 687
		bodyModel[218].setRotationPoint(-27.6F, -10.8F, -37.8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 688
		bodyModel[219].setRotationPoint(-32F, -10.8F, -37.8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 689
		bodyModel[220].setRotationPoint(-32F, -13.7F, -37.8F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 690
		bodyModel[221].setRotationPoint(-12.1F, -18.6F, -35.8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 691
		bodyModel[222].setRotationPoint(-7.6F, -18.6F, -35.8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 692
		bodyModel[223].setRotationPoint(-2.6F, -18.6F, -35.8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 693
		bodyModel[224].setRotationPoint(1.9F, -18.6F, -35.8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 694
		bodyModel[225].setRotationPoint(6.4F, -18.6F, -35.8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 695
		bodyModel[226].setRotationPoint(11.4F, -18.6F, -35.8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 696
		bodyModel[227].setRotationPoint(16.9F, -18.6F, -35.8F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 697
		bodyModel[228].setRotationPoint(21.9F, -18.6F, -35.8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 698
		bodyModel[229].setRotationPoint(26.4F, -18.6F, -35.8F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 699
		bodyModel[230].setRotationPoint(62.8F, -5.6F, 8.9F);
		bodyModel[230].rotateAngleZ = -1.20427718F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 700
		bodyModel[231].setRotationPoint(62.8F, -5.6F, 5.5F);
		bodyModel[231].rotateAngleZ = -1.20427718F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 701
		bodyModel[232].setRotationPoint(62.8F, -5.6F, 2F);
		bodyModel[232].rotateAngleZ = -1.20427718F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 702
		bodyModel[233].setRotationPoint(62.8F, -5.6F, -1.3F);
		bodyModel[233].rotateAngleZ = -1.20427718F;

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 703
		bodyModel[234].setRotationPoint(62.8F, -5.6F, -4.6F);
		bodyModel[234].rotateAngleZ = -1.20427718F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 704
		bodyModel[235].setRotationPoint(62.8F, -5.6F, -7.9F);
		bodyModel[235].rotateAngleZ = -1.20427718F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 705
		bodyModel[236].setRotationPoint(62.8F, -5.6F, -11.3F);
		bodyModel[236].rotateAngleZ = -1.20427718F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 706
		bodyModel[237].setRotationPoint(55.6F, -9F, -11.3F);
		bodyModel[237].rotateAngleZ = 1.20427718F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 707
		bodyModel[238].setRotationPoint(55.6F, -9F, 8.9F);
		bodyModel[238].rotateAngleZ = 1.20427718F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 708
		bodyModel[239].setRotationPoint(55.6F, -9F, 5.5F);
		bodyModel[239].rotateAngleZ = 1.20427718F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 709
		bodyModel[240].setRotationPoint(55.6F, -9F, 2F);
		bodyModel[240].rotateAngleZ = 1.20427718F;

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 710
		bodyModel[241].setRotationPoint(55.6F, -9F, -1.3F);
		bodyModel[241].rotateAngleZ = 1.20427718F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 711
		bodyModel[242].setRotationPoint(55.6F, -9F, -4.6F);
		bodyModel[242].rotateAngleZ = 1.20427718F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 712
		bodyModel[243].setRotationPoint(55.6F, -9F, -7.9F);
		bodyModel[243].rotateAngleZ = 1.20427718F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 713
		bodyModel[244].setRotationPoint(51.6F, -10.4F, -11.3F);
		bodyModel[244].rotateAngleZ = 1.20427718F;

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 714
		bodyModel[245].setRotationPoint(51.6F, -10.4F, 8.9F);
		bodyModel[245].rotateAngleZ = 1.20427718F;

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 715
		bodyModel[246].setRotationPoint(51.6F, -10.4F, 5.5F);
		bodyModel[246].rotateAngleZ = 1.20427718F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 716
		bodyModel[247].setRotationPoint(51.6F, -10.4F, 2F);
		bodyModel[247].rotateAngleZ = 1.20427718F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 717
		bodyModel[248].setRotationPoint(51.6F, -10.4F, -1.3F);
		bodyModel[248].rotateAngleZ = 1.20427718F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 718
		bodyModel[249].setRotationPoint(51.6F, -10.4F, -4.6F);
		bodyModel[249].rotateAngleZ = 1.20427718F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 719
		bodyModel[250].setRotationPoint(51.6F, -10.4F, -7.9F);
		bodyModel[250].rotateAngleZ = 1.20427718F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 720
		bodyModel[251].setRotationPoint(47.6F, -12F, -11.3F);
		bodyModel[251].rotateAngleZ = 1.20427718F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 721
		bodyModel[252].setRotationPoint(47.6F, -12F, 8.9F);
		bodyModel[252].rotateAngleZ = 1.20427718F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 722
		bodyModel[253].setRotationPoint(47.6F, -12F, 5.5F);
		bodyModel[253].rotateAngleZ = 1.20427718F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 723
		bodyModel[254].setRotationPoint(47.6F, -12F, 2F);
		bodyModel[254].rotateAngleZ = 1.20427718F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 724
		bodyModel[255].setRotationPoint(47.6F, -12F, -1.3F);
		bodyModel[255].rotateAngleZ = 1.20427718F;

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 725
		bodyModel[256].setRotationPoint(47.6F, -12F, -4.6F);
		bodyModel[256].rotateAngleZ = 1.20427718F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 726
		bodyModel[257].setRotationPoint(47.6F, -12F, -7.9F);
		bodyModel[257].rotateAngleZ = 1.20427718F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 727
		bodyModel[258].setRotationPoint(43.6F, -13.6F, -11.3F);
		bodyModel[258].rotateAngleZ = 1.20427718F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 728
		bodyModel[259].setRotationPoint(43.6F, -13.6F, 8.9F);
		bodyModel[259].rotateAngleZ = 1.20427718F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 729
		bodyModel[260].setRotationPoint(43.6F, -13.6F, 5.5F);
		bodyModel[260].rotateAngleZ = 1.20427718F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 730
		bodyModel[261].setRotationPoint(43.6F, -13.6F, 2F);
		bodyModel[261].rotateAngleZ = 1.20427718F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 731
		bodyModel[262].setRotationPoint(43.6F, -13.6F, -1.3F);
		bodyModel[262].rotateAngleZ = 1.20427718F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 732
		bodyModel[263].setRotationPoint(43.6F, -13.6F, -4.6F);
		bodyModel[263].rotateAngleZ = 1.20427718F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 733
		bodyModel[264].setRotationPoint(43.6F, -13.6F, -7.9F);
		bodyModel[264].rotateAngleZ = 1.20427718F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 734
		bodyModel[265].setRotationPoint(47.6F, -12F, 19.2F);
		bodyModel[265].rotateAngleZ = 1.20427718F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 735
		bodyModel[266].setRotationPoint(47.6F, -12F, 15.8F);
		bodyModel[266].rotateAngleZ = 1.20427718F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 736
		bodyModel[267].setRotationPoint(47.6F, -12F, 12.3F);
		bodyModel[267].rotateAngleZ = 1.20427718F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 737
		bodyModel[268].setRotationPoint(43.6F, -13.6F, 12.3F);
		bodyModel[268].rotateAngleZ = 1.20427718F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 738
		bodyModel[269].setRotationPoint(43.6F, -13.6F, 15.8F);
		bodyModel[269].rotateAngleZ = 1.20427718F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 739
		bodyModel[270].setRotationPoint(43.6F, -13.6F, 19.2F);
		bodyModel[270].rotateAngleZ = 1.20427718F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 740
		bodyModel[271].setRotationPoint(47.6F, -12F, -15F);
		bodyModel[271].rotateAngleZ = 1.20427718F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 741
		bodyModel[272].setRotationPoint(47.6F, -12F, -18.4F);
		bodyModel[272].rotateAngleZ = 1.20427718F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 742
		bodyModel[273].setRotationPoint(47.6F, -12F, -21.9F);
		bodyModel[273].rotateAngleZ = 1.20427718F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 743
		bodyModel[274].setRotationPoint(43.6F, -13.6F, -21.9F);
		bodyModel[274].rotateAngleZ = 1.20427718F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 744
		bodyModel[275].setRotationPoint(43.6F, -13.6F, -18.4F);
		bodyModel[275].rotateAngleZ = 1.20427718F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 745
		bodyModel[276].setRotationPoint(43.6F, -13.6F, -15F);
		bodyModel[276].rotateAngleZ = 1.20427718F;

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 746
		bodyModel[277].setRotationPoint(35.6F, -16.6F, 19.2F);
		bodyModel[277].rotateAngleZ = 1.20427718F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 747
		bodyModel[278].setRotationPoint(39.6F, -15F, 19.2F);
		bodyModel[278].rotateAngleZ = 1.20427718F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 748
		bodyModel[279].setRotationPoint(39.6F, -15F, 15.8F);
		bodyModel[279].rotateAngleZ = 1.20427718F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 749
		bodyModel[280].setRotationPoint(35.6F, -16.6F, 15.8F);
		bodyModel[280].rotateAngleZ = 1.20427718F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 750
		bodyModel[281].setRotationPoint(35.6F, -16.6F, 12.3F);
		bodyModel[281].rotateAngleZ = 1.20427718F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 751
		bodyModel[282].setRotationPoint(39.6F, -15F, 12.3F);
		bodyModel[282].rotateAngleZ = 1.20427718F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 752
		bodyModel[283].setRotationPoint(39.6F, -15F, 8.9F);
		bodyModel[283].rotateAngleZ = 1.20427718F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 753
		bodyModel[284].setRotationPoint(35.6F, -16.6F, 8.9F);
		bodyModel[284].rotateAngleZ = 1.20427718F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 754
		bodyModel[285].setRotationPoint(35.6F, -16.6F, 5.5F);
		bodyModel[285].rotateAngleZ = 1.20427718F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 755
		bodyModel[286].setRotationPoint(39.6F, -15F, 5.5F);
		bodyModel[286].rotateAngleZ = 1.20427718F;

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 756
		bodyModel[287].setRotationPoint(35.6F, -16.6F, -21.9F);
		bodyModel[287].rotateAngleZ = 1.20427718F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 757
		bodyModel[288].setRotationPoint(39.6F, -15F, -21.9F);
		bodyModel[288].rotateAngleZ = 1.20427718F;

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 758
		bodyModel[289].setRotationPoint(39.6F, -15F, -18.4F);
		bodyModel[289].rotateAngleZ = 1.20427718F;

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 759
		bodyModel[290].setRotationPoint(35.6F, -16.6F, -18.4F);
		bodyModel[290].rotateAngleZ = 1.20427718F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 760
		bodyModel[291].setRotationPoint(35.6F, -16.6F, -15F);
		bodyModel[291].rotateAngleZ = 1.20427718F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 761
		bodyModel[292].setRotationPoint(39.6F, -15F, -15F);
		bodyModel[292].rotateAngleZ = 1.20427718F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 762
		bodyModel[293].setRotationPoint(35.6F, -16.6F, -11.3F);
		bodyModel[293].rotateAngleZ = 1.20427718F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 763
		bodyModel[294].setRotationPoint(39.6F, -15F, -11.3F);
		bodyModel[294].rotateAngleZ = 1.20427718F;

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 764
		bodyModel[295].setRotationPoint(35.6F, -16.6F, -7.9F);
		bodyModel[295].rotateAngleZ = 1.20427718F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 765
		bodyModel[296].setRotationPoint(39.6F, -15F, -7.9F);
		bodyModel[296].rotateAngleZ = 1.20427718F;

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 766
		bodyModel[297].setRotationPoint(51.6F, -10.4F, 12.1F);
		bodyModel[297].rotateAngleZ = 1.20427718F;

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 767
		bodyModel[298].setRotationPoint(51.6F, -10.4F, -14.6F);
		bodyModel[298].rotateAngleZ = 1.20427718F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 768
		bodyModel[299].setRotationPoint(39.6F, -15F, -4.5F);
		bodyModel[299].rotateAngleZ = 1.20427718F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 769
		bodyModel[300].setRotationPoint(39.6F, -15F, -1.1F);
		bodyModel[300].rotateAngleZ = 1.20427718F;

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 770
		bodyModel[301].setRotationPoint(39.6F, -15F, 2.3F);
		bodyModel[301].rotateAngleZ = 1.20427718F;

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 771
		bodyModel[302].setRotationPoint(31.6F, -18.2F, -18.4F);
		bodyModel[302].rotateAngleZ = 1.20427718F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 772
		bodyModel[303].setRotationPoint(31.6F, -18.2F, -21.9F);
		bodyModel[303].rotateAngleZ = 1.20427718F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 773
		bodyModel[304].setRotationPoint(31.6F, -18.2F, -15F);
		bodyModel[304].rotateAngleZ = 1.20427718F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 774
		bodyModel[305].setRotationPoint(31.6F, -18.2F, -11.3F);
		bodyModel[305].rotateAngleZ = 1.20427718F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 775
		bodyModel[306].setRotationPoint(31.6F, -18.2F, 12.2F);
		bodyModel[306].rotateAngleZ = 1.20427718F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 776
		bodyModel[307].setRotationPoint(31.6F, -18.2F, 8.7F);
		bodyModel[307].rotateAngleZ = 1.20427718F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 777
		bodyModel[308].setRotationPoint(31.6F, -18.2F, 15.6F);
		bodyModel[308].rotateAngleZ = 1.20427718F;

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 778
		bodyModel[309].setRotationPoint(31.6F, -18.2F, 19.3F);
		bodyModel[309].rotateAngleZ = 1.20427718F;

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 779
		bodyModel[310].setRotationPoint(62.8F, -5.6F, 15.6F);
		bodyModel[310].rotateAngleZ = -1.20427718F;

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 780
		bodyModel[311].setRotationPoint(62.8F, -5.6F, 12.1F);
		bodyModel[311].rotateAngleZ = -1.20427718F;

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 781
		bodyModel[312].setRotationPoint(62.8F, -5.6F, 19F);
		bodyModel[312].rotateAngleZ = -1.20427718F;

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 782
		bodyModel[313].setRotationPoint(62.8F, -5.6F, -18.4F);
		bodyModel[313].rotateAngleZ = -1.20427718F;

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 783
		bodyModel[314].setRotationPoint(62.8F, -5.6F, -21.9F);
		bodyModel[314].rotateAngleZ = -1.20427718F;

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 784
		bodyModel[315].setRotationPoint(62.8F, -5.6F, -15F);
		bodyModel[315].rotateAngleZ = -1.20427718F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 132
		turretModel[1] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 133
		turretModel[2] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 134
		turretModel[3] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 135
		turretModel[4] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 136
		turretModel[5] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 137
		turretModel[6] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Box 138
		turretModel[7] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 139
		turretModel[8] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 140
		turretModel[9] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 141
		turretModel[10] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 142
		turretModel[11] = new ModelRendererTurbo(this, 833, 129, textureX, textureY); // Box 143
		turretModel[12] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 144
		turretModel[13] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 145
		turretModel[14] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 146
		turretModel[15] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Box 147
		turretModel[16] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 148
		turretModel[17] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 149
		turretModel[18] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Box 150
		turretModel[19] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 151
		turretModel[20] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 152
		turretModel[21] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 154
		turretModel[22] = new ModelRendererTurbo(this, 913, 129, textureX, textureY); // Box 155
		turretModel[23] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 156
		turretModel[24] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 157
		turretModel[25] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Box 158
		turretModel[26] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 159
		turretModel[27] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 160
		turretModel[28] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 161
		turretModel[29] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 162
		turretModel[30] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 163
		turretModel[31] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 164
		turretModel[32] = new ModelRendererTurbo(this, 585, 185, textureX, textureY); // Box 165
		turretModel[33] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Box 166
		turretModel[34] = new ModelRendererTurbo(this, 633, 185, textureX, textureY); // Box 167
		turretModel[35] = new ModelRendererTurbo(this, 913, 185, textureX, textureY); // Box 168
		turretModel[36] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 169
		turretModel[37] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 170
		turretModel[38] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 171
		turretModel[39] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 172
		turretModel[40] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Box 173
		turretModel[41] = new ModelRendererTurbo(this, 961, 185, textureX, textureY); // Box 174
		turretModel[42] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 176
		turretModel[43] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 177
		turretModel[44] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 178
		turretModel[45] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 181
		turretModel[46] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 182
		turretModel[47] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 186
		turretModel[48] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 189
		turretModel[49] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 190
		turretModel[50] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 177
		turretModel[51] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 178
		turretModel[52] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 179
		turretModel[53] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 180
		turretModel[54] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 181
		turretModel[55] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 183
		turretModel[56] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 184
		turretModel[57] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 185
		turretModel[58] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 186
		turretModel[59] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 188
		turretModel[60] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 189
		turretModel[61] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 192
		turretModel[62] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 193
		turretModel[63] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 194
		turretModel[64] = new ModelRendererTurbo(this, 713, 137, textureX, textureY); // Box 195
		turretModel[65] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 197
		turretModel[66] = new ModelRendererTurbo(this, 513, 185, textureX, textureY); // Box 198
		turretModel[67] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 199
		turretModel[68] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 200
		turretModel[69] = new ModelRendererTurbo(this, 689, 201, textureX, textureY); // Box 201
		turretModel[70] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 202
		turretModel[71] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 203
		turretModel[72] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 204
		turretModel[73] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 205
		turretModel[74] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 206
		turretModel[75] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Box 207
		turretModel[76] = new ModelRendererTurbo(this, 769, 153, textureX, textureY); // Box 208
		turretModel[77] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 209
		turretModel[78] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 210
		turretModel[79] = new ModelRendererTurbo(this, 561, 161, textureX, textureY); // Box 212
		turretModel[80] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 213
		turretModel[81] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 214
		turretModel[82] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 215
		turretModel[83] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 216
		turretModel[84] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 217
		turretModel[85] = new ModelRendererTurbo(this, 737, 201, textureX, textureY); // Box 218
		turretModel[86] = new ModelRendererTurbo(this, 769, 177, textureX, textureY); // Box 219
		turretModel[87] = new ModelRendererTurbo(this, 777, 201, textureX, textureY); // Box 221
		turretModel[88] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 222
		turretModel[89] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 223
		turretModel[90] = new ModelRendererTurbo(this, 521, 217, textureX, textureY); // Box 224
		turretModel[91] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 225
		turretModel[92] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 226
		turretModel[93] = new ModelRendererTurbo(this, 969, 209, textureX, textureY); // Box 227
		turretModel[94] = new ModelRendererTurbo(this, 585, 217, textureX, textureY); // Box 229
		turretModel[95] = new ModelRendererTurbo(this, 721, 217, textureX, textureY); // Box 230
		turretModel[96] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 231
		turretModel[97] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Box 232
		turretModel[98] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 233
		turretModel[99] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Box 234
		turretModel[100] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 235
		turretModel[101] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 236
		turretModel[102] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 237
		turretModel[103] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 238
		turretModel[104] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 239
		turretModel[105] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Box 243
		turretModel[106] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 244
		turretModel[107] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 245
		turretModel[108] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 246
		turretModel[109] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 247
		turretModel[110] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 248
		turretModel[111] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 249
		turretModel[112] = new ModelRendererTurbo(this, 649, 217, textureX, textureY); // Box 250
		turretModel[113] = new ModelRendererTurbo(this, 785, 217, textureX, textureY); // Box 254
		turretModel[114] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 255
		turretModel[115] = new ModelRendererTurbo(this, 833, 217, textureX, textureY); // Box 256
		turretModel[116] = new ModelRendererTurbo(this, 881, 217, textureX, textureY); // Box 257
		turretModel[117] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 258
		turretModel[118] = new ModelRendererTurbo(this, 929, 217, textureX, textureY); // Box 259
		turretModel[119] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 260
		turretModel[120] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 261
		turretModel[121] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 262
		turretModel[122] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 263
		turretModel[123] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 264
		turretModel[124] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 265
		turretModel[125] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 266
		turretModel[126] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 267
		turretModel[127] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 268
		turretModel[128] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 269
		turretModel[129] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 270
		turretModel[130] = new ModelRendererTurbo(this, 913, 145, textureX, textureY); // Box 271
		turretModel[131] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Box 272
		turretModel[132] = new ModelRendererTurbo(this, 833, 153, textureX, textureY); // Box 273
		turretModel[133] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 274
		turretModel[134] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 275
		turretModel[135] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 276
		turretModel[136] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 277
		turretModel[137] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 278
		turretModel[138] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 279
		turretModel[139] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 280
		turretModel[140] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 281
		turretModel[141] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 282
		turretModel[142] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 283
		turretModel[143] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 284
		turretModel[144] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 285
		turretModel[145] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 288
		turretModel[146] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 289
		turretModel[147] = new ModelRendererTurbo(this, 577, 89, textureX, textureY); // Box 290
		turretModel[148] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Box 291
		turretModel[149] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 292
		turretModel[150] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 293
		turretModel[151] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Box 294
		turretModel[152] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 295
		turretModel[153] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Box 296
		turretModel[154] = new ModelRendererTurbo(this, 809, 97, textureX, textureY); // Box 297
		turretModel[155] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 298
		turretModel[156] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 299
		turretModel[157] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 300
		turretModel[158] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 301
		turretModel[159] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 302
		turretModel[160] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 303
		turretModel[161] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 304
		turretModel[162] = new ModelRendererTurbo(this, 833, 129, textureX, textureY); // Box 305
		turretModel[163] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 306
		turretModel[164] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 307
		turretModel[165] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 308
		turretModel[166] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 309
		turretModel[167] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 311
		turretModel[168] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 312
		turretModel[169] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 313
		turretModel[170] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 314
		turretModel[171] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 368
		turretModel[172] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 378
		turretModel[173] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 379
		turretModel[174] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 380
		turretModel[175] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 381
		turretModel[176] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 382
		turretModel[177] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 593
		turretModel[178] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 594
		turretModel[179] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 785
		turretModel[180] = new ModelRendererTurbo(this, 1001, 241, textureX, textureY); // Box 790
		turretModel[181] = new ModelRendererTurbo(this, 953, 249, textureX, textureY); // Box 791
		turretModel[182] = new ModelRendererTurbo(this, 969, 249, textureX, textureY); // Box 792
		turretModel[183] = new ModelRendererTurbo(this, 993, 249, textureX, textureY); // Box 793
		turretModel[184] = new ModelRendererTurbo(this, 1009, 249, textureX, textureY); // Box 794
		turretModel[185] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Box 795
		turretModel[186] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Box 796
		turretModel[187] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 797
		turretModel[188] = new ModelRendererTurbo(this, 513, 169, textureX, textureY); // Box 798
		turretModel[189] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 800
		turretModel[190] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 801
		turretModel[191] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 802
		turretModel[192] = new ModelRendererTurbo(this, 873, 193, textureX, textureY); // Box 803
		turretModel[193] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 810
		turretModel[194] = new ModelRendererTurbo(this, 241, 257, textureX, textureY); // Box 811
		turretModel[195] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Box 812
		turretModel[196] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Box 813
		turretModel[197] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Box 814
		turretModel[198] = new ModelRendererTurbo(this, 305, 257, textureX, textureY); // Box 815
		turretModel[199] = new ModelRendererTurbo(this, 1009, 193, textureX, textureY); // Box 816
		turretModel[200] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 817
		turretModel[201] = new ModelRendererTurbo(this, 593, 201, textureX, textureY); // Box 818
		turretModel[202] = new ModelRendererTurbo(this, 689, 201, textureX, textureY); // Box 819
		turretModel[203] = new ModelRendererTurbo(this, 9, 209, textureX, textureY); // Box 820
		turretModel[204] = new ModelRendererTurbo(this, 1009, 209, textureX, textureY); // Box 821
		turretModel[205] = new ModelRendererTurbo(this, 921, 217, textureX, textureY); // Box 822
		turretModel[206] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Box 823
		turretModel[207] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 825
		turretModel[208] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 826
		turretModel[209] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 827
		turretModel[210] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Box 828
		turretModel[211] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 829
		turretModel[212] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Box 830
		turretModel[213] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Box 831
		turretModel[214] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 832
		turretModel[215] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 833
		turretModel[216] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 834
		turretModel[217] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Box 835
		turretModel[218] = new ModelRendererTurbo(this, 513, 257, textureX, textureY); // Box 836
		turretModel[219] = new ModelRendererTurbo(this, 529, 257, textureX, textureY); // Box 837
		turretModel[220] = new ModelRendererTurbo(this, 545, 257, textureX, textureY); // Box 838
		turretModel[221] = new ModelRendererTurbo(this, 561, 257, textureX, textureY); // Box 839
		turretModel[222] = new ModelRendererTurbo(this, 577, 257, textureX, textureY); // Box 840
		turretModel[223] = new ModelRendererTurbo(this, 593, 257, textureX, textureY); // Box 841
		turretModel[224] = new ModelRendererTurbo(this, 785, 257, textureX, textureY); // Box 842
		turretModel[225] = new ModelRendererTurbo(this, 865, 257, textureX, textureY); // Box 843
		turretModel[226] = new ModelRendererTurbo(this, 945, 257, textureX, textureY); // Box 844
		turretModel[227] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Box 845
		turretModel[228] = new ModelRendererTurbo(this, 961, 257, textureX, textureY); // Box 847
		turretModel[229] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 848
		turretModel[230] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 849
		turretModel[231] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 850
		turretModel[232] = new ModelRendererTurbo(this, 977, 257, textureX, textureY); // Box 851
		turretModel[233] = new ModelRendererTurbo(this, 1001, 257, textureX, textureY); // Box 852
		turretModel[234] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 853
		turretModel[235] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 854
		turretModel[236] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Box 855
		turretModel[237] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Box 856
		turretModel[238] = new ModelRendererTurbo(this, 553, 241, textureX, textureY); // Box 857
		turretModel[239] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Box 858
		turretModel[240] = new ModelRendererTurbo(this, 233, 265, textureX, textureY); // Box 859
		turretModel[241] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Box 861
		turretModel[242] = new ModelRendererTurbo(this, 265, 265, textureX, textureY); // Box 862
		turretModel[243] = new ModelRendererTurbo(this, 569, 241, textureX, textureY); // Box 863
		turretModel[244] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 864
		turretModel[245] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 865
		turretModel[246] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Box 866
		turretModel[247] = new ModelRendererTurbo(this, 313, 265, textureX, textureY); // Box 867
		turretModel[248] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Box 868
		turretModel[249] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 869
		turretModel[250] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 870
		turretModel[251] = new ModelRendererTurbo(this, 585, 265, textureX, textureY); // Box 871
		turretModel[252] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 872
		turretModel[253] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 873
		turretModel[254] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 874
		turretModel[255] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 875
		turretModel[256] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 876
		turretModel[257] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 877
		turretModel[258] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 878

		turretModel[0].addShapeBox(1.5F, -3.5F, 17F, 8, 4, 10, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1.3F, 0F, 0F, 0.5F); // Box 132
		turretModel[0].setRotationPoint(0F, -19.5F, 0F);

		turretModel[1].addShapeBox(1.5F, -3.5F, -26.7F, 8, 4, 47, 0F,0F, 0F, 0.5F, -0.2F, 0F, -1.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -1.3F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 133
		turretModel[1].setRotationPoint(0F, -19.5F, 0F);

		turretModel[2].addShapeBox(-6.5F, -3.5F, -26.7F, 8, 4, 43, 0F,0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 134
		turretModel[2].setRotationPoint(0F, -19.5F, 0F);

		turretModel[3].addShapeBox(-6.5F, -3.5F, 17F, 8, 4, 10, 0F,0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 135
		turretModel[3].setRotationPoint(0F, -19.5F, 0F);

		turretModel[4].addShapeBox(9.3F, -3.5F, -24.9F, 9, 4, 40, 0F,0F, 0F, 0.5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -5.4F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 136
		turretModel[4].setRotationPoint(0F, -19.5F, 0F);

		turretModel[5].addShapeBox(9.3F, -3.5F, 15.2F, 9, 4, 10, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -5.4F, 0F, 0F, 0.5F); // Box 137
		turretModel[5].setRotationPoint(0F, -19.5F, 0F);

		turretModel[6].addShapeBox(18.1F, -3.5F, -19F, 6, 4, 15, 0F,0F, 0F, 0.9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0.5F, -1F, 0F, -6.4F, -0.2F, 0F, 0F, 1F, 0F, 0F); // Box 138
		turretModel[6].setRotationPoint(0F, -19.5F, 0F);

		turretModel[7].addShapeBox(18.1F, -3.5F, 4.3F, 6, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0.9F, 1F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, -6.4F, 0.8F, 0F, 0.5F); // Box 139
		turretModel[7].setRotationPoint(0F, -19.5F, 0F);

		turretModel[8].addShapeBox(-14.5F, -3.5F, -26.4F, 8, 4, 41, 0F,-0.2F, 0F, -3.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 140
		turretModel[8].setRotationPoint(0F, -19.5F, 0F);

		turretModel[9].addShapeBox(-14.5F, -3.5F, -14F, 8, 4, 41, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -3.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -3.3F); // Box 141
		turretModel[9].setRotationPoint(0F, -19.5F, 0F);

		turretModel[10].addShapeBox(-22.3F, -3.5F, -22.6F, 8, 4, 37, 0F,-0.2F, 0F, -5.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5.8F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 142
		turretModel[10].setRotationPoint(0F, -19.5F, 0F);

		turretModel[11].addShapeBox(-22.3F, -3.5F, 5.2F, 8, 4, 18, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -5.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -5.8F); // Box 143
		turretModel[11].setRotationPoint(0F, -19.5F, 0F);

		turretModel[12].addShapeBox(-30.1F, -3.5F, -16.6F, 8, 4, 23, 0F,0.5F, 0F, -8F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, -9.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 144
		turretModel[12].setRotationPoint(0F, -19.5F, 0F);

		turretModel[13].addShapeBox(-30.1F, -3.5F, 1.2F, 8, 4, 16, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.5F, 0F, -8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.2F, 0F, -9.8F); // Box 145
		turretModel[13].setRotationPoint(0F, -19.5F, 0F);

		turretModel[14].addShapeBox(-6.5F, -7.5F, -26.7F, 8, 4, 43, 0F,0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 146
		turretModel[14].setRotationPoint(0F, -19.5F, 0F);

		turretModel[15].addShapeBox(-6.5F, -7.5F, 1F, 8, 4, 26, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 147
		turretModel[15].setRotationPoint(0F, -19.5F, 0F);

		turretModel[16].addShapeBox(1.5F, -7.5F, 0F, 8, 4, 27, 0F,0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -2.4F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1.3F, 0F, 0F, 0.5F); // Box 148
		turretModel[16].setRotationPoint(0F, -19.5F, 0F);

		turretModel[17].addShapeBox(1.5F, -7.5F, -26.7F, 8, 4, 26, 0F,0F, 0F, -0.5F, -0.2F, 0F, -2.4F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, -1.3F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 149
		turretModel[17].setRotationPoint(0F, -19.5F, 0F);

		turretModel[18].addShapeBox(9.3F, -8.5F, 6.2F, 9, 4, 19, 0F,0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -5.65F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5F, 0F, 0F, 0.5F); // Box 150
		turretModel[18].setRotationPoint(0F, -18.5F, 0F);

		turretModel[19].addShapeBox(9.3F, -7.5F, -24.9F, 9, 4, 31, 0F,0F, 0F, -0.6F, -1.2F, 0F, -5.65F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 151
		turretModel[19].setRotationPoint(0F, -19.5F, 0F);

		turretModel[20].addShapeBox(18.1F, -7.5F, -19F, 6, 4, 15, 0F,1F, 0F, 0.3F, -1.6F, 0F, -8.4F, -0.8F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		turretModel[20].setRotationPoint(0F, -19.5F, 0F);

		turretModel[21].addShapeBox(17.05F, -0.5F, -3.7F, 7, 4, 8, 0F,0F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 154
		turretModel[21].setRotationPoint(0F, -19.5F, 0F);

		turretModel[22].addShapeBox(17.05F, -3.5F, -3.7F, 7, 4, 8, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 155
		turretModel[22].setRotationPoint(0F, -19.5F, 0F);

		turretModel[23].addShapeBox(18.1F, -8.5F, 4.3F, 6, 4, 15, 0F,2F, 0F, 0F, -0.8F, 0F, 0F, -1.6F, 0F, -8.4F, 1F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0.9F); // Box 156
		turretModel[23].setRotationPoint(0F, -18.5F, 0F);

		turretModel[24].addShapeBox(-14.5F, -7.5F, -26.4F, 8, 4, 28, 0F,-0.2F, 0F, -4.3F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 157
		turretModel[24].setRotationPoint(0F, -19.5F, 0F);

		turretModel[25].addShapeBox(-14.5F, -7.5F, -1.3F, 8, 4, 28, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -4.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -0.2F, 0F, -3F); // Box 158
		turretModel[25].setRotationPoint(0F, -19.5F, 0F);

		turretModel[26].addShapeBox(-22.3F, -7.5F, -22.6F, 8, 4, 24, 0F,-0.2F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5.3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 159
		turretModel[26].setRotationPoint(0F, -19.5F, 0F);

		turretModel[27].addShapeBox(-22.3F, -7.5F, -1.1F, 8, 4, 24, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -6F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -0.2F, 0F, -5F); // Box 160
		turretModel[27].setRotationPoint(0F, -19.5F, 0F);

		turretModel[28].addShapeBox(-30.1F, -7.5F, -16.6F, 8, 4, 16, 0F,0.5F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -8F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 161
		turretModel[28].setRotationPoint(0F, -19.5F, 0F);

		turretModel[29].addShapeBox(-30.1F, -7.5F, -1.15F, 8, 4, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.5F, 0F, -9F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0.5F, 0F, -7.7F); // Box 162
		turretModel[29].setRotationPoint(0F, -19.5F, 0F);

		turretModel[30].addShapeBox(1.5F, -8.5F, -26.7F, 8, 1, 27, 0F,0F, 0F, -1.2F, -0.2F, 0F, -2.9F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -2.4F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 163
		turretModel[30].setRotationPoint(0F, -19.5F, 0F);

		turretModel[31].addShapeBox(1.5F, -8.5F, 1F, 8, 1, 26, 0F,0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -2.9F, 0F, 0F, -1.2F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -2.4F, 0F, 0F, -0.5F); // Box 164
		turretModel[31].setRotationPoint(0F, -19.5F, 0F);

		turretModel[32].addShapeBox(-6.5F, -8.5F, -26.7F, 8, 1, 28, 0F,0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 165
		turretModel[32].setRotationPoint(0F, -19.5F, 0F);

		turretModel[33].addShapeBox(-6.5F, -8.5F, -1F, 8, 1, 28, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F); // Box 166
		turretModel[33].setRotationPoint(0F, -19.5F, 0F);

		turretModel[34].addShapeBox(9.3F, -9.5F, -0.8F, 8, 1, 26, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -6F, 0F, 0F, -1.1F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5.6F, 0F, 0F, -0.6F); // Box 167
		turretModel[34].setRotationPoint(0F, -18.5F, 0F);

		turretModel[35].addShapeBox(9.3F, -9.5F, -24.9F, 8, 1, 26, 0F,0F, 0F, -1.1F, -0.4F, 0F, -6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.2F, 0F, -5.6F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 168
		turretModel[35].setRotationPoint(0F, -18.5F, 0F);

		turretModel[36].addShapeBox(-14.5F, -8.5F, -1.8F, 8, 1, 28, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.2F, 0.5F, -4.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -3.8F); // Box 169
		turretModel[36].setRotationPoint(0F, -19.5F, 0F);

		turretModel[37].addShapeBox(-14.5F, -8.5F, -25.9F, 8, 1, 28, 0F,-0.2F, 0.5F, -4.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 170
		turretModel[37].setRotationPoint(0F, -19.5F, 0F);

		turretModel[38].addShapeBox(-22.3F, -8.5F, -22.6F, 8, 1, 24, 0F,-0.2F, 1.2F, -7F, 0F, 0.5F, -0.9F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 171
		turretModel[38].setRotationPoint(0F, -19.5F, 0F);

		turretModel[39].addShapeBox(-22.3F, -8.5F, -1.1F, 8, 1, 24, 0F,-0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.9F, -0.2F, 1.2F, -7F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -6F); // Box 172
		turretModel[39].setRotationPoint(0F, -19.5F, 0F);

		turretModel[40].addShapeBox(-30.1F, -8.5F, -1.15F, 8, 1, 18, 0F,-1F, 2F, -1.2F, 0F, 1F, 0F, 0F, 1.2F, -0.95F, -1.9F, 2F, -9F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.5F, 0F, -9F); // Box 173
		turretModel[40].setRotationPoint(0F, -19.5F, 0F);

		turretModel[41].addShapeBox(-30.1F, -8.5F, -16.6F, 8, 1, 18, 0F,-1.9F, 2F, -9F, 0F, 1.2F, -0.95F, 0F, 1F, 0F, -1F, 2F, -1.35F, 0.5F, 0F, -9F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0.5F, 0F, -1F); // Box 174
		turretModel[41].setRotationPoint(0F, -19.5F, 0F);

		turretModel[42].addShapeBox(16.2F, -11.5F, -3.7F, 7, 1, 8, 0F,0F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 176
		turretModel[42].setRotationPoint(0F, -16.5F, 0F);

		turretModel[43].addShapeBox(16.2F, -11.5F, -11F, 7, 1, 7, 0F,-0.7F, 0F, 7.9F, -1.8F, 0F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 8.3F, -0.7F, 0F, -0.35F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		turretModel[43].setRotationPoint(0F, -16.5F, 0F);

		turretModel[44].addShapeBox(16.2F, -11.5F, 4.3F, 7, 1, 7, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -1.8F, 0F, -0.5F, -0.7F, 0F, 7.9F, 0F, 0F, 0F, 0.1F, 0F, 0F, -0.7F, 0F, -0.35F, -0.9F, 0F, 8.3F); // Box 178
		turretModel[44].setRotationPoint(0F, -16.5F, 0F);

		turretModel[45].addShapeBox(-6.5F, -11.5F, -26F, 8, 3, 4, 0F,0F, -2.4F, -1.2F, 0F, -2.4F, -1.2F, -0.4F, -0.05F, 0.7F, 0F, -0.05F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 181
		turretModel[45].setRotationPoint(0F, -19.5F, 0F);

		turretModel[46].addShapeBox(1.5F, -11.5F, -26F, 8, 3, 4, 0F,0F, -2.4F, -1.2F, -0.3F, -2.4F, -3.2F, -0.7F, -0.2F, 2.7F, 0.4F, -0.05F, 0.7F, 0F, 0F, -0.5F, -0.2F, 0F, -2.2F, 0F, 0F, 2.3F, 0F, 0F, 0.3F); // Box 182
		turretModel[46].setRotationPoint(0F, -19.5F, 0F);

		turretModel[47].addShapeBox(9.3F, -11.5F, -24.3F, 6, 3, 4, 0F,0.1F, -2.4F, -1.5F, 0.8F, -2.35F, -6.1F, -1.8F, -0.35F, 4.9F, 0.5F, -0.2F, 1F, 0F, 0F, -0.5F, 1.6F, 0F, -5.4F, 0F, 0F, 4.3F, 0F, 0F, 0.3F); // Box 186
		turretModel[47].setRotationPoint(0F, -19.5F, 0F);

		turretModel[48].addShapeBox(1.5F, -11.5F, 22.3F, 8, 3, 4, 0F,0.4F, -0.05F, 0.7F, -0.7F, -0.2F, 2.7F, -0.3F, -2.4F, -3.2F, 0F, -2.4F, -1.2F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, -0.2F, 0F, -2.2F, 0F, 0F, -0.5F); // Box 189
		turretModel[48].setRotationPoint(0F, -19.5F, 0F);

		turretModel[49].addShapeBox(-6.5F, -11.5F, 22.3F, 8, 3, 4, 0F,0F, -0.05F, 0.3F, -0.4F, -0.05F, 0.7F, 0F, -2.4F, -1.2F, 0F, -2.4F, -1.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 190
		turretModel[49].setRotationPoint(0F, -19.5F, 0F);

		turretModel[50].addShapeBox(-14.5F, -9.5F, 21.8F, 8, 1, 4, 0F,-0.2F, 2.1F, 3F, 0F, 1.95F, -0.2F, 0F, -0.4F, -0.7F, -0.2F, 0.5F, -5F, -0.2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, -3.8F); // Box 177
		turretModel[50].setRotationPoint(0F, -19.5F, 0F);

		turretModel[51].addShapeBox(-14.5F, -9.5F, -25.5F, 8, 1, 4, 0F,-0.2F, 0.5F, -5F, 0F, -0.4F, -0.7F, 0F, 1.95F, -0.2F, -0.2F, 2.1F, 3F, -0.2F, -0.5F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 2F); // Box 178
		turretModel[51].setRotationPoint(0F, -19.5F, 0F);

		turretModel[52].addShapeBox(-22.31F, -10.2F, 17.8F, 8, 1, 4, 0F,-1.15F, 1.55F, 3.95F, 0F, 1.4F, -1F, 0F, -0.2F, -1F, -0.65F, 0.6F, -7F, -1.2F, -1F, 4F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, -0.2F, -0.5F, -5.9F); // Box 179
		turretModel[52].setRotationPoint(0F, -19.5F, 0F);

		turretModel[53].addShapeBox(-22.31F, -10.2F, -21.5F, 8, 1, 4, 0F,-0.7F, 0.5F, -6.9F, 0F, -0.2F, -1F, 0F, 1.4F, -1F, -1.2F, 1.55F, 3.9F, -0.2F, -0.5F, -5.9F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, -1.2F, -1F, 4F); // Box 180
		turretModel[53].setRotationPoint(0F, -19.5F, 0F);

		turretModel[54].addShapeBox(-30.1F, -11.5F, 6.85F, 8, 1, 10, 0F,-6.3F, 0.7F, -0.8F, 0.95F, 0.25F, -7F, 0.45F, -0.7F, -2.05F, -2F, -1F, -9F, -2.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0.8F, -0.95F, -1.9F, 0F, -9F); // Box 181
		turretModel[54].setRotationPoint(0F, -19.5F, 0F);

		turretModel[55].addShapeBox(-30.1F, -11.5F, -16.6F, 8, 1, 10, 0F,-2F, -0.95F, -9F, 0.47F, -0.8F, -2F, 0.97F, 0.24F, -7F, -6.3F, 0.7F, -0.8F, -1.9F, 0F, -9F, 0F, 0.8F, -0.95F, 0F, 0F, -1F, -5.8F, 0F, -1F); // Box 183
		turretModel[55].setRotationPoint(0F, -19.5F, 0F);

		turretModel[56].addShapeBox(-27.7F, -10.5F, -1.3F, 8, 1, 18, 0F,-3.5F, 1.7F, -1.2F, -4F, 1F, -1F, -4F, 1.2F, -9.1F, -3.9F, 1.68F, -9F, 1.4F, -1F, -1.35F, -4F, -1F, -1F, -4F, -1F, -9F, 0.5F, -1F, -8.85F); // Box 184
		turretModel[56].setRotationPoint(0F, -19.5F, 0F);

		turretModel[57].addShapeBox(-27.7F, -10.5F, -16.45F, 8, 1, 18, 0F,-3.9F, 1.68F, -9.05F, -4F, 1.2F, -9F, -4F, 1F, -1F, -3.5F, 1.7F, -1.6F, 0.5F, -1F, -8.85F, -4F, -1F, -9F, -4F, -1F, -1F, 1.4F, -1F, -1.5F); // Box 185
		turretModel[57].setRotationPoint(0F, -19.5F, 0F);

		turretModel[58].addShapeBox(16.9F, -11.5F, -19.35F, 6, 3, 4, 0F,0.8F, -2.33F, -1.2F, -2.45F, -2.4F, -9.1F, -5.8F, -0.45F, 5.9F, 3.4F, -0.35F, -0.05F, 0F, 0F, -0.45F, -1.5F, 0F, -8.85F, -9F, 0F, 5.3F, 2F, 0F, 0.3F); // Box 186
		turretModel[58].setRotationPoint(0F, -19.5F, 0F);

		turretModel[59].addShapeBox(16.9F, -11.5F, 15.65F, 6, 3, 4, 0F,3.4F, -0.35F, -0.1F, -5.8F, -0.4F, 5.9F, -2.45F, -2.4F, -9.1F, 0.8F, -2.35F, -1.2F, 2F, 0F, 0.3F, -9F, 0F, 5.3F, -1.5F, 0F, -8.85F, 0F, 0F, -0.45F); // Box 188
		turretModel[59].setRotationPoint(0F, -19.5F, 0F);

		turretModel[60].addShapeBox(9.3F, -11.5F, 20.6F, 6, 3, 4, 0F,0.5F, -0.2F, 1F, -1.8F, -0.35F, 4.85F, 0.82F, -2.36F, -6.1F, 0.1F, -2.4F, -1.5F, 0F, 0F, 0.3F, 0F, 0F, 4.3F, 1.6F, 0F, -5.4F, 0F, 0F, -0.5F); // Box 189
		turretModel[60].setRotationPoint(0F, -19.5F, 0F);

		turretModel[61].addShapeBox(19.85F, -11.5F, 9.5F, 4, 3, 4, 0F,2.75F, -0.4F, -0.25F, -6.21F, -0.73F, 5.5F, -2.5F, -2.35F, -9.25F, -0.6F, -2.4F, -2.95F, 5F, 0F, 0.3F, -9F, 0F, 5.3F, -1.45F, 0F, -9.2F, -1.55F, 0F, -2.7F); // Box 192
		turretModel[61].setRotationPoint(0F, -19.5F, 0F);

		turretModel[62].addShapeBox(19.85F, -11.5F, -13.2F, 4, 3, 4, 0F,-0.6F, -2.4F, -2.95F, -2.5F, -2.35F, -9.2F, -6.21F, -0.75F, 5.5F, 2.75F, -0.45F, -0.25F, -1.55F, 0F, -2.7F, -1.45F, 0F, -9.2F, -9F, 0F, 5.3F, 5F, 0F, 0.3F); // Box 193
		turretModel[62].setRotationPoint(0F, -19.5F, 0F);

		turretModel[63].addShapeBox(17.9F, -11.5F, -3.85F, 5, 3, 8, 0F,-0.1F, -0.91F, -0.12F, -1.55F, -2.35F, 0.15F, -1.55F, -2.35F, 0.1F, -0.1F, -0.89F, -0.12F, -0.1F, 0F, -0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.1F, 0F, -0.15F); // Box 194
		turretModel[63].setRotationPoint(0F, -19.5F, 0F);

		turretModel[64].addShapeBox(1.1F, -11.45F, -21.8F, 8, 4, 14, 0F,0F, 0F, -0.5F, -0.3F, -0.15F, -2.5F, -0.3F, 2F, -0.5F, 0F, 2.7F, -0.5F, 0F, 0F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 195
		turretModel[64].setRotationPoint(0F, -19.5F, 0F);

		turretModel[65].addShapeBox(1.1F, -11.45F, 8.1F, 8, 4, 14, 0F,0F, 2.7F, -0.5F, -0.3F, 2F, -0.5F, -0.3F, -0.15F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 197
		turretModel[65].setRotationPoint(0F, -19.5F, 0F);

		turretModel[66].addShapeBox(-6.9F, -11.45F, 8.1F, 8, 4, 14, 0F,-0.3F, 3F, -0.5F, 0F, 2.7F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, -0.1F, -0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F); // Box 198
		turretModel[66].setRotationPoint(0F, -19.5F, 0F);

		turretModel[67].addShapeBox(-6.9F, -11.45F, -21.8F, 8, 4, 14, 0F,-0.4F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 2.7F, -0.5F, -0.3F, 3F, -0.5F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 199
		turretModel[67].setRotationPoint(0F, -19.5F, 0F);

		turretModel[68].addShapeBox(-14.1F, -11.45F, 8.1F, 8, 4, 14, 0F,0.2F, 3F, -0.5F, -0.5F, 3F, -0.5F, -0.4F, 0F, -0.1F, 0.2F, 0.15F, -3.3F, 0.2F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0.2F, 0F, -1.5F); // Box 200
		turretModel[68].setRotationPoint(0F, -19.5F, 0F);

		turretModel[69].addShapeBox(-14.1F, -11.45F, -21.8F, 8, 4, 14, 0F,0.2F, 0.15F, -3.3F, -0.4F, 0F, -0.1F, -0.5F, 3F, -0.5F, 0.2F, 3F, -0.5F, 0.2F, 0F, -1.5F, -0.4F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 201
		turretModel[69].setRotationPoint(0F, -19.5F, 0F);

		turretModel[70].addShapeBox(-21.1F, -12F, 6.1F, 7, 4, 11, 0F,2.7F, 0.2F, -1.55F, -0.2F, 2.45F, -2.5F, -0.2F, -0.4F, 1.7F, 0.05F, -0.25F, -3.25F, 0.2F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.2F, 0F, 1.5F, 0.2F, 0F, -3.5F); // Box 202
		turretModel[70].setRotationPoint(0F, -19.5F, 0F);

		turretModel[71].addShapeBox(-21.1F, -12F, -16.8F, 7, 4, 11, 0F,0.05F, -0.25F, -3.25F, -0.2F, -0.4F, 1.7F, -0.2F, 2.45F, -2.5F, 2.7F, 0.2F, -1.55F, 0.2F, 0F, -3.5F, -0.2F, 0F, 1.5F, -0.1F, 0F, -0.5F, 0.2F, 0F, -0.5F); // Box 203
		turretModel[71].setRotationPoint(0F, -19.5F, 0F);

		turretModel[72].addShapeBox(-14.2F, -11.45F, 0.1F, 8, 4, 8, 0F,0.1F, 3F, -0.1F, -0.5F, 3.2F, -0.1F, -0.4F, 3F, 0.5F, 0.1F, 3F, 0.5F, 0.1F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0.1F, 0F, -1.5F); // Box 204
		turretModel[72].setRotationPoint(0F, -19.5F, 0F);

		turretModel[73].addShapeBox(-14.2F, -11.45F, -7.7F, 8, 4, 8, 0F,0.1F, 3F, 0.6F, -0.4F, 3F, 0.6F, -0.5F, 3.2F, -0.1F, 0.1F, 3F, -0.1F, 0.1F, 0F, -1.5F, -0.4F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0.1F, 0F, 0.5F); // Box 205
		turretModel[73].setRotationPoint(0F, -19.5F, 0F);

		turretModel[74].addShapeBox(-7F, -11.45F, -7.7F, 8, 4, 8, 0F,-0.4F, 3F, 0.6F, 0.1F, 2.7F, 0.6F, 0.1F, 3F, -0.1F, -0.3F, 3.2F, -0.1F, -0.4F, 0F, 0.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 206
		turretModel[74].setRotationPoint(0F, -19.5F, 0F);

		turretModel[75].addShapeBox(-7F, -11.45F, 0.1F, 8, 4, 8, 0F,-0.3F, 3.2F, -0.1F, 0.1F, 3F, -0.1F, 0.1F, 2.7F, 0.5F, -0.4F, 3F, 0.5F, -0.3F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, -1.5F, -0.4F, 0F, 0.5F); // Box 207
		turretModel[75].setRotationPoint(0F, -19.5F, 0F);

		turretModel[76].addShapeBox(0.7F, -11.15F, 0.1F, 8, 4, 8, 0F,-0.4F, 3.3F, -0.1F, 0.1F, 3F, -0.1F, 0.1F, 2.3F, 0.5F, -0.4F, 3F, 0.5F, -0.3F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, -1.5F, -0.4F, 0F, 0.5F); // Box 208
		turretModel[76].setRotationPoint(0F, -19.5F, 0F);

		turretModel[77].addShapeBox(0.7F, -11.15F, -7.7F, 8, 4, 8, 0F,-0.4F, 3F, 0.6F, 0.1F, 2.3F, 0.6F, 0.1F, 3F, -0.1F, -0.4F, 3.3F, -0.1F, -0.4F, 0F, 0.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 209
		turretModel[77].setRotationPoint(0F, -19.5F, 0F);

		turretModel[78].addShapeBox(8.4F, -11.15F, -7.7F, 8, 4, 8, 0F,-0.4F, 2.8F, 0.6F, 0.7F, 0.4F, 1.75F, 0.1F, 0.5F, -0.1F, -0.4F, 3.5F, -0.1F, -0.4F, 0F, 0.5F, 1.1F, 0F, 1.5F, 0.1F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 210
		turretModel[78].setRotationPoint(0F, -19F, 0F);

		turretModel[79].addShapeBox(8.4F, -11.15F, 0.1F, 8, 4, 8, 0F,-0.4F, 3.5F, -0.1F, 0.1F, 0.5F, -0.1F, 0.7F, 0.45F, 1.65F, -0.4F, 2.8F, 0.6F, -0.3F, 0F, 0.5F, 0.1F, 0F, 0.5F, 1.1F, 0F, 1.5F, -0.4F, 0F, 0.5F); // Box 212
		turretModel[79].setRotationPoint(0F, -19F, 0F);

		turretModel[80].addShapeBox(17F, -11.05F, -9.6F, 1, 2, 10, 0F,-0.1F, 0.5F, -0.2F, -0.85F, 0.45F, -0.2F, -0.05F, 0.04F, -0.2F, 0.5F, 0.6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 213
		turretModel[80].setRotationPoint(0F, -19F, 0F);

		turretModel[81].addShapeBox(17F, -11.05F, 0F, 1, 2, 10, 0F,0.5F, 0.6F, -0.2F, -0.05F, 0.05F, -0.2F, -0.85F, 0.5F, -0.2F, -0.1F, 0.55F, -0.25F, 0F, 0F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 214
		turretModel[81].setRotationPoint(0F, -19F, 0F);

		turretModel[82].addShapeBox(17F, -11.05F, -4F, 1, 2, 4, 0F,-0.6F, 0.2F, -0.2F, 0F, 0.04F, -0.2F, 0F, 0F, 0.2F, -0.95F, 0.05F, 0.2F, 0F, 0F, -0.2F, -0.05F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 215
		turretModel[82].setRotationPoint(0F, -19F, 0F);

		turretModel[83].addShapeBox(17.02F, -11.08F, 0.2F, 1, 2, 4, 0F,-0.95F, 0.05F, 0.2F, 0F, 0F, 0.2F, 0F, 0.02F, -0.18F, -0.6F, 0.2F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.05F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 216
		turretModel[83].setRotationPoint(0F, -19F, 0F);

		turretModel[84].addShapeBox(8.8F, -11.45F, -19.8F, 8, 4, 11, 0F,0F, -0.15F, -0.5F, -3.3F, -0.3F, -4.4F, 0.3F, -0.4F, -0.65F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, -1.3F, 0F, -4.5F, 0.3F, 0F, 0F, 0F, 0F, 1.5F); // Box 217
		turretModel[84].setRotationPoint(0F, -19.5F, 0F);

		turretModel[85].addShapeBox(8.8F, -11.45F, 9.1F, 8, 4, 11, 0F,0F, 2F, 0.4F, 0.3F, -0.35F, -0.65F, -3.3F, -0.3F, -4.35F, 0F, -0.15F, -0.5F, 0F, 0F, 1.5F, 0.3F, 0F, 0F, -1.3F, 0F, -4.5F, 0F, 0F, 0.5F); // Box 218
		turretModel[85].setRotationPoint(0F, -19.5F, 0F);

		turretModel[86].addShapeBox(-23.8F, -11.45F, 0.1F, 10, 4, 8, 0F,0.4F, 0.75F, 0.2F, -0.5F, 3F, -0.1F, -0.5F, 3F, 0.5F, 0F, 0.75F, -0.45F, 1.1F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0F, -0.45F); // Box 219
		turretModel[86].setRotationPoint(0F, -19.5F, 0F);

		turretModel[87].addShapeBox(-23.8F, -11.45F, -7.9F, 10, 4, 8, 0F,0F, 0.75F, -0.55F, -0.5F, 3F, 0.4F, -0.5F, 3F, 0.1F, 0.4F, 0.75F, -0.2F, 0F, 0F, -0.45F, -0.4F, 0F, 0.5F, -0.3F, 0F, 0.5F, 1.1F, 0F, 0.5F); // Box 221
		turretModel[87].setRotationPoint(0F, -19.5F, 0F);

		turretModel[88].addShapeBox(-41.8F, -11.45F, -9F, 11, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		turretModel[88].setRotationPoint(0F, -19.5F, 0F);

		turretModel[89].addShapeBox(-41.8F, -7.45F, -9F, 11, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 223
		turretModel[89].setRotationPoint(0F, -19.5F, 0F);

		turretModel[90].addShapeBox(-41.8F, -11.45F, -9F, 11, 1, 19, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 224
		turretModel[90].setRotationPoint(0F, -19.5F, 0F);

		turretModel[91].addShapeBox(-40.8F, -12F, -5.8F, 7, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 225
		turretModel[91].setRotationPoint(0F, -19.5F, 0F);

		turretModel[92].addShapeBox(-40.8F, -12F, 5.6F, 7, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 226
		turretModel[92].setRotationPoint(0F, -19.5F, 0F);

		turretModel[93].addShapeBox(-40.8F, -11.8F, -6.4F, 7, 1, 14, 0F,0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F); // Box 227
		turretModel[93].setRotationPoint(0F, -19.5F, 0F);

		turretModel[94].addShapeBox(-21F, -10.45F, -25.5F, 11, 4, 20, 0F,-5F, 0F, 7F, 0F, 0F, 0F, -17F, 0F, -7F, 11F, 0F, -15F, -5F, 0F, 7F, 0F, 0F, 0F, -17F, 0F, -7F, 11F, 0F, -15F); // Box 229
		turretModel[94].setRotationPoint(0F, -19.5F, 0F);

		turretModel[95].addShapeBox(-21F, -6.45F, -25.5F, 11, 5, 20, 0F,-5F, 0F, 7F, 0F, 0F, 0F, -17F, 0F, -7F, 11F, 0F, -15F, -7F, 0F, 5F, 0F, 0F, 0F, -17F, 0F, -7F, 10F, 0F, -13F); // Box 230
		turretModel[95].setRotationPoint(0F, -19.5F, 0F);

		turretModel[96].addShapeBox(-16F, -6.45F, 5.2F, 4, 4, 27, 0F,11F, 0F, -15F, -13F, 0F, -11F, 8F, 0F, -3F, -9.55F, 0F, 0F, 11F, 0F, -15F, -13F, 0F, -11F, 8F, 0F, -3F, -9.5F, 0F, 0F); // Box 231
		turretModel[96].setRotationPoint(0F, -19.5F, 0F);

		turretModel[97].addShapeBox(2.3F, -15.45F, 6.1F, 5, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		turretModel[97].setRotationPoint(0F, -19.5F, 0F);

		turretModel[98].addShapeBox(2.3F, -16.45F, 6.1F, 5, 1, 7, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		turretModel[98].setRotationPoint(0F, -19.5F, 0F);

		turretModel[99].addShapeBox(-4.7F, -15.45F, 7.1F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		turretModel[99].setRotationPoint(0F, -19.5F, 0F);

		turretModel[100].addShapeBox(-4.7F, -16.45F, 7.1F, 3, 1, 6, 0F,-0.2F, 0.2F, -0.5F, -0.4F, 0.2F, -0.5F, -0.4F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		turretModel[100].setRotationPoint(0F, -19.5F, 0F);

		turretModel[101].addShapeBox(-4.3F, -17.45F, 8.1F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		turretModel[101].setRotationPoint(0F, -19.5F, 0F);

		turretModel[102].addShapeBox(-4.3F, -18.45F, 8.1F, 2, 1, 4, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		turretModel[102].setRotationPoint(0F, -19.5F, 0F);

		turretModel[103].addShapeBox(-3.2F, -18.45F, 8.1F, 1, 1, 4, 0F,0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 238
		turretModel[103].setRotationPoint(0F, -19.5F, 0F);

		turretModel[104].addShapeBox(-18.3F, -14.45F, 9F, 11, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		turretModel[104].setRotationPoint(0F, -19.6F, 0F);

		turretModel[105].addShapeBox(-18.3F, -14.8F, 6F, 11, 4, 3, 0F,-2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		turretModel[105].setRotationPoint(0F, -19.6F, 0F);

		turretModel[106].addShapeBox(-15.8F, -15F, 5F, 7, 4, 1, 0F,-2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		turretModel[106].setRotationPoint(0F, -19.6F, 0F);

		turretModel[107].addShapeBox(-18.3F, -13.45F, 16F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.45F, 0F, -2.5F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 245
		turretModel[107].setRotationPoint(0F, -19.6F, 0F);

		turretModel[108].addShapeBox(-15.8F, -13F, 19F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 246
		turretModel[108].setRotationPoint(0F, -19.6F, 0F);

		turretModel[109].addShapeBox(-6.9F, -15F, 8.7F, 1, 2, 6, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 247
		turretModel[109].setRotationPoint(0F, -19.5F, 0F);

		turretModel[110].addShapeBox(-6.95F, -15F, 8.9F, 1, 1, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, 0F, 0F); // Box 248
		turretModel[110].setRotationPoint(0F, -19.5F, 0F);

		turretModel[111].addShapeBox(-6.95F, -14.5F, 12.9F, 1, 1, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, 0F, 0F); // Box 249
		turretModel[111].setRotationPoint(0F, -19.5F, 0F);

		turretModel[112].addShapeBox(-14.2F, -13F, -21.7F, 4, 4, 17, 0F,0F, 1.6F, -0.4F, -0.2F, 1.6F, 0.4F, -0.2F, 1.6F, 1F, 0F, 1.6F, 0.2F, 0F, 0F, -0.4F, -0.2F, 0F, 1.4F, -0.2F, 0F, 1F, 0F, 0F, 0.2F); // Box 250
		turretModel[112].setRotationPoint(0F, -19.7F, 0F);

		turretModel[113].addShapeBox(-18F, -13F, -20.9F, 4, 4, 16, 0F,0F, 1.6F, -2.8F, -0.2F, 1.6F, 0.4F, -0.2F, 1.6F, 0.4F, 0F, 1.6F, -3F, 0F, 0F, -2.8F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0F, 0F, -3F); // Box 254
		turretModel[113].setRotationPoint(0F, -19.7F, 0F);

		turretModel[114].addShapeBox(-19.8F, -13F, -17.6F, 2, 4, 9, 0F,-0.2F, 1.6F, -2.8F, -0.2F, 1.6F, 0.5F, -0.2F, 1.6F, 0.7F, -0.2F, 1.6F, -3.2F, -0.2F, 0F, -2.8F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.65F, -0.2F, 0F, -3.2F); // Box 255
		turretModel[114].setRotationPoint(0F, -19.7F, 0F);

		turretModel[115].addShapeBox(-6.8F, -13F, -20.9F, 4, 4, 16, 0F,-0.2F, 1.6F, 0.4F, 0F, 1.6F, -2.8F, 0F, 1.6F, -3F, -0.2F, 1.6F, 0.4F, -0.2F, 0F, 2.4F, 0F, 0F, -0.8F, 0F, 0F, -3F, -0.2F, 0F, 0.4F); // Box 256
		turretModel[115].setRotationPoint(0F, -19.7F, 0F);

		turretModel[116].addShapeBox(-10.6F, -13F, -21.7F, 4, 4, 17, 0F,-0.2F, 1.6F, 0.4F, 0F, 1.6F, -0.4F, 0F, 1.6F, 0.2F, -0.2F, 1.6F, 1F, -0.2F, 0F, 1.4F, 0F, 0F, 1.6F, 0F, 0F, 0.2F, -0.2F, 0F, 1F); // Box 257
		turretModel[116].setRotationPoint(0F, -19.7F, 0F);

		turretModel[117].addShapeBox(-3F, -13F, -17.6F, 2, 4, 9, 0F,-0.2F, 1.6F, 0.5F, -0.2F, 1.6F, -2.8F, -0.2F, 1.6F, -3.2F, -0.2F, 1.6F, 0.7F, -0.2F, 0F, 2.5F, 1.8F, 0F, -1.8F, 0.8F, 0F, -3.2F, -0.2F, 0F, 0.65F); // Box 258
		turretModel[117].setRotationPoint(0F, -19.7F, 0F);

		turretModel[118].addShapeBox(-14.2F, -16.6F, -20.7F, 4, 2, 15, 0F,0F, 0F, -1.4F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 1F, 0F, 0F, 0.2F); // Box 259
		turretModel[118].setRotationPoint(0F, -19.7F, 0F);

		turretModel[119].addShapeBox(-10.6F, -16.6F, -20.7F, 4, 2, 15, 0F,-0.2F, 0F, -0.6F, 0F, 0F, -1.4F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, -0.2F, 0F, 1F); // Box 260
		turretModel[119].setRotationPoint(0F, -19.7F, 0F);

		turretModel[120].addShapeBox(-6.8F, -16.6F, -19.9F, 4, 2, 14, 0F,-0.2F, 0F, -0.6F, -1F, 0F, -3.8F, -1F, 0F, -4F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.4F, 0F, 0F, -2.8F, 0F, 0F, -3F, -0.2F, 0F, 0.4F); // Box 261
		turretModel[120].setRotationPoint(0F, -19.7F, 0F);

		turretModel[121].addShapeBox(-3F, -16.6F, -16.6F, 1, 2, 7, 0F,0.8F, 0F, -0.5F, -1.2F, 0F, -2.8F, -1.2F, 0F, -3.2F, 0.8F, 0F, -0.3F, -0.2F, 0F, 0.5F, -0.2F, 0F, -2.8F, -0.2F, 0F, -3.2F, -0.2F, 0F, 0.65F); // Box 262
		turretModel[121].setRotationPoint(0F, -19.7F, 0F);

		turretModel[122].addShapeBox(-18F, -16.6F, -19.9F, 4, 2, 14, 0F,-1F, 0F, -3.8F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -1F, 0F, -4F, 0F, 0F, -2.8F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0F, 0F, -3F); // Box 263
		turretModel[122].setRotationPoint(0F, -19.7F, 0F);

		turretModel[123].addShapeBox(-18.8F, -16.6F, -16.6F, 1, 2, 7, 0F,-1.2F, 0F, -3.8F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.3F, -1.2F, 0F, -3.2F, -0.2F, 0F, -2.8F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.65F, -0.2F, 0F, -3.2F); // Box 264
		turretModel[123].setRotationPoint(0F, -19.7F, 0F);

		turretModel[124].addShapeBox(3.5F, -15.8F, 11.1F, 9, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 265
		turretModel[124].setRotationPoint(0F, -19.5F, 0F);

		turretModel[125].addShapeBox(3.5F, -15.8F, 8.1F, 9, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 266
		turretModel[125].setRotationPoint(0F, -19.5F, 0F);

		turretModel[126].addShapeBox(3.5F, -16.4F, 8.6F, 9, 1, 3, 0F,0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 267
		turretModel[126].setRotationPoint(0F, -19.5F, 0F);

		turretModel[127].addShapeBox(12.5F, -14.4F, 11.1F, 2, 4, 1, 0F,0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 268
		turretModel[127].setRotationPoint(0F, -19.5F, 0F);

		turretModel[128].addShapeBox(12.5F, -14.4F, 8.1F, 2, 4, 1, 0F,0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 269
		turretModel[128].setRotationPoint(0F, -19.5F, 0F);

		turretModel[129].addShapeBox(5.5F, -16.3F, 8.6F, 6, 5, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 270
		turretModel[129].setRotationPoint(0F, -19.5F, 0F);

		turretModel[130].addShapeBox(18.7F, -11.5F, -3.85F, 6, 4, 8, 0F,-0.1F, -0.91F, -0.12F, -1.55F, -2.35F, 0.15F, -1.55F, -2.35F, 0.1F, -0.1F, -0.89F, -0.12F, -0.1F, 0F, -0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.1F, 0F, -0.15F); // Box 271
		turretModel[130].setRotationPoint(0F, -19.5F, 0F);

		turretModel[131].addShapeBox(18F, -7.5F, -3.7F, 7, 4, 8, 0F,0F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 272
		turretModel[131].setRotationPoint(0F, -19.5F, 0F);

		turretModel[132].addShapeBox(18F, -3.5F, -3.7F, 7, 4, 8, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 273
		turretModel[132].setRotationPoint(0F, -19.5F, 0F);

		turretModel[133].addShapeBox(-6.7F, -13F, 20.1F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 274
		turretModel[133].setRotationPoint(0F, -19.5F, 0F);

		turretModel[134].addShapeBox(-6.7F, -13.8F, 18.5F, 1, 1, 4, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 275
		turretModel[134].setRotationPoint(0F, -19.5F, 0F);

		turretModel[135].addShapeBox(-6.7F, -16.6F, 18.3F, 1, 3, 1, 0F,-0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 276
		turretModel[135].setRotationPoint(0F, -19.5F, 0F);

		turretModel[136].addShapeBox(-6.7F, -16.6F, 21.7F, 1, 3, 1, 0F,-0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 277
		turretModel[136].setRotationPoint(0F, -19.5F, 0F);

		turretModel[137].addShapeBox(-6.7F, -17F, 22.7F, 1, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 278
		turretModel[137].setRotationPoint(0F, -19.5F, 0F);

		turretModel[138].addShapeBox(-6.7F, -17F, 17.3F, 1, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 279
		turretModel[138].setRotationPoint(0F, -19.5F, 0F);

		turretModel[139].addShapeBox(-5F, -17.5F, 17.5F, 1, 1, 6, 0F,-0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 280
		turretModel[139].setRotationPoint(0F, -19.5F, 0F);

		turretModel[140].addShapeBox(-5F, -19F, 17.5F, 1, 1, 6, 0F,-0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 281
		turretModel[140].setRotationPoint(0F, -19.3F, 0F);

		turretModel[141].addShapeBox(-5F, -16.5F, 17.5F, 1, 1, 6, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F); // Box 282
		turretModel[141].setRotationPoint(0F, -19.5F, 0F);

		turretModel[142].addShapeBox(-5F, -15F, 17.5F, 1, 1, 6, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -1.3F); // Box 283
		turretModel[142].setRotationPoint(0F, -19.7F, 0F);

		turretModel[143].addShapeBox(-5F, -20.2F, 17.5F, 1, 1, 6, 0F,-0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F); // Box 284
		turretModel[143].setRotationPoint(0F, -19.3F, 0F);

		turretModel[144].addShapeBox(-5F, -13.8F, 17.5F, 1, 1, 6, 0F,-0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F); // Box 285
		turretModel[144].setRotationPoint(0F, -19.7F, 0F);

		turretModel[145].addShapeBox(-6.8F, -16.7F, 18F, 2, 1, 5, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 288
		turretModel[145].setRotationPoint(0F, -19.5F, 0F);

		turretModel[146].addShapeBox(-6.8F, -17.7F, 18F, 2, 1, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 289
		turretModel[146].setRotationPoint(0F, -19.5F, 0F);

		turretModel[147].addShapeBox(-6.8F, -18.9F, 18F, 2, 1, 5, 0F,-0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 290
		turretModel[147].setRotationPoint(0F, -19.3F, 0F);

		turretModel[148].addShapeBox(-6.8F, -19.6F, 17.5F, 2, 1, 6, 0F,-0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F); // Box 291
		turretModel[148].setRotationPoint(0F, -19.3F, 0F);

		turretModel[149].addShapeBox(-6.8F, -15.9F, 18F, 2, 1, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F); // Box 292
		turretModel[149].setRotationPoint(0F, -19.3F, 0F);

		turretModel[150].addShapeBox(-6.8F, -15.2F, 17.5F, 2, 1, 6, 0F,-0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F); // Box 293
		turretModel[150].setRotationPoint(0F, -19.3F, 0F);

		turretModel[151].addShapeBox(26F, -1.4F, -11F, 2, 1, 6, 0F,-0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -2.6F, -0.1F, 0.4F, -1.8F, -0.1F, 0.4F, -1.8F, -0.1F, -0.3F, -2.6F); // Box 294
		turretModel[151].setRotationPoint(0F, -19.7F, 0F);

		turretModel[152].addShapeBox(26F, -2.6F, -11F, 2, 1, 6, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, 0F, -0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -1.3F); // Box 295
		turretModel[152].setRotationPoint(0F, -19.7F, 0F);

		turretModel[153].addShapeBox(26F, -4.1F, -11F, 2, 1, 6, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, 0.4F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 1F, -0.1F, 0.3F, 1F, -0.1F, 0.3F, 0F); // Box 296
		turretModel[153].setRotationPoint(0F, -19.5F, 0F);

		turretModel[154].addShapeBox(26F, -5.1F, -11F, 2, 1, 6, 0F,-0.1F, 0.3F, 0F, -0.1F, 0.3F, 1F, -0.1F, 0.3F, 1F, -0.1F, 0.3F, 0F, -0.1F, 0F, 0.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, 0.4F); // Box 297
		turretModel[154].setRotationPoint(0F, -19.5F, 0F);

		turretModel[155].addShapeBox(26F, -6.6F, -11F, 2, 1, 6, 0F,-0.1F, 0.5F, -1.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -1.3F, -0.1F, 0F, 0F, -0.1F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, 0F); // Box 298
		turretModel[155].setRotationPoint(0F, -19.3F, 0F);

		turretModel[156].addShapeBox(26F, -7.8F, -11F, 2, 1, 6, 0F,-0.1F, -0.3F, -2.6F, -0.1F, 0.4F, -1.8F, -0.1F, 0.4F, -1.8F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -1.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -1.3F); // Box 299
		turretModel[156].setRotationPoint(0F, -19.3F, 0F);

		turretModel[157].addShapeBox(24.2F, -2.7F, -11.3F, 2, 1, 6, 0F,-0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F); // Box 300
		turretModel[157].setRotationPoint(0F, -19.3F, 0F);

		turretModel[158].addShapeBox(24.2F, -3.4F, -10.8F, 2, 1, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F); // Box 301
		turretModel[158].setRotationPoint(0F, -19.3F, 0F);

		turretModel[159].addShapeBox(24.2F, -4.2F, -10.8F, 2, 1, 5, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 302
		turretModel[159].setRotationPoint(0F, -19.5F, 0F);

		turretModel[160].addShapeBox(24.2F, -5.2F, -10.8F, 2, 1, 5, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 303
		turretModel[160].setRotationPoint(0F, -19.5F, 0F);

		turretModel[161].addShapeBox(24.2F, -6.4F, -10.8F, 2, 1, 5, 0F,-0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 304
		turretModel[161].setRotationPoint(0F, -19.3F, 0F);

		turretModel[162].addShapeBox(24.2F, -7.1F, -11.3F, 2, 1, 6, 0F,-0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -2.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F, -0.1F, -0.3F, -1.6F); // Box 305
		turretModel[162].setRotationPoint(0F, -19.3F, 0F);

		turretModel[163].addShapeBox(24.3F, -7.8F, -10.9F, 1, 1, 5, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 306
		turretModel[163].setRotationPoint(0F, -19.5F, 0F);

		turretModel[164].addShapeBox(23.3F, -9F, -8.6F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.4F, 0F); // Box 307
		turretModel[164].setRotationPoint(0F, -19.5F, 0F);

		turretModel[165].addShapeBox(24.3F, -7.6F, -6.7F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F); // Box 308
		turretModel[165].setRotationPoint(0F, -19.5F, 0F);

		turretModel[166].addShapeBox(24.3F, -7.6F, -11.1F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F); // Box 309
		turretModel[166].setRotationPoint(0F, -19.5F, 0F);

		turretModel[167].addShapeBox(24.3F, -4F, -12F, 1, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 311
		turretModel[167].setRotationPoint(0F, -19.5F, 0F);

		turretModel[168].addShapeBox(24.3F, -4F, -5.8F, 1, 1, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 312
		turretModel[168].setRotationPoint(0F, -19.5F, 0F);

		turretModel[169].addShapeBox(19.7F, -9.2F, -8.6F, 4, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 313
		turretModel[169].setRotationPoint(0F, -19.5F, 0F);

		turretModel[170].addShapeBox(19F, -9.2F, -8.6F, 3, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 314
		turretModel[170].setRotationPoint(0F, -19.5F, 0F);

		turretModel[171].addShapeBox(-0.2F, -6F, 30F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 368
		turretModel[171].setRotationPoint(0F, -18.5F, 0F);

		turretModel[172].addShapeBox(-3.9F, -16.45F, -14.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 378
		turretModel[172].setRotationPoint(0F, -19.5F, 0F);

		turretModel[173].addShapeBox(-4.7F, -16.45F, -19F, 1, 1, 2, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 379
		turretModel[173].setRotationPoint(0F, -19.5F, 0F);

		turretModel[174].addShapeBox(-4.7F, -16.45F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F); // Box 380
		turretModel[174].setRotationPoint(0F, -19.5F, 0F);

		turretModel[175].addShapeBox(-16.9F, -16.45F, -19F, 1, 1, 2, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 381
		turretModel[175].setRotationPoint(0F, -19.5F, 0F);

		turretModel[176].addShapeBox(-17.2F, -16.4F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F); // Box 382
		turretModel[176].setRotationPoint(0F, -19.5F, 0F);

		turretModel[177].addShapeBox(-10.6F, -18F, -15.7F, 4, 2, 5, 0F,-0.8F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.2F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, -0.2F, 0F, 1F); // Box 593
		turretModel[177].setRotationPoint(0F, -19.7F, 0F);

		turretModel[178].addShapeBox(-8.2F, -18F, -14.6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 594
		turretModel[178].setRotationPoint(0F, -19.5F, 0F);

		turretModel[179].addShapeBox(24.4F, -1F, 5F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 785
		turretModel[179].setRotationPoint(0F, -18.5F, 0F);
		turretModel[179].rotateAngleZ = 0.33161256F;

		turretModel[180].addShapeBox(24.4F, -0.4F, 8.4F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 790
		turretModel[180].setRotationPoint(0F, -18.5F, 0F);
		turretModel[180].rotateAngleZ = 0.33161256F;

		turretModel[181].addShapeBox(26.4F, -1F, -1F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 791
		turretModel[181].setRotationPoint(0F, -18.5F, 0F);
		turretModel[181].rotateAngleY = 0.54105207F;
		turretModel[181].rotateAngleZ = 0.33161256F;

		turretModel[182].addShapeBox(26.4F, -1F, 2.6F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 792
		turretModel[182].setRotationPoint(0F, -18.5F, 0F);
		turretModel[182].rotateAngleY = 0.54105207F;
		turretModel[182].rotateAngleZ = 0.33161256F;

		turretModel[183].addShapeBox(26.4F, -1F, 2.9F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 793
		turretModel[183].setRotationPoint(0F, -18.5F, 0F);
		turretModel[183].rotateAngleY = 0.66322512F;
		turretModel[183].rotateAngleZ = 0.33161256F;

		turretModel[184].addShapeBox(27F, -1F, -0.6F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 794
		turretModel[184].setRotationPoint(0F, -18.5F, 0F);
		turretModel[184].rotateAngleY = 0.9424778F;
		turretModel[184].rotateAngleZ = 0.33161256F;

		turretModel[185].addShapeBox(27F, -1F, -1F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 795
		turretModel[185].setRotationPoint(0F, -18.5F, 0F);
		turretModel[185].rotateAngleY = 1.11701072F;
		turretModel[185].rotateAngleZ = 0.33161256F;

		turretModel[186].addShapeBox(27F, -1F, -1.4F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 796
		turretModel[186].setRotationPoint(0F, -18.5F, 0F);
		turretModel[186].rotateAngleY = 1.27409035F;
		turretModel[186].rotateAngleZ = 0.33161256F;

		turretModel[187].addShapeBox(27F, -1F, -3F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 797
		turretModel[187].setRotationPoint(0F, -18.5F, 0F);
		turretModel[187].rotateAngleY = 1.46607657F;
		turretModel[187].rotateAngleZ = 0.33161256F;

		turretModel[188].addShapeBox(27F, -1.4F, -3F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 798
		turretModel[188].setRotationPoint(0F, -18.5F, 0F);
		turretModel[188].rotateAngleY = 1.46607657F;
		turretModel[188].rotateAngleZ = 0.17453293F;

		turretModel[189].addShapeBox(26.3F, -2.4F, -2F, 1, 3, 5, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 800
		turretModel[189].setRotationPoint(0F, -18.5F, 0F);
		turretModel[189].rotateAngleY = 0.59341195F;
		turretModel[189].rotateAngleZ = 0.05235988F;

		turretModel[190].addShapeBox(26.5F, -2.4F, -1F, 1, 3, 5, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 801
		turretModel[190].setRotationPoint(0F, -18.5F, 0F);
		turretModel[190].rotateAngleY = 0.78539816F;
		turretModel[190].rotateAngleZ = 0.05235988F;

		turretModel[191].addShapeBox(27F, -2.4F, -1F, 1, 3, 5, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 802
		turretModel[191].setRotationPoint(0F, -18.5F, 0F);
		turretModel[191].rotateAngleY = 0.99483767F;
		turretModel[191].rotateAngleZ = 0.05235988F;

		turretModel[192].addShapeBox(27.5F, -2.4F, -1F, 1, 3, 5, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 803
		turretModel[192].setRotationPoint(0F, -18.5F, 0F);
		turretModel[192].rotateAngleY = 1.20427718F;
		turretModel[192].rotateAngleZ = 0.05235988F;

		turretModel[193].addShapeBox(26.4F, -1F, -1F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 810
		turretModel[193].setRotationPoint(0F, -18.5F, 0F);
		turretModel[193].rotateAngleY = -0.55850536F;
		turretModel[193].rotateAngleZ = 0.33161256F;

		turretModel[194].addShapeBox(26.4F, -1F, -1F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 811
		turretModel[194].setRotationPoint(0F, -18.5F, 0F);
		turretModel[194].rotateAngleY = -0.6981317F;
		turretModel[194].rotateAngleZ = 0.33161256F;

		turretModel[195].addShapeBox(26.4F, -1F, -1F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 812
		turretModel[195].setRotationPoint(0F, -18.5F, 0F);
		turretModel[195].rotateAngleY = -0.85521133F;
		turretModel[195].rotateAngleZ = 0.33161256F;

		turretModel[196].addShapeBox(26.8F, -1F, -1F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 813
		turretModel[196].setRotationPoint(0F, -18.5F, 0F);
		turretModel[196].rotateAngleY = -1.01229097F;
		turretModel[196].rotateAngleZ = 0.33161256F;

		turretModel[197].addShapeBox(26.8F, -1F, -1F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 814
		turretModel[197].setRotationPoint(0F, -18.5F, 0F);
		turretModel[197].rotateAngleY = -1.1693706F;
		turretModel[197].rotateAngleZ = 0.33161256F;

		turretModel[198].addShapeBox(26.8F, -1F, -1F, 1, 6, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 815
		turretModel[198].setRotationPoint(0F, -18.5F, 0F);
		turretModel[198].rotateAngleY = -1.32645023F;
		turretModel[198].rotateAngleZ = 0.33161256F;

		turretModel[199].addShapeBox(26F, 4F, -3F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 816
		turretModel[199].setRotationPoint(0F, -18.5F, 0F);
		turretModel[199].rotateAngleY = -1.46607657F;
		turretModel[199].rotateAngleZ = 0.52359878F;

		turretModel[200].addShapeBox(26F, 4F, -3F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 817
		turretModel[200].setRotationPoint(0F, -18.5F, 0F);
		turretModel[200].rotateAngleY = -1.46607657F;
		turretModel[200].rotateAngleZ = 0.38397244F;

		turretModel[201].addShapeBox(26.3F, 4F, -3F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 818
		turretModel[201].setRotationPoint(0F, -18.5F, 0F);
		turretModel[201].rotateAngleY = -1.69296937F;
		turretModel[201].rotateAngleZ = 0.52359878F;

		turretModel[202].addShapeBox(26.3F, 4F, -3F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 819
		turretModel[202].setRotationPoint(0F, -18.5F, 0F);
		turretModel[202].rotateAngleY = -1.69296937F;
		turretModel[202].rotateAngleZ = 0.38397244F;

		turretModel[203].addShapeBox(22.3F, 12F, -3F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 820
		turretModel[203].setRotationPoint(0F, -18.5F, 0F);
		turretModel[203].rotateAngleY = -1.69296937F;
		turretModel[203].rotateAngleZ = 0.97738438F;

		turretModel[204].addShapeBox(18.3F, 14F, 0F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 821
		turretModel[204].setRotationPoint(0F, -18.5F, 0F);
		turretModel[204].rotateAngleY = -1.69296937F;
		turretModel[204].rotateAngleZ = 1.23918377F;

		turretModel[205].addShapeBox(16.6F, 12F, 2F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 822
		turretModel[205].setRotationPoint(0F, -18.5F, 0F);
		turretModel[205].rotateAngleY = -1.69296937F;
		turretModel[205].rotateAngleZ = 1.34390352F;

		turretModel[206].addShapeBox(14.2F, 11.5F, 2F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 823
		turretModel[206].setRotationPoint(0F, -18.5F, 0F);
		turretModel[206].rotateAngleY = -1.69296937F;
		turretModel[206].rotateAngleZ = 1.53588974F;

		turretModel[207].addShapeBox(14.2F, 8.7F, -1F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 825
		turretModel[207].setRotationPoint(0F, -18.5F, 0F);
		turretModel[207].rotateAngleY = -1.57079633F;
		turretModel[207].rotateAngleZ = 1.57079633F;

		turretModel[208].addShapeBox(14.8F, 5F, -1F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 826
		turretModel[208].setRotationPoint(0F, -18.5F, 0F);
		turretModel[208].rotateAngleY = -1.57079633F;
		turretModel[208].rotateAngleZ = 1.57079633F;

		turretModel[209].addShapeBox(14.8F, 1.4F, -1F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 827
		turretModel[209].setRotationPoint(0F, -18.5F, 0F);
		turretModel[209].rotateAngleY = -1.57079633F;
		turretModel[209].rotateAngleZ = 1.57079633F;

		turretModel[210].addShapeBox(15F, -0.8F, -1F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 828
		turretModel[210].setRotationPoint(0F, -18.5F, 0F);
		turretModel[210].rotateAngleY = -1.57079633F;
		turretModel[210].rotateAngleZ = 1.65806279F;

		turretModel[211].addShapeBox(15F, -4.2F, -1F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 829
		turretModel[211].setRotationPoint(0F, -18.5F, 0F);
		turretModel[211].rotateAngleY = -1.57079633F;
		turretModel[211].rotateAngleZ = 1.65806279F;

		turretModel[212].addShapeBox(15F, -4.2F, 4.6F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F); // Box 830
		turretModel[212].setRotationPoint(0F, -18.5F, 0F);
		turretModel[212].rotateAngleY = -1.57079633F;
		turretModel[212].rotateAngleZ = 1.65806279F;

		turretModel[213].addShapeBox(15F, -0.8F, 4.6F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F); // Box 831
		turretModel[213].setRotationPoint(0F, -18.5F, 0F);
		turretModel[213].rotateAngleY = -1.57079633F;
		turretModel[213].rotateAngleZ = 1.65806279F;

		turretModel[214].addShapeBox(14.8F, 1.4F, 4.6F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 832
		turretModel[214].setRotationPoint(0F, -18.5F, 0F);
		turretModel[214].rotateAngleY = -1.57079633F;
		turretModel[214].rotateAngleZ = 1.57079633F;

		turretModel[215].addShapeBox(14.8F, 5F, 4.4F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 833
		turretModel[215].setRotationPoint(0F, -18.5F, 0F);
		turretModel[215].rotateAngleY = -1.57079633F;
		turretModel[215].rotateAngleZ = 1.57079633F;

		turretModel[216].addShapeBox(14.2F, 8.7F, 4.2F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 1.2F, 0F, 0F); // Box 834
		turretModel[216].setRotationPoint(0F, -18.5F, 0F);
		turretModel[216].rotateAngleY = -1.57079633F;
		turretModel[216].rotateAngleZ = 1.57079633F;

		turretModel[217].addShapeBox(13.6F, 8.7F, 9.6F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, 1.2F, 0F, 0F); // Box 835
		turretModel[217].setRotationPoint(0F, -18.5F, 0F);
		turretModel[217].rotateAngleY = -1.57079633F;
		turretModel[217].rotateAngleZ = 1.57079633F;

		turretModel[218].addShapeBox(14.2F, 5F, 9.8F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.4F, 0F, 0F, 1.4F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.4F, 0F, 0F); // Box 836
		turretModel[218].setRotationPoint(0F, -18.5F, 0F);
		turretModel[218].rotateAngleY = -1.57079633F;
		turretModel[218].rotateAngleZ = 1.57079633F;

		turretModel[219].addShapeBox(14.2F, 1.4F, 10F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F); // Box 837
		turretModel[219].setRotationPoint(0F, -18.5F, 0F);
		turretModel[219].rotateAngleY = -1.57079633F;
		turretModel[219].rotateAngleZ = 1.57079633F;

		turretModel[220].addShapeBox(14.4F, -0.8F, 10F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, 1.2F, 0F, 0F); // Box 838
		turretModel[220].setRotationPoint(0F, -18.5F, 0F);
		turretModel[220].rotateAngleY = -1.57079633F;
		turretModel[220].rotateAngleZ = 1.65806279F;

		turretModel[221].addShapeBox(14.4F, -4.2F, 10F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.4F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, 2.2F, 0F, 0F); // Box 839
		turretModel[221].setRotationPoint(0F, -18.5F, 0F);
		turretModel[221].rotateAngleY = -1.57079633F;
		turretModel[221].rotateAngleZ = 1.65806279F;

		turretModel[222].addShapeBox(13.2F, 10.8F, 7.6F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 840
		turretModel[222].setRotationPoint(0F, -18.5F, 0F);
		turretModel[222].rotateAngleY = -1.69296937F;
		turretModel[222].rotateAngleZ = 1.53588974F;

		turretModel[223].addShapeBox(13.2F, 14.2F, 7.6F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 1.2F, 0F, 0F); // Box 841
		turretModel[223].setRotationPoint(0F, -18.5F, 0F);
		turretModel[223].rotateAngleY = -1.69296937F;
		turretModel[223].rotateAngleZ = 1.53588974F;

		turretModel[224].addShapeBox(12.2F, 18.2F, 6.6F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -1.7F, 0F, 0F, 2.2F, 0F, 0F); // Box 842
		turretModel[224].setRotationPoint(0F, -18.5F, 0F);
		turretModel[224].rotateAngleY = -1.69296937F;
		turretModel[224].rotateAngleZ = 1.53588974F;

		turretModel[225].addShapeBox(12F, 8.7F, 15F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.8F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -2.6F, 0F, 0F, 2.2F, 0F, 0F); // Box 843
		turretModel[225].setRotationPoint(0F, -18.5F, 0F);
		turretModel[225].rotateAngleY = -1.57079633F;
		turretModel[225].rotateAngleZ = 1.57079633F;

		turretModel[226].addShapeBox(12.6F, 5F, 15.2F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -2.3F, 0F, 0F, 2.4F, 0F, 0F); // Box 844
		turretModel[226].setRotationPoint(0F, -18.5F, 0F);
		turretModel[226].rotateAngleY = -1.57079633F;
		turretModel[226].rotateAngleZ = 1.57079633F;

		turretModel[227].addShapeBox(11.8F, 14.5F, 13.6F, 1, 3, 4, 0F,0.2F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.7F, 0F, 0F, 2.2F, 0F, 0F); // Box 845
		turretModel[227].setRotationPoint(0F, -18.5F, 0F);
		turretModel[227].rotateAngleY = -1.69296937F;
		turretModel[227].rotateAngleZ = 1.53588974F;

		turretModel[228].addShapeBox(12.6F, 10.8F, 13.6F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.7F, 0F, 0F, -1.8F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0.7F, 0F, 0F, -2F, 0F, 0F, 2.2F, 0F, 0F); // Box 847
		turretModel[228].setRotationPoint(0F, -18.5F, 0F);
		turretModel[228].rotateAngleX = 0.03490659F;
		turretModel[228].rotateAngleY = -1.69296937F;
		turretModel[228].rotateAngleZ = 1.53588974F;

		turretModel[229].addShapeBox(12.6F, 1.4F, 15.2F, 1, 3, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 2.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 2.4F, 0F, 0F); // Box 848
		turretModel[229].setRotationPoint(0F, -18.5F, 0F);
		turretModel[229].rotateAngleY = -1.57079633F;
		turretModel[229].rotateAngleZ = 1.57079633F;

		turretModel[230].addShapeBox(12.6F, -2F, 15.2F, 1, 3, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 2.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 2.4F, 0F, 0F); // Box 849
		turretModel[230].setRotationPoint(0F, -18.5F, 0F);
		turretModel[230].rotateAngleY = -1.57079633F;
		turretModel[230].rotateAngleZ = 1.57079633F;

		turretModel[231].addShapeBox(12.6F, -5.2F, 15.2F, 1, 3, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 2.4F, 0F, 0F); // Box 850
		turretModel[231].setRotationPoint(0F, -18.5F, 0F);
		turretModel[231].rotateAngleY = -1.57079633F;
		turretModel[231].rotateAngleZ = 1.57079633F;

		turretModel[232].addShapeBox(13.4F, -7.6F, 14F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.6F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, 2.2F, 0F, 0F); // Box 851
		turretModel[232].setRotationPoint(0F, -18.5F, 0F);
		turretModel[232].rotateAngleY = -1.57079633F;
		turretModel[232].rotateAngleZ = 1.65806279F;

		turretModel[233].addShapeBox(12.8F, -11.6F, 15.5F, 1, 3, 5, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2.2F, 0F, 0F); // Box 852
		turretModel[233].setRotationPoint(0F, -18.5F, 0F);
		turretModel[233].rotateAngleY = -1.57079633F;
		turretModel[233].rotateAngleZ = 1.65806279F;

		turretModel[234].addShapeBox(11.8F, -7F, 20F, 1, 3, 2, 0F,1.2F, 0F, 0F, -0.8F, 0F, 0F, -1.6F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 0F, 0F, -1F, 0F, 0F, -1.6F, 0F, 0F, 2.2F, 0F, 0F); // Box 853
		turretModel[234].setRotationPoint(0F, -18.5F, 0F);
		turretModel[234].rotateAngleY = -1.57079633F;
		turretModel[234].rotateAngleZ = 1.65806279F;

		turretModel[235].addShapeBox(9.8F, 5F, 20.9F, 1, 3, 2, 0F,1.2F, 0F, 0F, -0.8F, 0F, 0F, -1.6F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3.2F, 0F, 0F); // Box 854
		turretModel[235].setRotationPoint(0F, -18.5F, 0F);
		turretModel[235].rotateAngleY = -1.57079633F;
		turretModel[235].rotateAngleZ = 1.65806279F;

		turretModel[236].addShapeBox(15F, -15.2F, 4.8F, 1, 3, 5, 0F,1.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F); // Box 855
		turretModel[236].setRotationPoint(0F, -18.5F, 0F);
		turretModel[236].rotateAngleY = -1.57079633F;
		turretModel[236].rotateAngleZ = 1.65806279F;

		turretModel[237].addShapeBox(15F, -15.2F, -0.6F, 1, 3, 5, 0F,1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 856
		turretModel[237].setRotationPoint(0F, -18.5F, 0F);
		turretModel[237].rotateAngleY = -1.57079633F;
		turretModel[237].rotateAngleZ = 1.65806279F;

		turretModel[238].addShapeBox(15F, -15.2F, -5F, 1, 3, 4, 0F,1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 857
		turretModel[238].setRotationPoint(0F, -18.5F, 0F);
		turretModel[238].rotateAngleY = -1.57079633F;
		turretModel[238].rotateAngleZ = 1.65806279F;

		turretModel[239].addShapeBox(14F, -15.2F, 10.8F, 1, 3, 5, 0F,1.2F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, 2.2F, 0F, 0F); // Box 858
		turretModel[239].setRotationPoint(0F, -18.5F, 0F);
		turretModel[239].rotateAngleY = -1.57079633F;
		turretModel[239].rotateAngleZ = 1.65806279F;

		turretModel[240].addShapeBox(13.7F, -18.6F, 10.8F, 1, 3, 5, 0F,1.2F, 0F, 0F, -0.4F, 0F, 0F, -2.4F, 0F, 0F, 3.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, 2.2F, 0F, 0F); // Box 859
		turretModel[240].setRotationPoint(0F, -18.5F, 0F);
		turretModel[240].rotateAngleY = -1.57079633F;
		turretModel[240].rotateAngleZ = 1.65806279F;

		turretModel[241].addShapeBox(14.6F, -19.2F, 4.8F, 1, 3, 5, 0F,1.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 2.2F, 0F, 0F); // Box 861
		turretModel[241].setRotationPoint(0F, -18.5F, 0F);
		turretModel[241].rotateAngleY = -1.57079633F;
		turretModel[241].rotateAngleZ = 1.65806279F;

		turretModel[242].addShapeBox(14.6F, -19.2F, -0.6F, 1, 3, 5, 0F,1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.2F, 0F, 0F); // Box 862
		turretModel[242].setRotationPoint(0F, -18.5F, 0F);
		turretModel[242].rotateAngleY = -1.57079633F;
		turretModel[242].rotateAngleZ = 1.65806279F;

		turretModel[243].addShapeBox(14.6F, -19.2F, -5F, 1, 3, 4, 0F,1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.2F, 0F, 0F); // Box 863
		turretModel[243].setRotationPoint(0F, -18.5F, 0F);
		turretModel[243].rotateAngleY = -1.57079633F;
		turretModel[243].rotateAngleZ = 1.65806279F;

		turretModel[244].addShapeBox(13F, -21.8F, 5.8F, 1, 2, 5, 0F,1.2F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 2.2F, 0F, 0F); // Box 864
		turretModel[244].setRotationPoint(0F, -18.5F, 0F);
		turretModel[244].rotateAngleY = -1.57079633F;
		turretModel[244].rotateAngleZ = 1.65806279F;

		turretModel[245].addShapeBox(13.6F, -22.6F, 0.4F, 1, 3, 5, 0F,1.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.2F, 0F, 0F); // Box 865
		turretModel[245].setRotationPoint(0F, -18.5F, 0F);
		turretModel[245].rotateAngleY = -1.57079633F;
		turretModel[245].rotateAngleZ = 1.65806279F;

		turretModel[246].addShapeBox(13.6F, -23.6F, -5.6F, 1, 3, 5, 0F,1.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.2F, 0F, 0F); // Box 866
		turretModel[246].setRotationPoint(0F, -18.5F, 0F);
		turretModel[246].rotateAngleY = -1.57079633F;
		turretModel[246].rotateAngleZ = 1.65806279F;

		turretModel[247].addShapeBox(26.3F, -2.4F, -2F, 1, 3, 5, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 867
		turretModel[247].setRotationPoint(0F, -18.5F, 0F);
		turretModel[247].rotateAngleY = -0.59341195F;
		turretModel[247].rotateAngleZ = 0.05235988F;

		turretModel[248].addShapeBox(26.3F, -2.4F, -2F, 1, 3, 5, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 868
		turretModel[248].setRotationPoint(0F, -18.5F, 0F);
		turretModel[248].rotateAngleY = -0.83775804F;
		turretModel[248].rotateAngleZ = 0.05235988F;

		turretModel[249].addShapeBox(26.3F, -2.4F, -2F, 1, 3, 5, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 869
		turretModel[249].setRotationPoint(0F, -18.5F, 0F);
		turretModel[249].rotateAngleY = -1.06465084F;
		turretModel[249].rotateAngleZ = 0.05235988F;

		turretModel[250].addShapeBox(26.3F, -2.4F, -2F, 1, 3, 5, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 870
		turretModel[250].setRotationPoint(0F, -18.5F, 0F);
		turretModel[250].rotateAngleY = -1.29154365F;
		turretModel[250].rotateAngleZ = 0.05235988F;

		turretModel[251].addShapeBox(-3.8F, -9.5F, 5F, 2, 8, 26, 0F,1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 1F, -3F, 0F, 1F); // Box 871
		turretModel[251].setRotationPoint(0F, -19.5F, 0F);

		turretModel[252].addShapeBox(-0.2F, -6F, 28.3F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 872
		turretModel[252].setRotationPoint(0F, -18.5F, 0F);

		turretModel[253].addShapeBox(-1.2F, -8F, 27.6F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 873
		turretModel[253].setRotationPoint(0F, -18.5F, 0F);

		turretModel[254].addShapeBox(-1.2F, -8F, 29.2F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 874
		turretModel[254].setRotationPoint(0F, -18.5F, 0F);

		turretModel[255].addShapeBox(-1.2F, -8F, 30.79F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 875
		turretModel[255].setRotationPoint(0F, -18.5F, 0F);

		turretModel[256].addShapeBox(-2.4F, -11.4F, 29.6F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 876
		turretModel[256].setRotationPoint(0F, -18.5F, 0F);

		turretModel[257].addShapeBox(-2.4F, -11.4F, 28.01F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 877
		turretModel[257].setRotationPoint(0F, -18.5F, 0F);

		turretModel[258].addShapeBox(-2.4F, -11.4F, 26.41F, 1, 3, 1, 0F,-2F, 0F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, -2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 878
		turretModel[258].setRotationPoint(0F, -18.5F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 315
		barrelModel[1] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 317
		barrelModel[2] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 318
		barrelModel[3] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 319
		barrelModel[4] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 322
		barrelModel[5] = new ModelRendererTurbo(this, 785, 241, textureX, textureY); // Box 323
		barrelModel[6] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 324
		barrelModel[7] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Box 325
		barrelModel[8] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 327
		barrelModel[9] = new ModelRendererTurbo(this, 873, 169, textureX, textureY); // Box 328
		barrelModel[10] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 329
		barrelModel[11] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 330
		barrelModel[12] = new ModelRendererTurbo(this, 953, 169, textureX, textureY); // Box 331
		barrelModel[13] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 363
		barrelModel[14] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Box 365

		barrelModel[0].addShapeBox(-4F, 0F, -3F, 5, 2, 6, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 315
		barrelModel[0].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[1].addShapeBox(-4F, -2F, -3F, 5, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 317
		barrelModel[1].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[2].addShapeBox(-4F, -3F, -2F, 5, 1, 4, 0F,0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 318
		barrelModel[2].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[3].addShapeBox(-4F, 2F, -2F, 5, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F); // Box 319
		barrelModel[3].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[4].addShapeBox(1F, -1.5F, -2.5F, 93, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 322
		barrelModel[4].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[5].addShapeBox(1F, -2.5F, -2F, 93, 1, 4, 0F,0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 323
		barrelModel[5].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[6].addShapeBox(1F, 1.6F, -2F, 93, 1, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 324
		barrelModel[6].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[7].addShapeBox(1F, 0.6F, -2.5F, 93, 1, 5, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 325
		barrelModel[7].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[8].addShapeBox(1F, -0.4F, -2.5F, 93, 1, 5, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 327
		barrelModel[8].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[9].addShapeBox(47F, -3F, -2F, 19, 1, 4, 0F,0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 328
		barrelModel[9].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[10].addShapeBox(47F, -2F, -3F, 19, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 329
		barrelModel[10].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[11].addShapeBox(47F, 0F, -3F, 19, 2, 6, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 330
		barrelModel[11].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[12].addShapeBox(47F, 2F, -2F, 19, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F); // Box 331
		barrelModel[12].setRotationPoint(28F, -23.7F, 0.2F);

		barrelModel[13].addShapeBox(2.5F, -1F, 0.75F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 363
		barrelModel[13].setRotationPoint(-3F, -41F, -13.25F);

		barrelModel[14].addShapeBox(-1.8F, -0.9F, -1.65F, 2, 2, 1, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 365
		barrelModel[14].setRotationPoint(-3F, -41.2F, -13.25F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 203
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 204
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 205
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 31
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 32
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 33
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 34
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 35
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 36
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 37
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 38
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 39
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Box 40
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 41
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 42
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 43
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 44
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Box 45
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 67
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 68
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Box 69
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 76
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 77
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 78

		leftTrackWheelModels[0].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		leftTrackWheelModels[0].setRotationPoint(28.5F, 2F, 28.2F);

		leftTrackWheelModels[1].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftTrackWheelModels[1].setRotationPoint(28.5F, 2F, 28.2F);

		leftTrackWheelModels[2].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 205
		leftTrackWheelModels[2].setRotationPoint(28.5F, 2F, 28.2F);

		leftTrackWheelModels[3].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		leftTrackWheelModels[3].setRotationPoint(46.5F, 2F, 28.2F);

		leftTrackWheelModels[4].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		leftTrackWheelModels[4].setRotationPoint(46.5F, 2F, 28.2F);

		leftTrackWheelModels[5].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 33
		leftTrackWheelModels[5].setRotationPoint(46.5F, 2F, 28.2F);

		leftTrackWheelModels[6].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[6].setRotationPoint(11.5F, 2F, 28.2F);

		leftTrackWheelModels[7].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		leftTrackWheelModels[7].setRotationPoint(11.5F, 2F, 28.2F);

		leftTrackWheelModels[8].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 36
		leftTrackWheelModels[8].setRotationPoint(11.5F, 2F, 28.2F);

		leftTrackWheelModels[9].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftTrackWheelModels[9].setRotationPoint(-5.5F, 2F, 28.2F);

		leftTrackWheelModels[10].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		leftTrackWheelModels[10].setRotationPoint(-5.5F, 2F, 28.2F);

		leftTrackWheelModels[11].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 39
		leftTrackWheelModels[11].setRotationPoint(-5.5F, 2F, 28.2F);

		leftTrackWheelModels[12].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		leftTrackWheelModels[12].setRotationPoint(-23.5F, 2F, 28.2F);

		leftTrackWheelModels[13].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftTrackWheelModels[13].setRotationPoint(-23.5F, 2F, 28.2F);

		leftTrackWheelModels[14].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 42
		leftTrackWheelModels[14].setRotationPoint(-23.5F, 2F, 28.2F);

		leftTrackWheelModels[15].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftTrackWheelModels[15].setRotationPoint(-40.5F, 2F, 28.2F);

		leftTrackWheelModels[16].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		leftTrackWheelModels[16].setRotationPoint(-40.5F, 2F, 28.2F);

		leftTrackWheelModels[17].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 45
		leftTrackWheelModels[17].setRotationPoint(-40.5F, 2F, 28.2F);

		leftTrackWheelModels[18].addShapeBox(-7F, 0.8F, -5F, 13, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 67
		leftTrackWheelModels[18].setRotationPoint(60F, -4F, 29.2F);

		leftTrackWheelModels[19].addShapeBox(-6.5F, -2F, -5F, 13, 3, 10, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 68
		leftTrackWheelModels[19].setRotationPoint(59.5F, -4.5F, 29.2F);

		leftTrackWheelModels[20].addShapeBox(-7F, -6.8F, -5F, 13, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		leftTrackWheelModels[20].setRotationPoint(60F, -4F, 29.2F);

		leftTrackWheelModels[21].addShapeBox(-7F, 0.8F, -5F, 13, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 76
		leftTrackWheelModels[21].setRotationPoint(-55F, -2.5F, 29.2F);

		leftTrackWheelModels[22].addShapeBox(-6.5F, -2F, -5F, 13, 3, 10, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 77
		leftTrackWheelModels[22].setRotationPoint(-55.5F, -3F, 29.2F);

		leftTrackWheelModels[23].addShapeBox(-7F, -6.8F, -5F, 13, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		leftTrackWheelModels[23].setRotationPoint(-55F, -2.5F, 29.2F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 46
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 47
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 48
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 49
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 50
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 51
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 52
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 53
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 54
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 55
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 56
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 57
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 58
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 969, 89, textureX, textureY); // Box 59
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 60
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 61
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 62
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 63
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 70
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 865, 97, textureX, textureY); // Box 71
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 72
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 73
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 74
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 75

		rightTrackWheelModels[0].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		rightTrackWheelModels[0].setRotationPoint(-40.5F, 2F, -29.8F);

		rightTrackWheelModels[1].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightTrackWheelModels[1].setRotationPoint(-40.5F, 2F, -29.8F);

		rightTrackWheelModels[2].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 48
		rightTrackWheelModels[2].setRotationPoint(-40.5F, 2F, -29.8F);

		rightTrackWheelModels[3].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightTrackWheelModels[3].setRotationPoint(-23.5F, 2F, -29.8F);

		rightTrackWheelModels[4].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rightTrackWheelModels[4].setRotationPoint(-23.5F, 2F, -29.8F);

		rightTrackWheelModels[5].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 51
		rightTrackWheelModels[5].setRotationPoint(-23.5F, 2F, -29.8F);

		rightTrackWheelModels[6].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 52
		rightTrackWheelModels[6].setRotationPoint(-5.5F, 2F, -29.8F);

		rightTrackWheelModels[7].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightTrackWheelModels[7].setRotationPoint(-5.5F, 2F, -29.8F);

		rightTrackWheelModels[8].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightTrackWheelModels[8].setRotationPoint(-5.5F, 2F, -29.8F);

		rightTrackWheelModels[9].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightTrackWheelModels[9].setRotationPoint(11.5F, 2F, -29.8F);

		rightTrackWheelModels[10].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightTrackWheelModels[10].setRotationPoint(11.5F, 2F, -29.8F);

		rightTrackWheelModels[11].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 57
		rightTrackWheelModels[11].setRotationPoint(11.5F, 2F, -29.8F);

		rightTrackWheelModels[12].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightTrackWheelModels[12].setRotationPoint(28.5F, 2F, -29.8F);

		rightTrackWheelModels[13].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightTrackWheelModels[13].setRotationPoint(28.5F, 2F, -29.8F);

		rightTrackWheelModels[14].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 60
		rightTrackWheelModels[14].setRotationPoint(28.5F, 2F, -29.8F);

		rightTrackWheelModels[15].addShapeBox(-7F, 2F, -4F, 14, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 61
		rightTrackWheelModels[15].setRotationPoint(46.5F, 2F, -29.8F);

		rightTrackWheelModels[16].addShapeBox(-7F, -2F, -4F, 14, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightTrackWheelModels[16].setRotationPoint(46.5F, 2F, -29.8F);

		rightTrackWheelModels[17].addShapeBox(-7F, -7F, -4F, 14, 5, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		rightTrackWheelModels[17].setRotationPoint(46.5F, 2F, -29.8F);

		rightTrackWheelModels[18].addShapeBox(-7F, 0.8F, -5F, 13, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 70
		rightTrackWheelModels[18].setRotationPoint(60F, -4F, -28.8F);

		rightTrackWheelModels[19].addShapeBox(-6.5F, -2F, -5F, 13, 3, 10, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 71
		rightTrackWheelModels[19].setRotationPoint(59.5F, -4.5F, -28.8F);

		rightTrackWheelModels[20].addShapeBox(-7F, -6.8F, -5F, 13, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		rightTrackWheelModels[20].setRotationPoint(60F, -4F, -28.8F);

		rightTrackWheelModels[21].addShapeBox(-7F, 0.8F, -5F, 13, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 73
		rightTrackWheelModels[21].setRotationPoint(-55F, -2.5F, -28.8F);

		rightTrackWheelModels[22].addShapeBox(-6.5F, -2F, -5F, 13, 3, 10, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 74
		rightTrackWheelModels[22].setRotationPoint(-55.5F, -3F, -28.8F);

		rightTrackWheelModels[23].addShapeBox(-7F, -6.8F, -5F, 13, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		rightTrackWheelModels[23].setRotationPoint(-55F, -2.5F, -28.8F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 8
		leftTrackModel[1] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 9
		leftTrackModel[2] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 10
		leftTrackModel[3] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 11
		leftTrackModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 12
		leftTrackModel[5] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 13
		leftTrackModel[6] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 14
		leftTrackModel[7] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 15
		leftTrackModel[8] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 16
		leftTrackModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17

		leftTrackModel[0].addBox(0F, 0F, 0F, 91, 1, 13, 0F); // Box 8
		leftTrackModel[0].setRotationPoint(-31F, -12F, 22.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 28, 1, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 9
		leftTrackModel[1].setRotationPoint(-59F, -12F, 22.5F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 92, 1, 13, 0F); // Box 10
		leftTrackModel[2].setRotationPoint(-43F, 9F, 22.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 17, 1, 13, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 11
		leftTrackModel[3].setRotationPoint(-60F, 9F, 22.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Box 12
		leftTrackModel[4].setRotationPoint(-63F, 1F, 22.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackModel[5].setRotationPoint(-63F, -4F, 22.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 15, 1, 13, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 14
		leftTrackModel[6].setRotationPoint(49F, 9F, 22.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 15
		leftTrackModel[7].setRotationPoint(64F, -5F, 22.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Box 16
		leftTrackModel[8].setRotationPoint(64F, 0F, 22.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 17
		leftTrackModel[9].setRotationPoint(60F, -12F, 22.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 18
		rightTrackModel[1] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 19
		rightTrackModel[2] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 20
		rightTrackModel[3] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 21
		rightTrackModel[4] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 22
		rightTrackModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 23
		rightTrackModel[6] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Box 24
		rightTrackModel[7] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 25
		rightTrackModel[8] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 26
		rightTrackModel[9] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 27

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 18
		rightTrackModel[0].setRotationPoint(64F, -5F, -35.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		rightTrackModel[1].setRotationPoint(60F, -12F, -35.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Box 20
		rightTrackModel[2].setRotationPoint(64F, 0F, -35.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 15, 1, 13, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 21
		rightTrackModel[3].setRotationPoint(49F, 9F, -35.5F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 92, 1, 13, 0F); // Box 22
		rightTrackModel[4].setRotationPoint(-43F, 9F, -35.5F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 91, 1, 13, 0F); // Box 23
		rightTrackModel[5].setRotationPoint(-31F, -12F, -35.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 28, 1, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 24
		rightTrackModel[6].setRotationPoint(-59F, -12F, -35.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 25
		rightTrackModel[7].setRotationPoint(-63F, -4F, -35.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Box 26
		rightTrackModel[8].setRotationPoint(-63F, 1F, -35.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 17, 1, 13, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 27
		rightTrackModel[9].setRotationPoint(-60F, 9F, -35.5F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[9];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 374
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 375
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 376
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 377
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 378
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 379
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 380
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 399
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 400

		gun_1_Model[0][0].addShapeBox(-1.5F, 0F, 0.7F, 3, 5, 1, 0F,-1F, 0.2F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -1F, 0.2F, -0.2F, 1F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, 1F, -0.2F, -0.2F); // Box 374

		gun_1_Model[0][1].addShapeBox(-1.5F, 0F, -1.7F, 3, 5, 1, 0F,-1F, 0.2F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -1F, 0.2F, -0.2F, 1F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, 1F, -0.2F, -0.2F); // Box 375

		gun_1_Model[0][2].addShapeBox(-3.5F, 4F, -2.5F, 3, 1, 2, 0F,-0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 376

		gun_1_Model[0][3].addShapeBox(-2F, -0.8F, 0.8F, 2, 3, 1, 0F,0F, 0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 1.2F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 1.2F, -0.2F); // Box 377

		gun_1_Model[0][4].addShapeBox(-2F, -0.8F, -1.8F, 2, 3, 1, 0F,0F, 0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 1.2F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 1.2F, -0.2F); // Box 378

		gun_1_Model[0][5].addShapeBox(-3F, -0.8F, 0.8F, 1, 3, 1, 0F,-0.3F, -1.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.3F, -1.2F, -0.2F, -0.4F, 0F, -0.2F, 0F, 1.2F, -0.2F, 0F, 1.2F, -0.2F, -0.4F, 0F, -0.2F); // Box 379

		gun_1_Model[0][6].addShapeBox(-3F, -0.8F, -1.8F, 1, 3, 1, 0F,-0.3F, -1.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.3F, -1.2F, -0.2F, -0.4F, 0F, -0.2F, 0F, 1.2F, -0.2F, 0F, 1.2F, -0.2F, -0.4F, 0F, -0.2F); // Box 380

		gun_1_Model[0][7].addShapeBox(-3.5F, 4F, 0.5F, 3, 1, 2, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F); // Box 399

		gun_1_Model[0][8].addShapeBox(-3.5F, 4F, -1F, 3, 1, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 400

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(-3F, -41F, -13.2F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[39];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 601, 153, textureX, textureY); // Box 356
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 357
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 358
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 359
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 360
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 361
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 362
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Box 364
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 366
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 367
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 368
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 369
		gun_1_Model[2][12] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 370
		gun_1_Model[2][13] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 371
		gun_1_Model[2][14] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 372
		gun_1_Model[2][15] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 373
		gun_1_Model[2][16] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 381
		gun_1_Model[2][17] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Box 382
		gun_1_Model[2][18] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 383
		gun_1_Model[2][19] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 384
		gun_1_Model[2][20] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 385
		gun_1_Model[2][21] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 386
		gun_1_Model[2][22] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 387
		gun_1_Model[2][23] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 388
		gun_1_Model[2][24] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 389
		gun_1_Model[2][25] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 390
		gun_1_Model[2][26] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 391
		gun_1_Model[2][27] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 392
		gun_1_Model[2][28] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 393
		gun_1_Model[2][29] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Box 394
		gun_1_Model[2][30] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 395
		gun_1_Model[2][31] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 396
		gun_1_Model[2][32] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 397
		gun_1_Model[2][33] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 398
		gun_1_Model[2][34] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 401
		gun_1_Model[2][35] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 402
		gun_1_Model[2][36] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 403
		gun_1_Model[2][37] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 404
		gun_1_Model[2][38] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 405

		gun_1_Model[2][0].addShapeBox(-2F, -1F, -1F, 13, 3, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.4F, -0.05F, 0F, -0.4F, -0.05F, 0F, -0.4F, -0.05F, 0F, -0.4F, -0.05F); // Box 356

		gun_1_Model[2][1].addShapeBox(2F, -2F, -1F, 4, 1, 2, 0F,0F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0.4F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.4F, 0F, 0.3F); // Box 357

		gun_1_Model[2][2].addShapeBox(6.5F, -2F, -1F, 1, 1, 2, 0F,0F, -0.2F, 0.3F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, 0.3F, 0F, 0F, 0.3F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, 0F, 0.3F); // Box 358

		gun_1_Model[2][3].addShapeBox(2F, -2F, -2.1F, 3, 1, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.4F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0.4F, 0F, -0.2F); // Box 359

		gun_1_Model[2][4].addShapeBox(-2F, -0.9F, -1.6F, 13, 1, 1, 0F,0F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, 0.1F, -0.35F, -0.4F, 0.1F, -0.35F, 0F, 0.1F, -0.35F, 0F, 0.1F, -0.35F); // Box 360

		gun_1_Model[2][5].addShapeBox(0F, 0.1F, -1.6F, 9, 1, 1, 0F,-0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F); // Box 361

		gun_1_Model[2][6].addShapeBox(9F, 0.1F, -1.6F, 2, 1, 1, 0F,0F, -0.1F, -0.1F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, -0.1F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, 0F, 0.1F, -0.1F); // Box 362

		gun_1_Model[2][7].addShapeBox(11F, 0F, -1F, 1, 2, 2, 0F,0F, 0.1F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, 0F, 0.1F, -0.05F, 0F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F, 0F, -0.4F, -0.05F); // Box 364

		gun_1_Model[2][8].addShapeBox(-1.5F, -2F, -1F, 1, 1, 2, 0F,-0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F); // Box 366

		gun_1_Model[2][9].addShapeBox(-0.5F, -2F, -1F, 2, 1, 2, 0F,0.3F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, 0.3F, -0.5F, -0.6F, 0.3F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, 0.3F, 0F, -0.6F); // Box 367

		gun_1_Model[2][10].addShapeBox(0F, -0.8F, 0.4F, 3, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 368

		gun_1_Model[2][11].addShapeBox(0F, 0F, 0.8F, 3, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -0.6F, 0F, -0.2F); // Box 369

		gun_1_Model[2][12].addShapeBox(-1.35F, 1.2F, 0.6F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 370

		gun_1_Model[2][13].addShapeBox(10.65F, 0.4F, 0.35F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 371

		gun_1_Model[2][14].addShapeBox(-1.35F, 1.2F, -1.6F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 372

		gun_1_Model[2][15].addShapeBox(10.65F, 0.4F, -1.45F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 373

		gun_1_Model[2][16].addShapeBox(11F, -0.8F, -0.5F, 20, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 381

		gun_1_Model[2][17].addShapeBox(11F, 0.3F, -0.5F, 8, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 382

		gun_1_Model[2][18].addShapeBox(19.5F, 0.3F, -0.5F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 383

		gun_1_Model[2][19].addShapeBox(18.5F, 0.3F, -0.5F, 2, 1, 1, 0F,0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F); // Box 384

		gun_1_Model[2][20].addShapeBox(17.9F, -0.8F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 385

		gun_1_Model[2][21].addShapeBox(31F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 386

		gun_1_Model[2][22].addShapeBox(32F, -0.8F, -0.5F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 1F, 0.05F, 0.05F, 1F, 0.05F, 0.05F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 1F, 0.05F, 0.05F, 1F, 0.05F, 0.05F, 0F, -0.15F, -0.15F); // Box 387

		gun_1_Model[2][23].addShapeBox(2F, -1.5F, -9.6F, 4, 5, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388

		gun_1_Model[2][24].addShapeBox(2F, -1.5F, -9.6F, 4, 1, 8, 0F,0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 389

		gun_1_Model[2][25].addShapeBox(29F, -0.8F, -0.5F, 2, 1, 1, 0F,0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 390

		gun_1_Model[2][26].addShapeBox(24.9F, -2.4F, -0.5F, 1, 2, 1, 0F,-0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 391

		gun_1_Model[2][27].addShapeBox(24.9F, -0.8F, -0.5F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 392

		gun_1_Model[2][28].addShapeBox(24.9F, -3.6F, -0.95F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 393

		gun_1_Model[2][29].addShapeBox(24.9F, -3.2F, -0.15F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.52F, -0.2F, -0.4F, -0.52F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 394

		gun_1_Model[2][30].addShapeBox(24.9F, -3.2F, -0.85F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.52F, -0.2F, -0.4F, -0.52F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 395

		gun_1_Model[2][31].addShapeBox(24.9F, -3.6F, -0.05F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 396

		gun_1_Model[2][32].addShapeBox(24.9F, -3.15F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.15F, -0.42F, -0.4F, -0.15F, -0.42F, -0.4F, -0.15F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F); // Box 397

		gun_1_Model[2][33].addShapeBox(2F, -0.7F, 0.4F, 1, 1, 3, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 398

		gun_1_Model[2][34].addShapeBox(0.5F, -4F, -1.8F, 1, 5, 1, 0F,-0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 401

		gun_1_Model[2][35].addShapeBox(0.5F, -5.6F, -2.8F, 1, 2, 1, 0F,-0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 402

		gun_1_Model[2][36].addShapeBox(0.5F, -4F, -2.2F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F); // Box 403

		gun_1_Model[2][37].addShapeBox(0.3F, -6F, -3F, 3, 2, 1, 0F,-0.1F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 404

		gun_1_Model[2][38].addShapeBox(0.3F, -6F, -2.6F, 3, 2, 1, 0F,-0.1F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -1F, -0.6F, -0.4F, -0.6F, -0.6F, -0.4F, -0.1F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -1F, -0.6F, -0.4F, -0.6F, -0.6F, -0.4F); // Box 405

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(-3F, -41F, -13.2F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);
	}
}