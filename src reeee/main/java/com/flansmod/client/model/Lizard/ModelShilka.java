//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.01.2017 - 11:26:56
// Last changed on: 20.01.2017 - 11:26:56

package com.flansmod.client.model.Lizard; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelShilka extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelShilka() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[242];
		turretModel = new ModelRendererTurbo[125];
		barrelModel = new ModelRendererTurbo[34];
		leftTrackWheelModels = new ModelRendererTurbo[192];
		rightTrackWheelModels = new ModelRendererTurbo[192];
		leftTrackModel = new ModelRendererTurbo[36];
		rightTrackModel = new ModelRendererTurbo[36];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 1329, 25, textureX, textureY); // Box 313
		bodyModel[5] = new ModelRendererTurbo(this, 1361, 25, textureX, textureY); // Box 314
		bodyModel[6] = new ModelRendererTurbo(this, 1385, 25, textureX, textureY); // Box 315
		bodyModel[7] = new ModelRendererTurbo(this, 1409, 25, textureX, textureY); // Box 510
		bodyModel[8] = new ModelRendererTurbo(this, 1457, 25, textureX, textureY); // Box 511
		bodyModel[9] = new ModelRendererTurbo(this, 1481, 25, textureX, textureY); // Box 512
		bodyModel[10] = new ModelRendererTurbo(this, 1505, 25, textureX, textureY); // Box 513
		bodyModel[11] = new ModelRendererTurbo(this, 1529, 25, textureX, textureY); // Box 514
		bodyModel[12] = new ModelRendererTurbo(this, 1553, 25, textureX, textureY); // Box 515
		bodyModel[13] = new ModelRendererTurbo(this, 1577, 25, textureX, textureY); // Box 516
		bodyModel[14] = new ModelRendererTurbo(this, 1993, 25, textureX, textureY); // Box 517
		bodyModel[15] = new ModelRendererTurbo(this, 1769, 33, textureX, textureY); // Box 518
		bodyModel[16] = new ModelRendererTurbo(this, 1929, 33, textureX, textureY); // Box 519
		bodyModel[17] = new ModelRendererTurbo(this, 1953, 33, textureX, textureY); // Box 520
		bodyModel[18] = new ModelRendererTurbo(this, 2033, 33, textureX, textureY); // Box 521
		bodyModel[19] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 522
		bodyModel[20] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 523
		bodyModel[21] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 524
		bodyModel[22] = new ModelRendererTurbo(this, 1417, 41, textureX, textureY); // Box 525
		bodyModel[23] = new ModelRendererTurbo(this, 1433, 41, textureX, textureY); // Box 526
		bodyModel[24] = new ModelRendererTurbo(this, 1449, 41, textureX, textureY); // Box 527
		bodyModel[25] = new ModelRendererTurbo(this, 1465, 41, textureX, textureY); // Box 528
		bodyModel[26] = new ModelRendererTurbo(this, 1481, 41, textureX, textureY); // Box 529
		bodyModel[27] = new ModelRendererTurbo(this, 1497, 41, textureX, textureY); // Box 530
		bodyModel[28] = new ModelRendererTurbo(this, 1513, 41, textureX, textureY); // Box 531
		bodyModel[29] = new ModelRendererTurbo(this, 1529, 41, textureX, textureY); // Box 532
		bodyModel[30] = new ModelRendererTurbo(this, 1545, 41, textureX, textureY); // Box 533
		bodyModel[31] = new ModelRendererTurbo(this, 1561, 41, textureX, textureY); // Box 534
		bodyModel[32] = new ModelRendererTurbo(this, 1577, 41, textureX, textureY); // Box 535
		bodyModel[33] = new ModelRendererTurbo(this, 1593, 41, textureX, textureY); // Box 536
		bodyModel[34] = new ModelRendererTurbo(this, 1609, 41, textureX, textureY); // Box 537
		bodyModel[35] = new ModelRendererTurbo(this, 1625, 41, textureX, textureY); // Box 538
		bodyModel[36] = new ModelRendererTurbo(this, 1641, 41, textureX, textureY); // Box 539
		bodyModel[37] = new ModelRendererTurbo(this, 1657, 41, textureX, textureY); // Box 540
		bodyModel[38] = new ModelRendererTurbo(this, 1673, 41, textureX, textureY); // Box 541
		bodyModel[39] = new ModelRendererTurbo(this, 1689, 41, textureX, textureY); // Box 542
		bodyModel[40] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 543
		bodyModel[41] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 544
		bodyModel[42] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 545
		bodyModel[43] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 546
		bodyModel[44] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 547
		bodyModel[45] = new ModelRendererTurbo(this, 1025, 1, textureX, textureY); // Box 548
		bodyModel[46] = new ModelRendererTurbo(this, 1041, 1, textureX, textureY); // Box 549
		bodyModel[47] = new ModelRendererTurbo(this, 1057, 1, textureX, textureY); // Box 550
		bodyModel[48] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 551
		bodyModel[49] = new ModelRendererTurbo(this, 1089, 1, textureX, textureY); // Box 552
		bodyModel[50] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Box 553
		bodyModel[51] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 554
		bodyModel[52] = new ModelRendererTurbo(this, 1137, 1, textureX, textureY); // Box 555
		bodyModel[53] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 556
		bodyModel[54] = new ModelRendererTurbo(this, 1169, 1, textureX, textureY); // Box 557
		bodyModel[55] = new ModelRendererTurbo(this, 1185, 1, textureX, textureY); // Box 558
		bodyModel[56] = new ModelRendererTurbo(this, 1209, 1, textureX, textureY); // Box 559
		bodyModel[57] = new ModelRendererTurbo(this, 1233, 1, textureX, textureY); // Box 560
		bodyModel[58] = new ModelRendererTurbo(this, 1257, 1, textureX, textureY); // Box 561
		bodyModel[59] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 562
		bodyModel[60] = new ModelRendererTurbo(this, 1305, 1, textureX, textureY); // Box 563
		bodyModel[61] = new ModelRendererTurbo(this, 1329, 1, textureX, textureY); // Box 564
		bodyModel[62] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Box 565
		bodyModel[63] = new ModelRendererTurbo(this, 1361, 1, textureX, textureY); // Box 566
		bodyModel[64] = new ModelRendererTurbo(this, 1377, 1, textureX, textureY); // Box 567
		bodyModel[65] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Box 568
		bodyModel[66] = new ModelRendererTurbo(this, 1409, 1, textureX, textureY); // Box 569
		bodyModel[67] = new ModelRendererTurbo(this, 1425, 1, textureX, textureY); // Box 570
		bodyModel[68] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 571
		bodyModel[69] = new ModelRendererTurbo(this, 1457, 1, textureX, textureY); // Box 572
		bodyModel[70] = new ModelRendererTurbo(this, 1473, 1, textureX, textureY); // Box 573
		bodyModel[71] = new ModelRendererTurbo(this, 1489, 1, textureX, textureY); // Box 574
		bodyModel[72] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Box 575
		bodyModel[73] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 576
		bodyModel[74] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Box 577
		bodyModel[75] = new ModelRendererTurbo(this, 1553, 1, textureX, textureY); // Box 578
		bodyModel[76] = new ModelRendererTurbo(this, 1041, 25, textureX, textureY); // Box 579
		bodyModel[77] = new ModelRendererTurbo(this, 1257, 41, textureX, textureY); // Box 580
		bodyModel[78] = new ModelRendererTurbo(this, 1289, 41, textureX, textureY); // Box 581
		bodyModel[79] = new ModelRendererTurbo(this, 1321, 41, textureX, textureY); // Box 582
		bodyModel[80] = new ModelRendererTurbo(this, 1353, 41, textureX, textureY); // Box 583
		bodyModel[81] = new ModelRendererTurbo(this, 1385, 41, textureX, textureY); // Box 584
		bodyModel[82] = new ModelRendererTurbo(this, 1705, 41, textureX, textureY); // Box 585
		bodyModel[83] = new ModelRendererTurbo(this, 1721, 41, textureX, textureY); // Box 586
		bodyModel[84] = new ModelRendererTurbo(this, 1737, 41, textureX, textureY); // Box 587
		bodyModel[85] = new ModelRendererTurbo(this, 1985, 41, textureX, textureY); // Box 588
		bodyModel[86] = new ModelRendererTurbo(this, 2001, 41, textureX, textureY); // Box 589
		bodyModel[87] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 590
		bodyModel[88] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 591
		bodyModel[89] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 592
		bodyModel[90] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 593
		bodyModel[91] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 594
		bodyModel[92] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 595
		bodyModel[93] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 596
		bodyModel[94] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 597
		bodyModel[95] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 598
		bodyModel[96] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 599
		bodyModel[97] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 600
		bodyModel[98] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 601
		bodyModel[99] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Box 602
		bodyModel[100] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Box 603
		bodyModel[101] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 604
		bodyModel[102] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 605
		bodyModel[103] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 606
		bodyModel[104] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 607
		bodyModel[105] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 608
		bodyModel[106] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 609
		bodyModel[107] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 610
		bodyModel[108] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 611
		bodyModel[109] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 612
		bodyModel[110] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 613
		bodyModel[111] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 614
		bodyModel[112] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 615
		bodyModel[113] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 616
		bodyModel[114] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 617
		bodyModel[115] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 618
		bodyModel[116] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 619
		bodyModel[117] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 620
		bodyModel[118] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 621
		bodyModel[119] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 622
		bodyModel[120] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 623
		bodyModel[121] = new ModelRendererTurbo(this, 1041, 49, textureX, textureY); // Box 624
		bodyModel[122] = new ModelRendererTurbo(this, 1065, 49, textureX, textureY); // Box 625
		bodyModel[123] = new ModelRendererTurbo(this, 1089, 49, textureX, textureY); // Box 626
		bodyModel[124] = new ModelRendererTurbo(this, 1105, 49, textureX, textureY); // Box 800
		bodyModel[125] = new ModelRendererTurbo(this, 1137, 49, textureX, textureY); // Box 801
		bodyModel[126] = new ModelRendererTurbo(this, 1169, 49, textureX, textureY); // Box 802
		bodyModel[127] = new ModelRendererTurbo(this, 1201, 49, textureX, textureY); // Box 803
		bodyModel[128] = new ModelRendererTurbo(this, 1425, 49, textureX, textureY); // Box 804
		bodyModel[129] = new ModelRendererTurbo(this, 1457, 49, textureX, textureY); // Box 805
		bodyModel[130] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 599
		bodyModel[131] = new ModelRendererTurbo(this, 1881, 49, textureX, textureY); // Box 600
		bodyModel[132] = new ModelRendererTurbo(this, 1945, 49, textureX, textureY); // Box 602
		bodyModel[133] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 604
		bodyModel[134] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 605
		bodyModel[135] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 606
		bodyModel[136] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Box 607
		bodyModel[137] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 608
		bodyModel[138] = new ModelRendererTurbo(this, 2009, 49, textureX, textureY); // Box 609
		bodyModel[139] = new ModelRendererTurbo(this, 1121, 49, textureX, textureY); // Box 610
		bodyModel[140] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 611
		bodyModel[141] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 612
		bodyModel[142] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 613
		bodyModel[143] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 614
		bodyModel[144] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 615
		bodyModel[145] = new ModelRendererTurbo(this, 1153, 49, textureX, textureY); // Box 616
		bodyModel[146] = new ModelRendererTurbo(this, 1993, 49, textureX, textureY); // Box 617
		bodyModel[147] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 618
		bodyModel[148] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 619
		bodyModel[149] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 620
		bodyModel[150] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 621
		bodyModel[151] = new ModelRendererTurbo(this, 1025, 57, textureX, textureY); // Box 622
		bodyModel[152] = new ModelRendererTurbo(this, 1225, 57, textureX, textureY); // Box 623
		bodyModel[153] = new ModelRendererTurbo(this, 1273, 57, textureX, textureY); // Box 624
		bodyModel[154] = new ModelRendererTurbo(this, 1073, 57, textureX, textureY); // Box 625
		bodyModel[155] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Box 627
		bodyModel[156] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 628
		bodyModel[157] = new ModelRendererTurbo(this, 1137, 57, textureX, textureY); // Box 629
		bodyModel[158] = new ModelRendererTurbo(this, 1321, 57, textureX, textureY); // Box 630
		bodyModel[159] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 631
		bodyModel[160] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 632
		bodyModel[161] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 633
		bodyModel[162] = new ModelRendererTurbo(this, 1353, 57, textureX, textureY); // Box 634
		bodyModel[163] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 635
		bodyModel[164] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Box 636
		bodyModel[165] = new ModelRendererTurbo(this, 1385, 57, textureX, textureY); // Box 637
		bodyModel[166] = new ModelRendererTurbo(this, 1177, 57, textureX, textureY); // Box 638
		bodyModel[167] = new ModelRendererTurbo(this, 1193, 57, textureX, textureY); // Box 639
		bodyModel[168] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 640
		bodyModel[169] = new ModelRendererTurbo(this, 1433, 57, textureX, textureY); // Box 641
		bodyModel[170] = new ModelRendererTurbo(this, 1457, 57, textureX, textureY); // Box 642
		bodyModel[171] = new ModelRendererTurbo(this, 1481, 57, textureX, textureY); // Box 643
		bodyModel[172] = new ModelRendererTurbo(this, 1873, 57, textureX, textureY); // Box 644
		bodyModel[173] = new ModelRendererTurbo(this, 1465, 57, textureX, textureY); // Box 645
		bodyModel[174] = new ModelRendererTurbo(this, 1417, 49, textureX, textureY); // Box 646
		bodyModel[175] = new ModelRendererTurbo(this, 1889, 57, textureX, textureY); // Box 647
		bodyModel[176] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 648
		bodyModel[177] = new ModelRendererTurbo(this, 1913, 57, textureX, textureY); // Box 649
		bodyModel[178] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 650
		bodyModel[179] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 651
		bodyModel[180] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 652
		bodyModel[181] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 653
		bodyModel[182] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 654
		bodyModel[183] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 655
		bodyModel[184] = new ModelRendererTurbo(this, 1945, 49, textureX, textureY); // Box 656
		bodyModel[185] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 657
		bodyModel[186] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 658
		bodyModel[187] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 659
		bodyModel[188] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 660
		bodyModel[189] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 661
		bodyModel[190] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 662
		bodyModel[191] = new ModelRendererTurbo(this, 1113, 65, textureX, textureY); // Box 663
		bodyModel[192] = new ModelRendererTurbo(this, 1513, 65, textureX, textureY); // Box 664
		bodyModel[193] = new ModelRendererTurbo(this, 1545, 65, textureX, textureY); // Box 665
		bodyModel[194] = new ModelRendererTurbo(this, 1673, 49, textureX, textureY); // Box 666
		bodyModel[195] = new ModelRendererTurbo(this, 1705, 49, textureX, textureY); // Box 667
		bodyModel[196] = new ModelRendererTurbo(this, 1113, 65, textureX, textureY); // Box 10
		bodyModel[197] = new ModelRendererTurbo(this, 1529, 65, textureX, textureY); // Box 11
		bodyModel[198] = new ModelRendererTurbo(this, 1633, 65, textureX, textureY); // Box 12
		bodyModel[199] = new ModelRendererTurbo(this, 1201, 65, textureX, textureY); // Box 672
		bodyModel[200] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 673
		bodyModel[201] = new ModelRendererTurbo(this, 2033, 17, textureX, textureY); // Box 674
		bodyModel[202] = new ModelRendererTurbo(this, 1729, 49, textureX, textureY); // Box 675
		bodyModel[203] = new ModelRendererTurbo(this, 1753, 49, textureX, textureY); // Box 676
		bodyModel[204] = new ModelRendererTurbo(this, 1569, 1, textureX, textureY); // Box 120
		bodyModel[205] = new ModelRendererTurbo(this, 1585, 1, textureX, textureY); // Box 124
		bodyModel[206] = new ModelRendererTurbo(this, 1601, 1, textureX, textureY); // Box 125
		bodyModel[207] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 680
		bodyModel[208] = new ModelRendererTurbo(this, 1633, 1, textureX, textureY); // Box 681
		bodyModel[209] = new ModelRendererTurbo(this, 1649, 1, textureX, textureY); // Box 682
		bodyModel[210] = new ModelRendererTurbo(this, 1665, 1, textureX, textureY); // Box 683
		bodyModel[211] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 684
		bodyModel[212] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Box 685
		bodyModel[213] = new ModelRendererTurbo(this, 1737, 1, textureX, textureY); // Box 686
		bodyModel[214] = new ModelRendererTurbo(this, 1761, 1, textureX, textureY); // Box 687
		bodyModel[215] = new ModelRendererTurbo(this, 1785, 1, textureX, textureY); // Box 688
		bodyModel[216] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 689
		bodyModel[217] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 690
		bodyModel[218] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 691
		bodyModel[219] = new ModelRendererTurbo(this, 1233, 41, textureX, textureY); // Box 692
		bodyModel[220] = new ModelRendererTurbo(this, 1585, 65, textureX, textureY); // Box 693
		bodyModel[221] = new ModelRendererTurbo(this, 1609, 65, textureX, textureY); // Box 694
		bodyModel[222] = new ModelRendererTurbo(this, 1641, 65, textureX, textureY); // Box 695
		bodyModel[223] = new ModelRendererTurbo(this, 1689, 65, textureX, textureY); // Box 696
		bodyModel[224] = new ModelRendererTurbo(this, 1825, 49, textureX, textureY); // Box 697
		bodyModel[225] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 698
		bodyModel[226] = new ModelRendererTurbo(this, 1713, 65, textureX, textureY); // Box 699
		bodyModel[227] = new ModelRendererTurbo(this, 1777, 49, textureX, textureY); // Box 700
		bodyModel[228] = new ModelRendererTurbo(this, 1801, 49, textureX, textureY); // Box 701
		bodyModel[229] = new ModelRendererTurbo(this, 1737, 65, textureX, textureY); // Box 702
		bodyModel[230] = new ModelRendererTurbo(this, 1769, 65, textureX, textureY); // Box 703
		bodyModel[231] = new ModelRendererTurbo(this, 1801, 65, textureX, textureY); // Box 704
		bodyModel[232] = new ModelRendererTurbo(this, 1833, 65, textureX, textureY); // Box 705
		bodyModel[233] = new ModelRendererTurbo(this, 1889, 65, textureX, textureY); // Box 706
		bodyModel[234] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 707
		bodyModel[235] = new ModelRendererTurbo(this, 1809, 1, textureX, textureY); // Box 708
		bodyModel[236] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 709
		bodyModel[237] = new ModelRendererTurbo(this, 1841, 1, textureX, textureY); // Box 710
		bodyModel[238] = new ModelRendererTurbo(this, 1857, 1, textureX, textureY); // Box 711
		bodyModel[239] = new ModelRendererTurbo(this, 1177, 73, textureX, textureY); // Box 712
		bodyModel[240] = new ModelRendererTurbo(this, 1313, 73, textureX, textureY); // Box 713
		bodyModel[241] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 714

		bodyModel[0].addShapeBox(0F, 0F, 0F, 26, 13, 49, 0F,0F, -3.9F, -6.5F, 0F, -3.9F, -6.5F, 0F, -3.9F, -7.8F, 0F, -3.9F, -7.3F, 0F, 2F, -6.5F, 0F, 2F, -6.5F, 0F, 2F, -7.8F, 0F, 2F, -7.3F); // Box 10
		bodyModel[0].setRotationPoint(4.3F, -11.5F, -24.6F);

		bodyModel[1].addShapeBox(0F, -1F, 0F, 52, 11, 36, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 11
		bodyModel[1].setRotationPoint(-47.7F, -6.3F, -18.1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 8, 36, 0F,-2.95F, -0.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.8F, -2.95F, -0.5F, -0.8F, -6.5F, -0.2F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, -0.8F, -6.5F, -0.2F, -0.8F); // Box 12
		bodyModel[2].setRotationPoint(-63.7F, -7.3F, -18.1F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 6, 49, 0F,0F, -5F, -6.5F, -10F, -5F, -6.6F, -10F, -5F, -7.5F, 0F, -5F, -7.3F, 0F, 2F, -6.5F, -10F, 2F, -6.6F, -10F, 2F, -7.5F, 0F, 2F, -7.3F); // Box 13
		bodyModel[3].setRotationPoint(30.3F, -4.5F, -24.6F);

		bodyModel[4].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 313
		bodyModel[4].setRotationPoint(8F, 1F, 18F);

		bodyModel[5].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 314
		bodyModel[5].setRotationPoint(8F, 1F, 18F);

		bodyModel[6].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 315
		bodyModel[6].setRotationPoint(8F, 1F, 18F);

		bodyModel[7].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 510
		bodyModel[7].setRotationPoint(22F, 1F, 18F);

		bodyModel[8].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 511
		bodyModel[8].setRotationPoint(22F, 1F, 18F);

		bodyModel[9].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 512
		bodyModel[9].setRotationPoint(22F, 1F, 18F);

		bodyModel[10].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 513
		bodyModel[10].setRotationPoint(36F, 1F, 18F);

		bodyModel[11].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 514
		bodyModel[11].setRotationPoint(36F, 1F, 18F);

		bodyModel[12].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 515
		bodyModel[12].setRotationPoint(36F, 1F, 18F);

		bodyModel[13].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 516
		bodyModel[13].setRotationPoint(-6F, 1F, 18F);

		bodyModel[14].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 517
		bodyModel[14].setRotationPoint(-6F, 1F, 18F);

		bodyModel[15].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 518
		bodyModel[15].setRotationPoint(-6F, 1F, 18F);

		bodyModel[16].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 519
		bodyModel[16].setRotationPoint(-20F, 1F, 18F);

		bodyModel[17].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 520
		bodyModel[17].setRotationPoint(-20F, 1F, 18F);

		bodyModel[18].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 521
		bodyModel[18].setRotationPoint(-20F, 1F, 18F);

		bodyModel[19].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 522
		bodyModel[19].setRotationPoint(-34F, 1F, 18F);

		bodyModel[20].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 523
		bodyModel[20].setRotationPoint(-34F, 1F, 18F);

		bodyModel[21].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 524
		bodyModel[21].setRotationPoint(-34F, 1F, 18F);

		bodyModel[22].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 525
		bodyModel[22].setRotationPoint(-34F, 1F, -18F);

		bodyModel[23].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 526
		bodyModel[23].setRotationPoint(-34F, 1F, -18F);

		bodyModel[24].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 527
		bodyModel[24].setRotationPoint(-34F, 1F, -18F);

		bodyModel[25].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 528
		bodyModel[25].setRotationPoint(-20F, 1F, -18F);

		bodyModel[26].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 529
		bodyModel[26].setRotationPoint(-20F, 1F, -18F);

		bodyModel[27].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 530
		bodyModel[27].setRotationPoint(-20F, 1F, -18F);

		bodyModel[28].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 531
		bodyModel[28].setRotationPoint(-6F, 1F, -18F);

		bodyModel[29].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 532
		bodyModel[29].setRotationPoint(-6F, 1F, -18F);

		bodyModel[30].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 533
		bodyModel[30].setRotationPoint(-6F, 1F, -18F);

		bodyModel[31].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 534
		bodyModel[31].setRotationPoint(8F, 1F, -18F);

		bodyModel[32].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 535
		bodyModel[32].setRotationPoint(8F, 1F, -18F);

		bodyModel[33].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 536
		bodyModel[33].setRotationPoint(8F, 1F, -18F);

		bodyModel[34].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 537
		bodyModel[34].setRotationPoint(22F, 1F, -18F);

		bodyModel[35].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 538
		bodyModel[35].setRotationPoint(22F, 1F, -18F);

		bodyModel[36].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 539
		bodyModel[36].setRotationPoint(22F, 1F, -18F);

		bodyModel[37].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F); // Box 540
		bodyModel[37].setRotationPoint(36F, 1F, -18F);

		bodyModel[38].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 541
		bodyModel[38].setRotationPoint(36F, 1F, -18F);

		bodyModel[39].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 542
		bodyModel[39].setRotationPoint(36F, 1F, -18F);

		bodyModel[40].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 543
		bodyModel[40].setRotationPoint(-33.85F, 1F, -20F);

		bodyModel[41].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 544
		bodyModel[41].setRotationPoint(-33.85F, 1F, -20F);

		bodyModel[42].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 545
		bodyModel[42].setRotationPoint(-33.85F, 1F, -20F);

		bodyModel[43].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 546
		bodyModel[43].setRotationPoint(-19.85F, 1F, -20F);

		bodyModel[44].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 547
		bodyModel[44].setRotationPoint(-19.85F, 1F, -20F);

		bodyModel[45].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 548
		bodyModel[45].setRotationPoint(-19.85F, 1F, -20F);

		bodyModel[46].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 549
		bodyModel[46].setRotationPoint(-5.95F, 1F, -20F);

		bodyModel[47].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 550
		bodyModel[47].setRotationPoint(-5.95F, 1F, -20F);

		bodyModel[48].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 551
		bodyModel[48].setRotationPoint(-5.95F, 1F, -20F);

		bodyModel[49].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 552
		bodyModel[49].setRotationPoint(8.05F, 1F, -20F);

		bodyModel[50].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 553
		bodyModel[50].setRotationPoint(8.05F, 1F, -20F);

		bodyModel[51].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 554
		bodyModel[51].setRotationPoint(8.05F, 1F, -20F);

		bodyModel[52].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 555
		bodyModel[52].setRotationPoint(21.9F, 1F, -20F);

		bodyModel[53].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 556
		bodyModel[53].setRotationPoint(21.9F, 1F, -20F);

		bodyModel[54].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 557
		bodyModel[54].setRotationPoint(21.9F, 1F, -20F);

		bodyModel[55].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 558
		bodyModel[55].setRotationPoint(35.9F, 1F, -20F);

		bodyModel[56].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 559
		bodyModel[56].setRotationPoint(35.9F, 1F, -20F);

		bodyModel[57].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 560
		bodyModel[57].setRotationPoint(35.9F, 1F, -20F);

		bodyModel[58].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 561
		bodyModel[58].setRotationPoint(35.9F, 1F, 18.2F);

		bodyModel[59].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 562
		bodyModel[59].setRotationPoint(35.9F, 1F, 18.2F);

		bodyModel[60].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 563
		bodyModel[60].setRotationPoint(35.9F, 1F, 18.2F);

		bodyModel[61].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 564
		bodyModel[61].setRotationPoint(21.9F, 1F, 18.2F);

		bodyModel[62].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 565
		bodyModel[62].setRotationPoint(21.9F, 1F, 18.2F);

		bodyModel[63].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 566
		bodyModel[63].setRotationPoint(21.9F, 1F, 18.2F);

		bodyModel[64].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 567
		bodyModel[64].setRotationPoint(8.05F, 1F, 18.2F);

		bodyModel[65].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 568
		bodyModel[65].setRotationPoint(8.05F, 1F, 18.2F);

		bodyModel[66].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 569
		bodyModel[66].setRotationPoint(8.05F, 1F, 18.2F);

		bodyModel[67].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 570
		bodyModel[67].setRotationPoint(-5.95F, 1F, 18.2F);

		bodyModel[68].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 571
		bodyModel[68].setRotationPoint(-5.95F, 1F, 18.2F);

		bodyModel[69].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 572
		bodyModel[69].setRotationPoint(-5.95F, 1F, 18.2F);

		bodyModel[70].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 573
		bodyModel[70].setRotationPoint(-19.85F, 1F, 18.2F);

		bodyModel[71].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 574
		bodyModel[71].setRotationPoint(-19.85F, 1F, 18.2F);

		bodyModel[72].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 575
		bodyModel[72].setRotationPoint(-19.85F, 1F, 18.2F);

		bodyModel[73].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 576
		bodyModel[73].setRotationPoint(-33.85F, 1F, 18.2F);

		bodyModel[74].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 577
		bodyModel[74].setRotationPoint(-33.85F, 1F, 18.2F);

		bodyModel[75].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 578
		bodyModel[75].setRotationPoint(-33.85F, 1F, 18.2F);

		bodyModel[76].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 579
		bodyModel[76].setRotationPoint(14.6F, 3.25F, 16.5F);

		bodyModel[77].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 580
		bodyModel[77].setRotationPoint(14.6F, 3.25F, 16.5F);

		bodyModel[78].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 581
		bodyModel[78].setRotationPoint(14.6F, 3.25F, 16.5F);

		bodyModel[79].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 582
		bodyModel[79].setRotationPoint(28.6F, 3.25F, 16.5F);

		bodyModel[80].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 583
		bodyModel[80].setRotationPoint(28.6F, 3.25F, 16.5F);

		bodyModel[81].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 584
		bodyModel[81].setRotationPoint(28.6F, 3.25F, 16.5F);

		bodyModel[82].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 585
		bodyModel[82].setRotationPoint(0.6F, 3.25F, 16.5F);

		bodyModel[83].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 586
		bodyModel[83].setRotationPoint(0.6F, 3.25F, 16.5F);

		bodyModel[84].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 587
		bodyModel[84].setRotationPoint(0.6F, 3.25F, 16.5F);

		bodyModel[85].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 588
		bodyModel[85].setRotationPoint(-13.4F, 3.25F, 16.5F);

		bodyModel[86].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 589
		bodyModel[86].setRotationPoint(-13.4F, 3.25F, 16.5F);

		bodyModel[87].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 590
		bodyModel[87].setRotationPoint(-13.4F, 3.25F, 16.5F);

		bodyModel[88].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 591
		bodyModel[88].setRotationPoint(-27.4F, 3.25F, 16.5F);

		bodyModel[89].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 592
		bodyModel[89].setRotationPoint(-27.4F, 3.25F, 16.5F);

		bodyModel[90].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 593
		bodyModel[90].setRotationPoint(-27.4F, 3.25F, 16.5F);

		bodyModel[91].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 594
		bodyModel[91].setRotationPoint(-41.4F, 3.25F, 16.5F);

		bodyModel[92].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 595
		bodyModel[92].setRotationPoint(-41.4F, 3.25F, 16.5F);

		bodyModel[93].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 596
		bodyModel[93].setRotationPoint(-41.4F, 3.25F, 16.5F);

		bodyModel[94].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 597
		bodyModel[94].setRotationPoint(-41.4F, 3.25F, -23.5F);

		bodyModel[95].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 598
		bodyModel[95].setRotationPoint(-41.4F, 3.25F, -23.5F);

		bodyModel[96].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 599
		bodyModel[96].setRotationPoint(-41.4F, 3.25F, -23.5F);

		bodyModel[97].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 600
		bodyModel[97].setRotationPoint(-27.4F, 3.25F, -23.5F);

		bodyModel[98].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 601
		bodyModel[98].setRotationPoint(-27.4F, 3.25F, -23.5F);

		bodyModel[99].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 602
		bodyModel[99].setRotationPoint(-27.4F, 3.25F, -23.5F);

		bodyModel[100].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 603
		bodyModel[100].setRotationPoint(-13.4F, 3.25F, -23.5F);

		bodyModel[101].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 604
		bodyModel[101].setRotationPoint(-13.4F, 3.25F, -23.5F);

		bodyModel[102].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 605
		bodyModel[102].setRotationPoint(-13.4F, 3.25F, -23.5F);

		bodyModel[103].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 606
		bodyModel[103].setRotationPoint(0.6F, 3.25F, -23.5F);

		bodyModel[104].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 607
		bodyModel[104].setRotationPoint(0.6F, 3.25F, -23.5F);

		bodyModel[105].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 608
		bodyModel[105].setRotationPoint(0.6F, 3.25F, -23.5F);

		bodyModel[106].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 609
		bodyModel[106].setRotationPoint(14.6F, 3.25F, -23.5F);

		bodyModel[107].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 610
		bodyModel[107].setRotationPoint(14.6F, 3.25F, -23.5F);

		bodyModel[108].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 611
		bodyModel[108].setRotationPoint(14.6F, 3.25F, -23.5F);

		bodyModel[109].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 4, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 612
		bodyModel[109].setRotationPoint(28.6F, 3.25F, -23.5F);

		bodyModel[110].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 4, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 613
		bodyModel[110].setRotationPoint(28.6F, 3.25F, -23.5F);

		bodyModel[111].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 4, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 614
		bodyModel[111].setRotationPoint(28.6F, 3.25F, -23.5F);

		bodyModel[112].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 615
		bodyModel[112].setRotationPoint(2.5F, 1F, -19.9F);

		bodyModel[113].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 616
		bodyModel[113].setRotationPoint(15.5F, 1F, -19.9F);

		bodyModel[114].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 617
		bodyModel[114].setRotationPoint(29.5F, 1F, -19.9F);

		bodyModel[115].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 618
		bodyModel[115].setRotationPoint(-11.5F, 1F, -19.9F);

		bodyModel[116].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 619
		bodyModel[116].setRotationPoint(-26.5F, 1F, -19.9F);

		bodyModel[117].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 620
		bodyModel[117].setRotationPoint(-39.5F, 1F, -21.9F);

		bodyModel[118].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 621
		bodyModel[118].setRotationPoint(-39.5F, 1F, 17.1F);

		bodyModel[119].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 622
		bodyModel[119].setRotationPoint(-26.5F, 1F, 17.1F);

		bodyModel[120].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 623
		bodyModel[120].setRotationPoint(-11.5F, 1F, 17.1F);

		bodyModel[121].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 624
		bodyModel[121].setRotationPoint(2.5F, 1F, 17.1F);

		bodyModel[122].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 625
		bodyModel[122].setRotationPoint(15.5F, 1F, 17.1F);

		bodyModel[123].addShapeBox(-1F, -0.5F, -0.6F, 7, 1, 2, 0F,0.1F, -2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -2F, -0.2F, 0.1F, 2.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 2.2F, -0.2F); // Box 626
		bodyModel[123].setRotationPoint(29.5F, 1F, 17.1F);

		bodyModel[124].addShapeBox(-4F, -2F, 0F, 8, 4, 4, 0F,0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 800
		bodyModel[124].setRotationPoint(-52.9F, 0.2F, -18.1F);

		bodyModel[125].addShapeBox(-4F, -4.35F, 0F, 8, 3, 4, 0F,-2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F); // Box 801
		bodyModel[125].setRotationPoint(-52.9F, 0.2F, -18.1F);

		bodyModel[126].addShapeBox(-4F, 1.35F, 0F, 8, 3, 4, 0F,0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F); // Box 802
		bodyModel[126].setRotationPoint(-52.9F, 0.2F, -18.1F);

		bodyModel[127].addShapeBox(-4F, -2F, -2F, 8, 4, 4, 0F,0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 803
		bodyModel[127].setRotationPoint(-52.9F, 0.2F, 15.1F);

		bodyModel[128].addShapeBox(-4F, -4.35F, -2F, 8, 3, 4, 0F,-2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F); // Box 804
		bodyModel[128].setRotationPoint(-52.9F, 0.2F, 15.1F);

		bodyModel[129].addShapeBox(-4F, 1.35F, -2F, 8, 3, 4, 0F,0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F); // Box 805
		bodyModel[129].setRotationPoint(-52.9F, 0.2F, 15.1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 82, 9, 51, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 599
		bodyModel[130].setRotationPoint(-54.7F, -15.3F, -25.9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 6, 9, 51, 0F,0F, -5.1F, 0F, -0.25F, 0.6F, 0F, -0.25F, 0.6F, -1.5F, 0F, -5.1F, -1.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 600
		bodyModel[131].setRotationPoint(-60.75F, -15.3F, -25.9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.7F, 0F, 0.5F, -1.7F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, -1.7F, 0F, -0.5F, -1.7F); // Box 602
		bodyModel[132].setRotationPoint(27.3F, -8.3F, -25.9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.7F, 0F, 0.5F, -1.7F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, -1.7F, 0F, -0.5F, -1.7F); // Box 604
		bodyModel[133].setRotationPoint(27.3F, -8.3F, 16.3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 20, 9, 40, 0F,0F, -5F, -6.5F, -4F, -5.4F, -6.6F, -4F, -5.4F, -7.5F, 0F, -5F, -7.3F, 0F, 2F, -6.5F, -10F, 2F, -6.6F, -10F, 2F, -7.5F, 0F, 2F, -7.3F); // Box 605
		bodyModel[134].setRotationPoint(32.3F, -7.5F, -20.6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 25, 16, 49, 0F,0F, 2.4F, -6.5F, -24.9F, 2.4F, -6.5F, -24.9F, 2.4F, -7.5F, 0F, 2.4F, -7.3F, 0F, -5F, -6.5F, -4F, -5F, -6.5F, -4F, -5F, -7.5F, 0F, -5F, -7.3F); // Box 606
		bodyModel[135].setRotationPoint(27.3F, -13.5F, -25.1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 25, 1, 49, 0F,0F, -0.4F, -6.5F, -4F, -0.4F, -6.5F, -4F, -0.4F, -7.5F, 0F, -0.4F, -7.3F, 0F, -0.4F, -6.5F, -4F, -0.2F, -6.5F, -4F, -0.2F, -7.5F, 0F, -0.4F, -7.3F); // Box 607
		bodyModel[136].setRotationPoint(27.3F, -2.9F, -25.1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 9, 4, 11, 0F,0F, 1.5F, 0F, 2F, 0.3F, 0F, 2F, 0.3F, -2F, 0F, 1.5F, -2F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 608
		bodyModel[137].setRotationPoint(27.3F, -12.3F, -25.9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F,0F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, -0.5F, 0F, 2.9F, 0.7F, 0F, 2.9F, 0.7F, -2F, 0F, -0.5F, -2F); // Box 609
		bodyModel[138].setRotationPoint(27.3F, -17.3F, -25.9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,1.8F, 0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 1.8F, 0.1F, 0F, -0.9F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.9F, 0.7F, 0F); // Box 610
		bodyModel[139].setRotationPoint(37.3F, -17.3F, -25.9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 18, 2, 11, 0F,-4F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, -2F, -14F, 0.1F, -2F, 0F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, -2F, -10F, -0.5F, -2F); // Box 611
		bodyModel[140].setRotationPoint(9F, -17.3F, -25.9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 18, 2, 11, 0F,-14F, 0.1F, -2F, 0.3F, 0.1F, -2F, 0.3F, 0.1F, 0F, -4F, 0.1F, 0F, -10F, -0.5F, -2F, 0.3F, -0.5F, -2F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 612
		bodyModel[141].setRotationPoint(9F, -17.3F, 12.6F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F,0F, 0.1F, -2F, 0.25F, 0.1F, -2F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, -2F, 0.25F, -0.5F, -2F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 613
		bodyModel[142].setRotationPoint(27.3F, -17.3F, 12.6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0.1F, -2F, 0.75F, -0.7F, -2F, 0.75F, -0.7F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, -2F, 0.75F, -0.5F, -2F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 614
		bodyModel[143].setRotationPoint(35.55F, -17.3F, 12.6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 7, 11, 0F,0F, 0.05F, -2F, 0.1F, 0.05F, -2F, 0.1F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.05F, -2F, 0.1F, -0.05F, -2F, 0.1F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 615
		bodyModel[144].setRotationPoint(27.3F, -15.75F, 12.6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,-2F, 1.05F, -1.8F, 0.1F, 1.05F, -1.8F, 0.11F, 0.05F, 0F, -2.1F, 0.05F, 0F, -2.1F, -0.05F, -1.8F, 9.2F, -0.05F, -1.8F, 9.1F, -0.05F, -5.5F, -2.1F, -0.05F, 0F); // Box 616
		bodyModel[145].setRotationPoint(27.3F, -13.75F, 14.6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0.1F, -0.4F, 0.25F, 0.1F, -0.4F, 0.25F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, -0.3F, -0.4F, 0.25F, -2.05F, -0.4F, 0.25F, -2.05F, -0.4F, 0F, -0.3F, -0.4F); // Box 617
		bodyModel[146].setRotationPoint(29.4F, -15.7F, 23F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, -0.15F, 3.2F, 0F, -0.15F, 0F, 0F, -0.15F, 0.5F, 0F, -0.15F, 3.2F, 0F, 0F, 6.2F, 13.6F, 8.4F, 0F, 13.6F, 8.4F, 0F, 0F, 0F, 2.2F); // Box 618
		bodyModel[147].setRotationPoint(27.4F, -16.05F, 1.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 13, 9, 31, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 619
		bodyModel[148].setRotationPoint(-54.7F, -16.3F, -8.9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 7, 9, 31, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 620
		bodyModel[149].setRotationPoint(-39.7F, -16.3F, -8.9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 621
		bodyModel[150].setRotationPoint(-54.7F, -16.3F, -15.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 16, 9, 5, 0F,-5.7F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, -5.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 622
		bodyModel[151].setRotationPoint(-46.7F, -16.3F, -19F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 16, 9, 5, 0F,-8F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, -5.7F, 0.6F, -1.5F, -8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, -5.7F, -0.5F, -1.5F); // Box 623
		bodyModel[152].setRotationPoint(-46.7F, -16.3F, -22.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 16, 8, 5, 0F,-9F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.6F, -1.5F, -8F, 0.6F, -1.5F, -9F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -1.5F, -8F, -0.5F, -1.5F); // Box 624
		bodyModel[153].setRotationPoint(-46.7F, -16.3F, -26F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 8, 9, 10, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 625
		bodyModel[154].setRotationPoint(-54.2F, -16.3F, -25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 9, 8, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 627
		bodyModel[155].setRotationPoint(-45.2F, -16.3F, -25F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.7F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.7F, 0.3F, -0.5F, -1.5F); // Box 628
		bodyModel[156].setRotationPoint(-42.9F, -16.3F, -25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 9, 8, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, -1F, -0.4F, 0.6F, -3.7F, 0.3F, 0.6F, -1.7F, 0.3F, -0.5F, 0F, 0F, -0.5F, -1F, -0.4F, -0.5F, -3.7F, 0.3F, -0.5F, -1.7F); // Box 629
		bodyModel[157].setRotationPoint(-41.6F, -16.3F, -25F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 12, 8, 3, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 630
		bodyModel[158].setRotationPoint(-51.5F, -15F, -26.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0F, -0.4F, -1.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 631
		bodyModel[159].setRotationPoint(-52.8F, -15F, -26.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.5F, 0F, 0.6F, -1.5F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 632
		bodyModel[160].setRotationPoint(-39.5F, -15F, -26.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.5F, 0F, 0.6F, -1.5F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 633
		bodyModel[161].setRotationPoint(-19.5F, -13F, -26.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 12, 6, 3, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 634
		bodyModel[162].setRotationPoint(-31.5F, -13F, -26.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0F, -0.4F, -1.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 635
		bodyModel[163].setRotationPoint(-32.8F, -13F, -26.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 636
		bodyModel[164].setRotationPoint(-28.5F, -11.5F, -27F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 17, 8, 3, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 637
		bodyModel[165].setRotationPoint(10.5F, -15F, -26.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0F, -0.4F, -1.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 638
		bodyModel[166].setRotationPoint(9.2F, -15F, -26.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.5F, 0F, 0.6F, -1.5F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 639
		bodyModel[167].setRotationPoint(27.5F, -15F, -26.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 640
		bodyModel[168].setRotationPoint(23.5F, -14.5F, -27F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 641
		bodyModel[169].setRotationPoint(-61.25F, -7F, -25.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 642
		bodyModel[170].setRotationPoint(-61.25F, -7F, 16.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.3F, 0F, 0F); // Box 643
		bodyModel[171].setRotationPoint(47.1F, -6.8F, 16.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.3F, 0F, 0F); // Box 644
		bodyModel[172].setRotationPoint(47.1F, -6.8F, -25.75F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		bodyModel[173].setRotationPoint(40.3F, -1F, -20.6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 35, 0F,-0.2F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.2F, 0F, 0F, 1.8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.8F, 0F, 0F); // Box 646
		bodyModel[174].setRotationPoint(45.4F, -7.2F, -18.7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 647
		bodyModel[175].setRotationPoint(37.8F, -6.8F, -19.2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 648
		bodyModel[176].setRotationPoint(37.8F, -6.8F, 15.9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 649
		bodyModel[177].setRotationPoint(-60.5F, -7F, 16F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 650
		bodyModel[178].setRotationPoint(-60.6F, -7F, -18.8F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 0.1F, -2F, 0.25F, 0.1F, -2F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, -2F, 0.25F, -0.5F, -2F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 651
		bodyModel[179].setRotationPoint(39.5F, -9.3F, 16F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 0.1F, -2F, 0.25F, 0.1F, -2F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, -2F, 0.25F, -0.5F, -2F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 652
		bodyModel[180].setRotationPoint(39.5F, -9.3F, -27.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 6, 17, 0F,0.3F, -3.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, -3.4F, -1.5F, -1.7F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, -0.5F, -1.5F, -1.7F, -0.5F, -1.5F); // Box 653
		bodyModel[181].setRotationPoint(-60.2F, -15F, -3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 5, 6, 7, 0F,-0.7F, -3.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, -0.7F, -3.5F, -1.5F, -1.7F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, -0.5F, -1.5F, -1.7F, -0.5F, -1.5F); // Box 654
		bodyModel[182].setRotationPoint(-61.2F, -15F, 16F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0.3F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -1.5F, 0.3F, 0.7F, -1.5F, 0.3F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.5F, 0.3F, -0.4F, -1.5F); // Box 655
		bodyModel[183].setRotationPoint(-17.5F, -14.5F, 23F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0.3F, -0.9F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -1.5F, 0.3F, -0.9F, -1.5F, 0.3F, -2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.5F, 0.3F, -2F, -1.5F); // Box 656
		bodyModel[184].setRotationPoint(-18.8F, -14.5F, 23F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0.7F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, -1.5F, 0F, 0.7F, -1.5F, 0F, -0.4F, 0F, 0.3F, -2F, 0F, 0.3F, -2F, -1.5F, 0F, -0.4F, -1.5F); // Box 657
		bodyModel[185].setRotationPoint(-13.5F, -14.5F, 23F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0.7F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, -1.5F, 0F, 0.7F, -1.5F, 0F, -0.4F, 0F, 0.3F, -2F, 0F, 0.3F, -2F, -1.5F, 0F, -0.4F, -1.5F); // Box 658
		bodyModel[186].setRotationPoint(10.5F, -13.5F, 23F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0.3F, -0.9F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -1.5F, 0.3F, -0.9F, -1.5F, 0.3F, -2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.5F, 0.3F, -2F, -1.5F); // Box 659
		bodyModel[187].setRotationPoint(5.2F, -13.5F, 23F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0.3F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -1.5F, 0.3F, 0.7F, -1.5F, 0.3F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.5F, 0.3F, -0.4F, -1.5F); // Box 660
		bodyModel[188].setRotationPoint(6.5F, -13.5F, 23F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0.7F, 0F, 0.3F, -0.9F, 0F, 0.3F, -0.9F, -1.5F, 0F, 0.7F, -1.5F, 0F, -0.4F, 0F, 0.3F, -2F, 0F, 0.3F, -2F, -1.5F, 0F, -0.4F, -1.5F); // Box 661
		bodyModel[189].setRotationPoint(26.5F, -13.5F, 23F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0.3F, -0.9F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -1.5F, 0.3F, -0.9F, -1.5F, 0.3F, -2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.5F, 0.3F, -2F, -1.5F); // Box 662
		bodyModel[190].setRotationPoint(21.2F, -13.5F, 23F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0.3F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -1.5F, 0.3F, 0.7F, -1.5F, 0.3F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.5F, 0.3F, -0.4F, -1.5F); // Box 663
		bodyModel[191].setRotationPoint(22.5F, -13.5F, 23F);

		bodyModel[192].addShapeBox(-4F, -2F, 0F, 6, 3, 6, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.8F, 0.25F, 0F, -0.8F, 0.25F, 0F, -0.8F, 0.25F, 0F, -0.8F, 0.25F); // Box 664
		bodyModel[192].setRotationPoint(-56.75F, -10.4F, -22.5F);

		bodyModel[193].addShapeBox(-4F, -4.35F, 0F, 6, 2, 6, 0F,0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F); // Box 665
		bodyModel[193].setRotationPoint(-56.75F, -9.4F, -22.5F);

		bodyModel[194].addShapeBox(-4F, -2F, 0F, 6, 5, 1, 0F,0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.8F, -0.3F, 0F, -1.8F, -0.3F, 0F, -1.8F, -0.3F, 0F, -0.8F, -0.3F); // Box 666
		bodyModel[194].setRotationPoint(-59.75F, -8.4F, -10F);

		bodyModel[195].addShapeBox(-4F, -2F, 0F, 6, 5, 1, 0F,0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.8F, -0.3F, 0F, -1.8F, -0.3F, 0F, -1.8F, -0.3F, 0F, -0.8F, -0.3F); // Box 667
		bodyModel[195].setRotationPoint(-59.75F, -8.4F, 16F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[196].setRotationPoint(-65F, -8.2F, -24F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 45, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[197].setRotationPoint(-65F, -9.2F, -24F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 1, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		bodyModel[198].setRotationPoint(-65F, -7.2F, -24F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 672
		bodyModel[199].setRotationPoint(38.3F, -17.1F, -24.9F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 673
		bodyModel[200].setRotationPoint(38.3F, -17.1F, -25.4F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		bodyModel[201].setRotationPoint(38.3F, -17.1F, -18.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 1F, -0.4F); // Box 675
		bodyModel[202].setRotationPoint(38.3F, -16.3F, -25.8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 1F, -0.4F); // Box 676
		bodyModel[203].setRotationPoint(38.3F, -16.3F, -18.1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 120
		bodyModel[204].setRotationPoint(39.2F, -14.5F, -20.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 124
		bodyModel[205].setRotationPoint(39.2F, -13.5F, -20.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 125
		bodyModel[206].setRotationPoint(39.2F, -15.5F, -20.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 680
		bodyModel[207].setRotationPoint(39.2F, -15.5F, -23.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 681
		bodyModel[208].setRotationPoint(39.2F, -14.5F, -23.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 682
		bodyModel[209].setRotationPoint(39.2F, -13.5F, -23.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 683
		bodyModel[210].setRotationPoint(32.2F, -15.5F, 17.25F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 684
		bodyModel[211].setRotationPoint(32.2F, -14.5F, 17.25F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 685
		bodyModel[212].setRotationPoint(32.2F, -13.5F, 17.25F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 686
		bodyModel[213].setRotationPoint(32.2F, -15.5F, 20.25F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 687
		bodyModel[214].setRotationPoint(32.2F, -14.5F, 20.25F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 688
		bodyModel[215].setRotationPoint(32.2F, -13.5F, 20.25F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -1F, 0.2F, 0.3F, -1F, 0.2F, 0.3F, 0F, 0.2F); // Box 689
		bodyModel[216].setRotationPoint(38.2F, -14.5F, -20.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -1F, 0.2F, 0.3F, -1F, 0.2F, 0.3F, 0F, 0.2F); // Box 690
		bodyModel[217].setRotationPoint(38.2F, -14.5F, -23.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -1F, 0.2F, 0.3F, -1F, 0.2F, 0.3F, 0F, 0.2F); // Box 691
		bodyModel[218].setRotationPoint(31.2F, -14F, 17.25F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.3F, 0F, 0.2F, 0.3F, 1F, 0.2F, 0.3F, 1F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -1F, 0.2F, 0.3F, -1F, 0.2F, 0.3F, 0F, 0.2F); // Box 692
		bodyModel[219].setRotationPoint(31.2F, -14F, 20.25F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 6, 9, 3, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, -1.7F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, -1.7F, -0.5F, -1.5F); // Box 693
		bodyModel[220].setRotationPoint(24.3F, -16.3F, 10.1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 6, 9, 7, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 694
		bodyModel[221].setRotationPoint(24.3F, -16.3F, 4.6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 6, 9, 3, 0F,-1.7F, 0.6F, -1.5F, -2F, 0.6F, -1.5F, 0F, 0.6F, 0F, 0.3F, 0.6F, 0F, -1.7F, -0.5F, -1.5F, -2F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0.3F, -0.5F, 0F); // Box 695
		bodyModel[222].setRotationPoint(24.3F, -16.3F, 1.6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 9, 6, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 696
		bodyModel[223].setRotationPoint(31.3F, -17.3F, 6F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0F, 0.6F, -1.5F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -1.5F, 0F, -1.3F, -1.5F); // Box 697
		bodyModel[224].setRotationPoint(34.3F, -17.3F, 6F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -1.5F, 0F, 0.4F, -1.5F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, -1.5F, 0F, -1.3F, -1.5F); // Box 698
		bodyModel[225].setRotationPoint(33.5F, -17F, 6.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 9, 8, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 699
		bodyModel[226].setRotationPoint(26.5F, -16.5F, 1.5F);
		bodyModel[226].rotateAngleY = -1.13446401F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 700
		bodyModel[227].setRotationPoint(33.75F, -12.75F, 2F);
		bodyModel[227].rotateAngleY = -1.13446401F;

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 701
		bodyModel[228].setRotationPoint(36.1F, -12.6F, 13F);
		bodyModel[228].rotateAngleY = 1.13446401F;

		bodyModel[229].addShapeBox(0F, 0F, 0F, 7, 8, 11, 0F,-5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -14F, 0F, 0F, 7.5F, -0.5F, 0F, 7.5F, -0.5F, 0F, -14F, 0F, 0F); // Box 702
		bodyModel[229].setRotationPoint(29.4F, -15.05F, 2.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,-5F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, -1F, 0F, -12F, 1F, 0F, 5.5F, -0.5F, 0F, 7F, 0.7F, 0F, -12F, 3F, 0F); // Box 703
		bodyModel[230].setRotationPoint(29F, -15F, 3F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,-5F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, -1F, 0F, -12F, 3F, 0F, 7F, 0.7F, 0F, 5.5F, -0.5F, 0F, -12F, 1F, 0F); // Box 704
		bodyModel[231].setRotationPoint(29F, -15F, 8F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,-5F, -1F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -5F, -1F, 0F, -12F, 3F, -4.5F, 7F, 0.7F, -4.5F, 7F, 0.7F, 0F, -12F, 3F, 0F); // Box 705
		bodyModel[232].setRotationPoint(28.8F, -15.4F, 3F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,-5F, -1F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -5F, -1F, 0F, -12F, 3F, 0F, 7F, 0.7F, 0F, 7F, 0.7F, -4.5F, -12F, 3F, -4.5F); // Box 706
		bodyModel[233].setRotationPoint(28.8F, -15.4F, 8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 707
		bodyModel[234].setRotationPoint(34.5F, -16F, 1.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 708
		bodyModel[235].setRotationPoint(34.5F, -16F, 3.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 709
		bodyModel[236].setRotationPoint(34.5F, -16F, 11.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 1.8F, 0.1F, 0F, 1.8F, 0.1F, 0F, -0.1F, -0.1F, 0F); // Box 710
		bodyModel[237].setRotationPoint(34.5F, -16F, 10.3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 1.8F, 0.1F, 0F, 1.8F, 0.1F, 0F, -0.1F, -0.1F, 0F); // Box 711
		bodyModel[238].setRotationPoint(34.5F, -16F, 4.7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 15, 3, 49, 0F,0.3F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -1.5F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -1.5F); // Box 712
		bodyModel[239].setRotationPoint(-11.2F, -17.3F, -24.9F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 16, 3, 49, 0F,0.3F, 0.6F, -15.5F, 0F, 0.6F, 0F, 0F, 0.6F, -1.5F, 0.3F, 0.6F, -15.5F, 0.3F, -0.5F, -15.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0.3F, -0.5F, -15.5F); // Box 713
		bodyModel[240].setRotationPoint(-27.5F, -17.3F, -24.9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 16, 3, 49, 0F,0F, 0.6F, 0F, 0.3F, 0.6F, -15.5F, 0.3F, 0.6F, -15.5F, 0F, 0.6F, -1.5F, 0F, -0.5F, 0F, 0.3F, -0.5F, -15.5F, 0.3F, -0.5F, -15.5F, 0F, -0.5F, -1.5F); // Box 714
		bodyModel[241].setRotationPoint(3.8F, -17.3F, -24.9F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Box 715
		turretModel[1] = new ModelRendererTurbo(this, 1817, 65, textureX, textureY); // Box 716
		turretModel[2] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 717
		turretModel[3] = new ModelRendererTurbo(this, 1689, 89, textureX, textureY); // Box 718
		turretModel[4] = new ModelRendererTurbo(this, 1945, 65, textureX, textureY); // Box 719
		turretModel[5] = new ModelRendererTurbo(this, 1257, 73, textureX, textureY); // Box 720
		turretModel[6] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 722
		turretModel[7] = new ModelRendererTurbo(this, 2001, 65, textureX, textureY); // Box 723
		turretModel[8] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 724
		turretModel[9] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 725
		turretModel[10] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Box 726
		turretModel[11] = new ModelRendererTurbo(this, 2025, 65, textureX, textureY); // Box 727
		turretModel[12] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 728
		turretModel[13] = new ModelRendererTurbo(this, 1065, 81, textureX, textureY); // Box 729
		turretModel[14] = new ModelRendererTurbo(this, 1169, 81, textureX, textureY); // Box 730
		turretModel[15] = new ModelRendererTurbo(this, 1513, 81, textureX, textureY); // Box 731
		turretModel[16] = new ModelRendererTurbo(this, 1801, 81, textureX, textureY); // Box 732
		turretModel[17] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 733
		turretModel[18] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 734
		turretModel[19] = new ModelRendererTurbo(this, 1873, 81, textureX, textureY); // Box 735
		turretModel[20] = new ModelRendererTurbo(this, 1945, 81, textureX, textureY); // Box 736
		turretModel[21] = new ModelRendererTurbo(this, 1401, 73, textureX, textureY); // Box 737
		turretModel[22] = new ModelRendererTurbo(this, 1457, 73, textureX, textureY); // Box 738
		turretModel[23] = new ModelRendererTurbo(this, 1169, 73, textureX, textureY); // Box 739
		turretModel[24] = new ModelRendererTurbo(this, 1257, 73, textureX, textureY); // Box 741
		turretModel[25] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 743
		turretModel[26] = new ModelRendererTurbo(this, 1025, 73, textureX, textureY); // Box 744
		turretModel[27] = new ModelRendererTurbo(this, 1321, 73, textureX, textureY); // Box 745
		turretModel[28] = new ModelRendererTurbo(this, 2001, 73, textureX, textureY); // Box 746
		turretModel[29] = new ModelRendererTurbo(this, 1729, 65, textureX, textureY); // Box 747
		turretModel[30] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 748
		turretModel[31] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 749
		turretModel[32] = new ModelRendererTurbo(this, 1913, 65, textureX, textureY); // Box 750
		turretModel[33] = new ModelRendererTurbo(this, 1913, 73, textureX, textureY); // Box 751
		turretModel[34] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 752
		turretModel[35] = new ModelRendererTurbo(this, 1257, 81, textureX, textureY); // Box 753
		turretModel[36] = new ModelRendererTurbo(this, 1129, 81, textureX, textureY); // Box 754
		turretModel[37] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 755
		turretModel[38] = new ModelRendererTurbo(this, 1641, 81, textureX, textureY); // Box 756
		turretModel[39] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 757
		turretModel[40] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 758
		turretModel[41] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 759
		turretModel[42] = new ModelRendererTurbo(this, 577, 89, textureX, textureY); // Box 760
		turretModel[43] = new ModelRendererTurbo(this, 1585, 89, textureX, textureY); // Box 761
		turretModel[44] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 762
		turretModel[45] = new ModelRendererTurbo(this, 1401, 89, textureX, textureY); // Box 764
		turretModel[46] = new ModelRendererTurbo(this, 1065, 97, textureX, textureY); // Box 766
		turretModel[47] = new ModelRendererTurbo(this, 1689, 89, textureX, textureY); // Box 767
		turretModel[48] = new ModelRendererTurbo(this, 1993, 89, textureX, textureY); // Box 768
		turretModel[49] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 769
		turretModel[50] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 770
		turretModel[51] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 771
		turretModel[52] = new ModelRendererTurbo(this, 1321, 97, textureX, textureY); // Box 772
		turretModel[53] = new ModelRendererTurbo(this, 1441, 97, textureX, textureY); // Box 773
		turretModel[54] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 774
		turretModel[55] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 775
		turretModel[56] = new ModelRendererTurbo(this, 1169, 97, textureX, textureY); // Box 776
		turretModel[57] = new ModelRendererTurbo(this, 1873, 73, textureX, textureY); // Box 777
		turretModel[58] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 778
		turretModel[59] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 779
		turretModel[60] = new ModelRendererTurbo(this, 1801, 97, textureX, textureY); // Box 780
		turretModel[61] = new ModelRendererTurbo(this, 1585, 81, textureX, textureY); // Box 781
		turretModel[62] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 782
		turretModel[63] = new ModelRendererTurbo(this, 1065, 57, textureX, textureY); // Box 783
		turretModel[64] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Box 784
		turretModel[65] = new ModelRendererTurbo(this, 2041, 41, textureX, textureY); // Box 785
		turretModel[66] = new ModelRendererTurbo(this, 1665, 65, textureX, textureY); // Box 786
		turretModel[67] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 788
		turretModel[68] = new ModelRendererTurbo(this, 1321, 73, textureX, textureY); // Box 789
		turretModel[69] = new ModelRendererTurbo(this, 1793, 73, textureX, textureY); // Box 790
		turretModel[70] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 791
		turretModel[71] = new ModelRendererTurbo(this, 1257, 81, textureX, textureY); // Box 792
		turretModel[72] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 800
		turretModel[73] = new ModelRendererTurbo(this, 1465, 105, textureX, textureY); // Box 801
		turretModel[74] = new ModelRendererTurbo(this, 1985, 105, textureX, textureY); // Box 802
		turretModel[75] = new ModelRendererTurbo(this, 1401, 105, textureX, textureY); // Box 803
		turretModel[76] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 804
		turretModel[77] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 805
		turretModel[78] = new ModelRendererTurbo(this, 609, 113, textureX, textureY); // Box 807
		turretModel[79] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 808
		turretModel[80] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 809
		turretModel[81] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 810
		turretModel[82] = new ModelRendererTurbo(this, 1497, 105, textureX, textureY); // Box 811
		turretModel[83] = new ModelRendererTurbo(this, 1257, 105, textureX, textureY); // Box 812
		turretModel[84] = new ModelRendererTurbo(this, 1201, 97, textureX, textureY); // Box 813
		turretModel[85] = new ModelRendererTurbo(this, 1545, 97, textureX, textureY); // Box 814
		turretModel[86] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 815
		turretModel[87] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Box 816
		turretModel[88] = new ModelRendererTurbo(this, 1473, 57, textureX, textureY); // Box 817
		turretModel[89] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 818
		turretModel[90] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 819
		turretModel[91] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 820
		turretModel[92] = new ModelRendererTurbo(this, 2041, 73, textureX, textureY); // Box 821
		turretModel[93] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 822
		turretModel[94] = new ModelRendererTurbo(this, 1609, 105, textureX, textureY); // Box 823
		turretModel[95] = new ModelRendererTurbo(this, 1689, 81, textureX, textureY); // Box 824
		turretModel[96] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 825
		turretModel[97] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 826
		turretModel[98] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Box 827
		turretModel[99] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 828
		turretModel[100] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 829
		turretModel[101] = new ModelRendererTurbo(this, 1097, 113, textureX, textureY); // Box 831
		turretModel[102] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 832
		turretModel[103] = new ModelRendererTurbo(this, 1137, 113, textureX, textureY); // Box 833
		turretModel[104] = new ModelRendererTurbo(this, 1521, 113, textureX, textureY); // Box 834
		turretModel[105] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 835
		turretModel[106] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 836
		turretModel[107] = new ModelRendererTurbo(this, 1585, 105, textureX, textureY); // Box 872
		turretModel[108] = new ModelRendererTurbo(this, 1633, 105, textureX, textureY); // Box 873
		turretModel[109] = new ModelRendererTurbo(this, 1689, 105, textureX, textureY); // Box 874
		turretModel[110] = new ModelRendererTurbo(this, 2017, 105, textureX, textureY); // Box 875
		turretModel[111] = new ModelRendererTurbo(this, 1521, 105, textureX, textureY); // Box 876
		turretModel[112] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 877
		turretModel[113] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 878
		turretModel[114] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 879
		turretModel[115] = new ModelRendererTurbo(this, 977, 113, textureX, textureY); // Box 880
		turretModel[116] = new ModelRendererTurbo(this, 1065, 113, textureX, textureY); // Box 881
		turretModel[117] = new ModelRendererTurbo(this, 1161, 113, textureX, textureY); // Box 882
		turretModel[118] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 883
		turretModel[119] = new ModelRendererTurbo(this, 1265, 57, textureX, textureY); // Box 889
		turretModel[120] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 890
		turretModel[121] = new ModelRendererTurbo(this, 1777, 57, textureX, textureY); // Box 892
		turretModel[122] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 893
		turretModel[123] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 894
		turretModel[124] = new ModelRendererTurbo(this, 1769, 81, textureX, textureY); // Box 895

		turretModel[0].addShapeBox(-32F, -9F, -24F, 42, 9, 47, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 1.3F, 0F, 0.5F, 2.3F, 0F, 0.5F, 2.9F, 0F, 0.5F, 1.9F); // Box 715
		turretModel[0].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[1].addShapeBox(-33F, -9F, -24F, 1, 9, 47, 0F,0.3F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, 0.3F, 0F, -0.9F, 0.3F, 0.5F, 0.3F, 0F, 0.5F, 1.3F, 0F, 0.5F, 1.9F, 0.3F, 0.5F, 0.9F); // Box 716
		turretModel[1].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[2].addShapeBox(-33F, -9.5F, -24F, 1, 1, 47, 0F,-0.7F, 0F, -2.3F, 1F, 0F, -1.3F, 1F, 0F, -0.9F, -0.75F, 0F, -2.9F, 0.3F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, 0.3F, 0F, -0.9F); // Box 717
		turretModel[2].setRotationPoint(-4.2F, -18.8F, -0.9F);

		turretModel[3].addShapeBox(-32F, -10F, -24F, 32, 1, 47, 0F,-1F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.9F, -1F, 0F, -0.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.15F, 0F, 0F, 0.1F); // Box 718
		turretModel[3].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[4].addShapeBox(1F, -11F, -13.2F, 22, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		turretModel[4].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[5].addShapeBox(0F, -10F, -24F, 10, 1, 42, 0F,0F, 0F, -1.3F, 0F, 0F, -4.3F, 0F, 0F, -3.9F, 0F, 0F, -0.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 720
		turretModel[5].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[6].addShapeBox(1F, -11F, -20.2F, 22, 1, 7, 0F,0F, 0F, 0.5F, -11.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -11.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 722
		turretModel[6].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[7].addShapeBox(1F, -11F, -23.7F, 10, 1, 3, 0F,0F, -1F, 0.5F, -3.5F, -1F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, -3.5F, 1F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F); // Box 723
		turretModel[7].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[8].addShapeBox(1F, -11F, 20.3F, 10, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, -3.5F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 724
		turretModel[8].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[9].addShapeBox(1F, -11F, 5.8F, 22, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		turretModel[9].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[10].addShapeBox(1F, -11F, 12.8F, 22, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -11.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -11.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 726
		turretModel[10].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[11].addShapeBox(23F, -11F, -13.2F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 727
		turretModel[11].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[12].addShapeBox(23F, -11F, 5.8F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 728
		turretModel[12].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[13].addShapeBox(2F, -10F, -11.8F, 22, 8, 6, 0F,0F, 0F, 10.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 10.3F, 2.9F, 0.5F, 0.3F, 2.9F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 729
		turretModel[13].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[14].addShapeBox(2F, -1.5F, -11.8F, 22, 2, 6, 0F,0F, 0F, 0.3F, 2.9F, 0F, 0.3F, 2.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.3F, 1F, -0.1F, 0.3F, 1F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 730
		turretModel[14].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[15].addShapeBox(2F, -1.5F, 5.5F, 22, 2, 6, 0F,0F, 0F, 0.3F, 2.9F, 0F, 0.3F, 2.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.3F, 1F, -0.1F, 0.3F, 1F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 731
		turretModel[15].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[16].addShapeBox(2F, -10F, 5.5F, 22, 8, 6, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0.5F, 0.3F, 2.9F, 0.5F, 0.3F, 2.9F, 0.5F, 0F, 0F, 0.5F, 10F); // Box 732
		turretModel[16].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[17].addShapeBox(1F, -11F, -6.2F, 9, 1, 12, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 733
		turretModel[17].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[18].addShapeBox(10F, -11F, -6.2F, 2, 1, 12, 0F,0F, 0F, -0.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, 0F, 0F, -0.2F); // Box 734
		turretModel[18].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[19].addShapeBox(9.3F, -8F, -20.5F, 15, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, -0.3F, 0F); // Box 735
		turretModel[19].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[20].addShapeBox(10.3F, -8F, 11F, 14, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 736
		turretModel[20].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[21].addShapeBox(9.8F, -9F, -20.5F, 13, 1, 9, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 737
		turretModel[21].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[22].addShapeBox(9.8F, -9F, 11F, 13, 1, 9, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 738
		turretModel[22].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[23].addShapeBox(9.3F, -8F, -21.6F, 15, 5, 1, 0F,-0.7F, -0.1F, 0.1F, -0.8F, 0.15F, 0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -2.3F, 0.55F, 0.9F, -2.3F, 0.85F, 0.9F, -2.3F, 0.1F, 0F, -2F, 0.1F); // Box 739
		turretModel[23].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[24].addShapeBox(10.3F, -5.5F, -21.9F, 15, 2, 1, 0F,1F, -0.2F, 0.2F, -0.1F, -0.2F, 0.55F, -0.1F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0F, 0.5F, 0.5F, 0F, 0.4F, 0F, 0.2F, 0.4F); // Box 741
		turretModel[24].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[25].addShapeBox(10F, -7.9F, -26.6F, 6, 5, 3, 0F,0F, 0.2F, -2F, 0.2F, 0.2F, -2.3F, 0.2F, 0.1F, 1.9F, 0F, 0F, 1.9F, 0F, -2.3F, 0F, 0.2F, -2.3F, 0F, 0.2F, -2.3F, 2F, 0F, -2F, 2F); // Box 743
		turretModel[25].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[26].addShapeBox(16.2F, -7.9F, -26.3F, 7, 5, 4, 0F,0F, 0.2F, -2F, 0.2F, 0.25F, -4.3F, 0.3F, 0.25F, 0.5F, 0F, 0.1F, 0.55F, 0F, -2.3F, 0.3F, 0.7F, -2.3F, -2.5F, 2F, -2.4F, -0.15F, 0F, -2.3F, 2F); // Box 744
		turretModel[26].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[27].addShapeBox(10F, -5F, -26.6F, 6, 4, 13, 0F,0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 1.9F, 0F, 0F, 1.9F, 0F, -2.3F, 0F, 0.2F, -2.4F, 0F, 0.2F, -2.4F, 2F, 0F, -2F, 2F); // Box 745
		turretModel[27].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[28].addShapeBox(16.2F, -5F, -26.3F, 7, 4, 4, 0F,0F, 0.2F, 0.3F, 0.7F, 0.2F, -2.5F, 2F, 0.3F, -0.15F, 0F, 0.1F, 0.55F, 0F, -2.4F, 0.3F, 0.7F, -2.4F, -2.5F, 2.1F, -2.5F, -0.1F, 0F, -2.4F, 2F); // Box 746
		turretModel[28].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[29].addShapeBox(9.8F, -9F, -23.5F, 6, 1, 3, 0F,-0.2F, 0F, 0.2F, 0.4F, 0F, -1F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.1F, 1.1F, 0.4F, -0.1F, 0.8F, 0.4F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 747
		turretModel[29].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[30].addShapeBox(16F, -9F, -23.5F, 7, 1, 3, 0F,-0.2F, 0F, -1F, 0.4F, 0F, -2.8F, 0.55F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.1F, 0.8F, 0.4F, -0.15F, -1.5F, 1.3F, 0F, 0F, -0.2F, -0.1F, 0F); // Box 748
		turretModel[30].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[31].addShapeBox(16F, -9F, 20F, 7, 1, 3, 0F,-0.2F, 0F, 0F, 0.55F, 0F, 0F, 0.4F, 0F, -2.8F, -0.2F, 0F, -1F, -0.2F, -0.1F, 0F, 1.3F, 0F, 0F, 0.4F, -0.15F, -1.5F, -0.2F, -0.1F, 0.8F); // Box 749
		turretModel[31].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[32].addShapeBox(9.8F, -9F, 20F, 6, 1, 3, 0F,-0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0.8F, -0.2F, -0.1F, 1.1F); // Box 750
		turretModel[32].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[33].addShapeBox(10F, -7.9F, 23.1F, 6, 5, 3, 0F,0F, 0F, 1.9F, 0.2F, 0.1F, 1.9F, 0.2F, 0.2F, -2.3F, 0F, 0.2F, -2F, 0F, -2F, 2F, 0.2F, -2.3F, 2F, 0.2F, -2.3F, 0F, 0F, -2.3F, 0F); // Box 751
		turretModel[33].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[34].addShapeBox(16.2F, -7.9F, 21.8F, 7, 5, 4, 0F,0F, 0.1F, 0.55F, 0.3F, 0.25F, 0.5F, 0.2F, 0.25F, -4.3F, 0F, 0.2F, -2F, 0F, -2.3F, 2F, 2F, -2.4F, -0.15F, 0.7F, -2.3F, -2.5F, 0F, -2.3F, 0.3F); // Box 752
		turretModel[34].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[35].addShapeBox(10F, -5F, 13.1F, 6, 4, 13, 0F,0F, 0F, 1.9F, 0.2F, 0.1F, 1.9F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 2F, 0.2F, -2.4F, 2F, 0.2F, -2.4F, 0F, 0F, -2.3F, 0F); // Box 753
		turretModel[35].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[36].addShapeBox(16.2F, -5F, 21.8F, 7, 4, 4, 0F,0F, 0.1F, 0.55F, 2F, 0.3F, -0.15F, 0.7F, 0.2F, -2.5F, 0F, 0.2F, 0.3F, 0F, -2.4F, 2F, 2.1F, -2.5F, -0.1F, 0.7F, -2.4F, -2.5F, 0F, -2.4F, 0.3F); // Box 754
		turretModel[36].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[37].addShapeBox(10.3F, -5.5F, 20.4F, 15, 2, 1, 0F,0F, -0.2F, 0.4F, -0.1F, -0.2F, 0.4F, -0.1F, -0.2F, 0.55F, 1F, -0.2F, 0.2F, 0F, 0.2F, 0.4F, 0.5F, 0F, 0.4F, 0F, 0F, 0.5F, 0F, 0.2F, 0.4F); // Box 755
		turretModel[37].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[38].addShapeBox(9.3F, -8F, 20.1F, 15, 5, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.8F, 0.15F, 0.2F, -0.7F, -0.1F, 0.1F, 0F, -2F, 0.1F, 0.9F, -2.3F, 0.1F, 0.9F, -2.3F, 0.85F, 0F, -2.3F, 0.55F); // Box 756
		turretModel[38].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[39].addShapeBox(9.3F, -4F, 11F, 13, 3, 8, 0F,0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 5F, 0F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 6.15F); // Box 757
		turretModel[39].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[40].addShapeBox(10.3F, -1.5F, 11F, 12, 2, 9, 0F,1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 5.2F, 1F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, -0.5F, -1F, 1F, -0.5F, 5.5F); // Box 758
		turretModel[40].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[41].addShapeBox(9.3F, -4F, -19.4F, 13, 3, 8, 0F,0F, 0F, 5F, 0F, 0F, 0.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 6.15F, 0F, -0.5F, 1F, 3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 759
		turretModel[41].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[42].addShapeBox(10.3F, -1.5F, -20.4F, 12, 2, 9, 0F,1F, 0F, 5.2F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 5.5F, -2F, -0.5F, -1F, 2F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 760
		turretModel[42].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[43].addShapeBox(-27.2F, -7.9F, 23.1F, 37, 5, 3, 0F,2F, 0F, 1.9F, 0.2F, 0.1F, 1.9F, 0.2F, 0.2F, -2F, 0F, 0.2F, -2F, 3.2F, -2.1F, 2F, 0.2F, -2.3F, 2F, 0.2F, -2.3F, 0F, -0.3F, -2.1F, -0.1F); // Box 761
		turretModel[43].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[44].addShapeBox(-8.2F, -5F, 23.1F, 18, 7, 3, 0F,-0.2F, 0F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.2F, 0F, -0.3F, 0.1F, -0.1F, -0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, -0.3F, -1.8F, 0F); // Box 762
		turretModel[44].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[45].addShapeBox(-27.1F, -5F, 23.1F, 19, 7, 3, 0F,1.9F, 0F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.1F, -0.2F, 0F, -0.1F, 1.8F, -4.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, -0.2F, -4.8F, 0F); // Box 764
		turretModel[45].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[46].addShapeBox(-27.2F, -7.9F, -26.6F, 37, 5, 3, 0F,0F, 0.2F, -2F, 0.2F, 0.2F, -2F, 0.2F, 0.1F, 1.9F, 2F, 0F, 1.9F, -0.3F, -2.1F, -0.1F, 0.2F, -2.3F, 0F, 0.2F, -2.3F, 2F, 3.2F, -2.1F, 2F); // Box 766
		turretModel[46].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[47].addShapeBox(-27.1F, -5F, -26.6F, 19, 7, 3, 0F,-0.2F, 0F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, 0F, 1.9F, 0F, 0F, -0.2F, -4.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, 1.8F, -4.8F, 0F); // Box 767
		turretModel[47].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[48].addShapeBox(-8.2F, -5F, -26.6F, 18, 7, 3, 0F,-0.3F, 0.1F, -0.1F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 0F, -0.2F, 0F, 0F, -0.3F, -1.8F, 0F, 0.2F, -1.8F, 0F, 0.2F, -1.8F, 0F, -0.2F, -1.8F, 0F); // Box 768
		turretModel[48].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[49].addShapeBox(-27F, -8.9F, -24.6F, 37, 3, 1, 0F,0.15F, -0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0.85F, 0.6F, 0F, 1F, 0.2F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, -2.3F, 0F, 0.9F, -2.1F, 0F); // Box 769
		turretModel[49].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[50].addShapeBox(-27F, -8.9F, 23.1F, 37, 3, 1, 0F,0.6F, 0F, 1F, 0F, 0.1F, 0.85F, 0F, 0.1F, -0.9F, 0.15F, 0.09F, -1.01F, 1.6F, -2.05F, 1F, 0F, -2.3F, 0F, 0F, -2.2F, 0F, 0.2F, -2.2F, 0F); // Box 770
		turretModel[50].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[51].addShapeBox(-38F, -7F, -16F, 5, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 771
		turretModel[51].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[52].addShapeBox(-38F, -8F, 10F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 772
		turretModel[52].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[53].addShapeBox(-31F, -13F, -20F, 6, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		turretModel[53].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[54].addShapeBox(-31F, -13F, -22F, 6, 4, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 774
		turretModel[54].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[55].addShapeBox(-32.3F, -13F, 20F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.15F, -1.4F, 0F, 0.15F); // Box 775
		turretModel[55].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[56].addShapeBox(-32.3F, -13F, 13F, 6, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 776
		turretModel[56].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[57].addShapeBox(-32F, -12F, 9F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 777
		turretModel[57].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[58].addShapeBox(-22F, -12F, 15F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 778
		turretModel[58].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[59].addShapeBox(-21F, -12F, -13F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 779
		turretModel[59].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[60].addShapeBox(-17F, -10.5F, -6F, 11, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 780
		turretModel[60].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[61].addShapeBox(-17F, -10.5F, 4F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1F, 0F, 0F); // Box 781
		turretModel[61].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[62].addShapeBox(-17F, -10.5F, -12F, 11, 2, 6, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		turretModel[62].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[63].addShapeBox(-12F, -10.5F, -13F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 783
		turretModel[63].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[64].addShapeBox(-17.5F, -10.7F, -5.25F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 784
		turretModel[64].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[65].addShapeBox(-17.5F, -10.7F, 0.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 785
		turretModel[65].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[66].addShapeBox(-3.5F, -14.5F, -9.75F, 1, 5, 5, 0F,0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 786
		turretModel[66].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[67].addShapeBox(-5.2F, -14.5F, -9.75F, 1, 5, 5, 0F,-0.5F, 0F, -2F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F, -0.5F, 0F, -2F, 0.3F, 0F, -1.8F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.8F); // Box 788
		turretModel[67].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[68].addShapeBox(-1.8F, -14.5F, -9.75F, 1, 5, 5, 0F,0.5F, 0F, -0.6F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, -0.6F, 0.3F, 0F, 0F, 0.3F, 0F, -1.8F, 0.3F, 0F, -1.8F, 0.3F, 0F, 0F); // Box 789
		turretModel[68].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[69].addShapeBox(-1.5F, -14.5F, 4.5F, 1, 5, 5, 0F,0.5F, 0F, -0.6F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, -0.6F, 0.3F, 0F, 0F, 0.3F, 0F, -1.8F, 0.3F, 0F, -1.8F, 0.3F, 0F, 0F); // Box 790
		turretModel[69].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[70].addShapeBox(-3.2F, -14.5F, 4.5F, 1, 5, 5, 0F,0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 791
		turretModel[70].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[71].addShapeBox(-4.9F, -14.5F, 4.5F, 1, 5, 5, 0F,-0.5F, 0F, -2F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F, -0.5F, 0F, -2F, 0.3F, 0F, -1.8F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.8F); // Box 792
		turretModel[71].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[72].addShapeBox(-14.8F, -12.5F, 5.4F, 6, 3, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 800
		turretModel[72].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[73].addShapeBox(-9.3F, -12.5F, 5.4F, 5, 3, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F); // Box 801
		turretModel[73].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[74].addShapeBox(-18.8F, -12.5F, 5.4F, 5, 3, 14, 0F,0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4F); // Box 802
		turretModel[74].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[75].addShapeBox(-18.8F, -13.5F, 5.4F, 5, 1, 14, 0F,0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4F); // Box 803
		turretModel[75].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[76].addShapeBox(-14.8F, -13.5F, 5.4F, 6, 1, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 804
		turretModel[76].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[77].addShapeBox(-9.3F, -13.5F, 5.4F, 5, 1, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F); // Box 805
		turretModel[77].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[78].addShapeBox(-14.8F, -14.5F, 5.4F, 6, 1, 14, 0F,-1.5F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -2F, -1.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 807
		turretModel[78].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[79].addShapeBox(-18.8F, -14.5F, 5.4F, 5, 1, 14, 0F,-2.5F, 0F, -5F, 0.5F, 0F, -3F, 0.5F, 0F, -2F, -2.5F, 0F, -5F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4F); // Box 808
		turretModel[79].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[80].addShapeBox(-9.3F, -14.5F, 5.4F, 5, 1, 14, 0F,0.5F, 0F, -3F, -2.5F, 0F, -5F, -2.5F, 0F, -5F, 0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F); // Box 809
		turretModel[80].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[81].addShapeBox(-30F, -12F, -3.5F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 810
		turretModel[81].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[82].addShapeBox(-21.5F, -13F, -24.5F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0.2F, 0F, 2F, 0F, 0F, 2F); // Box 811
		turretModel[82].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[83].addShapeBox(-21.5F, -11F, -24.5F, 7, 1, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 812
		turretModel[83].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[84].addShapeBox(-23.5F, -11F, -24.5F, 2, 1, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F); // Box 813
		turretModel[84].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[85].addShapeBox(-23.5F, -13F, -24.5F, 2, 2, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0.2F, 0F, 2F, 0F, 0F, 2F); // Box 814
		turretModel[85].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[86].addShapeBox(-14.5F, -13F, -24.5F, 12, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0.2F, 0F, -2F, 0F, 0F, 2F); // Box 815
		turretModel[86].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[87].addShapeBox(-14.5F, -11F, -24.5F, 12, 1, 8, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0.2F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -3F, 0F, 0F, 0F); // Box 816
		turretModel[87].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[88].addShapeBox(-2.5F, -11F, -24.5F, 2, 1, 4, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 817
		turretModel[88].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[89].addShapeBox(-2.5F, -13F, -24.5F, 2, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, -0.2F, 0F, 2F); // Box 818
		turretModel[89].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[90].addShapeBox(-28.5F, -13F, -2.25F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 819
		turretModel[90].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[91].addShapeBox(-26.5F, -11.75F, -4.75F, 1, 1, 11, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 820
		turretModel[91].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[92].addShapeBox(-26.5F, -26.75F, -4.75F, 1, 15, 1, 0F,-0.1F, 0.1F, 1.9F, -0.1F, 0.1F, 1.9F, -0.1F, 0.1F, -2.1F, -0.1F, 0.1F, -2.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F); // Box 821
		turretModel[92].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[93].addShapeBox(-26.5F, -26.75F, 5.2F, 1, 15, 1, 0F,-0.1F, 0.1F, -2.1F, -0.1F, 0.1F, -2.1F, -0.1F, 0.1F, 1.9F, -0.1F, 0.1F, 1.9F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F); // Box 822
		turretModel[93].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[94].addShapeBox(-26.5F, -26.75F, -7.75F, 1, 1, 17, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 823
		turretModel[94].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[95].addShapeBox(-29F, -27.75F, -8.75F, 6, 6, 1, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -1.9F, 0.1F, 0F, -1.9F, 0.1F, 0F, -1.9F, 0.1F, 0F, -1.9F, 0.1F, 0F); // Box 824
		turretModel[95].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[96].addShapeBox(-29F, -28.95F, -8.75F, 6, 1, 1, 0F,-0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, -0.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 825
		turretModel[96].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[97].addShapeBox(-26.5F, -11.75F, -5.75F, 1, 1, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 826
		turretModel[97].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[98].addShapeBox(-26.5F, -11.75F, 6.25F, 1, 1, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 827
		turretModel[98].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[99].addShapeBox(-24F, -28F, -6.75F, 5, 4, 13, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 828
		turretModel[99].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[100].addShapeBox(-24F, -32F, -6.75F, 5, 4, 13, 0F,0F, 1F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 1F, -3.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 829
		turretModel[100].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[101].addShapeBox(-24F, -24F, -6.75F, 5, 4, 13, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 1F, -3.5F); // Box 831
		turretModel[101].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[102].addShapeBox(-28F, -28F, -5.5F, 5, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 832
		turretModel[102].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[103].addShapeBox(-28F, -32F, -5.5F, 5, 4, 10, 0F,0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 833
		turretModel[103].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[104].addShapeBox(-28F, -24F, -5.5F, 5, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F); // Box 834
		turretModel[104].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[105].addShapeBox(-26.5F, -26.75F, 8.4F, 1, 1, 1, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 835
		turretModel[105].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[106].addShapeBox(-27.5F, -14F, -1.9F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 836
		turretModel[106].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[107].addShapeBox(-6.2F, -1.5F, 23.3F, 15, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 872
		turretModel[107].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[108].addShapeBox(-6.2F, -3.5F, 23.3F, 15, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 873
		turretModel[108].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[109].addShapeBox(-6.2F, -5.5F, 23.3F, 15, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 874
		turretModel[109].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[110].addShapeBox(-26.2F, -5.5F, 23.3F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
		turretModel[110].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[111].addShapeBox(-22.2F, -3.5F, 23.3F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 876
		turretModel[111].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[112].addShapeBox(-13.2F, -5.8F, 23.3F, 5, 5, 3, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 877
		turretModel[112].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[113].addShapeBox(-22.2F, -3.5F, -26.8F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 878
		turretModel[113].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[114].addShapeBox(-26.2F, -5.5F, -26.8F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		turretModel[114].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[115].addShapeBox(-6.2F, -5.5F, -26.8F, 15, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 880
		turretModel[115].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[116].addShapeBox(-6.2F, -3.5F, -26.8F, 15, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		turretModel[116].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[117].addShapeBox(-6.2F, -1.5F, -26.8F, 15, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		turretModel[117].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[118].addShapeBox(-13.2F, -5.8F, -26.8F, 5, 5, 3, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 883
		turretModel[118].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[119].addShapeBox(-11F, -15.25F, 7.25F, 3, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, -0.8F, -0.5F, 0F, 1.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, -0.5F, 0F, 1.2F, 0.5F, 0F, 0.2F); // Box 889
		turretModel[119].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[120].addShapeBox(-11.5F, -15.25F, 16.25F, 3, 2, 1, 0F,0F, 0F, -0.8F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, -0.5F, 0F, 1.2F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, -0.5F, 0F, 1.2F); // Box 890
		turretModel[120].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[121].addShapeBox(-7.5F, -15.25F, 11F, 2, 2, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 892
		turretModel[121].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[122].addShapeBox(-15F, -15.25F, 8.25F, 3, 2, 1, 0F,0.5F, 0F, 0.2F, -0.5F, 0F, 1.2F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, -0.5F, 0F, 1.2F, 0F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 893
		turretModel[122].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[123].addShapeBox(-17F, -16F, 10F, 2, 3, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 894
		turretModel[123].setRotationPoint(-4.2F, -18.3F, -0.9F);

		turretModel[124].addShapeBox(-18F, -14.8F, 9.3F, 3, 2, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 895
		turretModel[124].setRotationPoint(-4.2F, -18.3F, -0.9F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1553, 113, textureX, textureY); // Box 837
		barrelModel[1] = new ModelRendererTurbo(this, 1641, 113, textureX, textureY); // Box 838
		barrelModel[2] = new ModelRendererTurbo(this, 1905, 113, textureX, textureY); // Box 839
		barrelModel[3] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 840
		barrelModel[4] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 841
		barrelModel[5] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 842
		barrelModel[6] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 843
		barrelModel[7] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 844
		barrelModel[8] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 845
		barrelModel[9] = new ModelRendererTurbo(this, 657, 73, textureX, textureY); // Box 846
		barrelModel[10] = new ModelRendererTurbo(this, 1841, 97, textureX, textureY); // Box 847
		barrelModel[11] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 848
		barrelModel[12] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 849
		barrelModel[13] = new ModelRendererTurbo(this, 1953, 1, textureX, textureY); // Box 850
		barrelModel[14] = new ModelRendererTurbo(this, 1969, 1, textureX, textureY); // Box 851
		barrelModel[15] = new ModelRendererTurbo(this, 2041, 49, textureX, textureY); // Box 852
		barrelModel[16] = new ModelRendererTurbo(this, 1985, 1, textureX, textureY); // Box 853
		barrelModel[17] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 854
		barrelModel[18] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Box 855
		barrelModel[19] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 856
		barrelModel[20] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 857
		barrelModel[21] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 858
		barrelModel[22] = new ModelRendererTurbo(this, 585, 129, textureX, textureY); // Box 859
		barrelModel[23] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 860
		barrelModel[24] = new ModelRendererTurbo(this, 1137, 129, textureX, textureY); // Box 861
		barrelModel[25] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 862
		barrelModel[26] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 863
		barrelModel[27] = new ModelRendererTurbo(this, 1449, 89, textureX, textureY); // Box 864
		barrelModel[28] = new ModelRendererTurbo(this, 1873, 97, textureX, textureY); // Box 865
		barrelModel[29] = new ModelRendererTurbo(this, 1193, 49, textureX, textureY); // Box 866
		barrelModel[30] = new ModelRendererTurbo(this, 1225, 49, textureX, textureY); // Box 867
		barrelModel[31] = new ModelRendererTurbo(this, 1481, 49, textureX, textureY); // Box 868
		barrelModel[32] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 869
		barrelModel[33] = new ModelRendererTurbo(this, 1689, 121, textureX, textureY); // Box 871

		barrelModel[0].addShapeBox(-7.5F, -2.5F, -5.5F, 15, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
		barrelModel[0].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[1].addShapeBox(-7.5F, -5.5F, -5.5F, 15, 3, 11, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 838
		barrelModel[1].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[2].addShapeBox(-7.5F, 2.5F, -5.5F, 15, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 839
		barrelModel[2].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[3].addShapeBox(-3.5F, -4.1F, -3F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 840
		barrelModel[3].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[4].addShapeBox(-3.5F, -4.1F, 1.25F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 841
		barrelModel[4].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[5].addShapeBox(-3.5F, 1.5F, 2.5F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 842
		barrelModel[5].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[6].addShapeBox(-3.5F, 1.5F, -4.25F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 843
		barrelModel[6].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[7].addShapeBox(-11.5F, -4.1F, -0.75F, 38, 1, 1, 0F,0F, -2.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -2.1F, -0.1F, 0F, 1.9F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.9F, -0.1F); // Box 844
		barrelModel[7].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[8].addShapeBox(-11.5F, 1.5F, -0.75F, 45, 1, 1, 0F,0F, -2.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -2.1F, -0.1F, 0F, 1.9F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 1.9F, -0.1F); // Box 845
		barrelModel[8].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[9].addShapeBox(25.5F, -4.05F, -2.75F, 2, 1, 5, 0F,-0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F); // Box 846
		barrelModel[9].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[10].addShapeBox(32.5F, 1.5F, -3.75F, 2, 1, 7, 0F,-0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F); // Box 847
		barrelModel[10].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[11].addShapeBox(27F, -4.1F, 1.25F, 1, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 848
		barrelModel[11].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[12].addShapeBox(27F, -4.1F, -3F, 1, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 849
		barrelModel[12].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[13].addShapeBox(33.5F, 1.5F, -4.25F, 1, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 850
		barrelModel[13].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[14].addShapeBox(33.5F, 1.5F, 2.5F, 1, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 851
		barrelModel[14].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[15].addShapeBox(30F, -3.25F, -0.75F, 1, 5, 1, 0F,3.8F, -0.1F, -0.1F, -4.2F, -0.1F, -0.1F, -4.2F, -0.1F, -0.1F, 3.8F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 852
		barrelModel[15].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[16].addShapeBox(30F, 1.5F, -0.75F, 1, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 853
		barrelModel[16].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[17].addShapeBox(34.5F, -4.1F, 1.25F, 4, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.15F); // Box 854
		barrelModel[17].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[18].addShapeBox(34.5F, -4.1F, -2.95F, 4, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.15F); // Box 855
		barrelModel[18].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[19].addShapeBox(40.5F, 1.5F, -4.2F, 4, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.15F); // Box 856
		barrelModel[19].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[20].addShapeBox(40.5F, 1.5F, 2.5F, 4, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.15F); // Box 857
		barrelModel[20].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[21].addShapeBox(-3.5F, 1.3F, 2.5F, 44, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 858
		barrelModel[21].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[22].addShapeBox(-3.5F, 1.3F, -4.25F, 44, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 859
		barrelModel[22].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[23].addShapeBox(-3.5F, -4.3F, -3F, 38, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 860
		barrelModel[23].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[24].addShapeBox(-3.5F, -4.3F, 1.35F, 38, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 861
		barrelModel[24].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[25].addShapeBox(-3.5F, -1.75F, -5.25F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 862
		barrelModel[25].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[26].addShapeBox(-3.5F, -1.75F, 3.6F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 863
		barrelModel[26].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[27].addShapeBox(-3.5F, 3.75F, 3.6F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 864
		barrelModel[27].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[28].addShapeBox(-3.5F, 3.75F, -5.25F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 865
		barrelModel[28].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[29].addShapeBox(18.5F, 3.75F, -6.25F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 866
		barrelModel[29].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[30].addShapeBox(18.5F, 3.75F, 3.6F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 867
		barrelModel[30].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[31].addShapeBox(18.5F, -1.75F, 3.6F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		barrelModel[31].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[32].addShapeBox(18.5F, -1.75F, -6.25F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 869
		barrelModel[32].setRotationPoint(9.8F, -23.3F, -0.9F);

		barrelModel[33].addShapeBox(-2.5F, -6.3F, -5.7F, 12, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		barrelModel[33].setRotationPoint(9.8F, -23.3F, -0.9F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 240
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 241
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 242
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 1329, 9, textureX, textureY); // Box 243
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 1353, 9, textureX, textureY); // Box 244
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 1377, 9, textureX, textureY); // Box 245
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 1401, 9, textureX, textureY); // Box 246
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 1425, 9, textureX, textureY); // Box 247
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 1449, 9, textureX, textureY); // Box 248
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 1473, 9, textureX, textureY); // Box 249
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 1489, 9, textureX, textureY); // Box 250
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 1505, 9, textureX, textureY); // Box 251
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 1521, 9, textureX, textureY); // Box 252
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 1537, 9, textureX, textureY); // Box 253
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 1553, 9, textureX, textureY); // Box 254
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 1569, 9, textureX, textureY); // Box 255
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 1585, 9, textureX, textureY); // Box 256
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 1601, 9, textureX, textureY); // Box 257
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 1617, 9, textureX, textureY); // Box 258
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 1633, 9, textureX, textureY); // Box 259
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 1649, 9, textureX, textureY); // Box 260
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 1665, 9, textureX, textureY); // Box 261
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 1681, 9, textureX, textureY); // Box 262
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 1697, 9, textureX, textureY); // Box 263
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 1713, 9, textureX, textureY); // Box 264
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 1729, 9, textureX, textureY); // Box 265
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 1745, 9, textureX, textureY); // Box 266
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 1761, 9, textureX, textureY); // Box 267
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 1777, 9, textureX, textureY); // Box 268
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 1793, 9, textureX, textureY); // Box 269
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 1809, 9, textureX, textureY); // Box 270
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 271
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 272
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 273
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 1825, 9, textureX, textureY); // Box 274
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 1849, 9, textureX, textureY); // Box 275
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 1873, 9, textureX, textureY); // Box 276
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 1897, 9, textureX, textureY); // Box 277
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 1921, 9, textureX, textureY); // Box 278
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 1945, 9, textureX, textureY); // Box 279
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 1969, 9, textureX, textureY); // Box 280
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 1985, 9, textureX, textureY); // Box 281
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 2001, 9, textureX, textureY); // Box 282
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 2017, 9, textureX, textureY); // Box 283
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 2033, 9, textureX, textureY); // Box 284
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 285
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 286
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 287
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 288
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 289
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 290
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 292
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 293
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 294
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 295
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 296
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 297
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 298
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 299
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 300
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 301
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 302
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 303
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 304
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 305
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 306
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 307
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 308
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 309
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 310
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 311
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 312
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 313
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 314
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 315
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 316
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 317
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 318
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 319
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 320
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 321
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 323
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 324
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Box 325
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 326
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 327
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 328
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Box 329
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 330
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 331
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 332
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 333
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 334
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 335
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 336
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 337
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 1033, 17, textureX, textureY); // Box 338
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 1057, 17, textureX, textureY); // Box 339
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 1081, 17, textureX, textureY); // Box 340
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 1105, 17, textureX, textureY); // Box 341
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 1129, 17, textureX, textureY); // Box 342
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 1145, 17, textureX, textureY); // Box 343
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 1161, 17, textureX, textureY); // Box 344
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 1177, 17, textureX, textureY); // Box 345
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 1193, 17, textureX, textureY); // Box 346
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 1209, 17, textureX, textureY); // Box 347
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 1225, 17, textureX, textureY); // Box 348
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 1241, 17, textureX, textureY); // Box 349
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 1257, 17, textureX, textureY); // Box 350
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 1273, 17, textureX, textureY); // Box 351
		leftTrackWheelModels[110] = new ModelRendererTurbo(this, 1289, 17, textureX, textureY); // Box 352
		leftTrackWheelModels[111] = new ModelRendererTurbo(this, 1305, 17, textureX, textureY); // Box 354
		leftTrackWheelModels[112] = new ModelRendererTurbo(this, 1321, 17, textureX, textureY); // Box 355
		leftTrackWheelModels[113] = new ModelRendererTurbo(this, 1337, 17, textureX, textureY); // Box 356
		leftTrackWheelModels[114] = new ModelRendererTurbo(this, 1353, 17, textureX, textureY); // Box 357
		leftTrackWheelModels[115] = new ModelRendererTurbo(this, 1369, 17, textureX, textureY); // Box 358
		leftTrackWheelModels[116] = new ModelRendererTurbo(this, 1385, 17, textureX, textureY); // Box 359
		leftTrackWheelModels[117] = new ModelRendererTurbo(this, 1401, 17, textureX, textureY); // Box 360
		leftTrackWheelModels[118] = new ModelRendererTurbo(this, 1417, 17, textureX, textureY); // Box 361
		leftTrackWheelModels[119] = new ModelRendererTurbo(this, 1433, 17, textureX, textureY); // Box 362
		leftTrackWheelModels[120] = new ModelRendererTurbo(this, 1449, 17, textureX, textureY); // Box 363
		leftTrackWheelModels[121] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 364
		leftTrackWheelModels[122] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 365
		leftTrackWheelModels[123] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 366
		leftTrackWheelModels[124] = new ModelRendererTurbo(this, 1465, 17, textureX, textureY); // Box 367
		leftTrackWheelModels[125] = new ModelRendererTurbo(this, 1489, 17, textureX, textureY); // Box 368
		leftTrackWheelModels[126] = new ModelRendererTurbo(this, 1513, 17, textureX, textureY); // Box 369
		leftTrackWheelModels[127] = new ModelRendererTurbo(this, 1537, 17, textureX, textureY); // Box 370
		leftTrackWheelModels[128] = new ModelRendererTurbo(this, 1561, 17, textureX, textureY); // Box 371
		leftTrackWheelModels[129] = new ModelRendererTurbo(this, 1585, 17, textureX, textureY); // Box 372
		leftTrackWheelModels[130] = new ModelRendererTurbo(this, 1609, 17, textureX, textureY); // Box 373
		leftTrackWheelModels[131] = new ModelRendererTurbo(this, 1625, 17, textureX, textureY); // Box 374
		leftTrackWheelModels[132] = new ModelRendererTurbo(this, 1641, 17, textureX, textureY); // Box 375
		leftTrackWheelModels[133] = new ModelRendererTurbo(this, 1657, 17, textureX, textureY); // Box 376
		leftTrackWheelModels[134] = new ModelRendererTurbo(this, 1673, 17, textureX, textureY); // Box 377
		leftTrackWheelModels[135] = new ModelRendererTurbo(this, 1689, 17, textureX, textureY); // Box 378
		leftTrackWheelModels[136] = new ModelRendererTurbo(this, 1705, 17, textureX, textureY); // Box 379
		leftTrackWheelModels[137] = new ModelRendererTurbo(this, 1721, 17, textureX, textureY); // Box 380
		leftTrackWheelModels[138] = new ModelRendererTurbo(this, 1737, 17, textureX, textureY); // Box 381
		leftTrackWheelModels[139] = new ModelRendererTurbo(this, 1753, 17, textureX, textureY); // Box 382
		leftTrackWheelModels[140] = new ModelRendererTurbo(this, 1769, 17, textureX, textureY); // Box 383
		leftTrackWheelModels[141] = new ModelRendererTurbo(this, 1785, 17, textureX, textureY); // Box 385
		leftTrackWheelModels[142] = new ModelRendererTurbo(this, 1801, 17, textureX, textureY); // Box 386
		leftTrackWheelModels[143] = new ModelRendererTurbo(this, 1817, 17, textureX, textureY); // Box 387
		leftTrackWheelModels[144] = new ModelRendererTurbo(this, 1833, 17, textureX, textureY); // Box 388
		leftTrackWheelModels[145] = new ModelRendererTurbo(this, 1849, 17, textureX, textureY); // Box 389
		leftTrackWheelModels[146] = new ModelRendererTurbo(this, 1865, 17, textureX, textureY); // Box 390
		leftTrackWheelModels[147] = new ModelRendererTurbo(this, 1881, 17, textureX, textureY); // Box 391
		leftTrackWheelModels[148] = new ModelRendererTurbo(this, 1897, 17, textureX, textureY); // Box 392
		leftTrackWheelModels[149] = new ModelRendererTurbo(this, 1913, 17, textureX, textureY); // Box 393
		leftTrackWheelModels[150] = new ModelRendererTurbo(this, 1929, 17, textureX, textureY); // Box 394
		leftTrackWheelModels[151] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 395
		leftTrackWheelModels[152] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 396
		leftTrackWheelModels[153] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 397
		leftTrackWheelModels[154] = new ModelRendererTurbo(this, 1945, 17, textureX, textureY); // Box 398
		leftTrackWheelModels[155] = new ModelRendererTurbo(this, 1969, 17, textureX, textureY); // Box 399
		leftTrackWheelModels[156] = new ModelRendererTurbo(this, 1993, 17, textureX, textureY); // Box 400
		leftTrackWheelModels[157] = new ModelRendererTurbo(this, 2017, 17, textureX, textureY); // Box 401
		leftTrackWheelModels[158] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 402
		leftTrackWheelModels[159] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 403
		leftTrackWheelModels[160] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 404
		leftTrackWheelModels[161] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 405
		leftTrackWheelModels[162] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 406
		leftTrackWheelModels[163] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 407
		leftTrackWheelModels[164] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 408
		leftTrackWheelModels[165] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 409
		leftTrackWheelModels[166] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 410
		leftTrackWheelModels[167] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 411
		leftTrackWheelModels[168] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 412
		leftTrackWheelModels[169] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 413
		leftTrackWheelModels[170] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 414
		leftTrackWheelModels[171] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 416
		leftTrackWheelModels[172] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 417
		leftTrackWheelModels[173] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 418
		leftTrackWheelModels[174] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); // Box 419
		leftTrackWheelModels[175] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 420
		leftTrackWheelModels[176] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 421
		leftTrackWheelModels[177] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 422
		leftTrackWheelModels[178] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Box 423
		leftTrackWheelModels[179] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Box 424
		leftTrackWheelModels[180] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 425
		leftTrackWheelModels[181] = new ModelRendererTurbo(this, 1233, 41, textureX, textureY); // Box 498
		leftTrackWheelModels[182] = new ModelRendererTurbo(this, 1265, 41, textureX, textureY); // Box 499
		leftTrackWheelModels[183] = new ModelRendererTurbo(this, 1297, 41, textureX, textureY); // Box 500
		leftTrackWheelModels[184] = new ModelRendererTurbo(this, 1329, 41, textureX, textureY); // Box 501
		leftTrackWheelModels[185] = new ModelRendererTurbo(this, 1361, 41, textureX, textureY); // Box 502
		leftTrackWheelModels[186] = new ModelRendererTurbo(this, 1393, 41, textureX, textureY); // Box 503
		leftTrackWheelModels[187] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 962
		leftTrackWheelModels[188] = new ModelRendererTurbo(this, 1305, 33, textureX, textureY); // Box 963
		leftTrackWheelModels[189] = new ModelRendererTurbo(this, 1457, 33, textureX, textureY); // Box 964
		leftTrackWheelModels[190] = new ModelRendererTurbo(this, 1993, 33, textureX, textureY); // Box 965
		leftTrackWheelModels[191] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 966

		leftTrackWheelModels[0].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 240
		leftTrackWheelModels[0].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[1].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 241
		leftTrackWheelModels[1].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[2].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 242
		leftTrackWheelModels[2].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[3].addShapeBox(-5F, -2F, -3F, 5, 4, 3, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F); // Box 243
		leftTrackWheelModels[3].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[4].addShapeBox(-5F, -5F, -3F, 5, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F); // Box 244
		leftTrackWheelModels[4].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[5].addShapeBox(0F, -5F, -3F, 5, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F); // Box 245
		leftTrackWheelModels[5].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[6].addShapeBox(0F, -2F, -3F, 5, 4, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F); // Box 246
		leftTrackWheelModels[6].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[7].addShapeBox(0F, 2F, -3F, 5, 3, 3, 0F,0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 247
		leftTrackWheelModels[7].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[8].addShapeBox(-5F, 2F, -3F, 5, 3, 3, 0F,0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F); // Box 248
		leftTrackWheelModels[8].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[9].addShapeBox(0.9F, 4.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 249
		leftTrackWheelModels[9].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[10].addShapeBox(-0.9F, 4.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 250
		leftTrackWheelModels[10].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[11].addShapeBox(-1.9F, 4.8F, -3F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 251
		leftTrackWheelModels[11].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[12].addShapeBox(-3.9F, 3.8F, -3F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 252
		leftTrackWheelModels[12].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[13].addShapeBox(-4.95F, 2.6F, -3F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 253
		leftTrackWheelModels[13].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[14].addShapeBox(-5.45F, 1.5F, -3F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 254
		leftTrackWheelModels[14].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[15].addShapeBox(-5.7F, 0F, -3F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 255
		leftTrackWheelModels[15].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[16].addShapeBox(-5.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 256
		leftTrackWheelModels[16].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[17].addShapeBox(-5.45F, -3.5F, -3F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 257
		leftTrackWheelModels[17].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[18].addShapeBox(-4.95F, -4.6F, -3F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 258
		leftTrackWheelModels[18].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[19].addShapeBox(-3.9F, -5.8F, -3F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 259
		leftTrackWheelModels[19].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[20].addShapeBox(-1.9F, -5.8F, -3F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 260
		leftTrackWheelModels[20].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[21].addShapeBox(-0.9F, -5.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 261
		leftTrackWheelModels[21].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[22].addShapeBox(0.9F, -5.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 262
		leftTrackWheelModels[22].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[23].addShapeBox(2.9F, -5.8F, -3F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 263
		leftTrackWheelModels[23].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[24].addShapeBox(3.95F, -4.6F, -3F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 264
		leftTrackWheelModels[24].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[25].addShapeBox(4.45F, -3.5F, -3F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 265
		leftTrackWheelModels[25].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[26].addShapeBox(4.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 266
		leftTrackWheelModels[26].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[27].addShapeBox(4.7F, 0F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 267
		leftTrackWheelModels[27].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[28].addShapeBox(4.45F, 1.5F, -3F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 268
		leftTrackWheelModels[28].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[29].addShapeBox(3.95F, 2.6F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 269
		leftTrackWheelModels[29].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[30].addShapeBox(2.9F, 3.8F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 270
		leftTrackWheelModels[30].setRotationPoint(-41.4F, 3.25F, 22F);

		leftTrackWheelModels[31].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 271
		leftTrackWheelModels[31].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[32].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 272
		leftTrackWheelModels[32].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[33].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 273
		leftTrackWheelModels[33].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[34].addShapeBox(-5F, -5F, -3F, 5, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F); // Box 274
		leftTrackWheelModels[34].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[35].addShapeBox(-5F, -2F, -3F, 5, 4, 3, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F); // Box 275
		leftTrackWheelModels[35].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[36].addShapeBox(0F, -5F, -3F, 5, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F); // Box 276
		leftTrackWheelModels[36].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[37].addShapeBox(0F, -2F, -3F, 5, 4, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F); // Box 277
		leftTrackWheelModels[37].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[38].addShapeBox(-5F, 2F, -3F, 5, 3, 3, 0F,0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F); // Box 278
		leftTrackWheelModels[38].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[39].addShapeBox(0F, 2F, -3F, 5, 3, 3, 0F,0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 279
		leftTrackWheelModels[39].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[40].addShapeBox(-0.9F, 4.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 280
		leftTrackWheelModels[40].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[41].addShapeBox(0.9F, 4.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 281
		leftTrackWheelModels[41].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[42].addShapeBox(2.9F, 3.8F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 282
		leftTrackWheelModels[42].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[43].addShapeBox(3.95F, 2.6F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 283
		leftTrackWheelModels[43].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[44].addShapeBox(4.45F, 1.5F, -3F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 284
		leftTrackWheelModels[44].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[45].addShapeBox(4.7F, 0F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 285
		leftTrackWheelModels[45].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[46].addShapeBox(4.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 286
		leftTrackWheelModels[46].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[47].addShapeBox(4.45F, -3.5F, -3F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 287
		leftTrackWheelModels[47].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[48].addShapeBox(3.95F, -4.6F, -3F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 288
		leftTrackWheelModels[48].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[49].addShapeBox(2.9F, -5.8F, -3F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 289
		leftTrackWheelModels[49].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[50].addShapeBox(0.9F, -5.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 290
		leftTrackWheelModels[50].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[51].addShapeBox(-1.9F, -5.8F, -3F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 292
		leftTrackWheelModels[51].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[52].addShapeBox(-3.9F, -5.8F, -3F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 293
		leftTrackWheelModels[52].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[53].addShapeBox(-4.95F, -4.6F, -3F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 294
		leftTrackWheelModels[53].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[54].addShapeBox(-5.45F, -3.5F, -3F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 295
		leftTrackWheelModels[54].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[55].addShapeBox(-5.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 296
		leftTrackWheelModels[55].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[56].addShapeBox(-5.7F, 0F, -3F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 297
		leftTrackWheelModels[56].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[57].addShapeBox(-5.45F, 1.5F, -3F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 298
		leftTrackWheelModels[57].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[58].addShapeBox(-4.95F, 2.6F, -3F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 299
		leftTrackWheelModels[58].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[59].addShapeBox(-3.9F, 3.8F, -3F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 300
		leftTrackWheelModels[59].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[60].addShapeBox(-1.9F, 4.8F, -3F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 301
		leftTrackWheelModels[60].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[61].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 302
		leftTrackWheelModels[61].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[62].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 303
		leftTrackWheelModels[62].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[63].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 304
		leftTrackWheelModels[63].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[64].addShapeBox(-5F, -5F, -3F, 5, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F); // Box 305
		leftTrackWheelModels[64].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[65].addShapeBox(-5F, -2F, -3F, 5, 4, 3, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F); // Box 306
		leftTrackWheelModels[65].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[66].addShapeBox(0F, -5F, -3F, 5, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F); // Box 307
		leftTrackWheelModels[66].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[67].addShapeBox(0F, -2F, -3F, 5, 4, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F); // Box 308
		leftTrackWheelModels[67].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[68].addShapeBox(-5F, 2F, -3F, 5, 3, 3, 0F,0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F); // Box 309
		leftTrackWheelModels[68].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[69].addShapeBox(0F, 2F, -3F, 5, 3, 3, 0F,0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 310
		leftTrackWheelModels[69].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[70].addShapeBox(-0.9F, 4.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 311
		leftTrackWheelModels[70].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[71].addShapeBox(0.9F, 4.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 312
		leftTrackWheelModels[71].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[72].addShapeBox(2.9F, 3.8F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 313
		leftTrackWheelModels[72].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[73].addShapeBox(3.95F, 2.6F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 314
		leftTrackWheelModels[73].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[74].addShapeBox(4.45F, 1.5F, -3F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 315
		leftTrackWheelModels[74].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[75].addShapeBox(4.7F, 0F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 316
		leftTrackWheelModels[75].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[76].addShapeBox(4.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 317
		leftTrackWheelModels[76].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[77].addShapeBox(4.45F, -3.5F, -3F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 318
		leftTrackWheelModels[77].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[78].addShapeBox(3.95F, -4.6F, -3F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 319
		leftTrackWheelModels[78].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[79].addShapeBox(2.9F, -5.8F, -3F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 320
		leftTrackWheelModels[79].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[80].addShapeBox(0.9F, -5.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 321
		leftTrackWheelModels[80].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[81].addShapeBox(-1.9F, -5.8F, -3F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 323
		leftTrackWheelModels[81].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[82].addShapeBox(-3.9F, -5.8F, -3F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 324
		leftTrackWheelModels[82].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[83].addShapeBox(-4.95F, -4.6F, -3F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 325
		leftTrackWheelModels[83].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[84].addShapeBox(-5.45F, -3.5F, -3F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 326
		leftTrackWheelModels[84].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[85].addShapeBox(-5.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 327
		leftTrackWheelModels[85].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[86].addShapeBox(-5.7F, 0F, -3F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 328
		leftTrackWheelModels[86].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[87].addShapeBox(-5.45F, 1.5F, -3F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 329
		leftTrackWheelModels[87].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[88].addShapeBox(-4.95F, 2.6F, -3F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 330
		leftTrackWheelModels[88].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[89].addShapeBox(-3.9F, 3.8F, -3F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 331
		leftTrackWheelModels[89].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[90].addShapeBox(-1.9F, 4.8F, -3F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 332
		leftTrackWheelModels[90].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[91].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 333
		leftTrackWheelModels[91].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[92].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 334
		leftTrackWheelModels[92].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[93].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 335
		leftTrackWheelModels[93].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[94].addShapeBox(-5F, -5F, -3F, 5, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F); // Box 336
		leftTrackWheelModels[94].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[95].addShapeBox(-5F, -2F, -3F, 5, 4, 3, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F); // Box 337
		leftTrackWheelModels[95].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[96].addShapeBox(0F, -5F, -3F, 5, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F); // Box 338
		leftTrackWheelModels[96].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[97].addShapeBox(0F, -2F, -3F, 5, 4, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F); // Box 339
		leftTrackWheelModels[97].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[98].addShapeBox(-5F, 2F, -3F, 5, 3, 3, 0F,0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F); // Box 340
		leftTrackWheelModels[98].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[99].addShapeBox(0F, 2F, -3F, 5, 3, 3, 0F,0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 341
		leftTrackWheelModels[99].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[100].addShapeBox(-0.9F, 4.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 342
		leftTrackWheelModels[100].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[101].addShapeBox(0.9F, 4.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 343
		leftTrackWheelModels[101].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[102].addShapeBox(2.9F, 3.8F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 344
		leftTrackWheelModels[102].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[103].addShapeBox(3.95F, 2.6F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 345
		leftTrackWheelModels[103].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[104].addShapeBox(4.45F, 1.5F, -3F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 346
		leftTrackWheelModels[104].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[105].addShapeBox(4.7F, 0F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 347
		leftTrackWheelModels[105].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[106].addShapeBox(4.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 348
		leftTrackWheelModels[106].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[107].addShapeBox(4.45F, -3.5F, -3F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 349
		leftTrackWheelModels[107].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[108].addShapeBox(3.95F, -4.6F, -3F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 350
		leftTrackWheelModels[108].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[109].addShapeBox(2.9F, -5.8F, -3F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 351
		leftTrackWheelModels[109].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[110].addShapeBox(0.9F, -5.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 352
		leftTrackWheelModels[110].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[111].addShapeBox(-1.9F, -5.8F, -3F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 354
		leftTrackWheelModels[111].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[112].addShapeBox(-3.9F, -5.8F, -3F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 355
		leftTrackWheelModels[112].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[113].addShapeBox(-4.95F, -4.6F, -3F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 356
		leftTrackWheelModels[113].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[114].addShapeBox(-5.45F, -3.5F, -3F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 357
		leftTrackWheelModels[114].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[115].addShapeBox(-5.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 358
		leftTrackWheelModels[115].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[116].addShapeBox(-5.7F, 0F, -3F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 359
		leftTrackWheelModels[116].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[117].addShapeBox(-5.45F, 1.5F, -3F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 360
		leftTrackWheelModels[117].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[118].addShapeBox(-4.95F, 2.6F, -3F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 361
		leftTrackWheelModels[118].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[119].addShapeBox(-3.9F, 3.8F, -3F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 362
		leftTrackWheelModels[119].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[120].addShapeBox(-1.9F, 4.8F, -3F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 363
		leftTrackWheelModels[120].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[121].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 364
		leftTrackWheelModels[121].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[122].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 365
		leftTrackWheelModels[122].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[123].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 366
		leftTrackWheelModels[123].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[124].addShapeBox(-5F, -5F, -3F, 5, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F); // Box 367
		leftTrackWheelModels[124].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[125].addShapeBox(-5F, -2F, -3F, 5, 4, 3, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F); // Box 368
		leftTrackWheelModels[125].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[126].addShapeBox(0F, -5F, -3F, 5, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F); // Box 369
		leftTrackWheelModels[126].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[127].addShapeBox(0F, -2F, -3F, 5, 4, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F); // Box 370
		leftTrackWheelModels[127].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[128].addShapeBox(-5F, 2F, -3F, 5, 3, 3, 0F,0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F); // Box 371
		leftTrackWheelModels[128].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[129].addShapeBox(0F, 2F, -3F, 5, 3, 3, 0F,0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 372
		leftTrackWheelModels[129].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[130].addShapeBox(-0.9F, 4.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 373
		leftTrackWheelModels[130].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[131].addShapeBox(0.9F, 4.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 374
		leftTrackWheelModels[131].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[132].addShapeBox(2.9F, 3.8F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 375
		leftTrackWheelModels[132].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[133].addShapeBox(3.95F, 2.6F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 376
		leftTrackWheelModels[133].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[134].addShapeBox(4.45F, 1.5F, -3F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 377
		leftTrackWheelModels[134].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[135].addShapeBox(4.7F, 0F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 378
		leftTrackWheelModels[135].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[136].addShapeBox(4.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 379
		leftTrackWheelModels[136].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[137].addShapeBox(4.45F, -3.5F, -3F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 380
		leftTrackWheelModels[137].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[138].addShapeBox(3.95F, -4.6F, -3F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 381
		leftTrackWheelModels[138].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[139].addShapeBox(2.9F, -5.8F, -3F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 382
		leftTrackWheelModels[139].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[140].addShapeBox(0.9F, -5.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 383
		leftTrackWheelModels[140].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[141].addShapeBox(-1.9F, -5.8F, -3F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 385
		leftTrackWheelModels[141].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[142].addShapeBox(-3.9F, -5.8F, -3F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 386
		leftTrackWheelModels[142].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[143].addShapeBox(-4.95F, -4.6F, -3F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 387
		leftTrackWheelModels[143].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[144].addShapeBox(-5.45F, -3.5F, -3F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 388
		leftTrackWheelModels[144].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[145].addShapeBox(-5.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 389
		leftTrackWheelModels[145].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[146].addShapeBox(-5.7F, 0F, -3F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 390
		leftTrackWheelModels[146].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[147].addShapeBox(-5.45F, 1.5F, -3F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 391
		leftTrackWheelModels[147].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[148].addShapeBox(-4.95F, 2.6F, -3F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 392
		leftTrackWheelModels[148].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[149].addShapeBox(-3.9F, 3.8F, -3F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 393
		leftTrackWheelModels[149].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[150].addShapeBox(-1.9F, 4.8F, -3F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 394
		leftTrackWheelModels[150].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[151].addShapeBox(-1F, -1.25F, -0.4F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 395
		leftTrackWheelModels[151].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[152].addShapeBox(-1F, -0.5F, -0.4F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 396
		leftTrackWheelModels[152].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[153].addShapeBox(-1F, 0.25F, -0.4F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 397
		leftTrackWheelModels[153].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[154].addShapeBox(-5F, -5F, -3F, 5, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F); // Box 398
		leftTrackWheelModels[154].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[155].addShapeBox(-5F, -2F, -3F, 5, 4, 3, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F); // Box 399
		leftTrackWheelModels[155].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[156].addShapeBox(0F, -5F, -3F, 5, 3, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F); // Box 400
		leftTrackWheelModels[156].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[157].addShapeBox(0F, -2F, -3F, 5, 4, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F); // Box 401
		leftTrackWheelModels[157].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[158].addShapeBox(-5F, 2F, -3F, 5, 3, 3, 0F,0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F); // Box 402
		leftTrackWheelModels[158].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[159].addShapeBox(0F, 2F, -3F, 5, 3, 3, 0F,0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 403
		leftTrackWheelModels[159].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[160].addShapeBox(-0.9F, 4.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 404
		leftTrackWheelModels[160].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[161].addShapeBox(0.9F, 4.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 405
		leftTrackWheelModels[161].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[162].addShapeBox(2.9F, 3.8F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 406
		leftTrackWheelModels[162].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[163].addShapeBox(3.95F, 2.6F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 407
		leftTrackWheelModels[163].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[164].addShapeBox(4.45F, 1.5F, -3F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 408
		leftTrackWheelModels[164].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[165].addShapeBox(4.7F, 0F, -3F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 409
		leftTrackWheelModels[165].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[166].addShapeBox(4.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 410
		leftTrackWheelModels[166].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[167].addShapeBox(4.45F, -3.5F, -3F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 411
		leftTrackWheelModels[167].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[168].addShapeBox(3.95F, -4.6F, -3F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 412
		leftTrackWheelModels[168].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[169].addShapeBox(2.9F, -5.8F, -3F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 413
		leftTrackWheelModels[169].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[170].addShapeBox(0.9F, -5.8F, -3F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 414
		leftTrackWheelModels[170].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[171].addShapeBox(-1.9F, -5.8F, -3F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 416
		leftTrackWheelModels[171].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[172].addShapeBox(-3.9F, -5.8F, -3F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 417
		leftTrackWheelModels[172].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[173].addShapeBox(-4.95F, -4.6F, -3F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 418
		leftTrackWheelModels[173].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[174].addShapeBox(-5.45F, -3.5F, -3F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 419
		leftTrackWheelModels[174].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[175].addShapeBox(-5.7F, -2F, -3F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 420
		leftTrackWheelModels[175].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[176].addShapeBox(-5.7F, 0F, -3F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 421
		leftTrackWheelModels[176].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[177].addShapeBox(-5.45F, 1.5F, -3F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 422
		leftTrackWheelModels[177].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[178].addShapeBox(-4.95F, 2.6F, -3F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 423
		leftTrackWheelModels[178].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[179].addShapeBox(-3.9F, 3.8F, -3F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 424
		leftTrackWheelModels[179].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[180].addShapeBox(-1.9F, 4.8F, -3F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 425
		leftTrackWheelModels[180].setRotationPoint(28.6F, 3.25F, 22F);

		leftTrackWheelModels[181].addShapeBox(-4F, -2F, 0F, 8, 4, 6, 0F,0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F); // Box 498
		leftTrackWheelModels[181].setRotationPoint(42.1F, 0.2F, 17.3F);

		leftTrackWheelModels[182].addShapeBox(-4F, -4.15F, 0F, 8, 3, 6, 0F,-2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F); // Box 499
		leftTrackWheelModels[182].setRotationPoint(42.1F, 0.2F, 17.3F);

		leftTrackWheelModels[183].addShapeBox(-4F, 1.2F, 0F, 8, 3, 6, 0F,0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, -2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F); // Box 500
		leftTrackWheelModels[183].setRotationPoint(42.1F, 0.2F, 17.3F);

		leftTrackWheelModels[184].addShapeBox(-4F, 1.35F, 0F, 8, 3, 6, 0F,0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F); // Box 501
		leftTrackWheelModels[184].setRotationPoint(-52.9F, 0.2F, 17.3F);

		leftTrackWheelModels[185].addShapeBox(-4F, -2F, 0F, 8, 4, 6, 0F,0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 502
		leftTrackWheelModels[185].setRotationPoint(-52.9F, 0.2F, 17.3F);

		leftTrackWheelModels[186].addShapeBox(-4F, -4.35F, 0F, 8, 3, 6, 0F,-2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F); // Box 503
		leftTrackWheelModels[186].setRotationPoint(-52.9F, 0.2F, 17.3F);

		leftTrackWheelModels[187].addShapeBox(-0.9F, -5.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 962
		leftTrackWheelModels[187].setRotationPoint(-27.4F, 3.25F, 22F);

		leftTrackWheelModels[188].addShapeBox(-0.9F, -5.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 963
		leftTrackWheelModels[188].setRotationPoint(-13.4F, 3.25F, 22F);

		leftTrackWheelModels[189].addShapeBox(-0.9F, -5.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 964
		leftTrackWheelModels[189].setRotationPoint(0.6F, 3.25F, 22F);

		leftTrackWheelModels[190].addShapeBox(-0.9F, -5.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 965
		leftTrackWheelModels[190].setRotationPoint(14.6F, 3.25F, 22F);

		leftTrackWheelModels[191].addShapeBox(-0.9F, -5.8F, -3F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 966
		leftTrackWheelModels[191].setRotationPoint(28.6F, 3.25F, 22F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 51
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 52
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 53
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 54
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 55
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 56
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 57
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 59
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 61
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 62
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 63
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 64
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 65
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 66
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 68
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 69
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 70
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 71
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 72
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 74
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 75
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 76
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 77
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 78
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 79
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 80
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 81
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 83
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 84
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 85
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 86
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 87
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 88
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 89
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 90
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 91
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 92
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 93
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 94
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 95
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 96
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 97
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 98
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 99
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 100
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 101
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 102
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 103
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 1033, 1, textureX, textureY); // Box 104
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 1049, 1, textureX, textureY); // Box 105
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 1065, 1, textureX, textureY); // Box 108
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Box 109
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 110
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Box 111
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Box 112
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 113
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Box 114
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Box 115
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 116
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 117
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 118
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Box 119
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 120
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Box 121
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 122
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 1289, 1, textureX, textureY); // Box 123
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 1313, 1, textureX, textureY); // Box 124
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 1337, 1, textureX, textureY); // Box 125
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 1353, 1, textureX, textureY); // Box 126
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 1369, 1, textureX, textureY); // Box 127
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 1385, 1, textureX, textureY); // Box 128
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 129
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 1417, 1, textureX, textureY); // Box 130
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 1433, 1, textureX, textureY); // Box 131
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 1449, 1, textureX, textureY); // Box 132
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 133
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 1481, 1, textureX, textureY); // Box 134
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 1497, 1, textureX, textureY); // Box 135
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 1513, 1, textureX, textureY); // Box 136
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 1529, 1, textureX, textureY); // Box 138
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 1545, 1, textureX, textureY); // Box 139
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 1561, 1, textureX, textureY); // Box 140
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 1577, 1, textureX, textureY); // Box 141
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 1593, 1, textureX, textureY); // Box 142
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 1609, 1, textureX, textureY); // Box 143
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 1625, 1, textureX, textureY); // Box 144
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Box 145
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 1657, 1, textureX, textureY); // Box 146
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 147
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 148
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 149
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Box 150
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Box 151
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 1721, 1, textureX, textureY); // Box 152
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Box 153
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Box 154
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 1793, 1, textureX, textureY); // Box 155
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 1817, 1, textureX, textureY); // Box 156
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 157
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 158
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 159
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 1881, 1, textureX, textureY); // Box 160
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Box 161
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Box 162
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Box 163
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 1945, 1, textureX, textureY); // Box 164
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 165
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Box 166
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 167
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 2009, 1, textureX, textureY); // Box 169
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Box 170
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 171
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 172
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 173
		rightTrackWheelModels[115] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 174
		rightTrackWheelModels[116] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 175
		rightTrackWheelModels[117] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 176
		rightTrackWheelModels[118] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 177
		rightTrackWheelModels[119] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 178
		rightTrackWheelModels[120] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 179
		rightTrackWheelModels[121] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 180
		rightTrackWheelModels[122] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 181
		rightTrackWheelModels[123] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 182
		rightTrackWheelModels[124] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 183
		rightTrackWheelModels[125] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 184
		rightTrackWheelModels[126] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 185
		rightTrackWheelModels[127] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 186
		rightTrackWheelModels[128] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 187
		rightTrackWheelModels[129] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 188
		rightTrackWheelModels[130] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Box 189
		rightTrackWheelModels[131] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 190
		rightTrackWheelModels[132] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 191
		rightTrackWheelModels[133] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 192
		rightTrackWheelModels[134] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 193
		rightTrackWheelModels[135] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 194
		rightTrackWheelModels[136] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 195
		rightTrackWheelModels[137] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Box 196
		rightTrackWheelModels[138] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 197
		rightTrackWheelModels[139] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Box 198
		rightTrackWheelModels[140] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Box 200
		rightTrackWheelModels[141] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 201
		rightTrackWheelModels[142] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 202
		rightTrackWheelModels[143] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 203
		rightTrackWheelModels[144] = new ModelRendererTurbo(this, 753, 9, textureX, textureY); // Box 204
		rightTrackWheelModels[145] = new ModelRendererTurbo(this, 769, 9, textureX, textureY); // Box 205
		rightTrackWheelModels[146] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 206
		rightTrackWheelModels[147] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 207
		rightTrackWheelModels[148] = new ModelRendererTurbo(this, 817, 9, textureX, textureY); // Box 208
		rightTrackWheelModels[149] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 209
		rightTrackWheelModels[150] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 210
		rightTrackWheelModels[151] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 211
		rightTrackWheelModels[152] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Box 212
		rightTrackWheelModels[153] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Box 213
		rightTrackWheelModels[154] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Box 214
		rightTrackWheelModels[155] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Box 215
		rightTrackWheelModels[156] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Box 216
		rightTrackWheelModels[157] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 217
		rightTrackWheelModels[158] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 218
		rightTrackWheelModels[159] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 219
		rightTrackWheelModels[160] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 220
		rightTrackWheelModels[161] = new ModelRendererTurbo(this, 1025, 9, textureX, textureY); // Box 221
		rightTrackWheelModels[162] = new ModelRendererTurbo(this, 1041, 9, textureX, textureY); // Box 222
		rightTrackWheelModels[163] = new ModelRendererTurbo(this, 1057, 9, textureX, textureY); // Box 223
		rightTrackWheelModels[164] = new ModelRendererTurbo(this, 1073, 9, textureX, textureY); // Box 224
		rightTrackWheelModels[165] = new ModelRendererTurbo(this, 1089, 9, textureX, textureY); // Box 225
		rightTrackWheelModels[166] = new ModelRendererTurbo(this, 1105, 9, textureX, textureY); // Box 226
		rightTrackWheelModels[167] = new ModelRendererTurbo(this, 1121, 9, textureX, textureY); // Box 227
		rightTrackWheelModels[168] = new ModelRendererTurbo(this, 1137, 9, textureX, textureY); // Box 228
		rightTrackWheelModels[169] = new ModelRendererTurbo(this, 1153, 9, textureX, textureY); // Box 229
		rightTrackWheelModels[170] = new ModelRendererTurbo(this, 1169, 9, textureX, textureY); // Box 230
		rightTrackWheelModels[171] = new ModelRendererTurbo(this, 1185, 9, textureX, textureY); // Box 231
		rightTrackWheelModels[172] = new ModelRendererTurbo(this, 1201, 9, textureX, textureY); // Box 232
		rightTrackWheelModels[173] = new ModelRendererTurbo(this, 1217, 9, textureX, textureY); // Box 233
		rightTrackWheelModels[174] = new ModelRendererTurbo(this, 1233, 9, textureX, textureY); // Box 234
		rightTrackWheelModels[175] = new ModelRendererTurbo(this, 1249, 9, textureX, textureY); // Box 235
		rightTrackWheelModels[176] = new ModelRendererTurbo(this, 1265, 9, textureX, textureY); // Box 236
		rightTrackWheelModels[177] = new ModelRendererTurbo(this, 1281, 9, textureX, textureY); // Box 237
		rightTrackWheelModels[178] = new ModelRendererTurbo(this, 1297, 9, textureX, textureY); // Box 238
		rightTrackWheelModels[179] = new ModelRendererTurbo(this, 1313, 9, textureX, textureY); // Box 239
		rightTrackWheelModels[180] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Box 422
		rightTrackWheelModels[181] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 423
		rightTrackWheelModels[182] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 424
		rightTrackWheelModels[183] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 430
		rightTrackWheelModels[184] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 431
		rightTrackWheelModels[185] = new ModelRendererTurbo(this, 1049, 25, textureX, textureY); // Box 432
		rightTrackWheelModels[186] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 967
		rightTrackWheelModels[187] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 968
		rightTrackWheelModels[188] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 969
		rightTrackWheelModels[189] = new ModelRendererTurbo(this, 1489, 49, textureX, textureY); // Box 970
		rightTrackWheelModels[190] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 971
		rightTrackWheelModels[191] = new ModelRendererTurbo(this, 1505, 49, textureX, textureY); // Box 972

		rightTrackWheelModels[0].addShapeBox(-5F, -2F, 0F, 5, 4, 3, 0F,0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F); // Box 48
		rightTrackWheelModels[0].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[1].addShapeBox(0F, -2F, 0F, 5, 4, 3, 0F,0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F); // Box 51
		rightTrackWheelModels[1].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[2].addShapeBox(-5F, -5F, 0F, 5, 3, 3, 0F,-2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F); // Box 52
		rightTrackWheelModels[2].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[3].addShapeBox(0F, -5F, 0F, 5, 3, 3, 0F,0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F); // Box 53
		rightTrackWheelModels[3].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[4].addShapeBox(0F, 2F, 0F, 5, 3, 3, 0F,0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightTrackWheelModels[4].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[5].addShapeBox(-5F, 2F, 0F, 5, 3, 3, 0F,0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 55
		rightTrackWheelModels[5].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[6].addShapeBox(4.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 56
		rightTrackWheelModels[6].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[7].addShapeBox(4.7F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 57
		rightTrackWheelModels[7].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[8].addShapeBox(-5.7F, 0F, 0F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 59
		rightTrackWheelModels[8].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[9].addShapeBox(4.45F, -3.5F, 0F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 61
		rightTrackWheelModels[9].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[10].addShapeBox(4.45F, 1.5F, 0F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 62
		rightTrackWheelModels[10].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[11].addShapeBox(3.95F, -4.6F, 0F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 63
		rightTrackWheelModels[11].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[12].addShapeBox(-5.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 64
		rightTrackWheelModels[12].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[13].addShapeBox(-5.45F, -3.5F, 0F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 65
		rightTrackWheelModels[13].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[14].addShapeBox(-4.95F, -4.6F, 0F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 66
		rightTrackWheelModels[14].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[15].addShapeBox(-5.45F, 1.5F, 0F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 68
		rightTrackWheelModels[15].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[16].addShapeBox(-4.95F, 2.6F, 0F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 69
		rightTrackWheelModels[16].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[17].addShapeBox(3.95F, 2.6F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 70
		rightTrackWheelModels[17].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[18].addShapeBox(2.9F, -5.8F, 0F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 71
		rightTrackWheelModels[18].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[19].addShapeBox(-3.9F, -5.8F, 0F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 72
		rightTrackWheelModels[19].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[20].addShapeBox(-1.9F, -5.8F, 0F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 74
		rightTrackWheelModels[20].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[21].addShapeBox(0.9F, -5.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 75
		rightTrackWheelModels[21].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[22].addShapeBox(-1.9F, 4.8F, 0F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 76
		rightTrackWheelModels[22].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[23].addShapeBox(-0.9F, 4.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 77
		rightTrackWheelModels[23].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[24].addShapeBox(0.9F, 4.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 78
		rightTrackWheelModels[24].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[25].addShapeBox(2.9F, 3.8F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 79
		rightTrackWheelModels[25].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[26].addShapeBox(-3.9F, 3.8F, 0F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 80
		rightTrackWheelModels[26].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[27].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 81
		rightTrackWheelModels[27].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[28].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 83
		rightTrackWheelModels[28].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[29].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 84
		rightTrackWheelModels[29].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[30].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 85
		rightTrackWheelModels[30].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[31].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 86
		rightTrackWheelModels[31].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[32].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 87
		rightTrackWheelModels[32].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[33].addShapeBox(-5F, -2F, 0F, 5, 4, 3, 0F,0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F); // Box 88
		rightTrackWheelModels[33].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[34].addShapeBox(-5F, -5F, 0F, 5, 3, 3, 0F,-2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F); // Box 89
		rightTrackWheelModels[34].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[35].addShapeBox(0F, -5F, 0F, 5, 3, 3, 0F,0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F); // Box 90
		rightTrackWheelModels[35].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[36].addShapeBox(0F, -2F, 0F, 5, 4, 3, 0F,0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F); // Box 91
		rightTrackWheelModels[36].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[37].addShapeBox(0F, 2F, 0F, 5, 3, 3, 0F,0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 92
		rightTrackWheelModels[37].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[38].addShapeBox(-5F, 2F, 0F, 5, 3, 3, 0F,0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 93
		rightTrackWheelModels[38].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[39].addShapeBox(0.9F, 4.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 94
		rightTrackWheelModels[39].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[40].addShapeBox(-0.9F, 4.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 95
		rightTrackWheelModels[40].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[41].addShapeBox(-1.9F, 4.8F, 0F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 96
		rightTrackWheelModels[41].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[42].addShapeBox(-3.9F, 3.8F, 0F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 97
		rightTrackWheelModels[42].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[43].addShapeBox(-4.95F, 2.6F, 0F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 98
		rightTrackWheelModels[43].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[44].addShapeBox(-5.45F, 1.5F, 0F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 99
		rightTrackWheelModels[44].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[45].addShapeBox(-5.7F, 0F, 0F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 100
		rightTrackWheelModels[45].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[46].addShapeBox(-5.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 101
		rightTrackWheelModels[46].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[47].addShapeBox(-5.45F, -3.5F, 0F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 102
		rightTrackWheelModels[47].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[48].addShapeBox(-4.95F, -4.6F, 0F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 103
		rightTrackWheelModels[48].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[49].addShapeBox(-3.9F, -5.8F, 0F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 104
		rightTrackWheelModels[49].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[50].addShapeBox(-1.9F, -5.8F, 0F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 105
		rightTrackWheelModels[50].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[51].addShapeBox(2.9F, -5.8F, 0F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 108
		rightTrackWheelModels[51].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[52].addShapeBox(3.95F, -4.6F, 0F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 109
		rightTrackWheelModels[52].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[53].addShapeBox(4.45F, -3.5F, 0F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 110
		rightTrackWheelModels[53].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[54].addShapeBox(4.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 111
		rightTrackWheelModels[54].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[55].addShapeBox(4.7F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 112
		rightTrackWheelModels[55].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[56].addShapeBox(4.45F, 1.5F, 0F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 113
		rightTrackWheelModels[56].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[57].addShapeBox(3.95F, 2.6F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 114
		rightTrackWheelModels[57].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[58].addShapeBox(2.9F, 3.8F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 115
		rightTrackWheelModels[58].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[59].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 116
		rightTrackWheelModels[59].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[60].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 117
		rightTrackWheelModels[60].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[61].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 118
		rightTrackWheelModels[61].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[62].addShapeBox(-5F, -2F, 0F, 5, 4, 3, 0F,0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F); // Box 119
		rightTrackWheelModels[62].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[63].addShapeBox(-5F, -5F, 0F, 5, 3, 3, 0F,-2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F); // Box 120
		rightTrackWheelModels[63].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[64].addShapeBox(0F, -5F, 0F, 5, 3, 3, 0F,0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F); // Box 121
		rightTrackWheelModels[64].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[65].addShapeBox(0F, -2F, 0F, 5, 4, 3, 0F,0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F); // Box 122
		rightTrackWheelModels[65].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[66].addShapeBox(0F, 2F, 0F, 5, 3, 3, 0F,0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 123
		rightTrackWheelModels[66].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[67].addShapeBox(-5F, 2F, 0F, 5, 3, 3, 0F,0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 124
		rightTrackWheelModels[67].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[68].addShapeBox(0.9F, 4.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 125
		rightTrackWheelModels[68].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[69].addShapeBox(-0.9F, 4.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 126
		rightTrackWheelModels[69].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[70].addShapeBox(-1.9F, 4.8F, 0F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 127
		rightTrackWheelModels[70].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[71].addShapeBox(-3.9F, 3.8F, 0F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 128
		rightTrackWheelModels[71].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[72].addShapeBox(-4.95F, 2.6F, 0F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 129
		rightTrackWheelModels[72].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[73].addShapeBox(-5.45F, 1.5F, 0F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 130
		rightTrackWheelModels[73].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[74].addShapeBox(-5.7F, 0F, 0F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 131
		rightTrackWheelModels[74].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[75].addShapeBox(-5.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 132
		rightTrackWheelModels[75].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[76].addShapeBox(-5.45F, -3.5F, 0F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 133
		rightTrackWheelModels[76].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[77].addShapeBox(-4.95F, -4.6F, 0F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 134
		rightTrackWheelModels[77].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[78].addShapeBox(-3.9F, -5.8F, 0F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 135
		rightTrackWheelModels[78].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[79].addShapeBox(-1.9F, -5.8F, 0F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 136
		rightTrackWheelModels[79].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[80].addShapeBox(0.9F, -5.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 138
		rightTrackWheelModels[80].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[81].addShapeBox(2.9F, -5.8F, 0F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 139
		rightTrackWheelModels[81].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[82].addShapeBox(3.95F, -4.6F, 0F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 140
		rightTrackWheelModels[82].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[83].addShapeBox(4.45F, -3.5F, 0F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 141
		rightTrackWheelModels[83].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[84].addShapeBox(4.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 142
		rightTrackWheelModels[84].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[85].addShapeBox(4.7F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 143
		rightTrackWheelModels[85].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[86].addShapeBox(4.45F, 1.5F, 0F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 144
		rightTrackWheelModels[86].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[87].addShapeBox(3.95F, 2.6F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 145
		rightTrackWheelModels[87].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[88].addShapeBox(2.9F, 3.8F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 146
		rightTrackWheelModels[88].setRotationPoint(28.6F, 3.25F, -24F);

		rightTrackWheelModels[89].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 147
		rightTrackWheelModels[89].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[90].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 148
		rightTrackWheelModels[90].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[91].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 149
		rightTrackWheelModels[91].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[92].addShapeBox(-5F, -2F, 0F, 5, 4, 3, 0F,0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F); // Box 150
		rightTrackWheelModels[92].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[93].addShapeBox(-5F, -5F, 0F, 5, 3, 3, 0F,-2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F); // Box 151
		rightTrackWheelModels[93].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[94].addShapeBox(0F, -5F, 0F, 5, 3, 3, 0F,0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F); // Box 152
		rightTrackWheelModels[94].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[95].addShapeBox(0F, -2F, 0F, 5, 4, 3, 0F,0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F); // Box 153
		rightTrackWheelModels[95].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[96].addShapeBox(0F, 2F, 0F, 5, 3, 3, 0F,0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightTrackWheelModels[96].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[97].addShapeBox(-5F, 2F, 0F, 5, 3, 3, 0F,0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 155
		rightTrackWheelModels[97].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[98].addShapeBox(0.9F, 4.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 156
		rightTrackWheelModels[98].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[99].addShapeBox(-0.9F, 4.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 157
		rightTrackWheelModels[99].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[100].addShapeBox(-1.9F, 4.8F, 0F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 158
		rightTrackWheelModels[100].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[101].addShapeBox(-3.9F, 3.8F, 0F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 159
		rightTrackWheelModels[101].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[102].addShapeBox(-4.95F, 2.6F, 0F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 160
		rightTrackWheelModels[102].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[103].addShapeBox(-5.45F, 1.5F, 0F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 161
		rightTrackWheelModels[103].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[104].addShapeBox(-5.7F, 0F, 0F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 162
		rightTrackWheelModels[104].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[105].addShapeBox(-5.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 163
		rightTrackWheelModels[105].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[106].addShapeBox(-5.45F, -3.5F, 0F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 164
		rightTrackWheelModels[106].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[107].addShapeBox(-4.95F, -4.6F, 0F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 165
		rightTrackWheelModels[107].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[108].addShapeBox(-3.9F, -5.8F, 0F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 166
		rightTrackWheelModels[108].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[109].addShapeBox(-1.9F, -5.8F, 0F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 167
		rightTrackWheelModels[109].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[110].addShapeBox(0.9F, -5.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 169
		rightTrackWheelModels[110].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[111].addShapeBox(2.9F, -5.8F, 0F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 170
		rightTrackWheelModels[111].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[112].addShapeBox(3.95F, -4.6F, 0F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 171
		rightTrackWheelModels[112].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[113].addShapeBox(4.45F, -3.5F, 0F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 172
		rightTrackWheelModels[113].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[114].addShapeBox(4.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 173
		rightTrackWheelModels[114].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[115].addShapeBox(4.7F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 174
		rightTrackWheelModels[115].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[116].addShapeBox(4.45F, 1.5F, 0F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 175
		rightTrackWheelModels[116].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[117].addShapeBox(3.95F, 2.6F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 176
		rightTrackWheelModels[117].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[118].addShapeBox(2.9F, 3.8F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 177
		rightTrackWheelModels[118].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[119].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 178
		rightTrackWheelModels[119].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[120].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 179
		rightTrackWheelModels[120].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[121].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 180
		rightTrackWheelModels[121].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[122].addShapeBox(-5F, -2F, 0F, 5, 4, 3, 0F,0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F); // Box 181
		rightTrackWheelModels[122].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[123].addShapeBox(-5F, -5F, 0F, 5, 3, 3, 0F,-2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F); // Box 182
		rightTrackWheelModels[123].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[124].addShapeBox(0F, -5F, 0F, 5, 3, 3, 0F,0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F); // Box 183
		rightTrackWheelModels[124].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[125].addShapeBox(0F, -2F, 0F, 5, 4, 3, 0F,0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F); // Box 184
		rightTrackWheelModels[125].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[126].addShapeBox(0F, 2F, 0F, 5, 3, 3, 0F,0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 185
		rightTrackWheelModels[126].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[127].addShapeBox(-5F, 2F, 0F, 5, 3, 3, 0F,0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 186
		rightTrackWheelModels[127].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[128].addShapeBox(0.9F, 4.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 187
		rightTrackWheelModels[128].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[129].addShapeBox(-0.9F, 4.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 188
		rightTrackWheelModels[129].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[130].addShapeBox(-1.9F, 4.8F, 0F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 189
		rightTrackWheelModels[130].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[131].addShapeBox(-3.9F, 3.8F, 0F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 190
		rightTrackWheelModels[131].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[132].addShapeBox(-4.95F, 2.6F, 0F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 191
		rightTrackWheelModels[132].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[133].addShapeBox(-5.45F, 1.5F, 0F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 192
		rightTrackWheelModels[133].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[134].addShapeBox(-5.7F, 0F, 0F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 193
		rightTrackWheelModels[134].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[135].addShapeBox(-5.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 194
		rightTrackWheelModels[135].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[136].addShapeBox(-5.45F, -3.5F, 0F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 195
		rightTrackWheelModels[136].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[137].addShapeBox(-4.95F, -4.6F, 0F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 196
		rightTrackWheelModels[137].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[138].addShapeBox(-3.9F, -5.8F, 0F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 197
		rightTrackWheelModels[138].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[139].addShapeBox(-1.9F, -5.8F, 0F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 198
		rightTrackWheelModels[139].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[140].addShapeBox(0.9F, -5.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 200
		rightTrackWheelModels[140].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[141].addShapeBox(2.9F, -5.8F, 0F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 201
		rightTrackWheelModels[141].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[142].addShapeBox(3.95F, -4.6F, 0F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 202
		rightTrackWheelModels[142].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[143].addShapeBox(4.45F, -3.5F, 0F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 203
		rightTrackWheelModels[143].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[144].addShapeBox(4.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 204
		rightTrackWheelModels[144].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[145].addShapeBox(4.7F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 205
		rightTrackWheelModels[145].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[146].addShapeBox(4.45F, 1.5F, 0F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 206
		rightTrackWheelModels[146].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[147].addShapeBox(3.95F, 2.6F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 207
		rightTrackWheelModels[147].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[148].addShapeBox(2.9F, 3.8F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 208
		rightTrackWheelModels[148].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[149].addShapeBox(-1F, -1.25F, -0.6F, 2, 1, 1, 0F,-0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F); // Box 209
		rightTrackWheelModels[149].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[150].addShapeBox(-1F, -0.5F, -0.6F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F); // Box 210
		rightTrackWheelModels[150].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[151].addShapeBox(-1F, 0.25F, -0.6F, 2, 1, 1, 0F,0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, 0.1F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F, -0.6F, -0.15F, -0.2F); // Box 211
		rightTrackWheelModels[151].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[152].addShapeBox(-5F, -2F, 0F, 5, 4, 3, 0F,0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, -1.25F, 0.1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F); // Box 212
		rightTrackWheelModels[152].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[153].addShapeBox(-5F, -5F, 0F, 5, 3, 3, 0F,-2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F); // Box 213
		rightTrackWheelModels[153].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[154].addShapeBox(0F, -5F, 0F, 5, 3, 3, 0F,0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F); // Box 214
		rightTrackWheelModels[154].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[155].addShapeBox(0F, -2F, 0F, 5, 4, 3, 0F,0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -1.25F, 0F); // Box 215
		rightTrackWheelModels[155].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[156].addShapeBox(0F, 2F, 0F, 5, 3, 3, 0F,0F, 1.25F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 216
		rightTrackWheelModels[156].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[157].addShapeBox(-5F, 2F, 0F, 5, 3, 3, 0F,0F, 0.25F, -0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 217
		rightTrackWheelModels[157].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[158].addShapeBox(0.9F, 4.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F); // Box 218
		rightTrackWheelModels[158].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[159].addShapeBox(-0.9F, 4.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 219
		rightTrackWheelModels[159].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[160].addShapeBox(-1.9F, 4.8F, 0F, 1, 1, 3, 0F,0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F); // Box 220
		rightTrackWheelModels[160].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[161].addShapeBox(-3.9F, 3.8F, 0F, 1, 2, 3, 0F,0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, -1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F); // Box 221
		rightTrackWheelModels[161].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[162].addShapeBox(-4.95F, 2.6F, 0F, 1, 2, 3, 0F,0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F); // Box 222
		rightTrackWheelModels[162].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[163].addShapeBox(-5.45F, 1.5F, 0F, 1, 2, 3, 0F,0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F); // Box 223
		rightTrackWheelModels[163].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[164].addShapeBox(-5.7F, 0F, 0F, 1, 2, 3, 0F,0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 224
		rightTrackWheelModels[164].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[165].addShapeBox(-5.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 225
		rightTrackWheelModels[165].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[166].addShapeBox(-5.45F, -3.5F, 0F, 1, 2, 3, 0F,-0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F); // Box 226
		rightTrackWheelModels[166].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[167].addShapeBox(-4.95F, -4.6F, 0F, 1, 2, 3, 0F,-1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F); // Box 227
		rightTrackWheelModels[167].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[168].addShapeBox(-3.9F, -5.8F, 0F, 1, 2, 3, 0F,-1.4F, -0.4F, 0.1F, 0.75F, -1.25F, 0.1F, 0.75F, -1.25F, 0.1F, -1.4F, -0.4F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F); // Box 228
		rightTrackWheelModels[168].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[169].addShapeBox(-1.9F, -5.8F, 0F, 1, 1, 3, 0F,0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.25F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.25F, 0.25F, 0.1F); // Box 229
		rightTrackWheelModels[169].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[170].addShapeBox(-0.9F, -5.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 230
		rightTrackWheelModels[170].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[171].addShapeBox(0.9F, -5.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 231
		rightTrackWheelModels[171].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[172].addShapeBox(2.9F, -5.8F, 0F, 1, 2, 3, 0F,0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F, -0.35F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.35F, 0F, 0.1F); // Box 232
		rightTrackWheelModels[172].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[173].addShapeBox(3.95F, -4.6F, 0F, 1, 2, 3, 0F,0.7F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.7F, -0.8F, 0.1F, -0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F); // Box 233
		rightTrackWheelModels[173].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[174].addShapeBox(4.45F, -3.5F, 0F, 1, 2, 3, 0F,0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F); // Box 234
		rightTrackWheelModels[174].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[175].addShapeBox(4.7F, -2F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F); // Box 235
		rightTrackWheelModels[175].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[176].addShapeBox(4.7F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 236
		rightTrackWheelModels[176].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[177].addShapeBox(4.45F, 1.5F, 0F, 1, 2, 3, 0F,-0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, 0.25F, -0.9F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, 0.25F, -0.9F, 0.1F); // Box 237
		rightTrackWheelModels[177].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[178].addShapeBox(3.95F, 2.6F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0.05F, -0.6F, 0.1F, 0.05F, -0.6F, 0.1F, -0.25F, 0F, 0.1F, 0.8F, -0.8F, 0.1F, -1.05F, -0.1F, 0.1F, -1.05F, -0.1F, 0.1F, 0.8F, -0.8F, 0.1F); // Box 238
		rightTrackWheelModels[178].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[179].addShapeBox(2.9F, 3.8F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, -0.25F, 0F, 0.1F, 0.7F, -1.3F, 0.1F, -1.4F, -0.4F, 0.1F, -1.4F, -0.4F, 0.1F, 0.7F, -1.3F, 0.1F); // Box 239
		rightTrackWheelModels[179].setRotationPoint(-41.4F, 3.25F, -24F);

		rightTrackWheelModels[180].addShapeBox(-4F, -2F, 0F, 8, 4, 6, 0F,0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 422
		rightTrackWheelModels[180].setRotationPoint(-52.9F, 0.2F, -25.1F);

		rightTrackWheelModels[181].addShapeBox(-4F, 1.35F, 0F, 8, 3, 6, 0F,0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F); // Box 423
		rightTrackWheelModels[181].setRotationPoint(-52.9F, 0.2F, -25.1F);

		rightTrackWheelModels[182].addShapeBox(-4F, -4.35F, 0F, 8, 3, 6, 0F,-2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F); // Box 424
		rightTrackWheelModels[182].setRotationPoint(-52.9F, 0.2F, -25.1F);

		rightTrackWheelModels[183].addShapeBox(-4F, -2F, 0F, 8, 4, 6, 0F,0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F); // Box 430
		rightTrackWheelModels[183].setRotationPoint(42.1F, 0.2F, -25.1F);

		rightTrackWheelModels[184].addShapeBox(-4F, 1.2F, 0F, 8, 3, 6, 0F,0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, -2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F); // Box 431
		rightTrackWheelModels[184].setRotationPoint(42.1F, 0.2F, -25.1F);

		rightTrackWheelModels[185].addShapeBox(-4F, -4.15F, 0F, 8, 3, 6, 0F,-2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F, -2.65F, -0.2F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F); // Box 432
		rightTrackWheelModels[185].setRotationPoint(42.1F, 0.2F, -25.1F);

		rightTrackWheelModels[186].addShapeBox(-0.9F, -5.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 967
		rightTrackWheelModels[186].setRotationPoint(-27.4F, 3.25F, -24F);

		rightTrackWheelModels[187].addShapeBox(-0.9F, -5.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 968
		rightTrackWheelModels[187].setRotationPoint(-13.4F, 3.25F, -24F);

		rightTrackWheelModels[188].addShapeBox(-0.9F, -5.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 969
		rightTrackWheelModels[188].setRotationPoint(0.6F, 3.25F, -24F);

		rightTrackWheelModels[189].addShapeBox(-0.9F, -5.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 970
		rightTrackWheelModels[189].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[190].addShapeBox(0.9F, -5.8F, 0F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0F, 0F, 0.1F); // Box 971
		rightTrackWheelModels[190].setRotationPoint(14.6F, 3.25F, -24F);

		rightTrackWheelModels[191].addShapeBox(-0.9F, -5.8F, 0F, 2, 1, 3, 0F,0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 972
		rightTrackWheelModels[191].setRotationPoint(28.6F, 3.25F, -24F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 463
		leftTrackModel[1] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 464
		leftTrackModel[2] = new ModelRendererTurbo(this, 1753, 33, textureX, textureY); // Box 465
		leftTrackModel[3] = new ModelRendererTurbo(this, 1777, 33, textureX, textureY); // Box 466
		leftTrackModel[4] = new ModelRendererTurbo(this, 1937, 33, textureX, textureY); // Box 467
		leftTrackModel[5] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 468
		leftTrackModel[6] = new ModelRendererTurbo(this, 1961, 33, textureX, textureY); // Box 469
		leftTrackModel[7] = new ModelRendererTurbo(this, 2017, 33, textureX, textureY); // Box 471
		leftTrackModel[8] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 472
		leftTrackModel[9] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 477
		leftTrackModel[10] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Box 478
		leftTrackModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 479
		leftTrackModel[12] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 480
		leftTrackModel[13] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 481
		leftTrackModel[14] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 482
		leftTrackModel[15] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 484
		leftTrackModel[16] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 485
		leftTrackModel[17] = new ModelRendererTurbo(this, 1081, 41, textureX, textureY); // Box 486
		leftTrackModel[18] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 489
		leftTrackModel[19] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 490
		leftTrackModel[20] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 491
		leftTrackModel[21] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 492
		leftTrackModel[22] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 494
		leftTrackModel[23] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 495
		leftTrackModel[24] = new ModelRendererTurbo(this, 1257, 25, textureX, textureY); // Box 496
		leftTrackModel[25] = new ModelRendererTurbo(this, 1305, 25, textureX, textureY); // Box 497
		leftTrackModel[26] = new ModelRendererTurbo(this, 1513, 49, textureX, textureY); // Box 588
		leftTrackModel[27] = new ModelRendererTurbo(this, 1681, 49, textureX, textureY); // Box 589
		leftTrackModel[28] = new ModelRendererTurbo(this, 1713, 49, textureX, textureY); // Box 590
		leftTrackModel[29] = new ModelRendererTurbo(this, 1737, 49, textureX, textureY); // Box 591
		leftTrackModel[30] = new ModelRendererTurbo(this, 1761, 49, textureX, textureY); // Box 592
		leftTrackModel[31] = new ModelRendererTurbo(this, 1785, 49, textureX, textureY); // Box 593
		leftTrackModel[32] = new ModelRendererTurbo(this, 1809, 49, textureX, textureY); // Box 594
		leftTrackModel[33] = new ModelRendererTurbo(this, 1833, 49, textureX, textureY); // Box 595
		leftTrackModel[34] = new ModelRendererTurbo(this, 1873, 49, textureX, textureY); // Box 596
		leftTrackModel[35] = new ModelRendererTurbo(this, 1905, 49, textureX, textureY); // Box 597

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, 0F, 0.8F, -0.8F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, -1F, -0.8F); // Box 463
		leftTrackModel[0].setRotationPoint(-50F, -3.8F, 16.9F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0.3F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0.3F, -0.2F, -0.8F); // Box 464
		leftTrackModel[1].setRotationPoint(-52F, -4.8F, 16.9F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.35F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.8F, 0F, -0.35F, -0.8F, -0.2F, 0.1F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.8F, -0.2F, 0.1F, -0.8F); // Box 465
		leftTrackModel[2].setRotationPoint(-54.6F, -4.8F, 16.9F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 70, 1, 8, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 466
		leftTrackModel[3].setRotationPoint(-40F, 9.2F, 16.9F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0.5F, 0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0.5F, 0.4F, -0.8F, 0.5F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, 0.5F, -0.6F, -0.8F); // Box 467
		leftTrackModel[4].setRotationPoint(-42F, 9.2F, 16.9F);

		leftTrackModel[5].addShapeBox(-10F, -0.4F, 0F, 13, 1, 8, 0F,0F, 5.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 5.5F, -0.8F, 0F, -5.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, 0F, -5.6F, -0.8F); // Box 468
		leftTrackModel[5].setRotationPoint(-45.5F, 9.2F, 16.9F);

		leftTrackModel[6].addShapeBox(0F, 0.3F, 0F, 2, 1, 8, 0F,-0.4F, -1.2F, -0.2F, 0.1F, -0.05F, -0.2F, 0.1F, -0.05F, -0.8F, -0.4F, -1.2F, -0.8F, -0.9F, 0.8F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.8F, -0.9F, 0.8F, -0.8F); // Box 469
		leftTrackModel[6].setRotationPoint(-56.7F, -4.8F, 16.9F);

		leftTrackModel[7].addShapeBox(0F, 0.3F, 0F, 3, 1, 8, 0F,-1.8F, 1.6F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.8F, -1.8F, 1.6F, -0.8F, -1.2F, -2.2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.8F, -1.2F, -2.2F, -0.8F); // Box 471
		leftTrackModel[7].setRotationPoint(-58.6F, 2.9F, 16.9F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -0.2F, 0.5F, 0.4F, -0.2F, 0.5F, 0.4F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.8F, 0F, -0.2F, -0.8F); // Box 472
		leftTrackModel[8].setRotationPoint(30F, 9.2F, 16.9F);

		leftTrackModel[9].addShapeBox(0F, 0.3F, 0F, 3, 1, 8, 0F,-1.2F, -2.2F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.8F, -1.2F, -2.2F, -0.8F, -1.8F, 1.6F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.8F, -1.8F, 1.6F, -0.8F); // Box 477
		leftTrackModel[9].setRotationPoint(-58.6F, -4.1F, 16.9F);

		leftTrackModel[10].addShapeBox(0F, 0.3F, 0F, 3, 1, 8, 0F,-1.8F, 1.6F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.8F, -1.8F, 1.6F, -0.8F, -1.15F, -2.2F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.8F, -1.2F, -2.25F, -0.8F); // Box 478
		leftTrackModel[10].setRotationPoint(-59.15F, 0.3F, 16.9F);
		leftTrackModel[10].rotateAngleZ = -0.43633231F;

		leftTrackModel[11].addShapeBox(0F, 0.3F, 0F, 2, 1, 7, 0F,-0.05F, 0.05F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, 0.2F, -0.08F, -0.02F, 0.2F, 0F, -0.25F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, 0F, -0.25F, 0.2F); // Box 479
		leftTrackModel[11].setRotationPoint(-58F, 0F, 16.9F);
		leftTrackModel[11].rotateAngleZ = 1.50098316F;

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 480
		leftTrackModel[12].setRotationPoint(-40F, 7.7F, 18.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 481
		leftTrackModel[13].setRotationPoint(-40F, 7.7F, 21.5F);

		leftTrackModel[14].addShapeBox(-10F, -0.4F, 0F, 13, 2, 1, 0F,0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -5.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -5.6F, 0F); // Box 482
		leftTrackModel[14].setRotationPoint(-45.5F, 7.8F, 18.5F);

		leftTrackModel[15].addShapeBox(-10F, -0.4F, 0F, 13, 2, 1, 0F,0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -5.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -5.6F, 0F); // Box 484
		leftTrackModel[15].setRotationPoint(-45.5F, 7.8F, 21.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 74, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 485
		leftTrackModel[16].setRotationPoint(-38F, -3.3F, 18.5F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 74, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 486
		leftTrackModel[17].setRotationPoint(-38F, -3.3F, 21.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 489
		leftTrackModel[18].setRotationPoint(-43F, 7.7F, 18.5F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 490
		leftTrackModel[19].setRotationPoint(-43F, 7.7F, 21.5F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 491
		leftTrackModel[20].setRotationPoint(30F, 7.7F, 18.5F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 492
		leftTrackModel[21].setRotationPoint(30F, 7.7F, 21.5F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F); // Box 494
		leftTrackModel[22].setRotationPoint(-51F, -3.3F, 18.5F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F); // Box 495
		leftTrackModel[23].setRotationPoint(-51F, -3.3F, 21.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F); // Box 496
		leftTrackModel[24].setRotationPoint(36F, -3.3F, 18.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F); // Box 497
		leftTrackModel[25].setRotationPoint(36F, -3.3F, 21.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 74, 1, 8, 0F,0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 588
		leftTrackModel[26].setRotationPoint(-38F, -3.8F, 16.9F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, -0.2F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.8F, 0F, 0F, -0.8F); // Box 589
		leftTrackModel[27].setRotationPoint(36.2F, -3.8F, 16.9F);

		leftTrackModel[28].addShapeBox(0F, 0.3F, 0F, 2, 1, 8, 0F,0.1F, -0.05F, -0.2F, -0.25F, -1.45F, -0.2F, -0.25F, -1.45F, -0.8F, 0.1F, -0.05F, -0.8F, 0.3F, -0.2F, -0.2F, -0.9F, 0.8F, -0.2F, -0.9F, 0.8F, -0.8F, 0.3F, -0.2F, -0.8F); // Box 590
		leftTrackModel[28].setRotationPoint(43.2F, -4.25F, 16.9F);
		leftTrackModel[28].rotateAngleZ = 0.27925268F;

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0.3F, -0.05F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.8F, 0.3F, -0.05F, -0.8F, 0.3F, -0.2F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.8F, 0.3F, -0.2F, -0.8F); // Box 591
		leftTrackModel[29].setRotationPoint(45.6F, -2.88F, 16.9F);
		leftTrackModel[29].rotateAngleZ = -0.80285146F;

		leftTrackModel[30].addShapeBox(0F, 0.3F, 0F, 2, 1, 7, 0F,0F, -0.25F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, 0F, -0.25F, 0.2F, -0.05F, 0.05F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, 0.2F, -0.05F, 0.05F, 0.2F); // Box 592
		leftTrackModel[30].setRotationPoint(45.5F, 0.35F, 16.9F);
		leftTrackModel[30].rotateAngleZ = 1.50098316F;

		leftTrackModel[31].addShapeBox(0F, 0.3F, 0F, 2, 1, 7, 0F,-0.05F, 0.05F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, 0.2F, -0.08F, -0.02F, 0.2F, 0F, -0.25F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, 0F, -0.25F, 0.2F); // Box 593
		leftTrackModel[31].setRotationPoint(45.45F, 1.9F, 16.9F);
		leftTrackModel[31].rotateAngleZ = 1.50098316F;

		leftTrackModel[32].addShapeBox(0F, 0.3F, 0F, 3, 1, 8, 0F,0.1F, -0.1F, -0.2F, -1.7F, 1.6F, -0.2F, -1.7F, 1.6F, -0.8F, 0.1F, -0.1F, -0.8F, 0.1F, 0F, -0.2F, -1.1F, -2.2F, -0.2F, -1.1F, -2.2F, -0.8F, 0.1F, 0F, -0.8F); // Box 594
		leftTrackModel[32].setRotationPoint(44.6F, 2.9F, 16.9F);

		leftTrackModel[33].addShapeBox(-10F, -0.4F, 0F, 12, 1, 8, 0F,0F, 0F, -0.2F, 0F, 5.5F, -0.2F, 0F, 5.5F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.2F, 0F, -5.6F, -0.2F, 0F, -5.6F, -0.8F, 0F, -0.2F, -0.8F); // Box 595
		leftTrackModel[33].setRotationPoint(42.5F, 9.2F, 16.9F);

		leftTrackModel[34].addShapeBox(-10F, -0.4F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -5.6F, 0F, 0F, -5.6F, 0F, 0F, -0.2F, 0F); // Box 596
		leftTrackModel[34].setRotationPoint(42.5F, 7.6F, 21.5F);

		leftTrackModel[35].addShapeBox(-10F, -0.4F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -5.6F, 0F, 0F, -5.6F, 0F, 0F, -0.2F, 0F); // Box 597
		leftTrackModel[35].setRotationPoint(42.5F, 7.6F, 18.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 418
		rightTrackModel[1] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 419
		rightTrackModel[2] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 420
		rightTrackModel[3] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Box 421
		rightTrackModel[4] = new ModelRendererTurbo(this, 1081, 25, textureX, textureY); // Box 433
		rightTrackModel[5] = new ModelRendererTurbo(this, 1241, 25, textureX, textureY); // Box 434
		rightTrackModel[6] = new ModelRendererTurbo(this, 1265, 25, textureX, textureY); // Box 435
		rightTrackModel[7] = new ModelRendererTurbo(this, 1313, 25, textureX, textureY); // Box 436
		rightTrackModel[8] = new ModelRendererTurbo(this, 1337, 25, textureX, textureY); // Box 437
		rightTrackModel[9] = new ModelRendererTurbo(this, 1369, 25, textureX, textureY); // Box 438
		rightTrackModel[10] = new ModelRendererTurbo(this, 1393, 25, textureX, textureY); // Box 434
		rightTrackModel[11] = new ModelRendererTurbo(this, 1417, 25, textureX, textureY); // Box 435
		rightTrackModel[12] = new ModelRendererTurbo(this, 1465, 25, textureX, textureY); // Box 436
		rightTrackModel[13] = new ModelRendererTurbo(this, 1489, 25, textureX, textureY); // Box 437
		rightTrackModel[14] = new ModelRendererTurbo(this, 1513, 25, textureX, textureY); // Box 438
		rightTrackModel[15] = new ModelRendererTurbo(this, 1537, 25, textureX, textureY); // Box 439
		rightTrackModel[16] = new ModelRendererTurbo(this, 1561, 25, textureX, textureY); // Box 440
		rightTrackModel[17] = new ModelRendererTurbo(this, 1585, 25, textureX, textureY); // Box 442
		rightTrackModel[18] = new ModelRendererTurbo(this, 1601, 25, textureX, textureY); // Box 443
		rightTrackModel[19] = new ModelRendererTurbo(this, 1745, 25, textureX, textureY); // Box 444
		rightTrackModel[20] = new ModelRendererTurbo(this, 1889, 25, textureX, textureY); // Box 445
		rightTrackModel[21] = new ModelRendererTurbo(this, 1921, 25, textureX, textureY); // Box 446
		rightTrackModel[22] = new ModelRendererTurbo(this, 1953, 25, textureX, textureY); // Box 447
		rightTrackModel[23] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 448
		rightTrackModel[24] = new ModelRendererTurbo(this, 1609, 33, textureX, textureY); // Box 449
		rightTrackModel[25] = new ModelRendererTurbo(this, 1977, 25, textureX, textureY); // Box 450
		rightTrackModel[26] = new ModelRendererTurbo(this, 2001, 25, textureX, textureY); // Box 452
		rightTrackModel[27] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 453
		rightTrackModel[28] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 454
		rightTrackModel[29] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 455
		rightTrackModel[30] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 456
		rightTrackModel[31] = new ModelRendererTurbo(this, 2017, 25, textureX, textureY); // Box 457
		rightTrackModel[32] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 458
		rightTrackModel[33] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 459
		rightTrackModel[34] = new ModelRendererTurbo(this, 1073, 25, textureX, textureY); // Box 460
		rightTrackModel[35] = new ModelRendererTurbo(this, 1233, 25, textureX, textureY); // Box 461

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 74, 1, 8, 0F,0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 418
		rightTrackModel[0].setRotationPoint(-38F, -3.8F, -26.1F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, 0F, 0.8F, -0.8F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, -1F, -0.8F); // Box 419
		rightTrackModel[1].setRotationPoint(-50F, -3.8F, -26.1F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0.3F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0.3F, -0.2F, -0.8F); // Box 420
		rightTrackModel[2].setRotationPoint(-52F, -4.8F, -26.1F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.35F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.8F, 0F, -0.35F, -0.8F, -0.2F, 0.1F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.8F, -0.2F, 0.1F, -0.8F); // Box 421
		rightTrackModel[3].setRotationPoint(-54.6F, -4.8F, -26.1F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 70, 1, 8, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 433
		rightTrackModel[4].setRotationPoint(-40F, 9.2F, -26.1F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0.5F, 0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0.5F, 0.4F, -0.8F, 0.5F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, 0.5F, -0.6F, -0.8F); // Box 434
		rightTrackModel[5].setRotationPoint(-42F, 9.2F, -26.1F);

		rightTrackModel[6].addShapeBox(-10F, -0.4F, 0F, 13, 1, 8, 0F,0F, 5.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 5.5F, -0.8F, 0F, -5.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.8F, 0F, -5.6F, -0.8F); // Box 435
		rightTrackModel[6].setRotationPoint(-45.5F, 9.2F, -26.1F);

		rightTrackModel[7].addShapeBox(0F, 0.3F, 0F, 2, 1, 8, 0F,-0.4F, -1.2F, -0.2F, 0.1F, -0.05F, -0.2F, 0.1F, -0.05F, -0.8F, -0.4F, -1.2F, -0.8F, -0.9F, 0.8F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.8F, -0.9F, 0.8F, -0.8F); // Box 436
		rightTrackModel[7].setRotationPoint(-56.7F, -4.8F, -26.1F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, -0.2F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.8F, 0F, 0F, -0.8F); // Box 437
		rightTrackModel[8].setRotationPoint(36.2F, -3.8F, -26.1F);

		rightTrackModel[9].addShapeBox(0F, 0.3F, 0F, 3, 1, 8, 0F,-1.8F, 1.6F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.8F, -1.8F, 1.6F, -0.8F, -1.2F, -2.2F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.8F, -1.2F, -2.2F, -0.8F); // Box 438
		rightTrackModel[9].setRotationPoint(-58.6F, 2.9F, -26.1F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -0.2F, 0.5F, 0.4F, -0.2F, 0.5F, 0.4F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.8F, 0F, -0.2F, -0.8F); // Box 434
		rightTrackModel[10].setRotationPoint(30F, 9.2F, -26.1F);

		rightTrackModel[11].addShapeBox(-10F, -0.4F, 0F, 12, 1, 8, 0F,0F, 0F, -0.2F, 0F, 5.5F, -0.2F, 0F, 5.5F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.2F, 0F, -5.6F, -0.2F, 0F, -5.6F, -0.8F, 0F, -0.2F, -0.8F); // Box 435
		rightTrackModel[11].setRotationPoint(42.5F, 9.2F, -26.1F);

		rightTrackModel[12].addShapeBox(0F, 0.3F, 0F, 3, 1, 8, 0F,0.1F, -0.1F, -0.2F, -1.7F, 1.6F, -0.2F, -1.7F, 1.6F, -0.8F, 0.1F, -0.1F, -0.8F, 0.1F, 0F, -0.2F, -1.1F, -2.2F, -0.2F, -1.1F, -2.2F, -0.8F, 0.1F, 0F, -0.8F); // Box 436
		rightTrackModel[12].setRotationPoint(44.6F, 2.9F, -26.1F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0.3F, -0.05F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.8F, 0.3F, -0.05F, -0.8F, 0.3F, -0.2F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.8F, 0.3F, -0.2F, -0.8F); // Box 437
		rightTrackModel[13].setRotationPoint(45.6F, -2.88F, -26.1F);
		rightTrackModel[13].rotateAngleZ = -0.80285146F;

		rightTrackModel[14].addShapeBox(0F, 0.3F, 0F, 2, 1, 8, 0F,0.1F, -0.05F, -0.2F, -0.25F, -1.45F, -0.2F, -0.25F, -1.45F, -0.8F, 0.1F, -0.05F, -0.8F, 0.3F, -0.2F, -0.2F, -0.9F, 0.8F, -0.2F, -0.9F, 0.8F, -0.8F, 0.3F, -0.2F, -0.8F); // Box 438
		rightTrackModel[14].setRotationPoint(43.2F, -4.25F, -26.1F);
		rightTrackModel[14].rotateAngleZ = 0.27925268F;

		rightTrackModel[15].addShapeBox(0F, 0.3F, 0F, 3, 1, 8, 0F,-1.2F, -2.2F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.8F, -1.2F, -2.2F, -0.8F, -1.8F, 1.6F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.8F, -1.8F, 1.6F, -0.8F); // Box 439
		rightTrackModel[15].setRotationPoint(-58.6F, -4.1F, -26.1F);

		rightTrackModel[16].addShapeBox(0F, 0.3F, 0F, 3, 1, 8, 0F,-1.8F, 1.6F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.8F, -1.8F, 1.6F, -0.8F, -1.15F, -2.2F, -0.2F, -0.7F, -0.5F, -0.2F, -0.7F, -0.5F, -0.8F, -1.2F, -2.25F, -0.8F); // Box 440
		rightTrackModel[16].setRotationPoint(-59.15F, 0.3F, -26.1F);
		rightTrackModel[16].rotateAngleZ = -0.43633231F;

		rightTrackModel[17].addShapeBox(0F, 0.3F, 0F, 2, 1, 7, 0F,-0.05F, 0.05F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, 0.2F, -0.08F, -0.02F, 0.2F, 0F, -0.25F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, 0F, -0.25F, 0.2F); // Box 442
		rightTrackModel[17].setRotationPoint(-58F, 0F, -26.1F);
		rightTrackModel[17].rotateAngleZ = 1.50098316F;

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 443
		rightTrackModel[18].setRotationPoint(-40F, 7.7F, -24.5F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 70, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 444
		rightTrackModel[19].setRotationPoint(-40F, 7.7F, -21.5F);

		rightTrackModel[20].addShapeBox(-10F, -0.4F, 0F, 13, 2, 1, 0F,0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -5.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -5.6F, 0F); // Box 445
		rightTrackModel[20].setRotationPoint(-45.5F, 7.8F, -24.5F);

		rightTrackModel[21].addShapeBox(-10F, -0.4F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -5.6F, 0F, 0F, -5.6F, 0F, 0F, -0.2F, 0F); // Box 446
		rightTrackModel[21].setRotationPoint(42.5F, 7.6F, -24.5F);

		rightTrackModel[22].addShapeBox(-10F, -0.4F, 0F, 13, 2, 1, 0F,0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -5.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -5.6F, 0F); // Box 447
		rightTrackModel[22].setRotationPoint(-45.5F, 7.8F, -21.5F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 74, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 448
		rightTrackModel[23].setRotationPoint(-38F, -3.3F, -24.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 74, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 449
		rightTrackModel[24].setRotationPoint(-38F, -3.3F, -21.5F);

		rightTrackModel[25].addShapeBox(0F, 0.3F, 0F, 2, 1, 7, 0F,-0.05F, 0.05F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, 0.2F, -0.08F, -0.02F, 0.2F, 0F, -0.25F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, 0F, -0.25F, 0.2F); // Box 450
		rightTrackModel[25].setRotationPoint(45.45F, 1.9F, -26.1F);
		rightTrackModel[25].rotateAngleZ = 1.50098316F;

		rightTrackModel[26].addShapeBox(0F, 0.3F, 0F, 2, 1, 7, 0F,0F, -0.25F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, 0F, -0.25F, 0.2F, -0.05F, 0.05F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, 0.2F, -0.05F, 0.05F, 0.2F); // Box 452
		rightTrackModel[26].setRotationPoint(45.5F, 0.35F, -26.1F);
		rightTrackModel[26].rotateAngleZ = 1.50098316F;

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 453
		rightTrackModel[27].setRotationPoint(-43F, 7.7F, -24.5F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 454
		rightTrackModel[28].setRotationPoint(-43F, 7.7F, -21.5F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 455
		rightTrackModel[29].setRotationPoint(30F, 7.7F, -24.5F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 456
		rightTrackModel[30].setRotationPoint(30F, 7.7F, -21.5F);

		rightTrackModel[31].addShapeBox(-10F, -0.4F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -5.6F, 0F, 0F, -5.6F, 0F, 0F, -0.2F, 0F); // Box 457
		rightTrackModel[31].setRotationPoint(42.5F, 7.6F, -21.5F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F); // Box 458
		rightTrackModel[32].setRotationPoint(-51F, -3.3F, -24.5F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F); // Box 459
		rightTrackModel[33].setRotationPoint(-51F, -3.3F, -21.5F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F); // Box 460
		rightTrackModel[34].setRotationPoint(36F, -3.3F, -24.5F);

		rightTrackModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F); // Box 461
		rightTrackModel[35].setRotationPoint(36F, -3.3F, -21.5F);
	}
}